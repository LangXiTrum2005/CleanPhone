package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.o1.b;
import com.smartdigimkt.x.d;
import com.thinkup.core.common.n.mo;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class TtmlParser implements SubtitleParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f7364b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f7365c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f7366e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f7367h = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FrameAndTickRate f7368i = new FrameAndTickRate(30.0f, 1, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f7369a;

    public static final class FrameAndTickRate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f7370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7372c;

        public FrameAndTickRate(float f, int i2, int i3) {
            this.f7370a = f;
            this.f7371b = i2;
            this.f7372c = i3;
        }
    }

    public static final class TtsExtent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7374b;

        public TtsExtent(int i2, int i3) {
            this.f7373a = i2;
            this.f7374b = i3;
        }
    }

    public TtmlParser() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f7369a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static TtmlStyle d(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    public static boolean e(String str) {
        return str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_TT) || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_DIV) || str.equals("p") || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_SPAN) || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_BR) || str.equals("style") || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_STYLING) || str.equals("layout") || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_REGION) || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA) || str.equals(d.c.k) || str.equals("data") || str.equals("information");
    }

    public static int f(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f7367h.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.g("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z2 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i3 = Integer.parseInt(strGroup2);
            if (i2 == 0 || i3 == 0) {
                z2 = false;
            }
            Assertions.a("Invalid cell resolution " + i2 + " " + i3, z2);
            return i3;
        } catch (NumberFormatException unused) {
            Log.g("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void g(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        int i2 = Util.f5683a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(android.support.v4.media.a.i(strArrSplit.length, mo.ono, new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            Log.g("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(android.support.v4.media.a.n("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                ttmlStyle.j = 3;
                break;
            case "em":
                ttmlStyle.j = 2;
                break;
            case "px":
                ttmlStyle.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(android.support.v4.media.a.n("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        ttmlStyle.k = Float.parseFloat(strGroup2);
    }

    public static FrameAndTickRate h(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i3 = Util.f5683a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            Assertions.a("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f2 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f2 = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = f7368i;
        int i4 = frameAndTickRate.f7371b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i4 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new FrameAndTickRate(i2 * f2, i4, attributeValue4 != null ? Integer.parseInt(attributeValue4) : frameAndTickRate.f7372c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x0254 A[LOOP:0: B:3:0x000a->B:105:0x0254, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0122  */
    /* JADX WARN: Code duplicated, block: B:47:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x015d  */
    /* JADX WARN: Code duplicated, block: B:55:0x016c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175  */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0184  */
    /* JADX WARN: Code duplicated, block: B:63:0x0196  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01af  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f4  */
    public static void i(XmlPullParser xmlPullParser, HashMap map, int i2, TtsExtent ttsExtent, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strA;
        float f2;
        float f3;
        String strA2;
        Matcher matcher;
        Matcher matcher2;
        float f4;
        float f5;
        float f6;
        String strA3;
        float f7;
        int i3;
        String strA4;
        int i4;
        String strB;
        String strB2;
        String[] strArrSplit;
        int i5 = -1;
        int i6 = 0;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.c(xmlPullParser, "style")) {
                String strA5 = XmlPullParserUtil.a(xmlPullParser, "style");
                TtmlStyle ttmlStyleK = k(xmlPullParser, new TtmlStyle());
                if (strA5 != null) {
                    String strTrim = strA5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[i6];
                    } else {
                        int i7 = Util.f5683a;
                        strArrSplit = strTrim.split("\\s+", i5);
                    }
                    int length = strArrSplit.length;
                    for (int i8 = i6; i8 < length; i8++) {
                        ttmlStyleK.a((TtmlStyle) map.get(strArrSplit[i8]));
                    }
                }
                String str = ttmlStyleK.f7387l;
                if (str != null) {
                    map.put(str, ttmlStyleK);
                }
            } else {
                if (XmlPullParserUtil.c(xmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_REGION)) {
                    String strA6 = XmlPullParserUtil.a(xmlPullParser, "id");
                    TtmlRegion ttmlRegion = null;
                    if (strA6 != null) {
                        String strA7 = XmlPullParserUtil.a(xmlPullParser, "origin");
                        if (strA7 != null) {
                            Pattern pattern = f;
                            Matcher matcher3 = pattern.matcher(strA7);
                            Pattern pattern2 = g;
                            Matcher matcher4 = pattern2.matcher(strA7);
                            if (matcher3.matches()) {
                                try {
                                    String strGroup = matcher3.group(1);
                                    strGroup.getClass();
                                    f2 = Float.parseFloat(strGroup) / 100.0f;
                                    String strGroup2 = matcher3.group(2);
                                    strGroup2.getClass();
                                    f3 = Float.parseFloat(strGroup2) / 100.0f;
                                    strA2 = XmlPullParserUtil.a(xmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                                    if (strA2 != null) {
                                        matcher = pattern.matcher(strA2);
                                        matcher2 = pattern2.matcher(strA2);
                                        if (matcher.matches()) {
                                            try {
                                                String strGroup3 = matcher.group(1);
                                                strGroup3.getClass();
                                                f4 = Float.parseFloat(strGroup3) / 100.0f;
                                                String strGroup4 = matcher.group(2);
                                                strGroup4.getClass();
                                                f5 = Float.parseFloat(strGroup4) / 100.0f;
                                                float f8 = f4;
                                                f6 = f5;
                                                strA3 = XmlPullParserUtil.a(xmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                if (strA3 != null) {
                                                    strB2 = Ascii.b(strA3);
                                                    strB2.getClass();
                                                    if (!strB2.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.CENTER)) {
                                                        f7 = f3 + (f6 / 2.0f);
                                                        i3 = 1;
                                                    } else if (strB2.equals("after")) {
                                                        f7 = f3 + f6;
                                                        i3 = 2;
                                                    } else {
                                                        f7 = f3;
                                                        i3 = 0;
                                                    }
                                                } else {
                                                    f7 = f3;
                                                    i3 = 0;
                                                }
                                                float f9 = 1.0f / i2;
                                                strA4 = XmlPullParserUtil.a(xmlPullParser, "writingMode");
                                                if (strA4 != null) {
                                                    strB = Ascii.b(strA4);
                                                    strB.getClass();
                                                    switch (strB) {
                                                        case "tb":
                                                        case "tblr":
                                                            i4 = 2;
                                                            break;
                                                        case "tbrl":
                                                            i4 = 1;
                                                            break;
                                                        default:
                                                            i4 = Integer.MIN_VALUE;
                                                            break;
                                                    }
                                                } else {
                                                    i4 = Integer.MIN_VALUE;
                                                }
                                                ttmlRegion = new TtmlRegion(strA6, f2, f7, 0, i3, f8, f6, 1, f9, i4);
                                            } catch (NumberFormatException unused) {
                                                Log.g("TtmlParser", "Ignoring region with malformed extent: ".concat(strA7));
                                            }
                                        } else if (matcher2.matches()) {
                                            Log.g("TtmlParser", "Ignoring region with unsupported extent: ".concat(strA7));
                                        } else if (ttsExtent == null) {
                                            Log.g("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strA7));
                                        } else {
                                            try {
                                                String strGroup5 = matcher2.group(1);
                                                strGroup5.getClass();
                                                int i9 = Integer.parseInt(strGroup5);
                                                String strGroup6 = matcher2.group(2);
                                                strGroup6.getClass();
                                                int i10 = Integer.parseInt(strGroup6);
                                                f4 = i9 / ttsExtent.f7373a;
                                                f5 = i10 / ttsExtent.f7374b;
                                                float f10 = f4;
                                                f6 = f5;
                                                strA3 = XmlPullParserUtil.a(xmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                if (strA3 != null) {
                                                    strB2 = Ascii.b(strA3);
                                                    strB2.getClass();
                                                    if (!strB2.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.CENTER)) {
                                                        f7 = f3 + (f6 / 2.0f);
                                                        i3 = 1;
                                                    } else if (strB2.equals("after")) {
                                                        f7 = f3;
                                                        i3 = 0;
                                                    } else {
                                                        f7 = f3 + f6;
                                                        i3 = 2;
                                                    }
                                                } else {
                                                    f7 = f3;
                                                    i3 = 0;
                                                }
                                                float f11 = 1.0f / i2;
                                                strA4 = XmlPullParserUtil.a(xmlPullParser, "writingMode");
                                                if (strA4 != null) {
                                                    strB = Ascii.b(strA4);
                                                    strB.getClass();
                                                    switch (strB) {
                                                        case 3694:
                                                            if (!strB.equals("tb")) {
                                                            }
                                                            break;
                                                        case 3553396:
                                                            if (!strB.equals("tblr")) {
                                                            }
                                                            break;
                                                        case 3553576:
                                                            if (!strB.equals("tbrl")) {
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    /*  JADX ERROR: Method code generation error
                                                        java.lang.NullPointerException: Switch insn not found in header
                                                        	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                                                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                                                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                                                        */
                                                    /*
                                                        Method dump skipped, instruction units count: 624
                                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.i(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, androidx.media3.extractor.text.ttml.TtmlParser$TtsExtent, java.util.HashMap, java.util.HashMap):void");
                                                }

                                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                                /* JADX WARN: Code duplicated, block: B:6:0x0037  */
                                                public static TtmlNode j(XmlPullParser xmlPullParser, TtmlNode ttmlNode, HashMap map, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
                                                    byte b2;
                                                    String[] strArrSplit;
                                                    int attributeCount = xmlPullParser.getAttributeCount();
                                                    String strSubstring = null;
                                                    TtmlStyle ttmlStyleK = k(xmlPullParser, null);
                                                    long j = -9223372036854775807L;
                                                    long jL = -9223372036854775807L;
                                                    long jL2 = -9223372036854775807L;
                                                    long jL3 = -9223372036854775807L;
                                                    String[] strArr = null;
                                                    String str = "";
                                                    int i2 = 0;
                                                    while (i2 < attributeCount) {
                                                        long j2 = j;
                                                        String attributeName = xmlPullParser.getAttributeName(i2);
                                                        String attributeValue = xmlPullParser.getAttributeValue(i2);
                                                        attributeName.getClass();
                                                        switch (attributeName) {
                                                            case "region":
                                                                if (!map.containsKey(attributeValue)) {
                                                                    break;
                                                                } else {
                                                                    str = attributeValue;
                                                                    break;
                                                                }
                                                                break;
                                                            case "dur":
                                                                jL3 = l(attributeValue, frameAndTickRate);
                                                                break;
                                                            case "end":
                                                                jL2 = l(attributeValue, frameAndTickRate);
                                                                break;
                                                            case "begin":
                                                                jL = l(attributeValue, frameAndTickRate);
                                                                break;
                                                            case "style":
                                                                String strTrim = attributeValue.trim();
                                                                if (strTrim.isEmpty()) {
                                                                    strArrSplit = new String[0];
                                                                    b2 = -1;
                                                                } else {
                                                                    int i3 = Util.f5683a;
                                                                    b2 = -1;
                                                                    strArrSplit = strTrim.split("\\s+", -1);
                                                                }
                                                                if (strArrSplit.length <= 0) {
                                                                    break;
                                                                } else {
                                                                    strArr = strArrSplit;
                                                                    break;
                                                                }
                                                                break;
                                                            case "backgroundImage":
                                                                if (attributeValue.startsWith("#")) {
                                                                    strSubstring = attributeValue.substring(1);
                                                                    break;
                                                                }
                                                            default:
                                                                break;
                                                        }
                                                        i2++;
                                                        j = j2;
                                                    }
                                                    long j3 = j;
                                                    if (ttmlNode != null) {
                                                        long j4 = ttmlNode.d;
                                                        if (j4 != j3) {
                                                            if (jL != j3) {
                                                                jL += j4;
                                                            }
                                                            if (jL2 != j3) {
                                                                jL2 += j4;
                                                            }
                                                        }
                                                    }
                                                    long j5 = jL;
                                                    if (jL2 == j3) {
                                                        if (jL3 != j3) {
                                                            jL2 = j5 + jL3;
                                                        } else if (ttmlNode != null) {
                                                            long j6 = ttmlNode.f7360e;
                                                            if (j6 != j3) {
                                                                jL2 = j6;
                                                            }
                                                        }
                                                    }
                                                    return new TtmlNode(xmlPullParser.getName(), null, j5, jL2, ttmlStyleK, strArr, str, strSubstring, ttmlNode);
                                                }

                                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                                /* JADX WARN: Code duplicated, block: B:114:0x0195  */
                                                /* JADX WARN: Code duplicated, block: B:134:0x01f2  */
                                                /* JADX WARN: Code duplicated, block: B:171:0x02a1  */
                                                /* JADX WARN: Code duplicated, block: B:173:0x02a6  */
                                                /* JADX WARN: Code duplicated, block: B:179:0x02b6  */
                                                /* JADX WARN: Code duplicated, block: B:181:0x02be  */
                                                /* JADX WARN: Code duplicated, block: B:182:0x02c0  */
                                                /* JADX WARN: Code duplicated, block: B:184:0x02c6  */
                                                /* JADX WARN: Code duplicated, block: B:185:0x02c8  */
                                                /* JADX WARN: Code duplicated, block: B:187:0x02cb  */
                                                /* JADX WARN: Code duplicated, block: B:189:0x02ce  */
                                                /* JADX WARN: Code duplicated, block: B:190:0x02d0  */
                                                /* JADX WARN: Code duplicated, block: B:191:0x02d2  */
                                                /* JADX WARN: Code duplicated, block: B:6:0x0031  */
                                                /* JADX WARN: Code duplicated, block: B:71:0x0109  */
                                                /* JADX WARN: Switch 'out' block B:197:0x02ea for B:246:0x03db already processed. Defaulting to fallback option. */
                                                public static TtmlStyle k(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
                                                    byte b2;
                                                    String str;
                                                    int iHashCode;
                                                    byte b3;
                                                    int i2;
                                                    TextEmphasis textEmphasis;
                                                    XmlPullParser xmlPullParser2 = xmlPullParser;
                                                    String str2 = "after";
                                                    int attributeCount = xmlPullParser2.getAttributeCount();
                                                    TtmlStyle ttmlStyleD = ttmlStyle;
                                                    int i3 = 0;
                                                    while (i3 < attributeCount) {
                                                        String attributeValue = xmlPullParser2.getAttributeValue(i3);
                                                        String attributeName = xmlPullParser2.getAttributeName(i3);
                                                        attributeName.getClass();
                                                        Layout.Alignment alignment = null;
                                                        switch (attributeName) {
                                                            case "fontStyle":
                                                                str2 = str2;
                                                                ttmlStyleD = d(ttmlStyleD);
                                                                ttmlStyleD.f7386i = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                                break;
                                                            case "fontFamily":
                                                                str2 = str2;
                                                                ttmlStyleD = d(ttmlStyleD);
                                                                ttmlStyleD.f7381a = attributeValue;
                                                                break;
                                                            case "textAlign":
                                                                str2 = str2;
                                                                ttmlStyleD = d(ttmlStyleD);
                                                                String strB = Ascii.b(attributeValue);
                                                                strB.getClass();
                                                                switch (strB) {
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
                                                                ttmlStyleD.o = alignment;
                                                                break;
                                                            case "textDecoration":
                                                                str2 = str2;
                                                                String strB2 = Ascii.b(attributeValue);
                                                                strB2.getClass();
                                                                switch (strB2) {
                                                                    case "nounderline":
                                                                        ttmlStyleD = d(ttmlStyleD);
                                                                        ttmlStyleD.g = 0;
                                                                        break;
                                                                    case "underline":
                                                                        ttmlStyleD = d(ttmlStyleD);
                                                                        ttmlStyleD.g = 1;
                                                                        break;
                                                                    case "nolinethrough":
                                                                        ttmlStyleD = d(ttmlStyleD);
                                                                        ttmlStyleD.f = 0;
                                                                        break;
                                                                    case "linethrough":
                                                                        ttmlStyleD = d(ttmlStyleD);
                                                                        ttmlStyleD.f = 1;
                                                                    default:
                                                                        break;
                                                                }
                                                                break;
                                                            case "fontWeight":
                                                                str2 = str2;
                                                                ttmlStyleD = d(ttmlStyleD);
                                                                ttmlStyleD.f7385h = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.BOLD.equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                                break;
                                                            case "id":
                                                                str2 = str2;
                                                                if ("style".equals(xmlPullParser.getName())) {
                                                                    ttmlStyleD = d(ttmlStyleD);
                                                                    ttmlStyleD.f7387l = attributeValue;
                                                                }
                                                                break;
                                                            case "ruby":
                                                                str2 = str2;
                                                                String strB3 = Ascii.b(attributeValue);
                                                                strB3.getClass();
                                                                switch (strB3) {
                                                                    case "baseContainer":
                                                                    case "base":
                                                                        ttmlStyleD = d(ttmlStyleD);
                                                                        ttmlStyleD.m = 2;
                                                                        break;
                                                                    case "container":
                                                                        ttmlStyleD = d(ttmlStyleD);
                                                                        ttmlStyleD.m = 1;
                                                                        break;
                                                                    case "delimiter":
                                                                        ttmlStyleD = d(ttmlStyleD);
                                                                        ttmlStyleD.m = 4;
                                                                        break;
                                                                    case "textContainer":
                                                                    case "text":
                                                                        ttmlStyleD = d(ttmlStyleD);
                                                                        ttmlStyleD.m = 3;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                break;
                                                            case "color":
                                                                str2 = str2;
                                                                ttmlStyleD = d(ttmlStyleD);
                                                                try {
                                                                    ttmlStyleD.f7382b = ColorParser.a(attributeValue, false);
                                                                    ttmlStyleD.f7383c = true;
                                                                    break;
                                                                } catch (IllegalArgumentException unused) {
                                                                    androidx.datastore.preferences.protobuf.a.D("Failed parsing color value: ", attributeValue, "TtmlParser");
                                                                }
                                                                break;
                                                            case "shear":
                                                                str2 = str2;
                                                                TtmlStyle ttmlStyleD2 = d(ttmlStyleD);
                                                                Matcher matcher = f7366e.matcher(attributeValue);
                                                                float fMin = Float.MAX_VALUE;
                                                                if (matcher.matches()) {
                                                                    try {
                                                                        String strGroup = matcher.group(1);
                                                                        strGroup.getClass();
                                                                        fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                                    } catch (NumberFormatException e2) {
                                                                        Log.h("TtmlParser", "Failed to parse shear: " + attributeValue, e2);
                                                                    }
                                                                    break;
                                                                } else {
                                                                    androidx.datastore.preferences.protobuf.a.D("Invalid value for shear: ", attributeValue, "TtmlParser");
                                                                }
                                                                ttmlStyleD2.s = fMin;
                                                                ttmlStyleD = ttmlStyleD2;
                                                                break;
                                                            case "textCombine":
                                                                str2 = str2;
                                                                String strB4 = Ascii.b(attributeValue);
                                                                strB4.getClass();
                                                                if (strB4.equals("all")) {
                                                                    ttmlStyleD = d(ttmlStyleD);
                                                                    ttmlStyleD.q = 1;
                                                                } else if (strB4.equals("none")) {
                                                                    ttmlStyleD = d(ttmlStyleD);
                                                                    ttmlStyleD.q = 0;
                                                                }
                                                                break;
                                                            case "fontSize":
                                                                str2 = str2;
                                                                try {
                                                                    ttmlStyleD = d(ttmlStyleD);
                                                                    g(attributeValue, ttmlStyleD);
                                                                    break;
                                                                } catch (SubtitleDecoderException unused2) {
                                                                    androidx.datastore.preferences.protobuf.a.D("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                                                                }
                                                                break;
                                                            case "textEmphasis":
                                                                ttmlStyleD = d(ttmlStyleD);
                                                                Pattern pattern = TextEmphasis.d;
                                                                if (attributeValue == null) {
                                                                    textEmphasis = null;
                                                                } else {
                                                                    String strB5 = Ascii.b(attributeValue.trim());
                                                                    if (strB5.isEmpty()) {
                                                                        textEmphasis = null;
                                                                    } else {
                                                                        ImmutableSet immutableSetV = ImmutableSet.v(TextUtils.split(strB5, TextEmphasis.d));
                                                                        String str3 = (String) Iterators.h(Sets.f(TextEmphasis.f7353h, immutableSetV).iterator(), "outside");
                                                                        int iHashCode2 = str3.hashCode();
                                                                        if (iHashCode2 != -1392885889) {
                                                                            if (iHashCode2 != -1106037339) {
                                                                                if (iHashCode2 == 92734940 && str3.equals(str2)) {
                                                                                    b2 = 0;
                                                                                } else {
                                                                                    b2 = -1;
                                                                                }
                                                                            } else if (str3.equals("outside")) {
                                                                                b2 = 1;
                                                                            } else {
                                                                                b2 = -1;
                                                                            }
                                                                        } else if (str3.equals("before")) {
                                                                            b2 = 2;
                                                                        } else {
                                                                            b2 = -1;
                                                                        }
                                                                        int i4 = b2 != 0 ? b2 != 1 ? 1 : -2 : 2;
                                                                        Sets.SetView setViewF = Sets.f(TextEmphasis.f7352e, immutableSetV);
                                                                        if (setViewF.isEmpty()) {
                                                                            Sets.SetView setViewF2 = Sets.f(TextEmphasis.g, immutableSetV);
                                                                            Sets.SetView setViewF3 = Sets.f(TextEmphasis.f, immutableSetV);
                                                                            if (setViewF2.isEmpty() && setViewF3.isEmpty()) {
                                                                                textEmphasis = new TextEmphasis(-1, 0, i4);
                                                                            } else {
                                                                                String str4 = (String) Iterators.h(setViewF2.iterator(), "filled");
                                                                                int iHashCode3 = str4.hashCode();
                                                                                if (iHashCode3 != -1274499742) {
                                                                                    int i5 = (iHashCode3 == 3417674 && str4.equals(MRAIDPresenter.OPEN)) ? 2 : 1;
                                                                                    str = (String) Iterators.h(setViewF3.iterator(), "circle");
                                                                                    iHashCode = str.hashCode();
                                                                                    if (iHashCode != -1360216880) {
                                                                                        if (iHashCode != -905816648) {
                                                                                            if (iHashCode != 99657 && str.equals("dot")) {
                                                                                                b3 = 0;
                                                                                            } else {
                                                                                                b3 = -1;
                                                                                            }
                                                                                        } else if (str.equals("sesame")) {
                                                                                            b3 = 1;
                                                                                        } else {
                                                                                            b3 = -1;
                                                                                        }
                                                                                    } else if (str.equals("circle")) {
                                                                                        b3 = 2;
                                                                                    } else {
                                                                                        b3 = -1;
                                                                                    }
                                                                                    if (b3 != 0) {
                                                                                        i2 = 2;
                                                                                    } else if (b3 != 1) {
                                                                                        i2 = 1;
                                                                                    } else {
                                                                                        i2 = 3;
                                                                                    }
                                                                                    textEmphasis = new TextEmphasis(i2, i5, i4);
                                                                                } else {
                                                                                    str4.equals("filled");
                                                                                }
                                                                                str = (String) Iterators.h(setViewF3.iterator(), "circle");
                                                                                iHashCode = str.hashCode();
                                                                                if (iHashCode != -1360216880) {
                                                                                    if (iHashCode != -905816648) {
                                                                                        if (iHashCode != 99657) {
                                                                                            b3 = -1;
                                                                                        } else {
                                                                                            b3 = 0;
                                                                                        }
                                                                                    } else if (str.equals("sesame")) {
                                                                                        b3 = 1;
                                                                                    } else {
                                                                                        b3 = -1;
                                                                                    }
                                                                                } else if (str.equals("circle")) {
                                                                                    b3 = 2;
                                                                                } else {
                                                                                    b3 = -1;
                                                                                }
                                                                                if (b3 != 0) {
                                                                                    i2 = 2;
                                                                                } else if (b3 != 1) {
                                                                                    i2 = 1;
                                                                                } else {
                                                                                    i2 = 3;
                                                                                }
                                                                                textEmphasis = new TextEmphasis(i2, i5, i4);
                                                                            }
                                                                        } else {
                                                                            String str5 = (String) setViewF.iterator().next();
                                                                            int iHashCode4 = str5.hashCode();
                                                                            if (iHashCode4 != 3005871) {
                                                                                int i6 = (iHashCode4 == 3387192 && str5.equals("none")) ? 0 : -1;
                                                                                textEmphasis = new TextEmphasis(i6, 0, i4);
                                                                            } else {
                                                                                str5.equals("auto");
                                                                            }
                                                                            textEmphasis = new TextEmphasis(i6, 0, i4);
                                                                        }
                                                                    }
                                                                }
                                                                ttmlStyleD.r = textEmphasis;
                                                                break;
                                                            case "rubyPosition":
                                                                String strB6 = Ascii.b(attributeValue);
                                                                strB6.getClass();
                                                                if (strB6.equals("before")) {
                                                                    ttmlStyleD = d(ttmlStyleD);
                                                                    ttmlStyleD.f7388n = 1;
                                                                } else if (strB6.equals(str2)) {
                                                                    ttmlStyleD = d(ttmlStyleD);
                                                                    ttmlStyleD.f7388n = 2;
                                                                }
                                                                str2 = str2;
                                                                break;
                                                            case "backgroundColor":
                                                                ttmlStyleD = d(ttmlStyleD);
                                                                try {
                                                                    ttmlStyleD.d = ColorParser.a(attributeValue, false);
                                                                    ttmlStyleD.f7384e = true;
                                                                    break;
                                                                } catch (IllegalArgumentException unused3) {
                                                                    androidx.datastore.preferences.protobuf.a.D("Failed parsing background value: ", attributeValue, "TtmlParser");
                                                                }
                                                                str2 = str2;
                                                                break;
                                                            case "multiRowAlign":
                                                                ttmlStyleD = d(ttmlStyleD);
                                                                String strB7 = Ascii.b(attributeValue);
                                                                strB7.getClass();
                                                                switch (strB7) {
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
                                                                ttmlStyleD.f7389p = alignment;
                                                                str2 = str2;
                                                                break;
                                                            default:
                                                                str2 = str2;
                                                                break;
                                                        }
                                                        i3++;
                                                        xmlPullParser2 = xmlPullParser;
                                                        str2 = str2;
                                                    }
                                                    return ttmlStyleD;
                                                }

                                                public static long l(String str, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
                                                    double d2;
                                                    double d3;
                                                    byte b2 = 4;
                                                    Matcher matcher = f7364b.matcher(str);
                                                    if (matcher.matches()) {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        double d4 = Long.parseLong(strGroup) * b.f37307P;
                                                        String strGroup2 = matcher.group(2);
                                                        strGroup2.getClass();
                                                        double d5 = d4 + (Long.parseLong(strGroup2) * 60);
                                                        String strGroup3 = matcher.group(3);
                                                        strGroup3.getClass();
                                                        double d6 = d5 + Long.parseLong(strGroup3);
                                                        String strGroup4 = matcher.group(4);
                                                        double d7 = d6 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                                        String strGroup5 = matcher.group(5);
                                                        double d8 = d7 + (strGroup5 != null ? Long.parseLong(strGroup5) / frameAndTickRate.f7370a : 0.0d);
                                                        String strGroup6 = matcher.group(6);
                                                        return (long) ((d8 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) frameAndTickRate.f7371b)) / ((double) frameAndTickRate.f7370a) : 0.0d)) * 1000000.0d);
                                                    }
                                                    Matcher matcher2 = f7365c.matcher(str);
                                                    if (!matcher2.matches()) {
                                                        throw new SubtitleDecoderException(android.support.v4.media.a.C("Malformed time expression: ", str));
                                                    }
                                                    String strGroup7 = matcher2.group(1);
                                                    strGroup7.getClass();
                                                    double d9 = Double.parseDouble(strGroup7);
                                                    String strGroup8 = matcher2.group(2);
                                                    strGroup8.getClass();
                                                    switch (strGroup8.hashCode()) {
                                                        case 102:
                                                            b2 = !strGroup8.equals(f.j) ? (byte) -1 : (byte) 0;
                                                            break;
                                                        case 104:
                                                            b2 = !strGroup8.equals(h.f36614b) ? (byte) -1 : (byte) 1;
                                                            break;
                                                        case 109:
                                                            b2 = !strGroup8.equals("m") ? (byte) -1 : (byte) 2;
                                                            break;
                                                        case 116:
                                                            b2 = !strGroup8.equals("t") ? (byte) -1 : (byte) 3;
                                                            break;
                                                        case 3494:
                                                            if (!strGroup8.equals("ms")) {
                                                                b2 = -1;
                                                            }
                                                            break;
                                                        default:
                                                            b2 = -1;
                                                            break;
                                                    }
                                                    switch (b2) {
                                                        case 0:
                                                            d2 = frameAndTickRate.f7370a;
                                                            d9 /= d2;
                                                            return (long) (d9 * 1000000.0d);
                                                        case 1:
                                                            d3 = 3600.0d;
                                                            break;
                                                        case 2:
                                                            d3 = 60.0d;
                                                            break;
                                                        case 3:
                                                            d2 = frameAndTickRate.f7372c;
                                                            d9 /= d2;
                                                            return (long) (d9 * 1000000.0d);
                                                        case 4:
                                                            d2 = 1000.0d;
                                                            d9 /= d2;
                                                            return (long) (d9 * 1000000.0d);
                                                        default:
                                                            return (long) (d9 * 1000000.0d);
                                                    }
                                                    d9 *= d3;
                                                    return (long) (d9 * 1000000.0d);
                                                }

                                                public static TtsExtent m(XmlPullParser xmlPullParser) {
                                                    String strA = XmlPullParserUtil.a(xmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                                                    if (strA == null) {
                                                        return null;
                                                    }
                                                    Matcher matcher = g.matcher(strA);
                                                    if (!matcher.matches()) {
                                                        Log.g("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strA));
                                                        return null;
                                                    }
                                                    try {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        int i2 = Integer.parseInt(strGroup);
                                                        String strGroup2 = matcher.group(2);
                                                        strGroup2.getClass();
                                                        return new TtsExtent(i2, Integer.parseInt(strGroup2));
                                                    } catch (NumberFormatException unused) {
                                                        Log.g("TtmlParser", "Ignoring malformed tts extent: ".concat(strA));
                                                        return null;
                                                    }
                                                }

                                                @Override // androidx.media3.extractor.text.SubtitleParser
                                                public final void a(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
                                                    LegacySubtitleUtil.b(b(i2, i3, bArr), outputOptions, consumer);
                                                }

                                                @Override // androidx.media3.extractor.text.SubtitleParser
                                                public final Subtitle b(int i2, int i3, byte[] bArr) {
                                                    try {
                                                        XmlPullParser xmlPullParserNewPullParser = this.f7369a.newPullParser();
                                                        HashMap map = new HashMap();
                                                        HashMap map2 = new HashMap();
                                                        HashMap map3 = new HashMap();
                                                        map2.put("", new TtmlRegion("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                                        TtsExtent ttsExtentM = null;
                                                        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
                                                        ArrayDeque arrayDeque = new ArrayDeque();
                                                        FrameAndTickRate frameAndTickRateH = f7368i;
                                                        int i4 = 0;
                                                        int iF = 15;
                                                        TtmlSubtitle ttmlSubtitle = null;
                                                        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                            TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                                                            if (i4 == 0) {
                                                                String name = xmlPullParserNewPullParser.getName();
                                                                if (eventType == 2) {
                                                                    if (com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_TT.equals(name)) {
                                                                        frameAndTickRateH = h(xmlPullParserNewPullParser);
                                                                        iF = f(xmlPullParserNewPullParser);
                                                                        ttsExtentM = m(xmlPullParserNewPullParser);
                                                                    }
                                                                    FrameAndTickRate frameAndTickRate = frameAndTickRateH;
                                                                    TtsExtent ttsExtent = ttsExtentM;
                                                                    int i5 = iF;
                                                                    if (e(name)) {
                                                                        if (com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD.equals(name)) {
                                                                            i(xmlPullParserNewPullParser, map, i5, ttsExtent, map2, map3);
                                                                        } else {
                                                                            try {
                                                                                TtmlNode ttmlNodeJ = j(xmlPullParserNewPullParser, ttmlNode, map2, frameAndTickRate);
                                                                                arrayDeque.push(ttmlNodeJ);
                                                                                if (ttmlNode != null) {
                                                                                    if (ttmlNode.m == null) {
                                                                                        ttmlNode.m = new ArrayList();
                                                                                    }
                                                                                    ttmlNode.m.add(ttmlNodeJ);
                                                                                }
                                                                            } catch (SubtitleDecoderException e2) {
                                                                                Log.h("TtmlParser", "Suppressing parser error", e2);
                                                                                i4++;
                                                                            }
                                                                        }
                                                                        iF = i5;
                                                                        ttsExtentM = ttsExtent;
                                                                        frameAndTickRateH = frameAndTickRate;
                                                                    } else {
                                                                        Log.f("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                                                    }
                                                                    i4++;
                                                                    iF = i5;
                                                                    ttsExtentM = ttsExtent;
                                                                    frameAndTickRateH = frameAndTickRate;
                                                                } else if (eventType == 4) {
                                                                    ttmlNode.getClass();
                                                                    TtmlNode ttmlNodeA = TtmlNode.a(xmlPullParserNewPullParser.getText());
                                                                    if (ttmlNode.m == null) {
                                                                        ttmlNode.m = new ArrayList();
                                                                    }
                                                                    ttmlNode.m.add(ttmlNodeA);
                                                                } else if (eventType == 3) {
                                                                    if (xmlPullParserNewPullParser.getName().equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_TT)) {
                                                                        TtmlNode ttmlNode2 = (TtmlNode) arrayDeque.peek();
                                                                        ttmlNode2.getClass();
                                                                        ttmlSubtitle = new TtmlSubtitle(ttmlNode2, map, map2, map3);
                                                                    }
                                                                    arrayDeque.pop();
                                                                }
                                                            } else if (eventType == 2) {
                                                                i4++;
                                                            } else if (eventType == 3) {
                                                                i4--;
                                                            }
                                                            xmlPullParserNewPullParser.next();
                                                        }
                                                        ttmlSubtitle.getClass();
                                                        return ttmlSubtitle;
                                                    } catch (IOException e3) {
                                                        throw new IllegalStateException("Unexpected error when reading input.", e3);
                                                    } catch (XmlPullParserException e4) {
                                                        throw new IllegalStateException("Unable to decode source", e4);
                                                    }
                                                }

                                                @Override // androidx.media3.extractor.text.SubtitleParser
                                                public final int c() {
                                                    return 1;
                                                }
                                            }
