package com.smartdigimkt.c3;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f34064b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.smartdigimkt.g7.c f34065a = com.smartdigimkt.g7.c.a();

    private a() {
    }

    public static a a() {
        if (f34064b == null) {
            synchronized (a.class) {
                try {
                    if (f34064b == null) {
                        f34064b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f34064b;
    }

    public com.smartdigimkt.p6.o b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.smartdigimkt.p6.p.c().b(str);
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return com.smartdigimkt.d7.d.c().d(4, com.smartdigimkt.n8.l.b(str));
    }
}
