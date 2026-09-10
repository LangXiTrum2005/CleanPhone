package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.x.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcuw extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcuw(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcuw zza(Context context, View view, zzfhr zzfhrVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcuw zzcuwVar = new zzcuw(context);
        List list = zzfhrVar.zzu;
        if (!list.isEmpty() && (resources = zzcuwVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfhs zzfhsVar = (zzfhs) list.get(0);
            float f = zzfhsVar.zza;
            float f2 = displayMetrics.density;
            zzcuwVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (zzfhsVar.zzb * f2)));
        }
        zzcuwVar.zzb = view;
        zzcuwVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzceb.zzb(zzcuwVar, zzcuwVar);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzceb.zza(zzcuwVar, zzcuwVar);
        JSONObject jSONObject = zzfhrVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcuwVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(g.f39716B);
        if (jSONObjectOptJSONObject != null) {
            zzcuwVar.zzb(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcuwVar.zzb(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcuwVar.addView(relativeLayout);
        return zzcuwVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i2) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzc = zzc(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzc, 0, iZzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i2);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzc(double d) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(this.zza, (int) d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
