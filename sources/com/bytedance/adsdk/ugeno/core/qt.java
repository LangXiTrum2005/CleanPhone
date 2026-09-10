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
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    private int di;
    private int fi;
    private AnimatorSet ik = new AnimatorSet();
    private View ka;
    private ri lr;
    Paint ri;
    private String xha;

    public qt(View view, ri riVar) {
        this.ka = view;
        this.lr = riVar;
        Paint paint = new Paint();
        this.ri = paint;
        paint.setAntiAlias(true);
    }

    public void lr() {
        AnimatorSet animatorSet = this.ik;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void ri() {
        ArrayList arrayList = new ArrayList();
        List<ri.C0187ri> listIk = this.lr.ik();
        if (listIk == null || listIk.size() <= 0) {
            return;
        }
        for (ri.C0187ri c0187ri : listIk) {
            if (c0187ri != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0187ri.ri());
                if (TextUtils.equals(c0187ri.fi(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0187ri.fi(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0187ri.fi());
                }
                objectAnimator.setStartDelay(c0187ri.ka());
                objectAnimator.setTarget(this.ka);
                if (TextUtils.equals(c0187ri.fi(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setIntValues((int) c0187ri.di(), (int) c0187ri.xha());
                    c0187ri.di();
                    c0187ri.xha();
                } else {
                    objectAnimator.setFloatValues(c0187ri.di(), c0187ri.xha());
                }
                int iLr = (int) this.lr.lr();
                if (iLr != 0) {
                    objectAnimator.setRepeatCount(iLr);
                } else {
                    objectAnimator.setRepeatCount((int) c0187ri.lr());
                }
                if (TextUtils.equals(c0187ri.fi(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String strDi = this.lr.di();
                if (TextUtils.isEmpty(strDi)) {
                    strDi = c0187ri.ik();
                }
                if (TextUtils.equals(strDi, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0187ri.mj() != null && c0187ri.mj().length > 0) {
                    objectAnimator.setFloatValues(c0187ri.mj());
                }
                if (TextUtils.equals(c0187ri.fi(), "rotationX")) {
                    this.ka.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.qt.1
                        @Override // java.lang.Runnable
                        public void run() {
                            qt.this.ka.setPivotX(qt.this.ka.getWidth() / 2.0f);
                            qt.this.ka.setPivotY(qt.this.ka.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0187ri.fi(), "ripple")) {
                    this.xha = c0187ri.qt();
                }
                String strJbs = c0187ri.jbs();
                strJbs.getClass();
                switch (strJbs) {
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
        if (this.lr.ka() != 0) {
            this.ik.setDuration(this.lr.ka());
        }
        this.ik.setStartDelay(this.lr.fi());
        if (TextUtils.equals(this.lr.ri(), "sequentially")) {
            this.ik.playSequentially(arrayList);
        } else {
            this.ik.playTogether(arrayList);
        }
        this.ik.start();
    }

    public void ri(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || TextUtils.isEmpty(this.xha)) {
                return;
            }
            this.ri.setColor(com.bytedance.adsdk.ugeno.xha.ri.ri(this.xha));
            this.ri.setAlpha(90);
            ((ViewGroup) this.ka.getParent()).setClipChildren(true);
            int i = this.fi;
            int i2 = this.di;
            canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * iAnimation.getRipple(), this.ri);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void ri(int i, int i2) {
        this.fi = i / 2;
        this.di = i2 / 2;
    }
}
