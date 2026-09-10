package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* JADX INFO: loaded from: classes7.dex */
final class TypeIntersectionScope$getContributedFunctions$1 extends Lambda implements Function1<SimpleFunctionDescriptor, CallableDescriptor> {
    public static final TypeIntersectionScope$getContributedFunctions$1 X = new TypeIntersectionScope$getContributedFunctions$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup = (SimpleFunctionDescriptor) obj;
        Intrinsics.f(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
