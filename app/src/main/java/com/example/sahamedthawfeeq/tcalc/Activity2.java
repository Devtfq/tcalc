package com.example.sahamedthawfeeq.tcalc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.function.Function;

public class Activity2 extends AppCompatActivity {
    private Button more1;
    private LinearLayout main;
    private LinearLayout main2;
    private boolean isopen=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        final TextView tex = (TextView)findViewById(R.id.tex);
        main = (LinearLayout)findViewById(R.id.main);
        main2 = (LinearLayout) findViewById(R.id.main2);
        Button sin =(Button)findViewById(R.id.sin);
        Button cos =(Button)findViewById(R.id.cos);
        Button tan =(Button)findViewById(R.id.tan);
        final Button pie =(Button)findViewById(R.id.pie);
        Button braop =(Button)findViewById(R.id.braop);
        Button braclose =(Button)findViewById(R.id.braclose);
        Button cbrt =(Button)findViewById(R.id.cube);
        Button sqrt =(Button)findViewById(R.id.square);
        Button acos =(Button)findViewById(R.id.acos);
        Button asin =(Button)findViewById(R.id.asin);
        Button atan =(Button)findViewById(R.id.atan);
        Button exp =(Button)findViewById(R.id.exp);
        Button sinh =(Button)findViewById(R.id.sinh);
        Button cosh =(Button)findViewById(R.id.cosh);
        Button tanh =(Button)findViewById(R.id.tanh);
        Button logb =(Button)findViewById(R.id.ln);
        Button abs =(Button)findViewById(R.id.abs);
        Button power =(Button)findViewById(R.id.power);
        Button comma =(Button)findViewById(R.id.comma);
        Button deci =(Button)findViewById(R.id.deci);
        Button loggy =(Button)findViewById(R.id.loggy);
        Button one =(Button)findViewById(R.id.one);
        Button two =(Button)findViewById(R.id.two);
        Button three =(Button)findViewById(R.id.three);
        Button four =(Button)findViewById(R.id.four);
        Button five =(Button)findViewById(R.id.five);
        Button six =(Button)findViewById(R.id.six);
        Button seven =(Button)findViewById(R.id.seven);
        Button eight =(Button)findViewById(R.id.eight);
        Button nine =(Button)findViewById(R.id.nine);
        Button zero =(Button)findViewById(R.id.zero);
        Button equal =(Button)findViewById(R.id.equal);
        Button plus =(Button)findViewById(R.id.plus);
        Button minus =(Button)findViewById(R.id.minus);
        Button multi =(Button)findViewById(R.id.multi);
        Button div =(Button)findViewById(R.id.div);
        Button back =(Button)findViewById(R.id.back);
        Button del =(Button)findViewById(R.id.del);
        Button clr =(Button)findViewById(R.id.clr);
        more1 = (Button)findViewById(R.id.more1);
        Button fact =(Button)findViewById(R.id.fact);
        final Function logbb = new Function("logb",2) {
            @Override
            public double apply(double... args) {
                return Math.log(args[0])/Math.log(args[1]);
            }
        };
        final Function facto = new Function("fact",1) {
            @Override
            public double apply(double... args) {
                final int arg = (int) args[0];
                if((double)arg!=args[0]){
                    throw new IllegalArgumentException("int only");
                }
                if(arg<0){
                    throw new IllegalArgumentException("int only pos");
                }
                double res=1;
                int i;
                for(i=1;i<=arg;i++){
                    res=res*i;
                }
                return res;
            }
        };
        loggy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+"log");
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "sin");
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "cos");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "tan");
            }
        });
        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "pi");
            }
        });
        braop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "(");
            }
        });
        braclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ ")");
            }
        });
        cbrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "cbrt");
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "sqrt");
            }
        });
        acos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "acos");
            }
        });
        asin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "asin");
            }
        });
        atan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "atan");
            }
        });
        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "exp");
            }
        });
        sinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "sinh");
            }
        });
        cosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "cosh");
            }
        });
        tanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "tanh");
            }
        });
        logb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "logb");
            }
        });
        deci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ ".");
            }
        });
        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ ",");
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "^");
            }
        });
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "abs");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "-");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "*");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+ "/");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String l=tex.getText().toString();
                int m = l.length();
                tex.setText(l.substring(0,m-1));
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(null);
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(null);
            }
        });
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex.setText(tex.getText()+"fact");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = tex.getText().toString();
                Expression ex = new ExpressionBuilder(txt).functions(logbb,facto).build();
                Double rt= ex.evaluate();
                tex.setText(rt.toString());
            }
        });
        more1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                menu();
            }
        });
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void menu(){
        if(!isopen){
            int x = more1.getLeft();
            int y = more1.getBottom();
            int s = 0;
            int f = (int)Math.hypot(main.getWidth(),main.getHeight());
            more1.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),android.R.color.white,null)));
            more1.setText("back");
            Animator anim = ViewAnimationUtils.createCircularReveal(main2,x,y,s,f);
            main2.setVisibility(View.VISIBLE);
            anim.start();
            isopen=true;
        }
        else{
            int x = more1.getLeft();
            int y = more1.getBottom();
            int s = 0;
            int f = (int)Math.hypot(main2.getWidth(),main2.getHeight());
            more1.setBackgroundTintList(ColorStateList.valueOf(ResourcesCompat.getColor(getResources(),android.R.color.holo_red_light,null)));
            more1.setText("back");
            Animator anim = ViewAnimationUtils.createCircularReveal(main2,x,y,f,s);
            anim.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animator) {

                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    main2.setVisibility(View.GONE);
                    more1.setText("MORE");

                }

                @Override
                public void onAnimationCancel(Animator animator) {

                }

                @Override
                public void onAnimationRepeat(Animator animator) {

                }
            });
            anim.start();
            isopen=false;
        }
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
