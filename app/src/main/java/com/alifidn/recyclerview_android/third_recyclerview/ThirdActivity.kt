package com.alifidn.recyclerview_android.third_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.alifidn.recyclerview_android.R
import com.alifidn.recyclerview_android.databinding.ActivityThirdBinding
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.nio.charset.StandardCharsets

class ThirdActivity : AppCompatActivity() {

    private var modelPahlawan: MutableList<ModelPahlawan> = ArrayList()
    lateinit var pahlawanAdapter: PahlawanAdapter
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvPahlawan.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ThirdActivity)
        }
        getListPahlawan()
    }

    fun getListPahlawan() {
        try {
            //  Open Asset JSON
            val stream = assets.open("pahlawan_nasional.json")
            val size = stream.available()
            val buffer = ByteArray(size)
            stream.read(buffer)
            stream.close()
            val stringContent = String(buffer, StandardCharsets.UTF_8)

            try {
                val jsonObject = JSONObject(stringContent)
                val jsonArray = jsonObject.getJSONArray("daftar_pahlawan")
                //  Looping to get All JSON Arrays
                for (i in 0 until jsonArray.length()) {
                    val jsonObjectData = jsonArray.getJSONObject(i)
                    val dataApi = ModelPahlawan()
                    dataApi.name = jsonObjectData.getString("nama")
                    dataApi.namaLengkap = jsonObjectData.getString("nama2")
                    dataApi.imgPahlawan = jsonObjectData.getString("img")
                    modelPahlawan.add(dataApi)
                }
                pahlawanAdapter = PahlawanAdapter(modelPahlawan)
                //  Setup RecyclerView
                binding.rvPahlawan.adapter = pahlawanAdapter
            } catch (err :  JSONException) {
                //  Log.e("ThirdActivityError", err.toString())
                err.printStackTrace()
            }

        } catch (err : JSONException) {
            Toast.makeText(this, "\"$err\", Try Again", Toast.LENGTH_SHORT).show()
        }
    }
}