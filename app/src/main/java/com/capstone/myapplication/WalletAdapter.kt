import com.capstone.myapplication.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.capstone.myapplication.WalletItem



class WalletAdapter(walletItems: ArrayList<WalletItem>) :
    RecyclerView.Adapter<WalletAdapter.ViewHolder>() {
    private val walletItems: ArrayList<WalletItem> = walletItems

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_wallet, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: WalletItem = walletItems[position]
        holder.icon.setImageResource(item.icon)
        holder.title.text = item.title
        holder.price.text = item.price
        holder.total.text = "Total: ${item.total}" // Using string interpolation
    }

    override fun getItemCount(): Int {
        return walletItems.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var icon: ImageView = itemView.findViewById<ImageView>(R.id.icon)
        var title: TextView = itemView.findViewById<TextView>(R.id.title)
        var price: TextView = itemView.findViewById<TextView>(R.id.price)
        var total: TextView = itemView.findViewById<TextView>(R.id.total)
    }

}