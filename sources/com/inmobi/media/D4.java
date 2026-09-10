package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class D4 {
    public static final P9 a(C3324yc c3324yc) {
        Intrinsics.f(c3324yc, "<this>");
        P9 p9 = new P9();
        byte[] bArr = c3324yc.f24135c;
        if (bArr != null) {
            if (bArr.length == 0) {
                p9.f23071b = new byte[0];
            } else {
                byte[] bArr2 = new byte[bArr.length];
                p9.f23071b = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        p9.f = c3324yc.f24134b;
        p9.f23073e = c3324yc.f24136e;
        p9.d = c3324yc.f24133a;
        Integer num = c3324yc.d;
        p9.f23072c = Integer.valueOf(num != null ? num.intValue() : 0);
        return p9;
    }

    public static final boolean a(String str) {
        if (str == null || StringsKt.a0(str).toString().length() == 0) {
            return true;
        }
        return (StringsKt.M(str, "http://", false) || StringsKt.M(str, "https://", false)) ? false : true;
    }

    public static final void a(Thread thread, String name) {
        Intrinsics.f(thread, "<this>");
        Intrinsics.f(name, "name");
        try {
            thread.start();
        } catch (InternalError e2) {
            e2.toString();
        }
    }
}
