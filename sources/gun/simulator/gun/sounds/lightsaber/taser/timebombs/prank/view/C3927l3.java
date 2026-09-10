package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3927l3 extends Jn0 {
    public static final C3927l3 C = new C3927l3();
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final RunnableC3401f3 m = new RunnableC3401f3(this, 1);
    public boolean n = false;
    public WeakReference o = null;
    public WeakReference p = null;
    public int q = 1;
    public long r = 0;
    public WeakReference s = null;
    public final RunnableC3401f3 t = new RunnableC3401f3(this, 2);
    public final C3313e3 u = new C3313e3(this);
    public DialogC3665i3 v = null;
    public DialogC3665i3 w = null;
    public boolean x = false;
    public boolean y = false;
    public final HashMap z = new HashMap();
    public final RunnableC3401f3 A = new RunnableC3401f3(this, 0);
    public final C3489g3 B = new C3489g3(this);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4170nn0
    public final AbstractC4379q9 K(C3491g4 c3491g4, boolean z) {
        return new I5(c3491g4, true, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4170nn0
    public final boolean U(C3491g4 c3491g4) {
        C4626t1 c4626t1X;
        return q(c3491g4) != null && c3491g4.z() == 1 && ((c4626t1X = c3491g4.x(1)) == null || !c4626t1X.a());
    }

    public final void W(Activity activity, J5 j5, BS bs) {
        AppOpenAd appOpenAd;
        X0 x0 = X0.j;
        x0.h();
        if (activity == null) {
            this.n = false;
            byte[] bArr = {-27, -75, 96, 67, -89, 45, 94, 23, -64, -27, 113, 111, -93, 33, 70, 63, -48, -68, 48, 101, -92, 104, 94, 35, -56, -87, 62};
            byte[] bArr2 = {-92, -59, com.umeng.analytics.pro.cw.n, 12, -41, 72, 48, 86};
            int i = 0;
            int i2 = 0;
            while (i < 27) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            if (bs != null) {
                bs.d(null);
                bs.h(false);
                return;
            }
            return;
        }
        if (!Jn0.V(((Om0) C3044b1.b.k()).b)) {
            byte[] bArr3 = {-52, 10, -72, -101, 48, 41, -87, 110, -23, 90, -119, -80, 96, 5, -87, 91, -24, 8, -66, -75, 44, 1, -108, com.umeng.analytics.pro.cw.m, -29, 21, -68, -12, com.umeng.analytics.pro.cw.k, 45, -77, 76, -27};
            byte[] bArr4 = {-115, 122, -56, -44, 64, 76, -57, 47};
            int i3 = 0;
            int i4 = 0;
            while (i3 < 33) {
                if (i4 >= 8) {
                    i4 = 0;
                }
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                i3++;
                i4++;
            }
            new String(bArr3, StandardCharsets.UTF_8);
            if (bs != null) {
                bs.d(null);
                bs.h(false);
                return;
            }
            return;
        }
        C3491g4 c3491g4 = (C3491g4) j5.f3354a;
        if (c3491g4 == null || TextUtils.isEmpty(c3491g4.w(1))) {
            this.n = false;
            Qm0.D(new byte[]{-19, 100, 118, -120, -71, 99, 111, -61, -56, 52, 71, -73, -71, 73, 113, -25, -62, 85, 98, -114, -83, 117, 33, -31, -51, 122, 33, -77, -23, 100, 100, -94, -62, 97, 106, -85, -27, 38, 120, -19, -39, 52, 107, -78, -70, 114, 33, -21, -62, 125, 114, -25, -85, 99, 103, -19, -34, 113, 38, -76, -95, 105, 118}, new byte[]{-84, 20, 6, -57, -55, 6, 1, -126});
            if (bs != null) {
                bs.d(null);
                bs.h(false);
                return;
            }
            return;
        }
        WeakReference weakReference = new WeakReference(activity);
        C(x0.j(), (C3491g4) j5.f3354a, (String) j5.b);
        if (this.n) {
            byte[] bArr5 = {-54, 32, -73, -19, 124, -61, 64, 124, -17, 112, -109, -54, 105, -122, 79, 77, -5, 112, -88, -46, 105, -56, com.umeng.analytics.pro.cw.l, 92, -17, 112, -82, -47, 44, -57, 66, 79, -18, 49, -93, -37, 44, -43, 70, 82, -4, 57, -87, -59, 34};
            byte[] bArr6 = {-117, 80, -57, -94, 12, -90, 46, 61};
            int i5 = 0;
            int i6 = 0;
            while (i5 < 45) {
                if (i6 >= 8) {
                    i6 = 0;
                }
                bArr5[i5] = (byte) (bArr5[i5] ^ bArr6[i6]);
                i5++;
                i6++;
            }
            new String(bArr5, StandardCharsets.UTF_8);
            if (bs != null) {
                bs.d(null);
                bs.h(false);
                return;
            }
            return;
        }
        if (AbstractC4170nn0.i) {
            byte[] bArr7 = {-120, -103, 85, 109, -95, -54, 74, -61, -83, -55, 99, 87, -67, -61, 87, -31, -69, -116, 64, 76, -15, -18, 64, -94, -96, -102, 5, 81, -71, -64, 83, -21, -89, -114, 5, 76, -66, -40};
            byte[] bArr8 = {-55, -23, 37, 34, -47, -81, 36, -126};
            int i7 = 0;
            int i8 = 0;
            while (i7 < 38) {
                if (i8 >= 8) {
                    i8 = 0;
                }
                bArr7[i7] = (byte) (bArr7[i7] ^ bArr8[i8]);
                i7++;
                i8++;
            }
            new String(bArr7, StandardCharsets.UTF_8);
            if (bs != null) {
                bs.d(null);
                bs.h(false);
                return;
            }
            return;
        }
        x0.k();
        if (!j5.i && x0.r().o != null) {
            C2443Gk c2443Gk = x0.r().o;
            c2443Gk.getClass();
        }
        Tm0 tm0 = (Tm0) q((C3491g4) j5.f3354a);
        if (tm0 == null || (appOpenAd = tm0.f3792a) == null || !U((C3491g4) j5.f3354a)) {
            this.n = false;
            byte[] bArr9 = {-91, 58, 17, 23, -119, -35, 97, -40, -128, 106, 7, 57, -112, -44, 47, -19, -117, 106, 18, 48, -106, -49};
            byte[] bArr10 = {-28, 74, 97, 88, -7, -72, com.umeng.analytics.pro.cw.m, -103};
            int i9 = 0;
            int i10 = 0;
            while (i9 < 22) {
                if (i10 >= 8) {
                    i10 = 0;
                }
                bArr9[i9] = (byte) (bArr9[i9] ^ bArr10[i10]);
                i9++;
                i10++;
            }
            new String(bArr9, StandardCharsets.UTF_8);
            R((Context) weakReference.get(), (C3491g4) j5.f3354a, j5.c, null);
            if (bs != null) {
                bs.d(null);
                bs.h(false);
                return;
            }
            return;
        }
        if (bs != null) {
            bs.e(tm0);
        }
        byte[] bArr11 = {-121, -25, 83, 67, -118, 4, -54, -123, -94, -73, 84, 101, -106, com.umeng.analytics.pro.cw.k, -124, -73, -82, -8, 84, 34};
        byte[] bArr12 = {-58, -105, 35, 12, -6, 97, -92, -60};
        int i11 = 0;
        int i12 = 0;
        while (i11 < 20) {
            if (i12 >= 8) {
                i12 = 0;
            }
            bArr11[i11] = (byte) (bArr11[i11] ^ bArr12[i12]);
            i11++;
            i12++;
        }
        new String(bArr11, StandardCharsets.UTF_8);
        if (j5.i || !x0.r().h) {
            boolean z = j5.f;
            if (appOpenAd != null) {
                appOpenAd.setImmersiveMode(z);
            }
        } else {
            boolean z2 = x0.r().m;
            if (appOpenAd != null) {
                appOpenAd.setImmersiveMode(z2);
            }
        }
        appOpenAd.setFullScreenContentCallback(new B3(this, weakReference, j5, bs, tm0));
        appOpenAd.show((Activity) weakReference.get());
    }

    public final void X(AbstractApplicationC2673Ph abstractApplicationC2673Ph, C3491g4 c3491g4) {
        this.n = false;
        this.q = 1;
        this.r = 0L;
        ArrayList arrayList = abstractApplicationC2673Ph.c;
        C3313e3 c3313e3 = this.u;
        arrayList.remove(c3313e3);
        ArrayList arrayList2 = abstractApplicationC2673Ph.b;
        C3489g3 c3489g3 = this.B;
        arrayList2.remove(c3489g3);
        abstractApplicationC2673Ph.c.add(c3313e3);
        arrayList2.add(c3489g3);
        R(abstractApplicationC2673Ph.getApplicationContext(), c3491g4, false, null);
        X0 x0 = X0.j;
        if (x0.r().j == -1 || x0.r().p != null) {
            return;
        }
        x0.r().p = new C3751j3(this, 0);
    }

    public final void Y(Activity activity, J5 j5, BS bs) {
        int i = j5.e;
        WeakReference weakReference = new WeakReference(activity);
        this.s = new WeakReference(j5);
        C3225d3 c3225d3 = new C3225d3(this, i, j5, bs);
        if (i == 0) {
            W((Activity) weakReference.get(), j5, c3225d3);
            return;
        }
        Dialog dialog = j5.g;
        if (i == 1) {
            if (dialog != null) {
                long j = ((Om0) C3044b1.b.k()).b;
                long j2 = j5.h;
                if (!Jn0.V(j - j2)) {
                    X0 x0 = X0.j;
                    if (x0.r().p != null && this.o != null) {
                        try {
                            C3751j3 c3751j3 = x0.r().p;
                            c3751j3.a();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    this.x = false;
                    if (bs != null) {
                        bs.d(null);
                        bs.h(false);
                        return;
                    }
                    return;
                }
                if (U((C3491g4) j5.f3354a)) {
                    if (!dialog.isShowing()) {
                        dialog.show();
                    }
                    C4981x20.u().v(j2, new RunnableC3136c3(this, j5, weakReference, c3225d3, bs));
                    return;
                }
            }
        } else if (i == 2 && dialog != null && !U((C3491g4) j5.f3354a)) {
            W((Activity) weakReference.get(), j5, c3225d3);
            return;
        }
        W((Activity) weakReference.get(), j5, c3225d3);
    }

    public final boolean Z() {
        WeakReference weakReference = this.o;
        return (weakReference == null || weakReference.get() == null || (this.o.get() instanceof AdActivity) || X0.j.r().c.contains(((Activity) this.o.get()).getClass())) ? false : true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3504gB
    public final void k(Context context, C9 c9, InterfaceC5085yB interfaceC5085yB) {
        I5 i5 = (I5) c9;
        C4806v3 c4806v3 = (C4806v3) interfaceC5085yB;
        X0 x0 = X0.j;
        x0.h();
        if (context == null) {
            return;
        }
        C3044b1.b.k().getClass();
        if (x0.r().o != null) {
            C2443Gk c2443Gk = x0.r().o;
            WeakReference weakReference = this.o;
            if (weakReference != null) {
            }
            c2443Gk.getClass();
        }
        if (((Om0) x0.k()).l) {
            byte[] bArr = {120, 51, 86, 22, 35, 125, -7, -51, 110, 48, 86, 68, 106, 57, -28, -113, 46, 100, 75, 78, 106, 52, -32, -113, 46, 102, 79, 88, 106, 63, -31, -118, 40, 107, 78, 78, 97, 60};
            byte[] bArr2 = {27, 82, 123, 119, 83, com.umeng.analytics.pro.cw.k, -44, -67};
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
            ((C3491g4) i5.f3354a).H(1, new String(bArr, StandardCharsets.UTF_8));
        } else {
            C3491g4 c3491g4 = (C3491g4) i5.f3354a;
            boolean z = i5.c;
            AbstractC4103n3.H(context, c3491g4, z ? AbstractC3661i1.b : AbstractC3661i1.d, z ? AbstractC3661i1.n : AbstractC3661i1.o);
        }
        ((C3491g4) i5.f3354a).L(x0.r() == null ? 14040000L : x0.r().g);
        WeakReference weakReference2 = new WeakReference(context.getApplicationContext());
        if (weakReference2.get() == null || TextUtils.isEmpty(((C3491g4) i5.f3354a).w(1))) {
            byte[] bArr3 = {-27, -114, 114, -61, -121, 95, -83, 126, -64, -34, 110, -29, -106, 94, -126, 91, -124, -119, 100, -45, -76, 85, -83, 75, -63, -122, 118, -94, -112, 95, -73, 23, -115, -34, 63, -79, -41, 84, -74, 83, -56, -34, 126, -16, -41, 83, -89, 107, -59, -103, 86, -29, -94, 73, -90, 17, -51, -115, 71, -31, -121, 78, -70, 23, -115};
            byte[] bArr4 = {-92, -2, 2, -116, -9, 58, -61, 63};
            int i3 = 0;
            int i4 = 0;
            while (i3 < 65) {
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
        synchronized (this.b) {
            try {
                if (!i5.d) {
                    if (S((C3491g4) i5.f3354a)) {
                        byte[] bArr5 = {125, 82, -87, 127, -112, com.umeng.analytics.pro.cw.m, -37, 105, 88, 2, -74, 94, -95, com.umeng.analytics.pro.cw.l, -7, 71, 93, 70, -68, 84};
                        byte[] bArr6 = {60, 34, -39, 48, -32, 106, -75, 40};
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < 20) {
                            if (i7 >= 8) {
                                i7 = 0;
                            }
                            bArr5[i6] = (byte) (bArr5[i6] ^ bArr6[i7]);
                            i6++;
                            i7++;
                        }
                        new String(bArr5, StandardCharsets.UTF_8);
                        if (c4806v3 != null) {
                            c4806v3.b((InterfaceC3592hB) q((C3491g4) i5.f3354a));
                        }
                        return;
                    }
                    if (((C3491g4) i5.f3354a).z() == 0) {
                        byte[] bArr7 = {-93, 73, -113, -120, -118, 118, 81, -119, -122, 25, -109, -88, -101, 119, 126, -84, -62, 87, -112, -77, -38, 125, 90, -83, -122, 25, -115, -94, -106, 124, 94, -84};
                        byte[] bArr8 = {-30, 57, -1, -57, -6, 19, 63, -56};
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < 32) {
                            if (i9 >= 8) {
                                i9 = 0;
                            }
                            bArr7[i8] = (byte) (bArr7[i8] ^ bArr8[i9]);
                            i8++;
                            i9++;
                        }
                        new String(bArr7, StandardCharsets.UTF_8);
                        this.g = c4806v3;
                        return;
                    }
                }
                ((C3491g4) i5.f3354a).M(0);
                i5.d = false;
                this.n = false;
                B((C3491g4) i5.f3354a);
                A((C3491g4) i5.f3354a);
                byte[] bArr9 = {-12, -43, -53, 11, -39, 35, 32, -82, -47, -123, -41, 43, -56, 34, com.umeng.analytics.pro.cw.m, -117};
                byte[] bArr10 = {-75, -91, -69, 68, -87, 70, 78, -17};
                int i10 = 0;
                int i11 = 0;
                while (i10 < 16) {
                    if (i11 >= 8) {
                        i11 = 0;
                    }
                    bArr9[i10] = (byte) (bArr9[i10] ^ bArr10[i11]);
                    i10++;
                    i11++;
                }
                new String(bArr9, StandardCharsets.UTF_8);
                if (x0.r().o != null) {
                    C2443Gk c2443Gk2 = x0.r().o;
                    WeakReference weakReference3 = this.o;
                    if (weakReference3 != null) {
                    }
                    this.k.get();
                    ((C3491g4) i5.f3354a).z();
                    c2443Gk2.getClass();
                }
                C4981x20.u().q(new SP(this, i5, weakReference2, c4806v3, context, 4));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final int p() {
        return 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final AbstractC4642t9 r() {
        return X0.j.r();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final C9 s(C3491g4 c3491g4) {
        return new I5(c3491g4, false, false);
    }
}
