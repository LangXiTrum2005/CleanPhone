package sg.bigo.ads.api.core;

import android.app.Activity;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseAdActivityImpl {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Activity f47011I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f47012J = 0;

    public BaseAdActivityImpl(Activity activity) {
        this.f47011I = activity;
    }

    public abstract void D();

    public abstract void N();

    public boolean P() {
        return false;
    }

    public abstract void U();

    public abstract void V();

    public abstract void W();

    public abstract void X();

    public abstract void a(int i2, int i3, Intent intent);

    public final void ao() {
        Window window;
        if (P() || (window = this.f47011I.getWindow()) == null) {
            return;
        }
        sg.bigo.ads.common.utils.s.a(window);
    }

    public void ap() {
        this.f47011I.finish();
    }

    public final boolean aq() {
        return this.f47012J == 1;
    }

    public boolean b(MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(boolean z2);

    public final void n(int i2) {
        this.f47011I.setContentView(sg.bigo.ads.common.utils.a.a(this.f47011I, i2, null, false));
    }

    public final <T extends View> T o(int i2) {
        return (T) this.f47011I.findViewById(i2);
    }
}
