package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class KM {
    public static byte[] A0D;
    public static String[] A0E = {"GeuvjWmU0qMIecUET3rH1sSpSiCCpV8d", "VWuGBdV", "r1UddSi70yifv9lgmWBFhDm81yvqf6sz", "XTFXH6doUzlPXpn0lOcCpEMXSJ", "Gs3RvICYSdgYtTZ", "LUo1PxiU5xdJ1hZxjmijWXp8gfNxa8cO", "PBxwyL5R7nlTE13P8yY94OOBBe", "AYtcaoWRC0gFrEQm0SEPSBapgfKgyhaj"};
    public List<KM> A00;
    public final long A01;
    public final long A02;
    public final KM A03;
    public final KT A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final HashMap<String, Integer> A0A;
    public final HashMap<String, Integer> A0B;
    public final String[] A0C;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0E[1].length() == 19) {
                throw new RuntimeException();
            }
            A0E[1] = "X7T2v9MzXPQN9wm4iApZn5l";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 80);
            i5++;
        }
    }

    public static void A04() {
        A0D = new byte[]{30, 14, 38, 43, 52, 92, 84, 69, 80, 85, 80, 69, 80, 95};
    }

    static {
        A04();
    }

    public KM(String str, String str2, long j, long j2, KT kt, String[] strArr, String str3, String str4, KM km) {
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str4;
        this.A04 = kt;
        this.A0C = strArr;
        this.A09 = str2 != null;
        this.A02 = j;
        this.A01 = j2;
        this.A06 = (String) AbstractC10843y.A01(str3);
        this.A03 = km;
        this.A0B = new HashMap<>();
        this.A0A = new HashMap<>();
    }

    public static SpannableStringBuilder A00(String str, Map<String, C10743o> map) {
        if (!map.containsKey(str)) {
            C10743o c10743o = new C10743o();
            c10743o.A0G(new SpannableStringBuilder());
            map.put(str, c10743o);
        }
        C10743o regionOutput = map.get(str);
        return (SpannableStringBuilder) AbstractC10843y.A01(regionOutput.A0I());
    }

    public static KM A01(String str) {
        return new KM(null, KO.A04(str), -9223372036854775807L, -9223372036854775807L, null, null, A03(0, 0, 119), null, null);
    }

    public static KM A02(String str, long j, long j2, KT kt, String[] strArr, String str2, String str3, KM km) {
        return new KM(str, null, j, j2, kt, strArr, str2, str3, km);
    }

    private void A05(long j, String str, List<Pair<String, String>> regionImageList) {
        if (!A03(0, 0, 119).equals(this.A06)) {
            str = this.A06;
        }
        if (A0B(j)) {
            String strA03 = A03(2, 3, 18);
            String resolvedRegionId = this.A07;
            if (strA03.equals(resolvedRegionId)) {
                String resolvedRegionId2 = this.A05;
                if (resolvedRegionId2 != null) {
                    regionImageList.add(new Pair<>(str, this.A05));
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < A0C(); i2++) {
            A0D(i2).A05(j, str, regionImageList);
        }
    }

    private void A06(long j, Map<String, KT> map, Map<String, KN> map2, String str, Map<String, C10743o> map3) {
        int end;
        String str2 = str;
        if (A0B(j)) {
            if (!A03(0, 0, 119).equals(this.A06)) {
                str2 = this.A06;
            }
            for (Map.Entry<String, Integer> entry : this.A0A.entrySet()) {
                String key = entry.getKey();
                if (this.A0B.containsKey(key)) {
                    end = this.A0B.get(key).intValue();
                } else {
                    end = 0;
                }
                int iIntValue = entry.getValue().intValue();
                if (end != iIntValue) {
                    A09(map, (C10743o) AbstractC10843y.A01(map3.get(key)), end, iIntValue, ((KN) AbstractC10843y.A01(map2.get(str2))).A08);
                }
            }
            for (int i2 = 0; i2 < i; i2++) {
                A0D(i2).A06(j, map, map2, str2, map3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    private void A07(long j, boolean z2, String str, Map<String, C10743o> map) {
        boolean z3;
        String str2 = str;
        this.A0B.clear();
        this.A0A.clear();
        if (A03(5, 8, 97).equals(this.A07)) {
            return;
        }
        if (!A03(0, 0, 119).equals(this.A06)) {
            str2 = this.A06;
        }
        if (this.A09 && z2) {
            SpannableStringBuilder spannableStringBuilderA00 = A00(str2, map);
            String resolvedRegionId = this.A08;
            spannableStringBuilderA00.append((CharSequence) AbstractC10843y.A01(resolvedRegionId));
            return;
        }
        String strA03 = A03(0, 2, 44);
        String resolvedRegionId2 = this.A07;
        if (strA03.equals(resolvedRegionId2) && z2) {
            SpannableStringBuilder spannableStringBuilderA01 = A00(str2, map);
            String[] strArr = A0E;
            if (strArr[0].charAt(26) == strArr[2].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[5] = "DvePMvlINfUrHf8oCshP3y2zgWJgm1y9";
            strArr2[7] = "g33vhajkRJhloC0qEKLO4Zm1g9rQEkrd";
            spannableStringBuilderA01.append('\n');
            return;
        }
        if (!A0B(j)) {
            return;
        }
        for (Map.Entry<String, C10743o> entry : map.entrySet()) {
            this.A0B.put(entry.getKey(), Integer.valueOf(((CharSequence) AbstractC10843y.A01(entry.getValue().A0I())).length()));
        }
        String strA04 = A03(13, 1, 127);
        String resolvedRegionId3 = this.A07;
        boolean zEquals = strA04.equals(resolvedRegionId3);
        for (int i2 = 0; i2 < A0C(); i2++) {
            KM kmA0D = A0D(i2);
            String[] strArr3 = A0E;
            String str3 = strArr3[3];
            String resolvedRegionId4 = strArr3[6];
            if (str3.length() != resolvedRegionId4.length()) {
                if (!z2) {
                    if (zEquals) {
                        z3 = false;
                    }
                }
                kmA0D.A07(j, z3, str2, map);
            } else {
                A0E[1] = "BxcnzhC5XqKLAs";
                if (!z2) {
                    if (zEquals) {
                        z3 = false;
                    }
                }
                kmA0D.A07(j, z3, str2, map);
            }
            z3 = true;
            kmA0D.A07(j, z3, str2, map);
        }
        if (zEquals) {
            KO.A07(A00(str2, map));
        }
        for (Map.Entry<String, C10743o> entry2 : map.entrySet()) {
            HashMap<String, Integer> map2 = this.A0A;
            String key = entry2.getKey();
            C10743o value = entry2.getValue();
            String[] strArr4 = A0E;
            if (strArr4[0].charAt(26) != strArr4[2].charAt(26)) {
                String[] strArr5 = A0E;
                strArr5[3] = "NvsWEQBQe6VAGnQhJA54b4pVjA";
                strArr5[6] = "RDTsakCOEzYFACc9hnpkZM81VS";
                map2.put(key, Integer.valueOf(((CharSequence) AbstractC10843y.A01(value.A0I())).length()));
            } else {
                String[] strArr6 = A0E;
                strArr6[5] = "CHxe0vxZr8lPRHvaCG5LBeS6gh9aVBuv";
                strArr6[7] = "HeV50lBh9JGf3GNHX7ZdMbjxgTQZONIp";
                map2.put(key, Integer.valueOf(((CharSequence) AbstractC10843y.A01(value.A0I())).length()));
            }
        }
    }

    public static void A08(SpannableStringBuilder spannableStringBuilder) {
        for (KF kf : (KF[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), KF.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(kf), spannableStringBuilder.getSpanEnd(kf), (CharSequence) A03(0, 0, 119));
        }
        for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
            if (spannableStringBuilder.charAt(i2) == ' ') {
                int i3 = i2 + 1;
                while (i3 < spannableStringBuilder.length()) {
                    char cCharAt = spannableStringBuilder.charAt(i3);
                    String[] strArr = A0E;
                    String str = strArr[5];
                    String str2 = strArr[7];
                    int i4 = str.charAt(24);
                    if (i4 == str2.charAt(24)) {
                        String[] strArr2 = A0E;
                        strArr2[0] = "TbkeKkbvotKRDkL3aJkR6CKPV2CRZepO";
                        strArr2[2] = "HOyzJt7YVHsiDEtesdPQS8q1On7uoMtF";
                        if (cCharAt != ' ') {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    throw new RuntimeException();
                }
                int j = i2 + 1;
                String[] strArr3 = A0E;
                String str3 = strArr3[0];
                String str4 = strArr3[2];
                int i5 = str3.charAt(26);
                if (i5 == str4.charAt(26)) {
                    throw new RuntimeException();
                }
                A0E[1] = "2IIAODStabB9";
                int i6 = i3 - j;
                if (i6 > 0) {
                    spannableStringBuilder.delete(i2, i2 + i6);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == '\n' && spannableStringBuilder.charAt(i7 + 1) == ' ') {
                int i8 = i7 + 1;
                spannableStringBuilder.delete(i8, i7 + 2);
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i9 = 0; i9 < spannableStringBuilder.length() - 1; i9++) {
            if (spannableStringBuilder.charAt(i9) == ' ' && spannableStringBuilder.charAt(i9 + 1) == '\n') {
                spannableStringBuilder.delete(i9, i9 + 1);
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private void A09(Map<String, KT> map, C10743o c10743o, int i2, int i3, int i4) {
        KT ktA02 = KO.A02(this.A04, this.A0C, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c10743o.A0I();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c10743o.A0G(spannableStringBuilder);
        }
        if (ktA02 != null) {
            KO.A06(spannableStringBuilder, i2, i3, ktA02, this.A03, map, i4);
            if (A03(13, 1, 127).equals(this.A07)) {
                if (ktA02.A04() != Float.MAX_VALUE) {
                    c10743o.A05((ktA02.A04() * (-90.0f)) / 100.0f);
                }
                if (ktA02.A0C() != null) {
                    c10743o.A0F(ktA02.A0C());
                }
                if (ktA02.A0B() != null) {
                    c10743o.A0E(ktA02.A0B());
                }
            }
        }
    }

    private void A0A(TreeSet<Long> treeSet, boolean z2) {
        boolean zEquals = A03(13, 1, 127).equals(this.A07);
        boolean isPNode = A03(2, 3, 18).equals(this.A07);
        if (z2 || zEquals || (isPNode && this.A05 != null)) {
            if (this.A02 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.A02));
            }
            if (this.A01 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.A01));
            }
        }
        if (this.A00 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.A00.size(); i2++) {
            KM km = this.A00.get(i2);
            boolean isPNode2 = z2 || zEquals;
            km.A0A(treeSet, isPNode2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    private final boolean A0B(long j) {
        if (this.A02 != -9223372036854775807L || this.A01 != -9223372036854775807L) {
            if (this.A02 > j) {
                return this.A02 == -9223372036854775807L ? false : false;
            }
            long j2 = this.A01;
            if (A0E[1].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[5] = "RgXDLQ3a08cIBfoVnl1r1eLIg5MUrfoW";
            strArr[7] = "Ter36j0QNwpTucwH0VATqUwzgkfFz8sj";
            if (j2 != -9223372036854775807L) {
                if ((this.A02 == -9223372036854775807L || j >= this.A01) && (this.A02 > j || j >= this.A01)) {
                }
            }
        }
        return true;
    }

    public final int A0C() {
        if (this.A00 == null) {
            return 0;
        }
        List<KM> list = this.A00;
        if (A0E[4].length() == 7) {
            throw new RuntimeException();
        }
        A0E[1] = "iiL";
        return list.size();
    }

    public final KM A0D(int i2) {
        if (this.A00 != null) {
            return this.A00.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<C2810pT> A0E(long j, Map<String, KT> map, Map<String, KN> map2, Map<String, String> imageMap) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        A05(j, this.A06, arrayList);
        TreeMap treeMap = new TreeMap();
        A07(j, false, this.A06, treeMap);
        A06(j, map, map2, this.A06, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = imageMap.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                KN kn = (KN) AbstractC10843y.A01(map2.get(pair.first));
                arrayList2.add(new C10743o().A0D(bitmapDecodeByteArray).A04(kn.A02).A0A(0).A07(kn.A01, 0).A09(kn.A05).A06(kn.A04).A03(kn.A00).A0B(kn.A08).A0H());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            KN kn2 = (KN) AbstractC10843y.A01(map2.get(entry.getKey()));
            C10743o c10743o = (C10743o) entry.getValue();
            A08((SpannableStringBuilder) AbstractC10843y.A01(c10743o.A0I()));
            c10743o.A07(kn2.A01, kn2.A06);
            c10743o.A09(kn2.A05);
            c10743o.A04(kn2.A02);
            c10743o.A06(kn2.A04);
            c10743o.A08(kn2.A03, kn2.A07);
            c10743o.A0B(kn2.A08);
            arrayList2.add(c10743o.A0H());
        }
        return arrayList2;
    }

    public final void A0F(KM km) {
        if (this.A00 == null) {
            this.A00 = new ArrayList();
        }
        this.A00.add(km);
    }

    public final long[] A0G() {
        TreeSet<Long> treeSet = new TreeSet<>();
        A0A(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        int i2 = 0;
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        return jArr;
    }

    public final String[] A0H() {
        return this.A0C;
    }
}
