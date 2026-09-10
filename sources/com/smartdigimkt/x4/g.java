package com.smartdigimkt.x4;

import android.hardware.SensorEvent;

/* JADX INFO: loaded from: classes6.dex */
public class g extends b {
    public float g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f39926h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f39927i = 0.0f;
    public long j = 0;
    private int k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f39928l = 5000;
    a m;

    @Override // com.smartdigimkt.x4.d
    public void a(f fVar) {
        if (fVar != null) {
            this.k = fVar.b();
            this.f39928l = fVar.d();
        }
    }

    @Override // com.smartdigimkt.x4.b
    public void c() {
        super.c();
        this.g = 0.0f;
        this.f39926h = 0.0f;
        this.f39927i = 0.0f;
    }

    @Override // com.smartdigimkt.x4.d
    public void a(a aVar) {
        this.m = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    @Override // com.smartdigimkt.x4.d
    public boolean a(SensorEvent sensorEvent) {
        float[] fArr;
        long jCurrentTimeMillis;
        if (this.m != null && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
            float f = -fArr[0];
            float f2 = -fArr[1];
            float f3 = -fArr[2];
            b(sensorEvent);
            String.format("handleSensorData lastx:%d,lasty:%d,lastz:%d", Integer.valueOf((int) f), Integer.valueOf((int) f2), Integer.valueOf((int) f3));
            float f4 = this.g;
            if (f4 == 0.0f || Math.abs(f - f4) <= this.k) {
                float f5 = this.f39926h;
                if (f5 == 0.0f || Math.abs(f2 - f5) <= this.k) {
                    float f6 = this.f39927i;
                    if (f6 != 0.0f && Math.abs(f3 - f6) > this.k) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - this.j > this.f39928l) {
                            b();
                            if (this.m.a()) {
                                this.j = jCurrentTimeMillis;
                                c();
                                return true;
                            }
                        }
                    }
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.j > this.f39928l) {
                        b();
                        if (this.m.a()) {
                            this.j = jCurrentTimeMillis;
                            c();
                            return true;
                        }
                    }
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.j > this.f39928l) {
                    b();
                    if (this.m.a()) {
                        this.j = jCurrentTimeMillis;
                        c();
                        return true;
                    }
                }
            }
            this.g = f;
            this.f39926h = f2;
            this.f39927i = f3;
        }
        return false;
    }
}
