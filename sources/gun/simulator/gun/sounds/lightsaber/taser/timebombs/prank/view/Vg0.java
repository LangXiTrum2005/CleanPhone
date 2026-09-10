package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Vg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f3884a;
    public static final C4447qz b = C3336eJ.p(new String[0]);
    public static final AZ c;
    public static final XS d;
    public static final TimeZone e;
    public static final C3439fY f;
    public static final String g;

    static {
        byte[] bArr = new byte[0];
        f3884a = bArr;
        CZ.Companion.getClass();
        c = BZ.c(bArr, null);
        MY.d(NY.Companion, bArr, null, 0, 7);
        C3971lc c3971lc = C3971lc.d;
        d = FW.P(G7.u("efbbbf"), G7.u("feff"), G7.u("fffe"), G7.u("0000ffff"), G7.u("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AbstractC2995aW.n(timeZone);
        e = timeZone;
        f = new C3439fY("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        g = AbstractC3089ba0.E0("Client", AbstractC3089ba0.D0("okhttp3.", C4838vS.class.getName()));
    }

    public static final boolean a(ZA za, ZA za2) {
        AbstractC2995aW.q(za, "<this>");
        AbstractC2995aW.q(za2, "other");
        return AbstractC2995aW.i(za.d, za2.d) && za.e == za2.e && AbstractC2995aW.i(za.f4058a, za2.f4058a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException(AbstractC2995aW.v0(" < 0", "timeout").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(AbstractC2995aW.v0(" too large.", "timeout").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(AbstractC2995aW.v0(" too small.", "timeout").toString());
    }

    public static final void c(Closeable closeable) {
        AbstractC2995aW.q(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!AbstractC2995aW.i(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i, int i2, String str, String str2) {
        AbstractC2995aW.q(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            if (AbstractC3089ba0.k0(str2, str.charAt(i))) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final int f(String str, int i, int i2, char c2) {
        AbstractC2995aW.q(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            if (str.charAt(i) == c2) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final boolean g(InterfaceC3588h80 interfaceC3588h80, TimeUnit timeUnit) {
        AbstractC2995aW.q(interfaceC3588h80, "<this>");
        AbstractC2995aW.q(timeUnit, "timeUnit");
        try {
            return t(interfaceC3588h80, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        AbstractC2995aW.q(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(Comparator comparator, String[] strArr, String[] strArr2) {
        AbstractC2995aW.q(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                Me0 me0B = WD.B(strArr2);
                while (me0B.hasNext()) {
                    if (comparator.compare(str, (String) me0B.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(C5021xZ c5021xZ) {
        String strA = c5021xZ.f.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        AbstractC2995aW.q(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC2340Cl.K(Arrays.copyOf(objArr2, objArr2.length)));
        AbstractC2995aW.p(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (AbstractC2995aW.s(cCharAt, 31) <= 0 || AbstractC2995aW.s(cCharAt, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) >= 0) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public static final int m(int i, int i2, String str) {
        AbstractC2995aW.q(str, "<this>");
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static final int n(int i, int i2, String str) {
        AbstractC2995aW.q(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3 = i4;
                }
            }
        }
        return i;
    }

    public static final String[] o(Comparator comparator, String[] strArr, String[] strArr2) {
        AbstractC2995aW.q(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = strArr2.length;
            int i2 = 0;
            while (i2 < length2) {
                String str2 = strArr2[i2];
                i2++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean p(String str) {
        AbstractC2995aW.q(str, "name");
        return AbstractC3089ba0.o0(str, HttpRequestHeader.Authorization) || AbstractC3089ba0.o0(str, HttpRequestHeader.Cookie) || AbstractC3089ba0.o0(str, HttpRequestHeader.ProxyAuthorization) || AbstractC3089ba0.o0(str, HttpResponseHeader.SetCookie);
    }

    public static final int q(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset r(InterfaceC2460Hb interfaceC2460Hb, Charset charset) {
        Charset charsetForName;
        AbstractC2995aW.q(interfaceC2460Hb, "<this>");
        AbstractC2995aW.q(charset, MRAIDCommunicatorUtil.STATES_DEFAULT);
        int iO = interfaceC2460Hb.O(d);
        if (iO == -1) {
            return charset;
        }
        if (iO == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            AbstractC2995aW.p(charset2, "UTF_8");
            return charset2;
        }
        if (iO == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            AbstractC2995aW.p(charset3, "UTF_16BE");
            return charset3;
        }
        if (iO == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            AbstractC2995aW.p(charset4, "UTF_16LE");
            return charset4;
        }
        if (iO == 3) {
            Charset charset5 = AbstractC2307Be.f2881a;
            charsetForName = AbstractC2307Be.e;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                AbstractC2995aW.p(charsetForName, "forName(\"UTF-32BE\")");
                AbstractC2307Be.e = charsetForName;
            }
        } else {
            if (iO != 4) {
                throw new AssertionError();
            }
            Charset charset6 = AbstractC2307Be.f2881a;
            charsetForName = AbstractC2307Be.d;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                AbstractC2995aW.p(charsetForName, "forName(\"UTF-32LE\")");
                AbstractC2307Be.d = charsetForName;
            }
        }
        return charsetForName;
    }

    public static final int s(InterfaceC2460Hb interfaceC2460Hb) {
        AbstractC2995aW.q(interfaceC2460Hb, "<this>");
        return (interfaceC2460Hb.readByte() & 255) | ((interfaceC2460Hb.readByte() & 255) << 16) | ((interfaceC2460Hb.readByte() & 255) << 8);
    }

    public static final boolean t(InterfaceC3588h80 interfaceC3588h80, int i, TimeUnit timeUnit) {
        AbstractC2995aW.q(interfaceC3588h80, "<this>");
        AbstractC2995aW.q(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = interfaceC3588h80.timeout().e() ? interfaceC3588h80.timeout().c() - jNanoTime : Long.MAX_VALUE;
        interfaceC3588h80.timeout().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C4848vb c4848vb = new C4848vb();
            while (interfaceC3588h80.read(c4848vb, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                c4848vb.skip(c4848vb.b);
            }
            if (jC == Long.MAX_VALUE) {
                interfaceC3588h80.timeout().a();
            } else {
                interfaceC3588h80.timeout().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                interfaceC3588h80.timeout().a();
            } else {
                interfaceC3588h80.timeout().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                interfaceC3588h80.timeout().a();
            } else {
                interfaceC3588h80.timeout().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final C4447qz u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4183nz c4183nz = (C4183nz) it.next();
            String strJ = c4183nz.f4769a.j();
            String strJ2 = c4183nz.b.j();
            arrayList.add(strJ);
            arrayList.add(AbstractC3089ba0.V0(strJ2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new C4447qz((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final String v(ZA za, boolean z) {
        AbstractC2995aW.q(za, "<this>");
        String strR = za.d;
        if (AbstractC3089ba0.l0(strR, ":")) {
            strR = AbstractC3950lJ.r("[", strR, ']');
        }
        int i = za.e;
        if (!z) {
            char[] cArr = ZA.k;
            if (i == C3336eJ.h(za.f4058a)) {
                return strR;
            }
        }
        return strR + ':' + i;
    }

    public static final List w(List list) {
        AbstractC2995aW.q(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC2853Wf.v0(list));
        AbstractC2995aW.p(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int x(int i, String str) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        if (lValueOf == null) {
            return i;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final String y(int i, int i2, String str) {
        int iM = m(i, i2, str);
        String strSubstring = str.substring(iM, n(iM, i2, str));
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final void z(IOException iOException, List list) throws IllegalAccessException, InvocationTargetException {
        AbstractC2995aW.q(iOException, "<this>");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2995aW.h(iOException, (Exception) it.next());
        }
    }
}
