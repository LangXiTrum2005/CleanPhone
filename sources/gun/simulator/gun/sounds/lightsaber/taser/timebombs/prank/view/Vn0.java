package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class Vn0 implements NativeAd.OnNativeAdLoadedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3491g4 f3894a;
    public final /* synthetic */ UQ b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ UQ d;
    public final /* synthetic */ IS e;
    public final /* synthetic */ C3293do0 f;

    public Vn0(C3293do0 c3293do0, UQ uq, WeakReference weakReference, UQ uq2, IS is) {
        this.f = c3293do0;
        this.b = uq;
        this.c = weakReference;
        this.d = uq2;
        this.e = is;
        this.f3894a = (C3491g4) uq.f3354a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        C3293do0 c3293do0 = this.f;
        C3491g4 c3491g4 = this.f3894a;
        String strM = c3293do0.M(c3491g4);
        IS is = (IS) c3293do0.i0(strM);
        UQ uq = (UQ) c3293do0.L(strM);
        UQ uq2 = this.b;
        if (uq == null) {
            uq = uq2;
        }
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        ((C3491g4) uq.f3354a).K(System.currentTimeMillis());
        ((C3491g4) uq.f3354a).y();
        c3293do0.S((C3491g4) uq.f3354a, strM, 1);
        c3491g4.M(1);
        Kn0 kn0 = new Kn0(nativeAd, ((C3491g4) uq.f3354a).w(1));
        c3293do0.T((C3491g4) uq.f3354a, strM, kn0);
        byte[] bArr = {-9, 37, 126, -70, 10, 19, 39, 53, -103, 43, 100, -110, 24, 58, 9, 48, -35, 33, 110};
        byte[] bArr2 = {-71, 68, 10, -45, 124, 118, 102, 81};
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
        WeakReference weakReference = this.c;
        C3908ko0 c3908ko0 = new C3908ko0((Context) weakReference.get());
        C4258on0 c4258on0 = new C4258on0((Context) weakReference.get());
        kn0.g = c3908ko0;
        kn0.h = c4258on0;
        C4312pT.n.j(uq2.c());
        c3293do0.u = 4;
        boolean z = X0.j.s().f5021a;
        UQ uq3 = this.d;
        if (!z) {
            IS is2 = this.e;
            if (is2 != null) {
                ((QL) is2).b(kn0);
                ViewGroup viewGroupC = uq3.c();
                c3293do0.getClass();
                C3293do0.H0(c3908ko0, kn0, c4258on0, is2, viewGroupC);
                c3293do0.G0(kn0, c3908ko0, uq3.c());
            }
        } else if (is != null) {
            ((QL) is).b(kn0);
            ViewGroup viewGroupC2 = uq3.c();
            c3293do0.getClass();
            C3293do0.H0(c3908ko0, kn0, c4258on0, is, viewGroupC2);
            c3293do0.G0(kn0, c3908ko0, uq3.c());
        }
        c3293do0.B(strM);
        c3293do0.A(strM);
        c3293do0.P(uq2.c());
    }
}
