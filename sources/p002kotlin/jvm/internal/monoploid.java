package p002kotlin.jvm.internal;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PackageReference.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/jvm/internal/monoploid;", "Lkotlin/jvm/internal/beachfront;", "Ljava/lang/Class;", "jClass", "", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "kowloon", "Ljava/lang/Class;", "competently", "()Ljava/lang/Class;", "arytenoidectomy", "Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class monoploid implements beachfront {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final String moduleName;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Class<?> jClass;

    public monoploid(Class<?> jClass, String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.jClass = jClass;
        this.moduleName = moduleName;
    }

    @Override // p002kotlin.jvm.internal.beachfront
    public Class<?> competently() {
        return this.jClass;
    }

    public boolean equals(Object other) {
        return (other instanceof monoploid) && Intrinsics.wireman(competently(), ((monoploid) other).competently());
    }

    public int hashCode() {
        return competently().hashCode();
    }

    public String toString() {
        return competently().toString() + " (Kotlin reflection is not available)";
    }
}
