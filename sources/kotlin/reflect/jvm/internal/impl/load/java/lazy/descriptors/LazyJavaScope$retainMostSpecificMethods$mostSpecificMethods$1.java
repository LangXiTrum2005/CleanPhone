package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* JADX INFO: loaded from: classes7.dex */
final class LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1 extends Lambda implements Function1<SimpleFunctionDescriptor, CallableDescriptor> {
    public static final LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1 X = new LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup = (SimpleFunctionDescriptor) obj;
        Intrinsics.f(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
