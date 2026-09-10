package io.flutter.embedding.engine.renderer;

import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.n;
import io.flutter.view.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f43247a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f43249c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f43254h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f43248b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43250d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f43251e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f43252f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f43253g = new ArrayList();

    public h(FlutterJNI flutterJNI) {
        a aVar = new a(this, 0);
        this.f43254h = aVar;
        this.f43247a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    public final TextureRegistry$SurfaceProducer a(int i10) {
        long andIncrement = this.f43248b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z10 = i10 == 2;
        this.f43247a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z10);
        if (z10) {
            HashSet hashSet = this.f43252f;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((n) ((WeakReference) it.next()).get()) == null) {
                    it.remove();
                }
            }
            hashSet.add(new WeakReference(flutterRenderer$ImageReaderSurfaceProducer));
        }
        this.f43253g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final void b(int i10) {
        Iterator it = this.f43252f.iterator();
        while (it.hasNext()) {
            n nVar = (n) ((WeakReference) it.next()).get();
            if (nVar != null) {
                nVar.onTrimMemory(i10);
            } else {
                it.remove();
            }
        }
    }

    public final void c() {
        for (FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer : this.f43253g) {
            o oVar = flutterRenderer$ImageReaderSurfaceProducer.callback;
            if (oVar != null && flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy) {
                flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy = false;
                oVar.b();
            }
        }
    }

    public final void d() {
        if (this.f43249c != null) {
            this.f43247a.onSurfaceDestroyed();
            if (this.f43250d) {
                this.f43254h.c();
            }
            this.f43250d = false;
            this.f43249c = null;
        }
    }
}
