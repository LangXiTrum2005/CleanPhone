package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.in0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3731in0 extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3491g4 f4521a;
    public final /* synthetic */ P8 b;
    public final /* synthetic */ DS c;
    public final /* synthetic */ WeakReference d;
    public final /* synthetic */ AtomicReference e;
    public final /* synthetic */ String f;
    public final /* synthetic */ C4082mn0 g;

    public C3731in0(C4082mn0 c4082mn0, P8 p8, DS ds, WeakReference weakReference, AtomicReference atomicReference, String str) {
        this.g = c4082mn0;
        this.b = p8;
        this.c = ds;
        this.d = weakReference;
        this.e = atomicReference;
        this.f = str;
        this.f4521a = (C3491g4) p8.f3354a;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        C4082mn0 c4082mn0 = this.g;
        String str = c4082mn0.f4440a;
        byte[] bArr = {-1, 97, -114, 126, 25, com.umeng.analytics.pro.cw.n, -113, -60, -99, 111, -114, 81, 24, 33, -94, -55, -34, 107, -123, 116};
        byte[] bArr2 = {-67, 0, -32, com.umeng.analytics.pro.cw.n, 124, 98, -50, -96};
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
        String strM = c4082mn0.M(this.f4521a);
        P8 p8 = (P8) c4082mn0.L(strM);
        if (p8 == null) {
            p8 = this.b;
        }
        X0 x0 = X0.j;
        c4082mn0.n(x0.j(), (C3491g4) p8.f3354a, (String) p8.b);
        boolean z = C4082mn0.M0().f5021a;
        AbstractC3570h.x();
        x0.k();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        C4082mn0 c4082mn0 = this.g;
        String str = c4082mn0.f4440a;
        byte[] bArr = {26, 118, -127, -106, -48, -86, -39, -67, 120, 120, -127, -71, -47, -101, -12, -74, 43, 114, -117};
        byte[] bArr2 = {88, 23, -17, -8, -75, -40, -104, -39};
        int i = 0;
        int i2 = 0;
        while (i < 19) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        if (C4082mn0.M0().f5021a) {
            this.b.getClass();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        C4082mn0 c4082mn0 = this.g;
        String str = c4082mn0.f4440a;
        Qm0.D(new byte[]{-119, 108, -113, 3, 70, 100, -63, -69, -21, 98, -113, 44, 71, 80, -31, -74, -89, 104, -123, 57, 76, 90, -17, -66, -81, 45}, new byte[]{-53, com.umeng.analytics.pro.cw.k, -31, 109, 35, 22, -128, -33});
        if (loadAdError == null) {
            Qm0.D(new byte[]{61, -71, -115, 66, 36, 112, 45, -110, 58, -91, -119, 94}, new byte[]{72, -41, -26, 44, 75, 7, com.umeng.analytics.pro.cw.k, -9});
        } else {
            loadAdError.getCode();
            loadAdError.getMessage();
        }
        C3491g4 c3491g4 = this.f4521a;
        String strM = c4082mn0.M(c3491g4);
        if (strM != null) {
            c4082mn0.u.remove(strM);
        }
        DS ds = (DS) c4082mn0.i0(strM);
        P8 p8 = (P8) c4082mn0.L(strM);
        if (p8 == null) {
            p8 = this.b;
        }
        c4082mn0.S(c3491g4, strM, 2);
        c3491g4.M(2);
        c4082mn0.e.remove(c3491g4);
        p8.getClass();
        if (!TextUtils.isEmpty(c3491g4.w(1))) {
            WeakReference weakReference = this.d;
            if (weakReference.get() != null && C4082mn0.M0().a(X0.j.k())) {
                c4082mn0.D0(c3491g4);
                Context applicationContext = ((Context) weakReference.get()).getApplicationContext();
                if (loadAdError != null) {
                    loadAdError.getCode();
                }
                c4082mn0.G(applicationContext, p8, strM, ds);
            }
        }
        if (C4082mn0.M0().f5021a) {
            if (ds == null || loadAdError == null) {
                return;
            }
            loadAdError.getCode();
            return;
        }
        if (this.c == null || loadAdError == null) {
            return;
        }
        loadAdError.getCode();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        C4082mn0 c4082mn0 = this.g;
        String str = c4082mn0.f4440a;
        byte[] bArr = {-44, -43, -12, 41, 106, 59, -80, -82, -74, -37, -12, 6, 107, 0, -100, -70, -28, -47, -23, 52, 102, 38, -97};
        byte[] bArr2 = {-106, -76, -102, 71, com.umeng.analytics.pro.cw.m, 73, -15, -54};
        int i = 0;
        int i2 = 0;
        while (i < 23) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C3491g4 c3491g4 = this.f4521a;
        String strM = c4082mn0.M(c3491g4);
        P8 p8 = (P8) c4082mn0.L(strM);
        if (p8 == null) {
            p8 = this.b;
        }
        HashMap map = c4082mn0.e;
        if (map.get(c3491g4) != null && Boolean.FALSE.equals(map.get(c3491g4))) {
            map.remove(c3491g4);
            c4082mn0.F(X0.j.j(), c3491g4, (String) p8.b);
        }
        if (C4082mn0.M0().f5021a) {
            p8.getClass();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        C4082mn0 c4082mn0 = this.g;
        String str = c4082mn0.f4440a;
        byte[] bArr = {60, 75, -79, -18, 18, -112, -107, -68, 94, 69, -79, -63, 19, -82, -69, -71, 26, 79, -69};
        byte[] bArr2 = {126, 42, -33, -128, 119, -30, -44, -40};
        int i = 0;
        int i2 = 0;
        while (i < 19) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        C3491g4 c3491g4 = this.f4521a;
        String strM = c4082mn0.M(c3491g4);
        if (strM != null) {
            c4082mn0.u.remove(strM);
        }
        DS ds = (DS) c4082mn0.i0(strM);
        P8 p8 = (P8) c4082mn0.L(strM);
        P8 p9 = this.b;
        if (p8 == null) {
            p8 = p9;
        }
        AtomicReference atomicReference = this.e;
        if (atomicReference.get() != null && ((WeakReference) atomicReference.get()).get() != null && ((AdView) ((WeakReference) atomicReference.get()).get()).getAdListener() == this) {
            c4082mn0.T((C3491g4) p9.f3354a, this.f, new Pm0((AdView) ((WeakReference) atomicReference.get()).get()));
        }
        Pm0 pm0 = (Pm0) c4082mn0.g0((C3491g4) p8.f3354a, strM);
        pm0.d.measure(0, 0);
        int measuredHeight = pm0.d.getMeasuredHeight();
        int measuredWidth = pm0.d.getMeasuredWidth();
        if (measuredHeight == 0 || measuredWidth == 0) {
            onAdFailedToLoad(null);
            return;
        }
        ((C3491g4) p8.f3354a).K(System.currentTimeMillis());
        ((C3491g4) p8.f3354a).y();
        c4082mn0.S((C3491g4) p8.f3354a, strM, 1);
        c3491g4.M(1);
        System.currentTimeMillis();
        if (C4082mn0.M0().f5021a) {
            c4082mn0.t = 3;
            if (ds != null) {
                ((M10) ds).b(pm0);
            }
            c4082mn0.B(strM);
            c4082mn0.A(strM);
        } else {
            c4082mn0.t = 3;
            DS ds2 = this.c;
            if (ds2 != null) {
                ((M10) ds2).b(pm0);
            }
        }
        if (p8.c() != null) {
            c4082mn0.J0(p8.c(), pm0);
        }
        c4082mn0.I(X0.j.j(), pm0, C4082mn0.I0(p9));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        C4082mn0 c4082mn0 = this.g;
        String str = c4082mn0.f4440a;
        byte[] bArr = {-3, -14, 62, 110, -3, -3, -88, -91, -97, -4, 62, 65, -4, -64, -103, -92, -47, -10, 52};
        byte[] bArr2 = {-65, -109, 80, 0, -104, -113, -23, -63};
        int i = 0;
        int i2 = 0;
        while (i < 19) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        if (C4082mn0.M0().f5021a) {
            this.b.getClass();
        }
    }
}
