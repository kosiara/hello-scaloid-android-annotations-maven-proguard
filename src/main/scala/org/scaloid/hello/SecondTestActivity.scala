package org.scaloid.hello

import org.scaloid.common._
import android.content.Context
import android.widget.TextView

class SecondTestActivity extends SActivity {

  var resultTextView : STextView = null

  onCreate {

    resultTextView = new STextView{ text = "hello" }
    resultTextView.setTextSize(32)

    contentView = new SVerticalLayout {
      STextView("Second test activity")
      this += resultTextView
      SButton(R.string.get_value_from_scala_button_text).onClick(
        getValueFromJavaClass
      )
    }
  }

  def getValueFromJavaClass(implicit context: Context): Unit = {
    val javaClass = new TestJavaClass
    val textToSet = javaClass.getCount.toString;
    toast(textToSet)
    resultTextView.setText(textToSet)
  }

}
