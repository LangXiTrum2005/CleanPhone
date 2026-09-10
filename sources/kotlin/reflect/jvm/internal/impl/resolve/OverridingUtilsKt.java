package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: loaded from: classes7.dex */
public final class OverridingUtilsKt {
    public static final Collection a(Collection collection, Function1 function1) {
        Intrinsics.f(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSet = new SmartSet();
        while (!linkedList.isEmpty()) {
            Object objW = CollectionsKt.w(linkedList);
            final SmartSet smartSet2 = new SmartSet();
            ArrayList arrayListG = OverridingUtil.g(objW, linkedList, function1, new Function1<Object, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object it) {
                    Intrinsics.e(it, "it");
                    smartSet2.add(it);
                    return Unit.f43263a;
                }
            });
            if (arrayListG.size() == 1 && smartSet2.isEmpty()) {
                Object objV = CollectionsKt.V(arrayListG);
                Intrinsics.e(objV, "overridableGroup.single()");
                smartSet.add(objV);
            } else {
                Object objS = OverridingUtil.s(arrayListG, function1);
                CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(objS);
                for (Object it : arrayListG) {
                    Intrinsics.e(it, "it");
                    if (!OverridingUtil.k(callableDescriptor, (CallableDescriptor) function1.invoke(it))) {
                        smartSet2.add(it);
                    }
                }
                if (!smartSet2.isEmpty()) {
                    smartSet.addAll(smartSet2);
                }
                smartSet.add(objS);
            }
        }
        return smartSet;
    }
}
