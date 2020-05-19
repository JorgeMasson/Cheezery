package masson.jorge.cheezery_174160

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_combos.*
import kotlinx.android.synthetic.main.activity_productos.*
import kotlinx.android.synthetic.main.producto_view.view.*

class CombosActivity : AppCompatActivity() {

    var combos = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combos)

        cargarProductos()

        var adaptador = AdaptadorProductos(this, combos)
        gridview.adapter = adaptador

    }

    fun cargarProductos() {
        combos.add(Product("Furiosa King", R.drawable.furiosaking, "Hamburguesa doble, con papas y refresco.", 5))
        combos.add(Product("Combo Ensalada", R.drawable.comboensalada, "Ensalada César y Agua purificada.", 6))
        combos.add(Product("Pizza Time", R.drawable.pizzatime, "Tres piezas de pizza en forma de cono.", 3))
        combos.add(Product("Combo Wings", R.drawable.combowings, "12 piezas de alitas con papas a la francesa, verduras y aderezos.", 4))
        combos.add(Product("Combo Palomitas", R.drawable.combopalomitas, "2 palomitas medianas con dos refrescos medianos.", 7))
        combos.add(Product("Combo Baguette", R.drawable.combobaguette, "Baguette italiano con papas fritas y agua de jamaica.", 7))

    }

    class AdaptadorProductos: BaseAdapter {

        var productos = ArrayList<Product>()
        var contexto: Context? = null

        constructor(contexto: Context, productos: ArrayList<Product>) {
            this.contexto = contexto
            this.productos = productos
        }

        @SuppressLint("ServiceCast")
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
            var prod = productos[position]
            //var inflador = LayoutInflater.from(contexto)
            var inflador = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflador.inflate(R.layout.producto_view,null)

            vista.producto_img.setImageResource(prod.image)
            vista.producto_nombre.setText(prod.name)
            vista.producto_desc.setText(prod.description)
            vista.producto_precio.setText("$${prod.price}")

            return vista

        }

        override fun getItem(position: Int): Any {
            return productos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return productos.size
        }



    }

}
