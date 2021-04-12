package com.example.peaktools_todolist.ui.deleteallcompleted

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.example.peaktools_todolist.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DeleteAllCompletedDialogFragment : DialogFragment() {

    private val viewModel: DeleteAllCompletedViewModel by viewModels()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setTitle(R.string.delete_all_completed_dialog_title)
            .setMessage(R.string.delete_all_completed_dialog_message)
            .setNegativeButton(R.string.delete_all_completed_dialog_negative_btn, null)
            .setPositiveButton(R.string.delete_all_completed_dialog_positive_btn) { _, _ ->
                viewModel.onConfirmClick()
            }
            .create()
}