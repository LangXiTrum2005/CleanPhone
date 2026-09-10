package n;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m0.w0;
import m0.x0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements xi.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f46319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f46321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f46322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f46323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f46324f;

    public j() {
        this.f46319a = -1L;
        this.f46324f = new i(this);
        this.f46321c = new ArrayList();
    }

    @Override // xi.f
    public void a(String str, xi.d dVar) {
        ((na.g) this.f46324f).a(str, dVar);
    }

    public void b() {
        if (this.f46320b) {
            Iterator it = ((ArrayList) this.f46321c).iterator();
            while (it.hasNext()) {
                ((w0) it.next()).b();
            }
            this.f46320b = false;
        }
    }

    public void c(g9.k kVar) {
        if (this.f46320b) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        uj.a.c("DartExecutor#executeDartCallback");
        try {
            Objects.toString(kVar);
            FlutterJNI flutterJNI = (FlutterJNI) this.f46321c;
            String str = (String) kVar.f41771c;
            FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) kVar.f41772d;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, (AssetManager) kVar.f41770b, null, this.f46319a);
            this.f46320b = true;
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void d(oi.a aVar, List list) {
        if (this.f46320b) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        uj.a.c("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            ((FlutterJNI) this.f46321c).runBundleAndSnapshotFromLibrary(aVar.f47432a, aVar.f47434c, aVar.f47433b, (AssetManager) this.f46322d, list, this.f46319a);
            this.f46320b = true;
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // xi.f
    public void e(String str, xi.d dVar, ne.c cVar) {
        ((na.g) this.f46324f).e(str, dVar, cVar);
    }

    public void f() {
        View view;
        if (this.f46320b) {
            return;
        }
        for (w0 w0Var : (ArrayList) this.f46321c) {
            long j10 = this.f46319a;
            if (j10 >= 0) {
                w0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.f46322d;
            if (interpolator != null && (view = (View) w0Var.f45759a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((x0) this.f46323e) != null) {
                w0Var.d((i) this.f46324f);
            }
            View view2 = (View) w0Var.f45759a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f46320b = true;
    }

    @Override // xi.f
    public ne.c h(xi.k kVar) {
        return ((oi.h) ((na.g) this.f46324f).f46631b).h(kVar);
    }

    @Override // xi.f
    public void i(String str, ByteBuffer byteBuffer) {
        ((na.g) this.f46324f).i(str, byteBuffer);
    }

    @Override // xi.f
    public void m(String str, ByteBuffer byteBuffer, xi.e eVar) {
        ((na.g) this.f46324f).m(str, byteBuffer, eVar);
    }

    public j(FlutterJNI flutterJNI, AssetManager assetManager, long j10) {
        this.f46320b = false;
        ne.a aVar = new ne.a(this);
        this.f46321c = flutterJNI;
        this.f46322d = assetManager;
        this.f46319a = j10;
        oi.h hVar = new oi.h(flutterJNI);
        this.f46323e = hVar;
        hVar.e("flutter/isolate", aVar, null);
        this.f46324f = new na.g(hVar, 3);
        if (flutterJNI.isAttached()) {
            this.f46320b = true;
        }
    }
}
