package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class X0 extends AbstractC3306e {
    public static final X0 j = new X0();
    public final String f = X0.class.getSimpleName();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public FS i = null;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final InterfaceC4733uB a() {
        return C4982x3.X();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final int b() {
        return 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final DB c() {
        return C3293do0.v;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final InterfaceC3854kB e() {
        return new Cm0();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final InterfaceC3680iB f() {
        return C4082mn0.v;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final InterfaceC4909wB i() {
        return C3.Z();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final InterfaceC3328eB l(E80 e80) {
        h();
        if (this.d == null) {
            byte[] bArr = {-2, -25, -67, -103, -127, 46, -108, -40, -53, -20, -24, -36, -118, 35, -104, -40, -45, -19, -24, -101, -77, 34, -71, -40, -50, -28, -84, -1, -109, 37, -113, -62, -43, -15, -26, -34, -105, 50, -70, -55, -27, -3, -95, -43, -106, 35, -119, -123, -114, -90, -86, -52, -101, 42, -97, -123, -58, -8, -72, -107, -46, 39, -97, -17, -46, -31, -92, -35, -105, 52, -46, -113, -121, -18, -95, -53, -127, 50, -105, -44, -122};
            byte[] bArr2 = {-89, -120, -56, -71, -14, 70, -5, -83};
            int i = 0;
            int i2 = 0;
            while (i < 81) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
        } else {
            byte[] bArr3 = {-90, 75, 2, -111, 62, -126, -73, -111, -110, 70, 47, -111, 54, -97, -11, -93, -107, 74, 47, -102, 50, -119, -108, -73, -108};
            byte[] bArr4 = {-25, 47, 67, -11, 83, -19, -43, -45};
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
            C4982x3.X().getClass();
            if (C4982x3.Y()) {
                C4982x3.X().getClass();
                C4982x3.Z().h.G();
            }
            if (n().d != null) {
                n().d.G();
            }
            n().getClass();
            if (r().d != null) {
                r().d.G();
            }
            if (o().d != null) {
                o().d.G();
            }
            if (t().d != null) {
                t().d.G();
            }
            Iterator it = ((Om0) k()).h.c.iterator();
            while (it.hasNext()) {
                ((J9) it.next()).c.G();
            }
            Iterator it2 = s().c.iterator();
            while (it2.hasNext()) {
                ((J9) it2.next()).c.G();
            }
            C4982x3.X().getClass();
            if (C4982x3.Y()) {
                C4982x3 c4982x3X = C4982x3.X();
                AbstractApplicationC2673Ph abstractApplicationC2673Ph = this.d;
                c4982x3X.getClass();
                c4982x3X.W(abstractApplicationC2673Ph, new C2372Dr(C4982x3.Z().h, false, true));
                if (n().d != null) {
                    C3.Z().L(this.d, n().d);
                }
            } else {
                C3 c3Z = C3.Z();
                AbstractApplicationC2673Ph abstractApplicationC2673Ph2 = this.d;
                synchronized (c3Z.b) {
                    c3Z.X(abstractApplicationC2673Ph2, null);
                }
            }
            int i5 = ((Om0) k()).m;
            int i6 = ((Om0) k()).n;
            C3491g4 c3491g4 = new C3491g4(this, e80);
            Handler handler = new Handler();
            handler.postDelayed(new RunnableC4139nW(c3491g4, System.currentTimeMillis(), i5, handler), i6);
        }
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3328eB
    public final RB m() {
        return H3.n;
    }

    public final void p(AbstractApplicationC2673Ph abstractApplicationC2673Ph, Activity activity, final FS fs) {
        final int i = 1;
        h();
        byte[] bArr = {114, -105, 36, 54, 73, 112, 64, -8, 121, -86, 9, 9, 50, 52};
        byte[] bArr2 = {27, -7, 77, 66, 8, 20, 45, -105};
        int i2 = 0;
        int i3 = 0;
        while (i2 < 14) {
            if (i3 >= 8) {
                i3 = 0;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
            i2++;
            i3++;
        }
        Charset charset = StandardCharsets.UTF_8;
        new String(bArr, charset);
        if (!this.f4299a.getAndSet(true)) {
            if (abstractApplicationC2673Ph.d()) {
                if (((Om0) k()).k) {
                    RequestConfiguration.Builder tagForChildDirectedTreatment = new RequestConfiguration.Builder().setTagForChildDirectedTreatment(1);
                    byte[] bArr3 = {45};
                    bArr3[0] = (byte) (new byte[]{106, 73, -7, 79, -125, -37, 21, 94}[0] ^ bArr3[0]);
                    MobileAds.setRequestConfiguration(tagForChildDirectedTreatment.setMaxAdContentRating(new String(bArr3, charset)).build());
                }
                try {
                    MobileAds.initialize(abstractApplicationC2673Ph.getApplicationContext(), new OnInitializationCompleteListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.T0
                        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                        public final void onInitializationComplete(InitializationStatus initializationStatus) {
                            this.f3745a.getClass();
                            C2328Bz.u().j(new Ff0(24, fs, initializationStatus));
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    C2328Bz.u().j(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i;
                            FS fs2 = fs;
                            switch (i4) {
                                case 1:
                                    if (fs2 != null) {
                                        fs2.a(new C2404Ex(false, true, null));
                                    }
                                    break;
                                default:
                                    if (fs2 != null) {
                                        fs2.a(new C2404Ex(false, false, null));
                                    }
                                    break;
                            }
                        }
                    });
                }
            } else {
                final int i4 = 2;
                C2328Bz.u().j(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i4;
                        FS fs2 = fs;
                        switch (i5) {
                            case 1:
                                if (fs2 != null) {
                                    fs2.a(new C2404Ex(false, true, null));
                                }
                                break;
                            default:
                                if (fs2 != null) {
                                    fs2.a(new C2404Ex(false, false, null));
                                }
                                break;
                        }
                    }
                });
            }
        }
        if (activity == null || !(activity instanceof InterfaceC3766jB) || this.c.getAndSet(true)) {
            return;
        }
        C2328Bz.u().j(new P0(activity, i));
    }

    public final InterfaceC3328eB q(final App app, InterfaceC3416fB interfaceC3416fB) {
        int i = 8;
        final int i2 = 1;
        this.g.set(true);
        final int i3 = 0;
        if (!(interfaceC3416fB instanceof Om0)) {
            byte[] bArr = {-64, 111, 87, com.umeng.analytics.pro.cw.m, -7, 62, 39, -2, -29, 126, 125, 12, -13, 61, 60, -71, -52, 126, 103, 20, -73, 58, 43, -71, -32, 111, 87, com.umeng.analytics.pro.cw.m, -7, 62, 39, -2, -29, 126, 125, 12, -13, 61, 60};
            byte[] bArr2 = {-95, 11, 20, 96, -105, 88, 78, -103};
            int i4 = 0;
            int i5 = 0;
            while (i4 < 39) {
                if (i5 >= 8) {
                    i5 = 0;
                }
                bArr[i4] = (byte) (bArr[i4] ^ bArr2[i5]);
                i4++;
                i5++;
            }
            throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8));
        }
        this.d = app;
        this.e = (Om0) interfaceC3416fB;
        AtomicBoolean atomicBoolean = this.h;
        boolean andSet = atomicBoolean.getAndSet(true);
        ArrayList arrayList = app.c;
        if (!andSet) {
            arrayList.add(new C3994ln0());
        }
        h();
        if (!atomicBoolean.getAndSet(true)) {
            arrayList.add(new C3994ln0());
        }
        C2328Bz.u().t(new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N0
            public final /* synthetic */ X0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                int i6 = i3;
                AbstractApplicationC2673Ph abstractApplicationC2673Ph = app;
                X0 x0 = this.b;
                switch (i6) {
                    case 0:
                        StringBuilder sb = new StringBuilder();
                        sb.append(((Om0) x0.k()).p);
                        byte[] bArr3 = {-56};
                        bArr3[0] = (byte) (new byte[]{-105, 31, 36, 91, -54, -54, -76, 81}[0] ^ bArr3[0]);
                        sb.append(new String(bArr3, StandardCharsets.UTF_8));
                        try {
                            str = abstractApplicationC2673Ph.getPackageManager().getPackageInfo(abstractApplicationC2673Ph.getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException e) {
                            e.printStackTrace();
                            str = "";
                        }
                        sb.append(str);
                        String string = sb.toString();
                        StringBuilder sbO = DM.o(string);
                        byte[] bArr4 = {-16, -72, -1, 35, 123, -87, -29};
                        byte[] bArr5 = {-81, -22, -98, 77, 31, -58, -114, 79};
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < 7) {
                            if (i8 >= 8) {
                                i8 = 0;
                            }
                            bArr4[i7] = (byte) (bArr4[i7] ^ bArr5[i8]);
                            i7++;
                            i8++;
                        }
                        sbO.append(new String(bArr4, StandardCharsets.UTF_8));
                        String string2 = sbO.toString();
                        double d = ((Om0) x0.k()).q;
                        AtomicBoolean atomicBoolean2 = x0.b;
                        if (d < 1.0d) {
                            float fI = AbstractC2995aW.I(abstractApplicationC2673Ph, string, ((Om0) x0.k()).q);
                            float fI2 = AbstractC2995aW.I(abstractApplicationC2673Ph, string2, -1.0f);
                            if (fI2 < 0.0f || fI2 > 1.0f) {
                                fI2 = (new Random().nextInt(100) * 1.0f) / 100.0f;
                                SharedPreferences.Editor editorH = AbstractC2995aW.H(abstractApplicationC2673Ph);
                                editorH.putFloat(string2, fI2);
                                editorH.commit();
                            }
                            atomicBoolean2.set(fI >= fI2);
                        } else {
                            atomicBoolean2.set(true);
                        }
                        AbstractC4969wu.a(new W0(x0, abstractApplicationC2673Ph, string, string2));
                        break;
                    default:
                        String str2 = ((Om0) x0.k()).o;
                        long j2 = ((Om0) x0.k()).b;
                        SharedPreferences sharedPreferences = abstractApplicationC2673Ph.getSharedPreferences(AbstractC2995aW.O(abstractApplicationC2673Ph), 0);
                        if (sharedPreferences.contains(str2)) {
                            j2 = sharedPreferences.getLong(str2, j2);
                        }
                        ((Om0) x0.k()).b = j2;
                        AbstractC4969wu.a(new V0(x0, abstractApplicationC2673Ph));
                        break;
                }
            }
        });
        h();
        C2328Bz.u().t(new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N0
            public final /* synthetic */ X0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                int i6 = i2;
                AbstractApplicationC2673Ph abstractApplicationC2673Ph = app;
                X0 x0 = this.b;
                switch (i6) {
                    case 0:
                        StringBuilder sb = new StringBuilder();
                        sb.append(((Om0) x0.k()).p);
                        byte[] bArr3 = {-56};
                        bArr3[0] = (byte) (new byte[]{-105, 31, 36, 91, -54, -54, -76, 81}[0] ^ bArr3[0]);
                        sb.append(new String(bArr3, StandardCharsets.UTF_8));
                        try {
                            str = abstractApplicationC2673Ph.getPackageManager().getPackageInfo(abstractApplicationC2673Ph.getPackageName(), 0).versionName;
                        } catch (PackageManager.NameNotFoundException e) {
                            e.printStackTrace();
                            str = "";
                        }
                        sb.append(str);
                        String string = sb.toString();
                        StringBuilder sbO = DM.o(string);
                        byte[] bArr4 = {-16, -72, -1, 35, 123, -87, -29};
                        byte[] bArr5 = {-81, -22, -98, 77, 31, -58, -114, 79};
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < 7) {
                            if (i8 >= 8) {
                                i8 = 0;
                            }
                            bArr4[i7] = (byte) (bArr4[i7] ^ bArr5[i8]);
                            i7++;
                            i8++;
                        }
                        sbO.append(new String(bArr4, StandardCharsets.UTF_8));
                        String string2 = sbO.toString();
                        double d = ((Om0) x0.k()).q;
                        AtomicBoolean atomicBoolean2 = x0.b;
                        if (d < 1.0d) {
                            float fI = AbstractC2995aW.I(abstractApplicationC2673Ph, string, ((Om0) x0.k()).q);
                            float fI2 = AbstractC2995aW.I(abstractApplicationC2673Ph, string2, -1.0f);
                            if (fI2 < 0.0f || fI2 > 1.0f) {
                                fI2 = (new Random().nextInt(100) * 1.0f) / 100.0f;
                                SharedPreferences.Editor editorH = AbstractC2995aW.H(abstractApplicationC2673Ph);
                                editorH.putFloat(string2, fI2);
                                editorH.commit();
                            }
                            atomicBoolean2.set(fI >= fI2);
                        } else {
                            atomicBoolean2.set(true);
                        }
                        AbstractC4969wu.a(new W0(x0, abstractApplicationC2673Ph, string, string2));
                        break;
                    default:
                        String str2 = ((Om0) x0.k()).o;
                        long j2 = ((Om0) x0.k()).b;
                        SharedPreferences sharedPreferences = abstractApplicationC2673Ph.getSharedPreferences(AbstractC2995aW.O(abstractApplicationC2673Ph), 0);
                        if (sharedPreferences.contains(str2)) {
                            j2 = sharedPreferences.getLong(str2, j2);
                        }
                        ((Om0) x0.k()).b = j2;
                        AbstractC4969wu.a(new V0(x0, abstractApplicationC2673Ph));
                        break;
                }
            }
        });
        final C2351Cw c2351Cw = null;
        if (this.f4299a.get()) {
            C2328Bz.u().j(new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L0
                public final /* synthetic */ X0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = i3;
                    AbstractApplicationC2673Ph abstractApplicationC2673Ph = app;
                    FS fs = c2351Cw;
                    X0 x0 = this.b;
                    x0.getClass();
                    switch (i6) {
                        case 0:
                            C3927l3.C.X(abstractApplicationC2673Ph, x0.r().d);
                            if (fs != null) {
                                fs.a(new C2404Ex(true, abstractApplicationC2673Ph.d(), null));
                            }
                            break;
                        default:
                            M0 m0 = new M0(fs, 0);
                            x0.i = m0;
                            x0.k();
                            x0.k();
                            if (!((Om0) x0.k()).v || !XI.b(abstractApplicationC2673Ph)) {
                                x0.u(abstractApplicationC2673Ph, null, m0);
                            }
                            break;
                    }
                }
            });
        } else {
            final C2351Cw c2351Cw2 = new C2351Cw(this, c2351Cw, app, i);
            C2328Bz.u().t(new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L0
                public final /* synthetic */ X0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = i2;
                    AbstractApplicationC2673Ph abstractApplicationC2673Ph = app;
                    FS fs = c2351Cw2;
                    X0 x0 = this.b;
                    x0.getClass();
                    switch (i6) {
                        case 0:
                            C3927l3.C.X(abstractApplicationC2673Ph, x0.r().d);
                            if (fs != null) {
                                fs.a(new C2404Ex(true, abstractApplicationC2673Ph.d(), null));
                            }
                            break;
                        default:
                            M0 m0 = new M0(fs, 0);
                            x0.i = m0;
                            x0.k();
                            x0.k();
                            if (!((Om0) x0.k()).v || !XI.b(abstractApplicationC2673Ph)) {
                                x0.u(abstractApplicationC2673Ph, null, m0);
                            }
                            break;
                    }
                }
            });
        }
        return this;
    }

    public final H5 r() {
        return ((Om0) k()).g;
    }

    public final QQ s() {
        return ((Om0) k()).j;
    }

    public final UZ t() {
        return ((Om0) k()).f;
    }

    public final void u(final AbstractApplicationC2673Ph abstractApplicationC2673Ph, final Activity activity, FS fs) {
        final M0 m0 = new M0(fs, 1);
        if (!this.g.get()) {
            final int i = 1;
            C2328Bz.u().j(new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R0
                public final /* synthetic */ X0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    FS fs2 = m0;
                    Activity activity2 = activity;
                    AbstractApplicationC2673Ph abstractApplicationC2673Ph2 = abstractApplicationC2673Ph;
                    X0 x0 = this.b;
                    switch (i2) {
                        case 0:
                            x0.p(abstractApplicationC2673Ph2, activity2, fs2);
                            break;
                        default:
                            x0.p(abstractApplicationC2673Ph2, activity2, fs2);
                            break;
                    }
                }
            });
        } else if (!C2328Bz.u().n()) {
            p(abstractApplicationC2673Ph, activity, m0);
        } else {
            final int i2 = 0;
            C2328Bz.u().t(new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R0
                public final /* synthetic */ X0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    FS fs2 = m0;
                    Activity activity2 = activity;
                    AbstractApplicationC2673Ph abstractApplicationC2673Ph2 = abstractApplicationC2673Ph;
                    X0 x0 = this.b;
                    switch (i3) {
                        case 0:
                            x0.p(abstractApplicationC2673Ph2, activity2, fs2);
                            break;
                        default:
                            x0.p(abstractApplicationC2673Ph2, activity2, fs2);
                            break;
                    }
                }
            });
        }
    }
}
