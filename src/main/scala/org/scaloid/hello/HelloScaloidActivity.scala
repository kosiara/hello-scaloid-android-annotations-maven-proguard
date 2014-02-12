package org.scaloid.hello

import org.scaloid.common._
import android.graphics.Color

class HelloScaloidActivity extends SActivity {

  onCreate {
    contentView = new SVerticalLayout {
      style {
        case t: STextView => t.textSize(10 dip)
        case v: SEditText => v.backgroundColor(Color.YELLOW)
      }

      STextView("I am 10 dip tall")
      STextView("Me too")
      STextView("I am taller than you").textSize(15 dip) // overriding
      SEditText("Yellow input field")
      SButton(R.string.red).onClick(toast("Ala ma kota"))
      SButton("Launch second test activity").onClick(
        startActivity[SecondTestActivity]
      ).margin(20 dip)
      SButton("Launch android annotations test activity").onClick(
        startActivity[AnnotationTestActivity_]
      ).margin(20 dip)

    }.padding(20 dip)
  }

}
