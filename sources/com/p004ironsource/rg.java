package com.p004ironsource;

import com.p004ironsource.lifecycle.b;
import com.p004ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ironsource/rg;", "Lcom/ironsource/m4;", "Lcom/ironsource/uk;", "observer", "", "a", "b", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class rg implements m4 {
    @Override // com.p004ironsource.m4
    public void a(uk observer) {
        Intrinsics.f(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        b.d().a(observer);
    }

    @Override // com.p004ironsource.m4
    public void b(uk observer) {
        Intrinsics.f(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        b.d().b(observer);
    }
}
