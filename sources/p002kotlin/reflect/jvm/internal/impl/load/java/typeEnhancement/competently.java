package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final apical f30632attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<apical> f30633saneness;

    public competently() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<apical> attabal() {
        return this.f30633saneness;
    }

    public final apical saneness() {
        return this.f30632attabal;
    }

    public competently(apical apicalVar, List<apical> parametersInfo) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.f30632attabal = apicalVar;
        this.f30633saneness = parametersInfo;
    }

    public /* synthetic */ competently(apical apicalVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apicalVar, (i & 2) != 0 ? adultoid.formularize() : list);
    }
}
