package com.bytedance.sdk.openadsdk.core.rq.mo;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.mml.exu;
import com.bytedance.adsdk.ugeno.mml.rq;

/* JADX INFO: loaded from: classes3.dex */
public class lnr implements exu {
    @Override // com.bytedance.adsdk.ugeno.mml.exu
    public boolean qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, MotionEvent motionEvent, rq rqVar, com.bytedance.adsdk.ugeno.mml.mml.lnr lnrVar2) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            if (qdl(lnrVar.rq(), motionEvent.getX(), motionEvent.getY()) && rqVar != null) {
                rqVar.qdl(lnrVar, lnrVar2.mml(), lnrVar2.mo().ud());
            }
        }
        return true;
    }

    private boolean qdl(View view, float f, float f2) {
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }
}
