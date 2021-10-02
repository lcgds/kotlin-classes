package br.senac.aula03

import android.app.AlertDialog
import android.content.Context

fun alert(head: String, body: String, ctx: Context) {
    AlertDialog.Builder(ctx)
        .setTitle(head)
        .setMessage(body)
        .setPositiveButton("Okay", null)
        .create()
        .show()
}