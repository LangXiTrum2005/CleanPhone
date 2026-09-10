package com.bytedance.adsdk.ugeno.Lxb;

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
public class Lxb {
    private int JXs;
    private LD LD;
    private com.bytedance.adsdk.ugeno.LD.lk Lxb;
    private Context ZU;
    private com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb lc;
    private ValueAnimator lk;

    public Lxb(Context context, com.bytedance.adsdk.ugeno.LD.lk lkVar, LD ld) {
        this.Lxb = lkVar;
        this.LD = ld;
        this.ZU = context;
    }

    public void LD() {
        ValueAnimator valueAnimator = this.lk;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void Lxb() {
        ValueAnimator valueAnimator = this.lk;
        if (valueAnimator == null || this.JXs == -2) {
            return;
        }
        valueAnimator.start();
    }

    public ValueAnimator lk() {
        com.bytedance.adsdk.ugeno.Lxb.LD.Lxb lkVar;
        LD ld = this.LD;
        if (ld == null || this.Lxb == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapLD = ld.LD();
        ArrayList arrayList = new ArrayList();
        if (mapLD != null && !mapLD.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapLD.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String strLk = ZU.Lxb(key).lk();
                    strLk.getClass();
                    switch (strLk) {
                        case "int":
                            lkVar = new com.bytedance.adsdk.ugeno.Lxb.LD.lk(this.ZU, this.Lxb, key, entry.getValue());
                            break;
                        case "float":
                            lkVar = new com.bytedance.adsdk.ugeno.Lxb.LD.LD(this.ZU, this.Lxb, key, entry.getValue());
                            break;
                        case "point":
                            lkVar = new com.bytedance.adsdk.ugeno.Lxb.LD.ZU(this.ZU, this.Lxb, key, entry.getValue());
                            break;
                        default:
                            lkVar = null;
                            break;
                    }
                    if (lkVar != null) {
                        arrayList.addAll(lkVar.JXs());
                    }
                }
            }
        }
        JSONObject jSONObjectLxb = this.LD.Lxb();
        if (jSONObjectLxb != null) {
            com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb Lxb = com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb.C0031Lxb.Lxb(this.Lxb, jSONObjectLxb);
            this.lc = Lxb;
            if (Lxb != null) {
                arrayList.addAll(Lxb.lk());
            }
        }
        final View viewQAg = this.Lxb.QAg();
        if (viewQAg == null) {
            return null;
        }
        final LD.Lxb lxbEbl = this.LD.ebl();
        if (lxbEbl != null) {
            viewQAg.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.Lxb.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = viewQAg.getWidth();
                    int height = viewQAg.getHeight();
                    viewQAg.setPivotX(lk.Lxb(lxbEbl.Lxb, width));
                    viewQAg.setPivotY(lk.Lxb(lxbEbl.LD, height));
                }
            });
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewQAg, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.JXs = lk.Lxb(this.LD.ZU());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.LD.lk());
        int i = this.JXs;
        if (i != -2) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i);
        }
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.LD.lc());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(lk.Lxb(this.LD.JXs()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(lk.LD(this.LD.OY()));
        this.lk = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public void Lxb(Canvas canvas) {
        com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb lxb = this.lc;
        if (lxb != null) {
            lxb.Lxb(canvas);
        }
    }

    public void Lxb(int i, int i2) {
        com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb lxb = this.lc;
        if (lxb != null) {
            lxb.Lxb(i, i2);
        }
    }
}
