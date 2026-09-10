package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yq0 implements bs0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f22347c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe1 f22349b;

    public yq0(Context context, fe1 fe1Var) {
        this.f22348a = 3;
        this.f22349b = fe1Var;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        switch (this.f22348a) {
            case 0:
                return ((k00) this.f22349b).b(new rl(1));
            case 1:
                return ((k00) this.f22349b).b(rl.f19605c);
            case 2:
                return ((k00) this.f22349b).b(kr0.f16512a);
            case 3:
                return ((k00) this.f22349b).b(new rl(this));
            case 4:
                return ((k00) this.f22349b).b(new rl(4));
            default:
                return ((k00) this.f22349b).b(rl.f19606d);
        }
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        switch (this.f22348a) {
            case 0:
                return 55;
            case 1:
                return 20;
            case 2:
                return 24;
            case 3:
                return 27;
            case 4:
                return 45;
            default:
                return 51;
        }
    }

    public /* synthetic */ yq0(fe1 fe1Var, int i10) {
        this.f22348a = i10;
        this.f22349b = fe1Var;
    }
}
