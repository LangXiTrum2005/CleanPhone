package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes3.dex */
public class bjy {
    private int lnr;
    private com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr mml;
    private ljh mzz;
    private long qdl;
    private String ud;

    public static class qdl {
        private com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl fs;
        private int jpc;
        private int mo;
        private int to;
        private int tvp;
        private int wd;
        private long qdl = 0;
        private long ud = 0;
        private long lnr = 0;
        private long mml = 0;
        private boolean mzz = false;
        private boolean rq = false;

        private void rdp() {
            long j = this.lnr;
            if (j > 0) {
                long j2 = this.qdl;
                if (j2 > j) {
                    long j3 = j2 % j;
                    this.qdl = j3;
                    if (j3 == 0) {
                        this.qdl = j;
                    }
                }
            }
        }

        public com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl exu() {
            return this.fs;
        }

        public boolean fs() {
            return this.mzz;
        }

        public int jpc() {
            return this.jpc;
        }

        public long lnr() {
            return this.ud;
        }

        public long mml() {
            return this.lnr;
        }

        public int mo() {
            return this.wd;
        }

        public int mzz() {
            return this.mo;
        }

        public long qdl() {
            return this.mml;
        }

        public boolean rq() {
            return this.rq;
        }

        public int to() {
            return this.to;
        }

        public int tvp() {
            return this.tvp;
        }

        public long ud() {
            return this.qdl;
        }

        public int wd() {
            long j = this.lnr;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.qdl * 100) / j), 100);
        }

        public void lnr(long j) {
            this.ud = j;
        }

        public void mml(long j) {
            this.lnr = j;
            rdp();
        }

        public void qdl(long j) {
            this.mml = j;
        }

        public void ud(long j) {
            this.qdl = j;
            rdp();
        }

        public void lnr(int i2) {
            this.jpc = i2;
        }

        public void qdl(int i2) {
            this.mo = i2;
        }

        public void mml(int i2) {
            this.to = i2;
        }

        public void qdl(boolean z2) {
            this.mzz = z2;
        }

        public void ud(int i2) {
            this.wd = i2;
        }

        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl qdlVar) {
            this.fs = qdlVar;
        }
    }

    public bjy(long j, String str, int i2, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, ljh ljhVar) {
        this.qdl = j;
        this.ud = str;
        this.lnr = i2;
        this.mml = lnrVar;
        this.mzz = ljhVar;
    }

    public int lnr() {
        return this.lnr;
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr mml() {
        return this.mml;
    }

    public ljh mzz() {
        return this.mzz;
    }

    public long qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.ud;
    }
}
