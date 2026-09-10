package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class On implements Runnable {
    public final AtomicBoolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final WeakReference d;

    public On(Sn visibilityTracker, AtomicBoolean isPaused) {
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(isPaused, "isPaused");
        this.a = isPaused;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new WeakReference(visibilityTracker);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        if (this.a.get()) {
            return;
        }
        Sn sn = (Sn) this.d.get();
        if (sn != null) {
            int i4 = 0;
            sn.k = false;
            for (Map.Entry entry : sn.a.entrySet()) {
                View view = (View) entry.getKey();
                Qn qn = (Qn) entry.getValue();
                int i5 = qn.a;
                View view2 = qn.c;
                byte b = sn.c;
                if (b == 1) {
                    C3095n7 c3095n7 = C3170q7.k;
                    if (c3095n7.b(view2, view, i5) && c3095n7.a(view, view, i5)) {
                        this.b.add(view);
                    } else {
                        this.c.add(view);
                    }
                } else {
                    if (b == 2) {
                        C3095n7 c3095n8 = C3170q7.k;
                        Intrinsics.competently(c3095n8, "null cannot be cast to non-null type com.inmobi.ads.viewability.inmobi.HtmlPollingVisibilityTracker.HtmlVisibilityChecker");
                        boolean zB = c3095n8.b(view2, view, i5);
                        boolean zA = c3095n8.a(view, view, i5);
                        Intrinsics.checkNotNullParameter(view, "view");
                        if (!(view instanceof GestureDetectorOnGestureListenerC2829ci)) {
                            i = i4;
                            i3 = i;
                            break;
                        }
                        Rect rect = new Rect();
                        if (view.getGlobalVisibleRect(rect)) {
                            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) view;
                            int[] iArr = new int[2];
                            gestureDetectorOnGestureListenerC2829ci.getLocationInWindow(iArr);
                            int[] viewableFrameArray = gestureDetectorOnGestureListenerC2829ci.getViewableFrameArray();
                            int i6 = iArr[i4] + (viewableFrameArray != null ? viewableFrameArray[i4] : i4);
                            int i7 = iArr[1] + (viewableFrameArray != null ? viewableFrameArray[1] : i4);
                            if (viewableFrameArray != null) {
                                i2 = viewableFrameArray[2];
                                i = i4;
                            } else {
                                i2 = i4;
                                i = i2;
                            }
                            if (rect.intersect(new Rect(i6, i7, i6 + i2, (viewableFrameArray != null ? viewableFrameArray[3] : i) + i7))) {
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gestureDetectorOnGestureListenerC2829ci.getWidth(), gestureDetectorOnGestureListenerC2829ci.getHeight(), Bitmap.Config.ARGB_8888);
                                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                canvas.drawBitmap(bitmapCreateBitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new Paint());
                                gestureDetectorOnGestureListenerC2829ci.draw(canvas);
                                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, F3.b(gestureDetectorOnGestureListenerC2829ci.getWidth() / J5.b()), F3.b(gestureDetectorOnGestureListenerC2829ci.getHeight() / J5.b()), true);
                                Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                                int[] viewableFrameArray2 = gestureDetectorOnGestureListenerC2829ci.getViewableFrameArray();
                                int iMin = Math.min(bitmapCreateScaledBitmap.getWidth(), viewableFrameArray2 != null ? viewableFrameArray2[i] : i);
                                int iMin2 = Math.min(bitmapCreateScaledBitmap.getHeight(), viewableFrameArray2 != null ? viewableFrameArray2[1] : i);
                                int iMin3 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[2] : i, bitmapCreateScaledBitmap.getWidth() - iMin);
                                int iMin4 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[3] : i, bitmapCreateScaledBitmap.getHeight() - iMin2);
                                Bitmap bitmapCreateBitmap2 = (iMin3 <= 0 || iMin4 <= 0) ? null : Bitmap.createBitmap(bitmapCreateScaledBitmap, iMin, iMin2, iMin3, iMin4);
                                if (bitmapCreateBitmap2 != null) {
                                    int height = bitmapCreateBitmap2.getHeight() * bitmapCreateBitmap2.getWidth();
                                    int[] iArr2 = new int[height];
                                    bitmapCreateBitmap2.getPixels(iArr2, 0, bitmapCreateBitmap2.getWidth(), 0, 0, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight());
                                    int i8 = i;
                                    int i9 = i8;
                                    while (true) {
                                        if (i8 < height) {
                                            int i10 = iArr2[i8];
                                            if (i10 > -16777216 && i10 < 0 && (i9 = i9 + 1) >= gestureDetectorOnGestureListenerC2829ci.getMinimumPixelsPainted()) {
                                                i3 = 1;
                                                break;
                                            }
                                            i8++;
                                        }
                                    }
                                }
                            }
                        } else {
                            i = i4;
                        }
                        i3 = i;
                        break;
                        if (zB && zA && i3 != 0) {
                            this.b.add(view);
                        } else {
                            this.c.add(view);
                        }
                    } else {
                        i = i4;
                        C3095n7 c3095n9 = C3170q7.k;
                        if (c3095n9.b(view2, view, i5) && c3095n9.a(view, view, i5)) {
                            this.b.add(view);
                        } else {
                            this.c.add(view);
                        }
                    }
                    i4 = i;
                }
            }
        }
        Pn pn = sn != null ? sn.h : null;
        if (pn != null) {
            pn.a(this.b, this.c);
        }
        this.b.clear();
        this.c.clear();
        if (sn != null) {
            AbstractC3353xg abstractC3353xg = (AbstractC3353xg) sn;
            if (abstractC3353xg.k || abstractC3353xg.g.get()) {
                return;
            }
            abstractC3353xg.k = true;
            cutely.wireman(A9.d, null, null, new Rn(abstractC3353xg, null), 3, null);
        }
    }
}
