package com.p004ironsource;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"Lcom/ironsource/bs;", ch.f24532p, "", "isManual", "Lcom/ironsource/m2;", "b", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class xr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final m2 b(bs bsVar, boolean z2) {
        m2.a aVar;
        if (z2) {
            aVar = m2.a.MANUAL;
        } else {
            aVar = bsVar.k().e() ? m2.a.AUTOMATIC_LOAD_WHILE_SHOW : m2.a.AUTOMATIC_LOAD_AFTER_CLOSE;
        }
        return new m2(aVar, bsVar.k().j(), bsVar.k().b(), -1L);
    }
}
