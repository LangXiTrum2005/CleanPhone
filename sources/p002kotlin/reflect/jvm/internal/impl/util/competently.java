package p002kotlin.reflect.jvm.internal.impl.util;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f31848attabal;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class attabal extends competently {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f31849saneness = new attabal();

        public attabal() {
            super(false, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class dern extends competently {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f31850saneness = new dern();

        public dern() {
            super(true, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class saneness extends competently {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f31851saneness;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(String error) {
            super(false, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f31851saneness = error;
        }
    }

    public /* synthetic */ competently(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public final boolean attabal() {
        return this.f31848attabal;
    }

    public competently(boolean z) {
        this.f31848attabal = z;
    }
}
