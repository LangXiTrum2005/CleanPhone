package rsp;

import android.text.Layout;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import decarock.grimness;
import decarock.saran;
import decarock.triweekly;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import strother.apical;
import strother.polloi;
import strother.taiyuan;

/* JADX INFO: compiled from: TtmlParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class wireman implements polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final XmlPullParserFactory f36998attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Pattern f36995saneness = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Pattern f36992dern = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Pattern f36997wireman = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Pattern f36994marial = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Pattern f36990beachfront = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Pattern f36991competently = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final Pattern f36993impromptu = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final attabal f36996taiyuan = new attabal(30.0f, 1, 1);

    /* JADX INFO: compiled from: TtmlParser.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final float f36999attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f37000dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f37001saneness;

        public attabal(float f, int i, int i2) {
            this.f36999attabal = f;
            this.f37001saneness = i;
            this.f37000dern = i2;
        }
    }

    /* JADX INFO: compiled from: TtmlParser.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f37002attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f37003saneness;

        public saneness(int i, int i2) {
            this.f37002attabal = i;
            this.f37003saneness = i2;
        }
    }

    public wireman() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f36998attabal = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static void apical(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strAttabal;
        do {
            xmlPullParser.next();
            if (saran.marial(xmlPullParser, "image") && (strAttabal = saran.attabal(xmlPullParser, "id")) != null) {
                map.put(strAttabal, xmlPullParser.nextText());
            }
        } while (!saran.dern(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    public static String[] arytenoidectomy(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : grimness.osteal(strTrim, "\\s+");
    }

    public static Layout.Alignment beachfront(String str) {
        String strBeachfront = com.google.common.base.attabal.beachfront(str);
        strBeachfront.getClass();
        switch (strBeachfront) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static int competently(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i;
        }
        Matcher matcher = f36993impromptu.matcher(attributeValue);
        if (!matcher.matches()) {
            triweekly.impromptu("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
        boolean z = true;
        try {
            int i2 = Integer.parseInt((String) decarock.attabal.marial(matcher.group(1)));
            int i3 = Integer.parseInt((String) decarock.attabal.marial(matcher.group(2)));
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            decarock.attabal.saneness(z, "Invalid cell resolution " + i2 + " " + i3);
            return i3;
        } catch (NumberFormatException unused) {
            triweekly.impromptu("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
    }

    public static Map<String, competently> cutely(XmlPullParser xmlPullParser, Map<String, competently> map, int i, saneness sanenessVar, Map<String, marial> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (saran.marial(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String strAttabal = saran.attabal(xmlPullParser, TtmlNode.TAG_STYLE);
                competently competentlyVarKowloon = kowloon(xmlPullParser, new competently());
                if (strAttabal != null) {
                    for (String str : arytenoidectomy(strAttabal)) {
                        competentlyVarKowloon.attabal(map.get(str));
                    }
                }
                String strCompetently = competentlyVarKowloon.competently();
                if (strCompetently != null) {
                    map.put(strCompetently, competentlyVarKowloon);
                }
            } else if (saran.marial(xmlPullParser, TtmlNode.TAG_REGION)) {
                marial marialVarImpassible = impassible(xmlPullParser, i, sanenessVar);
                if (marialVarImpassible != null) {
                    map2.put(marialVarImpassible.f36972attabal, marialVarImpassible);
                }
            } else if (saran.marial(xmlPullParser, TtmlNode.TAG_METADATA)) {
                apical(xmlPullParser, map3);
            }
        } while (!saran.dern(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    public static dern formularize(XmlPullParser xmlPullParser, dern dernVar, Map<String, marial> map, attabal attabalVar) throws SubtitleDecoderException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String strSubstring = null;
        competently competentlyVarKowloon = kowloon(xmlPullParser2, null);
        long jMonoploid = -9223372036854775807L;
        long jMonoploid2 = -9223372036854775807L;
        long jMonoploid3 = -9223372036854775807L;
        String[] strArr = null;
        String str = "";
        int i = 0;
        while (i < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i);
            int i2 = attributeCount;
            String attributeValue = xmlPullParser2.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    i++;
                    xmlPullParser2 = xmlPullParser;
                    attributeCount = i2;
                    break;
                case "dur":
                    jMonoploid3 = monoploid(attributeValue, attabalVar);
                    break;
                case "end":
                    jMonoploid2 = monoploid(attributeValue, attabalVar);
                    break;
                case "begin":
                    jMonoploid = monoploid(attributeValue, attabalVar);
                    break;
                case "style":
                    String[] strArrArytenoidectomy = arytenoidectomy(attributeValue);
                    if (strArrArytenoidectomy.length > 0) {
                        strArr = strArrArytenoidectomy;
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
            i++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i2;
        }
        if (dernVar != null) {
            long j = dernVar.f36966wireman;
            if (j != C.TIME_UNSET) {
                if (jMonoploid != C.TIME_UNSET) {
                    jMonoploid += j;
                }
                if (jMonoploid2 != C.TIME_UNSET) {
                    jMonoploid2 += j;
                }
            }
        }
        long j2 = jMonoploid;
        if (jMonoploid2 == C.TIME_UNSET) {
            if (jMonoploid3 != C.TIME_UNSET) {
                jMonoploid2 = j2 + jMonoploid3;
            } else if (dernVar != null) {
                long j3 = dernVar.f36963marial;
                if (j3 != C.TIME_UNSET) {
                    jMonoploid2 = j3;
                }
            }
        }
        return dern.dern(xmlPullParser.getName(), j2, jMonoploid2, competentlyVarKowloon, strArr, str, strSubstring, dernVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    public static marial impassible(XmlPullParser xmlPullParser, int i, saneness sanenessVar) {
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        float f5;
        int i3;
        String strAttabal = saran.attabal(xmlPullParser, "id");
        if (strAttabal == null) {
            return null;
        }
        String strAttabal2 = saran.attabal(xmlPullParser, "origin");
        if (strAttabal2 == null) {
            triweekly.impromptu("TtmlParser", "Ignoring region without an origin");
            return null;
        }
        Pattern pattern = f36990beachfront;
        Matcher matcher = pattern.matcher(strAttabal2);
        Pattern pattern2 = f36991competently;
        Matcher matcher2 = pattern2.matcher(strAttabal2);
        int i4 = 2;
        if (matcher.matches()) {
            try {
                f = Float.parseFloat((String) decarock.attabal.marial(matcher.group(1))) / 100.0f;
                f2 = Float.parseFloat((String) decarock.attabal.marial(matcher.group(2))) / 100.0f;
            } catch (NumberFormatException unused) {
                triweekly.impromptu("TtmlParser", "Ignoring region with malformed origin: " + strAttabal2);
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                triweekly.impromptu("TtmlParser", "Ignoring region with unsupported origin: " + strAttabal2);
                return null;
            }
            if (sanenessVar == null) {
                triweekly.impromptu("TtmlParser", "Ignoring region with missing tts:extent: " + strAttabal2);
                return null;
            }
            try {
                int i5 = Integer.parseInt((String) decarock.attabal.marial(matcher2.group(1)));
                int i6 = Integer.parseInt((String) decarock.attabal.marial(matcher2.group(2)));
                float f6 = i5 / sanenessVar.f37002attabal;
                float f7 = i6 / sanenessVar.f37003saneness;
                f = f6;
                f2 = f7;
            } catch (NumberFormatException unused2) {
                triweekly.impromptu("TtmlParser", "Ignoring region with malformed origin: " + strAttabal2);
                return null;
            }
        }
        String strAttabal3 = saran.attabal(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (strAttabal3 == null) {
            triweekly.impromptu("TtmlParser", "Ignoring region without an extent");
            return null;
        }
        Matcher matcher3 = pattern.matcher(strAttabal3);
        Matcher matcher4 = pattern2.matcher(strAttabal3);
        if (matcher3.matches()) {
            try {
                f3 = Float.parseFloat((String) decarock.attabal.marial(matcher3.group(1))) / 100.0f;
                f4 = Float.parseFloat((String) decarock.attabal.marial(matcher3.group(2))) / 100.0f;
            } catch (NumberFormatException unused3) {
                triweekly.impromptu("TtmlParser", "Ignoring region with malformed extent: " + strAttabal2);
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                triweekly.impromptu("TtmlParser", "Ignoring region with unsupported extent: " + strAttabal2);
                return null;
            }
            if (sanenessVar == null) {
                triweekly.impromptu("TtmlParser", "Ignoring region with missing tts:extent: " + strAttabal2);
                return null;
            }
            try {
                int i7 = Integer.parseInt((String) decarock.attabal.marial(matcher4.group(1)));
                int i8 = Integer.parseInt((String) decarock.attabal.marial(matcher4.group(2)));
                float f8 = i7 / sanenessVar.f37002attabal;
                f4 = i8 / sanenessVar.f37003saneness;
                f3 = f8;
            } catch (NumberFormatException unused4) {
                triweekly.impromptu("TtmlParser", "Ignoring region with malformed extent: " + strAttabal2);
                return null;
            }
        }
        float f9 = f4;
        String strAttabal4 = saran.attabal(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
        if (strAttabal4 != null) {
            String strBeachfront = com.google.common.base.attabal.beachfront(strAttabal4);
            strBeachfront.getClass();
            if (strBeachfront.equals(TtmlNode.CENTER)) {
                f5 = f2 + (f9 / 2.0f);
                i2 = 1;
            } else if (strBeachfront.equals("after")) {
                f5 = f2 + f9;
                i2 = 2;
            } else {
                i2 = 0;
                f5 = f2;
            }
        } else {
            i2 = 0;
            f5 = f2;
        }
        float f10 = 1.0f / i;
        String strAttabal5 = saran.attabal(xmlPullParser, "writingMode");
        if (strAttabal5 != null) {
            String strBeachfront2 = com.google.common.base.attabal.beachfront(strAttabal5);
            strBeachfront2.getClass();
            switch (strBeachfront2) {
                case "tb":
                case "tblr":
                    i3 = i4;
                    break;
                case "tbrl":
                    i3 = 1;
                    break;
                default:
                    i4 = Integer.MIN_VALUE;
                    i3 = i4;
                    break;
            }
        } else {
            i4 = Integer.MIN_VALUE;
            i3 = i4;
        }
        return new marial(strAttabal, f, f5, 0, i2, f3, f9, 1, f10, i3);
    }

    public static void impromptu(String str, competently competentlyVar) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrOsteal = grimness.osteal(str, "\\s+");
        if (strArrOsteal.length == 1) {
            matcher = f36997wireman.matcher(str);
        } else {
            if (strArrOsteal.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrOsteal.length + ".");
            }
            matcher = f36997wireman.matcher(strArrOsteal[1]);
            triweekly.impromptu("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) decarock.attabal.marial(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                competentlyVar.cord(3);
                break;
            case "em":
                competentlyVar.cord(2);
                break;
            case "px":
                competentlyVar.cord(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        competentlyVar.preprohormone(Float.parseFloat((String) decarock.attabal.marial(matcher.group(1))));
    }

    public static competently kowloon(XmlPullParser xmlPullParser, competently competentlyVar) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    competentlyVar = wireman(competentlyVar).stratoscope(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    competentlyVar = wireman(competentlyVar).rotuma(attributeValue);
                    break;
                case "textAlign":
                    competentlyVar = wireman(competentlyVar).supplicat(beachfront(attributeValue));
                    break;
                case "textDecoration":
                    String strBeachfront = com.google.common.base.attabal.beachfront(attributeValue);
                    strBeachfront.getClass();
                    switch (strBeachfront) {
                        case "nounderline":
                            competentlyVar = wireman(competentlyVar).polder(false);
                            break;
                        case "underline":
                            competentlyVar = wireman(competentlyVar).polder(true);
                            break;
                        case "nolinethrough":
                            competentlyVar = wireman(competentlyVar).trm(false);
                            break;
                        case "linethrough":
                            competentlyVar = wireman(competentlyVar).trm(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    competentlyVar = wireman(competentlyVar).dovishness(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        competentlyVar = wireman(competentlyVar).cuirassed(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strBeachfront2 = com.google.common.base.attabal.beachfront(attributeValue);
                    strBeachfront2.getClass();
                    switch (strBeachfront2) {
                        case "baseContainer":
                        case "base":
                            competentlyVar = wireman(competentlyVar).sealless(2);
                            break;
                        case "container":
                            competentlyVar = wireman(competentlyVar).sealless(1);
                            break;
                        case "delimiter":
                            competentlyVar = wireman(competentlyVar).sealless(4);
                            break;
                        case "textContainer":
                        case "text":
                            competentlyVar = wireman(competentlyVar).sealless(3);
                            break;
                    }
                    break;
                case "color":
                    competentlyVar = wireman(competentlyVar);
                    try {
                        competentlyVar.gintrap(decarock.beachfront.dern(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        triweekly.impromptu("TtmlParser", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    competentlyVar = wireman(competentlyVar).kattegat(triweekly(attributeValue));
                    break;
                case "textCombine":
                    String strBeachfront3 = com.google.common.base.attabal.beachfront(attributeValue);
                    strBeachfront3.getClass();
                    if (!strBeachfront3.equals("all")) {
                        if (strBeachfront3.equals("none")) {
                            competentlyVar = wireman(competentlyVar).restrictive(false);
                        }
                        break;
                    } else {
                        competentlyVar = wireman(competentlyVar).restrictive(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        competentlyVar = wireman(competentlyVar);
                        impromptu(attributeValue, competentlyVar);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        triweekly.impromptu("TtmlParser", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    competentlyVar = wireman(competentlyVar).merc(rsp.saneness.attabal(attributeValue));
                    break;
                case "rubyPosition":
                    String strBeachfront4 = com.google.common.base.attabal.beachfront(attributeValue);
                    strBeachfront4.getClass();
                    if (!strBeachfront4.equals("before")) {
                        if (strBeachfront4.equals("after")) {
                            competentlyVar = wireman(competentlyVar).yemenite(2);
                        }
                        break;
                    } else {
                        competentlyVar = wireman(competentlyVar).yemenite(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    competentlyVar = wireman(competentlyVar);
                    try {
                        competentlyVar.adultoid(decarock.beachfront.dern(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        triweekly.impromptu("TtmlParser", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    competentlyVar = wireman(competentlyVar).oilcan(beachfront(attributeValue));
                    break;
            }
        }
        return competentlyVar;
    }

    public static boolean marial(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static long monoploid(String str, attabal attabalVar) throws SubtitleDecoderException {
        double d;
        double d2;
        Matcher matcher = f36995saneness.matcher(str);
        if (matcher.matches()) {
            double d3 = (Long.parseLong((String) decarock.attabal.marial(matcher.group(1))) * 3600) + (Long.parseLong((String) decarock.attabal.marial(matcher.group(2))) * 60) + Long.parseLong((String) decarock.attabal.marial(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d4 = d3 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d5 = d4 + (strGroup2 != null ? Long.parseLong(strGroup2) / attabalVar.f36999attabal : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d5 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) attabalVar.f37001saneness)) / ((double) attabalVar.f36999attabal) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f36992dern.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException("Malformed time expression: " + str);
        }
        double d6 = Double.parseDouble((String) decarock.attabal.marial(matcher2.group(1)));
        String str2 = (String) decarock.attabal.marial(matcher2.group(2));
        str2.getClass();
        switch (str2) {
            case "f":
                d = attabalVar.f36999attabal;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            case "h":
                d2 = 3600.0d;
                break;
            case "m":
                d2 = 60.0d;
                break;
            case "t":
                d = attabalVar.f37000dern;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            case "ms":
                d = 1000.0d;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            default:
                return (long) (d6 * 1000000.0d);
        }
        d6 *= d2;
        return (long) (d6 * 1000000.0d);
    }

    public static saneness polloi(XmlPullParser xmlPullParser) {
        String strAttabal = saran.attabal(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (strAttabal == null) {
            return null;
        }
        Matcher matcher = f36991competently.matcher(strAttabal);
        if (!matcher.matches()) {
            triweekly.impromptu("TtmlParser", "Ignoring non-pixel tts extent: " + strAttabal);
            return null;
        }
        try {
            return new saneness(Integer.parseInt((String) decarock.attabal.marial(matcher.group(1))), Integer.parseInt((String) decarock.attabal.marial(matcher.group(2))));
        } catch (NumberFormatException unused) {
            triweekly.impromptu("TtmlParser", "Ignoring malformed tts extent: " + strAttabal);
            return null;
        }
    }

    public static attabal taiyuan(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrOsteal = grimness.osteal(attributeValue2, " ");
            decarock.attabal.saneness(strArrOsteal.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f = Integer.parseInt(strArrOsteal[0]) / Integer.parseInt(strArrOsteal[1]);
        } else {
            f = 1.0f;
        }
        attabal attabalVar = f36996taiyuan;
        int i2 = attabalVar.f37001saneness;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = attabalVar.f37000dern;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new attabal(i * f, i2, i3);
    }

    public static float triweekly(String str) {
        Matcher matcher = f36994marial.matcher(str);
        if (!matcher.matches()) {
            triweekly.impromptu("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) decarock.attabal.marial(matcher.group(1)))));
        } catch (NumberFormatException e) {
            triweekly.taiyuan("TtmlParser", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    public static competently wireman(competently competentlyVar) {
        return competentlyVar == null ? new competently() : competentlyVar;
    }

    @Override // strother.polloi
    public apical attabal(byte[] bArr, int i, int i2) {
        char c;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f36998attabal.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new marial(""));
            impromptu impromptuVar = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = 0;
            int iCompetently = 15;
            attabal attabalVarTaiyuan = f36996taiyuan;
            saneness sanenessVarPolloi = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                dern dernVar = (dern) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            attabalVarTaiyuan = taiyuan(xmlPullParserNewPullParser);
                            c = 15;
                            iCompetently = competently(xmlPullParserNewPullParser, 15);
                            sanenessVarPolloi = polloi(xmlPullParserNewPullParser);
                        } else {
                            c = 15;
                        }
                        attabal attabalVar = attabalVarTaiyuan;
                        saneness sanenessVar = sanenessVarPolloi;
                        int i4 = iCompetently;
                        if (marial(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                cutely(xmlPullParserNewPullParser, map, i4, sanenessVar, map2, map3);
                            } else {
                                try {
                                    dern dernVarFormularize = formularize(xmlPullParserNewPullParser, dernVar, map2, attabalVar);
                                    arrayDeque.push(dernVarFormularize);
                                    if (dernVar != null) {
                                        dernVar.attabal(dernVarFormularize);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    triweekly.taiyuan("TtmlParser", "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            iCompetently = i4;
                            sanenessVarPolloi = sanenessVar;
                            attabalVarTaiyuan = attabalVar;
                        } else {
                            triweekly.beachfront("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i3++;
                        iCompetently = i4;
                        sanenessVarPolloi = sanenessVar;
                        attabalVarTaiyuan = attabalVar;
                    } else {
                        c = 15;
                        if (eventType == 4) {
                            ((dern) decarock.attabal.marial(dernVar)).attabal(dern.wireman(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                impromptuVar = new impromptu((dern) decarock.attabal.marial((dern) arrayDeque.peek()), map, map2, map3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (apical) decarock.attabal.marial(impromptuVar);
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    @Override // strother.polloi
    public int dern() {
        return 1;
    }

    @Override // strother.polloi
    public void saneness(byte[] bArr, int i, int i2, polloi.saneness sanenessVar, decarock.impromptu<strother.marial> impromptuVar) {
        taiyuan.dern(attabal(bArr, i, i2), sanenessVar, impromptuVar);
    }
}
