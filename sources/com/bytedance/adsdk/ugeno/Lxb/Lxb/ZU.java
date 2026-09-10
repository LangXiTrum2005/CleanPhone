package com.bytedance.adsdk.ugeno.Lxb.Lxb;

import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ebl.OY;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ZU extends Lxb {
    private static final float IeN;
    private static final float STP;
    private static final float VVE;
    private static final float kqm;
    private int JVA;
    private Path JXs;
    private Path NXR;
    private int OY;
    private float QAg;
    private Paint ZU;
    private float brP;
    private int ebl;
    private com.bytedance.adsdk.ugeno.ebl.Lxb.C0039Lxb lc;
    private int lk;
    private int nBu;
    private boolean sLN;

    static {
        float radians = (float) Math.toRadians(30.0d);
        STP = radians;
        IeN = (float) Math.tan(radians);
        VVE = (float) Math.cos(radians);
        kqm = (float) Math.sin(radians);
    }

    public ZU(com.bytedance.adsdk.ugeno.LD.lk lkVar, JSONObject jSONObject) {
        super(lkVar, jSONObject);
        this.sLN = true;
        Paint paint = new Paint();
        this.ZU = paint;
        paint.setAntiAlias(true);
        this.JXs = new Path();
        this.QAg = this.LD.DY();
        this.NXR = new Path();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public void LD() {
        this.lk = (int) OY.Lxb(this.LD.QAg().getContext(), this.Lxb.optInt("shineWidth", 30));
        String strOptString = this.Lxb.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.lc = com.bytedance.adsdk.ugeno.ebl.Lxb.LD(str);
        } else {
            int iLxb = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(str);
            this.ebl = iLxb;
            this.OY = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(iLxb, 32);
            this.sLN = false;
        }
        this.brP = VVE * this.lk;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    @SuppressLint({"DrawAllocation"})
    public void Lxb(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.LD.NDz() > 0.0f) {
                int i = this.nBu;
                float f = IeN;
                float fNDz = ((i * f) + i) * this.LD.NDz();
                this.NXR.reset();
                this.NXR.moveTo(fNDz, 0.0f);
                int i2 = this.JVA;
                float f2 = fNDz - (i2 * f);
                this.NXR.lineTo(f2, i2);
                this.NXR.lineTo(f2 + this.lk, this.JVA);
                this.NXR.lineTo(this.lk + fNDz, 0.0f);
                this.NXR.close();
                float f3 = this.brP;
                float f4 = VVE * f3;
                float f5 = f3 * kqm;
                if (!this.sLN || this.lc == null) {
                    float f6 = fNDz + f4;
                    int i3 = this.OY;
                    linearGradient = new LinearGradient(fNDz, 0.0f, f6, f5, new int[]{i3, this.ebl, i3}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fNDz, 0.0f, fNDz + f4, f5, this.lc.LD, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.ZU.setShader(linearGradient);
                Path path = this.JXs;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.NXR, this.ZU);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public List<PropertyValuesHolder> lk() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ZU(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.Lxb.Lxb
    public void Lxb(int i, int i2) {
        this.nBu = i;
        this.JVA = i2;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            Path path = this.JXs;
            float f = this.QAg;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }
}
