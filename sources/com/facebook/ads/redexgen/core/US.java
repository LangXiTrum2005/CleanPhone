package com.facebook.ads.redexgen.core;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.ads.internal.util.common.Preconditions;
import java.util.Arrays;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class US extends AsyncTask<Void, Void, String> {
    public static byte[] A05;
    public C1746Ul A00;
    public final T8 A01;
    public final UO<String> A02;
    public final InterfaceC1737Uc<V7> A03;
    public final V7 A04;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{20, 89, 110, 110, 115, 110, 60, 113, 121, 111, 111, 125, 123, 121, 60, AbstractJsonLexerKt.TC_INVALID, 125, 114, 114, 115, 104, 60, 126, 121, 60, 114, 105, 112, 112, 99, 64, 72, 72, 70, 65, 72, 15, 74, 89, 74, 65, 91, 21, 15, 102, 113, 119, 123, 102, 112, 75, 112, 117, 96, 117, 118, 117, 103, 113};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UO != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Uc != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
    public US(V7 v7, UO<String> uo, InterfaceC1737Uc<V7> interfaceC1737Uc, T8 t8) {
        this.A04 = v7;
        this.A03 = interfaceC1737Uc;
        this.A02 = uo;
        this.A01 = t8;
    }

    private final String A01(Void... voidArr) throws Throwable {
        if (WU.A02(this)) {
            return null;
        }
        String string = null;
        try {
            try {
                string = UUID.randomUUID().toString();
                this.A01.A08().AA3(this.A04.A06().toString());
                if (TextUtils.isEmpty(this.A04.A08())) {
                    return null;
                }
                if (this.A01.A05().AAO()) {
                    String str = A00(29, 15, 35) + this.A04.A06().toString() + A00(0, 1, 56) + this.A04.A09().toString();
                }
                this.A03.AKH(ZD.A07(this.A01, string, this.A04));
            } catch (C1746Ul e2) {
                this.A00 = e2;
                this.A01.A08().ABC(A00(44, 15, 24), AbstractC1712Td.A2N, new C1713Te(e2));
            }
            return string;
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    private final void A03(String str) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                this.A02.A02(str);
            } else {
                this.A02.A01(0, (String) Preconditions.checkNotNull(this.A00.getMessage(), A00(1, 28, 16)));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) throws Throwable {
        if (WU.A02(this)) {
            return null;
        }
        try {
            return A01(voidArr);
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(String str) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            A03(str);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
