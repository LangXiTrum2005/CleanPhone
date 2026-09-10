package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class R7 extends Handler implements InterfaceC2303Ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f3646a;

    /* JADX WARN: Illegal instructions before constructor call */
    public R7(ContextWrapper contextWrapper, LifecycleOwner lifecycleOwner, W9 w9, int i) {
        if ((i & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) (!(contextWrapper instanceof LifecycleOwner) ? null : contextWrapper);
        }
        w9 = (i & 4) != 0 ? null : w9;
        AbstractC2995aW.q(contextWrapper, com.umeng.analytics.pro.f.X);
        super(contextWrapper.getMainLooper(), w9);
        AbstractC2277Aa.a(this, lifecycleOwner);
        this.f3646a = new WeakReference(contextWrapper);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2303Ba
    public final void a() {
        removeCallbacksAndMessages(null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2303Ba
    public final void b(LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        AbstractC2995aW.q(lifecycleOwner, "source");
        AbstractC2995aW.q(state, "targetState");
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        AbstractC2995aW.q(message, NotificationCompat.CATEGORY_MESSAGE);
        WeakReference weakReference = this.f3646a;
        Context context = (Context) weakReference.get();
        if (context != null) {
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null && (activity.isFinishing() || activity.isDestroyed())) {
                return;
            }
        }
        if (((Context) weakReference.get()) == null) {
            return;
        }
        super.dispatchMessage(message);
    }
}
