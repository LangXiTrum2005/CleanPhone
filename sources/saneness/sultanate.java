package saneness;

import ads_mobile_sdk.hd1;
import ads_mobile_sdk.qv0;
import ads_mobile_sdk.tm;
import ads_mobile_sdk.xm0;
import android.net.Uri;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class sultanate {
    public static JsonElement apical(JsonObject jsonObject, prescient prescientVar) {
        JsonObject asJsonObject;
        Iterator it = prescientVar.iterator();
        JsonElement jsonElement = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (jsonElement != null && !jsonElement.isJsonObject()) {
                return null;
            }
            if (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null || (jsonElement = asJsonObject.get(str)) == null) {
                jsonElement = jsonObject.get(str);
            }
        }
        return jsonElement;
    }

    public static final tm attabal(String str) {
        List listFormularize;
        concerto builder = tm.o();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (str == null || (listFormularize = StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null)) == null) {
            listFormularize = p002kotlin.collections.adultoid.formularize();
        }
        if (listFormularize.size() == 3) {
            Long lGraveside = StringsKt.graveside((String) listFormularize.get(0));
            builder.attabal(lGraveside != null ? lGraveside.longValue() : 0L);
            Long lGraveside2 = StringsKt.graveside((String) listFormularize.get(1));
            builder.wireman(lGraveside2 != null ? lGraveside2.longValue() : 0L);
            Long lGraveside3 = StringsKt.graveside((String) listFormularize.get(2));
            builder.dern(lGraveside3 != null ? lGraveside3.longValue() : 0L);
        }
        xm0 xm0VarA = builder.a();
        Intrinsics.checkNotNullExpressionValue(xm0VarA, "build(...)");
        return (tm) xm0VarA;
    }

    public static String beachfront(JsonObject jsonObject, qv0 qv0Var) {
        CharSequence charSequenceSubSequence;
        int iX = qv0Var.G() ? qv0Var.x() : -1;
        Set<String> setKeySet = jsonObject.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : setKeySet) {
            JsonElement jsonElement = jsonObject.get(str);
            Intrinsics.checkNotNullExpressionValue(jsonElement, "get(...)");
            String strTriweekly = triweekly(jsonElement, qv0Var);
            String str2 = (qv0Var.r() <= 0 || strTriweekly.length() <= qv0Var.r()) ? str + qv0Var.v() + strTriweekly : null;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        String strU = qv0Var.u();
        Intrinsics.checkNotNullExpressionValue(strU, "getItemSeparator(...)");
        String strPreterite = CollectionsKt.preterite(arrayList, strU, null, null, iX, "", null, 38, null);
        int length = strPreterite.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (strPreterite.charAt(length) != qv0Var.o().charAt(0)) {
                charSequenceSubSequence = strPreterite.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static final void competently(Uri.Builder builder, String str, String str2) {
        if (str2 != null) {
            if ((str2.length() > 0 ? str2 : null) != null) {
                builder.appendQueryParameter(str, str2);
            }
        }
    }

    public static boolean cutely(JsonObject jsonObject, hd1 hd1Var) {
        if (hd1Var.t().isEmpty()) {
            return false;
        }
        prescient prescientVarT = hd1Var.t();
        Intrinsics.checkNotNullExpressionValue(prescientVarT, "getPathList(...)");
        JsonElement jsonElementApical = apical(jsonObject, prescientVarT);
        if (jsonElementApical == null) {
            return false;
        }
        return taiyuan(jsonElementApical, hd1Var);
    }

    public static Boolean dern(JsonElement jsonElement, boolean z) {
        boolean z2;
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isBoolean()) {
            return Boolean.valueOf(jsonElement.getAsBoolean() == z);
        }
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return Boolean.valueOf(z == ((jsonElement.getAsJsonPrimitive().getAsNumber().longValue() > 0L ? 1 : (jsonElement.getAsJsonPrimitive().getAsNumber().longValue() == 0L ? 0 : -1)) > 0));
        }
        String asString = (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isString()) ? jsonElement.getAsString() : jsonElement.toString();
        Intrinsics.beachfront(asString);
        String lowerCase = asString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (p002kotlin.collections.adultoid.kowloon("1", "t", a.g).contains(lowerCase)) {
            z2 = true;
        } else {
            if (!p002kotlin.collections.adultoid.kowloon("0", "f", "false").contains(lowerCase)) {
                return null;
            }
            z2 = false;
        }
        return Boolean.valueOf(z == z2);
    }

    public static final String formularize(JsonElement jsonElement, qv0 qv0Var) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return wireman(jsonElement.getAsJsonPrimitive().getAsNumber().doubleValue(), qv0Var);
        }
        if (!jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isString()) {
            if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isBoolean()) {
                return jsonElement.getAsJsonPrimitive().getAsBoolean() ? "1" : "0";
            }
            return null;
        }
        String asString = jsonElement.getAsJsonPrimitive().getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        Double dArytenoidectomy = p002kotlin.text.adultoid.arytenoidectomy(asString);
        if (dArytenoidectomy != null) {
            return wireman(dArytenoidectomy.doubleValue(), qv0Var);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean impromptu(ads_mobile_sdk.hd1 r6, double r7) {
        /*
            boolean r0 = r6.r()
            double r1 = r6.s()
            boolean r3 = r6.y()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L1b
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L17
            if (r6 < 0) goto L1a
            goto L19
        L17:
            if (r6 <= 0) goto L1a
        L19:
            return r5
        L1a:
            return r4
        L1b:
            boolean r3 = r6.z()
            if (r3 == 0) goto L2c
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L28
            if (r6 > 0) goto L2b
            goto L2a
        L28:
            if (r6 >= 0) goto L2b
        L2a:
            return r5
        L2b:
            return r4
        L2c:
            boolean r6 = r6.w()
            if (r6 == 0) goto L3d
            long r0 = (long) r1
            long r6 = (long) r7
            long r6 = r6 & r0
            r0 = 0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L3c
            return r5
        L3c:
            return r4
        L3d:
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 != 0) goto L42
            return r5
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: saneness.sultanate.impromptu(ads_mobile_sdk.hd1, double):boolean");
    }

    public static final String marial(JsonElement jsonElement, qv0 qv0Var) {
        Boolean boolDern = dern(jsonElement, true);
        if (boolDern == null) {
            return null;
        }
        boolean zBooleanValue = boolDern.booleanValue();
        if (zBooleanValue && qv0Var.t()) {
            return null;
        }
        if (zBooleanValue || !qv0Var.s()) {
            return zBooleanValue ? "1" : "0";
        }
        return null;
    }

    public static boolean taiyuan(JsonElement jsonElement, hd1 hd1Var) {
        String string;
        if (hd1Var.B()) {
            String strU = hd1Var.u();
            Intrinsics.checkNotNullExpressionValue(strU, "getStringValue(...)");
            if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isString()) {
                string = jsonElement.getAsString();
            } else if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isBoolean()) {
                string = jsonElement.getAsBoolean() ? "1" : "0";
            } else {
                string = jsonElement.toString();
            }
            Regex regex = new Regex(strU);
            Intrinsics.beachfront(string);
            return regex.matches(string);
        }
        if (hd1Var.x()) {
            Boolean boolDern = dern(jsonElement, hd1Var.p());
            if (boolDern != null) {
                return boolDern.booleanValue();
            }
            return false;
        }
        if (hd1Var.A()) {
            if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
                return impromptu(hd1Var, jsonElement.getAsNumber().doubleValue());
            }
            if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
                return impromptu(hd1Var, jsonElement.getAsBoolean() ? 1.0d : 0.0d);
            }
            String asString = (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isString()) ? jsonElement.getAsString() : jsonElement.toString();
            Intrinsics.beachfront(asString);
            String lowerCase = asString.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Double dArytenoidectomy = p002kotlin.text.adultoid.arytenoidectomy(lowerCase);
            if (dArytenoidectomy != null) {
                return impromptu(hd1Var, dArytenoidectomy.doubleValue());
            }
            return false;
        }
        if (!hd1Var.v()) {
            return true;
        }
        hd1 hd1VarO = hd1Var.o();
        Intrinsics.checkNotNullExpressionValue(hd1VarO, "getArrayContains(...)");
        if (!jsonElement.isJsonArray()) {
            return false;
        }
        Iterable asJsonArray = jsonElement.getAsJsonArray();
        Intrinsics.checkNotNullExpressionValue(asJsonArray, "getAsJsonArray(...)");
        if ((asJsonArray instanceof Collection) && ((Collection) asJsonArray).isEmpty()) {
            return false;
        }
        for (JsonElement jsonElement2 : asJsonArray) {
            if (hd1VarO.t().isEmpty()) {
                Intrinsics.beachfront(jsonElement2);
                if (taiyuan(jsonElement2, hd1VarO)) {
                    return true;
                }
            } else if (jsonElement2.isJsonObject()) {
                JsonObject asJsonObject = jsonElement2.getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
                if (cutely(asJsonObject, hd1VarO)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public static String triweekly(JsonElement jsonElement, qv0 qv0Var) {
        CharSequence charSequenceSubSequence;
        if (jsonElement.isJsonObject()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
            return beachfront(asJsonObject, qv0Var);
        }
        if (!jsonElement.isJsonArray()) {
            if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isString()) {
                String asString = jsonElement.getAsString();
                Intrinsics.beachfront(asString);
                return asString;
            }
            if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isBoolean()) {
                return jsonElement.getAsJsonPrimitive().getAsBoolean() ? "1" : "0";
            }
            String string = jsonElement.toString();
            Intrinsics.beachfront(string);
            return string;
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        Intrinsics.checkNotNullExpressionValue(asJsonArray, "getAsJsonArray(...)");
        int iX = qv0Var.G() ? qv0Var.x() : -1;
        ArrayList arrayList = new ArrayList();
        for (JsonElement jsonElement2 : asJsonArray) {
            Intrinsics.beachfront(jsonElement2);
            String strTriweekly = triweekly(jsonElement2, qv0Var);
            if (qv0Var.r() > 0 && strTriweekly.length() > qv0Var.r()) {
                strTriweekly = null;
            }
            if (strTriweekly != null) {
                arrayList.add(strTriweekly);
            }
        }
        String strO = qv0Var.o();
        Intrinsics.checkNotNullExpressionValue(strO, "getArraySeparator(...)");
        String strPreterite = CollectionsKt.preterite(arrayList, strO, null, null, iX, "", null, 38, null);
        int length = strPreterite.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i = length - 1;
            if (strPreterite.charAt(length) != qv0Var.o().charAt(0)) {
                charSequenceSubSequence = strPreterite.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static String wireman(double d, qv0 qv0Var) {
        Object objValueOf;
        String str;
        double dY = d * (qv0Var.H() ? qv0Var.y() : 1.0d);
        int iA = 5;
        if (qv0Var.I()) {
            iA = qv0Var.A() >= 0 ? qv0Var.A() : 5;
            double dPow = Math.pow(10.0d, qv0Var.A());
            objValueOf = Double.valueOf(((long) (dY * dPow)) / dPow);
        } else if (qv0Var.D()) {
            objValueOf = Long.valueOf(((long) (dY / ((double) qv0Var.p()))) * ((long) qv0Var.p()));
        } else {
            objValueOf = dY == Math.floor(dY) ? Long.valueOf(pastie.dern.marial(dY)) : Double.valueOf(dY);
        }
        if (objValueOf instanceof Double) {
            p002kotlin.jvm.internal.gintrap gintrapVar = p002kotlin.jvm.internal.gintrap.f29390attabal;
            str = String.format(Locale.US, "%." + iA + "f", Arrays.copyOf(new Object[]{objValueOf}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else if (objValueOf instanceof Float) {
            p002kotlin.jvm.internal.gintrap gintrapVar2 = p002kotlin.jvm.internal.gintrap.f29390attabal;
            str = String.format(Locale.US, "%." + iA + "f", Arrays.copyOf(new Object[]{objValueOf}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            p002kotlin.jvm.internal.gintrap gintrapVar3 = p002kotlin.jvm.internal.gintrap.f29390attabal;
            str = String.format(Locale.US, "%d", Arrays.copyOf(new Object[]{objValueOf}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        if (StringsKt.overspeculate(str, ".", false, 2, null)) {
            return new Regex("\\.$").replace(new Regex("0*$").replace(str, ""), "");
        }
        return str;
    }
}
