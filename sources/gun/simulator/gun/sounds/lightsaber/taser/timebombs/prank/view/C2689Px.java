package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2689Px {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2508Ix f3580a;
    public final Handler b;
    public final ArrayList c;
    public final VY d;
    public final InterfaceC2459Ha e;
    public boolean f;
    public boolean g;
    public PY h;
    public C2611Mx i;
    public boolean j;
    public C2611Mx k;
    public Bitmap l;
    public C2611Mx m;
    public int n;
    public int o;
    public int p;

    public C2689Px(com.bumptech.glide.a aVar, C3940l90 c3940l90, int i, int i2, Cf0 cf0, Bitmap bitmap) {
        InterfaceC2459Ha interfaceC2459Ha = aVar.f214a;
        C2923Yx c2923Yx = aVar.c;
        VY vyD = com.bumptech.glide.a.d(c2923Yx.getBaseContext());
        PY pyT = com.bumptech.glide.a.d(c2923Yx.getBaseContext()).i(Bitmap.class).a(VY.k).a(((ZY) ((ZY) ((ZY) new ZY().d(AbstractC2940Zo.f4092a)).r()).n(true)).h(i, i2));
        this.c = new ArrayList();
        this.d = vyD;
        Handler handler = new Handler(Looper.getMainLooper(), new C2663Ox(this));
        this.e = interfaceC2459Ha;
        this.b = handler;
        this.h = pyT;
        this.f3580a = c3940l90;
        c(cf0, bitmap);
    }

    public final void a() {
        int i;
        int i2;
        if (!this.f || this.g) {
            return;
        }
        C2611Mx c2611Mx = this.m;
        if (c2611Mx != null) {
            this.m = null;
            b(c2611Mx);
            return;
        }
        this.g = true;
        InterfaceC2508Ix interfaceC2508Ix = this.f3580a;
        C3940l90 c3940l90 = (C3940l90) interfaceC2508Ix;
        C2715Qx c2715Qx = c3940l90.l;
        int i3 = c2715Qx.c;
        if (i3 <= 0 || (i2 = c3940l90.k) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((C2585Lx) c2715Qx.e.get(i2)).i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        int i4 = (c3940l90.k + 1) % c3940l90.l.c;
        c3940l90.k = i4;
        this.k = new C2611Mx(this.b, i4, jUptimeMillis);
        PY pyZ = this.h.a((ZY) new ZY().m(new C3697iS(Double.valueOf(Math.random())))).z(interfaceC2508Ix);
        pyZ.x(this.k, pyZ);
    }

    public final void b(C2611Mx c2611Mx) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, c2611Mx).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = c2611Mx;
            return;
        }
        if (c2611Mx.g != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.a(bitmap);
                this.l = null;
            }
            C2611Mx c2611Mx2 = this.i;
            this.i = c2611Mx;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                GifDrawable gifDrawable = (GifDrawable) ((InterfaceC2637Nx) arrayList.get(size));
                Object callback = gifDrawable.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    gifDrawable.stop();
                    gifDrawable.invalidateSelf();
                } else {
                    gifDrawable.invalidateSelf();
                    C2689Px c2689Px = gifDrawable.f218a.f3291a;
                    C2611Mx c2611Mx3 = c2689Px.i;
                    if ((c2611Mx3 != null ? c2611Mx3.e : -1) == ((C3940l90) c2689Px.f3580a).l.c - 1) {
                        gifDrawable.f++;
                    }
                    int i = gifDrawable.g;
                    if (i != -1 && gifDrawable.f >= i) {
                        ArrayList arrayList2 = gifDrawable.k;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((Animatable2Compat.AnimationCallback) gifDrawable.k.get(i2)).onAnimationEnd(gifDrawable);
                            }
                        }
                        gifDrawable.stop();
                    }
                }
            }
            if (c2611Mx2 != null) {
                handler.obtainMessage(2, c2611Mx2).sendToTarget();
            }
        }
        a();
    }

    public final void c(Gd0 gd0, Bitmap bitmap) {
        AbstractC2871Wx.V(gd0, "Argument must not be null");
        AbstractC2871Wx.V(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.a(new ZY().p(gd0, true));
        this.n = Tg0.c(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }
}
