package com.bytedance.adsdk.lr.ik.lr;

import com.bytedance.adsdk.lr.ri.ri.ihz;

/* JADX INFO: loaded from: classes2.dex */
public class tan implements ik {
    private final boolean di;
    private final com.bytedance.adsdk.lr.ik.ri.lr fi;
    private final com.bytedance.adsdk.lr.ik.ri.lr ik;
    private final com.bytedance.adsdk.lr.ik.ri.lr ka;
    private final ri lr;
    private final String ri;

    public enum ri {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static ri ri(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public tan(String str, ri riVar, com.bytedance.adsdk.lr.ik.ri.lr lrVar, com.bytedance.adsdk.lr.ik.ri.lr lrVar2, com.bytedance.adsdk.lr.ik.ri.lr lrVar3, boolean z) {
        this.ri = str;
        this.lr = riVar;
        this.ik = lrVar;
        this.ka = lrVar2;
        this.fi = lrVar3;
        this.di = z;
    }

    public boolean di() {
        return this.di;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr fi() {
        return this.fi;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr ik() {
        return this.ka;
    }

    public com.bytedance.adsdk.lr.ik.ri.lr ka() {
        return this.ik;
    }

    public ri lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    public String toString() {
        return "Trim Path: {start: " + this.ik + ", end: " + this.ka + ", offset: " + this.fi + "}";
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new ihz(riVar, this);
    }
}
