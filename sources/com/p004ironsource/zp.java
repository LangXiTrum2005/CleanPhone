package com.p004ironsource;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/zp;", "", "Lcom/ironsource/z;", m5.f25675p, "", "placementName", "Lcom/ironsource/xk;", "publisherDataHolder", "", "a", "", "waterfallInstances", "winnerInstance", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface zp {
    default void a(AbstractC3389z instance, String placementName, xk publisherDataHolder) {
        Intrinsics.f(instance, "instance");
        Intrinsics.f(publisherDataHolder, "publisherDataHolder");
    }

    default void a(List<? extends AbstractC3389z> waterfallInstances, AbstractC3389z winnerInstance) {
        Intrinsics.f(waterfallInstances, "waterfallInstances");
        Intrinsics.f(winnerInstance, "winnerInstance");
    }
}
