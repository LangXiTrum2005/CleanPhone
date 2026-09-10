package com.smartdigimkt.x4;

import android.hardware.SensorEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class c extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    List<Double> f39915h;
    long j;
    a r;
    float s;
    float t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    float f39920u;
    public long g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f39916i = 0;
    String v = "";
    List<Double> o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    List<Double> f39919p = new ArrayList();
    List<Double> q = new ArrayList();
    long k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f39917l = 0;
    int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f39918n = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f39921w = false;

    private void d() {
        this.k = 0L;
        this.f39917l = 0;
        this.o.clear();
        this.m = 0;
        this.f39919p.clear();
        this.f39918n = 0;
        this.q.clear();
    }

    private boolean e() {
        if (this.r == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.g <= this.f39916i) {
            return false;
        }
        b();
        if (!this.r.a()) {
            return false;
        }
        this.g = jCurrentTimeMillis;
        c();
        return true;
    }

    @Override // com.smartdigimkt.x4.d
    public void a(f fVar) {
        if (fVar != null) {
            this.f39916i = fVar.d();
            this.f39915h = fVar.c();
            this.j = fVar.a();
            this.v = fVar.toString();
        }
    }

    @Override // com.smartdigimkt.x4.b
    public void c() {
        super.c();
        d();
    }

    @Override // com.smartdigimkt.x4.d
    public void a(a aVar) {
        this.r = aVar;
    }

    @Override // com.smartdigimkt.x4.d
    public boolean a(SensorEvent sensorEvent) {
        float[] fArr;
        if (this.r != null && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
            try {
                float f = this.s;
                if (f == 0.0f) {
                    this.s = -fArr[0];
                    this.t = -fArr[1];
                    this.f39920u = -fArr[2];
                    return false;
                }
                float f2 = (-fArr[0]) - f;
                float f3 = (-fArr[1]) - this.t;
                float f4 = (-fArr[2]) - this.f39920u;
                b(sensorEvent);
                if (this.k == 0) {
                    this.k = a(f2, f3, f4);
                } else if (System.currentTimeMillis() - this.k > this.j) {
                    d();
                } else {
                    if (this.f39917l > 0 && this.o.size() > 0) {
                        if (this.f39917l >= this.o.size()) {
                            d();
                            return e();
                        }
                        double dDoubleValue = this.o.get(this.f39917l).doubleValue();
                        if (((double) f2) * dDoubleValue > 0.0d && Math.abs(f2) > Math.abs(dDoubleValue)) {
                            this.f39917l++;
                        }
                    }
                    if (this.m > 0 && this.f39919p.size() > 0) {
                        if (this.m >= this.f39919p.size()) {
                            d();
                            return e();
                        }
                        double dDoubleValue2 = this.f39919p.get(this.m).doubleValue();
                        if (((double) f3) * dDoubleValue2 > 0.0d && Math.abs(f3) > Math.abs(dDoubleValue2)) {
                            this.m++;
                        }
                    }
                    if (this.f39918n > 0 && this.q.size() > 0) {
                        if (this.f39918n >= this.q.size()) {
                            d();
                            return e();
                        }
                        double dDoubleValue3 = this.q.get(this.f39918n).doubleValue();
                        if (((double) f4) * dDoubleValue3 > 0.0d && Math.abs(f4) > Math.abs(dDoubleValue3)) {
                            this.f39918n++;
                        }
                    }
                    a(f2, f3, f4);
                }
            } catch (Throwable th) {
                if (!this.f39921w) {
                    com.smartdigimkt.i7.d.a("ShakeHandler", "Throwable:" + th.getMessage() + ",params:" + this.v, com.smartdigimkt.m6.b.p().q());
                    this.f39921w = true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    private long a(float f, float f2, float f3) {
        long jCurrentTimeMillis;
        double dA = a(0);
        if (this.f39917l != 0 || Math.abs(f) < dA) {
            jCurrentTimeMillis = 0;
        } else {
            a(0, f);
            this.f39917l = 1;
            if (this.k == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = 0;
            }
        }
        if (this.m == 0 && Math.abs(f2) >= dA) {
            a(1, f2);
            this.m = 1;
            if (this.k == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (this.f39918n == 0 && Math.abs(f3) >= dA) {
            a(2, f3);
            this.f39918n = 1;
            if (this.k == 0) {
                return System.currentTimeMillis();
            }
        }
        return jCurrentTimeMillis;
    }

    private void a(int i2, float f) {
        List<Double> list;
        if (i2 == 1) {
            list = this.f39919p;
        } else if (i2 != 2) {
            list = this.o;
        } else {
            list = this.q;
        }
        list.clear();
        for (int i3 = 0; i3 < this.f39915h.size() - 1; i3++) {
            double dA = a(i3);
            if (f < 0.0f) {
                list.add(Double.valueOf((-1.0d) * dA));
                list.add(Double.valueOf(dA * 1.0d));
            } else {
                list.add(Double.valueOf(1.0d * dA));
                list.add(Double.valueOf(dA * (-1.0d)));
            }
        }
        double dA2 = a(this.f39915h.size() - 1);
        if (f < 0.0f) {
            list.add(Double.valueOf(dA2 * (-1.0d)));
        } else {
            list.add(Double.valueOf(dA2 * 1.0d));
        }
    }

    private double a(int i2) {
        List<Double> list = this.f39915h;
        if (list == null || list.size() <= i2) {
            return Double.MAX_VALUE;
        }
        return this.f39915h.get(i2).doubleValue();
    }
}
