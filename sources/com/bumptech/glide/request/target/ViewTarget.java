package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.Preconditions;
import com.charging.screenshow.battery.animations.themes.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ViewTarget<T extends View, Z> extends BaseTarget<Z> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ImageView f12821Y;
    public final SizeDeterminer Z;

    /* JADX INFO: renamed from: com.bumptech.glide.request.target.ViewTarget$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            throw null;
        }
    }

    public static final class SizeDeterminer {
        public static Integer d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f12822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f12823b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SizeDeterminerLayoutListener f12824c;

        public static final class SizeDeterminerLayoutListener implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference X;

            public SizeDeterminerLayoutListener(SizeDeterminer sizeDeterminer) {
                this.X = new WeakReference(sizeDeterminer);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                SizeDeterminer sizeDeterminer = (SizeDeterminer) this.X.get();
                if (sizeDeterminer == null) {
                    return true;
                }
                ArrayList arrayList = sizeDeterminer.f12823b;
                if (arrayList.isEmpty()) {
                    return true;
                }
                ImageView imageView = sizeDeterminer.f12822a;
                int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                int iA = sizeDeterminer.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                int iA2 = sizeDeterminer.a(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                if (iA <= 0 && iA != Integer.MIN_VALUE) {
                    return true;
                }
                if (iA2 <= 0 && iA2 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ((SizeReadyCallback) it.next()).b(iA, iA2);
                }
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(sizeDeterminer.f12824c);
                }
                sizeDeterminer.f12824c = null;
                arrayList.clear();
                return true;
            }
        }

        public SizeDeterminer(ImageView imageView) {
            this.f12822a = imageView;
        }

        public final int a(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            ImageView imageView = this.f12822a;
            if (imageView.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = imageView.getContext();
            if (d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Preconditions.c(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return d.intValue();
        }
    }

    public ViewTarget(ImageView imageView) {
        Preconditions.c(imageView, "Argument must not be null");
        this.f12821Y = imageView;
        this.Z = new SizeDeterminer(imageView);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void a(SingleRequest singleRequest) {
        this.Z.f12823b.remove(singleRequest);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void c(SingleRequest singleRequest) {
        SizeDeterminer sizeDeterminer = this.Z;
        ImageView imageView = sizeDeterminer.f12822a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iA = sizeDeterminer.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = sizeDeterminer.f12822a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iA2 = sizeDeterminer.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            singleRequest.b(iA, iA2);
            return;
        }
        ArrayList arrayList = sizeDeterminer.f12823b;
        if (!arrayList.contains(singleRequest)) {
            arrayList.add(singleRequest);
        }
        if (sizeDeterminer.f12824c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            SizeDeterminer.SizeDeterminerLayoutListener sizeDeterminerLayoutListener = new SizeDeterminer.SizeDeterminerLayoutListener(sizeDeterminer);
            sizeDeterminer.f12824c = sizeDeterminerLayoutListener;
            viewTreeObserver.addOnPreDrawListener(sizeDeterminerLayoutListener);
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void d(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public final Request e() {
        Object tag = this.f12821Y.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof Request) {
            return (Request) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void f(Drawable drawable) {
        SizeDeterminer sizeDeterminer = this.Z;
        ViewTreeObserver viewTreeObserver = sizeDeterminer.f12822a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(sizeDeterminer.f12824c);
        }
        sizeDeterminer.f12824c = null;
        sizeDeterminer.f12823b.clear();
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public final void i(Request request) {
        this.f12821Y.setTag(R.id.glide_custom_view_target_tag, request);
    }

    public final String toString() {
        return "Target for: " + this.f12821Y;
    }
}
