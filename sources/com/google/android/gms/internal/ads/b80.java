package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b80 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f12685b;

    public b80(Context context) {
        super(context);
        this.f12684a = context;
    }

    public static b80 a(Context context, View view, du0 du0Var) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        b80 b80Var = new b80(context);
        List list = du0Var.f13711u;
        boolean zIsEmpty = list.isEmpty();
        Context context2 = b80Var.f12684a;
        if (!zIsEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            eu0 eu0Var = (eu0) list.get(0);
            float f10 = eu0Var.f14079a;
            float f11 = displayMetrics.density;
            b80Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (eu0Var.f14080b * f11)));
        }
        b80Var.f12685b = view;
        b80Var.addView(view);
        zzt.zzC();
        t00 t00Var = new t00(b80Var, b80Var);
        View view2 = (View) ((WeakReference) t00Var.f17550a).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            t00Var.X0(viewTreeObserver);
        }
        zzt.zzC();
        s00 s00Var = new s00(b80Var, b80Var);
        View view3 = (View) ((WeakReference) s00Var.f17550a).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            s00Var.X0(viewTreeObserver3);
        }
        JSONObject jSONObject = du0Var.f13689h0;
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            b80Var.b(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            b80Var.b(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        b80Var.addView(relativeLayout);
        return b80Var;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        Context context = this.f12684a;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double dOptDouble = jSONObject.optDouble("padding", 0.0d);
        zzay.zza();
        int iZzE = zzf.zzE(context, (int) dOptDouble);
        textView.setPadding(0, iZzE, 0, iZzE);
        double dOptDouble2 = jSONObject.optDouble("height", 15.0d);
        zzay.zza();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzf.zzE(context, (int) dOptDouble2));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f12685b.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f12685b.setY(-iArr[1]);
    }
}
