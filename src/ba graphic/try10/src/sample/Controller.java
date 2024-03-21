package sample;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.effect.Reflection;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

import java.text.SimpleDateFormat;
import java.util.LinkedList;


public class Controller {


    @FXML
    Button head;
    @FXML
    AnchorPane pane;
    @FXML
    TextArea area;
    @FXML
    TextArea Area2;

    LinkedList<Object> list1 = new LinkedList<Object>();
    double Array[][] = new double[50][2];

    LinkedList<String> time = new LinkedList<String>();


    int count = 0;
    int count2 = 0;
    int counter = 0;
    int num;
    int count3 = 0;





    public void Clicked(MouseEvent mouseEvent) {


        create_reflection();

        if (area.getText().equals("git commit")) {
            if (counter == 0) {
                count++;
                //  create_node();
                create_line();
                create_circle();
            } else if (counter == 1) {

                Line line = new Line();
                line.setStartX(Array[num][0] - 140.0);
                line.setStartY(Array[num][1]);
                line.setEndX(Array[num][0] - 30.0);
                line.setEndY(Array[num][1]);

                FadeTransition fade1 = new FadeTransition();
                fade1.setDuration(Duration.millis(2000));
                fade1.setFromValue(0.1);
                fade1.setToValue(10);
                fade1.setCycleCount(1);
                fade1.setAutoReverse(false);
                fade1.setNode(line);
                fade1.play();
                pane.getChildren().add(line);



                count++;

                Circle circle = new Circle();
                circle.setCenterX(Array[num][0] - 150);
                circle.setCenterY(Array[num][1]);
                circle.setRadius(34.0);
                circle.setFill(Color.DARKCYAN);
                circle.setStrokeWidth(8.0);
                circle.setStroke(Color.DARKSLATEGREY);

                FadeTransition fade = new FadeTransition();
                fade.setDuration(Duration.millis(2000));
                fade.setFromValue(0.1);
                fade.setToValue(10);
                fade.setCycleCount(1);
                fade.setAutoReverse(false);
                fade.setNode(circle);
                fade.play();

                pane.getChildren().add(circle);


                int countt = 4;
                Text text = new Text(Array[num][0] - 195,Array[num][1]-35,"c" + countt);
                text.setFill(Color.BROWN);
                text.setFont(Font.font(null, FontWeight.BOLD, 25));

                pane.getChildren().add(text);
                countt++;


                Array[count3][0] = circle.getCenterX();
                Array[count3][1] = circle.getCenterY();
                count3++;


                list1.add(circle);
                time.add(create_time());


                counter = 2;


            } else {
                count2++;
                create_line2();
                create_circle2();


            }
        } else {

            counter = 1;

            String array[] = area.getText().split("");
            String s = array[array.length - 1];
            num = Integer.parseInt(s);
            head_translation(num);


        }


        area.setText("");

    }

    private void create_reflection() {

        Text txt = new Text("learn Git");
        txt.setFont(Font.font("calibre",FontWeight.SEMI_BOLD, FontPosture.ITALIC,60));
        txt.setFill(Color.BROWN);
        txt.setX(600);
        txt.setY(400);
        Reflection ref = new Reflection();
        ref.setBottomOpacity((float) 0.2);
        ref.setFraction(12);
        ref.setTopOffset(10);
        ref.setTopOpacity((float) 0.2);
        txt.setEffect(ref);

        pane.getChildren().add(txt);



    }


    public void Clicked2(MouseEvent mouseEvent) {

        String array[] = Area2.getText().split("");
        String s = array[array.length - 1];
        num = Integer.parseInt(s);

        Area2.setText("node c" + num + " created on:\n" + time.get(num));


    }

    private void head_translation(int num) {


        if (num == 1) {
            Translate translate = new Translate();
            translate.setY(150);
            head.getTransforms().addAll(translate);
        } else if (num == 2) {
            Translate translate = new Translate();
            translate.setY(267);
            head.getTransforms().addAll(translate);

        }


    }

    private void create_circle2() {

        double a = 390.0;

        for (int i = 1; i <= count2; i++) {

            count++;
            Circle circle = new Circle();

            circle.setCenterX(310.0);
            circle.setCenterY(a + 120 * i);
            circle.setRadius(34.0);
            circle.setFill(Color.DARKCYAN);
            circle.setStrokeWidth(8.0);
            circle.setStroke(Color.DARKSLATEGREY);

            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(2000));
            fade.setFromValue(0.1);
            fade.setToValue(10);
            fade.setCycleCount(1);
            fade.setAutoReverse(false);
            fade.setNode(circle);
            fade.play();

            pane.getChildren().add(circle);


            int countt = 5;
            Text text = new Text(Array[num][0] - 195,Array[num][1]+ 90,"c" + countt);
            text.setFill(Color.BROWN);
            text.setFont(Font.font(null, FontWeight.BOLD, 25));

            pane.getChildren().add(text);
            countt++;


            Array[count3][0] = circle.getCenterX();
            Array[count3][1] = circle.getCenterY();
            count3++;


            list1.add(circle);
            time.add(create_time());


        }
    }

    private void create_line2() {

        double a = 280.0;
        double b = 360.0;

        for (int i = 1; i <= count2; i++) {

            Line line = new Line();
            line.setStartX(310.0);
            line.setStartY(a + ((double) i * 120));
            line.setEndX(310.0);
            line.setEndY(b + ((double) i * 120));

            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(2000));
            fade.setFromValue(0.1);
            fade.setToValue(10);
            fade.setCycleCount(1);
            fade.setAutoReverse(false);
            fade.setNode(line);
            fade.play();
            pane.getChildren().add(line);

        }
    }

//    private void create_node() {
//
//        list.insert(list,count);
//
//    }


    private void create_line() {

        double a = 280.0;
        double b = 360.0;

        for (int i = 0; i < count; i++) {

            Line line = new Line();
            line.setStartX(460.0);
            line.setStartY(a + ((double) i * 120));
            line.setEndX(460.0);
            line.setEndY(b + ((double) i * 120));

            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(2000));
            fade.setFromValue(0.1);
            fade.setToValue(10);
            fade.setCycleCount(1);
            fade.setAutoReverse(false);
            fade.setNode(line);
            fade.play();
            pane.getChildren().add(line);
        }


    }


    private void create_circle() {

        double a = 390.0;
        double b = 350.0;
        int countt = 1;

        for (int i = 0; i < count; i++) {

            Circle circle = new Circle();

            Text text = new Text(430.0,b + 120 * i,"c" + countt);
            text.setFill(Color.BROWN);
            text.setFont(Font.font(null, FontWeight.BOLD, 25));

            pane.getChildren().add(text);
            countt++;




            circle.setCenterX(460.0);
            circle.setCenterY(a + 120 * i);
            circle.setRadius(34.0);
            circle.setFill(Color.DARKCYAN);
            circle.setStrokeWidth(8.0);
            circle.setStroke(Color.DARKSLATEGREY);


            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(2000));
            fade.setFromValue(0.1);
            fade.setToValue(10);
            fade.setCycleCount(1);
            fade.setAutoReverse(false);
            fade.setNode(circle);
            fade.play();




            pane.getChildren().add(circle);



            Array[count3][0] = circle.getCenterX();
            Array[count3][1] = circle.getCenterY();


            time.add(create_time());


            count3++;


            list1.add(circle);


        }

    }

    private String create_time() {

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());

        return timeStamp;
    }



}
