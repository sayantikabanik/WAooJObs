package com.example.android.waoojobs;

import android.content.ClipData;
import android.nfc.Tag;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by USER on 18-05-2016.
 */
public class ButtonActivity extends MainActivity implements View.OnClickListener {
    Button res;
    CheckBox media, space_ast, writer, music, engineer, agent, photo, age1, age2, age3, exp1, exp2, exp3;
    boolean age01, age02, age03, exp01, exp02, exp03, mediax, writerx, photox, musicx, astx, engx, agentx;
    EditText name_of;
    String name;
    TextView output;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
        output = (TextView) findViewById(R.id.final_output);
        name_of = (EditText) findViewById(R.id.name);
        media = (CheckBox) findViewById(R.id.check_media);
        space_ast = (CheckBox) findViewById(R.id.check_astronaut);
        writer = (CheckBox) findViewById(R.id.check_writer);
        agent = (CheckBox) findViewById(R.id.check_agent);
        music = (CheckBox) findViewById(R.id.check_musician);
        engineer = (CheckBox) findViewById(R.id.check_engineer);
        photo = (CheckBox) findViewById(R.id.check_photographer);
        age1 = (CheckBox) findViewById(R.id.age1);
        age2 = (CheckBox) findViewById(R.id.age2);
        age3 = (CheckBox) findViewById(R.id.age3);
        exp1 = (CheckBox) findViewById(R.id.exp1);
        exp2 = (CheckBox) findViewById(R.id.exp2);
        exp3 = (CheckBox) findViewById(R.id.exp3);
        res = (Button) findViewById(R.id.result);

    }

    public void check_out(View v) {

        age01 = age1.isChecked();
        age02 = age2.isChecked();
        age03 = age3.isChecked();
        exp01 = exp1.isChecked();
        exp02 = exp2.isChecked();
        exp03 = exp3.isChecked();
        mediax = media.isChecked();
        writerx = writer.isChecked();
        astx = space_ast.isChecked();
        engx = engineer.isChecked();
        musicx = music.isChecked();
        agentx = agent.isChecked();
        photox = photo.isChecked();
        Editable nameEditable = name_of.getText();
        name = nameEditable.toString();



        //cases according to which output/results will be displayed on to the user
        if (mediax == true) {
                if ((age01 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))) {
                    output.setText("Hola!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Student Editor" + "\n" + "\t" + "-Data Entry Operator" + "\n" + "All D Best:)");
                } else if (((age02 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true)))) {
                    output.setText("Hola!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Digital Marketing" + "\n" + "\t" + "-Data Spec Analyst" + "\n" + "\t" + "-Communication Specialist" + "\n" + "All D Best:)");
                } else if ((((age03 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))))) {
                    output.setText("Hola!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-PR Officer" + "\n" + "\t" + "-Film Director" + "\n" + "\t" + "-TV Correspondent" + "\n" + "All D Best:)");
                } else {
                    output.setText("Invalid Selection:(");
                }

            } else if (agentx == true) {
                if ((age01 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))) {
                    output.setText("Hola!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Cyber Security Expert" + "\n" + "All D Best:)");
                } else if (((age02 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true)))) {
                    output.setText("Hola!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Special Agent" + "\n" + "\t" + "-Criminal Investigator" + "\n" + "All D Best:)");
                } else if ((((age03 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))))) {
                    output.setText("Hola!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Country Sheriff" + "\n" + "\t" + "-Criminal Investigator" + "\n" + "All D Best:)");
                } else {
                    output.setText("Invalid Selection:(");
                }
            } else if (musicx == true) {
                if ((age01 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Music Composer" + "\n" + "\t" + "-Rock Star" + "\n" + "\t" + "-Background Singer" + "\n" + "All D Best:)");
                } else if (((age02 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true)))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Music Composer" + "\n" + "\t" + "-Production Music Composer" + "\n" + "\t" + "-Background Singer" + "\n" + "All D Best:)");
                } else if ((((age03 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Music Composer" + "\n" + "\t" + "-Music Therapist" + "\n" + "\t" + "-Sound Designer" + "\n" + "All D Best:)");
                } else {
                    output.setText("Invalid Selection:(");
                }
            } else if (writerx == true) {
                if ((age01 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Creative Writer" + "\n" + "\t" + "-Freelance Copywriter" + "\n" + "All D Best:)");
                } else if (((age02 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true)))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Creative Writer" + "\n" + "\t" + "-Proof Reader" + "\n" + "\t" + "-Content Developer" + "\n" + "All D Best:)");
                } else if ((((age03 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Creative Writer" + "\n" + "\t" + "-Proof Reader" + "\n" + "\t" + "-Content Developer" + "\n" + "All D Best:)");
                } else {
                    output.setText("Invalid Selection:(");
                }
            } else if (photox == true) {
                if ((age01 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-An Internship" + "\n" + "\t" + "-Freelance Photographer" + "\n" + "All D Best:)");
                } else if (((age02 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true)))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Fashion Photographer" + "\n" + "\t" + "-Assistant Photographer" + "\n" + "\t" + "-Product Photographer" + "\n" + "All D Best:)");
                } else if ((((age03 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Fashion Photographer" + "\n" + "\t" + "-Assistant Photographer" + "\n" + "\t" + "-Product Photographer" + "\n" + "All D Best:)");
                } else {
                    output.setText("Invalid Selection:(");
                }
            } else if (engx == true) {
                if ((age01 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-An Internship" + "\n" + "\t" + "-Student Developer" + "\n" + "All D Best:)");
                } else if (((age02 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true)))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Executive Engineer" + "\n" + "\t" + "-Software Engineer" + "\n" + "\t" + "...list is huge" + "\n" + "All D Best:)");
                } else if ((((age03 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Executive Engineer" + "\n" + "\t" + "-Software Engineer" + "\n" + "\t" + "...list is huge" + "\n" + "All D Best:)");
                } else {
                    output.setText("Invalid Selection:(");
                }
            } else if (astx == true) {
                if ((age01 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "Celestial Body Viewer" + "\n" + "\t" + "-Student Developer/Analyst" + "\n" + "All D Best:)");
                } else if (((age02 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true)))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Astronaut" + "\n" + "\t" + "-Astrophysicist" + "\n" + "\t" + "...Keep Exploring" + "\n" + "All D Best:)");
                } else if ((((age03 == true) && ((exp01 == true) || (exp02 == true) || (exp03 == true))))) {
                    output.setText("Hola\n Great Selection:D!" + "\n" + name + "\n" + "You Can Opt For" + "\n" + "\t" + "-Astronaut" + "\n" + "\t" + "-Astrophysicist" + "\n" + "\t" + "...Keep Exploring" + "\n" + "All D Best:)");
                } else {
                    output.setText("Invalid Selection:(");
                }

            }
        }
    }





















































