package com.facebook.ads.redexgen.core;

import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1074Ty {
    public static byte[] A00;
    public static String[] A01 = {"40R9dmzdlp1xe9CmV4GbElnJ7Jv7tAYj", "OG7FLAHT3adxy041AkvLgoiA2", "EDXrQOXvkIJLh33uwjHFwZokxCFidM", "JU4rkXYKVd1oPLfpa6CgHCP6n0wa13dO", "Db0PGEE6tRACXJhio", "fNjquiebWJnXqtia8mj6YPJ7o3Z1o6lX", "9sebmkyYcm2R3kCtbVK", "emVnEDefuEO83oIyPBRCHm"};
    public static final int[] A02;
    public static final int[] A03;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{cw.m, cw.m, 17, -18, 54, 51, 47, 50, 51, 64, -18, 55, 60, 65, 67, 52, 52, 55, 49, 55, 51, 60, 66, -18, 50, 47, 66, 47, -42, -42, -40, -75, -3, -6, -10, -7, -6, 7, -75, 12, 7, 4, 3, -4, -75, -24, -10, 2, 5, 1, -2, 3, -4, -75, -37, 7, -6, 6, 10, -6, 3, -8, cw.l, -75, -34, 3, -7, -6, cw.k, -97, -65, -63, -77, -46, -57, -54, -31, -6, -15, 4, -4, -15, -17, 0, -15, -16, -84, -14, -2, -19, -7, -15, -40, -15, -6, -13, 0, -12, -46, -8, -19, -13, -84, -55, -84, -67, -65, -40, -35, -33, -38, -38, -39, -36, -34, -49, -50, -118, -53, -33, -50, -45, -39, -118, -39, -52, -44, -49, -51, -34, -118, -34, -29, -38, -49, -92, -118, -80, -55, -50, -48, -53, -53, -54, -51, -49, -64, -65, 123, -64, -53, -98, -54, -55, -63, -60, -62, -107, 123, -53, -50, -110, -65, -116, -110, -114, -116};
    }

    static {
        A05();
        A03 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A02 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(C1575fp c1575fp) {
        int iA04 = c1575fp.A04(5);
        if (iA04 == 31) {
            int audioObjectType = c1575fp.A04(6);
            return audioObjectType + 32;
        }
        return iA04;
    }

    public static int A01(C1575fp c1575fp) throws Q6 {
        int iA04 = c1575fp.A04(4);
        if (iA04 == 15) {
            if (c1575fp.A01() >= 24) {
                int frequencyIndex = c1575fp.A04(24);
                return frequencyIndex;
            }
            throw Q6.A01(A04(0, 28, 124), null);
        }
        if (iA04 < 13) {
            int[] iArr = A03;
            String[] strArr = A01;
            String str = strArr[0];
            String str2 = strArr[5];
            int samplingFrequency = str.charAt(30);
            int frequencyIndex2 = str2.charAt(30);
            if (samplingFrequency == frequencyIndex2) {
                throw new RuntimeException();
            }
            A01[3] = "Y6h4oqBTEnUn331Kap4Q6mUYvDwMp0QO";
            int frequencyIndex3 = iArr[iA04];
            return frequencyIndex3;
        }
        throw Q6.A01(A04(28, 41, 67), null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    public static C1073Tx A02(C1575fp c1575fp, boolean z) throws Q6 {
        int iA04;
        int iA00 = A00(c1575fp);
        int iA01 = A01(c1575fp);
        int iA05 = c1575fp.A04(4);
        String str = A04(Input.Keys.NUMPAD_COMMA, 8, 12) + iA00;
        if (iA00 == 5 || iA00 == 29) {
            iA01 = A01(c1575fp);
            String[] strArr = A01;
            String str2 = strArr[0];
            String str3 = strArr[5];
            int sampleRateHz = str2.charAt(30);
            int audioObjectType = str3.charAt(30);
            if (sampleRateHz == audioObjectType) {
                throw new RuntimeException();
            }
            A01[6] = "5RrZIjq90h74D9AgT5p";
            iA00 = A00(c1575fp);
            if (iA00 == 22) {
                iA05 = c1575fp.A04(4);
            }
        }
        if (z) {
            switch (iA00) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    A06(c1575fp, iA00, iA05);
                    int sampleRateHz2 = A01[2].length();
                    if (sampleRateHz2 != 30) {
                        A01[4] = "Nk86Ouc3oVzPa4N1v";
                        switch (iA00) {
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                iA04 = c1575fp.A04(2);
                                if (iA04 != 2 || iA04 == 3) {
                                    throw Q6.A00(A04(137, 22, 9) + iA04);
                                }
                        }
                    } else {
                        A01[7] = "H0XA3c7UwAEvGEJX0RLGQe";
                        switch (iA00) {
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                iA04 = c1575fp.A04(2);
                                if (iA04 != 2) {
                                    break;
                                }
                                throw Q6.A00(A04(137, 22, 9) + iA04);
                        }
                    }
                    break;
                case 5:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                default:
                    throw Q6.A00(A04(106, 31, 24) + iA00);
            }
        }
        int channelCount = A02[iA05];
        if (channelCount != -1) {
            return new C1073Tx(iA01, channelCount, str);
        }
        throw Q6.A01(null, null);
    }

    public static C1073Tx A03(byte[] bArr) throws Q6 {
        return A02(new C1575fp(bArr), false);
    }

    public static void A06(C1575fp c1575fp, int i, int i2) {
        boolean frameLengthFlag = c1575fp.A0H();
        if (frameLengthFlag) {
            AbstractC1561fb.A07(A04(69, 7, 12), A04(76, 30, 58));
        }
        boolean frameLengthFlag2 = c1575fp.A0H();
        if (frameLengthFlag2) {
            c1575fp.A09(14);
        }
        boolean zA0H = c1575fp.A0H();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                c1575fp.A09(3);
            }
            if (zA0H) {
                if (i == 22) {
                    c1575fp.A09(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    c1575fp.A09(3);
                }
                c1575fp.A09(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] A07(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }
}
