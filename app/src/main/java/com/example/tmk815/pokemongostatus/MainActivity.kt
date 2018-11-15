package com.example.tmk815.pokemongostatus

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val pkmName=listOf("フシギダネ","フシギソウ","フシギバナ","ヒトカゲ","リザード","リザードン","ゼニガメ","カメール","カメックス","キャタピー","トランセル","バタフリー","ビードル","コクーン","スピアー","ポッポ","ピジョン","ピジョット","コラッタ","ラッタ","オニスズメ","オニドリル","アーボ","アーボック","ピカチュウ","ライチュウ","サンド","サンドパン","ニドラン♀","ニドリーナ","ニドクイン","ニドラン♂","ニドリーノ","ニドキング")
        val type1= listOf("草","草","草","炎","炎","炎","炎","水","水","水","虫","虫","虫","虫","虫","虫","ノーマル","ノーマル","ノーマル","ノーマル","ノーマル","ノーマル","ノーマル","毒","毒","電気","電気","地面","地面","毒","毒","毒","毒","毒","毒")
        recyclerView.adapter=PokemonRecycleViewAdapter(pkmName,type1)
    }
}
