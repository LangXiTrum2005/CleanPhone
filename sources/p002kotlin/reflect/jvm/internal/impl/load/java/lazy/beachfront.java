package p002kotlin.reflect.jvm.internal.impl.load.java.lazy;

import genesic.competently;
import iaido.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;

/* JADX INFO: compiled from: ModuleClassResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront implements marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public dern f30477attabal;

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.marial
    public wireman attabal(competently javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        return saneness().saneness(javaClass);
    }

    public final void dern(dern dernVar) {
        Intrinsics.checkNotNullParameter(dernVar, "<set-?>");
        this.f30477attabal = dernVar;
    }

    public final dern saneness() {
        dern dernVar = this.f30477attabal;
        if (dernVar != null) {
            return dernVar;
        }
        Intrinsics.preprohormone("resolver");
        return null;
    }
}
