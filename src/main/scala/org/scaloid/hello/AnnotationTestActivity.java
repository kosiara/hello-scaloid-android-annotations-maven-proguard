package org.scaloid.hello;

import android.app.Activity;
import android.widget.TextView;
import com.googlecode.androidannotations.annotations.*;

@EActivity(R.layout.simple_textbox_layout)
public class AnnotationTestActivity extends Activity {

    @ViewById(R.id.textChangedEverySecond)
    public TextView textView;

    private long counter;

    @AfterInject
    public void afterInject() {}

    @AfterViews
    public void afterViews() {
        textView.setText("Let's start counting....");
        changeTextEverySecond();
    }

    @Click(R.id.buttonChangeLabel)
    public void click() {
        handleTextChangeButtonPressed();
    }

    @Background
    public void changeTextEverySecond() {
        for (;;) {
            counter++;
            handleTextChange();
            sleep();
        }
    }

    @UiThread
    public void handleTextChange() {
        if (textView != null)
            textView.setText(counter + " seconds passed");
    }

    @UiThread
    public void handleTextChangeButtonPressed() {
        if (textView != null)
            textView.setText("Button pressed");
    }

    private void sleep() {
        try  { Thread.sleep(1000); } catch (Exception exc) {}
    }

}
