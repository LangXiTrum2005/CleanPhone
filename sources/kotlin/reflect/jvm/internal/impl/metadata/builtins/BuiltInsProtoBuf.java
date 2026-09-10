package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: loaded from: classes7.dex */
public final class BuiltInsProtoBuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44091a = GeneratedMessageLite.d(ProtoBuf.Package.l0, 0, null, 151, WireFormat.FieldType.h0, Integer.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44093c;
    public static final GeneratedMessageLite.GeneratedExtension d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44094e;
    public static final GeneratedMessageLite.GeneratedExtension f;
    public static final GeneratedMessageLite.GeneratedExtension g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44096i;
    public static final GeneratedMessageLite.GeneratedExtension j;
    public static final GeneratedMessageLite.GeneratedExtension k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension f44097l;

    static {
        ProtoBuf.Class r0 = ProtoBuf.Class.K0;
        ProtoBuf.Annotation annotation = ProtoBuf.Annotation.h0;
        WireFormat.FieldType fieldType = WireFormat.FieldType.n0;
        f44092b = GeneratedMessageLite.c(r0, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        f44093c = GeneratedMessageLite.c(ProtoBuf.Constructor.j0, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        d = GeneratedMessageLite.c(ProtoBuf.Function.v0, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        ProtoBuf.Property property = ProtoBuf.Property.v0;
        f44094e = GeneratedMessageLite.c(property, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        f = GeneratedMessageLite.c(property, annotation, 152, fieldType, ProtoBuf.Annotation.class);
        g = GeneratedMessageLite.c(property, annotation, 153, fieldType, ProtoBuf.Annotation.class);
        ProtoBuf.Annotation.Argument.Value value = ProtoBuf.Annotation.Argument.Value.q0;
        f44095h = GeneratedMessageLite.d(property, value, value, 151, fieldType, ProtoBuf.Annotation.Argument.Value.class);
        f44096i = GeneratedMessageLite.c(ProtoBuf.EnumEntry.h0, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        j = GeneratedMessageLite.c(ProtoBuf.ValueParameter.m0, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        k = GeneratedMessageLite.c(ProtoBuf.Type.u0, annotation, 150, fieldType, ProtoBuf.Annotation.class);
        f44097l = GeneratedMessageLite.c(ProtoBuf.TypeParameter.n0, annotation, 150, fieldType, ProtoBuf.Annotation.class);
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.a(f44091a);
        extensionRegistryLite.a(f44092b);
        extensionRegistryLite.a(f44093c);
        extensionRegistryLite.a(d);
        extensionRegistryLite.a(f44094e);
        extensionRegistryLite.a(f);
        extensionRegistryLite.a(g);
        extensionRegistryLite.a(f44095h);
        extensionRegistryLite.a(f44096i);
        extensionRegistryLite.a(j);
        extensionRegistryLite.a(k);
        extensionRegistryLite.a(f44097l);
    }
}
