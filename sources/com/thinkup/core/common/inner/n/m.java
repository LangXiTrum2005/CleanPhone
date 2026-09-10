package com.thinkup.core.common.inner.n;

import android.hardware.SensorEvent;
import com.thinkup.core.common.n.o0n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends o {
    om nm;
    float nn;
    float o00;
    float o0o;
    long om;
    List<Double> oo;
    public long o0 = 0;
    private long oo0 = 0;
    String o0m = "";
    List<Double> mn = new ArrayList();
    List<Double> n0 = new ArrayList();
    List<Double> no = new ArrayList();
    long on = 0;
    int m0 = 0;
    int mo = 0;
    int mm = 0;
    boolean o0n = false;

    private void n() {
        this.on = 0L;
        this.m0 = 0;
        this.mn.clear();
        this.mo = 0;
        this.n0.clear();
        this.mm = 0;
        this.no.clear();
    }

    private boolean o0() {
        if (this.nm == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.o0 <= this.oo0) {
            return false;
        }
        m();
        if (!this.nm.o()) {
            return false;
        }
        this.o0 = jCurrentTimeMillis;
        o();
        return true;
    }

    @Override // com.thinkup.core.common.inner.n.n
    public final boolean m(SensorEvent sensorEvent) {
        float[] fArr;
        if (this.nm != null && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
            try {
                float f = this.nn;
                if (f == 0.0f) {
                    this.nn = -fArr[0];
                    this.o00 = -fArr[1];
                    this.o0o = -fArr[2];
                    return false;
                }
                float f2 = (-fArr[0]) - f;
                float f3 = (-fArr[1]) - this.o00;
                float f4 = (-fArr[2]) - this.o0o;
                o(sensorEvent);
                if (this.on == 0) {
                    this.on = o(f2, f3, f4);
                } else if (System.currentTimeMillis() - this.on > this.om) {
                    n();
                } else {
                    if (this.m0 > 0 && this.mn.size() > 0) {
                        if (this.m0 >= this.mn.size()) {
                            n();
                            return o0();
                        }
                        double dDoubleValue = this.mn.get(this.m0).doubleValue();
                        if (((double) f2) * dDoubleValue > 0.0d && Math.abs(f2) > Math.abs(dDoubleValue)) {
                            this.m0++;
                        }
                    }
                    if (this.mo > 0 && this.n0.size() > 0) {
                        if (this.mo >= this.n0.size()) {
                            n();
                            return o0();
                        }
                        double dDoubleValue2 = this.n0.get(this.mo).doubleValue();
                        if (((double) f3) * dDoubleValue2 > 0.0d && Math.abs(f3) > Math.abs(dDoubleValue2)) {
                            this.mo++;
                        }
                    }
                    if (this.mm > 0 && this.no.size() > 0) {
                        if (this.mm >= this.no.size()) {
                            n();
                            return o0();
                        }
                        double dDoubleValue3 = this.no.get(this.mm).doubleValue();
                        if (((double) f4) * dDoubleValue3 > 0.0d && Math.abs(f4) > Math.abs(dDoubleValue3)) {
                            this.mm++;
                        }
                    }
                    o(f2, f3, f4);
                }
            } catch (Throwable th) {
                if (!this.o0n) {
                    com.thinkup.core.common.oo0.oo.m("ShakeHandler", "Throwable:" + th.getMessage() + ",params:" + this.o0m, o0n.m().o0m());
                    this.o0n = true;
                }
            }
        }
        return false;
    }

    @Override // com.thinkup.core.common.inner.n.n
    public final void o(o0 o0Var) {
        this.oo0 = o0Var.o0();
        this.oo = o0Var.o;
        this.om = o0Var.m;
        this.o0m = o0Var.toString();
    }

    @Override // com.thinkup.core.common.inner.n.n
    public final void o(om omVar) {
        this.nm = omVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    private long o(float f, float f2, float f3) {
        long jCurrentTimeMillis;
        double dO = o(0);
        if (this.m0 != 0 || Math.abs(f) < dO) {
            jCurrentTimeMillis = 0;
        } else {
            o(0, f);
            this.m0 = 1;
            if (this.on == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = 0;
            }
        }
        if (this.mo == 0 && Math.abs(f2) >= dO) {
            o(1, f2);
            this.mo = 1;
            if (this.on == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (this.mm == 0 && Math.abs(f3) >= dO) {
            o(2, f3);
            this.mm = 1;
            if (this.on == 0) {
                return System.currentTimeMillis();
            }
        }
        return jCurrentTimeMillis;
    }

    private void o(int i2, float f) {
        List<Double> list;
        if (i2 == 1) {
            list = this.n0;
        } else if (i2 != 2) {
            list = this.mn;
        } else {
            list = this.no;
        }
        list.clear();
        for (int i3 = 0; i3 < this.oo.size() - 1; i3++) {
            double dO = o(i3);
            if (f < 0.0f) {
                list.add(Double.valueOf((-1.0d) * dO));
                list.add(Double.valueOf(dO * 1.0d));
            } else {
                list.add(Double.valueOf(1.0d * dO));
                list.add(Double.valueOf(dO * (-1.0d)));
            }
        }
        double dO2 = o(this.oo.size() - 1);
        if (f < 0.0f) {
            list.add(Double.valueOf(dO2 * (-1.0d)));
        } else {
            list.add(Double.valueOf(dO2 * 1.0d));
        }
    }

    private double o(int i2) {
        List<Double> list = this.oo;
        if (list == null || list.size() <= i2) {
            return Double.MAX_VALUE;
        }
        return this.oo.get(i2).doubleValue();
    }

    @Override // com.thinkup.core.common.inner.n.o
    public final void o() {
        super.o();
        n();
    }
}
