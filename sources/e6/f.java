package e6;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f39142a = Charset.forName("UTF-8");

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
