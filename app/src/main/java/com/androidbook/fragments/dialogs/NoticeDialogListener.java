package com.androidbook.fragments.dialogs;

import android.app.DialogFragment;

/**
 * Created by ricard.arman.kuodis on 9/26/2016.
 */

public interface NoticeDialogListener {

    /* The activity that creates an instance of this dialog fragment must
     * implement this interface in order to receive event callbacks.
     * Each method passes the DialogFragment in case the host needs to query it. */
    public void onDialogPositiveClick(DialogFragment dialog);
    public void onDialogNegativeClick(DialogFragment dialog);
}
