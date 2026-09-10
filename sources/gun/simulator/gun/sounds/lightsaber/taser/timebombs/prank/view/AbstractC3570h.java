package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.AdView;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3570h implements InterfaceC3504gB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4440a = getClass().getSimpleName();
    public final Object b = new Object();
    public final ArrayMap c = new ArrayMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public static void m(AdView adView, ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        try {
            if (viewGroup instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(layoutParams3);
                layoutParams4.gravity = 1;
                layoutParams2 = layoutParams4;
            } else if (viewGroup instanceof LinearLayout) {
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(layoutParams3);
                layoutParams5.gravity = 1;
                layoutParams2 = layoutParams5;
            } else {
                if (!(viewGroup instanceof RelativeLayout)) {
                    if (viewGroup instanceof ConstraintLayout) {
                        layoutParams = layoutParams3;
                        ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(layoutParams3);
                        layoutParams6.startToStart = 0;
                        layoutParams6.endToEnd = 0;
                        layoutParams2 = layoutParams6;
                    }
                    layoutParams = layoutParams3;
                    viewGroup.addView(adView, 0, layoutParams);
                    return;
                }
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(layoutParams3);
                layoutParams7.addRule(14);
                layoutParams2 = layoutParams7;
            }
            layoutParams = layoutParams3;
            viewGroup.addView(adView, 0, layoutParams);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        layoutParams = layoutParams2;
    }

    public static boolean u() {
        Context contextJ = C3044b1.b.j();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Qm0.D(new byte[]{117, -113, 81, 54, 8, -6, -85, 109, 104, -110}, new byte[]{12, -10, 40, 79, 37, -73, -26, 64}));
        Date date = new Date();
        date.setTime(jCurrentTimeMillis);
        String str = simpleDateFormat.format(date);
        String strD = Qm0.D(new byte[]{2, 8, 116, -95, -113, 71, -30, -12, com.umeng.analytics.pro.cw.k, 2, 88, -76, -76, 123, -6, -12, 3, 12}, new byte[]{110, 105, 7, -43, -48, 36, -114, -99});
        SharedPreferences sharedPreferences = contextJ.getSharedPreferences(AbstractC2995aW.O(contextJ), 0);
        date.setTime(sharedPreferences.contains(strD) ? sharedPreferences.getLong(strD, 0L) : 0L);
        return str.equals(simpleDateFormat.format(date));
    }

    public static void x() {
        try {
            Context contextJ = C3044b1.b.j();
            Qm0.D(new byte[]{-109, 51, -79, -116, -38, 22, 97, 100, -123, 118, -79, -113, -63, 17, 42, 5, -124, 32, -73, -115, -36}, new byte[]{-31, 86, -46, -29, -88, 114, 65, 37});
            if (u()) {
                AbstractC2995aW.p0(contextJ, AbstractC2995aW.J(contextJ, 0, Qm0.D(new byte[]{-4, 83, 11, -31, -101, 58, -78, -97, -2, 89, 48, -29, -114, 12, -71, -107, -41, 93, 11, -33, -106, 12, -73, -101, -5}, new byte[]{-120, 60, 111, -128, -30, 101, -38, -2})) + 1, Qm0.D(new byte[]{115, 81, 101, -80, 124, -85, 113, 115, 113, 91, 94, -78, 105, -99, 122, 121, 88, 95, 101, -114, 113, -99, 116, 119, 116}, new byte[]{7, 62, 1, -47, 5, -12, 25, 18}));
            } else {
                AbstractC2995aW.p0(contextJ, 1, Qm0.D(new byte[]{-85, 28, 73, -110, -32, 109, 10, -38, -87, 22, 114, -112, -11, 91, 1, -48, -128, 18, 73, -84, -19, 91, com.umeng.analytics.pro.cw.m, -34, -84}, new byte[]{-33, 115, 45, -13, -103, 50, 98, -69}));
            }
            String strD = Qm0.D(new byte[]{10, -46, 87, -64, -29, -63, 54, -120, 5, -40, 123, -43, -40, -3, 46, -120, 11, -42}, new byte[]{102, -77, 36, -76, -68, -94, 90, -31});
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor editorH = AbstractC2995aW.H(contextJ);
            editorH.putLong(strD, jCurrentTimeMillis);
            editorH.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final synchronized void A(Object obj) {
        C4573sR c4573sR;
        if (this.f.get(obj) != null) {
            Context contextJ = C3044b1.b.j();
            JS js = (JS) this.f.get(obj);
            ConcurrentHashMap concurrentHashMap = W1.f3904a;
            if (contextJ != null && js != null) {
                ConcurrentHashMap concurrentHashMap2 = W1.f3904a;
                if (concurrentHashMap2.containsKey(obj)) {
                    concurrentHashMap2.remove(obj);
                    if (concurrentHashMap2.size() == 0 && (c4573sR = W1.b) != null) {
                        c4573sR.f4980a = null;
                        contextJ.getApplicationContext().unregisterReceiver(W1.b);
                        W1.b = null;
                    }
                }
            }
            this.f.remove(obj);
        }
    }

    public final synchronized void B(Object obj) {
        if (this.d.get(obj) != null) {
            byte[] bArr = {97, -60, -110, -125, -93, -51, 3, -62, 103, -45, -122, -96, -70, -55, 53, -13, 114, -46, -108};
            byte[] bArr2 = {19, -95, -1, -20, -43, -88, 81, -89};
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
            C4981x20.u().w((Runnable) this.d.get(obj));
            this.d.remove(obj);
        }
    }

    public final void C(Context context, C3491g4 c3491g4, String str) {
        Qm0.D(new byte[]{-119, -62, 61, 79, 120, 85, 54, 75, -115, -62, 34, 104}, new byte[]{-5, -89, 76, 28, com.umeng.analytics.pro.cw.n, 58, 65, com.umeng.analytics.pro.cw.l});
        o(context, c3491g4, str, Qm0.D(new byte[]{-3, 43, -79, 127, -54, 0, 54}, new byte[]{-81, 78, -64, 44, -94, 111, 65, 49}));
    }

    public final void E(Context context, C3491g4 c3491g4, String str) {
        Qm0.D(new byte[]{-61, 51, 49, -64, -126, -78, -41, 31, -35, 62, 58, -34, -122, -94, -5, 30, -55, 30, 40, -46, -119, -94}, new byte[]{-80, 91, 94, -73, -25, -42, -98, 114});
        o(context, c3491g4, str, Qm0.D(new byte[]{-54, 114, com.umeng.analytics.pro.cw.k, com.umeng.analytics.pro.cw.m, 105, -91, -50, 85, -12, 127, 6, 17, 109, -75, -30, 84, -32}, new byte[]{-103, 26, 98, 120, 12, -63, -121, 56}));
    }

    public final void F(Context context, C3491g4 c3491g4, String str) {
        Qm0.D(new byte[]{-30, -12, -57, -70, 52, -20, -119, 86, -16, -8, -63, -93, 54, -51, -77, 92, -1, -24}, new byte[]{-111, -100, -88, -51, 81, -120, -59, 57});
        o(context, c3491g4, str, Qm0.D(new byte[]{-107, 23, 87, -68, -108, -92, -126, -18, -89, 27, 81, -91, -106}, new byte[]{-58, 127, 56, -53, -15, -64, -50, -127}));
    }

    public final synchronized void G(Context context, C9 c9, Object obj, InterfaceC5085yB interfaceC5085yB) {
        try {
            B(obj);
            C3044b1 c3044b1 = C3044b1.b;
            if (c3044b1.h()) {
                c3044b1.k().getClass();
                byte[] bArr = {98, 55, 111, 62, 121, -128, 5, -52, 117, 23, 111, 63, 102, -101, 2, -60, 125, 38, 72, 45, 100, -96, com.umeng.analytics.pro.cw.m, -55, 43, 99};
                byte[] bArr2 = {17, 67, com.umeng.analytics.pro.cw.l, 76, com.umeng.analytics.pro.cw.k, -52, 106, -83};
                int i = 0;
                int i2 = 0;
                while (i < 26) {
                    if (i2 >= 8) {
                        i2 = 0;
                    }
                    bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                    i++;
                    i2++;
                }
                new String(bArr, StandardCharsets.UTF_8);
                WeakReference weakReference = new WeakReference(context);
                if (!W1.a((Context) weakReference.get()) && !(c9 instanceof C2372Dr)) {
                    A(obj);
                    y(c3044b1.j(), c9, interfaceC5085yB, obj);
                }
                RunnableC3394f runnableC3394f = new RunnableC3394f(this, c9, interfaceC5085yB, obj, weakReference);
                this.d.remove(obj);
                if (obj != null && (!(obj instanceof String) || !TextUtils.isEmpty(obj.toString()))) {
                    this.d.put(obj, runnableC3394f);
                    C4981x20.u().v(t((C3491g4) c9.f3354a), runnableC3394f);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3504gB
    public final void i(Context context, C3491g4 c3491g4, InterfaceC5085yB interfaceC5085yB) {
        if (!C3044b1.b.h()) {
            interfaceC5085yB.a(null);
            return;
        }
        if (v(c3491g4)) {
            k(context, s(c3491g4), interfaceC5085yB);
            return;
        }
        byte[] bArr = {89, -95, 5, -71, -58, -9, -59, 127, 122, -70, 40, -79, -107, -8, -40, 123, 123, -107, com.umeng.analytics.pro.cw.k, -17, -107, -11, -45, 115, 123, -12, 7, -70, -63, -76, -39, 127, 122, -80, 73, -95, -38, -76, -37, 117, 126, -80};
        byte[] bArr2 = {31, -44, 105, -43, -75, -108, -73, 26};
        int i = 0;
        int i2 = 0;
        while (i < 42) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        new String(bArr, StandardCharsets.UTF_8);
        if (c3491g4.z() == 0) {
            D(interfaceC5085yB);
        } else {
            interfaceC5085yB.b(q(c3491g4));
        }
    }

    public final void l(C3491g4 c3491g4, InterfaceC3240dB interfaceC3240dB) {
        synchronized (this.c) {
            this.c.put(c3491g4, interfaceC3240dB);
        }
    }

    public final void n(Context context, C3491g4 c3491g4, String str) {
        Qm0.D(new byte[]{-32, -14, 82, -118, -70, 70, -51, 97, -19, -22}, new byte[]{-125, -98, 59, -23, -47, 3, -69, 4});
        o(context, c3491g4, str, Qm0.D(new byte[]{-91, -108, -122, -112, -105}, new byte[]{-58, -8, -17, -13, -4, 3, -25, 57}));
    }

    public abstract void o(Context context, C3491g4 c3491g4, String str, String str2);

    public abstract int p();

    public final InterfaceC3240dB q(C3491g4 c3491g4) {
        InterfaceC3240dB interfaceC3240dB;
        synchronized (this.c) {
            interfaceC3240dB = (InterfaceC3240dB) this.c.get(c3491g4);
        }
        return interfaceC3240dB;
    }

    public abstract AbstractC4642t9 r();

    public abstract C9 s(C3491g4 c3491g4);

    public abstract long t(C3491g4 c3491g4);

    public boolean v(C3491g4 c3491g4) {
        C4626t1 c4626t1X;
        int i;
        if (c3491g4 == null || (c4626t1X = c3491g4.x(1)) == null || !((i = c4626t1X.f5010a) == -1 || i == 2 || c4626t1X.a())) {
            return c3491g4.z() != 0 && q(c3491g4) == null;
        }
        return true;
    }

    public final void y(Context context, C9 c9, InterfaceC5085yB interfaceC5085yB, Object obj) {
        C3482g c3482g = new C3482g(this, c9, interfaceC5085yB, obj, new WeakReference(context));
        ConcurrentHashMap concurrentHashMap = W1.f3904a;
        if (context != null && obj != null) {
            W1.f3904a.put(obj, c3482g);
            if (W1.b == null) {
                C4573sR c4573sR = new C4573sR();
                c4573sR.f4980a = null;
                W1.b = c4573sR;
                IntentFilter intentFilter = new IntentFilter();
                byte[] bArr = {-24, 76, 21, 114, 96, -28, -87, -84, -25, 71, 5, 46, 108, -30, -93, -20, -89, 97, 62, 78, 65, -56, -114, -42, -64, 116, 56, 84, 86, -46, -114, -54, -56, 108, 54, 69};
                byte[] bArr2 = {-119, 34, 113, 0, com.umeng.analytics.pro.cw.m, -115, -51, -126};
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
                intentFilter.addAction(new String(bArr, StandardCharsets.UTF_8));
                W1.b.f4980a = new V1();
                context.getApplicationContext().registerReceiver(W1.b, intentFilter);
            }
        }
        this.f.put(obj, c3482g);
    }

    public final InterfaceC3240dB z(C3491g4 c3491g4) {
        InterfaceC3240dB interfaceC3240dB;
        synchronized (this.c) {
            interfaceC3240dB = (InterfaceC3240dB) this.c.remove(c3491g4);
        }
        return interfaceC3240dB;
    }

    public void D(InterfaceC5085yB interfaceC5085yB) {
    }

    public void w(C3491g4 c3491g4) {
    }
}
