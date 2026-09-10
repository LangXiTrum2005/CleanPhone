package com.bytedance.adsdk.ugeno.ri.lr;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.ri.fi;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri {
    protected List<PropertyValuesHolder> di = new ArrayList();
    protected List<Keyframe> fi = new ArrayList();
    protected Map<Float, String> ik;
    protected fi ka;
    protected String lr;
    protected Context ri;
    protected com.bytedance.adsdk.ugeno.lr.ik xha;

    public ri(Context context, com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, Map<Float, String> map) {
        this.ri = context;
        this.lr = str;
        this.ik = map;
        this.ka = fi.ri(this.lr);
        this.xha = ikVar;
    }

    public abstract TypeEvaluator di();

    public List<PropertyValuesHolder> fi() {
        String strLr = this.ka.lr();
        ka();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strLr, (Keyframe[]) this.fi.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorDi = di();
        if (typeEvaluatorDi != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorDi);
        }
        this.di.add(propertyValuesHolderOfKeyframe);
        return this.di;
    }

    public void ik() {
        Map<Float, String> map = this.ik;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.ik;
        if (map2 instanceof TreeMap) {
            Float f = (Float) ((TreeMap) map2).lastKey();
            if (f.floatValue() != 100.0f) {
                ri(100.0f, this.ik.get(f));
            }
        }
    }

    public void ka() {
        Map<Float, String> map = this.ik;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!ri()) {
            lr();
        }
        for (Map.Entry<Float, String> entry : this.ik.entrySet()) {
            if (entry != null) {
                ri(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        ik();
    }

    public abstract void lr();

    public abstract void ri(float f, String str);

    public boolean ri() {
        Map<Float, String> map = this.ik;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.ik.containsKey(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }
}
