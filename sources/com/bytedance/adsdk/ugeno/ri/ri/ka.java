package com.bytedance.adsdk.ugeno.ri.ri;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends ri {
    private static final float bgr;
    private static final float bu;
    private static final float slm;
    private static final float vr;
    private Path aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18029co;
    private com.bytedance.adsdk.ugeno.xha.ri.C0197ri di;
    private Path fi;
    private int ik;
    private float jbs;
    private Paint ka;
    private int mj;
    private float nr;
    private int qt;
    private int sf;
    private int xha;

    static {
        float radians = (float) Math.toRadians(30.0d);
        bgr = radians;
        vr = (float) Math.tan(radians);
        slm = (float) Math.cos(radians);
        bu = (float) Math.sin(radians);
    }

    public ka(com.bytedance.adsdk.ugeno.lr.ik ikVar, JSONObject jSONObject) {
        super(ikVar, jSONObject);
        this.f18029co = true;
        Paint paint = new Paint();
        this.ka = paint;
        paint.setAntiAlias(true);
        this.fi = new Path();
        this.jbs = this.lr.wjv();
        this.aw = new Path();
    }

    private void ik(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.lr.fe() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i = this.qt;
                float f = vr;
                float fFe = (i + (i * f)) * this.lr.fe();
                this.aw.reset();
                this.aw.moveTo(fFe, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int i2 = this.sf;
                float f2 = fFe - (i2 * f);
                this.aw.lineTo(f2, i2);
                this.aw.lineTo(f2 + this.ik, this.sf);
                this.aw.lineTo(this.ik + fFe, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.aw.close();
                float f3 = this.nr;
                float f4 = slm * f3;
                float f5 = f3 * bu;
                if (!this.f18029co || this.di == null) {
                    int i3 = this.mj;
                    linearGradient = new LinearGradient(fFe, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fFe + f4, f5, new int[]{i3, this.xha, i3}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fFe, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fFe + f4, f5, this.di.lr, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.ka.setShader(linearGradient);
                Path path = this.fi;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.aw, this.ka);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void lr() {
        this.ik = (int) mj.ri(this.lr.sf().getContext(), this.ri.optInt("shineWidth", 30));
        String strOptString = this.ri.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.di = com.bytedance.adsdk.ugeno.xha.ri.lr(str);
        } else {
            int iRi = com.bytedance.adsdk.ugeno.xha.ri.ri(str);
            this.xha = iRi;
            this.mj = com.bytedance.adsdk.ugeno.xha.ri.ri(iRi, 32);
            this.f18029co = false;
        }
        this.nr = slm * this.ik;
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void ri(Canvas canvas) {
        ik(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void ri(int i, int i2) {
        this.qt = i;
        this.sf = i2;
        try {
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
            Path path = this.fi;
            float f = this.jbs;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void lr(Canvas canvas) {
        ik(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public List<PropertyValuesHolder> ik() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ka(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
