package com.bytedance.adsdk.ugeno.Lxb.LD;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.ebl.OY;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class LD extends Lxb {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.Lxb.LD.LD$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ugeno.Lxb.ZU.values().length];
            Lxb = iArr;
            try {
                iArr[com.bytedance.adsdk.ugeno.Lxb.ZU.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[com.bytedance.adsdk.ugeno.Lxb.ZU.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Lxb[com.bytedance.adsdk.ugeno.Lxb.ZU.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Lxb[com.bytedance.adsdk.ugeno.Lxb.ZU.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Lxb[com.bytedance.adsdk.ugeno.Lxb.ZU.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Lxb[com.bytedance.adsdk.ugeno.Lxb.ZU.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Lxb[com.bytedance.adsdk.ugeno.Lxb.ZU.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Lxb[com.bytedance.adsdk.ugeno.Lxb.ZU.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Lxb[com.bytedance.adsdk.ugeno.Lxb.ZU.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public LD(Context context, com.bytedance.adsdk.ugeno.LD.lk lkVar, String str, TreeMap<Float, String> treeMap) {
        super(context, lkVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.LD.Lxb
    public void LD() {
        float fSLN;
        switch (AnonymousClass1.Lxb[this.ZU.ordinal()]) {
            case 1:
                fSLN = this.ebl.sLN();
                break;
            case 2:
                fSLN = this.ebl.NXR();
                break;
            case 3:
                fSLN = this.ebl.STP();
                break;
            case 4:
                fSLN = this.ebl.IeN();
                break;
            case 5:
                fSLN = this.ebl.VVE();
                break;
            case 6:
                fSLN = this.ebl.kqm();
                break;
            case 7:
                fSLN = this.ebl.brP();
                break;
            case 8:
                fSLN = this.ebl.tD();
                break;
            case 9:
                fSLN = this.ebl.DY();
                break;
            default:
                fSLN = 0.0f;
                break;
        }
        this.JXs.add(Keyframe.ofFloat(0.0f, fSLN));
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.LD.Lxb
    public void Lxb(float f, String str) {
        this.JXs.add(Keyframe.ofFloat(f, (this.LD.startsWith(com.bytedance.adsdk.ugeno.Lxb.ZU.TRANSLATE.Lxb()) || this.ZU == com.bytedance.adsdk.ugeno.Lxb.ZU.BORDER_RADIUS) ? OY.Lxb(this.Lxb, com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str, 0.0f)) : com.bytedance.adsdk.ugeno.ebl.lk.Lxb(str, 0.0f)));
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.LD.Lxb
    public TypeEvaluator lc() {
        return new FloatEvaluator();
    }
}
