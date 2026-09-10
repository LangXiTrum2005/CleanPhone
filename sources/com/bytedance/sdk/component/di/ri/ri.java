package com.bytedance.sdk.component.di.ri;

/* JADX INFO: loaded from: classes2.dex */
public class ri {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private long f18048co;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri di;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri fi;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri ik;
    private boolean jbs;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri ka;
    private com.bytedance.sdk.component.di.ri.lr.ik lr;
    private fi mj;
    private int qt;
    private com.bytedance.sdk.component.di.ri.ri.fi ri;
    private int sf;
    private com.bytedance.sdk.component.di.ri.ka.lr.ri xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri$ri, reason: collision with other inner class name */
    public static class C0208ri {
        private fi di;
        private com.bytedance.sdk.component.di.ri.ka.lr.ri fi;
        private com.bytedance.sdk.component.di.ri.ka.lr.ri ik;
        private com.bytedance.sdk.component.di.ri.ka.lr.ri ka;
        private com.bytedance.sdk.component.di.ri.ka.lr.ri lr;
        private boolean mj;
        private com.bytedance.sdk.component.di.ri.lr.ik ri;
        private long sf;
        private com.bytedance.sdk.component.di.ri.ri.fi xha;
        private int jbs = 5000;
        private int qt = 10;

        public C0208ri ik(com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
            this.ka = riVar;
            return this;
        }

        public C0208ri lr(com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
            this.ik = riVar;
            return this;
        }

        public C0208ri ri(long j) {
            this.sf = j;
            return this;
        }

        public C0208ri lr(int i) {
            this.qt = i;
            return this;
        }

        public C0208ri ri(com.bytedance.sdk.component.di.ri.ri.fi fiVar) {
            this.xha = fiVar;
            return this;
        }

        public C0208ri ri(fi fiVar) {
            this.di = fiVar;
            return this;
        }

        public C0208ri ri(com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
            this.lr = riVar;
            return this;
        }

        public C0208ri ri(com.bytedance.sdk.component.di.ri.lr.ik ikVar) {
            this.ri = ikVar;
            return this;
        }

        public C0208ri ri(int i) {
            this.jbs = i;
            return this;
        }

        public ri ri() {
            ri riVar = new ri();
            riVar.lr = this.ri;
            riVar.ik = this.lr;
            riVar.ka = this.ik;
            riVar.fi = this.ka;
            riVar.di = this.fi;
            riVar.mj = this.di;
            riVar.ri = this.xha;
            riVar.jbs = this.mj;
            riVar.sf = this.qt;
            riVar.qt = this.jbs;
            riVar.f18048co = this.sf;
            return riVar;
        }
    }

    public int co() {
        return this.sf;
    }

    public com.bytedance.sdk.component.di.ri.ka.lr.ri di() {
        return this.xha;
    }

    public long fi() {
        return this.f18048co;
    }

    public com.bytedance.sdk.component.di.ri.ka.lr.ri jbs() {
        return this.fi;
    }

    public com.bytedance.sdk.component.di.ri.ka.lr.ri mj() {
        return this.ka;
    }

    public com.bytedance.sdk.component.di.ri.lr.ik qt() {
        return this.lr;
    }

    public int sf() {
        return this.qt;
    }

    public com.bytedance.sdk.component.di.ri.ka.lr.ri xha() {
        return this.ik;
    }

    private ri() {
        this.qt = 200;
        this.sf = 10;
    }

    public boolean ik() {
        return this.jbs;
    }

    public fi ka() {
        return this.mj;
    }

    public com.bytedance.sdk.component.di.ri.ka.lr.ri lr() {
        return this.di;
    }

    public com.bytedance.sdk.component.di.ri.ri.fi ri() {
        return this.ri;
    }
}
