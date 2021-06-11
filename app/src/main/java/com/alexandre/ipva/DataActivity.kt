package com.alexandre.ipva

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_data.*

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val spn_listaMarcas : Spinner = findViewById(R.id.spn_listaMarcas)
        ArrayAdapter.createFromResource(
            this,
            R.array.marcas,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spn_listaMarcas.adapter = adapter
        }

        val spn_listaAno : Spinner = findViewById(R.id.spn_listaAno)
        ArrayAdapter.createFromResource(
            this,
            R.array.ano,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spn_listaAno.adapter = adapter
        }

        val spn_listaModelos : Spinner = findViewById(R.id.spn_listaModelos)
        ArrayAdapter.createFromResource(
            this,
            R.array.modelos,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spn_listaModelos.adapter = adapter
        }

        val spn_listaEstados : Spinner = findViewById(R.id.spn_listaEstados)
        ArrayAdapter.createFromResource(
            this,
            R.array.estados,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spn_listaEstados.adapter = adapter
        }
    }

}