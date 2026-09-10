package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes7.dex */
public final class ErrorUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ErrorUtils f44590a = new ErrorUtils();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ErrorModuleDescriptor f44591b = ErrorModuleDescriptor.X;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ErrorClassDescriptor f44592c = new ErrorClassDescriptor(Name.i(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final ErrorType d = c(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ErrorType f44593e = c(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
    public static final Set f = SetsKt.h(new ErrorPropertyDescriptor());

    public static final ErrorScope a(ErrorScopeKind errorScopeKind, boolean z2, String... formatParams) {
        Intrinsics.f(formatParams, "formatParams");
        if (!z2) {
            return new ErrorScope(errorScopeKind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        }
        String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
        Intrinsics.f(formatParams2, "formatParams");
        return new ThrowingScope(errorScopeKind, (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
    }

    public static final ErrorScope b(ErrorScopeKind errorScopeKind, String... strArr) {
        return a(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final ErrorType c(ErrorTypeKind kind, String... strArr) {
        Intrinsics.f(kind, "kind");
        EmptyList emptyList = EmptyList.X;
        String[] formatParams = (String[]) Arrays.copyOf(strArr, strArr.length);
        Intrinsics.f(formatParams, "formatParams");
        return e(kind, emptyList, d(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static ErrorTypeConstructor d(ErrorTypeKind kind, String... formatParams) {
        Intrinsics.f(kind, "kind");
        Intrinsics.f(formatParams, "formatParams");
        return new ErrorTypeConstructor(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static ErrorType e(ErrorTypeKind kind, List list, TypeConstructor typeConstructor, String... formatParams) {
        Intrinsics.f(kind, "kind");
        Intrinsics.f(formatParams, "formatParams");
        return new ErrorType(typeConstructor, b(ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, list, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean f(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return (declarationDescriptor instanceof ErrorClassDescriptor) || (declarationDescriptor.d() instanceof ErrorClassDescriptor) || declarationDescriptor == f44591b;
        }
        return false;
    }
}
