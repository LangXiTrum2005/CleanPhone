package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class Un0 extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3491g4 f3844a;
    public final /* synthetic */ UQ b;
    public final /* synthetic */ IS c;
    public final /* synthetic */ WeakReference d;
    public final /* synthetic */ C3293do0 e;

    public Un0(C3293do0 c3293do0, UQ uq, IS is, WeakReference weakReference) {
        this.e = c3293do0;
        this.b = uq;
        this.c = is;
        this.d = weakReference;
        this.f3844a = (C3491g4) uq.f3354a;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        C3293do0 c3293do0 = this.e;
        String str = c3293do0.f4440a;
        byte[] bArr = {-128, -26, -2, -115, -101, -26, -47, -39, -18, -24, -28, -91, -119, -64, -4, -44, -83, -20, -17, -128};
        byte[] bArr2 = {-50, -121, -118, -28, -19, -125, -112, -67};
        int i = 0;
        int i2 = 0;
        while (i < 20) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        String strM = c3293do0.M(this.f3844a);
        UQ uq = (UQ) c3293do0.L(strM);
        if (uq == null) {
            uq = this.b;
        }
        c3293do0.n((Context) this.d.get(), (C3491g4) uq.f3354a, (String) uq.b);
        X0 x0 = X0.j;
        boolean z = x0.s().f5021a;
        AbstractC3570h.x();
        x0.k();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        C3293do0 c3293do0 = this.e;
        String str = c3293do0.f4440a;
        byte[] bArr = {-32, -19, -22, 43, -123, -34, 20, com.umeng.analytics.pro.cw.n, -114, -29, -16, 3, -105, -8, 57, 27, -35, -23, -6, 98};
        byte[] bArr2 = {-82, -116, -98, 66, -13, -69, 85, 116};
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        c3293do0.getClass();
        if (X0.j.s().f5021a) {
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        C3293do0 c3293do0 = this.e;
        String str = c3293do0.f4440a;
        byte[] bArr = {35, 76, 117, -5, 117, -100, 109, 6, 77, 66, 111, -45, 103, -65, 77, 11, 1, 72, 101, -58, 108, -75, 67, 3, 9};
        byte[] bArr2 = {109, 45, 1, -110, 3, -7, 44, 98};
        int i = 0;
        int i2 = 0;
        while (i < 25) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C3491g4 c3491g4 = this.f3844a;
        String strM = c3293do0.M(c3491g4);
        IS is = (IS) c3293do0.i0(strM);
        UQ uq = (UQ) c3293do0.L(strM);
        if (uq == null) {
            uq = this.b;
        }
        c3293do0.S((C3491g4) uq.f3354a, strM, 2);
        c3491g4.M(2);
        boolean zIsEmpty = TextUtils.isEmpty(((C3491g4) uq.f3354a).w(1));
        IS is2 = this.c;
        if (!zIsEmpty) {
            WeakReference weakReference = this.d;
            if (weakReference.get() != null) {
                X0 x0 = X0.j;
                if (x0.s().a(x0.k())) {
                    c3293do0.D0((C3491g4) uq.f3354a);
                    Context applicationContext = ((Context) weakReference.get()).getApplicationContext();
                    loadAdError.getCode();
                    c3293do0.G(applicationContext, uq, strM, is2);
                }
            }
        }
        c3293do0.e.remove((C3491g4) uq.f3354a);
        if (X0.j.s().f5021a) {
            if (is != null) {
                ((QL) is).a(loadAdError != null ? new C3205co0(loadAdError.getCode(), null, null) : null);
            }
        } else if (is2 != null) {
            ((QL) is2).a(loadAdError != null ? new C3205co0(loadAdError.getCode(), null, null) : null);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        C3293do0 c3293do0 = this.e;
        String str = c3293do0.f4440a;
        byte[] bArr = {-31, 123, 46, com.umeng.analytics.pro.cw.m, -109, -44, 66, -35, -113, 117, 52, 39, -127, -8, 110, -55, -35, 127, 41, 21, -116, -34, 109};
        byte[] bArr2 = {-81, 26, 90, 102, -27, -79, 3, -71};
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        String strM = c3293do0.M(this.f3844a);
        UQ uq = (UQ) c3293do0.L(strM);
        if (uq == null) {
            uq = this.b;
        }
        if (c3293do0.e.get((C3491g4) uq.f3354a) != null && Boolean.FALSE.equals(c3293do0.e.get((C3491g4) uq.f3354a))) {
            c3293do0.e.remove((C3491g4) uq.f3354a);
            c3293do0.F((Context) this.d.get(), (C3491g4) uq.f3354a, (String) uq.b);
        }
        c3293do0.getClass();
        boolean z = X0.j.s().f5021a;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        C3293do0 c3293do0 = this.e;
        String str = c3293do0.f4440a;
        byte[] bArr = {55, -4, 101, -57, -43, 52, 50, 6, 89, -14, 127, -17, -57, 30, 3, 7, 23, -8, 117};
        byte[] bArr2 = {121, -99, 17, -82, -93, 81, 115, 98};
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        c3293do0.getClass();
        if (X0.j.s().f5021a) {
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }
}
