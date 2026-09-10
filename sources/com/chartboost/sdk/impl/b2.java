package com.chartboost.sdk.impl;

import android.util.Base64;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 {
    public final String a(String str) {
        String strI = StringsKt.I(str, IOUtils.LINE_SEPARATOR_UNIX, "");
        int length = strI.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(strI.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return strI.subSequence(i2, length + 1).toString();
    }

    public final String b(String encodedString) {
        Object objA;
        Intrinsics.f(encodedString, "encodedString");
        try {
            byte[] bArrDecode = Base64.decode(a(encodedString), 2);
            Intrinsics.e(bArrDecode, "decode(...)");
            objA = new String(bArrDecode, Charsets.f44691a);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.b("Cannot decode base64 string: " + thA.getLocalizedMessage(), (Throwable) null, 2, (Object) null);
        }
        if (objA instanceof Result.Failure) {
            objA = "";
        }
        return (String) objA;
    }

    public final String c(String originalString) {
        Object objA;
        Intrinsics.f(originalString, "originalString");
        try {
            byte[] bytes = originalString.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "getBytes(...)");
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            Intrinsics.e(strEncodeToString, "encodeToString(...)");
            objA = a(strEncodeToString);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            za.b("Cannot encode to base64 string: " + thA.getLocalizedMessage(), (Throwable) null, 2, (Object) null);
        }
        if (objA instanceof Result.Failure) {
            objA = "";
        }
        return (String) objA;
    }
}
