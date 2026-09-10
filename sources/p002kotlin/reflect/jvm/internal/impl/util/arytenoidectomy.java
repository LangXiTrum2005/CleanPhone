package p002kotlin.reflect.jvm.internal.impl.util;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class arytenoidectomy implements beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f31842attabal;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class attabal extends arytenoidectomy {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f31843saneness;

        public attabal(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? "s" : "");
            super(sb.toString(), null);
            this.f31843saneness = i;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
        public boolean saneness(dovishness functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.beachfront().size() >= this.f31843saneness;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class dern extends arytenoidectomy {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f31844saneness = new dern();

        public dern() {
            super("must have no value parameters", null);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
        public boolean saneness(dovishness functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.beachfront().isEmpty();
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class saneness extends arytenoidectomy {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f31845saneness;

        public saneness(int i) {
            super("must have exactly " + i + " value parameters", null);
            this.f31845saneness = i;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
        public boolean saneness(dovishness functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.beachfront().size() == this.f31845saneness;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class wireman extends arytenoidectomy {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final wireman f31846saneness = new wireman();

        public wireman() {
            super("must have a single value parameter", null);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
        public boolean saneness(dovishness functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.beachfront().size() == 1;
        }
    }

    public /* synthetic */ arytenoidectomy(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public String attabal(dovishness dovishnessVar) {
        return beachfront.attabal.attabal(this, dovishnessVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public String getDescription() {
        return this.f31842attabal;
    }

    public arytenoidectomy(String str) {
        this.f31842attabal = str;
    }
}
