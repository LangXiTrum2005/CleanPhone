package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class EnumC1404Np {
    public static byte[] A01;
    public static final /* synthetic */ EnumC1404Np[] A02;
    public static final EnumC1404Np A03;
    public static final EnumC1404Np A04;
    public static final EnumC1404Np A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-91, -88, -85, -92, -66, -81, -79, -92, -94, -96, -94, -89, -92, 5, 7, 4, 13, 14, 20, 5, 7, -6, -8, -10, -8, -3, -6, 15, -3, -6, 14, 1, -3, 15, 23, 8, 10, -3, -5, -7, -5, 0, -3};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 101);
        A05 = new EnumC1404Np(strA01, 0, strA01);
        String strA02 = A01(13, 14, 98);
        A04 = new EnumC1404Np(strA02, 1, strA02);
        String strA03 = A01(0, 13, 12);
        A03 = new EnumC1404Np(strA03, 2, strA03);
        A02 = A03();
    }

    public EnumC1404Np(String str, int i, String str2) {
        super(str, i);
        this.A00 = str2;
    }

    public static EnumC1404Np A00(String str) {
        for (EnumC1404Np enumC1404Np : values()) {
            if (enumC1404Np.A00.equalsIgnoreCase(str)) {
                return enumC1404Np;
            }
        }
        return A03;
    }

    public static /* synthetic */ EnumC1404Np[] A03() {
        return new EnumC1404Np[]{A05, A04, A03};
    }

    public static EnumC1404Np valueOf(String str) {
        return (EnumC1404Np) Enum.valueOf(EnumC1404Np.class, str);
    }

    public static EnumC1404Np[] values() {
        return (EnumC1404Np[]) A02.clone();
    }
}
