package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes.dex */
class TooltipPopup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f3665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f3666c;
    public final WindowManager.LayoutParams d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f3667e;
    public final int[] f;
    public final int[] g;

    public TooltipPopup(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.f3667e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.f3664a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f3665b = viewInflate;
        this.f3666c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
