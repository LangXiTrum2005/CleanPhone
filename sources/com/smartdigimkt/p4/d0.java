package com.smartdigimkt.p4;

import android.os.Trace;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 {
    private d0() {
    }

    public static void a(String str) {
        if (f0.f37540a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    private static void b() {
        Trace.endSection();
    }

    public static void a() {
        if (f0.f37540a >= 18) {
            b();
        }
    }
}
