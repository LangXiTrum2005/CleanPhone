package com.thinkup.core.n;

import com.thinkup.core.common.n0.o0o;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.common.on.o0om;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 extends m {
    public o0(o0om o0omVar) {
        super(o0omVar);
    }

    @Override // com.thinkup.core.n.m
    public final void o(List<JSONObject> list, o0o o0oVar) {
        mmm mmmVar;
        com.thinkup.core.n.o.m mVar = new com.thinkup.core.n.o.m();
        mVar.om = this.o.nm.o().oom0();
        o0om o0omVar = this.o;
        mVar.oo0 = (o0omVar == null || (mmmVar = o0omVar.f42240n) == null) ? null : mmmVar.m();
        com.thinkup.core.n.o.o oVar = new com.thinkup.core.n.o.o(this.n0, this.mn, this.mm, list, 1, this.o.nm.o());
        oVar.o(mVar);
        oVar.o(0, o0oVar);
    }

    @Override // com.thinkup.core.n.m
    public final String oo() {
        return this.o.o00;
    }
}
