package com.bytedance.adsdk.ugeno.ri.ri;

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
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends ri {
    private View di;
    private float fi;
    private String ik;
    private PorterDuffXfermode jbs;
    private float ka;
    private Paint mj;
    private LinearGradient qt;
    private Matrix sf;
    private Paint xha;

    public ik(com.bytedance.adsdk.ugeno.lr.ik ikVar, JSONObject jSONObject) {
        super(ikVar, jSONObject);
        this.di = this.lr.sf();
        Paint paint = new Paint();
        this.xha = paint;
        paint.setAntiAlias(true);
        this.di.setLayerType(2, null);
        this.jbs = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.mj = new Paint();
        this.sf = new Matrix();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void ik(Canvas canvas) {
        try {
            if (this.lr.bnj() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.xha.setXfermode(this.jbs);
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ka, this.fi, this.xha);
                return;
            }
            int iBnj = (int) (this.ka * this.lr.bnj());
            int iBnj2 = (int) (this.fi * this.lr.bnj());
            this.xha.setXfermode(this.jbs);
            String str = this.ik;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        float f = iBnj2;
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.ka, this.fi, this.xha);
                        this.sf.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
                        this.qt.setLocalMatrix(this.sf);
                        this.mj.setShader(this.qt);
                        if (this.lr.bnj() <= 1.0f && this.lr.bnj() > 0.9f) {
                            this.mj.setAlpha((int) (255.0f - (this.lr.bnj() * 255.0f)));
                        }
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ka, f, this.mj);
                    }
                    break;
                case 115029:
                    if (str.equals("top")) {
                        float f2 = iBnj2;
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ka, this.fi - f2, this.xha);
                        this.sf.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fi - f2);
                        this.qt.setLocalMatrix(this.sf);
                        this.mj.setShader(this.qt);
                        if (this.lr.bnj() <= 1.0f && this.lr.bnj() > 0.9f) {
                            this.mj.setAlpha((int) (255.0f - (this.lr.bnj() * 255.0f)));
                        }
                        float f3 = this.ka;
                        float f4 = this.fi;
                        canvas.drawRect(f3, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4 - f2, this.mj);
                    }
                    break;
                case 3317767:
                    if (str.equals(TtmlNode.LEFT)) {
                        float f5 = iBnj;
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ka - f5, this.fi, this.xha);
                        this.sf.setTranslate(this.ka - f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        this.qt.setLocalMatrix(this.sf);
                        this.mj.setShader(this.qt);
                        if (this.lr.bnj() <= 1.0f && this.lr.bnj() > 0.9f) {
                            this.mj.setAlpha((int) (255.0f - (this.lr.bnj() * 255.0f)));
                        }
                        float f6 = this.ka;
                        canvas.drawRect(f6, this.fi, f6 - f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.mj);
                    }
                    break;
                case 108511772:
                    if (str.equals(TtmlNode.RIGHT)) {
                        float f7 = iBnj;
                        canvas.drawRect(f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ka, this.fi, this.xha);
                        this.sf.setTranslate(f7, this.fi);
                        this.qt.setLocalMatrix(this.sf);
                        this.mj.setShader(this.qt);
                        if (this.lr.bnj() <= 1.0f && this.lr.bnj() > 0.9f) {
                            this.mj.setAlpha((int) (255.0f - (this.lr.bnj() * 255.0f)));
                        }
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, this.fi, this.mj);
                    }
                    break;
                default:
                    break;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void lr() {
        this.ik = this.ri.optString("direction", TtmlNode.LEFT);
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void ri(Canvas canvas) {
        ik(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void lr(Canvas canvas) {
        ik(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void ri(int i, int i2) {
        this.ka = i;
        this.fi = i2;
        String str = this.ik;
        str.getClass();
        switch (str) {
            case "bottom":
                this.qt = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -this.fi, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.qt = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fi, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.qt = new LinearGradient(this.ka, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.qt = new LinearGradient(-this.ka, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.fi, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public List<PropertyValuesHolder> ik() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.ri.fi.ALPHA.lr(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        return arrayList;
    }
}
