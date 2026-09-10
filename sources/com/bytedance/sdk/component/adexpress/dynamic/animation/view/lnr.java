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
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rq;
import com.bytedance.sdk.component.adexpress.dynamic.mml.wd;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    private int mml;
    private int mo;
    private int mzz;
    Paint qdl;
    Path ud = new Path();
    Path lnr = new Path();

    public lnr() {
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setAntiAlias(true);
    }

    public void qdl(Canvas canvas, IAnimation iAnimation, View view) {
        int iIntValue;
        String str;
        float[] fArrUd;
        int iIntValue2 = 0;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArrUd = wd.ud(str);
                    } catch (Exception unused) {
                        fArrUd = null;
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (str.startsWith("#")) {
                    this.qdl.setColor(Color.parseColor(str));
                    this.qdl.setAlpha(90);
                } else if (fArrUd != null) {
                    this.qdl.setColor(com.bytedance.sdk.component.adexpress.mml.wd.qdl((1.0f - iAnimation.getRippleValue()) * fArrUd[3], fArrUd[0] / 256.0f, fArrUd[1] / 256.0f, fArrUd[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            int i2 = this.mml;
            int i3 = this.mzz;
            canvas.drawCircle(i2, i3, iAnimation.getRippleValue() * Math.min(i2, i3) * 2, this.qdl);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.ud.reset();
            try {
                iIntValue = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                int shineValue = ((int) (iAnimation.getShineValue() * ((this.mzz * 2) + ((iIntValue * 2) + (this.mml * 4))))) - ((this.mzz * 2) + iIntValue);
                float f = shineValue;
                int i4 = this.mzz;
                this.qdl.setShader(new LinearGradient(f, 0.0f, ((iIntValue + i4) / 2) + shineValue, i4 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.qdl.setStrokeWidth(this.mml * 2);
                Path path = this.lnr;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i5 = shineValue + iIntValue;
                int i6 = this.mzz;
                canvas.drawLine(f, 0.0f, i5 + i6, i6, this.qdl);
            }
        }
        if (iAnimation.getMarqueeValue() != 0.0f) {
            try {
                iIntValue2 = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
            }
            if (iIntValue2 >= 0) {
                this.ud.reset();
                this.ud.moveTo(0.0f, 0.0f);
                this.ud.lineTo(this.mml * 2, 0.0f);
                this.ud.lineTo(this.mml * 2, this.mzz * 2);
                this.ud.lineTo(0.0f, this.mzz * 2);
                this.ud.lineTo(0.0f, 0.0f);
                this.qdl.setShader(new LinearGradient(0.0f, 0.0f, this.mml * 2, this.mzz * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.qdl.setColor(-65536);
                this.qdl.setStyle(Paint.Style.STROKE);
                this.qdl.setStrokeWidth(iIntValue2);
                canvas.drawPath(this.ud, this.qdl);
            }
        }
    }

    public void qdl(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = this.mo;
        int i3 = (int) (i2 * f);
        layoutParams.width = i3;
        view.setTranslationX((i2 - i3) / 2);
        if (view instanceof rq) {
            int i4 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i4 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i4).setTranslationX((-(this.mo - layoutParams.width)) / 2);
                i4++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void qdl(View view, int i2, int i3) {
        String str;
        this.mml = i2 / 2;
        this.mzz = i3 / 2;
        if (this.mo == 0 && view.getLayoutParams().width > 0) {
            this.mo = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.lnr.addRoundRect(new RectF(0.0f, 0.0f, i2, i3), i3 / 2, i3 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if (TtmlNode.RIGHT.equals(str)) {
            view.setPivotX(this.mml * 2);
            view.setPivotY(this.mzz);
        } else if (TtmlNode.LEFT.equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.mzz);
        } else {
            view.setPivotX(this.mml);
            view.setPivotY(this.mzz);
        }
    }
}
