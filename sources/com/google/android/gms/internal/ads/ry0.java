package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ry0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19706b;

    public /* synthetic */ ry0() {
        this.f19705a = 12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture;
        Object obj;
        byte b10 = 0;
        switch (this.f19705a) {
            case 0:
                sy0 sy0Var = (sy0) this.f19706b;
                AtomicBoolean atomicBoolean = sy0Var.f20083e;
                AudioManager audioManager = sy0Var.f20081c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f10 = streamVolume / streamMaxVolume;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) sy0Var.f20082d.getAndSet(Float.valueOf(f10))).floatValue() != f10) {
                    sy0Var.f20079a.post(new qy0(this, f10));
                    return;
                }
                return;
            case 1:
                ((WebView) this.f19706b).destroy();
                return;
            case 2:
                md0 md0Var = ((kz0) this.f19706b).f16585e;
                md0Var.getClass();
                mz0 mz0Var = new mz0(md0Var);
                ay0 ay0Var = (ay0) md0Var.f17400c;
                mz0Var.f17163a = ay0Var;
                ArrayDeque arrayDeque = (ArrayDeque) ay0Var.f12538c;
                arrayDeque.add(mz0Var);
                if (((lz0) ay0Var.f12539d) == null) {
                    lz0 lz0Var = (lz0) arrayDeque.poll();
                    ay0Var.f12539d = lz0Var;
                    if (lz0Var != null) {
                        lz0Var.executeOnExecutor((ThreadPoolExecutor) ay0Var.f12537b, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f19706b;
                t01 t01Var = new t01();
                Log.d("GASS", "Clearcut logging disabled");
                taskCompletionSource.setResult(new q01(t01Var));
                return;
            case 4:
                ((HttpURLConnection) this.f19706b).disconnect();
                return;
            case 5:
                z41 z41Var = (z41) this.f19706b;
                g51 g51Var = (g51) z41Var.f22501a.zzb();
                long j10 = z41Var.f22505e;
                if (j10 > 0) {
                    g51Var.f14770e.a(new ry0(g51Var, 6), j10);
                    return;
                } else {
                    g51Var.a();
                    return;
                }
            case 6:
                ((g51) this.f19706b).a();
                return;
            case 7:
                r61 r61Var = (r61) this.f19706b;
                ListenableFuture listenableFutureB = ((k00) r61Var.f19438c).b(new ns0(r61Var, 9));
                r61Var.f19437b.e(53, listenableFutureB);
                r61Var.f19441f = listenableFutureB;
                return;
            case 8:
                s61 s61Var = (s61) this.f19706b;
                uf ufVar = new uf(s61Var, 4);
                try {
                    Object systemService = s61Var.f19878a.getSystemService("connectivity");
                    if (systemService == null) {
                        throw null;
                    }
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(ufVar);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 9:
                x61 x61Var = (x61) this.f19706b;
                lg lgVar = new lg(x61Var, 1);
                try {
                    Object systemService2 = x61Var.f21757a.getSystemService("appops");
                    if (systemService2 == null) {
                        throw null;
                    }
                    ((AppOpsManager) systemService2).startWatchingActive(x61.f21756g, x61Var.f21758b, lgVar);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 10:
                ln0 ln0Var = ((p71) this.f19706b).f18552a;
                ((tf1) ln0Var.f17073d).b("unlinkToDeath", new Object[0]);
                e71 e71Var = (e71) ln0Var.f17079j;
                e71Var.getClass();
                ((ph) e71Var).asBinder().unlinkToDeath((q71) ln0Var.f17077h, 0);
                ln0Var.f17079j = null;
                ln0Var.f17070a = false;
                return;
            case 11:
                ln0 ln0Var2 = (ln0) this.f19706b;
                if (((e71) ln0Var2.f17079j) != null) {
                    ((tf1) ln0Var2.f17073d).b("Unbind from service.", new Object[0]);
                    Context context = (Context) ln0Var2.f17071b;
                    p71 p71Var = (p71) ln0Var2.f17078i;
                    p71Var.getClass();
                    context.unbindService(p71Var);
                    ln0Var2.f17070a = false;
                    ln0Var2.f17079j = null;
                    ln0Var2.f17078i = null;
                    ArrayList arrayList = (ArrayList) ln0Var2.f17075f;
                    synchronized (arrayList) {
                        arrayList.clear();
                        break;
                    }
                    return;
                }
                return;
            case 12:
                ne1 ne1Var = (ne1) this.f19706b;
                if (ne1Var == null || (listenableFuture = ne1Var.f17788h) == null) {
                    return;
                }
                this.f19706b = null;
                if (listenableFuture.isDone()) {
                    ne1Var.l(listenableFuture);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = ne1Var.f17789i;
                    ne1Var.f17789i = null;
                    String string = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(jAbs).length() + 55);
                                sb2.append("Timed out (timeout delayed by ");
                                sb2.append(jAbs);
                                sb2.append(" ms after scheduled time)");
                                string = sb2.toString();
                            }
                        } catch (Throwable th2) {
                            ne1Var.d(new me1(string, 0));
                            throw th2;
                        }
                    }
                    String string2 = listenableFuture.toString();
                    StringBuilder sb3 = new StringBuilder(string.length() + 2 + string2.length());
                    sb3.append(string);
                    sb3.append(": ");
                    sb3.append(string2);
                    ne1Var.d(new me1(sb3.toString(), 0));
                    listenableFuture.cancel(true);
                    return;
                } catch (Throwable th3) {
                    listenableFuture.cancel(true);
                    throw th3;
                }
            case 13:
                ry1 ry1Var = (ry1) this.f19706b;
                String str = uu0.f20901a;
                int iGenerateAudioSessionId = x10.b(ry1Var.f19715f).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                kj1 kj1Var = ry1Var.B;
                ys0 ys0Var = (ys0) kj1Var.f16464c;
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == ys0Var.f22362a.getLooper()) {
                    obj = kj1Var.f16466e;
                } else {
                    ps1.c0(looperMyLooper == ((ys0) kj1Var.f16463b).f22362a.getLooper());
                    obj = kj1Var.f16467f;
                }
                if (((Integer) obj).intValue() != iGenerateAudioSessionId) {
                    Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                    kj1Var.f16467f = numValueOf;
                    zd1 zd1Var = new zd1(21, kj1Var, numValueOf);
                    ys0 ys0Var2 = (ys0) kj1Var.f16464c;
                    if (ys0Var2.f22362a.getLooper().getThread().isAlive()) {
                        ys0Var2.e(zd1Var);
                    }
                    ry1Var.m1(1, 10, numValueOf);
                    ry1Var.m1(2, 10, numValueOf);
                    return;
                }
                return;
            case 14:
                d02 d02Var = ((wy1) this.f19706b).f21646v;
                d02Var.f(d02Var.g(), IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new ey1(b10 == true ? 1 : 0, 22));
                return;
            case 15:
                qz1 qz1Var = (qz1) this.f19706b;
                try {
                    synchronized (qz1Var) {
                    }
                    try {
                        qz1Var.f19250a.b(qz1Var.f19252c, qz1Var.f19253d);
                        return;
                    } finally {
                        qz1Var.b(true);
                    }
                } catch (dy1 e10) {
                    v71.J("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 16:
                d02 d02Var2 = (d02) this.f19706b;
                d02Var2.f(d02Var2.g(), IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new b02(14));
                d02Var2.f13331f.k();
                return;
            case 17:
                ((zw) this.f19706b).l();
                return;
            case 18:
                u12 u12Var = (u12) this.f19706b;
                if (u12Var.V >= 300000) {
                    ((w12) u12Var.l.f20839b).K0 = true;
                    u12Var.V = 0L;
                    return;
                }
                return;
            default:
                i22 i22Var = (i22) this.f19706b;
                Object obj2 = i22Var.f15534b;
                synchronized (obj2) {
                    try {
                        if (i22Var.l) {
                            return;
                        }
                        long j11 = i22Var.f15543k - 1;
                        i22Var.f15543k = j11;
                        if (j11 > 0) {
                            return;
                        }
                        if (j11 >= 0) {
                            i22Var.c();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (obj2) {
                            i22Var.f15544m = illegalStateException;
                        }
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
        }
    }

    public /* synthetic */ ry0(wy1 wy1Var, int i10) {
        this.f19705a = 14;
        this.f19706b = wy1Var;
    }

    public /* synthetic */ ry0(Object obj, int i10) {
        this.f19705a = i10;
        this.f19706b = obj;
    }

    public ry0(gz0 gz0Var) {
        this.f19705a = 1;
        this.f19706b = gz0Var.f15004e;
    }

    public ry0(kz0 kz0Var) {
        this.f19705a = 2;
        Objects.requireNonNull(kz0Var);
        this.f19706b = kz0Var;
    }
}
