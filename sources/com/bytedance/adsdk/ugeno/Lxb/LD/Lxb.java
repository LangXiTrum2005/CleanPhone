package com.bytedance.adsdk.ugeno.Lxb.LD;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb {
    protected String LD;
    protected Context Lxb;
    protected com.bytedance.adsdk.ugeno.Lxb.ZU ZU;
    protected com.bytedance.adsdk.ugeno.LD.lk ebl;
    protected Map<Float, String> lk;
    protected List<PropertyValuesHolder> lc = new ArrayList();
    protected List<Keyframe> JXs = new ArrayList();

    public Lxb(Context context, com.bytedance.adsdk.ugeno.LD.lk lkVar, String str, Map<Float, String> map) {
        this.Lxb = context;
        this.LD = str;
        this.lk = map;
        this.ZU = com.bytedance.adsdk.ugeno.Lxb.ZU.Lxb(this.LD);
        this.ebl = lkVar;
    }

    public List<PropertyValuesHolder> JXs() {
        String strLD = this.ZU.LD();
        ZU();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strLD, (Keyframe[]) this.JXs.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorLc = lc();
        if (typeEvaluatorLc != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorLc);
        }
        this.lc.add(propertyValuesHolderOfKeyframe);
        return this.lc;
    }

    public abstract void LD();

    public abstract void Lxb(float f, String str);

    public boolean Lxb() {
        Map<Float, String> map = this.lk;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.lk.containsKey(Float.valueOf(0.0f));
    }

    public void ZU() {
        Map<Float, String> map = this.lk;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!Lxb()) {
            LD();
        }
        for (Map.Entry<Float, String> entry : this.lk.entrySet()) {
            if (entry != null) {
                Lxb(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        lk();
    }

    public abstract TypeEvaluator lc();

    public void lk() {
        Map<Float, String> map = this.lk;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.lk;
        if (map2 instanceof TreeMap) {
            Float f = (Float) ((TreeMap) map2).lastKey();
            if (f.floatValue() != 100.0f) {
                Lxb(100.0f, this.lk.get(f));
            }
        }
    }
}
