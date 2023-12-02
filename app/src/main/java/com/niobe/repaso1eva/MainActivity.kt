package com.niobe.repaso1eva

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    private lateinit var tvBlanco: TextView
    private lateinit var tvRojo: TextView
    private lateinit var tvNaranja: TextView
    private lateinit var tvAmarillo: TextView
    private lateinit var tvVerde: TextView
    private lateinit var tvCian: TextView
    private lateinit var tvAzul: TextView
    private lateinit var tvVioleta: TextView
    private lateinit var tvGris: TextView
    private lateinit var tvNegro: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        initListeners()
    }

    private fun initComponents() {
        tvBlanco = findViewById(R.id.tvBlanco)
        tvRojo = findViewById(R.id.tvRojo)
        tvNaranja = findViewById(R.id.tvNaranja)
        tvAmarillo = findViewById(R.id.tvAmarillo)
        tvVerde = findViewById(R.id.tvVerde)
        tvCian = findViewById(R.id.tvCian)
        tvAzul = findViewById(R.id.tvAzul)
        tvVioleta = findViewById(R.id.tvVioleta)
        tvGris = findViewById(R.id.tvGris)
        tvNegro = findViewById(R.id.tvNegro)
    }

    private fun initListeners() {
        tvBlanco.setOnClickListener { showDialog(tvBlanco) }
        tvRojo.setOnClickListener { showDialog(tvRojo) }
        tvNaranja.setOnClickListener { showDialog(tvNaranja) }
        tvAmarillo.setOnClickListener { showDialog(tvAmarillo) }
        tvVerde.setOnClickListener { showDialog(tvVerde) }
        tvCian.setOnClickListener { showDialog(tvCian) }
        tvAzul.setOnClickListener { showDialog(tvAzul) }
        tvVioleta.setOnClickListener { showDialog(tvVioleta) }
        tvGris.setOnClickListener { showDialog(tvGris) }
        tvNegro.setOnClickListener { showDialog(tvNegro) }
    }

    private fun showDialog(view: TextView) {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_repaso1ev)

        val cvAplicarColor: CardView = dialog.findViewById(R.id.cvAplicarColortv)
        val rgColores: RadioGroup = dialog.findViewById(R.id.rgColores)

        dialog.show()

        cvAplicarColor.setOnClickListener {
            val selectedColor = rgColores.checkedRadioButtonId
            val selectedRadioButtonColor: RadioButton = rgColores.findViewById(selectedColor)
            //Necesitamos asignar el color y el texto correspondiente
            when (selectedRadioButtonColor.text) {
                getString(R.string.BLANCO) -> updateCv(view, selectedRadioButtonColor)
                getString(R.string.ROJO) -> updateCv(view, selectedRadioButtonColor)
                getString(R.string.NARANJA) -> updateCv(view, selectedRadioButtonColor)
                getString(R.string.AMARILLO) -> updateCv(view, selectedRadioButtonColor)
                getString(R.string.VERDE) -> updateCv(view, selectedRadioButtonColor)
                getString(R.string.CIAN) -> updateCv(view, selectedRadioButtonColor)
                getString(R.string.AZUL) -> updateCv(view, selectedRadioButtonColor)
                getString(R.string.VIOLETA) -> updateCv(view, selectedRadioButtonColor)
                getString(R.string.GRIS) -> updateCv(view, selectedRadioButtonColor)
                getString(R.string.NEGRO) -> updateCv(view, selectedRadioButtonColor)
            }
            dialog.hide()
        }
    }

    private fun updateCv( view: TextView, selectedRadioButtonColor: RadioButton) {
        when (selectedRadioButtonColor.text) {
            getString(R.string.BLANCO) -> {
                view.setBackgroundColor(getColor(R.color.white))
                view.text = getString(R.string.BLANCO)
                view.setTextColor(getColor(R.color.black))
            }

            getString(R.string.ROJO) -> {
                view.setBackgroundColor(getColor(R.color.red))
                view.text = getString(R.string.ROJO)
                view.setTextColor(getColor(R.color.white))
            }

            getString(R.string.NARANJA) -> {
                view.setBackgroundColor(getColor(R.color.orange))
                view.text = getString(R.string.NARANJA)
                view.setTextColor(getColor(R.color.black))
            }

            getString(R.string.AMARILLO) -> {
                view.setBackgroundColor(getColor(R.color.yellow))
                view.text = getString(R.string.AMARILLO)
                view.setTextColor(getColor(R.color.black))
            }

            getString(R.string.VERDE) -> {
                view.setBackgroundColor(getColor(R.color.green))
                view.text = getString(R.string.VERDE)
                view.setTextColor(getColor(R.color.black))
            }

            getString(R.string.CIAN) -> {
                view.setBackgroundColor(getColor(R.color.cian))
                view.text = getString(R.string.CIAN)
                view.setTextColor(getColor(R.color.black))
            }

            getString(R.string.AZUL) -> {
                view.setBackgroundColor(getColor(R.color.blue))
                view.text = getString(R.string.AZUL)
                view.setTextColor(getColor(R.color.white))
            }

            getString(R.string.VIOLETA) -> {
                view.setBackgroundColor(getColor(R.color.violet))
                view.text = getString(R.string.VIOLETA)
                view.setTextColor(getColor(R.color.white))
            }

            getString(R.string.GRIS) -> {
                view.setBackgroundColor(getColor(R.color.grey))
                view.text = getString(R.string.GRIS)
                view.setTextColor(getColor(R.color.white))
            }

            getString(R.string.NEGRO) -> {
                view.setBackgroundColor(getColor(R.color.black))
                view.text = getString(R.string.NEGRO)
                view.setTextColor(getColor(R.color.white))
            }
        }
    }
}
