package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdte extends zzcvk {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdlh zze;
    private final zzdhv zzf;
    private final zzdax zzg;
    private final zzdce zzh;
    private final zzcwf zzi;
    private final zzcac zzj;
    private final zzfup zzk;
    private final zzfie zzl;
    private final zzdxe zzm;
    private boolean zzn;

    public zzdte(zzcvj zzcvjVar, Context context, zzcir zzcirVar, zzdlh zzdlhVar, zzdhv zzdhvVar, zzdax zzdaxVar, zzdce zzdceVar, zzcwf zzcwfVar, zzfhr zzfhrVar, zzfup zzfupVar, zzfie zzfieVar, zzdxe zzdxeVar) {
        super(zzcvjVar);
        this.zzn = false;
        this.zzc = context;
        this.zze = zzdlhVar;
        this.zzd = new WeakReference(zzcirVar);
        this.zzf = zzdhvVar;
        this.zzg = zzdaxVar;
        this.zzh = zzdceVar;
        this.zzi = zzcwfVar;
        this.zzk = zzfupVar;
        zzbzy zzbzyVar = zzfhrVar.zzl;
        this.zzj = new zzcaw(zzbzyVar != null ? zzbzyVar.zza : "", zzbzyVar != null ? zzbzyVar.zzb : 1);
        this.zzl = zzfieVar;
        this.zzm = zzdxeVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcir zzcirVar = (zzcir) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhz)).booleanValue()) {
                if (!this.zzn && zzcirVar != null) {
                    zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtd
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcirVar.destroy();
                        }
                    });
                }
            } else if (zzcirVar != null) {
                zzcirVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zza(boolean z2, Activity activity) {
        Context context;
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdlh zzdlhVar = this.zze;
        if (!com.google.android.gms.ads.internal.util.zzs.zzT(zzdlhVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoW)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzS(this.zzc, this.zzb, this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbg)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc)) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbh)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzn) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The rewarded ad have been showed.");
            this.zzg.zzc(zzfjm.zzd(10, null, null));
            return false;
        }
        this.zzn = true;
        zzdhv zzdhvVar = this.zzf;
        zzdhvVar.zza();
        if (activity == null) {
            context = activity;
            context = this.zzc;
        }
        try {
            context = activity;
            zzdlhVar.zza(z2, context, this.zzg);
            zzdhvVar.zzb();
            return true;
        } catch (zzdlg e2) {
            this.zzg.zzd(e2);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final zzcac zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzl();
    }

    public final boolean zzf() {
        zzcir zzcirVar = (zzcir) this.zzd.get();
        return (zzcirVar == null || zzcirVar.zzaB()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }

    public final zzfie zzh() {
        return this.zzl;
    }
}
