package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public final class UtilKt {
    public static final ArrayList a(List list, Collection oldValueParameters, FunctionDescriptor functionDescriptor) {
        Intrinsics.f(oldValueParameters, "oldValueParameters");
        list.size();
        oldValueParameters.size();
        ArrayList<Pair> arrayListN0 = CollectionsKt.n0(list, oldValueParameters);
        ArrayList arrayList = new ArrayList(CollectionsKt.n(arrayListN0, 10));
        for (Pair pair : arrayListN0) {
            KotlinType kotlinType = (KotlinType) pair.X;
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.f43249Y;
            int iG = valueParameterDescriptor.g();
            Annotations annotations = valueParameterDescriptor.getAnnotations();
            Name name = valueParameterDescriptor.getName();
            Intrinsics.e(name, "oldParameter.name");
            boolean zU0 = valueParameterDescriptor.u0();
            boolean zK0 = valueParameterDescriptor.k0();
            boolean zI0 = valueParameterDescriptor.i0();
            KotlinType kotlinTypeF = valueParameterDescriptor.o0() != null ? DescriptorUtilsKt.j(functionDescriptor).k().f(kotlinType) : null;
            SourceElement sourceElementF = valueParameterDescriptor.f();
            Intrinsics.e(sourceElementF, "oldParameter.source");
            arrayList.add(new ValueParameterDescriptorImpl(functionDescriptor, null, iG, annotations, name, kotlinType, zU0, zK0, zI0, kotlinTypeF, sourceElementF));
        }
        return arrayList;
    }

    public static final LazyJavaStaticClassScope b(ClassDescriptor classDescriptor) {
        ClassDescriptor classDescriptor2;
        Intrinsics.f(classDescriptor, "<this>");
        int i2 = DescriptorUtilsKt.f44314a;
        Iterator it = classDescriptor.o().H0().d().iterator();
        while (true) {
            if (!it.hasNext()) {
                classDescriptor2 = null;
                break;
            }
            KotlinType kotlinType = (KotlinType) it.next();
            if (!KotlinBuiltIns.w(kotlinType)) {
                ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
                if (DescriptorUtils.n(classifierDescriptorC, ClassKind.X) || DescriptorUtils.n(classifierDescriptorC, ClassKind.Z)) {
                    Intrinsics.d(classifierDescriptorC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    classDescriptor2 = (ClassDescriptor) classifierDescriptorC;
                    break;
                }
            }
        }
        if (classDescriptor2 == null) {
            return null;
        }
        MemberScope memberScopeF0 = classDescriptor2.f0();
        LazyJavaStaticClassScope lazyJavaStaticClassScope = memberScopeF0 instanceof LazyJavaStaticClassScope ? (LazyJavaStaticClassScope) memberScopeF0 : null;
        return lazyJavaStaticClassScope == null ? b(classDescriptor2) : lazyJavaStaticClassScope;
    }
}
