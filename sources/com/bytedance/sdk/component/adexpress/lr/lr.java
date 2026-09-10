package com.bytedance.sdk.component.adexpress.lr;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements qt {
    private int di;
    private aw fi;
    private ThemeStatusBroadcastReceiver ik;
    private mj ka;
    private com.bytedance.sdk.component.adexpress.dynamic.ri.ri lr;
    private Context ri;

    public lr(Context context, aw awVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.fi.mj mjVar, mj mjVar2, com.bytedance.sdk.component.adexpress.dynamic.di.ri riVar, com.bytedance.sdk.component.adexpress.dynamic.ri.ri riVar2) {
        this.ri = context;
        this.fi = awVar;
        this.ik = themeStatusBroadcastReceiver;
        this.ka = mjVar2;
        if (riVar2 != null) {
            this.lr = riVar2;
        } else {
            this.lr = new com.bytedance.sdk.component.adexpress.dynamic.ri.ri(context, themeStatusBroadcastReceiver, z, mjVar, awVar, riVar);
        }
        this.lr.ri(this.ka);
        if (mjVar instanceof com.bytedance.sdk.component.adexpress.dynamic.fi.xha) {
            this.di = 3;
        } else {
            this.di = 2;
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ka lr() {
        com.bytedance.sdk.component.adexpress.dynamic.ri.ri riVar = this.lr;
        if (riVar != null) {
            return riVar.ka();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt
    public boolean ri(final qt.ri riVar) {
        this.fi.fi().ri(this.di);
        this.lr.ri(new xha() { // from class: com.bytedance.sdk.component.adexpress.lr.lr.1
            @Override // com.bytedance.sdk.component.adexpress.lr.xha
            public void ri(View view, bgr bgrVar) {
                if (riVar.ik()) {
                    return;
                }
                lr.this.fi.fi().fi(lr.this.di);
                lr.this.fi.fi().di(lr.this.di);
                lr.this.fi.fi().jbs();
                vr vrVarLr = riVar.lr();
                if (vrVarLr == null) {
                    return;
                }
                vrVarLr.ri(lr.this.lr, bgrVar);
                riVar.ri(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.lr.xha
            public void ri(int i, String str) {
                lr.this.fi.fi().ri(lr.this.di, i, str, riVar.lr(lr.this));
                if (riVar.lr(lr.this)) {
                    riVar.ri(lr.this);
                    return;
                }
                vr vrVarLr = riVar.lr();
                if (vrVarLr == null) {
                    return;
                }
                vrVarLr.a_(i);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt
    public void ri() {
        com.bytedance.sdk.component.adexpress.dynamic.ri.ri riVar = this.lr;
        if (riVar != null) {
            riVar.lr();
        }
    }
}
