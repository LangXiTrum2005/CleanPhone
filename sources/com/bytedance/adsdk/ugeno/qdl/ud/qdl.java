package com.bytedance.adsdk.ugeno.qdl.ud;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.qdl.mzz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl {
    protected Map<Float, String> lnr;
    protected mzz mml;
    protected List<PropertyValuesHolder> mo = new ArrayList();
    protected List<Keyframe> mzz = new ArrayList();
    protected Context qdl;
    protected String ud;
    protected com.bytedance.adsdk.ugeno.ud.lnr wd;

    public qdl(Context context, com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, Map<Float, String> map) {
        this.qdl = context;
        this.ud = str;
        this.lnr = map;
        this.mml = mzz.qdl(this.ud);
        this.wd = lnrVar;
    }

    public void lnr() {
        Map<Float, String> map = this.lnr;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.lnr;
        if (map2 instanceof TreeMap) {
            Float f = (Float) ((TreeMap) map2).lastKey();
            if (f.floatValue() != 100.0f) {
                qdl(100.0f, this.lnr.get(f));
            }
        }
    }

    public void mml() {
        Map<Float, String> map = this.lnr;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!qdl()) {
            ud();
        }
        for (Map.Entry<Float, String> entry : this.lnr.entrySet()) {
            if (entry != null) {
                qdl(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        lnr();
    }

    public abstract TypeEvaluator mo();

    public List<PropertyValuesHolder> mzz() {
        String strUd = this.mml.ud();
        mml();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strUd, (Keyframe[]) this.mzz.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorMo = mo();
        if (typeEvaluatorMo != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorMo);
        }
        this.mo.add(propertyValuesHolderOfKeyframe);
        return this.mo;
    }

    public abstract void qdl(float f, String str);

    public boolean qdl() {
        Map<Float, String> map = this.lnr;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.lnr.containsKey(Float.valueOf(0.0f));
    }

    public abstract void ud();
}
