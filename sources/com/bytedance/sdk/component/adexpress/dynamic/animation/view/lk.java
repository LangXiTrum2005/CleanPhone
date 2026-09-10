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
import androidx.core.internal.view.SupportMenu;
import com.bytedance.sdk.component.adexpress.ZU.OY;
import com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JVA;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private int JXs;
    Paint Lxb;
    private int ZU;
    private int lc;
    Path LD = new Path();
    Path lk = new Path();

    public lk() {
        Paint paint = new Paint();
        this.Lxb = paint;
        paint.setAntiAlias(true);
    }

    public void Lxb(Canvas canvas, IAnimation iAnimation, View view) {
        int iIntValue;
        String str;
        float[] fArrLD;
        int iIntValue2 = 0;
        if (iAnimation.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArrLD = ebl.LD(str);
                    } catch (Exception unused) {
                        fArrLD = null;
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (str.startsWith("#")) {
                    this.Lxb.setColor(Color.parseColor(str));
                    this.Lxb.setAlpha(90);
                } else if (fArrLD != null) {
                    this.Lxb.setColor(OY.Lxb((1.0f - iAnimation.getRippleValue()) * fArrLD[3], fArrLD[0] / 256.0f, fArrLD[1] / 256.0f, fArrLD[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            int i = this.ZU;
            int i2 = this.JXs;
            canvas.drawCircle(i, i2, iAnimation.getRippleValue() * Math.min(i, i2) * 2, this.Lxb);
        }
        if (iAnimation.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.LD.reset();
            try {
                iIntValue = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                iIntValue = 0;
            }
            if (iIntValue >= 0) {
                int shineValue = ((int) (iAnimation.getShineValue() * ((this.JXs * 2) + ((iIntValue * 2) + (this.ZU * 4))))) - ((this.JXs * 2) + iIntValue);
                float f = shineValue;
                int i3 = this.JXs;
                this.Lxb.setShader(new LinearGradient(f, 0.0f, ((iIntValue + i3) / 2) + shineValue, i3 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.Lxb.setStrokeWidth(this.ZU * 2);
                Path path = this.lk;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i4 = shineValue + iIntValue;
                int i5 = this.JXs;
                canvas.drawLine(f, 0.0f, i4 + i5, i5, this.Lxb);
            }
        }
        if (iAnimation.getMarqueeValue() != 0.0f) {
            try {
                iIntValue2 = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
            }
            if (iIntValue2 >= 0) {
                this.LD.reset();
                this.LD.moveTo(0.0f, 0.0f);
                this.LD.lineTo(this.ZU * 2, 0.0f);
                this.LD.lineTo(this.ZU * 2, this.JXs * 2);
                this.LD.lineTo(0.0f, this.JXs * 2);
                this.LD.lineTo(0.0f, 0.0f);
                this.Lxb.setShader(new LinearGradient(0.0f, 0.0f, this.ZU * 2, this.JXs * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.Lxb.setColor(SupportMenu.CATEGORY_MASK);
                this.Lxb.setStyle(Paint.Style.STROKE);
                this.Lxb.setStrokeWidth(iIntValue2);
                canvas.drawPath(this.LD, this.Lxb);
            }
        }
    }

    public void Lxb(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.lc;
        int i2 = (int) (i * f);
        layoutParams.width = i2;
        view.setTranslationX((i - i2) / 2);
        if (view instanceof JVA) {
            int i3 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i3 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i3).setTranslationX((-(this.lc - layoutParams.width)) / 2);
                i3++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void Lxb(View view, int i, int i2) {
        String str;
        this.ZU = i / 2;
        this.JXs = i2 / 2;
        if (this.lc == 0 && view.getLayoutParams().width > 0) {
            this.lc = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.lk.addRoundRect(new RectF(0.0f, 0.0f, i, i2), i2 / 2, i2 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if (TtmlNode.RIGHT.equals(str)) {
            view.setPivotX(this.ZU * 2);
            view.setPivotY(this.JXs);
        } else if (TtmlNode.LEFT.equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.JXs);
        } else {
            view.setPivotX(this.ZU);
            view.setPivotY(this.JXs);
        }
    }
}
