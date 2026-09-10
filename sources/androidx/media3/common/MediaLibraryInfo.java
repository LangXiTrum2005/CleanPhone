package androidx.media3.common;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class MediaLibraryInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f5463a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f5464b = "media3.common";

    public static synchronized void a(String str) {
        if (f5463a.add(str)) {
            f5464b += ", " + str;
        }
    }
}
