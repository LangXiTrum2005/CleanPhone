package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dj implements ii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13554a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13555b;

    public dj(ej ejVar) {
        Objects.requireNonNull(ejVar);
        this.f13555b = ejVar;
    }

    @Override // com.google.android.gms.internal.ads.ii
    public final void zza(boolean z10) {
        switch (this.f13554a) {
            case 0:
                ej ejVar = (ej) this.f13555b;
                if (!z10) {
                    ejVar.c();
                } else {
                    ejVar.d();
                }
                break;
            case 1:
                if (((Boolean) zzba.zzc().a(am.D)).booleanValue()) {
                    ((sx0) this.f13555b).a(z10);
                }
                break;
            default:
                if (((Boolean) zzba.zzc().a(am.D)).booleanValue()) {
                    ((zx0) this.f13555b).c(z10);
                }
                break;
        }
    }

    public dj(sx0 sx0Var) {
        Objects.requireNonNull(sx0Var);
        this.f13555b = sx0Var;
    }

    public dj(zx0 zx0Var) {
        Objects.requireNonNull(zx0Var);
        this.f13555b = zx0Var;
    }
}
