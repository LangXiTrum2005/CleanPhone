package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UA {
    static {
        C3971lc c3971lc = C3971lc.d;
        G7.x("\"\\");
        G7.x("\t ,=");
    }

    public static final boolean a(C5021xZ c5021xZ) {
        if (AbstractC2995aW.i(c5021xZ.f5227a.b, Net.HttpMethods.HEAD)) {
            return false;
        }
        int i = c5021xZ.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && Vg0.j(c5021xZ) == -1 && !AbstractC3089ba0.o0("chunked", C5021xZ.i(c5021xZ, HttpResponseHeader.TransferEncoding))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0051  */
    public static final void b(InterfaceC3108bk interfaceC3108bk, ZA za, C4447qz c4447qz) {
        List listUnmodifiableList;
        long j;
        String str;
        C3019ak c3019ak;
        String str2;
        AbstractC2995aW.q(interfaceC3108bk, "<this>");
        AbstractC2995aW.q(za, "url");
        AbstractC2995aW.q(c4447qz, "headers");
        if (interfaceC3108bk == InterfaceC3108bk.b1) {
            return;
        }
        Pattern pattern = C3019ak.j;
        List listF = c4447qz.f(HttpResponseHeader.SetCookie);
        int size = listF.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            int i3 = i2 + 1;
            String str3 = (String) listF.get(i2);
            AbstractC2995aW.q(str3, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = Vg0.f3884a;
            char c = ';';
            int iF = Vg0.f(str3, i, str3.length(), ';');
            char c2 = '=';
            int iF2 = Vg0.f(str3, i, iF, '=');
            if (iF2 != iF) {
                String strY = Vg0.y(i, iF2, str3);
                if (strY.length() == 0 || Vg0.l(strY) != -1) {
                    c3019ak = null;
                    break;
                }
                String strY2 = Vg0.y(iF2 + 1, iF, str3);
                if (Vg0.l(strY2) == -1) {
                    int i4 = iF + 1;
                    int length = str3.length();
                    long j2 = -1;
                    long jS = 253402300799999L;
                    String str4 = null;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = true;
                    String str5 = null;
                    while (true) {
                        if (i4 >= length) {
                            if (j2 == Long.MIN_VALUE) {
                                j = Long.MIN_VALUE;
                            } else if (j2 != -1) {
                                long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * ((long) 1000) : Long.MAX_VALUE);
                                j = (j3 < jCurrentTimeMillis || j3 > 253402300799999L) ? 253402300799999L : j3;
                            } else {
                                j = jS;
                            }
                            String str6 = za.d;
                            if (str4 == null) {
                                str = str6;
                            } else {
                                if (!AbstractC2995aW.i(str6, str4)) {
                                    if (AbstractC3089ba0.n0(str6, str4) && str6.charAt((str6.length() - str4.length()) - 1) == '.') {
                                        C3439fY c3439fY = Vg0.f;
                                        c3439fY.getClass();
                                        if (!c3439fY.f4369a.matcher(str6).matches()) {
                                        }
                                    }
                                    c3019ak = null;
                                    break;
                                }
                                str = str4;
                            }
                            if (str6.length() != str.length() && PublicSuffixDatabase.g.a(str) == null) {
                                c3019ak = null;
                                break;
                            }
                            String strSubstring = "/";
                            String str7 = str5;
                            if (str7 == null || !AbstractC3089ba0.N0(str7, "/", false)) {
                                String strB = za.b();
                                int iW0 = AbstractC3089ba0.w0(strB, '/', 0, 6);
                                if (iW0 != 0) {
                                    strSubstring = strB.substring(0, iW0);
                                    AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                                str2 = strSubstring;
                            } else {
                                str2 = str7;
                            }
                            c3019ak = new C3019ak(strY, strY2, j, str, str2, z, z2, z3, z4);
                            break;
                        }
                        int iF3 = Vg0.f(str3, i4, length, c);
                        int iF4 = Vg0.f(str3, i4, iF3, c2);
                        String strY3 = Vg0.y(i4, iF4, str3);
                        String strY4 = iF4 < iF3 ? Vg0.y(iF4 + 1, iF3, str3) : "";
                        if (AbstractC3089ba0.o0(strY3, "expires")) {
                            try {
                                jS = C3336eJ.s(strY4.length(), strY4);
                                z3 = true;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (AbstractC3089ba0.o0(strY3, "max-age")) {
                            try {
                                long j4 = Long.parseLong(strY4);
                                j2 = j4 > 0 ? j4 : Long.MIN_VALUE;
                            } catch (NumberFormatException e) {
                                Pattern patternCompile = Pattern.compile("-?\\d+");
                                AbstractC2995aW.p(patternCompile, "compile(pattern)");
                                if (!patternCompile.matcher(strY4).matches()) {
                                    throw e;
                                }
                                j2 = AbstractC3089ba0.N0(strY4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
                            z3 = true;
                        } else if (AbstractC3089ba0.o0(strY3, "domain")) {
                            if (!(!strY4.endsWith("."))) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            String strC = AbstractC4496rb.C(AbstractC3089ba0.D0(".", strY4));
                            if (strC == null) {
                                throw new IllegalArgumentException();
                            }
                            str4 = strC;
                            z4 = false;
                        } else if (AbstractC3089ba0.o0(strY3, MBridgeConstans.DYNAMIC_VIEW_WX_PATH)) {
                            str5 = strY4;
                        } else if (AbstractC3089ba0.o0(strY3, "secure")) {
                            z = true;
                        } else if (AbstractC3089ba0.o0(strY3, "httponly")) {
                            z2 = true;
                        }
                        i4 = iF3 + 1;
                        c = ';';
                        c2 = '=';
                    }
                } else {
                    c3019ak = null;
                    break;
                }
            } else {
                c3019ak = null;
                break;
            }
            if (c3019ak != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c3019ak);
            }
            i2 = i3;
            i = 0;
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC2995aW.p(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            listUnmodifiableList = C2812Uq.f3846a;
        }
        listUnmodifiableList.isEmpty();
    }
}
