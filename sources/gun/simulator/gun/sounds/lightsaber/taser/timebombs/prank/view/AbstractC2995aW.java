package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.backends.android.SpineData;
import com.google.android.gms.measurement.AppMeasurement;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2995aW implements InterfaceC3561gr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f4124a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final Qm0 b = new Qm0(23);
    public static final C3420fF c = new C3420fF(2);
    public static Method d;
    public static UiModeManager e;

    public static String A0(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        int i2 = Ug0.f3833a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static C4899w50 B(Set set, Aa0 aa0) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof C4899w50)) {
                set.getClass();
                return new C4899w50(set, aa0);
            }
            C4899w50 c4899w50 = (C4899w50) set;
            InterfaceC4753uV interfaceC4753uV = c4899w50.b;
            interfaceC4753uV.getClass();
            return new C4899w50((Set) c4899w50.f5167a, new C4841vV(Arrays.asList(interfaceC4753uV, aa0)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof C4899w50)) {
            set2.getClass();
            return new C4987x50(set2, aa0);
        }
        C4899w50 c4899w51 = (C4899w50) set2;
        InterfaceC4753uV interfaceC4753uV2 = c4899w51.b;
        interfaceC4753uV2.getClass();
        return new C4987x50((SortedSet) c4899w51.f5167a, new C4841vV(Arrays.asList(interfaceC4753uV2, aa0)));
    }

    public static final Re0 B0(String str) {
        int i;
        WD.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (s(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        int i4 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i5 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                if (i4 == i3) {
                    i4 = (int) ((((long) (-1)) & 4294967295L) / (((long) 10) & 4294967295L));
                    if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int i6 = i2 * 10;
            int i7 = i6 + iDigit;
            if (Integer.compare(i7 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i7;
            i3 = 119304647;
        }
        return new Re0(i2);
    }

    public static void C(String str) {
        S3.b("first_weapon", str);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008c A[PHI: r16
  0x008c: PHI (r16v2 long) = (r16v1 long), (r16v7 long) binds: [B:19:0x0051, B:35:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[LOOP:0: B:14:0x0038->B:40:0x00a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0012 A[SYNTHETIC] */
    public static final We0 C0(String str) {
        int i;
        long j;
        long j2;
        long j3;
        q(str, "<this>");
        int i2 = 10;
        WD.k(10);
        int length = str.length();
        if (length != 0) {
            char cCharAt = str.charAt(0);
            int i3 = 1;
            if (s(cCharAt, 48) < 0) {
                i = (length != 1 && cCharAt == '+') ? 1 : 0;
            }
            long j4 = 10;
            long j5 = 0;
            long j6 = 0;
            long j7 = 512409557603043100L;
            while (i < length) {
                int iDigit = Character.digit((int) str.charAt(i), i2);
                if (iDigit >= 0) {
                    int i4 = length;
                    long j8 = j6 ^ Long.MIN_VALUE;
                    if (Long.compare(j8, j7 ^ Long.MIN_VALUE) <= 0) {
                        j = j6 * j4;
                        j2 = (((long) iDigit) & 4294967295L) + j;
                        if (Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE) >= 0) {
                            i++;
                            j6 = j2;
                            length = i4;
                            i2 = 10;
                            i3 = 1;
                            j5 = 0;
                        }
                    } else if (j7 == 512409557603043100L) {
                        if (j4 < j5) {
                            if (Long.MAX_VALUE < (j4 ^ Long.MIN_VALUE)) {
                                j7 = j5;
                            } else {
                                j3 = 1;
                            }
                            if (Long.compare(j8, j7 ^ Long.MIN_VALUE) > 0) {
                                j = j6 * j4;
                                j2 = (((long) iDigit) & 4294967295L) + j;
                                if (Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE) >= 0) {
                                    i++;
                                    j6 = j2;
                                    length = i4;
                                    i2 = 10;
                                    i3 = 1;
                                    j5 = 0;
                                }
                            }
                        } else {
                            long j9 = (Long.MAX_VALUE / j4) << i3;
                            if ((((-1) - (j9 * j4)) ^ Long.MIN_VALUE) < (j4 ^ Long.MIN_VALUE)) {
                                i3 = 0;
                            }
                            j3 = j9 + ((long) i3);
                        }
                        j7 = j3;
                        if (Long.compare(j8, j7 ^ Long.MIN_VALUE) > 0) {
                            j = j6 * j4;
                            j2 = (((long) iDigit) & 4294967295L) + j;
                            if (Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE) >= 0) {
                                i++;
                                j6 = j2;
                                length = i4;
                                i2 = 10;
                                i3 = 1;
                                j5 = 0;
                            }
                        }
                    }
                }
            }
            return new We0(j6);
        }
        return null;
    }

    public static InterfaceC3373ek D(InterfaceC3373ek interfaceC3373ek, InterfaceC3461fk interfaceC3461fk) {
        q(interfaceC3461fk, "key");
        if (i(interfaceC3373ek.getKey(), interfaceC3461fk)) {
            return interfaceC3373ek;
        }
        return null;
    }

    public static final void D0(VV vv, VolumeSettingsChange volumeSettingsChange) {
        Object objF = ((UV) vv).d.f(volumeSettingsChange);
        if (!(objF instanceof C3975le)) {
        } else {
            Object obj = ((C4063me) WD.R(C2734Rq.f3684a, new C4239oe(vv, volumeSettingsChange, null))).f4704a;
        }
    }

    public static void E(int i, JT jt) {
        jt.B(7);
        byte[] bArr = jt.f3266a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static final Object E0(long j, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) {
        if (j > 0) {
            return s0(new Kc0(j, interfaceC2857Wj), interfaceC3567gx);
        }
        throw new Jc0("Timed out immediately", null);
    }

    public static String F(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object F0(long j, InterfaceC3567gx interfaceC3567gx, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        Lc0 lc0;
        C3086bY c3086bY;
        if (interfaceC2857Wj instanceof Lc0) {
            lc0 = (Lc0) interfaceC2857Wj;
            int i = lc0.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lc0.d = i - Integer.MIN_VALUE;
            } else {
                lc0 = new Lc0(interfaceC2857Wj);
            }
        } else {
            lc0 = new Lc0(interfaceC2857Wj);
        }
        Object objS0 = lc0.c;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = lc0.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3086bY = lc0.b;
            try {
                AbstractC3375el.b0(objS0);
            } catch (Jc0 e2) {
                e = e2;
                if (e.f3272a == c3086bY.f4172a) {
                    return null;
                }
                throw e;
            }
        }
        AbstractC3375el.b0(objS0);
        if (j <= 0) {
            return null;
        }
        C3086bY c3086bY2 = new C3086bY();
        try {
            lc0.f3361a = interfaceC3567gx;
            lc0.b = c3086bY2;
            lc0.d = 1;
            Kc0 kc0 = new Kc0(j, lc0);
            c3086bY2.f4172a = kc0;
            objS0 = s0(kc0, interfaceC3567gx);
            return objS0 == enumC4602sk ? enumC4602sk : objS0;
        } catch (Jc0 e3) {
            e = e3;
            c3086bY = c3086bY2;
            if (e.f3272a == c3086bY.f4172a) {
                return null;
            }
            throw e;
        }
    }

    public static final InterfaceC4083mo G(InterfaceC3549gk interfaceC3549gk) {
        InterfaceC3373ek interfaceC3373ek = interfaceC3549gk.get(G7.d);
        InterfaceC4083mo interfaceC4083mo = interfaceC3373ek instanceof InterfaceC4083mo ? (InterfaceC4083mo) interfaceC3373ek : null;
        return interfaceC4083mo == null ? AbstractC2912Ym.f4040a : interfaceC4083mo;
    }

    public static SharedPreferences.Editor H(Context context) {
        return context.getSharedPreferences(O(context), 0).edit();
    }

    public static float I(AbstractApplicationC2673Ph abstractApplicationC2673Ph, String str, float f) {
        SharedPreferences sharedPreferences = abstractApplicationC2673Ph.getSharedPreferences(O(abstractApplicationC2673Ph), 0);
        return sharedPreferences.contains(str) ? sharedPreferences.getFloat(str, f) : f;
    }

    public static int J(Context context, int i, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(O(context), 0);
        return sharedPreferences.contains(str) ? sharedPreferences.getInt(str, i) : i;
    }

    public static final Class K(InterfaceC3156cG interfaceC3156cG) {
        q(interfaceC3156cG, "<this>");
        Class clsA = ((InterfaceC3098bf) interfaceC3156cG).a();
        o(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    public static final Class L(InterfaceC3156cG interfaceC3156cG) {
        q(interfaceC3156cG, "<this>");
        Class clsA = ((InterfaceC3098bf) interfaceC3156cG).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsA : Double.class;
            case 104431:
                return !name.equals("int") ? clsA : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsA : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsA : Character.class;
            case 3327612:
                return !name.equals("long") ? clsA : Long.class;
            case 3625364:
                return !name.equals("void") ? clsA : Void.class;
            case 64711720:
                return !name.equals(TypedValues.Custom.S_BOOLEAN) ? clsA : Boolean.class;
            case 97526364:
                return !name.equals(TypedValues.Custom.S_FLOAT) ? clsA : Float.class;
            case 109413500:
                return !name.equals("short") ? clsA : Short.class;
            default:
                return clsA;
        }
    }

    public static final int M(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        }
        if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i <= i2) {
            return i2;
        }
        int i7 = -i3;
        int i8 = i % i7;
        if (i8 < 0) {
            i8 += i7;
        }
        int i9 = i2 % i7;
        if (i9 < 0) {
            i9 += i7;
        }
        int i10 = (i8 - i9) % i7;
        if (i10 < 0) {
            i10 += i7;
        }
        return i2 + i10;
    }

    public static final W30 N(Object obj) {
        if (obj == AbstractC2492Ih.f3233a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        o(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (W30) obj;
    }

    public static String O(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        byte[] bArr = {49, -118, -56, 38, 8, -18, 127};
        byte[] bArr2 = {110, -21, -84, 121, 100, -121, 29, -67};
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        sb.append(new String(bArr, StandardCharsets.UTF_8));
        return sb.toString();
    }

    public static String P(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(O(context), 0);
        return sharedPreferences.contains(str) ? sharedPreferences.getString(str, "") : "";
    }

    public static final void Q(InterfaceC3549gk interfaceC3549gk, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            InterfaceC4075mk interfaceC4075mk = (InterfaceC4075mk) interfaceC3549gk.get(C3987lk.f4661a);
            if (interfaceC4075mk != null) {
                interfaceC4075mk.handleException(interfaceC3549gk, th);
            } else {
                AbstractC3375el.H(interfaceC3549gk, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                h(runtimeException, th);
                th = runtimeException;
            }
            AbstractC3375el.H(interfaceC3549gk, th);
        }
    }

    public static int R(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static int S(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static String T(String str, String str2) {
        Pattern pattern = Ln0.f3374a;
        String str3 = "<script type=\"text/javascript\">" + str + "</script>";
        e(str2, "HTML is null or empty");
        ArrayList arrayList = new ArrayList();
        int length = str2.length();
        int i = 0;
        while (i < length) {
            int iIndexOf = str2.indexOf("<!--", i);
            if (iIndexOf >= 0) {
                int iIndexOf2 = str2.indexOf("-->", iIndexOf);
                if (iIndexOf2 >= 0) {
                    arrayList.add(new int[]{iIndexOf, iIndexOf2});
                    i = iIndexOf2 + 3;
                } else {
                    arrayList.add(new int[]{iIndexOf, length});
                }
            }
            i = length;
        }
        int[][] iArr = (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + 16);
        return (Ln0.b(str2, sb, Ln0.b, str3, iArr) || Ln0.a(str2, sb, Ln0.f3374a, str3, iArr) || Ln0.b(str2, sb, Ln0.d, str3, iArr) || Ln0.a(str2, sb, Ln0.c, str3, iArr) || Ln0.b(str2, sb, Ln0.f, str3, iArr) || Ln0.a(str2, sb, Ln0.e, str3, iArr) || Ln0.a(str2, sb, Ln0.g, str3, iArr)) ? sb.toString() : str3.concat(str2);
    }

    public static C4811v50 U(KC kc, KC kc2) {
        if (kc == null) {
            throw new NullPointerException("set1");
        }
        if (kc2 != null) {
            return new C4811v50(kc, kc2);
        }
        throw new NullPointerException("set2");
    }

    public static final boolean V(Object obj) {
        return obj == AbstractC2492Ih.f3233a;
    }

    public static boolean W(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    public static boolean X(File file) {
        boolean z;
        if (file != null && file.exists() && file.length() >= 8) {
            byte[] bArr = new byte[12];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    if (fileInputStream.read(bArr) < 8) {
                        fileInputStream.close();
                        return true;
                    }
                    fileInputStream.close();
                    if (!u0(bArr, new byte[]{-119, 80, 78, 71}) && !u0(bArr, new byte[]{-1, -40, -1}) && !u0(bArr, new byte[]{71, 73, 70, 56}) && !u0(bArr, new byte[]{66, 77})) {
                        z = u0(bArr, new byte[]{0, 0, 1, 0}) || (u0(bArr, new byte[]{82, 73, 70, 70}) && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80) || u0(bArr, new byte[]{73, 73, 42, 0}) || u0(bArr, new byte[]{77, 77, 0, 42});
                    }
                    return !z;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
        }
        return true;
    }

    public static boolean Y(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean Z(XmlPullParser xmlPullParser, String str) {
        return Y(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static CE a() {
        return new CE(null);
    }

    public static void a0(Bundle bundle, String str) {
        try {
            C4266ou.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString(TypedValues.TransitionType.S_FROM);
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = NN.t(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            C4266ou c4266ouB = C4266ou.b();
            c4266ouB.a();
            InterfaceC3227d4 interfaceC3227d4 = (InterfaceC3227d4) c4266ouB.d.a(InterfaceC3227d4.class);
            if (interfaceC3227d4 != null) {
                ((C3315e4) interfaceC3227d4).a(AppMeasurement.FCM_ORIGIN, str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    public static String b(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static InterfaceC3549gk b0(InterfaceC3373ek interfaceC3373ek, InterfaceC3461fk interfaceC3461fk) {
        q(interfaceC3461fk, "key");
        return i(interfaceC3373ek.getKey(), interfaceC3461fk) ? C2734Rq.f3684a : interfaceC3373ek;
    }

    public static void c(C3203cn0 c3203cn0) {
        if (!c3203cn0.f) {
            throw new IllegalStateException("AdSession is not started");
        }
        l(c3203cn0);
    }

    public static ArrayList c0(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static ArrayList d0(Object... objArr) {
        int length = objArr.length;
        FW.n(length, "arraySize");
        ArrayList arrayList = new ArrayList(n0(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    public static C3483g0 e0(Uh0 uh0) {
        int i;
        int i2;
        int i3 = uh0.i(16);
        int i4 = uh0.i(16);
        if (i4 == 65535) {
            i4 = uh0.i(24);
            i = 7;
        } else {
            i = 4;
        }
        int i5 = i4 + i;
        if (i3 == 44097) {
            i5 += 2;
        }
        if (uh0.i(2) == 3) {
            do {
                uh0.i(2);
            } while (uh0.h());
        }
        int i6 = uh0.i(10);
        if (uh0.h() && uh0.i(3) > 0) {
            uh0.s(2);
        }
        int i7 = uh0.h() ? 48000 : 44100;
        int i8 = uh0.i(4);
        int[] iArr = f4124a;
        if (i7 == 44100 && i8 == 13) {
            i2 = iArr[i8];
        } else if (i7 != 48000 || i8 >= 14) {
            i2 = 0;
        } else {
            int i9 = iArr[i8];
            int i10 = i6 % 5;
            if (i10 == 1) {
                if (i8 != 3 || i8 == 8) {
                    i2 = i9 + 1;
                } else {
                    i2 = i9;
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i8 != 3) {
                    }
                    i2 = i9 + 1;
                } else if (i10 == 4 && (i8 == 3 || i8 == 8 || i8 == 11)) {
                    i2 = i9 + 1;
                } else {
                    i2 = i9;
                }
            } else if (i8 == 8 || i8 == 11) {
                i2 = i9 + 1;
            } else {
                i2 = i9;
            }
        }
        C3483g0 c3483g0 = new C3483g0();
        c3483g0.b = 2;
        c3483g0.f4395a = i7;
        c3483g0.c = i5;
        c3483g0.d = i2;
        return c3483g0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void f(InterfaceC4530rv interfaceC4530rv, Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        C2583Lv c2583Lv;
        if (interfaceC2857Wj instanceof C2583Lv) {
            c2583Lv = (C2583Lv) interfaceC2857Wj;
            int i = c2583Lv.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2583Lv.c = i - Integer.MIN_VALUE;
            } else {
                c2583Lv = new C2583Lv(interfaceC2857Wj);
            }
        } else {
            c2583Lv = new C2583Lv(interfaceC2857Wj);
        }
        Object obj2 = c2583Lv.b;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c2583Lv.c;
        if (i2 == 0) {
            AbstractC3375el.b0(obj2);
            c2583Lv.f3379a = interfaceC4530rv;
            c2583Lv.c = 1;
            if (interfaceC4530rv.emit(obj, c2583Lv) == enumC4602sk) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4530rv = c2583Lv.f3379a;
            AbstractC3375el.b0(obj2);
        }
        throw new C3218d(interfaceC4530rv);
    }

    public static InterfaceC3549gk f0(InterfaceC3373ek interfaceC3373ek, InterfaceC3549gk interfaceC3549gk) {
        q(interfaceC3549gk, com.umeng.analytics.pro.f.X);
        return interfaceC3549gk == C2734Rq.f3684a ? interfaceC3373ek : (InterfaceC3549gk) interfaceC3549gk.fold(interfaceC3373ek, C3541gg.h);
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final Object g0(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static void h(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        q(th, "<this>");
        q(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC4209oE.f4785a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AU.f2817a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void h0(Bundle bundle, String str, BinderC2486Ib binderC2486Ib) {
        if (Ug0.f3833a >= 18) {
            bundle.putBinder(str, binderC2486Ib);
            return;
        }
        Method method = d;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                d = method2;
                method2.setAccessible(true);
                method = d;
            } catch (NoSuchMethodException e2) {
                AbstractC4038mJ.a("Failed to retrieve putIBinder method", e2);
                AbstractC4038mJ.e();
                return;
            }
        }
        try {
            method.invoke(bundle, str, binderC2486Ib);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            AbstractC4038mJ.a("Failed to invoke putIBinder via reflection", e3);
            AbstractC4038mJ.e();
        }
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static long i0(int i, int i2, JT jt) {
        jt.E(i);
        if (jt.a() < 5) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        int iF = jt.f();
        if ((8388608 & iF) != 0 || ((2096896 & iF) >> 8) != i2 || (iF & 32) == 0 || jt.t() < 7 || jt.a() < 7 || (jt.t() & 16) != 16) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        jt.d(bArr, 0, 6);
        return ((255 & ((long) bArr[4])) >> 7) | ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1);
    }

    public static final Object j0(Object obj) {
        return obj instanceof C3013ah ? AbstractC3375el.v(((C3013ah) obj).f4134a) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(VV vv, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        TV tv;
        if (interfaceC2857Wj instanceof TV) {
            tv = (TV) interfaceC2857Wj;
            int i = tv.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tv.c = i - Integer.MIN_VALUE;
            } else {
                tv = new TV(interfaceC2857Wj);
            }
        } else {
            tv = new TV(interfaceC2857Wj);
        }
        Object obj = tv.b;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = tv.c;
        try {
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                if (tv.getContext().get(G7.e) != vv) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                }
                tv.getClass();
                tv.f3773a = interfaceC2714Qw;
                tv.c = 1;
                C2798Uc c2798Uc = new C2798Uc(1, WD.w(tv));
                c2798Uc.t();
                ((UV) vv).l(new C4140nX(c2798Uc, 9));
                if (c2798Uc.s() == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC2714Qw = tv.f3773a;
                AbstractC3375el.b0(obj);
            }
            interfaceC2714Qw.invoke();
            return C5033xf0.f5238a;
        } catch (Throwable th) {
            interfaceC2714Qw.invoke();
            throw th;
        }
    }

    public static void k0(C2391Ek c2391Ek) {
        c2391Ek.k = -3.4028235E38f;
        c2391Ek.j = Integer.MIN_VALUE;
        CharSequence charSequence = c2391Ek.f3034a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c2391Ek.f3034a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c2391Ek.f3034a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static void l(C3203cn0 c3203cn0) {
        if (c3203cn0.g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static float l0(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static final void m(RX rx, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th);
            }
        }
        rx.a(cancellationException);
    }

    public static void m0(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void n(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m0(AbstractC2995aW.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static int n0(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m0(AbstractC2995aW.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final InterfaceC4123nG o0(M40 m40, InterfaceC4211oG interfaceC4211oG, boolean z) {
        InterfaceC4123nG interfaceC4123nGA;
        InterfaceC4123nG interfaceC4123nGR;
        InterfaceC3156cG interfaceC3156cGJ0 = AbstractC2871Wx.j0(interfaceC4211oG);
        Be0 be0 = (Be0) interfaceC4211oG;
        boolean z2 = (be0.d & 1) != 0;
        List list = be0.b;
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC4211oG interfaceC4211oG2 = ((C4387qG) it.next()).b;
            if (interfaceC4211oG2 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + interfaceC4211oG).toString());
            }
            arrayList.add(interfaceC4211oG2);
        }
        if (arrayList.isEmpty()) {
            C3451ff c3451ff = S40.f3698a;
            q(interfaceC3156cGJ0, "clazz");
            if (z2) {
                interfaceC4123nGA = S40.b.a(interfaceC3156cGJ0);
            } else {
                interfaceC4123nGA = S40.f3698a.a(interfaceC3156cGJ0);
                if (interfaceC4123nGA == null) {
                    interfaceC4123nGA = null;
                }
            }
        } else {
            C3451ff c3451ff2 = S40.f3698a;
            q(interfaceC3156cGJ0, "clazz");
            Object objA = !z2 ? S40.c.a(interfaceC3156cGJ0, arrayList) : S40.d.a(interfaceC3156cGJ0, arrayList);
            if (z) {
                if (objA instanceof HZ) {
                    objA = null;
                }
                interfaceC4123nGA = (InterfaceC4123nG) objA;
            } else {
                if (IZ.a(objA) != null) {
                    return null;
                }
                interfaceC4123nGA = (InterfaceC4123nG) objA;
            }
        }
        if (interfaceC4123nGA != null) {
            return interfaceC4123nGA;
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayListW = AbstractC3375el.W(m40, arrayList, z);
            if (arrayListW == null) {
                return null;
            }
            interfaceC4123nGR = AbstractC3375el.R(interfaceC3156cGJ0, arrayList, arrayListW);
            if (interfaceC4123nGR == null) {
                m40.a(interfaceC3156cGJ0, arrayListW);
            }
            if (interfaceC4123nGR != null) {
                return z2 ? WD.u(interfaceC4123nGR) : interfaceC4123nGR;
            }
            return null;
        }
        m40.a(interfaceC3156cGJ0, C2812Uq.f3846a);
        interfaceC4123nGR = null;
        if (interfaceC4123nGR != null) {
            if (z2) {
            }
        }
        return null;
    }

    public static void p(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m0(AbstractC2995aW.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void p0(Context context, int i, String str) {
        SharedPreferences.Editor editorH = H(context);
        editorH.putInt(str, i);
        editorH.commit();
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC2995aW.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            StringBuilder sbR = DM.r("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbR.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbR.toString());
            m0(AbstractC2995aW.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static Set q0(Object... objArr) {
        int length;
        int length2 = objArr.length;
        C2942Zq c2942Zq = C2942Zq.f4095a;
        if (length2 <= 0 || (length = objArr.length) == 0) {
            return c2942Zq;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            p(setSingleton, "singleton(element)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3375el.N(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static int r(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        throw new IllegalArgumentException(FW.L("Out of range: %s", Long.valueOf(j)));
    }

    public static void r0(Context context, String str, String str2) {
        SharedPreferences.Editor editorH = H(context);
        editorH.putString(str, str2);
        editorH.commit();
    }

    public static int s(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static final Object s0(Kc0 kc0, InterfaceC3567gx interfaceC3567gx) throws Throwable {
        Object c3013ah;
        Object objT;
        kc0.p(new C4788up(G(kc0.d.getContext()).f(kc0.e, kc0, kc0.c), 0));
        try {
            WD.h(2, interfaceC3567gx);
            c3013ah = interfaceC3567gx.invoke(kc0, kc0);
        } catch (Throwable th) {
            c3013ah = new C3013ah(false, th);
        }
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        if (c3013ah == enumC4602sk || (objT = kc0.T(c3013ah)) == QE.b) {
            return enumC4602sk;
        }
        if (objT instanceof C3013ah) {
            Throwable th2 = ((C3013ah) objT).f4134a;
            if (!(th2 instanceof Jc0) || ((Jc0) th2).f3272a != kc0) {
                throw th2;
            }
            if (c3013ah instanceof C3013ah) {
                throw ((C3013ah) c3013ah).f4134a;
            }
        } else {
            c3013ah = QE.a(objT);
        }
        return c3013ah;
    }

    public static int t(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        throw new IllegalArgumentException(FW.L("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
    }

    public static boolean t0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static boolean u0(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static final Object v(long j, InterfaceC2857Wj interfaceC2857Wj) {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (j <= 0) {
            return c5033xf0;
        }
        C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
        c2798Uc.t();
        if (j < Long.MAX_VALUE) {
            G(c2798Uc.e).e(j, c2798Uc);
        }
        Object objS = c2798Uc.s();
        return objS == EnumC4602sk.f4993a ? objS : c5033xf0;
    }

    public static String v0(Object obj, String str) {
        return str + obj;
    }

    public static final void w(InterfaceC3549gk interfaceC3549gk) {
        InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) interfaceC3549gk.get(G7.e);
        if (interfaceC5000xE != null && !interfaceC5000xE.isActive()) {
            throw interfaceC5000xE.k();
        }
    }

    public static void w0() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static boolean x(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static void x0(String str) {
        C3034at c3034at = new C3034at(DM.B("lateinit property ", str, " has not been initialized"));
        m0(AbstractC2995aW.class.getName(), c3034at);
        throw c3034at;
    }

    public static int y(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public static final C4839vT y0(String str, SpineData spineData) {
        return new C4839vT(str, spineData);
    }

    public static int[] z0(Collection collection) {
        if (collection instanceof XD) {
            XD xd = (XD) collection;
            return Arrays.copyOfRange(xd.f3960a, xd.b, xd.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public abstract void A(K5 k5);

    public C3607hQ j() {
        FW.n(2, "expectedValuesPerKey");
        return new C3607hQ(this);
    }

    public abstract Map u();

    public abstract void z();
}
