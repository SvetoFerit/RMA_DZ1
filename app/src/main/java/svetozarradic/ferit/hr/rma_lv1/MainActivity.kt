package svetozarradic.ferit.hr.rma_lv1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

import java.util.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpUi()
    }

         fun setUpUi() {
         ivJobsImage.setOnClickListener{ displayJobsQuote()}
         ivAdaImage.setOnClickListener{ displayAdaQuotes()}
         ivGoslingImage.setOnClickListener{ displayGoslingQuotes()}
}

    fun displayJobsQuote() {
        Log.d("jobs","jobsImage")

        val quotesArray: Array<String> = resources.getStringArray(R.array.steve_jobs_quotes)
        val randomIndex = Random().nextInt(quotesArray.size)
        val randomQuotes = quotesArray[randomIndex]
        Toast.makeText(this, randomQuotes, Toast.LENGTH_SHORT).show()

    }


    private fun displayAdaQuotes() {
        val quotesArray: Array<String> = resources.getStringArray(R.array.ada_lovelace_quotes)
        val randomIndex = Random().nextInt(quotesArray.size)
        val randomQuotes = quotesArray[randomIndex]
        Toast.makeText(this, randomQuotes, Toast.LENGTH_SHORT).show()
    }

    private fun displayGoslingQuotes() {
        val quotesArray: Array<String> = resources.getStringArray(R.array.james_gosling_quotes)
        val randomIndex = Random().nextInt(quotesArray.size)
        val randomQuotes = quotesArray[randomIndex]
        Toast.makeText(this, randomQuotes, Toast.LENGTH_SHORT).show()
    }

}
