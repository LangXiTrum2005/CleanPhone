package oi;

import android.os.Trace;
import android.util.Log;
import com.google.android.gms.internal.auth.o;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import xi.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements xi.f, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f47452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f47453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f47454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f47455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f47456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f47457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f47459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakHashMap f47460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final am.e f47461j;

    public h(FlutterJNI flutterJNI) {
        am.e eVar = new am.e(26, false);
        eVar.f3698b = (ExecutorService) v9.e.F().f52505d;
        this.f47453b = new HashMap();
        this.f47454c = new HashMap();
        this.f47455d = new Object();
        this.f47456e = new AtomicBoolean(false);
        this.f47457f = new HashMap();
        this.f47458g = 1;
        this.f47459h = new j();
        this.f47460i = new WeakHashMap();
        this.f47452a = flutterJNI;
        this.f47461j = eVar;
    }

    @Override // xi.f
    public final void a(String str, xi.d dVar) {
        e(str, dVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [oi.b] */
    public final void b(final String str, final e eVar, final ByteBuffer byteBuffer, final int i10, final long j10) {
        d dVar = eVar != null ? eVar.f47445b : null;
        Trace.beginAsyncSection(o.z(uj.a.b("PlatformChannel ScheduleHandler on " + str)), i10);
        ?? r0 = new Runnable() { // from class: oi.b
            @Override // java.lang.Runnable
            public final void run() {
                long j11 = j10;
                FlutterJNI flutterJNI = this.f47435a.f47452a;
                StringBuilder sb2 = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb2.append(str2);
                String strZ = o.z(uj.a.b(sb2.toString()));
                int i11 = i10;
                Trace.endAsyncSection(strZ, i11);
                try {
                    uj.a.c("DartMessenger#handleMessageFromDart on " + str2);
                    e eVar2 = eVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (eVar2 != null) {
                            try {
                                try {
                                    eVar2.f47444a.g(byteBuffer2, new f(flutterJNI, i11));
                                } catch (Error e10) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                                        throw e10;
                                    }
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e10);
                                }
                            } catch (Exception e11) {
                                Log.e("DartMessenger", "Uncaught exception in binary message listener", e11);
                                flutterJNI.invokePlatformMessageEmptyResponseCallback(i11);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i11);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                        flutterJNI.cleanupMessageData(j11);
                    } catch (Throwable th2) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    flutterJNI.cleanupMessageData(j11);
                    throw th4;
                }
            }
        };
        d dVar2 = dVar;
        if (dVar == null) {
            dVar2 = this.f47459h;
        }
        dVar2.a(r0);
    }

    @Override // xi.f
    public final void e(String str, xi.d dVar, ne.c cVar) {
        d dVar2;
        if (dVar == null) {
            synchronized (this.f47455d) {
                this.f47453b.remove(str);
            }
            return;
        }
        if (cVar != null) {
            dVar2 = (d) this.f47460i.get(cVar);
            if (dVar2 == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dVar2 = null;
        }
        synchronized (this.f47455d) {
            try {
                this.f47453b.put(str, new e(dVar, dVar2));
                List<c> list = (List) this.f47454c.remove(str);
                if (list == null) {
                    return;
                }
                for (c cVar2 : list) {
                    b(str, (e) this.f47453b.get(str), cVar2.f47441a, cVar2.f47442b, cVar2.f47443c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xi.f
    public final ne.c h(k kVar) {
        am.e eVar = this.f47461j;
        eVar.getClass();
        g gVar = new g((ExecutorService) eVar.f3698b);
        ne.c cVar = new ne.c(3);
        this.f47460i.put(cVar, gVar);
        return cVar;
    }

    @Override // xi.f
    public final void i(String str, ByteBuffer byteBuffer) {
        m(str, byteBuffer, null);
    }

    @Override // xi.f
    public final void m(String str, ByteBuffer byteBuffer, xi.e eVar) {
        uj.a.c("DartMessenger#send on " + str);
        try {
            int i10 = this.f47458g;
            this.f47458g = i10 + 1;
            if (eVar != null) {
                this.f47457f.put(Integer.valueOf(i10), eVar);
            }
            FlutterJNI flutterJNI = this.f47452a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i10);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i10);
            }
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
