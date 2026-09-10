package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdjs extends zzcvk {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdhv zze;
    private final zzdlh zzf;
    private final zzcwf zzg;
    private final zzfup zzh;
    private final zzdax zzi;
    private final zzcdf zzj;
    private final zzdxe zzk;
    private boolean zzl;

    public zzdjs(zzcvj zzcvjVar, Context context, @Nullable zzcir zzcirVar, zzdhv zzdhvVar, zzdlh zzdlhVar, zzcwf zzcwfVar, zzfup zzfupVar, zzdax zzdaxVar, zzcdf zzcdfVar, zzdxe zzdxeVar) {
        super(zzcvjVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcirVar);
        this.zze = zzdhvVar;
        this.zzf = zzdlhVar;
        this.zzg = zzcwfVar;
        this.zzh = zzfupVar;
        this.zzi = zzdaxVar;
        this.zzj = zzcdfVar;
        this.zzk = zzdxeVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcir zzcirVar = (zzcir) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhz)).booleanValue()) {
                if (!this.zzl && zzcirVar != null) {
                    zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjr
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

    /* JADX WARN: Code duplicated, block: B:14:0x007d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00df  */
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
    public final boolean zza(boolean z2, @Nullable Activity activity) {
        Context context;
        zzfhr zzfhrVarZzC;
        zzdhv zzdhvVar = this.zze;
        zzdhvVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdlh zzdlhVar = this.zzf;
        if (com.google.android.gms.ads.internal.util.zzs.zzT(zzdlhVar.zzb())) {
            zzcir zzcirVar = (zzcir) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznl)).booleanValue()) {
                if (this.zzl) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                    this.zzi.zzc(zzfjm.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzl) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    zzdlhVar.zza(z2, context, this.zzi);
                    zzdhvVar.zzb();
                    this.zzl = true;
                    return true;
                }
            } else {
                if (this.zzl) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                    this.zzi.zzc(zzfjm.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzl) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    zzdlhVar.zza(z2, context, this.zzi);
                    zzdhvVar.zzb();
                    this.zzl = true;
                    return true;
                }
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoW)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzS(this.zzc, this.zzb, this.zzk);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbg)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzL(this.zzc)) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbh)).booleanValue()) {
                        this.zzh.zza(this.zza.zzb.zzb.zzb);
                    }
                } else {
                    zzcir zzcirVar2 = (zzcir) this.zzd.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznl)).booleanValue() || zzcirVar2 == null || (zzfhrVarZzC = zzcirVar2.zzC()) == null || !zzfhrVarZzC.zzar || zzfhrVarZzC.zzas == this.zzj.zzj()) {
                        if (this.zzl) {
                            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                            this.zzi.zzc(zzfjm.zzd(10, null, null));
                        }
                        context = activity;
                        if (!this.zzl) {
                            if (activity == null) {
                                context = this.zzc;
                            }
                            try {
                                zzdlhVar.zza(z2, context, this.zzi);
                                zzdhvVar.zzb();
                                this.zzl = true;
                                return true;
                            } catch (zzdlg e2) {
                                this.zzi.zzd(e2);
                            }
                        }
                    } else {
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial consent form has been shown.");
                        this.zzi.zzc(zzfjm.zzd(12, "The consent form has already been shown.", null));
                    }
                }
            } else {
                zzcir zzcirVar3 = (zzcir) this.zzd.get();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznl)).booleanValue()) {
                    if (this.zzl) {
                        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                        this.zzi.zzc(zzfjm.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzl) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        zzdlhVar.zza(z2, context, this.zzi);
                        zzdhvVar.zzb();
                        this.zzl = true;
                        return true;
                    }
                } else {
                    if (this.zzl) {
                        int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                        this.zzi.zzc(zzfjm.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzl) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        zzdlhVar.zza(z2, context, this.zzi);
                        zzdhvVar.zzb();
                        this.zzl = true;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
