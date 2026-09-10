package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class JvmPackagePartSource implements DeserializedContainerSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JvmClassName f43998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JvmClassName f43999c;
    public final KotlinJvmBinaryClass d;

    public JvmPackagePartSource(KotlinJvmBinaryClass kotlinClass, ProtoBuf.Package packageProto, JvmNameResolver nameResolver, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        Intrinsics.f(kotlinClass, "kotlinClass");
        Intrinsics.f(packageProto, "packageProto");
        Intrinsics.f(nameResolver, "nameResolver");
        JvmClassName jvmClassNameB = JvmClassName.b(kotlinClass.a());
        KotlinClassHeader kotlinClassHeaderD = kotlinClass.d();
        kotlinClassHeaderD.getClass();
        JvmClassName jvmClassNameD = null;
        String str = kotlinClassHeaderD.f44021a == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART ? kotlinClassHeaderD.f : null;
        if (str != null && str.length() > 0) {
            jvmClassNameD = JvmClassName.d(str);
        }
        this.f43998b = jvmClassNameB;
        this.f43999c = jvmClassNameD;
        this.d = kotlinClass;
        GeneratedMessageLite.GeneratedExtension packageModuleName = JvmProtoBuf.m;
        Intrinsics.e(packageModuleName, "packageModuleName");
        Integer num = (Integer) ProtoBufUtilKt.a(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    public final ClassId b() {
        FqName fqName;
        JvmClassName jvmClassName = this.f43998b;
        String str = jvmClassName.f44320a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            fqName = FqName.f44164c;
            if (fqName == null) {
                JvmClassName.a(7);
                throw null;
            }
        } else {
            fqName = new FqName(str.substring(0, iLastIndexOf).replace(IOUtils.DIR_SEPARATOR_UNIX, '.'));
        }
        String strE = jvmClassName.e();
        Intrinsics.e(strE, "className.internalName");
        return new ClassId(fqName, Name.g(StringsKt.Q(IOUtils.DIR_SEPARATOR_UNIX, strE, strE)));
    }

    public final String toString() {
        return "JvmPackagePartSource: " + this.f43998b;
    }
}
