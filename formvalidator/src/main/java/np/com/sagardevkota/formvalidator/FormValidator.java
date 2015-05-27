package np.com.sagardevkota.formvalidator;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import np.com.sagardevkota.formvalidator.ValidationRule;
import np.com.sagardevkota.formvalidator.models.Rule;
import np.com.sagardevkota.formvalidator.models.ValidationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FormValidator {
    FormValidator mInstance;
    String initialText;
    //Drawable icon;
    List<ValidationRule> rules=new ArrayList<>();

    public FormValidator() {
        // TODO Auto-generated constructor stub

    }



    public FormValidator add(ValidationRule rule){
        this.rules.add(rule);
        return this;
    }



    public boolean validate(){
        boolean result=true;
        ValidationResponse validationResponse=null;
        for(ValidationRule rule : rules){
            View name=rule.getView();
            if(name instanceof EditText) {
                EditText view=(EditText) name;
                validationResponse=validateInput(view.getText().toString(),rule);
                if(!validationResponse.isError())
                    view.setError(null);
                else
                    view.setError(validationResponse.getMessage());




            }
            else if(name instanceof Button) {

                Button view=(Button) name;
                validationResponse=validateInput(view.getText().toString(),rule);
                if(!validationResponse.isError())
                    view.setError(null);
                else
                    view.setError(validationResponse.getMessage());



            }

            if (validationResponse.isError())
                        result=false;




        }



        return result;

    }

    private ValidationResponse validateInput(String value, ValidationRule ruleObject) {


        ValidationResponse result=new ValidationResponse();
        result.setError(false);

        for(Rule rule:ruleObject.getRules()){
            if(rule.getType()==ValidationRule.REQUIRED) {
                if(value.length()==0){
                    result.setError(true);
                    result.setMessage(rule.getMessage());
                    break;
                }
            }
            else if(rule.getType()==ValidationRule.EMAIL) {
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                if(!value.matches(emailPattern)){
                    result.setError(true);
                    result.setMessage(rule.getMessage());
                    break;
                }
            }
            else if(rule.getType()==ValidationRule.EQUALTO) {
                if(!value.equals(rule.getValue())){
                    result.setError(true);
                    result.setMessage(rule.getMessage());
                    break;
                }
            }
            else if(rule.getType()==ValidationRule.MIN_LENGTH) {
                if((value.length()<Integer.valueOf(rule.getValue()))){
                    result.setError(true);
                    result.setMessage(rule.getMessage());
                    break;
                }
            }
            else if(rule.getType()==ValidationRule.NOT_EQUALTO) {
                if((value.equals(rule.getValue()))){
                    result.setError(true);
                    result.setMessage(rule.getMessage());
                    break;
                }
            }

        }

      return result;
    }







}


