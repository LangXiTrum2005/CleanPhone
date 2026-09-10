package com.smartdigimkt.j7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.smartdigimkt.k7.f;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f36110a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36111b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static TypedValue f36112c;

    public class a implements Runnable {
        final /* synthetic */ View X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f36113Y;
        final /* synthetic */ View Z;

        public a(View view, int i2, View view2) {
            this.X = view;
            this.f36113Y = i2;
            this.Z = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            this.X.getHitRect(rect);
            int i2 = rect.top;
            int i3 = this.f36113Y;
            rect.top = i2 - i3;
            rect.bottom += i3;
            rect.left -= i3;
            rect.right += i3;
            this.Z.setTouchDelegate(new TouchDelegate(rect, this.X));
        }
    }

    public class b implements Runnable {
        final /* synthetic */ View X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ float f36114Y;
        final /* synthetic */ View Z;

        public b(View view, float f, View view2) {
            this.X = view;
            this.f36114Y = f;
            this.Z = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            this.X.getHitRect(rect);
            int iWidth = ((int) ((this.f36114Y - 1.0f) * rect.width())) / 2;
            int iHeight = ((int) ((this.f36114Y - 1.0f) * rect.height())) / 2;
            int i2 = rect.top - iHeight;
            if (i2 < 0) {
                rect.top = 0;
            } else {
                rect.top = i2;
            }
            if (rect.bottom + iHeight > this.Z.getHeight()) {
                rect.bottom = this.Z.getHeight();
            } else {
                rect.bottom += iHeight;
            }
            int i3 = rect.left - iWidth;
            if (i3 < 0) {
                rect.left = 0;
            } else {
                rect.left = i3;
            }
            if (rect.right + iWidth > this.Z.getWidth()) {
                rect.right = this.Z.getWidth();
            } else {
                rect.right += iWidth;
            }
            this.Z.setTouchDelegate(new TouchDelegate(rect, this.X));
        }
    }

    public static void a(View view, int i2) {
        View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new a(view, i2, view2));
        }
    }

    public static boolean b(View view, float f) {
        if (view != null) {
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect) && rect.top >= 0 && rect.bottom <= view.getHeight() && rect.height() > view.getHeight() * f) {
                return true;
            }
        }
        return false;
    }

    public static void a(View view, float f) {
        View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new b(view, f, view2));
        }
    }

    public static Path a(int i2, int i3, int i4) {
        Path path = new Path();
        float f = i2;
        path.moveTo(f, 0.0f);
        float f2 = i3 - i2;
        path.lineTo(f2, 0.0f);
        float f3 = i3;
        path.quadTo(f3, 0.0f, f3, f);
        float f4 = i4 - i2;
        path.lineTo(f3, f4);
        float f5 = i4;
        path.quadTo(f3, f5, f2, f5);
        path.lineTo(f, f5);
        path.quadTo(0.0f, f5, 0.0f, f4);
        path.lineTo(0.0f, f);
        path.quadTo(0.0f, 0.0f, f, 0.0f);
        path.close();
        return path;
    }

    public static void a(Canvas canvas, int i2, int i3, int i4) {
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawPath(a(i4, i2, i3), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(Canvas canvas, int i2, int i3, RectF rectF) {
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.FILL);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawArc(rectF, 0.0f, 180.0f, true, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static int[] a(int i2, int i3, float f) {
        float f2 = i2;
        float f3 = i3;
        if (f > f2 / f3) {
            i3 = (int) Math.ceil(f2 / f);
        } else {
            i2 = (int) Math.ceil(f3 * f);
        }
        return new int[]{i2, i3};
    }

    public static void a(View view) {
        if (view != null) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(boolean z2) {
        f36110a = z2;
    }

    public static boolean a(View view, f.c cVar) {
        return a(view, cVar, 80);
    }

    public static boolean a(View view, f.c cVar, int i2) {
        if (view != null && view.getParent() != null && cVar != null) {
            Object parent = view.getParent();
            if ((parent instanceof View) && cVar.a((View) parent, view, i2, 0) && !f36110a) {
                return true;
            }
        }
        return false;
    }

    public static Drawable a(Context context, int i2) {
        if (context == null) {
            return null;
        }
        return context.getDrawable(i2);
    }

    public static void a(View view, int i2, int i3) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
        }
    }
}
