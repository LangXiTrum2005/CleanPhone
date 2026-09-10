package com.bytedance.adsdk.ugeno.ri;

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

/* JADX INFO: loaded from: classes2.dex */
public class ri extends AnimatorListenerAdapter {
    private int di = 1;
    private int fi;
    private ValueAnimator ik;
    private lr jbs;
    private Context ka;
    private ik lr;
    private String mj;
    private com.bytedance.adsdk.ugeno.lr.ik ri;
    private com.bytedance.adsdk.ugeno.ri.ri.ri xha;

    public ri(Context context, com.bytedance.adsdk.ugeno.lr.ik ikVar, ik ikVar2) {
        this.ri = ikVar;
        this.lr = ikVar2;
        this.ka = context;
    }

    public String fi() {
        return this.mj;
    }

    public void ik() {
        ValueAnimator valueAnimator = this.ik;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public ValueAnimator ka() {
        com.bytedance.adsdk.ugeno.ri.lr.ri ikVar;
        ik ikVar2 = this.lr;
        if (ikVar2 == null || this.ri == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapLr = ikVar2.lr();
        ArrayList arrayList = new ArrayList();
        if (mapLr != null && !mapLr.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapLr.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String strIk = fi.ri(key).ik();
                    strIk.getClass();
                    switch (strIk) {
                        case "int":
                            ikVar = new com.bytedance.adsdk.ugeno.ri.lr.ik(this.ka, this.ri, key, entry.getValue());
                            break;
                        case "float":
                            ikVar = new com.bytedance.adsdk.ugeno.ri.lr.lr(this.ka, this.ri, key, entry.getValue());
                            break;
                        case "point":
                            ikVar = new com.bytedance.adsdk.ugeno.ri.lr.ka(this.ka, this.ri, key, entry.getValue());
                            break;
                        default:
                            ikVar = null;
                            break;
                    }
                    if (ikVar != null) {
                        arrayList.addAll(ikVar.fi());
                    }
                }
            }
        }
        JSONObject jSONObjectRi = this.lr.ri();
        if (jSONObjectRi != null) {
            com.bytedance.adsdk.ugeno.ri.ri.ri riVarRi = com.bytedance.adsdk.ugeno.ri.ri.ri.C0196ri.ri(this.ri, jSONObjectRi);
            this.xha = riVarRi;
            if (riVarRi != null) {
                arrayList.addAll(riVarRi.ik());
            }
        }
        final View viewSf = this.ri.sf();
        if (viewSf == null) {
            return null;
        }
        final ik.ri riVarXha = this.lr.xha();
        if (riVarXha != null) {
            viewSf.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.ri.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = viewSf.getWidth();
                    int height = viewSf.getHeight();
                    viewSf.setPivotX(ka.ri(riVarXha.ri, width));
                    viewSf.setPivotY(ka.ri(riVarXha.lr, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewSf, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.fi = ka.ri(this.lr.ka());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.lr.ik());
        int i = this.fi;
        if (i != Integer.MIN_VALUE) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i);
        }
        this.di = this.lr.qt();
        this.mj = this.lr.jbs();
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.lr.di());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(ka.ri(this.lr.fi()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(ka.lr(this.lr.mj()));
        objectAnimatorOfPropertyValuesHolder.addListener(this);
        this.ik = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public void lr() {
        ValueAnimator valueAnimator = this.ik;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        lr lrVar = this.jbs;
        if (lrVar != null) {
            lrVar.lr();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        lr lrVar = this.jbs;
        if (lrVar != null) {
            lrVar.ri();
        }
    }

    public void ri() {
        ValueAnimator valueAnimator = this.ik;
        if (valueAnimator == null || this.di == 0 || this.fi == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    public void lr(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ri.ri.ri riVar = this.xha;
        if (riVar != null) {
            riVar.lr(canvas);
        }
    }

    public void ri(lr lrVar) {
        this.jbs = lrVar;
    }

    public void ri(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ri.ri.ri riVar = this.xha;
        if (riVar != null) {
            riVar.ri(canvas);
        }
    }

    public void ri(int i, int i2) {
        com.bytedance.adsdk.ugeno.ri.ri.ri riVar = this.xha;
        if (riVar != null) {
            riVar.ri(i, i2);
        }
    }
}
