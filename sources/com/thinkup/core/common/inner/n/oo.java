package com.thinkup.core.common.inner.n;

import android.hardware.SensorEvent;

/* JADX INFO: loaded from: classes6.dex */
public final class oo extends o {
    om m0;
    public float o0 = 0.0f;
    public float oo = 0.0f;
    public float om = 0.0f;
    public long on = 0;
    private int mo = 10;
    private long mm = 5000;

    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    @Override // com.thinkup.core.common.inner.n.n
    public final boolean m(SensorEvent sensorEvent) {
        float[] fArr;
        long jCurrentTimeMillis;
        if (this.m0 != null && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
            float f = -fArr[0];
            float f2 = -fArr[1];
            float f3 = -fArr[2];
            o(sensorEvent);
            String.format("handleSensorData lastx:%d,lasty:%d,lastz:%d", Integer.valueOf((int) f), Integer.valueOf((int) f2), Integer.valueOf((int) f3));
            float f4 = this.o0;
            if (f4 == 0.0f || Math.abs(f - f4) <= this.mo) {
                float f5 = this.oo;
                if (f5 == 0.0f || Math.abs(f2 - f5) <= this.mo) {
                    float f6 = this.om;
                    if (f6 != 0.0f && Math.abs(f3 - f6) > this.mo) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - this.on > this.mm) {
                            m();
                            if (this.m0.o()) {
                                this.on = jCurrentTimeMillis;
                                o();
                                return true;
                            }
                        }
                    }
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.on > this.mm) {
                        m();
                        if (this.m0.o()) {
                            this.on = jCurrentTimeMillis;
                            o();
                            return true;
                        }
                    }
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.on > this.mm) {
                    m();
                    if (this.m0.o()) {
                        this.on = jCurrentTimeMillis;
                        o();
                        return true;
                    }
                }
            }
            this.o0 = f;
            this.oo = f2;
            this.om = f3;
        }
        return false;
    }

    @Override // com.thinkup.core.common.inner.n.n
    public final void o(o0 o0Var) {
        this.mo = o0Var.m();
        this.mm = o0Var.o0();
    }

    @Override // com.thinkup.core.common.inner.n.n
    public final void o(om omVar) {
        this.m0 = omVar;
    }

    @Override // com.thinkup.core.common.inner.n.o
    public final void o() {
        super.o();
        this.o0 = 0.0f;
        this.oo = 0.0f;
        this.om = 0.0f;
    }
}
