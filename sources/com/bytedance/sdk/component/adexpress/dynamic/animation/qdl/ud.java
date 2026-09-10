package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hzv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ud implements hzv {
    List<mml> qdl = new ArrayList();

    public ud(View view, List<com.bytedance.sdk.component.adexpress.dynamic.mml.qdl> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.qdl> it = list.iterator();
        while (it.hasNext()) {
            mml mmlVarQdl = lnr.qdl().qdl(view, it.next());
            if (mmlVarQdl != null) {
                this.qdl.add(mmlVarQdl);
            }
        }
    }

    public void qdl() {
        Iterator<mml> it = this.qdl.iterator();
        while (it.hasNext()) {
            try {
                it.next().lnr();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hzv
    public void ud() {
        Iterator<mml> it = this.qdl.iterator();
        while (it.hasNext()) {
            try {
                it.next().ud();
            } catch (Exception unused) {
            }
        }
    }
}
