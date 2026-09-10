package com.bytedance.adsdk.ugeno.ri.lr;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.ri.fi;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.unity3d.services.UnityAdsConstants;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ri {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.lr.lr$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[fi.values().length];
            ri = iArr;
            try {
                iArr[fi.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[fi.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ri[fi.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ri[fi.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ri[fi.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ri[fi.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ri[fi.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ri[fi.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ri[fi.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public lr(Context context, com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, TreeMap<Float, String> treeMap) {
        super(context, ikVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr.ri
    public TypeEvaluator di() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr.ri
    public void lr() {
        float fVr;
        switch (AnonymousClass1.ri[this.ka.ordinal()]) {
            case 1:
                fVr = this.xha.vr();
                break;
            case 2:
                fVr = this.xha.slm();
                break;
            case 3:
                fVr = this.xha.bu();
                break;
            case 4:
                fVr = this.xha.nr();
                break;
            case 5:
                fVr = this.xha.tan();
                if (this.xha.sf() != null) {
                    this.xha.sf().setCameraDistance(10000.0f);
                }
                break;
            case 6:
                fVr = this.xha.ac();
                if (this.xha.sf() != null) {
                    this.xha.sf().setCameraDistance(10000.0f);
                }
                break;
            case 7:
                fVr = this.xha.ihz();
                break;
            case 8:
                fVr = this.xha.uq();
                break;
            case 9:
                fVr = this.xha.wjv();
                break;
            default:
                fVr = 0.0f;
                break;
        }
        this.fi.add(Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fVr));
    }

    @Override // com.bytedance.adsdk.ugeno.ri.lr.ri
    public void ri(float f, String str) {
        this.fi.add(Keyframe.ofFloat(f, (this.lr.startsWith(fi.TRANSLATE.ri()) || this.ka == fi.BORDER_RADIUS) ? mj.ri(this.ri, com.bytedance.adsdk.ugeno.xha.ik.ri(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) : com.bytedance.adsdk.ugeno.xha.ik.ri(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
    }
}
