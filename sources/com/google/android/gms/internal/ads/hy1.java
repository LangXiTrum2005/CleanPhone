package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hy1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15430e;

    public /* synthetic */ hy1(Context context, boolean z10, ry1 ry1Var, j02 j02Var) {
        this.f15426a = 0;
        this.f15428c = context;
        this.f15427b = z10;
        this.f15429d = ry1Var;
        this.f15430e = j02Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.f15426a) {
            case 0:
                h02 h02VarP = h02.p((Context) this.f15428c);
                if (h02VarP == null) {
                    v71.y("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (this.f15427b) {
                    ((ry1) this.f15429d).Y0(h02VarP);
                }
                ((j02) this.f15430e).a(h02VarP.q());
                return;
            case 1:
                ea.h3 h3Var = (ea.h3) this.f15430e;
                ea.g0 g0Var = h3Var.f39458d;
                if (g0Var != null) {
                    h3Var.Y0(g0Var, this.f15427b ? null : (ea.i4) this.f15429d, (ea.n4) this.f15428c);
                    h3Var.T0();
                    return;
                } else {
                    ea.s0 s0Var = ((ea.m1) h3Var.f3623a).f39587f;
                    ea.m1.h(s0Var);
                    s0Var.f39753f.b("Discarding data. Failed to set user property");
                    return;
                }
            case 2:
                ea.h3 h3Var2 = (ea.h3) this.f15430e;
                ea.g0 g0Var2 = h3Var2.f39458d;
                if (g0Var2 != null) {
                    h3Var2.Y0(g0Var2, this.f15427b ? null : (ea.u) this.f15429d, (ea.n4) this.f15428c);
                    h3Var2.T0();
                    return;
                } else {
                    ea.s0 s0Var2 = ((ea.m1) h3Var2.f3623a).f39587f;
                    ea.m1.h(s0Var2);
                    s0Var2.f39753f.b("Discarding data. Failed to send event to service");
                    return;
                }
            case 3:
                ea.h3 h3Var3 = (ea.h3) this.f15430e;
                ea.g0 g0Var3 = h3Var3.f39458d;
                if (g0Var3 != null) {
                    h3Var3.Y0(g0Var3, this.f15427b ? null : (ea.e) this.f15429d, (ea.n4) this.f15428c);
                    h3Var3.T0();
                    return;
                } else {
                    ea.s0 s0Var3 = ((ea.m1) h3Var3.f3623a).f39587f;
                    ea.m1.h(s0Var3);
                    s0Var3.f39753f.b("Discarding data. Failed to send conditional user property to service");
                    return;
                }
            default:
                Intent intent = (Intent) this.f15429d;
                Context context = (Context) this.f15428c;
                boolean z10 = this.f15427b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f15430e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        Bundle extras = intent.getExtras();
                        int iIntValue = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
                        if (extras != null) {
                            h9.a aVar = new h9.a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f24670b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new q9.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f24670b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new com.google.android.gms.common.api.internal.m0(context, aVar, countDownLatch, false, 19));
                            try {
                                iIntValue = ((Integer) Tasks.await(new zc.i(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e10) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e11) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e11.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z10 && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th3;
                }
        }
    }

    public /* synthetic */ hy1(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f15426a = 4;
        this.f15429d = intent;
        this.f15428c = context;
        this.f15427b = z10;
        this.f15430e = pendingResult;
    }

    public /* synthetic */ hy1(ea.h3 h3Var, ea.n4 n4Var, boolean z10, l9.a aVar, int i10) {
        this.f15426a = i10;
        this.f15428c = n4Var;
        this.f15427b = z10;
        this.f15429d = aVar;
        this.f15430e = h3Var;
    }

    public hy1(ea.h3 h3Var, ea.n4 n4Var, boolean z10, ea.e eVar) {
        this.f15426a = 3;
        this.f15428c = n4Var;
        this.f15427b = z10;
        this.f15429d = eVar;
        Objects.requireNonNull(h3Var);
        this.f15430e = h3Var;
    }
}
