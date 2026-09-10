package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.fq;
import com.google.android.gms.internal.ads.gq;
import com.google.android.gms.internal.ads.ka0;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.qc0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import l9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f10901a = new AtomicLong(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f10902b = new ConcurrentHashMap();
    public final zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final zzr zzc;
    public final b30 zzd;
    public final gq zze;

    @NonNull
    public final String zzf;
    public final boolean zzg;

    @NonNull
    public final String zzh;
    public final zzad zzi;
    public final int zzj;
    public final int zzk;

    @NonNull
    public final String zzl;

    @NonNull
    public final VersionInfoParcel zzm;

    @NonNull
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzl zzo;
    public final fq zzp;

    @NonNull
    public final String zzq;

    @NonNull
    public final String zzr;

    @NonNull
    public final String zzs;
    public final ka0 zzt;
    public final qc0 zzu;
    public final aw zzv;
    public final boolean zzw;
    public final long zzx;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, b30 b30Var, int i10, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, ka0 ka0Var, aw awVar, String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzrVar;
        this.zzd = b30Var;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzba.zzc().a(am.f12431y1)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i10;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = ka0Var;
        this.zzu = null;
        this.zzv = awVar;
        this.zzw = false;
        this.zzx = f10901a.getAndIncrement();
    }

    public static final b b(Object obj) {
        if (((Boolean) zzba.zzc().a(am.Fe)).booleanValue()) {
            return null;
        }
        return new b(obj);
    }

    @Nullable
    public static AdOverlayInfoParcel zza(@NonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e10) {
            if (!((Boolean) zzba.zzc().a(am.Fe)).booleanValue()) {
                return null;
            }
            com.google.android.gms.ads.internal.zzt.zzh().d("AdOverlayInfoParcel.getFromIntent", e10);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.I(parcel, 2, this.zza, i10);
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzb;
        r9.b.F(parcel, 3, b(zzaVar));
        zzr zzrVar = this.zzc;
        r9.b.F(parcel, 4, b(zzrVar));
        b30 b30Var = this.zzd;
        r9.b.F(parcel, 5, b(b30Var));
        gq gqVar = this.zze;
        r9.b.F(parcel, 6, b(gqVar));
        r9.b.J(parcel, 7, this.zzf);
        boolean z10 = this.zzg;
        r9.b.Q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r9.b.J(parcel, 9, this.zzh);
        zzad zzadVar = this.zzi;
        r9.b.F(parcel, 10, b(zzadVar));
        int i11 = this.zzj;
        r9.b.Q(parcel, 11, 4);
        parcel.writeInt(i11);
        int i12 = this.zzk;
        r9.b.Q(parcel, 12, 4);
        parcel.writeInt(i12);
        r9.b.J(parcel, 13, this.zzl);
        r9.b.I(parcel, 14, this.zzm, i10);
        r9.b.J(parcel, 16, this.zzn);
        r9.b.I(parcel, 17, this.zzo, i10);
        fq fqVar = this.zzp;
        r9.b.F(parcel, 18, b(fqVar));
        r9.b.J(parcel, 19, this.zzq);
        r9.b.J(parcel, 24, this.zzr);
        r9.b.J(parcel, 25, this.zzs);
        ka0 ka0Var = this.zzt;
        r9.b.F(parcel, 26, b(ka0Var));
        qc0 qc0Var = this.zzu;
        r9.b.F(parcel, 27, b(qc0Var));
        aw awVar = this.zzv;
        r9.b.F(parcel, 28, b(awVar));
        boolean z11 = this.zzw;
        r9.b.Q(parcel, 29, 4);
        parcel.writeInt(z11 ? 1 : 0);
        long j10 = this.zzx;
        r9.b.Q(parcel, 30, 8);
        parcel.writeLong(j10);
        r9.b.S(parcel, iR);
        if (((Boolean) zzba.zzc().a(am.Fe)).booleanValue()) {
            f10902b.put(Long.valueOf(j10), new zzp(zzaVar, zzrVar, b30Var, fqVar, gqVar, zzadVar, ka0Var, qc0Var, awVar, l00.f16611d.schedule(new zzq(j10), ((Integer) zzba.zzc().a(am.He)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, b30 b30Var, boolean z10, int i10, VersionInfoParcel versionInfoParcel, qc0 qc0Var, aw awVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = b30Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z10;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = i10;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = qc0Var;
        this.zzv = awVar;
        this.zzw = false;
        this.zzx = f10901a.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, fq fqVar, gq gqVar, zzad zzadVar, b30 b30Var, boolean z10, int i10, String str, VersionInfoParcel versionInfoParcel, qc0 qc0Var, aw awVar, boolean z11) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = b30Var;
        this.zzp = fqVar;
        this.zze = gqVar;
        this.zzf = null;
        this.zzg = z10;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = qc0Var;
        this.zzv = awVar;
        this.zzw = z11;
        this.zzx = f10901a.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, fq fqVar, gq gqVar, zzad zzadVar, b30 b30Var, boolean z10, int i10, String str, String str2, VersionInfoParcel versionInfoParcel, qc0 qc0Var, aw awVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = b30Var;
        this.zzp = fqVar;
        this.zze = gqVar;
        this.zzf = str2;
        this.zzg = z10;
        this.zzh = str;
        this.zzi = zzadVar;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = qc0Var;
        this.zzv = awVar;
        this.zzw = false;
        this.zzx = f10901a.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z10, String str2, IBinder iBinder5, int i10, int i11, String str3, VersionInfoParcel versionInfoParcel, String str4, com.google.android.gms.ads.internal.zzl zzlVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z11, long j10) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z10;
        this.zzh = str2;
        this.zzj = i10;
        this.zzk = i11;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z11;
        this.zzx = j10;
        if (((Boolean) zzba.zzc().a(am.Fe)).booleanValue()) {
            zzp zzpVar = (zzp) f10902b.remove(Long.valueOf(j10));
            if (zzpVar != null) {
                this.zzb = zzpVar.f10944a;
                this.zzc = zzpVar.f10945b;
                this.zzd = zzpVar.f10946c;
                this.zzp = zzpVar.f10947d;
                this.zze = zzpVar.f10948e;
                this.zzt = zzpVar.f10950g;
                this.zzu = zzpVar.f10951h;
                this.zzv = zzpVar.f10952i;
                this.zzi = zzpVar.f10949f;
                zzpVar.f10953j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.zzb = (com.google.android.gms.ads.internal.client.zza) b.y1(b.x1(iBinder));
        this.zzc = (zzr) b.y1(b.x1(iBinder2));
        this.zzd = (b30) b.y1(b.x1(iBinder3));
        this.zzp = (fq) b.y1(b.x1(iBinder6));
        this.zze = (gq) b.y1(b.x1(iBinder4));
        this.zzi = (zzad) b.y1(b.x1(iBinder5));
        this.zzt = (ka0) b.y1(b.x1(iBinder7));
        this.zzu = (qc0) b.y1(b.x1(iBinder8));
        this.zzv = (aw) b.y1(b.x1(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, VersionInfoParcel versionInfoParcel, b30 b30Var, qc0 qc0Var, String str) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = b30Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = qc0Var;
        this.zzv = null;
        this.zzw = false;
        this.zzx = f10901a.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzrVar, b30 b30Var, int i10, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzrVar;
        this.zzd = b30Var;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = f10901a.getAndIncrement();
    }

    public AdOverlayInfoParcel(b30 b30Var, VersionInfoParcel versionInfoParcel, String str, String str2, int i10, aw awVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = b30Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = awVar;
        this.zzw = false;
        this.zzx = f10901a.getAndIncrement();
    }
}
