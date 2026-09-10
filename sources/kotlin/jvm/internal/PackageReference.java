package kotlin.jvm.internal;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PackageReference implements ClassBasedDeclarationContainer {
    public final Class X;

    public PackageReference(Class jClass, String str) {
        Intrinsics.f(jClass, "jClass");
        this.X = jClass;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Class getX() {
        return this.X;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PackageReference) {
            return Intrinsics.a(this.X, ((PackageReference) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return this.X + " (Kotlin reflection is not available)";
    }
}
