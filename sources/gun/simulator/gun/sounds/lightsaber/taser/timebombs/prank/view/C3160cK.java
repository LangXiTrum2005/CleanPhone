package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3160cK extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean Q;
    public static final List R;
    public static final ThreadPoolExecutor S;
    public RectF A;
    public VG B;
    public Rect C;
    public Rect D;
    public RectF E;
    public RectF F;
    public Matrix G;
    public Matrix H;
    public boolean I;
    public B6 J;
    public final Semaphore K;
    public Handler L;
    public WJ M;
    public final WJ N;
    public float O;
    public int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MJ f4216a;
    public final ChoreographerFrameCallbackC4127nK b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final ArrayList f;
    public C3681iC g;
    public String h;
    public C4092mw i;
    public Map j;
    public String k;
    public final Wm0 l;
    public boolean m;
    public boolean n;
    public C4948wh o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public EnumC5108yY u;
    public boolean v;
    public final Matrix w;
    public Bitmap x;
    public Canvas y;
    public Rect z;

    static {
        Q = Build.VERSION.SDK_INT <= 25;
        R = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        S = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4039mK());
    }

    public C3160cK() {
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = new ChoreographerFrameCallbackC4127nK();
        this.b = choreographerFrameCallbackC4127nK;
        this.c = true;
        int i = 0;
        this.d = false;
        this.e = false;
        this.P = 1;
        this.f = new ArrayList();
        this.l = new Wm0(1);
        this.m = false;
        this.n = true;
        this.p = 255;
        this.t = false;
        this.u = EnumC5108yY.f5280a;
        this.v = false;
        this.w = new Matrix();
        this.I = false;
        VJ vj = new VJ(this, i);
        this.K = new Semaphore(1);
        this.N = new WJ(this, i);
        this.O = -3.4028235E38f;
        choreographerFrameCallbackC4127nK.addUpdateListener(vj);
    }

    public static void f(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final C4738uG c4738uG, final Object obj, final C4215oK c4215oK) {
        C4948wh c4948wh = this.o;
        if (c4948wh == null) {
            this.f.add(new InterfaceC3072bK() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZJ
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3072bK
                public final void run() {
                    this.f4065a.a(c4738uG, obj, c4215oK);
                }
            });
            return;
        }
        if (c4738uG == C4738uG.c) {
            c4948wh.g(c4215oK, obj);
        } else {
            InterfaceC4826vG interfaceC4826vG = c4738uG.b;
            if (interfaceC4826vG != null) {
                interfaceC4826vG.g(c4215oK, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.o.c(c4738uG, 0, arrayList, new C4738uG(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((C4738uG) arrayList.get(i)).b.g(c4215oK, obj);
                }
                if (!(!arrayList.isEmpty())) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == InterfaceC3689iK.z) {
            u(this.b.e());
        }
    }

    public final boolean b(Context context) {
        if (this.d) {
            return true;
        }
        if (this.c) {
            if (context == null) {
                return true;
            }
            Xg0 xg0 = AbstractC3014ah0.f4135a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        MJ mj = this.f4216a;
        if (mj == null) {
            return;
        }
        C3692iN c3692iN = AbstractC2980aH.f4115a;
        Rect rect = mj.k;
        C4948wh c4948wh = new C4948wh(this, new ZG(Collections.emptyList(), mj, "__container", -1L, 1, -1L, null, Collections.emptyList(), new M4(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null, 1), mj.j, mj);
        this.o = c4948wh;
        if (this.r) {
            c4948wh.q(true);
        }
        this.o.J = this.n;
    }

    public final void d() {
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = this.b;
        if (choreographerFrameCallbackC4127nK.m) {
            choreographerFrameCallbackC4127nK.cancel();
            if (!isVisible()) {
                this.P = 1;
            }
        }
        this.f4216a = null;
        this.o = null;
        this.g = null;
        this.O = -3.4028235E38f;
        choreographerFrameCallbackC4127nK.l = null;
        choreographerFrameCallbackC4127nK.j = -2.1474836E9f;
        choreographerFrameCallbackC4127nK.k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float fE;
        MJ mj;
        C4948wh c4948wh = this.o;
        if (c4948wh == null) {
            return;
        }
        B6 b6 = this.J;
        if (b6 == null) {
            b6 = B6.f2856a;
        }
        boolean z = b6 == B6.b;
        ThreadPoolExecutor threadPoolExecutor = S;
        Semaphore semaphore = this.K;
        WJ wj = this.N;
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = this.b;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                } else {
                    if ((f > fE ? 1 : (f == fE ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (z) {
                    semaphore.release();
                    if (c4948wh.I != choreographerFrameCallbackC4127nK.e()) {
                        threadPoolExecutor.execute(wj);
                    }
                }
            }
        }
        if (z && (mj = this.f4216a) != null) {
            float f2 = this.O;
            float fE2 = choreographerFrameCallbackC4127nK.e();
            this.O = fE2;
            if (Math.abs(fE2 - f2) * mj.b() >= 50.0f) {
                u(choreographerFrameCallbackC4127nK.e());
            }
        }
        if (this.e) {
            try {
                if (this.v) {
                    m(canvas, c4948wh);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                AbstractC5005xJ.f5217a.getClass();
            }
        } else if (this.v) {
            m(canvas, c4948wh);
        } else {
            g(canvas);
        }
        this.I = false;
    }

    public final void e() {
        MJ mj = this.f4216a;
        if (mj == null) {
            return;
        }
        EnumC5108yY enumC5108yY = this.u;
        int i = Build.VERSION.SDK_INT;
        boolean z = mj.o;
        int i2 = mj.p;
        int iOrdinal = enumC5108yY.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
            z2 = true;
        }
        this.v = z2;
    }

    public final void g(Canvas canvas) {
        C4948wh c4948wh = this.o;
        MJ mj = this.f4216a;
        if (c4948wh == null || mj == null) {
            return;
        }
        Matrix matrix = this.w;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            matrix.preScale(bounds.width() / mj.k.width(), bounds.height() / mj.k.height());
            matrix.preTranslate(bounds.left, bounds.top);
        }
        c4948wh.f(canvas, matrix, this.p);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        MJ mj = this.f4216a;
        if (mj == null) {
            return -1;
        }
        return mj.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        MJ mj = this.f4216a;
        if (mj == null) {
            return -1;
        }
        return mj.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final C4092mw i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.i == null) {
            Drawable.Callback callback = getCallback();
            C4092mw c4092mw = new C4092mw();
            c4092mw.c = new C3957lQ();
            c4092mw.b = new HashMap();
            c4092mw.d = new HashMap();
            c4092mw.f4722a = ".ttf";
            c4092mw.f = null;
            if (callback instanceof View) {
                c4092mw.e = ((View) callback).getContext().getAssets();
            } else {
                AbstractC5005xJ.b("LottieDrawable must be inside of a view for images to work.");
                c4092mw.e = null;
            }
            this.i = c4092mw;
            String str = this.k;
            if (str != null) {
                c4092mw.f4722a = str;
            }
        }
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.I) {
            return;
        }
        this.I = true;
        if ((!Q || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return j();
    }

    public final boolean j() {
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = this.b;
        if (choreographerFrameCallbackC4127nK == null) {
            return false;
        }
        return choreographerFrameCallbackC4127nK.m;
    }

    public final void k() {
        this.f.clear();
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = this.b;
        choreographerFrameCallbackC4127nK.o(true);
        Iterator it = choreographerFrameCallbackC4127nK.c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(choreographerFrameCallbackC4127nK);
        }
        if (isVisible()) {
            return;
        }
        this.P = 1;
    }

    public final void l() {
        if (this.o == null) {
            this.f.add(new UJ(this, 1));
            return;
        }
        e();
        boolean zB = b(h());
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = this.b;
        if (zB || choreographerFrameCallbackC4127nK.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC4127nK.m = true;
                boolean zJ = choreographerFrameCallbackC4127nK.j();
                for (Animator.AnimatorListener animatorListener : choreographerFrameCallbackC4127nK.b) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC4127nK, zJ);
                    } else {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC4127nK);
                    }
                }
                choreographerFrameCallbackC4127nK.t((int) (choreographerFrameCallbackC4127nK.j() ? choreographerFrameCallbackC4127nK.f() : choreographerFrameCallbackC4127nK.g()));
                choreographerFrameCallbackC4127nK.f = 0L;
                choreographerFrameCallbackC4127nK.i = 0;
                if (choreographerFrameCallbackC4127nK.m) {
                    choreographerFrameCallbackC4127nK.o(false);
                    Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC4127nK);
                }
                this.P = 1;
            } else {
                this.P = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it = R.iterator();
        C4393qM c4393qMD = null;
        while (it.hasNext()) {
            c4393qMD = this.f4216a.d((String) it.next());
            if (c4393qMD != null) {
                break;
            }
        }
        if (c4393qMD != null) {
            o((int) c4393qMD.b);
        } else {
            o((int) (choreographerFrameCallbackC4127nK.d < 0.0f ? choreographerFrameCallbackC4127nK.g() : choreographerFrameCallbackC4127nK.f()));
        }
        choreographerFrameCallbackC4127nK.o(true);
        choreographerFrameCallbackC4127nK.k(choreographerFrameCallbackC4127nK.j());
        if (isVisible()) {
            return;
        }
        this.P = 1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00e9  */
    public final void m(Canvas canvas, C4948wh c4948wh) {
        if (this.f4216a != null) {
            if (this.y == null) {
                this.y = new Canvas();
                this.F = new RectF();
                this.G = new Matrix();
                this.H = new Matrix();
                this.z = new Rect();
                this.A = new RectF();
                this.B = new VG();
                this.C = new Rect();
                this.D = new Rect();
                this.E = new RectF();
            }
            canvas.getMatrix(this.G);
            canvas.getClipBounds(this.z);
            Rect rect = this.z;
            this.A.set(rect.left, rect.top, rect.right, rect.bottom);
            this.G.mapRect(this.A);
            f(this.A, this.z);
            if (this.n) {
                this.F.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                c4948wh.d(this.F, null, false);
            }
            this.G.mapRect(this.F);
            Rect bounds = getBounds();
            float fWidth = bounds.width() / getIntrinsicWidth();
            float fHeight = bounds.height() / getIntrinsicHeight();
            RectF rectF = this.F;
            rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
            Drawable.Callback callback = getCallback();
            if (callback instanceof View) {
                ViewParent parent = ((View) callback).getParent();
                if (!(parent instanceof ViewGroup) || !(!((ViewGroup) parent).getClipChildren())) {
                    RectF rectF2 = this.F;
                    Rect rect2 = this.z;
                    rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
            } else {
                RectF rectF3 = this.F;
                Rect rect3 = this.z;
                rectF3.intersect(rect3.left, rect3.top, rect3.right, rect3.bottom);
            }
            int iCeil = (int) Math.ceil(this.F.width());
            int iCeil2 = (int) Math.ceil(this.F.height());
            if (iCeil <= 0 || iCeil2 <= 0) {
                return;
            }
            Bitmap bitmap = this.x;
            if (bitmap == null || bitmap.getWidth() < iCeil || this.x.getHeight() < iCeil2) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
                this.x = bitmapCreateBitmap;
                this.y.setBitmap(bitmapCreateBitmap);
                this.I = true;
            } else if (this.x.getWidth() > iCeil || this.x.getHeight() > iCeil2) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.x, 0, 0, iCeil, iCeil2);
                this.x = bitmapCreateBitmap2;
                this.y.setBitmap(bitmapCreateBitmap2);
                this.I = true;
            }
            if (this.I) {
                Matrix matrix = this.w;
                matrix.set(this.G);
                matrix.preScale(fWidth, fHeight);
                RectF rectF4 = this.F;
                matrix.postTranslate(-rectF4.left, -rectF4.top);
                this.x.eraseColor(0);
                c4948wh.f(this.y, matrix, this.p);
                this.G.invert(this.H);
                this.H.mapRect(this.E, this.F);
                f(this.E, this.D);
            }
            this.C.set(0, 0, iCeil, iCeil2);
            canvas.drawBitmap(this.x, this.C, this.D, this.B);
        }
    }

    public final void n() {
        if (this.o == null) {
            this.f.add(new UJ(this, 0));
            return;
        }
        e();
        boolean zB = b(h());
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = this.b;
        if (zB || choreographerFrameCallbackC4127nK.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC4127nK.m = true;
                choreographerFrameCallbackC4127nK.o(false);
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC4127nK);
                choreographerFrameCallbackC4127nK.f = 0L;
                if (choreographerFrameCallbackC4127nK.j() && choreographerFrameCallbackC4127nK.h == choreographerFrameCallbackC4127nK.g()) {
                    choreographerFrameCallbackC4127nK.t(choreographerFrameCallbackC4127nK.f());
                } else if (!choreographerFrameCallbackC4127nK.j() && choreographerFrameCallbackC4127nK.h == choreographerFrameCallbackC4127nK.f()) {
                    choreographerFrameCallbackC4127nK.t(choreographerFrameCallbackC4127nK.g());
                }
                Iterator it = choreographerFrameCallbackC4127nK.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(choreographerFrameCallbackC4127nK);
                }
                this.P = 1;
            } else {
                this.P = 3;
            }
        }
        if (b(h())) {
            return;
        }
        o((int) (choreographerFrameCallbackC4127nK.d < 0.0f ? choreographerFrameCallbackC4127nK.g() : choreographerFrameCallbackC4127nK.f()));
        choreographerFrameCallbackC4127nK.o(true);
        choreographerFrameCallbackC4127nK.k(choreographerFrameCallbackC4127nK.j());
        if (isVisible()) {
            return;
        }
        this.P = 1;
    }

    public final void o(int i) {
        if (this.f4216a == null) {
            this.f.add(new YJ(this, i, 0));
        } else {
            this.b.t(i);
        }
    }

    public final void p(int i) {
        if (this.f4216a == null) {
            this.f.add(new YJ(this, i, 1));
            return;
        }
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = this.b;
        choreographerFrameCallbackC4127nK.v(choreographerFrameCallbackC4127nK.j, i + 0.99f);
    }

    public final void q(String str) {
        MJ mj = this.f4216a;
        if (mj == null) {
            this.f.add(new TJ(this, str, 1));
            return;
        }
        C4393qM c4393qMD = mj.d(str);
        if (c4393qMD == null) {
            throw new IllegalArgumentException(DM.B("Cannot find marker with name ", str, "."));
        }
        p((int) (c4393qMD.b + c4393qMD.c));
    }

    public final void r(String str) {
        MJ mj = this.f4216a;
        ArrayList arrayList = this.f;
        if (mj == null) {
            arrayList.add(new TJ(this, str, 0));
            return;
        }
        C4393qM c4393qMD = mj.d(str);
        if (c4393qMD == null) {
            throw new IllegalArgumentException(DM.B("Cannot find marker with name ", str, "."));
        }
        int i = (int) c4393qMD.b;
        int i2 = ((int) c4393qMD.c) + i;
        if (this.f4216a == null) {
            arrayList.add(new C2983aK(this, i, i2));
        } else {
            this.b.v(i, i2 + 0.99f);
        }
    }

    public final void s(int i) {
        if (this.f4216a == null) {
            this.f.add(new YJ(this, i, 2));
        } else {
            ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = this.b;
            choreographerFrameCallbackC4127nK.v(i, (int) choreographerFrameCallbackC4127nK.k);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.p = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC5005xJ.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.P;
            if (i == 2) {
                l();
            } else if (i == 3) {
                n();
            }
        } else if (this.b.m) {
            k();
            this.P = 3;
        } else if (!z3) {
            this.P = 1;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f.clear();
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = this.b;
        choreographerFrameCallbackC4127nK.o(true);
        choreographerFrameCallbackC4127nK.k(choreographerFrameCallbackC4127nK.j());
        if (isVisible()) {
            return;
        }
        this.P = 1;
    }

    public final void t(String str) {
        MJ mj = this.f4216a;
        if (mj == null) {
            this.f.add(new TJ(this, str, 2));
            return;
        }
        C4393qM c4393qMD = mj.d(str);
        if (c4393qMD == null) {
            throw new IllegalArgumentException(DM.B("Cannot find marker with name ", str, "."));
        }
        s((int) c4393qMD.b);
    }

    public final void u(float f) {
        MJ mj = this.f4216a;
        if (mj == null) {
            this.f.add(new XJ(this, f, 1));
        } else {
            this.b.t(AbstractC5187zP.e(mj.l, mj.m, f));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
