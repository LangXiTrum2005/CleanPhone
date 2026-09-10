package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public interface DateSelector<S> extends Parcelable {
    static void u0(final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                for (EditText editText : editTextArr) {
                    if (editText.hasFocus()) {
                        return;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new c0.a(editText2, 19), 100L);
    }

    boolean C0();

    ArrayList D0();

    Object I0();

    View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, OnSelectionChangedListener onSelectionChangedListener);

    void O0(long j);

    String d(Context context);

    ArrayList e0();

    int h(Context context);

    String o(Context context);
}
