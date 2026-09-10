package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ProtoContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NameResolver f44428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeTable f44429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SourceElement f44430c;

    public static final class Class extends ProtoContainer {
        public final ProtoBuf.Class d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Class f44431e;
        public final ClassId f;
        public final ProtoBuf.Class.Kind g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f44432h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(ProtoBuf.Class classProto, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, Class r6) {
            super(nameResolver, typeTable, sourceElement);
            Intrinsics.f(classProto, "classProto");
            Intrinsics.f(nameResolver, "nameResolver");
            this.d = classProto;
            this.f44431e = r6;
            this.f = NameResolverUtilKt.a(nameResolver, classProto.f0);
            ProtoBuf.Class.Kind kind = (ProtoBuf.Class.Kind) Flags.f.c(classProto.e0);
            this.g = kind == null ? ProtoBuf.Class.Kind.CLASS : kind;
            this.f44432h = Flags.g.e(classProto.e0).booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public final FqName a() {
            return this.f.b();
        }
    }

    public static final class Package extends ProtoContainer {
        public final FqName d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(FqName fqName, NameResolver nameResolver, TypeTable typeTable, JvmPackagePartSource jvmPackagePartSource) {
            super(nameResolver, typeTable, jvmPackagePartSource);
            Intrinsics.f(fqName, "fqName");
            Intrinsics.f(nameResolver, "nameResolver");
            this.d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public final FqName a() {
            return this.d;
        }
    }

    public ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
        this.f44428a = nameResolver;
        this.f44429b = typeTable;
        this.f44430c = sourceElement;
    }

    public abstract FqName a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
