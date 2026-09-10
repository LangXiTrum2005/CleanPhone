package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: loaded from: classes7.dex */
public final class ProtoTypeTableUtilKt {
    public static final ProtoBuf.Type a(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.f(type, "<this>");
        int i2 = type.Z;
        if ((i2 & 256) == 256) {
            return type.n0;
        }
        if ((i2 & 512) == 512) {
            return typeTable.a(type.o0);
        }
        return null;
    }

    public static final ProtoBuf.Type b(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.f(function, "<this>");
        Intrinsics.f(typeTable, "typeTable");
        int i2 = function.Z;
        if ((i2 & 32) == 32) {
            return function.k0;
        }
        if ((i2 & 64) == 64) {
            return typeTable.a(function.l0);
        }
        return null;
    }

    public static final ProtoBuf.Type c(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.f(function, "<this>");
        Intrinsics.f(typeTable, "typeTable");
        int i2 = function.Z;
        if ((i2 & 8) == 8) {
            ProtoBuf.Type returnType = function.h0;
            Intrinsics.e(returnType, "returnType");
            return returnType;
        }
        if ((i2 & 16) == 16) {
            return typeTable.a(function.i0);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final ProtoBuf.Type d(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.f(property, "<this>");
        Intrinsics.f(typeTable, "typeTable");
        int i2 = property.Z;
        if ((i2 & 8) == 8) {
            ProtoBuf.Type returnType = property.h0;
            Intrinsics.e(returnType, "returnType");
            return returnType;
        }
        if ((i2 & 16) == 16) {
            return typeTable.a(property.i0);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static final ProtoBuf.Type e(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        Intrinsics.f(typeTable, "typeTable");
        int i2 = valueParameter.Z;
        if ((i2 & 4) == 4) {
            ProtoBuf.Type type = valueParameter.g0;
            Intrinsics.e(type, "type");
            return type;
        }
        if ((i2 & 8) == 8) {
            return typeTable.a(valueParameter.h0);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }
}
