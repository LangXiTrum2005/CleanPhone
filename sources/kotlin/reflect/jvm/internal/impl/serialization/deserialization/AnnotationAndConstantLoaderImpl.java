package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public final class AnnotationAndConstantLoaderImpl implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BuiltInSerializerProtocol f44377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnnotationDeserializer f44378b;

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AnnotationAndConstantLoaderImpl(ModuleDescriptor module, NotFoundClasses notFoundClasses, BuiltInSerializerProtocol protocol) {
        Intrinsics.f(module, "module");
        Intrinsics.f(protocol, "protocol");
        this.f44377a = protocol;
        this.f44378b = new AnnotationDeserializer(module, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList a(ProtoContainer.Class container) {
        Intrinsics.f(container, "container");
        Iterable iterable = (List) container.d.i(this.f44377a.f44368c);
        if (iterable == null) {
            iterable = EmptyList.X;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f44378b.a((ProtoBuf.Annotation) it.next(), container.f44428a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList b(ProtoBuf.Type proto, NameResolver nameResolver) {
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.i(this.f44377a.k);
        if (iterable == null) {
            iterable = EmptyList.X;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f44378b.a((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List c(ProtoContainer container, ProtoBuf.EnumEntry enumEntry) {
        Intrinsics.f(container, "container");
        Iterable iterable = (List) enumEntry.i(this.f44377a.f44370h);
        if (iterable == null) {
            iterable = EmptyList.X;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f44378b.a((ProtoBuf.Annotation) it.next(), container.f44428a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List d(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage callableProto, AnnotatedCallableKind annotatedCallableKind, int i2, ProtoBuf.ValueParameter valueParameter) {
        Intrinsics.f(callableProto, "callableProto");
        Iterable iterable = (List) valueParameter.i(this.f44377a.j);
        if (iterable == null) {
            iterable = EmptyList.X;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f44378b.a((ProtoBuf.Annotation) it.next(), protoContainer.f44428a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List e(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage proto, AnnotatedCallableKind annotatedCallableKind) {
        List list;
        Intrinsics.f(proto, "proto");
        boolean z2 = proto instanceof ProtoBuf.Constructor;
        BuiltInSerializerProtocol builtInSerializerProtocol = this.f44377a;
        if (z2) {
            list = (List) ((ProtoBuf.Constructor) proto).i(builtInSerializerProtocol.f44367b);
        } else if (proto instanceof ProtoBuf.Function) {
            list = (List) ((ProtoBuf.Function) proto).i(builtInSerializerProtocol.d);
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iOrdinal = annotatedCallableKind.ordinal();
            if (iOrdinal == 1) {
                list = (List) ((ProtoBuf.Property) proto).i(builtInSerializerProtocol.f44369e);
            } else if (iOrdinal == 2) {
                list = (List) ((ProtoBuf.Property) proto).i(builtInSerializerProtocol.f);
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((ProtoBuf.Property) proto).i(builtInSerializerProtocol.g);
            }
        }
        if (list == null) {
            list = EmptyList.X;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f44378b.a((ProtoBuf.Annotation) it.next(), protoContainer.f44428a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public final Object f(ProtoContainer protoContainer, ProtoBuf.Property proto, KotlinType kotlinType) {
        Intrinsics.f(proto, "proto");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final ArrayList g(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.i(this.f44377a.f44372l);
        if (iterable == null) {
            iterable = EmptyList.X;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f44378b.a((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public final Object h(ProtoContainer protoContainer, ProtoBuf.Property proto, KotlinType kotlinType) {
        Intrinsics.f(proto, "proto");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) ProtoBufUtilKt.a(proto, this.f44377a.f44371i);
        if (value == null) {
            return null;
        }
        return this.f44378b.c(kotlinType, value, protoContainer.f44428a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List i(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage proto, AnnotatedCallableKind annotatedCallableKind) {
        Intrinsics.f(proto, "proto");
        boolean z2 = proto instanceof ProtoBuf.Function;
        BuiltInSerializerProtocol builtInSerializerProtocol = this.f44377a;
        if (z2) {
            builtInSerializerProtocol.getClass();
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iOrdinal = annotatedCallableKind.ordinal();
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + annotatedCallableKind).toString());
            }
            builtInSerializerProtocol.getClass();
        }
        EmptyList emptyList = EmptyList.X;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(emptyList, 10));
        Iterator<E> it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f44378b.a((ProtoBuf.Annotation) it.next(), protoContainer.f44428a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List j(ProtoContainer protoContainer, ProtoBuf.Property proto) {
        Intrinsics.f(proto, "proto");
        this.f44377a.getClass();
        EmptyList emptyList = EmptyList.X;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(emptyList, 10));
        Iterator<E> it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f44378b.a((ProtoBuf.Annotation) it.next(), protoContainer.f44428a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public final List k(ProtoContainer protoContainer, ProtoBuf.Property proto) {
        Intrinsics.f(proto, "proto");
        this.f44377a.getClass();
        EmptyList emptyList = EmptyList.X;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(emptyList, 10));
        Iterator<E> it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f44378b.a((ProtoBuf.Annotation) it.next(), protoContainer.f44428a));
        }
        return arrayList;
    }
}
