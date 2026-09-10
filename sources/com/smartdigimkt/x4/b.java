package com.smartdigimkt.x4;

import android.hardware.SensorEvent;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f39911a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f39912b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f39913c = 2;
    private float d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f39914e = 0.0f;
    private float f = 0.0f;

    public float[] a() {
        try {
            return new float[]{this.d, this.f39914e, this.f};
        } catch (Throwable unused) {
            return null;
        }
    }

    public void b(SensorEvent sensorEvent) {
        try {
            float[] fArr = sensorEvent.values;
            if (Math.abs(fArr[0]) > this.d) {
                this.d = Math.abs(fArr[0]);
            }
            if (Math.abs(fArr[1]) > this.f39914e) {
                this.f39914e = Math.abs(fArr[1]);
            }
            if (Math.abs(fArr[2]) > this.f) {
                this.f = Math.abs(fArr[2]);
            }
        } catch (Throwable unused) {
        }
    }

    public void c() {
        this.d = 0.0f;
        this.f39914e = 0.0f;
        this.f = 0.0f;
    }

    public void b() {
        com.smartdigimkt.t4.a.a().a(a());
    }
}
