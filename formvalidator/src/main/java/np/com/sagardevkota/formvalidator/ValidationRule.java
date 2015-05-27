package np.com.sagardevkota.formvalidator;

import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import np.com.sagardevkota.formvalidator.models.Rule;

public class ValidationRule{
    public static final int REQUIRED=1;
    public static final int EMAIL=2;
    public static final int MIN_LENGTH=4;
    public static final int NOT_EQUALTO=8;
    public static final int EQUALTO=16;
    private View view=null;


    List<Rule> rules=new ArrayList<>();

    public View getView() {
        return view;
    }



    public ValidationRule(View v) {
        this.view=v;
    }

    public ValidationRule add(int rule,String value,String message){
        rules.add(new Rule().setType(rule).setValue(value).setMessage(message));
        return this;
    }

    public ValidationRule add(int rule){
        rules.add(new Rule().setType(rule).setValue("-1").setMessage("Invalid data"));
        return this;
    }

    public ValidationRule add(int rule,String message){
        rules.add(new Rule().setType(rule).setValue("-1").setMessage(message));
        return this;
    }

    public  List<Rule> getRules(){
        return rules;
    }




}