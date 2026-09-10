package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f3125a;

    static {
        C4839vT c4839vT = new C4839vT(AbstractC3263dY.a(String.class), W90.f3912a);
        C4839vT c4839vT2 = new C4839vT(AbstractC3263dY.a(Character.TYPE), C2281Ae.f2824a);
        C4839vT c4839vT3 = new C4839vT(AbstractC3263dY.a(char[].class), C4502re.c);
        C4839vT c4839vT4 = new C4839vT(AbstractC3263dY.a(Double.TYPE), C2396Ep.f3041a);
        C4839vT c4839vT5 = new C4839vT(AbstractC3263dY.a(double[].class), C2344Cp.c);
        C4839vT c4839vT6 = new C4839vT(AbstractC3263dY.a(Float.TYPE), C4179nv.f4766a);
        C4839vT c4839vT7 = new C4839vT(AbstractC3263dY.a(float[].class), C3827jv.c);
        C4839vT c4839vT8 = new C4839vT(AbstractC3263dY.a(Long.TYPE), FJ.f3064a);
        C4839vT c4839vT9 = new C4839vT(AbstractC3263dY.a(long[].class), C5181zJ.c);
        C4839vT c4839vT10 = new C4839vT(AbstractC3263dY.a(We0.class), C3010af0.f4133a);
        C4839vT c4839vT11 = new C4839vT(AbstractC3263dY.a(Xe0.class), Ze0.c);
        C4839vT c4839vT12 = new C4839vT(AbstractC3263dY.a(Integer.TYPE), AD.f2808a);
        C4839vT c4839vT13 = new C4839vT(AbstractC3263dY.a(int[].class), C4735uD.c);
        C4839vT c4839vT14 = new C4839vT(AbstractC3263dY.a(Re0.class), Ve0.f3882a);
        C4839vT c4839vT15 = new C4839vT(AbstractC3263dY.a(Se0.class), Ue0.c);
        C4839vT c4839vT16 = new C4839vT(AbstractC3263dY.a(Short.TYPE), A60.f2801a);
        C4839vT c4839vT17 = new C4839vT(AbstractC3263dY.a(short[].class), C5165z60.c);
        C4839vT c4839vT18 = new C4839vT(AbstractC3263dY.a(C3099bf0.class), C3452ff0.f4377a);
        C4839vT c4839vT19 = new C4839vT(AbstractC3263dY.a(C3187cf0.class), C3364ef0.c);
        C4839vT c4839vT20 = new C4839vT(AbstractC3263dY.a(Byte.TYPE), C3269dc.f4277a);
        C4839vT c4839vT21 = new C4839vT(AbstractC3263dY.a(byte[].class), C2771Tb.c);
        C4839vT c4839vT22 = new C4839vT(AbstractC3263dY.a(Le0.class), Qe0.f3612a);
        C4839vT c4839vT23 = new C4839vT(AbstractC3263dY.a(Ne0.class), Pe0.c);
        C4839vT c4839vT24 = new C4839vT(AbstractC3263dY.a(Boolean.TYPE), C3969lb.f4651a);
        C4839vT c4839vT25 = new C4839vT(AbstractC3263dY.a(boolean[].class), C3793jb.c);
        C4839vT c4839vT26 = new C4839vT(AbstractC3263dY.a(C5033xf0.class), Bf0.b);
        C3186cf c3186cfA = AbstractC3263dY.a(C4350pq.class);
        int i = C4350pq.d;
        f3125a = U5.u0(c4839vT, c4839vT2, c4839vT3, c4839vT4, c4839vT5, c4839vT6, c4839vT7, c4839vT8, c4839vT9, c4839vT10, c4839vT11, c4839vT12, c4839vT13, c4839vT14, c4839vT15, c4839vT16, c4839vT17, c4839vT18, c4839vT19, c4839vT20, c4839vT21, c4839vT22, c4839vT23, c4839vT24, c4839vT25, c4839vT26, new C4839vT(c3186cfA, C4525rq.f4949a));
    }

    public static final String a(String str) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            String strValueOf2 = String.valueOf(cCharAt);
            AbstractC2995aW.o(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            Locale locale = Locale.ROOT;
            strValueOf = strValueOf2.toUpperCase(locale);
            AbstractC2995aW.p(strValueOf, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (strValueOf.length() <= 1) {
                strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
            } else if (cCharAt != 329) {
                char cCharAt2 = strValueOf.charAt(0);
                String strSubstring = strValueOf.substring(1);
                AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
                String lowerCase = strSubstring.toLowerCase(locale);
                AbstractC2995aW.p(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                strValueOf = cCharAt2 + lowerCase;
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        String strSubstring2 = str.substring(1);
        AbstractC2995aW.p(strSubstring2, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring2);
        return sb.toString();
    }
}
