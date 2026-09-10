package com.bytedance.sdk.component.lr.ri;

import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.C3460cc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class co {
    private List<String> ik;
    private long ka = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
    public com.bytedance.sdk.component.ik.ri.ri lr = new com.bytedance.sdk.component.ik.ri.ri();
    public sf ri;

    public static class ri {
        aw di;
        Object fi;
        xha ik;
        private List<String> jbs;
        String ka;
        Map<String, List<String>> lr;
        String mj;
        private long qt;
        com.bytedance.sdk.component.lr.ri.ri ri;
        int xha;

        public ri() {
            this.qt = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            this.lr = new HashMap();
        }

        public ri lr(String str) {
            return ri(xha.ik(str));
        }

        public ri ri(com.bytedance.sdk.component.lr.ri.ri riVar) {
            this.ri = riVar;
            return this;
        }

        public ri lr(String str, String str2) {
            if (!this.lr.containsKey(str)) {
                this.lr.put(str, new ArrayList());
            }
            this.lr.get(str).add(str2);
            return this;
        }

        public ri ri(String str) {
            this.mj = str;
            return this;
        }

        public ri(co coVar) {
            this.qt = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            this.ik = coVar.ka();
            this.ka = coVar.fi();
            this.lr = coVar.di();
            this.fi = coVar.ik();
            this.di = coVar.qt();
            this.ri = coVar.xha();
            this.xha = coVar.jbs();
            this.mj = coVar.mj();
            this.jbs = coVar.ri();
            this.qt = coVar.lr();
        }

        public ri ri(int i) {
            this.xha = i;
            return this;
        }

        public ri ri(Object obj) {
            this.fi = obj;
            return this;
        }

        public co lr() {
            return new co() { // from class: com.bytedance.sdk.component.lr.ri.co.ri.1
                @Override // com.bytedance.sdk.component.lr.ri.co
                public Map di() {
                    return ri.this.lr;
                }

                @Override // com.bytedance.sdk.component.lr.ri.co
                public String fi() {
                    return ri.this.ka;
                }

                @Override // com.bytedance.sdk.component.lr.ri.co
                public Object ik() {
                    return ri.this.fi;
                }

                @Override // com.bytedance.sdk.component.lr.ri.co
                public int jbs() {
                    return ri.this.xha;
                }

                @Override // com.bytedance.sdk.component.lr.ri.co
                public xha ka() {
                    return ri.this.ik;
                }

                @Override // com.bytedance.sdk.component.lr.ri.co
                public long lr() {
                    return ri.this.qt;
                }

                @Override // com.bytedance.sdk.component.lr.ri.co
                public String mj() {
                    return ri.this.mj;
                }

                @Override // com.bytedance.sdk.component.lr.ri.co
                public aw qt() {
                    return ri.this.di;
                }

                @Override // com.bytedance.sdk.component.lr.ri.co
                public List<String> ri() {
                    return ri.this.jbs;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.lr.ri.co
                public com.bytedance.sdk.component.lr.ri.ri xha() {
                    return ri.this.ri;
                }
            };
        }

        public ri ri(xha xhaVar) {
            this.ik = xhaVar;
            return this;
        }

        public ri ri(String str, String str2) {
            return lr(str, str2);
        }

        public ri ri() {
            return ri(C3460cc.a, (aw) null);
        }

        private ri ri(String str, aw awVar) {
            this.ka = str;
            this.di = awVar;
            return this;
        }

        public ri ri(aw awVar) {
            return ri(C3460cc.b, awVar);
        }

        public ri ri(List<String> list) {
            this.jbs = list;
            return this;
        }

        public ri ri(long j) {
            this.qt = j;
            return this;
        }
    }

    public abstract Map<String, List<String>> di();

    public abstract String fi();

    public abstract Object ik();

    public abstract int jbs();

    public abstract xha ka();

    public long lr() {
        return this.ka;
    }

    public abstract String mj();

    public aw qt() {
        return null;
    }

    public List<String> ri() {
        return this.ik;
    }

    public ri sf() {
        return new ri(this);
    }

    public abstract com.bytedance.sdk.component.lr.ri.ri xha();

    public void ri(sf sfVar) {
        this.ri = sfVar;
    }
}
