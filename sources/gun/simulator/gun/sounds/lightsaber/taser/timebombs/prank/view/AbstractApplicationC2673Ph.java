package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractApplicationC2673Ph extends Application {
    public static int l;
    public static AbstractApplicationC2673Ph m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3566a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Activity j;
    public final P0 k;

    public AbstractApplicationC2673Ph() {
        byte[] bArr = {126, 0, 19, -61, 104, -49, 43, -91, 59, 26, com.umeng.analytics.pro.cw.n, -23, 53, -4, 40, -94, 62, 18, 3, -63, 42, -30, 103};
        byte[] bArr2 = {93, 115, 119, -88, 69, -116, 68, -53};
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
        this.f3566a = new Handler(Looper.getMainLooper());
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = true;
        this.h = true;
        this.i = true;
        this.k = new P0(this, 17);
    }

    public static boolean c() {
        int i = l;
        return i == 4 || i == 5;
    }

    public final void a() {
        if (this.d == 0 && this.h) {
            this.f3566a.removeCallbacks(this.k);
            this.i = true;
            byte[] bArr = {-30, -115, 108, -21, 18, 79, -104, 35, -47, -114, 107, -18, 26, 92, -80, 60, -49, -62, 109, -29, 63, 77, -86, 39, -45, -115, 123, -52, 11, 88};
            byte[] bArr2 = {-95, -30, 2, -115, 123, 40, -39, 83};
            int i = 0;
            int i2 = 0;
            while (i < 30) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            for (L5 l5 : this.b) {
                if (l5 != null) {
                    l5.b();
                }
            }
            l = 5;
        }
    }

    public final void b() {
        if (this.e == 0 && this.g) {
            this.h = true;
            byte[] bArr = {-120, -36, -92, -114, -128, com.umeng.analytics.pro.cw.k, -85, -26, -69, -33, -93, -117, -120, 30, -125, -7, -91, -109, -91, -122, -70, 30, -123, -26, -118, -61, -70};
            byte[] bArr2 = {-53, -77, -54, -24, -23, 106, -22, -106};
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
            for (L5 l5 : this.b) {
                if (l5 != null) {
                    l5.f();
                }
            }
            l = 4;
        }
    }

    public final boolean d() {
        String packageName;
        byte[] bArr = {-117, -116, -121, -7, 6, 8, 42, -116};
        byte[] bArr2 = {-22, -17, -13, -112, 112, 97, 94, -11};
        int i = 0;
        int i2 = 0;
        while (i < 8) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        ActivityManager activityManager = (ActivityManager) getSystemService(new String(bArr, StandardCharsets.UTF_8));
        if (activityManager == null) {
            packageName = getPackageName();
        } else {
            try {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses == null || runningAppProcesses.isEmpty()) {
                    packageName = getPackageName();
                } else {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (next.pid == Process.myPid()) {
                                packageName = next.processName;
                            }
                        } else {
                            packageName = getPackageName();
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return packageName.equals(getPackageName());
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (m == null) {
            m = this;
        }
        registerActivityLifecycleCallbacks(new C2621Nh(this));
        AbstractC4969wu.b();
        C4068mg0 c4068mg0 = C4068mg0.h;
        C3804jg0 c3804jg0 = c4068mg0.f;
        ArrayList arrayList = this.c;
        arrayList.remove(c3804jg0);
        C3804jg0 c3804jg1 = new C3804jg0(c4068mg0);
        c4068mg0.f = c3804jg1;
        arrayList.add(c3804jg1);
        C3892kg0 c3892kg0 = c4068mg0.g;
        ArrayList arrayList2 = this.b;
        arrayList2.remove(c3892kg0);
        C3892kg0 c3892kg1 = new C3892kg0(c4068mg0);
        c4068mg0.g = c3892kg1;
        arrayList2.add(c3892kg1);
        if (AbstractC2340Cl.g == null) {
            AbstractC2340Cl.g = new C4355pv();
        }
        registerActivityLifecycleCallbacks(AbstractC2340Cl.g);
        Context context = C3698iT.a(this).f4501a;
        String str = C3698iT.d;
        AbstractC2995aW.p0(context, AbstractC2995aW.J(context, 0, str) + 1, str);
        byte[] bArr = {-51, 74, -68, -118, 61, -41, 76, 28, -8, 26, -81, -59, 59, -51, 89, 78, -27, 84, -81, -40, 43, -50, 72, 0, -8, 95, -88, -118, 58, -52, 23, 78};
        byte[] bArr2 = {-116, 58, -52, -86, 78, -93, 45, 110};
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
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            if (TextUtils.equals(getPackageName(), processName)) {
                return;
            }
            WebView.setDataDirectorySuffix(processName);
        }
    }
}
