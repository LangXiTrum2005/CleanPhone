package b2;

import android.net.Uri;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f5332c;

    public m0(int i10, long j10, Uri uri) {
        this.f5330a = j10;
        this.f5331b = i10;
        this.f5332c = uri;
    }

    public static n1 a(Uri uri, String str) {
        oa.q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String str2 = l1.y.f44830a;
        int i10 = -1;
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str3 = strArrSplit[i11];
            String[] strArrSplit2 = str3.split(";", i10);
            int length2 = strArrSplit2.length;
            int i13 = i10;
            int i14 = i11;
            long j10 = C.TIME_UNSET;
            int i15 = 0;
            Uri uriB = null;
            while (true) {
                if (i15 >= length2) {
                    String[] strArr = strArrSplit;
                    if (uriB != null && uriB.getScheme() != null) {
                        i10 = -1;
                        if (i13 != -1 || j10 != C.TIME_UNSET) {
                            m0 m0Var = new m0(i13, j10, uriB);
                            int i16 = i12 + 1;
                            int iF = oa.b0.f(objArrCopyOf.length, i16);
                            if (iF > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                            }
                            objArrCopyOf[i12] = m0Var;
                            i12 = i16;
                            strArrSplit = strArr;
                            i11 = i14 + 1;
                        }
                    }
                    throw i1.e0.b(str3, null);
                }
                String str4 = strArrSplit2[i15];
                try {
                    String[] strArrSplit3 = str4.split(X3.j.f27830b, 2);
                    String str5 = strArrSplit3[0];
                    String str6 = strArrSplit3[1];
                    int iHashCode = str5.hashCode();
                    String[] strArr2 = strArrSplit;
                    if (iHashCode != 113759) {
                        if (iHashCode != 116079) {
                            if (iHashCode != 1524180539 || !str5.equals("rtptime")) {
                                throw i1.e0.b(str5, null);
                            }
                            j10 = Long.parseLong(str6);
                            i15++;
                            strArrSplit = strArr2;
                        } else {
                            if (!str5.equals("url")) {
                                throw i1.e0.b(str5, null);
                            }
                            uriB = b(uri, str6);
                            i15++;
                            strArrSplit = strArr2;
                        }
                    } else {
                        if (!str5.equals("seq")) {
                            throw i1.e0.b(str5, null);
                        }
                        i13 = Integer.parseInt(str6);
                        i15++;
                        strArrSplit = strArr2;
                    }
                } catch (Exception e10) {
                    throw i1.e0.b(str4, e10);
                }
            }
        }
        return oa.j0.t(i12, objArrCopyOf);
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        go.k.i(scheme.equals("rtsp"));
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
        return string.endsWith("/") ? l1.a.q(string, str) : l1.a.q(string.concat("/"), str);
    }
}
