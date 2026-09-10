package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0988Qn {
    public final long A00;
    public final long A01;
    public static String[] A02 = {"PufZ4ylBlA3RPHYvTeQpt7O5rWsysLC5", "uBomz", "AhKAvtMqKcAhuTiaBnL5pzcUIeviR0nD", "K820xMelcAodJC32CFvuDslOFspd5if4", "SAvlMgjGyZOVZv0PieUUnsZJNBrQDe32", "z5S3LMYzaO6OUdfToeBbHYcbQ2jmQl9i", "8x0AoDBxmZDbBJbkSNWwtuJknwAx8OzD", "V1Di4PoIBhKorJUCxo3hiS10d2zKY2hA"};
    public static final C0988Qn A05 = new C0988Qn(0, 0);
    public static final C0988Qn A03 = new C0988Qn(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C0988Qn A07 = new C0988Qn(Long.MAX_VALUE, 0);
    public static final C0988Qn A06 = new C0988Qn(0, Long.MAX_VALUE);
    public static final C0988Qn A04 = A05;

    public C0988Qn(long j, long j2) {
        AbstractC1517es.A07(j >= 0);
        AbstractC1517es.A07(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    public final long A00(long j, long j2, long j3) {
        boolean z;
        if (this.A01 == 0 && this.A00 == 0) {
            return j;
        }
        long j4 = this.A01;
        if (A02[2].charAt(15) == 'D') {
            throw new RuntimeException();
        }
        A02[4] = "UE6jdRJ80BOwBhUfioJbqBT9b3wVJ06i";
        long jA0V = AbstractC1600gE.A0V(j, j4, Long.MIN_VALUE);
        long jA0S = AbstractC1600gE.A0S(j, this.A00, Long.MAX_VALUE);
        boolean z2 = true;
        if (jA0V > j2) {
            z = false;
        } else {
            if (A02[2].charAt(15) == 'D') {
                throw new RuntimeException();
            }
            A02[4] = "5ciWLWlmosLe9jbzirD3AZ5pLe2wUVi0";
            if (j2 <= jA0S) {
                z = true;
            } else {
                z = false;
            }
        }
        if (jA0V > j3 || j3 > jA0S) {
            z2 = false;
        }
        if (z && z2) {
            long jAbs = Math.abs(j2 - j);
            long maxPositionUs = Math.abs(j3 - j);
            if (jAbs <= maxPositionUs) {
                return j2;
            }
            return j3;
        }
        if (z) {
            return j2;
        }
        if (z2) {
            return j3;
        }
        return jA0V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            if (A02[1].length() != 5) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[6] = "mgS1scm3uc7ZKJJvMvNscOCXzDaXQGqK";
            strArr[7] = "8XsegTURSWskIJBtHTP2oNLRbxuYK6aP";
            if (cls == obj.getClass()) {
                C0988Qn c0988Qn = (C0988Qn) obj;
                return this.A01 == c0988Qn.A01 && this.A00 == c0988Qn.A00;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
