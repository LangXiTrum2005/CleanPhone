package com.bytedance.adsdk.ugeno.Lxb.LD;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ebl.OY;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class ZU extends Lxb {
    private List<Keyframe> OY;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.Lxb.LD.ZU$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ugeno.Lxb.ZU.values().length];
            Lxb = iArr;
            try {
                iArr[com.bytedance.adsdk.ugeno.Lxb.ZU.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[com.bytedance.adsdk.ugeno.Lxb.ZU.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ZU(Context context, com.bytedance.adsdk.ugeno.LD.lk lkVar, String str, Map<Float, String> map) {
        super(context, lkVar, str, map);
        this.OY = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.LD.Lxb
    public List<PropertyValuesHolder> JXs() {
        String strLD = this.ZU.LD();
        ZU();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strLD + "X", (Keyframe[]) this.JXs.toArray(new Keyframe[0]));
        this.lc.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strLD + "Y", (Keyframe[]) this.OY.toArray(new Keyframe[0]));
        this.lc.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorLc = lc();
        if (typeEvaluatorLc != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorLc);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorLc);
        }
        return this.lc;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.LD.Lxb
    public void LD() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i = AnonymousClass1.Lxb[this.ZU.ordinal()];
        if (i == 1) {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.ebl.sLN());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.ebl.NXR());
        } else if (i != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.ebl.STP());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.ebl.IeN());
        }
        if (keyframeOfFloat != null) {
            this.JXs.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.OY.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.LD.Lxb
    public void Lxb(float f, String str) {
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
            if (this.ZU == com.bytedance.adsdk.ugeno.Lxb.ZU.TRANSLATE) {
                fOptDouble = OY.Lxb(this.Lxb, fOptDouble);
                fOptDouble2 = OY.Lxb(this.Lxb, fOptDouble2);
            }
            this.JXs.add(Keyframe.ofFloat(f, fOptDouble));
            this.OY.add(Keyframe.ofFloat(f, fOptDouble2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.LD.Lxb
    public TypeEvaluator lc() {
        return new FloatEvaluator();
    }
}
