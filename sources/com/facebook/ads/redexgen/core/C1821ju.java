package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1821ju implements C8M {
    public static byte[] A04;
    public Context A00;
    public final C8L A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C8J A01 = A00();

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{113, 101, 122, 106, 102, 112, 97, 97, 124, 123, 114, 102, 106, 126, 112, 108};
    }

    public C1821ju(Context context, C8L c8l) {
        this.A00 = context;
        this.A02 = c8l;
    }

    private C8J A00() {
        return C8J.A00(BJ.A00(this.A00).getString(A01(0, 16, 100), null));
    }

    private void A02() {
        this.A02.ABq(new C1822jv(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C8J c8j = new C8J(strArr, num, num2);
        C8J newSettings = this.A01;
        if (c8j.equals(newSettings)) {
            return;
        }
        this.A01 = c8j;
        this.A03.set(true);
        SharedPreferences.Editor editorEdit = BJ.A00(this.A00).edit();
        C8J newSettings2 = this.A01;
        editorEdit.putString(A01(0, 16, 100), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.core.C8M
    public final C8J A7a() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.C8M
    public final boolean AAW() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> setA0Z = C05789m.A0Z(this.A00);
        String identifier = this.A01.A07();
        Iterator<String> it = setA0Z.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.C8M
    public final boolean AJ2() {
        A02();
        return this.A03.getAndSet(false);
    }
}
