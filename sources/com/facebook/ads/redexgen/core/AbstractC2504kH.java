package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2504kH extends AbstractC1552Mt {
    public static String A04;
    public static String A05;
    public static String A06;
    public static byte[] A07;
    public static String[] A08 = {"yKsrGZvRhlHO", "9EputwQvm", "xy4ysuU", "7AjoeEFyRFUmAcGguWz5skIE39kXLiT8", "yw7hkrjnug4F5v8JlqxYlpspwNYrqeOP", "YdvcKbM", "Mv5W7ZjuxpjDlIvwBIaHg3eS9AlP", "wZHnfIG7rJSoOb"};
    public int A00;
    public final boolean A01;
    public final N0 A02;
    public final boolean A03;

    public static String A0D(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        byte[] bArr = {60, 19, 22, 28, 20, 95, 19, 16, 24, 24, 26, 27, 24, 23, 29, 11, 22, 16, 29, 87, 16, 23, 13, 28, 23, 13, 87, 24, 26, 13, 16, 22, 23, 87, 47, 48, 60, 46, 17, 18, 16, 24, 44, 7, 26, 30, 22, 35, 42, 46, 57, 42, 16, 59, 38, 34, 42, 34, 56, 57, 46, 34, 32, 40, 41, 47, 57, 57, 63, 41, 41, 65, 90, 93, 66, 81, 70, 71, 85, 88, 107, 88, 93, 90, 95, 20, 18, 4, 19, 62, 21, 19, 0, 2, 10, 4, 19, 62, 8, 18, 62, 15, 14, 21, 62, 15, 20, 13, 13, 7, 1, 23, 0, 17, 30, 27, 17, 25, 111, 121, 108, 123, 112, 71, 121, 118, 124, 71, 122, 106, 119, 111, 107, 125};
        if (A08[1].length() != 9) {
            throw new RuntimeException();
        }
        A08[7] = "E0qxoPtldo8saq";
        A07 = bArr;
    }

    public abstract EnumC1549Mq A0H();

    static {
        A0E();
        A04 = A0D(64, 7, 106);
        A05 = A0D(85, 24, 81);
        A06 = A0D(118, 16, 40);
    }

    public AbstractC2504kH(C2300gi c2300gi, VA va, String str, N0 n0, boolean z2) {
        this(c2300gi, va, str, n0, z2, false);
    }

    public AbstractC2504kH(C2300gi c2300gi, VA va, String str, N0 n0, boolean z2, boolean z3) {
        super(c2300gi, va, str);
        this.A00 = 0;
        this.A02 = n0;
        this.A03 = z2;
        this.A01 = z3;
        if (this.A02 != null) {
            this.A02.A07(new InterfaceC1551Ms() { // from class: com.facebook.ads.redexgen.X.kI
                @Override // com.facebook.ads.redexgen.core.InterfaceC1551Ms
                public final void AFa() {
                    this.A00.A0I();
                }
            });
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1552Mt
    public final EnumC1549Mq A0G(String str) {
        if (this.A02 != null) {
            this.A02.A08(super.A03);
        }
        if (C1979bV.A04(super.A01)) {
            return EnumC1549Mq.A06;
        }
        if (A0L(str)) {
            return EnumC1549Mq.A06;
        }
        return A0H();
    }

    public final /* synthetic */ void A0I() {
        this.A00++;
        if (A0L(null)) {
            InterfaceC1550Mr interfaceC1550Mr = super.A00;
            if (A08[1].length() != 9) {
                throw new RuntimeException();
            }
            A08[0] = "ZLZB3DtfqcSTIr4ga6zBSlI";
            if (interfaceC1550Mr != null) {
                super.A00.ACk();
            }
        }
    }

    public final void A0J(Map<String, String> extraData, EnumC1549Mq enumC1549Mq) {
        if (!TextUtils.isEmpty(super.A03)) {
            if (this instanceof AnonymousClass87) {
                super.A02.AC8(super.A03, extraData);
            } else {
                super.A02.ABM(super.A03, extraData);
            }
            boolean zA02 = EnumC1549Mq.A02(enumC1549Mq);
            boolean z2 = this.A02 != null;
            boolean isError = C1750Up.A2U(super.A01);
            if (isError) {
                Map<String, String> navigationDataMap = new HashMap<>();
                boolean isError2 = !zA02;
                navigationDataMap.put(A04, Boolean.toString(isError2));
                navigationDataMap.put(A05, Boolean.toString(z2));
                String str = A06;
                boolean isError3 = this.A01;
                navigationDataMap.put(str, Boolean.toString(isError3));
                super.A02.ABn(super.A03, navigationDataMap);
            }
            if (this.A02 != null) {
                this.A02.A06(enumC1549Mq);
                if (zA02) {
                    this.A02.A05();
                }
            } else {
                HashMap map = new HashMap();
                map.put(A0D(47, 10, 127), Long.toString(-1L));
                map.put(A0D(38, 9, 67), Long.toString(-1L));
                map.put(A0D(57, 7, 125), EnumC1549Mq.A05.name());
                super.A02.AC9(super.A03, map);
            }
        }
        XI.A04(super.A01, A0D(0, 12, 79));
    }

    public final boolean A0K(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0D(71, 14, 4));
            boolean redirectedToApp = TextUtils.isEmpty(queryParameter);
            if (redirectedToApp) {
                return false;
            }
            Intent intent = new Intent(A0D(12, 26, 73), XB.A00(queryParameter));
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1024);
            }
            return C1804Wu.A0D(super.A01, intent);
        } catch (C1802Ws unused) {
            return false;
        }
    }

    public final boolean A0L(String str) {
        return (str == null || !str.equals(A0D(109, 9, 66))) && this.A00 != 0 && this.A00 >= C1750Up.A0I(super.A01);
    }
}
