package zc;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.aj0;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f54900h = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f54901i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aj0 f54903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1.s f54904c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f54906e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f54908g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x.e f54905d = new x.e(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54907f = false;

    public z(aj0 aj0Var, x xVar, r1.s sVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f54903b = aj0Var;
        this.f54908g = xVar;
        this.f54904c = sVar;
        this.f54902a = context;
        this.f54906e = scheduledThreadPoolExecutor;
    }

    public final Task a(w wVar) {
        ArrayDeque arrayDeque;
        x xVar = this.f54908g;
        synchronized (xVar) {
            nf nfVar = xVar.f54892a;
            String str = wVar.f54890c;
            nfVar.getClass();
            if (!TextUtils.isEmpty(str) && !str.contains((String) nfVar.f23784d)) {
                synchronized (((ArrayDeque) nfVar.f23785e)) {
                    if (((ArrayDeque) nfVar.f23785e).add(str)) {
                        ((ScheduledThreadPoolExecutor) nfVar.f23786f).execute(new q1.c(nfVar, 15));
                    }
                }
            }
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f54905d) {
            try {
                String str2 = wVar.f54890c;
                if (this.f54905d.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.f54905d.get(str2);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f54905d.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return taskCompletionSource.getTask();
    }

    public final synchronized void b(boolean z10) {
        this.f54907f = z10;
    }

    public final void c() {
        boolean z10;
        if (this.f54908g.a() != null) {
            synchronized (this) {
                z10 = this.f54907f;
            }
            if (z10) {
                return;
            }
            e(0L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d8 A[Catch: IOException -> 0x008a, TryCatch #1 {IOException -> 0x008a, blocks: (B:15:0x002d, B:32:0x00d8, B:34:0x00e0, B:20:0x003f, B:22:0x0047, B:24:0x0077, B:27:0x008d, B:29:0x0095, B:31:0x00c5), top: B:84:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0 A[Catch: IOException -> 0x008a, TRY_LEAVE, TryCatch #1 {IOException -> 0x008a, blocks: (B:15:0x002d, B:32:0x00d8, B:34:0x00e0, B:20:0x003f, B:22:0x0047, B:24:0x0077, B:27:0x008d, B:29:0x0095, B:31:0x00c5), top: B:84:0x002d }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00e0, please report this as an issue */
    public final boolean d() throws IOException {
        w wVarA;
        while (true) {
            synchronized (this) {
                try {
                    wVarA = this.f54908g.a();
                    if (wVarA == null) {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            r1.s sVar = this.f54904c;
            try {
                String str = wVarA.f54889b;
                String str2 = wVarA.f54888a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        uc.c cVar = (uc.c) ((uc.d) sVar.f49338b);
                        String str3 = ((uc.a) r1.s.b(cVar.d())).f51979a;
                        ((FirebaseMessaging) sVar.f49340d).a();
                        sVar.l(str2, str3, (String) r1.s.b(cVar.c()), "unsubscribe");
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + wVarA + ".");
                    }
                } else if (str.equals("S")) {
                    uc.c cVar2 = (uc.c) ((uc.d) sVar.f49338b);
                    String str4 = ((uc.a) r1.s.b(cVar2.d())).f51979a;
                    ((FirebaseMessaging) sVar.f49340d).a();
                    sVar.l(str2, str4, (String) r1.s.b(cVar2.c()), "subscribe");
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + wVarA + ".");
                }
                x xVar = this.f54908g;
                synchronized (xVar) {
                    try {
                        nf nfVar = xVar.f54892a;
                        String str5 = wVarA.f54890c;
                        synchronized (((ArrayDeque) nfVar.f23785e)) {
                            try {
                                if (((ArrayDeque) nfVar.f23785e).remove(str5)) {
                                    ((ScheduledThreadPoolExecutor) nfVar.f23786f).execute(new q1.c(nfVar, 15));
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                synchronized (this.f54905d) {
                    try {
                        String str6 = wVarA.f54890c;
                        if (this.f54905d.containsKey(str6)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.f54905d.get(str6);
                            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                            if (taskCompletionSource != null) {
                                taskCompletionSource.setResult(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.f54905d.remove(str6);
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            } catch (IOException e10) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                    if (e10.getMessage() != null) {
                        throw e10;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void e(long j10) {
        this.f54906e.schedule(new b0(this, this.f54902a, this.f54903b, Math.min(Math.max(30L, 2 * j10), f54900h)), j10, TimeUnit.SECONDS);
        b(true);
    }
}
