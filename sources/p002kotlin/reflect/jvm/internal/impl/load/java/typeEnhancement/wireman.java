package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: typeQualifiers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final NullabilityQualifier f30659attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f30660dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final MutabilityQualifier f30661saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f30662wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final attabal f30658marial = new attabal(null);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final wireman f30657beachfront = new wireman(null, null, false, false, 8, null);

    /* JADX INFO: compiled from: typeQualifiers.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wireman attabal() {
            return wireman.f30657beachfront;
        }

        public attabal() {
        }
    }

    public wireman(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.f30659attabal = nullabilityQualifier;
        this.f30661saneness = mutabilityQualifier;
        this.f30660dern = z;
        this.f30662wireman = z2;
    }

    public final MutabilityQualifier dern() {
        return this.f30661saneness;
    }

    public final boolean marial() {
        return this.f30662wireman;
    }

    public final boolean saneness() {
        return this.f30660dern;
    }

    public final NullabilityQualifier wireman() {
        return this.f30659attabal;
    }

    public /* synthetic */ wireman(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z, (i & 8) != 0 ? false : z2);
    }
}
