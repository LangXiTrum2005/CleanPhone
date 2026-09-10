package com.bytedance.sdk.component.adexpress.LD;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NXR {
    private int CSn;
    private int DY;
    private int HD;
    private int IeN;
    private JSONObject Ivz;
    private long JVA;
    private int JXs;
    private JSONObject KPU;
    private JXs LD;
    private JSONObject Lxb;
    private String NXR;
    private String OY;
    private boolean QAg;
    private Map<String, String> STP;
    private int Sfi;
    private boolean VVE;
    private QAg ZU;
    private double aH;
    private int brP;
    private String eK;
    private String ebl;
    private JSONObject foI;
    private final boolean hg;
    private boolean id;
    private String kqm;
    private String lc;
    private String lk;
    private int nBu;
    private boolean nE;
    private int sLN;
    private int tD;
    private String xan;

    public static class Lxb {
        private int CSn;
        private int DY;
        private int HD;
        private int IeN;
        private JSONObject Ivz;
        private long JVA;
        private int JXs;
        private JSONObject KPU;
        private JXs LD;
        private JSONObject Lxb;
        private String NXR;
        private String OY;
        private boolean QAg;
        private Map<String, String> STP;
        private int Sfi;
        private boolean VVE;
        private QAg ZU;
        private double aH;
        private int brP;
        private String eK;
        private String ebl;
        private JSONObject foI;
        private String kqm;
        private String lc;
        private String lk;
        private int nBu;
        private boolean nE;
        private int sLN;
        private int tD;
        private String xan;
        private boolean id = true;
        private boolean hg = true;

        public Lxb JXs(String str) {
            this.kqm = str;
            return this;
        }

        public Lxb LD(String str) {
            this.lc = str;
            return this;
        }

        public Lxb Lxb(JXs jXs) {
            this.LD = jXs;
            return this;
        }

        public Lxb ZU(String str) {
            this.OY = str;
            return this;
        }

        public Lxb lc(String str) {
            this.xan = str;
            return this;
        }

        public Lxb lk(String str) {
            this.ebl = str;
            return this;
        }

        public Lxb JXs(int i) {
            this.CSn = i;
            return this;
        }

        public Lxb LD(boolean z) {
            this.QAg = z;
            return this;
        }

        public Lxb Lxb(boolean z) {
            this.id = z;
            return this;
        }

        public Lxb ZU(int i) {
            this.IeN = i;
            return this;
        }

        public Lxb lk(boolean z) {
            this.hg = z;
            return this;
        }

        public Lxb JXs(boolean z) {
            this.nE = z;
            return this;
        }

        public Lxb LD(int i) {
            this.nBu = i;
            return this;
        }

        public Lxb Lxb(String str) {
            this.lk = str;
            return this;
        }

        public Lxb ZU(boolean z) {
            this.VVE = z;
            return this;
        }

        public Lxb lk(int i) {
            this.sLN = i;
            return this;
        }

        public Lxb Lxb(QAg qAg) {
            this.ZU = qAg;
            return this;
        }

        public Lxb Lxb(int i) {
            this.JXs = i;
            return this;
        }

        public Lxb Lxb(long j) {
            this.JVA = j;
            return this;
        }

        public Lxb Lxb(Map<String, String> map) {
            this.STP = map;
            return this;
        }

        public NXR Lxb() {
            return new NXR(this);
        }

        public Lxb Lxb(double d) {
            this.aH = d;
            return this;
        }
    }

    public NXR(Lxb lxb) {
        this.Lxb = lxb.Lxb;
        this.LD = lxb.LD;
        this.lk = lxb.lk;
        this.ZU = lxb.ZU;
        this.JXs = lxb.JXs;
        this.lc = lxb.lc;
        this.ebl = lxb.ebl;
        this.OY = lxb.OY;
        this.QAg = lxb.QAg;
        this.nBu = lxb.nBu;
        this.JVA = lxb.JVA;
        this.sLN = lxb.sLN;
        this.NXR = lxb.NXR;
        this.STP = lxb.STP;
        this.IeN = lxb.IeN;
        this.VVE = lxb.VVE;
        this.kqm = lxb.kqm;
        this.brP = lxb.brP;
        this.tD = lxb.tD;
        this.DY = lxb.DY;
        this.Sfi = lxb.Sfi;
        this.HD = lxb.HD;
        this.eK = lxb.eK;
        this.aH = lxb.aH;
        this.CSn = lxb.CSn;
        this.id = lxb.id;
        this.foI = lxb.foI;
        this.KPU = lxb.KPU;
        this.Ivz = lxb.Ivz;
        this.nE = lxb.nE;
        this.xan = lxb.xan;
        this.hg = lxb.hg;
    }

    public boolean CSn() {
        return this.hg;
    }

    public JSONObject DY() {
        return this.Ivz;
    }

    public int HD() {
        return this.HD;
    }

    public int IeN() {
        return this.brP;
    }

    public Map<String, String> JVA() {
        return this.STP;
    }

    public QAg JXs() {
        return this.ZU;
    }

    public double LD() {
        return this.aH;
    }

    public boolean Lxb() {
        return this.id;
    }

    public boolean NXR() {
        return this.VVE;
    }

    public boolean OY() {
        return this.QAg;
    }

    public long QAg() {
        return this.JVA;
    }

    public String STP() {
        return this.kqm;
    }

    public int Sfi() {
        return this.Sfi;
    }

    public int VVE() {
        return this.tD;
    }

    public String ZU() {
        return this.lk;
    }

    public String aH() {
        return this.xan;
    }

    public JSONObject brP() {
        return this.foI;
    }

    public boolean eK() {
        return this.nE;
    }

    public int ebl() {
        return this.CSn;
    }

    public int kqm() {
        return this.DY;
    }

    public int lc() {
        return this.JXs;
    }

    public JSONObject lk() {
        JXs jXs;
        if (this.Lxb == null && (jXs = this.LD) != null) {
            this.Lxb = jXs.Lxb();
        }
        return this.Lxb;
    }

    public int nBu() {
        return this.sLN;
    }

    public int sLN() {
        return this.IeN;
    }

    public JSONObject tD() {
        return this.KPU;
    }
}
