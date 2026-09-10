package com.adjust.sdk;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6811a;

    public a1(Context context) {
        this.f6811a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return Reflection.getAdvertisingInfoObject(this.f6811a);
        } catch (Exception unused) {
            return null;
        }
    }
}
