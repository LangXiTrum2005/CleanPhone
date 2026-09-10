package l1;

import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import oa.b0;
import oa.f0;
import oa.j0;
import oa.n1;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ExecutorService f44769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f44770b = new Object();

    public static String a(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (f44770b) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbJ = d5.u.j(str, "\n  ");
        sbJ.append(strReplace.replace("\n", "\n  "));
        sbJ.append('\n');
        return sbJ.toString();
    }

    public static void b() throws i {
        StringBuilder sb2 = new StringBuilder();
        oa.q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i11 = i10 + 1;
            int iF = b0.f(objArrCopyOf.length, i11);
            if (iF > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
            }
            objArrCopyOf[i10] = numValueOf;
            z10 = true;
            i10 = i11;
        }
        if (z10) {
            throw new i(sb2.toString(), j0.t(i10, objArrCopyOf));
        }
    }

    public static void c(String str, boolean z10) throws i {
        if (z10) {
            return;
        }
        f0 f0Var = j0.f47265b;
        throw new i(str, n1.f47281e);
    }

    public static void d(String str, String str2) {
        synchronized (f44770b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void e(String str, String str2) {
        synchronized (f44770b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void f(String str, String str2, Throwable th2) {
        synchronized (f44770b) {
            Log.e(str, a(str2, th2));
        }
    }

    public static synchronized Executor g() {
        try {
            if (f44769a == null) {
                String str = y.f44830a;
                f44769a = Executors.newSingleThreadExecutor(new ch.b("ExoPlayer:BackgroundExecutor", 2));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44769a;
    }

    public static String h(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static int[] i(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i10 = iIndexOf5 + 2;
        if (i10 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i10) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void j(String str, String str2) {
        synchronized (f44770b) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean k(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean l(String str) throws i {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        c("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        c("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        b();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean m(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void n(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static String o(StringBuilder sb2, int i10, int i11) {
        int i12;
        int iLastIndexOf;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i13 = i10;
        int i14 = i13;
        while (i13 <= i11) {
            if (i13 == i11) {
                i12 = i13;
            } else if (sb2.charAt(i13) == '/') {
                i12 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb2.charAt(i14) == '.') {
                sb2.delete(i14, i12);
                i11 -= i12 - i14;
            } else {
                if (i13 == i14 + 2 && sb2.charAt(i14) == '.' && sb2.charAt(i15) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = iLastIndexOf > i10 ? iLastIndexOf : i10;
                    sb2.delete(i16, i12);
                    i11 -= i12 - i16;
                } else {
                    iLastIndexOf = i13 + 1;
                }
                i14 = iLastIndexOf;
            }
            i13 = i14;
        }
        return sb2.toString();
    }

    public static String p(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrI = i(str2);
        if (iArrI[0] != -1) {
            sb2.append(str2);
            o(sb2, iArrI[1], iArrI[2]);
            return sb2.toString();
        }
        int[] iArrI2 = i(str);
        if (iArrI[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrI2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrI[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrI2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i10 = iArrI[1];
        if (i10 != 0) {
            int i11 = iArrI2[0] + 1;
            sb2.append((CharSequence) str, 0, i11);
            sb2.append(str2);
            return o(sb2, iArrI[1] + i11, i11 + iArrI[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb2.append((CharSequence) str, 0, iArrI2[1]);
            sb2.append(str2);
            int i12 = iArrI2[1];
            return o(sb2, i12, iArrI[2] + i12);
        }
        int i13 = iArrI2[0] + 2;
        int i14 = iArrI2[1];
        if (i13 >= i14 || i14 != iArrI2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrI2[2] - 1);
            int i15 = iLastIndexOf == -1 ? iArrI2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i15);
            sb2.append(str2);
            return o(sb2, iArrI2[1], i15 + iArrI[2]);
        }
        sb2.append((CharSequence) str, 0, i14);
        sb2.append('/');
        sb2.append(str2);
        int i16 = iArrI2[1];
        return o(sb2, i16, iArrI[2] + i16 + 1);
    }

    public static Uri q(String str, String str2) {
        return Uri.parse(p(str, str2));
    }

    public static void r(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(d.e(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void s(String str, String str2) {
        synchronized (f44770b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void t(String str, String str2, Throwable th2) {
        synchronized (f44770b) {
            Log.w(str, a(str2, th2));
        }
    }
}
