package com.bytedance.sdk.openadsdk.bu;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static int fi = 3;
    public static int ik = 1;
    public static int ka = 2;
    public static int lr = 0;
    public static int ri = -1;
    private int di = ri;
    private long xha = 0;
    private long mj = 0;
    private final List<ik> jbs = new ArrayList();
    private long qt = 0;

    public void ik(long j) {
        int i;
        int i2 = this.di;
        if (i2 == ri || i2 == (i = ka) || i2 == fi) {
            return;
        }
        this.di = i;
        this.qt = j;
    }

    public void ka(long j) {
        int i = this.di;
        if (i == ri || i != ka) {
            return;
        }
        this.di = ik;
        this.jbs.add(new ik(this.qt, j));
        this.qt = 0L;
    }

    public void lr(long j) {
        int i;
        int i2 = this.di;
        if (i2 == ri || i2 == (i = fi)) {
            return;
        }
        this.di = i;
        this.mj = j;
    }

    public void ri(long j) {
        this.di = lr;
        this.xha = j;
    }

    public long ri(long j, long j2) {
        long j3;
        long j4;
        long jLr;
        long j5 = this.mj;
        if (j5 != 0 && j > j5) {
            return 0L;
        }
        int i = 0;
        for (ik ikVar : this.jbs) {
            if (ikVar.lr() > j) {
                if (j < ikVar.ri()) {
                    j4 = i;
                    jLr = ikVar.lr() - ikVar.ri();
                } else {
                    j4 = i;
                    jLr = ikVar.lr() - j;
                }
                i = (int) (j4 + jLr);
            }
        }
        long j6 = this.xha;
        if (j6 < j) {
            long j7 = this.qt;
            if (j7 == 0) {
                j7 = this.mj;
                if (j7 == 0) {
                    j3 = j2 - j;
                }
            } else if (j7 <= j) {
                return 0L;
            }
            return (j7 - j) - ((long) i);
        }
        long j8 = this.qt;
        if (j8 == 0) {
            j8 = this.mj;
            if (j8 == 0) {
                j3 = j2 - j6;
            }
        } else if (j8 <= j6) {
            return 0L;
        }
        return (j8 - j6) - ((long) i);
        return j3 - ((long) i);
    }

    public int ri() {
        return this.di;
    }
}
