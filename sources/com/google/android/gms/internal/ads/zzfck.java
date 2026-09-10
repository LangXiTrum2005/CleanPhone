package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfck implements zzijg {
    public static zzfaa zza(Context context, zzccp zzccpVar, zzccq zzccqVar, Object obj, zzfbc zzfbcVar, zzfbw zzfbwVar, zzija zzijaVar, zzija zzijaVar2, zzija zzijaVar3, zzija zzijaVar4, zzija zzijaVar5, zzija zzijaVar6, zzija zzijaVar7, Executor executor, zzfno zzfnoVar, zzdxe zzdxeVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzfbp) obj);
        hashSet.add(zzfbcVar);
        hashSet.add(zzfbwVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgG)).booleanValue()) {
            hashSet.add((zzezx) zzijaVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgH)).booleanValue()) {
            hashSet.add((zzezx) zzijaVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgJ)).booleanValue()) {
            hashSet.add((zzezx) zzijaVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgK)).booleanValue()) {
            hashSet.add((zzezx) zzijaVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdO)).booleanValue()) {
            hashSet.add((zzezx) zzijaVar7.zzb());
        }
        return new zzfaa(context, executor, hashSet, zzfnoVar, zzdxeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
