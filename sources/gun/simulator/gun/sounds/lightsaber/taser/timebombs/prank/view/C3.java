package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class C3 extends Jn0 implements InterfaceC4909wB {
    public static final C3 k = new C3();

    public static synchronized C3 Z() {
        return k;
    }

    public static LD a0() {
        return ((Om0) X0.j.k()).d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4170nn0
    public final AbstractC4379q9 K(C3491g4 c3491g4, boolean z) {
        return new MD(c3491g4, true, z);
    }

    public final void W(Activity activity, D3 d3, HS hs) {
        C3491g4 c3491g4;
        X0 x0 = X0.j;
        x0.h();
        x0.k();
        WeakReference weakReference = new WeakReference(activity);
        C3044b1 c3044b1 = C3044b1.b;
        if (!Jn0.V(((Om0) c3044b1.k()).b) || weakReference.get() == null || (c3491g4 = (C3491g4) d3.f3354a) == null) {
            if (!Jn0.V(((Om0) c3044b1.k()).b)) {
                byte[] bArr = {108, -117, -26, 112, -106, 30, -32, 1, 5, -92, -10, 53, -83, 3, -43, 0, 87, -109, -13, 121, -87, 62, -127, 11, 74, -111, -78, 88, -123, 25, -62, com.umeng.analytics.pro.cw.k};
                byte[] bArr2 = {37, -27, -110, 21, -28, 109, -95, 101};
                int i = 0;
                int i2 = 0;
                while (i < 32) {
                    if (i2 >= 8) {
                        i2 = 0;
                    }
                    bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                    i++;
                    i2++;
                }
                new String(bArr, StandardCharsets.UTF_8);
            }
            if (hs != null) {
                hs.d(null);
                hs.h(false);
                return;
            }
            return;
        }
        C(activity, c3491g4, (String) d3.b);
        if (AbstractC4170nn0.i) {
            byte[] bArr3 = {-49, 69, 48, -43, -102, 37, 73, -128, -90, 66, 55, -29, -128, 57, 127, -115, -24, 76, 2, -59, -124, 58, 91, -121, -12, 78, 33, -34, -87, 50};
            byte[] bArr4 = {-122, 43, 68, -80, -24, 86, 8, -28};
            int i3 = 0;
            int i4 = 0;
            while (i3 < 30) {
                if (i4 >= 8) {
                    i4 = 0;
                }
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                i3++;
                i4++;
            }
            new String(bArr3, StandardCharsets.UTF_8);
            if (hs != null) {
                hs.d(null);
                hs.h(false);
                return;
            }
            return;
        }
        Sm0 sm0 = (Sm0) q((C3491g4) d3.f3354a);
        if (sm0 == null || !U((C3491g4) d3.f3354a)) {
            byte[] bArr5 = {89, -36, 109, 73, 118, -107, -56, -28, 48, -44, 120, 69, 104, -58, -3, -17, 48, -63, 113, 67, 115, -58, -77, -96, 124, -35, 120, 72, 69, -126, -64, -26, 94, -35, 109, 96, 107, -121, -19, -27, 116};
            byte[] bArr6 = {com.umeng.analytics.pro.cw.n, -78, 25, 44, 4, -26, -119, -128};
            int i5 = 0;
            int i6 = 0;
            while (i5 < 41) {
                if (i6 >= 8) {
                    i6 = 0;
                }
                bArr5[i5] = (byte) (bArr5[i5] ^ bArr6[i6]);
                i5++;
                i6++;
            }
            new String(bArr5, StandardCharsets.UTF_8);
            R(((Activity) weakReference.get()).getApplicationContext(), (C3491g4) d3.f3354a, d3.c, null);
            if (hs != null) {
                hs.d(null);
                hs.h(false);
                return;
            }
            return;
        }
        byte[] bArr7 = {47, -33, 58, 124, 31, 94, -64, -64, 70, -30, 38, 118, 26, com.umeng.analytics.pro.cw.k, -64, -32, 70, -62, 59, 122, com.umeng.analytics.pro.cw.l, 72, -14, -41, 0, -60, 34, 117, 20};
        byte[] bArr8 = {102, -79, 78, 25, 109, 45, -127, -92};
        int i7 = 0;
        int i8 = 0;
        while (i7 < 29) {
            if (i8 >= 8) {
                i8 = 0;
            }
            bArr7[i7] = (byte) (bArr7[i7] ^ bArr8[i8]);
            i7++;
            i8++;
        }
        new String(bArr7, StandardCharsets.UTF_8);
        if (hs != null) {
            hs.e(sm0);
        }
        InterstitialAd interstitialAd = sm0.f3735a;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(d3.f);
        }
        B3 b3 = new B3(this, weakReference, d3, hs, sm0);
        InterstitialAd interstitialAd2 = sm0.f3735a;
        if (interstitialAd2 != null) {
            interstitialAd2.setFullScreenContentCallback(b3);
        }
        Activity activity2 = (Activity) weakReference.get();
        InterstitialAd interstitialAd3 = sm0.f3735a;
        if (interstitialAd3 != null) {
            interstitialAd3.show(activity2);
        }
    }

    public final void X(Context context, U0 u0) {
        if (a0().d == null) {
            a0().getClass();
            if (u0 != null) {
                u0.a(null);
                return;
            }
            return;
        }
        C5070y3 c5070y3 = new C5070y3(u0);
        if (a0().d != null) {
            R(context, a0().d, false, c5070y3);
        }
        a0().getClass();
    }

    public final void Y(Activity activity, D3 d3, HS hs) {
        X0.j.h();
        WeakReference weakReference = new WeakReference(activity);
        int i = d3.e;
        C5158z3 c5158z3 = new C5158z3(this, i, d3, hs);
        if (i == 0) {
            byte[] bArr = {-112, -108, 98, -86, -51, -60, -38, 93, -111, -113, 76, -71, -45, -61, -38, 80, -96, -109, 99, -69, -19, -51, -108, 24, -81, -77, 76, -103, -51, -28, -23, 103, -83, -77, 67, -104};
            byte[] bArr2 = {-29, -4, com.umeng.analytics.pro.cw.k, -35, -124, -86, -82, 56};
            int i2 = 0;
            int i3 = 0;
            while (i2 < 36) {
                if (i3 >= 8) {
                    i3 = 0;
                }
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                i2++;
                i3++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            W((Activity) weakReference.get(), d3, c5158z3);
            return;
        }
        Dialog dialog = d3.g;
        if (i == 1 && dialog != null) {
            Qm0.D(new byte[]{49, -115, -53, 24, -38, -11, -18, -78, 48, -106, -27, 11, -60, -14, -18, -65, 1, -118, -54, 9, -6, -4, -96, -9, com.umeng.analytics.pro.cw.l, -86, -27, 43, -38, -43, -35, -120, 0, -96, -30, 32, -63, -34, -59, -124, 10, -86, -13}, new byte[]{66, -27, -92, 111, -109, -101, -102, -41});
            if (!AbstractC4170nn0.i) {
                long j = ((Om0) C3044b1.b.k()).b;
                long j2 = d3.h;
                if (Jn0.V(j - j2)) {
                    if (U((C3491g4) d3.f3354a)) {
                        dialog.show();
                        C4981x20.u().v(j2, new RunnableC4777uj0(this, d3, weakReference, activity, c5158z3, hs, 1));
                        return;
                    }
                }
            }
            Qm0.D(new byte[]{-65, 125, -3, 101, 92, 110, 26, -105, -66, 102, -45, 118, 66, 105, 26, -102, -113, 122, -4, 116, 124, 103, 84, -46, -19, 124, -31, 83, 113, 73, 0, -122, -87, 103, -28, 115, 121, 77, 61, -65, -83, 97, -15, 122, 53, 111, 28, -46, -91, 102, -63, 122, 122, 119, 7, -100, -85, 83, -25, 126, 121, 83, com.umeng.analytics.pro.cw.k, -128, -87, 112, -4, 83, 113}, new byte[]{-52, 21, -110, 18, 21, 0, 110, -14});
            hs.d(null);
            hs.h(false);
            return;
        }
        if (i != 2 || dialog == null) {
            byte[] bArr3 = {-81, 48, -121, -50, -117, 36, -90, -123, -82, 43, -87, -35, -107, 35, -90, -120, -97, 55, -122, -33, -85, 45, -24, -64, -112, 55, -119, -35, -85, 36, -75, -92, -75, 57, -124, -42, -91, 106, -69, -109, -4, 54, -99, -43, -82};
            byte[] bArr4 = {-36, 88, -24, -71, -62, 74, -46, -32};
            int i4 = 0;
            int i5 = 0;
            while (i4 < 45) {
                if (i5 >= 8) {
                    i5 = 0;
                }
                bArr3[i4] = (byte) (bArr3[i4] ^ bArr4[i5]);
                i4++;
                i5++;
            }
            new String(bArr3, StandardCharsets.UTF_8);
        } else {
            byte[] bArr5 = {-108, 102, -58, 121, 54, -38, -58, 30, -107, 125, -24, 106, 40, -35, -58, 19, -92, 97, -57, 104, 22, -45, -120, 91, -85, 65, -24, 74, 54, -6, -11, 36, -90, 72, -3, 75, 45, -21, -15, 55, -88, 93, -20, 74};
            byte[] bArr6 = {-25, com.umeng.analytics.pro.cw.l, -87, com.umeng.analytics.pro.cw.l, 127, -76, -78, 123};
            int i6 = 0;
            int i7 = 0;
            while (i6 < 44) {
                if (i7 >= 8) {
                    i7 = 0;
                }
                bArr5[i6] = (byte) (bArr5[i6] ^ bArr6[i7]);
                i6++;
                i7++;
            }
            new String(bArr5, StandardCharsets.UTF_8);
            if (!U((C3491g4) d3.f3354a)) {
                W((Activity) weakReference.get(), d3, c5158z3);
                return;
            }
        }
        W((Activity) weakReference.get(), d3, c5158z3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4909wB
    public final void h(Activity activity, String str, int i, HS hs) {
        if (U(a0().d)) {
            Y(activity, new D3(a0().d, str, i, 0, 0), hs);
            return;
        }
        a0().getClass();
        if (!U(null)) {
            Y(activity, new D3(a0().d, str, i, 0, 0), hs);
        } else {
            a0().getClass();
            Y(activity, new D3(null, str, i, 0, 0), hs);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3504gB
    public final void k(Context context, C9 c9, InterfaceC5085yB interfaceC5085yB) {
        MD md = (MD) c9;
        GS gs = (GS) interfaceC5085yB;
        X0 x0 = X0.j;
        x0.h();
        if (context == null) {
            if (gs != null) {
                gs.a(null);
                return;
            }
            return;
        }
        C3044b1.b.k().getClass();
        WeakReference weakReference = new WeakReference(context.getApplicationContext());
        if (weakReference.get() == null) {
            if (gs != null) {
                gs.a(null);
                return;
            }
            return;
        }
        if (((Om0) x0.k()).l) {
            byte[] bArr = {17, 106, -34, -84, 76, 46, 46, -45, 7, 105, -34, -2, 5, 106, 51, -111, 71, 61, -61, -12, 5, 103, 55, -111, 71, 63, -57, -30, com.umeng.analytics.pro.cw.k, 110, 48, -112, 67, 60, -64, -6, com.umeng.analytics.pro.cw.k, 108};
            byte[] bArr2 = {114, 11, -13, -51, 60, 94, 3, -93};
            int i = 0;
            int i2 = 0;
            while (i < 38) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            ((C3491g4) md.f3354a).H(1, new String(bArr, StandardCharsets.UTF_8));
        } else {
            C3491g4 c3491g4 = (C3491g4) md.f3354a;
            boolean z = md.c;
            AbstractC4103n3.H(context, c3491g4, z ? AbstractC3661i1.f4483a : AbstractC3661i1.c, z ? AbstractC3661i1.l : AbstractC3661i1.m);
        }
        ((C3491g4) md.f3354a).L(a0() == null ? 3000000L : a0().g);
        if (TextUtils.isEmpty(((C3491g4) md.f3354a).w(1))) {
            if (gs != null) {
                gs.a(null);
                return;
            }
            return;
        }
        Sm0 sm0 = (Sm0) q((C3491g4) md.f3354a);
        synchronized (this.b) {
            try {
                if (!md.d) {
                    if (S((C3491g4) md.f3354a)) {
                        byte[] bArr3 = {59, 20, -1, -46, -13, 106, 65, -61, 6, 19, -22, -37, -64, 125, 21, -59, 28, 59, -17, -5, -18, 120, 81, -49, 22};
                        byte[] bArr4 = {114, 122, -117, -73, -127, 25, 53, -86};
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < 25) {
                            if (i4 >= 8) {
                                i4 = 0;
                            }
                            bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                            i3++;
                            i4++;
                        }
                        new String(bArr3, StandardCharsets.UTF_8);
                        if (gs != null) {
                            gs.b(sm0);
                        }
                        return;
                    }
                    if (((C3491g4) md.f3354a).z() == 0) {
                        byte[] bArr5 = {-96, 26, 43, 84, 67, 17, -41, -13, -99, 29, 62, 93, 112, 6, -125, -10, -122, 21, 59, 112, 85, 66, -51, -11, -99, 84, 49, 84, 84, 6, -125, -24, -116, 24, 48, 80, 85};
                        byte[] bArr6 = {-23, 116, 95, 49, 49, 98, -93, -102};
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < 37) {
                            if (i6 >= 8) {
                                i6 = 0;
                            }
                            bArr5[i5] = (byte) (bArr5[i5] ^ bArr6[i6]);
                            i5++;
                            i6++;
                        }
                        new String(bArr5, StandardCharsets.UTF_8);
                        this.g = gs;
                        return;
                    }
                }
                ((C3491g4) md.f3354a).M(0);
                md.d = false;
                B((C3491g4) md.f3354a);
                A((C3491g4) md.f3354a);
                byte[] bArr7 = {17, 95, -68, -2, 8, 107, com.umeng.analytics.pro.cw.l, 114, 44, 88, -87, -9, 59, 124, 90, 119, 55, 80, -84, -38, 30};
                byte[] bArr8 = {88, 49, -56, -101, 122, 24, 122, 27};
                int i7 = 0;
                int i8 = 0;
                while (i7 < 21) {
                    if (i8 >= 8) {
                        i8 = 0;
                    }
                    bArr7[i7] = (byte) (bArr7[i7] ^ bArr8[i8]);
                    i7++;
                    i8++;
                }
                new String(bArr7, StandardCharsets.UTF_8);
                C4981x20.u().q(new SP(this, md, weakReference, gs, context, 3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final int p() {
        return 2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final /* bridge */ /* synthetic */ AbstractC4642t9 r() {
        return a0();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final C9 s(C3491g4 c3491g4) {
        return new MD(c3491g4, false, false);
    }
}
