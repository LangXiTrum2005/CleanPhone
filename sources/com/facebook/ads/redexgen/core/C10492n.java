package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10492n {
    public static String[] A01 = {"ZtAeFZn0B1qTMkAv4TimNf", "onjqbWPlpraCurTtWuR0R", "izLFZdnLPv7lUm1GFercP1dDHTQqqlbm", "06udDjCQiMTHlo", "ThrPk51efRSGKxf", "UllMG4WENFsjBGTIREywCD", "xUDuL0NOtKss50bSSzha3FmKwjhZHM", "2ZQ9"};
    public final SparseBooleanArray A00;

    public C10492n(SparseBooleanArray sparseBooleanArray) {
        this.A00 = sparseBooleanArray;
    }

    public final int A00() {
        return this.A00.size();
    }

    public final int A01(int i2) {
        AbstractC10843y.A00(i2, 0, A00());
        return this.A00.keyAt(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r4 != r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r4 != r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r5 >= A00()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r4 = A01(r5);
        r3 = r9.A01(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (com.facebook.ads.redexgen.core.C10492n.A01[5].length() == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        r2 = com.facebook.ads.redexgen.core.C10492n.A01;
        r2[4] = "0EnUC3S7s3BqIyD";
        r2[7] = "m0OD";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r4 == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 1
            if (r8 != r9) goto L4
            return r7
        L4:
            boolean r0 = r9 instanceof com.facebook.ads.redexgen.core.C10492n
            r6 = 0
            if (r0 != 0) goto La
            return r6
        La:
            com.facebook.ads.redexgen.X.2n r9 = (com.facebook.ads.redexgen.core.C10492n) r9
            int r3 = com.facebook.ads.redexgen.core.C5C.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C10492n.A01
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L21
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L21:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10492n.A01
            java.lang.String r1 = "V79UaeNQVFwVWh"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "sTKtjiNlOf72YkaUZZtiJ"
            r0 = 1
            r2[r0] = r1
            r0 = 24
            if (r3 >= r0) goto L87
            int r4 = r8.A00()
            int r3 = r9.A00()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C10492n.A01
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L49
            if (r4 == r3) goto L53
        L48:
            return r6
        L49:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10492n.A01
            java.lang.String r1 = "gWINzXnVkNSV1XpcBprNZ7cfktAxvgY6"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto L53
            goto L48
        L53:
            r5 = 0
        L54:
            int r0 = r8.A00()
            if (r5 >= r0) goto L86
            int r4 = r8.A01(r5)
            int r3 = r9.A01(r5)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C10492n.A01
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L80
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10492n.A01
            java.lang.String r1 = "0EnUC3S7s3BqIyD"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "m0OD"
            r0 = 7
            r2[r0] = r1
            if (r4 == r3) goto L7d
            return r6
        L7d:
            int r5 = r5 + 1
            goto L54
        L80:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L86:
            return r7
        L87:
            android.util.SparseBooleanArray r1 = r8.A00
            android.util.SparseBooleanArray r0 = r9.A00
            boolean r0 = r1.equals(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10492n.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (C5C.A02 < 24) {
            int iA00 = A00();
            for (int i2 = 0; i2 < hashCode; i2++) {
                int hashCode = A01(i2);
                iA00 = (iA00 * 31) + hashCode;
                int i3 = A01[0].length();
                if (i3 == 12) {
                    throw new RuntimeException();
                }
                A01[2] = "oTlXYQnTcFkgjJigc1HTEJLN2hql86lz";
            }
            return iA00;
        }
        return this.A00.hashCode();
    }
}
