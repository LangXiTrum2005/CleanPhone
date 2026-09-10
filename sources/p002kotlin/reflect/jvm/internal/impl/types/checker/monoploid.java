package p002kotlin.reflect.jvm.internal.impl.types.checker;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final oilcan f31735attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final monoploid f31736saneness;

    public monoploid(oilcan type, monoploid monoploidVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f31735attabal = type;
        this.f31736saneness = monoploidVar;
    }

    public final monoploid attabal() {
        return this.f31736saneness;
    }

    public final oilcan saneness() {
        return this.f31735attabal;
    }
}
