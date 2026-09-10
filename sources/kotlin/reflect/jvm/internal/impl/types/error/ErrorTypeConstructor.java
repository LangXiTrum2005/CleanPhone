package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes7.dex */
public final class ErrorTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ErrorTypeKind f44586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f44587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44588c;

    public ErrorTypeConstructor(ErrorTypeKind kind, String... formatParams) {
        Intrinsics.f(kind, "kind");
        Intrinsics.f(formatParams, "formatParams");
        this.f44586a = kind;
        this.f44587b = formatParams;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f44588c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(kind.X, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor c() {
        ErrorUtils.f44590a.getClass();
        return ErrorUtils.f44592c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection d() {
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean e() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns k() {
        DefaultBuiltIns defaultBuiltIns = DefaultBuiltIns.g;
        return DefaultBuiltIns.g;
    }

    public final String toString() {
        return this.f44588c;
    }
}
