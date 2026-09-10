package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class To0 extends AbstractC4560sE implements SurfaceHolder.Callback, TG {
    public static final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f3796a;
    public SurfaceHolderCallbackC4875vo0 b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TG
    public final void Lxb(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TG
    public final void a(GK gk) {
        this.f3796a = new WeakReference(gk);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            SurfaceHolderCallbackC4875vo0 surfaceHolderCallbackC4875vo0 = (SurfaceHolderCallbackC4875vo0) it.next();
            if (surfaceHolderCallbackC4875vo0 != null && ((SurfaceHolder.Callback) surfaceHolderCallbackC4875vo0.f5155a.get()) == null) {
                holder.removeCallback(surfaceHolderCallbackC4875vo0);
                it.remove();
            }
        }
        holder.addCallback(this.b);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        WeakReference weakReference = this.f3796a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((GK) this.f3796a.get()).Lxb(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f3796a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((GK) this.f3796a.get()).Lxb(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f3796a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((GK) this.f3796a.get()).LD(surfaceHolder);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TG
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(IG ig) {
    }
}
