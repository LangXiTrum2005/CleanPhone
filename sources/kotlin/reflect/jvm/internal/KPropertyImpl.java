package kotlin.reflect.jvm.internal;

import androidx.media3.extractor.text.ttml.a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.KCallablesJvm;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0013\u0014\u0015\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "V", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", InAppPurchaseMetaData.KEY_SIGNATURE, "descriptorInitialValue", "", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "Accessor", "Companion", "Getter", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements KProperty<V> {
    public static final Object m0 = new Object();
    public final KDeclarationContainerImpl g0;
    public final String h0;
    public final String i0;
    public final Object j0;
    public final Object k0;
    public final ReflectProperties.LazySoftVal l0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Accessor<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements KFunction<ReturnType>, KProperty.Accessor<PropertyType> {
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        /* JADX INFO: renamed from: f */
        public final KDeclarationContainerImpl getG0() {
            return s().g0;
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isExternal() {
            return r().isExternal();
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isInfix() {
            return r().isInfix();
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isInline() {
            return r().isInline();
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isOperator() {
            return r().isOperator();
        }

        @Override // kotlin.reflect.KCallable
        public final boolean isSuspend() {
            return r().isSuspend();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final Caller n() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final boolean q() {
            return s().q();
        }

        public abstract PropertyAccessorDescriptor r();

        public abstract KPropertyImpl s();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Companion;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Getter<V> extends Accessor<V, V> implements KProperty.Getter<V> {
        public static final /* synthetic */ KProperty[] i0;
        public final ReflectProperties.LazySoftVal g0 = ReflectProperties.a(null, new Function0<PropertyGetterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$descriptor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KPropertyImpl.Getter getter = this.X;
                PropertyGetterDescriptorImpl getter2 = getter.s().o().getGetter();
                return getter2 == null ? DescriptorFactory.c(getter.s().o(), Annotations.Companion.f43614a) : getter2;
            }
        });
        public final Object h0 = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<Caller<?>>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$caller$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KPropertyImplKt.a(this.X, true);
            }
        });

        static {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            i0 = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Getter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final Caller c() {
            return (Caller) this.h0.getX();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Getter) && Intrinsics.a(s(), ((Getter) obj).s());
        }

        @Override // kotlin.reflect.KCallable
        /* JADX INFO: renamed from: getName */
        public final String getH0() {
            return a.p(new StringBuilder("<get-"), s().h0, '>');
        }

        public final int hashCode() {
            return s().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final CallableMemberDescriptor o() {
            KProperty kProperty = i0[0];
            Object objInvoke = this.g0.invoke();
            Intrinsics.e(objInvoke, "<get-descriptor>(...)");
            return (PropertyGetterDescriptor) objInvoke;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        public final PropertyAccessorDescriptor r() {
            KProperty kProperty = i0[0];
            Object objInvoke = this.g0.invoke();
            Intrinsics.e(objInvoke, "<get-descriptor>(...)");
            return (PropertyGetterDescriptor) objInvoke;
        }

        public final String toString() {
            return "getter of " + s();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Setter<V> extends Accessor<V, Unit> implements KMutableProperty.Setter<V> {
        public static final /* synthetic */ KProperty[] i0;
        public final ReflectProperties.LazySoftVal g0 = ReflectProperties.a(null, new Function0<PropertySetterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$descriptor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KPropertyImpl.Setter setter = this.X;
                PropertySetterDescriptor setter2 = setter.s().o().getSetter();
                return setter2 == null ? DescriptorFactory.d(setter.s().o(), Annotations.Companion.f43614a) : setter2;
            }
        });
        public final Object h0 = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<Caller<?>>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$caller$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KPropertyImplKt.a(this.X, false);
            }
        });

        static {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            i0 = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Setter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final Caller c() {
            return (Caller) this.h0.getX();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Setter) && Intrinsics.a(s(), ((Setter) obj).s());
        }

        @Override // kotlin.reflect.KCallable
        /* JADX INFO: renamed from: getName */
        public final String getH0() {
            return a.p(new StringBuilder("<set-"), s().h0, '>');
        }

        public final int hashCode() {
            return s().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final CallableMemberDescriptor o() {
            KProperty kProperty = i0[0];
            Object objInvoke = this.g0.invoke();
            Intrinsics.e(objInvoke, "<get-descriptor>(...)");
            return (PropertySetterDescriptor) objInvoke;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        public final PropertyAccessorDescriptor r() {
            KProperty kProperty = i0[0];
            Object objInvoke = this.g0.invoke();
            Intrinsics.e(objInvoke, "<get-descriptor>(...)");
            return (PropertySetterDescriptor) objInvoke;
        }

        public final String toString() {
            return "setter of " + s();
        }
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, PropertyDescriptorImpl propertyDescriptorImpl, Object obj) {
        this.g0 = kDeclarationContainerImpl;
        this.h0 = str;
        this.i0 = str2;
        this.j0 = obj;
        this.k0 = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<Field>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_javaField$1
            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0071  */
            /* JADX WARN: Code duplicated, block: B:28:0x0074  */
            /* JADX WARN: Code duplicated, block: B:29:0x0076  */
            /* JADX WARN: Code duplicated, block: B:31:0x0080  */
            /* JADX WARN: Code duplicated, block: B:33:0x0086  */
            /* JADX WARN: Code duplicated, block: B:36:0x0094  */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Class<?> enclosingClass;
                FieldDescriptor fieldDescriptorQ0;
                boolean zE0;
                boolean z2;
                boolean z3 = false;
                ClassId classId = RuntimeTypeMapper.f43419a;
                KPropertyImpl kPropertyImpl = this.X;
                JvmPropertySignature jvmPropertySignatureB = RuntimeTypeMapper.b(kPropertyImpl.o());
                if (jvmPropertySignatureB instanceof JvmPropertySignature.KotlinProperty) {
                    JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureB;
                    ExtensionRegistryLite extensionRegistryLite = JvmProtoBufUtil.f44158a;
                    ProtoBuf.Property property = kotlinProperty.f43383b;
                    JvmMemberSignature.Field fieldB = JvmProtoBufUtil.b(property, kotlinProperty.d, kotlinProperty.f43385e, true);
                    if (fieldB != null) {
                        PropertyDescriptor propertyDescriptor = kotlinProperty.f43382a;
                        if (propertyDescriptor.getKind() != CallableMemberDescriptor.Kind.f43557Y) {
                            DeclarationDescriptor declarationDescriptorD = propertyDescriptor.d();
                            if (declarationDescriptorD == null) {
                                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                            }
                            if (DescriptorUtils.l(declarationDescriptorD)) {
                                DeclarationDescriptor declarationDescriptorD2 = declarationDescriptorD.d();
                                if (DescriptorUtils.n(declarationDescriptorD2, ClassKind.X) || DescriptorUtils.n(declarationDescriptorD2, ClassKind.Z)) {
                                    ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptorD;
                                    LinkedHashSet linkedHashSet = CompanionObjectMapping.f43459a;
                                    LinkedHashSet linkedHashSet2 = CompanionObjectMapping.f43459a;
                                    if (DescriptorUtils.l(classDescriptor)) {
                                        LinkedHashSet linkedHashSet3 = CompanionObjectMapping.f43459a;
                                        ClassId classIdF = DescriptorUtilsKt.f(classDescriptor);
                                        if (CollectionsKt.o(linkedHashSet3, classIdF != null ? classIdF.f() : null)) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        z3 = true;
                                    } else if (DescriptorUtils.l(propertyDescriptor.d())) {
                                        fieldDescriptorQ0 = propertyDescriptor.q0();
                                        if (fieldDescriptorQ0 == null && fieldDescriptorQ0.getAnnotations().E0(JvmAbi.f43763a)) {
                                            zE0 = true;
                                        } else {
                                            zE0 = propertyDescriptor.getAnnotations().E0(JvmAbi.f43763a);
                                        }
                                        if (zE0) {
                                            z3 = true;
                                        }
                                    }
                                } else if (DescriptorUtils.l(propertyDescriptor.d())) {
                                    fieldDescriptorQ0 = propertyDescriptor.q0();
                                    if (fieldDescriptorQ0 == null) {
                                        zE0 = propertyDescriptor.getAnnotations().E0(JvmAbi.f43763a);
                                    } else {
                                        zE0 = propertyDescriptor.getAnnotations().E0(JvmAbi.f43763a);
                                    }
                                    if (zE0) {
                                        z3 = true;
                                    }
                                }
                            } else if (DescriptorUtils.l(propertyDescriptor.d())) {
                                fieldDescriptorQ0 = propertyDescriptor.q0();
                                if (fieldDescriptorQ0 == null) {
                                    zE0 = propertyDescriptor.getAnnotations().E0(JvmAbi.f43763a);
                                } else {
                                    zE0 = propertyDescriptor.getAnnotations().E0(JvmAbi.f43763a);
                                }
                                if (zE0) {
                                    z3 = true;
                                }
                            }
                        }
                        KDeclarationContainerImpl kDeclarationContainerImpl2 = kPropertyImpl.g0;
                        if (z3 || JvmProtoBufUtil.d(property)) {
                            enclosingClass = kDeclarationContainerImpl2.getF43405Y().getEnclosingClass();
                        } else {
                            DeclarationDescriptor declarationDescriptorD3 = propertyDescriptor.d();
                            enclosingClass = declarationDescriptorD3 instanceof ClassDescriptor ? UtilKt.j((ClassDescriptor) declarationDescriptorD3) : kDeclarationContainerImpl2.getF43405Y();
                        }
                        if (enclosingClass != null) {
                            try {
                                return enclosingClass.getDeclaredField(fieldB.f44150a);
                            } catch (NoSuchFieldException unused) {
                            }
                        }
                    }
                } else {
                    if (jvmPropertySignatureB instanceof JvmPropertySignature.JavaField) {
                        return ((JvmPropertySignature.JavaField) jvmPropertySignatureB).f43379a;
                    }
                    if (!(jvmPropertySignatureB instanceof JvmPropertySignature.JavaMethodProperty) && !(jvmPropertySignatureB instanceof JvmPropertySignature.MappedKotlinProperty)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return null;
            }
        });
        this.l0 = ReflectProperties.a(propertyDescriptorImpl, new Function0<PropertyDescriptor>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_descriptor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KPropertyImpl kPropertyImpl = this.X;
                KDeclarationContainerImpl kDeclarationContainerImpl2 = kPropertyImpl.g0;
                kDeclarationContainerImpl2.getClass();
                String name = kPropertyImpl.h0;
                Intrinsics.f(name, "name");
                String signature = kPropertyImpl.i0;
                Intrinsics.f(signature, "signature");
                MatchResult matchResultA = KDeclarationContainerImpl.X.a(signature);
                if (matchResultA != null) {
                    String str3 = (String) matchResultA.a().f44709a.b().get(1);
                    PropertyDescriptor propertyDescriptorO = kDeclarationContainerImpl2.o(Integer.parseInt(str3));
                    if (propertyDescriptorO != null) {
                        return propertyDescriptorO;
                    }
                    StringBuilder sbY = android.support.v4.media.a.y("Local property #", str3, " not found in ");
                    sbY.append(kDeclarationContainerImpl2.getF43405Y());
                    throw new KotlinReflectionInternalError(sbY.toString());
                }
                Collection collectionR = kDeclarationContainerImpl2.r(Name.g(name));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collectionR) {
                    if (Intrinsics.a(RuntimeTypeMapper.b((PropertyDescriptor) obj2).getF(), signature)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                    sbQ.append(kDeclarationContainerImpl2);
                    throw new KotlinReflectionInternalError(sbQ.toString());
                }
                if (arrayList.size() == 1) {
                    return (PropertyDescriptor) CollectionsKt.W(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList) {
                    DescriptorVisibility visibility = ((PropertyDescriptor) obj3).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                TreeMap treeMap = new TreeMap(new Comparator() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$$Lambda$0
                    public final Function2 X = KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2.X;

                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        Regex regex = KDeclarationContainerImpl.X;
                        Function2 tmp0 = this.X;
                        Intrinsics.f(tmp0, "$tmp0");
                        return ((Number) tmp0.invoke(obj4, obj5)).intValue();
                    }
                });
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                Intrinsics.e(collectionValues, "properties\n             …\n                }.values");
                List list = (List) CollectionsKt.E(collectionValues);
                if (list.size() == 1) {
                    return (PropertyDescriptor) CollectionsKt.w(list);
                }
                String strD = CollectionsKt.D(kDeclarationContainerImpl2.r(Name.g(name)), IOUtils.LINE_SEPARATOR_UNIX, null, null, KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1.X, 30);
                StringBuilder sbQ2 = androidx.datastore.preferences.protobuf.a.q("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbQ2.append(kDeclarationContainerImpl2);
                sbQ2.append(AbstractJsonLexerKt.COLON);
                sbQ2.append(strD.length() == 0 ? " no members found" : IOUtils.LINE_SEPARATOR_UNIX.concat(strD));
                throw new KotlinReflectionInternalError(sbQ2.toString());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final Caller c() {
        return u().c();
    }

    public final boolean equals(Object obj) {
        KPropertyImpl kPropertyImplC = UtilKt.c(obj);
        return kPropertyImplC != null && Intrinsics.a(this.g0, kPropertyImplC.g0) && Intrinsics.a(this.h0, kPropertyImplC.h0) && Intrinsics.a(this.i0, kPropertyImplC.i0) && Intrinsics.a(this.j0, kPropertyImplC.j0);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: f, reason: from getter */
    public final KDeclarationContainerImpl getG0() {
        return this.g0;
    }

    @Override // kotlin.reflect.KCallable
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getH0() {
        return this.h0;
    }

    public final int hashCode() {
        return this.i0.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.h0, this.g0.hashCode() * 31, 31);
    }

    @Override // kotlin.reflect.KProperty
    public final boolean isConst() {
        return o().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public final boolean isLateinit() {
        return o().s0();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final Caller n() {
        u().getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final boolean q() {
        return !Intrinsics.a(this.j0, CallableReference.NO_RECEIVER);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final Member r() {
        if (!o().x()) {
            return null;
        }
        ClassId classId = RuntimeTypeMapper.f43419a;
        JvmPropertySignature jvmPropertySignatureB = RuntimeTypeMapper.b(o());
        if (jvmPropertySignatureB instanceof JvmPropertySignature.KotlinProperty) {
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureB;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = kotlinProperty.f43384c;
            if ((jvmPropertySignature.f44140Y & 16) == 16) {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.h0;
                int i2 = jvmMethodSignature.f44138Y;
                if ((i2 & 1) != 1 || (i2 & 2) != 2) {
                    return null;
                }
                int i3 = jvmMethodSignature.Z;
                NameResolver nameResolver = kotlinProperty.d;
                return this.g0.c(nameResolver.getString(i3), nameResolver.getString(jvmMethodSignature.e0));
            }
        }
        return (Field) this.k0.getX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object s(Member member, Object obj) throws IllegalPropertyDelegateAccessException {
        Object objE;
        try {
            Object obj2 = m0;
            if (obj == obj2 && o().J() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            if (q()) {
                objE = InlineClassAwareCallerKt.a(this.j0, o());
            } else {
                objE = obj;
            }
            if (objE == obj2) {
                objE = null;
            }
            if (!q()) {
                obj = null;
            }
            if (obj == obj2) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(KCallablesJvm.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objE);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, new Object[0]);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objE == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    Intrinsics.e(cls, "fieldOrMethod.parameterTypes[0]");
                    objE = UtilKt.e(cls);
                }
                return method.invoke(null, objE);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                Intrinsics.e(cls2, "fieldOrMethod.parameterTypes[1]");
                obj = UtilKt.e(cls2);
            }
            return method2.invoke(null, objE, obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalPropertyDelegateAccessException("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final PropertyDescriptor o() {
        Object objInvoke = this.l0.invoke();
        Intrinsics.e(objInvoke, "_descriptor()");
        return (PropertyDescriptor) objInvoke;
    }

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f43418a;
        return ReflectionObjectRenderer.c(o());
    }

    public abstract Getter u();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.f(container, "container");
        Intrinsics.f(name, "name");
        Intrinsics.f(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KPropertyImpl(KDeclarationContainerImpl container, PropertyDescriptorImpl descriptor) {
        Intrinsics.f(container, "container");
        Intrinsics.f(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        Intrinsics.e(strB, "descriptor.name.asString()");
        this(container, strB, RuntimeTypeMapper.b(descriptor).getF(), descriptor, CallableReference.NO_RECEIVER);
    }
}
