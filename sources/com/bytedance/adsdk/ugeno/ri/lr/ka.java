package com.bytedance.adsdk.ugeno.ri.lr;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ri.fi;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends ri {
    private List<Keyframe> mj;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.lr.ka$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[fi.values().length];
            ri = iArr;
            try {
                iArr[fi.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[fi.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ka(Context context, com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, Map<Float, String> map) {
        super(context, ikVar, str, map);
        this.mj = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr.ri
    public TypeEvaluator di() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr.ri
    public List<PropertyValuesHolder> fi() {
        String strLr = this.ka.lr();
        ka();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strLr + "X", (Keyframe[]) this.fi.toArray(new Keyframe[0]));
        this.di.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strLr + "Y", (Keyframe[]) this.mj.toArray(new Keyframe[0]));
        this.di.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorDi = di();
        if (typeEvaluatorDi != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorDi);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorDi);
        }
        return this.di;
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr.ri
    public void lr() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i = AnonymousClass1.ri[this.ka.ordinal()];
        if (i == 1) {
            keyframeOfFloat = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xha.vr());
            keyframeOfFloat2 = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xha.slm());
        } else if (i != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xha.bu());
            keyframeOfFloat2 = Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.xha.nr());
        }
        if (keyframeOfFloat != null) {
            this.fi.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.mj.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr.ri
    public void ri(float f, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float fOptDouble = (float) jSONArray.optDouble(0);
            float fOptDouble2 = (float) jSONArray.optDouble(1);
            if (this.ka == fi.TRANSLATE) {
                fOptDouble = mj.ri(this.ri, fOptDouble);
                fOptDouble2 = mj.ri(this.ri, fOptDouble2);
            }
            this.fi.add(Keyframe.ofFloat(f, fOptDouble));
            this.mj.add(Keyframe.ofFloat(f, fOptDouble2));
        } catch (JSONException unused) {
        }
    }
}
