package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class NameResolverUtilKt {
    public static final ClassId a(NameResolver nameResolver, int i2) {
        Intrinsics.f(nameResolver, "<this>");
        return ClassId.e(nameResolver.b(i2), nameResolver.a(i2));
    }

    public static final Name b(NameResolver nameResolver, int i2) {
        Intrinsics.f(nameResolver, "<this>");
        return Name.f(nameResolver.getString(i2));
    }
}
