package i1;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f42720a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f42721b = "media3.common";

    public static synchronized void a(String str) {
        if (f42720a.add(str)) {
            f42721b += ", " + str;
        }
    }
}
