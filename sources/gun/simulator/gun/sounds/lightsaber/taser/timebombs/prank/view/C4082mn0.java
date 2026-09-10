package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.badlogic.gdx.backends.android.SpineActivity;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4082mn0 extends AbstractC4454r3 implements InterfaceC3680iB {
    public static final C4082mn0 v = new C4082mn0();
    public int t = -1;
    public final ConcurrentHashMap u = new ConcurrentHashMap();

    public static boolean H0(ViewGroup viewGroup, AdView adView) {
        return (viewGroup == null || adView == null || K0(viewGroup) != adView || adView.getParent() == null || adView.getParent() != viewGroup) ? false : true;
    }

    public static String I0(P8 p8) {
        try {
            p8.getClass();
            throw null;
        } catch (Exception e) {
            e.printStackTrace();
            p8.h.getClass();
            return AbstractC3661i1.e;
        }
    }

    public static AdView K0(ViewGroup viewGroup) {
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof AdView) {
                    return (AdView) childAt;
                }
            }
        }
        return null;
    }

    public static void L0(ViewGroup viewGroup) {
        if (M0().f && viewGroup != null && viewGroup.getChildCount() > 0) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof AdView) {
                    viewGroup.removeView(childAt);
                }
            }
        }
    }

    public static L8 M0() {
        return ((Om0) X0.j.k()).h;
    }

    public final AdView E0(P8 p8, C3731in0 c3731in0) {
        if (!AbstractC3221d1.a()) {
            Qm0.D(new byte[]{92, 27, 27, -124, -93, 81, 99, 84, 62, 22, 26, -117, -94, 109, 71, 71, 92, 27, 27, -124, -93, 81, 2, 85, 108, 8, 26, -104, -22, 3, 67, 70, 127, 19, 25, -117, -92, 79, 71, com.umeng.analytics.pro.cw.n, 109, 10, 20, -119, -93, 3, 76, 95, 106, 90, com.umeng.analytics.pro.cw.n, -124, -87, 86, 69, 88, -15, -58, -12, 5, 122, -94}, new byte[]{30, 122, 117, -22, -58, 35, 34, 48});
            c3731in0.onAdFailedToLoad(new LoadAdError(-1, Qm0.D(new byte[]{-3, -17, -49, -23, 50, -114, -3, -47, -97, -30, -50, -26, 51, -78, -39, -62, -3, -17, -49, -23, 50, -114, -100, -48, -51, -4, -50, -11, 123, -36, -35, -61, -34, -25, -51, -26, 53, -112, -39, -107, -52, -2, -64, -28, 50, -36, -46, -38, -53, -82, -60, -23, 56, -119, -37, -35}, new byte[]{-65, -114, -95, -121, 87, -4, -68, -75}), this.f4440a, null, null));
            return null;
        }
        p8.getClass();
        AdView adView = new AdView(X0.j.j());
        String strN = AbstractC4454r3.N(p8);
        if (strN != null) {
            this.u.put(strN, adView);
        }
        p8.h.getClass();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        adView.setAdSize(AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(AbstractApplicationC2673Ph.m, (int) (displayMetrics.widthPixels / displayMetrics.density)));
        adView.setAdUnitId(((C3491g4) p8.f3354a).w(1));
        byte[] bArr = {-110, -3, -100, -127, -88, 60, 85, 122, -97, -4, -109, -128, -108, 99, 2, 84, -111, -13, -103, -90, -119, 55, 68, 81, -103, -68, -102, -128, -110, 24, 70, 113, -102, -31, -43, -52, -56, 62, 71, 76, -65, -10, -112, -118, -124, 24, 70, 113, -102, -70, -44, -59, -37, 121};
        byte[] bArr2 = {-2, -110, -3, -27, -26, 89, 34, 56};
        int i = 0;
        int i2 = 0;
        while (i < 54) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        ((C3491g4) p8.f3354a).w(1);
        adView.setAdListener(c3731in0);
        p8.d = false;
        p8.e = false;
        B0((C3491g4) p8.f3354a);
        G0(p8, adView);
        return adView;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01fe  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3504gB
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final void k(Context context, P8 p8, DS ds) {
        X0 x0 = X0.j;
        x0.h();
        if (p8 == null || p8.c() == null) {
            Qm0.D(new byte[]{com.umeng.analytics.pro.cw.l, 96, -92, 1, 125, -18, -45, 76, 108, 119, -93, 10, 111, -37, -32, 71, 57, 113, -22, 12, 121, -14, -78, 70, 35, 117, -22, com.umeng.analytics.pro.cw.k, 125, -68, -4, 93, 32, 109, -21}, new byte[]{76, 1, -54, 111, 24, -100, -110, 40});
            return;
        }
        Object tag = p8.c().getTag();
        boolean z = tag == null || tag.toString().isEmpty();
        String strN = AbstractC4454r3.N(p8);
        Qm0.D(new byte[]{106, 70, -48, 105, -77, 76, 23, -29, 111, 71, -40, 121, -90, 73, 74, -29, 59, 9}, new byte[]{6, 41, -79, com.umeng.analytics.pro.cw.k, -14, 40, 45, -61});
        synchronized (this.b) {
            try {
                if (s0(strN)) {
                    return;
                }
                if (z) {
                    Y(strN, 1);
                }
                if (M0().f5021a) {
                    if (i0(strN) == null) {
                        a0(strN, ds);
                    }
                    W((DS) i0(strN));
                }
                Z(strN, p8);
                z0((C3491g4) p8.f3354a, strN);
                if (!p8.e) {
                    C(context, (C3491g4) p8.f3354a, (String) p8.b);
                }
                P(p8.c());
                WeakReference weakReference = new WeakReference(context);
                if (((Om0) x0.k()).l) {
                    ((C3491g4) p8.f3354a).H(1, Qm0.D(new byte[]{18, 21, 3, 91, 70, com.umeng.analytics.pro.cw.n, -77, -99, 4, 22, 3, 9, com.umeng.analytics.pro.cw.m, 84, -82, -33, 68, 66, 30, 3, com.umeng.analytics.pro.cw.m, 89, -86, -33, 68, 64, 26, 21, 0, 83, -82, -35, 72, 67, 22, 11, 7, 81}, new byte[]{113, 116, 46, 58, 54, 96, -98, -19}));
                } else {
                    C3491g4 c3491g4 = (C3491g4) p8.f3354a;
                    String strI0 = I0(p8);
                    try {
                        throw null;
                    } catch (Exception e) {
                        e.printStackTrace();
                        p8.h.getClass();
                        AbstractC4103n3.H(context, c3491g4, strI0, AbstractC3661i1.p);
                    }
                }
                C4312pT.n.m(p8.c(), new C3818jn0(this, ds, p8, strN, 0));
                X0.j.k();
                if (weakReference.get() != null) {
                    Object obj = p8.f3354a;
                    if (((C3491g4) obj) != null && !TextUtils.isEmpty(((C3491g4) obj).w(1))) {
                        AtomicReference atomicReference = new AtomicReference(null);
                        M((C3491g4) p8.f3354a);
                        C3731in0 c3731in0 = new C3731in0(this, p8, ds, weakReference, atomicReference, strN);
                        Pm0 pm0 = (Pm0) g0((C3491g4) p8.f3354a, strN);
                        AdView adView = pm0 != null ? pm0.d : null;
                        if (adView != null) {
                            Qm0.D(new byte[]{-95, 0, 60, 87, 75, -81, 80, 126, -61, 0, 54, 111, 71, -72, 102, 58, -62, 92, 114, 87, 91, -79, 125}, new byte[]{-29, 97, 82, 57, 46, -35, 17, 26});
                            adView.setAdListener(c3731in0);
                        } else {
                            Qm0.D(new byte[]{17, -88, -6, -13, 100, 29, 107, 99, 115, -88, -16, -53, 104, 10, 93, 39, 110, -23, -6, -24, 109, 3}, new byte[]{83, -55, -108, -99, 1, 111, 42, 7});
                        }
                        boolean z2 = (adView == null || adView.getAdSize() == null || TextUtils.isEmpty(adView.getAdUnitId()) || l0(p8)) ? false : true;
                        if (!M0().f5021a || !z2) {
                            if (p8.e) {
                                this.e.remove((C3491g4) p8.f3354a);
                            } else {
                                this.e.put((C3491g4) p8.f3354a, Boolean.FALSE);
                            }
                            synchronized (this.b) {
                                try {
                                    ((C3491g4) p8.f3354a).I();
                                    if (p8.d || J((C3491g4) p8.f3354a, strN) != 0) {
                                        Qm0.D(new byte[]{97, 97, 84, 69, -128, -47, -108, 49, 3, 108, 85, 74, -127, -30, -79, 111, 3, 110, 95, 92, -59, -30, -79, 3, 74, 101, 77}, new byte[]{35, 0, 58, 43, -27, -93, -43, 85});
                                        atomicReference.set(new WeakReference(E0(p8, c3731in0)));
                                        return;
                                    } else {
                                        Qm0.D(new byte[]{-101, -29, 65, 78, -118, -9, -75, 6, -7, -18, 64, 65, -117, -60, -112, 88, -7, -18, 64, 65, -117, -20, -102, 5}, new byte[]{-39, -126, 47, 32, -17, -123, -12, 98});
                                        R((C3491g4) p8.f3354a, c3731in0);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        Qm0.D(new byte[]{54, -127, -23, -49, 30, 47, 116, 61, 84, -116, -24, -64, 31, 28, 81, 99, 84, -119, -12, -28, 21, 60, 87, 53, 17, -89, -21, -50, 25, 60, 89, com.umeng.analytics.pro.cw.m, 21, -116, -18, -59}, new byte[]{116, -32, -121, -95, 123, 93, 53, 89});
                        if (!p8.e) {
                            E((Context) weakReference.get(), (C3491g4) p8.f3354a, (String) p8.b);
                        }
                        if (p8.d) {
                            Qm0.D(new byte[]{-111, 44, -73, 3, -50, -44, 58, 2, -13, 33, -74, 12, -49, -25, 31, 70, -65, 34, -72, 9, -23, -57, 21, 8, -74, 63, -101, 20, -24, -55, 21, 0, -70, 42, -29, 77, -59, -61, 12, 70, -110, 41, -113, 4, -50, -47}, new byte[]{-45, 77, -39, 109, -85, -90, 123, 102});
                            atomicReference.set(new WeakReference(E0(p8, c3731in0)));
                        } else {
                            C3491g4 c3491g5 = (C3491g4) p8.f3354a;
                            if (J(c3491g5, strN) == 2 || J(c3491g5, strN) == -1) {
                                Qm0.D(new byte[]{-111, 44, -73, 3, -50, -44, 58, 2, -13, 33, -74, 12, -49, -25, 31, 70, -65, 34, -72, 9, -23, -57, 21, 8, -74, 63, -101, 20, -24, -55, 21, 0, -70, 42, -29, 77, -59, -61, 12, 70, -110, 41, -113, 4, -50, -47}, new byte[]{-45, 77, -39, 109, -85, -90, 123, 102});
                                atomicReference.set(new WeakReference(E0(p8, c3731in0)));
                            } else {
                                Qm0.D(new byte[]{95, 59, 4, -57, -116, 77, -9, 82, 61, 54, 5, -56, -115, 126, -46, 22, 114, 52, 43, -51, -91, 80, -41, 82, 120, 62, -123, 21, 115, 109, -45, 67, 110, 63}, new byte[]{29, 90, 106, -87, -23, 63, -74, 54});
                                if (this.g.get((C3491g4) p8.f3354a) == null) {
                                    B(strN);
                                    A(strN);
                                }
                                if (i0(strN) != null) {
                                    ((M10) ((DS) i0(strN))).b(pm0);
                                }
                            }
                        }
                        if (p8.c() != null) {
                            J0(p8.c(), pm0);
                            return;
                        }
                        return;
                    }
                }
                Qm0.D(new byte[]{5, -98, 80, 44, -92, -38, -53, -22, 103, -109, 81, 35, -91, -23, -18, -82, 41, -118, 82, 46}, new byte[]{71, -1, 62, 66, -63, -88, -118, -114});
                S((C3491g4) p8.f3354a, strN, 2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void G0(P8 p8, AdView adView) {
        synchronized (this.b) {
            ((C3491g4) p8.f3354a).J(System.currentTimeMillis());
            String strN = AbstractC4454r3.N(p8);
            Z(AbstractC4454r3.N(p8), p8);
            D0((C3491g4) p8.f3354a);
            B(strN);
            A(strN);
            S((C3491g4) p8.f3354a, strN, 0);
            p8.d = false;
            Z(strN, p8);
            C4981x20.u().t(new RunnableC5099yP(this, p8, null, adView, 8));
        }
    }

    public final void J0(ViewGroup viewGroup, Pm0 pm0) {
        P8 p8;
        P8 p9;
        if (M0().f) {
            if (viewGroup == null) {
                byte[] bArr = {88, -71, 42, -99, 23, 102, -118, -16, 58, -86, 33, -98, 29, 98, -82, -43, 116, -68, 5, -105, 22, 64, -92, -60, 118, -71, 39, -106, 31, 113, -91, -32, 58, -82, 45, -106, 5, 83, -71, -5, 111, -88, 100, -102, 1, 52, -91, -31, 118, -76};
                byte[] bArr2 = {26, -40, 68, -13, 114, 20, -53, -108};
                int i = 0;
                int i2 = 0;
                while (i < 50) {
                    if (i2 >= 8) {
                        i2 = 0;
                    }
                    bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                    i++;
                    i2++;
                }
                new String(bArr, StandardCharsets.UTF_8);
                return;
            }
            if (pm0 == null) {
                byte[] bArr3 = {9, -109, 89, 116, 106, 113, 100, -65, 107, -128, 82, 119, 96, 117, 64, -102, 37, -106, 118, 126, 107, 87, 74, -117, 39, -109, 84, 127, 98, 102, 75, -81, 107, -109, 83, 119, 96, 97, 103, -70, 37, -100, 82, 104, 78, 103, 5, -78, 56, -46, 89, 111, 99, 111};
                byte[] bArr4 = {75, -14, 55, 26, com.umeng.analytics.pro.cw.m, 3, 37, -37};
                int i3 = 0;
                int i4 = 0;
                while (i3 < 54) {
                    if (i4 >= 8) {
                        i4 = 0;
                    }
                    bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                    i3++;
                    i4++;
                }
                new String(bArr3, StandardCharsets.UTF_8);
                return;
            }
            Qm0.D(new byte[]{74, 45, 45, -88, 61, -96, 64, 92, 40, 62, 38, -85, 55, -92, 100, 121, 102, 40, 2, -94, 60, -122, 110, 104, 100, 45, 32, -93, 53, -73, 111, 76}, new byte[]{8, 76, 67, -58, 88, -46, 1, 56});
            synchronized (this.b) {
                try {
                    AdView adView = pm0.d;
                    if (adView != null) {
                        C4312pT.n.j(viewGroup);
                        adView.resume();
                        if (H0(viewGroup, adView)) {
                            Qm0.D(new byte[]{45, 4, 108, -54, -25, 8, -80, 36, 59, 32, 101, -63, -59, 2, -95, 38, 62, 2, 100, -56, -12, 3, -123, 112, 127, 5, 110, -123, -1, 2, -123, 106, 62, 5, 101, -123, -29, 8, -127, 47, 62, 21, 100, -63, -3, 20}, new byte[]{95, 97, 1, -91, -111, 109, -15, 74});
                            P(viewGroup);
                            pm0.e();
                            if (viewGroup.getTag() != null && (p9 = (P8) L(viewGroup.getTag().toString())) != null) {
                                k0(p9, viewGroup.getTag().toString(), pm0);
                            }
                            return;
                        }
                        if (viewGroup.getTag() != null && s0(viewGroup.getTag().toString())) {
                            return;
                        }
                        ViewGroup viewGroup2 = (ViewGroup) adView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(adView);
                        }
                        L0(viewGroup);
                        if (adView.getParent() == null) {
                            AbstractC3570h.m(adView, viewGroup);
                            pm0.e();
                            if (viewGroup.getTag() != null && (p8 = (P8) L(viewGroup.getTag().toString())) != null) {
                                k0(p8, viewGroup.getTag().toString(), pm0);
                            }
                        }
                        viewGroup.postDelayed(new RunnableC3163cN(this, viewGroup, adView, 4), 50L);
                        viewGroup.setVisibility(0);
                        P(viewGroup);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4454r3
    public final void U(J9 j9, C4191o3 c4191o3) {
        R8 r8 = (R8) j9;
        X0 x0 = X0.j;
        x0.h();
        if (!M0().f5021a || r8 == null) {
            c4191o3.a(null);
            return;
        }
        x0.k();
        if (!AbstractC3221d1.a()) {
            Qm0.D(new byte[]{-96, -81, 121, 123, -77, 82, 60, -71, -62, -66, 101, 112, -70, 79, 28, -71, -93, -86, 55, 112, -92, 82, 18, -81, -50, -18, 118, 99, -73, 73, 17, -68, -128, -94, 114, 53, -91, 80, 28, -66, -121, -18, 121, 122, -94, 0, 24, -77, -115, -69, 112, 125, 57, -100, -4, 50, 94, 79}, new byte[]{-30, -50, 23, 21, -42, 32, 125, -35});
            c4191o3.a(new C3205co0(-1, this.f4440a, Qm0.D(new byte[]{55, -50, 124, com.umeng.analytics.pro.cw.k, -108, 92, -9, 12, 85, -33, 96, 6, -99, 65, -41, 12, 52, -53, 50, 6, -125, 92, -39, 26, 89, -113, 115, 21, -112, 71, -38, 9, 23, -61, 119, 67, -126, 94, -41, 11, com.umeng.analytics.pro.cw.n, -113, 124, 12, -123, com.umeng.analytics.pro.cw.l, -45, 6, 26, -38, 117, 11}, new byte[]{117, -81, 18, 99, -15, 46, -74, 104})));
            return;
        }
        C3491g4 c3491g4 = r8.c;
        G7 g7A = r8.a();
        C4015m3 c4015m3 = new C4015m3(c3491g4, g7A, r8.d);
        if (((Om0) x0.k()).l) {
            c4015m3.c.H(1, Qm0.D(new byte[]{62, 41, -84, -54, -59, com.umeng.analytics.pro.cw.l, 51, -63, 40, 42, -84, -104, -116, 74, 46, -125, 104, 126, -79, -110, -116, 71, 42, -125, 104, 124, -75, -124, -125, 77, 46, -127, 100, 127, -71, -102, -124, 79}, new byte[]{93, 72, -127, -85, -75, 126, 30, -79}));
        } else {
            Context contextJ = x0.j();
            C3491g4 c3491g5 = c4015m3.c;
            g7A.getClass();
            String str = AbstractC3661i1.e;
            g7A.getClass();
            AbstractC4103n3.H(contextJ, c3491g5, str, AbstractC3661i1.p);
        }
        C3491g4 c3491g6 = c4015m3.c;
        if (c3491g6 == null || TextUtils.isEmpty(c3491g6.w(1))) {
            C3491g4 c3491g7 = c4015m3.c;
            if (c3491g7 != null) {
                S(c3491g7, "", 2);
            }
            c4191o3.a(null);
            return;
        }
        Pm0 pm0 = (Pm0) g0(c4015m3.c, "");
        AdView adView = pm0 == null ? null : pm0.d;
        if (adView != null && !w0(c4015m3.c)) {
            this.t = 3;
            c4191o3.b(pm0);
            return;
        }
        synchronized (this.b) {
            try {
                if (!c4015m3.d && J(c4015m3.c, "") == 0) {
                    Qm0.D(new byte[]{3, 78, 96, -73, -52, -127, -26, -111, 97, 95, 124, -68, -59, -100, -58, -111, 0, 75, 52, -7, -59, -100, -58, -111, 40, 65, 105}, new byte[]{65, 47, com.umeng.analytics.pro.cw.l, -39, -87, -13, -89, -11});
                    c4191o3.a(null);
                    return;
                }
                Pm0[] pm0Arr = {pm0};
                c4015m3.c.I();
                C3380en0 c3380en0 = new C3380en0(this, c4191o3, c4015m3, pm0Arr);
                if (adView != null) {
                    Qm0.D(new byte[]{-102, com.umeng.analytics.pro.cw.n, -24, -80, -80, 43, 60, 104, -8, com.umeng.analytics.pro.cw.n, -30, -120, -68, 60, 10, 44, -7, 76, -90, -80, -96, 53, 17}, new byte[]{-40, 113, -122, -34, -43, 89, 125, 12});
                    adView.setAdListener(c3380en0);
                } else {
                    Qm0.D(new byte[]{66, 76, 61, 39, 84, 82, -15, -117, 32, 76, 55, 31, 88, 69, -57, -49, 61, com.umeng.analytics.pro.cw.k, 61, 60, 93, 76}, new byte[]{0, 45, 83, 73, 49, 32, -80, -17});
                }
                Qm0.D(new byte[]{-79, 48, 109, -10, 117, 85, -101, -39, -45, 33, 113, -3, 124, 72, -69, -39, -78, 53, 57, -72, 126, 66, -83, -99, -78, 53, 85, -15, 117, 80}, new byte[]{-13, 81, 3, -104, com.umeng.analytics.pro.cw.n, 39, -38, -67});
                if (adView == null) {
                    AdView adView2 = new AdView(x0.j());
                    g7A.getClass();
                    DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                    adView2.setAdSize(AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(AbstractApplicationC2673Ph.m, (int) (displayMetrics.widthPixels / displayMetrics.density)));
                    adView2.setAdUnitId(c4015m3.c.w(1));
                    adView2.setAdListener(c3380en0);
                    if (pm0 == null) {
                        pm0Arr[0] = new Pm0(adView2);
                    } else {
                        pm0.d = adView2;
                    }
                    adView = adView2;
                }
                S(c4015m3.c, "", 0);
                c4015m3.c.J(System.currentTimeMillis());
                D0(c4015m3.c);
                C4981x20.u().t(new RunnableC5099yP(this, c4015m3, null, adView, 9));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void b(ConstraintLayout constraintLayout) {
        byte[] bArr = {12, 42, 12, 62, -16, -71, -30, 29, 110, 59, 3, 37, -26, -82, -30, 29};
        byte[] bArr2 = {78, 75, 98, 80, -107, -53, -93, 121};
        int i = 0;
        int i2 = 0;
        while (i < 16) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        Charset charset = StandardCharsets.UTF_8;
        new String(bArr, charset);
        if (constraintLayout == null || constraintLayout.getTag() == null) {
            return;
        }
        String string = constraintLayout.getTag().toString();
        Y(string, 2);
        P8 p8 = (P8) L(string);
        if (p8 == null) {
            return;
        }
        Pm0 pm0 = (Pm0) g0((C3491g4) p8.f3354a, string);
        AdView adView = pm0 == null ? null : pm0.d;
        if (adView != null) {
            adView.pause();
        }
        if (pm0 != null) {
            pm0.f();
        }
        z0((C3491g4) p8.f3354a, string);
        if (M0().f5021a) {
            if (K0(constraintLayout) != null) {
                Context context = constraintLayout.getContext();
                HashMap map = H8.f3157a;
                if (context != null) {
                    int width = constraintLayout.getWidth();
                    int height = constraintLayout.getHeight();
                    if (width > 0 && height > 0) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append(width);
                            byte[] bArr3 = {-48};
                            bArr3[0] = (byte) (new byte[]{-88, -79, -77, -114, -97, -8, 32, 0}[0] ^ bArr3[0]);
                            sb.append(new String(bArr3, charset));
                            sb.append(height);
                            G8 g8A = H8.a(width, height, sb.toString());
                            if (g8A != null) {
                                Bitmap bitmap = g8A.f3107a;
                                if (!bitmap.isRecycled()) {
                                    Canvas canvas = new Canvas(bitmap);
                                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                    constraintLayout.draw(canvas);
                                    constraintLayout.removeAllViews();
                                    ImageView imageView = new ImageView(context);
                                    imageView.setTag(H8.b);
                                    imageView.setImageBitmap(bitmap);
                                    constraintLayout.addView(imageView, new ViewGroup.LayoutParams(width, height));
                                    g8A.b++;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            L0(constraintLayout);
            synchronized (this.b) {
                try {
                    if (this.e.get((C3491g4) p8.f3354a) != null && Boolean.FALSE.equals(this.e.get((C3491g4) p8.f3354a))) {
                        this.e.remove((C3491g4) p8.f3354a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AdView adViewK0 = K0(constraintLayout);
            if (adViewK0 != null) {
                if (constraintLayout.isShown()) {
                    constraintLayout.setVisibility(8);
                }
                adViewK0.pause();
            }
        }
        C4312pT.n.b(constraintLayout);
        this.t = -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void c(ConstraintLayout constraintLayout) {
        Qm0.D(new byte[]{-107, -21, 26, 8, -68, com.umeng.analytics.pro.cw.k, 47, -89, -9, -8, 17, 21, -84, 18, 11, -126, -77}, new byte[]{-41, -118, 116, 102, -39, 127, 110, -61});
        X0 x0 = X0.j;
        x0.h();
        if (constraintLayout == null || constraintLayout.getTag() == null) {
            Qm0.D(new byte[]{94, -38, -66, 102, 2, 9, -119, -103, 110, -34, -93, 125, 10, 30, -14, -35, 12, -51, -88, 96, 26, 1, -42, -8, 72, -97, -69, 122, 10, 27, -12, -53, 67, -54, -67, 51, 82, 81, -109, -41, 89, -45, -95, 51, 19, com.umeng.analytics.pro.cw.n, -109, -49, 69, -38, -70, 84, 29, 3, -58, -55, 2, -40, -88, 103, 59, com.umeng.analytics.pro.cw.k, -44, -111, 5, -97, -16, 46, 79, 2, -58, -43, 64}, new byte[]{44, -65, -51, 19, 111, 108, -77, -71});
            return;
        }
        C4312pT c4312pT = C4312pT.n;
        c4312pT.getClass();
        if (C4312pT.k(constraintLayout)) {
            c4312pT.c(constraintLayout);
        }
        P(constraintLayout);
        String string = constraintLayout.getTag().toString();
        Y(string, 1);
        Q(constraintLayout, string);
        P8 p8 = (P8) L(string);
        if (p8 == null) {
            Qm0.D(new byte[]{122, -112, -116, 61, 91, -110, -109, 79, 74, -108, -111, 38, 83, -123, -24, 11, 40, -121, -102, 59, 67, -102, -52, 46, 108, -43, -109, 39, 87, -109, -22, 0, 102, -109, -106, 47, 22, -54, -108, 79, 102, -128, -109, 36}, new byte[]{8, -11, -1, 72, 54, -9, -87, 111});
            return;
        }
        x0.k();
        z0((C3491g4) p8.f3354a, string);
        p8.f = new WeakReference(constraintLayout);
        Pm0 pm0 = (Pm0) g0((C3491g4) p8.f3354a, string);
        AdView adView = pm0 == null ? null : pm0.d;
        if (adView != null) {
            adView.resume();
        }
        if (!M0().f5021a) {
            Qm0.D(new byte[]{-128, 32, -55, -31, 47, 53, 2, 32, -56, 101, -33, -6, 35, 50, 47, 33, -75, 41, -43, -10, 35, 60, 99, 121, -46, 35, -37, -8, 49, 53, 99, 104, -46, 44, -55, -41, 45, 60, 47, 37, -126, 54, -45, -10, 46, 53, 2, 32, -46, 120, -102, -14, 35, 60, 48, 33}, new byte[]{-14, 69, -70, -108, 66, 80, 67, 68});
            z0((C3491g4) p8.f3354a, string);
            AdView adViewK0 = K0(constraintLayout);
            if (adViewK0 == null) {
                if (!H0(constraintLayout, adView) && J((C3491g4) p8.f3354a, string) == 1) {
                    constraintLayout.post(new RunnableC4746uO(this, constraintLayout, pm0, 21));
                }
                adViewK0 = adView;
            }
            if (adViewK0 != null) {
                if (!constraintLayout.isShown()) {
                    constraintLayout.setVisibility(0);
                }
                adViewK0.resume();
                M0().getClass();
                if (adView == null || l0(p8)) {
                    Qm0.D(new byte[]{116, -50, 68, -124, -42, -60, 19, -52, 60, -117, 82, -97, -38, -61, 62, -51, 65, -57, 88, -109, -38, -51, 114, -107, 38, -51, 86, -99, -56, -60, 114, -124, 38, -57, 88, -112, -33, -127, 60, -51, 113, -117, 86, -107}, new byte[]{6, -85, 55, -15, -69, -95, 82, -88});
                    Qm0.D(new byte[]{-7, 86, 78, 98, -9, 79, -108, -26, -79, 19, 81, 120, -5, 78, -105, -29, -27, 93, 88, 101, -40, 83, -106, -19, -27, 85, 84, 112}, new byte[]{-117, 51, 61, 23, -102, 42, -43, -126});
                    G0(p8, adViewK0);
                    return;
                }
                return;
            }
            return;
        }
        Qm0.D(new byte[]{-6, 126, com.umeng.analytics.pro.cw.n, -42, 32, -125, -120, -35, -78, 59, 6, -51, 44, -124, -91, -36, -49, 119, 12, -63, 44, -118, -23, -124, -88, 111, 17, -42, 40, -58, -27, -103, -31, 104, 32, -52, 33, -118, -88, -55, -5, 114, 1, -49, 40, -89, -83, -103, -75, 59, 5, -62, 33, -107, -84}, new byte[]{-120, 27, 99, -93, 77, -26, -55, -71});
        M0().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4626t1 c4626t1X = ((C3491g4) p8.f3354a).x(1);
        boolean z = jCurrentTimeMillis - (c4626t1X != null ? c4626t1X.d : 0L) > M0().e || adView == null || l0(p8);
        Object objM = M((C3491g4) p8.f3354a);
        if (h0() != i0(string)) {
            W((DS) i0(string));
        }
        if (string.equals(objM)) {
            if (J((C3491g4) p8.f3354a, string) == 0) {
                return;
            }
            if (!z) {
                if (H0(constraintLayout, adView)) {
                    if (constraintLayout.isShown()) {
                        return;
                    }
                    constraintLayout.setVisibility(0);
                    pm0.e();
                    k0(p8, string, pm0);
                    return;
                }
                if (K0(constraintLayout) == null) {
                    Qm0.D(new byte[]{-23, -55, -99, -71, 95, 46, -89, 32, -117, -38, -106, -92, 79, 49, -125, 5, -49, -120, -100, -71, 123, 56, -86, 43, -54, -52, -106, -77, 26, 46, -125, 49, -40, -51}, new byte[]{-85, -88, -13, -41, 58, 92, -26, 68});
                    if (this.g.get((C3491g4) p8.f3354a) == null) {
                        B(string);
                        A(string);
                    }
                    constraintLayout.post(new SP(this, string, adView, constraintLayout, pm0, 1));
                    return;
                }
            }
        }
        z0((C3491g4) p8.f3354a, string);
        p8.d = z;
        p8.e = true;
        k(constraintLayout.getContext(), p8, (DS) i0(string));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3680iB
    public final void d(SpineActivity spineActivity, ConstraintLayout constraintLayout, C3491g4 c3491g4, String str, M10 m10) {
        WeakReference weakReference = new WeakReference(spineActivity);
        if (weakReference.get() == null) {
            return;
        }
        k((Context) weakReference.get(), new P8(c3491g4, str, constraintLayout, constraintLayout), m10);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void j(ViewGroup viewGroup) {
        I9 i9;
        int i = 0;
        byte[] bArr = {-105, -59, -62, -56, -83, -105, -29, -76, -11, -64, -55, -43, -68, -105, -51, -87, -108, -64};
        byte[] bArr2 = {-43, -92, -84, -90, -56, -27, -94, -48};
        int i2 = 0;
        int i3 = 0;
        while (i2 < 18) {
            if (i3 >= 8) {
                i3 = 0;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
            i2++;
            i3++;
        }
        Charset charset = StandardCharsets.UTF_8;
        new String(bArr, charset);
        if (viewGroup == null || viewGroup.getTag() == null) {
            return;
        }
        HashMap map = H8.f3157a;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        if (width > 0 && height > 0) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(width);
                byte[] bArr3 = {-78};
                bArr3[0] = (byte) (new byte[]{-54, 114, -55, 116, 99, 40, -59, 77}[0] ^ bArr3[0]);
                sb.append(new String(bArr3, charset));
                sb.append(height);
                G8 g8A = H8.a(width, height, sb.toString());
                if (g8A != null) {
                    String str = g8A.c;
                    Bitmap bitmap = g8A.f3107a;
                    if (!bitmap.isRecycled()) {
                        int i4 = g8A.b - 1;
                        g8A.b = i4;
                        if (i4 <= 0) {
                            HashMap map2 = H8.f3157a;
                            if (((G8) map2.get(str)) != g8A) {
                                if (!bitmap.isRecycled()) {
                                    bitmap.recycle();
                                }
                                map2.remove(str);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String string = viewGroup.getTag().toString();
        Y(string, 3);
        synchronized (this) {
            i9 = (I9) this.m.remove(string);
        }
        P8 p8 = (P8) i9;
        AbstractC4454r3.j0(viewGroup);
        C4312pT.n.j(viewGroup);
        Pm0 pm0 = p8 != null ? (Pm0) g0((C3491g4) p8.f3354a, string) : null;
        if (p8 == null) {
            AdView adViewK0 = K0(viewGroup);
            if (adViewK0 != null) {
                adViewK0.setAdListener(null);
                adViewK0.destroy();
            }
            if (pm0 != null) {
                pm0.f();
            }
            L0(viewGroup);
            return;
        }
        B(string);
        A(string);
        AdView adView = pm0 == null ? null : pm0.d;
        boolean z = M0().f5021a;
        ConcurrentHashMap concurrentHashMap = this.u;
        if (!z) {
            B0((C3491g4) p8.f3354a);
            AdView adViewK1 = K0(viewGroup);
            if (adViewK1 != null) {
                adViewK1.pause();
                adViewK1.setAdListener(null);
                adViewK1.destroy();
            }
            AdView adView2 = (AdView) concurrentHashMap.remove(string);
            if (adView2 != null) {
                byte[] bArr4 = {92, -124, 5, -28, -26, -68, 113, 58, 92, -37, 86, -10, -5, -90, 102, 31, 24, -128, 24, -12, -76, -73, 109, 8, 76, -109, 25, -23, -76, -65, 103, 26, 92, -120, 24, -9, -76, -110, 108, 45, 81, -124, 1, -68, -76, -89, 105, 28, 5};
                byte[] bArr5 = {56, -31, 118, -112, -108, -45, 8, 123};
                int i5 = 0;
                int i6 = 0;
                while (i5 < 49) {
                    if (i6 >= 8) {
                        i6 = 0;
                    }
                    bArr4[i5] = (byte) (bArr4[i5] ^ bArr5[i6]);
                    i5++;
                    i6++;
                }
                new String(bArr4, StandardCharsets.UTF_8);
                adView2.pause();
                adView2.setAdListener(null);
                adView2.destroy();
            }
            v0((C3491g4) p8.f3354a, string);
            q0((C3491g4) p8.f3354a, string);
        } else if (r0((C3491g4) p8.f3354a)) {
            byte[] bArr6 = {68, 109, 92, 35, 28, -4, -22, -74, 38, 104, 87, 62, com.umeng.analytics.pro.cw.k, -4, -60, -85, 71, 104, 18, 37, 24, -3, -8, -77, 107, 105, 115, 41, 48, -22, -40, -101, 104, 64, 93, 44, 29, -51, -60, -68, 96, 101, 85};
            byte[] bArr7 = {6, 12, 50, 77, 121, -114, -85, -46};
            int i7 = 0;
            int i8 = 0;
            while (i7 < 43) {
                if (i8 >= 8) {
                    i8 = 0;
                }
                bArr6[i7] = (byte) (bArr6[i7] ^ bArr7[i8]);
                i7++;
                i8++;
            }
            new String(bArr6, StandardCharsets.UTF_8);
        } else {
            AdView adView3 = (AdView) concurrentHashMap.remove(string);
            if (adView3 != null) {
                byte[] bArr8 = {-83, 54, -14, 100, -91, 11, -46, 76, -83, 105, -95, 118, -72, 17, -59, 105, -23, 50, -17, 116, -9, 0, -50, 126, -67, 33, -18, 105, -9, 8, -60, 108, -83, 58, -17, 119, -9, 37, -49, 91, -96, 54, -10, 60, -9, com.umeng.analytics.pro.cw.n, -54, 106, -12};
                byte[] bArr9 = {-55, 83, -127, com.umeng.analytics.pro.cw.n, -41, 100, -85, com.umeng.analytics.pro.cw.k};
                int i10 = 0;
                for (int i11 = 49; i10 < i11; i11 = 49) {
                    if (i >= 8) {
                        i = 0;
                    }
                    bArr8[i10] = (byte) (bArr8[i10] ^ bArr9[i]);
                    i10++;
                    i++;
                }
                new String(bArr8, StandardCharsets.UTF_8);
                adView3.pause();
                adView3.setAdListener(null);
                adView3.destroy();
            }
            if (adView != null) {
                adView.pause();
                adView.setAdListener(null);
                adView.destroy();
                if (pm0 != null) {
                    pm0.f();
                }
            }
            B0((C3491g4) p8.f3354a);
            D0((C3491g4) p8.f3354a);
            W(null);
            byte[] bArr10 = {8, 107, -92, -59, 19, -121, 125, -111, 106, 110, -81, -40, 2, -121, 83, -116, 11, 110, -22, -54, 18, -93, 85, -112, 61, 36, -82, -50, 5, -127, 78, -102, 51, 34, -29};
            byte[] bArr11 = {74, 10, -54, -85, 118, -11, 60, -11};
            int i12 = 0;
            int i13 = 0;
            while (i12 < 35) {
                if (i13 >= 8) {
                    i13 = 0;
                }
                bArr10[i12] = (byte) (bArr10[i12] ^ bArr11[i13]);
                i12++;
                i13++;
            }
            new String(bArr10, StandardCharsets.UTF_8);
            v0((C3491g4) p8.f3354a, string);
            q0((C3491g4) p8.f3354a, string);
            y0((C3491g4) p8.f3354a);
        }
        A0(string);
        L0(viewGroup);
        p8.a();
        C0(string);
        this.t = -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final int p() {
        return 3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final /* bridge */ /* synthetic */ AbstractC4642t9 r() {
        return M0();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final C9 s(C3491g4 c3491g4) {
        byte[] bArr = {-7, 66, 36, 32, 56, 41, -29, 22, -1, 3, 41, 47, 51, 123, -83, 24, -17, 3, 63, 61, 56, 123, -73, 31, -14, 80, 106, 35, 56, 47, -85, 24, -1, 3, 62, 33, 125, 60, -90, 3, -69, 79, 37, 47, 57, 24, -84, 25, -3, 74, 45, 98, 45, 55, -90, 22, -24, 70, 106, 59, 46, 62, -29, 2, -24, 70, 106, 47, 51, 52, -73, 31, -2, 81, 106, 35, 56, 47, -85, 24, -1, 3, 62, 33, 125, 55, -84, 22, -1, 3, 40, 47, 51, 53, -90, 5, -69, 66, 46};
        byte[] bArr2 = {-101, 35, 74, 78, 93, 91, -61, 119};
        int i = 0;
        int i2 = 0;
        while (i < 99) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        return null;
    }
}
