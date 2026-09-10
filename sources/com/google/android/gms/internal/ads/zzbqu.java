package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbqu implements zzbqm, zzbqk {
    private zzcir zza;

    public zzbqu(Context context, VersionInfoParcel versionInfoParcel, zzayq zzayqVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcjg {
        com.google.android.gms.ads.internal.zzt.zzd();
        zzcir zzcirVarZza = zzcjh.zza(context, zzclb.zzb(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbfj.zza(), null, null, null, null, null);
        this.zza = zzcirVarZza;
        zzcirVarZza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzz()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbqt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final void zzf(String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>";
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbqp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final void zzg(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbqr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final void zzh(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbqq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzq(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final void zzi(final zzbql zzbqlVar) {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzckp zzckpVarZzP = zzcirVar.zzP();
            Objects.requireNonNull(zzbqlVar);
            zzckpVarZzP.zzH(new zzcko() { // from class: com.google.android.gms.internal.ads.zzbqo
                @Override // com.google.android.gms.internal.ads.zzcko
                public final /* synthetic */ void zza() {
                    zzbqlVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final void zzj() {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.destroy();
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final boolean zzk() {
        zzcir zzcirVar = this.zza;
        return zzcirVar == null || zzcirVar.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final zzbrt zzl() {
        return new zzbrt(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzm(String str, zzbnn zzbnnVar) {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.zzab(str, new zzbqn(this, zzbnnVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzn(String str, final zzbnn zzbnnVar) {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.zzad(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbqs
                @Override // com.google.android.gms.common.util.Predicate
                public final /* synthetic */ boolean apply(Object obj) {
                    zzbnn zzbnnVar2 = (zzbnn) obj;
                    if (zzbnnVar2 instanceof zzbqn) {
                        return ((zzbqn) zzbnnVar2).zzb().equals(zzbnnVar);
                    }
                    return false;
                }
            });
        }
    }

    public final /* synthetic */ void zzo(String str) {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.zza(str);
        }
    }

    public final /* synthetic */ void zzp(String str) {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.loadData(str, "text/html", "UTF-8");
        }
    }

    public final /* synthetic */ void zzq(String str) {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.loadData(str, "text/html", "UTF-8");
        }
    }

    public final /* synthetic */ void zzr(String str) {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.loadUrl(str);
        }
    }
}
