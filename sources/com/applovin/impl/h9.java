package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8104a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8109f;

    public /* synthetic */ h9(h0 h0Var, SensorEventListener sensorEventListener, Sensor sensor, int i10, com.applovin.impl.sdk.p pVar) {
        this.f8106c = h0Var;
        this.f8107d = sensorEventListener;
        this.f8108e = sensor;
        this.f8105b = i10;
        this.f8109f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8104a) {
            case 0:
                ((h0) this.f8106c).a((SensorEventListener) this.f8107d, (Sensor) this.f8108e, this.f8105b, (com.applovin.impl.sdk.p) this.f8109f);
                break;
            default:
                p1.t0 t0Var = (p1.t0) this.f8106c;
                Pair pair = (Pair) this.f8107d;
                ((q1.f) t0Var.f48165b.f17088i).z(((Integer) pair.first).intValue(), (f2.c0) pair.second, (f2.u) this.f8108e, (c2.g) this.f8109f, this.f8105b);
                break;
        }
    }

    public /* synthetic */ h9(p1.t0 t0Var, Pair pair, f2.u uVar, c2.g gVar, int i10) {
        this.f8106c = t0Var;
        this.f8107d = pair;
        this.f8108e = uVar;
        this.f8109f = gVar;
        this.f8105b = i10;
    }
}
