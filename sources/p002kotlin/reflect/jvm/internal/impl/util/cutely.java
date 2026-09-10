package p002kotlin.reflect.jvm.internal.impl.util;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class cutely implements beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f31852attabal;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class attabal extends cutely {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f31853saneness = new attabal();

        public attabal() {
            super("must be a member function", null);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
        public boolean saneness(dovishness functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.kattegat() != null;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class saneness extends cutely {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final saneness f31854saneness = new saneness();

        public saneness() {
            super("must be a member or an extension function", null);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
        public boolean saneness(dovishness functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.kattegat() == null && functionDescriptor.polder() == null) ? false : true;
        }
    }

    public /* synthetic */ cutely(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public String attabal(dovishness dovishnessVar) {
        return beachfront.attabal.attabal(this, dovishnessVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public String getDescription() {
        return this.f31852attabal;
    }

    public cutely(String str) {
        this.f31852attabal = str;
    }
}
