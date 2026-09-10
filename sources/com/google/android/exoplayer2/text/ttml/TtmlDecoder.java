package com.google.android.exoplayer2.text.ttml;

import android.support.v4.media.a;
import android.text.Layout;
import android.text.TextUtils;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
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

/* JADX INFO: loaded from: classes3.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f18594p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f18595u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern v = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final FrameAndTickRate f18596w = new FrameAndTickRate(30.0f, 1, 1);
    public static final CellResolution x = new CellResolution(15);
    public final XmlPullParserFactory o;

    public static final class CellResolution {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18597a;

        public CellResolution(int i2) {
            this.f18597a = i2;
        }
    }

    public static final class FrameAndTickRate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f18598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18600c;

        public FrameAndTickRate(float f, int i2, int i3) {
            this.f18598a = f;
            this.f18599b = i2;
            this.f18600c = i3;
        }
    }

    public static final class TtsExtent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18602b;

        public TtsExtent(int i2, int i3) {
            this.f18601a = i2;
            this.f18602b = i3;
        }
    }

    public TtmlDecoder() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static TtmlStyle f(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    public static boolean g(String str) {
        return str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_TT) || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_DIV) || str.equals("p") || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_SPAN) || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_BR) || str.equals("style") || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_STYLING) || str.equals("layout") || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_REGION) || str.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA) || str.equals(d.c.k) || str.equals("data") || str.equals("information");
    }

    public static CellResolution h(XmlPullParser xmlPullParser, CellResolution cellResolution) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return cellResolution;
        }
        Matcher matcher = v.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.g("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return cellResolution;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i3 = Integer.parseInt(strGroup2);
            if (i2 != 0 && i3 != 0) {
                return new CellResolution(i3);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + i2 + " " + i3);
        } catch (NumberFormatException unused) {
            Log.g("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return cellResolution;
        }
    }

    public static void i(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        int i2 = Util.f18979a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = r;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(a.i(strArrSplit.length, mo.ono, new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            Log.g("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(a.n("Invalid expression for fontSize: '", str, "'."));
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
                throw new SubtitleDecoderException(a.n("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        ttmlStyle.k = Float.parseFloat(strGroup2);
    }

    public static FrameAndTickRate j(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i3 = Util.f18979a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = f18596w;
        int i4 = frameAndTickRate.f18599b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i4 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new FrameAndTickRate(i2 * f, i4, attributeValue4 != null ? Integer.parseInt(attributeValue4) : frameAndTickRate.f18600c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x0264 A[LOOP:0: B:3:0x000a->B:106:0x0264, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x0124  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:54:0x015f  */
    /* JADX WARN: Code duplicated, block: B:56:0x016e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0177  */
    /* JADX WARN: Code duplicated, block: B:60:0x017f  */
    /* JADX WARN: Code duplicated, block: B:61:0x018a  */
    /* JADX WARN: Code duplicated, block: B:64:0x019e  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fc  */
    public static void k(XmlPullParser xmlPullParser, HashMap map, CellResolution cellResolution, TtsExtent ttsExtent, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strA;
        float f;
        float f2;
        String strA2;
        Matcher matcher;
        Matcher matcher2;
        float f3;
        float f4;
        float f5;
        String strA3;
        float f6;
        int i2;
        String strA4;
        int i3;
        String strB;
        String strB2;
        String[] strArrSplit;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.c(xmlPullParser, "style")) {
                String strA5 = XmlPullParserUtil.a(xmlPullParser, "style");
                TtmlStyle ttmlStyleM = m(xmlPullParser, new TtmlStyle());
                if (strA5 != null) {
                    String strTrim = strA5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[i5];
                    } else {
                        int i6 = Util.f18979a;
                        strArrSplit = strTrim.split("\\s+", i4);
                    }
                    int length = strArrSplit.length;
                    for (int i7 = i5; i7 < length; i7++) {
                        ttmlStyleM.a((TtmlStyle) map.get(strArrSplit[i7]));
                    }
                }
                String str = ttmlStyleM.f18622l;
                if (str != null) {
                    map.put(str, ttmlStyleM);
                }
            } else {
                if (XmlPullParserUtil.c(xmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_REGION)) {
                    String strA6 = XmlPullParserUtil.a(xmlPullParser, "id");
                    TtmlRegion ttmlRegion = null;
                    if (strA6 != null) {
                        String strA7 = XmlPullParserUtil.a(xmlPullParser, "origin");
                        if (strA7 != null) {
                            Pattern pattern = t;
                            Matcher matcher3 = pattern.matcher(strA7);
                            Pattern pattern2 = f18595u;
                            Matcher matcher4 = pattern2.matcher(strA7);
                            if (matcher3.matches()) {
                                try {
                                    String strGroup = matcher3.group(1);
                                    strGroup.getClass();
                                    f = Float.parseFloat(strGroup) / 100.0f;
                                    String strGroup2 = matcher3.group(2);
                                    strGroup2.getClass();
                                    f2 = Float.parseFloat(strGroup2) / 100.0f;
                                    strA2 = XmlPullParserUtil.a(xmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                                    if (strA2 != null) {
                                        matcher = pattern.matcher(strA2);
                                        matcher2 = pattern2.matcher(strA2);
                                        if (matcher.matches()) {
                                            try {
                                                String strGroup3 = matcher.group(1);
                                                strGroup3.getClass();
                                                f3 = Float.parseFloat(strGroup3) / 100.0f;
                                                String strGroup4 = matcher.group(2);
                                                strGroup4.getClass();
                                                f4 = Float.parseFloat(strGroup4) / 100.0f;
                                                float f7 = f3;
                                                f5 = f4;
                                                strA3 = XmlPullParserUtil.a(xmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                if (strA3 != null) {
                                                    strB2 = Ascii.b(strA3);
                                                    strB2.getClass();
                                                    if (!strB2.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.CENTER)) {
                                                        f6 = f2 + (f5 / 2.0f);
                                                        i2 = 1;
                                                    } else if (strB2.equals("after")) {
                                                        f6 = f2 + f5;
                                                        i2 = 2;
                                                    } else {
                                                        f6 = f2;
                                                        i2 = 0;
                                                    }
                                                } else {
                                                    f6 = f2;
                                                    i2 = 0;
                                                }
                                                float f8 = 1.0f / cellResolution.f18597a;
                                                strA4 = XmlPullParserUtil.a(xmlPullParser, "writingMode");
                                                if (strA4 != null) {
                                                    strB = Ascii.b(strA4);
                                                    strB.getClass();
                                                    switch (strB) {
                                                        case "tb":
                                                        case "tblr":
                                                            i3 = 2;
                                                            break;
                                                        case "tbrl":
                                                            i3 = 1;
                                                            break;
                                                        default:
                                                            i3 = Integer.MIN_VALUE;
                                                            break;
                                                    }
                                                } else {
                                                    i3 = Integer.MIN_VALUE;
                                                }
                                                ttmlRegion = new TtmlRegion(strA6, f, f6, 0, i2, f7, f5, 1, f8, i3);
                                            } catch (NumberFormatException unused) {
                                                Log.g("TtmlDecoder", "Ignoring region with malformed extent: ".concat(strA7));
                                            }
                                        } else if (matcher2.matches()) {
                                            Log.g("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(strA7));
                                        } else if (ttsExtent == null) {
                                            Log.g("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(strA7));
                                        } else {
                                            try {
                                                String strGroup5 = matcher2.group(1);
                                                strGroup5.getClass();
                                                int i8 = Integer.parseInt(strGroup5);
                                                String strGroup6 = matcher2.group(2);
                                                strGroup6.getClass();
                                                int i9 = Integer.parseInt(strGroup6);
                                                f3 = i8 / ttsExtent.f18601a;
                                                f4 = i9 / ttsExtent.f18602b;
                                                float f9 = f3;
                                                f5 = f4;
                                                strA3 = XmlPullParserUtil.a(xmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                if (strA3 != null) {
                                                    strB2 = Ascii.b(strA3);
                                                    strB2.getClass();
                                                    if (!strB2.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.CENTER)) {
                                                        f6 = f2 + (f5 / 2.0f);
                                                        i2 = 1;
                                                    } else if (strB2.equals("after")) {
                                                        f6 = f2;
                                                        i2 = 0;
                                                    } else {
                                                        f6 = f2 + f5;
                                                        i2 = 2;
                                                    }
                                                } else {
                                                    f6 = f2;
                                                    i2 = 0;
                                                }
                                                float f10 = 1.0f / cellResolution.f18597a;
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
                                                        Method dump skipped, instruction units count: 640
                                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlDecoder.k(org.xmlpull.v1.XmlPullParser, java.util.HashMap, com.google.android.exoplayer2.text.ttml.TtmlDecoder$CellResolution, com.google.android.exoplayer2.text.ttml.TtmlDecoder$TtsExtent, java.util.HashMap, java.util.HashMap):void");
                                                }

                                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                                /* JADX WARN: Code duplicated, block: B:6:0x0037  */
                                                public static TtmlNode l(XmlPullParser xmlPullParser, TtmlNode ttmlNode, HashMap map, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
                                                    byte b2;
                                                    String[] strArrSplit;
                                                    int attributeCount = xmlPullParser.getAttributeCount();
                                                    String strSubstring = null;
                                                    TtmlStyle ttmlStyleM = m(xmlPullParser, null);
                                                    long j = -9223372036854775807L;
                                                    long jN = -9223372036854775807L;
                                                    long jN2 = -9223372036854775807L;
                                                    long jN3 = -9223372036854775807L;
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
                                                                jN3 = n(attributeValue, frameAndTickRate);
                                                                break;
                                                            case "end":
                                                                jN2 = n(attributeValue, frameAndTickRate);
                                                                break;
                                                            case "begin":
                                                                jN = n(attributeValue, frameAndTickRate);
                                                                break;
                                                            case "style":
                                                                String strTrim = attributeValue.trim();
                                                                if (strTrim.isEmpty()) {
                                                                    strArrSplit = new String[0];
                                                                    b2 = -1;
                                                                } else {
                                                                    int i3 = Util.f18979a;
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
                                                            if (jN != j3) {
                                                                jN += j4;
                                                            }
                                                            if (jN2 != j3) {
                                                                jN2 += j4;
                                                            }
                                                        }
                                                    }
                                                    long j5 = jN;
                                                    if (jN2 == j3) {
                                                        if (jN3 != j3) {
                                                            jN2 = j5 + jN3;
                                                        } else if (ttmlNode != null) {
                                                            long j6 = ttmlNode.f18606e;
                                                            if (j6 != j3) {
                                                                jN2 = j6;
                                                            }
                                                        }
                                                    }
                                                    return new TtmlNode(xmlPullParser.getName(), null, j5, jN2, ttmlStyleM, strArr, str, strSubstring, ttmlNode);
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
                                                public static TtmlStyle m(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
                                                    byte b2;
                                                    String str;
                                                    int iHashCode;
                                                    byte b3;
                                                    int i2;
                                                    TextEmphasis textEmphasis;
                                                    XmlPullParser xmlPullParser2 = xmlPullParser;
                                                    String str2 = "after";
                                                    int attributeCount = xmlPullParser2.getAttributeCount();
                                                    TtmlStyle ttmlStyleF = ttmlStyle;
                                                    int i3 = 0;
                                                    while (i3 < attributeCount) {
                                                        String attributeValue = xmlPullParser2.getAttributeValue(i3);
                                                        String attributeName = xmlPullParser2.getAttributeName(i3);
                                                        attributeName.getClass();
                                                        Layout.Alignment alignment = null;
                                                        switch (attributeName) {
                                                            case "fontStyle":
                                                                str2 = str2;
                                                                ttmlStyleF = f(ttmlStyleF);
                                                                ttmlStyleF.f18621i = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                                break;
                                                            case "fontFamily":
                                                                str2 = str2;
                                                                ttmlStyleF = f(ttmlStyleF);
                                                                ttmlStyleF.f18616a = attributeValue;
                                                                break;
                                                            case "textAlign":
                                                                str2 = str2;
                                                                ttmlStyleF = f(ttmlStyleF);
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
                                                                ttmlStyleF.o = alignment;
                                                                break;
                                                            case "textDecoration":
                                                                str2 = str2;
                                                                String strB2 = Ascii.b(attributeValue);
                                                                strB2.getClass();
                                                                switch (strB2) {
                                                                    case "nounderline":
                                                                        ttmlStyleF = f(ttmlStyleF);
                                                                        ttmlStyleF.g = 0;
                                                                        break;
                                                                    case "underline":
                                                                        ttmlStyleF = f(ttmlStyleF);
                                                                        ttmlStyleF.g = 1;
                                                                        break;
                                                                    case "nolinethrough":
                                                                        ttmlStyleF = f(ttmlStyleF);
                                                                        ttmlStyleF.f = 0;
                                                                        break;
                                                                    case "linethrough":
                                                                        ttmlStyleF = f(ttmlStyleF);
                                                                        ttmlStyleF.f = 1;
                                                                    default:
                                                                        break;
                                                                }
                                                                break;
                                                            case "fontWeight":
                                                                str2 = str2;
                                                                ttmlStyleF = f(ttmlStyleF);
                                                                ttmlStyleF.f18620h = com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.BOLD.equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                                break;
                                                            case "id":
                                                                str2 = str2;
                                                                if ("style".equals(xmlPullParser.getName())) {
                                                                    ttmlStyleF = f(ttmlStyleF);
                                                                    ttmlStyleF.f18622l = attributeValue;
                                                                }
                                                                break;
                                                            case "ruby":
                                                                str2 = str2;
                                                                String strB3 = Ascii.b(attributeValue);
                                                                strB3.getClass();
                                                                switch (strB3) {
                                                                    case "baseContainer":
                                                                    case "base":
                                                                        ttmlStyleF = f(ttmlStyleF);
                                                                        ttmlStyleF.m = 2;
                                                                        break;
                                                                    case "container":
                                                                        ttmlStyleF = f(ttmlStyleF);
                                                                        ttmlStyleF.m = 1;
                                                                        break;
                                                                    case "delimiter":
                                                                        ttmlStyleF = f(ttmlStyleF);
                                                                        ttmlStyleF.m = 4;
                                                                        break;
                                                                    case "textContainer":
                                                                    case "text":
                                                                        ttmlStyleF = f(ttmlStyleF);
                                                                        ttmlStyleF.m = 3;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                break;
                                                            case "color":
                                                                str2 = str2;
                                                                ttmlStyleF = f(ttmlStyleF);
                                                                try {
                                                                    ttmlStyleF.f18617b = ColorParser.a(attributeValue, false);
                                                                    ttmlStyleF.f18618c = true;
                                                                    break;
                                                                } catch (IllegalArgumentException unused) {
                                                                    Z.v("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                                                                }
                                                                break;
                                                            case "shear":
                                                                str2 = str2;
                                                                TtmlStyle ttmlStyleF2 = f(ttmlStyleF);
                                                                Matcher matcher = s.matcher(attributeValue);
                                                                float fMin = Float.MAX_VALUE;
                                                                if (matcher.matches()) {
                                                                    try {
                                                                        String strGroup = matcher.group(1);
                                                                        strGroup.getClass();
                                                                        fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                                    } catch (NumberFormatException e2) {
                                                                        Log.h("TtmlDecoder", "Failed to parse shear: " + attributeValue, e2);
                                                                    }
                                                                    break;
                                                                } else {
                                                                    Z.v("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                                                                }
                                                                ttmlStyleF2.s = fMin;
                                                                ttmlStyleF = ttmlStyleF2;
                                                                break;
                                                            case "textCombine":
                                                                str2 = str2;
                                                                String strB4 = Ascii.b(attributeValue);
                                                                strB4.getClass();
                                                                if (strB4.equals("all")) {
                                                                    ttmlStyleF = f(ttmlStyleF);
                                                                    ttmlStyleF.q = 1;
                                                                } else if (strB4.equals("none")) {
                                                                    ttmlStyleF = f(ttmlStyleF);
                                                                    ttmlStyleF.q = 0;
                                                                }
                                                                break;
                                                            case "fontSize":
                                                                str2 = str2;
                                                                try {
                                                                    ttmlStyleF = f(ttmlStyleF);
                                                                    i(attributeValue, ttmlStyleF);
                                                                    break;
                                                                } catch (SubtitleDecoderException unused2) {
                                                                    Z.v("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                                                                }
                                                                break;
                                                            case "textEmphasis":
                                                                ttmlStyleF = f(ttmlStyleF);
                                                                Pattern pattern = TextEmphasis.f18590b;
                                                                if (attributeValue == null) {
                                                                    textEmphasis = null;
                                                                } else {
                                                                    String strB5 = Ascii.b(attributeValue.trim());
                                                                    if (strB5.isEmpty()) {
                                                                        textEmphasis = null;
                                                                    } else {
                                                                        ImmutableSet immutableSetV = ImmutableSet.v(TextUtils.split(strB5, TextEmphasis.f18590b));
                                                                        String str3 = (String) Iterators.h(Sets.f(TextEmphasis.f, immutableSetV).iterator(), "outside");
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
                                                                        Sets.SetView setViewF = Sets.f(TextEmphasis.f18591c, immutableSetV);
                                                                        if (setViewF.isEmpty()) {
                                                                            Sets.SetView setViewF2 = Sets.f(TextEmphasis.f18592e, immutableSetV);
                                                                            Sets.SetView setViewF3 = Sets.f(TextEmphasis.d, immutableSetV);
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
                                                                ttmlStyleF.r = textEmphasis;
                                                                break;
                                                            case "rubyPosition":
                                                                String strB6 = Ascii.b(attributeValue);
                                                                strB6.getClass();
                                                                if (strB6.equals("before")) {
                                                                    ttmlStyleF = f(ttmlStyleF);
                                                                    ttmlStyleF.f18623n = 1;
                                                                } else if (strB6.equals(str2)) {
                                                                    ttmlStyleF = f(ttmlStyleF);
                                                                    ttmlStyleF.f18623n = 2;
                                                                }
                                                                str2 = str2;
                                                                break;
                                                            case "backgroundColor":
                                                                ttmlStyleF = f(ttmlStyleF);
                                                                try {
                                                                    ttmlStyleF.d = ColorParser.a(attributeValue, false);
                                                                    ttmlStyleF.f18619e = true;
                                                                    break;
                                                                } catch (IllegalArgumentException unused3) {
                                                                    Z.v("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                                                                }
                                                                str2 = str2;
                                                                break;
                                                            case "multiRowAlign":
                                                                ttmlStyleF = f(ttmlStyleF);
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
                                                                ttmlStyleF.f18624p = alignment;
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
                                                    return ttmlStyleF;
                                                }

                                                public static long n(String str, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
                                                    double d;
                                                    double d2;
                                                    byte b2 = 4;
                                                    Matcher matcher = f18594p.matcher(str);
                                                    if (matcher.matches()) {
                                                        String strGroup = matcher.group(1);
                                                        strGroup.getClass();
                                                        double d3 = Long.parseLong(strGroup) * b.f37307P;
                                                        String strGroup2 = matcher.group(2);
                                                        strGroup2.getClass();
                                                        double d4 = d3 + (Long.parseLong(strGroup2) * 60);
                                                        String strGroup3 = matcher.group(3);
                                                        strGroup3.getClass();
                                                        double d5 = d4 + Long.parseLong(strGroup3);
                                                        String strGroup4 = matcher.group(4);
                                                        double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                                        String strGroup5 = matcher.group(5);
                                                        double d7 = d6 + (strGroup5 != null ? Long.parseLong(strGroup5) / frameAndTickRate.f18598a : 0.0d);
                                                        String strGroup6 = matcher.group(6);
                                                        return (long) ((d7 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) frameAndTickRate.f18599b)) / ((double) frameAndTickRate.f18598a) : 0.0d)) * 1000000.0d);
                                                    }
                                                    Matcher matcher2 = q.matcher(str);
                                                    if (!matcher2.matches()) {
                                                        throw new SubtitleDecoderException(a.C("Malformed time expression: ", str));
                                                    }
                                                    String strGroup7 = matcher2.group(1);
                                                    strGroup7.getClass();
                                                    double d8 = Double.parseDouble(strGroup7);
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
                                                            d = frameAndTickRate.f18598a;
                                                            d8 /= d;
                                                            return (long) (d8 * 1000000.0d);
                                                        case 1:
                                                            d2 = 3600.0d;
                                                            break;
                                                        case 2:
                                                            d2 = 60.0d;
                                                            break;
                                                        case 3:
                                                            d = frameAndTickRate.f18600c;
                                                            d8 /= d;
                                                            return (long) (d8 * 1000000.0d);
                                                        case 4:
                                                            d = 1000.0d;
                                                            d8 /= d;
                                                            return (long) (d8 * 1000000.0d);
                                                        default:
                                                            return (long) (d8 * 1000000.0d);
                                                    }
                                                    d8 *= d2;
                                                    return (long) (d8 * 1000000.0d);
                                                }

                                                public static TtsExtent o(XmlPullParser xmlPullParser) {
                                                    String strA = XmlPullParserUtil.a(xmlPullParser, com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
                                                    if (strA == null) {
                                                        return null;
                                                    }
                                                    Matcher matcher = f18595u.matcher(strA);
                                                    if (!matcher.matches()) {
                                                        Log.g("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strA));
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
                                                        Log.g("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strA));
                                                        return null;
                                                    }
                                                }

                                                @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
                                                public final Subtitle e(byte[] bArr, int i2, boolean z2) throws SubtitleDecoderException {
                                                    try {
                                                        XmlPullParser xmlPullParserNewPullParser = this.o.newPullParser();
                                                        HashMap map = new HashMap();
                                                        HashMap map2 = new HashMap();
                                                        HashMap map3 = new HashMap();
                                                        map2.put("", new TtmlRegion("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                                        TtsExtent ttsExtentO = null;
                                                        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
                                                        ArrayDeque arrayDeque = new ArrayDeque();
                                                        FrameAndTickRate frameAndTickRate = f18596w;
                                                        CellResolution cellResolution = x;
                                                        int i3 = 0;
                                                        FrameAndTickRate frameAndTickRateJ = frameAndTickRate;
                                                        TtmlSubtitle ttmlSubtitle = null;
                                                        CellResolution cellResolutionH = cellResolution;
                                                        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                            TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                                                            if (i3 == 0) {
                                                                String name = xmlPullParserNewPullParser.getName();
                                                                if (eventType == 2) {
                                                                    if (com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_TT.equals(name)) {
                                                                        frameAndTickRateJ = j(xmlPullParserNewPullParser);
                                                                        cellResolutionH = h(xmlPullParserNewPullParser, cellResolution);
                                                                        ttsExtentO = o(xmlPullParserNewPullParser);
                                                                    }
                                                                    FrameAndTickRate frameAndTickRate2 = frameAndTickRateJ;
                                                                    CellResolution cellResolution2 = cellResolutionH;
                                                                    if (g(name)) {
                                                                        if (com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD.equals(name)) {
                                                                            k(xmlPullParserNewPullParser, map, cellResolution2, ttsExtentO, map2, map3);
                                                                        } else {
                                                                            try {
                                                                                TtmlNode ttmlNodeL = l(xmlPullParserNewPullParser, ttmlNode, map2, frameAndTickRate2);
                                                                                arrayDeque.push(ttmlNodeL);
                                                                                if (ttmlNode != null) {
                                                                                    if (ttmlNode.m == null) {
                                                                                        ttmlNode.m = new ArrayList();
                                                                                    }
                                                                                    ttmlNode.m.add(ttmlNodeL);
                                                                                }
                                                                            } catch (SubtitleDecoderException e2) {
                                                                                Log.h("TtmlDecoder", "Suppressing parser error", e2);
                                                                                i3++;
                                                                            }
                                                                        }
                                                                        cellResolutionH = cellResolution2;
                                                                        frameAndTickRateJ = frameAndTickRate2;
                                                                    } else {
                                                                        Log.f("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                                                                    }
                                                                    i3++;
                                                                    cellResolutionH = cellResolution2;
                                                                    frameAndTickRateJ = frameAndTickRate2;
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
                                                                i3++;
                                                            } else if (eventType == 3) {
                                                                i3--;
                                                            }
                                                            xmlPullParserNewPullParser.next();
                                                        }
                                                        if (ttmlSubtitle != null) {
                                                            return ttmlSubtitle;
                                                        }
                                                        throw new SubtitleDecoderException("No TTML subtitles found");
                                                    } catch (IOException e3) {
                                                        throw new IllegalStateException("Unexpected error when reading input.", e3);
                                                    } catch (XmlPullParserException e4) {
                                                        throw new SubtitleDecoderException("Unable to decode source", e4);
                                                    }
                                                }
                                            }
