package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.Input;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class ZA {
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4058a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;
    public final boolean j;

    public ZA(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f4058a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
        this.j = AbstractC2995aW.i(str, "https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.f4058a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(AbstractC3089ba0.s0(str, ':', length, false, 4) + 1, AbstractC3089ba0.s0(str, '@', 0, false, 6));
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f4058a.length() + 3;
        String str = this.i;
        int iS0 = AbstractC3089ba0.s0(str, '/', length, false, 4);
        String strSubstring = str.substring(iS0, Vg0.e(iS0, str.length(), str, "?#"));
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f4058a.length() + 3;
        String str = this.i;
        int iS0 = AbstractC3089ba0.s0(str, '/', length, false, 4);
        int iE = Vg0.e(iS0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iS0 < iE) {
            int i = iS0 + 1;
            int iF = Vg0.f(str, i, iE, '/');
            String strSubstring = str.substring(i, iF);
            AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iS0 = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iS0 = AbstractC3089ba0.s0(str, '?', 0, false, 6) + 1;
        String strSubstring = str.substring(iS0, Vg0.f(str, iS0, str.length(), '#'));
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.f4058a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(length, Vg0.e(length, str.length(), str, ":@"));
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ZA) && AbstractC2995aW.i(((ZA) obj).i, this.i);
    }

    public final YA f() {
        YA ya = new YA();
        String str = this.f4058a;
        ya.f4008a = str;
        ya.b = e();
        ya.c = a();
        ya.d = this.d;
        int iH = C3336eJ.h(str);
        int i = this.e;
        if (i == iH) {
            i = -1;
        }
        ya.e = i;
        ArrayList arrayList = ya.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        ya.g = strD == null ? null : C3336eJ.v(C3336eJ.d(strD, 0, 0, " \"'<>#", true, false, true, false, 211));
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(AbstractC3089ba0.s0(str2, '#', 0, false, 6) + 1);
            AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        ya.h = strSubstring;
        return ya;
    }

    public final String g() {
        YA ya;
        try {
            ya = new YA();
            ya.b(this, "/...");
        } catch (IllegalArgumentException unused) {
            ya = null;
        }
        AbstractC2995aW.n(ya);
        ya.b = C3336eJ.d("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        ya.c = C3336eJ.d("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return ya.a().i;
    }

    public final URI h() {
        String strReplaceAll;
        YA yaF = f();
        String str = yaF.d;
        if (str == null) {
            strReplaceAll = null;
        } else {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            AbstractC2995aW.p(patternCompile, "compile(pattern)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            AbstractC2995aW.p(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        }
        yaF.d = strReplaceAll;
        ArrayList arrayList = yaF.f;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, C3336eJ.d((String) arrayList.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        List list = yaF.g;
        if (list != null) {
            int size2 = list.size();
            while (i < size2) {
                int i3 = i + 1;
                String str2 = (String) list.get(i);
                list.set(i, str2 == null ? null : C3336eJ.d(str2, 0, 0, "\\^`{|}", true, true, true, false, 195));
                i = i3;
            }
        }
        String str3 = yaF.h;
        yaF.h = str3 != null ? C3336eJ.d(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, Input.Keys.NUMPAD_RIGHT_PAREN) : null;
        String string = yaF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC2995aW.p(patternCompile2, "compile(pattern)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                AbstractC2995aW.p(strReplaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI uriCreate = URI.create(strReplaceAll2);
                AbstractC2995aW.p(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
