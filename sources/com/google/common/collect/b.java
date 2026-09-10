package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.EnumSet;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements BiConsumer {
    public final /* synthetic */ int X;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                CollectCollectors.EnumSetAccumulator enumSetAccumulator = (CollectCollectors.EnumSetAccumulator) obj;
                Enum r4 = (Enum) obj2;
                EnumSet enumSet = enumSetAccumulator.f19798a;
                if (enumSet != null) {
                    enumSet.add(r4);
                } else {
                    enumSetAccumulator.f19798a = EnumSet.of(r4);
                }
                break;
            case 1:
                ((MoreCollectors.ToOptionalState) obj).a(obj2);
                break;
            case 2:
                MoreCollectors.ToOptionalState toOptionalState = (MoreCollectors.ToOptionalState) obj;
                if (obj2 == null) {
                    obj2 = MoreCollectors.f19927a;
                } else {
                    Object obj3 = MoreCollectors.f19927a;
                }
                toOptionalState.a(obj2);
                break;
            case 3:
                ((ImmutableSet.Builder) obj).c(obj2);
                break;
            case 4:
                ImmutableRangeSet.Builder builder = (ImmutableRangeSet.Builder) obj;
                Range range = (Range) obj2;
                builder.getClass();
                Preconditions.g(!range.g(), "range must not be empty, but was %s", range);
                builder.f19854a.add(range);
                break;
            default:
                ((ImmutableList.Builder) obj).h(obj2);
                break;
        }
    }
}
