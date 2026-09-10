package n5;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Executor;
import m0.s1;
import org.json.JSONObject;
import ta.u0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f46528c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f46526a = i10;
        this.f46527b = obj;
        this.f46528c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r1 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        ((java.lang.Runnable) r10.f46528c).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        ub.k.f51970f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f46528c), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        r10.f46528c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        if (r1 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00da, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
    
        ((java.lang.Runnable) r10.f46528c).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ea, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00eb, code lost:
    
        ta.u0.f50657f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f46528c), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010c, code lost:
    
        r10.f46528c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010e, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.i.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        switch (this.f46526a) {
            case 0:
                j jVar = (j) this.f46527b;
                try {
                    ((Runnable) this.f46528c).run();
                    return;
                } finally {
                    jVar.a();
                }
            case 1:
                synchronized (((ConstraintTrackingWorker) this.f46528c).f5046b) {
                    if (((ConstraintTrackingWorker) this.f46528c).f5047c) {
                        ((ConstraintTrackingWorker) this.f46528c).f5048d.h(new d5.l());
                    } else {
                        ((ConstraintTrackingWorker) this.f46528c).f5048d.j((ListenableFuture) this.f46527b);
                    }
                    break;
                }
                return;
            case 2:
                qh.a aVar = (qh.a) this.f46527b;
                s1 s1Var = (s1) this.f46528c;
                HashMap map = (HashMap) s1Var.f45751b;
                if (map.size() > 0) {
                    aVar.onSignalsCollected(new JSONObject(map).toString());
                    return;
                }
                String str = (String) s1Var.f45752c;
                if (str == null) {
                    aVar.onSignalsCollected("");
                    return;
                } else {
                    aVar.onSignalsCollectionFailed(str);
                    return;
                }
            case 3:
                try {
                    a();
                    return;
                } catch (Error e10) {
                    synchronized (((u0) this.f46527b).f50659b) {
                        ((u0) this.f46527b).f50660c = 1;
                        throw e10;
                    }
                }
            case 4:
                try {
                    a();
                    return;
                } catch (Error e11) {
                    synchronized (((ub.k) this.f46527b).f51972b) {
                        ((ub.k) this.f46527b).f51973c = 1;
                        throw e11;
                    }
                }
            case 5:
                v9.e eVar = (v9.e) this.f46527b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f46528c;
                Context context = (Context) eVar.f52503b;
                String string = v9.e.O(context).getString("app_set_id", null);
                long j10 = v9.e.O(context).getLong("app_set_id_last_used_time", -1L);
                long j11 = j10 != -1 ? 33696000000L + j10 : -1L;
                if (string != null && System.currentTimeMillis() <= j11) {
                    try {
                        v9.e.P(context);
                    } catch (v9.d e12) {
                        taskCompletionSource.setException(e12);
                        return;
                    }
                    break;
                } else {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String strValueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                            throw new v9.d("Failed to store the app set ID.");
                        }
                        v9.e.P(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String strValueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new v9.d("Failed to store the app set ID creation time.");
                        }
                    } catch (v9.d e13) {
                        taskCompletionSource.setException(e13);
                        return;
                    }
                }
                taskCompletionSource.setResult(new AppSetIdInfo(string, 1));
                return;
            case 6:
                ((AsyncTaskExecutor) ((m0) this.f46528c).f11736d).onPostExecute(this.f46527b);
                return;
            default:
                ((SingleThreadCachedScheduler) this.f46527b).tryExecuteRunnable((Runnable) this.f46528c);
                while (true) {
                    synchronized (((SingleThreadCachedScheduler) this.f46527b).queue) {
                        try {
                            SingleThreadCachedScheduler singleThreadCachedScheduler = (SingleThreadCachedScheduler) this.f46527b;
                            if (singleThreadCachedScheduler.isTeardown) {
                                return;
                            }
                            boolean zIsEmpty = singleThreadCachedScheduler.queue.isEmpty();
                            SingleThreadCachedScheduler singleThreadCachedScheduler2 = (SingleThreadCachedScheduler) this.f46527b;
                            if (zIsEmpty) {
                                singleThreadCachedScheduler2.isThreadProcessing = false;
                                return;
                            } else {
                                runnable = (Runnable) singleThreadCachedScheduler2.queue.get(0);
                                ((SingleThreadCachedScheduler) this.f46527b).queue.remove(0);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    ((SingleThreadCachedScheduler) this.f46527b).tryExecuteRunnable(runnable);
                }
                break;
        }
    }

    public String toString() {
        String str;
        String str2;
        switch (this.f46526a) {
            case 3:
                Runnable runnable = (Runnable) this.f46528c;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((u0) this.f46527b).f50660c;
                if (i10 == 1) {
                    str = "IDLE";
                } else if (i10 == 2) {
                    str = "QUEUING";
                } else if (i10 != 3) {
                    str = i10 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            case 4:
                Runnable runnable2 = (Runnable) this.f46528c;
                if (runnable2 != null) {
                    return "SequentialExecutorWorker{running=" + runnable2 + "}";
                }
                StringBuilder sb3 = new StringBuilder("SequentialExecutorWorker{state=");
                int i11 = ((ub.k) this.f46527b).f51973c;
                if (i11 == 1) {
                    str2 = "IDLE";
                } else if (i11 == 2) {
                    str2 = "QUEUING";
                } else if (i11 != 3) {
                    str2 = i11 != 4 ? "null" : "RUNNING";
                } else {
                    str2 = "QUEUED";
                }
                sb3.append(str2);
                sb3.append("}");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(Object obj, boolean z10, Object obj2, int i10) {
        this.f46526a = i10;
        this.f46528c = obj;
        this.f46527b = obj2;
    }

    public /* synthetic */ i(Executor executor, int i10) {
        this.f46526a = i10;
        this.f46527b = executor;
    }
}
