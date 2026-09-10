package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.Layout;
import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
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

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.te0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4679te0 extends R60 {
    public static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final C4591se0 u = new C4591se0(30.0f, 1, 1);
    public static final C4131nO v = new C4131nO(32, 15);
    public final XmlPullParserFactory m;

    public C4679te0() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static C4943we0 e(C4943we0 c4943we0) {
        return c4943we0 == null ? new C4943we0() : c4943we0;
    }

    public static boolean f(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals("p") || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment g(String str) {
        String strH0 = FW.h0(str);
        strH0.getClass();
        switch (strH0) {
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

    public static C4131nO h(XmlPullParser xmlPullParser, C4131nO c4131nO) throws C4671ta0 {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return c4131nO;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            AbstractC4038mJ.f();
            return c4131nO;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i != 0 && i2 != 0) {
                return new C4131nO(i, i2);
            }
            throw new C4671ta0("Invalid cell resolution " + i + " " + i2, 0);
        } catch (NumberFormatException unused) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            AbstractC4038mJ.f();
            return c4131nO;
        }
    }

    public static void i(String str, C4943we0 c4943we0) throws C4671ta0 {
        Matcher matcher;
        int i = Ug0.f3833a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new C4671ta0(AbstractC5044xl.o(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."), 0);
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC4038mJ.f();
        }
        if (!matcher.matches()) {
            throw new C4671ta0(DM.B("Invalid expression for fontSize: '", str, "'."), 0);
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        strGroup.hashCode();
        switch (strGroup) {
            case "%":
                c4943we0.j = 3;
                break;
            case "em":
                c4943we0.j = 2;
                break;
            case "px":
                c4943we0.j = 1;
                break;
            default:
                throw new C4671ta0(DM.B("Invalid unit for fontSize: '", strGroup, "'."), 0);
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c4943we0.k = Float.parseFloat(strGroup2);
    }

    public static C4591se0 j(XmlPullParser xmlPullParser) throws C4671ta0 {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = Ug0.f3833a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            if (strArrSplit.length != 2) {
                throw new C4671ta0("frameRateMultiplier doesn't have 2 parts", 0);
            }
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        C4591se0 c4591se0 = u;
        int i3 = c4591se0.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new C4591se0(i * f, i3, attributeValue4 != null ? Integer.parseInt(attributeValue4) : c4591se0.c);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:52:0x0154  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX WARN: Code duplicated, block: B:57:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0172  */
    /* JADX WARN: Code duplicated, block: B:60:0x017c  */
    /* JADX WARN: Code duplicated, block: B:63:0x018e  */
    /* JADX WARN: Code duplicated, block: B:66:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ee  */
    public static void k(XmlPullParser xmlPullParser, HashMap map, C4131nO c4131nO, C4131nO c4131nO2, HashMap map2, HashMap map3) throws XmlPullParserException, IOException {
        String strF;
        float f;
        float f2;
        String strF2;
        Matcher matcher;
        Matcher matcher2;
        float f3;
        float f4;
        String strF3;
        float f5;
        int i;
        String strF4;
        int i2;
        C4855ve0 c4855ve0;
        String strH0;
        String strH1;
        String[] strArrSplit;
        do {
            xmlPullParser.next();
            if (AbstractC2995aW.Z(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String strF5 = AbstractC2995aW.F(xmlPullParser, TtmlNode.TAG_STYLE);
                C4943we0 c4943we0M = m(xmlPullParser, new C4943we0());
                if (strF5 != null) {
                    String strTrim = strF5.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        int i3 = Ug0.f3833a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    for (String str : strArrSplit) {
                        c4943we0M.a((C4943we0) map.get(str));
                    }
                }
                String str2 = c4943we0M.l;
                if (str2 != null) {
                    map.put(str2, c4943we0M);
                }
            } else if (AbstractC2995aW.Z(xmlPullParser, TtmlNode.TAG_REGION)) {
                String strF6 = AbstractC2995aW.F(xmlPullParser, "id");
                if (strF6 != null) {
                    String strF7 = AbstractC2995aW.F(xmlPullParser, "origin");
                    if (strF7 != null) {
                        Pattern pattern = r;
                        Matcher matcher3 = pattern.matcher(strF7);
                        Pattern pattern2 = s;
                        Matcher matcher4 = pattern2.matcher(strF7);
                        if (matcher3.matches()) {
                            try {
                                String strGroup = matcher3.group(1);
                                strGroup.getClass();
                                float f6 = Float.parseFloat(strGroup) / 100.0f;
                                String strGroup2 = matcher3.group(2);
                                strGroup2.getClass();
                                f = Float.parseFloat(strGroup2) / 100.0f;
                                f2 = f6;
                                strF2 = AbstractC2995aW.F(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                if (strF2 != null) {
                                    matcher = pattern.matcher(strF2);
                                    matcher2 = pattern2.matcher(strF2);
                                    if (matcher.matches()) {
                                        try {
                                            String strGroup3 = matcher.group(1);
                                            strGroup3.getClass();
                                            float f7 = Float.parseFloat(strGroup3) / 100.0f;
                                            String strGroup4 = matcher.group(2);
                                            strGroup4.getClass();
                                            f3 = Float.parseFloat(strGroup4) / 100.0f;
                                            f4 = f7;
                                        } catch (NumberFormatException unused) {
                                            "Ignoring region with malformed extent: ".concat(strF7);
                                            AbstractC4038mJ.f();
                                            c4855ve0 = null;
                                        }
                                    } else if (matcher2.matches()) {
                                        "Ignoring region with unsupported extent: ".concat(strF7);
                                        AbstractC4038mJ.f();
                                    } else if (c4131nO2 == null) {
                                        "Ignoring region with missing tts:extent: ".concat(strF7);
                                        AbstractC4038mJ.f();
                                    } else {
                                        try {
                                            String strGroup5 = matcher2.group(1);
                                            strGroup5.getClass();
                                            int i4 = Integer.parseInt(strGroup5);
                                            String strGroup6 = matcher2.group(2);
                                            strGroup6.getClass();
                                            int i5 = Integer.parseInt(strGroup6);
                                            f4 = i4 / c4131nO2.f4741a;
                                            f3 = i5 / c4131nO2.b;
                                        } catch (NumberFormatException unused2) {
                                            "Ignoring region with malformed extent: ".concat(strF7);
                                            AbstractC4038mJ.f();
                                            c4855ve0 = null;
                                        }
                                    }
                                    strF3 = AbstractC2995aW.F(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                    if (strF3 != null) {
                                        strH1 = FW.h0(strF3);
                                        strH1.getClass();
                                        if (!strH1.equals(TtmlNode.CENTER)) {
                                            f5 = (f3 / 2.0f) + f;
                                            i = 1;
                                        } else if (strH1.equals("after")) {
                                            f5 = f + f3;
                                            i = 2;
                                        } else {
                                            f5 = f;
                                            i = 0;
                                        }
                                    } else {
                                        f5 = f;
                                        i = 0;
                                    }
                                    float f8 = 1.0f / c4131nO.b;
                                    strF4 = AbstractC2995aW.F(xmlPullParser, "writingMode");
                                    if (strF4 != null) {
                                        strH0 = FW.h0(strF4);
                                        strH0.getClass();
                                        switch (strH0) {
                                            case "tb":
                                            case "tblr":
                                                i2 = 2;
                                                break;
                                            case "tbrl":
                                                i2 = 1;
                                                break;
                                            default:
                                                i2 = Integer.MIN_VALUE;
                                                break;
                                        }
                                    } else {
                                        i2 = Integer.MIN_VALUE;
                                    }
                                    c4855ve0 = new C4855ve0(strF6, f2, f5, 0, i, f4, f3, 1, f8, i2);
                                } else {
                                    AbstractC4038mJ.f();
                                }
                            } catch (NumberFormatException unused3) {
                                "Ignoring region with malformed origin: ".concat(strF7);
                                AbstractC4038mJ.f();
                            }
                        } else if (!matcher4.matches()) {
                            "Ignoring region with unsupported origin: ".concat(strF7);
                            AbstractC4038mJ.f();
                        } else if (c4131nO2 == null) {
                            "Ignoring region with missing tts:extent: ".concat(strF7);
                            AbstractC4038mJ.f();
                        } else {
                            try {
                                String strGroup7 = matcher4.group(1);
                                strGroup7.getClass();
                                int i6 = Integer.parseInt(strGroup7);
                                String strGroup8 = matcher4.group(2);
                                strGroup8.getClass();
                                int i7 = Integer.parseInt(strGroup8);
                                f2 = i6 / c4131nO2.f4741a;
                                f = i7 / c4131nO2.b;
                                strF2 = AbstractC2995aW.F(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                if (strF2 != null) {
                                    matcher = pattern.matcher(strF2);
                                    matcher2 = pattern2.matcher(strF2);
                                    if (matcher.matches()) {
                                        String strGroup9 = matcher.group(1);
                                        strGroup9.getClass();
                                        float f9 = Float.parseFloat(strGroup9) / 100.0f;
                                        String strGroup10 = matcher.group(2);
                                        strGroup10.getClass();
                                        f3 = Float.parseFloat(strGroup10) / 100.0f;
                                        f4 = f9;
                                    } else if (matcher2.matches()) {
                                        "Ignoring region with unsupported extent: ".concat(strF7);
                                        AbstractC4038mJ.f();
                                    } else if (c4131nO2 == null) {
                                        "Ignoring region with missing tts:extent: ".concat(strF7);
                                        AbstractC4038mJ.f();
                                    } else {
                                        String strGroup11 = matcher2.group(1);
                                        strGroup11.getClass();
                                        int i8 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher2.group(2);
                                        strGroup12.getClass();
                                        int i9 = Integer.parseInt(strGroup12);
                                        f4 = i8 / c4131nO2.f4741a;
                                        f3 = i9 / c4131nO2.b;
                                    }
                                    strF3 = AbstractC2995aW.F(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                    if (strF3 != null) {
                                        strH1 = FW.h0(strF3);
                                        strH1.getClass();
                                        if (!strH1.equals(TtmlNode.CENTER)) {
                                            f5 = (f3 / 2.0f) + f;
                                            i = 1;
                                        } else if (strH1.equals("after")) {
                                            f5 = f;
                                            i = 0;
                                        } else {
                                            f5 = f + f3;
                                            i = 2;
                                        }
                                    } else {
                                        f5 = f;
                                        i = 0;
                                    }
                                    float f10 = 1.0f / c4131nO.b;
                                    strF4 = AbstractC2995aW.F(xmlPullParser, "writingMode");
                                    if (strF4 != null) {
                                        strH0 = FW.h0(strF4);
                                        strH0.getClass();
                                        switch (strH0) {
                                            case 3694:
                                                if (strH0.equals("tb")) {
                                                }
                                                break;
                                            case 3553396:
                                                if (strH0.equals("tblr")) {
                                                }
                                                break;
                                            case 3553576:
                                                if (strH0.equals("tbrl")) {
                                                }
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
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:216)
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
                                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                            */
                                        /*
                                            Method dump skipped, instruction units count: 614
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4679te0.k(org.xmlpull.v1.XmlPullParser, java.util.HashMap, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nO, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nO, java.util.HashMap, java.util.HashMap):void");
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:6:0x0039  */
                                    /* JADX WARN: Code duplicated, block: B:71:0x0105  */
                                    public static C4767ue0 l(XmlPullParser xmlPullParser, C4767ue0 c4767ue0, HashMap map, C4591se0 c4591se0) throws C4671ta0 {
                                        long j;
                                        long j2;
                                        String[] strArrSplit;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        C4943we0 c4943we0M = m(xmlPullParser, null);
                                        String[] strArr = null;
                                        String strSubstring = null;
                                        String str = "";
                                        long jN = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                        long jN2 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                        long jN3 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                        for (int i = 0; i < attributeCount; i++) {
                                            String attributeName = xmlPullParser.getAttributeName(i);
                                            String attributeValue = xmlPullParser.getAttributeValue(i);
                                            attributeName.getClass();
                                            switch (attributeName) {
                                                case "region":
                                                    if (map.containsKey(attributeValue)) {
                                                        str = attributeValue;
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                    break;
                                                case "dur":
                                                    jN3 = n(attributeValue, c4591se0);
                                                    break;
                                                case "end":
                                                    jN2 = n(attributeValue, c4591se0);
                                                    break;
                                                case "begin":
                                                    jN = n(attributeValue, c4591se0);
                                                    break;
                                                case "style":
                                                    String strTrim = attributeValue.trim();
                                                    if (strTrim.isEmpty()) {
                                                        strArrSplit = new String[0];
                                                    } else {
                                                        int i2 = Ug0.f3833a;
                                                        strArrSplit = strTrim.split("\\s+", -1);
                                                    }
                                                    if (strArrSplit.length > 0) {
                                                        strArr = strArrSplit;
                                                        break;
                                                    } else {
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
                                        }
                                        if (c4767ue0 != null) {
                                            long j3 = c4767ue0.d;
                                            j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                            if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                                if (jN != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                                    jN += j3;
                                                }
                                                if (jN2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                                    jN2 += j3;
                                                }
                                            }
                                        } else {
                                            j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                        }
                                        if (jN2 != j) {
                                            j2 = jN2;
                                        } else if (jN3 != j) {
                                            j2 = jN + jN3;
                                        } else if (c4767ue0 != null) {
                                            long j4 = c4767ue0.e;
                                            if (j4 != j) {
                                                j2 = j4;
                                            } else {
                                                j2 = jN2;
                                            }
                                        } else {
                                            j2 = jN2;
                                        }
                                        return new C4767ue0(xmlPullParser.getName(), null, jN, j2, c4943we0M, strArr, str, strSubstring, c4767ue0);
                                    }

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Code duplicated, block: B:110:0x01a4  */
                                    /* JADX WARN: Code duplicated, block: B:146:0x023f  */
                                    /* JADX WARN: Code duplicated, block: B:148:0x0244  */
                                    /* JADX WARN: Code duplicated, block: B:154:0x0254  */
                                    /* JADX WARN: Code duplicated, block: B:156:0x025c  */
                                    /* JADX WARN: Code duplicated, block: B:157:0x025e  */
                                    /* JADX WARN: Code duplicated, block: B:159:0x0264  */
                                    /* JADX WARN: Code duplicated, block: B:161:0x0267 A[DONT_INVERT] */
                                    /* JADX WARN: Code duplicated, block: B:162:0x0269  */
                                    /* JADX WARN: Code duplicated, block: B:163:0x026b  */
                                    /* JADX WARN: Code duplicated, block: B:164:0x026d  */
                                    /* JADX WARN: Code duplicated, block: B:191:0x0315  */
                                    /* JADX WARN: Code duplicated, block: B:227:0x03ad  */
                                    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
                                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                    public static C4943we0 m(XmlPullParser xmlPullParser, C4943we0 c4943we0) {
                                        byte b;
                                        byte b2;
                                        String str;
                                        int iHashCode;
                                        int i;
                                        Kb0 kb0;
                                        int attributeCount = xmlPullParser.getAttributeCount();
                                        C4943we0 c4943we0E = c4943we0;
                                        for (int i2 = 0; i2 < attributeCount; i2++) {
                                            String attributeValue = xmlPullParser.getAttributeValue(i2);
                                            String attributeName = xmlPullParser.getAttributeName(i2);
                                            attributeName.getClass();
                                            byte b3 = 5;
                                            int i3 = -1;
                                            switch (attributeName.hashCode()) {
                                                case -1550943582:
                                                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                                                        b = 0;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case -1224696685:
                                                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                                                        b = 1;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case -1065511464:
                                                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                                                        b = 2;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case -879295043:
                                                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                                                        b = 3;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case -734428249:
                                                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                                                        b = 4;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 3355:
                                                    if (attributeName.equals("id")) {
                                                        b = 5;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 3511770:
                                                    if (attributeName.equals("ruby")) {
                                                        b = 6;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 94842723:
                                                    if (attributeName.equals("color")) {
                                                        b = 7;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 109403361:
                                                    if (attributeName.equals("shear")) {
                                                        b = 8;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 110138194:
                                                    if (attributeName.equals("textCombine")) {
                                                        b = 9;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 365601008:
                                                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                                                        b = 10;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 921125321:
                                                    if (attributeName.equals("textEmphasis")) {
                                                        b = 11;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 1115953443:
                                                    if (attributeName.equals("rubyPosition")) {
                                                        b = 12;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 1287124693:
                                                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                                                        b = com.umeng.analytics.pro.cw.k;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                case 1754920356:
                                                    if (attributeName.equals("multiRowAlign")) {
                                                        b = com.umeng.analytics.pro.cw.l;
                                                    } else {
                                                        b = -1;
                                                    }
                                                    break;
                                                default:
                                                    b = -1;
                                                    break;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c4943we0E = e(c4943we0E);
                                                    c4943we0E.i = TtmlNode.ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 1:
                                                    c4943we0E = e(c4943we0E);
                                                    c4943we0E.f5190a = attributeValue;
                                                    break;
                                                case 2:
                                                    c4943we0E = e(c4943we0E);
                                                    c4943we0E.o = g(attributeValue);
                                                    break;
                                                case 3:
                                                    String strH0 = FW.h0(attributeValue);
                                                    strH0.getClass();
                                                    switch (strH0) {
                                                        case "nounderline":
                                                            c4943we0E = e(c4943we0E);
                                                            c4943we0E.g = 0;
                                                            break;
                                                        case "underline":
                                                            c4943we0E = e(c4943we0E);
                                                            c4943we0E.g = 1;
                                                            break;
                                                        case "nolinethrough":
                                                            c4943we0E = e(c4943we0E);
                                                            c4943we0E.f = 0;
                                                            break;
                                                        case "linethrough":
                                                            c4943we0E = e(c4943we0E);
                                                            c4943we0E.f = 1;
                                                            break;
                                                    }
                                                    break;
                                                case 4:
                                                    c4943we0E = e(c4943we0E);
                                                    c4943we0E.h = TtmlNode.BOLD.equalsIgnoreCase(attributeValue) ? 1 : 0;
                                                    break;
                                                case 5:
                                                    if (TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                                                        c4943we0E = e(c4943we0E);
                                                        c4943we0E.l = attributeValue;
                                                    }
                                                    break;
                                                case 6:
                                                    String strH1 = FW.h0(attributeValue);
                                                    strH1.getClass();
                                                    switch (strH1.hashCode()) {
                                                        case -618561360:
                                                            if (strH1.equals("baseContainer")) {
                                                                b3 = 0;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        case -410956671:
                                                            if (strH1.equals("container")) {
                                                                b3 = 1;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        case -250518009:
                                                            if (strH1.equals("delimiter")) {
                                                                b3 = 2;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        case -136074796:
                                                            if (strH1.equals("textContainer")) {
                                                                b3 = 3;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        case 3016401:
                                                            if (strH1.equals("base")) {
                                                                b3 = 4;
                                                            } else {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        case 3556653:
                                                            if (!strH1.equals(MimeTypes.BASE_TYPE_TEXT)) {
                                                                b3 = -1;
                                                            }
                                                            break;
                                                        default:
                                                            b3 = -1;
                                                            break;
                                                    }
                                                    switch (b3) {
                                                        case 0:
                                                        case 4:
                                                            c4943we0E = e(c4943we0E);
                                                            c4943we0E.m = 2;
                                                            break;
                                                        case 1:
                                                            c4943we0E = e(c4943we0E);
                                                            c4943we0E.m = 1;
                                                            break;
                                                        case 2:
                                                            c4943we0E = e(c4943we0E);
                                                            c4943we0E.m = 4;
                                                            break;
                                                        case 3:
                                                        case 5:
                                                            c4943we0E = e(c4943we0E);
                                                            c4943we0E.m = 3;
                                                            break;
                                                    }
                                                    break;
                                                case 7:
                                                    c4943we0E = e(c4943we0E);
                                                    try {
                                                        c4943we0E.b = AbstractC2931Zf.a(attributeValue, false);
                                                        c4943we0E.c = true;
                                                    } catch (IllegalArgumentException unused) {
                                                        AbstractC4038mJ.f();
                                                    }
                                                    break;
                                                case 8:
                                                    C4943we0 c4943we0E2 = e(c4943we0E);
                                                    Matcher matcher = q.matcher(attributeValue);
                                                    float fMin = Float.MAX_VALUE;
                                                    if (matcher.matches()) {
                                                        try {
                                                            String strGroup = matcher.group(1);
                                                            strGroup.getClass();
                                                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                                                        } catch (NumberFormatException e) {
                                                            AbstractC4038mJ.g("Failed to parse shear: " + attributeValue, e);
                                                        }
                                                    } else {
                                                        AbstractC4038mJ.f();
                                                    }
                                                    c4943we0E2.s = fMin;
                                                    c4943we0E = c4943we0E2;
                                                    break;
                                                case 9:
                                                    String strH2 = FW.h0(attributeValue);
                                                    strH2.getClass();
                                                    if (strH2.equals("all")) {
                                                        c4943we0E = e(c4943we0E);
                                                        c4943we0E.q = 1;
                                                    } else if (strH2.equals(Constants.CP_NONE)) {
                                                        c4943we0E = e(c4943we0E);
                                                        c4943we0E.q = 0;
                                                    }
                                                    break;
                                                case 10:
                                                    try {
                                                        c4943we0E = e(c4943we0E);
                                                        i(attributeValue, c4943we0E);
                                                    } catch (C4671ta0 unused2) {
                                                        AbstractC4038mJ.f();
                                                    }
                                                    break;
                                                case 11:
                                                    c4943we0E = e(c4943we0E);
                                                    Pattern pattern = Kb0.d;
                                                    Kb0 kb1 = null;
                                                    if (attributeValue != null) {
                                                        String strH3 = FW.h0(attributeValue.trim());
                                                        if (!strH3.isEmpty()) {
                                                            String[] strArrSplit = TextUtils.split(strH3, Kb0.d);
                                                            int length = strArrSplit.length;
                                                            KC kcI = length != 0 ? length != 1 ? KC.i(strArrSplit.length, (Object[]) strArrSplit.clone()) : new C4376q70(strArrSplit[0]) : C4492rY.i;
                                                            String str2 = (String) FW.F(AbstractC2995aW.U(Kb0.h, kcI), "outside");
                                                            int iHashCode2 = str2.hashCode();
                                                            if (iHashCode2 != -1392885889) {
                                                                if (iHashCode2 != -1106037339) {
                                                                    if (iHashCode2 == 92734940 && str2.equals("after")) {
                                                                        b2 = 0;
                                                                    } else {
                                                                        b2 = -1;
                                                                    }
                                                                } else if (str2.equals("outside")) {
                                                                    b2 = 1;
                                                                } else {
                                                                    b2 = -1;
                                                                }
                                                            } else if (str2.equals("before")) {
                                                                b2 = 2;
                                                            } else {
                                                                b2 = -1;
                                                            }
                                                            int i4 = b2 != 0 ? b2 != 1 ? 1 : -2 : 2;
                                                            C4811v50 c4811v50U = AbstractC2995aW.U(Kb0.e, kcI);
                                                            if (c4811v50U.isEmpty()) {
                                                                C4811v50 c4811v50U2 = AbstractC2995aW.U(Kb0.g, kcI);
                                                                C4811v50 c4811v50U3 = AbstractC2995aW.U(Kb0.f, kcI);
                                                                if (c4811v50U2.isEmpty() && c4811v50U3.isEmpty()) {
                                                                    kb0 = new Kb0(-1, 0, i4);
                                                                } else {
                                                                    String str3 = (String) FW.F(c4811v50U2, "filled");
                                                                    int iHashCode3 = str3.hashCode();
                                                                    if (iHashCode3 != -1274499742) {
                                                                        int i5 = (iHashCode3 == 3417674 && str3.equals(C4304pL.OPEN)) ? 2 : 1;
                                                                        str = (String) FW.F(c4811v50U3, "circle");
                                                                        iHashCode = str.hashCode();
                                                                        if (iHashCode != -1360216880) {
                                                                            if (iHashCode != -905816648) {
                                                                                if (iHashCode == 99657 && str.equals("dot")) {
                                                                                    i3 = 0;
                                                                                }
                                                                            } else if (str.equals("sesame")) {
                                                                                i3 = 1;
                                                                            }
                                                                        } else if (str.equals("circle")) {
                                                                            i3 = 2;
                                                                        }
                                                                        if (i3 != 0) {
                                                                            i = 2;
                                                                        } else if (i3 != 1) {
                                                                            i = 1;
                                                                        } else {
                                                                            i = 3;
                                                                        }
                                                                        kb0 = new Kb0(i, i5, i4);
                                                                    } else {
                                                                        str3.equals("filled");
                                                                    }
                                                                    str = (String) FW.F(c4811v50U3, "circle");
                                                                    iHashCode = str.hashCode();
                                                                    if (iHashCode != -1360216880) {
                                                                        if (iHashCode != -905816648) {
                                                                            if (iHashCode == 99657) {
                                                                                i3 = 0;
                                                                            }
                                                                        } else if (str.equals("sesame")) {
                                                                            i3 = 1;
                                                                        }
                                                                    } else if (str.equals("circle")) {
                                                                        i3 = 2;
                                                                    }
                                                                    if (i3 != 0) {
                                                                        i = 2;
                                                                    } else if (i3 != 1) {
                                                                        i = 1;
                                                                    } else {
                                                                        i = 3;
                                                                    }
                                                                    kb0 = new Kb0(i, i5, i4);
                                                                }
                                                            } else {
                                                                String str4 = (String) new C3857kE(c4811v50U).next();
                                                                int iHashCode4 = str4.hashCode();
                                                                if (iHashCode4 == 3005871) {
                                                                    str4.equals("auto");
                                                                } else if (iHashCode4 == 3387192 && str4.equals(Constants.CP_NONE)) {
                                                                    i3 = 0;
                                                                }
                                                                kb0 = new Kb0(i3, 0, i4);
                                                            }
                                                            kb1 = kb0;
                                                        }
                                                    }
                                                    c4943we0E.r = kb1;
                                                    break;
                                                case 12:
                                                    String strH4 = FW.h0(attributeValue);
                                                    strH4.getClass();
                                                    if (strH4.equals("before")) {
                                                        c4943we0E = e(c4943we0E);
                                                        c4943we0E.n = 1;
                                                    } else if (strH4.equals("after")) {
                                                        c4943we0E = e(c4943we0E);
                                                        c4943we0E.n = 2;
                                                    }
                                                    break;
                                                case 13:
                                                    c4943we0E = e(c4943we0E);
                                                    try {
                                                        c4943we0E.d = AbstractC2931Zf.a(attributeValue, false);
                                                        c4943we0E.e = true;
                                                    } catch (IllegalArgumentException unused3) {
                                                        AbstractC4038mJ.f();
                                                    }
                                                    break;
                                                case 14:
                                                    c4943we0E = e(c4943we0E);
                                                    c4943we0E.p = g(attributeValue);
                                                    break;
                                            }
                                        }
                                        return c4943we0E;
                                    }

                                    public static long n(String str, C4591se0 c4591se0) throws C4671ta0 {
                                        double d;
                                        double d2;
                                        Matcher matcher = n.matcher(str);
                                        if (matcher.matches()) {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            double d3 = Long.parseLong(strGroup) * 3600;
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            double d4 = d3 + (Long.parseLong(strGroup2) * 60);
                                            String strGroup3 = matcher.group(3);
                                            strGroup3.getClass();
                                            double d5 = d4 + Long.parseLong(strGroup3);
                                            String strGroup4 = matcher.group(4);
                                            double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
                                            String strGroup5 = matcher.group(5);
                                            double d7 = d6 + (strGroup5 != null ? Long.parseLong(strGroup5) / c4591se0.f4991a : 0.0d);
                                            String strGroup6 = matcher.group(6);
                                            return (long) ((d7 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) c4591se0.b)) / ((double) c4591se0.f4991a) : 0.0d)) * 1000000.0d);
                                        }
                                        Matcher matcher2 = o.matcher(str);
                                        if (!matcher2.matches()) {
                                            throw new C4671ta0(AbstractC3888ke0.i("Malformed time expression: ", str), 0);
                                        }
                                        String strGroup7 = matcher2.group(1);
                                        strGroup7.getClass();
                                        double d8 = Double.parseDouble(strGroup7);
                                        String strGroup8 = matcher2.group(2);
                                        strGroup8.getClass();
                                        strGroup8.hashCode();
                                        switch (strGroup8) {
                                            case "f":
                                                d = c4591se0.f4991a;
                                                d8 /= d;
                                                return (long) (d8 * 1000000.0d);
                                            case "h":
                                                d2 = 3600.0d;
                                                break;
                                            case "m":
                                                d2 = 60.0d;
                                                break;
                                            case "t":
                                                d = c4591se0.c;
                                                d8 /= d;
                                                return (long) (d8 * 1000000.0d);
                                            case "ms":
                                                d = 1000.0d;
                                                d8 /= d;
                                                return (long) (d8 * 1000000.0d);
                                            default:
                                                return (long) (d8 * 1000000.0d);
                                        }
                                        d8 *= d2;
                                        return (long) (d8 * 1000000.0d);
                                    }

                                    public static C4131nO o(XmlPullParser xmlPullParser) {
                                        String strF = AbstractC2995aW.F(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                        if (strF == null) {
                                            return null;
                                        }
                                        Matcher matcher = s.matcher(strF);
                                        if (!matcher.matches()) {
                                            "Ignoring non-pixel tts extent: ".concat(strF);
                                            AbstractC4038mJ.f();
                                            return null;
                                        }
                                        try {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            int i = Integer.parseInt(strGroup);
                                            String strGroup2 = matcher.group(2);
                                            strGroup2.getClass();
                                            return new C4131nO(i, Integer.parseInt(strGroup2));
                                        } catch (NumberFormatException unused) {
                                            "Ignoring malformed tts extent: ".concat(strF);
                                            AbstractC4038mJ.f();
                                            return null;
                                        }
                                    }

                                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R60
                                    public final InterfaceC4495ra0 b(byte[] bArr, int i, boolean z) throws C4671ta0 {
                                        C4591se0 c4591se0;
                                        try {
                                            XmlPullParser xmlPullParserNewPullParser = this.m.newPullParser();
                                            HashMap map = new HashMap();
                                            HashMap map2 = new HashMap();
                                            HashMap map3 = new HashMap();
                                            map2.put("", new C4855ve0("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
                                            C4131nO c4131nOO = null;
                                            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
                                            ArrayDeque arrayDeque = new ArrayDeque();
                                            C4591se0 c4591se0J = u;
                                            C4131nO c4131nO = v;
                                            C5031xe0 c5031xe0 = null;
                                            C4131nO c4131nOH = c4131nO;
                                            int i2 = 0;
                                            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                                C4767ue0 c4767ue0 = (C4767ue0) arrayDeque.peek();
                                                if (i2 == 0) {
                                                    String name = xmlPullParserNewPullParser.getName();
                                                    if (eventType == 2) {
                                                        if (TtmlNode.TAG_TT.equals(name)) {
                                                            c4591se0J = j(xmlPullParserNewPullParser);
                                                            c4131nOH = h(xmlPullParserNewPullParser, c4131nO);
                                                            c4131nOO = o(xmlPullParserNewPullParser);
                                                        }
                                                        C4131nO c4131nO2 = c4131nOO;
                                                        C4591se0 c4591se1 = c4591se0J;
                                                        C4131nO c4131nO3 = c4131nOH;
                                                        if (f(name)) {
                                                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                                                c4591se0 = c4591se1;
                                                                k(xmlPullParserNewPullParser, map, c4131nO3, c4131nO2, map2, map3);
                                                            } else {
                                                                c4591se0 = c4591se1;
                                                                try {
                                                                    C4767ue0 c4767ue0L = l(xmlPullParserNewPullParser, c4767ue0, map2, c4591se0);
                                                                    arrayDeque.push(c4767ue0L);
                                                                    if (c4767ue0 != null) {
                                                                        if (c4767ue0.m == null) {
                                                                            c4767ue0.m = new ArrayList();
                                                                        }
                                                                        c4767ue0.m.add(c4767ue0L);
                                                                    }
                                                                } catch (C4671ta0 e) {
                                                                    AbstractC4038mJ.g("Suppressing parser error", e);
                                                                    i2++;
                                                                }
                                                            }
                                                            c4591se0J = c4591se0;
                                                        } else {
                                                            xmlPullParserNewPullParser.getName();
                                                            AbstractC4038mJ.e();
                                                            i2++;
                                                            c4591se0J = c4591se1;
                                                        }
                                                        c4131nOO = c4131nO2;
                                                        c4131nOH = c4131nO3;
                                                    } else if (eventType == 4) {
                                                        c4767ue0.getClass();
                                                        C4767ue0 c4767ue0A = C4767ue0.a(xmlPullParserNewPullParser.getText());
                                                        if (c4767ue0.m == null) {
                                                            c4767ue0.m = new ArrayList();
                                                        }
                                                        c4767ue0.m.add(c4767ue0A);
                                                    } else if (eventType == 3) {
                                                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                                            C4767ue0 c4767ue1 = (C4767ue0) arrayDeque.peek();
                                                            c4767ue1.getClass();
                                                            c5031xe0 = new C5031xe0(c4767ue1, map, map2, map3);
                                                        }
                                                        arrayDeque.pop();
                                                    }
                                                } else if (eventType == 2) {
                                                    i2++;
                                                } else if (eventType == 3) {
                                                    i2--;
                                                }
                                                xmlPullParserNewPullParser.next();
                                            }
                                            if (c5031xe0 != null) {
                                                return c5031xe0;
                                            }
                                            throw new C4671ta0("No TTML subtitles found", 0);
                                        } catch (IOException e2) {
                                            throw new IllegalStateException("Unexpected error when reading input.", e2);
                                        } catch (XmlPullParserException e3) {
                                            throw new C4671ta0("Unable to decode source", e3, 0);
                                        }
                                    }
                                }
