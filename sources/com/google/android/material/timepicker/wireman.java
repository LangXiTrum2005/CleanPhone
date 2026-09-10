package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: compiled from: MaxInputValidator.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman implements InputFilter {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f21400attabal;

    public wireman(int i) {
        this.f21400attabal = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f21400attabal) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
