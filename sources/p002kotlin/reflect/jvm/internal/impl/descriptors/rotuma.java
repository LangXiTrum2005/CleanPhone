package p002kotlin.reflect.jvm.internal.impl.descriptors;

import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InvalidModuleException.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final stratoscope<preprohormone> f30218attabal = new stratoscope<>("InvalidModuleNotifier");

    public static final void attabal(trm trmVar) {
        Unit unit;
        Intrinsics.checkNotNullParameter(trmVar, "<this>");
        preprohormone preprohormoneVar = (preprohormone) trmVar.hardpan(f30218attabal);
        if (preprohormoneVar != null) {
            preprohormoneVar.attabal(trmVar);
            unit = Unit.f29295attabal;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + trmVar);
    }
}
