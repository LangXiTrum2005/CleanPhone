package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 extends BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f43987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl f43988c;
    public final /* synthetic */ ClassDescriptor d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ClassId f43989e;
    public final /* synthetic */ List f;
    public final /* synthetic */ SourceElement g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, ClassDescriptor classDescriptor, ClassId classId, List list, SourceElement sourceElement) {
        super();
        this.f43988c = binaryClassAnnotationAndConstantLoaderImpl;
        this.d = classDescriptor;
        this.f43989e = classId;
        this.f = list;
        this.g = sourceElement;
        this.f43987b = new HashMap();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void a() throws InvocationTargetException {
        HashMap arguments = this.f43987b;
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = this.f43988c;
        binaryClassAnnotationAndConstantLoaderImpl.getClass();
        ClassId classId = this.f43989e;
        Intrinsics.f(arguments, "arguments");
        boolean zQ = false;
        if (classId.equals(SpecialJvmAnnotations.f43454b)) {
            Object obj = arguments.get(Name.g("value"));
            KClassValue kClassValue = obj instanceof KClassValue ? (KClassValue) obj : null;
            if (kClassValue != null) {
                Object obj2 = kClassValue.f44302a;
                KClassValue.Value.NormalClass normalClass = obj2 instanceof KClassValue.Value.NormalClass ? (KClassValue.Value.NormalClass) obj2 : null;
                if (normalClass != null) {
                    zQ = binaryClassAnnotationAndConstantLoaderImpl.q(normalClass.f44310a.f44300a);
                }
            }
        }
        if (zQ || binaryClassAnnotationAndConstantLoaderImpl.q(classId)) {
            return;
        }
        this.f.add(new AnnotationDescriptorImpl(this.d.o(), arguments, this.g));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
    public final void g(ArrayList elements, Name name) {
        Intrinsics.f(elements, "elements");
        ValueParameterDescriptor valueParameterDescriptorB = DescriptorResolverUtils.b(name, this.d);
        if (valueParameterDescriptorB != null) {
            HashMap map = this.f43987b;
            List listB = CollectionsKt.b(elements);
            KotlinType type = valueParameterDescriptorB.getType();
            Intrinsics.e(type, "parameter.type");
            map.put(name, new TypedArrayValue(listB, type));
            return;
        }
        if (this.f43988c.q(this.f43989e) && Intrinsics.a(name.b(), "value")) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : elements) {
                if (obj instanceof AnnotationValue) {
                    arrayList.add(obj);
                }
            }
            List list = this.f;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                list.add((AnnotationDescriptor) ((AnnotationValue) it.next()).f44302a);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
    public final void h(Name name, ConstantValue constantValue) {
        this.f43987b.put(name, constantValue);
    }
}
