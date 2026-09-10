package com.bytedance.adsdk.ugeno.qdl.qdl;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.wd.jpc;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mml extends qdl {
    private static final float bjy;
    private static final float jtx;
    private static final float rdp;
    private static final float yt;
    private Path exu;
    private boolean fs;
    private float jl;
    private int jpc;
    private int lnr;
    private Paint mml;
    private com.bytedance.adsdk.ugeno.wd.qdl.C0071qdl mo;
    private Path mzz;
    private int rq;
    private int to;
    private float tvp;
    private int wd;

    static {
        float radians = (float) Math.toRadians(30.0d);
        rdp = radians;
        bjy = (float) Math.tan(radians);
        jtx = (float) Math.cos(radians);
        yt = (float) Math.sin(radians);
    }

    public mml(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, JSONObject jSONObject) {
        super(lnrVar, jSONObject);
        this.fs = true;
        Paint paint = new Paint();
        this.mml = paint;
        paint.setAntiAlias(true);
        this.mzz = new Path();
        this.tvp = this.ud.ljh();
        this.exu = new Path();
    }

    private void lnr(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.ud.wak() > 0.0f) {
                int i2 = this.to;
                float f = bjy;
                float fWak = ((i2 * f) + i2) * this.ud.wak();
                this.exu.reset();
                this.exu.moveTo(fWak, 0.0f);
                int i3 = this.rq;
                float f2 = fWak - (i3 * f);
                this.exu.lineTo(f2, i3);
                this.exu.lineTo(f2 + this.lnr, this.rq);
                this.exu.lineTo(this.lnr + fWak, 0.0f);
                this.exu.close();
                float f3 = this.jl;
                float f4 = jtx * f3;
                float f5 = f3 * yt;
                if (!this.fs || this.mo == null) {
                    int i4 = this.jpc;
                    linearGradient = new LinearGradient(fWak, 0.0f, fWak + f4, f5, new int[]{i4, this.wd, i4}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fWak, 0.0f, fWak + f4, f5, this.mo.ud, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.mml.setShader(linearGradient);
                Path path = this.mzz;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.exu, this.mml);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void qdl(Canvas canvas) {
        lnr(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void ud() {
        this.lnr = (int) jpc.qdl(this.ud.rq().getContext(), this.qdl.optInt("shineWidth", 30));
        String strOptString = this.qdl.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.mo = com.bytedance.adsdk.ugeno.wd.qdl.ud(str);
        } else {
            int iQdl = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str);
            this.wd = iQdl;
            this.jpc = com.bytedance.adsdk.ugeno.wd.qdl.qdl(iQdl, 32);
            this.fs = false;
        }
        this.jl = jtx * this.lnr;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void qdl(int i2, int i3) {
        this.to = i2;
        this.rq = i3;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i2, i3);
            Path path = this.mzz;
            float f = this.tvp;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void ud(Canvas canvas) {
        lnr(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public List<PropertyValuesHolder> lnr() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(mml(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
