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
        var btn_hotdrinks: Button = findViewById(R.id.btn_hot_drinks) as Button
        var btn_sweets: Button = findViewById(R.id.btn_sweets) as Button
        var btn_salties: Button = findViewById(R.id.btn_salties) as Button

        btn_colddrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "colddrinks")
            startActivity(intent)
        }

        btn_hotdrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "hotdrinks")
            startActivity(intent)
        }

        btn_sweets.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "sweets")
            startActivity(intent)
        }

        btn_salties.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "salties")
            startActivity(intent)
        }
    }
}