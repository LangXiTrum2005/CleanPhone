package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2759Sp implements InterfaceC3616hZ, InterfaceC3506gD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f3739a;

    public AbstractC2759Sp(Drawable drawable) {
        AbstractC2871Wx.V(drawable, "Argument must not be null");
        this.f3739a = drawable;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final Object get() {
        Drawable drawable = this.f3739a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
