package com.bytedance.sdk.component.lr.ri.ri.ri;

import com.bytedance.sdk.component.lr.ri.bgr;
import com.bytedance.sdk.component.lr.ri.co;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements com.bytedance.sdk.component.lr.ri.mj.ri {
    int ik = 0;
    co lr;
    List<com.bytedance.sdk.component.lr.ri.mj> ri;

    public ik(List<com.bytedance.sdk.component.lr.ri.mj> list, co coVar) {
        this.ri = list;
        this.lr = coVar;
    }

    @Override // com.bytedance.sdk.component.lr.ri.mj.ri
    public co ri() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.lr.ri.mj.ri
    public bgr ri(co coVar) throws IOException {
        this.lr = coVar;
        int i = this.ik + 1;
        this.ik = i;
        if (i >= this.ri.size()) {
            return null;
        }
        return this.ri.get(this.ik).ri(this);
    }
}
