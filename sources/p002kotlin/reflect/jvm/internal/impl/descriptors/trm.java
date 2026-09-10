package p002kotlin.reflect.jvm.internal.impl.descriptors;

import byname.dern;
import byname.marial;
import java.util.Collection;
import java.util.List;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;

/* JADX INFO: compiled from: ModuleDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface trm extends apical {

    /* JADX INFO: compiled from: ModuleDescriptor.kt */
    public static final class attabal {
        public static <R, D> R attabal(trm trmVar, impassible<R, D> visitor, D d) {
            Intrinsics.checkNotNullParameter(visitor, "visitor");
            return visitor.apical(trmVar, d);
        }

        public static apical saneness(trm trmVar) {
            return null;
        }
    }

    beachfront apical();

    <T> T hardpan(stratoscope<T> stratoscopeVar);

    merc hydrovane(dern dernVar);

    List<trm> palmyra();

    Collection<dern> polloi(dern dernVar, Function1<? super marial, Boolean> function1);

    boolean sealless(trm trmVar);
}
