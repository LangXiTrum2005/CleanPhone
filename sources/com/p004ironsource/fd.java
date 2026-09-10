package com.p004ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/ironsource/fd;", "", "Lcom/ironsource/gd;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/e1;", "adProperties", "Lcom/ironsource/rd;", "fullscreenAdUnitFactory", "Lcom/ironsource/ed;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class fd {
    public final ed a(gd listener, m1 adTools, e1 adProperties, rd fullscreenAdUnitFactory) {
        Intrinsics.f(listener, "listener");
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(adProperties, "adProperties");
        Intrinsics.f(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        return new ed(listener, adTools, adProperties, null, fullscreenAdUnitFactory, 8, null);
    }
}
