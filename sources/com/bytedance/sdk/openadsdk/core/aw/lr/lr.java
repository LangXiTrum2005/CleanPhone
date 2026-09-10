package com.bytedance.sdk.openadsdk.core.aw.lr;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ik implements Comparable<lr> {
    private final float ri;

    public static class ri {
        private ik.EnumC0229ik ik = ik.EnumC0229ik.TRACKING_URL;
        private boolean ka = false;
        private final float lr;
        private final String ri;

        public ri(String str, float f) {
            this.ri = str;
            this.lr = f;
        }

        public lr ri() {
            return new lr(this.lr, this.ri, this.ik, Boolean.valueOf(this.ka));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.aw.lr.ik
    public void l_() {
        super.l_();
    }

    public boolean ri(float f) {
        return this.ri <= f && !ka();
    }

    public String toString() {
        return super.toString();
    }

    private lr(float f, String str, ik.EnumC0229ik enumC0229ik, Boolean bool) {
        super(str, enumC0229ik, bool);
        this.ri = f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(lr lrVar) {
        if (lrVar == null) {
            return 1;
        }
        float f = this.ri;
        float f2 = lrVar.ri;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }
}
