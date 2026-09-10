package androidx.webkit.internal;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class StartupApiFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f8578a = new HashSet();

    public static class NoFramework extends StartupApiFeature {
    }

    public static class P extends StartupApiFeature {
    }

    public StartupApiFeature() {
        f8578a.add(this);
    }
}
