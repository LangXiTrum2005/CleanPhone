package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ss implements p00, o00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vs f20044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fw0 f20045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ws f20046c;

    public /* synthetic */ ss(ws wsVar, vs vsVar, fw0 fw0Var) {
        this.f20044a = vsVar;
        this.f20045b = fw0Var;
        this.f20046c = wsVar;
    }

    @Override // com.google.android.gms.internal.ads.o00, com.google.android.gms.internal.ads.z30
    /* JADX INFO: renamed from: zza */
    public void mo163zza() {
        kw0 kw0Var;
        zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        ws wsVar = this.f20046c;
        synchronized (wsVar.f21596d) {
            try {
                zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                wsVar.f21595c = 1;
                zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.f20044a.v();
                if (((Boolean) an.f12467d.o()).booleanValue() && (kw0Var = (kw0) wsVar.f21599g) != null) {
                    fw0 fw0Var = this.f20045b;
                    fw0Var.zzk("Failed loading new engine");
                    fw0Var.zzd(false);
                    kw0Var.b(fw0Var.zzm());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }

    @Override // com.google.android.gms.internal.ads.p00, com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) {
        kw0 kw0Var;
        zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        ws wsVar = this.f20046c;
        synchronized (wsVar.f21596d) {
            try {
                zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                wsVar.f21595c = 0;
                vs vsVar = (vs) wsVar.f21601i;
                if (vsVar != null && this.f20044a != vsVar) {
                    zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    ((vs) wsVar.f21601i).v();
                }
                wsVar.f21601i = this.f20044a;
                if (((Boolean) an.f12467d.o()).booleanValue() && (kw0Var = (kw0) wsVar.f21599g) != null) {
                    fw0 fw0Var = this.f20045b;
                    fw0Var.zzd(true);
                    kw0Var.b(fw0Var.zzm());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
