package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Net;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3914a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, Input.Keys.NUMPAD_ENTER, 192, 224, 256, EnumC4719u30.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, Input.Keys.F9, 174, EnumC4719u30.INVALID_BID_PAYLOAD_VALUE, Input.Keys.COLON, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final C4710tz g = new C4710tz(25);
    public static final InterfaceC4123nG[] h = new InterfaceC4123nG[0];
    public static X0 i;
    public static UiModeManager j;

    public static final boolean A(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final Me0 B(Object[] objArr) {
        AbstractC2995aW.q(objArr, "array");
        return new Me0(objArr);
    }

    public static final C3678i90 C(InterfaceC4514rk interfaceC4514rk, InterfaceC3549gk interfaceC3549gk, int i2, InterfaceC3567gx interfaceC3567gx) {
        InterfaceC3549gk interfaceC3549gkH = H(interfaceC4514rk, interfaceC3549gk);
        C3678i90 c3860kH = i2 == 2 ? new C3860kH(interfaceC3549gkH, interfaceC3567gx) : new C3678i90(interfaceC3549gkH, true);
        c3860kH.f0(i2, c3860kH, interfaceC3567gx);
        return c3860kH;
    }

    public static /* synthetic */ C3678i90 D(InterfaceC4514rk interfaceC4514rk, AbstractC4008m abstractC4008m, int i2, InterfaceC3567gx interfaceC3567gx, int i3) {
        InterfaceC3549gk interfaceC3549gk = abstractC4008m;
        if ((i3 & 1) != 0) {
            interfaceC3549gk = C2734Rq.f3684a;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        return C(interfaceC4514rk, interfaceC3549gk, i2, interfaceC3567gx);
    }

    public static void E(Activity activity, String str) {
        try {
            try {
                Intent intent = new Intent(Qm0.D(new byte[]{-127, -24, 58, -107, -53, -42, 26, 17, -119, -24, 42, -126, -54, -53, 80, 94, -125, -14, 55, -120, -54, -111, 40, 118, -91, -47}, new byte[]{-32, -122, 94, -25, -92, -65, 126, 63}), Uri.parse(Qm0.D(new byte[]{32, -73, 104, 45, 51, -85, 107, -23, 98, -78, 127, 50, 55, -74, 61, -75, 114, -65, 126, 123}, new byte[]{77, -42, 26, 70, 86, -33, 81, -58}) + str));
                intent.setPackage(Qm0.D(new byte[]{-32, -91, -118, -72, -118, -43, 72, -74, -20, -93, -125, -72, -99, -34, 66, -96, -22, -92, -128}, new byte[]{-125, -54, -25, -106, -21, -69, 44, -60}));
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                activity.startActivity(new Intent(Qm0.D(new byte[]{98, 0, 65, -32, -54, 18, 33, -79, 106, 0, 81, -9, -53, com.umeng.analytics.pro.cw.m, 107, -2, 96, 26, 76, -3, -53, 85, 19, -42, 70, 57}, new byte[]{3, 110, 37, -110, -91, 123, 69, -97}), Uri.parse(Qm0.D(new byte[]{59, -58, -19, 86, 109, -99, -45, -65, 35, -34, -8, 95, 48, -64, -109, -1, 52, -34, -4, 8, 125, -56, -111, -65, 32, -58, -10, 84, 123, -120, -99, -32, 35, -63, -74, 66, 123, -45, -99, -7, 63, -63, -90, 79, 122, -102}, new byte[]{83, -78, -103, 38, 30, -89, -4, -112}) + str)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void F(Activity activity, String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            E(activity, str);
            return;
        }
        StringBuilder sbO = DM.o(str);
        sbO.append(Qm0.D(new byte[]{117, 122, -77, com.umeng.analytics.pro.cw.n, 74, -21, 122, 7, 33, 53, -93, 2, 66, -58, 123, com.umeng.analytics.pro.cw.k, 38, 122, -75, 19, 10, -86, 76}, new byte[]{83, 8, -42, 118, 47, -103, 8, 98}));
        sbO.append(activity.getPackageName());
        sbO.append(Qm0.D(new byte[]{12, -119, 30, -60, -86, 127, -113, -90, 72, -42, 88, -48, -73, 117, -66, -32, 26, -1}, new byte[]{41, -69, 40, -79, -34, 18, -48, -59}));
        sbO.append(str2);
        E(activity, sbO.toString());
    }

    public static String G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bArr = {-92, 75, 106, -16, -60, -2, -81, 23, -8, 4, 37, -9, -73, -77, -73, com.umeng.analytics.pro.cw.m, -19, com.umeng.analytics.pro.cw.k, 120, -86, -9, -13, -96, com.umeng.analytics.pro.cw.m, -23, 90, 53, -94, -11, -77, -76, 23, -29, 6, 51, -30, -7, -20, -73, com.umeng.analytics.pro.cw.n, -93, com.umeng.analytics.pro.cw.n, 51, -71, -7, -11, -85, com.umeng.analytics.pro.cw.n, -48, 75, 63, -87, -91, -75, -100, 83, -95, 77, 55, -32, -30, -35, -22, 57, -94, 43, 11, -26};
        byte[] bArr2 = {-116, 116, 86, -51, -104, -100, -57, 99};
        int length = bArr.length;
        int length2 = bArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 >= length2) {
                i3 = 0;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
            i2++;
            i3++;
        }
        Matcher matcher = Pattern.compile(new String(bArr, StandardCharsets.UTF_8)).matcher(str);
        if (matcher.find()) {
            try {
                return matcher.group();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static final InterfaceC3549gk H(InterfaceC4514rk interfaceC4514rk, InterfaceC3549gk interfaceC3549gk) {
        InterfaceC3549gk interfaceC3549gkS = s(interfaceC4514rk.getCoroutineContext(), interfaceC3549gk, true);
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        return (interfaceC3549gkS == c2627Nn || interfaceC3549gkS.get(G7.d) != null) ? interfaceC3549gkS : interfaceC3549gkS.plus(c2627Nn);
    }

    public static void I(Context context, String str, String str2) {
        Intent intent = new Intent(Qm0.D(new byte[]{20, -95, -63, 121, 107, 53, -17, 118, 28, -95, -47, 110, 106, 40, -91, 57, 22, -69, -52, 100, 106, 114, -35, 17, 48, -104}, new byte[]{117, -49, -91, 11, 4, 92, -117, 88}));
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sbO = DM.o(str);
            sbO.append(Qm0.D(new byte[]{-35, -46, 92, -48, 97, -49, -36, 84, -110, -46, 69, -128}, new byte[]{-5, -89, 40, -67, 62, -94, -71, 48}));
            sbO.append(str2);
            str = sbO.toString();
        }
        intent.setData(Uri.parse(str));
        try {
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0185  */
    /* JADX WARN: Code duplicated, block: B:109:0x0193  */
    /* JADX WARN: Code duplicated, block: B:111:0x019b  */
    /* JADX WARN: Code duplicated, block: B:118:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01be  */
    /* JADX WARN: Code duplicated, block: B:188:0x01c1 A[SYNTHETIC] */
    public static C3219d0 J(Uh0 uh0) {
        int i2;
        int iT;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iG = uh0.g();
        uh0.s(40);
        boolean z = uh0.i(5) > 10;
        uh0.p(iG);
        int[] iArr = d;
        int[] iArr2 = b;
        int i15 = -1;
        if (z) {
            uh0.s(16);
            int i16 = uh0.i(2);
            if (i16 == 0) {
                i15 = 0;
            } else if (i16 == 1) {
                i15 = 1;
            } else if (i16 == 2) {
                i15 = 2;
            }
            uh0.s(3);
            iT = (uh0.i(11) + 1) * 2;
            int i17 = uh0.i(2);
            if (i17 == 3) {
                i4 = c[uh0.i(2)];
                i8 = 6;
                i7 = 3;
            } else {
                i7 = uh0.i(2);
                int i18 = f3914a[i7];
                i4 = iArr2[i17];
                i8 = i18;
            }
            i6 = i8 * 256;
            int i19 = (iT * i4) / (i8 * 32);
            int i20 = uh0.i(3);
            boolean zH = uh0.h();
            i5 = iArr[i20] + (zH ? 1 : 0);
            uh0.s(10);
            if (uh0.h()) {
                uh0.s(8);
            }
            if (i20 == 0) {
                uh0.s(5);
                if (uh0.h()) {
                    uh0.s(8);
                }
            }
            if (i15 == 1 && uh0.h()) {
                uh0.s(16);
            }
            if (uh0.h()) {
                if (i20 > 2) {
                    uh0.s(2);
                }
                if ((i20 & 1) == 0 || i20 <= 2) {
                    i11 = 6;
                } else {
                    i11 = 6;
                    uh0.s(6);
                }
                if ((i20 & 4) != 0) {
                    uh0.s(i11);
                }
                if (zH && uh0.h()) {
                    uh0.s(5);
                }
                if (i15 == 0) {
                    if (uh0.h()) {
                        i12 = 6;
                        uh0.s(6);
                    } else {
                        i12 = 6;
                    }
                    if (i20 == 0 && uh0.h()) {
                        uh0.s(i12);
                    }
                    if (uh0.h()) {
                        uh0.s(i12);
                    }
                    int i21 = uh0.i(2);
                    if (i21 == 1) {
                        uh0.s(5);
                    } else if (i21 == 2) {
                        uh0.s(12);
                    } else {
                        if (i21 == 3) {
                            int i22 = uh0.i(5);
                            if (uh0.h()) {
                                uh0.s(5);
                                if (uh0.h()) {
                                    uh0.s(4);
                                }
                                if (uh0.h()) {
                                    uh0.s(4);
                                }
                                if (uh0.h()) {
                                    uh0.s(4);
                                }
                                if (uh0.h()) {
                                    uh0.s(4);
                                }
                                if (uh0.h()) {
                                    uh0.s(4);
                                }
                                if (uh0.h()) {
                                    uh0.s(4);
                                }
                                if (uh0.h()) {
                                    uh0.s(4);
                                }
                                if (uh0.h()) {
                                    if (uh0.h()) {
                                        uh0.s(4);
                                    }
                                    if (uh0.h()) {
                                        uh0.s(4);
                                    }
                                }
                            }
                            if (uh0.h()) {
                                uh0.s(5);
                                if (uh0.h()) {
                                    uh0.s(7);
                                    if (uh0.h()) {
                                        uh0.s(8);
                                    }
                                }
                            }
                            i13 = 2;
                            uh0.s((i22 + 2) * 8);
                            uh0.c();
                        }
                        if (i20 < i13) {
                            if (uh0.h()) {
                                uh0.s(14);
                            }
                            if (i20 == 0 && uh0.h()) {
                                uh0.s(14);
                            }
                        }
                        if (uh0.h()) {
                            if (i7 == 0) {
                                uh0.s(5);
                            } else {
                                for (i14 = 0; i14 < i8; i14++) {
                                    if (uh0.h()) {
                                        uh0.s(5);
                                    }
                                }
                            }
                        }
                    }
                    i13 = 2;
                    if (i20 < i13) {
                        if (uh0.h()) {
                            uh0.s(14);
                        }
                        if (i20 == 0) {
                            uh0.s(14);
                        }
                    }
                    if (uh0.h()) {
                        if (i7 == 0) {
                            uh0.s(5);
                        } else {
                            while (i14 < i8) {
                                if (uh0.h()) {
                                    uh0.s(5);
                                }
                            }
                        }
                    }
                }
            }
            if (uh0.h()) {
                uh0.s(5);
                if (i20 == 2) {
                    uh0.s(4);
                }
                if (i20 >= 6) {
                    uh0.s(2);
                }
                if (uh0.h()) {
                    i10 = 8;
                    uh0.s(8);
                } else {
                    i10 = 8;
                }
                if (i20 == 0 && uh0.h()) {
                    uh0.s(i10);
                }
                if (i17 < 3) {
                    uh0.r();
                }
            }
            if (i15 == 0 && i7 != 3) {
                uh0.r();
            }
            if (i15 == 2 && (i7 == 3 || uh0.h())) {
                i9 = 6;
                uh0.s(6);
            } else {
                i9 = 6;
            }
            str = (uh0.h() && uh0.i(i9) == 1 && uh0.i(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i2 = i19;
        } else {
            uh0.s(32);
            int i23 = uh0.i(2);
            String str2 = i23 == 3 ? null : MimeTypes.AUDIO_AC3;
            int i24 = uh0.i(6);
            i2 = e[i24 / 2] * 1000;
            iT = t(i23, i24);
            uh0.s(8);
            int i25 = uh0.i(3);
            if ((i25 & 1) == 0 || i25 == 1) {
                i3 = 2;
            } else {
                i3 = 2;
                uh0.s(2);
            }
            if ((i25 & 4) != 0) {
                uh0.s(i3);
            }
            if (i25 == i3) {
                uh0.s(i3);
            }
            i4 = i23 < 3 ? iArr2[i23] : -1;
            i5 = iArr[i25] + (uh0.h() ? 1 : 0);
            i6 = 1536;
            str = str2;
        }
        C3219d0 c3219d0 = new C3219d0();
        c3219d0.b = str;
        c3219d0.f4253a = i15;
        c3219d0.d = i5;
        c3219d0.c = i4;
        c3219d0.e = iT;
        c3219d0.f = i6;
        c3219d0.g = i2;
        return c3219d0;
    }

    public static final boolean K(String str) {
        AbstractC2995aW.q(str, "method");
        return (AbstractC2995aW.i(str, "GET") || AbstractC2995aW.i(str, Net.HttpMethods.HEAD)) ? false : true;
    }

    public static final C2805Uj L(InterfaceC4514rk interfaceC4514rk, InterfaceC3549gk interfaceC3549gk) {
        return new C2805Uj(interfaceC4514rk.getCoroutineContext().plus(interfaceC3549gk));
    }

    public static final void M(C4165nl c4165nl, String str, Boolean bool) {
        c4165nl.b(str, new C5001xF(bool, false));
    }

    public static final void N(C4165nl c4165nl, String str, String str2) {
        AbstractC2995aW.q(str, "key");
        c4165nl.b(str, AbstractC4496rb.c(str2));
    }

    public static ArrayList O(File file) throws IllegalAccessException, IOException, InvocationTargetException {
        Charset charset = AbstractC2307Be.f2881a;
        AbstractC2995aW.q(charset, "charset");
        ArrayList arrayList = new ArrayList();
        C4140nX c4140nX = new C4140nX(arrayList, 3);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = A40.H0(new C2827Vf(bufferedReader)).iterator();
            while (it.hasNext()) {
                c4140nX.invoke(it.next());
            }
            AbstractC3375el.n(bufferedReader, null);
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static String P(File file) throws IllegalAccessException, IOException, InvocationTargetException {
        Charset charset = AbstractC2307Be.f2881a;
        AbstractC2995aW.q(file, "<this>");
        AbstractC2995aW.q(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i2 = inputStreamReader.read(cArr); i2 >= 0; i2 = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i2);
            }
            String string = stringWriter.toString();
            AbstractC2995aW.p(string, "buffer.toString()");
            AbstractC3375el.n(inputStreamReader, null);
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static final void Q(AbstractC4349pp abstractC4349pp, InterfaceC2857Wj interfaceC2857Wj, boolean z) {
        Object objI = abstractC4349pp.i();
        Throwable thF = abstractC4349pp.f(objI);
        Object objV = thF != null ? AbstractC3375el.v(thF) : abstractC4349pp.g(objI);
        if (!z) {
            interfaceC2857Wj.resumeWith(objV);
            return;
        }
        AbstractC2995aW.o(interfaceC2857Wj, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C4085mp c4085mp = (C4085mp) interfaceC2857Wj;
        InterfaceC2857Wj interfaceC2857Wj2 = c4085mp.e;
        InterfaceC3549gk context = interfaceC2857Wj2.getContext();
        Object objC = AbstractC3181cc0.c(context, c4085mp.g);
        C4857vf0 c4857vf0W = objC != AbstractC3181cc0.f4230a ? W(interfaceC2857Wj2, context, objC) : null;
        try {
            interfaceC2857Wj2.resumeWith(objV);
        } finally {
            if (c4857vf0W == null || c4857vf0W.g0()) {
                AbstractC3181cc0.a(context, objC);
            }
        }
    }

    public static final Object R(InterfaceC3549gk interfaceC3549gk, InterfaceC3567gx interfaceC3567gx) throws Throwable {
        AbstractC3210cs abstractC3210csA;
        InterfaceC3549gk interfaceC3549gkS;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC3461fk interfaceC3461fk = G7.d;
        InterfaceC2909Yj interfaceC2909Yj = (InterfaceC2909Yj) interfaceC3549gk.get(interfaceC3461fk);
        C2734Rq c2734Rq = C2734Rq.f3684a;
        if (interfaceC2909Yj == null) {
            abstractC3210csA = AbstractC3270dc0.a();
            interfaceC3549gkS = s(c2734Rq, interfaceC3549gk.plus(abstractC3210csA), true);
            C2627Nn c2627Nn = AbstractC4437qp.f4904a;
            if (interfaceC3549gkS != c2627Nn && interfaceC3549gkS.get(interfaceC3461fk) == null) {
                interfaceC3549gkS = interfaceC3549gkS.plus(c2627Nn);
            }
        } else {
            if (interfaceC2909Yj instanceof AbstractC3210cs) {
            }
            abstractC3210csA = (AbstractC3210cs) AbstractC3270dc0.f4278a.get();
            interfaceC3549gkS = s(c2734Rq, interfaceC3549gk, true);
            C2627Nn c2627Nn2 = AbstractC4437qp.f4904a;
            if (interfaceC3549gkS != c2627Nn2 && interfaceC3549gkS.get(interfaceC3461fk) == null) {
                interfaceC3549gkS = interfaceC3549gkS.plus(c2627Nn2);
            }
        }
        C2614Na c2614Na = new C2614Na(interfaceC3549gkS, threadCurrentThread, abstractC3210csA);
        c2614Na.f0(1, c2614Na, interfaceC3567gx);
        AbstractC3210cs abstractC3210cs = c2614Na.e;
        if (abstractC3210cs != null) {
            int i2 = AbstractC3210cs.d;
            abstractC3210cs.o(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jR = abstractC3210cs != null ? abstractC3210cs.r() : Long.MAX_VALUE;
                if (!(c2614Na.N() instanceof XC)) {
                    if (abstractC3210cs != null) {
                        int i3 = AbstractC3210cs.d;
                        abstractC3210cs.g(false);
                    }
                    Object objA = QE.a(c2614Na.N());
                    C3013ah c3013ah = objA instanceof C3013ah ? (C3013ah) objA : null;
                    if (c3013ah == null) {
                        return objA;
                    }
                    throw c3013ah.f4134a;
                }
                LockSupport.parkNanos(c2614Na, jR);
            } catch (Throwable th) {
                if (abstractC3210cs != null) {
                    int i4 = AbstractC3210cs.d;
                    abstractC3210cs.g(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c2614Na.A(interruptedException);
        throw interruptedException;
    }

    public static void T(InterfaceC3567gx interfaceC3567gx, AbstractC3920l abstractC3920l, AbstractC3920l abstractC3920l2) {
        try {
            AbstractC4173np.a(C5033xf0.f5238a, null, w(n(interfaceC3567gx, abstractC3920l, abstractC3920l2)));
        } catch (Throwable th) {
            abstractC3920l2.resumeWith(AbstractC3375el.v(th));
            throw th;
        }
    }

    public static final long U(String str, long j2, long j3, long j4) {
        String property;
        int i2 = Ta0.f3778a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        Long lJ0 = Z90.j0(property);
        if (lJ0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lJ0.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int V(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) U(str, i2, i3, i4);
    }

    public static final C4857vf0 W(InterfaceC2857Wj interfaceC2857Wj, InterfaceC3549gk interfaceC3549gk, Object obj) {
        C4857vf0 c4857vf0 = null;
        if (!(interfaceC2857Wj instanceof InterfaceC4690tk)) {
            return null;
        }
        if (interfaceC3549gk.get(C4945wf0.f5191a) != null) {
            InterfaceC4690tk callerFrame = (InterfaceC4690tk) interfaceC2857Wj;
            while (!(callerFrame instanceof C4261op) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof C4857vf0) {
                    c4857vf0 = (C4857vf0) callerFrame;
                    break;
                }
            }
            if (c4857vf0 != null) {
                c4857vf0.h0(interfaceC3549gk, obj);
            }
        }
        return c4857vf0;
    }

    public static final Object X(InterfaceC3567gx interfaceC3567gx, InterfaceC3549gk interfaceC3549gk, InterfaceC2857Wj interfaceC2857Wj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        InterfaceC3549gk context = interfaceC2857Wj.getContext();
        InterfaceC3549gk interfaceC3549gkPlus = !((Boolean) interfaceC3549gk.fold(Boolean.FALSE, C3637hk.h)).booleanValue() ? context.plus(interfaceC3549gk) : s(context, interfaceC3549gk, false);
        AbstractC2995aW.w(interfaceC3549gkPlus);
        if (interfaceC3549gkPlus == context) {
            C4016m30 c4016m30 = new C4016m30(interfaceC2857Wj, interfaceC3549gkPlus);
            return AbstractC3375el.Z(c4016m30, c4016m30, interfaceC3567gx);
        }
        G7 g7 = G7.d;
        if (AbstractC2995aW.i(interfaceC3549gkPlus.get(g7), context.get(g7))) {
            C4857vf0 c4857vf0 = new C4857vf0(interfaceC2857Wj, interfaceC3549gkPlus);
            InterfaceC3549gk interfaceC3549gk2 = c4857vf0.c;
            Object objC = AbstractC3181cc0.c(interfaceC3549gk2, null);
            try {
                return AbstractC3375el.Z(c4857vf0, c4857vf0, interfaceC3567gx);
            } finally {
                AbstractC3181cc0.a(interfaceC3549gk2, objC);
            }
        }
        C4261op c4261op = new C4261op(interfaceC2857Wj, interfaceC3549gkPlus);
        T(interfaceC3567gx, c4261op, c4261op);
        do {
            atomicIntegerFieldUpdater = C4261op.e;
            int i2 = atomicIntegerFieldUpdater.get(c4261op);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                Object objA = QE.a(c4261op.N());
                if (objA instanceof C3013ah) {
                    throw ((C3013ah) objA).f4134a;
                }
                return objA;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c4261op, 0, 1));
        return EnumC4602sk.f4993a;
    }

    public static void Y(File file, byte[] bArr) throws IllegalAccessException, IOException, InvocationTargetException {
        AbstractC2995aW.q(file, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            AbstractC3375el.n(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static final C2805Uj a(InterfaceC3549gk interfaceC3549gk) {
        if (interfaceC3549gk.get(G7.e) == null) {
            interfaceC3549gk = interfaceC3549gk.plus(AbstractC2995aW.a());
        }
        return new C2805Uj(interfaceC3549gk);
    }

    public static C4913wF b(InterfaceC2766Sw interfaceC2766Sw) {
        UE ue = VE.d;
        AbstractC2995aW.q(ue, TypedValues.TransitionType.S_FROM);
        AbstractC2995aW.q(interfaceC2766Sw, "builderAction");
        ZE ze = new ZE();
        C3067bF c3067bF = ue.f3865a;
        ze.f4060a = c3067bF.f4164a;
        ze.b = c3067bF.f;
        ze.c = c3067bF.b;
        ze.d = c3067bF.c;
        ze.e = c3067bF.d;
        boolean z = c3067bF.e;
        ze.f = z;
        String str = c3067bF.g;
        ze.g = str;
        ze.h = c3067bF.h;
        boolean z2 = c3067bF.i;
        ze.i = z2;
        String str2 = c3067bF.j;
        ze.j = str2;
        ze.k = c3067bF.k;
        ze.l = c3067bF.l;
        ze.m = ue.b;
        interfaceC2766Sw.invoke(ze);
        if (z2 && !AbstractC2995aW.i(str2, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (z) {
            if (!AbstractC2995aW.i(str, "    ")) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!AbstractC2995aW.i(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        C3067bF c3067bF2 = new C3067bF(ze.f4060a, ze.c, ze.d, ze.e, ze.f, ze.b, ze.g, ze.h, ze.i, ze.j, ze.k, ze.l);
        M40 m40 = ze.m;
        AbstractC2995aW.q(m40, com.umeng.analytics.pro.bc.e);
        C4913wF c4913wF = new C4913wF(c3067bF2, m40);
        if (!AbstractC2995aW.i(m40, T40.f3752a)) {
            String str3 = c3067bF2.j;
            AbstractC2995aW.q(str3, "discriminator");
            for (Map.Entry entry : m40.f3391a.entrySet()) {
                AbstractC3950lJ.z(entry.getValue());
            }
            for (Map.Entry entry2 : m40.b.entrySet()) {
                InterfaceC3156cG interfaceC3156cG = (InterfaceC3156cG) entry2.getKey();
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    InterfaceC3156cG interfaceC3156cG2 = (InterfaceC3156cG) entry3.getKey();
                    InterfaceC4123nG interfaceC4123nG = (InterfaceC4123nG) entry3.getValue();
                    AbstractC2995aW.o(interfaceC3156cG, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    AbstractC2995aW.o(interfaceC3156cG2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    AbstractC2995aW.o(interfaceC4123nG, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    D40 descriptor = interfaceC4123nG.getDescriptor();
                    L40 kind = descriptor.getKind();
                    if ((kind instanceof AbstractC3786jV) || AbstractC2995aW.i(kind, J40.f3253a)) {
                        throw new IllegalArgumentException("Serializer for " + ((C3186cf) interfaceC3156cG2).b() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                    }
                    boolean z3 = c3067bF2.i;
                    if (!z3 && (AbstractC2995aW.i(kind, C3442fa0.b) || AbstractC2995aW.i(kind, C3442fa0.c) || (kind instanceof DV) || (kind instanceof K40))) {
                        throw new IllegalArgumentException("Serializer for " + ((C3186cf) interfaceC3156cG2).b() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
                    }
                    if (!z3) {
                        int iD = descriptor.d();
                        for (int i3 = 0; i3 < iD; i3++) {
                            String strE = descriptor.e(i3);
                            if (AbstractC2995aW.i(strE, str3)) {
                                throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC3156cG2 + " has property '" + strE + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry4 : m40.c.entrySet()) {
                InterfaceC3156cG interfaceC3156cG3 = (InterfaceC3156cG) entry4.getKey();
                InterfaceC2766Sw interfaceC2766Sw2 = (InterfaceC2766Sw) entry4.getValue();
                AbstractC2995aW.o(interfaceC3156cG3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC2995aW.o(interfaceC2766Sw2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
                h(1, interfaceC2766Sw2);
            }
            for (Map.Entry entry5 : m40.e.entrySet()) {
                InterfaceC3156cG interfaceC3156cG4 = (InterfaceC3156cG) entry5.getKey();
                InterfaceC2766Sw interfaceC2766Sw3 = (InterfaceC2766Sw) entry5.getValue();
                AbstractC2995aW.o(interfaceC3156cG4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC2995aW.o(interfaceC2766Sw3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
                h(1, interfaceC2766Sw3);
            }
        }
        return c4913wF;
    }

    public static final C2805Uj c() {
        Ba0 ba0C = AbstractC3375el.c();
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        return new C2805Uj(AbstractC2995aW.f0(ba0C, TL.f3768a));
    }

    public static final C4095mz d(InterfaceC4123nG interfaceC4123nG) {
        return new C4095mz(W90.f3912a, interfaceC4123nG, 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(C3710ic0 c3710ic0, InterfaceC3655hx interfaceC3655hx, Throwable th, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, InvocationTargetException {
        C5146yv c5146yv;
        if (interfaceC2857Wj instanceof C5146yv) {
            c5146yv = (C5146yv) interfaceC2857Wj;
            int i2 = c5146yv.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c5146yv.c = i2 - Integer.MIN_VALUE;
            } else {
                c5146yv = new C5146yv(interfaceC2857Wj);
            }
        } else {
            c5146yv = new C5146yv(interfaceC2857Wj);
        }
        Object obj = c5146yv.b;
        Object obj2 = EnumC4602sk.f4993a;
        int i3 = c5146yv.c;
        try {
            if (i3 == 0) {
                AbstractC3375el.b0(obj);
                c5146yv.f5305a = th;
                c5146yv.c = 1;
                if (interfaceC3655hx.invoke(c3710ic0, th, c5146yv) == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = c5146yv.f5305a;
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC2995aW.h(th2, th);
            }
            throw th2;
        }
    }

    public static final Executor f(AbstractC3899kk abstractC3899kk) {
        Executor executorN;
        AbstractC4440qs abstractC4440qs = abstractC3899kk instanceof AbstractC4440qs ? (AbstractC4440qs) abstractC3899kk : null;
        return (abstractC4440qs == null || (executorN = abstractC4440qs.n()) == null) ? new N20(abstractC3899kk, 1) : executorN;
    }

    public static C3819jo g(InterfaceC4514rk interfaceC4514rk, ExecutorC4433qn executorC4433qn, InterfaceC3567gx interfaceC3567gx, int i2) {
        InterfaceC3549gk interfaceC3549gk = executorC4433qn;
        if ((i2 & 1) != 0) {
            interfaceC3549gk = C2734Rq.f3684a;
        }
        C3819jo c3819jo = new C3819jo(H(interfaceC4514rk, interfaceC3549gk), true);
        c3819jo.f0(1, c3819jo, interfaceC3567gx);
        return c3819jo;
    }

    public static void h(int i2, Object obj) {
        if (obj == null || z(i2, obj)) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(DM.i(obj.getClass().getName(), " cannot be cast to ", AbstractC3950lJ.p("kotlin.jvm.functions.Function", i2)));
        AbstractC2995aW.m0(WD.class.getName(), classCastException);
        throw classCastException;
    }

    public static void i(InterfaceC4514rk interfaceC4514rk) {
        InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) interfaceC4514rk.getCoroutineContext().get(G7.e);
        if (interfaceC5000xE != null) {
            interfaceC5000xE.a(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC4514rk).toString());
        }
    }

    public static final void j(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("Expected positive parallelism level, but got ", i2).toString());
        }
    }

    public static void k(int i2) {
        if (new C5175zD(2, 36, 1).b(i2)) {
            return;
        }
        StringBuilder sbQ = AbstractC5044xl.q("radix ", i2, " was not in valid range ");
        sbQ.append(new C5175zD(2, 36, 1));
        throw new IllegalArgumentException(sbQ.toString());
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d3 A[Catch: NoSuchFieldException -> 0x01c8, TRY_LEAVE, TryCatch #1 {NoSuchFieldException -> 0x01c8, blocks: (B:107:0x01c3, B:112:0x01cf, B:114:0x01d3), top: B:129:0x01c3 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01d6 A[PHI: r1
  0x01d6: PHI (r1v12 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nG) = 
  (r1v11 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nG)
  (r1v18 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nG)
  (r1v20 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nG)
 binds: [B:108:0x01c8, B:113:0x01d1, B:100:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x01db  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:131:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x01af  */
    public static final InterfaceC4123nG l(InterfaceC3156cG interfaceC3156cG, InterfaceC4123nG... interfaceC4123nGArr) throws IllegalAccessException, InvocationTargetException {
        Object obj;
        Class[] clsArr;
        InterfaceC4123nG c3874kV;
        boolean z;
        InterfaceC4123nG interfaceC4123nG;
        N40 n40;
        Class<?>[] declaredClasses;
        int length;
        Class<?> cls;
        int i2;
        Object obj2;
        Field field;
        Class<?> cls2;
        AbstractC2995aW.q(interfaceC3156cG, "<this>");
        AbstractC2995aW.q(interfaceC4123nGArr, "args");
        Class clsK = AbstractC2995aW.K(interfaceC3156cG);
        InterfaceC4123nG[] interfaceC4123nGArr2 = (InterfaceC4123nG[]) Arrays.copyOf(interfaceC4123nGArr, interfaceC4123nGArr.length);
        AbstractC2995aW.q(interfaceC4123nGArr2, "args");
        if (clsK.isEnum() && clsK.getAnnotation(N40.class) == null && clsK.getAnnotation(InterfaceC3612hV.class) == null) {
            Object[] enumConstants = clsK.getEnumConstants();
            String canonicalName = clsK.getCanonicalName();
            AbstractC2995aW.p(canonicalName, "canonicalName");
            AbstractC2995aW.o(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new C2476Hr(canonicalName, (Enum[]) enumConstants);
        }
        if (clsK.isInterface()) {
            N40 n41 = (N40) clsK.getAnnotation(N40.class);
            C3874kV c3874kV2 = (n41 == null || AbstractC2995aW.i(AbstractC3263dY.a(n41.with()), AbstractC3263dY.a(C3874kV.class))) ? new C3874kV(AbstractC3263dY.a(clsK)) : null;
            if (c3874kV2 != null) {
                return c3874kV2;
            }
        }
        InterfaceC4123nG[] interfaceC4123nGArr3 = (InterfaceC4123nG[]) Arrays.copyOf(interfaceC4123nGArr2, interfaceC4123nGArr2.length);
        try {
            Field declaredField = clsK.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj == null) {
            c3874kV = null;
        } else {
            try {
                if (interfaceC4123nGArr3.length == 0) {
                    clsArr = new Class[0];
                } else {
                    int length2 = interfaceC4123nGArr3.length;
                    Class[] clsArr2 = new Class[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        clsArr2[i3] = InterfaceC4123nG.class;
                    }
                    clsArr = clsArr2;
                }
                Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC4123nGArr3, interfaceC4123nGArr3.length));
                if (objInvoke instanceof InterfaceC4123nG) {
                    c3874kV = (InterfaceC4123nG) objInvoke;
                } else {
                    c3874kV = null;
                }
            } catch (NoSuchMethodException unused2) {
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                String message = cause.getMessage();
                if (message == null) {
                    message = e2.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
        }
        if (c3874kV == null) {
            Field[] declaredFields = clsK.getDeclaredFields();
            AbstractC2995aW.p(declaredFields, "declaredFields");
            int length3 = declaredFields.length;
            Field field2 = null;
            int i4 = 0;
            boolean z2 = false;
            while (true) {
                if (i4 >= length3) {
                    if (!z2) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i4];
                if (AbstractC2995aW.i(field3.getName(), "INSTANCE") && AbstractC2995aW.i(field3.getType(), clsK) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z2) {
                        field2 = field3;
                        z2 = true;
                    }
                }
                i4++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                c3874kV = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = clsK.getMethods();
                AbstractC2995aW.p(methods, "methods");
                int length4 = methods.length;
                Method method = null;
                int i5 = 0;
                boolean z3 = false;
                while (true) {
                    if (i5 >= length4) {
                        if (!z3) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i5];
                    if (AbstractC2995aW.i(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC2995aW.p(parameterTypes, "it.parameterTypes");
                        if (parameterTypes.length == 0 && AbstractC2995aW.i(method2.getReturnType(), InterfaceC4123nG.class)) {
                            if (!z3) {
                                method = method2;
                                z3 = true;
                            }
                        }
                    }
                    i5++;
                    method = null;
                    break;
                }
                if (method == null) {
                    c3874kV = null;
                } else {
                    z = false;
                    Object objInvoke2 = method.invoke(obj3, new Object[0]);
                    c3874kV = objInvoke2 instanceof InterfaceC4123nG ? (InterfaceC4123nG) objInvoke2 : null;
                }
                if (c3874kV == null) {
                    try {
                        declaredClasses = clsK.getDeclaredClasses();
                        AbstractC2995aW.p(declaredClasses, "declaredClasses");
                        length = declaredClasses.length;
                        cls = null;
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                if (z) {
                                    break;
                                }
                                break;
                            }
                            try {
                                cls2 = declaredClasses[i2];
                                if (!AbstractC2995aW.i(cls2.getSimpleName(), "$serializer")) {
                                    if (z) {
                                        cls = cls2;
                                        z = true;
                                    }
                                }
                                i2++;
                            } catch (NoSuchFieldException unused3) {
                                interfaceC4123nG = null;
                            }
                            cls = null;
                            break;
                        }
                        if (cls != null || (field = cls.getField("INSTANCE")) == null) {
                            interfaceC4123nG = null;
                            obj2 = null;
                        } else {
                            interfaceC4123nG = null;
                            try {
                                obj2 = field.get(null);
                            } catch (NoSuchFieldException unused4) {
                            }
                        }
                        if (obj2 instanceof InterfaceC4123nG) {
                            c3874kV = (InterfaceC4123nG) obj2;
                        } else {
                            c3874kV = interfaceC4123nG;
                        }
                    } catch (NoSuchFieldException unused5) {
                        interfaceC4123nG = null;
                    }
                    if (c3874kV == null) {
                        if (clsK.getAnnotation(InterfaceC3612hV.class) == null && ((n40 = (N40) clsK.getAnnotation(N40.class)) == null || !AbstractC2995aW.i(AbstractC3263dY.a(n40.with()), AbstractC3263dY.a(C3874kV.class)))) {
                            return interfaceC4123nG;
                        }
                        c3874kV = new C3874kV(AbstractC3263dY.a(clsK));
                    }
                }
            }
            z = false;
            if (c3874kV == null) {
                declaredClasses = clsK.getDeclaredClasses();
                AbstractC2995aW.p(declaredClasses, "declaredClasses");
                length = declaredClasses.length;
                cls = null;
                i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (z) {
                            break;
                        }
                        break;
                    }
                    cls2 = declaredClasses[i2];
                    if (!AbstractC2995aW.i(cls2.getSimpleName(), "$serializer")) {
                        if (z) {
                            cls = cls2;
                            z = true;
                        }
                    }
                    i2++;
                    cls = null;
                    break;
                }
                if (cls != null) {
                    interfaceC4123nG = null;
                    obj2 = null;
                    if (obj2 instanceof InterfaceC4123nG) {
                        c3874kV = (InterfaceC4123nG) obj2;
                    } else {
                        c3874kV = interfaceC4123nG;
                    }
                    if (c3874kV == null) {
                        if (clsK.getAnnotation(InterfaceC3612hV.class) == null) {
                            return interfaceC4123nG;
                        }
                        c3874kV = new C3874kV(AbstractC3263dY.a(clsK));
                    }
                } else {
                    interfaceC4123nG = null;
                    obj2 = null;
                    if (obj2 instanceof InterfaceC4123nG) {
                        c3874kV = (InterfaceC4123nG) obj2;
                    } else {
                        c3874kV = interfaceC4123nG;
                    }
                    if (c3874kV == null) {
                        if (clsK.getAnnotation(InterfaceC3612hV.class) == null) {
                            return interfaceC4123nG;
                        }
                        c3874kV = new C3874kV(AbstractC3263dY.a(clsK));
                    }
                }
            }
        }
        return c3874kV;
    }

    public static final Object m(InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        C4016m30 c4016m30 = new C4016m30(interfaceC2857Wj, interfaceC2857Wj.getContext());
        return AbstractC3375el.Z(c4016m30, c4016m30, interfaceC3567gx);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC2857Wj n(InterfaceC3567gx interfaceC3567gx, Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        AbstractC2995aW.q(interfaceC3567gx, "<this>");
        AbstractC2995aW.q(interfaceC2857Wj, "completion");
        if (interfaceC3567gx instanceof AbstractC3677i9) {
            return ((AbstractC3677i9) interfaceC3567gx).create(obj, interfaceC2857Wj);
        }
        InterfaceC3549gk context = interfaceC2857Wj.getContext();
        return context == C2734Rq.f3684a ? new SD(interfaceC3567gx, obj, interfaceC2857Wj) : new TD(interfaceC2857Wj, context, interfaceC3567gx, obj);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:25:0x0058, B:29:0x006d, B:31:0x0075, B:33:0x007b, B:35:0x0081, B:38:0x0092, B:39:0x009a, B:40:0x009b, B:41:0x00a6, B:20:0x0047, B:24:0x0052), top: B:55:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007b A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:25:0x0058, B:29:0x006d, B:31:0x0075, B:33:0x007b, B:35:0x0081, B:38:0x0092, B:39:0x009a, B:40:0x009b, B:41:0x00a6, B:20:0x0047, B:24:0x0052), top: B:55:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:25:0x0058, B:29:0x006d, B:31:0x0075, B:33:0x007b, B:35:0x0081, B:38:0x0092, B:39:0x009a, B:40:0x009b, B:41:0x00a6, B:20:0x0047, B:24:0x0052), top: B:55:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0092 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:25:0x0058, B:29:0x006d, B:31:0x0075, B:33:0x007b, B:35:0x0081, B:38:0x0092, B:39:0x009a, B:40:0x009b, B:41:0x00a6, B:20:0x0047, B:24:0x0052), top: B:55:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:25:0x0058, B:29:0x006d, B:31:0x0075, B:33:0x007b, B:35:0x0081, B:38:0x0092, B:39:0x009a, B:40:0x009b, B:41:0x00a6, B:20:0x0047, B:24:0x0052), top: B:55:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x008f -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object o(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv r7, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UV r8, boolean r9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4794uv
            if (r0 == 0) goto L13
            r0 = r10
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uv r0 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4794uv) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uv r0 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uv
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sk r1 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk.f4993a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            boolean r9 = r0.d
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yb r7 = r0.c
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RX r8 = r0.b
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rv r2 = r0.f5109a
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r10)     // Catch: java.lang.Throwable -> L34
        L31:
            r10 = r7
            r7 = r2
            goto L58
        L34:
            r7 = move-exception
            goto Lb0
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.d
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yb r7 = r0.c
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RX r8 = r0.b
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rv r2 = r0.f5109a
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r10)     // Catch: java.lang.Throwable -> L34
            goto L6d
        L4b:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r10)
            boolean r10 = r7 instanceof gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3710ic0
            if (r10 != 0) goto Lb8
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wd r10 = r8.d     // Catch: java.lang.Throwable -> L34
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yb r10 = r10.iterator()     // Catch: java.lang.Throwable -> L34
        L58:
            r0.f5109a = r7     // Catch: java.lang.Throwable -> L34
            r0.b = r8     // Catch: java.lang.Throwable -> L34
            r0.c = r10     // Catch: java.lang.Throwable -> L34
            r0.d = r9     // Catch: java.lang.Throwable -> L34
            r0.f = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r10.b(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L69
            return r1
        L69:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L6d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L34
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto La7
            java.lang.Object r10 = r7.f5282a     // Catch: java.lang.Throwable -> L34
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SE r5 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2382Eb.p     // Catch: java.lang.Throwable -> L34
            if (r10 == r5) goto L9b
            r7.f5282a = r5     // Catch: java.lang.Throwable -> L34
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SE r5 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2382Eb.l     // Catch: java.lang.Throwable -> L34
            if (r10 == r5) goto L92
            r0.f5109a = r2     // Catch: java.lang.Throwable -> L34
            r0.b = r8     // Catch: java.lang.Throwable -> L34
            r0.c = r7     // Catch: java.lang.Throwable -> L34
            r0.d = r9     // Catch: java.lang.Throwable -> L34
            r0.f = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L34
            if (r10 != r1) goto L31
            return r1
        L92:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cb r7 = r7.c     // Catch: java.lang.Throwable -> L34
            java.lang.Throwable r7 = r7.r()     // Catch: java.lang.Throwable -> L34
            int r10 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3502g90.f4407a     // Catch: java.lang.Throwable -> L34
            throw r7     // Catch: java.lang.Throwable -> L34
        L9b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r10 = "`hasNext()` has not been invoked"
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L34
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L34
            throw r7     // Catch: java.lang.Throwable -> L34
        La7:
            if (r9 == 0) goto Lad
            r7 = 0
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.m(r8, r7)
        Lad:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xf0 r7 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0.f5238a
            return r7
        Lb0:
            throw r7     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r10 = move-exception
            if (r9 == 0) goto Lb7
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.m(r8, r7)
        Lb7:
            throw r10
        Lb8:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ic0 r7 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3710ic0) r7
            java.lang.Throwable r7 = r7.f4510a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD.o(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rv, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UV, boolean, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wj):java.lang.Object");
    }

    public static final void p(VE ve, NF nf, InterfaceC4123nG interfaceC4123nG, Object obj) {
        AbstractC2995aW.q(ve, "<this>");
        new P90(ve.f3865a.e ? new C4333ph(nf, ve) : new C4157nh(nf), ve, 1, new InterfaceC4825vF[DM.F(4).length]).x(interfaceC4123nG, obj);
    }

    public static final boolean q(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x002a  */
    public static final InterfaceC4123nG r(U u, InterfaceC3385er interfaceC3385er, Object obj) {
        InterfaceC4123nG interfaceC4123nG;
        AbstractC2995aW.q(u, "<this>");
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        M40 m40A = interfaceC3385er.a();
        m40A.getClass();
        InterfaceC3156cG interfaceC3156cG = ((C3874kV) u).f4600a;
        AbstractC2995aW.q(interfaceC3156cG, "baseClass");
        if (AbstractC2995aW.L(interfaceC3156cG).isInstance(obj)) {
            Map map = (Map) m40A.b.get(interfaceC3156cG);
            interfaceC4123nG = map != null ? (InterfaceC4123nG) map.get(AbstractC3263dY.a(obj.getClass())) : null;
            if (!(interfaceC4123nG instanceof InterfaceC4123nG)) {
                interfaceC4123nG = null;
            }
            if (interfaceC4123nG == null) {
                Object obj2 = m40A.c.get(interfaceC3156cG);
                InterfaceC2766Sw interfaceC2766Sw = z(1, obj2) ? (InterfaceC2766Sw) obj2 : null;
                if (interfaceC2766Sw != null) {
                    interfaceC4123nG = (InterfaceC4123nG) interfaceC2766Sw.invoke(obj);
                } else {
                    interfaceC4123nG = null;
                }
            }
        } else {
            interfaceC4123nG = null;
        }
        if (interfaceC4123nG != null) {
            return interfaceC4123nG;
        }
        C3186cf c3186cfA = AbstractC3263dY.a(obj.getClass());
        String strB = c3186cfA.b();
        if (strB == null) {
            strB = String.valueOf(c3186cfA);
        }
        AbstractC2871Wx.t0(strB, interfaceC3156cG);
        throw null;
    }

    public static final InterfaceC3549gk s(InterfaceC3549gk interfaceC3549gk, InterfaceC3549gk interfaceC3549gk2, boolean z) {
        Boolean bool = Boolean.FALSE;
        C3637hk c3637hk = C3637hk.h;
        boolean zBooleanValue = ((Boolean) interfaceC3549gk.fold(bool, c3637hk)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC3549gk2.fold(bool, c3637hk)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC3549gk.plus(interfaceC3549gk2);
        }
        C3086bY c3086bY = new C3086bY();
        c3086bY.f4172a = interfaceC3549gk2;
        C2734Rq c2734Rq = C2734Rq.f3684a;
        InterfaceC3549gk interfaceC3549gk3 = (InterfaceC3549gk) interfaceC3549gk.fold(c2734Rq, new C3000aa0(2, c3086bY, z));
        if (zBooleanValue2) {
            c3086bY.f4172a = ((InterfaceC3549gk) c3086bY.f4172a).fold(c2734Rq, C3637hk.g);
        }
        return interfaceC3549gk3.plus((InterfaceC3549gk) c3086bY.f4172a);
    }

    public static int t(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) * 2;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static final InterfaceC4123nG u(InterfaceC4123nG interfaceC4123nG) {
        AbstractC2995aW.q(interfaceC4123nG, "<this>");
        return interfaceC4123nG.getDescriptor().b() ? interfaceC4123nG : new ZR(interfaceC4123nG);
    }

    public static final C2798Uc v(InterfaceC2857Wj interfaceC2857Wj) {
        C2798Uc c2798Uc;
        C2798Uc c2798Uc2;
        if (!(interfaceC2857Wj instanceof C4085mp)) {
            return new C2798Uc(1, interfaceC2857Wj);
        }
        C4085mp c4085mp = (C4085mp) interfaceC2857Wj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4085mp.h;
            Object obj = atomicReferenceFieldUpdater.get(c4085mp);
            c2798Uc = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c4085mp, AbstractC4173np.b);
                c2798Uc2 = null;
                break;
            }
            if (obj instanceof C2798Uc) {
                SE se = AbstractC4173np.b;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c4085mp, obj, se)) {
                        c2798Uc2 = (C2798Uc) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c4085mp) == obj);
            } else if (obj != AbstractC4173np.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c2798Uc2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2798Uc.g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c2798Uc2);
            if (!(obj2 instanceof C2906Yg) || ((C2906Yg) obj2).d == null) {
                C2798Uc.f.set(c2798Uc2, 536870911);
                atomicReferenceFieldUpdater2.set(c2798Uc2, C4361q0.f4862a);
                c2798Uc = c2798Uc2;
            } else {
                c2798Uc2.o();
            }
            if (c2798Uc != null) {
                return c2798Uc;
            }
        }
        return new C2798Uc(2, interfaceC2857Wj);
    }

    public static InterfaceC2857Wj w(InterfaceC2857Wj interfaceC2857Wj) {
        InterfaceC2857Wj interfaceC2857WjIntercepted;
        AbstractC2995aW.q(interfaceC2857Wj, "<this>");
        AbstractC2883Xj abstractC2883Xj = interfaceC2857Wj instanceof AbstractC2883Xj ? (AbstractC2883Xj) interfaceC2857Wj : null;
        return (abstractC2883Xj == null || (interfaceC2857WjIntercepted = abstractC2883Xj.intercepted()) == null) ? interfaceC2857Wj : interfaceC2857WjIntercepted;
    }

    public static final boolean x(InterfaceC4514rk interfaceC4514rk) {
        InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) interfaceC4514rk.getCoroutineContext().get(G7.e);
        if (interfaceC5000xE != null) {
            return interfaceC5000xE.isActive();
        }
        return true;
    }

    public static final boolean y(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static boolean z(int i2, Object obj) {
        int arity;
        if (!(obj instanceof InterfaceC3215cx)) {
            return false;
        }
        if (obj instanceof InterfaceC4445qx) {
            arity = ((InterfaceC4445qx) obj).getArity();
        } else if (obj instanceof InterfaceC2714Qw) {
            arity = 0;
        } else if (obj instanceof InterfaceC2766Sw) {
            arity = 1;
        } else if (obj instanceof InterfaceC3567gx) {
            arity = 2;
        } else if (obj instanceof InterfaceC3655hx) {
            arity = 3;
        } else if (obj instanceof InterfaceC3741ix) {
            arity = 4;
        } else {
            arity = obj instanceof InterfaceC3917kx ? 6 : -1;
        }
        return arity == i2;
    }
}
