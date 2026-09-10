package kotlin.reflect.jvm.internal.impl.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes7.dex */
public class SerializerExtensionProtocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtensionRegistryLite f44366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GeneratedMessageLite.GeneratedExtension f44367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GeneratedMessageLite.GeneratedExtension f44368c;
    public final GeneratedMessageLite.GeneratedExtension d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GeneratedMessageLite.GeneratedExtension f44369e;
    public final GeneratedMessageLite.GeneratedExtension f;
    public final GeneratedMessageLite.GeneratedExtension g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GeneratedMessageLite.GeneratedExtension f44370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GeneratedMessageLite.GeneratedExtension f44371i;
    public final GeneratedMessageLite.GeneratedExtension j;
    public final GeneratedMessageLite.GeneratedExtension k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final GeneratedMessageLite.GeneratedExtension f44372l;

    public SerializerExtensionProtocol(ExtensionRegistryLite extensionRegistryLite, GeneratedMessageLite.GeneratedExtension packageFqName, GeneratedMessageLite.GeneratedExtension constructorAnnotation, GeneratedMessageLite.GeneratedExtension classAnnotation, GeneratedMessageLite.GeneratedExtension functionAnnotation, GeneratedMessageLite.GeneratedExtension propertyAnnotation, GeneratedMessageLite.GeneratedExtension propertyGetterAnnotation, GeneratedMessageLite.GeneratedExtension propertySetterAnnotation, GeneratedMessageLite.GeneratedExtension enumEntryAnnotation, GeneratedMessageLite.GeneratedExtension compileTimeValue, GeneratedMessageLite.GeneratedExtension parameterAnnotation, GeneratedMessageLite.GeneratedExtension typeAnnotation, GeneratedMessageLite.GeneratedExtension typeParameterAnnotation) {
        Intrinsics.f(packageFqName, "packageFqName");
        Intrinsics.f(constructorAnnotation, "constructorAnnotation");
        Intrinsics.f(classAnnotation, "classAnnotation");
        Intrinsics.f(functionAnnotation, "functionAnnotation");
        Intrinsics.f(propertyAnnotation, "propertyAnnotation");
        Intrinsics.f(propertyGetterAnnotation, "propertyGetterAnnotation");
        Intrinsics.f(propertySetterAnnotation, "propertySetterAnnotation");
        Intrinsics.f(enumEntryAnnotation, "enumEntryAnnotation");
        Intrinsics.f(compileTimeValue, "compileTimeValue");
        Intrinsics.f(parameterAnnotation, "parameterAnnotation");
        Intrinsics.f(typeAnnotation, "typeAnnotation");
        Intrinsics.f(typeParameterAnnotation, "typeParameterAnnotation");
        this.f44366a = extensionRegistryLite;
        this.f44367b = constructorAnnotation;
        this.f44368c = classAnnotation;
        this.d = functionAnnotation;
        this.f44369e = propertyAnnotation;
        this.f = propertyGetterAnnotation;
        this.g = propertySetterAnnotation;
        this.f44370h = enumEntryAnnotation;
        this.f44371i = compileTimeValue;
        this.j = parameterAnnotation;
        this.k = typeAnnotation;
        this.f44372l = typeParameterAnnotation;
    }
}
