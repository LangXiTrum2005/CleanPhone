package com.bytedance.adsdk.ugeno.qdl.qdl;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lnr extends qdl {
    private Paint jpc;
    private String lnr;
    private float mml;
    private View mo;
    private float mzz;
    private Matrix rq;
    private LinearGradient to;
    private PorterDuffXfermode tvp;
    private Paint wd;

    public lnr(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, JSONObject jSONObject) {
        super(lnrVar, jSONObject);
        this.mo = this.ud.rq();
        Paint paint = new Paint();
        this.wd = paint;
        paint.setAntiAlias(true);
        this.mo.setLayerType(2, null);
        this.tvp = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.jpc = new Paint();
        this.rq = new Matrix();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void lnr(Canvas canvas) {
        byte b2;
        try {
            if (this.ud.irn() <= 0.0f) {
                this.wd.setXfermode(this.tvp);
                canvas.drawRect(0.0f, 0.0f, this.mml, this.mzz, this.wd);
                return;
            }
            int iIrn = (int) (this.mml * this.ud.irn());
            int iIrn2 = (int) (this.mzz * this.ud.irn());
            this.wd.setXfermode(this.tvp);
            String str = this.lnr;
            switch (str.hashCode()) {
                case -1383228885:
                    if (!str.equals("bottom")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 115029:
                    if (!str.equals("top")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 3317767:
                    if (!str.equals(TtmlNode.LEFT)) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 108511772:
                    if (!str.equals(TtmlNode.RIGHT)) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                float f = iIrn;
                canvas.drawRect(f, 0.0f, this.mml, this.mzz, this.wd);
                this.rq.setTranslate(f, this.mzz);
                this.to.setLocalMatrix(this.rq);
                this.jpc.setShader(this.to);
                if (this.ud.irn() <= 1.0f && this.ud.irn() > 0.9f) {
                    this.jpc.setAlpha((int) (255.0f - (this.ud.irn() * 255.0f)));
                }
                canvas.drawRect(0.0f, 0.0f, f, this.mzz, this.jpc);
                return;
            }
            if (b2 == 1) {
                float f2 = iIrn;
                canvas.drawRect(0.0f, 0.0f, this.mml - f2, this.mzz, this.wd);
                this.rq.setTranslate(this.mml - f2, 0.0f);
                this.to.setLocalMatrix(this.rq);
                this.jpc.setShader(this.to);
                if (this.ud.irn() <= 1.0f && this.ud.irn() > 0.9f) {
                    this.jpc.setAlpha((int) (255.0f - (this.ud.irn() * 255.0f)));
                }
                float f3 = this.mml;
                canvas.drawRect(f3, this.mzz, f3 - f2, 0.0f, this.jpc);
                return;
            }
            if (b2 == 2) {
                float f4 = iIrn2;
                canvas.drawRect(0.0f, f4, this.mml, this.mzz, this.wd);
                this.rq.setTranslate(0.0f, f4);
                this.to.setLocalMatrix(this.rq);
                this.jpc.setShader(this.to);
                if (this.ud.irn() <= 1.0f && this.ud.irn() > 0.9f) {
                    this.jpc.setAlpha((int) (255.0f - (this.ud.irn() * 255.0f)));
                }
                canvas.drawRect(0.0f, 0.0f, this.mml, f4, this.jpc);
                return;
            }
            if (b2 != 3) {
                return;
            }
            float f5 = iIrn2;
            canvas.drawRect(0.0f, 0.0f, this.mml, this.mzz - f5, this.wd);
            this.rq.setTranslate(0.0f, this.mzz - f5);
            this.to.setLocalMatrix(this.rq);
            this.jpc.setShader(this.to);
            if (this.ud.irn() <= 1.0f && this.ud.irn() > 0.9f) {
                this.jpc.setAlpha((int) (255.0f - (this.ud.irn() * 255.0f)));
            }
            float f6 = this.mml;
            float f7 = this.mzz;
            canvas.drawRect(f6, f7, 0.0f, f7 - f5, this.jpc);
        } catch (Throwable th) {
            Log.e("BaseEffectWrapper", th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void qdl(Canvas canvas) {
        lnr(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void ud() {
        this.lnr = this.qdl.optString("direction", TtmlNode.LEFT);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void qdl(int i2, int i3) {
        this.mml = i2;
        this.mzz = i3;
        String str = this.lnr;
        str.getClass();
        switch (str) {
            case "bottom":
                this.to = new LinearGradient(0.0f, -this.mzz, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.to = new LinearGradient(0.0f, this.mzz, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.to = new LinearGradient(this.mml, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.to = new LinearGradient(-this.mml, 0.0f, 0.0f, this.mzz, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void ud(Canvas canvas) {
        lnr(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public List<PropertyValuesHolder> lnr() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.qdl.mzz.ALPHA.ud(), 0.0f, 1.0f));
        return arrayList;
    }
}
