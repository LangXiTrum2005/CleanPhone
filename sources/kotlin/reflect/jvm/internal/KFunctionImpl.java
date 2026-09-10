package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.protobuf.a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.CallerKt;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB7\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "", "name", InAppPurchaseMetaData.KEY_SIGNATURE, "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KFunctionImpl extends KCallableImpl<Object> implements FunctionBase<Object>, KFunction<Object>, FunctionWithAllInvokes {
    public static final /* synthetic */ KProperty[] m0;
    public final KDeclarationContainerImpl g0;
    public final String h0;
    public final Object i0;
    public final ReflectProperties.LazySoftVal j0;
    public final Object k0;
    public final Object l0;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        m0 = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(KFunctionImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, final String str, String str2, FunctionDescriptor functionDescriptor, Object obj) {
        this.g0 = kDeclarationContainerImpl;
        this.h0 = str2;
        this.i0 = obj;
        this.j0 = ReflectProperties.a(functionDescriptor, new Function0<FunctionDescriptor>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KFunctionImpl kFunctionImpl = this.X;
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kFunctionImpl.g0;
                kDeclarationContainerImpl2.getClass();
                String str3 = str;
                String signature = kFunctionImpl.h0;
                Intrinsics.f(signature, "signature");
                Collection collectionI0 = str3.equals("<init>") ? CollectionsKt.i0(kDeclarationContainerImpl2.f()) : kDeclarationContainerImpl2.n(Name.g(str3));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collectionI0) {
                    if (Intrinsics.a(RuntimeTypeMapper.c((FunctionDescriptor) obj2).getF43378b(), signature)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.size() == 1) {
                    return (FunctionDescriptor) CollectionsKt.W(arrayList);
                }
                String strD = CollectionsKt.D(collectionI0, IOUtils.LINE_SEPARATOR_UNIX, null, null, KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1.X, 30);
                StringBuilder sbQ = a.q("Function '", str3, "' (JVM signature: ", signature, ") not resolved in ");
                sbQ.append(kDeclarationContainerImpl2);
                sbQ.append(AbstractJsonLexerKt.COLON);
                sbQ.append(strD.length() == 0 ? " no members found" : IOUtils.LINE_SEPARATOR_UNIX.concat(strD));
                throw new KotlinReflectionInternalError(sbQ.toString());
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f43248Y;
        this.k0 = LazyKt.a(lazyThreadSafetyMode, new Function0<Caller<? extends Executable>>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$caller$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws ClassNotFoundException {
                Object objC;
                CallerImpl boundStatic;
                CallerImpl callerImplR;
                ClassId classId = RuntimeTypeMapper.f43419a;
                KFunctionImpl kFunctionImpl = this.X;
                JvmFunctionSignature jvmFunctionSignatureC = RuntimeTypeMapper.c(kFunctionImpl.o());
                boolean z2 = jvmFunctionSignatureC instanceof JvmFunctionSignature.KotlinConstructor;
                AnnotationConstructorCaller.CallMode callMode = AnnotationConstructorCaller.CallMode.f43428Y;
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kFunctionImpl.g0;
                if (z2) {
                    if (kFunctionImpl.p()) {
                        Class f43390y = kDeclarationContainerImpl2.getF43390Y();
                        List parameters = kFunctionImpl.getParameters();
                        ArrayList arrayList = new ArrayList(CollectionsKt.n(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((KParameter) it.next()).getName();
                            Intrinsics.c(name);
                            arrayList.add(name);
                        }
                        return new AnnotationConstructorCaller(f43390y, arrayList, callMode);
                    }
                    JvmMemberSignature.Method method = ((JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureC).f43375a;
                    kDeclarationContainerImpl2.getClass();
                    String desc = method.f44153b;
                    Intrinsics.f(desc, "desc");
                    objC = KDeclarationContainerImpl.v(kDeclarationContainerImpl2.getF43390Y(), kDeclarationContainerImpl2.s(desc));
                } else if (jvmFunctionSignatureC instanceof JvmFunctionSignature.KotlinFunction) {
                    JvmMemberSignature.Method method2 = ((JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureC).f43377a;
                    objC = kDeclarationContainerImpl2.c(method2.f44152a, method2.f44153b);
                } else if (jvmFunctionSignatureC instanceof JvmFunctionSignature.JavaMethod) {
                    objC = ((JvmFunctionSignature.JavaMethod) jvmFunctionSignatureC).f43374a;
                } else {
                    if (!(jvmFunctionSignatureC instanceof JvmFunctionSignature.JavaConstructor)) {
                        if (!(jvmFunctionSignatureC instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Class f43390y2 = kDeclarationContainerImpl2.getF43390Y();
                        List list = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureC).f43372a;
                        List list2 = list;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new AnnotationConstructorCaller(f43390y2, arrayList2, callMode, AnnotationConstructorCaller.Origin.X, list);
                    }
                    objC = ((JvmFunctionSignature.JavaConstructor) jvmFunctionSignatureC).f43373a;
                }
                if (objC instanceof Constructor) {
                    callerImplR = KFunctionImpl.r(kFunctionImpl, (Constructor) objC, kFunctionImpl.o(), false);
                } else {
                    if (!(objC instanceof Method)) {
                        throw new KotlinReflectionInternalError("Could not compute caller for function: " + kFunctionImpl.o() + " (member = " + objC + ')');
                    }
                    Method method3 = (Method) objC;
                    boolean zIsStatic = Modifier.isStatic(method3.getModifiers());
                    Object obj2 = kFunctionImpl.i0;
                    if (!zIsStatic) {
                        boundStatic = kFunctionImpl.q() ? new CallerImpl.Method.BoundInstance(InlineClassAwareCallerKt.a(obj2, kFunctionImpl.o()), method3) : new CallerImpl.Method.Instance(method3);
                    } else if (kFunctionImpl.o().getAnnotations().b(UtilKt.f43420a) != null) {
                        boundStatic = kFunctionImpl.q() ? new CallerImpl.Method.BoundJvmStaticInObject(method3) : new CallerImpl.Method.JvmStaticInObject(method3);
                    } else {
                        boundStatic = kFunctionImpl.q() ? new CallerImpl.Method.BoundStatic(InlineClassAwareCallerKt.a(obj2, kFunctionImpl.o()), method3) : new CallerImpl.Method.Static(method3);
                    }
                    callerImplR = boundStatic;
                }
                return InlineClassAwareCallerKt.b(callerImplR, kFunctionImpl.o(), false);
            }
        });
        this.l0 = LazyKt.a(lazyThreadSafetyMode, new Function0<Caller<? extends Executable>>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$defaultCaller$2
            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:45:0x0167  */
            /* JADX WARN: Code duplicated, block: B:47:0x016f  */
            /* JADX WARN: Code duplicated, block: B:48:0x017f  */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                GenericDeclaration genericDeclarationV;
                CallerImpl callerImplR;
                Method method;
                CallerImpl boundStatic;
                ClassId classId = RuntimeTypeMapper.f43419a;
                KFunctionImpl kFunctionImpl = this.X;
                JvmFunctionSignature jvmFunctionSignatureC = RuntimeTypeMapper.c(kFunctionImpl.o());
                boolean z2 = jvmFunctionSignatureC instanceof JvmFunctionSignature.KotlinFunction;
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kFunctionImpl.g0;
                if (z2) {
                    JvmMemberSignature.Method method2 = ((JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureC).f43377a;
                    Member f43435a = kFunctionImpl.c().getF43435a();
                    Intrinsics.c(f43435a);
                    boolean zIsStatic = Modifier.isStatic(f43435a.getModifiers());
                    boolean z3 = !zIsStatic;
                    kDeclarationContainerImpl2.getClass();
                    String name = method2.f44152a;
                    Intrinsics.f(name, "name");
                    String desc = method2.f44153b;
                    Intrinsics.f(desc, "desc");
                    if (name.equals("<init>")) {
                        genericDeclarationV = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        if (!zIsStatic) {
                            arrayList.add(kDeclarationContainerImpl2.getF43390Y());
                        }
                        kDeclarationContainerImpl2.b(arrayList, desc, false);
                        genericDeclarationV = KDeclarationContainerImpl.t(kDeclarationContainerImpl2.q(), name.concat("$default"), (Class[]) arrayList.toArray(new Class[0]), kDeclarationContainerImpl2.u(StringsKt.u(desc, ')', 0, 6) + 1, desc.length(), desc), z3);
                    }
                } else {
                    boolean z4 = jvmFunctionSignatureC instanceof JvmFunctionSignature.KotlinConstructor;
                    AnnotationConstructorCaller.CallMode callMode = AnnotationConstructorCaller.CallMode.X;
                    if (!z4) {
                        if (jvmFunctionSignatureC instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
                            Class f43390y = kDeclarationContainerImpl2.getF43390Y();
                            List list = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureC).f43372a;
                            List list2 = list;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((Method) it.next()).getName());
                            }
                            return new AnnotationConstructorCaller(f43390y, arrayList2, callMode, AnnotationConstructorCaller.Origin.X, list);
                        }
                        genericDeclarationV = null;
                    } else {
                        if (kFunctionImpl.p()) {
                            Class f43390y2 = kDeclarationContainerImpl2.getF43390Y();
                            List parameters = kFunctionImpl.getParameters();
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.n(parameters, 10));
                            Iterator it2 = parameters.iterator();
                            while (it2.hasNext()) {
                                String name2 = ((KParameter) it2.next()).getName();
                                Intrinsics.c(name2);
                                arrayList3.add(name2);
                            }
                            return new AnnotationConstructorCaller(f43390y2, arrayList3, callMode);
                        }
                        JvmMemberSignature.Method method3 = ((JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureC).f43375a;
                        kDeclarationContainerImpl2.getClass();
                        String desc2 = method3.f44153b;
                        Intrinsics.f(desc2, "desc");
                        Class f43390y3 = kDeclarationContainerImpl2.getF43390Y();
                        ArrayList arrayList4 = new ArrayList();
                        kDeclarationContainerImpl2.b(arrayList4, desc2, true);
                        genericDeclarationV = KDeclarationContainerImpl.v(f43390y3, arrayList4);
                    }
                }
                if (genericDeclarationV instanceof Constructor) {
                    callerImplR = KFunctionImpl.r(kFunctionImpl, (Constructor) genericDeclarationV, kFunctionImpl.o(), true);
                } else if (genericDeclarationV instanceof Method) {
                    if (kFunctionImpl.o().getAnnotations().b(UtilKt.f43420a) != null) {
                        DeclarationDescriptor declarationDescriptorD = kFunctionImpl.o().d();
                        Intrinsics.d(declarationDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        if (((ClassDescriptor) declarationDescriptorD).T()) {
                            method = (Method) genericDeclarationV;
                            if (kFunctionImpl.q()) {
                                boundStatic = new CallerImpl.Method.BoundStatic(InlineClassAwareCallerKt.a(kFunctionImpl.i0, kFunctionImpl.o()), method);
                            } else {
                                boundStatic = new CallerImpl.Method.Static(method);
                            }
                        } else {
                            Method method4 = (Method) genericDeclarationV;
                            boundStatic = kFunctionImpl.q() ? new CallerImpl.Method.BoundJvmStaticInObject(method4) : new CallerImpl.Method.JvmStaticInObject(method4);
                        }
                    } else {
                        method = (Method) genericDeclarationV;
                        if (kFunctionImpl.q()) {
                            boundStatic = new CallerImpl.Method.BoundStatic(InlineClassAwareCallerKt.a(kFunctionImpl.i0, kFunctionImpl.o()), method);
                        } else {
                            boundStatic = new CallerImpl.Method.Static(method);
                        }
                    }
                    callerImplR = boundStatic;
                } else {
                    callerImplR = null;
                }
                if (callerImplR != null) {
                    return InlineClassAwareCallerKt.b(callerImplR, kFunctionImpl.o(), true);
                }
                return null;
            }
        });
    }

    public static final CallerImpl r(KFunctionImpl kFunctionImpl, Constructor constructor, FunctionDescriptor functionDescriptor, boolean z2) {
        Class<?> cls = null;
        if (!z2) {
            kFunctionImpl.getClass();
            ClassConstructorDescriptor classConstructorDescriptor = functionDescriptor instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) functionDescriptor : null;
            if (classConstructorDescriptor != null && !DescriptorVisibilities.e(classConstructorDescriptor.getVisibility())) {
                ClassDescriptor classDescriptorV = classConstructorDescriptor.V();
                Intrinsics.e(classDescriptorV, "constructorDescriptor.constructedClass");
                if (!InlineClassesUtilsKt.b(classDescriptorV) && !DescriptorUtils.q(classConstructorDescriptor.V())) {
                    List listE = classConstructorDescriptor.e();
                    Intrinsics.e(listE, "constructorDescriptor.valueParameters");
                    List list = listE;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
                            Intrinsics.e(type, "it.type");
                            if (InlineClassManglingRulesKt.a(type)) {
                                if (kFunctionImpl.q()) {
                                    return new CallerImpl.AccessorForHiddenBoundConstructor(constructor, InlineClassAwareCallerKt.a(kFunctionImpl.i0, kFunctionImpl.o()));
                                }
                                Intrinsics.f(constructor, "constructor");
                                Class declaringClass = constructor.getDeclaringClass();
                                Intrinsics.e(declaringClass, "constructor.declaringClass");
                                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                Intrinsics.e(genericParameterTypes, "constructor.genericParameterTypes");
                                return new CallerImpl.AccessorForHiddenConstructor(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : ArraysKt.r(genericParameterTypes, 0, genericParameterTypes.length - 1)));
                            }
                        }
                    }
                }
            }
        }
        if (kFunctionImpl.q()) {
            return new CallerImpl.BoundConstructor(constructor, InlineClassAwareCallerKt.a(kFunctionImpl.i0, kFunctionImpl.o()));
        }
        Intrinsics.f(constructor, "constructor");
        Class declaringClass2 = constructor.getDeclaringClass();
        Intrinsics.e(declaringClass2, "constructor.declaringClass");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        Intrinsics.e(genericParameterTypes2, "constructor.genericParameterTypes");
        return new CallerImpl.Constructor(constructor, declaringClass2, cls, genericParameterTypes2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final Caller c() {
        return (Caller) this.k0.getX();
    }

    public final boolean equals(Object obj) {
        KFunctionImpl kFunctionImplB = UtilKt.b(obj);
        return kFunctionImplB != null && Intrinsics.a(this.g0, kFunctionImplB.g0) && getH0().equals(kFunctionImplB.getH0()) && Intrinsics.a(this.h0, kFunctionImplB.h0) && Intrinsics.a(this.i0, kFunctionImplB.i0);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: f, reason: from getter */
    public final KDeclarationContainerImpl getG0() {
        return this.g0;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        return CallerKt.a(c());
    }

    @Override // kotlin.reflect.KCallable
    /* JADX INFO: renamed from: getName */
    public final String getH0() {
        String strB = o().getName().b();
        Intrinsics.e(strB, "descriptor.name.asString()");
        return strB;
    }

    public final int hashCode() {
        return this.h0.hashCode() + ((getH0().hashCode() + (this.g0.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isExternal() {
        return o().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInfix() {
        return o().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInline() {
        return o().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isOperator() {
        return o().isOperator();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isSuspend() {
        return o().isSuspend();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final Caller n() {
        return (Caller) this.l0.getX();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final boolean q() {
        return !Intrinsics.a(this.i0, CallableReference.NO_RECEIVER);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final FunctionDescriptor o() {
        KProperty kProperty = m0[0];
        Object objInvoke = this.j0.invoke();
        Intrinsics.e(objInvoke, "<get-descriptor>(...)");
        return (FunctionDescriptor) objInvoke;
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f43418a;
        return ReflectionObjectRenderer.b(o());
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KFunctionImpl(KDeclarationContainerImpl container, FunctionDescriptor descriptor) {
        Intrinsics.f(container, "container");
        Intrinsics.f(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        Intrinsics.e(strB, "descriptor.name.asString()");
        this(container, strB, RuntimeTypeMapper.c(descriptor).getF43378b(), descriptor, CallableReference.NO_RECEIVER);
    }

    @Override // kotlin.jvm.functions.Function9
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }
}
