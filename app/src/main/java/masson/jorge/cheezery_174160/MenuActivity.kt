package masson.jorge.cheezery_174160

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_colddrinks.setOnClickListener {
            var i = Intent (this, ProductosActivity::class.java)
            startActivity(i)
        }

        btn_hotdrinks.setOnClickListener {
            var i = Intent (this, HotDrinksActivity::class.java)
            startActivity(i)
        }

        btn_sweets.setOnClickListener {
            var i = Intent (this, SweetsActivity::class.java)
            startActivity(i)
        }

        btn_salties.setOnClickListener {
            var i = Intent (this, SaltiesActivity::class.java)
            startActivity(i)
        }

        btn_combos.setOnClickListener {
            var i = Intent (this, CombosActivity::class.java)
            startActivity(i)
        }

        btn6.setOnClickListener {
            var i = Intent (this, PersonalizedActivity::class.java)
            startActivity(i)
        }

    }
}
