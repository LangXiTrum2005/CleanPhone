package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.X3;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mi.e0;
import tj.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements wi.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43335b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f43334a = i10;
        this.f43335b = obj;
    }

    @Override // wi.i
    public void B0(int i10) {
        View view;
        switch (this.f43334a) {
            case 0:
                n nVar = (n) this.f43335b;
                if (nVar.t0(i10)) {
                    view = ((x) nVar.f43361j.get(Integer.valueOf(i10))).a();
                } else {
                    d dVar = (d) nVar.l.get(i10);
                    if (dVar == null) {
                        f2.o(i10, "Clearing focus on an unknown view with id: ", "PlatformViewsController");
                    } else {
                        view = dVar.getView();
                    }
                }
                if (view != null) {
                    view.clearFocus();
                } else {
                    f2.o(i10, "Clearing focus on a null view with id: ", "PlatformViewsController");
                }
                break;
            default:
                d dVar2 = (d) ((m) this.f43335b).f43344i.get(i10);
                if (dVar2 != null) {
                    View view2 = dVar2.getView();
                    if (view2 != null) {
                        view2.clearFocus();
                    } else {
                        f2.o(i10, "Clearing focus on a null view with id: ", "PlatformViewsController2");
                    }
                } else {
                    f2.o(i10, "Clearing focus on an unknown view with id: ", "PlatformViewsController2");
                }
                break;
        }
    }

    @Override // wi.i
    public void K(int i10) {
        f fVar;
        switch (this.f43334a) {
            case 0:
                n nVar = (n) this.f43335b;
                SparseArray sparseArray = nVar.f43363m;
                SparseArray sparseArray2 = nVar.f43365o;
                HashMap map = nVar.f43361j;
                SparseArray sparseArray3 = nVar.l;
                d dVar = (d) sparseArray3.get(i10);
                if (dVar != null) {
                    if (dVar.getView() != null) {
                        View view = dVar.getView();
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    sparseArray3.remove(i10);
                    try {
                        dVar.dispose();
                    } catch (RuntimeException e10) {
                        Log.e("PlatformViewsController", "Disposing platform view threw an exception", e10);
                    }
                    if (!nVar.t0(i10)) {
                        g gVar = (g) sparseArray2.get(i10);
                        if (gVar == null) {
                            si.a aVar = (si.a) sparseArray.get(i10);
                            if (aVar != null) {
                                aVar.removeAllViews();
                                aVar.a();
                                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(aVar);
                                }
                                sparseArray.remove(i10);
                            }
                        } else {
                            gVar.removeAllViews();
                            l lVar = gVar.f43322f;
                            if (lVar != null) {
                                ((TextureRegistry$SurfaceProducer) lVar.f43335b).release();
                                lVar.f43335b = null;
                                gVar.f43322f = null;
                            }
                            ViewTreeObserver viewTreeObserver = gVar.getViewTreeObserver();
                            if (viewTreeObserver.isAlive() && (fVar = gVar.f43323g) != null) {
                                gVar.f43323g = null;
                                viewTreeObserver.removeOnGlobalFocusChangeListener(fVar);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) gVar.getParent();
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(gVar);
                            }
                            sparseArray2.remove(i10);
                        }
                    } else {
                        x xVar = (x) map.get(Integer.valueOf(i10));
                        View viewA = xVar.a();
                        if (viewA != null) {
                            nVar.f43362k.remove(viewA.getContext());
                        }
                        xVar.f43392a.cancel();
                        xVar.f43392a.detachState();
                        xVar.f43399h.release();
                        l lVar2 = xVar.f43397f;
                        ((TextureRegistry$SurfaceProducer) lVar2.f43335b).release();
                        lVar2.f43335b = null;
                        map.remove(Integer.valueOf(i10));
                    }
                } else {
                    f2.o(i10, "Disposing unknown platform view with id: ", "PlatformViewsController");
                }
                break;
            default:
                m mVar = (m) this.f43335b;
                SparseArray sparseArray4 = mVar.f43345j;
                SparseArray sparseArray5 = mVar.f43344i;
                d dVar2 = (d) sparseArray5.get(i10);
                if (dVar2 != null) {
                    if (dVar2.getView() != null) {
                        View view2 = dVar2.getView();
                        ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(view2);
                        }
                    }
                    sparseArray5.remove(i10);
                    try {
                        dVar2.dispose();
                    } catch (RuntimeException e11) {
                        Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e11);
                    }
                    si.a aVar2 = (si.a) sparseArray4.get(i10);
                    if (aVar2 != null) {
                        aVar2.removeAllViews();
                        aVar2.a();
                        ViewGroup viewGroup5 = (ViewGroup) aVar2.getParent();
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(aVar2);
                        }
                        sparseArray4.remove(i10);
                    }
                } else {
                    f2.o(i10, "Disposing unknown platform view with id: ", "PlatformViewsController2");
                }
                break;
        }
    }

    public void a(wi.f fVar) {
        m mVar = (m) this.f43335b;
        l lVar = mVar.f43336a;
        String str = fVar.f53220b;
        int i10 = fVar.f53219a;
        ByteBuffer byteBuffer = fVar.f53227i;
        e eVar = (e) ((HashMap) lVar.f43335b).get(str);
        if (eVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        d dVarCreate = eVar.create(mVar.f43338c, i10, byteBuffer != null ? eVar.getCreateArgsCodec().b(byteBuffer) : null);
        View view = dVarCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(fVar.f53225g);
        mVar.f43344i.put(i10, dVarCreate);
        mi.s sVar = mVar.f43339d;
        if (sVar == null) {
            return;
        }
        dVarCreate.onFlutterViewAttached(sVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [io.flutter.plugin.platform.j] */
    @Override // wi.i
    public long b(final wi.f fVar) {
        g gVar;
        long jId;
        final n nVar = (n) this.f43335b;
        n.a(nVar, fVar);
        double d10 = fVar.f53222d;
        double d11 = fVar.f53221c;
        int i10 = fVar.f53219a;
        SparseArray sparseArray = nVar.f43365o;
        if (sparseArray.get(i10) != null) {
            throw new IllegalStateException(l1.d.e(i10, "Trying to create an already created platform view, view id: "));
        }
        if (nVar.f43357f == null) {
            throw new IllegalStateException(l1.d.e(i10, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (nVar.f43355d == null) {
            throw new IllegalStateException(l1.d.e(i10, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        final int i11 = 1;
        d dVarB = nVar.b(fVar, true);
        View view = dVarB.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        if (com.bumptech.glide.d.N(view, new i0(n.f43351x, 3))) {
            if (fVar.f53226h == 2) {
                n.e(19);
                if (nVar.f43356e.IsSurfaceControlEnabled()) {
                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                }
                return -2L;
            }
            if (!nVar.f43372v) {
                n.e(20);
                TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerA = nVar.f43357f.a(Build.VERSION.SDK_INT > 34 ? 1 : 2);
                l lVar = new l(4);
                lVar.f43335b = textureRegistry$SurfaceProducerA;
                int iK = nVar.k(d11);
                int iK2 = nVar.k(d10);
                Activity activity = nVar.f43354c;
                a aVar = nVar.f43360i;
                int i12 = fVar.f53219a;
                ?? r10 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.j
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z10) {
                        switch (i11) {
                            case 0:
                                int i13 = fVar.f53219a;
                                n nVar2 = nVar;
                                if (!z10) {
                                    io.flutter.plugin.editing.j jVar = nVar2.f43358g;
                                    if (jVar != null) {
                                        jVar.b(i13);
                                    }
                                    break;
                                } else {
                                    xi.p pVar = (xi.p) nVar2.f43359h.f52487a;
                                    if (pVar != null) {
                                        pVar.a("viewFocused", Integer.valueOf(i13), null);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (z10) {
                                    v6.c cVar = nVar.f43359h;
                                    int i14 = fVar.f53219a;
                                    xi.p pVar2 = (xi.p) cVar.f52487a;
                                    if (pVar2 != null) {
                                        pVar2.a("viewFocused", Integer.valueOf(i14), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                u uVar = x.f43391i;
                x xVar = null;
                if (iK != 0 && iK2 != 0) {
                    DisplayManager displayManager = (DisplayManager) activity.getSystemService(X3.i.f27786d);
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    lVar.h(iK, iK2);
                    VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(l1.d.e(i12, "flutter-vd#"), iK, iK2, displayMetrics.densityDpi, ((TextureRegistry$SurfaceProducer) lVar.f43335b).getSurface(), 0, x.f43391i, null);
                    if (virtualDisplayCreateVirtualDisplay != null) {
                        xVar = new x(activity, aVar, virtualDisplayCreateVirtualDisplay, dVarB, lVar, r10, i12);
                    }
                }
                if (xVar != null) {
                    nVar.f43361j.put(Integer.valueOf(i10), xVar);
                    View view2 = dVarB.getView();
                    nVar.f43362k.put(view2.getContext(), view2);
                    return ((TextureRegistry$SurfaceProducer) lVar.f43335b).id();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + fVar.f53220b + " with id: " + i10);
            }
        }
        n.e(23);
        int iK3 = nVar.k(d11);
        int iK4 = nVar.k(d10);
        final int i13 = 0;
        if (nVar.f43372v) {
            gVar = new g(nVar.f43354c);
            jId = -1;
        } else {
            TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducerA2 = nVar.f43357f.a(Build.VERSION.SDK_INT <= 34 ? 2 : 1);
            l lVar2 = new l(4);
            lVar2.f43335b = textureRegistry$SurfaceProducerA2;
            gVar = new g(nVar.f43354c);
            gVar.f43322f = lVar2;
            Surface surface = ((TextureRegistry$SurfaceProducer) lVar2.f43335b).getSurface();
            if (surface != null) {
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                } catch (Throwable th2) {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th2;
                }
            }
            jId = ((TextureRegistry$SurfaceProducer) lVar2.f43335b).id();
        }
        gVar.setTouchProcessor(nVar.f43353b);
        l lVar3 = gVar.f43322f;
        if (lVar3 != null) {
            lVar3.h(iK3, iK4);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK3, iK4);
        int iK5 = nVar.k(fVar.f53223e);
        int iK6 = nVar.k(fVar.f53224f);
        layoutParams.topMargin = iK5;
        layoutParams.leftMargin = iK6;
        gVar.setLayoutParams(layoutParams);
        View view3 = dVarB.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(iK3, iK4));
        view3.setImportantForAccessibility(4);
        gVar.addView(view3);
        gVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.j
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view4, boolean z10) {
                switch (i13) {
                    case 0:
                        int i14 = fVar.f53219a;
                        n nVar2 = nVar;
                        if (!z10) {
                            io.flutter.plugin.editing.j jVar = nVar2.f43358g;
                            if (jVar != null) {
                                jVar.b(i14);
                            }
                            break;
                        } else {
                            xi.p pVar = (xi.p) nVar2.f43359h.f52487a;
                            if (pVar != null) {
                                pVar.a("viewFocused", Integer.valueOf(i14), null);
                                break;
                            }
                        }
                        break;
                    default:
                        if (z10) {
                            v6.c cVar = nVar.f43359h;
                            int i15 = fVar.f53219a;
                            xi.p pVar2 = (xi.p) cVar.f52487a;
                            if (pVar2 != null) {
                                pVar2.a("viewFocused", Integer.valueOf(i15), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        nVar.f43355d.addView(gVar);
        sparseArray.append(i10, gVar);
        mi.s sVar = nVar.f43355d;
        if (sVar == null) {
            return jId;
        }
        dVarB.onFlutterViewAttached(sVar);
        return jId;
    }

    @Override // wi.i
    public void c(boolean z10) {
        ((n) this.f43335b).f43368r = z10;
    }

    public CharSequence d(wi.c cVar) {
        Activity activity = (Activity) ((i3.f) this.f43335b).f42853c;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (cVar != null) {
                            if (cVar == wi.c.f53213a) {
                            }
                        }
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        CharSequence text = itemAt.getText();
                        if (text != null) {
                            return text;
                        }
                        try {
                            Uri uri = itemAt.getUri();
                            if (uri == null) {
                                Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                                return null;
                            }
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                                return null;
                            }
                            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence charSequenceCoerceToText = itemAt.coerceToText(activity);
                            if (assetFileDescriptorOpenTypedAssetFileDescriptor == null) {
                                return charSequenceCoerceToText;
                            }
                            try {
                                assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                                return charSequenceCoerceToText;
                            } catch (IOException e10) {
                                charSequence = charSequenceCoerceToText;
                                e = e10;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e11) {
                            e = e11;
                            charSequence = text;
                        }
                    }
                } catch (FileNotFoundException unused) {
                    Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                    return charSequence;
                } catch (SecurityException e12) {
                    Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e12);
                    return charSequence;
                }
            } catch (IOException e13) {
                e = e13;
            }
        }
        return null;
    }

    public void e(String str, e eVar) {
        HashMap map = (HashMap) this.f43335b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, eVar);
    }

    @Override // wi.i
    public void f(int i10, int i11) {
        View view;
        switch (this.f43334a) {
            case 0:
                n nVar = (n) this.f43335b;
                if (i11 != 0 && i11 != 1) {
                    throw new IllegalStateException(l1.d.f("Trying to set unknown direction value: ", i11, "(view id: ", i10, ")"));
                }
                if (nVar.t0(i10)) {
                    view = ((x) nVar.f43361j.get(Integer.valueOf(i10))).a();
                } else {
                    d dVar = (d) nVar.l.get(i10);
                    if (dVar == null) {
                        f2.o(i10, "Setting direction to an unknown view with id: ", "PlatformViewsController");
                        return;
                    }
                    view = dVar.getView();
                }
                if (view == null) {
                    f2.o(i10, "Setting direction to a null view with id: ", "PlatformViewsController");
                    return;
                } else {
                    view.setLayoutDirection(i11);
                    return;
                }
            default:
                d dVar2 = (d) ((m) this.f43335b).f43344i.get(i10);
                if (dVar2 == null) {
                    f2.o(i10, "Setting direction to an unknown view with id: ", "PlatformViewsController2");
                    return;
                }
                View view2 = dVar2.getView();
                if (view2 == null) {
                    f2.o(i10, "Setting direction to a null view with id: ", "PlatformViewsController2");
                    return;
                } else {
                    view2.setLayoutDirection(i11);
                    return;
                }
        }
    }

    @Override // wi.i
    public void g(wi.g gVar) {
        switch (this.f43334a) {
            case 0:
                int i10 = gVar.f53228a;
                n nVar = (n) this.f43335b;
                float f10 = nVar.f43354c.getResources().getDisplayMetrics().density;
                if (!nVar.t0(i10)) {
                    d dVar = (d) nVar.l.get(i10);
                    if (dVar == null) {
                        f2.o(i10, "Sending touch to an unknown view with id: ", "PlatformViewsController");
                    } else {
                        View view = dVar.getView();
                        if (view == null) {
                            f2.o(i10, "Sending touch to a null view with id: ", "PlatformViewsController");
                        } else {
                            view.dispatchTouchEvent(nVar.j(f10, gVar, false));
                        }
                    }
                    break;
                } else {
                    x xVar = (x) nVar.f43361j.get(Integer.valueOf(i10));
                    MotionEvent motionEventJ = nVar.j(f10, gVar, true);
                    SingleViewPresentation singleViewPresentation = xVar.f43392a;
                    if (singleViewPresentation != null) {
                        singleViewPresentation.dispatchTouchEvent(motionEventJ);
                        break;
                    }
                }
                break;
            default:
                int i11 = gVar.f53228a;
                m mVar = (m) this.f43335b;
                float f11 = mVar.f43338c.getResources().getDisplayMetrics().density;
                d dVar2 = (d) mVar.f43344i.get(i11);
                if (dVar2 == null) {
                    f2.o(i11, "Sending touch to an unknown view with id: ", "PlatformViewsController2");
                } else {
                    View view2 = dVar2.getView();
                    if (view2 == null) {
                        f2.o(i11, "Sending touch to a null view with id: ", "PlatformViewsController2");
                    } else {
                        long j10 = gVar.f53242p;
                        int i12 = gVar.f53232e;
                        MotionEvent motionEventO = mVar.f43346k.o(new e0(j10));
                        List<List> list = (List) gVar.f53234g;
                        ArrayList arrayList = new ArrayList();
                        for (List list2 : list) {
                            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
                            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
                            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
                            double d10 = f11;
                            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d10);
                            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d10);
                            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d10);
                            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d10);
                            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d10);
                            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d10);
                            arrayList.add(pointerCoords);
                        }
                        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i12]);
                        if (motionEventO == null) {
                            List<List> list3 = (List) gVar.f53233f;
                            ArrayList arrayList2 = new ArrayList();
                            for (List list4 : list3) {
                                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                                arrayList2.add(pointerProperties);
                            }
                            motionEventO = MotionEvent.obtain(gVar.f53229b.longValue(), gVar.f53230c.longValue(), gVar.f53231d, gVar.f53232e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i12]), pointerCoordsArr, gVar.f53235h, gVar.f53236i, gVar.f53237j, gVar.f53238k, gVar.l, gVar.f53239m, gVar.f53240n, gVar.f53241o);
                        } else if (pointerCoordsArr.length >= 1) {
                            motionEventO.offsetLocation(pointerCoordsArr[0].x - motionEventO.getX(), pointerCoordsArr[0].y - motionEventO.getY());
                        }
                        view2.dispatchTouchEvent(motionEventO);
                    }
                }
                break;
        }
    }

    public void h(int i10, int i11) {
        ((TextureRegistry$SurfaceProducer) this.f43335b).setSize(i10, i11);
    }

    public void i() {
        ((TextureRegistry$SurfaceProducer) this.f43335b).scheduleFrame();
    }

    public void j(ArrayList arrayList) {
        i3.f fVar = (i3.f) this.f43335b;
        int i10 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int iOrdinal = ((wi.e) arrayList.get(i11)).ordinal();
            if (iOrdinal == 0) {
                i10 &= -5;
            } else if (iOrdinal == 1) {
                i10 &= -515;
            }
        }
        fVar.f42852b = i10;
        fVar.v();
    }

    public void k(int i10) {
        View decorView = ((Activity) ((i3.f) this.f43335b).f42853c).getWindow().getDecorView();
        switch (v0.i.c(i10)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case 2:
                decorView.performHapticFeedback(3);
                break;
            case 3:
                decorView.performHapticFeedback(6);
                break;
            case 4:
                decorView.performHapticFeedback(4);
                break;
            case 5:
                decorView.performHapticFeedback(16);
                break;
            case 6:
                decorView.performHapticFeedback(3);
                break;
            case 7:
                decorView.performHapticFeedback(17);
                break;
        }
    }

    @Override // wi.i
    public void m(wi.f fVar) {
        n nVar = (n) this.f43335b;
        n.e(19);
        n.a(nVar, fVar);
        if (nVar.f43356e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        nVar.b(fVar, false);
        n.e(19);
        if (nVar.f43356e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.flutter.plugin.platform.k, java.lang.Runnable] */
    @Override // wi.i
    public void x0(wi.h hVar, final b6.a aVar) {
        l lVar;
        n nVar = (n) this.f43335b;
        int iK = nVar.k(hVar.f53244b);
        int iK2 = nVar.k(hVar.f53245c);
        int i10 = hVar.f53243a;
        if (!nVar.t0(i10)) {
            d dVar = (d) nVar.l.get(i10);
            g gVar = (g) nVar.f43365o.get(i10);
            if (dVar == null || gVar == null) {
                f2.o(i10, "Resizing unknown platform view with id: ", "PlatformViewsController");
                return;
            }
            if ((iK > gVar.getRenderTargetWidth() || iK2 > gVar.getRenderTargetHeight()) && (lVar = gVar.f43322f) != null) {
                lVar.h(iK, iK2);
            }
            ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
            layoutParams.width = iK;
            layoutParams.height = iK2;
            gVar.setLayoutParams(layoutParams);
            View view = dVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iK;
                layoutParams2.height = iK2;
                view.setLayoutParams(layoutParams2);
            }
            int iRound = (int) Math.round(((double) gVar.getRenderTargetWidth()) / ((double) nVar.g()));
            int iRound2 = (int) Math.round(((double) gVar.getRenderTargetHeight()) / ((double) nVar.g()));
            wi.j jVar = aVar.f5493b;
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(iRound));
            map.put("height", Double.valueOf(iRound2));
            jVar.a(map);
            return;
        }
        final float fG = nVar.g();
        final x xVar = (x) nVar.f43361j.get(Integer.valueOf(i10));
        io.flutter.plugin.editing.j jVar2 = nVar.f43358g;
        if (jVar2 != null) {
            if (jVar2.f43299e.f17624a == 3) {
                jVar2.f43309p = true;
            }
            SingleViewPresentation singleViewPresentation = xVar.f43392a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                xVar.f43392a.getView().onInputConnectionLocked();
            }
        }
        ?? r3 = new Runnable() { // from class: io.flutter.plugin.platform.k
            @Override // java.lang.Runnable
            public final void run() {
                n nVar2 = (n) this.f43330a.f43335b;
                io.flutter.plugin.editing.j jVar3 = nVar2.f43358g;
                x xVar2 = xVar;
                if (jVar3 != null) {
                    if (jVar3.f43299e.f17624a == 3) {
                        jVar3.f43309p = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = xVar2.f43392a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        xVar2.f43392a.getView().onInputConnectionUnlocked();
                    }
                }
                double dG = nVar2.f43354c == null ? fG : nVar2.g();
                int iRound3 = (int) Math.round(((double) ((TextureRegistry$SurfaceProducer) xVar2.f43397f.f43335b).getWidth()) / dG);
                int iRound4 = (int) Math.round(((double) ((TextureRegistry$SurfaceProducer) xVar2.f43397f.f43335b).getHeight()) / dG);
                wi.j jVar4 = aVar.f5493b;
                HashMap map2 = new HashMap();
                map2.put("width", Double.valueOf(iRound3));
                map2.put("height", Double.valueOf(iRound4));
                jVar4.a(map2);
            }
        };
        l lVar2 = xVar.f43397f;
        if (iK == ((TextureRegistry$SurfaceProducer) lVar2.f43335b).getWidth() && iK2 == ((TextureRegistry$SurfaceProducer) xVar.f43397f.f43335b).getHeight()) {
            xVar.a().postDelayed(r3, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View viewA = xVar.a();
            lVar2.h(iK, iK2);
            xVar.f43399h.resize(iK, iK2, xVar.f43395d);
            xVar.f43399h.setSurface(((TextureRegistry$SurfaceProducer) lVar2.f43335b).getSurface());
            viewA.postDelayed(r3, 0L);
            return;
        }
        boolean zIsFocused = xVar.a().isFocused();
        s sVarDetachState = xVar.f43392a.detachState();
        xVar.f43399h.setSurface(null);
        xVar.f43399h.release();
        DisplayManager displayManager = (DisplayManager) xVar.f43393b.getSystemService(X3.i.f27786d);
        lVar2.h(iK, iK2);
        xVar.f43399h = displayManager.createVirtualDisplay("flutter-vd#" + xVar.f43396e, iK, iK2, xVar.f43395d, ((TextureRegistry$SurfaceProducer) lVar2.f43335b).getSurface(), 0, x.f43391i, null);
        View viewA2 = xVar.a();
        viewA2.addOnAttachStateChangeListener(new a5.j(viewA2, (k) r3));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(xVar.f43393b, xVar.f43399h.getDisplay(), xVar.f43394c, sVarDetachState, xVar.f43398g, zIsFocused);
        singleViewPresentation2.show();
        xVar.f43392a.cancel();
        xVar.f43392a = singleViewPresentation2;
    }

    @Override // wi.i
    public void y0(double d10, double d11, int i10) {
        n nVar = (n) this.f43335b;
        if (nVar.t0(i10)) {
            return;
        }
        g gVar = (g) nVar.f43365o.get(i10);
        if (gVar == null) {
            f2.o(i10, "Setting offset for unknown platform view with id: ", "PlatformViewsController");
            return;
        }
        int iK = nVar.k(d10);
        int iK2 = nVar.k(d11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gVar.getLayoutParams();
        layoutParams.topMargin = iK;
        layoutParams.leftMargin = iK2;
        gVar.setLayoutParams(layoutParams);
    }

    public l(int i10) {
        this.f43334a = i10;
        switch (i10) {
            case 4:
                break;
            default:
                this.f43335b = new HashMap();
                break;
        }
    }
}
