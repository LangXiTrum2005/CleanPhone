package com.bytedance.adsdk.ugeno.Lxb.Lxb;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lk extends Lxb {
    private Matrix JVA;
    private float JXs;
    private Paint OY;
    private PorterDuffXfermode QAg;
    private float ZU;
    private Paint ebl;
    private View lc;
    private String lk;
    private LinearGradient nBu;

    public lk(com.bytedance.adsdk.ugeno.LD.lk lkVar, JSONObject jSONObject) {
        super(lkVar, jSONObject);
        this.lc = this.LD.QAg();
        Paint paint = new Paint();
        this.ebl = paint;
        paint.setAntiAlias(true);
        this.lc.setLayerType(2, null);
        this.QAg = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.OY = new Paint();
        this.JVA = new Matrix();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public void LD() {
        this.lk = this.Lxb.optString("direction", TtmlNode.LEFT);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public void Lxb(Canvas canvas) {
        byte b;
        try {
            if (this.LD.VU() > 0.0f) {
                int iVU = (int) (this.ZU * this.LD.VU());
                int iVU2 = (int) (this.JXs * this.LD.VU());
                this.ebl.setXfermode(this.QAg);
                String str = this.lk;
                switch (str.hashCode()) {
                    case -1383228885:
                        if (!str.equals("bottom")) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case 115029:
                        if (!str.equals("top")) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case 3317767:
                        if (!str.equals(TtmlNode.LEFT)) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 108511772:
                        if (!str.equals(TtmlNode.RIGHT)) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    float f = iVU;
                    canvas.drawRect(f, 0.0f, this.ZU, this.JXs, this.ebl);
                    this.JVA.setTranslate(f, this.JXs);
                    this.nBu.setLocalMatrix(this.JVA);
                    this.OY.setShader(this.nBu);
                    if (this.LD.VU() <= 1.0f && this.LD.VU() > 0.9f) {
                        this.OY.setAlpha((int) (255.0f - (this.LD.VU() * 255.0f)));
                    }
                    canvas.drawRect(0.0f, 0.0f, f, this.JXs, this.OY);
                    return;
                }
                if (b == 1) {
                    float f2 = iVU;
                    canvas.drawRect(0.0f, 0.0f, this.ZU - f2, this.JXs, this.ebl);
                    this.JVA.setTranslate(this.ZU - f2, 0.0f);
                    this.nBu.setLocalMatrix(this.JVA);
                    this.OY.setShader(this.nBu);
                    if (this.LD.VU() <= 1.0f && this.LD.VU() > 0.9f) {
                        this.OY.setAlpha((int) (255.0f - (this.LD.VU() * 255.0f)));
                    }
                    float f3 = this.ZU;
                    canvas.drawRect(f3, this.JXs, f3 - f2, 0.0f, this.OY);
                    return;
                }
                if (b == 2) {
                    float f4 = iVU2;
                    canvas.drawRect(0.0f, f4, this.ZU, this.JXs, this.ebl);
                    this.JVA.setTranslate(0.0f, f4);
                    this.nBu.setLocalMatrix(this.JVA);
                    this.OY.setShader(this.nBu);
                    if (this.LD.VU() <= 1.0f && this.LD.VU() > 0.9f) {
                        this.OY.setAlpha((int) (255.0f - (this.LD.VU() * 255.0f)));
                    }
                    canvas.drawRect(0.0f, 0.0f, this.ZU, f4, this.OY);
                    return;
                }
                if (b != 3) {
                    return;
                }
                float f5 = iVU2;
                canvas.drawRect(0.0f, 0.0f, this.ZU, this.JXs - f5, this.ebl);
                this.JVA.setTranslate(0.0f, this.JXs - f5);
                this.nBu.setLocalMatrix(this.JVA);
                this.OY.setShader(this.nBu);
                if (this.LD.VU() <= 1.0f && this.LD.VU() > 0.9f) {
                    this.OY.setAlpha((int) (255.0f - (this.LD.VU() * 255.0f)));
                }
                float f6 = this.ZU;
                float f7 = this.JXs;
                canvas.drawRect(f6, f7, 0.0f, f7 - f5, this.OY);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public List<PropertyValuesHolder> lk() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.Lxb.ZU.ALPHA.LD(), 0.0f, 1.0f));
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public void Lxb(int i, int i2) {
        this.ZU = i;
        this.JXs = i2;
        String str = this.lk;
        str.getClass();
        switch (str) {
            case "bottom":
                this.nBu = new LinearGradient(0.0f, -this.JXs, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.nBu = new LinearGradient(0.0f, this.JXs, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.nBu = new LinearGradient(this.ZU, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.nBu = new LinearGradient(-this.ZU, 0.0f, 0.0f, this.JXs, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }
}
