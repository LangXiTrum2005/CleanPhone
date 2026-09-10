package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzerr implements zzezx {
    private final zzgyw zza;
    private final Context zzb;
    private final zzfik zzc;
    private final View zzd;

    public zzerr(zzgyw zzgywVar, Context context, zzfik zzfikVar, ViewGroup viewGroup) {
        this.zza = zzgywVar;
        this.zzb = context;
        this.zzc = zzfikVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        zzbgk.zza(this.zzb);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzerq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 3;
    }

    public final /* synthetic */ zzers zzc() {
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzers(this.zzb, this.zzc.zzf, arrayList);
    }
}
