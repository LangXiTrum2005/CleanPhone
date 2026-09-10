package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml {
    private final String lnr;
    private boolean mml;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl mzz;
    com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo qdl;
    private final ljh ud;

    public interface qdl {
        void qdl(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, int i2, int i3, int i4);

        void qdl(String str, JSONObject jSONObject);
    }

    public mml(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.mzz = qdlVar;
        this.ud = qdlVar.ud;
        this.lnr = qdlVar.mzz;
    }

    private void mml() {
        if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr() && this.ud.ygv() == 4) {
            this.qdl = com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(this.mzz.om, this.lnr);
        }
        if (this.qdl == null) {
            this.qdl = com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(this.mzz.ag, this.lnr);
        }
    }

    public com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo lnr() {
        return this.qdl;
    }

    public void qdl() {
        if (this.mml) {
            return;
        }
        this.mml = true;
        mml();
    }

    public void ud() {
        com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo moVar = this.qdl;
        if (moVar != null) {
            moVar.lnr(this.ud);
        }
    }

    public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, int i2, int i3, int i4, qdl qdlVar) {
        if (this.qdl != null) {
            int id = view.getId();
            if (id == com.bytedance.sdk.openadsdk.utils.jtx.mzz) {
                qdlVar.qdl("click_play_star_level", null);
                return;
            }
            if (id == com.bytedance.sdk.openadsdk.utils.jtx.mml) {
                qdlVar.qdl("click_play_star_nums", null);
                return;
            } else if (id == com.bytedance.sdk.openadsdk.utils.jtx.lnr) {
                qdlVar.qdl("click_play_source", null);
                return;
            } else {
                if (id == com.bytedance.sdk.openadsdk.utils.jtx.ud) {
                    qdlVar.qdl("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        qdlVar.qdl(view, f, f2, f3, f4, sparseArray, i2, i3, i4);
    }
}
