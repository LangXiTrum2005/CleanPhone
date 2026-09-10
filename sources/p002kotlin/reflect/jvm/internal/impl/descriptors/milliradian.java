package p002kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Map;
import p002kotlin.collections.polder;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Visibilities.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class milliradian {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final milliradian f30186attabal = new milliradian();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final impromptu f30187dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Map<treadless, Integer> f30188saneness;

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class attabal extends treadless {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f30189saneness = new attabal();

        public attabal() {
            super("inherited", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class beachfront extends treadless {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final beachfront f30190saneness = new beachfront();

        public beachfront() {
            super("private_to_this", false);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.treadless
        public String saneness() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class competently extends treadless {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final competently f30191saneness = new competently();

        public competently() {
            super("protected", true);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class dern extends treadless {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f30192saneness = new dern();

        public dern() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class impromptu extends treadless {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final impromptu f30193saneness = new impromptu();

        public impromptu() {
            super("public", true);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class marial extends treadless {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final marial f30194saneness = new marial();

        public marial() {
            super("private", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class saneness extends treadless {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final saneness f30195saneness = new saneness();

        public saneness() {
            super("internal", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class taiyuan extends treadless {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final taiyuan f30196saneness = new taiyuan();

        public taiyuan() {
            super("unknown", false);
        }
    }

    /* JADX INFO: compiled from: Visibilities.kt */
    public static final class wireman extends treadless {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final wireman f30197saneness = new wireman();

        public wireman() {
            super("local", false);
        }
    }

    static {
        Map mapDern = polder.dern();
        mapDern.put(beachfront.f30190saneness, 0);
        mapDern.put(marial.f30194saneness, 0);
        mapDern.put(saneness.f30195saneness, 1);
        mapDern.put(competently.f30191saneness, 1);
        impromptu impromptuVar = impromptu.f30193saneness;
        mapDern.put(impromptuVar, 2);
        f30188saneness = polder.saneness(mapDern);
        f30187dern = impromptuVar;
    }

    public final Integer attabal(treadless first, treadless second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first == second) {
            return 0;
        }
        Map<treadless, Integer> map = f30188saneness;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num == null || num2 == null || Intrinsics.wireman(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean saneness(treadless visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return visibility == marial.f30194saneness || visibility == beachfront.f30190saneness;
    }
}
