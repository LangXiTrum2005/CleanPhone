package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class is0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f15835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f15836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zz f15839f;

    public is0(zz zzVar, Context context, ScheduledExecutorService scheduledExecutorService, k00 k00Var, int i10, boolean z10, boolean z11) {
        this.f15839f = zzVar;
        this.f15834a = context;
        this.f15835b = scheduledExecutorService;
        this.f15836c = k00Var;
        this.f15837d = z10;
        this.f15838e = z11;
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final ListenableFuture zza() {
        m00 m00Var = new m00();
        zzay.zza();
        Context context = this.f15834a;
        if (zzf.zzA(context)) {
            l00.f16608a.execute(new yz(this.f15839f, context, m00Var));
        }
        vd1 vd1VarR = vd1.r(m00Var);
        final int i10 = 1;
        d81 d81Var = new d81(this) { // from class: com.google.android.gms.internal.ads.hs0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ is0 f15379b;

            {
                this.f15379b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:32:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.d81
            public final Object apply(Object obj) {
                z11 z11VarF;
                String id2;
                String packageName;
                long jLongValue;
                boolean z10;
                int i11 = i10;
                is0 is0Var = this.f15379b;
                switch (i11) {
                    case 0:
                        is0Var.getClass();
                        zzay.zza();
                        ContentResolver contentResolver = is0Var.f15834a.getContentResolver();
                        return new js0(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new b2.i0());
                    default:
                        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                        b2.i0 i0Var = new b2.i0();
                        if (!is0Var.f15837d) {
                            if (((Boolean) zzba.zzc().a(am.f12192i4)).booleanValue()) {
                                try {
                                    Context context2 = is0Var.f15834a;
                                    z11VarF = z11.f(context2);
                                    Objects.requireNonNull(info);
                                    id2 = info.getId();
                                    Objects.requireNonNull(id2);
                                    packageName = context2.getPackageName();
                                    jLongValue = ((Long) zzba.zzc().a(am.f12282o4)).longValue();
                                    z10 = is0Var.f15838e;
                                    z11VarF.getClass();
                                    synchronized (z11.class) {
                                        i0Var = z11VarF.a(id2, packageName, jLongValue, z10);
                                    }
                                } catch (IOException | IllegalArgumentException e10) {
                                    zzt.zzh().d("AdIdInfoSignalSource.getPaidV1", e10);
                                    i0Var = new b2.i0();
                                }
                            }
                            break;
                        } else if (((Boolean) zzba.zzc().a(am.f12207j4)).booleanValue()) {
                            Context context3 = is0Var.f15834a;
                            z11VarF = z11.f(context3);
                            Objects.requireNonNull(info);
                            id2 = info.getId();
                            Objects.requireNonNull(id2);
                            packageName = context3.getPackageName();
                            jLongValue = ((Long) zzba.zzc().a(am.f12282o4)).longValue();
                            z10 = is0Var.f15838e;
                            z11VarF.getClass();
                            synchronized (z11.class) {
                                i0Var = z11VarF.a(id2, packageName, jLongValue, z10);
                            }
                        }
                        return new js0(info, null, i0Var);
                }
            }
        };
        Executor executor = this.f15836c;
        final int i11 = 0;
        return zw1.t((vd1) zw1.v(zw1.z(vd1VarR, d81Var, executor), ((Long) zzba.zzc().a(am.M1)).longValue(), TimeUnit.MILLISECONDS, this.f15835b), Throwable.class, new d81(this) { // from class: com.google.android.gms.internal.ads.hs0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ is0 f15379b;

            {
                this.f15379b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:32:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.d81
            public final Object apply(Object obj) {
                z11 z11VarF;
                String id2;
                String packageName;
                long jLongValue;
                boolean z10;
                int i12 = i11;
                is0 is0Var = this.f15379b;
                switch (i12) {
                    case 0:
                        is0Var.getClass();
                        zzay.zza();
                        ContentResolver contentResolver = is0Var.f15834a.getContentResolver();
                        return new js0(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new b2.i0());
                    default:
                        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                        b2.i0 i0Var = new b2.i0();
                        if (!is0Var.f15837d) {
                            if (((Boolean) zzba.zzc().a(am.f12192i4)).booleanValue()) {
                                try {
                                    Context context3 = is0Var.f15834a;
                                    z11VarF = z11.f(context3);
                                    Objects.requireNonNull(info);
                                    id2 = info.getId();
                                    Objects.requireNonNull(id2);
                                    packageName = context3.getPackageName();
                                    jLongValue = ((Long) zzba.zzc().a(am.f12282o4)).longValue();
                                    z10 = is0Var.f15838e;
                                    z11VarF.getClass();
                                    synchronized (z11.class) {
                                        i0Var = z11VarF.a(id2, packageName, jLongValue, z10);
                                    }
                                } catch (IOException | IllegalArgumentException e10) {
                                    zzt.zzh().d("AdIdInfoSignalSource.getPaidV1", e10);
                                    i0Var = new b2.i0();
                                }
                            }
                            break;
                        } else if (((Boolean) zzba.zzc().a(am.f12207j4)).booleanValue()) {
                            Context context4 = is0Var.f15834a;
                            z11VarF = z11.f(context4);
                            Objects.requireNonNull(info);
                            id2 = info.getId();
                            Objects.requireNonNull(id2);
                            packageName = context4.getPackageName();
                            jLongValue = ((Long) zzba.zzc().a(am.f12282o4)).longValue();
                            z10 = is0Var.f15838e;
                            z11VarF.getClass();
                            synchronized (z11.class) {
                                i0Var = z11VarF.a(id2, packageName, jLongValue, z10);
                            }
                        }
                        return new js0(info, null, i0Var);
                }
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.bs0
    public final int zzb() {
        return 40;
    }
}
