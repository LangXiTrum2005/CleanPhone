package androidx.media3.common;

import java.util.HashSet;

/* JADX INFO: compiled from: MediaLibraryInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final HashSet<String> f10840attabal = new HashSet<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static String f10841saneness = "media3.common";

    public static synchronized void attabal(String str) {
        if (f10840attabal.add(str)) {
            f10841saneness += ", " + str;
        }
    }

    public static synchronized String saneness() {
        return f10841saneness;
    }
}
