package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2340Cl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5 f2939a = new C5("com.hairclipper.liedetector.brokenscreen.prankguys", Integer.valueOf(R.drawable.ad_prankguys), Integer.valueOf(R.drawable.ad_prank_dialog), Integer.valueOf(R.string.PrankGuys), Integer.valueOf(R.string.Funny_all_in));
    public static final int[] b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] c = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] d = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, GL20.GL_INVALID_ENUM, 1536, 1920, 2048, GL20.GL_CW, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, GL30.GL_COLOR, GL20.GL_KEEP};
    public static final C5049xn0 e = new C5049xn0(2);
    public static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static C4355pv g;

    public static long A(byte b2, byte b3) {
        int i;
        int i2;
        int i3 = b2 & 255;
        int i4 = b2 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? MBridgeCommon.DEFAULT_LOAD_TIMEOUT : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    public static Activity B() {
        WeakReference weakReference;
        C4355pv c4355pv = g;
        if (c4355pv == null || (weakReference = c4355pv.e) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public static int C(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final void D(View view) {
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    public static final long E(long j) {
        int i = C4350pq.d;
        return j < 0 ? C4350pq.c : C4350pq.b;
    }

    public static boolean F(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean G(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static InterfaceC3069bH H(EnumC4124nH enumC4124nH, InterfaceC2714Qw interfaceC2714Qw) {
        int iOrdinal = enumC4124nH.ordinal();
        if (iOrdinal == 0) {
            return new Ma0(interfaceC2714Qw);
        }
        G7 g7 = G7.j;
        if (iOrdinal == 1) {
            P20 p20 = new P20();
            p20.f3532a = interfaceC2714Qw;
            p20.b = g7;
            return p20;
        }
        if (iOrdinal != 2) {
            throw new C3770jF(7, 0);
        }
        C3101bg0 c3101bg0 = new C3101bg0();
        c3101bg0.f4182a = interfaceC2714Qw;
        c3101bg0.b = g7;
        return c3101bg0;
    }

    public static Ma0 I(InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(interfaceC2714Qw, "initializer");
        return new Ma0(interfaceC2714Qw);
    }

    public static List J(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC2995aW.p(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }

    public static List K(Object... objArr) {
        AbstractC2995aW.q(objArr, "elements");
        return objArr.length > 0 ? U5.h0(objArr) : C2812Uq.f3846a;
    }

    public static ArrayList L(Object... objArr) {
        AbstractC2995aW.q(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new P5(objArr, true));
    }

    public static final void M(Group group) {
        if (group.getVisibility() != 4) {
            group.setVisibility(4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long N(String str) {
        int length = str.length();
        int i = (length <= 0 || !AbstractC3089ba0.k0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            C5175zD c5175zD = new C5175zD(i, AbstractC3089ba0.p0(str), 1);
            if (!(c5175zD instanceof Collection) || !((Collection) c5175zD).isEmpty()) {
                C5087yD c5087yDA = c5175zD.iterator();
                while (true) {
                    if (c5087yDA.c) {
                        if (!new C5206ze('0', '9').a(str.charAt(c5087yDA.nextInt()))) {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (AbstractC3089ba0.N0(str, "+", false)) {
            str = AbstractC3177ca0.X0(1, str);
        }
        return Long.parseLong(str);
    }

    public static int O(int i, JT jt) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return jt.t() + 1;
            case 7:
                return jt.y() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static final void P(Object[] objArr, int i, int i2) {
        AbstractC2995aW.q(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final long Q(long j, long j2, EnumC4613sq enumC4613sq) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return W(j3, enumC4613sq);
        }
        EnumC4613sq enumC4613sq2 = EnumC4613sq.MILLISECONDS;
        if (enumC4613sq.compareTo(enumC4613sq2) >= 0) {
            return C4350pq.i(E(j3));
        }
        long jQ = q(1L, enumC4613sq2, enumC4613sq);
        long j4 = (j / jQ) - (j2 / jQ);
        long j5 = (j % jQ) - (j2 % jQ);
        int i = C4350pq.d;
        return C4350pq.f(W(j4, enumC4613sq2), W(j5, enumC4613sq));
    }

    public static void R(EditText editText, int i) {
        Context context = editText.getContext();
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{AbstractC2845Vx.e0(context, R.attr.colorControlNormal, 0), AbstractC2845Vx.e0(context, R.attr.colorControlNormal, 0), i});
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(colorStateList);
        } else {
            editText.setBackgroundTintList(colorStateList);
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {ContextCompat.getDrawable(editText.getContext(), i2), ContextCompat.getDrawable(editText.getContext(), i2)};
            Drawable drawable = drawableArr[0];
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(i, mode);
            drawableArr[1].setColorFilter(i, mode);
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e2) {
            e2.getMessage();
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void S() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static byte[] T(C3357ec c3357ec) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = c3357ec.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return o(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (c3357ec.read() == -1) {
            return o(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final String U(InterfaceC2857Wj interfaceC2857Wj) {
        Object objV;
        if (interfaceC2857Wj instanceof C4085mp) {
            return interfaceC2857Wj.toString();
        }
        try {
            objV = interfaceC2857Wj + '@' + x(interfaceC2857Wj);
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        if (IZ.a(objV) != null) {
            objV = interfaceC2857Wj.getClass().getName() + '@' + x(interfaceC2857Wj);
        }
        return (String) objV;
    }

    public static final long V(double d2, EnumC4613sq enumC4613sq) {
        double dP = p(d2, enumC4613sq, EnumC4613sq.NANOSECONDS);
        if (!(!Double.isNaN(dP))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        if (Double.isNaN(dP)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        long jRound = Math.round(dP);
        if (new EJ(-4611686018426999999L, 4611686018426999999L).a(jRound)) {
            long j = jRound << 1;
            int i = C4350pq.d;
            int i2 = AbstractC4438qq.f4905a;
            return j;
        }
        double dP2 = p(d2, enumC4613sq, EnumC4613sq.MILLISECONDS);
        if (Double.isNaN(dP2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return t(Math.round(dP2));
    }

    public static final long W(long j, EnumC4613sq enumC4613sq) {
        AbstractC2995aW.q(enumC4613sq, "unit");
        EnumC4613sq enumC4613sq2 = EnumC4613sq.NANOSECONDS;
        AbstractC2995aW.q(enumC4613sq2, "sourceUnit");
        TimeUnit timeUnit = enumC4613sq.f5001a;
        TimeUnit timeUnit2 = enumC4613sq2.f5001a;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if (!new EJ(-jConvert, jConvert).a(j)) {
            return s(AbstractC3375el.q(q(j, enumC4613sq, EnumC4613sq.MILLISECONDS)));
        }
        long jConvert2 = timeUnit2.convert(j, timeUnit) << 1;
        int i = C4350pq.d;
        int i2 = AbstractC4438qq.f4905a;
        return jConvert2;
    }

    public static void X(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }

    public static float a(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static String c(View view) {
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

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Object e(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final int f(char c2) {
        if ('0' <= c2 && c2 <= '9') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 <= 'f') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 > 'F') {
            throw new IllegalArgumentException(AbstractC2995aW.v0(Character.valueOf(c2), "Unexpected hex digit: "));
        }
        return c2 - '7';
    }

    public static final long g(String str) {
        EnumC4613sq enumC4613sq;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i = C4350pq.d;
        char cCharAt = str.charAt(0);
        int i2 = (cCharAt == '+' || cCharAt == '-') ? 1 : 0;
        boolean z = (i2 > 0) && AbstractC3089ba0.O0(str, '-');
        if (length <= i2) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i2) != 'P') {
            throw new IllegalArgumentException();
        }
        int i3 = i2 + 1;
        if (i3 == length) {
            throw new IllegalArgumentException();
        }
        EnumC4613sq enumC4613sq2 = null;
        long jF = 0;
        boolean z2 = false;
        while (i3 < length) {
            if (str.charAt(i3) != 'T') {
                int i4 = i3;
                while (i4 < str.length()) {
                    char cCharAt2 = str.charAt(i4);
                    if (!new C5206ze('0', '9').a(cCharAt2) && !AbstractC3089ba0.k0("+-.", cCharAt2)) {
                        break;
                    }
                    i4++;
                }
                String strSubstring = str.substring(i3, i4);
                AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i3;
                if (length2 < 0 || length2 > AbstractC3089ba0.p0(str)) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i5 = length2 + 1;
                if (z2) {
                    if (cCharAt3 == 'H') {
                        enumC4613sq = EnumC4613sq.HOURS;
                    } else if (cCharAt3 == 'M') {
                        enumC4613sq = EnumC4613sq.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        enumC4613sq = EnumC4613sq.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    enumC4613sq = EnumC4613sq.DAYS;
                }
                if (enumC4613sq2 != null && enumC4613sq2.compareTo(enumC4613sq) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iS0 = AbstractC3089ba0.s0(strSubstring, '.', 0, false, 6);
                if (enumC4613sq != EnumC4613sq.SECONDS || iS0 <= 0) {
                    jF = C4350pq.f(jF, W(N(strSubstring), enumC4613sq));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iS0);
                    AbstractC2995aW.p(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    long jF2 = C4350pq.f(jF, W(N(strSubstring2), enumC4613sq));
                    String strSubstring3 = strSubstring.substring(iS0);
                    AbstractC2995aW.p(strSubstring3, "this as java.lang.String).substring(startIndex)");
                    jF = C4350pq.f(jF2, V(Double.parseDouble(strSubstring3), enumC4613sq));
                }
                enumC4613sq2 = enumC4613sq;
                i3 = i5;
            } else {
                if (z2 || (i3 = i3 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z2 = true;
            }
        }
        return z ? C4350pq.i(jF) : jF;
    }

    public static ArrayList h(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new P5(objArr, true));
    }

    public static void i(int i, int i2, Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException("src cannot be null.");
        }
        if (obj2 == null) {
            throw new IllegalArgumentException("dest cannot be null.");
        }
        try {
            System.arraycopy(obj, 0, obj2, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ArrayIndexOutOfBoundsException("Src: " + Array.getLength(obj) + ", 0, dest: " + Array.getLength(obj2) + ", " + i + ", count: " + i2);
        }
    }

    public static float j(float f2, float f3) {
        return (float) Math.atan2(f2, f3);
    }

    public static float k(float f2, float f3) {
        return ((float) Math.atan2(f2, f3)) * 57.295776f;
    }

    public static ArrayList l(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * com.mbridge.msdk.playercommon.exoplayer2.C.NANOS_PER_SECOND) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean m(JT jt, C3036av c3036av, int i, C2868Wu c2868Wu) {
        long jU = jt.u();
        long j = jU >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jU >> 12) & 15);
        int i3 = (int) ((jU >> 8) & 15);
        int i4 = (int) (15 & (jU >> 4));
        int i5 = (int) ((jU >> 1) & 7);
        boolean z2 = (jU & 1) == 1;
        if (i4 <= 7) {
            if (i4 != c3036av.g - 1) {
                return false;
            }
        } else if (i4 > 10 || c3036av.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == c3036av.i) || z2) {
            return false;
        }
        try {
            long jZ = jt.z();
            if (!z) {
                jZ *= (long) c3036av.b;
            }
            c2868Wu.b = jZ;
            int iO = O(i2, jt);
            if (iO == -1 || iO > c3036av.b) {
                return false;
            }
            if (i3 != 0) {
                if (i3 > 11) {
                    int i6 = c3036av.e;
                    if (i3 != 12) {
                        if (i3 > 14) {
                            return false;
                        }
                        int iY = jt.y();
                        if (i3 == 14) {
                            iY *= 10;
                        }
                        if (iY != i6) {
                            return false;
                        }
                    } else if (jt.t() * 1000 != i6) {
                        return false;
                    }
                } else if (i3 != c3036av.f) {
                    return false;
                }
            }
            int iT = jt.t();
            int i7 = jt.b;
            byte[] bArr = jt.f3266a;
            int i8 = i7 - 1;
            int i9 = Ug0.f3833a;
            int i10 = 0;
            for (int i11 = jt.b; i11 < i8; i11++) {
                i10 = Ug0.m[i10 ^ (bArr[i11] & 255)];
            }
            return iT == i10;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void n(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static byte[] o(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final double p(double d2, EnumC4613sq enumC4613sq, EnumC4613sq enumC4613sq2) {
        AbstractC2995aW.q(enumC4613sq, "sourceUnit");
        AbstractC2995aW.q(enumC4613sq2, "targetUnit");
        TimeUnit timeUnit = enumC4613sq2.f5001a;
        TimeUnit timeUnit2 = enumC4613sq.f5001a;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d2 * jConvert : d2 / timeUnit2.convert(1L, timeUnit);
    }

    public static final long q(long j, EnumC4613sq enumC4613sq, EnumC4613sq enumC4613sq2) {
        AbstractC2995aW.q(enumC4613sq, "sourceUnit");
        AbstractC2995aW.q(enumC4613sq2, "targetUnit");
        return enumC4613sq2.f5001a.convert(j, enumC4613sq.f5001a);
    }

    public static void r(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (C2573Lk c2573Lk : (Set) it2.next()) {
                        for (C5226zo c5226zo : c2573Lk.f3369a.c) {
                            if (c5226zo.c == 0) {
                                Set<C2573Lk> set = (Set) map.get(new C2598Mk(c5226zo.f5344a, c5226zo.b == 2));
                                if (set != null) {
                                    for (C2573Lk c2573Lk2 : set) {
                                        c2573Lk.b.add(c2573Lk2);
                                        c2573Lk2.c.add(c2573Lk);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<C2573Lk> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (C2573Lk c2573Lk3 : hashSet) {
                    if (c2573Lk3.c.isEmpty()) {
                        hashSet2.add(c2573Lk3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C2573Lk c2573Lk4 = (C2573Lk) hashSet2.iterator().next();
                    hashSet2.remove(c2573Lk4);
                    i++;
                    for (C2573Lk c2573Lk5 : c2573Lk4.b) {
                        c2573Lk5.c.remove(c2573Lk4);
                        if (c2573Lk5.c.isEmpty()) {
                            hashSet2.add(c2573Lk5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (C2573Lk c2573Lk6 : hashSet) {
                    if (!c2573Lk6.c.isEmpty() && !c2573Lk6.b.isEmpty()) {
                        arrayList2.add(c2573Lk6.f3369a);
                    }
                }
                throw new C2291Ao(arrayList2);
            }
            C3190ch c3190ch = (C3190ch) it.next();
            C2573Lk c2573Lk7 = new C2573Lk(c3190ch);
            for (RW rw : c3190ch.b) {
                boolean z = !(c3190ch.e == 0);
                C2598Mk c2598Mk = new C2598Mk(rw, z);
                if (!map.containsKey(c2598Mk)) {
                    map.put(c2598Mk, new HashSet());
                }
                Set set2 = (Set) map.get(c2598Mk);
                if (!set2.isEmpty() && !z) {
                    throw new IllegalArgumentException("Multiple components provide " + rw + ".");
                }
                set2.add(c2573Lk7);
            }
        }
    }

    public static final long s(long j) {
        long j2 = (j << 1) + 1;
        int i = C4350pq.d;
        int i2 = AbstractC4438qq.f4905a;
        return j2;
    }

    public static final long t(long j) {
        if (!new EJ(-4611686018426L, 4611686018426L).a(j)) {
            return s(AbstractC3375el.q(j));
        }
        long j2 = (j * ((long) 1000000)) << 1;
        int i = C4350pq.d;
        int i2 = AbstractC4438qq.f4905a;
        return j2;
    }

    public static int u(float f2, int i, int i2) {
        if (i == i2 || f2 <= 0.0f) {
            return i;
        }
        if (f2 >= 1.0f) {
            return i2;
        }
        float f3 = ((i >> 24) & 255) / 255.0f;
        float f4 = ((i2 >> 24) & 255) / 255.0f;
        float fA = a(((i >> 16) & 255) / 255.0f);
        float fA2 = a(((i >> 8) & 255) / 255.0f);
        float fA3 = a((i & 255) / 255.0f);
        float fA4 = a(((i2 >> 16) & 255) / 255.0f);
        float fA5 = a(((i2 >> 8) & 255) / 255.0f);
        float fA6 = a((i2 & 255) / 255.0f);
        float fW = AbstractC5044xl.w(f4, f3, f2, f3);
        float fW2 = AbstractC5044xl.w(fA4, fA, f2, fA);
        float fW3 = AbstractC5044xl.w(fA5, fA2, f2, fA2);
        float fW4 = AbstractC5044xl.w(fA6, fA3, f2, fA3);
        float fB = b(fW2) * 255.0f;
        float fB2 = b(fW3) * 255.0f;
        return Math.round(b(fW4) * 255.0f) | (Math.round(fB) << 16) | (Math.round(fW * 255.0f) << 24) | (Math.round(fB2) << 8);
    }

    public static HashMap v(Activity activity) {
        HashMap map = new HashMap();
        if (activity.getWindow() == null) {
            return map;
        }
        View decorView = activity.getWindow().getDecorView();
        IBinder windowToken = decorView.getWindowToken();
        ArrayList arrayListB = a.a.b();
        int iIndexOf = arrayListB.indexOf(decorView);
        ArrayList arrayListA = a.a.a();
        if (iIndexOf >= 0 && iIndexOf < arrayListA.size()) {
            IBinder iBinder = ((WindowManager.LayoutParams) arrayListA.get(iIndexOf)).token;
            for (int i = 0; i < arrayListA.size(); i++) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) arrayListA.get(i);
                IBinder iBinder2 = layoutParams.token;
                if (i != iIndexOf && ((iBinder2 == windowToken || iBinder2 == null || iBinder2 == iBinder) && decorView.getWindowId() != ((View) arrayListB.get(i)).getWindowId())) {
                    int i2 = layoutParams.flags;
                    if ((i2 & 8) == 0 && (i2 & 32) == 0) {
                        map.put(layoutParams, (View) arrayListB.get(i));
                    }
                }
            }
        }
        return map;
    }

    public static ArrayList w(Activity activity) {
        ArrayList arrayList = new ArrayList();
        if (g == null) {
            return arrayList;
        }
        View decorView = activity.getWindow().getDecorView();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = g.d.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Activity) it.next()).getWindow().getDecorView());
        }
        ArrayList arrayListB = a.a.b();
        int iIndexOf = arrayListB.indexOf(decorView);
        if (iIndexOf < 0) {
            return arrayList;
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= arrayListB.size() || arrayList2.contains(arrayListB.get(iIndexOf))) {
                break;
            }
            arrayList.add((View) arrayListB.get(iIndexOf));
        }
        return arrayList;
    }

    public static final String x(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static int y(List list) {
        AbstractC2995aW.q(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String z(String str) {
        AbstractC2995aW.q(str, "weaponName");
        switch (str.hashCode()) {
            case -1012121825:
                if (str.equals("LightSaber-A")) {
                    return (String) ((C2856Wi) AbstractC3194cj.p.getValue()).a();
                }
                return "";
            case -1012121824:
                if (str.equals("LightSaber-B")) {
                    return (String) ((C2856Wi) AbstractC3194cj.q.getValue()).a();
                }
                return "";
            case -1012121823:
                if (str.equals("LightSaber-C")) {
                    return (String) ((C2856Wi) AbstractC3194cj.r.getValue()).a();
                }
                return "";
            case -1012121822:
                if (str.equals("LightSaber-D")) {
                    return (String) ((C2856Wi) AbstractC3194cj.s.getValue()).a();
                }
                return "";
            case -1012121821:
                if (str.equals("LightSaber-E")) {
                    return (String) ((C2856Wi) AbstractC3194cj.t.getValue()).a();
                }
                return "";
            case -1012121820:
                if (str.equals("LightSaber-F")) {
                    return (String) ((C2856Wi) AbstractC3194cj.u.getValue()).a();
                }
                return "";
            case -1012121819:
                if (str.equals("LightSaber-G")) {
                    return (String) ((C2856Wi) AbstractC3194cj.v.getValue()).a();
                }
                return "";
            case -1012121818:
                if (str.equals("LightSaber-H")) {
                    return (String) ((C2856Wi) AbstractC3194cj.w.getValue()).a();
                }
                return "";
            case -1012121817:
                if (str.equals("LightSaber-I")) {
                    return (String) ((C2856Wi) AbstractC3194cj.x.getValue()).a();
                }
                return "";
            case -1012121816:
                if (str.equals("LightSaber-J")) {
                    return (String) ((C2856Wi) AbstractC3194cj.y.getValue()).a();
                }
                return "";
            case -1012121815:
                if (str.equals("LightSaber-K")) {
                    return (String) ((C2856Wi) AbstractC3194cj.z.getValue()).a();
                }
                return "";
            case -1012121814:
                if (str.equals("LightSaber-L")) {
                    return (String) ((C2856Wi) AbstractC3194cj.A.getValue()).a();
                }
                return "";
            default:
                return "";
        }
    }
}
