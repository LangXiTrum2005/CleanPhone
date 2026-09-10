package kotlin.reflect.jvm.internal.impl.types.error;

import androidx.media3.extractor.text.ttml.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class ErrorScope implements MemberScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44583b;

    public ErrorScope(ErrorScopeKind errorScopeKind, String... formatParams) {
        Intrinsics.f(formatParams, "formatParams");
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f44583b = String.format(errorScopeKind.X, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set a() {
        return EmptySet.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set c() {
        return EmptySet.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set e() {
        return EmptySet.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        return new ErrorClassDescriptor(Name.i(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name}, 1))));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        return EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set d(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        ErrorClassDescriptor containingDeclaration = ErrorUtils.f44592c;
        Intrinsics.f(containingDeclaration, "containingDeclaration");
        ErrorFunctionDescriptor errorFunctionDescriptor = new ErrorFunctionDescriptor(containingDeclaration, null, Annotations.Companion.f43614a, Name.i("<Error function>"), CallableMemberDescriptor.Kind.X, SourceElement.f43591a);
        EmptyList emptyList = EmptyList.X;
        errorFunctionDescriptor.J0(null, null, emptyList, emptyList, emptyList, ErrorUtils.c(ErrorTypeKind.RETURN_TYPE_FOR_FUNCTION, new String[0]), Modality.Z, DescriptorVisibilities.f43564e);
        return SetsKt.h(errorFunctionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        return ErrorUtils.f;
    }

    public String toString() {
        return a.p(new StringBuilder("ErrorScope{"), this.f44583b, AbstractJsonLexerKt.END_OBJ);
    }
}
