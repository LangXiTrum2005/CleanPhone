package com.bytedance.adsdk.ugeno.Lxb.LD;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class lk extends Lxb {
    public lk(Context context, com.bytedance.adsdk.ugeno.LD.lk lkVar, String str, TreeMap<Float, String> treeMap) {
        super(context, lkVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.LD.Lxb
    public void LD() {
        if (this.ZU == com.bytedance.adsdk.ugeno.Lxb.ZU.BACKGROUND_COLOR) {
            this.JXs.add(Keyframe.ofInt(0.0f, this.ebl.le()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.LD.Lxb
    public void Lxb(float f, String str) {
        this.JXs.add(this.ZU == com.bytedance.adsdk.ugeno.Lxb.ZU.BACKGROUND_COLOR ? Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str)) : Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str, 0)));
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.LD.Lxb
    public TypeEvaluator lc() {
        return this.ZU == com.bytedance.adsdk.ugeno.Lxb.ZU.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }
}
