package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AnnotationsContainer<? extends A>> implements AnnotationLoader<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReflectKotlinClassFinder f43970a;

    public static abstract class AnnotationsContainer<A> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PropertyRelatedElement {
        public static final PropertyRelatedElement X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final PropertyRelatedElement f43971Y;
        public static final PropertyRelatedElement Z;
        public static final /* synthetic */ PropertyRelatedElement[] e0;

        static {
            PropertyRelatedElement propertyRelatedElement = new PropertyRelatedElement("PROPERTY", 0);
            X = propertyRelatedElement;
            PropertyRelatedElement propertyRelatedElement2 = new PropertyRelatedElement("BACKING_FIELD", 1);
            f43971Y = propertyRelatedElement2;
            PropertyRelatedElement propertyRelatedElement3 = new PropertyRelatedElement("DELEGATE_FIELD", 2);
            Z = propertyRelatedElement3;
            e0 = new PropertyRelatedElement[]{propertyRelatedElement, propertyRelatedElement2, propertyRelatedElement3};
        }

        public static PropertyRelatedElement valueOf(String str) {
            return (PropertyRelatedElement) Enum.valueOf(PropertyRelatedElement.class, str);
        }

        public static PropertyRelatedElement[] values() {
            return (PropertyRelatedElement[]) e0.clone();
        }
    }

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AbstractBinaryClassAnnotationLoader(ReflectKotlinClassFinder reflectKotlinClassFinder) {
        this.f43970a = reflectKotlinClassFinder;
    }

    public static List l(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MemberSignature memberSignature, Boolean bool, boolean z2, int i2) {
        List list;
        KotlinJvmBinaryClass kotlinJvmBinaryClass = null;
        KotlinJvmBinaryClass kotlinJvmBinaryClassP = abstractBinaryClassAnnotationLoader.p(protoContainer, (i2 & 4) == 0, false, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? false : z2);
        if (kotlinJvmBinaryClassP != null) {
            kotlinJvmBinaryClass = kotlinJvmBinaryClassP;
        } else if (protoContainer instanceof ProtoContainer.Class) {
            SourceElement sourceElement = ((ProtoContainer.Class) protoContainer).f44430c;
            KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = sourceElement instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) sourceElement : null;
            if (kotlinJvmBinarySourceElement != null) {
                kotlinJvmBinaryClass = kotlinJvmBinarySourceElement.f44011b;
            }
        }
        return (kotlinJvmBinaryClass == null || (list = (List) abstractBinaryClassAnnotationLoader.m(kotlinJvmBinaryClass).f43961a.get(memberSignature)) == null) ? EmptyList.X : list;
    }

    public static MemberSignature n(GeneratedMessageLite.ExtendableMessage proto, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z2) {
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        if (proto instanceof ProtoBuf.Constructor) {
            ExtensionRegistryLite extensionRegistryLite = JvmProtoBufUtil.f44158a;
            JvmMemberSignature.Method methodA = JvmProtoBufUtil.a((ProtoBuf.Constructor) proto, nameResolver, typeTable);
            if (methodA != null) {
                return MemberSignature.Companion.b(methodA);
            }
        } else if (proto instanceof ProtoBuf.Function) {
            ExtensionRegistryLite extensionRegistryLite2 = JvmProtoBufUtil.f44158a;
            JvmMemberSignature.Method methodC = JvmProtoBufUtil.c((ProtoBuf.Function) proto, nameResolver, typeTable);
            if (methodC != null) {
                return MemberSignature.Companion.b(methodC);
            }
        } else if (proto instanceof ProtoBuf.Property) {
            GeneratedMessageLite.GeneratedExtension propertySignature = JvmProtoBuf.d;
            Intrinsics.e(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.a(proto, propertySignature);
            if (jvmPropertySignature != null) {
                int iOrdinal = annotatedCallableKind.ordinal();
                if (iOrdinal == 1) {
                    return AbstractBinaryClassAnnotationLoaderKt.a((ProtoBuf.Property) proto, nameResolver, typeTable, true, true, z2);
                }
                if (iOrdinal == 2) {
                    if ((jvmPropertySignature.f44140Y & 4) != 4) {
                        return null;
                    }
                    JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.f0;
                    Intrinsics.e(jvmMethodSignature, "signature.getter");
                    return MemberSignature.Companion.c(nameResolver, jvmMethodSignature);
                }
                if (iOrdinal != 3 || (jvmPropertySignature.f44140Y & 8) != 8) {
                    return null;
                }
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature2 = jvmPropertySignature.g0;
                Intrinsics.e(jvmMethodSignature2, "signature.setter");
                return MemberSignature.Companion.c(nameResolver, jvmMethodSignature2);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList a(ProtoContainer.Class container) {
        Intrinsics.f(container, "container");
        SourceElement sourceElement = container.f44430c;
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = sourceElement instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) sourceElement : null;
        KotlinJvmBinaryClass kotlinJvmBinaryClass = kotlinJvmBinarySourceElement != null ? kotlinJvmBinarySourceElement.f44011b : null;
        if (kotlinJvmBinaryClass != null) {
            final ArrayList arrayList = new ArrayList(1);
            kotlinJvmBinaryClass.c(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$loadClassAnnotations$1
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public final void a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId, ReflectAnnotationSource reflectAnnotationSource) {
                    return this.f43972a.s(classId, reflectAnnotationSource, arrayList);
                }
            });
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.f.b()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList b(ProtoBuf.Type proto, NameResolver nameResolver) {
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        Object objI = proto.i(JvmProtoBuf.f);
        Intrinsics.e(objI, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) objI;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(iterable, 10));
        for (ProtoBuf.Annotation it : iterable) {
            Intrinsics.e(it, "it");
            arrayList.add(u(it, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List c(ProtoContainer container, ProtoBuf.EnumEntry enumEntry) {
        Intrinsics.f(container, "container");
        return l(this, container, MemberSignature.Companion.a(container.f44428a.getString(enumEntry.e0), ClassMapperLite.b(((ProtoContainer.Class) container).f.c())), null, false, 60);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List d(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage callableProto, AnnotatedCallableKind annotatedCallableKind, int i2, ProtoBuf.ValueParameter valueParameter) {
        Intrinsics.f(callableProto, "callableProto");
        int i3 = 0;
        MemberSignature memberSignatureN = n(callableProto, protoContainer.f44428a, protoContainer.f44429b, annotatedCallableKind, false);
        if (memberSignatureN == null) {
            return EmptyList.X;
        }
        if (callableProto instanceof ProtoBuf.Function) {
            int i4 = ((ProtoBuf.Function) callableProto).Z;
            if ((i4 & 32) == 32 || (i4 & 64) == 64) {
                i3 = 1;
            }
        } else if (callableProto instanceof ProtoBuf.Property) {
            int i5 = ((ProtoBuf.Property) callableProto).Z;
            if ((i5 & 32) == 32 || (i5 & 64) == 64) {
                i3 = 1;
            }
        } else {
            if (!(callableProto instanceof ProtoBuf.Constructor)) {
                throw new UnsupportedOperationException("Unsupported message: " + callableProto.getClass());
            }
            ProtoContainer.Class r8 = (ProtoContainer.Class) protoContainer;
            if (r8.g == ProtoBuf.Class.Kind.ENUM_CLASS) {
                i3 = 2;
            } else if (r8.f44432h) {
                i3 = 1;
            }
        }
        return l(this, protoContainer, MemberSignature.Companion.e(memberSignatureN, i2 + i3), null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List e(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage proto, AnnotatedCallableKind annotatedCallableKind) {
        Intrinsics.f(proto, "proto");
        if (annotatedCallableKind == AnnotatedCallableKind.f44376Y) {
            return t(protoContainer, (ProtoBuf.Property) proto, PropertyRelatedElement.X);
        }
        MemberSignature memberSignatureN = n(proto, protoContainer.f44428a, protoContainer.f44429b, annotatedCallableKind, false);
        return memberSignatureN == null ? EmptyList.X : l(this, protoContainer, memberSignatureN, null, false, 60);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList g(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        Object objI = proto.i(JvmProtoBuf.f44132h);
        Intrinsics.e(objI, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) objI;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(iterable, 10));
        for (ProtoBuf.Annotation it : iterable) {
            Intrinsics.e(it, "it");
            arrayList.add(u(it, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List i(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage proto, AnnotatedCallableKind annotatedCallableKind) {
        Intrinsics.f(proto, "proto");
        MemberSignature memberSignatureN = n(proto, protoContainer.f44428a, protoContainer.f44429b, annotatedCallableKind, false);
        return memberSignatureN != null ? l(this, protoContainer, MemberSignature.Companion.e(memberSignatureN, 0), null, false, 60) : EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List j(ProtoContainer protoContainer, ProtoBuf.Property proto) {
        Intrinsics.f(proto, "proto");
        return t(protoContainer, proto, PropertyRelatedElement.f43971Y);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List k(ProtoContainer protoContainer, ProtoBuf.Property proto) {
        Intrinsics.f(proto, "proto");
        return t(protoContainer, proto, PropertyRelatedElement.Z);
    }

    public abstract AbstractBinaryClassAnnotationAndConstantLoader.AnnotationsContainerWithConstants m(KotlinJvmBinaryClass kotlinJvmBinaryClass);

    public abstract JvmMetadataVersion o();

    public final KotlinJvmBinaryClass p(ProtoContainer container, boolean z2, boolean z3, Boolean bool, boolean z4) {
        ProtoContainer.Class r7;
        Intrinsics.f(container, "container");
        ProtoBuf.Class.Kind kind = ProtoBuf.Class.Kind.INTERFACE;
        ReflectKotlinClassFinder reflectKotlinClassFinder = this.f43970a;
        SourceElement sourceElement = container.f44430c;
        if (z2) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
            if (container instanceof ProtoContainer.Class) {
                ProtoContainer.Class r8 = (ProtoContainer.Class) container;
                if (r8.g == kind) {
                    return KotlinClassFinderKt.a(reflectKotlinClassFinder, r8.f.d(Name.g("DefaultImpls")), o());
                }
            }
            if (bool.booleanValue() && (container instanceof ProtoContainer.Package)) {
                JvmPackagePartSource jvmPackagePartSource = sourceElement instanceof JvmPackagePartSource ? (JvmPackagePartSource) sourceElement : null;
                JvmClassName jvmClassName = jvmPackagePartSource != null ? jvmPackagePartSource.f43999c : null;
                if (jvmClassName != null) {
                    String strE = jvmClassName.e();
                    Intrinsics.e(strE, "facadeClassName.internalName");
                    return KotlinClassFinderKt.a(reflectKotlinClassFinder, ClassId.j(new FqName(StringsKt.H(strE, IOUtils.DIR_SEPARATOR_UNIX, '.'))), o());
                }
            }
        }
        if (z3 && (container instanceof ProtoContainer.Class)) {
            ProtoContainer.Class r9 = (ProtoContainer.Class) container;
            if (r9.g == ProtoBuf.Class.Kind.COMPANION_OBJECT && (r7 = r9.f44431e) != null) {
                ProtoBuf.Class.Kind kind2 = ProtoBuf.Class.Kind.CLASS;
                ProtoBuf.Class.Kind kind3 = r7.g;
                if (kind3 == kind2 || kind3 == ProtoBuf.Class.Kind.ENUM_CLASS || (z4 && (kind3 == kind || kind3 == ProtoBuf.Class.Kind.ANNOTATION_CLASS))) {
                    SourceElement sourceElement2 = r7.f44430c;
                    KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = sourceElement2 instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) sourceElement2 : null;
                    if (kotlinJvmBinarySourceElement != null) {
                        return kotlinJvmBinarySourceElement.f44011b;
                    }
                    return null;
                }
            }
        }
        if (!(container instanceof ProtoContainer.Package) || !(sourceElement instanceof JvmPackagePartSource)) {
            return null;
        }
        Intrinsics.d(sourceElement, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) sourceElement;
        KotlinJvmBinaryClass kotlinJvmBinaryClass = jvmPackagePartSource2.d;
        return kotlinJvmBinaryClass == null ? KotlinClassFinderKt.a(reflectKotlinClassFinder, jvmPackagePartSource2.b(), o()) : kotlinJvmBinaryClass;
    }

    public final boolean q(ClassId classId) throws InvocationTargetException {
        KotlinJvmBinaryClass kotlinJvmBinaryClassA;
        if (classId.f() == null || !Intrinsics.a(classId.i().b(), "Container") || (kotlinJvmBinaryClassA = KotlinClassFinderKt.a(this.f43970a, classId, o())) == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = SpecialJvmAnnotations.f43453a;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ((ReflectKotlinClass) kotlinJvmBinaryClassA).c(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations$isAnnotatedWithContainerMetaAnnotation$1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public final void a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId2, ReflectAnnotationSource reflectAnnotationSource) {
                if (!classId2.equals(JvmAbi.f43764b)) {
                    return null;
                }
                booleanRef.X = true;
                return null;
            }
        });
        return booleanRef.X;
    }

    public abstract BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 r(ClassId classId, SourceElement sourceElement, List list);

    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor s(ClassId classId, ReflectAnnotationSource reflectAnnotationSource, List result) {
        Intrinsics.f(result, "result");
        if (SpecialJvmAnnotations.f43453a.contains(classId)) {
            return null;
        }
        return r(classId, reflectAnnotationSource, result);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    public final List t(ProtoContainer protoContainer, ProtoBuf.Property property, PropertyRelatedElement propertyRelatedElement) {
        List list;
        Boolean boolE = Flags.f44102A.e(property.e0);
        boolean zD = JvmProtoBufUtil.d(property);
        PropertyRelatedElement propertyRelatedElement2 = PropertyRelatedElement.X;
        EmptyList emptyList = EmptyList.X;
        TypeTable typeTable = protoContainer.f44429b;
        NameResolver nameResolver = protoContainer.f44428a;
        if (propertyRelatedElement == propertyRelatedElement2) {
            MemberSignature memberSignatureA = AbstractBinaryClassAnnotationLoaderKt.a(property, nameResolver, typeTable, (40 & 8) == 0, (40 & 16) == 0, true);
            if (memberSignatureA != null) {
                return l(this, protoContainer, memberSignatureA, boolE, zD, 8);
            }
        } else {
            MemberSignature memberSignatureA2 = AbstractBinaryClassAnnotationLoaderKt.a(property, nameResolver, typeTable, (40 & 8) == 0, (40 & 16) == 0, true);
            if (memberSignatureA2 != null) {
                if (StringsKt.l(memberSignatureA2.f44012a, "$delegate", false) == (propertyRelatedElement == PropertyRelatedElement.Z)) {
                    KotlinJvmBinaryClass kotlinJvmBinaryClassP = p(protoContainer, true, true, boolE, zD);
                    if (kotlinJvmBinaryClassP == null) {
                        if (protoContainer instanceof ProtoContainer.Class) {
                            SourceElement sourceElement = ((ProtoContainer.Class) protoContainer).f44430c;
                            KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = sourceElement instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) sourceElement : null;
                            if (kotlinJvmBinarySourceElement != null) {
                                kotlinJvmBinaryClassP = kotlinJvmBinarySourceElement.f44011b;
                            } else {
                                kotlinJvmBinaryClassP = null;
                            }
                        } else {
                            kotlinJvmBinaryClassP = null;
                        }
                    }
                    return (kotlinJvmBinaryClassP == null || (list = (List) m(kotlinJvmBinaryClassP).f43961a.get(memberSignatureA2)) == null) ? emptyList : list;
                }
            }
        }
        return emptyList;
    }

    public abstract AnnotationDescriptorImpl u(ProtoBuf.Annotation annotation, NameResolver nameResolver);
}
