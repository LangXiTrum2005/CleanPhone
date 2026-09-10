package com.chartboost.sdk.impl;

import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qb implements bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14888a;

    public qb(Context context) {
        Intrinsics.f(context, "context");
        this.f14888a = context;
    }

    @Override // com.chartboost.sdk.impl.bc
    public yb a() {
        int i2 = this.f14888a.getResources().getConfiguration().orientation;
        if (i2 == 1) {
            return yb.PORTRAIT;
        }
        if (i2 != 2) {
            return null;
        }
        return yb.LANDSCAPE;
    }

    @Override // com.chartboost.sdk.impl.bc
    public boolean isLocked() {
        return Settings.System.getInt(this.f14888a.getContentResolver(), "accelerometer_rotation", 0) != 0;
    }
}
