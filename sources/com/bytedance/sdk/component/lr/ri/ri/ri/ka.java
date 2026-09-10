package com.bytedance.sdk.component.lr.ri.ri.ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.sf;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends sf {
    public ri jbs;
    public di mj;

    public ka(sf.ri riVar) {
        super(riVar);
        di diVar = new di();
        this.mj = diVar;
        this.jbs = new ri(diVar.lr());
    }

    @Override // com.bytedance.sdk.component.lr.ri.sf
    public com.bytedance.sdk.component.lr.ri.ka ri() {
        return this.mj;
    }

    @Override // com.bytedance.sdk.component.lr.ri.sf
    public com.bytedance.sdk.component.lr.ri.lr ri(co coVar) {
        coVar.ri(this);
        if (coVar.ka() == null || coVar.ka().ri() == null || TextUtils.isEmpty(coVar.ka().ri().toString())) {
            return null;
        }
        if (ri.ri == null || !ri.ri.lr() || !this.jbs.fi() || "setting".equals(coVar.mj())) {
            lr lrVar = new lr(coVar, this.mj);
            this.mj.ik().add(lrVar);
            return lrVar;
        }
        lr lrVar2 = new lr(coVar, this.jbs);
        this.jbs.ik().add(lrVar2);
        return lrVar2;
    }
}
