package t1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import i1.e0;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.y;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends DefaultHandler implements j2.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f50359b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f50360c = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f50361d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f50362e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f50363f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f50364a;

    public e() {
        try {
            this.f50364a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long a(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            String str = y.f44830a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(new q(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i10++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i10--;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0093 A[PHI: r13
  0x0093: PHI (r13v30 int) = (r13v5 int), (r13v8 int), (r13v33 int) binds: [B:128:0x01a3, B:120:0x0190, B:47:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    public static int c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i10 = 5;
        byte b10 = 4;
        int i11 = 0;
        int i12 = -1;
        switch (attributeValue) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                String attributeValue2 = xmlPullParser.getAttributeValue(null, X3.i.X);
                iBitCount = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (iBitCount > 0 && iBitCount < 33) {
                    i12 = iBitCount;
                    break;
                }
                break;
            case "tag:dolby.com,2015:dash:audio_channel_configuration:2015":
                String attributeValue3 = xmlPullParser.getAttributeValue(null, X3.i.X);
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int i13 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & i13) == 0) {
                        iBitCount = 0;
                        while (true) {
                            int[] iArr = f50362e;
                            if (i11 < iArr.length) {
                                iBitCount += ((i13 >> i11) & 1) * iArr[i11];
                                i11++;
                            } else if (iBitCount != 0) {
                                i12 = iBitCount;
                            }
                        }
                    } else {
                        String[] strArrW = y.W(str);
                        if (strArrW.length != 0) {
                            List listD = com.google.android.gms.common.api.internal.m.c('.').d(q1.F(strArrW[0].trim()));
                            if (listD.size() == 4 && ((String) listD.get(0)).equals("ac-4")) {
                                String str2 = (String) listD.get(3);
                                str2.getClass();
                                if (str2.equals("03")) {
                                    i12 = 18;
                                } else if (str2.equals("04")) {
                                    i12 = 21;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                String attributeValue4 = xmlPullParser.getAttributeValue(null, X3.i.X);
                if (attributeValue4 != null) {
                    i12 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                String attributeValue5 = xmlPullParser.getAttributeValue(null, X3.i.X);
                if (attributeValue5 != null) {
                    String strF = q1.F(attributeValue5);
                    strF.getClass();
                    switch (strF.hashCode()) {
                        case 1596796:
                            b10 = !strF.equals("4000") ? (byte) -1 : (byte) 0;
                            break;
                        case 2937391:
                            b10 = !strF.equals("a000") ? (byte) -1 : (byte) 1;
                            break;
                        case 3094034:
                            b10 = !strF.equals("f800") ? (byte) -1 : (byte) 2;
                            break;
                        case 3094035:
                            b10 = !strF.equals("f801") ? (byte) -1 : (byte) 3;
                            break;
                        case 3133436:
                            if (!strF.equals("fa01")) {
                                b10 = -1;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            i10 = 1;
                            break;
                        case 1:
                            i10 = 2;
                            break;
                        case 2:
                            break;
                        case 3:
                            i10 = 6;
                            break;
                        case 4:
                            i10 = 8;
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                } else {
                    i10 = -1;
                }
                i12 = i10;
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                String attributeValue6 = xmlPullParser.getAttributeValue(null, X3.i.X);
                int i14 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (i14 >= 0) {
                    int[] iArr2 = f50363f;
                    if (i14 < iArr2.length) {
                        i12 = iArr2[i14];
                    }
                    break;
                }
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                String attributeValue7 = xmlPullParser.getAttributeValue(null, X3.i.X);
                if (attributeValue7 != null && (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue7, 16))) != 0) {
                    i12 = iBitCount;
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!l1.a.k(xmlPullParser, "AudioChannelConfiguration"));
        return i12;
    }

    public static long d(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!l1.a.k(xmlPullParser, "BaseURL"));
        if (text != null && l1.a.i(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return oa.q.r(new b(text, attributeValue3, i10, i11));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            b bVar = (b) arrayList.get(i12);
            String strP = l1.a.p(bVar.f50335a, text);
            String str = attributeValue3 == null ? strP : attributeValue3;
            if (z10) {
                i10 = bVar.f50337c;
                i11 = bVar.f50338d;
                str = bVar.f50336b;
            }
            arrayList2.add(new b(strP, str, i10, i11));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:81:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x013f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0162  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static Pair f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? text;
        ?? A;
        UUID uuid3;
        String attributeValue2;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strF = q1.F(attributeValue3);
            strF.getClass();
            switch (strF) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = i1.g.f42540c;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = i1.g.f42542e;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = i1.g.f42541d;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    A = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, X3.i.X);
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= attributeCount) {
                            attributeValue2 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i10);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue2 = xmlPullParser.getAttributeValue(i10);
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue2) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue2)) {
                        String[] strArrSplit = attributeValue2.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                            uuidArr[i11] = UUID.fromString(strArrSplit[i11]);
                        }
                        uuid = i1.g.f42539b;
                        text = 0;
                        A = h3.o.a(uuid, uuidArr, null);
                        break;
                    } else {
                        l1.a.s("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        uuid2 = uuid;
                        text = uuid2;
                        A = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    text = uuid2;
                    A = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            text = uuid2;
            A = uuid2;
        }
        do {
            xmlPullParser.next();
            if ((l1.a.m(xmlPullParser, "clearkey:Laurl") || l1.a.m(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                A = A;
                text = xmlPullParser.getText();
            } else if (l1.a.m(xmlPullParser, "ms:laurl")) {
                A = A;
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (A == 0 && xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    od.c cVarI = h3.o.i(bArrDecode);
                    UUID uuid4 = cVarI == null ? null : (UUID) cVarI.f47386b;
                    if (uuid4 == null) {
                        l1.a.s("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = uuid4;
                        A = 0;
                        text = text;
                    } else {
                        UUID uuid5 = uuid4;
                        A = bArrDecode;
                        uuid = uuid5;
                        text = text;
                    }
                } else if (A == 0) {
                    uuid3 = i1.g.f42542e;
                    if (!uuid3.equals(uuid)) {
                        b(xmlPullParser);
                        A = A;
                        text = text;
                    } else {
                        b(xmlPullParser);
                        A = A;
                        text = text;
                    }
                } else {
                    b(xmlPullParser);
                    A = A;
                    text = text;
                }
            } else if (A == 0) {
                uuid3 = i1.g.f42542e;
                if (!uuid3.equals(uuid) && l1.a.m(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    A = h3.o.a(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    b(xmlPullParser);
                    A = A;
                    text = text;
                }
            } else {
                b(xmlPullParser);
                A = A;
                text = text;
            }
        } while (!l1.a.k(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new i1.l(uuid, text, MimeTypes.VIDEO_MP4, A) : null);
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, X3.i.X);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!l1.a.k(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = y.f44834e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j11 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j11 : j11;
    }

    public static float k(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f50359b.matcher(attributeValue);
            if (matcher.matches()) {
                int i10 = Integer.parseInt(matcher.group(1));
                String strGroup = matcher.group(2);
                return !TextUtils.isEmpty(strGroup) ? i10 / Integer.parseInt(strGroup) : i10;
            }
        }
        return f10;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.instructions.PhiInsn.getResult()" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:117)
        	at jadx.core.dex.visitors.InitCodeVariables.lambda$collectConnectedVars$0(InitCodeVariables.java:124)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:121)
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        */
    public static t1.c l(org.xmlpull.v1.XmlPullParser r164, android.net.Uri r165) {
        /*
            Method dump skipped, instruction units count: 5146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.e.l(org.xmlpull.v1.XmlPullParser, android.net.Uri):t1.c");
    }

    public static j m(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j11 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
        } else {
            j10 = 0;
        }
        return new j(attributeValue, j10, j11);
    }

    public static int n(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return com.ironsource.mediationsdk.metadata.a.f29616n;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return NotificationCompat.FLAG_LOCAL_ONLY;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (q1.m("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i11)).f50365a)) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }
        return i10;
    }

    public static r p(XmlPullParser xmlPullParser, r rVar) throws XmlPullParserException, IOException {
        long j10 = rVar != null ? rVar.f50409b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        long j11 = j10;
        long j12 = rVar != null ? rVar.f50410c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j12 = Long.parseLong(attributeValue2);
        }
        long j13 = j12;
        long j14 = rVar != null ? rVar.f50406d : 0L;
        long j15 = rVar != null ? rVar.f50407e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j14 = Long.parseLong(strArrSplit[0]);
            j15 = (Long.parseLong(strArrSplit[1]) - j14) + 1;
        }
        long j16 = j15;
        long j17 = j14;
        j jVarM = rVar != null ? rVar.f50408a : null;
        while (true) {
            xmlPullParser.next();
            if (l1.a.m(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar = jVarM;
            if (l1.a.k(xmlPullParser, "SegmentBase")) {
                return new r(jVar, j11, j13, j17, j16);
            }
            jVarM = jVar;
        }
    }

    public static o q(XmlPullParser xmlPullParser, o oVar, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15 = oVar != null ? oVar.f50409b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = oVar != null ? oVar.f50410c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = oVar != null ? oVar.f50396e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, IronSourceConstants.EVENTS_DURATION);
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = oVar != null ? oVar.f50395d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        long j23 = j13 == C.TIME_UNSET ? j12 : j13;
        long j24 = j23 == Long.MAX_VALUE ? -9223372036854775807L : j23;
        j jVarM = null;
        List listS = null;
        do {
            xmlPullParser.next();
            if (l1.a.m(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (l1.a.m(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j16, j11);
            } else if (l1.a.m(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m(xmlPullParser, X3.i.I0, "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!l1.a.k(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVarM == null) {
                jVarM = oVar.f50408a;
            }
            if (listS == null) {
                listS = oVar.f50397f;
            }
            if (arrayList == null) {
                arrayList = oVar.f50401j;
            }
        }
        return new o(jVarM, j16, j18, j22, j20, listS, j24, arrayList, y.M(j14), y.M(j10));
    }

    public static p r(XmlPullParser xmlPullParser, p pVar, List list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15;
        long j16 = pVar != null ? pVar.f50409b : 1L;
        j jVarM = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j16 = Long.parseLong(attributeValue);
        }
        long j17 = j16;
        long j18 = pVar != null ? pVar.f50410c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j18 = Long.parseLong(attributeValue2);
        }
        long j19 = j18;
        long j20 = pVar != null ? pVar.f50396e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, IronSourceConstants.EVENTS_DURATION);
        if (attributeValue3 != null) {
            j20 = Long.parseLong(attributeValue3);
        }
        long j21 = j20;
        long j22 = pVar != null ? pVar.f50395d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j22 = Long.parseLong(attributeValue4);
        }
        long j23 = j22;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j15 = -1;
                break;
            }
            f fVar = (f) list.get(i10);
            if (q1.m("http://dashif.org/guidelines/last-segment-number", fVar.f50365a)) {
                j15 = Long.parseLong(fVar.f50366b);
                break;
            }
            i10++;
        }
        long j24 = j15;
        long j25 = j13 == C.TIME_UNSET ? j12 : j13;
        long j26 = j25 == Long.MAX_VALUE ? -9223372036854775807L : j25;
        t tVarT = t(xmlPullParser, X3.i.I0, pVar != null ? pVar.f50403k : null);
        t tVarT2 = t(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, pVar != null ? pVar.f50402j : null);
        List listS = null;
        do {
            xmlPullParser.next();
            if (l1.a.m(xmlPullParser, "Initialization")) {
                jVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (l1.a.m(xmlPullParser, "SegmentTimeline")) {
                listS = s(xmlPullParser, j17, j11);
            } else {
                b(xmlPullParser);
            }
        } while (!l1.a.k(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVarM == null) {
                jVarM = pVar.f50408a;
            }
            if (listS == null) {
                listS = pVar.f50397f;
            }
        }
        return new p(jVarM, j17, j19, j23, j24, j21, listS, j26, tVarT2, tVarT, y.M(j14), y.M(j10));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        long j12;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j13 = -9223372036854775807L;
        boolean z10 = false;
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (l1.a.m(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j14 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z10) {
                    int i11 = i10;
                    j12 = j14;
                    jA = a(arrayList, jA, j13, i11, j12);
                } else {
                    j12 = j14;
                }
                if (j12 != C.TIME_UNSET) {
                    jA = j12;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
                j13 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i10 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z10 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!l1.a.k(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            String str = y.f44830a;
            a(arrayList, jA, j13, i10, y.U(j11, j10, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00ff. Please report as an issue. */
    public static t t(XmlPullParser xmlPullParser, String str, t tVar) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return tVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length));
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add("");
                int i10 = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i10);
                String strSubstring2 = attributeValue.substring(i10, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D) && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        t tVar2 = new t();
        tVar2.f50411a = arrayList;
        tVar2.f50412b = arrayList2;
        tVar2.f50413c = arrayList3;
        return tVar2;
    }

    @Override // j2.p
    public final Object j(Uri uri, n1.j jVar) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f50364a.newPullParser();
            xmlPullParserNewPullParser.setInput(jVar, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return l(xmlPullParserNewPullParser, uri);
            }
            throw e0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            if (e10.getDetail() instanceof IOException) {
                throw ((IOException) e10.getDetail());
            }
            throw e0.b(null, e10);
        }
    }
}
