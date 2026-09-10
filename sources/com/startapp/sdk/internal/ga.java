package com.startapp.sdk.internal;

import android.text.TextUtils;
import android.view.inputmethod.InputMethodSubtype;

/* JADX INFO: loaded from: classes6.dex */
public final class ga {
    public static final String a(InputMethodSubtype inputMethodSubtype) {
        String languageTag = inputMethodSubtype.getLanguageTag();
        return TextUtils.isEmpty(languageTag) ? inputMethodSubtype.getLocale() : languageTag;
    }
}
