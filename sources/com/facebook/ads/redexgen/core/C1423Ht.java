package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1423Ht extends AbstractRunnableC1787Wc {
    public static byte[] A02;
    public static String[] A03 = {"eWADjtxb1dWvMuQKHnw5jLkRYtYeIVb9", "vJlKnMrqllT8yqHy3c09kMgmhRavVIVM", "Q4u15erxw2VvJfagpGA99x6fik", "", "DcfdvxQ7qaScGwoUH6bgcK", "LZ3ab3PJnMGJQ4QsgAhwpTw2XWco3njm", "Qn1MQsBbREXEZXLMbJl8WtK7V5qupI", "ZrYMyBGTS8dZg7uAD2wVIzoUAJYVhikw"};
    public final /* synthetic */ C5F A00;
    public final /* synthetic */ C4A A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[6].length() == strArr[4].length()) {
                break;
            }
            String[] strArr2 = A03;
            strArr2[3] = "";
            strArr2[2] = "KjbCoXJ8ChyqWCUKbe1FzcklJu";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 33);
            String[] strArr3 = A03;
            if (strArr3[3].length() == strArr3[2].length()) {
                break;
            }
            String[] strArr4 = A03;
            strArr4[3] = "";
            strArr4[2] = "FepnQiYEGf6Y70BjqDmgAXMgjY";
            i5++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A02 = new byte[]{95, 104, 123, 123, 120, 111, 116, 115, 122, 61, 116, 115, 121, 120, 123, 116, 115, 116, 105, 120, 113, 100};
    }

    static {
        A01();
    }

    public C1423Ht(C5F c5f, C4A c4a) {
        this.A00 = c5f;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1787Wc
    public final void A07() {
        if (this.A00.A0b.getState() == EnumC2242fm.A02 && this.A00.A0b.getCurrentPositionInMillis() == A00()) {
            InterfaceC2120dm interfaceC2120dm = this.A00.A0Z;
            String[] strArr = A03;
            if (strArr[5].charAt(23) == strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[3] = "";
            strArr2[2] = "farTWgnk5frdrEZBsMmfrvdmtZ";
            interfaceC2120dm.AGQ(A00(0, 22, 60));
        }
    }
}
