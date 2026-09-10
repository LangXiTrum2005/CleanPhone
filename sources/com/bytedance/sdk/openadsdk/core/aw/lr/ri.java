package com.bytedance.sdk.openadsdk.core.aw.lr;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends ik implements Comparable<ri> {
    public long ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.lr.ri$ri, reason: collision with other inner class name */
    public static class C0230ri {
        private ik.EnumC0229ik ik = ik.EnumC0229ik.TRACKING_URL;
        private final long lr;
        private final String ri;

        public C0230ri(String str, long j) {
            this.ri = str;
            this.lr = j;
        }

        public ri ri() {
            return new ri(this.lr, this.ri, this.ik, Boolean.FALSE);
        }
    }

    public ri(long j, String str, ik.EnumC0229ik enumC0229ik, Boolean bool) {
        super(str, enumC0229ik, bool);
        this.ri = j;
    }

    public long ri() {
        return this.ri;
    }

    public String toString() {
        return super.toString();
    }

    public static int ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Integer.parseInt(strArrSplit[0]) * 3600000) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Float.parseFloat(strArrSplit[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean ri(long j) {
        return this.ri <= j && !ka();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(ri riVar) {
        if (riVar == null) {
            return 1;
        }
        long j = this.ri;
        long j2 = riVar.ri;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }
}
