package com.bytedance.adsdk.ugeno.ri.lr;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.ri.fi;
import com.unity3d.services.UnityAdsConstants;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends ri {
    public ik(Context context, com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, TreeMap<Float, String> treeMap) {
        super(context, ikVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr.ri
    public TypeEvaluator di() {
        return this.ka == fi.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr.ri
    public void lr() {
        if (this.ka == fi.BACKGROUND_COLOR) {
            this.fi.add(Keyframe.ofInt(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xha.srn()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr.ri
    public void ri(float f, String str) {
        this.fi.add(this.ka == fi.BACKGROUND_COLOR ? Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.xha.ri.ri(str)) : Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.xha.ik.ri(str, 0)));
    }
}
