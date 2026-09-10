package com.bytedance.sdk.component.adexpress.lr;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class di implements qt {
    private aw ik;
    private ri lr;
    private Context ri;

    public di(Context context, aw awVar, ri riVar) {
        this.ri = context;
        this.lr = riVar;
        this.ik = awVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt
    public void ri() {
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt
    public boolean ri(final qt.ri riVar) {
        this.ik.fi().xha(0);
        this.lr.ri(new xha() { // from class: com.bytedance.sdk.component.adexpress.lr.di.1
            @Override // com.bytedance.sdk.component.adexpress.lr.xha
            public void ri(View view, bgr bgrVar) {
                if (riVar.ik()) {
                    return;
                }
                vr vrVarLr = riVar.lr();
                if (vrVarLr != null) {
                    vrVarLr.ri(di.this.lr, bgrVar);
                }
                riVar.ri(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.lr.xha
            public void ri(int i, String str) {
                vr vrVarLr = riVar.lr();
                if (vrVarLr != null) {
                    vrVarLr.a_(i);
                }
            }
        });
        return true;
    }

    public void ri(ik ikVar) {
        this.lr.ri(ikVar);
    }
}
