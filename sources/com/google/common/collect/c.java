package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements BinaryOperator {
    public final /* synthetic */ int X;

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                CollectCollectors.EnumSetAccumulator enumSetAccumulator = (CollectCollectors.EnumSetAccumulator) obj;
                CollectCollectors.EnumSetAccumulator enumSetAccumulator2 = (CollectCollectors.EnumSetAccumulator) obj2;
                EnumSet enumSet = enumSetAccumulator.f19798a;
                if (enumSet == null) {
                    return enumSetAccumulator2;
                }
                EnumSet enumSet2 = enumSetAccumulator2.f19798a;
                if (enumSet2 == null) {
                    return enumSetAccumulator;
                }
                enumSet.addAll(enumSet2);
                return enumSetAccumulator;
            case 1:
                ImmutableList.Builder builder = (ImmutableList.Builder) obj;
                ImmutableList.Builder builder2 = (ImmutableList.Builder) obj2;
                builder.getClass();
                builder.d(builder2.f19827b, builder2.f19826a);
                return builder;
            case 2:
                MoreCollectors.ToOptionalState toOptionalState = (MoreCollectors.ToOptionalState) obj;
                MoreCollectors.ToOptionalState toOptionalState2 = (MoreCollectors.ToOptionalState) obj2;
                if (toOptionalState.f19928a == null) {
                    return toOptionalState2;
                }
                if (toOptionalState2.f19928a == null) {
                    return toOptionalState;
                }
                if (toOptionalState.f19929b.isEmpty()) {
                    toOptionalState.f19929b = new ArrayList();
                }
                toOptionalState.f19929b.add(toOptionalState2.f19928a);
                toOptionalState.f19929b.addAll(toOptionalState2.f19929b);
                if (toOptionalState.f19929b.size() <= 4) {
                    return toOptionalState;
                }
                List list = toOptionalState.f19929b;
                list.subList(4, list.size()).clear();
                toOptionalState.b(true);
                throw null;
            case 3:
                return ((ImmutableSet.Builder) obj).l((ImmutableSet.Builder) obj2);
            default:
                ImmutableRangeSet.Builder builder3 = (ImmutableRangeSet.Builder) obj;
                builder3.getClass();
                for (Range range : ((ImmutableRangeSet.Builder) obj2).f19854a) {
                    Preconditions.g(!range.g(), "range must not be empty, but was %s", range);
                    builder3.f19854a.add(range);
                }
                return builder3;
        }
    }
}
