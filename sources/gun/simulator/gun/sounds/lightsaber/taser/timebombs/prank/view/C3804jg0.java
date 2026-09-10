package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3804jg0 implements InterfaceC2570Lh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4068mg0 f4565a;

    public C3804jg0(C4068mg0 c4068mg0) {
        this.f4565a = c4068mg0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = 1;
        WeakReference weakReference = new WeakReference(activity);
        C4068mg0 c4068mg0 = this.f4565a;
        c4068mg0.d = weakReference;
        if (c4068mg0.f4706a.get()) {
            return;
        }
        c4068mg0.getClass();
        c4068mg0.getClass();
        C4332pg0 c4332pg0A = C4332pg0.a();
        byte[] bArr = {-113, 109, 51, 43, -80, 116, 17, -27, -114, 112, 32, 44, -80};
        byte[] bArr2 = {-23, 2, 65, 72, -43, 43, 100, -107};
        int i2 = 0;
        int i3 = 0;
        while (i2 < 13) {
            if (i3 >= 8) {
                i3 = 0;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
            i2++;
            i3++;
        }
        String str = new String(bArr, StandardCharsets.UTF_8);
        C3980lg0 c3980lg0 = new C3980lg0(c4068mg0);
        K5 k5 = c4332pg0A.f4844a;
        if (k5 != null) {
            c3980lg0.A(k5);
        } else if (C2375Du.a() == null) {
            c3980lg0.z();
        } else {
            AbstractC4969wu.a(new C4224oT(c4332pg0A, str, c3980lg0, i));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
