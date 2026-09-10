package com.facebook.ads.redexgen.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1507ei {
    public static byte[] A05;
    public static String[] A06 = {"PQN", "rvi0HDqeD27dLltkNV8pWF8D8yhHXAGn", "k9HiReTDqF8d2vgMQ23MBvGNMSBrPp2U", "balVL98UuV9X8b2pxkV4", "9HtgA35QevtFIzQfegYRYUlIVngdc188", "6anyohtDO1dX5oMknEch", "89IE2E79gzgtSzujSRc7HGaB2VtCDhAT", "lgy3ywEUrTDLZ1r0sC1NqKhzSva7sH2G"};
    public PO A00;
    public final int A01;
    public final String A02;
    public final ArrayList<C1506eh> A03;
    public final TreeSet<PJ> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[0].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "WgM";
            strArr2[5] = "GP51nk0soX0B0w7ryf54";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 83);
            i4++;
        }
    }

    public static void A01() {
        A05 = new byte[]{8, 92, 71, 8, 12, 46, 44, 39, 42, 43, 12, 32, 33, 59, 42, 33, 59, 18, 53, 61, 56, 49, 48, 116, 32, 59, 116, 38, 49, 58, 53, 57, 49, 116};
    }

    static {
        A01();
    }

    public C1507ei(int i, String str) {
        this(i, str, PO.A03);
    }

    public C1507ei(int i, String str, PO po) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = po;
        this.A04 = new TreeSet<>();
        this.A03 = new ArrayList<>();
    }

    public final long A02(long j, long j2) {
        boolean z = true;
        AbstractC1517es.A07(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        AbstractC1517es.A07(z);
        PJ pjA04 = A04(j, j2);
        if (pjA04.A0B()) {
            return -Math.min(pjA04.A0C() ? Long.MAX_VALUE : pjA04.A01, j2);
        }
        long j3 = j + j2;
        if (j3 < 0) {
            j3 = Long.MAX_VALUE;
        }
        long jMax = pjA04.A02 + pjA04.A01;
        if (jMax < j3) {
            for (PJ pj : this.A04.tailSet(pjA04, false)) {
                if (pj.A02 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, pj.A02 + pj.A01);
                if (jMax >= j3) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final PO A03() {
        return this.A00;
    }

    public final PJ A04(long j, long j2) {
        PJ pjA02 = PJ.A02(this.A02, j);
        PJ pjFloor = this.A04.floor(pjA02);
        if (pjFloor != null && pjFloor.A02 + pjFloor.A01 > j) {
            return pjFloor;
        }
        PJ lookupSpan = this.A04.ceiling(pjA02);
        if (lookupSpan != null) {
            long jMin = lookupSpan.A02 - j;
            if (j2 != -1) {
                jMin = Math.min(jMin, j2);
            }
            j2 = jMin;
        }
        return PJ.A03(this.A02, j, j2);
    }

    public final PJ A05(PJ pj, long position, boolean z) {
        AbstractC1517es.A08(this.A04.remove(pj));
        File newFile = (File) AbstractC1517es.A01(pj.A03);
        if (z) {
            File file = newFile.getParentFile();
            File file2 = (File) AbstractC1517es.A01(file);
            long j = pj.A02;
            int i = this.A01;
            String[] strArr = A06;
            if (strArr[0].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[4] = "W9qX6oGtgS8AkfLQ5DDfOrEowvCsJPhb";
            strArr2[1] = "equChBJrWYwSbab49up1wsUl0DzBtbw2";
            File directory = PJ.A04(file2, i, j, position);
            if (newFile.renameTo(directory)) {
                newFile = directory;
            } else {
                AbstractC1561fb.A07(A00(4, 13, 28), A00(17, 17, 7) + newFile + A00(0, 4, 123) + directory);
            }
        }
        PJ newCacheSpan = pj.A0D(newFile, position);
        this.A04.add(newCacheSpan);
        return newCacheSpan;
    }

    public final TreeSet<PJ> A06() {
        return this.A04;
    }

    public final void A07(long j) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A01 == j) {
                this.A03.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void A08(PJ pj) {
        this.A04.add(pj);
    }

    public final boolean A09() {
        return this.A04.isEmpty();
    }

    public final boolean A0A() {
        return this.A03.isEmpty();
    }

    public final boolean A0B(long j, long j2) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A00(j, j2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0C(long j, long j2) {
        for (int i = 0; i < i; i++) {
            if (this.A03.get(i).A01(j, j2)) {
                return false;
            }
        }
        this.A03.add(new C1506eh(j, j2));
        return true;
    }

    public final boolean A0D(C1500eb c1500eb) {
        if (this.A04.remove(c1500eb)) {
            if (c1500eb.A03 != null) {
                c1500eb.A03.delete();
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean A0E(C1512en c1512en) {
        PO po = this.A00;
        PO oldMetadata = this.A00;
        this.A00 = oldMetadata.A05(c1512en);
        PO oldMetadata2 = this.A00;
        return !oldMetadata2.equals(po);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1507ei c1507ei = (C1507ei) obj;
        if (this.A01 == c1507ei.A01) {
            boolean zEquals = this.A02.equals(c1507ei.A02);
            String[] strArr = A06;
            if (strArr[4].charAt(23) == strArr[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[4] = "tKTx9qLun5OTKe5ZkLeuR7e0ChTXVRpJ";
            strArr2[1] = "gUXLpi6r9nVu4Ye4HtwjMIzx8hkmmZd8";
            if (zEquals && this.A04.equals(c1507ei.A04) && this.A00.equals(c1507ei.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i = result * 31;
        int result2 = this.A02.hashCode();
        return ((i + result2) * 31) + this.A00.hashCode();
    }
}
