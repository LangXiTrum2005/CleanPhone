package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A02' uses external variables
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
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class BJ implements InterfaceC2511kO<Map.Entry<?, ?>, Object> {
    public static byte[] A00;
    public static final /* synthetic */ BJ[] A01;
    public static final BJ A02;
    public static final BJ A03;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-61, -67, -47, 4, -17, -6, 3, -13};
    }

    static {
        A02();
        final String strA01 = A01(0, 3, 56);
        final int i2 = 0;
        A02 = new BJ(strA01, i2) { // from class: com.facebook.ads.redexgen.X.2H
            {
                BL bl = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.InterfaceC2511kO
            @CheckForNull
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Object A4B(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        };
        final String strA02 = A01(3, 5, 110);
        final int i3 = 1;
        A03 = new BJ(strA02, i3) { // from class: com.facebook.ads.redexgen.X.2G
            {
                BL bl = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.InterfaceC2511kO
            @CheckForNull
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Object A4B(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
        A01 = A03();
    }

    public BJ(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    public /* synthetic */ BJ(String str, int i2, BL bl) {
        this(str, i2);
    }

    public static /* synthetic */ BJ[] A03() {
        return new BJ[]{A02, A03};
    }

    public static BJ valueOf(String name) {
        return (BJ) Enum.valueOf(BJ.class, name);
    }

    public static BJ[] values() {
        return (BJ[]) A01.clone();
    }
}
