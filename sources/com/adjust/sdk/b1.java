package com.adjust.sdk;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6820c;

    public /* synthetic */ b1(Context context, int i10, Object obj) {
        this.f6818a = i10;
        this.f6819b = context;
        this.f6820c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6818a) {
            case 0:
                return Reflection.getGoogleAdId(this.f6819b, this.f6820c);
            default:
                return Reflection.isGoogleAdIdTrackingEnabled(this.f6819b, this.f6820c);
        }
    }
}
