package com.chartboost.sdk.impl;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sb implements cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f15119a;

    public sb(Context context) {
        Intrinsics.f(context, "context");
        Object systemService = context.getSystemService("audio");
        this.f15119a = systemService instanceof AudioManager ? (AudioManager) systemService : null;
    }

    @Override // com.chartboost.sdk.impl.cc
    public Float a() {
        AudioManager audioManager = this.f15119a;
        if (audioManager == null) {
            return null;
        }
        return Float.valueOf((audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) * 100);
    }
}
