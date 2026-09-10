package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f23641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23643c;
    public final WeakReference d;

    public gf(lf visibilityTracker, AtomicBoolean isPaused) {
        Intrinsics.f(visibilityTracker, "visibilityTracker");
        Intrinsics.f(isPaused, "isPaused");
        this.f23641a = isPaused;
        this.f23642b = new ArrayList();
        this.f23643c = new ArrayList();
        this.d = new WeakReference(visibilityTracker);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x019a  */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23641a.get()) {
            return;
        }
        lf lfVar = (lf) this.d.get();
        if (lfVar != null) {
            lfVar.m = false;
            for (Map.Entry entry : lfVar.f23791a.entrySet()) {
                View view = (View) entry.getKey();
                Cif cif = (Cif) entry.getValue();
                int i2 = cif.f23699a;
                View view2 = cif.f23701c;
                Object obj = cif.d;
                byte b2 = lfVar.d;
                boolean z2 = true;
                if (b2 == 1) {
                    ff ffVar = lfVar.f23792b;
                    if (ffVar.a(view2, view, i2, obj) && ffVar.a(view, view, i2)) {
                        this.f23642b.add(view);
                    } else {
                        this.f23643c.add(view);
                    }
                } else if (b2 == 2) {
                    ff ffVar2 = lfVar.f23792b;
                    Intrinsics.d(ffVar2, "null cannot be cast to non-null type com.inmobi.ads.viewability.inmobi.HtmlPollingVisibilityTracker.HtmlVisibilityChecker");
                    P4 p4 = (P4) ((W4) ffVar2);
                    boolean zA = p4.a(view2, view, i2, obj);
                    boolean zA2 = p4.a(view, view, i2);
                    Intrinsics.f(view, "view");
                    if (!(view instanceof GestureDetectorOnGestureListenerC3005ec)) {
                        z2 = false;
                        break;
                    }
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        z2 = false;
                        break;
                    }
                    GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) view;
                    int[] iArr = new int[2];
                    gestureDetectorOnGestureListenerC3005ec.getLocationInWindow(iArr);
                    int[] viewableFrameArray = gestureDetectorOnGestureListenerC3005ec.getViewableFrameArray();
                    int i3 = iArr[0] + (viewableFrameArray != null ? viewableFrameArray[0] : 0);
                    int i4 = iArr[1] + (viewableFrameArray != null ? viewableFrameArray[1] : 0);
                    if (!rect.intersect(new Rect(i3, i4, i3 + (viewableFrameArray != null ? viewableFrameArray[2] : 0), (viewableFrameArray != null ? viewableFrameArray[3] : 0) + i4))) {
                        z2 = false;
                        break;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gestureDetectorOnGestureListenerC3005ec.getWidth(), gestureDetectorOnGestureListenerC3005ec.getHeight(), Bitmap.Config.ARGB_8888);
                    Intrinsics.e(bitmapCreateBitmap, "createBitmap(...)");
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, new Paint());
                    gestureDetectorOnGestureListenerC3005ec.draw(canvas);
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, B2.b(gestureDetectorOnGestureListenerC3005ec.getWidth() / U3.b()), B2.b(gestureDetectorOnGestureListenerC3005ec.getHeight() / U3.b()), true);
                    Intrinsics.e(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                    int[] viewableFrameArray2 = gestureDetectorOnGestureListenerC3005ec.getViewableFrameArray();
                    int iMin = Math.min(bitmapCreateScaledBitmap.getWidth(), viewableFrameArray2 != null ? viewableFrameArray2[0] : 0);
                    int iMin2 = Math.min(bitmapCreateScaledBitmap.getHeight(), viewableFrameArray2 != null ? viewableFrameArray2[1] : 0);
                    int iMin3 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[2] : 0, bitmapCreateScaledBitmap.getWidth() - iMin);
                    int iMin4 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[3] : 0, bitmapCreateScaledBitmap.getHeight() - iMin2);
                    Bitmap bitmapCreateBitmap2 = (iMin3 <= 0 || iMin4 <= 0) ? null : Bitmap.createBitmap(bitmapCreateScaledBitmap, iMin, iMin2, iMin3, iMin4);
                    if (bitmapCreateBitmap2 == null) {
                        z2 = false;
                        break;
                    }
                    int height = bitmapCreateBitmap2.getHeight() * bitmapCreateBitmap2.getWidth();
                    int[] iArr2 = new int[height];
                    bitmapCreateBitmap2.getPixels(iArr2, 0, bitmapCreateBitmap2.getWidth(), 0, 0, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight());
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 >= height) {
                            z2 = false;
                            break;
                        }
                        int i7 = iArr2[i5];
                        if (i7 > -16777216 && i7 < 0 && (i6 = i6 + 1) >= gestureDetectorOnGestureListenerC3005ec.getMinimumPixelsPainted()) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (zA && zA2 && z2) {
                        this.f23642b.add(view);
                    } else {
                        this.f23643c.add(view);
                    }
                } else {
                    ff ffVar3 = lfVar.f23792b;
                    if (ffVar3.a(view2, view, i2, obj) && ffVar3.a(view, view, i2)) {
                        this.f23642b.add(view);
                    } else {
                        this.f23643c.add(view);
                    }
                }
            }
        }
        hf hfVar = lfVar != null ? lfVar.j : null;
        if (hfVar != null) {
            hfVar.a(this.f23642b, this.f23643c);
        }
        this.f23642b.clear();
        this.f23643c.clear();
        if (lfVar != null) {
            lfVar.d();
        }
    }
}
