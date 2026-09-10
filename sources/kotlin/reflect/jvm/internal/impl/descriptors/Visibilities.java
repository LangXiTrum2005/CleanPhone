package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class Visibilities {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MapBuilder f43594a;

    public static final class Inherited extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Inherited f43595c = new Inherited("inherited", false);
    }

    public static final class Internal extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Internal f43596c = new Internal("internal", false);
    }

    public static final class InvisibleFake extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final InvisibleFake f43597c = new InvisibleFake("invisible_fake", false);
    }

    public static final class Local extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Local f43598c = new Local("local", false);
    }

    public static final class Private extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Private f43599c = new Private("private", false);
    }

    public static final class PrivateToThis extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final PrivateToThis f43600c = new PrivateToThis("private_to_this", false);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public final String b() {
            return "private/*private to this*/";
        }
    }

    public static final class Protected extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Protected f43601c = new Protected("protected", true);
    }

    public static final class Public extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Public f43602c = new Public("public", true);
    }

    public static final class Unknown extends Visibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Unknown f43603c = new Unknown("unknown", false);
    }

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(PrivateToThis.f43600c, 0);
        mapBuilder.put(Private.f43599c, 0);
        mapBuilder.put(Internal.f43596c, 1);
        mapBuilder.put(Protected.f43601c, 1);
        mapBuilder.put(Public.f43602c, 2);
        f43594a = mapBuilder.d();
    }
}
