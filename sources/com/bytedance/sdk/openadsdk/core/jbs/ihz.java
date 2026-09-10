package com.bytedance.sdk.openadsdk.core.jbs;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ihz extends com.bytedance.sdk.component.adexpress.lr.ri<ri> {
    private final com.bytedance.sdk.component.adexpress.lr.aw di;
    private com.bytedance.sdk.component.adexpress.lr.xha fi;
    private final View ik;
    private com.bytedance.sdk.component.adexpress.lr.ik ka;
    private ri lr;
    AtomicBoolean ri = new AtomicBoolean(false);

    public ihz(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.lr.aw awVar) {
        this.ik = view;
        this.di = awVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr() {
        if (this.ri.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.lr.ik ikVar = this.ka;
        if (ikVar == null || !ikVar.ri((ac) this.ik, 0)) {
            this.fi.ri(107, "backup false");
            return;
        }
        this.di.fi().di();
        ri riVar = (ri) this.ik.findViewWithTag("tt_express_backup_fl_tag_26");
        this.lr = riVar;
        if (riVar == null) {
            this.fi.ri(107, "backupview is null");
            return;
        }
        com.bytedance.sdk.component.adexpress.lr.bgr bgrVar = new com.bytedance.sdk.component.adexpress.lr.bgr();
        ri riVar2 = this.lr;
        float realHeight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float realWidth = riVar2 == null ? 0.0f : riVar2.getRealWidth();
        ri riVar3 = this.lr;
        if (riVar3 != null) {
            realHeight = riVar3.getRealHeight();
        }
        bgrVar.ri(true);
        bgrVar.ri(realWidth);
        bgrVar.lr(realHeight);
        this.fi.ri(this.lr, bgrVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ka
    public void ri(com.bytedance.sdk.component.adexpress.lr.xha xhaVar) {
        this.fi = xhaVar;
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ihz.1
            @Override // java.lang.Runnable
            public void run() {
                ihz.this.lr();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ka
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public ri fi() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ri
    public void ri(com.bytedance.sdk.component.adexpress.lr.ik ikVar) {
        this.ka = ikVar;
    }
}
