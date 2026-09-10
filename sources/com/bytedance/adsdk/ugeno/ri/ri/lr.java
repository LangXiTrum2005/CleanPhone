package com.bytedance.adsdk.ugeno.ri.ri;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ri {
    private Paint di;
    private int fi;
    private int ik;
    private int ka;

    public lr(com.bytedance.adsdk.ugeno.lr.ik ikVar, JSONObject jSONObject) {
        super(ikVar, jSONObject);
        Paint paint = new Paint();
        this.di = paint;
        paint.setAntiAlias(true);
    }

    private void ik(Canvas canvas) {
        try {
            if (this.lr.tnn() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.di.setColor(this.ik);
                this.di.setAlpha((int) ((1.0f - this.lr.tnn()) * 255.0f));
                ((ViewGroup) this.lr.sf().getParent()).setClipChildren(true);
                int i = this.ka;
                int i2 = this.fi;
                canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * this.lr.tnn(), this.di);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public void lr() {
        this.ik = com.bytedance.adsdk.ugeno.xha.ri.ri(this.ri.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), -1);
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
        this.ka = i / 2;
        this.fi = i2 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.ri.ri.ri
    public List<PropertyValuesHolder> ik() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(ka(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }
}
