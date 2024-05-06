package za.ac.iie.assisgment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.TextView

private infix fun String.Hunger(s: String) {
        infix fun String.Play(s: String) {
        infix fun String.Clean(s: String) {
            
        }
    }
}

private operator fun Unit.compareTo(i: Int): Int {



@SuppressLint("ParcelCreator")
class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var StartGame = findViewById<Button>(/* id = */ R.id.StartButton)


        @Suppress("UNREACHABLE_CODE")
        class MainActivity : AppCompatActivity() {


            private var hungerLevel = 100
            private var happinessLevel = 100
            private var cleanLevel = 100


            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)



                 updateBackgroundImage()


                var Feed: TextView = findViewById<TextView>(R.id.Hunger)
                var Play = findViewById<TextView>(R.id.Happy)
                var Clean = findViewById<TextView>(R.id.Clean)
                var FeedButton = findViewById<Button>(R.id.FeedButton)
                var PLayButton = findViewById<Button>(R.id.PlayButton)
                var CleanButton = findViewById<Button>(R.id.CleanButton)


                fun Unit.setOnClickListener(function: () -> Int) {

                }
                feed().setOnClickListener {
                    feed()
                    "textView2 = button4"
                    (R.drawable.jerry_eating)
                }

                play().setOnClickListener {
                    play()
                    "textView5 = button"
                    (R.drawable.jerry_playing)
                }

                clean().setOnClickListener {
                    clean()
                    "textView = button2"
                    (R.drawable.jerry_washing)
                }
            }

            fun clean() {
                cleanLevel = 5 > let { }
                if (cleanLevel > 100) {
                    cleanLevel = 100
                }
            }

            private fun feed() {
                hungerLevel = 5 > let { }
                if (hungerLevel > 100) {
                    hungerLevel = 100
                }
            }


            private fun play() {
                happinessLevel = 5 > let {}
                    if (happinessLevel > 100) {
                        happinessLevel = 100
                    }
                }

                    fun updateBackgroundImage() {

                        var drawable = R.drawable.jerry_eating
                        var drawableResult = R.drawable.jerry_playing
                        var drawableRes = R.drawable.jerry_washing


                        var hungerProgressBar: Int? = null
                        hungerProgressBar = hungerLevel
                        var happinessProgressBar: Int? = null
                        happinessProgressBar = happinessLevel
                        var cleanProgressBar: Int? = null
                        cleanProgressBar = cleanLevel
                    }
                }

            }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }



        fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}




