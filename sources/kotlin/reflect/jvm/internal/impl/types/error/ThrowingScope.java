package kotlin.reflect.jvm.internal.impl.types.error;

import androidx.media3.extractor.text.ttml.a;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ThrowingScope extends ErrorScope {
    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final /* bridge */ /* synthetic */ Collection b(Name name, NoLookupLocation noLookupLocation) {
        b(name, noLookupLocation);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final /* bridge */ /* synthetic */ Collection d(Name name, LookupLocation lookupLocation) {
        d(name, (NoLookupLocation) lookupLocation);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set e() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        throw new IllegalStateException(this.f44583b + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        throw new IllegalStateException(this.f44583b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    /* JADX INFO: renamed from: h */
    public final Set d(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        throw new IllegalStateException(this.f44583b + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    /* JADX INFO: renamed from: i */
    public final Set b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        throw new IllegalStateException(this.f44583b + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    public final String toString() {
        return a.p(new StringBuilder("ThrowingScope{"), this.f44583b, AbstractJsonLexerKt.END_OBJ);
    }
}
