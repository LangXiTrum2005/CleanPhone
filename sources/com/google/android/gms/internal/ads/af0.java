package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af0 implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12006a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cf0 f12007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f12008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WindowManager f12009d;

    public /* synthetic */ af0(cf0 cf0Var, View view, WindowManager windowManager) {
        this.f12007b = cf0Var;
        this.f12008c = view;
        this.f12009d = windowManager;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.ads.bf0] */
    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        int i10;
        int i11 = this.f12006a;
        cf0 cf0Var = this.f12007b;
        switch (i11) {
            case 0:
                b30 b30Var = (b30) obj;
                int i12 = zze.zza;
                zzo.zzd("Hide native ad policy validator overlay.");
                b30Var.zzE().setVisibility(8);
                if (b30Var.zzE().getWindowToken() != null) {
                    this.f12009d.removeView(b30Var.zzE());
                }
                b30Var.destroy();
                ViewTreeObserver viewTreeObserver = this.f12008c.getViewTreeObserver();
                if (cf0Var.f13152c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(cf0Var.f13152c);
                    break;
                }
                break;
            default:
                final b30 b30Var2 = (b30) obj;
                b30Var2.zzP().f14700g = new lj1((Object) cf0Var, false, (Object) map, 19);
                if (map != null) {
                    int i13 = 0;
                    final View view = this.f12008c;
                    Context context = view.getContext();
                    String str = (String) map.get("validator_width");
                    int iIntValue = ((Integer) zzba.zzc().a(am.f12406w9)).intValue();
                    try {
                        iIntValue = Integer.parseInt(str);
                        break;
                    } catch (NumberFormatException unused) {
                    }
                    zzay.zza();
                    int iZzE = zzf.zzE(context, iIntValue);
                    String str2 = (String) map.get("validator_height");
                    int iIntValue2 = ((Integer) zzba.zzc().a(am.f12423x9)).intValue();
                    try {
                        iIntValue2 = Integer.parseInt(str2);
                        break;
                    } catch (NumberFormatException unused2) {
                    }
                    zzay.zza();
                    int iZzE2 = zzf.zzE(context, iIntValue2);
                    try {
                        i10 = Integer.parseInt((String) map.get("validator_x"));
                    } catch (NumberFormatException unused3) {
                        i10 = i13;
                    }
                    zzay.zza();
                    int iZzE3 = zzf.zzE(context, i10);
                    try {
                        i13 = Integer.parseInt((String) map.get("validator_y"));
                        break;
                    } catch (NumberFormatException unused4) {
                    }
                    zzay.zza();
                    int iZzE4 = zzf.zzE(context, i13);
                    b30Var2.F(new t0(1, iZzE, iZzE2));
                    try {
                        b30Var2.zzD().getSettings().setUseWideViewPort(((Boolean) zzba.zzc().a(am.f12439y9)).booleanValue());
                        b30Var2.zzD().getSettings().setLoadWithOverviewMode(((Boolean) zzba.zzc().a(am.f12455z9)).booleanValue());
                        break;
                    } catch (NullPointerException unused5) {
                    }
                    final WindowManager.LayoutParams layoutParamsZzk = zzbs.zzk();
                    layoutParamsZzk.x = iZzE3;
                    layoutParamsZzk.y = iZzE4;
                    View viewZzE = b30Var2.zzE();
                    final WindowManager windowManager = this.f12009d;
                    windowManager.updateViewLayout(viewZzE, layoutParamsZzk);
                    final String str3 = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        final int i14 = (("1".equals(str3) || "2".equals(str3)) ? rect.bottom : rect.top) - iZzE4;
                        cf0Var.f13152c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.bf0
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final /* synthetic */ void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (view.getGlobalVisibleRect(rect2)) {
                                    b30 b30Var3 = b30Var2;
                                    if (b30Var3.zzE().getWindowToken() == null) {
                                        return;
                                    }
                                    String str4 = str3;
                                    boolean zEquals = "1".equals(str4);
                                    int i15 = i14;
                                    WindowManager.LayoutParams layoutParams = layoutParamsZzk;
                                    if (zEquals || "2".equals(str4)) {
                                        layoutParams.y = rect2.bottom - i15;
                                    } else {
                                        layoutParams.y = rect2.top - i15;
                                    }
                                    windowManager.updateViewLayout(b30Var3.zzE(), layoutParams);
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(cf0Var.f13152c);
                        }
                    }
                    String str4 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str4)) {
                        b30Var2.loadUrl(str4);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ af0(cf0 cf0Var, WindowManager windowManager, View view) {
        this.f12007b = cf0Var;
        this.f12009d = windowManager;
        this.f12008c = view;
    }
}
