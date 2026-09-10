package com.bytedance.adsdk.ugeno.ri.ri;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends ri {
    private PorterDuffXfermode aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private Path f18028co;
    private float di;
    private Paint fi;
    private float ik;
    private boolean jbs;
    private float ka;
    private boolean mj;
    private Path qt;
    private Path sf;
    private String xha;

    public fi(com.bytedance.adsdk.ugeno.lr.ik ikVar, JSONObject jSONObject) {
        super(ikVar, jSONObject);
        this.mj = true;
        this.jbs = true;
        Paint paint = new Paint();
        this.fi = paint;
        paint.setAntiAlias(true);
        this.lr.sf().setLayerType(2, null);
        this.aw = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.qt = new Path();
        this.sf = new Path();
        this.f18028co = new Path();
        this.fi.setXfermode(this.aw);
    }

    private void ik(Canvas canvas) {
        if (this.lr.ta() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.fi.setXfermode(this.aw);
            canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ik, this.ka, this.fi);
            return;
        }
        int iTa = (int) (this.ik * this.lr.ta());
        int iTa2 = (int) (this.ka * this.lr.ta());
        this.fi.setXfermode(this.aw);
        String str = this.xha;
        str.getClass();
        switch (str) {
            case "bottom":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iTa2, this.ik, this.ka, this.fi);
                break;
            case "center":
                this.qt.reset();
                this.sf.reset();
                this.f18028co.reset();
                Path.Direction direction = Path.Direction.CW;
                this.qt.addCircle(this.ik / 2.0f, this.ka / 2.0f, iTa, direction);
                Path path = this.sf;
                float f = this.ik;
                path.addRect(f / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.ka, direction);
                Path path2 = this.sf;
                Path path3 = this.qt;
                Path.Op op = Path.Op.DIFFERENCE;
                path2.op(path3, op);
                this.f18028co.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ik / 2.0f, this.ka, direction);
                this.f18028co.op(this.qt, op);
                canvas.drawPath(this.sf, this.fi);
                canvas.drawPath(this.f18028co, this.fi);
                break;
            case "top":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ik, this.ka - iTa2, this.fi);
                break;
            case "left":
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ik - iTa, this.ka, this.fi);
                break;
            case "right":
                canvas.drawRect(iTa, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.ik, this.ka, this.fi);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void lr() {
        this.di = (float) this.ri.optDouble("start", 0.0d);
        this.xha = this.ri.optString("direction", TtmlNode.CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void ri(Canvas canvas) {
        ik(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void ri(int i, int i2) {
        if (i > 0 && this.mj) {
            this.ik = i;
            this.mj = false;
        }
        if (i2 <= 0 || !this.jbs) {
            return;
        }
        this.ka = i2;
        this.jbs = false;
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void lr(Canvas canvas) {
        ik(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public List<PropertyValuesHolder> ik() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ka(), this.di, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
