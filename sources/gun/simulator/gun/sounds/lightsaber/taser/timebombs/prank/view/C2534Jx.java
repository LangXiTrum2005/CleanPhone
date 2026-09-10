package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2534Jx extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2689Px f3291a;

    public C2534Jx(C2689Px c2689Px) {
        this.f3291a = c2689Px;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new GifDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new GifDrawable(this);
    }
}
