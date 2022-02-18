package masson.reynoso.cheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btn_colddrinks: Button = findViewById(R.id.btn_cold_drinks) as Button

        btn_colddrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
    }
}