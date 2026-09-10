package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j6 {
    public static final File a(i6 i6Var, File file) {
        Intrinsics.f(i6Var, "<this>");
        return new File(file, i6Var.b());
    }

    public static final i6 a(Download download) {
        Intrinsics.f(download, "<this>");
        return new i6(download);
    }

    public static final String a(int i2) {
        if (i2 == 0) {
            return "STATE_QUEUED";
        }
        if (i2 == 1) {
            return "STATE_STOPPED";
        }
        if (i2 == 2) {
            return "STATE_DOWNLOADING";
        }
        if (i2 == 3) {
            return "STATE_COMPLETED";
        }
        if (i2 == 4) {
            return "STATE_FAILED";
        }
        if (i2 == 5) {
            return "STATE_REMOVING";
        }
        if (i2 != 7) {
            return android.support.v4.media.a.h(i2, "UNKNOWN STATE ");
        }
        return "STATE_RESTARTING";
    }
}
