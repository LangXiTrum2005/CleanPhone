package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19985a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f19985a) {
            case 0:
                CollectCollectors.EnumSetAccumulator enumSetAccumulator = (CollectCollectors.EnumSetAccumulator) obj;
                EnumSet enumSet = enumSetAccumulator.f19798a;
                if (enumSet == null) {
                    int i2 = ImmutableSet.Z;
                    return RegularImmutableSet.k0;
                }
                int i3 = ImmutableEnumSet.g0;
                int size = enumSet.size();
                Object immutableEnumSet = size != 0 ? size != 1 ? new ImmutableEnumSet(enumSet) : new SingletonImmutableSet((Enum) Iterables.d(enumSet)) : RegularImmutableSet.k0;
                enumSetAccumulator.f19798a = null;
                return immutableEnumSet;
            case 1:
                ArrayList arrayList = ((ImmutableRangeSet.Builder) obj).f19854a;
                ImmutableList.Builder builder = new ImmutableList.Builder(arrayList.size());
                Range range = Range.Z;
                Collections.sort(arrayList, Range.RangeLexOrdering.X);
                PeekingIterator peekingIteratorI = Iterators.i(arrayList.iterator());
                while (peekingIteratorI.hasNext()) {
                    Range range2 = (Range) peekingIteratorI.next();
                    while (peekingIteratorI.hasNext()) {
                        Range range3 = (Range) ((Iterators.PeekingImpl) peekingIteratorI).a();
                        if (!range2.f(range3)) {
                        }
                        Preconditions.h(range2.e(range3).g(), "Overlapping ranges not permitted but found %s overlapping %s", range2, range3);
                        Range range4 = (Range) peekingIteratorI.next();
                        Cut cut = range4.X;
                        Cut cut2 = range2.X;
                        int iCompareTo = cut2.compareTo(cut);
                        Cut cut3 = range2.f19946Y;
                        Cut cut4 = range4.f19946Y;
                        int iCompareTo2 = cut3.compareTo(cut4);
                        if (iCompareTo > 0 || iCompareTo2 < 0) {
                            if (iCompareTo < 0 || iCompareTo2 > 0) {
                                if (iCompareTo > 0) {
                                    cut2 = range4.X;
                                }
                                if (iCompareTo2 < 0) {
                                    cut3 = cut4;
                                }
                                range2 = new Range(cut2, cut3);
                            } else {
                                range2 = range4;
                            }
                        }
                        break;
                    }
                    builder.h(range2);
                }
                ImmutableList immutableListJ = builder.j();
                if (immutableListJ.isEmpty()) {
                    return ImmutableRangeSet.f19853Y;
                }
                return (((RegularImmutableList) immutableListJ).e0 == 1 && ((Range) Iterables.d(immutableListJ)).equals(Range.Z)) ? ImmutableRangeSet.Z : new ImmutableRangeSet(immutableListJ);
            case 2:
                MoreCollectors.ToOptionalState toOptionalState = (MoreCollectors.ToOptionalState) obj;
                if (toOptionalState.f19929b.isEmpty()) {
                    return Optional.ofNullable(toOptionalState.f19928a);
                }
                toOptionalState.b(false);
                throw null;
            case 3:
                MoreCollectors.ToOptionalState toOptionalState2 = (MoreCollectors.ToOptionalState) obj;
                Object obj2 = MoreCollectors.f19927a;
                if (toOptionalState2.f19928a == null) {
                    throw new NoSuchElementException();
                }
                if (!toOptionalState2.f19929b.isEmpty()) {
                    toOptionalState2.b(false);
                    throw null;
                }
                Object obj3 = toOptionalState2.f19928a;
                if (obj3 == MoreCollectors.f19927a) {
                    return null;
                }
                return obj3;
            case 4:
                return ((ImmutableSet.Builder) obj).k();
            default:
                return ((ImmutableList.Builder) obj).j();
        }
    }
}
