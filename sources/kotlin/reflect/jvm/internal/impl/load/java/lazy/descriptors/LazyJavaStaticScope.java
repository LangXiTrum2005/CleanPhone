package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public abstract class LazyJavaStaticScope extends LazyJavaScope {
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void n(ArrayList arrayList, Name name) {
        Intrinsics.f(name, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final ReceiverParameterDescriptor p() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final LazyJavaScope.MethodSignatureData s(JavaMethod method, ArrayList arrayList, KotlinType kotlinType, List list) {
        Intrinsics.f(method, "method");
        return new LazyJavaScope.MethodSignatureData(kotlinType, list, arrayList, EmptyList.X);
    }
}
