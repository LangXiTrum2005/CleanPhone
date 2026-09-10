package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: loaded from: classes.dex */
public class DrawableContainerCompat extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int n0 = 0;
    public DrawableContainerState X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Rect f3399Y;
    public Drawable Z;
    public Drawable e0;
    public boolean g0;
    public boolean i0;
    public Runnable j0;
    public long k0;
    public long l0;
    public BlockInvalidateCallback m0;
    public int f0 = 255;
    public int h0 = -1;

    public static class Api21Impl {
    }

    public static class BlockInvalidateCallback implements Drawable.Callback {
        public Drawable.Callback X;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.X;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.X;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class DrawableContainerState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public final int f3400A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public boolean f3401B;
        public ColorFilter C;
        public boolean D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public ColorStateList f3402E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public PorterDuff.Mode f3403F;
        public boolean G;
        public boolean H;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StateListDrawableCompat f3404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Resources f3405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3406c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3407e;
        public SparseArray f;
        public final Drawable[] g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f3408h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f3409i;
        public boolean j;
        public Rect k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f3410l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f3411n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f3412p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f3413u;
        public boolean v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f3414w;
        public boolean x;
        public int y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final int f3415z;

        public DrawableContainerState(StateListDrawableCompat.StateListState stateListState, StateListDrawableCompat stateListDrawableCompat, Resources resources) {
            this.f3409i = false;
            this.f3410l = false;
            this.x = true;
            this.f3415z = 0;
            this.f3400A = 0;
            this.f3404a = stateListDrawableCompat;
            this.f3405b = resources != null ? resources : stateListState != null ? stateListState.f3405b : null;
            int i2 = stateListState != null ? stateListState.f3406c : 0;
            int i3 = DrawableContainerCompat.n0;
            i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
            i2 = i2 == 0 ? 160 : i2;
            this.f3406c = i2;
            if (stateListState == null) {
                this.g = new Drawable[10];
                this.f3408h = 0;
                return;
            }
            this.d = stateListState.d;
            this.f3407e = stateListState.f3407e;
            this.v = true;
            this.f3414w = true;
            this.f3409i = stateListState.f3409i;
            this.f3410l = stateListState.f3410l;
            this.x = stateListState.x;
            this.y = stateListState.y;
            this.f3415z = stateListState.f3415z;
            this.f3400A = stateListState.f3400A;
            this.f3401B = stateListState.f3401B;
            this.C = stateListState.C;
            this.D = stateListState.D;
            this.f3402E = stateListState.f3402E;
            this.f3403F = stateListState.f3403F;
            this.G = stateListState.G;
            this.H = stateListState.H;
            if (stateListState.f3406c == i2) {
                if (stateListState.j) {
                    this.k = stateListState.k != null ? new Rect(stateListState.k) : null;
                    this.j = true;
                }
                if (stateListState.m) {
                    this.f3411n = stateListState.f3411n;
                    this.o = stateListState.o;
                    this.f3412p = stateListState.f3412p;
                    this.q = stateListState.q;
                    this.m = true;
                }
            }
            if (stateListState.r) {
                this.s = stateListState.s;
                this.r = true;
            }
            if (stateListState.t) {
                this.f3413u = stateListState.f3413u;
                this.t = true;
            }
            Drawable[] drawableArr = stateListState.g;
            this.g = new Drawable[drawableArr.length];
            this.f3408h = stateListState.f3408h;
            SparseArray sparseArray = stateListState.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.f3408h);
            }
            int i4 = this.f3408h;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i5, constantState);
                    } else {
                        this.g[i5] = drawableArr[i5];
                    }
                }
            }
        }

        public final void a() {
            this.m = true;
            b();
            int i2 = this.f3408h;
            Drawable[] drawableArr = this.g;
            this.o = -1;
            this.f3411n = -1;
            this.q = 0;
            this.f3412p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f3411n) {
                    this.f3411n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f3412p) {
                    this.f3412p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void b() {
            SparseArray sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int iKeyAt = this.f.keyAt(i2);
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i2);
                    Drawable[] drawableArr = this.g;
                    Drawable drawableNewDrawable = constantState.newDrawable(this.f3405b);
                    DrawableCompat.h(drawableNewDrawable, this.y);
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    drawableMutate.setCallback(this.f3404a);
                    drawableArr[iKeyAt] = drawableMutate;
                }
                this.f = null;
            }
        }

        public final Drawable c(int i2) {
            int iIndexOfKey;
            Drawable drawable = this.g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f.valueAt(iIndexOfKey)).newDrawable(this.f3405b);
            DrawableCompat.h(drawableNewDrawable, this.y);
            Drawable drawableMutate = drawableNewDrawable.mutate();
            drawableMutate.setCallback(this.f3404a);
            this.g[i2] = drawableMutate;
            this.f.removeAt(iIndexOfKey);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return drawableMutate;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i2 = this.f3408h;
            Drawable[] drawableArr = this.g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (DrawableCompat.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public void d() {
            int i2 = this.f3408h;
            Drawable[] drawableArr = this.g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.d | this.f3407e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(boolean z2) {
        boolean z3;
        Drawable drawable;
        long j;
        boolean z4 = true;
        this.g0 = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            long j2 = this.k0;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f0);
                    this.k0 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.X.f3415z)) * this.f0) / 255);
                    z3 = true;
                }
            }
            drawable = this.e0;
            if (drawable != null) {
                j = this.l0;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.e0 = null;
                        this.l0 = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.X.f3400A) * this.f0) / 255);
                    }
                }
                if (z2 || !z4) {
                }
                scheduleSelf(this.j0, jUptimeMillis + 16);
                return;
            }
            this.l0 = 0L;
            z4 = z3;
            if (z2) {
            }
        }
        this.k0 = 0L;
        z3 = false;
        drawable = this.e0;
        if (drawable != null) {
            j = this.l0;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.e0 = null;
                    this.l0 = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.X.f3400A) * this.f0) / 255);
                }
            }
            if (z2) {
            }
        }
        this.l0 = 0L;
        z4 = z3;
        if (z2) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        DrawableContainerState drawableContainerState = this.X;
        if (theme == null) {
            drawableContainerState.getClass();
            return;
        }
        drawableContainerState.b();
        int i2 = drawableContainerState.f3408h;
        Drawable[] drawableArr = drawableContainerState.g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable != null && DrawableCompat.b(drawable)) {
                DrawableCompat.a(drawableArr[i3], theme);
                drawableContainerState.f3407e |= drawableArr[i3].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            drawableContainerState.f3405b = resources;
            int i4 = resources.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = 160;
            }
            int i5 = drawableContainerState.f3406c;
            drawableContainerState.f3406c = i4;
            if (i5 != i4) {
                drawableContainerState.m = false;
                drawableContainerState.j = false;
            }
        }
    }

    public DrawableContainerState b() {
        return this.X;
    }

    public final void c(Drawable drawable) {
        if (this.m0 == null) {
            this.m0 = new BlockInvalidateCallback();
        }
        BlockInvalidateCallback blockInvalidateCallback = this.m0;
        blockInvalidateCallback.X = drawable.getCallback();
        drawable.setCallback(blockInvalidateCallback);
        try {
            if (this.X.f3415z <= 0 && this.g0) {
                drawable.setAlpha(this.f0);
            }
            DrawableContainerState drawableContainerState = this.X;
            if (drawableContainerState.D) {
                drawable.setColorFilter(drawableContainerState.C);
            } else {
                if (drawableContainerState.G) {
                    DrawableCompat.j(drawable, drawableContainerState.f3402E);
                }
                DrawableContainerState drawableContainerState2 = this.X;
                if (drawableContainerState2.H) {
                    DrawableCompat.k(drawable, drawableContainerState2.f3403F);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.X.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            DrawableCompat.h(drawable, DrawableCompat.d(this));
            drawable.setAutoMirrored(this.X.f3401B);
            Rect rect = this.f3399Y;
            if (rect != null) {
                DrawableCompat.g(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            BlockInvalidateCallback blockInvalidateCallback2 = this.m0;
            Drawable.Callback callback = blockInvalidateCallback2.X;
            blockInvalidateCallback2.X = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.X.canApplyTheme();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean d(int i2) {
        if (i2 == this.h0) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.X.f3400A > 0) {
            Drawable drawable = this.e0;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.Z;
            if (drawable2 != null) {
                this.e0 = drawable2;
                this.l0 = ((long) this.X.f3400A) + jUptimeMillis;
            } else {
                this.e0 = null;
                this.l0 = 0L;
            }
        } else {
            Drawable drawable3 = this.Z;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i2 >= 0) {
            DrawableContainerState drawableContainerState = this.X;
            if (i2 < drawableContainerState.f3408h) {
                Drawable drawableC = drawableContainerState.c(i2);
                this.Z = drawableC;
                this.h0 = i2;
                if (drawableC != null) {
                    int i3 = this.X.f3415z;
                    if (i3 > 0) {
                        this.k0 = jUptimeMillis + ((long) i3);
                    }
                    c(drawableC);
                }
            } else {
                this.Z = null;
                this.h0 = -1;
            }
        } else {
            this.Z = null;
            this.h0 = -1;
        }
        if (this.k0 != 0 || this.l0 != 0) {
            Runnable runnable = this.j0;
            if (runnable == null) {
                final StateListDrawableCompat stateListDrawableCompat = (StateListDrawableCompat) this;
                this.j0 = new Runnable() { // from class: androidx.appcompat.graphics.drawable.DrawableContainerCompat.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        StateListDrawableCompat stateListDrawableCompat2 = stateListDrawableCompat;
                        stateListDrawableCompat2.a(true);
                        stateListDrawableCompat2.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(runnable);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.Z;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.e0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(DrawableContainerState drawableContainerState) {
        this.X = drawableContainerState;
        int i2 = this.h0;
        if (i2 >= 0) {
            Drawable drawableC = drawableContainerState.c(i2);
            this.Z = drawableC;
            if (drawableC != null) {
                c(drawableC);
            }
        }
        this.e0 = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.X.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        DrawableContainerState drawableContainerState = this.X;
        if (!drawableContainerState.v) {
            drawableContainerState.b();
            drawableContainerState.v = true;
            int i2 = drawableContainerState.f3408h;
            Drawable[] drawableArr = drawableContainerState.g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    drawableContainerState.f3414w = true;
                    z2 = true;
                    break;
                }
                if (drawableArr[i3].getConstantState() == null) {
                    drawableContainerState.f3414w = false;
                    z2 = false;
                    break;
                }
                i3++;
            }
        } else {
            z2 = drawableContainerState.f3414w;
        }
        if (!z2) {
            return null;
        }
        this.X.d = getChangingConfigurations();
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.Z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f3399Y;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        DrawableContainerState drawableContainerState = this.X;
        if (drawableContainerState.f3410l) {
            if (!drawableContainerState.m) {
                drawableContainerState.a();
            }
            return drawableContainerState.o;
        }
        Drawable drawable = this.Z;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        DrawableContainerState drawableContainerState = this.X;
        if (drawableContainerState.f3410l) {
            if (!drawableContainerState.m) {
                drawableContainerState.a();
            }
            return drawableContainerState.f3411n;
        }
        Drawable drawable = this.Z;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        DrawableContainerState drawableContainerState = this.X;
        if (drawableContainerState.f3410l) {
            if (!drawableContainerState.m) {
                drawableContainerState.a();
            }
            return drawableContainerState.q;
        }
        Drawable drawable = this.Z;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        DrawableContainerState drawableContainerState = this.X;
        if (drawableContainerState.f3410l) {
            if (!drawableContainerState.m) {
                drawableContainerState.a();
            }
            return drawableContainerState.f3412p;
        }
        Drawable drawable = this.Z;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.Z;
        int opacity = -2;
        if (drawable != null && drawable.isVisible()) {
            DrawableContainerState drawableContainerState = this.X;
            if (drawableContainerState.r) {
                return drawableContainerState.s;
            }
            drawableContainerState.b();
            int i2 = drawableContainerState.f3408h;
            Drawable[] drawableArr = drawableContainerState.g;
            opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            drawableContainerState.s = opacity;
            drawableContainerState.r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.Z;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        DrawableContainerState drawableContainerState = this.X;
        boolean padding = false;
        Rect rect2 = null;
        if (!drawableContainerState.f3409i) {
            Rect rect3 = drawableContainerState.k;
            if (rect3 != null || drawableContainerState.j) {
                rect2 = rect3;
            } else {
                drawableContainerState.b();
                Rect rect4 = new Rect();
                int i2 = drawableContainerState.f3408h;
                Drawable[] drawableArr = drawableContainerState.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                drawableContainerState.j = true;
                drawableContainerState.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.Z;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.X.f3401B && DrawableCompat.d(this) == 1) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        DrawableContainerState drawableContainerState = this.X;
        if (drawableContainerState != null) {
            drawableContainerState.r = false;
            drawableContainerState.t = false;
        }
        if (drawable != this.Z || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.X.f3401B;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        DrawableContainerState drawableContainerState = this.X;
        if (drawableContainerState.t) {
            return drawableContainerState.f3413u;
        }
        drawableContainerState.b();
        int i2 = drawableContainerState.f3408h;
        Drawable[] drawableArr = drawableContainerState.g;
        boolean z2 = false;
        for (int i3 = 0; i3 < i2; i3++) {
            if (drawableArr[i3].isStateful()) {
                z2 = true;
                break;
            }
        }
        drawableContainerState.f3413u = z2;
        drawableContainerState.t = true;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.e0;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.e0 = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g0) {
                this.Z.setAlpha(this.f0);
            }
        }
        if (this.l0 != 0) {
            this.l0 = 0L;
            z2 = true;
        }
        if (this.k0 != 0) {
            this.k0 = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.i0 && super.mutate() == this) {
            DrawableContainerState drawableContainerStateB = b();
            drawableContainerStateB.d();
            e(drawableContainerStateB);
            this.i0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e0;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        DrawableContainerState drawableContainerState = this.X;
        int i3 = this.h0;
        int i4 = drawableContainerState.f3408h;
        Drawable[] drawableArr = drawableContainerState.g;
        boolean z2 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null) {
                boolean zH = DrawableCompat.h(drawable, i2);
                if (i5 == i3) {
                    z2 = zH;
                }
            }
        }
        drawableContainerState.y = i2;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.e0;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e0;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.Z || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.g0 && this.f0 == i2) {
            return;
        }
        this.g0 = true;
        this.f0 = i2;
        Drawable drawable = this.Z;
        if (drawable != null) {
            if (this.k0 == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        DrawableContainerState drawableContainerState = this.X;
        if (drawableContainerState.f3401B != z2) {
            drawableContainerState.f3401B = z2;
            Drawable drawable = this.Z;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        DrawableContainerState drawableContainerState = this.X;
        drawableContainerState.D = true;
        if (drawableContainerState.C != colorFilter) {
            drawableContainerState.C = colorFilter;
            Drawable drawable = this.Z;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        DrawableContainerState drawableContainerState = this.X;
        if (drawableContainerState.x != z2) {
            drawableContainerState.x = z2;
            Drawable drawable = this.Z;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.Z;
        if (drawable != null) {
            DrawableCompat.f(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f3399Y;
        if (rect == null) {
            this.f3399Y = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.Z;
        if (drawable != null) {
            DrawableCompat.g(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        DrawableContainerState drawableContainerState = this.X;
        drawableContainerState.G = true;
        if (drawableContainerState.f3402E != colorStateList) {
            drawableContainerState.f3402E = colorStateList;
            DrawableCompat.j(this.Z, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        DrawableContainerState drawableContainerState = this.X;
        drawableContainerState.H = true;
        if (drawableContainerState.f3403F != mode) {
            drawableContainerState.f3403F = mode;
            DrawableCompat.k(this.Z, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.e0;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.Z;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.Z || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
