package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, AnnotationsContainerWithConstants<? extends A, ? extends C>> implements AnnotationAndConstantLoader<A, C> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemoizedFunctionToNotNull f43960b;

    public static final class AnnotationsContainerWithConstants<A, C> extends AbstractBinaryClassAnnotationLoader.AnnotationsContainer<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f43961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f43962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f43963c;

        public AnnotationsContainerWithConstants(HashMap map, HashMap map2, HashMap map3) {
            this.f43961a = map;
            this.f43962b = map2;
            this.f43963c = map3;
        }
    }

    public AbstractBinaryClassAnnotationAndConstantLoader(LockBasedStorageManager lockBasedStorageManager, ReflectKotlinClassFinder reflectKotlinClassFinder) {
        super(reflectKotlinClassFinder);
        this.f43960b = lockBasedStorageManager.g(new Function1<KotlinJvmBinaryClass, AnnotationsContainerWithConstants<Object, Object>>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$storage$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinJvmBinaryClass kotlinClass = (KotlinJvmBinaryClass) obj;
                Intrinsics.f(kotlinClass, "kotlinClass");
                AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader = this.X;
                abstractBinaryClassAnnotationAndConstantLoader.getClass();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                kotlinClass.b(new AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1(abstractBinaryClassAnnotationAndConstantLoader, map, kotlinClass, map2));
                return new AbstractBinaryClassAnnotationAndConstantLoader.AnnotationsContainerWithConstants(map, map2, map3);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public final Object f(ProtoContainer protoContainer, ProtoBuf.Property proto, KotlinType kotlinType) {
        Intrinsics.f(proto, "proto");
        return v(protoContainer, proto, AnnotatedCallableKind.Z, kotlinType, AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationDefaultValue$1.X);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public final Object h(ProtoContainer protoContainer, ProtoBuf.Property proto, KotlinType kotlinType) {
        Intrinsics.f(proto, "proto");
        return v(protoContainer, proto, AnnotatedCallableKind.f44376Y, kotlinType, AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1.X);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public final AnnotationsContainerWithConstants m(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return (AnnotationsContainerWithConstants) this.f43960b.invoke(kotlinJvmBinaryClass);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    public final Object v(ProtoContainer protoContainer, ProtoBuf.Property property, AnnotatedCallableKind annotatedCallableKind, KotlinType kotlinType, Function2 function2) {
        Object objInvoke;
        KotlinJvmBinaryClass kotlinJvmBinaryClassP = p(protoContainer, true, true, Flags.f44102A.e(property.e0), JvmProtoBufUtil.d(property));
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
        if (kotlinJvmBinaryClassP != null) {
            JvmMetadataVersion jvmMetadataVersion = kotlinJvmBinaryClassP.d().f44022b;
            JvmMetadataVersion version = DeserializedDescriptorResolver.f43993e;
            Intrinsics.f(version, "version");
            MemberSignature memberSignatureN = AbstractBinaryClassAnnotationLoader.n(property, protoContainer.f44428a, protoContainer.f44429b, annotatedCallableKind, jvmMetadataVersion.a(version.f44099b, version.f44100c, version.d));
            if (memberSignatureN != null && (objInvoke = function2.invoke(this.f43960b.invoke(kotlinJvmBinaryClassP), memberSignatureN)) != null) {
                return UnsignedTypes.a(kotlinType) ? w(objInvoke) : objInvoke;
            }
        }
        return null;
    }

    public abstract ConstantValue w(Object obj);
}
