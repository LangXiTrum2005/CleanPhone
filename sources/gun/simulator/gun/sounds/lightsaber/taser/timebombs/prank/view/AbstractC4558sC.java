package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4558sC extends S9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4967a;
    public final Sh0 b;
    public Animatable c;

    public AbstractC4558sC(ImageView imageView) {
        AbstractC2871Wx.V(imageView, "Argument must not be null");
        this.f4967a = imageView;
        this.b = new Sh0(imageView);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final void a(InterfaceC4903w70 interfaceC4903w70) {
        Sh0 sh0 = this.b;
        View view = sh0.f3728a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = sh0.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = sh0.f3728a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iA2 = sh0.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            ((T60) interfaceC4903w70).j(iA, iA2);
            return;
        }
        ArrayList arrayList = sh0.b;
        if (!arrayList.contains(interfaceC4903w70)) {
            arrayList.add(interfaceC4903w70);
        }
        if (sh0.c == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            Rh0 rh0 = new Rh0(sh0);
            sh0.c = rh0;
            viewTreeObserver.addOnPreDrawListener(rh0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final void b(IY iy) {
        this.f4967a.setTag(R.id.glide_custom_view_target_tag, iy);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final void c(Object obj) {
        i(obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final void d(Drawable drawable) {
        i(null);
        ((ImageView) this.f4967a).setImageDrawable(drawable);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final IY e() {
        Object tag = this.f4967a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof IY) {
            return (IY) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final void f(Drawable drawable) {
        Sh0 sh0 = this.b;
        ViewTreeObserver viewTreeObserver = sh0.f3728a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(sh0.c);
        }
        sh0.c = null;
        sh0.b.clear();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        ((ImageView) this.f4967a).setImageDrawable(drawable);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final void g(InterfaceC4903w70 interfaceC4903w70) {
        this.b.b.remove(interfaceC4903w70);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wa0
    public final void h(Drawable drawable) {
        i(null);
        ((ImageView) this.f4967a).setImageDrawable(drawable);
    }

    public final void i(Object obj) {
        C2433Ga c2433Ga = (C2433Ga) this;
        int i = c2433Ga.d;
        View view = c2433Ga.f4967a;
        switch (i) {
            case 0:
                ((ImageView) view).setImageBitmap((Bitmap) obj);
                break;
            default:
                ((ImageView) view).setImageDrawable((Drawable) obj);
                break;
        }
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Target for: " + this.f4967a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final void onStart() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final void onStop() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
