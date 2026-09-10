package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1951m5 implements C3W {
    public static byte[] A06;
    public final C3E A00;
    public final C3L A01;
    public final C1828k1 A02;
    public final Handler A03;
    public final String A04;
    public final C3Q A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-104, -85, -92, -102, -94, -101, -75, -101, -82, -86, -88, -105, -87, -75, -95, -101, -81, -25, -20, -14, -3, -29, -16, -16, -19, -16, -3, -31, -19, -30, -29, -3, -23, -29, -9, -6, -5, -7, 6, -24, -21, 6, -16, -21, 6, -14, -20, 0, 21, 22, 20, 33, 7, 20, 20, 17, 20, 33, cw.m, 7, 21, 21, 3, 9, 7, 33, cw.k, 7, 27};
    }

    public abstract void A08();

    public abstract void A09();

    public abstract void A0D(boolean z);

    public AbstractC1951m5(C1828k1 c1828k1, String str, C3R c3r) {
        this.A02 = c1828k1;
        this.A04 = str;
        DynamicLoaderFactory.makeLoader(this.A02).getInitApi().onAdLoadInvoked(this.A02);
        this.A00 = new C1954m8(c1828k1, this);
        this.A01 = new C3L(c1828k1, this);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A05 = c3r.A5I(this.A00, this, this.A01);
    }

    public final C3E A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A04;
    }

    public final void A05() {
        if (this.A01.A01) {
            this.A02.A0F().AH7();
            A06();
        } else {
            this.A02.A0F().AGz();
            this.A01.A02 = true;
            this.A01.A0E(AbstractC05819p.A02.get());
        }
    }

    public final void A06() {
        this.A02.A0F().AHC();
        if (!this.A01.A0F(this.A05.A8F(), this.A05.A5H(this.A04))) {
            A09();
            this.A02.A0F().AH5();
        }
    }

    public final void A07() {
        if (!C05789m.A0t(this.A02)) {
            return;
        }
        ExecutorC0649Cx.A00(new C1952m6(this));
    }

    public final void A0A(int i) {
        this.A01.A0D(this.A02, i);
    }

    public final void A0B(int i, AdErrorType adErrorType, String str) {
        Bundle bundle = new Bundle();
        String strA01 = A01(48, 21, 124);
        if (str != null) {
            bundle.putString(strA01, str);
        } else {
            bundle.putString(strA01, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A01(17, 18, 88), adErrorType.getErrorCode());
        AE7(i, this.A04, bundle);
    }

    public final void A0C(Message message) {
        this.A05.A9Z(message);
    }

    @Override // com.facebook.ads.redexgen.core.C3W
    public final void AE7(int i, String str, Bundle bundle) {
        Message messageObtain = Message.obtain((Handler) null, i);
        messageObtain.getData().putString(A01(35, 13, 97), str);
        if (bundle != null) {
            messageObtain.getData().putBundle(A01(0, 17, 16), bundle);
        }
        Runnable callbackApiRunnable = new C1953m7(this, messageObtain);
        this.A03.post(callbackApiRunnable);
    }
}
