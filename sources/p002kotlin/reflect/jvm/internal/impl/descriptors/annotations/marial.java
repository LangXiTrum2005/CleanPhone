package p002kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import byname.dern;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface marial extends Iterable<dern>, unready.attabal {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final attabal f29950impromptu = attabal.f29951attabal;

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ attabal f29951attabal = new attabal();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final marial f29952saneness = new C0671attabal();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Annotations.kt */
        public static final class C0671attabal implements marial {
            @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
            public /* bridge */ /* synthetic */ dern attabal(dern dernVar) {
                return (dern) saneness(dernVar);
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<dern> iterator() {
                return adultoid.formularize().iterator();
            }

            @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
            public boolean restrictive(dern dernVar) {
                return saneness.saneness(this, dernVar);
            }

            public Void saneness(dern fqName) {
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return null;
            }

            public String toString() {
                return "EMPTY";
            }
        }

        public final marial attabal(List<? extends dern> annotations) {
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            return annotations.isEmpty() ? f29952saneness : new beachfront(annotations);
        }

        public final marial saneness() {
            return f29952saneness;
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class saneness {
        public static dern attabal(marial marialVar, dern fqName) {
            dern next;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Iterator<dern> it = marialVar.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.wireman(next.marial(), fqName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public static boolean saneness(marial marialVar, dern fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            return marialVar.attabal(fqName) != null;
        }
    }

    dern attabal(dern dernVar);

    boolean isEmpty();

    boolean restrictive(dern dernVar);
}
