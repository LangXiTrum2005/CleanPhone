package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ve0 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0 f21154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qe0 f21155b;

    public ve0(ee0 ee0Var, qe0 qe0Var) {
        this.f21154a = ee0Var;
        this.f21155b = qe0Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int y10;
        int iZzu;
        try {
            ee0 ee0Var = this.f21154a;
            if (ee0Var != null) {
                int i10 = -1;
                if (Math.abs(f10) > Math.abs(f11)) {
                    if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        y10 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f10) * 1000.0f);
                        i10 = 1;
                    } else if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        y10 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f10) * 1000.0f);
                        i10 = 2;
                    } else {
                        y10 = 0;
                    }
                } else if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    y10 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f11) * 1000.0f);
                    i10 = 8;
                } else if (f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    y10 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f11) * 1000.0f);
                    i10 = 4;
                } else {
                    y10 = 0;
                }
                synchronized (ee0Var) {
                    iZzu = ee0Var.f13938n.zzu();
                }
                if (i10 == iZzu) {
                    ee0Var.c(this.f21155b.f19031c, y10);
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
