package com.bytedance.adsdk.ugeno.qdl.qdl;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ud extends qdl {
    private int lnr;
    private int mml;
    private Paint mo;
    private int mzz;

    public ud(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, JSONObject jSONObject) {
        super(lnrVar, jSONObject);
        Paint paint = new Paint();
        this.mo = paint;
        paint.setAntiAlias(true);
    }

    private void lnr(Canvas canvas) {
        try {
            if (this.ud.yh() > 0.0f) {
                this.mo.setColor(this.lnr);
                this.mo.setAlpha((int) ((1.0f - this.ud.yh()) * 255.0f));
                ((ViewGroup) this.ud.rq().getParent()).setClipChildren(true);
                int i2 = this.mml;
                int i3 = this.mzz;
                canvas.drawCircle(i2, i3, Math.min(i2, i3) * 2 * this.ud.yh(), this.mo);
            }
        } catch (Throwable th) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void qdl(Canvas canvas) {
        lnr(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void ud() {
        this.lnr = com.bytedance.adsdk.ugeno.wd.qdl.qdl(this.qdl.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), -1);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.qdl.qdl
    public void qdl(int i2, int i3) {
        this.mml = i2 / 2;
        this.mzz = i3 / 2;
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
