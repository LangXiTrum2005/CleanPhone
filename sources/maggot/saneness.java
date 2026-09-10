package maggot;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: compiled from: Key.java */
/* JADX INFO: loaded from: classes2.dex */
public interface saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Charset f33228attabal = Charset.forName(C.UTF8_NAME);

    void attabal(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
