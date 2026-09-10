package p002kotlin.reflect.jvm.internal.impl.descriptors;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Visibility.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class treadless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f30273attabal;
    private final String name;

    public treadless(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.f30273attabal = z;
    }

    public Integer attabal(treadless visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return milliradian.f30186attabal.attabal(this, visibility);
    }

    public final boolean dern() {
        return this.f30273attabal;
    }

    public String saneness() {
        return this.name;
    }

    public final String toString() {
        return saneness();
    }

    public treadless wireman() {
        return this;
    }
}
