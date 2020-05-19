package masson.jorge.cheezery_174160

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registrar.*

class RegistrarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        btn_sign.setOnClickListener {
            var i = Intent(this, MenuActivity::class.java)
            startActivity(i)
        }

    }
}
