package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class OR extends AbstractC2759Sp {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OR(Drawable drawable, int i) {
        super(drawable);
        this.b = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final int a() {
        int i = this.b;
        Drawable drawable = this.f3739a;
        switch (i) {
            case 0:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                C2689Px c2689Px = ((GifDrawable) drawable).f218a.f3291a;
                C3940l90 c3940l90 = (C3940l90) c2689Px.f3580a;
                return (c3940l90.j.length * 4) + c3940l90.d.limit() + c3940l90.i.length + c2689Px.n;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final Class b() {
        switch (this.b) {
            case 0:
                return this.f3739a.getClass();
            default:
                return GifDrawable.class;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3506gD
    public final void initialize() {
        int i = this.b;
        Drawable drawable = this.f3739a;
        switch (i) {
            case 1:
                ((GifDrawable) drawable).f218a.f3291a.l.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof GifDrawable) {
                    ((GifDrawable) drawable).f218a.f3291a.l.prepareToDraw();
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3616hZ
    public final void recycle() {
        C4391qK c4391qK;
        C4391qK c4391qK2;
        C4391qK c4391qK3;
        switch (this.b) {
            case 0:
                break;
            default:
                GifDrawable gifDrawable = (GifDrawable) this.f3739a;
                gifDrawable.stop();
                gifDrawable.d = true;
                C2689Px c2689Px = gifDrawable.f218a.f3291a;
                c2689Px.c.clear();
                Bitmap bitmap = c2689Px.l;
                if (bitmap != null) {
                    c2689Px.e.a(bitmap);
                    c2689Px.l = null;
                }
                c2689Px.f = false;
                C2611Mx c2611Mx = c2689Px.i;
                VY vy = c2689Px.d;
                if (c2611Mx != null) {
                    vy.j(c2611Mx);
                    c2689Px.i = null;
                }
                C2611Mx c2611Mx2 = c2689Px.k;
                if (c2611Mx2 != null) {
                    vy.j(c2611Mx2);
                    c2689Px.k = null;
                }
                C2611Mx c2611Mx3 = c2689Px.m;
                if (c2611Mx3 != null) {
                    vy.j(c2611Mx3);
                    c2689Px.m = null;
                }
                C3940l90 c3940l90 = (C3940l90) c2689Px.f3580a;
                c3940l90.l = null;
                byte[] bArr = c3940l90.i;
                C3692iN c3692iN = c3940l90.c;
                if (bArr != null && (c4391qK3 = (C4391qK) c3692iN.c) != null) {
                    c4391qK3.h(bArr);
                }
                int[] iArr = c3940l90.j;
                if (iArr != null && (c4391qK2 = (C4391qK) c3692iN.c) != null) {
                    c4391qK2.h(iArr);
                }
                Bitmap bitmap2 = c3940l90.m;
                if (bitmap2 != null) {
                    ((InterfaceC2459Ha) c3692iN.b).a(bitmap2);
                }
                c3940l90.m = null;
                c3940l90.d = null;
                c3940l90.s = null;
                byte[] bArr2 = c3940l90.e;
                if (bArr2 != null && (c4391qK = (C4391qK) c3692iN.c) != null) {
                    c4391qK.h(bArr2);
                }
                c2689Px.j = true;
                break;
        }
    }
}
