package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import com.ironsource.X3;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import m0.s1;
import mi.e0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Class[] f43351x = {SurfaceView.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mi.a f43353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f43354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mi.s f43355d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f43357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.editing.j f43358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v6.c f43359h;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s1 f43371u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterJNI f43356e = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f43366p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f43367q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f43368r = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f43372v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f43373w = new l(this, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f43352a = new l(2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f43361j = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f43360i = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f43362k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SparseArray f43364n = new SparseArray();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashSet f43369s = new HashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f43370t = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f43365o = new SparseArray();
    public final SparseArray l = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SparseArray f43363m = new SparseArray();

    public n() {
        if (s1.f45749d == null) {
            s1.f45749d = new s1(5);
        }
        this.f43371u = s1.f45749d;
    }

    public static void a(n nVar, wi.f fVar) {
        int i10 = fVar.f53225g;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException(l1.d.i(defpackage.e.u(i10, "Trying to create a view with unknown direction value: ", "(view id: "), fVar.f53219a, ")"));
        }
    }

    public static void e(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < i10) {
            throw new IllegalStateException(defpackage.e.g(i11, i10, "Trying to use platform views with API ", ", required API level is: "));
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void E0() {
        this.f43360i.f43310a = null;
    }

    public final d b(wi.f fVar, boolean z10) {
        String str = fVar.f53220b;
        int i10 = fVar.f53219a;
        ByteBuffer byteBuffer = fVar.f53227i;
        e eVar = (e) ((HashMap) this.f43352a.f43335b).get(str);
        if (eVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        d dVarCreate = eVar.create(z10 ? new MutableContextWrapper(this.f43354c) : this.f43354c, i10, byteBuffer != null ? eVar.getCreateArgsCodec().b(byteBuffer) : null);
        View view = dVarCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(fVar.f53225g);
        this.l.put(i10, dVarCreate);
        mi.s sVar = this.f43355d;
        if (sVar == null) {
            return dVarCreate;
        }
        dVarCreate.onFlutterViewAttached(sVar);
        return dVarCreate;
    }

    @Override // io.flutter.plugin.platform.h
    public final View b0(int i10) {
        if (t0(i10)) {
            return ((x) this.f43361j.get(Integer.valueOf(i10))).a();
        }
        d dVar = (d) this.l.get(i10);
        if (dVar == null) {
            return null;
        }
        return dVar.getView();
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f43364n;
            if (i10 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i10);
            bVar.b();
            bVar.f46027a.close();
            i10++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void d(io.flutter.view.g gVar) {
        this.f43360i.f43310a = gVar;
    }

    public final void f(boolean z10) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f43364n;
            if (i10 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i10);
            b bVar = (b) sparseArray.valueAt(i10);
            if (this.f43369s.contains(Integer.valueOf(iKeyAt))) {
                ni.c cVar = this.f43355d.f46059j;
                if (cVar != null) {
                    bVar.a(cVar.f46738b);
                }
                z10 &= bVar.c();
            } else {
                if (!this.f43367q) {
                    bVar.b();
                }
                bVar.setVisibility(8);
                this.f43355d.removeView(bVar);
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f43363m;
            if (i11 >= sparseArray2.size()) {
                return;
            }
            int iKeyAt2 = sparseArray2.keyAt(i11);
            View view = (View) sparseArray2.get(iKeyAt2);
            if (!this.f43370t.contains(Integer.valueOf(iKeyAt2)) || (!z10 && this.f43368r)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i11++;
        }
    }

    public final float g() {
        return this.f43354c.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void h() {
        if (!this.f43368r || this.f43367q) {
            return;
        }
        mi.s sVar = this.f43355d;
        sVar.f46055f.pause();
        mi.l lVar = sVar.f46054e;
        if (lVar == null) {
            mi.l lVar2 = new mi.l(sVar.getContext(), sVar.getWidth(), sVar.getHeight(), 1);
            sVar.f46054e = lVar2;
            sVar.addView(lVar2);
        } else {
            lVar.e(sVar.getWidth(), sVar.getHeight());
        }
        sVar.f46056g = sVar.f46055f;
        mi.l lVar3 = sVar.f46054e;
        sVar.f46055f = lVar3;
        ni.c cVar = sVar.f46059j;
        if (cVar != null) {
            lVar3.a(cVar.f46738b);
        }
        this.f43367q = true;
    }

    public final void i() {
        for (x xVar : this.f43361j.values()) {
            l lVar = xVar.f43397f;
            l lVar2 = xVar.f43397f;
            int width = ((TextureRegistry$SurfaceProducer) lVar.f43335b).getWidth();
            int height = ((TextureRegistry$SurfaceProducer) lVar2.f43335b).getHeight();
            boolean zIsFocused = xVar.a().isFocused();
            s sVarDetachState = xVar.f43392a.detachState();
            xVar.f43399h.setSurface(null);
            xVar.f43399h.release();
            xVar.f43399h = ((DisplayManager) xVar.f43393b.getSystemService(X3.i.f27786d)).createVirtualDisplay("flutter-vd#" + xVar.f43396e, width, height, xVar.f43395d, ((TextureRegistry$SurfaceProducer) lVar2.f43335b).getSurface(), 0, x.f43391i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(xVar.f43393b, xVar.f43399h.getDisplay(), xVar.f43394c, sVarDetachState, xVar.f43398g, zIsFocused);
            singleViewPresentation.show();
            xVar.f43392a.cancel();
            xVar.f43392a = singleViewPresentation;
        }
    }

    public final MotionEvent j(float f10, wi.g gVar, boolean z10) {
        long j10 = gVar.f53242p;
        int i10 = gVar.f53232e;
        MotionEvent motionEventO = this.f43371u.o(new e0(j10));
        List<List> list = (List) gVar.f53234g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d10 = f10;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d10);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d10);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d10);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d10);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d10);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d10);
            arrayList.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i10]);
        List<List> list3 = (List) gVar.f53233f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i10]);
        if (z10 || motionEventO == null) {
            return MotionEvent.obtain(gVar.f53229b.longValue(), gVar.f53230c.longValue(), gVar.f53231d, gVar.f53232e, pointerPropertiesArr, pointerCoordsArr, gVar.f53235h, gVar.f53236i, gVar.f53237j, gVar.f53238k, gVar.l, gVar.f53239m, gVar.f53240n, gVar.f53241o);
        }
        if (motionEventO.getPointerCount() != i10 || motionEventO.getAction() != gVar.f53231d) {
            return MotionEvent.obtain(motionEventO.getDownTime(), motionEventO.getEventTime(), gVar.f53231d, gVar.f53232e, pointerPropertiesArr, pointerCoordsArr, motionEventO.getMetaState(), motionEventO.getButtonState(), motionEventO.getXPrecision(), motionEventO.getYPrecision(), motionEventO.getDeviceId(), motionEventO.getEdgeFlags(), motionEventO.getSource(), motionEventO.getFlags());
        }
        if (pointerCoordsArr.length < 1) {
            return motionEventO;
        }
        motionEventO.offsetLocation(pointerCoordsArr[0].x - motionEventO.getX(), pointerCoordsArr[0].y - motionEventO.getY());
        return motionEventO;
    }

    public final int k(double d10) {
        return (int) Math.round(d10 * ((double) g()));
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean t0(int i10) {
        return this.f43361j.containsKey(Integer.valueOf(i10));
    }
}
