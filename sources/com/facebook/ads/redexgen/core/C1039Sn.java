package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1039Sn implements Y7 {
    public static byte[] A0L;
    public static String[] A0M = {"pb9X3OyufmyXvgc8WKBWZga2t8YbYnyf", "rrdtHidwk0PP75P3x830D0V01r", "viVgOx7rVF3vX10Qe8bwE6gdrraYcAzD", "YxyJrvDYxHiC1At5UN9VMftw2xQKKpIT", "tcDYYQLfbFSZtYly8cpZ4l6WP5IIC5v1", "acE8PR3Kne1Ips8FDhDWQgvo1yPj9BzG", "1D01uzC8hYFBBjxY8OQFuGB9mu8QMs9H", "IBSZBk6s2w2n3JMrInYyUP9C9MZI0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public ZM A0C;
    public InterfaceC1086Uo A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public final String A0K;
    public final C1576fq A0J = new C1576fq(1024);
    public final C1575fp A0I = new C1575fp(this.A0J.A0l());
    public long A0B = C.TIME_UNSET;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0L = new byte[]{29, 9, 24, 21, 19, 83, 17, 12, 72, 29, 81, cw.n, 29, 8, 17};
    }

    static {
        A04();
    }

    public C1039Sn(String str) {
        this.A0K = str;
    }

    private int A00(C1575fp c1575fp) throws Q6 {
        int iA01 = c1575fp.A01();
        C1073Tx config = AbstractC1074Ty.A02(c1575fp, true);
        this.A0E = config.A02;
        int bitsLeft = config.A01;
        this.A05 = bitsLeft;
        int bitsLeft2 = config.A00;
        this.A02 = bitsLeft2;
        int bitsLeft3 = c1575fp.A01();
        return iA01 - bitsLeft3;
    }

    private int A01(C1575fp c1575fp) throws Q6 {
        int tmp;
        int i = 0;
        int muxSlotLengthBytes = this.A03;
        if (muxSlotLengthBytes == 0) {
            do {
                tmp = c1575fp.A04(8);
                i += tmp;
            } while (tmp == 255);
            return i;
        }
        throw Q6.A01(null, null);
    }

    public static long A02(C1575fp c1575fp) {
        int bytesForValue = c1575fp.A04(2);
        return c1575fp.A04((bytesForValue + 1) * 8);
    }

    private void A05(int i) {
        this.A0J.A0d(i);
        this.A0I.A0D(this.A0J.A0l());
    }

    @RequiresNonNull({"output"})
    private void A06(C1575fp c1575fp) throws Q6 {
        boolean useSameStreamMux = c1575fp.A0H();
        if (!useSameStreamMux) {
            this.A0H = true;
            A08(c1575fp);
        } else {
            boolean useSameStreamMux2 = this.A0H;
            if (!useSameStreamMux2) {
                return;
            }
        }
        int i = this.A00;
        String[] strArr = A0M;
        if (strArr[3].charAt(30) == strArr[6].charAt(30)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[5] = "Myrb2wUoxijJYHG1poYlGgCQYESPLyC4";
        strArr2[0] = "kOA4pHuNfmKtUyat7cWctgEI33ARqpgB";
        if (i == 0) {
            int i2 = this.A04;
            String[] strArr3 = A0M;
            if (strArr3[3].charAt(30) == strArr3[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0M;
            strArr4[4] = "iC215KrpdFmm8tcBZOFdhEBYx3jjauXy";
            strArr4[2] = "Wqz9kz08BFiaPTOScyq5NUkMgm6DZ52Z";
            if (i2 == 0) {
                A09(c1575fp, A01(c1575fp));
                boolean useSameStreamMux3 = this.A0G;
                if (useSameStreamMux3) {
                    int i3 = (int) this.A09;
                    String[] strArr5 = A0M;
                    String str = strArr5[4];
                    String str2 = strArr5[2];
                    int muxSlotLengthBytes = str.charAt(9);
                    if (muxSlotLengthBytes != str2.charAt(9)) {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0M;
                    strArr6[3] = "qXaWMzHQofNh5WvBaFr5s7WoNuyVCzM5";
                    strArr6[6] = "hZ3tEIVgFYXfrIf0ztiXHgMdNoDEopDt";
                    c1575fp.A09(i3);
                    return;
                }
                return;
            }
            throw Q6.A01(null, null);
        }
        throw Q6.A01(null, null);
    }

    private void A07(C1575fp c1575fp) {
        this.A03 = c1575fp.A04(3);
        switch (this.A03) {
            case 0:
                c1575fp.A09(8);
                return;
            case 1:
                String[] strArr = A0M;
                if (strArr[3].charAt(30) == strArr[6].charAt(30)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0M;
                strArr2[5] = "8w9pN15jvfneg15cKps8ugTyWkaTUsic";
                strArr2[0] = "HhiCzBuzVcSSlVRt45WxTgMfsO6LsfAl";
                c1575fp.A09(9);
                return;
            case 2:
            default:
                throw new IllegalStateException();
            case 3:
            case 4:
            case 5:
                c1575fp.A09(6);
                return;
            case 6:
            case 7:
                c1575fp.A09(1);
                return;
        }
    }

    @RequiresNonNull({"output"})
    private void A08(C1575fp c1575fp) throws Q6 {
        int iA04;
        boolean zA0H;
        int iA05 = c1575fp.A04(1);
        if (iA05 == 1) {
            iA04 = c1575fp.A04(1);
        } else {
            iA04 = 0;
        }
        this.A00 = iA04;
        if (this.A00 == 0) {
            if (iA05 == 1) {
                A02(c1575fp);
            }
            if (c1575fp.A0H()) {
                this.A04 = c1575fp.A04(6);
                int audioMuxVersion = c1575fp.A04(4);
                int iA06 = c1575fp.A04(3);
                if (audioMuxVersion == 0 && iA06 == 0) {
                    if (iA05 == 0) {
                        int iA03 = c1575fp.A03();
                        int audioMuxVersion2 = A00(c1575fp);
                        c1575fp.A08(iA03);
                        byte[] bArr = new byte[(audioMuxVersion2 + 7) / 8];
                        c1575fp.A0F(bArr, 0, audioMuxVersion2);
                        ZM zmA14 = new P5().A0y(this.A0F).A11(A03(0, 15, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE)).A0w(this.A0E).A0b(this.A02).A0m(this.A05).A12(Collections.singletonList(bArr)).A10(this.A0K).A14();
                        if (!zmA14.equals(this.A0C)) {
                            this.A0C = zmA14;
                            this.A0A = 1024000000 / ((long) zmA14.A0G);
                            this.A0D.A6U(zmA14);
                        }
                    } else {
                        int audioMuxVersion3 = (int) A02(c1575fp);
                        c1575fp.A09(audioMuxVersion3 - A00(c1575fp));
                    }
                    A07(c1575fp);
                    this.A0G = c1575fp.A0H();
                    this.A09 = 0L;
                    if (this.A0G) {
                        if (iA05 == 1) {
                            long jA02 = A02(c1575fp);
                            String[] strArr = A0M;
                            String str = strArr[7];
                            String str2 = strArr[1];
                            int audioMuxVersion4 = str.length();
                            if (audioMuxVersion4 == str2.length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0M;
                            strArr2[4] = "PlM8mUtmdF47rLcUfLUtvU7HiqgfOCyB";
                            strArr2[2] = "NVGTdtlI3F0y9nLObEXOfJ3Tu6ZbUHxy";
                            this.A09 = jA02;
                        } else {
                            do {
                                zA0H = c1575fp.A0H();
                                this.A09 = (this.A09 << 8) + ((long) c1575fp.A04(8));
                            } while (zA0H);
                        }
                    }
                    boolean crcCheckPresent = c1575fp.A0H();
                    if (crcCheckPresent) {
                        c1575fp.A09(8);
                        return;
                    }
                    return;
                }
                throw Q6.A01(null, null);
            }
            throw Q6.A01(null, null);
        }
        throw Q6.A01(null, null);
    }

    @RequiresNonNull({"output"})
    private void A09(C1575fp c1575fp, int i) {
        int iA03 = c1575fp.A03();
        int bitPosition = iA03 & 7;
        if (bitPosition == 0) {
            int bitPosition2 = iA03 >> 3;
            this.A0J.A0f(bitPosition2);
        } else {
            int bitPosition3 = i * 8;
            c1575fp.A0F(this.A0J.A0l(), 0, bitPosition3);
            this.A0J.A0f(0);
        }
        InterfaceC1086Uo interfaceC1086Uo = this.A0D;
        C1576fq c1576fq = this.A0J;
        String[] strArr = A0M;
        String str = strArr[3];
        String str2 = strArr[6];
        int iCharAt = str.charAt(30);
        int bitPosition4 = str2.charAt(30);
        if (iCharAt == bitPosition4) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[5] = "c6uFBfAk04B7DDGEBNAcZgWvoBeb4xXs";
        strArr2[0] = "cV5LEKZCP68yTQ38uSyh7gkjdpTo7gVC";
        interfaceC1086Uo.AHx(c1576fq, i);
        if (this.A0B != C.TIME_UNSET) {
            this.A0D.AI0(this.A0B, 1, i, 0, null);
            this.A0B += this.A0A;
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A50(C1576fq c1576fq) throws Q6 {
        AbstractC1517es.A02(this.A0D);
        while (c1576fq.A07() > 0) {
            int i = this.A08;
            String[] strArr = A0M;
            if (strArr[7].length() != strArr[1].length()) {
                String[] strArr2 = A0M;
                strArr2[4] = "7DsO79YOAFxbV7XN3IMU63a5XghYZxpQ";
                strArr2[2] = "xQIqmiGPyFYTa8HGqDNBUb95BKWtHAoj";
                switch (i) {
                    case 0:
                        int secondByte = c1576fq.A0I();
                        if (secondByte == 86) {
                            this.A08 = 1;
                        }
                        break;
                    case 1:
                        int iA0I = c1576fq.A0I();
                        if ((iA0I & 224) == 224) {
                            this.A07 = iA0I;
                            this.A08 = 2;
                        } else if (iA0I != 86) {
                            this.A08 = 0;
                        }
                        break;
                    case 2:
                        int bytesToRead = this.A07;
                        this.A06 = ((bytesToRead & (-225)) << 8) | c1576fq.A0I();
                        if (this.A06 > this.A0J.A0l().length) {
                            A05(this.A06);
                        }
                        this.A01 = 0;
                        this.A08 = 3;
                        break;
                    case 3:
                        int iMin = Math.min(c1576fq.A07(), this.A06 - this.A01);
                        byte[] bArr = this.A0I.A00;
                        int bytesToRead2 = this.A01;
                        c1576fq.A0k(bArr, bytesToRead2, iMin);
                        int bytesToRead3 = this.A01;
                        this.A01 = bytesToRead3 + iMin;
                        int i2 = this.A01;
                        int bytesToRead4 = this.A06;
                        if (i2 == bytesToRead4) {
                            this.A0I.A08(0);
                            A06(this.A0I);
                            this.A08 = 0;
                        }
                        break;
                    default:
                        throw new IllegalStateException();
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A0D = ul.AJX(ys.A03(), 1);
        this.A0F = ys.A04();
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFx() {
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFy(long j, int i) {
        if (j != C.TIME_UNSET) {
            this.A0B = j;
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AIB() {
        this.A08 = 0;
        this.A0B = C.TIME_UNSET;
        this.A0H = false;
    }
}
