package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.rewarded.RewardedAd;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class H3 extends AbstractC4630t3 {
    public static final H3 n = new H3(0);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4630t3
    public final void V(Activity activity, RewardedAd rewardedAd, XZ xz, InterfaceC4821vB interfaceC4821vB) {
        QI qi = (QI) interfaceC4821vB;
        if (rewardedAd == null || new WeakReference(activity).get() == null) {
            return;
        }
        Y(activity, rewardedAd, xz, qi);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4630t3
    public final void W(AppCompatActivity appCompatActivity, XZ xz, QI qi) {
        X0 x0 = X0.j;
        x0.h();
        WeakReference weakReference = new WeakReference(appCompatActivity);
        if (weakReference.get() == null || ((C3491g4) xz.f3354a) == null) {
            byte[] bArr = {-17, -101, 70, 113, -110, 88, -21, 44, -4, -102, 17, 103, -122, 99, -19, 39, -45, -118, 84, 104, -108, 28, -14, 104, -4, -102, 120, 116, -109, 28, -77, 104, -45, -117, 93, 124};
            byte[] bArr2 = {-67, -2, 49, com.umeng.analytics.pro.cw.n, -32, 60, -114, 72};
            int i = 0;
            int i2 = 0;
            while (i < 36) {
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
        C(x0.j(), (C3491g4) xz.f3354a, (String) xz.b);
        if (AbstractC4170nn0.i) {
            byte[] bArr3 = {-74, 103, 46, 120, -8, 3, 76, -80, -91, 102, 121, 95, -1, 11, 69, -89, -121, 112, 60, 124, -28, 71, 104, -80, -60, 107, 42, 57, -7, com.umeng.analytics.pro.cw.m, 70, -93, -115, 108, 62, 57, -28, 8, 94};
            byte[] bArr4 = {-28, 2, 89, 25, -118, 103, 41, -44};
            int i3 = 0;
            int i4 = 0;
            while (i3 < 39) {
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
        Bn0 bn0 = q((C3491g4) xz.f3354a) != null ? (Bn0) q((C3491g4) xz.f3354a) : null;
        this.m = null;
        if (bn0 != null && U((C3491g4) xz.f3354a)) {
            byte[] bArr5 = {-64, 52, -6, -123, -103, -104, -99, -40, -45, 53, -83, -73, -125, -109, -113, -100, -45, 21, -83, -105, -98, -97, -101, -39, -31, 34, -21, -111, -121, -112, -127};
            byte[] bArr6 = {-110, 81, -115, -28, -21, -4, -8, -68};
            int i5 = 0;
            int i6 = 0;
            while (i5 < 31) {
                if (i6 >= 8) {
                    i6 = 0;
                }
                bArr5[i5] = (byte) (bArr5[i5] ^ bArr6[i6]);
                i5++;
                i6++;
            }
            new String(bArr5, StandardCharsets.UTF_8);
            RewardedAd rewardedAd = bn0.k;
            if (rewardedAd != null) {
                rewardedAd.setImmersiveMode(xz.e);
            }
            Y(appCompatActivity, rewardedAd, xz, qi);
            return;
        }
        byte[] bArr7 = {32, -83, -66, -105, 52, 77, 87, 29, 51, -84, -23, -112, 39, 64, 94, 89, 6, -89, -23, -123, 46, 70, 69, 89, 72, -24, -91, -103, 39, 77, 115, 29, 59, -82, -121, -103, 50, 101, 93, 24, 22, -83, -83};
        byte[] bArr8 = {114, -56, -55, -10, 70, 41, 50, 121};
        int i7 = 0;
        int i8 = 0;
        while (i7 < 43) {
            if (i8 >= 8) {
                i8 = 0;
            }
            bArr7[i7] = (byte) (bArr7[i7] ^ bArr8[i8]);
            i7++;
            i8++;
        }
        new String(bArr7, StandardCharsets.UTF_8);
        if (!xz.g) {
            L(((Activity) weakReference.get()).getApplicationContext(), (C3491g4) xz.f3354a);
            return;
        }
        WeakReference weakReference2 = new WeakReference((Activity) weakReference.get());
        if (weakReference2.get() == null) {
            return;
        }
        Activity activity = (Activity) weakReference2.get();
        this.m = xz;
        Dialog dialog = xz.f;
        if (dialog != null) {
            dialog.show();
        }
        E3 e3 = new E3(this, new C4542s3(this, xz, qi, activity));
        if (((C3491g4) xz.f3354a).z() == 0) {
            this.g = e3;
        } else {
            R(((Activity) weakReference2.get()).getApplicationContext(), (C3491g4) xz.f3354a, false, e3);
        }
    }

    public final void Y(Activity activity, RewardedAd rewardedAd, XZ xz, QI qi) {
        WeakReference weakReference = new WeakReference(activity);
        if (weakReference.get() != null && ((C3491g4) xz.f3354a) != null) {
            rewardedAd.setFullScreenContentCallback(new G3(this, xz, weakReference, qi, rewardedAd));
            rewardedAd.show((Activity) weakReference.get(), new C4568sM(this, xz));
            return;
        }
        byte[] bArr = {-113, -12, -54, -76, 5, 91, -111, 88, -100, -11, -99, -94, 17, 96, -105, 83, -77, -27, -40, -83, 3, 31, -120, 28, -100, -11, -12, -79, 4, 31, -55, 28, -77, -28, -47, -71};
        byte[] bArr2 = {-35, -111, -67, -43, 119, 63, -12, 60};
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
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3504gB
    public final void k(Context context, C9 c9, InterfaceC5085yB interfaceC5085yB) {
        VZ vz = (VZ) c9;
        NS ns = (NS) interfaceC5085yB;
        X0 x0 = X0.j;
        x0.h();
        if (context == null) {
            if (ns != null) {
                ns.a(null);
                return;
            }
            return;
        }
        if (!AbstractC3221d1.a()) {
            byte[] bArr = {-75, 120, -24, 24, 66, 53, 63, 79, -122, 121, -65, 21, 95, 48, 62, 11, -94, 111, -19, 22, 66, 125, 122, 74, -79, 124, -10, 21, 81, 51, 54, 78, -25, 110, -17, 24, 83, 52, 122, 69, -88, 105, -65, 28, 94, 62, 47, 76, -81, -14, 35, -8, -33, -19, -37};
            byte[] bArr2 = {-57, 29, -97, 121, 48, 81, 90, 43};
            int i = 0;
            int i2 = 0;
            while (i < 55) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            if (ns != null) {
                ns.a(null);
                return;
            }
            return;
        }
        if (((Om0) x0.k()).l) {
            byte[] bArr3 = {30, -30, 63, 22, 52, -111, -125, 37, 8, -31, 63, 68, 125, -43, -98, 103, 72, -75, 34, 78, 125, -40, -102, 103, 72, -73, 38, 88, 113, -45, -100, 97, 78, -74, 38, 78, 117, -42};
            byte[] bArr4 = {125, -125, 18, 119, 68, -31, -82, 85};
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 38; i3 < i5; i5 = 38) {
                if (i4 >= 8) {
                    i4 = 0;
                }
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                i3++;
                i4++;
            }
            ((C3491g4) vz.f3354a).H(1, new String(bArr3, StandardCharsets.UTF_8));
        } else {
            AbstractC4103n3.H(context, (C3491g4) vz.f3354a, AbstractC3661i1.j, AbstractC3661i1.u);
        }
        WeakReference weakReference = new WeakReference(context.getApplicationContext());
        if (weakReference.get() == null || TextUtils.isEmpty(((C3491g4) vz.f3354a).w(1))) {
            if (ns != null) {
                ns.a(null);
                return;
            }
            return;
        }
        ((C3491g4) vz.f3354a).L(x0.o() == null ? 3000000L : x0.o().g);
        ((C3491g4) vz.f3354a).L(x0.o().g);
        synchronized (this.b) {
            try {
                if (!vz.d) {
                    if (S((C3491g4) vz.f3354a)) {
                        byte[] bArr5 = {23, -44, -108, 9, -124, -67, -31, 45, 4, -43, -61, 7, -104, -104, -32, 5, 42, -48, -121, com.umeng.analytics.pro.cw.k, -110};
                        byte[] bArr6 = {69, -79, -29, 104, -10, -39, -124, 73};
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < 21) {
                            if (i7 >= 8) {
                                i7 = 0;
                            }
                            bArr5[i6] = (byte) (bArr5[i6] ^ bArr6[i7]);
                            i6++;
                            i7++;
                        }
                        new String(bArr5, StandardCharsets.UTF_8);
                        if (ns != null) {
                            ns.b((Bn0) q((C3491g4) vz.f3354a));
                        }
                        return;
                    }
                    if (((C3491g4) vz.f3354a).z() == 0) {
                        byte[] bArr7 = {7, -122, -31, 123, 49, 8, -88, -26, 20, -121, -74, 118, 44, com.umeng.analytics.pro.cw.k, -87, -61, 49, -61, -8, 117, 55, 76, -93, -25, 48, -121, -74, 104, 38, 0, -94, -29, 49};
                        byte[] bArr8 = {85, -29, -106, 26, 67, 108, -51, -126};
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < 33) {
                            if (i9 >= 8) {
                                i9 = 0;
                            }
                            bArr7[i8] = (byte) (bArr7[i8] ^ bArr8[i9]);
                            i8++;
                            i9++;
                        }
                        new String(bArr7, StandardCharsets.UTF_8);
                        this.g = ns;
                        return;
                    }
                }
                ((C3491g4) vz.f3354a).M(0);
                vz.d = false;
                this.e.put((C3491g4) vz.f3354a, Boolean.FALSE);
                B((C3491g4) vz.f3354a);
                A((C3491g4) vz.f3354a);
                byte[] bArr9 = {-22, 124, 9, -82, 111, 100, -36, 105, -7, 125, 94, -93, 114, 97, -35, 76, -36};
                byte[] bArr10 = {-72, 25, 126, -49, 29, 0, -71, com.umeng.analytics.pro.cw.k};
                int i10 = 0;
                int i11 = 0;
                while (i10 < 17) {
                    if (i11 >= 8) {
                        i11 = 0;
                    }
                    bArr9[i10] = (byte) (bArr9[i10] ^ bArr10[i11]);
                    i10++;
                    i11++;
                }
                new String(bArr9, StandardCharsets.UTF_8);
                C4981x20.u().q(new SP(this, vz, weakReference, ns, context, 5));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final int p() {
        return 5;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final AbstractC4642t9 r() {
        return X0.j.o();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3570h
    public final C9 s(C3491g4 c3491g4) {
        return new VZ(c3491g4, false, false);
    }
}
