package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f19242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final py1 f19243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ry1 f19244c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.py1, java.util.function.IntConsumer] */
    public /* synthetic */ qy1(ry1 ry1Var, Context context) {
        this.f19244c = ry1Var;
        this.f19242a = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: com.google.android.gms.internal.ads.py1
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i10) {
                ry1 ry1Var2 = this.f18839a.f19244c;
                if (ry1Var2.Y) {
                    return;
                }
                ry1Var2.m1(1, 19, Integer.valueOf(i10));
            }
        };
        this.f19243b = r0;
        context.registerDeviceIdChangeListener(new g0(ry1Var.f19730v.u(ry1Var.f19728t, null), 2), r0);
    }

    public final /* synthetic */ void a() {
        Context context = (Context) this.f19242a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.f19243b);
    }
}
