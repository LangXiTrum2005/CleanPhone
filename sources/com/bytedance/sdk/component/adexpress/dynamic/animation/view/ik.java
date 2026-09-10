package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sf;
import com.bytedance.sdk.component.adexpress.dynamic.ka.xha;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private int di;
    private int fi;
    private int ka;
    Paint ri;
    Path lr = new Path();
    Path ik = new Path();

    public ik() {
        Paint paint = new Paint();
        this.ri = paint;
        paint.setAntiAlias(true);
    }

    public void ri(Canvas canvas, IAnimation iAnimation, View view) {
        int iIntValue;
        String str;
        float[] fArrLr;
        int iIntValue2 = 0;
        if (iAnimation.getRippleValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArrLr = xha.lr(str);
                    } catch (Exception unused) {
                        fArrLr = null;
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (str.startsWith("#")) {
                    this.ri.setColor(Color.parseColor(str));
                    this.ri.setAlpha(90);
                } else if (fArrLr != null) {
                    this.ri.setColor(com.bytedance.sdk.component.adexpress.ka.xha.ri(fArrLr[3] * (1.0f - iAnimation.getRippleValue()), fArrLr[0] / 256.0f, fArrLr[1] / 256.0f, fArrLr[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            int i = this.ka;
            int i2 = this.fi;
            canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * iAnimation.getRippleValue(), this.ri);
        }
        if (iAnimation.getShineValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.lr.reset();
            try {
                iIntValue = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                int shineValue = ((int) ((((this.ka * 4) + (iIntValue * 2)) + (this.fi * 2)) * iAnimation.getShineValue())) - ((this.fi * 2) + iIntValue);
                float f = shineValue;
                int i3 = this.fi;
                this.ri.setShader(new LinearGradient(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((iIntValue + i3) / 2) + shineValue, i3 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.ri.setStrokeWidth(this.ka * 2);
                Path path = this.ik;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i4 = shineValue + iIntValue;
                int i5 = this.fi;
                canvas.drawLine(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i4 + i5, i5, this.ri);
            }
        }
        if (iAnimation.getMarqueeValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            try {
                iIntValue2 = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
            }
            if (iIntValue2 >= 0) {
                this.lr.reset();
                this.lr.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.lr.lineTo(this.ka * 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.lr.lineTo(this.ka * 2, this.fi * 2);
                this.lr.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fi * 2);
                this.lr.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.ri.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ka * 2, this.fi * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.ri.setColor(Opcodes.V_PREVIEW);
                this.ri.setStyle(Paint.Style.STROKE);
                this.ri.setStrokeWidth(iIntValue2);
                canvas.drawPath(this.lr, this.ri);
            }
        }
    }

    public void ri(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.di;
        int i2 = (int) (i * f);
        layoutParams.width = i2;
        view.setTranslationX((i - i2) / 2);
        if (view instanceof sf) {
            int i3 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i3).setTranslationX((-(this.di - layoutParams.width)) / 2);
                i3++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void ri(View view, int i, int i2) {
        String str;
        this.ka = i / 2;
        this.fi = i2 / 2;
        if (this.di == 0 && view.getLayoutParams().width > 0) {
            this.di = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.ik.addRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2), i2 / 2, i2 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if (TtmlNode.RIGHT.equals(str)) {
            view.setPivotX(this.ka * 2);
            view.setPivotY(this.fi);
        } else if (TtmlNode.LEFT.equals(str)) {
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotY(this.fi);
        } else {
            view.setPivotX(this.ka);
            view.setPivotY(this.fi);
        }
    }
}
