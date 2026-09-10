package com.chartboost.sdk.impl;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p5 implements l7 {
    @Override // com.chartboost.sdk.impl.l7
    public ExoPlayer a(Context context) {
        Intrinsics.f(context, "context");
        return new ExoPlayer.Builder(context).a();
    }
}
