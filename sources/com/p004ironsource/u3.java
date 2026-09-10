package com.p004ironsource;

import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0014¨\u0006\u0011"}, d2 = {"Lcom/ironsource/u3;", "Lcom/ironsource/u7;", "", "d", "Lcom/ironsource/zb;", "event", "", "j", h.f36614b, "", "c", f.j, "eventId", "", "e", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class u3 extends u7 {
    public u3() {
        this.H = "outcome";
        this.G = 4;
        this.f27380I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.p004ironsource.u7
    public int c(zb event) {
        return 1;
    }

    @Override // com.p004ironsource.u7
    public void d() {
    }

    @Override // com.p004ironsource.u7
    public String e(int eventId) {
        return "";
    }

    @Override // com.p004ironsource.u7
    public void f(zb event) {
    }

    @Override // com.p004ironsource.u7
    public boolean h(zb event) {
        return false;
    }

    @Override // com.p004ironsource.u7
    public boolean j(zb event) {
        return false;
    }

    @Override // com.p004ironsource.u7
    public boolean d(zb event) {
        Intrinsics.f(event, "event");
        int iC = event.c();
        return iC == ac.FIRST_INSTANCE.getId() || iC == ac.INIT_COMPLETE.getId() || iC == ac.SDK_INIT_FAILED.getId() || iC == ac.SDK_INIT_SUCCESS.getId();
    }
}
