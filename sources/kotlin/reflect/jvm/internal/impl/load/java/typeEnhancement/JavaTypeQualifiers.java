package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaTypeQualifiers {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final JavaTypeQualifiers f43924e = new JavaTypeQualifiers(null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NullabilityQualifier f43925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutabilityQualifier f43926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43927c;
    public final boolean d;

    public static final class Companion {
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z2, boolean z3) {
        this.f43925a = nullabilityQualifier;
        this.f43926b = mutabilityQualifier;
        this.f43927c = z2;
        this.d = z3;
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, boolean z2) {
        this(nullabilityQualifier, null, z2, false);
    }
}
