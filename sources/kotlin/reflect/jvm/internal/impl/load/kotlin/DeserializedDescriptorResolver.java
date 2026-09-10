package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializedDescriptorResolver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f43991b = SetsKt.h(KotlinClassHeader.Kind.CLASS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f43992c = ArraysKt.O(new KotlinClassHeader.Kind[]{KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART});
    public static final JvmMetadataVersion d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final JvmMetadataVersion f43993e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeserializationComponents f43994a;

    public static final class Companion {
    }

    static {
        new JvmMetadataVersion(new int[]{1, 1, 2}, false);
        d = new JvmMetadataVersion(new int[]{1, 1, 11}, false);
        f43993e = new JvmMetadataVersion(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    public final DeserializedPackageMemberScope a(PackageFragmentDescriptor descriptor, KotlinJvmBinaryClass kotlinClass) {
        String[] strArr;
        Pair pairH;
        Intrinsics.f(descriptor, "descriptor");
        Intrinsics.f(kotlinClass, "kotlinClass");
        KotlinClassHeader kotlinClassHeaderD = kotlinClass.d();
        String[] strArr2 = kotlinClassHeaderD.f44023c;
        if (strArr2 == null) {
            strArr2 = kotlinClassHeaderD.d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!f43992c.contains(kotlinClassHeaderD.f44021a)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = kotlinClass.d().f44024e) != null) {
            try {
                try {
                    pairH = JvmProtoBufUtil.h(strArr2, strArr);
                } catch (InvalidProtocolBufferException e2) {
                    throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e2);
                }
            } catch (Throwable th) {
                c().f44393c.getClass();
                if (kotlinClass.d().f44022b.b(DeserializationHelpersKt.a(c().f44393c))) {
                    throw th;
                }
                pairH = null;
            }
            if (pairH != null) {
                JvmNameResolver jvmNameResolver = (JvmNameResolver) pairH.X;
                ProtoBuf.Package r4 = (ProtoBuf.Package) pairH.f43249Y;
                d(kotlinClass);
                e(kotlinClass);
                JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinClass, r4, jvmNameResolver, b(kotlinClass));
                return new DeserializedPackageMemberScope(descriptor, r4, jvmNameResolver, kotlinClass.d().f44022b, jvmPackagePartSource, c(), "scope for " + jvmPackagePartSource + " in " + descriptor, DeserializedDescriptorResolver$createKotlinPackagePartScope$2.X);
            }
        }
        return null;
    }

    public final DeserializedContainerAbiStability b(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        c().f44393c.getClass();
        DeserializedContainerAbiStability deserializedContainerAbiStability = DeserializedContainerAbiStability.X;
        int i2 = kotlinJvmBinaryClass.d().g;
        if (((i2 & 64) != 0) && (i2 & 32) == 0) {
            return DeserializedContainerAbiStability.f44455Y;
        }
        int i3 = kotlinJvmBinaryClass.d().g;
        return ((i3 & 16) == 0 || (i3 & 32) != 0) ? deserializedContainerAbiStability : DeserializedContainerAbiStability.Z;
    }

    public final DeserializationComponents c() {
        DeserializationComponents deserializationComponents = this.f43994a;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.m("components");
        throw null;
    }

    public final IncompatibleVersionErrorData d(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        c().f44393c.getClass();
        if (kotlinJvmBinaryClass.d().f44022b.b(DeserializationHelpersKt.a(c().f44393c))) {
            return null;
        }
        JvmMetadataVersion jvmMetadataVersion = kotlinJvmBinaryClass.d().f44022b;
        JvmMetadataVersion jvmMetadataVersion2 = JvmMetadataVersion.g;
        JvmMetadataVersion jvmMetadataVersionA = DeserializationHelpersKt.a(c().f44393c);
        JvmMetadataVersion jvmMetadataVersionA2 = DeserializationHelpersKt.a(c().f44393c);
        JvmMetadataVersion jvmMetadataVersion3 = kotlinJvmBinaryClass.d().f44022b;
        jvmMetadataVersionA2.getClass();
        JvmMetadataVersion jvmMetadataVersion4 = jvmMetadataVersion3.f ? jvmMetadataVersion2 : JvmMetadataVersion.f44154h;
        jvmMetadataVersion4.getClass();
        int i2 = jvmMetadataVersionA2.f44099b;
        int i3 = jvmMetadataVersion4.f44099b;
        if (i3 > i2 || (i3 >= i2 && jvmMetadataVersion4.f44100c > jvmMetadataVersionA2.f44100c)) {
            jvmMetadataVersionA2 = jvmMetadataVersion4;
        }
        return new IncompatibleVersionErrorData(jvmMetadataVersion, jvmMetadataVersion2, jvmMetadataVersionA, jvmMetadataVersionA2, kotlinJvmBinaryClass.getLocation(), kotlinJvmBinaryClass.a());
    }

    public final boolean e(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        c().f44393c.getClass();
        c().f44393c.getClass();
        return (kotlinJvmBinaryClass.d().g & 2) != 0 && kotlinJvmBinaryClass.d().f44022b.equals(d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public final ClassData f(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String[] strArr;
        Pair pairF;
        KotlinClassHeader kotlinClassHeaderD = kotlinJvmBinaryClass.d();
        String[] strArr2 = kotlinClassHeaderD.f44023c;
        if (strArr2 == null) {
            strArr2 = kotlinClassHeaderD.d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!f43991b.contains(kotlinClassHeaderD.f44021a)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = kotlinJvmBinaryClass.d().f44024e) != null) {
            try {
                try {
                    pairF = JvmProtoBufUtil.f(strArr2, strArr);
                } catch (InvalidProtocolBufferException e2) {
                    throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass.getLocation(), e2);
                }
            } catch (Throwable th) {
                c().f44393c.getClass();
                if (kotlinJvmBinaryClass.d().f44022b.b(DeserializationHelpersKt.a(c().f44393c))) {
                    throw th;
                }
                pairF = null;
            }
            if (pairF != null) {
                JvmNameResolver jvmNameResolver = (JvmNameResolver) pairF.X;
                ProtoBuf.Class r0 = (ProtoBuf.Class) pairF.f43249Y;
                d(kotlinJvmBinaryClass);
                e(kotlinJvmBinaryClass);
                return new ClassData(jvmNameResolver, r0, kotlinJvmBinaryClass.d().f44022b, new KotlinJvmBinarySourceElement(kotlinJvmBinaryClass, b(kotlinJvmBinaryClass)));
            }
        }
        return null;
    }
}
