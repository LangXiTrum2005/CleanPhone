package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public class Xn0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3995a;
    public boolean b;
    public boolean c;
    public Object d;

    public final void a(Context context) {
        switch (this.f3995a) {
            case 0:
                if (context instanceof Application) {
                    ((Application) context).registerActivityLifecycleCallbacks(this);
                }
                break;
            case 1:
                if (context instanceof Application) {
                    ((Application) context).registerActivityLifecycleCallbacks(this);
                }
                break;
            default:
                if (context instanceof Application) {
                    ((Application) context).registerActivityLifecycleCallbacks(this);
                }
                break;
        }
    }

    public final void b(boolean z) {
        switch (this.f3995a) {
            case 0:
                if (this.c != z) {
                    this.c = z;
                    if (this.b) {
                        e(z);
                        Rn0 rn0 = (Rn0) this.d;
                        if (rn0 != null) {
                            rn0.a(z);
                        }
                    }
                }
                break;
            case 1:
                if (this.c != z) {
                    this.c = z;
                    if (this.b) {
                        e(z);
                        On0 on0 = (On0) this.d;
                        if (on0 != null) {
                            on0.a(z);
                        }
                    }
                }
                break;
            default:
                if (this.c != z) {
                    this.c = z;
                    if (this.b) {
                        e(z);
                        Pn0 pn0 = (Pn0) this.d;
                        if (pn0 != null) {
                            pn0.a(z);
                        }
                    }
                }
                break;
        }
    }

    public final boolean c() {
        switch (this.f3995a) {
            case 0:
                return d().importance == 100 || f();
            case 1:
                return d().importance == 100 || f();
            default:
                return d().importance == 100 || f();
        }
    }

    public final ActivityManager.RunningAppProcessInfo d() {
        switch (this.f3995a) {
            case 0:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                return runningAppProcessInfo;
            case 1:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo2);
                return runningAppProcessInfo2;
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo3 = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo3);
                return runningAppProcessInfo3;
        }
    }

    public boolean f() {
        return false;
    }

    public final void g() {
        switch (this.f3995a) {
            case 0:
                this.b = true;
                boolean zC = c();
                this.c = zC;
                e(zC);
                break;
            case 1:
                this.b = true;
                boolean zC2 = c();
                this.c = zC2;
                e(zC2);
                break;
            default:
                this.b = true;
                boolean zC3 = c();
                this.c = zC3;
                e(zC3);
                break;
        }
    }

    public final void h() {
        switch (this.f3995a) {
            case 0:
                this.b = false;
                this.d = null;
                break;
            case 1:
                this.b = false;
                this.d = null;
                break;
            default:
                this.b = false;
                this.d = null;
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f3995a) {
            case 0:
                b(true);
                break;
            case 1:
                b(true);
                break;
            default:
                b(true);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f3995a) {
            case 0:
                b(c());
                break;
            case 1:
                b(c());
                break;
            default:
                b(c());
                break;
        }
    }

    public void e(boolean z) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
