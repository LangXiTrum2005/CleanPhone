package com.bytedance.sdk.component.LD.Lxb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NXR {
    public com.bytedance.sdk.component.lk.Lxb.Lxb LD = new com.bytedance.sdk.component.lk.Lxb.Lxb();
    public JVA Lxb;

    public static class Lxb {
        Object JXs;
        Map<String, List<String>> LD;
        com.bytedance.sdk.component.LD.Lxb.Lxb Lxb;
        String OY;
        String ZU;
        int ebl;
        STP lc;
        ebl lk;

        public Lxb() {
            this.LD = new HashMap();
        }

        public Lxb LD(String str) {
            return Lxb(ebl.lk(str));
        }

        public Lxb Lxb(com.bytedance.sdk.component.LD.Lxb.Lxb lxb) {
            this.Lxb = lxb;
            return this;
        }

        public Lxb LD(String str, String str2) {
            if (!this.LD.containsKey(str)) {
                this.LD.put(str, new ArrayList());
            }
            this.LD.get(str).add(str2);
            return this;
        }

        public Lxb Lxb(String str) {
            this.OY = str;
            return this;
        }

        public Lxb(NXR nxr) {
            this.lk = nxr.LD();
            this.ZU = nxr.lk();
            this.LD = nxr.ZU();
            this.JXs = nxr.Lxb();
            this.lc = nxr.OY();
            this.Lxb = nxr.JXs();
            this.ebl = nxr.ebl();
            this.OY = nxr.lc();
        }

        public Lxb Lxb(int i) {
            this.ebl = i;
            return this;
        }

        public Lxb Lxb(Object obj) {
            this.JXs = obj;
            return this;
        }

        public NXR LD() {
            return new NXR() { // from class: com.bytedance.sdk.component.LD.Lxb.NXR.Lxb.1
                @Override // com.bytedance.sdk.component.LD.Lxb.NXR
                public com.bytedance.sdk.component.LD.Lxb.Lxb JXs() {
                    return Lxb.this.Lxb;
                }

                @Override // com.bytedance.sdk.component.LD.Lxb.NXR
                public ebl LD() {
                    return Lxb.this.lk;
                }

                @Override // com.bytedance.sdk.component.LD.Lxb.NXR
                public Object Lxb() {
                    return Lxb.this.JXs;
                }

                @Override // com.bytedance.sdk.component.LD.Lxb.NXR
                public STP OY() {
                    return Lxb.this.lc;
                }

                @Override // com.bytedance.sdk.component.LD.Lxb.NXR
                public Map ZU() {
                    return Lxb.this.LD;
                }

                @Override // com.bytedance.sdk.component.LD.Lxb.NXR
                public int ebl() {
                    return Lxb.this.ebl;
                }

                @Override // com.bytedance.sdk.component.LD.Lxb.NXR
                public String lc() {
                    return Lxb.this.OY;
                }

                @Override // com.bytedance.sdk.component.LD.Lxb.NXR
                public String lk() {
                    return Lxb.this.ZU;
                }

                public String toString() {
                    return "";
                }
            };
        }

        public Lxb Lxb(ebl eblVar) {
            this.lk = eblVar;
            return this;
        }

        public Lxb Lxb(String str, String str2) {
            return LD(str, str2);
        }

        public Lxb Lxb() {
            return Lxb("GET", (STP) null);
        }

        private Lxb Lxb(String str, STP stp) {
            this.ZU = str;
            this.lc = stp;
            return this;
        }

        public Lxb Lxb(STP stp) {
            return Lxb("POST", stp);
        }
    }

    public abstract com.bytedance.sdk.component.LD.Lxb.Lxb JXs();

    public abstract ebl LD();

    public abstract Object Lxb();

    public void Lxb(JVA jva) {
        this.Lxb = jva;
    }

    public STP OY() {
        return null;
    }

    public Lxb QAg() {
        return new Lxb(this);
    }

    public abstract Map<String, List<String>> ZU();

    public abstract int ebl();

    public abstract String lc();

    public abstract String lk();
}
