package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ebl {
    private int JXs;
    private Lxb LD;
    Paint Lxb;
    private View ZU;
    private String ebl;
    private int lc;
    private AnimatorSet lk = new AnimatorSet();

    public ebl(View view, Lxb lxb) {
        this.ZU = view;
        this.LD = lxb;
        Paint paint = new Paint();
        this.Lxb = paint;
        paint.setAntiAlias(true);
    }

    public void LD() {
        AnimatorSet animatorSet = this.lk;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void Lxb() {
        ArrayList arrayList = new ArrayList();
        List<Lxb.C0037Lxb> listLk = this.LD.lk();
        if (listLk == null || listLk.size() <= 0) {
            return;
        }
        for (Lxb.C0037Lxb c0037Lxb : listLk) {
            if (c0037Lxb != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0037Lxb.Lxb());
                if (TextUtils.equals(c0037Lxb.JXs(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0037Lxb.JXs(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0037Lxb.JXs());
                }
                objectAnimator.setStartDelay(c0037Lxb.ZU());
                objectAnimator.setTarget(this.ZU);
                if (TextUtils.equals(c0037Lxb.JXs(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setIntValues((int) c0037Lxb.lc(), (int) c0037Lxb.ebl());
                    c0037Lxb.lc();
                    c0037Lxb.ebl();
                } else {
                    objectAnimator.setFloatValues(c0037Lxb.lc(), c0037Lxb.ebl());
                }
                int iLD = (int) this.LD.LD();
                if (iLD != 0) {
                    objectAnimator.setRepeatCount(iLD);
                } else {
                    objectAnimator.setRepeatCount((int) c0037Lxb.LD());
                }
                if (TextUtils.equals(c0037Lxb.JXs(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String strLc = this.LD.lc();
                if (TextUtils.isEmpty(strLc)) {
                    strLc = c0037Lxb.lk();
                }
                if (TextUtils.equals(strLc, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0037Lxb.OY() != null && c0037Lxb.OY().length > 0) {
                    objectAnimator.setFloatValues(c0037Lxb.OY());
                }
                if (TextUtils.equals(c0037Lxb.JXs(), "rotationX")) {
                    this.ZU.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ebl.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ebl.this.ZU.setPivotX(ebl.this.ZU.getWidth() / 2.0f);
                            ebl.this.ZU.setPivotY(ebl.this.ZU.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0037Lxb.JXs(), "ripple")) {
                    this.ebl = c0037Lxb.nBu();
                }
                String strQAg = c0037Lxb.QAg();
                strQAg.getClass();
                switch (strQAg) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.LD.ZU() != 0) {
            this.lk.setDuration(this.LD.ZU());
        }
        this.lk.setStartDelay(this.LD.JXs());
        if (TextUtils.equals(this.LD.Lxb(), "sequentially")) {
            this.lk.playSequentially(arrayList);
        } else {
            this.lk.playTogether(arrayList);
        }
        this.lk.start();
    }

    public void Lxb(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.ebl)) {
                return;
            }
            this.Lxb.setColor(com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(this.ebl));
            this.Lxb.setAlpha(90);
            ((ViewGroup) this.ZU.getParent()).setClipChildren(true);
            int i = this.JXs;
            int i2 = this.lc;
            canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * iAnimation.getRipple(), this.Lxb);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void Lxb(int i, int i2) {
        this.JXs = i / 2;
        this.lc = i2 / 2;
    }
}
