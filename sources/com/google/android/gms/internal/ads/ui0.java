package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzt;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ui0 extends qh implements vr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f20799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fw0 f20800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m00 f20801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yi0 f20802f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui0(long j10, m00 m00Var, yi0 yi0Var, fw0 fw0Var, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f20797a = obj;
        this.f20798b = str;
        this.f20799c = j10;
        this.f20800d = fw0Var;
        this.f20801e = m00Var;
        Objects.requireNonNull(yi0Var);
        this.f20802f = yi0Var;
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 2) {
            zze();
        } else {
            if (i10 != 3) {
                return false;
            }
            String string = parcel.readString();
            rh.f(parcel);
            zzf(string);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.vr
    public final void zze() {
        synchronized (this.f20797a) {
            yi0 yi0Var = this.f20802f;
            String str = this.f20798b;
            ((p9.b) zzt.zzk()).getClass();
            yi0Var.d(str, (int) (SystemClock.elapsedRealtime() - this.f20799c), "", true);
            yi0Var.l.b(str);
            yi0Var.f22274o.b(str);
            kw0 kw0Var = yi0Var.f22275p;
            fw0 fw0Var = this.f20800d;
            fw0Var.zzd(true);
            kw0Var.b(fw0Var.zzm());
            this.f20801e.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.vr
    public final void zzf(String str) {
        synchronized (this.f20797a) {
            yi0 yi0Var = this.f20802f;
            String str2 = this.f20798b;
            ((p9.b) zzt.zzk()).getClass();
            yi0Var.d(str2, (int) (SystemClock.elapsedRealtime() - this.f20799c), str, false);
            yi0Var.l.c(str2, "error");
            yi0Var.f22274o.a(str2, "error");
            kw0 kw0Var = yi0Var.f22275p;
            fw0 fw0Var = this.f20800d;
            fw0Var.zzk(str);
            fw0Var.zzd(false);
            kw0Var.b(fw0Var.zzm());
            this.f20801e.zzc(Boolean.FALSE);
        }
    }
}
