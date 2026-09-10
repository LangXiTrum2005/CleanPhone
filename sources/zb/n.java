package zb;

import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f54726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlutterError f54727c;

    public /* synthetic */ n(r rVar, FlutterError flutterError, int i10) {
        this.f54725a = i10;
        switch (i10) {
            case 1:
                break;
            default:
                Map map = Collections.EMPTY_MAP;
                break;
        }
        this.f54726b = rVar;
        this.f54727c = flutterError;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f54725a) {
            case 0:
                Map map = Collections.EMPTY_MAP;
                l lVar = this.f54726b.f54743h;
                Thread threadCurrentThread = Thread.currentThread();
                lVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                t tVar = lVar.f54716n;
                if (tVar == null || !tVar.f54762e.get()) {
                    long j10 = jCurrentTimeMillis / 1000;
                    String strG = lVar.g();
                    if (strG != null) {
                        bc.c cVar = new bc.c(strG, map, j10);
                        fc.f fVar = lVar.f54715m;
                        fVar.getClass();
                        String strConcat = "Persisting non-fatal event for session ".concat(strG);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strConcat, null);
                        }
                        fVar.y(this.f54727c, threadCurrentThread, "error", cVar, false);
                    } else {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                    }
                }
                break;
            default:
                r rVar = this.f54726b;
                l lVar2 = rVar.f54743h;
                v6.c cVar2 = rVar.f54738c;
                lVar2.k("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(((AtomicInteger) cVar2.f52487a).get()));
                rVar.f54743h.k("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(((AtomicInteger) cVar2.f52488b).get()));
                l lVar3 = rVar.f54743h;
                Thread threadCurrentThread2 = Thread.currentThread();
                com.google.android.gms.internal.consent_sdk.d dVar = lVar3.f54717o;
                if (dVar != null) {
                    lVar3.i(dVar, threadCurrentThread2, this.f54727c, true);
                } else {
                    Log.w("FirebaseCrashlytics", "settingsProvider not set", null);
                }
                break;
        }
    }
}
