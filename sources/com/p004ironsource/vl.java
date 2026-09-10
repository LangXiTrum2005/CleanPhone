package com.p004ironsource;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ironsource/hr;", "", "b", "(Lcom/ironsource/hr;)Ljava/lang/String;", d9.h.j0, "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class vl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(hr hrVar) {
        if (hrVar instanceof hr.b) {
            return "success";
        }
        if (hrVar instanceof hr.a) {
            return "failure";
        }
        throw new NoWhenBranchMatchedException();
    }
}
