package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class VY implements ComponentCallbacks2, InterfaceC4827vH {
    public static final ZY k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.a f3875a;
    public final Context b;
    public final InterfaceC4651tH c;
    public final C4288p70 d;
    public final YY e;
    public final Xa0 f;
    public final TY g;
    public final InterfaceC4249oj h;
    public final CopyOnWriteArrayList i;
    public ZY j;

    static {
        ZY zy = (ZY) new ZY().c(Bitmap.class);
        zy.t = true;
        k = zy;
        ((ZY) new ZY().c(GifDrawable.class)).t = true;
    }

    public VY(com.bumptech.glide.a aVar, InterfaceC4651tH interfaceC4651tH, YY yy, Context context) {
        C4288p70 c4288p70 = new C4288p70(1);
        C4710tz c4710tz = aVar.f;
        this.f = new Xa0();
        TY ty = new TY(this, 0);
        this.g = ty;
        this.f3875a = aVar;
        this.c = interfaceC4651tH;
        this.e = yy;
        this.d = c4288p70;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        UY uy = new UY(this, c4288p70);
        c4710tz.getClass();
        InterfaceC4249oj c2445Gm = ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new C2445Gm(applicationContext, uy) : new VR();
        this.h = c2445Gm;
        synchronized (aVar.g) {
            if (aVar.g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.g.add(this);
        }
        char[] cArr = Tg0.f3783a;
        if (((Looper.myLooper() == Looper.getMainLooper() ? 1 : 0) ^ 1) != 0) {
            Tg0.f().post(ty);
        } else {
            interfaceC4651tH.s(this);
        }
        interfaceC4651tH.s(c2445Gm);
        this.i = new CopyOnWriteArrayList(aVar.c.e);
        n(aVar.c.a());
    }

    public final PY i(Class cls) {
        return new PY(this.f3875a, this, cls, this.b);
    }

    public final void j(Wa0 wa0) {
        if (wa0 == null) {
            return;
        }
        boolean zO = o(wa0);
        IY iyE = wa0.e();
        if (zO) {
            return;
        }
        com.bumptech.glide.a aVar = this.f3875a;
        synchronized (aVar.g) {
            try {
                Iterator it = aVar.g.iterator();
                while (it.hasNext()) {
                    if (((VY) it.next()).o(wa0)) {
                    }
                }
                if (iyE != null) {
                    wa0.b(null);
                    iyE.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void k() {
        try {
            Iterator it = Tg0.e(this.f.f3976a).iterator();
            while (it.hasNext()) {
                j((Wa0) it.next());
            }
            this.f.f3976a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void l() {
        C4288p70 c4288p70 = this.d;
        c4288p70.c = true;
        for (IY iy : Tg0.e((Set) c4288p70.b)) {
            if (iy.isRunning()) {
                iy.pause();
                ((Set) c4288p70.d).add(iy);
            }
        }
    }

    public final synchronized void m() {
        this.d.h();
    }

    public final synchronized void n(ZY zy) {
        ZY zy2 = (ZY) zy.clone();
        if (zy2.t && !zy2.v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        zy2.v = true;
        zy2.t = true;
        this.j = zy2;
    }

    public final synchronized boolean o(Wa0 wa0) {
        IY iyE = wa0.e();
        if (iyE == null) {
            return true;
        }
        if (!this.d.b(iyE)) {
            return false;
        }
        this.f.f3976a.remove(wa0);
        wa0.b(null);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final synchronized void onDestroy() {
        this.f.onDestroy();
        k();
        C4288p70 c4288p70 = this.d;
        Iterator it = Tg0.e((Set) c4288p70.b).iterator();
        while (it.hasNext()) {
            c4288p70.b((IY) it.next());
        }
        ((Set) c4288p70.d).clear();
        this.c.l(this);
        this.c.l(this.h);
        Tg0.f().removeCallbacks(this.g);
        this.f3875a.c(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final synchronized void onStart() {
        m();
        this.f.onStart();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4827vH
    public final synchronized void onStop() {
        this.f.onStop();
        l();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
