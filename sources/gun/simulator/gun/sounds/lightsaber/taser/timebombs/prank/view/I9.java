package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class I9 extends C9 {
    public WeakReference f = null;
    public WeakReference g = null;

    public final void a() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            ((ViewGroup) weakReference.get()).setTag(null);
            this.f = null;
        }
        WeakReference weakReference2 = this.g;
        if (weakReference2 != null) {
            ((View) weakReference2.get()).setTag(null);
            this.g = null;
        }
    }

    public final View b() {
        WeakReference weakReference = this.g;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final ViewGroup c() {
        WeakReference weakReference = this.f;
        if (weakReference == null) {
            return null;
        }
        return (ViewGroup) weakReference.get();
    }
}
