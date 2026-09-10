package com.google.android.exoplayer2.util;

import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
public final class TraceUtil {
    public static void a(String str) {
        if (Util.f18979a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Util.f18979a >= 18) {
            Trace.endSection();
        }
    }
}
