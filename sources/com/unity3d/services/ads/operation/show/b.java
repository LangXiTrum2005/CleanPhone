package com.unity3d.services.ads.operation.show;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import androidx.activity.ComponentActivity;
import cj.c;
import cn.l;
import com.google.android.gms.internal.ads.hx0;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.kj1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.properties.SdkProperties;
import dd.w;
import dn.e;
import ea.f2;
import eb.d0;
import ej.d;
import f.t;
import f2.v0;
import hj.f;
import i1.z0;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k.k;
import l1.n;
import mb.g;
import nd.o0;
import nd.r0;
import r8.i;
import r8.p;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38598c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f38596a = i10;
        this.f38597b = obj;
        this.f38598c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    @Override // java.lang.Runnable
    public final void run() {
        Task task;
        PowerManager.WakeLock wakeLock;
        int i10 = 0;
        int i11 = 1;
        switch (this.f38596a) {
            case 0:
                ((ShowOperationState) this.f38597b).lambda$onUnityAdsShowStart$2((String) this.f38598c);
                return;
            case 1:
                ((ShowOperationState) this.f38597b).lambda$onUnityAdsShowComplete$3((UnityAds.UnityAdsShowCompletionState) this.f38598c);
                return;
            case 2:
                SdkProperties.lambda$notifyInitializationFailed$1((InitializationListener) this.f38597b, (String) this.f38598c);
                return;
            case 3:
                SdkProperties.lambda$notifyInitializationFailed$2((IUnityAdsInitializationListener) this.f38597b, (String) this.f38598c);
                return;
            case 4:
                w wVar = (w) this.f38597b;
                Context context = (Context) this.f38598c;
                if (wVar.f38832a != null || context == null) {
                    return;
                }
                wVar.f38832a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
            case 5:
                String str = (String) this.f38598c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f38597b;
                r rVar = r.f53297a;
                try {
                    g.f(str).b();
                    taskCompletionSource.setResult(rVar);
                    return;
                } catch (IllegalStateException unused) {
                    taskCompletionSource.setResult(rVar);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 6:
                ((l) this.f38597b).C((e) this.f38598c, r.f53297a);
                return;
            case 7:
                ((k3) this.f38597b).m((Typeface) this.f38598c);
                return;
            case 8:
                ((ei.a) this.f38597b).f40097b.b((ArrayList) this.f38598c);
                return;
            case 9:
                ((xi.g) this.f38597b).b((String) this.f38598c);
                return;
            case 10:
                c cVar = (c) this.f38597b;
                d dVar = (d) this.f38598c;
                try {
                    zb.l lVar = vb.c.a().f52533a.f54743h;
                    if (lVar.f54721s.compareAndSet(false, true)) {
                        task = lVar.f54718p.getTask();
                    } else {
                        Log.w("FirebaseCrashlytics", "checkForUnsentReports should only be called once per execution.", null);
                        task = Tasks.forResult(Boolean.FALSE);
                    }
                    cVar.invoke(new h((Boolean) Tasks.await(task)));
                    return;
                } catch (Exception e11) {
                    dVar.getClass();
                    d.a(cVar, e11);
                    return;
                }
            case 11:
                c cVar2 = (c) this.f38597b;
                d dVar2 = (d) this.f38598c;
                try {
                    cVar2.invoke(new h(Boolean.valueOf(vb.c.a().f52533a.f54742g)));
                    return;
                } catch (Exception e12) {
                    dVar2.getClass();
                    d.a(cVar2, e12);
                    return;
                }
            case 12:
                c cVar3 = (c) this.f38597b;
                d dVar3 = (d) this.f38598c;
                try {
                    zb.l lVar2 = vb.c.a().f52533a.f54743h;
                    lVar2.f54719q.trySetResult(Boolean.FALSE);
                    lVar2.f54720r.getTask();
                    cVar3.invoke(new h(r.f53297a));
                    return;
                } catch (Exception e13) {
                    dVar3.getClass();
                    d.a(cVar3, e13);
                    return;
                }
            case 13:
                c cVar4 = (c) this.f38597b;
                d dVar4 = (d) this.f38598c;
                try {
                    zb.l lVar3 = vb.c.a().f52533a.f54743h;
                    lVar3.f54719q.trySetResult(Boolean.TRUE);
                    lVar3.f54720r.getTask();
                    cVar4.invoke(new h(r.f53297a));
                    return;
                } catch (Exception e14) {
                    dVar4.getClass();
                    d.a(cVar4, e14);
                    return;
                }
            case 14:
                ComponentActivity componentActivity = (ComponentActivity) this.f38597b;
                t tVar = (t) this.f38598c;
                int i12 = ComponentActivity.f3834a;
                componentActivity.getLifecycle().a(new f.d(i10, tVar, componentActivity));
                return;
            case 15:
                ((l1.g) this.f38597b).accept(this.f38598c);
                return;
            case 16:
                ((v0) this.f38597b).s((n2.t) this.f38598c);
                return;
            case 17:
                gc.c cVar5 = (gc.c) this.f38597b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f38598c;
                try {
                    p.a().f49509d.n(((i) cVar5.f41836h.f23782b).b(o8.d.f47213c), 1);
                    break;
                } catch (Exception unused2) {
                }
                countDownLatch.countDown();
                return;
            case 18:
                ((AppStartTrace) this.f38597b).f24692b.c((r0) ((o0) this.f38598c).build(), nd.l.FOREGROUND_BACKGROUND);
                return;
            case 19:
                FlutterFirebaseMessagingBackgroundService.f43401i.i((Intent) this.f38597b, (CountDownLatch) this.f38598c);
                return;
            case 20:
                ((com.mbridge.msdk.config.component.pipeline.a) this.f38597b).d((com.mbridge.msdk.config.component.base.b) this.f38598c);
                return;
            case 21:
                c cVar6 = (c) this.f38597b;
                f fVar = (f) this.f38598c;
                HashMap map = f.f42368a;
                try {
                    Boolean bool = bd.c.a().f5589c;
                    cVar6.invoke(new h(Boolean.valueOf(bool != null ? bool.booleanValue() : g.e().k())));
                    return;
                } catch (Exception e15) {
                    fVar.getClass();
                    f.a(cVar6, e15);
                    return;
                }
            case 22:
                Context context2 = (Context) this.f38597b;
                l1.f fVar2 = (l1.f) this.f38598c;
                j1.f.f43591a = (AudioManager) context2.getSystemService("audio");
                fVar2.c();
                return;
            case 23:
                k kVar = (k) this.f38597b;
                Runnable runnable = (Runnable) this.f38598c;
                kVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    kVar.a();
                }
            case 24:
                kj1 kj1Var = (kj1) this.f38597b;
                Object objApply = ((p1.t) this.f38598c).apply(kj1Var.f16467f);
                kj1Var.f16467f = objApply;
                l1.b bVar = new l1.b(kj1Var, objApply, i11);
                l1.w wVar2 = (l1.w) kj1Var.f16464c;
                if (wVar2.f44825a.getLooper().getThread().isAlive()) {
                    wVar2.c(bVar);
                    return;
                }
                return;
            case 25:
                l1.p pVar = (l1.p) this.f38597b;
                Context context3 = (Context) this.f38598c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context3.registerReceiver(new q7.c(pVar, 11), intentFilter);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                q7.c cVar7 = (q7.c) this.f38597b;
                Context context4 = (Context) this.f38598c;
                l1.p pVar2 = (l1.p) cVar7.f48672b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context4.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i10 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i10 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i10 = 4;
                                        break;
                                    case 13:
                                        i10 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i10 = 6;
                                        break;
                                    case 18:
                                        i10 = 2;
                                        break;
                                    case 20:
                                        i10 = 9;
                                        break;
                                }
                            } else if (type == 1) {
                                i10 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i10 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i10 = 4;
                                        break;
                                    case 13:
                                        i10 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i10 = 6;
                                        break;
                                    case 18:
                                        i10 = 2;
                                        break;
                                    case 20:
                                        i10 = 9;
                                        break;
                                }
                            } else if (type != 6) {
                                i10 = type != 9 ? 8 : 7;
                            } else {
                                i10 = 5;
                            }
                        }
                    } catch (SecurityException unused3) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i10 != 5) {
                    pVar2.c(i10);
                    return;
                } else {
                    n.a(context4, pVar2);
                    return;
                }
            case 27:
                hx0 hx0Var = (hx0) this.f38597b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f38598c;
                f2 f2Var = (f2) hx0Var.f15420d;
                f2Var.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new b(28, f2Var, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                f2 f2Var2 = (f2) this.f38597b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f38598c;
                synchronized (f2Var2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) f2Var2.f39410c) != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            default:
                ((l2.c) ((d0) this.f38597b).f39977c).f44853h.a((z0) this.f38598c);
                return;
        }
    }

    public /* synthetic */ b(String str, TaskCompletionSource taskCompletionSource) {
        this.f38596a = 5;
        this.f38598c = str;
        this.f38597b = taskCompletionSource;
    }
}
