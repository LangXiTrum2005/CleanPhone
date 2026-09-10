package com.bytedance.sdk.openadsdk.IeN;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static int JXs = 3;
    public static int LD = 0;
    public static int Lxb = -1;
    public static int ZU = 2;
    public static int lk = 1;
    private int lc = Lxb;
    private long ebl = 0;
    private long OY = 0;
    private final List<lk> QAg = new ArrayList();
    private long nBu = 0;

    public void LD(long j) {
        int i;
        int i2 = this.lc;
        if (i2 == Lxb || i2 == (i = JXs)) {
            return;
        }
        this.lc = i;
        this.OY = j;
    }

    public void Lxb(long j) {
        this.lc = LD;
        this.ebl = j;
    }

    public void ZU(long j) {
        int i = this.lc;
        if (i == Lxb || i != ZU) {
            return;
        }
        this.lc = lk;
        this.QAg.add(new lk(this.nBu, j));
        this.nBu = 0L;
    }

    public void lk(long j) {
        int i;
        int i2 = this.lc;
        if (i2 == Lxb || i2 == (i = ZU) || i2 == JXs) {
            return;
        }
        this.lc = i;
        this.nBu = j;
    }

    public long Lxb(long j, long j2) {
        long j3;
        long j4;
        long jLD;
        long j5 = this.OY;
        if (j5 != 0 && j > j5) {
            return 0L;
        }
        int i = 0;
        for (lk lkVar : this.QAg) {
            if (lkVar.LD() > j) {
                if (j < lkVar.Lxb()) {
                    j4 = i;
                    jLD = lkVar.LD() - lkVar.Lxb();
                } else {
                    j4 = i;
                    jLD = lkVar.LD() - j;
                }
                i = (int) (jLD + j4);
            }
        }
        long j6 = this.ebl;
        if (j6 < j) {
            long j7 = this.nBu;
            if (j7 == 0) {
                j7 = this.OY;
                if (j7 == 0) {
                    j3 = j2 - j;
                }
            } else if (j7 <= j) {
                return 0L;
            }
            return (j7 - j) - ((long) i);
        }
        long j8 = this.nBu;
        if (j8 == 0) {
            j8 = this.OY;
            if (j8 == 0) {
                j3 = j2 - j6;
            }
        } else if (j8 <= j6) {
            return 0L;
        }
        return (j8 - j6) - ((long) i);
        return j3 - ((long) i);
    }

    public int Lxb() {
        return this.lc;
    }
}
