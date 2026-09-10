package com.bytedance.adsdk.ugeno.core.lr;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public String ri = "GesThrough_";
    private List<MotionEvent> lr = new ArrayList();
    private Set<String> ik = Collections.synchronizedSet(new HashSet());

    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, MotionEvent motionEvent) {
        if (ikVar == null || motionEvent == null || this.lr == null) {
            return;
        }
        ri(ikVar.sf(), ikVar.xd(), motionEvent);
    }

    public void ri(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.lr == null) {
            return;
        }
        this.ri = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (motionEvent.getAction() == 0) {
            this.lr.clear();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(i, i2);
        this.lr.add(motionEventObtain);
    }

    public boolean ri(MotionEvent motionEvent) {
        if (motionEvent == null || this.ik == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.ik.contains(motionEvent.getDownTime() + "_" + pointerId);
    }

    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        if (this.lr.isEmpty() || this.ik == null || ikVar == null || ikVar.sf() == null || ikVar.sf().getRootView() == null) {
            return;
        }
        ri(ikVar.sf());
    }

    public void ri(View view) {
        if (this.lr.isEmpty() || this.ik == null || view == null || view.getRootView() == null) {
            return;
        }
        final View rootView = view.getRootView();
        this.lr.size();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.lr.ri.1
            @Override // java.lang.Runnable
            public void run() {
                for (MotionEvent motionEvent : ri.this.lr) {
                    if (motionEvent != null) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        ri.this.ik.add(motionEvent.getDownTime() + "_" + pointerId);
                        rootView.dispatchTouchEvent(motionEvent);
                        motionEvent.recycle();
                    }
                }
                ri.this.lr.clear();
            }
        }, 300L);
    }
}
