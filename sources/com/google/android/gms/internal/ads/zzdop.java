package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdop implements GestureDetector.OnGestureListener {
    private final zzdnh zza;
    private final zzdoh zzb;

    public zzdop(zzdnh zzdnhVar, zzdoh zzdohVar) {
        this.zza = zzdnhVar;
        this.zzb = zzdohVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int y;
        try {
            zzdnh zzdnhVar = this.zza;
            if (zzdnhVar != null) {
                int i2 = -1;
                if (Math.abs(f) > Math.abs(f2)) {
                    if (f > 0.0f) {
                        y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                        i2 = 1;
                    } else if (f < 0.0f) {
                        y = (int) (((motionEvent2.getX() - motionEvent.getX()) / f) * 1000.0f);
                        i2 = 2;
                    } else {
                        y = 0;
                    }
                } else if (f2 > 0.0f) {
                    y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                    i2 = 8;
                } else if (f2 < 0.0f) {
                    y = (int) (((motionEvent2.getY() - motionEvent.getY()) / f2) * 1000.0f);
                    i2 = 4;
                } else {
                    y = 0;
                }
                if (i2 == zzdnhVar.zzG()) {
                    zzdnhVar.zzE(this.zzb.zzr(), y);
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
