package com.inmobi.media;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class J9 {
    public static final boolean a(C3260uc c3260uc) {
        String str;
        Intrinsics.f(c3260uc, "<this>");
        HashMap map = c3260uc.f24033c;
        return (map == null || (str = (String) map.get("Content-Encoding")) == null || !StringsKt.l(str, com.smartdigimkt.o0.b.d, false)) ? false : true;
    }

    public static final String a(String url, Map map) {
        Intrinsics.f(url, "url");
        if (map == null) {
            return url;
        }
        T9.a(map);
        String strA = T9.a(com.ironsource.d9.i.f24749c, map);
        StringBuilder sb = new StringBuilder(url);
        int length = strA.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(strA.charAt(!z2 ? i2 : length), 32) <= 0;
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
        if (strA.subSequence(i2, length + 1).toString().length() > 0) {
            if (!StringsKt.l(url, "?", false)) {
                sb.append("?");
            }
            if (!StringsKt.p(url, com.ironsource.d9.i.f24749c, false) && !StringsKt.p(url, "?", false)) {
                sb.append(com.ironsource.d9.i.f24749c);
            }
            sb.append(strA);
        }
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public static final String a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return new String(bArr, Charsets.f44691a);
            } catch (UnsupportedEncodingException | Exception unused) {
            }
        }
        return "";
    }
}
