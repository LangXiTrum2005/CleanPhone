package com.bytedance.sdk.component.adexpress.lr;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aw {
    private int ac;
    private String aw;
    private double ay;
    private Map<String, String> bgr;
    private String bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int f18042co;
    private String di;
    private JSONObject dw;
    private final String dzy;
    private int fi;
    private int fr;
    private String hcw;
    private JSONObject igq;
    private int ihz;
    private String ik;
    private boolean jbs;
    private jbs ka;
    private fi lr;
    private String mj;
    private int nr;
    private int oh;
    private boolean ory;
    private final String pv;
    private int qt;
    private JSONObject ri;
    private long sf;
    private boolean slm;
    private boolean su;
    private int tan;
    private int uq;
    private int vr;
    private String wjv;
    private final boolean xd;
    private String xha;
    private JSONObject zf;

    public static class ri {
        private int ac;
        private String aw;
        private double ay;
        private Map<String, String> bgr;
        private String bu;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        private int f18043co;
        private String di;
        private JSONObject dw;
        private String dzy;
        private int fi;
        private int fr;
        private String hcw;
        private JSONObject igq;
        private int ihz;
        private String ik;
        private boolean jbs;
        private jbs ka;
        private fi lr;
        private String mj;
        private int nr;
        private boolean ory;
        private int pv;
        private int qt;
        private JSONObject ri;
        private long sf;
        private boolean slm;
        private int tan;
        private int uq;
        private int vr;
        private String wjv;
        private String xd;
        private String xha;
        private JSONObject zf;
        private boolean su = true;
        private boolean oh = true;

        public ri di(String str) {
            this.hcw = str;
            return this;
        }

        public ri fi(String str) {
            this.bu = str;
            return this;
        }

        public ri ik(String str) {
            this.xha = str;
            return this;
        }

        public ri ka(String str) {
            this.mj = str;
            return this;
        }

        public ri lr(String str) {
            this.di = str;
            return this;
        }

        public ri mj(String str) {
            this.dzy = str;
            return this;
        }

        public ri ri(fi fiVar) {
            this.lr = fiVar;
            return this;
        }

        public ri xha(String str) {
            this.xd = str;
            return this;
        }

        public ri di(int i) {
            this.pv = i;
            return this;
        }

        public ri fi(int i) {
            this.fr = i;
            return this;
        }

        public ri ik(boolean z) {
            this.oh = z;
            return this;
        }

        public ri ka(int i) {
            this.vr = i;
            return this;
        }

        public ri lr(boolean z) {
            this.jbs = z;
            return this;
        }

        public ri ri(boolean z) {
            this.su = z;
            return this;
        }

        public ri fi(boolean z) {
            this.ory = z;
            return this;
        }

        public ri ik(int i) {
            this.f18043co = i;
            return this;
        }

        public ri ka(boolean z) {
            this.slm = z;
            return this;
        }

        public ri lr(int i) {
            this.qt = i;
            return this;
        }

        public ri ri(String str) {
            this.ik = str;
            return this;
        }

        public ri ri(jbs jbsVar) {
            this.ka = jbsVar;
            return this;
        }

        public ri ri(int i) {
            this.fi = i;
            return this;
        }

        public ri ri(long j) {
            this.sf = j;
            return this;
        }

        public ri ri(Map<String, String> map) {
            this.bgr = map;
            return this;
        }

        public aw ri() {
            return new aw(this);
        }

        public ri ri(double d) {
            this.ay = d;
            return this;
        }
    }

    public aw(ri riVar) {
        this.ri = riVar.ri;
        this.lr = riVar.lr;
        this.ik = riVar.ik;
        this.ka = riVar.ka;
        this.fi = riVar.fi;
        this.di = riVar.di;
        this.xha = riVar.xha;
        this.mj = riVar.mj;
        this.jbs = riVar.jbs;
        this.qt = riVar.qt;
        this.sf = riVar.sf;
        this.f18042co = riVar.f18043co;
        this.aw = riVar.aw;
        this.bgr = riVar.bgr;
        this.vr = riVar.vr;
        this.slm = riVar.slm;
        this.bu = riVar.bu;
        this.nr = riVar.nr;
        this.tan = riVar.tan;
        this.ac = riVar.ac;
        this.ihz = riVar.ihz;
        this.uq = riVar.uq;
        this.wjv = riVar.wjv;
        this.ay = riVar.ay;
        this.fr = riVar.fr;
        this.su = riVar.su;
        this.igq = riVar.igq;
        this.zf = riVar.zf;
        this.dw = riVar.dw;
        this.ory = riVar.ory;
        this.hcw = riVar.hcw;
        this.oh = riVar.pv;
        this.xd = riVar.oh;
        this.dzy = riVar.xd;
        this.pv = riVar.dzy;
    }

    public JSONObject ac() {
        return this.dw;
    }

    public boolean aw() {
        return this.slm;
    }

    public String ay() {
        return this.hcw;
    }

    public String bgr() {
        return this.bu;
    }

    public int bu() {
        return this.ac;
    }

    public int co() {
        return this.vr;
    }

    public int di() {
        return this.fi;
    }

    public jbs fi() {
        return this.ka;
    }

    public int fr() {
        return this.oh;
    }

    public String igq() {
        return this.dzy;
    }

    public int ihz() {
        return this.ihz;
    }

    public JSONObject ik() {
        fi fiVar;
        if (this.ri == null && (fiVar = this.lr) != null) {
            this.ri = fiVar.ri();
        }
        return this.ri;
    }

    public long jbs() {
        return this.sf;
    }

    public String ka() {
        return this.ik;
    }

    public double lr() {
        return this.ay;
    }

    public boolean mj() {
        return this.jbs;
    }

    public JSONObject nr() {
        return this.igq;
    }

    public int qt() {
        return this.f18042co;
    }

    public boolean ri() {
        return this.su;
    }

    public Map<String, String> sf() {
        return this.bgr;
    }

    public int slm() {
        return this.tan;
    }

    public boolean su() {
        return this.xd;
    }

    public JSONObject tan() {
        return this.zf;
    }

    public int uq() {
        return this.uq;
    }

    public int vr() {
        return this.nr;
    }

    public boolean wjv() {
        return this.ory;
    }

    public int xha() {
        return this.fr;
    }

    public String zf() {
        return this.pv;
    }
}
