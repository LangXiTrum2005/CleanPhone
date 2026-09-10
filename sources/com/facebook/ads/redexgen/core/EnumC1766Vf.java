package com.facebook.ads.redexgen.core;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class EnumC1766Vf {
    public static byte[] A00;
    public static String[] A01 = {"t11qfTcdRX3vtzWg9o3D7yzOQIlsgekI", "6i20agDhmSdy9vSyuA65WoFMQBMnYQqu", "rdyvRl0mnrLy9iBwCAplKJJzDaMabc0M", "SOZt7VgRETJYcVg4", "xbstiP5KKiAzncux", "VTcuBCbEWMb14OGNQVtfuGUmCLIRmz1L", "NW0LuK6Vb9eH6jcO6lyYeFn7KSHSxynw", "5brGPIOfpSxIScBaveghLVMlb1271YeU"};
    public static final /* synthetic */ EnumC1766Vf[] A02;
    public static final EnumC1766Vf A03;
    public static final EnumC1766Vf A04;
    public static final EnumC1766Vf A05;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{88, 89, 90, 93, 73, 80, 72, 98, 107, 107, 2, 3};
    }

    static {
        A02();
        A03 = new EnumC1766Vf(A01(0, 7, 61), 0);
        A05 = new EnumC1766Vf(A01(10, 2, 108), 1);
        A04 = new EnumC1766Vf(A01(7, 3, 12), 2);
        A02 = A03();
    }

    public EnumC1766Vf(String str, int i2) {
        super(str, i2);
    }

    public static VideoAutoplayBehavior A00(@Nullable EnumC1766Vf enumC1766Vf) {
        if (enumC1766Vf == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        switch (enumC1766Vf.ordinal()) {
            case 0:
                VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
                if (A01[1].charAt(31) != 'u') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "tGhoRPzzdwkU9rBMhrkq51QPgJKMKCG7";
                strArr[7] = "oLzw2E9OShYSASB843fXRAiyIcSfpUGD";
                return videoAutoplayBehavior;
            case 1:
                return VideoAutoplayBehavior.ON;
            case 2:
                return VideoAutoplayBehavior.OFF;
            default:
                return VideoAutoplayBehavior.DEFAULT;
        }
    }

    public static /* synthetic */ EnumC1766Vf[] A03() {
        EnumC1766Vf[] enumC1766VfArr = new EnumC1766Vf[3];
        enumC1766VfArr[0] = A03;
        if (A01[5].charAt(31) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "zoiTRupMudK7uDXw";
        strArr[4] = "VFYrxWbIb3tlnjHn";
        enumC1766VfArr[1] = A05;
        enumC1766VfArr[2] = A04;
        return enumC1766VfArr;
    }

    public static EnumC1766Vf valueOf(String str) {
        return (EnumC1766Vf) Enum.valueOf(EnumC1766Vf.class, str);
    }

    public static EnumC1766Vf[] values() {
        return (EnumC1766Vf[]) A02.clone();
    }
}
