package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z41 implements m31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx1 f22501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dx1 f22502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx1 f22503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22505e;

    public z41(dx1 dx1Var, dx1 dx1Var2, dx1 dx1Var3, boolean z10, long j10) {
        this.f22501a = dx1Var;
        this.f22502b = dx1Var2;
        this.f22503c = dx1Var3;
        this.f22504d = z10;
        this.f22505e = j10;
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final ListenableFuture a(Context context) {
        return ((n51) this.f22502b.zzb()).a(context);
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final ListenableFuture b(Context context, View view, Activity activity) {
        return ((n51) this.f22502b.zzb()).b(context, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final ListenableFuture c(Context context, String str, View view) {
        return ((n51) this.f22502b.zzb()).c(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final void d(InputEvent inputEvent) {
        ((n51) this.f22502b.zzb()).d(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final String zza() {
        return ((n51) this.f22502b.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final ListenableFuture zzb() {
        boolean z10 = this.f22504d;
        td1 td1Var = td1.f20333a;
        if (z10) {
            final int i10 = 1;
            fd1 fd1VarX = zw1.x(zw1.t(vd1.r(((g51) this.f22501a.zzb()).a()), Throwable.class, i6.f15621v, td1Var), new od1(this) { // from class: com.google.android.gms.internal.ads.y41

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z41 f22128b;

                {
                    this.f22128b = this;
                }

                @Override // com.google.android.gms.internal.ads.od1
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    switch (i10) {
                        case 0:
                            return ((n51) this.f22128b.f22502b.zzb()).zzb();
                        case 1:
                            return ((c61) this.f22128b.f22503c.zzb()).zza();
                        default:
                            return ((n51) this.f22128b.f22502b.zzb()).zzb();
                    }
                }
            }, td1Var);
            final int i11 = 2;
            return zw1.x(fd1VarX, new od1(this) { // from class: com.google.android.gms.internal.ads.y41

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z41 f22128b;

                {
                    this.f22128b = this;
                }

                @Override // com.google.android.gms.internal.ads.od1
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    switch (i11) {
                        case 0:
                            return ((n51) this.f22128b.f22502b.zzb()).zzb();
                        case 1:
                            return ((c61) this.f22128b.f22503c.zzb()).zza();
                        default:
                            return ((n51) this.f22128b.f22502b.zzb()).zzb();
                    }
                }
            }, td1Var);
        }
        final int i12 = 0;
        fd1 fd1VarX2 = zw1.x(zw1.t(vd1.r(((c61) this.f22503c.zzb()).zza()), Throwable.class, i6.f15622w, td1Var), new od1(this) { // from class: com.google.android.gms.internal.ads.y41

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z41 f22128b;

            {
                this.f22128b = this;
            }

            @Override // com.google.android.gms.internal.ads.od1
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                switch (i12) {
                    case 0:
                        return ((n51) this.f22128b.f22502b.zzb()).zzb();
                    case 1:
                        return ((c61) this.f22128b.f22503c.zzb()).zza();
                    default:
                        return ((n51) this.f22128b.f22502b.zzb()).zzb();
                }
            }
        }, td1Var);
        fd1VarX2.addListener(new ry0(this, 5), td1Var);
        return fd1VarX2;
    }

    @Override // com.google.android.gms.internal.ads.m31
    public final int zzg() {
        return ((n51) this.f22502b.zzb()).zzg();
    }
}
