package d5;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.HashMap;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ String A(int i10) {
        switch (i10) {
            case 1:
                return "AZTEC";
            case 2:
                return "CODABAR";
            case 3:
                return "CODE_39";
            case 4:
                return "CODE_93";
            case 5:
                return "CODE_128";
            case 6:
                return "DATA_MATRIX";
            case 7:
                return "EAN_8";
            case 8:
                return "EAN_13";
            case 9:
                return "ITF";
            case 10:
                return "MAXICODE";
            case 11:
                return "PDF_417";
            case 12:
                return "QR_CODE";
            case 13:
                return "RSS_14";
            case 14:
                return "RSS_EXPANDED";
            case 15:
                return "UPC_A";
            case 16:
                return "UPC_E";
            case 17:
                return "UPC_EAN_EXTENSION";
            default:
                return "null";
        }
    }

    public static final boolean a(int i10) {
        return i10 == 3 || i10 == 4 || i10 == 6;
    }

    public static /* synthetic */ boolean b(int i10) {
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ int c(int i10) {
        switch (i10) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return 128;
            case 9:
                return NotificationCompat.FLAG_LOCAL_ONLY;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return com.ironsource.mediationsdk.metadata.a.f29616n;
            case 13:
                return 4096;
            case 14:
                return Segment.SIZE;
            case 15:
                return Http2.INITIAL_MAX_FRAME_SIZE;
            case 16:
                return 32768;
            case 17:
                return C.DEFAULT_BUFFER_SEGMENT_SIZE;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return 33554432;
            case 27:
                return 67108864;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return 134217728;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                return 268435456;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                return 536870912;
            case 31:
                return 1073741824;
            case 32:
                return Integer.MIN_VALUE;
            default:
                throw null;
        }
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) + i12) / i13;
    }

    public static int e(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    public static String f(int i10, String str) {
        return i10 + str;
    }

    public static String g(StringBuilder sb2, int i10, char c4) {
        sb2.append(i10);
        sb2.append(c4);
        return sb2.toString();
    }

    public static String h(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static StringBuilder i(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder j(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder k(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static /* synthetic */ void l(int i10) {
        if (i10 == 0) {
            throw new NullPointerException("null reference");
        }
    }

    public static void m(int i10, int i11, int i12, int i13, int i14) {
        y.G(i10);
        y.G(i11);
        y.G(i12);
        y.G(i13);
        y.G(i14);
    }

    public static /* synthetic */ void n(int i10, String str) {
        if (i10 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = kotlin.jvm.internal.n.class.getName();
            int i11 = 0;
            while (!stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            while (stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            StackTraceElement stackTraceElement = stackTrace[i11];
            StringBuilder sbV = defpackage.e.v("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbV.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbV.toString());
            kotlin.jvm.internal.n.i(nullPointerException, kotlin.jvm.internal.n.class.getName());
            throw nullPointerException;
        }
    }

    public static void o(int i10, String str, String str2) {
        Log.w(str2, str + i10);
    }

    public static void p(int i10, HashMap map, String str, int i11, String str2) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
    }

    public static void q(String str, String str2, String str3) {
        l1.a.s(str3, str + str2);
    }

    public static void r(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void s(md.h hVar, gd.f fVar, gd.f fVar2) {
        fVar.i(hVar.b());
        id.g.c(fVar2);
    }

    public static /* synthetic */ void t(int i10) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        kotlin.jvm.internal.n.i(nullPointerException, kotlin.jvm.internal.n.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ void u(int i10, String str) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(wi.d.h(str, " must not be null"));
        kotlin.jvm.internal.n.i(nullPointerException, kotlin.jvm.internal.n.class.getName());
        throw nullPointerException;
    }

    public static void v(int i10, String str, String str2) {
        l1.a.s(str2, str + i10);
    }

    public static /* synthetic */ String w(int i10) {
        switch (i10) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String x(int i10) {
        if (i10 == 1) {
            return "LOCAL";
        }
        if (i10 == 2) {
            return "REMOTE";
        }
        if (i10 == 3) {
            return "DATA_DISK_CACHE";
        }
        if (i10 != 4) {
            return i10 != 5 ? "null" : "MEMORY_CACHE";
        }
        return "RESOURCE_DISK_CACHE";
    }

    public static /* synthetic */ String y(int i10) {
        switch (i10) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
