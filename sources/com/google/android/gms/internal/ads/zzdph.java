package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdph {
    private final zzdua zza;
    private final zzdsp zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdph(zzdua zzduaVar, zzdsp zzdspVar) {
        this.zza = zzduaVar;
        this.zzb = zzdspVar;
    }

    private static final int zzf(Context context, String str, int i2) {
        try {
            i2 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i2);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzcjg {
        zzcir zzcirVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zzcirVarZza.zzE().setVisibility(4);
        zzcirVarZza.zzE().setContentDescription("policy_validator");
        zzcirVarZza.zzab("/sendMessageToSdk", new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdpg
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcir) obj, map);
            }
        });
        zzcirVarZza.zzab("/hideValidatorOverlay", new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdpb
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzcir) obj, map);
            }
        });
        zzcirVarZza.zzab("/open", new zzboa(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzcirVarZza);
        zzbnn zzbnnVar = new zzbnn() { // from class: com.google.android.gms.internal.ads.zzdpc
            @Override // com.google.android.gms.internal.ads.zzbnn
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd(view, windowManager, (zzcir) obj, map);
            }
        };
        zzdsp zzdspVar = this.zzb;
        zzdspVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzbnnVar);
        zzdspVar.zzh(new WeakReference(zzcirVarZza), "/showValidatorOverlay", zzdpd.zza);
        return zzcirVarZza.zzE();
    }

    public final /* synthetic */ void zzb(zzcir zzcirVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcir zzcirVar, Map map) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hide native ad policy validator overlay.");
        zzcirVar.zzE().setVisibility(8);
        if (zzcirVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzcirVar.zzE());
        }
        zzcirVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zzd(final View view, final WindowManager windowManager, zzcir zzcirVar, final Map map) {
        final zzcir zzcirVar2;
        zzcirVar.zzP().zzG(new zzckn() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // com.google.android.gms.internal.ads.zzckn
            public final /* synthetic */ void zza(boolean z2, int i2, String str, String str2) {
                this.zza.zze(map, z2, i2, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjn)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjo)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcirVar.zzaf(zzclb.zzc(iZzf, iZzf2));
        try {
            zzcirVar.zzD().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjp)).booleanValue());
            zzcirVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjq)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzk = com.google.android.gms.ads.internal.util.zzbs.zzk();
        layoutParamsZzk.x = iZzf3;
        layoutParamsZzk.y = iZzf4;
        windowManager.updateViewLayout(zzcirVar.zzE(), layoutParamsZzk);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i2 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iZzf4;
            zzcirVar2 = zzcirVar;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdpe
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final /* synthetic */ void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcir zzcirVar3 = zzcirVar2;
                        if (zzcirVar3.zzE().getWindowToken() == null) {
                            return;
                        }
                        int i3 = i2;
                        WindowManager.LayoutParams layoutParams = layoutParamsZzk;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i3;
                        } else {
                            layoutParams.y = rect2.top - i3;
                        }
                        windowManager.updateViewLayout(zzcirVar3.zzE(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        } else {
            zzcirVar2 = zzcirVar;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcirVar2.loadUrl(str2);
    }

    public final /* synthetic */ void zze(Map map, boolean z2, int i2, String str, String str2) {
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("messageType", "validatorHtmlLoaded");
        mapS.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", mapS);
    }
}
