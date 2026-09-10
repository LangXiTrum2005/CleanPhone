package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2621Nh implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractApplicationC2673Ph f3469a;

    public C2621Nh(AbstractApplicationC2673Ph abstractApplicationC2673Ph) {
        this.f3469a = abstractApplicationC2673Ph;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Wm0 wm0Y = Wm0.y();
        wm0Y.getClass();
        wm0Y.b = new WeakReference(activity);
        AbstractApplicationC2673Ph abstractApplicationC2673Ph = this.f3469a;
        Iterator it = abstractApplicationC2673Ph.c.iterator();
        while (it.hasNext()) {
            ((InterfaceC2570Lh) it.next()).onActivityCreated(activity, bundle);
        }
        int i = abstractApplicationC2673Ph.d + 1;
        abstractApplicationC2673Ph.d = i;
        if (i == 1 && abstractApplicationC2673Ph.i) {
            abstractApplicationC2673Ph.i = false;
            byte[] bArr = {28, -58, -81, 123, 123, -42, 22, -109, 47, -59, -88, 126, 115, -59, 62, -116, 49, -119, -82, 115, 81, -61, 50, -126, 43, -52, -128, 109, 98};
            byte[] bArr2 = {95, -87, -63, 29, 18, -79, 87, -29};
            int i2 = 0;
            int i3 = 0;
            while (i2 < 29) {
                if (i3 >= 8) {
                    i3 = 0;
                }
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                i2++;
                i3++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            for (L5 l5 : abstractApplicationC2673Ph.b) {
                if (l5 != null) {
                    l5.a();
                }
            }
            AbstractApplicationC2673Ph.l = 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractApplicationC2673Ph abstractApplicationC2673Ph = this.f3469a;
        Iterator it = abstractApplicationC2673Ph.c.iterator();
        while (it.hasNext()) {
            ((InterfaceC2570Lh) it.next()).onActivityDestroyed(activity);
        }
        abstractApplicationC2673Ph.d--;
        abstractApplicationC2673Ph.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractApplicationC2673Ph abstractApplicationC2673Ph = this.f3469a;
        Iterator it = abstractApplicationC2673Ph.c.iterator();
        while (it.hasNext()) {
            ((InterfaceC2570Lh) it.next()).onActivityPaused(activity);
        }
        int i = abstractApplicationC2673Ph.f - 1;
        abstractApplicationC2673Ph.f = i;
        if (i == 0) {
            abstractApplicationC2673Ph.f3566a.postDelayed(abstractApplicationC2673Ph.k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPostCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(Activity activity) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPostDestroyed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(Activity activity) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPostPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPostResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPostSaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPostStarted(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPostStopped(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPreCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPreDestroyed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPrePaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPreResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPreSaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPreStarted(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity) {
        for (InterfaceC2570Lh interfaceC2570Lh : this.f3469a.c) {
            if (Build.VERSION.SDK_INT >= 29) {
                interfaceC2570Lh.onActivityPreStopped(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Wm0 wm0Y = Wm0.y();
        wm0Y.getClass();
        wm0Y.b = new WeakReference(activity);
        AbstractApplicationC2673Ph abstractApplicationC2673Ph = this.f3469a;
        Iterator it = abstractApplicationC2673Ph.c.iterator();
        while (it.hasNext()) {
            ((InterfaceC2570Lh) it.next()).onActivityResumed(activity);
        }
        int i = abstractApplicationC2673Ph.f + 1;
        abstractApplicationC2673Ph.f = i;
        if (i == 1) {
            if (abstractApplicationC2673Ph.g) {
                abstractApplicationC2673Ph.g = false;
                byte[] bArr = {-7, 41, -106, -86, 61, -106, -47, -60, -54, 42, -111, -81, 53, -123, -7, -37, -44, 102, -105, -94, 6, -108, -29, -63, -41, 35, -71, -68, 36};
                byte[] bArr2 = {-70, 70, -8, -52, 84, -15, -112, -76};
                int i2 = 0;
                int i3 = 0;
                while (i2 < 29) {
                    if (i3 >= 8) {
                        i3 = 0;
                    }
                    bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                    i2++;
                    i3++;
                }
                new String(bArr, StandardCharsets.UTF_8);
                for (L5 l5 : abstractApplicationC2673Ph.b) {
                    if (l5 != null) {
                        l5.d();
                    }
                }
                AbstractApplicationC2673Ph.l = 2;
            } else {
                abstractApplicationC2673Ph.f3566a.removeCallbacks(abstractApplicationC2673Ph.k);
            }
        }
        abstractApplicationC2673Ph.j = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = this.f3469a.c.iterator();
        while (it.hasNext()) {
            ((InterfaceC2570Lh) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractApplicationC2673Ph abstractApplicationC2673Ph = this.f3469a;
        Iterator it = abstractApplicationC2673Ph.c.iterator();
        while (it.hasNext()) {
            ((InterfaceC2570Lh) it.next()).onActivityStarted(activity);
        }
        int i = abstractApplicationC2673Ph.e + 1;
        abstractApplicationC2673Ph.e = i;
        if (i == 1 && abstractApplicationC2673Ph.h) {
            abstractApplicationC2673Ph.h = false;
            byte[] bArr = {3, -49, 118, -118, 89, -117, 71, 96, 48, -52, 113, -113, 81, -104, 111, 127, 46, -128, 119, -126, 99, -104, 103, 98, 52, -31, 104, -100};
            byte[] bArr2 = {64, -96, 24, -20, 48, -20, 6, com.umeng.analytics.pro.cw.n};
            int i2 = 0;
            int i3 = 0;
            while (i2 < 28) {
                if (i3 >= 8) {
                    i3 = 0;
                }
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                i2++;
                i3++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            for (L5 l5 : abstractApplicationC2673Ph.b) {
                if (l5 != null) {
                    l5.e();
                }
            }
            AbstractApplicationC2673Ph.l = 1;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractApplicationC2673Ph abstractApplicationC2673Ph = this.f3469a;
        Iterator it = abstractApplicationC2673Ph.c.iterator();
        while (it.hasNext()) {
            ((InterfaceC2570Lh) it.next()).onActivityStopped(activity);
        }
        abstractApplicationC2673Ph.e--;
        abstractApplicationC2673Ph.b();
    }
}
