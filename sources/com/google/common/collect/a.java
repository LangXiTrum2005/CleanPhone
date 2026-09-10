package com.google.common.collect;

import java.util.Collections;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19984a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f19984a) {
            case 0:
                int i2 = CollectCollectors.f19797a;
                return new CollectCollectors.EnumSetAccumulator();
            case 1:
                MoreCollectors.ToOptionalState toOptionalState = new MoreCollectors.ToOptionalState();
                toOptionalState.f19928a = null;
                toOptionalState.f19929b = Collections.EMPTY_LIST;
                return toOptionalState;
            case 2:
                return ImmutableSet.p();
            case 3:
                ImmutableRangeSet immutableRangeSet = ImmutableRangeSet.f19853Y;
                return new ImmutableRangeSet.Builder();
            default:
                return ImmutableList.s();
        }
    }
}
