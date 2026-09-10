package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class MotionMetadata implements Serializable {
    private static final long serialVersionUID = 3936848659568026217L;
    private String samplePeriod;
    private boolean enabled = false;
    private int ief = 0;
    private double iep = 0.0d;
    private int sampleLimit = 200;
    private double hpfgb = 10.0d;
    private double hpflb = 15.0d;
    private double hpflmb = 25.0d;
    private double hpfv = 1000.0d;
    private double vdmis = 1.0d;
    private double vma = 0.1d;
    private double awh = 100.0d;
    private double awr = 1.0d;
    private double apr = 3600000.0d;
    private double apm = 3.0d;
    private double aps = -2.0d;
    private double iwh = 100.0d;
    private double iwr = 1.0d;
    private double ipr = 20000.0d;
    private double ipm = 0.0d;
    private double ips = -4.0d;

    public final double a() {
        return this.apm;
    }

    public final double b() {
        return this.apr;
    }

    public final double c() {
        return this.aps;
    }

    public final double d() {
        return this.awh;
    }

    public final double e() {
        return this.awr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MotionMetadata motionMetadata = (MotionMetadata) obj;
            if (this.enabled == motionMetadata.enabled && this.ief == motionMetadata.ief && Double.compare(this.iep, motionMetadata.iep) == 0 && this.sampleLimit == motionMetadata.sampleLimit && Double.compare(this.hpfgb, motionMetadata.hpfgb) == 0 && Double.compare(this.hpflb, motionMetadata.hpflb) == 0 && Double.compare(this.hpflmb, motionMetadata.hpflmb) == 0 && Double.compare(this.hpfv, motionMetadata.hpfv) == 0 && Double.compare(this.vdmis, motionMetadata.vdmis) == 0 && Double.compare(this.vma, motionMetadata.vma) == 0 && Double.compare(this.awh, motionMetadata.awh) == 0 && Double.compare(this.awr, motionMetadata.awr) == 0 && Double.compare(this.apr, motionMetadata.apr) == 0 && Double.compare(this.apm, motionMetadata.apm) == 0 && Double.compare(this.aps, motionMetadata.aps) == 0 && Double.compare(this.iwh, motionMetadata.iwh) == 0 && Double.compare(this.iwr, motionMetadata.iwr) == 0 && Double.compare(this.ipr, motionMetadata.ipr) == 0 && Double.compare(this.ipm, motionMetadata.ipm) == 0 && Double.compare(this.ips, motionMetadata.ips) == 0 && vi.a((Object) this.samplePeriod, (Object) motionMetadata.samplePeriod)) {
                return true;
            }
        }
        return false;
    }

    public final double f() {
        return this.hpfgb;
    }

    public final double g() {
        return this.hpflb;
    }

    public final double h() {
        return this.hpflmb;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.ief), Double.valueOf(this.iep), this.samplePeriod, Integer.valueOf(this.sampleLimit), Double.valueOf(this.hpfgb), Double.valueOf(this.hpflb), Double.valueOf(this.hpflmb), Double.valueOf(this.hpfv), Double.valueOf(this.vdmis), Double.valueOf(this.vma), Double.valueOf(this.awh), Double.valueOf(this.awr), Double.valueOf(this.apr), Double.valueOf(this.apm), Double.valueOf(this.aps), Double.valueOf(this.iwh), Double.valueOf(this.iwr), Double.valueOf(this.ipr), Double.valueOf(this.ipm), Double.valueOf(this.ips)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final double i() {
        return this.hpfv;
    }

    public final int j() {
        return this.ief;
    }

    public final double k() {
        return this.iep;
    }

    public final double l() {
        return this.ipm;
    }

    public final double m() {
        return this.ipr;
    }

    public final double n() {
        return this.ips;
    }

    public final double o() {
        return this.iwh;
    }

    public final double p() {
        return this.iwr;
    }

    public final int q() {
        return this.sampleLimit;
    }

    public final String r() {
        return this.samplePeriod;
    }

    public final double s() {
        return this.vdmis;
    }

    public final double t() {
        return this.vma;
    }

    public final boolean u() {
        return this.enabled;
    }
}
