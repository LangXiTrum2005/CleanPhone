package com.bytedance.sdk.openadsdk.jtx;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    public static int lnr = 1;
    public static int mml = 2;
    public static int mzz = 3;
    public static int qdl = -1;
    public static int ud;
    private int mo = qdl;
    private long wd = 0;
    private long jpc = 0;
    private final List<lnr> tvp = new ArrayList();
    private long to = 0;

    public void lnr(long j) {
        int i2;
        int i3 = this.mo;
        if (i3 == qdl || i3 == (i2 = mml) || i3 == mzz) {
            return;
        }
        this.mo = i2;
        this.to = j;
    }

    public void mml(long j) {
        int i2 = this.mo;
        if (i2 == qdl || i2 != mml) {
            return;
        }
        this.mo = lnr;
        this.tvp.add(new lnr(this.to, j));
        this.to = 0L;
    }

    public void qdl(long j) {
        this.mo = ud;
        this.wd = j;
    }

    public void ud(long j) {
        int i2;
        int i3 = this.mo;
        if (i3 == qdl || i3 == (i2 = mzz)) {
            return;
        }
        this.mo = i2;
        this.jpc = j;
    }

    public long qdl(long j, long j2) {
        long j3;
        long j4;
        long jUd;
        long j5 = this.jpc;
        if (j5 != 0 && j > j5) {
            return 0L;
        }
        int i2 = 0;
        for (lnr lnrVar : this.tvp) {
            if (lnrVar.ud() > j) {
                if (j < lnrVar.qdl()) {
                    j4 = i2;
                    jUd = lnrVar.ud() - lnrVar.qdl();
                } else {
                    j4 = i2;
                    jUd = lnrVar.ud() - j;
                }
                i2 = (int) (jUd + j4);
            }
        }
        long j6 = this.wd;
        if (j6 < j) {
            long j7 = this.to;
            if (j7 == 0) {
                j7 = this.jpc;
                if (j7 == 0) {
                    j3 = j2 - j;
                }
            } else if (j7 <= j) {
                return 0L;
            }
            return (j7 - j) - ((long) i2);
        }
        long j8 = this.to;
        if (j8 == 0) {
            j8 = this.jpc;
            if (j8 == 0) {
                j3 = j2 - j6;
            }
        } else if (j8 <= j6) {
            return 0L;
        }
        return (j8 - j6) - ((long) i2);
        return j3 - ((long) i2);
    }

    public int qdl() {
        return this.mo;
    }
}
