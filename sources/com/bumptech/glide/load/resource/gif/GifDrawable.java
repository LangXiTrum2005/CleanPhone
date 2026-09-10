package com.bumptech.glide.load.resource.gif;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class GifDrawable extends Drawable implements GifFrameLoader.FrameCallback, Animatable, Animatable2Compat {
    public final GifState X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f12717Y;
    public boolean Z;
    public boolean e0;
    public int g0;
    public boolean i0;
    public Paint j0;
    public Rect k0;
    public boolean f0 = true;
    public final int h0 = -1;

    public static final class GifState extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GifFrameLoader f12718a;

        public GifState(GifFrameLoader gifFrameLoader) {
            this.f12718a = gifFrameLoader;
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

    public GifDrawable(GifState gifState) {
        this.X = gifState;
    }

    @Override // com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        GifFrameLoader gifFrameLoader = this.X.f12718a;
        GifFrameLoader.DelayTarget delayTarget = gifFrameLoader.f12725i;
        if ((delayTarget != null ? delayTarget.f0 : -1) == gifFrameLoader.f12720a.f12347l.f12334c - 1) {
            this.g0++;
        }
        int i2 = this.h0;
        if (i2 == -1 || this.g0 < i2) {
            return;
        }
        stop();
    }

    public final ByteBuffer b() {
        return this.X.f12718a.f12720a.d.asReadOnlyBuffer();
    }

    public final Bitmap c() {
        return this.X.f12718a.f12726l;
    }

    public final void d() {
        Preconditions.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.e0);
        GifFrameLoader gifFrameLoader = this.X.f12718a;
        if (gifFrameLoader.f12720a.f12347l.f12334c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f12717Y) {
            return;
        }
        this.f12717Y = true;
        if (gifFrameLoader.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = gifFrameLoader.f12722c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !gifFrameLoader.f) {
            gifFrameLoader.f = true;
            gifFrameLoader.j = false;
            gifFrameLoader.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.e0) {
            return;
        }
        if (this.i0) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.k0 == null) {
                this.k0 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.k0);
            this.i0 = false;
        }
        GifFrameLoader gifFrameLoader = this.X.f12718a;
        GifFrameLoader.DelayTarget delayTarget = gifFrameLoader.f12725i;
        Bitmap bitmap = delayTarget != null ? delayTarget.h0 : gifFrameLoader.f12726l;
        if (this.k0 == null) {
            this.k0 = new Rect();
        }
        Rect rect = this.k0;
        if (this.j0 == null) {
            this.j0 = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.j0);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.X.f12718a.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.X.f12718a.f12728p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f12717Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i0 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.j0 == null) {
            this.j0 = new Paint(2);
        }
        this.j0.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.j0 == null) {
            this.j0 = new Paint(2);
        }
        this.j0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Preconditions.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.e0);
        this.f0 = z2;
        if (!z2) {
            this.f12717Y = false;
            GifFrameLoader gifFrameLoader = this.X.f12718a;
            ArrayList arrayList = gifFrameLoader.f12722c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gifFrameLoader.f = false;
            }
        } else if (this.Z) {
            d();
        }
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.Z = true;
        this.g0 = 0;
        if (this.f0) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.Z = false;
        this.f12717Y = false;
        GifFrameLoader gifFrameLoader = this.X.f12718a;
        ArrayList arrayList = gifFrameLoader.f12722c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gifFrameLoader.f = false;
        }
    }
}
