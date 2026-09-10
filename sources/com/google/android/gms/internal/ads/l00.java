package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k00 f16608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k00 f16609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k00 f16610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j00 f16611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ke1 f16612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k00 f16613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ExecutorService f16614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k00 f16615h;

    /* JADX WARN: Code duplicated, block: B:11:0x0077  */
    static {
        ThreadPoolExecutor threadPoolExecutor;
        ul ulVar = am.Tc;
        if (zzba.zzc().b(ulVar) == null || !((Boolean) zzba.zzc().b(ulVar)).booleanValue()) {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new dg("Default"));
        } else {
            ul ulVar2 = am.Uc;
            if (zzba.zzc().b(ulVar2) != null) {
                ul ulVar3 = am.Vc;
                if (zzba.zzc().b(ulVar3) != null) {
                    threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzba.zzc().b(ulVar2)).intValue(), ((Integer) zzba.zzc().b(ulVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dg("Default"));
                    threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) zzba.zzc().b(ulVar3)).booleanValue());
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new dg("Default"));
                }
            } else {
                threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new dg("Default"));
            }
        }
        f16608a = new k00((Executor) threadPoolExecutor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new dg("Loader"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f16609b = new k00((Executor) threadPoolExecutor2);
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new dg("Activeview"));
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        f16610c = new k00((Executor) threadPoolExecutor3);
        j00 j00Var = new j00(3, new dg(AppEventsConstants.EVENT_NAME_SCHEDULE));
        f16611d = j00Var;
        f16612e = new ke1(j00Var);
        f16613f = new k00(new g0());
        f16614g = Executors.newSingleThreadExecutor(new dg("AdQualityMetrics"));
        f16615h = new k00(td1.f20333a);
    }
}
