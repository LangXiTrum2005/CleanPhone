package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1500eb implements Comparable<C1500eb> {
    public static byte[] A06;
    public static String[] A07 = {"phrrKcjbiOYiqnEapBza98r6xOqrRUnP", "FU45nAqwB8duGiRvb6rVMShNxWeKer0n", "nhrV7nHIP9QPbCZZhwAYb4T8SnqkxN4d", "lT7YmJTRnSmY0XRj4nVkbgrSL2ljAvNn", "vuCHOYiPPP0EzjKoDmHwar3fLeN8l9Lv", "THELI2ZMiczzSQlZK933cJr2CfESrpRE", "dd35IuunKaEh56BlpI1NLh9NPVjWeKx4", "shuX4Kv9joYFyha4eKbe7oXMa912CzHa"};

    @MetaExoPlayerCustomization
    public static final String A08;
    public final long A00;
    public final long A01;
    public final long A02;
    public final File A03;
    public final String A04;
    public final boolean A05;

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A07[5].charAt(19) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "0hbqpyARGAcAcxbtchgDmyK61H4gcAcJ";
            strArr[7] = "kh67FUqu4gbq3dc33e6GZhtvZ9jcR3Vd";
            bArrCopyOfRange[i4] = (byte) ((b ^ i3) ^ 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A06 = new byte[]{41, 101, 104, 125, 51, 29, 77, 82, 78, 7, 29, 6, 85, 79, 92, 67, 28, 6, 107, 73, 75, 64, 77, 123, 88, 73, 70, 83};
    }

    static {
        A09();
        A08 = C1500eb.class.getSimpleName();
    }

    public C1500eb(String str, long j, long j2, long j3, File file) {
        this.A04 = str;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = file != null;
        this.A03 = file;
        this.A00 = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A0A, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1500eb c1500eb) {
        if (!this.A04.equals(c1500eb.A04)) {
            return this.A04.compareTo(c1500eb.A04);
        }
        long j = this.A02;
        long j2 = c1500eb.A02;
        String[] strArr = A07;
        if (strArr[2].charAt(1) != strArr[7].charAt(1)) {
            throw new RuntimeException();
        }
        A07[5] = "hgrsxHQvrPjHyowB6kD3yL0eC79mv0lM";
        long j3 = j - j2;
        if (j3 == 0) {
            return 0;
        }
        return j3 < 0 ? -1 : 1;
    }

    public final boolean A0B() {
        return !this.A05;
    }

    public final boolean A0C() {
        return this.A01 == -1;
    }

    @MetaExoPlayerCustomization
    public final String toString() {
        return A08(18, 10, 0) + this.A04 + A08(0, 5, 33) + this.A00 + A08(5, 6, 21) + this.A02 + A08(11, 7, 14) + this.A01 + '}';
    }
}
