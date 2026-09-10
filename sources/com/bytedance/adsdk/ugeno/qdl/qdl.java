package com.bytedance.adsdk.ugeno.qdl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends AnimatorListenerAdapter {
    private String jpc;
    private ValueAnimator lnr;
    private Context mml;
    private int mo = 1;
    private int mzz;
    private com.bytedance.adsdk.ugeno.ud.lnr qdl;
    private ud tvp;
    private lnr ud;
    private com.bytedance.adsdk.ugeno.qdl.qdl.qdl wd;

    public qdl(Context context, com.bytedance.adsdk.ugeno.ud.lnr lnrVar, lnr lnrVar2) {
        this.qdl = lnrVar;
        this.ud = lnrVar2;
        this.mml = context;
    }

    public void lnr() {
        ValueAnimator valueAnimator = this.lnr;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public ValueAnimator mml() {
        com.bytedance.adsdk.ugeno.qdl.ud.qdl lnrVar;
        lnr lnrVar2 = this.ud;
        if (lnrVar2 == null || this.qdl == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapUd = lnrVar2.ud();
        ArrayList arrayList = new ArrayList();
        if (mapUd != null && !mapUd.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapUd.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String strLnr = mzz.qdl(key).lnr();
                    strLnr.getClass();
                    switch (strLnr) {
                        case "int":
                            lnrVar = new com.bytedance.adsdk.ugeno.qdl.ud.lnr(this.mml, this.qdl, key, entry.getValue());
                            break;
                        case "float":
                            lnrVar = new com.bytedance.adsdk.ugeno.qdl.ud.ud(this.mml, this.qdl, key, entry.getValue());
                            break;
                        case "point":
                            lnrVar = new com.bytedance.adsdk.ugeno.qdl.ud.mml(this.mml, this.qdl, key, entry.getValue());
                            break;
                        default:
                            lnrVar = null;
                            break;
                    }
                    if (lnrVar != null) {
                        arrayList.addAll(lnrVar.mzz());
                    }
                }
            }
        }
        JSONObject jSONObjectQdl = this.ud.qdl();
        if (jSONObjectQdl != null) {
            com.bytedance.adsdk.ugeno.qdl.qdl.qdl qdlVarQdl = com.bytedance.adsdk.ugeno.qdl.qdl.qdl.C0067qdl.qdl(this.qdl, jSONObjectQdl);
            this.wd = qdlVarQdl;
            if (qdlVarQdl != null) {
                arrayList.addAll(qdlVarQdl.lnr());
            }
        }
        final View viewRq = this.qdl.rq();
        if (viewRq == null) {
            return null;
        }
        final lnr.qdl qdlVarWd = this.ud.wd();
        if (qdlVarWd != null) {
            viewRq.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.qdl.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = viewRq.getWidth();
                    int height = viewRq.getHeight();
                    viewRq.setPivotX(mml.qdl(qdlVarWd.qdl, width));
                    viewRq.setPivotY(mml.qdl(qdlVarWd.ud, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewRq, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.mzz = mml.qdl(this.ud.mml());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.ud.lnr());
        int i2 = this.mzz;
        if (i2 != Integer.MIN_VALUE) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i2);
        }
        this.mo = this.ud.to();
        this.jpc = this.ud.tvp();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.ud.mo());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(mml.qdl(this.ud.mzz()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(mml.ud(this.ud.jpc()));
        objectAnimatorOfPropertyValuesHolder.addListener(this);
        this.lnr = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public String mzz() {
        return this.jpc;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ud udVar = this.tvp;
        if (udVar != null) {
            udVar.ud();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        ud udVar = this.tvp;
        if (udVar != null) {
            udVar.qdl();
        }
    }

    public void qdl() {
        ValueAnimator valueAnimator = this.lnr;
        if (valueAnimator == null || this.mo == 0 || this.mzz == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    public void ud() {
        ValueAnimator valueAnimator = this.lnr;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void ud(Canvas canvas) {
        com.bytedance.adsdk.ugeno.qdl.qdl.qdl qdlVar = this.wd;
        if (qdlVar != null) {
            qdlVar.ud(canvas);
        }
    }

    public void qdl(ud udVar) {
        this.tvp = udVar;
    }

    public void qdl(Canvas canvas) {
        com.bytedance.adsdk.ugeno.qdl.qdl.qdl qdlVar = this.wd;
        if (qdlVar != null) {
            qdlVar.qdl(canvas);
        }
    }

    public void qdl(int i2, int i3) {
        com.bytedance.adsdk.ugeno.qdl.qdl.qdl qdlVar = this.wd;
        if (qdlVar != null) {
            qdlVar.qdl(i2, i3);
        }
    }
}
