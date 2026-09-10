package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.annotation.TargetApi;
import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class TraceUtil {
    private TraceUtil() {
    }

    public static void beginSection(String str) {
        if (Util.SDK_INT >= 18) {
            beginSectionV18(str);
        }
    }

    @TargetApi(18)
    private static void beginSectionV18(String str) {
        Trace.beginSection(str);
    }

    public static void endSection() {
        if (Util.SDK_INT >= 18) {
            endSectionV18();
        }
    }

    @TargetApi(18)
    private static void endSectionV18() {
        Trace.endSection();
    }
}
