package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcsw extends zzcvk {
    private final zzcir zzc;
    private final int zzd;
    private final Context zze;
    private final zzcsk zzf;
    private final zzdlh zzg;
    private final zzdhv zzh;
    private final zzdax zzi;
    private final boolean zzj;
    private final zzcdf zzk;
    private final zzdxe zzl;
    private boolean zzm;

    public zzcsw(zzcvj zzcvjVar, Context context, zzcir zzcirVar, int i2, zzcsk zzcskVar, zzdlh zzdlhVar, zzdhv zzdhvVar, zzdax zzdaxVar, zzcdf zzcdfVar, zzdxe zzdxeVar) {
        super(zzcvjVar);
        this.zzm = false;
        this.zzc = zzcirVar;
        this.zze = context;
        this.zzd = i2;
        this.zzf = zzcskVar;
        this.zzg = zzdlhVar;
        this.zzh = zzdhvVar;
        this.zzi = zzdaxVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgp)).booleanValue();
        this.zzk = zzcdfVar;
        this.zzl = zzdxeVar;
    }

    public final void zza(zzbdx zzbdxVar) {
        zzcir zzcirVar = this.zzc;
        if (zzcirVar != null) {
            zzcirVar.zzay(zzbdxVar);
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
    public final void zzb(Activity activity, zzbek zzbekVar, boolean z2) throws RemoteException {
        zzcir zzcirVar;
        zzfhr zzfhrVarZzC;
        Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        boolean z3 = this.zzj;
        if (z3) {
            this.zzh.zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdlh zzdlhVar = this.zzg;
        if (!com.google.android.gms.ads.internal.util.zzs.zzT(zzdlhVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoW)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzS(context, this.zzb, this.zzl);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbg)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzL(context)) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbh)).booleanValue()) {
                        new zzfup(context.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzs().zza()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznl)).booleanValue() && (zzcirVar = this.zzc) != null && (zzfhrVarZzC = zzcirVar.zzC()) != null && zzfhrVarZzC.zzar && zzfhrVarZzC.zzas != this.zzk.zzj()) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The app open consent form has been shown.");
            this.zzi.zzc(zzfjm.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzm) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App open interstitial ad is already visible.");
            this.zzi.zzc(zzfjm.zzd(10, null, null));
        }
        if (this.zzm) {
            return;
        }
        try {
            zzdlhVar.zza(z2, context, this.zzi);
            if (z3) {
                this.zzh.zzb();
            }
            this.zzm = true;
        } catch (zzdlg e2) {
            this.zzi.zzd(e2);
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzd() {
        super.zzd();
        zzcir zzcirVar = this.zzc;
        if (zzcirVar != null) {
            zzcirVar.destroy();
        }
    }

    public final void zze(long j, int i2) {
        this.zzf.zza(j, i2);
    }
}
