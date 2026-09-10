package p002kotlin.reflect.jvm.internal.impl.descriptors;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModuleCapability.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class stratoscope<T> {
    private final String name;

    public stratoscope(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
