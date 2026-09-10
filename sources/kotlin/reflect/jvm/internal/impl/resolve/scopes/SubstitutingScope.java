package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public final class SubstitutingScope implements MemberScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemberScope f44355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f44356c;
    public final TypeSubstitutor d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f44357e;
    public final Lazy f;

    public SubstitutingScope(MemberScope workerScope, final TypeSubstitutor givenSubstitutor) {
        Intrinsics.f(workerScope, "workerScope");
        Intrinsics.f(givenSubstitutor, "givenSubstitutor");
        this.f44355b = workerScope;
        this.f44356c = LazyKt.b(new Function0<TypeSubstitutor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$substitutor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TypeSubstitution typeSubstitutionF = givenSubstitutor.f();
                typeSubstitutionF.getClass();
                return new TypeSubstitutor(typeSubstitutionF);
            }
        });
        TypeSubstitution typeSubstitutionF = givenSubstitutor.f();
        Intrinsics.e(typeSubstitutionF, "givenSubstitutor.substitution");
        this.d = new TypeSubstitutor(CapturedTypeConstructorKt.b(typeSubstitutionF));
        this.f = LazyKt.b(new Function0<Collection<? extends DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$_allDescriptors$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SubstitutingScope substitutingScope = this.X;
                return substitutingScope.h(ResolutionScope.DefaultImpls.a(substitutingScope.f44355b, null, 3));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        return this.f44355b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        return h(this.f44355b.b(name, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        return this.f44355b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection d(Name name, LookupLocation lookupLocation) {
        Intrinsics.f(name, "name");
        return h(this.f44355b.d(name, lookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set e() {
        return this.f44355b.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        ClassifierDescriptor classifierDescriptorF = this.f44355b.f(name, location);
        if (classifierDescriptorF != null) {
            return (ClassifierDescriptor) i(classifierDescriptorF);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        return (Collection) this.f.getX();
    }

    public final Collection h(Collection collection) {
        if (this.d.f44551a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((DeclarationDescriptor) it.next()));
        }
        return linkedHashSet;
    }

    public final DeclarationDescriptor i(DeclarationDescriptor declarationDescriptor) {
        TypeSubstitutor typeSubstitutor = this.d;
        if (typeSubstitutor.f44551a.e()) {
            return declarationDescriptor;
        }
        if (this.f44357e == null) {
            this.f44357e = new HashMap();
        }
        HashMap map = this.f44357e;
        Intrinsics.c(map);
        Object objB = map.get(declarationDescriptor);
        if (objB == null) {
            if (!(declarationDescriptor instanceof Substitutable)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + declarationDescriptor).toString());
            }
            objB = ((Substitutable) declarationDescriptor).b(typeSubstitutor);
            if (objB == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + declarationDescriptor + " substitution fails");
            }
            map.put(declarationDescriptor, objB);
        }
        return (DeclarationDescriptor) objB;
    }
}
