package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzd implements zzlk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzfb f20196a;

    public zzd(zzfb zzfbVar) {
        this.f20196a = zzfbVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zza(String str, String str2, Bundle bundle) {
        this.f20196a.zzi(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzb(String str, String str2, Bundle bundle, long j) {
        this.f20196a.zzj(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map zzd(String str, String str2, boolean z2) {
        return this.f20196a.zzC(str, str2, z2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zze(zzjp zzjpVar) {
        this.f20196a.zzd(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzf(zzjq zzjqVar) {
        this.f20196a.zzf(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzg(zzjq zzjqVar) {
        this.f20196a.zzg(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        return this.f20196a.zzA();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        return this.f20196a.zzB();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        return this.f20196a.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        return this.f20196a.zzx();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        return this.f20196a.zzz();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzm(String str) {
        this.f20196a.zzu(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        this.f20196a.zzv(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzo(Bundle bundle) {
        this.f20196a.zzl(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzp(String str, String str2, Bundle bundle) {
        this.f20196a.zzm(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List zzq(String str, String str2) {
        return this.f20196a.zzn(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int zzr(String str) {
        return this.f20196a.zzF(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Object zzx(int i2) {
        return this.f20196a.zzJ(i2);
    }
}
