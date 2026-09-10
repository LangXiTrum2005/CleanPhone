package com.bytedance.adsdk.ugeno.qdl.ud;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.qdl.mzz;
import com.bytedance.adsdk.ugeno.wd.jpc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class mml extends qdl {
    private List<Keyframe> jpc;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.qdl.ud.mml$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[mzz.values().length];
            qdl = iArr;
            try {
                iArr[mzz.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[mzz.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public mml(Context context, com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, Map<Float, String> map) {
        super(context, lnrVar, str, map);
        this.jpc = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.ud.qdl
    public TypeEvaluator mo() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.ud.qdl
    public List<PropertyValuesHolder> mzz() {
        String strUd = this.mml.ud();
        mml();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strUd + "X", (Keyframe[]) this.mzz.toArray(new Keyframe[0]));
        this.mo.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strUd + "Y", (Keyframe[]) this.jpc.toArray(new Keyframe[0]));
        this.mo.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorMo = mo();
        if (typeEvaluatorMo != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorMo);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorMo);
        }
        return this.mo;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.ud.qdl
    public void qdl(float f, String str) {
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
            if (this.mml == mzz.TRANSLATE) {
                fOptDouble = jpc.qdl(this.qdl, fOptDouble);
                fOptDouble2 = jpc.qdl(this.qdl, fOptDouble2);
            }
            this.mzz.add(Keyframe.ofFloat(f, fOptDouble));
            this.jpc.add(Keyframe.ofFloat(f, fOptDouble2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.ud.qdl
    public void ud() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i2 = AnonymousClass1.qdl[this.mml.ordinal()];
        if (i2 == 1) {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.wd.bjy());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.wd.jtx());
        } else if (i2 != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.wd.yt());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.wd.jl());
        }
        if (keyframeOfFloat != null) {
            this.mzz.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.jpc.add(keyframeOfFloat2);
        }
    }
}
