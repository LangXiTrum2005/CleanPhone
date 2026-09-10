package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.an;
import com.google.android.gms.internal.ads.fw0;
import com.google.android.gms.internal.ads.jw0;
import com.google.android.gms.internal.ads.qz;
import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.internal.ads.yd1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzy implements yd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f11526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xz f11527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qz f11528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fw0 f11529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzap f11530e;

    public zzy(zzap zzapVar, ListenableFuture listenableFuture, xz xzVar, qz qzVar, fw0 fw0Var) {
        this.f11526a = listenableFuture;
        this.f11527b = xzVar;
        this.f11528c = qzVar;
        this.f11529d = fw0Var;
        this.f11530e = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public final void zza(Throwable th2) {
        String message = th2.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.M8)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().e("SignalGeneratorImpl.generateSignals", th2);
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().d("SignalGeneratorImpl.generateSignals", th2);
        }
        jw0 jw0VarG1 = zzap.G1(this.f11526a, this.f11527b);
        if (((Boolean) an.f12468e.o()).booleanValue() && jw0VarG1 != null) {
            fw0 fw0Var = this.f11529d;
            fw0Var.a(th2);
            fw0Var.zzd(false);
            jw0VarG1.a(fw0Var);
            jw0VarG1.h();
        }
        qz qzVar = this.f11528c;
        if (qzVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                sb2.append("Internal error. ");
                sb2.append(message);
                message = sb2.toString();
            }
            qzVar.b(message);
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public final /* synthetic */ void mo164zzb(@Nullable Object obj) {
        zzap zzapVar = this.f11530e;
        AtomicBoolean atomicBoolean = zzapVar.B;
        zzbc zzbcVar = (zzbc) obj;
        jw0 jw0VarG1 = zzap.G1(this.f11526a, this.f11527b);
        atomicBoolean.set(true);
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.G8)).booleanValue();
        qz qzVar = this.f11528c;
        fw0 fw0Var = this.f11529d;
        if (!zBooleanValue) {
            if (qzVar != null) {
                try {
                    qzVar.b("QueryInfo generation has been disabled.");
                } catch (RemoteException e10) {
                    String strConcat = "QueryInfo generation has been disabled.".concat(e10.toString());
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
                }
            }
            if (!((Boolean) an.f12468e.o()).booleanValue() || jw0VarG1 == null) {
                return;
            }
            fw0Var.zzk("QueryInfo generation has been disabled.");
            fw0Var.zzd(false);
            jw0VarG1.a(fw0Var);
            jw0VarG1.h();
            return;
        }
        try {
            if (zzbcVar == null) {
                if (qzVar != null) {
                    qzVar.s0(null, null, null);
                }
                fw0Var.zzd(true);
                if (!((Boolean) an.f12468e.o()).booleanValue() || jw0VarG1 == null) {
                    return;
                }
                jw0VarG1.a(fw0Var);
                jw0VarG1.h();
                return;
            }
            try {
                if (TextUtils.isEmpty(new JSONObject(zzbcVar.zzb).optString("request_id", ""))) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                    if (qzVar != null) {
                        qzVar.b("Internal error: request ID is empty in request JSON.");
                    }
                    fw0Var.zzk("Request ID empty");
                    fw0Var.zzd(false);
                    if (!((Boolean) an.f12468e.o()).booleanValue() || jw0VarG1 == null) {
                        return;
                    }
                    jw0VarG1.a(fw0Var);
                    jw0VarG1.h();
                    return;
                }
                Bundle bundle = zzbcVar.zzd;
                boolean z10 = zzapVar.f11410p;
                String str = zzapVar.f11411q;
                String str2 = zzapVar.f11412r;
                if (z10 && bundle != null && bundle.getInt(str2, -1) == -1) {
                    bundle.putInt(str2, zzapVar.f11413s.get());
                }
                if (zzapVar.f11409o && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                    if (TextUtils.isEmpty(zzapVar.f11415u)) {
                        zzapVar.f11415u = com.google.android.gms.ads.internal.zzt.zzc().zze(zzapVar.f11397b, zzapVar.f11414t.afmaVersion);
                    }
                    bundle.putString(str, zzapVar.f11415u);
                }
                if (qzVar != null) {
                    qzVar.s0(zzbcVar.zza, bundle, zzbcVar.zzb);
                }
                fw0Var.zzd(true);
                if (!((Boolean) an.f12468e.o()).booleanValue() || jw0VarG1 == null) {
                    return;
                }
                jw0VarG1.a(fw0Var);
                jw0VarG1.h();
            } catch (JSONException e11) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                if (qzVar != null) {
                    String string = e11.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 33);
                    sb2.append("Internal error for request JSON: ");
                    sb2.append(string);
                    qzVar.b(sb2.toString());
                }
                fw0Var.a(e11);
                fw0Var.zzd(false);
                com.google.android.gms.ads.internal.zzt.zzh().d("SignalGeneratorImpl.generateSignals.onSuccess", e11);
                if (!((Boolean) an.f12468e.o()).booleanValue() || jw0VarG1 == null) {
                    return;
                }
                jw0VarG1.a(fw0Var);
                jw0VarG1.h();
            }
        } catch (RemoteException e12) {
            fw0Var.a(e12);
            fw0Var.zzd(false);
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e12);
            com.google.android.gms.ads.internal.zzt.zzh().d("SignalGeneratorImpl.generateSignals.onSuccess", e12);
        } finally {
            if (((Boolean) an.f12468e.o()).booleanValue() && jw0VarG1 != null) {
                jw0VarG1.a(fw0Var);
                jw0VarG1.h();
            }
        }
    }
}
