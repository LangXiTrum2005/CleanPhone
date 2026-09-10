package genesis;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: versionSpecificBehavior.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan {
    public static final boolean attabal(attabal version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return (version.attabal() == 1 && version.saneness() >= 4) || version.attabal() > 1;
    }

    public static final boolean saneness(attabal version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return attabal(version);
    }
}
