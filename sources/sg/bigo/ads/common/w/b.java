package sg.bigo.ads.common.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.List;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f47701a = -2123303016;

    public static class a {
        public long a() {
            return -1L;
        }

        public void b(int i2) {
        }

        public boolean a(int i2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.b$b, reason: collision with other inner class name */
    public static class C0855b extends d<ColorDrawable> {
        private final int d;

        /* JADX WARN: Multi-variable type inference failed */
        private C0855b(View view, ColorDrawable colorDrawable, int i2) {
            super(view, colorDrawable, i2, 0 == true ? 1 : 0);
            T t = this.f47720b;
            this.d = t != 0 ? ((ColorDrawable) t).getColor() : 0;
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final int a() {
            return this.d;
        }

        public /* synthetic */ C0855b(View view, ColorDrawable colorDrawable, int i2, byte b2) {
            this(view, colorDrawable, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(int i2) {
            T t;
            if (this.f47719a == null || (t = this.f47720b) == 0) {
                return;
            }
            ((ColorDrawable) t).setColor(i2);
            ((ColorDrawable) this.f47720b).invalidateSelf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(boolean z2) {
            T t;
            if (this.f47719a == null || (t = this.f47720b) == 0) {
                return;
            }
            ((ColorDrawable) t).setColor(z2 ? this.d : this.f47721c);
            ((ColorDrawable) this.f47720b).invalidateSelf();
        }
    }

    public static class c extends d<Paint> {
        private final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, Paint paint, int i2) {
            super(view, paint, i2, 0 == true ? 1 : 0);
            T t = this.f47720b;
            this.d = t != 0 ? ((Paint) t).getColor() : 0;
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final int a() {
            return this.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(int i2) {
            T t;
            if (this.f47719a == null || (t = this.f47720b) == 0) {
                return;
            }
            ((Paint) t).setColor(i2);
            this.f47719a.getBackground().invalidateSelf();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.w.b.d
        public final void a(boolean z2) {
            T t;
            if (this.f47719a == null || (t = this.f47720b) == 0) {
                return;
            }
            ((Paint) t).setColor(z2 ? this.d : this.f47721c);
            this.f47719a.getBackground().invalidateSelf();
        }
    }

    public static abstract class d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final View f47719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final T f47720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final int f47721c;

        private d(View view, T t, int i2) {
            this.f47719a = view;
            this.f47720b = t;
            this.f47721c = i2;
        }

        public abstract int a();

        public int a(float f) {
            return b.a(f, a(), this.f47721c);
        }

        public abstract void a(int i2);

        public abstract void a(boolean z2);

        public /* synthetic */ d(View view, Object obj, int i2, byte b2) {
            this(view, obj, i2);
        }
    }

    public static class e extends d<Drawable> {
        private Drawable d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ColorDrawable f47722e;
        private int f;

        public e(View view, int i2) {
            super(view, null, i2, (byte) 0);
            ColorDrawable colorDrawable = new ColorDrawable(i2);
            this.f47722e = colorDrawable;
            if (view != null) {
                Drawable background = view.getBackground();
                this.d = background;
                if (background != null) {
                    view.setBackground(new LayerDrawable(new Drawable[]{this.d, colorDrawable}));
                } else {
                    colorDrawable.setColor(0);
                    view.setBackground(colorDrawable);
                }
            }
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final int a() {
            return 0;
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final int a(float f) {
            this.f = Math.max((int) ((255.0f - (f * 255.0f)) + 0.5f), 255);
            return super.a(f);
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final void a(int i2) {
            if (this.f47719a != null) {
                ColorDrawable colorDrawable = this.f47722e;
                if (colorDrawable != null) {
                    colorDrawable.setColor(i2);
                    this.f47722e.invalidateSelf();
                }
                Drawable drawable = this.d;
                if (drawable != null) {
                    drawable.setAlpha(this.f);
                    this.d.invalidateSelf();
                }
            }
        }

        @Override // sg.bigo.ads.common.w.b.d
        public final void a(boolean z2) {
            View view = this.f47719a;
            if (view != null) {
                view.setBackground(z2 ? this.d : this.f47722e);
            }
        }
    }

    public static double a(int i2) {
        double dA = a((16711680 & i2) >> 16, (65280 & i2) >> 8, i2 & 255);
        double dA2 = a(255, 255, 255);
        return (Math.max(dA, dA2) + 0.05000000074505806d) / (Math.min(dA, dA2) + 0.05000000074505806d);
    }

    public static int b(int i2) {
        float[] fArr = new float[3];
        Color.colorToHSV(i2, fArr);
        float f = fArr[2];
        if (f > 0.3f) {
            fArr[2] = android.support.v4.media.a.a(f, 1.0f, 0.6857143f, 0.93f);
        } else {
            fArr[2] = f * 1.5f;
        }
        return Color.HSVToColor(fArr);
    }

    private static double a(int i2, int i3, int i4) {
        double[] dArr = new double[3];
        dArr[0] = i2 / 255.0f;
        dArr[1] = i3 / 255.0f;
        dArr[2] = i4 / 255.0f;
        for (int i5 = 0; i5 < 3; i5++) {
            double d2 = dArr[i5];
            dArr[i5] = d2 <= 0.0392800010740757d ? d2 / 12.920000076293945d : Math.pow((d2 + 0.054999999701976776d) / 1.0549999475479126d, 2.4000000953674316d);
        }
        return (dArr[2] * 0.0722000002861023d) + (dArr[1] * 0.7152000069618225d) + (dArr[0] * 0.2125999927520752d);
    }

    private static float a(float f, float f2) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > f2 ? f2 : f;
    }

    public static /* synthetic */ float a(ValueAnimator valueAnimator) {
        if (valueAnimator == null) {
            return 1.0f;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            return ((Float) animatedValue).floatValue();
        }
        return 1.0f;
    }

    public static int a(float f, int i2, int i3) {
        float f2 = ((i2 >> 24) & 255) / 255.0f;
        float f3 = ((i3 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((i2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((i2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((i2 & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((i3 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((i3 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((i3 & 255) / 255.0f, 2.2d);
        float fA = android.support.v4.media.a.a(f3, f2, f, f2);
        float fA2 = android.support.v4.media.a.a(fPow4, fPow, f, fPow);
        float fA3 = android.support.v4.media.a.a(fPow5, fPow2, f, fPow2);
        float fA4 = android.support.v4.media.a.a(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fA2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fA3, 0.45454545454545453d)) * 255.0f;
        return Math.round(((float) Math.pow(fA4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fPow8) << 8);
    }

    public static int a(int i2, float f) {
        return a(i2, (int) (f * 255.0f));
    }

    public static int a(int i2, int i3) {
        return (i2 & 16777215) | ((Math.max(0, Math.min(255, i3)) & 255) << 24);
    }

    public static int a(Bitmap bitmap, int i2) {
        Integer numA = a(bitmap);
        return numA != null ? numA.intValue() : i2;
    }

    public static ValueAnimator a(final View view, final int i2, final a aVar) {
        if (view == null) {
            return null;
        }
        final d dVarA = a(view, i2);
        int i3 = f47701a;
        Object tag = view.getTag(i3);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        long jA = aVar.a();
        if (jA != -1) {
            valueAnimatorOfFloat.setDuration(jA);
        }
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iA = dVarA.a(b.a(valueAnimator));
                a aVar2 = aVar;
                if (aVar2 != null ? aVar2.a(iA) : false) {
                    return;
                }
                dVarA.a(iA);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.common.w.b.5

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f47713e = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.f47713e = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b(i2);
                }
                dVarA.a(this.f47713e);
                view.setTag(b.f47701a, null);
            }
        });
        valueAnimatorOfFloat.start();
        view.setTag(i3, valueAnimatorOfFloat);
        return valueAnimatorOfFloat;
    }

    public static ValueAnimator a(final View view, final Drawable drawable, long j) {
        if (view == null) {
            return null;
        }
        int i2 = f47701a;
        Object tag = view.getTag(i2);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        final Drawable background = view.getBackground();
        if (background == null) {
            view.setBackground(drawable);
        } else {
            view.setBackground(new LayerDrawable(new Drawable[]{background, drawable}));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (j != -1) {
            valueAnimatorOfFloat.setDuration(j);
        }
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iMax = Math.max((int) ((b.a(valueAnimator) * 255.0f) + 0.5f), 255);
                drawable.setAlpha(iMax);
                drawable.invalidateSelf();
                Drawable drawable2 = background;
                if (drawable2 != null) {
                    drawable2.setAlpha(255 - iMax);
                    background.invalidateSelf();
                }
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.common.w.b.7
            private boolean d = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.d = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                view.setBackground(this.d ? background : drawable);
                view.setTag(b.f47701a, null);
            }
        });
        valueAnimatorOfFloat.start();
        view.setTag(i2, valueAnimatorOfFloat);
        return valueAnimatorOfFloat;
    }

    public static Integer a(Bitmap bitmap) {
        int iMax;
        int i2;
        sg.bigo.ads.common.w.c.b[] bVarArr;
        if (bitmap == null) {
            return null;
        }
        try {
            sg.bigo.ads.common.w.c.a aVarA = sg.bigo.ads.common.w.c.a(bitmap);
            Bitmap bitmapA = aVarA.f47727a;
            if (bitmapA == null) {
                throw new AssertionError();
            }
            double dSqrt = -1.0d;
            if (aVarA.d > 0) {
                int width = bitmapA.getWidth() * bitmapA.getHeight();
                int i3 = aVarA.d;
                if (width > i3) {
                    dSqrt = Math.sqrt(((double) i3) / ((double) width));
                }
            } else if (aVarA.f47730e > 0 && (iMax = Math.max(bitmapA.getWidth(), bitmapA.getHeight())) > (i2 = aVarA.f47730e)) {
                dSqrt = ((double) i2) / ((double) iMax);
            }
            if (dSqrt > 0.0d) {
                bitmapA = sg.bigo.ads.common.utils.d.a(bitmapA, (int) Math.ceil(((double) bitmapA.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmapA.getHeight()) * dSqrt));
            }
            Bitmap bitmap2 = bitmapA;
            int width2 = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int[] iArr = new int[width2 * height];
            bitmap2.getPixels(iArr, 0, width2, 0, 0, width2, height);
            int i4 = aVarA.f47729c;
            if (aVarA.f.isEmpty()) {
                bVarArr = null;
            } else {
                List<sg.bigo.ads.common.w.c.b> list = aVarA.f;
                bVarArr = (sg.bigo.ads.common.w.c.b[]) list.toArray(new sg.bigo.ads.common.w.c.b[list.size()]);
            }
            sg.bigo.ads.common.w.a aVar = new sg.bigo.ads.common.w.a(iArr, i4, bVarArr);
            if (bitmap2 != aVarA.f47727a) {
                bitmap2.recycle();
            }
            sg.bigo.ads.common.w.c cVar = new sg.bigo.ads.common.w.c(aVar.f47693c, aVarA.f47728b);
            cVar.a();
            sg.bigo.ads.common.w.c.C0856c c0856c = cVar.f47724a;
            if (c0856c != null) {
                return Integer.valueOf(c0856c.f47731a);
            }
            return null;
        } catch (Exception unused) {
        }
    }

    private static d a(View view, int i2) {
        Drawable drawableFindDrawableByLayerId;
        Drawable background = view.getBackground();
        if ((background instanceof LayerDrawable) && (drawableFindDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(sg.bigo.ads.common.utils.d.f47502a)) != null) {
            background = drawableFindDrawableByLayerId;
        }
        byte b2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < 10 && background != null) {
                i3++;
                Object objA = sg.bigo.ads.common.r.a.a(background, "getDrawable", Drawable.class);
                if (!(objA instanceof Drawable)) {
                    break;
                }
                background = (Drawable) objA;
            } else {
                background = null;
                break;
            }
        }
        if (background instanceof ColorDrawable) {
            return new C0855b(view, (ColorDrawable) background, i2, b2);
        }
        if (!(background instanceof ShapeDrawable)) {
            return new e(view, i2);
        }
        Paint paint = ((ShapeDrawable) background).getPaint();
        Paint.Style style = paint.getStyle();
        return (style == Paint.Style.FILL || style == Paint.Style.FILL_AND_STROKE) ? new c(view, paint, i2) : new e(view, i2);
    }

    public static void a(int i2, int i3, int i4, float[] fArr) {
        float f;
        float fAbs;
        float f2 = i2 / 255.0f;
        float f3 = i3 / 255.0f;
        float f4 = i4 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else {
                f = fMax == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            }
            fAbs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = a(f7, 360.0f);
        fArr[1] = a(fAbs, 1.0f);
        fArr[2] = a(f6, 1.0f);
    }

    public static void a(final int i2, final int i3, long j, final TextView... textViewArr) {
        if (k.a(textViewArr)) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (j >= 0) {
            valueAnimatorOfFloat.setDuration(j);
        }
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iA = b.a(b.a(valueAnimator), i2, i3);
                for (TextView textView : textViewArr) {
                    textView.setTextColor(iA);
                }
            }
        });
        valueAnimatorOfFloat.start();
    }

    public static void a(int i2, float[] fArr) {
        a(Color.red(i2), Color.green(i2), Color.blue(i2), fArr);
    }

    public static void a(View view) {
        a(view, -1, new a() { // from class: sg.bigo.ads.common.w.b.3
            @Override // sg.bigo.ads.common.w.b.a
            public final long a() {
                return 0L;
            }
        });
    }

    public static void a(Interpolator interpolator, final View view) {
        if (view == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.common.w.b.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f47705a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f47706b = -1291845632;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setBackgroundColor(b.a(b.a(valueAnimator), this.f47705a, this.f47706b));
            }
        });
        valueAnimatorOfFloat.start();
    }
}
