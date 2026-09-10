package com.startapp.sdk.internal;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a2 {
    public static final String a(String str) {
        Intrinsics.f(str, "<this>");
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            Intrinsics.e(bArrDecode, "decode(...)");
            return new String(bArrDecode, Charsets.f44691a);
        } catch (Exception unused) {
            return str;
        }
    }
}
