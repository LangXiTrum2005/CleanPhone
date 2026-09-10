package com.thinkup.core.common.inner.n;

import android.hardware.SensorEvent;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o implements n {
    protected final int o = 0;
    protected final int m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final int f41825n = 2;
    private float o0 = 0.0f;
    private float oo = 0.0f;
    private float om = 0.0f;

    private float[] n() {
        try {
            return new float[]{this.o0, this.oo, this.om};
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void m() {
        com.thinkup.core.express.n.o.o().o(n());
    }

    public final void o(SensorEvent sensorEvent) {
        try {
            float[] fArr = sensorEvent.values;
            if (Math.abs(fArr[0]) > this.o0) {
                this.o0 = Math.abs(fArr[0]);
            }
            if (Math.abs(fArr[1]) > this.oo) {
                this.oo = Math.abs(fArr[1]);
            }
            if (Math.abs(fArr[2]) > this.om) {
                this.om = Math.abs(fArr[2]);
            }
        } catch (Throwable unused) {
        }
    }

    public void o() {
        this.o0 = 0.0f;
        this.oo = 0.0f;
        this.om = 0.0f;
    }
}
