package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class BuiltInSerializerProtocol extends SerializerExtensionProtocol {
    public static final BuiltInSerializerProtocol m;

    static {
        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
        BuiltInsProtoBuf.a(extensionRegistryLite);
        GeneratedMessageLite.GeneratedExtension packageFqName = BuiltInsProtoBuf.f44091a;
        Intrinsics.e(packageFqName, "packageFqName");
        GeneratedMessageLite.GeneratedExtension constructorAnnotation = BuiltInsProtoBuf.f44093c;
        Intrinsics.e(constructorAnnotation, "constructorAnnotation");
        GeneratedMessageLite.GeneratedExtension classAnnotation = BuiltInsProtoBuf.f44092b;
        Intrinsics.e(classAnnotation, "classAnnotation");
        GeneratedMessageLite.GeneratedExtension functionAnnotation = BuiltInsProtoBuf.d;
        Intrinsics.e(functionAnnotation, "functionAnnotation");
        GeneratedMessageLite.GeneratedExtension propertyAnnotation = BuiltInsProtoBuf.f44094e;
        Intrinsics.e(propertyAnnotation, "propertyAnnotation");
        GeneratedMessageLite.GeneratedExtension propertyGetterAnnotation = BuiltInsProtoBuf.f;
        Intrinsics.e(propertyGetterAnnotation, "propertyGetterAnnotation");
        GeneratedMessageLite.GeneratedExtension propertySetterAnnotation = BuiltInsProtoBuf.g;
        Intrinsics.e(propertySetterAnnotation, "propertySetterAnnotation");
        GeneratedMessageLite.GeneratedExtension enumEntryAnnotation = BuiltInsProtoBuf.f44096i;
        Intrinsics.e(enumEntryAnnotation, "enumEntryAnnotation");
        GeneratedMessageLite.GeneratedExtension compileTimeValue = BuiltInsProtoBuf.f44095h;
        Intrinsics.e(compileTimeValue, "compileTimeValue");
        GeneratedMessageLite.GeneratedExtension parameterAnnotation = BuiltInsProtoBuf.j;
        Intrinsics.e(parameterAnnotation, "parameterAnnotation");
        GeneratedMessageLite.GeneratedExtension typeAnnotation = BuiltInsProtoBuf.k;
        Intrinsics.e(typeAnnotation, "typeAnnotation");
        GeneratedMessageLite.GeneratedExtension typeParameterAnnotation = BuiltInsProtoBuf.f44097l;
        Intrinsics.e(typeParameterAnnotation, "typeParameterAnnotation");
        m = new BuiltInSerializerProtocol(extensionRegistryLite, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public static String a(FqName fqName) {
        String strB;
        Intrinsics.f(fqName, "fqName");
        StringBuilder sb = new StringBuilder();
        sb.append(StringsKt.H(fqName.b(), '.', IOUtils.DIR_SEPARATOR_UNIX));
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        if (fqName.d()) {
            strB = "default-package";
        } else {
            strB = fqName.f().b();
            Intrinsics.e(strB, "fqName.shortName().asString()");
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
