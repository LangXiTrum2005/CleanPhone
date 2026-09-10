package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jq0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16150c;

    public /* synthetic */ jq0(int i10, Object obj, Object obj2) {
        this.f16148a = i10;
        this.f16149b = obj;
        this.f16150c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        switch (this.f16148a) {
            case 0:
                if (((Boolean) zzba.zzc().a(am.V3)).booleanValue()) {
                    return zw1.d(new eq0(null, 1));
                }
                f00 f00Var = (f00) this.f16150c;
                return zw1.z(f00Var.h(), i6.l, (Executor) this.f16149b);
            case 1:
                return ((k00) ((fe1) this.f16149b)).b(new sf(this, 12));
            case 2:
                zze.zza("HsdpMigrationSignal.produce");
                if (!((Boolean) zzba.zzc().a(am.f12443ye)).booleanValue()) {
                    return zw1.d(new hr0(null, 1));
                }
                boolean z10 = false;
                try {
                    if (((Intent) this.f16150c).resolveActivity(((Context) this.f16149b).getPackageManager()) != null) {
                        zze.zza("HSDP intent is supported");
                        z10 = true;
                    }
                } catch (Exception e10) {
                    zzt.zzh().d("HsdpMigrationSignal.isHsdpMigrationSupported", e10);
                }
                return zw1.d(new hr0(Boolean.valueOf(z10), 1));
            case 3:
                return ((k00) ((fe1) this.f16149b)).b(new sf(this, 20));
            case 4:
                return ((k00) ((fe1) this.f16149b)).b(new sf(this, 22));
            case 5:
                be1 be1VarD = zw1.d((String) this.f16150c);
                i6 i6Var = i6.f15613n;
                Executor executor = (Executor) this.f16149b;
                return zw1.u(zw1.z(be1VarD, i6Var, executor), Throwable.class, new rr(this, 10), executor);
            default:
                return ((k00) ((fe1) this.f16149b)).b(new ns0(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        switch (this.f16148a) {
            case 0:
                return 10;
            case 1:
                return 54;
            case 2:
                return 60;
            case 3:
                return 23;
            case 4:
                return 62;
            case 5:
                return 41;
            default:
                return 48;
        }
    }

    public jq0(VersionInfoParcel versionInfoParcel, fe1 fe1Var) {
        this.f16148a = 1;
        this.f16150c = versionInfoParcel;
        this.f16149b = fe1Var;
    }
}
