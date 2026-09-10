package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class dern {

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class attabal extends dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f31381attabal = new attabal();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final int f31382saneness;

        static {
            wireman.attabal attabalVar = wireman.f31395dern;
            f31382saneness = (~(attabalVar.taiyuan() | attabalVar.wireman())) & attabalVar.saneness();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.dern
        public int attabal() {
            return f31382saneness;
        }
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class saneness extends dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f31383attabal = new saneness();

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.dern
        public int attabal() {
            return 0;
        }
    }

    public abstract int attabal();

    public String toString() {
        return getClass().getSimpleName();
    }
}
