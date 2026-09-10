package q3;

import android.text.Layout;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.k8;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.q1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import d5.u;
import go.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.l;
import k3.m;
import l1.g;
import l1.y;
import oa.q;
import oa.u0;
import oa.y0;
import oa.y1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f48605b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f48606c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f48607d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f48608e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f48609f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f48610g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f48611h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k8 f48612i = new k8(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f48613a;

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f48613a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static f a(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean b(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f48611h.matcher(attributeValue);
        if (!matcher.matches()) {
            l1.a.s("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z10 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i11 = Integer.parseInt(strGroup2);
            if (i10 == 0 || i11 == 0) {
                z10 = false;
            }
            k.g("Invalid cell resolution %s %s", i10, i11, z10);
            return i11;
        } catch (NumberFormatException unused) {
            l1.a.s("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, f fVar) throws k3.f {
        Matcher matcher;
        String str2 = y.f44830a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f48607d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new k3.f(l1.d.i(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            l1.a.s("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new k3.f(defpackage.e.o("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                fVar.f48633j = 3;
                break;
            case "em":
                fVar.f48633j = 2;
                break;
            case "px":
                fVar.f48633j = 1;
                break;
            default:
                throw new k3.f(defpackage.e.o("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        fVar.f48634k = Float.parseFloat(strGroup2);
    }

    public static k8 f(XmlPullParser xmlPullParser) {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = y.f44830a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            k.h("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f10 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f10 = 1.0f;
        }
        k8 k8Var = f48612i;
        int i11 = k8Var.f16362b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = k8Var.f16363c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new k8(i10 * f10, i11, i12);
    }

    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v24 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static void h(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, com.google.android.gms.internal.ads.n3 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.d.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, com.google.android.gms.internal.ads.n3, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    public static c j(XmlPullParser xmlPullParser, c cVar, HashMap map, k8 k8Var) throws k3.f {
        long j10;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        f fVarK = k(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long jL = C.TIME_UNSET;
        long jL2 = C.TIME_UNSET;
        long jL3 = C.TIME_UNSET;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jL3 = l(attributeValue, k8Var);
                    break;
                case "end":
                    jL2 = l(attributeValue, k8Var);
                    break;
                case "begin":
                    jL = l(attributeValue, k8Var);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str2 = y.f44830a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (cVar != null) {
            long j11 = cVar.f48596d;
            if (j11 != C.TIME_UNSET) {
                if (jL != C.TIME_UNSET) {
                    jL += j11;
                }
                if (jL2 != C.TIME_UNSET) {
                    jL2 += j11;
                }
            }
        }
        if (jL2 != C.TIME_UNSET) {
            j10 = jL2;
        } else {
            if (jL3 != C.TIME_UNSET) {
                jL2 = jL + jL3;
            } else if (cVar != null) {
                long j12 = cVar.f48597e;
                if (j12 != C.TIME_UNSET) {
                    j10 = j12;
                }
            }
            j10 = jL2;
        }
        return new c(xmlPullParser.getName(), null, jL, j10, fVarK, strArr, str, strSubstring, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:141:0x0206  */
    /* JADX WARN: Code duplicated, block: B:143:0x021a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0228  */
    /* JADX WARN: Code duplicated, block: B:152:0x0236  */
    /* JADX WARN: Code duplicated, block: B:157:0x0255  */
    /* JADX WARN: Code duplicated, block: B:159:0x0266  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0276  */
    /* JADX WARN: Code duplicated, block: B:169:0x028c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0291  */
    /* JADX WARN: Code duplicated, block: B:174:0x0297  */
    /* JADX WARN: Code duplicated, block: B:177:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    public static f k(XmlPullParser xmlPullParser, f fVar) {
        byte b10;
        int i10;
        y1 y1VarP;
        y1 y1VarP2;
        y1 y1VarP3;
        String str;
        int iHashCode;
        String str2;
        int iHashCode2;
        int i11;
        b bVar;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        f fVarA = fVar;
        for (int i12 = 0; i12 < attributeCount; i12++) {
            String attributeValue = xmlPullParser.getAttributeValue(i12);
            String attributeName = xmlPullParser.getAttributeName(i12);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b10 = 0;
                    break;
                case "extent":
                    b10 = 1;
                    break;
                case "fontFamily":
                    b10 = 2;
                    break;
                case "textAlign":
                    b10 = 3;
                    break;
                case "origin":
                    b10 = 4;
                    break;
                case "textDecoration":
                    b10 = 5;
                    break;
                case "fontWeight":
                    b10 = 6;
                    break;
                case "id":
                    b10 = 7;
                    break;
                case "ruby":
                    b10 = 8;
                    break;
                case "color":
                    b10 = 9;
                    break;
                case "shear":
                    b10 = 10;
                    break;
                case "textCombine":
                    b10 = 11;
                    break;
                case "fontSize":
                    b10 = 12;
                    break;
                case "textEmphasis":
                    b10 = 13;
                    break;
                case "rubyPosition":
                    b10 = 14;
                    break;
                case "backgroundColor":
                    b10 = 15;
                    break;
                case "multiRowAlign":
                    b10 = 16;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b10) {
                case 0:
                    fVarA = a(fVarA);
                    fVarA.f48632i = TtmlNode.ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    fVarA = a(fVarA);
                    fVarA.f48643u = attributeValue;
                    break;
                case 2:
                    fVarA = a(fVarA);
                    fVarA.f48624a = attributeValue;
                    break;
                case 3:
                    fVarA = a(fVarA);
                    String strF = q1.F(attributeValue);
                    strF.getClass();
                    switch (strF) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    fVarA.f48637o = alignment;
                    break;
                case 4:
                    fVarA = a(fVarA);
                    fVarA.f48642t = attributeValue;
                    break;
                case 5:
                    String strF2 = q1.F(attributeValue);
                    strF2.getClass();
                    switch (strF2) {
                        case "nounderline":
                            fVarA = a(fVarA);
                            fVarA.f48630g = 0;
                            break;
                        case "underline":
                            fVarA = a(fVarA);
                            fVarA.f48630g = 1;
                            break;
                        case "nolinethrough":
                            fVarA = a(fVarA);
                            fVarA.f48629f = 0;
                            break;
                        case "linethrough":
                            fVarA = a(fVarA);
                            fVarA.f48629f = 1;
                            break;
                    }
                    break;
                case 6:
                    fVarA = a(fVarA);
                    fVarA.f48631h = TtmlNode.BOLD.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if (TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        fVarA = a(fVarA);
                        fVarA.l = attributeValue;
                    }
                    break;
                case 8:
                    String strF3 = q1.F(attributeValue);
                    strF3.getClass();
                    switch (strF3) {
                        case "baseContainer":
                        case "base":
                            fVarA = a(fVarA);
                            fVarA.f48635m = 2;
                            break;
                        case "container":
                            fVarA = a(fVarA);
                            fVarA.f48635m = 1;
                            break;
                        case "delimiter":
                            fVarA = a(fVarA);
                            fVarA.f48635m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            fVarA = a(fVarA);
                            fVarA.f48635m = 3;
                            break;
                    }
                    break;
                case 9:
                    fVarA = a(fVarA);
                    try {
                        fVarA.f48625b = l1.e.a(attributeValue, false);
                        fVarA.f48626c = true;
                    } catch (IllegalArgumentException unused) {
                        u.q("Failed parsing color value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 10:
                    f fVarA2 = a(fVarA);
                    Matcher matcher = f48608e.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e10) {
                            l1.a.t("TtmlParser", "Failed to parse shear: " + attributeValue, e10);
                        }
                    } else {
                        u.q("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    fVarA2.f48641s = fMin;
                    fVarA = fVarA2;
                    break;
                case 11:
                    String strF4 = q1.F(attributeValue);
                    strF4.getClass();
                    if (strF4.equals("all")) {
                        fVarA = a(fVarA);
                        fVarA.f48639q = 1;
                    } else if (strF4.equals("none")) {
                        fVarA = a(fVarA);
                        fVarA.f48639q = 0;
                    }
                    break;
                case 12:
                    try {
                        fVarA = a(fVarA);
                        d(attributeValue, fVarA);
                    } catch (k3.f unused2) {
                        u.q("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 13:
                    fVarA = a(fVarA);
                    Pattern pattern = b.f48585d;
                    if (attributeValue == null) {
                        bVar = null;
                    } else {
                        String strF5 = q1.F(attributeValue.trim());
                        if (strF5.isEmpty()) {
                            bVar = null;
                        } else {
                            u0 u0VarW = u0.w(TextUtils.split(strF5, b.f48585d));
                            String str4 = (String) q.j(q.p(b.f48589h, u0VarW), "outside");
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i10 = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i10 = -2;
                                }
                                y1VarP = q.p(b.f48586e, u0VarW);
                                if (y1VarP.isEmpty()) {
                                    y1VarP2 = q.p(b.f48588g, u0VarW);
                                    y1VarP3 = q.p(b.f48587f, u0VarW);
                                    if (y1VarP2.isEmpty() || !y1VarP3.isEmpty()) {
                                        str = (String) q.j(y1VarP2, "filled");
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i13 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                            str2 = (String) q.j(y1VarP3, "circle");
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i11 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i11 = 3;
                                                }
                                                bVar = new b(i11, i13, i10);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i11 = 1;
                                            bVar = new b(i11, i13, i10);
                                        } else {
                                            str.equals("filled");
                                        }
                                        str2 = (String) q.j(y1VarP3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i11 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i11 = 3;
                                            }
                                            bVar = new b(i11, i13, i10);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i11 = 1;
                                        bVar = new b(i11, i13, i10);
                                    } else {
                                        bVar = new b(-1, 0, i10);
                                    }
                                } else {
                                    str3 = (String) new y0(y1VarP).next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i14 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        bVar = new b(i14, 0, i10);
                                    } else {
                                        str3.equals("auto");
                                    }
                                    bVar = new b(i14, 0, i10);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i10 = 1;
                            y1VarP = q.p(b.f48586e, u0VarW);
                            if (y1VarP.isEmpty()) {
                                str3 = (String) new y0(y1VarP).next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    bVar = new b(i14, 0, i10);
                                } else {
                                    str3.equals("auto");
                                }
                                bVar = new b(i14, 0, i10);
                            } else {
                                y1VarP2 = q.p(b.f48588g, u0VarW);
                                y1VarP3 = q.p(b.f48587f, u0VarW);
                                if (y1VarP2.isEmpty()) {
                                    str = (String) q.j(y1VarP2, "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) q.j(y1VarP3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i11 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i11 = 3;
                                            }
                                            bVar = new b(i11, i13, i10);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i11 = 1;
                                        bVar = new b(i11, i13, i10);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) q.j(y1VarP3, "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i11 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i11 = 3;
                                        }
                                        bVar = new b(i11, i13, i10);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i11 = 1;
                                    bVar = new b(i11, i13, i10);
                                } else {
                                    str = (String) q.j(y1VarP2, "filled");
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        str2 = (String) q.j(y1VarP3, "circle");
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i11 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i11 = 3;
                                            }
                                            bVar = new b(i11, i13, i10);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i11 = 1;
                                        bVar = new b(i11, i13, i10);
                                    } else {
                                        str.equals("filled");
                                    }
                                    str2 = (String) q.j(y1VarP3, "circle");
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i11 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i11 = 3;
                                        }
                                        bVar = new b(i11, i13, i10);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i11 = 1;
                                    bVar = new b(i11, i13, i10);
                                }
                            }
                        }
                    }
                    fVarA.f48640r = bVar;
                    break;
                case 14:
                    String strF6 = q1.F(attributeValue);
                    strF6.getClass();
                    if (strF6.equals("before")) {
                        fVarA = a(fVarA);
                        fVarA.f48636n = 1;
                    } else if (strF6.equals("after")) {
                        fVarA = a(fVarA);
                        fVarA.f48636n = 2;
                    }
                    break;
                case 15:
                    fVarA = a(fVarA);
                    try {
                        fVarA.f48627d = l1.e.a(attributeValue, false);
                        fVarA.f48628e = true;
                    } catch (IllegalArgumentException unused3) {
                        u.q("Failed parsing background value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case 16:
                    fVarA = a(fVarA);
                    String strF7 = q1.F(attributeValue);
                    strF7.getClass();
                    switch (strF7) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    fVarA.f48638p = alignment;
                    break;
            }
        }
        return fVarA;
    }

    public static long l(String str, k8 k8Var) throws k3.f {
        double d10;
        double d11;
        Matcher matcher = f48605b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d12 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d13 = d12 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d14 = d13 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d15 = d14 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d16 = d15 + (strGroup5 != null ? Long.parseLong(strGroup5) / k8Var.f16361a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d16 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) k8Var.f16362b)) / ((double) k8Var.f16361a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f48606c.matcher(str);
        if (!matcher2.matches()) {
            throw new k3.f(defpackage.e.n("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d17 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d10 = k8Var.f16361a;
                d17 /= d10;
                return (long) (d17 * 1000000.0d);
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d10 = k8Var.f16363c;
                d17 /= d10;
                return (long) (d17 * 1000000.0d);
            case "ms":
                d10 = 1000.0d;
                d17 /= d10;
                return (long) (d17 * 1000000.0d);
            default:
                return (long) (d17 * 1000000.0d);
        }
        d17 *= d11;
        return (long) (d17 * 1000000.0d);
    }

    public static n3 m(XmlPullParser xmlPullParser) {
        String strH = l1.a.h(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (strH == null) {
            return null;
        }
        Matcher matcher = f48610g.matcher(strH);
        if (!matcher.matches()) {
            l1.a.s("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strH));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new n3(i10, Integer.parseInt(strGroup2), false);
        } catch (NumberFormatException unused) {
            l1.a.s("TtmlParser", "Ignoring malformed tts extent: ".concat(strH));
            return null;
        }
    }

    @Override // k3.m
    public final void e(byte[] bArr, int i10, int i11, l lVar, g gVar) {
        i0.n0(g(bArr, i10, i11), lVar, gVar);
    }

    @Override // k3.m
    public final k3.d g(byte[] bArr, int i10, int i11) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f48613a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            n3 n3VarM = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            k8 k8VarF = f48612i;
            int i12 = 0;
            int iC = 15;
            nf nfVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i12 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            k8VarF = f(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            n3VarM = m(xmlPullParserNewPullParser);
                        }
                        k8 k8Var = k8VarF;
                        n3 n3Var = n3VarM;
                        int i13 = iC;
                        if (b(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                h(xmlPullParserNewPullParser, map, i13, n3Var, map2, map3);
                            } else {
                                try {
                                    c cVarJ = j(xmlPullParserNewPullParser, cVar, map2, k8Var);
                                    arrayDeque.push(cVarJ);
                                    if (cVar != null) {
                                        if (cVar.f48604m == null) {
                                            cVar.f48604m = new ArrayList();
                                        }
                                        cVar.f48604m.add(cVarJ);
                                    }
                                } catch (k3.f e10) {
                                    l1.a.t("TtmlParser", "Suppressing parser error", e10);
                                    i12++;
                                }
                            }
                            iC = i13;
                            n3VarM = n3Var;
                            k8VarF = k8Var;
                        } else {
                            l1.a.j("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i12++;
                        iC = i13;
                        n3VarM = n3Var;
                        k8VarF = k8Var;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c cVarA = c.a(xmlPullParserNewPullParser.getText());
                        if (cVar.f48604m == null) {
                            cVar.f48604m = new ArrayList();
                        }
                        cVar.f48604m.add(cVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            nfVar = new nf(cVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i12++;
                } else if (eventType == 3) {
                    i12--;
                }
                xmlPullParserNewPullParser.next();
            }
            nfVar.getClass();
            return nfVar;
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new IllegalStateException("Unable to decode source", e12);
        }
    }

    @Override // k3.m
    public final int i() {
        return 1;
    }
}
