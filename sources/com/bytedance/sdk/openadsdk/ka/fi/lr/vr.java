package com.bytedance.sdk.openadsdk.ka.fi.lr;

import com.bykv.vk.openvk.ri.ri.ri.ik.saneness;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class vr {
    private wjv fi;
    private int ik;
    private com.bykv.vk.openvk.ri.ri.ri.ik.ik ka;
    private String lr;
    private long ri;

    public static class ri {
        private saneness bgr;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        private int f18156co;
        private boolean fi;
        private int jbs;
        private boolean ka;
        private int mj;
        private int qt;
        private int sf;
        private long ri = 0;
        private long lr = 0;
        private long ik = 0;
        private long di = 0;
        private boolean xha = false;
        private boolean aw = false;

        private void slm() {
            long j = this.ik;
            if (j > 0) {
                long j2 = this.ri;
                if (j2 > j) {
                    long j3 = j2 % j;
                    this.ri = j3;
                    if (j3 == 0) {
                        this.ri = j;
                    }
                }
            }
        }

        public saneness aw() {
            return this.bgr;
        }

        public boolean bgr() {
            return this.ka;
        }

        public boolean co() {
            return this.xha;
        }

        public int di() {
            return this.jbs;
        }

        public int fi() {
            return this.mj;
        }

        public long ik() {
            return this.lr;
        }

        public int jbs() {
            return this.sf;
        }

        public long ka() {
            return this.ik;
        }

        public long lr() {
            return this.ri;
        }

        public int mj() {
            return this.qt;
        }

        public int qt() {
            return this.f18156co;
        }

        public long ri() {
            return this.di;
        }

        public boolean sf() {
            return this.aw;
        }

        public boolean vr() {
            return this.fi;
        }

        public int xha() {
            long j = this.ik;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.ri * 100) / j), 100);
        }

        public void ik(long j) {
            this.lr = j;
        }

        public void ka(long j) {
            this.ik = j;
            slm();
        }

        public void lr(long j) {
            this.ri = j;
            slm();
        }

        public void ri(long j) {
            this.di = j;
        }

        public void ik(int i) {
            this.qt = i;
        }

        public void ri(int i) {
            this.mj = i;
        }

        public void ik(boolean z) {
            this.fi = z;
        }

        public void ka(int i) {
            this.f18156co = i;
        }

        public void lr(int i) {
            this.jbs = i;
        }

        public void ri(boolean z) {
            this.xha = z;
        }

        public void lr(boolean z) {
            this.ka = z;
        }

        public void ri(saneness sanenessVar) {
            this.bgr = sanenessVar;
        }
    }

    public vr(long j, String str, int i, com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, wjv wjvVar) {
        this.ri = j;
        this.lr = str;
        this.ik = i;
        this.ka = ikVar;
        this.fi = wjvVar;
    }

    public wjv fi() {
        return this.fi;
    }

    public int ik() {
        return this.ik;
    }

    public com.bykv.vk.openvk.ri.ri.ri.ik.ik ka() {
        return this.ka;
    }

    public String lr() {
        return this.lr;
    }

    public long ri() {
        return this.ri;
    }
}
