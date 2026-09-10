package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.smartdigimkt.u2.m;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static TooltipCompatHandler l0;
    public static TooltipCompatHandler m0;
    public final View X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final CharSequence f3663Y;
    public final int Z;
    public final c e0;
    public final c f0;
    public int g0;
    public int h0;
    public TooltipPopup i0;
    public boolean j0;
    public boolean k0 = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    public TooltipCompatHandler(View view, CharSequence charSequence) {
        final int i2 = 0;
        this.e0 = new Runnable(this) { // from class: androidx.appcompat.widget.c

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ TooltipCompatHandler f3673Y;

            {
                this.f3673Y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f3673Y.c(false);
                        break;
                    default:
                        this.f3673Y.a();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f0 = new Runnable(this) { // from class: androidx.appcompat.widget.c

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ TooltipCompatHandler f3673Y;

            {
                this.f3673Y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f3673Y.c(false);
                        break;
                    default:
                        this.f3673Y.a();
                        break;
                }
            }
        };
        this.X = view;
        this.f3663Y = charSequence;
        this.Z = ViewConfigurationCompat.c(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(TooltipCompatHandler tooltipCompatHandler) {
        TooltipCompatHandler tooltipCompatHandler2 = l0;
        if (tooltipCompatHandler2 != null) {
            tooltipCompatHandler2.X.removeCallbacks(tooltipCompatHandler2.e0);
        }
        l0 = tooltipCompatHandler;
        if (tooltipCompatHandler != null) {
            tooltipCompatHandler.X.postDelayed(tooltipCompatHandler.e0, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        TooltipCompatHandler tooltipCompatHandler = m0;
        View view = this.X;
        if (tooltipCompatHandler == this) {
            m0 = null;
            TooltipPopup tooltipPopup = this.i0;
            if (tooltipPopup != null) {
                View view2 = tooltipPopup.f3665b;
                if (view2.getParent() != null) {
                    ((WindowManager) tooltipPopup.f3664a.getSystemService("window")).removeView(view2);
                }
                this.i0 = null;
                this.k0 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (l0 == this) {
            b(null);
        }
        view.removeCallbacks(this.f0);
    }

    public final void c(boolean z2) {
        int height;
        int i2;
        int i3;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        View view = this.X;
        if (view.isAttachedToWindow()) {
            b(null);
            TooltipCompatHandler tooltipCompatHandler = m0;
            if (tooltipCompatHandler != null) {
                tooltipCompatHandler.a();
            }
            m0 = this;
            this.j0 = z2;
            TooltipPopup tooltipPopup = new TooltipPopup(view.getContext());
            this.i0 = tooltipPopup;
            int width = this.g0;
            int i5 = this.h0;
            boolean z3 = this.j0;
            View view2 = tooltipPopup.f3665b;
            ViewParent parent = view2.getParent();
            Context context = tooltipPopup.f3664a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            tooltipPopup.f3666c.setText(this.f3663Y);
            WindowManager.LayoutParams layoutParams = tooltipPopup.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i5 + dimensionPixelOffset2;
                i2 = i5 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i4 = 1;
            } else {
                Rect rect = tooltipPopup.f3667e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i3 = 0;
                    i4 = 1;
                } else {
                    Resources resources = context.getResources();
                    i4 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = tooltipPopup.g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = tooltipPopup.f;
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i6;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams.x = (i6 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i4];
                int i8 = ((i7 + i2) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i8 >= 0) {
                        layoutParams.y = i8;
                    } else {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.j0) {
                j2 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = m.D0;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = MBInterstitialActivity.WEB_LOAD_TIME;
                }
                j2 = j - longPressTimeout;
            }
            c cVar = this.f0;
            view.removeCallbacks(cVar);
            view.postDelayed(cVar, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.i0 == null || !this.j0) {
            View view2 = this.X;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.k0 = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.i0 == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.k0) {
                        this.g0 = x;
                        this.h0 = y;
                        this.k0 = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.g0);
                        int i2 = this.Z;
                        if (iAbs > i2 || Math.abs(y - this.h0) > i2) {
                            this.g0 = x;
                            this.h0 = y;
                            this.k0 = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.g0 = view.getWidth() / 2;
        this.h0 = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
