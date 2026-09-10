package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1561fb {
    public static int A00;
    public static InterfaceC1560fa A01;
    public static boolean A02;
    public static byte[] A03;
    public static String[] A04 = {"rFjUvrP9S9TPoAG2aXCZRkcNasa4PD", "oGNwJkzmQYsHj80tRiDNYnBP6jdEMoDu", "16d6O9XUiXBCuKDYbhty6cbirzPDopL2", "9SfenCXhxCasVXjusCLfSy5HmpCxdy", "X7TZYlPnAxyH336M1I8KnpFLLau8NEfU", "qVYwYeiXcctGZ1iGn55dICrK80K1Vq9W", "LnbG7bpIkutzC1ds9ESplt1i1I50rEgI", "3DWRZkPCYeWt9ndsiRkAXRxSc3bTEcrq"};
    public static final Object A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A04;
            if (strArr[1].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[3] = "bcnXpHcOmcaNIkXEppF8N4xZU3UknD";
            strArr2[0] = "qbxGPhKU8cxHnS98a9uffVm4fWR3bL";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 22);
            i4++;
        }
    }

    public static void A03() {
        A03 = new byte[]{-123, -100, -124, -102, -102, -120, -120, -120, -120, -80, -55, -58, -55, -54, -46, -55, -93, -54, -50, -49, -96, -45, -66, -64, -53, -49, -60, -54, -55, 123, -125, -55, -54, 123, -55, -64, -49, -46, -54, -51, -58, -124};
    }

    static {
        A03();
        A05 = new Object();
        A00 = 0;
        A02 = true;
        A01 = InterfaceC1560fa.A00;
    }

    @Pure
    public static String A01(String str, Throwable th) {
        String strA02 = A02(th);
        if (!TextUtils.isEmpty(strA02)) {
            StringBuilder sbAppend = new StringBuilder().append(str);
            String strA00 = A00(2, 3, 100);
            StringBuilder sbAppend2 = sbAppend.append(strA00);
            String throwableString = A00(1, 1, 124);
            return sbAppend2.append(strA02.replace(throwableString, strA00)).append('\n').toString();
        }
        return str;
    }

    @Pure
    public static String A02(Throwable th) {
        synchronized (A05) {
            try {
                if (th == null) {
                    return null;
                }
                if (A0B(th)) {
                    return A00(9, 33, 69);
                }
                if (!A02) {
                    return th.getMessage();
                }
                return Log.getStackTraceString(th).trim().replace(A00(0, 1, 102), A00(5, 4, 82));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void A04(String str, String str2) {
        synchronized (A05) {
            int i = A00;
        }
    }

    @Pure
    public static void A05(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 3) {
                A01.A67(str, str2);
            }
        }
    }

    @Pure
    public static void A06(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 1) {
                A01.A9j(str, str2);
            }
        }
    }

    @Pure
    public static void A07(String str, String str2) {
        synchronized (A05) {
            if (A00 <= 2) {
                A01.AJr(str, str2);
            }
        }
    }

    @Pure
    public static void A08(String str, String str2, Throwable th) {
        A05(str, A01(str2, th));
    }

    @Pure
    public static void A09(String str, String str2, Throwable th) {
        A06(str, A01(str2, th));
    }

    @Pure
    public static void A0A(String str, String str2, Throwable th) {
        A07(str, A01(str2, th));
    }

    @Pure
    public static boolean A0B(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                if (A04[5].charAt(11) == 't') {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[3] = "i0016QQ1aWiIbjxxT7Xvx8E7x2nUBj";
                strArr[0] = "uhJWVXeXHm0BQcJdJCyTLhCTSOzPFg";
                return true;
            }
            th = th.getCause();
        }
        String[] strArr2 = A04;
        if (strArr2[1].charAt(20) != strArr2[6].charAt(20)) {
            String[] strArr3 = A04;
            strArr3[4] = "0UlKc6a3LvPRBBrE3632rjygAJctXGu0";
            strArr3[2] = "mYrUYjzFwLHmyi6Ykp9gHxVcLg93Epj6";
            return false;
        }
        A04[7] = "nfk23QfWXMhVZ6jJihXjcPAxiYL5fbyh";
        return false;
    }
}
