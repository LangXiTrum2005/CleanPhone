package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3748j10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4531a;
    public final int b;
    public final Uri c;

    public C3748j10(int i, long j, Uri uri) {
        this.f4531a = j;
        this.b = i;
        this.c = uri;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public static C3965lY a(Uri uri, String str) throws KT {
        byte b;
        FW.n(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = Ug0.f3833a;
        int i2 = -1;
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        char c = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str2 = strArrSplit[i3];
            String[] strArrSplit2 = str2.split(";", i2);
            int length2 = strArrSplit2.length;
            int i5 = 0;
            Uri uriB = null;
            int i6 = -1;
            long j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            while (i5 < length2) {
                String str3 = strArrSplit2[i5];
                try {
                    String[] strArrSplit3 = str3.split("=", 2);
                    String str4 = strArrSplit3[c];
                    String str5 = strArrSplit3[1];
                    int iHashCode = str4.hashCode();
                    if (iHashCode != 113759) {
                        if (iHashCode != 116079) {
                            if (iHashCode == 1524180539 && str4.equals("rtptime")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str4.equals("url")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (str4.equals("seq")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        uriB = b(uri, str5);
                    } else if (b == 1) {
                        i6 = Integer.parseInt(str5);
                    } else {
                        if (b != 2) {
                            throw KT.b(str4, null);
                        }
                        j = Long.parseLong(str5);
                    }
                    i5++;
                    c = 0;
                } catch (Exception e) {
                    throw KT.b(str3, e);
                }
            }
            if (uriB != null && uriB.getScheme() != null) {
                long j2 = j;
                if (i6 != -1 || j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    C3748j10 c3748j10 = new C3748j10(i6, j2, uriB);
                    int i7 = i4 + 1;
                    if (objArrCopyOf.length < i7) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i7));
                    }
                    objArrCopyOf[i4] = c3748j10;
                    i3++;
                    i4 = i7;
                    i2 = -1;
                    c = 0;
                }
            }
            throw KT.b(str2, null);
        }
        return AC.h(i4, objArrCopyOf);
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        FW.h(scheme.equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        String host = uri3.getHost();
        host.getClass();
        if (host.equals(uri.getHost())) {
            return uri3;
        }
        return string.endsWith("/") ? FW.X(string, str) : FW.X(string.concat("/"), str);
    }
}
