package com.bytedance.adsdk.lr.ik.lr;

/* JADX INFO: loaded from: classes2.dex */
public class jbs implements ik {
    private final boolean ik;
    private final ri lr;
    private final String ri;

    public enum ri {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static ri ri(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i != 4) {
                return i != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public jbs(String str, ri riVar, boolean z) {
        this.ri = str;
        this.lr = riVar;
        this.ik = z;
    }

    public boolean ik() {
        return this.ik;
    }

    public ri lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    public String toString() {
        return "MergePaths{mode=" + this.lr + '}';
    }

    @Override // com.bytedance.adsdk.lr.ik.lr.ik
    public com.bytedance.adsdk.lr.ri.ri.ik ri(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.xha xhaVar, com.bytedance.adsdk.lr.ik.ik.ri riVar) {
        return new com.bytedance.adsdk.lr.ri.ri.co(this);
    }
}
