package com.bytedance.sdk.component.OY;

import android.os.SystemClock;
import com.badlogic.gdx.graphics.GL20;
import com.bytedance.sdk.component.utils.sLN;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
class LD implements Comparable, Runnable {
    private Lxb LD;
    private OY Lxb;
    private Thread ZU = null;
    private long lk;

    public LD(OY oy, Lxb lxb) {
        this.lk = 0L;
        this.Lxb = oy;
        this.LD = lxb;
        this.lk = SystemClock.uptimeMillis();
    }

    private void Lxb(String str, String str2, long j) {
        StringBuilder sbR = DM.r("pool is ", str, "  name is ", str2, "is timeout,cost ");
        sbR.append(j);
        sLN.Lxb("DelegateRunnable", sbR.toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof LD) {
            return this.Lxb.compareTo(((LD) obj).Lxb());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        OY oy;
        return (obj instanceof LD) && (oy = this.Lxb) != null && oy.equals(((LD) obj).Lxb());
    }

    public int hashCode() {
        return this.Lxb.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.ZU = Thread.currentThread();
        OY oy = this.Lxb;
        if (oy != null) {
            oy.run();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.LD != null) {
            ZU.Lxb();
        }
        if (sLN.Lxb()) {
            Lxb lxb = this.LD;
            if (lxb != null) {
                lxb.Lxb();
            }
            OY oy2 = this.Lxb;
            if (oy2 != null) {
                oy2.getName();
            }
            String strLxb = this.LD.Lxb();
            strLxb.getClass();
            byte b = -1;
            switch (strLxb.hashCode()) {
                case GL20.GL_COLOR_WRITEMASK /* 3107 */:
                    if (strLxb.equals(bc.aC)) {
                        b = 0;
                    }
                    break;
                case 3366:
                    if (strLxb.equals("io")) {
                        b = 1;
                    }
                    break;
                case 107332:
                    if (strLxb.equals("log")) {
                        b = 2;
                    }
                    break;
                case 3237136:
                    if (strLxb.equals("init")) {
                        b = 3;
                    }
                    break;
                case 212371911:
                    if (strLxb.equals("computation")) {
                        b = 4;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 3:
                    if (jUptimeMillis2 > 2000) {
                        Lxb lxb2 = this.LD;
                        String strLxb2 = lxb2 != null ? lxb2.Lxb() : "null";
                        OY oy3 = this.Lxb;
                        Lxb(strLxb2, oy3 != null ? oy3.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 1:
                    if (jUptimeMillis2 > 5000) {
                        Lxb lxb3 = this.LD;
                        String strLxb3 = lxb3 != null ? lxb3.Lxb() : "null";
                        OY oy4 = this.Lxb;
                        Lxb(strLxb3, oy4 != null ? oy4.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 2:
                    if (jUptimeMillis2 > 3000) {
                        Lxb lxb4 = this.LD;
                        String strLxb4 = lxb4 != null ? lxb4.Lxb() : "null";
                        OY oy5 = this.Lxb;
                        Lxb(strLxb4, oy5 != null ? oy5.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 4:
                    if (jUptimeMillis2 > 1000) {
                        Lxb lxb5 = this.LD;
                        String strLxb5 = lxb5 != null ? lxb5.Lxb() : "null";
                        OY oy6 = this.Lxb;
                        Lxb(strLxb5, oy6 != null ? oy6.getName() : "null", jUptimeMillis2);
                    }
                    break;
            }
        }
    }

    public OY Lxb() {
        return this.Lxb;
    }
}
