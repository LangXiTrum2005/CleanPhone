package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q7 {
    public static final int a(ExoPlayer exoPlayer) {
        Intrinsics.f(exoPlayer, "<this>");
        Format formatC = exoPlayer.c();
        if (formatC != null) {
            return formatC.s0;
        }
        return 1;
    }

    public static final int b(ExoPlayer exoPlayer) {
        Intrinsics.f(exoPlayer, "<this>");
        Format formatC = exoPlayer.c();
        if (formatC != null) {
            return formatC.r0;
        }
        return 1;
    }
}
