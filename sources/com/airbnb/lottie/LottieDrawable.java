package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.LayerParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.thinkup.core.common.n.mo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final /* synthetic */ int L0 = 0;
    public Canvas A0;
    public Rect B0;
    public RectF C0;
    public LPaint D0;
    public Rect E0;
    public Rect F0;
    public RectF G0;
    public RectF H0;
    public Matrix I0;
    public Matrix J0;
    public boolean K0;
    public LottieComposition X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final LottieValueAnimator f9524Y;
    public boolean Z;
    public boolean e0;
    public boolean f0;
    public OnVisibleAction g0;
    public final ArrayList h0;
    public ImageAssetManager i0;
    public String j0;
    public ImageAssetDelegate k0;
    public FontAssetManager l0;
    public FontAssetDelegate m0;
    public TextDelegate n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public CompositionLayer r0;
    public int s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public RenderMode w0;
    public boolean x0;
    public final Matrix y0;
    public Bitmap z0;

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieDrawable$2, reason: invalid class name */
    class AnonymousClass2 extends LottieValueCallback<Object> {
        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final Object a(LottieFrameInfo lottieFrameInfo) {
            throw null;
        }
    }

    public interface LazyCompositionTask {
        void run();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OnVisibleAction {
        public static final OnVisibleAction X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final OnVisibleAction f9525Y;
        public static final OnVisibleAction Z;
        public static final /* synthetic */ OnVisibleAction[] e0;

        static {
            OnVisibleAction onVisibleAction = new OnVisibleAction("NONE", 0);
            X = onVisibleAction;
            OnVisibleAction onVisibleAction2 = new OnVisibleAction("PLAY", 1);
            f9525Y = onVisibleAction2;
            OnVisibleAction onVisibleAction3 = new OnVisibleAction("RESUME", 2);
            Z = onVisibleAction3;
            e0 = new OnVisibleAction[]{onVisibleAction, onVisibleAction2, onVisibleAction3};
        }

        public static OnVisibleAction valueOf(String str) {
            return (OnVisibleAction) Enum.valueOf(OnVisibleAction.class, str);
        }

        public static OnVisibleAction[] values() {
            return (OnVisibleAction[]) e0.clone();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        lottieValueAnimator.Z = 1.0f;
        lottieValueAnimator.e0 = false;
        lottieValueAnimator.f0 = 0L;
        lottieValueAnimator.g0 = 0.0f;
        lottieValueAnimator.h0 = 0;
        lottieValueAnimator.i0 = -2.1474836E9f;
        lottieValueAnimator.j0 = 2.1474836E9f;
        lottieValueAnimator.l0 = false;
        this.f9524Y = lottieValueAnimator;
        this.Z = true;
        this.e0 = false;
        this.f0 = false;
        this.g0 = OnVisibleAction.X;
        this.h0 = new ArrayList();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.LottieDrawable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LottieDrawable lottieDrawable = LottieDrawable.this;
                CompositionLayer compositionLayer = lottieDrawable.r0;
                if (compositionLayer != null) {
                    compositionLayer.s(lottieDrawable.f9524Y.e());
                }
            }
        };
        this.p0 = false;
        this.q0 = true;
        this.s0 = 255;
        this.w0 = RenderMode.X;
        this.x0 = false;
        this.y0 = new Matrix();
        this.K0 = false;
        lottieValueAnimator.addUpdateListener(animatorUpdateListener);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final KeyPath keyPath, final ColorFilter colorFilter, final LottieValueCallback lottieValueCallback) {
        CompositionLayer compositionLayer = this.r0;
        if (compositionLayer == null) {
            this.h0.add(new LazyCompositionTask() { // from class: com.airbnb.lottie.l
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run() {
                    int i2 = LottieDrawable.L0;
                    this.f9698a.a(keyPath, colorFilter, lottieValueCallback);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (keyPath == KeyPath.f9727c) {
            compositionLayer.d(colorFilter, lottieValueCallback);
        } else {
            KeyPathElement keyPathElement = keyPath.f9729b;
            if (keyPathElement != null) {
                keyPathElement.d(colorFilter, lottieValueCallback);
            } else {
                ArrayList arrayList = new ArrayList();
                this.r0.e(keyPath, 0, arrayList, new KeyPath(new String[0]));
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((KeyPath) arrayList.get(i2)).f9729b.d(colorFilter, lottieValueCallback);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (colorFilter == LottieProperty.f9546z) {
                r(this.f9524Y.e());
            }
        }
    }

    public final boolean b() {
        return this.Z || this.e0;
    }

    public final void c() {
        LottieComposition lottieComposition = this.X;
        if (lottieComposition == null) {
            return;
        }
        JsonReader.Options options = LayerParser.f9911a;
        Rect rect = lottieComposition.j;
        List list = Collections.EMPTY_LIST;
        CompositionLayer compositionLayer = new CompositionLayer(this, new Layer(list, lottieComposition, "__container", -1L, Layer.LayerType.X, -1L, null, list, new AnimatableTransform(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, Layer.MatteType.X, null, false, null, null), lottieComposition.f9519i, lottieComposition);
        this.r0 = compositionLayer;
        if (this.u0) {
            compositionLayer.r(true);
        }
        this.r0.H = this.q0;
    }

    public final void d() {
        LottieValueAnimator lottieValueAnimator = this.f9524Y;
        if (lottieValueAnimator.l0) {
            lottieValueAnimator.cancel();
            if (!isVisible()) {
                this.g0 = OnVisibleAction.X;
            }
        }
        this.X = null;
        this.r0 = null;
        this.i0 = null;
        lottieValueAnimator.k0 = null;
        lottieValueAnimator.i0 = -2.1474836E9f;
        lottieValueAnimator.j0 = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f0) {
            try {
                if (this.x0) {
                    j(canvas, this.r0);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused) {
                Logger.f9943a.getClass();
            }
        } else if (this.x0) {
            j(canvas, this.r0);
        } else {
            g(canvas);
        }
        this.K0 = false;
        L.a();
    }

    public final void e() {
        LottieComposition lottieComposition = this.X;
        if (lottieComposition == null) {
            return;
        }
        RenderMode renderMode = this.w0;
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = lottieComposition.f9521n;
        int i3 = lottieComposition.o;
        int iOrdinal = renderMode.ordinal();
        boolean z3 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z2 && i2 < 28) || i3 > 4 || i2 <= 25))) {
            z3 = true;
        }
        this.x0 = z3;
    }

    public final void g(Canvas canvas) {
        CompositionLayer compositionLayer = this.r0;
        LottieComposition lottieComposition = this.X;
        if (compositionLayer == null || lottieComposition == null) {
            return;
        }
        Matrix matrix = this.y0;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            matrix.preScale(bounds.width() / lottieComposition.j.width(), bounds.height() / lottieComposition.j.height());
        }
        compositionLayer.h(canvas, matrix, this.s0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.s0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        LottieComposition lottieComposition = this.X;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.j.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        LottieComposition lottieComposition = this.X;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.j.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        this.h0.clear();
        this.f9524Y.j(true);
        if (isVisible()) {
            return;
        }
        this.g0 = OnVisibleAction.X;
    }

    public final void i() {
        if (this.r0 == null) {
            this.h0.add(new m(this, 1));
            return;
        }
        e();
        boolean zB = b();
        OnVisibleAction onVisibleAction = OnVisibleAction.X;
        LottieValueAnimator lottieValueAnimator = this.f9524Y;
        if (zB || lottieValueAnimator.getRepeatCount() == 0) {
            if (isVisible()) {
                lottieValueAnimator.l0 = true;
                boolean zI = lottieValueAnimator.i();
                for (Animator.AnimatorListener animatorListener : lottieValueAnimator.f9941Y) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(lottieValueAnimator, zI);
                    } else {
                        animatorListener.onAnimationStart(lottieValueAnimator);
                    }
                }
                lottieValueAnimator.k((int) (lottieValueAnimator.i() ? lottieValueAnimator.f() : lottieValueAnimator.g()));
                lottieValueAnimator.f0 = 0L;
                lottieValueAnimator.h0 = 0;
                if (lottieValueAnimator.l0) {
                    lottieValueAnimator.j(false);
                    Choreographer.getInstance().postFrameCallback(lottieValueAnimator);
                }
                this.g0 = onVisibleAction;
            } else {
                this.g0 = OnVisibleAction.f9525Y;
            }
        }
        if (b()) {
            return;
        }
        l((int) (lottieValueAnimator.Z < 0.0f ? lottieValueAnimator.g() : lottieValueAnimator.f()));
        lottieValueAnimator.j(true);
        lottieValueAnimator.b(lottieValueAnimator.i());
        if (isVisible()) {
            return;
        }
        this.g0 = onVisibleAction;
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
        if (this.K0) {
            return;
        }
        this.K0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        LottieValueAnimator lottieValueAnimator = this.f9524Y;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.l0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d5  */
    public final void j(Canvas canvas, CompositionLayer compositionLayer) {
        boolean z2;
        if (this.X == null || compositionLayer == null) {
            return;
        }
        if (this.A0 == null) {
            this.A0 = new Canvas();
            this.H0 = new RectF();
            this.I0 = new Matrix();
            this.J0 = new Matrix();
            this.B0 = new Rect();
            this.C0 = new RectF();
            this.D0 = new LPaint();
            this.E0 = new Rect();
            this.F0 = new Rect();
            this.G0 = new RectF();
        }
        canvas.getMatrix(this.I0);
        canvas.getClipBounds(this.B0);
        Rect rect = this.B0;
        this.C0.set(rect.left, rect.top, rect.right, rect.bottom);
        this.I0.mapRect(this.C0);
        f(this.B0, this.C0);
        if (this.q0) {
            this.H0.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            compositionLayer.f(this.H0, null, false);
        }
        this.I0.mapRect(this.H0);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.H0;
        rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z2 = !((ViewGroup) parent).getClipChildren();
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            RectF rectF2 = this.H0;
            Rect rect2 = this.B0;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.H0.width());
        int iCeil2 = (int) Math.ceil(this.H0.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        Bitmap bitmap = this.z0;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.z0.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.z0 = bitmapCreateBitmap;
            this.A0.setBitmap(bitmapCreateBitmap);
            this.K0 = true;
        } else if (this.z0.getWidth() > iCeil || this.z0.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.z0, 0, 0, iCeil, iCeil2);
            this.z0 = bitmapCreateBitmap2;
            this.A0.setBitmap(bitmapCreateBitmap2);
            this.K0 = true;
        }
        if (this.K0) {
            Matrix matrix = this.y0;
            matrix.set(this.I0);
            matrix.preScale(fWidth, fHeight);
            RectF rectF3 = this.H0;
            matrix.postTranslate(-rectF3.left, -rectF3.top);
            this.z0.eraseColor(0);
            compositionLayer.h(this.A0, matrix, this.s0);
            this.I0.invert(this.J0);
            this.J0.mapRect(this.G0, this.H0);
            f(this.F0, this.G0);
        }
        this.E0.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.z0, this.E0, this.F0, this.D0);
    }

    public final void k() {
        if (this.r0 == null) {
            this.h0.add(new m(this, 0));
            return;
        }
        e();
        boolean zB = b();
        OnVisibleAction onVisibleAction = OnVisibleAction.X;
        LottieValueAnimator lottieValueAnimator = this.f9524Y;
        if (zB || lottieValueAnimator.getRepeatCount() == 0) {
            if (isVisible()) {
                lottieValueAnimator.l0 = true;
                lottieValueAnimator.j(false);
                Choreographer.getInstance().postFrameCallback(lottieValueAnimator);
                lottieValueAnimator.f0 = 0L;
                if (lottieValueAnimator.i() && lottieValueAnimator.g0 == lottieValueAnimator.g()) {
                    lottieValueAnimator.g0 = lottieValueAnimator.f();
                } else if (!lottieValueAnimator.i() && lottieValueAnimator.g0 == lottieValueAnimator.f()) {
                    lottieValueAnimator.g0 = lottieValueAnimator.g();
                }
                this.g0 = onVisibleAction;
            } else {
                this.g0 = OnVisibleAction.Z;
            }
        }
        if (b()) {
            return;
        }
        l((int) (lottieValueAnimator.Z < 0.0f ? lottieValueAnimator.g() : lottieValueAnimator.f()));
        lottieValueAnimator.j(true);
        lottieValueAnimator.b(lottieValueAnimator.i());
        if (isVisible()) {
            return;
        }
        this.g0 = onVisibleAction;
    }

    public final void l(int i2) {
        if (this.X == null) {
            this.h0.add(new n(this, i2, 0));
        } else {
            this.f9524Y.k(i2);
        }
    }

    public final void m(int i2) {
        if (this.X == null) {
            this.h0.add(new n(this, i2, 1));
            return;
        }
        LottieValueAnimator lottieValueAnimator = this.f9524Y;
        lottieValueAnimator.l(lottieValueAnimator.i0, i2 + 0.99f);
    }

    public final void n(String str) {
        LottieComposition lottieComposition = this.X;
        if (lottieComposition == null) {
            this.h0.add(new i(this, str, 1));
            return;
        }
        Marker markerC = lottieComposition.c(str);
        if (markerC == null) {
            throw new IllegalArgumentException(android.support.v4.media.a.n("Cannot find marker with name ", str, mo.ono));
        }
        m((int) (markerC.f9733b + markerC.f9734c));
    }

    public final void o(String str) {
        LottieComposition lottieComposition = this.X;
        ArrayList arrayList = this.h0;
        if (lottieComposition == null) {
            arrayList.add(new i(this, str, 0));
            return;
        }
        Marker markerC = lottieComposition.c(str);
        if (markerC == null) {
            throw new IllegalArgumentException(android.support.v4.media.a.n("Cannot find marker with name ", str, mo.ono));
        }
        int i2 = (int) markerC.f9733b;
        int i3 = ((int) markerC.f9734c) + i2;
        if (this.X == null) {
            arrayList.add(new k(this, i2, i3));
        } else {
            this.f9524Y.l(i2, i3 + 0.99f);
        }
    }

    public final void p(int i2) {
        if (this.X == null) {
            this.h0.add(new n(this, i2, 2));
        } else {
            LottieValueAnimator lottieValueAnimator = this.f9524Y;
            lottieValueAnimator.l(i2, (int) lottieValueAnimator.j0);
        }
    }

    public final void q(String str) {
        LottieComposition lottieComposition = this.X;
        if (lottieComposition == null) {
            this.h0.add(new i(this, str, 2));
            return;
        }
        Marker markerC = lottieComposition.c(str);
        if (markerC == null) {
            throw new IllegalArgumentException(android.support.v4.media.a.n("Cannot find marker with name ", str, mo.ono));
        }
        p((int) markerC.f9733b);
    }

    public final void r(float f) {
        LottieComposition lottieComposition = this.X;
        if (lottieComposition == null) {
            this.h0.add(new j(this, f, 2));
            return;
        }
        this.f9524Y.k(MiscUtils.d(lottieComposition.k, lottieComposition.f9520l, f));
        L.a();
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
    public final void setAlpha(int i2) {
        this.s0 = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Logger.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z2, z3);
        OnVisibleAction onVisibleAction = OnVisibleAction.Z;
        if (z2) {
            OnVisibleAction onVisibleAction2 = this.g0;
            if (onVisibleAction2 == OnVisibleAction.f9525Y) {
                i();
                return visible;
            }
            if (onVisibleAction2 == onVisibleAction) {
                k();
                return visible;
            }
        } else {
            if (this.f9524Y.l0) {
                h();
                this.g0 = onVisibleAction;
                return visible;
            }
            if (zIsVisible) {
                this.g0 = OnVisibleAction.X;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        i();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.h0.clear();
        LottieValueAnimator lottieValueAnimator = this.f9524Y;
        lottieValueAnimator.j(true);
        lottieValueAnimator.b(lottieValueAnimator.i());
        if (isVisible()) {
            return;
        }
        this.g0 = OnVisibleAction.X;
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
