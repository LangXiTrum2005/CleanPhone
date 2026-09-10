package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lr0 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17113a;

    public /* synthetic */ lr0(int i10) {
        this.f17113a = i10;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f17113a) {
            case 0:
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new yq0(k00Var, 2);
            case 1:
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new yq0(k00Var2, 5);
            case 2:
                return new mu0();
            case 3:
                return new ku0();
            case 4:
                su0 su0Var = new su0();
                try {
                    kf1.a();
                    break;
                } catch (GeneralSecurityException e10) {
                    zze.zza("Failed to Configure Aead. ".concat(e10.toString()));
                    zzt.zzh().d("CryptoUtils.registerAead", e10);
                }
                return su0Var;
            case 5:
                return new tu0();
            case 6:
                return p9.b.f48278a;
            case 7:
                zu0 zu0Var = new zu0();
                zu0Var.f22722a = null;
                return zu0Var;
            case 8:
                return new kv0();
            case 9:
                k00 k00Var3 = l00.f16613f;
                ic1.h(k00Var3);
                return k00Var3;
            case 10:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new lu0());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (executorServiceUnconfigurableExecutorService instanceof fe1) {
                    return (fe1) executorServiceUnconfigurableExecutorService;
                }
                return executorServiceUnconfigurableExecutorService instanceof ScheduledExecutorService ? new ke1((ScheduledExecutorService) executorServiceUnconfigurableExecutorService) : new k00(executorServiceUnconfigurableExecutorService);
            case 11:
                k00 k00Var4 = l00.f16608a;
                ic1.h(k00Var4);
                return k00Var4;
            case 12:
                ke1 ke1Var = l00.f16612e;
                ic1.h(ke1Var);
                return ke1Var;
            case 13:
                k00 k00Var5 = l00.f16613f;
                ic1.h(k00Var5);
                return k00Var5;
            case 14:
                return new jz();
            case 15:
                return new c21();
            case 16:
                return new w21();
            case 17:
                return new g41();
            case 18:
                return new v31();
            case 19:
                return new pz0();
            case 20:
                return new b61();
            default:
                return new u61();
        }
    }
}
