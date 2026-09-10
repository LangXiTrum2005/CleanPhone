package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3313e3 implements InterfaceC2570Lh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3927l3 f4304a;

    public C3313e3(C3927l3 c3927l3) {
        this.f4304a = c3927l3;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C3927l3 c3927l3 = this.f4304a;
        String str = c3927l3.f4440a;
        byte[] bArr = {-80, -52, -4, -64, -44, -98, 19, -73, -85, -37, -2, -47, -59, -106, 17, -69, -69, -104, -99, -62, -61, -125, 12, -88, -74, -42, -60, -125, -99, -41};
        byte[] bArr2 = {-33, -94, -67, -93, -96, -9, 101, -34};
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
        activity.getClass().toString();
        c3927l3.p = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C3927l3 c3927l3 = this.f4304a;
        c3927l3.l.set(false);
        byte[] bArr = {-4, -125, 85, -90, -79, 50, 48, 56, -25, -108, 80, -96, -74, 47, 52, 62, -22, -120, 112, -1, -27, 58, 37, 37, -6, -101, 125, -79, -68, 123, 123, 113};
        byte[] bArr2 = {-109, -19, 20, -59, -59, 91, 70, 81};
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
        activity.getClass().toString();
        WeakReference weakReference = c3927l3.o;
        if (weakReference != null && weakReference.get() == activity) {
            c3927l3.o = null;
        }
        WeakReference weakReference2 = c3927l3.p;
        if (weakReference2 != null && weakReference2.get() == activity) {
            c3927l3.p = null;
        }
        if (X0.j.d.d <= 0) {
            c3927l3.k.set(false);
            c3927l3.q = 1;
            c3927l3.r = 0L;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C3927l3 c3927l3 = this.f4304a;
        c3927l3.l.set(true);
        String str = c3927l3.f4440a;
        byte[] bArr = {73, 31, 120, 65, 117, 51, 84, -126, 82, 8, 105, 67, 116, 41, 71, -113, 28, 81, 88, 65, 117, 51, 84, -126, 82, 8, 25, 31, 33};
        byte[] bArr2 = {38, 113, 57, 34, 1, 90, 34, -21};
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
        activity.getClass().toString();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C3927l3 c3927l3 = this.f4304a;
        String str = c3927l3.f4440a;
        byte[] bArr = {100, -112, -51, -42, 92, -92, 65, -22, 127, -121, -34, -48, 91, -72, 90, -26, 111, -60, -84, -44, 75, -71, 94, -11, 98, -118, -11, -107, 21, -19};
        byte[] bArr2 = {11, -2, -116, -75, 40, -51, 55, -125};
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
        activity.getClass().toString();
        c3927l3.o = new WeakReference(activity);
        WeakReference weakReference = c3927l3.s;
        if (weakReference != null && weakReference.get() != null) {
            ((J5) c3927l3.s.get()).getClass();
        }
        c3927l3.getClass();
        X0.j.r().getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C3927l3 c3927l3 = this.f4304a;
        c3927l3.l.set(false);
        String str = c3927l3.f4440a;
        byte[] bArr = {99, 39, 103, -120, -67, 12, -53, -102, 120, 48, 117, -97, -88, 23, -55, -106, 104, 115, 6, -118, -86, 17, -44, -123, 101, 61, 95, -53, -12, 69};
        byte[] bArr2 = {12, 73, 38, -21, -55, 101, -67, -13};
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
        activity.getClass().toString();
        c3927l3.o = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C3927l3 c3927l3 = this.f4304a;
        c3927l3.l.set(false);
        String str = c3927l3.f4440a;
        byte[] bArr = {74, 37, 47, 56, -57, 27, 42, -51, 81, 50, 61, 47, -36, 2, 44, -63, 65, 113, 78, 58, -48, 6, 53, -46, 76, 63, 23, 123, -114, 82};
        byte[] bArr2 = {37, 75, 110, 91, -77, 114, 92, -92};
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
        activity.getClass().toString();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
