package com.thinkup.core.common.ooo;

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
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Toast;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public final class moo {
    private static final Object m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static TypedValue f42330n = null;
    private static boolean o = false;

    private static boolean m(View view, float f) {
        if (view != null) {
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect) && rect.top >= 0 && rect.bottom <= view.getHeight() && rect.height() > view.getHeight() * f) {
                return true;
            }
        }
        return false;
    }

    private static void o(final View view, final int i2) {
        final View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new Runnable() { // from class: com.thinkup.core.common.ooo.moo.1
                @Override // java.lang.Runnable
                public final void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    int i3 = rect.top;
                    int i4 = i2;
                    rect.top = i3 - i4;
                    rect.bottom += i4;
                    rect.left -= i4;
                    rect.right += i4;
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
            });
        }
    }

    public static void o(final View view, final float f) {
        final View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new Runnable() { // from class: com.thinkup.core.common.ooo.moo.2
                @Override // java.lang.Runnable
                public final void run() {
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    int iWidth = ((int) ((f - 1.0f) * rect.width())) / 2;
                    int iHeight = ((int) ((f - 1.0f) * rect.height())) / 2;
                    int i2 = rect.top;
                    if (i2 - iHeight < 0) {
                        rect.top = 0;
                    } else {
                        rect.top = i2 - iHeight;
                    }
                    if (rect.bottom + iHeight > view2.getHeight()) {
                        rect.bottom = view2.getHeight();
                    } else {
                        rect.bottom += iHeight;
                    }
                    int i3 = rect.left;
                    if (i3 - iWidth < 0) {
                        rect.left = 0;
                    } else {
                        rect.left = i3 - iWidth;
                    }
                    if (rect.right + iWidth > view2.getWidth()) {
                        rect.right = view2.getWidth();
                    } else {
                        rect.right += iWidth;
                    }
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
            });
        }
    }

    private static boolean m(View view, com.thinkup.core.common.ooo.o.om.m mVar) {
        if (view != null && view.getParent() != null && mVar != null) {
            Object parent = view.getParent();
            if ((parent instanceof View) && mVar.o((View) parent, view, 80, 0) && !o) {
                return true;
            }
        }
        return false;
    }

    private static Path o(int i2, int i3, int i4) {
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

    public static void o(Canvas canvas, int i2, int i3, int i4) {
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            Path path = new Path();
            float f = i4;
            path.moveTo(f, 0.0f);
            float f2 = i2 - i4;
            path.lineTo(f2, 0.0f);
            float f3 = i2;
            path.quadTo(f3, 0.0f, f3, f);
            float f4 = i3 - i4;
            path.lineTo(f3, f4);
            float f5 = i3;
            path.quadTo(f3, f5, f2, f5);
            path.lineTo(f, f5);
            path.quadTo(0.0f, f5, 0.0f, f4);
            path.lineTo(0.0f, f);
            path.quadTo(0.0f, 0.0f, f, 0.0f);
            path.close();
            canvas2.drawPath(path, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void o(Canvas canvas, int i2, int i3, RectF rectF) {
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

    public static int[] o(int i2, int i3, float f) {
        float f2 = i2;
        float f3 = i3;
        if (f > f2 / f3) {
            i3 = (int) Math.ceil(f2 / f);
        } else {
            i2 = (int) Math.ceil(f3 * f);
        }
        return new int[]{i2, i3};
    }

    public static void o(View view) {
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

    private static void o(boolean z2) {
        o = z2;
    }

    private static Drawable o(Context context, int i2) {
        if (context == null) {
            return null;
        }
        return context.getDrawable(i2);
    }

    private static void o(View view, int i2, int i3) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
        }
    }

    public static void o(final ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        try {
            viewGroup.postDelayed(new Runnable() { // from class: com.thinkup.core.common.ooo.moo.3
                @Override // java.lang.Runnable
                public final void run() {
                    Rect rect = new Rect();
                    viewGroup.getGlobalVisibleRect(rect);
                    int iHeight = rect.height() * rect.width();
                    DisplayMetrics displayMetrics = viewGroup.getContext().getResources().getDisplayMetrics();
                    if (iHeight / (displayMetrics.widthPixels * displayMetrics.heightPixels) >= 0.8f) {
                        return;
                    }
                    Context contextOn = com.thinkup.core.common.n.o0n.m().on();
                    try {
                        String string = contextOn.getString(o00.o(contextOn, "splash_ad_container_error", k.f38992h));
                        if (TextUtils.isEmpty(string)) {
                            return;
                        }
                        Toast.makeText(contextOn, string, 1).show();
                    } catch (Throwable unused) {
                    }
                }
            }, 500L);
        } catch (Throwable unused) {
        }
    }

    public static boolean o(View view, com.thinkup.core.common.ooo.o.om.m mVar) {
        if (view != null && view.getParent() != null && mVar != null) {
            Object parent = view.getParent();
            if ((parent instanceof View) && mVar.o((View) parent, view, 80, 0) && !o) {
                return true;
            }
        }
        return false;
    }
}
