package com.bytedance.adsdk.LD.lk.LD;

/* JADX INFO: loaded from: classes.dex */
public class QAg implements lk {
    private final Lxb LD;
    private final String Lxb;
    private final boolean lk;

    public enum Lxb {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static Lxb Lxb(int i) {
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

    public QAg(String str, Lxb lxb, boolean z) {
        this.Lxb = str;
        this.LD = lxb;
        this.lk = z;
    }

    public Lxb LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public boolean lk() {
        return this.lk;
    }

    public String toString() {
        return "MergePaths{mode=" + this.LD + '}';
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return new com.bytedance.adsdk.LD.Lxb.Lxb.sLN(this);
    }
}
