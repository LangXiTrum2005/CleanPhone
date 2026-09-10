package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.work.PeriodicWorkRequest;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.facebook.ads.AdError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class G7 implements InterfaceC3368eh0, InterfaceC3461fk, ModelLoaderFactory, InterfaceC4669tZ, InterfaceC2761Sr, InterfaceC3718ih, InterfaceC3211ct, InterfaceC5166z7, InterfaceC2459Ha, InterfaceC3108bk, InterfaceC4218oN, InterfaceC5140yp, InterfaceC3296dq, OnCompleteListener, InterfaceC4659tP, US, HW, InterfaceC4047mS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G7 f3105a = new G7();
    public static final G7 b = new G7();
    public static final G7 c = new G7();
    public static final /* synthetic */ G7 d = new G7();
    public static final /* synthetic */ G7 e = new G7();
    public static final G7 f = new G7();
    public static final Qm0 g = new Qm0(20);
    public static final C4467r90 h = new C4467r90(0);
    public static final C4467r90 i = new C4467r90(1);
    public static final G7 j = new G7();
    public static final G7 k = new G7();
    public static final G7 l = new G7();
    public static final G7 m = new G7();
    public static final /* synthetic */ G7 n = new G7();
    public static final /* synthetic */ G7 o = new G7();

    public static long B(BR br) {
        Throwable cause = (IOException) br.d;
        if (!(cause instanceof KT) && !(cause instanceof FileNotFoundException) && !(cause instanceof OA) && !(cause instanceof NI)) {
            int i2 = C4604sl.b;
            while (cause != null) {
                if (!(cause instanceof C4604sl) || ((C4604sl) cause).f4995a != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((br.f2872a - 1) * 1000, 5000);
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public static C3971lc D(byte[] bArr) {
        C3971lc c3971lc = C3971lc.d;
        int length = bArr.length;
        AbstractC2845Vx.P(bArr.length, 0, length);
        AbstractC3375el.t(length, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length);
        AbstractC2995aW.p(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return new C3971lc(bArrCopyOfRange);
    }

    public static void p(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            webView.evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a7 A[LOOP:1: B:16:0x003d->B:55:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static C3971lc t(String str) {
        int i2;
        int i3;
        char cCharAt;
        AbstractC2995aW.q(str, "<this>");
        byte[] bArr = AbstractC5047xm0.f5244a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i4 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i4];
        int i5 = 0;
        int i6 = 0;
        if (length > 0) {
            int i7 = 0;
            i2 = 0;
            while (true) {
                int i8 = i5 + 1;
                char cCharAt2 = str.charAt(i5);
                if ('A' <= cCharAt2 && cCharAt2 <= 'Z') {
                    i3 = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 <= 'z') {
                    i3 = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 <= '9') {
                    i3 = cCharAt2 + 4;
                } else {
                    if (cCharAt2 != '+' && cCharAt2 != '-') {
                        if (cCharAt2 == '/' || cCharAt2 == '_') {
                            i3 = 63;
                        } else if (cCharAt2 == '\n' || cCharAt2 == '\r' || cCharAt2 == ' ' || cCharAt2 == '\t') {
                            if (i8 >= length) {
                                i5 = i7;
                            } else {
                                i5 = i8;
                            }
                        }
                        bArrCopyOf = null;
                        if (bArrCopyOf != null) {
                            return new C3971lc(bArrCopyOf);
                        }
                        return null;
                    }
                    i3 = 62;
                }
                int i9 = i3 | (i2 << 6);
                i7++;
                if (i7 % 4 == 0) {
                    bArrCopyOf[i6] = (byte) (i9 >> 16);
                    int i10 = i6 + 2;
                    bArrCopyOf[i6 + 1] = (byte) (i9 >> 8);
                    i6 += 3;
                    bArrCopyOf[i10] = (byte) i9;
                }
                i2 = i9;
                if (i8 >= length) {
                    i5 = i7;
                } else {
                    i5 = i8;
                }
            }
        } else {
            i2 = 0;
        }
        int i11 = i5 % 4;
        if (i11 != 1) {
            if (i11 == 2) {
                bArrCopyOf[i6] = (byte) ((i2 << 12) >> 16);
                i6++;
            } else if (i11 == 3) {
                int i12 = i2 << 6;
                int i13 = i6 + 1;
                bArrCopyOf[i6] = (byte) (i12 >> 16);
                i6 += 2;
                bArrCopyOf[i13] = (byte) (i12 >> 8);
            }
            if (i6 != i4) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                AbstractC2995aW.p(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
            }
        } else {
            bArrCopyOf = null;
        }
        if (bArrCopyOf != null) {
            return new C3971lc(bArrCopyOf);
        }
        return null;
    }

    public static C3971lc u(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(str, "Unexpected hex string: ").toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i2 = length - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int i5 = i3 * 2;
                bArr[i3] = (byte) (AbstractC2340Cl.f(str.charAt(i5 + 1)) + (AbstractC2340Cl.f(str.charAt(i5)) << 4));
                if (i4 > i2) {
                    break;
                }
                i3 = i4;
            }
        }
        return new C3971lc(bArr);
    }

    public static SharedPreferences.Editor w(Context context) {
        SharedPreferences sharedPreferences;
        Object obj = AbstractC3762j80.f4539a;
        String packageName = context.getPackageName();
        AbstractC2995aW.p(packageName, "getPackageName(...)");
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        HashMap map = AbstractC3762j80.b;
        SharedPreferences sharedPreferences2 = (SharedPreferences) map.get(packageName);
        if (sharedPreferences2 == null) {
            synchronized (AbstractC3762j80.f4539a) {
                SharedPreferences sharedPreferences3 = (SharedPreferences) map.get(packageName);
                if (sharedPreferences3 == null) {
                    sharedPreferences = context.getApplicationContext().getSharedPreferences(packageName, 0);
                    AbstractC2995aW.n(sharedPreferences);
                    map.put(packageName, sharedPreferences);
                } else {
                    sharedPreferences = sharedPreferences3;
                }
            }
            sharedPreferences2 = sharedPreferences;
        }
        return sharedPreferences2.edit();
    }

    public static C3971lc x(String str) {
        AbstractC2995aW.q(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC2307Be.f2881a);
        AbstractC2995aW.p(bytes, "(this as java.lang.String).getBytes(charset)");
        C3971lc c3971lc = new C3971lc(bytes);
        c3971lc.c = str;
        return c3971lc;
    }

    public static C2868Wu y(C3483g0 c3483g0, BR br) {
        int i2;
        IOException iOException = (IOException) br.d;
        if (!(iOException instanceof SA) || ((i2 = ((SA) iOException).d) != 403 && i2 != 404 && i2 != 410 && i2 != 416 && i2 != 500 && i2 != 503)) {
            return null;
        }
        if (c3483g0.a(1)) {
            return new C2868Wu(1, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
        }
        if (c3483g0.a(2)) {
            return new C2868Wu(2, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        }
        return null;
    }

    public int A(int i2) {
        return i2 == 7 ? 6 : 3;
    }

    public List C(String str) throws UnknownHostException {
        AbstractC2995aW.q(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            AbstractC2995aW.p(allByName, "getAllByName(hostname)");
            return U5.z0(allByName);
        } catch (NullPointerException e2) {
            UnknownHostException unknownHostException = new UnknownHostException(AbstractC2995aW.v0(str, "Broken system behaviour for dns lookup of "));
            unknownHostException.initCause(e2);
            throw unknownHostException;
        }
    }

    public boolean E(C4619sw c4619sw) {
        String str = c4619sw.l;
        return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha
    public Bitmap b(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3718ih
    public Object c(C3274de0 c3274de0) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(c3274de0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4047mS
    public O30 createSeekMap() {
        return new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha
    public Bitmap e(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public int g(C4619sw c4619sw) {
        return c4619sw.o != null ? 1 : 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public /* synthetic */ InterfaceC3208cq h(C3031aq c3031aq, C4619sw c4619sw) {
        return InterfaceC3208cq.d1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public InterfaceC2889Xp j(C3031aq c3031aq, C4619sw c4619sw) {
        if (c4619sw.o == null) {
            return null;
        }
        return new C2631Nr(new C2863Wp(new C3278dg0(), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4047mS
    public long l(InterfaceC4265ot interfaceC4265ot) {
        return -1L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3368eh0
    public Object m(MF mf, float f2) {
        boolean z = mf.t() == 1;
        if (z) {
            mf.h();
        }
        double dQ = mf.q();
        double dQ2 = mf.q();
        double dQ3 = mf.q();
        double dQ4 = mf.t() == 7 ? mf.q() : 1.0d;
        if (z) {
            mf.m();
        }
        if (dQ <= 1.0d && dQ2 <= 1.0d && dQ3 <= 1.0d) {
            dQ *= 255.0d;
            dQ2 *= 255.0d;
            dQ3 *= 255.0d;
            if (dQ4 <= 1.0d) {
                dQ4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dQ4, (int) dQ, (int) dQ2, (int) dQ3));
    }

    public void n(WebView webView, String str, Object... objArr) {
        String string;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        string = "null";
                    } else {
                        if (obj instanceof String) {
                            string = obj.toString();
                            if (!string.startsWith("{")) {
                                sb.append('\"');
                                sb.append(string);
                                sb.append('\"');
                            }
                        } else {
                            sb.append(obj);
                        }
                        sb.append(",");
                    }
                    sb.append(string);
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String string2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                p(webView, string2);
            } else {
                handler.post(new RunnableC3163cN(this, webView, string2, 2));
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Qm0.D(new byte[]{-22, -37, 115, -45, -112, 8, 115, -47, -31, -45, 111, -41, -107, 12, 114}, new byte[]{-84, -78, 1, -74, -14, 105, 0, -76});
        Qm0.D(new byte[]{84, 100, -114, -36, 94, 109, 96, 42, 95, 107, -108, -51, 91, 107, 124, 41, 84, 109, -57, -57, 118, 71, 125, 34, 77, 102, -126, -36, 125, 62, 50}, new byte[]{61, 10, -25, -88, 24, 4, 18, 79});
        if (task.isSuccessful()) {
            AbstractC4969wu.g = 1;
        } else {
            AbstractC4969wu.g = 2;
        }
        synchronized (AbstractC4969wu.class) {
            try {
                byte[] bArr = {-85, 121, -28, -121, -123, com.umeng.analytics.pro.cw.m, -20, -105, -119, 90, -36, -114, -108, 26, -75, -36, -85, 121, -28, -121, -91, com.umeng.analytics.pro.cw.m, -20, -105, -24, 107, -31, -111, -126, 78, -78, -36};
                byte[] bArr2 = {-56, 24, -120, -21, -25, 110, -113, -4};
                int i2 = 0;
                int i3 = 0;
                while (i2 < 32) {
                    if (i3 >= 8) {
                        i3 = 0;
                    }
                    bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                    i2++;
                    i3++;
                }
                new String(bArr, StandardCharsets.UTF_8);
                ArrayList arrayList = AbstractC4969wu.f;
                arrayList.size();
                ArrayList arrayList2 = new ArrayList(arrayList);
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    byte[] bArr3 = {85, 114, 65, 97, -26, 55, -56, -100, 119, 81, 121, 104, -9, 34, -111, -41, 85, 114, 65, 97, -58, 55, -56, -100, 22, 122, com.umeng.analytics.pro.cw.k, 48, -92};
                    byte[] bArr4 = {54, 19, 45, com.umeng.analytics.pro.cw.k, -124, 86, -85, -9};
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < 29) {
                        if (i6 >= 8) {
                            i6 = 0;
                        }
                        bArr3[i5] = (byte) (bArr3[i5] ^ bArr4[i6]);
                        i5++;
                        i6++;
                    }
                    new String(bArr3, StandardCharsets.UTF_8);
                    if (task.isSuccessful()) {
                        ((InterfaceC2647Oh) arrayList2.get(i4)).b();
                    } else {
                        ((InterfaceC2647Oh) arrayList2.get(i4)).a();
                    }
                }
                arrayList2.clear();
                AbstractC4969wu.f.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(InterfaceC3561gr interfaceC3561gr) {
        B7 b7 = B7.f2857a;
        C3684iF c3684iF = (C3684iF) interfaceC3561gr;
        c3684iF.a(AbstractC3441fa.class, b7);
        c3684iF.a(U7.class, b7);
        E7 e7 = E7.f3008a;
        c3684iF.a(AbstractC4477rJ.class, e7);
        c3684iF.a(C3411f8.class, e7);
        C7 c7 = C7.f2910a;
        c3684iF.a(AbstractC4944wf.class, c7);
        c3684iF.a(V7.class, c7);
        A7 a7 = A7.f2802a;
        c3684iF.a(AbstractC4281p4.class, a7);
        c3684iF.a(S7.class, a7);
        D7 d7 = D7.f2956a;
        c3684iF.a(AbstractC4214oJ.class, d7);
        c3684iF.a(C3323e8.class, d7);
        F7 f7 = F7.f3053a;
        c3684iF.a(AbstractC5013xR.class, f7);
        c3684iF.a(C3587h8.class, f7);
    }

    public FW r(C4619sw c4619sw) {
        String str = c4619sw.l;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new D5();
                case "application/x-icy":
                    return new C2975aC();
                case "application/id3":
                    return new C3241dC(null);
                case "application/x-emsg":
                    return new C3386es();
                case "application/x-scte35":
                    return new F80();
            }
        }
        throw new IllegalArgumentException(AbstractC3888ke0.i("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public InterfaceC3299dt[] s(C3123bt[] c3123btArr, F8 f8) {
        InterfaceC3299dt c2959a3;
        C3965lY c3965lYH = C2959a3.h(c3123btArr);
        InterfaceC3299dt[] interfaceC3299dtArr = new InterfaceC3299dt[c3123btArr.length];
        for (int i2 = 0; i2 < c3123btArr.length; i2++) {
            C3123bt c3123bt = c3123btArr[i2];
            if (c3123bt != null) {
                int[] iArr = c3123bt.b;
                if (iArr.length != 0) {
                    if (iArr.length == 1) {
                        c2959a3 = new C2790Tu(iArr[0], c3123bt.c, c3123bt.f4193a);
                    } else {
                        long j2 = 25000;
                        c2959a3 = new C2959a3(c3123bt.f4193a, iArr, c3123bt.c, f8, 10000, j2, j2, (AC) c3965lYH.get(i2));
                    }
                    interfaceC3299dtArr[i2] = c2959a3;
                }
            }
        }
        return interfaceC3299dtArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4218oN
    public InterfaceC4306pN v(C4130nN c4130nN) {
        int i2 = Ug0.f3833a;
        if (i2 < 23 || i2 < 31) {
            return new Qm0(27).v(c4130nN);
        }
        int i3 = AbstractC5011xP.i(c4130nN.c.l);
        Ug0.F(i3);
        AbstractC4038mJ.e();
        return new C4288p70(i3, 0).v(c4130nN);
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public FP z(C3166cQ c3166cQ) {
        return Af0.f2827a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha
    public void k() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public /* synthetic */ void prepare() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public /* synthetic */ void release() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha
    public void i(int i2) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4047mS
    public void startSeek(long j2) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public void f(Looper looper, WU wu) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4669tZ
    public InterfaceC3616hZ o(InterfaceC3616hZ interfaceC3616hZ, YS ys) {
        return interfaceC3616hZ;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.US
    public void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
