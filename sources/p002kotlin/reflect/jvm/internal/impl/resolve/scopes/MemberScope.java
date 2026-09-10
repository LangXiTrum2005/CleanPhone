package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

import byname.marial;
import discontentedly.saneness;
import java.util.Collection;
import java.util.Set;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface MemberScope extends impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Companion f31364attabal = Companion.f31365attabal;

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f31365attabal = new Companion();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final Function1<marial, Boolean> f31366saneness = new Function1<marial, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope$Companion$ALL_NAME_FILTER$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(marial it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        };

        public final Function1<marial, Boolean> attabal() {
            return f31366saneness;
        }
    }

    /* JADX INFO: compiled from: MemberScope.kt */
    public static final class attabal extends beachfront {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f31367saneness = new attabal();

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<marial> attabal() {
            return creditor.marial();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<marial> beachfront() {
            return creditor.marial();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.resolve.scopes.beachfront, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<marial> wireman() {
            return creditor.marial();
        }
    }

    Set<marial> attabal();

    Set<marial> beachfront();

    Collection<? extends saran> dern(marial marialVar, saneness sanenessVar);

    Collection<? extends hydrovane> saneness(marial marialVar, saneness sanenessVar);

    Set<marial> wireman();
}
