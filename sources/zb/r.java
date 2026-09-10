package zb;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f54737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v6.c f54738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f54739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wi.b f54740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public wi.b f54741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f54743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f54744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fc.f f54745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vb.a f54746k;
    public final vb.a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f54747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wb.a f54748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qj.x f54749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ac.g f54750p;

    public r(mb.g gVar, x xVar, wb.a aVar, u uVar, vb.a aVar2, vb.a aVar3, fc.f fVar, h hVar, qj.x xVar2, ac.g gVar2) {
        this.f54737b = uVar;
        gVar.a();
        this.f54736a = gVar.f45928a;
        this.f54744i = xVar;
        this.f54748n = aVar;
        this.f54746k = aVar2;
        this.l = aVar3;
        this.f54745j = fVar;
        this.f54747m = hVar;
        this.f54749o = xVar2;
        this.f54750p = gVar2;
        this.f54739d = System.currentTimeMillis();
        this.f54738c = new v6.c(19);
    }

    public final void a(com.google.android.gms.internal.consent_sdk.d dVar) {
        ac.g.a();
        ac.g.a();
        this.f54740e.a();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f54746k.a(new q(this));
                this.f54743h.j();
                if (!dVar.h().f42298b.f14258a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f54743h.f(dVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f54743h.l(((TaskCompletionSource) ((AtomicReference) dVar.f22989i).get()).getTask());
                c();
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                c();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(com.google.android.gms.internal.consent_sdk.d dVar) {
        Future<?> futureSubmit = this.f54750p.f3462a.f3457a.submit(new m(this, dVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        ac.g.a();
        try {
            wi.b bVar = this.f54740e;
            fc.f fVar = (fc.f) bVar.f53212b;
            String str = (String) bVar.f53211a;
            fVar.getClass();
            if (new File((File) fVar.f40782d, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }
}
