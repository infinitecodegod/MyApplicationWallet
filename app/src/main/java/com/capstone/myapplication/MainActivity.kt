package com.capstone.myapplication
import WalletAdapter
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.capstone.myapplication.R
//import com.capstone.myapplication.WalletAdapter
import com.capstone.myapplication.WalletItem

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var adapter: WalletAdapter? = null
    private var walletItems: ArrayList<WalletItem>? = null

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
                recyclerView?.let { rv ->
                rv.layoutManager = LinearLayoutManager(this)

            // Populate sample data for wallet items
            populateWalletItems()

            // Initialize adapter and set it to RecyclerView
            adapter = WalletAdapter(walletItems ?: ArrayList())
            rv.adapter = adapter
        }
    }

    // Method to populate sample wallet items
    private fun populateWalletItems() {
        walletItems = ArrayList()
        walletItems!!.add(WalletItem(R.drawable.netflix, "Netflix", "$8.89", "$14.99"))
        walletItems!!.add(WalletItem(R.drawable.spotify, "Spotify Family", "$5.89", "$34.29"))
        walletItems!!.add(WalletItem(R.drawable.dribble, "Dribble Pro", "$2.89", "$52.99"))
        walletItems!!.add(WalletItem(R.drawable.amazon, "Amazon", "$7.77", "$114.37"))
        walletItems!!.add(WalletItem(R.drawable.netflix, "Netflix", "$8.89", "$14.99"))
        walletItems!!.add(WalletItem(R.drawable.spotify, "Spotify Family", "$5.89", "$34.29"))
        walletItems!!.add(WalletItem(R.drawable.dribble, "Dribble Pro", "$2.89", "$52.99"))
        walletItems!!.add(WalletItem(R.drawable.amazon, "Amazon", "$7.77", "$114.37"))
        walletItems!!.add(WalletItem(R.drawable.netflix, "Netflix", "$8.89", "$14.99"))
        walletItems!!.add(WalletItem(R.drawable.spotify, "Spotify Family", "$5.89", "$34.29"))
        walletItems!!.add(WalletItem(R.drawable.dribble, "Dribble Pro", "$2.89", "$52.99"))
        walletItems!!.add(WalletItem(R.drawable.amazon, "Amazon", "$7.77", "$114.37"))
        walletItems!!.add(WalletItem(R.drawable.netflix, "Netflix", "$8.89", "$14.99"))
        walletItems!!.add(WalletItem(R.drawable.spotify, "Spotify Family", "$5.89", "$34.29"))
        walletItems!!.add(WalletItem(R.drawable.dribble, "Dribble Pro", "$2.89", "$52.99"))
        walletItems!!.add(WalletItem(R.drawable.amazon, "Amazon", "$7.77", "$114.37"))
    }
}
