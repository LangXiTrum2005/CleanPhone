package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* JADX INFO: compiled from: TooltipPopup.java */
/* JADX INFO: loaded from: classes.dex */
public class hydrovane {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f5479attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int[] f5480beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int[] f5481competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final TextView f5482dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Rect f5483marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final View f5484saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final WindowManager.LayoutParams f5485wireman;

    public hydrovane(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f5485wireman = layoutParams;
        this.f5483marial = new Rect();
        this.f5480beachfront = new int[2];
        this.f5481competently = new int[2];
        this.f5479attabal = context;
        View viewInflate = LayoutInflater.from(context).inflate(beachfront.competently.abc_tooltip, (ViewGroup) null);
        this.f5484saneness = viewInflate;
        this.f5482dern = (TextView) viewInflate.findViewById(beachfront.beachfront.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = beachfront.taiyuan.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public static View saneness(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    public final void attabal(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f5479attabal.getResources().getDimensionPixelOffset(beachfront.wireman.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f5479attabal.getResources().getDimensionPixelOffset(beachfront.wireman.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f5479attabal.getResources().getDimensionPixelOffset(z ? beachfront.wireman.tooltip_y_offset_touch : beachfront.wireman.tooltip_y_offset_non_touch);
        View viewSaneness = saneness(view);
        if (viewSaneness == null) {
            return;
        }
        viewSaneness.getWindowVisibleDisplayFrame(this.f5483marial);
        Rect rect = this.f5483marial;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f5479attabal.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f5483marial.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewSaneness.getLocationOnScreen(this.f5481competently);
        view.getLocationOnScreen(this.f5480beachfront);
        int[] iArr = this.f5480beachfront;
        int i4 = iArr[0];
        int[] iArr2 = this.f5481competently;
        int i5 = i4 - iArr2[0];
        iArr[0] = i5;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i5 + i) - (viewSaneness.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f5484saneness.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f5484saneness.getMeasuredHeight();
        int i6 = this.f5480beachfront[1];
        int i7 = ((i3 + i6) - dimensionPixelOffset3) - measuredHeight;
        int i8 = i6 + height + dimensionPixelOffset3;
        if (z) {
            if (i7 >= 0) {
                layoutParams.y = i7;
                return;
            } else {
                layoutParams.y = i8;
                return;
            }
        }
        if (measuredHeight + i8 <= this.f5483marial.height()) {
            layoutParams.y = i8;
        } else {
            layoutParams.y = i7;
        }
    }

    public void dern() {
        if (wireman()) {
            ((WindowManager) this.f5479attabal.getSystemService("window")).removeView(this.f5484saneness);
        }
    }

    public void marial(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (wireman()) {
            dern();
        }
        this.f5482dern.setText(charSequence);
        attabal(view, i, i2, z, this.f5485wireman);
        ((WindowManager) this.f5479attabal.getSystemService("window")).addView(this.f5484saneness, this.f5485wireman);
    }

    public boolean wireman() {
        return this.f5484saneness.getParent() != null;
    }
}
