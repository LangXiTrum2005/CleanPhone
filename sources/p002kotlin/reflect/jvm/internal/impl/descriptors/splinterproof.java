package p002kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;

/* JADX INFO: compiled from: SupertypeLoopChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface splinterproof {

    /* JADX INFO: compiled from: SupertypeLoopChecker.kt */
    public static final class attabal implements splinterproof {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f30272attabal = new attabal();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.splinterproof
        public Collection<oilcan> attabal(permissivist currentTypeConstructor, Collection<? extends oilcan> superTypes, Function1<? super permissivist, ? extends Iterable<? extends oilcan>> neighbors, Function1<? super oilcan, Unit> reportLoop) {
            Intrinsics.checkNotNullParameter(currentTypeConstructor, "currentTypeConstructor");
            Intrinsics.checkNotNullParameter(superTypes, "superTypes");
            Intrinsics.checkNotNullParameter(neighbors, "neighbors");
            Intrinsics.checkNotNullParameter(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    Collection<oilcan> attabal(permissivist permissivistVar, Collection<? extends oilcan> collection2, Function1<? super permissivist, ? extends Iterable<? extends oilcan>> function1, Function1<? super oilcan, Unit> function2);
}
