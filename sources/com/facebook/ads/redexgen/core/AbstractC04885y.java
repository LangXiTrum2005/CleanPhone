package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.umeng.analytics.pro.bc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04885y {
    public static byte[] A06;
    public static String[] A07 = {"7", "BOchn05cOqPQPKgaZhD7MWqYHqoCKx7o", "EPTevQXo6AzOyuxFlfcAvx5eJdnVP8", bc.aK, "6fNY9lNhy7nUhuOGP7YDUX6WqdzgNzMN", "SLjIMlZrt8LApw5SyAUFDc4ipDag7tTu", "zXvx6U5xIRhnU3fWG5rnYTWUnq20aSrc", "c4GOdlXhzm3270NA43EFNLoVECdVoF38"};
    public InterfaceC04865w A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] - i3) - 109);
            String[] strArr = A07;
            if (strArr[6].charAt(25) == strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            A07[2] = "awpTB9u15TkHVvPjjOCd09Fy8dol99E";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{76, 75, 30, 75, 70, 74, 62, 81, 70, 76, 75, 80, 35, 70, 75, 70, 80, 69, 66, 65};
    }

    public abstract boolean A0D(C6K c6k);

    public abstract boolean A0E(C6K c6k, C04875x c04875x, C04875x c04875x2);

    public abstract boolean A0F(C6K c6k, C04875x c04875x, C04875x c04875x2);

    public abstract boolean A0G(C6K c6k, C04875x c04875x, C04875x c04875x2);

    public abstract boolean A0H(C6K c6k, C6K c6k2, C04875x c04875x, C04875x c04875x2);

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(C6K c6k);

    public abstract boolean A0L();

    static {
        A03();
    }

    public static int A00(C6K c6k) {
        int i = c6k.A0C & 14;
        if (c6k.A0Z()) {
            return 4;
        }
        int flags = i & 4;
        if (flags == 0) {
            int pos = c6k.A0J();
            int oldPos = c6k.A0G();
            if (pos != -1 && oldPos != -1 && pos != oldPos) {
                return i | 2048;
            }
            return i;
        }
        return i;
    }

    private final C04875x A01() {
        return new C04875x();
    }

    public final long A04() {
        return this.A00;
    }

    public final long A05() {
        return this.A01;
    }

    public final long A06() {
        return this.A02;
    }

    public final long A07() {
        return this.A03;
    }

    public final C04875x A08(C6H c6h, C6K c6k) {
        return A01().A01(c6k);
    }

    public final C04875x A09(C6H c6h, C6K c6k, int i, List<Object> payloads) {
        return A01().A01(c6k);
    }

    public final void A0A() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new NullPointerException(A02(0, 20, 112));
        }
        this.A05.clear();
    }

    public final void A0B(InterfaceC04865w interfaceC04865w) {
        this.A04 = interfaceC04865w;
    }

    public final void A0C(C6K c6k) {
        if (this.A04 != null) {
            this.A04.ACD(c6k);
        }
    }

    public boolean A0M(C6K c6k, List<Object> payloads) {
        return A0D(c6k);
    }
}
