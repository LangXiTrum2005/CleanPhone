package com.chartboost.sdk.impl;

import android.content.Context;
import androidx.media3.ui.PlayerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q5 implements yd {
    @Override // com.chartboost.sdk.impl.yd
    public PlayerView a(Context context) {
        Intrinsics.f(context, "context");
        PlayerView playerView = new PlayerView(context);
        playerView.setUseController(false);
        return playerView;
    }
}
