package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexf implements zzezx {
    private final zzgyw zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzexf(zzgyw zzgywVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgywVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 22;
    }

    public final /* synthetic */ zzexg zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgL)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzexg(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgM)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new zzexg(boolValueOf);
            }
        }
        return new zzexg(null);
    }
}
