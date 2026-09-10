package io.flutter.plugin.platform;

import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import java.util.ArrayList;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f43336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mi.a f43337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f43338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mi.s f43339d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.editing.j f43341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public wi.b f43342g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s1 f43346k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterJNI f43340e = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Surface f43348n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SurfaceControl f43349o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f43350p = new l(this, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f43343h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray f43344i = new SparseArray();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f43345j = new SparseArray();
    public final ArrayList l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f43347m = new ArrayList();

    public m() {
        if (s1.f45749d == null) {
            s1.f45749d = new s1(5);
        }
        this.f43346k = s1.f45749d;
    }

    @Override // io.flutter.plugin.platform.h
    public final void E0() {
        this.f43343h.f43310a = null;
    }

    public final FlutterOverlaySurface a() {
        if (this.f43348n == null) {
            SurfaceControl.Builder builder = new SurfaceControl.Builder();
            builder.setBufferSize(this.f43339d.getWidth(), this.f43339d.getHeight());
            builder.setFormat(1);
            builder.setName("Flutter Overlay Surface");
            builder.setOpaque(false);
            builder.setHidden(false);
            SurfaceControl surfaceControlBuild = builder.build();
            SurfaceControl.Transaction transactionBuildReparentTransaction = this.f43339d.getRootSurfaceControl().buildReparentTransaction(surfaceControlBuild);
            transactionBuildReparentTransaction.setLayer(surfaceControlBuild, 1000);
            transactionBuildReparentTransaction.apply();
            this.f43348n = new Surface(surfaceControlBuild);
            this.f43349o = surfaceControlBuild;
        }
        return new FlutterOverlaySurface(0, this.f43348n);
    }

    public final boolean b(int i10) {
        d dVar = (d) this.f43344i.get(i10);
        if (dVar == null) {
            return false;
        }
        SparseArray sparseArray = this.f43345j;
        if (sparseArray.get(i10) != null) {
            return true;
        }
        View view = dVar.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Activity activity = this.f43338c;
        si.a aVar = new si.a(activity, activity.getResources().getDisplayMetrics().density, this.f43337b);
        aVar.setOnDescendantFocusChangeListener(new i(this, i10, 1));
        sparseArray.put(i10, aVar);
        view.setImportantForAccessibility(4);
        aVar.addView(view);
        this.f43339d.addView(aVar);
        return true;
    }

    @Override // io.flutter.plugin.platform.h
    public final View b0(int i10) {
        d dVar = (d) this.f43344i.get(i10);
        if (dVar == null) {
            return null;
        }
        return dVar.getView();
    }

    public final void c() {
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f43347m;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                this.f43339d.invalidate();
                this.f43339d.getRootSurfaceControl().applyTransactionOnDraw(transaction);
                return;
            }
            transaction = transaction.merge((SurfaceControl.Transaction) arrayList.get(i10));
            i10++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void d(io.flutter.view.g gVar) {
        this.f43343h.f43310a = gVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean t0(int i10) {
        return false;
    }
}
