package com.bytedance.adsdk.ugeno.core.ud;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    public String qdl = "GesThrough_";
    private List<MotionEvent> ud = new ArrayList();
    private Set<String> lnr = Collections.synchronizedSet(new HashSet());

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, MotionEvent motionEvent) {
        if (lnrVar == null || motionEvent == null || this.ud == null) {
            return;
        }
        qdl(lnrVar.rq(), lnrVar.hkc(), motionEvent);
    }

    public void qdl(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.ud == null) {
            return;
        }
        this.qdl = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (motionEvent.getAction() == 0) {
            this.ud.clear();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(i2, i3);
        this.ud.add(motionEventObtain);
    }

    public boolean qdl(MotionEvent motionEvent) {
        if (motionEvent == null || this.lnr == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.lnr.contains(motionEvent.getDownTime() + "_" + pointerId);
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        if (this.ud.isEmpty() || this.lnr == null || lnrVar == null || lnrVar.rq() == null || lnrVar.rq().getRootView() == null) {
            return;
        }
        qdl(lnrVar.rq());
    }

    public void qdl(View view) {
        if (this.ud.isEmpty() || this.lnr == null || view == null || view.getRootView() == null) {
            return;
        }
        final View rootView = view.getRootView();
        Log.d(this.qdl, "Re-dispatch motionEvents.size(): " + this.ud.size());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ud.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                for (MotionEvent motionEvent : qdl.this.ud) {
                    if (motionEvent != null) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        qdl.this.lnr.add(motionEvent.getDownTime() + "_" + pointerId);
                        rootView.dispatchTouchEvent(motionEvent);
                        motionEvent.recycle();
                    }
                }
                qdl.this.ud.clear();
            }
        }, 300L);
    }
}
