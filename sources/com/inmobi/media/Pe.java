package com.inmobi.media;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.C3381s;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import com.vungle.ads.internal.Constants;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class Pe {
    public static final HashMap f = MapsKt.g(new Pair("Error", "error"), new Pair("Impression", "Impression"), new Pair("ClickTracking", "click"), new Pair("creativeView", "creativeView"), new Pair("start", "start"), new Pair("firstQuartile", "firstQuartile"), new Pair("midpoint", "midpoint"), new Pair("thirdQuartile", "thirdQuartile"), new Pair("complete", "complete"), new Pair("mute", "mute"), new Pair("unmute", "unmute"), new Pair("pause", "pause"), new Pair("resume", "resume"), new Pair(Constants.TEMPLATE_TYPE_FULLSCREEN, Constants.TEMPLATE_TYPE_FULLSCREEN), new Pair("exitFullscreen", "exitFullscreen"), new Pair("closeEndCard", "closeEndCard"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f23083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3333z5 f23084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ue f23085c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23086e;

    public Pe(AdConfig.VastVideoConfig mVastVideoConfig, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(mVastVideoConfig, "mVastVideoConfig");
        this.f23083a = mVastVideoConfig;
        this.f23084b = interfaceC3333z5;
        this.f23085c = new Ue(EmptyList.X, mVastVideoConfig);
    }

    public static boolean b(int i2) {
        return i2 == 3;
    }

    public final Ue a(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23084b;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("Pe", I6.a("Pe", "TAG", "vastXML = ", str));
        }
        try {
            if (TextUtils.isEmpty(str)) {
                c(BaseATView.g.f38290N);
                return this.f23085c;
            }
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            String[] strArr = {"Wrapper", "InLine"};
            a(xmlPullParserNewPullParser, "VAST");
            if ("VAST".equals(xmlPullParserNewPullParser.getName())) {
                a(xmlPullParserNewPullParser, "Ad");
                if ("Ad".equals(xmlPullParserNewPullParser.getName())) {
                    a(xmlPullParserNewPullParser, strArr);
                    if ("InLine".equals(xmlPullParserNewPullParser.getName())) {
                        c(xmlPullParserNewPullParser);
                    } else if ("Wrapper".equals(xmlPullParserNewPullParser.getName())) {
                        f(xmlPullParserNewPullParser);
                    } else {
                        InterfaceC3333z5 interfaceC3333z6 = this.f23084b;
                        if (interfaceC3333z6 != null) {
                            ((A5) interfaceC3333z6).b("Pe", "VAST Schema validation error: InLine node or Wrapper node at appropriate hierarchy not found");
                        }
                        c(101);
                    }
                } else {
                    InterfaceC3333z5 interfaceC3333z7 = this.f23084b;
                    if (interfaceC3333z7 != null) {
                        ((A5) interfaceC3333z7).b("Pe", "VAST Schema validation error: Ad node at appropriate hierarchy not found");
                    }
                    c(BaseATView.g.f38290N);
                }
            } else {
                InterfaceC3333z5 interfaceC3333z8 = this.f23084b;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).b("Pe", "VAST Schema validation error: VAST node at appropriate hierarchy not found");
                }
                c(101);
            }
            return this.f23085c;
        } catch (XmlPullParserException e2) {
            c(100);
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
        } catch (Exception e3) {
            c(com.smartdigimkt.o1.b.z1);
            S5 s6 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e3, "event"));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:249:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:251:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:254:0x0416 A[LOOP:7: B:250:0x03fa->B:254:0x0416, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:357:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:510:0x080c  */
    /* JADX WARN: Code duplicated, block: B:512:0x0814  */
    /* JADX WARN: Code duplicated, block: B:514:0x081b  */
    /* JADX WARN: Code duplicated, block: B:516:0x0827  */
    /* JADX WARN: Code duplicated, block: B:607:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x040a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0839 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void c(XmlPullParser xmlPullParser) {
        String str;
        boolean z2;
        String name;
        String str2;
        boolean z3;
        boolean z4;
        String str3;
        int i2;
        boolean z5;
        String name2;
        String str4;
        String name3;
        String str5;
        String strA;
        List<String> allowedContentType;
        int size;
        int i3;
        String str6;
        int i4;
        String str7;
        boolean z6;
        boolean z7;
        String str8;
        boolean z8;
        int i5;
        int i6;
        String str9;
        String str10;
        String name4;
        String strA2;
        String strA3;
        int i7;
        int size2;
        int i8;
        String strA4;
        String str11 = "getAttributeValue(...)";
        int iD = d(xmlPullParser);
        boolean z9 = false;
        boolean z10 = false;
        while (true) {
            int i9 = 101;
            if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), "InLine") && b(iD)) {
                if (z9 && z10) {
                    return;
                }
                InterfaceC3333z5 interfaceC3333z5 = this.f23084b;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).b("Pe", "VAST Schema validation error: Creatives at appropriate hierarchy  not found");
                }
                c(101);
                return;
            }
            if (xmlPullParser.getName() != null && !b(iD) && (name = xmlPullParser.getName()) != null) {
                switch (name.hashCode()) {
                    case -2077435339:
                        str = str11;
                        z2 = z10;
                        if (name.equals("AdVerifications")) {
                            a(xmlPullParser);
                        }
                        z10 = z2;
                        break;
                    case -1692490108:
                        String str12 = "Creatives";
                        if (!name.equals("Creatives")) {
                            str = str11;
                            z2 = z10;
                            z10 = z2;
                            break;
                        } else {
                            int iD2 = d(xmlPullParser);
                            boolean z11 = false;
                            boolean z12 = false;
                            int i10 = 0;
                            while (true) {
                                if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), str12) && b(iD2)) {
                                    if (!z11) {
                                        InterfaceC3333z5 interfaceC3333z6 = this.f23084b;
                                        if (interfaceC3333z6 != null) {
                                            ((A5) interfaceC3333z6).b("Pe", "VAST Schema validation error: Creative at appropriate hierarchy not found");
                                        }
                                        c(i9);
                                    }
                                    if (!z12) {
                                        InterfaceC3333z5 interfaceC3333z7 = this.f23084b;
                                        if (interfaceC3333z7 != null) {
                                            ((A5) interfaceC3333z7).b("Pe", "VAST Schema validation error: Linear Node at appropriate hierarchy not found");
                                        }
                                        c(201);
                                    }
                                    if (z11 && z12 && i10 != 0) {
                                        str = str11;
                                        z9 = true;
                                        break;
                                    }
                                } else {
                                    if (xmlPullParser.getName() == null || b(iD2) || (name2 = xmlPullParser.getName()) == null) {
                                        str2 = str11;
                                        z3 = z11;
                                        z4 = z10;
                                        str3 = str12;
                                        i2 = i9;
                                        z5 = z12;
                                    } else {
                                        int iHashCode = name2.hashCode();
                                        int i11 = 1;
                                        if (iHashCode != -2018804923) {
                                            if (iHashCode == 1150879268) {
                                                String str13 = "CompanionAds";
                                                if (name2.equals("CompanionAds")) {
                                                    int iD3 = d(xmlPullParser);
                                                    int i12 = 0;
                                                    while (true) {
                                                        if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), str13) && b(iD3)) {
                                                            int size3 = this.f23085c.f23284i.size();
                                                            if (size3 == 0 && this.d) {
                                                                a(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED);
                                                            } else if (i12 > 0 && size3 == 0) {
                                                                a(600);
                                                            }
                                                            str2 = str11;
                                                            z3 = z11;
                                                            z4 = z10;
                                                            str3 = str12;
                                                            z5 = z12;
                                                            i2 = 101;
                                                        } else {
                                                            if (xmlPullParser.getName() != null) {
                                                                String str14 = "Companion";
                                                                if (!"Companion".equals(xmlPullParser.getName()) || b(iD3)) {
                                                                    str7 = str11;
                                                                    z6 = z11;
                                                                    z7 = z10;
                                                                    str12 = str12;
                                                                    str8 = str13;
                                                                } else {
                                                                    i12++;
                                                                    int i13 = iD3;
                                                                    try {
                                                                        String attributeValue = xmlPullParser.getAttributeValue(null, "width");
                                                                        Intrinsics.e(attributeValue, str11);
                                                                        i5 = Integer.parseInt(attributeValue);
                                                                        z6 = z11;
                                                                        try {
                                                                            String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
                                                                            Intrinsics.e(attributeValue2, str11);
                                                                            i6 = Integer.parseInt(attributeValue2);
                                                                        } catch (Exception unused) {
                                                                            InterfaceC3333z5 interfaceC3333z8 = this.f23084b;
                                                                            if (interfaceC3333z8 != null) {
                                                                                ((A5) interfaceC3333z8).b("Pe", "Invalid width or height encountered for a companion and ignoring that.");
                                                                            }
                                                                            i6 = 0;
                                                                        }
                                                                    } catch (Exception unused2) {
                                                                        z6 = z11;
                                                                        i5 = 0;
                                                                    }
                                                                    if (i5 <= 0 || i6 <= 0) {
                                                                        str7 = str11;
                                                                        z7 = z10;
                                                                        str12 = str12;
                                                                        str8 = str13;
                                                                        z8 = z12;
                                                                        iD3 = d(xmlPullParser);
                                                                        z11 = z6;
                                                                        str11 = str7;
                                                                        z10 = z7;
                                                                        str12 = str12;
                                                                        str13 = str8;
                                                                        z12 = z8;
                                                                    } else {
                                                                        str7 = str11;
                                                                        Le le = new Le(i5, i6, xmlPullParser.getAttributeValue(null, "ID"));
                                                                        int iD4 = d(xmlPullParser);
                                                                        String strA5 = null;
                                                                        while (true) {
                                                                            if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), str14) && b(iD4)) {
                                                                                z7 = z10;
                                                                                str12 = str12;
                                                                                str8 = str13;
                                                                            } else {
                                                                                if (xmlPullParser.getName() != null && !b(iD4) && (name4 = xmlPullParser.getName()) != null) {
                                                                                    str9 = strA5;
                                                                                    z7 = z10;
                                                                                    switch (name4.hashCode()) {
                                                                                        case -375340334:
                                                                                            str12 = str12;
                                                                                            str8 = str13;
                                                                                            str10 = str14;
                                                                                            z12 = z12;
                                                                                            if (name4.equals("IFrameResource") && d(xmlPullParser) == 4) {
                                                                                                String text = xmlPullParser.getText();
                                                                                                if (!TextUtils.isEmpty(text)) {
                                                                                                    le.f22959e.add(new Ke((byte) 3, text));
                                                                                                }
                                                                                            }
                                                                                            strA5 = str9;
                                                                                            iD4 = d(xmlPullParser);
                                                                                            z10 = z7;
                                                                                            str12 = str12;
                                                                                            str13 = str8;
                                                                                            str14 = str10;
                                                                                            z12 = z12;
                                                                                            i11 = 1;
                                                                                            break;
                                                                                        case -348198615:
                                                                                            str12 = str12;
                                                                                            str8 = str13;
                                                                                            str10 = str14;
                                                                                            z12 = z12;
                                                                                            if (name4.equals("CompanionClickThrough") && d(xmlPullParser) == 4) {
                                                                                                String text2 = xmlPullParser.getText();
                                                                                                if (text2 == null || text2.length() == 0) {
                                                                                                    strA2 = null;
                                                                                                } else {
                                                                                                    int length = text2.length() - 1;
                                                                                                    boolean z13 = false;
                                                                                                    int i14 = 0;
                                                                                                    while (i14 <= length) {
                                                                                                        boolean z14 = Intrinsics.h(text2.charAt(!z13 ? i14 : length), 32) <= 0;
                                                                                                        if (z13) {
                                                                                                            if (z14) {
                                                                                                                length--;
                                                                                                            } else {
                                                                                                                strA2 = I7.a(length, 1, text2, i14);
                                                                                                            }
                                                                                                        } else if (z14) {
                                                                                                            i14++;
                                                                                                        } else {
                                                                                                            z13 = true;
                                                                                                        }
                                                                                                    }
                                                                                                    strA2 = I7.a(length, 1, text2, i14);
                                                                                                }
                                                                                                if (URLUtil.isValidUrl(strA2)) {
                                                                                                    le.f22958c = strA2;
                                                                                                }
                                                                                            }
                                                                                            strA5 = str9;
                                                                                            iD4 = d(xmlPullParser);
                                                                                            z10 = z7;
                                                                                            str12 = str12;
                                                                                            str13 = str8;
                                                                                            str14 = str10;
                                                                                            z12 = z12;
                                                                                            i11 = 1;
                                                                                            break;
                                                                                        case 611554000:
                                                                                            str12 = str12;
                                                                                            str8 = str13;
                                                                                            str10 = str14;
                                                                                            if (name4.equals("TrackingEvents")) {
                                                                                                int iD5 = d(xmlPullParser);
                                                                                                while (true) {
                                                                                                    if (xmlPullParser.getName() == null || !Intrinsics.a(xmlPullParser.getName(), "TrackingEvents") || !b(iD5)) {
                                                                                                        if (!"Tracking".equals(xmlPullParser.getName()) || b(iD5)) {
                                                                                                            z12 = z12;
                                                                                                        } else {
                                                                                                            int attributeCount = xmlPullParser.getAttributeCount();
                                                                                                            int i15 = 0;
                                                                                                            while (true) {
                                                                                                                if (i15 < attributeCount) {
                                                                                                                    if (Intrinsics.a(xmlPullParser.getAttributeName(i15), "event")) {
                                                                                                                        String attributeValue3 = xmlPullParser.getAttributeValue(i15);
                                                                                                                        if (d(xmlPullParser) == 4) {
                                                                                                                            String text3 = xmlPullParser.getText();
                                                                                                                            if (text3 != null) {
                                                                                                                                int length2 = text3.length() - 1;
                                                                                                                                int i16 = 0;
                                                                                                                                boolean z15 = false;
                                                                                                                                while (true) {
                                                                                                                                    if (i16 <= length2) {
                                                                                                                                        boolean z16 = z15;
                                                                                                                                        z12 = z12;
                                                                                                                                        boolean z17 = Intrinsics.h(text3.charAt(!z15 ? i16 : length2), 32) <= 0;
                                                                                                                                        if (z16) {
                                                                                                                                            if (z17) {
                                                                                                                                                length2--;
                                                                                                                                            }
                                                                                                                                        } else if (z17) {
                                                                                                                                            i16++;
                                                                                                                                        } else {
                                                                                                                                            z15 = true;
                                                                                                                                        }
                                                                                                                                        z15 = z16;
                                                                                                                                    } else {
                                                                                                                                        z12 = z12;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                strA3 = I7.a(length2, 1, text3, i16);
                                                                                                                            } else {
                                                                                                                                z12 = z12;
                                                                                                                                strA3 = null;
                                                                                                                            }
                                                                                                                            if (URLUtil.isValidUrl(strA3)) {
                                                                                                                                String str15 = (String) f.get(attributeValue3);
                                                                                                                                if (str15 == null) {
                                                                                                                                    str15 = "unknown";
                                                                                                                                }
                                                                                                                                String text4 = xmlPullParser.getText();
                                                                                                                                Intrinsics.e(text4, "getText(...)");
                                                                                                                                le.f.add(new U8(text4, 0, str15, null));
                                                                                                                            } else {
                                                                                                                                InterfaceC3333z5 interfaceC3333z9 = this.f23084b;
                                                                                                                                if (interfaceC3333z9 != null) {
                                                                                                                                    ((A5) interfaceC3333z9).b("Pe", android.support.v4.media.a.n("Malformed URL: ", text3, "; Discarding this tracker"));
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i15++;
                                                                                                                    }
                                                                                                                }
                                                                                                                z12 = z12;
                                                                                                            }
                                                                                                        }
                                                                                                        iD5 = d(xmlPullParser);
                                                                                                        z12 = z12;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            z12 = z12;
                                                                                            strA5 = str9;
                                                                                            iD4 = d(xmlPullParser);
                                                                                            z10 = z7;
                                                                                            str12 = str12;
                                                                                            str13 = str8;
                                                                                            str14 = str10;
                                                                                            z12 = z12;
                                                                                            i11 = 1;
                                                                                            break;
                                                                                        case 676623548:
                                                                                            str12 = str12;
                                                                                            str8 = str13;
                                                                                            str10 = str14;
                                                                                            if (name4.equals("StaticResource")) {
                                                                                                String attributeValue4 = xmlPullParser.getAttributeValue(null, "creativeType");
                                                                                                if (d(xmlPullParser) == 4) {
                                                                                                    String text5 = xmlPullParser.getText();
                                                                                                    if (text5 == null || text5.length() == 0) {
                                                                                                        i7 = 1;
                                                                                                        strA5 = null;
                                                                                                    } else {
                                                                                                        int length3 = text5.length() - 1;
                                                                                                        int i17 = 0;
                                                                                                        boolean z18 = false;
                                                                                                        while (i17 <= length3) {
                                                                                                            boolean z19 = Intrinsics.h(text5.charAt(!z18 ? i17 : length3), 32) <= 0;
                                                                                                            if (z18) {
                                                                                                                if (z19) {
                                                                                                                    length3--;
                                                                                                                } else {
                                                                                                                    i7 = 1;
                                                                                                                    strA5 = I7.a(length3, 1, text5, i17);
                                                                                                                }
                                                                                                            } else if (z19) {
                                                                                                                i17++;
                                                                                                            } else {
                                                                                                                z18 = true;
                                                                                                            }
                                                                                                        }
                                                                                                        i7 = 1;
                                                                                                        strA5 = I7.a(length3, 1, text5, i17);
                                                                                                    }
                                                                                                } else {
                                                                                                    i7 = 1;
                                                                                                    strA5 = str9;
                                                                                                }
                                                                                                if (attributeValue4 != null) {
                                                                                                    int length4 = attributeValue4.length() - i7;
                                                                                                    int i18 = 0;
                                                                                                    boolean z20 = false;
                                                                                                    while (i18 <= length4) {
                                                                                                        boolean z21 = Intrinsics.h(attributeValue4.charAt(!z20 ? i18 : length4), 32) <= 0;
                                                                                                        if (z20) {
                                                                                                            if (z21) {
                                                                                                                length4--;
                                                                                                            } else if (attributeValue4.subSequence(i18, length4 + 1).toString().length() > 0) {
                                                                                                                size2 = Le.f22955h.size();
                                                                                                                i8 = 0;
                                                                                                                while (true) {
                                                                                                                    if (i8 < size2) {
                                                                                                                        this.d = true;
                                                                                                                    } else if (attributeValue4.equalsIgnoreCase((String) Le.f22955h.get(i8))) {
                                                                                                                        le.f22959e.add(new Ke((byte) 1, strA5));
                                                                                                                    } else {
                                                                                                                        i8++;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else if (z21) {
                                                                                                            i18++;
                                                                                                        } else {
                                                                                                            z20 = true;
                                                                                                        }
                                                                                                    }
                                                                                                    if (attributeValue4.subSequence(i18, length4 + 1).toString().length() > 0) {
                                                                                                        size2 = Le.f22955h.size();
                                                                                                        i8 = 0;
                                                                                                        while (true) {
                                                                                                            if (i8 < size2) {
                                                                                                                this.d = true;
                                                                                                            } else if (attributeValue4.equalsIgnoreCase((String) Le.f22955h.get(i8))) {
                                                                                                                le.f22959e.add(new Ke((byte) 1, strA5));
                                                                                                            } else {
                                                                                                                i8++;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                iD4 = d(xmlPullParser);
                                                                                                z10 = z7;
                                                                                                str12 = str12;
                                                                                                str13 = str8;
                                                                                                str14 = str10;
                                                                                                z12 = z12;
                                                                                                i11 = 1;
                                                                                            } else {
                                                                                                z12 = z12;
                                                                                                strA5 = str9;
                                                                                                iD4 = d(xmlPullParser);
                                                                                                z10 = z7;
                                                                                                str12 = str12;
                                                                                                str13 = str8;
                                                                                                str14 = str10;
                                                                                                z12 = z12;
                                                                                                i11 = 1;
                                                                                            }
                                                                                            break;
                                                                                        case 1877773523:
                                                                                            if (name4.equals("CompanionClickTracking") && d(xmlPullParser) == 4) {
                                                                                                String text6 = xmlPullParser.getText();
                                                                                                if (text6 == null || text6.length() == 0) {
                                                                                                    str8 = str13;
                                                                                                    str10 = str14;
                                                                                                    strA4 = null;
                                                                                                } else {
                                                                                                    int length5 = text6.length() - 1;
                                                                                                    int i19 = 0;
                                                                                                    int i20 = 0;
                                                                                                    while (true) {
                                                                                                        str8 = str13;
                                                                                                        if (i19 <= length5) {
                                                                                                            str10 = str14;
                                                                                                            int i21 = Intrinsics.h(text6.charAt(i20 == 0 ? i19 : length5), 32) <= 0 ? i11 : 0;
                                                                                                            if (i20 == 0) {
                                                                                                                if (i21 == 0) {
                                                                                                                    i20 = i11;
                                                                                                                } else {
                                                                                                                    i19++;
                                                                                                                }
                                                                                                            } else if (i21 != 0) {
                                                                                                                length5--;
                                                                                                            }
                                                                                                            str13 = str8;
                                                                                                            str14 = str10;
                                                                                                        } else {
                                                                                                            str10 = str14;
                                                                                                        }
                                                                                                    }
                                                                                                    strA4 = I7.a(length5, i11, text6, i19);
                                                                                                }
                                                                                                if (URLUtil.isValidUrl(strA4)) {
                                                                                                    Intrinsics.c(strA4);
                                                                                                    le.f.add(new U8(strA4, 0, "click", null));
                                                                                                    strA5 = strA4;
                                                                                                    iD4 = d(xmlPullParser);
                                                                                                    z10 = z7;
                                                                                                    str12 = str12;
                                                                                                    str13 = str8;
                                                                                                    str14 = str10;
                                                                                                    z12 = z12;
                                                                                                    i11 = 1;
                                                                                                } else {
                                                                                                    InterfaceC3333z5 interfaceC3333z10 = this.f23084b;
                                                                                                    if (interfaceC3333z10 != null) {
                                                                                                        ((A5) interfaceC3333z10).b("Pe", android.support.v4.media.a.n("Malformed URL: ", strA4, "; Discarding this tracker"));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 1928285401:
                                                                                            if (name4.equals("HTMLResource") && d(xmlPullParser) == 4) {
                                                                                                String text7 = xmlPullParser.getText();
                                                                                                if (!TextUtils.isEmpty(text7)) {
                                                                                                    le.f22959e.add(new Ke((byte) 2, text7));
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    str9 = strA5;
                                                                                    z7 = z10;
                                                                                }
                                                                                str12 = str12;
                                                                                str8 = str13;
                                                                                str10 = str14;
                                                                                z12 = z12;
                                                                                strA5 = str9;
                                                                                iD4 = d(xmlPullParser);
                                                                                z10 = z7;
                                                                                str12 = str12;
                                                                                str13 = str8;
                                                                                str14 = str10;
                                                                                z12 = z12;
                                                                                i11 = 1;
                                                                            }
                                                                        }
                                                                        if (le.f22959e.isEmpty()) {
                                                                            iD3 = i13;
                                                                            z11 = z6;
                                                                            str11 = str7;
                                                                            z10 = z7;
                                                                            str12 = str12;
                                                                            str13 = str8;
                                                                        } else {
                                                                            Ue ue = this.f23085c;
                                                                            ue.getClass();
                                                                            ue.f23284i.add(le);
                                                                        }
                                                                    }
                                                                }
                                                                z8 = z12;
                                                                iD3 = d(xmlPullParser);
                                                                z11 = z6;
                                                                str11 = str7;
                                                                z10 = z7;
                                                                str12 = str12;
                                                                str13 = str8;
                                                                z12 = z8;
                                                            } else {
                                                                str7 = str11;
                                                                z6 = z11;
                                                                z7 = z10;
                                                                str12 = str12;
                                                                str8 = str13;
                                                                z8 = z12;
                                                                iD3 = d(xmlPullParser);
                                                                z11 = z6;
                                                                str11 = str7;
                                                                z10 = z7;
                                                                str12 = str12;
                                                                str13 = str8;
                                                                z12 = z8;
                                                            }
                                                            i11 = 1;
                                                        }
                                                        break;
                                                    }
                                                }
                                            } else if (iHashCode == 1885066191 && name2.equals("Creative")) {
                                                str2 = str11;
                                                z4 = z10;
                                                str3 = str12;
                                                z11 = true;
                                                i2 = 101;
                                            }
                                            str2 = str11;
                                            z3 = z11;
                                            z4 = z10;
                                            str3 = str12;
                                            z5 = z12;
                                            i2 = 101;
                                        } else {
                                            str2 = str11;
                                            z3 = z11;
                                            z4 = z10;
                                            str3 = str12;
                                            z5 = z12;
                                            String str16 = null;
                                            int i22 = 0;
                                            String str17 = "Linear";
                                            if (name2.equals("Linear")) {
                                                int iD6 = d(xmlPullParser);
                                                boolean z22 = false;
                                                int i23 = 0;
                                                boolean z23 = false;
                                                while (true) {
                                                    if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), str17) && b(iD6)) {
                                                        if (!z23 || !z22) {
                                                            InterfaceC3333z5 interfaceC3333z11 = this.f23084b;
                                                            if (interfaceC3333z11 != null) {
                                                                ((A5) interfaceC3333z11).b("Pe", "VAST Schema Validation Error.Duration tag not found");
                                                            }
                                                            c(101);
                                                        }
                                                        if (z23 && z22 && i23 != 0) {
                                                            i2 = 101;
                                                            i10 = 1;
                                                        } else {
                                                            i10 = i22;
                                                            i2 = 101;
                                                        }
                                                    } else {
                                                        if (xmlPullParser.getName() == null || b(iD6) || (name3 = xmlPullParser.getName()) == null) {
                                                            str4 = str17;
                                                        } else {
                                                            int iHashCode2 = name3.hashCode();
                                                            if (iHashCode2 == -2049897434) {
                                                                str4 = str17;
                                                                if (name3.equals("VideoClicks")) {
                                                                    a(xmlPullParser, true);
                                                                }
                                                            } else if (iHashCode2 != -1927368268) {
                                                                if (iHashCode2 != -385055469) {
                                                                    if (iHashCode2 == 611554000 && name3.equals("TrackingEvents")) {
                                                                        e(xmlPullParser);
                                                                    }
                                                                } else if (name3.equals("MediaFiles")) {
                                                                    int iD7 = d(xmlPullParser);
                                                                    int i24 = i22;
                                                                    while (true) {
                                                                        if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), "MediaFiles") && b(iD7)) {
                                                                            if (i24 == 0) {
                                                                                c(401);
                                                                            } else {
                                                                                if (this.f23085c.f23282e.isEmpty()) {
                                                                                    c(403);
                                                                                } else {
                                                                                    i4 = 1;
                                                                                }
                                                                                str4 = str17;
                                                                                i23 = i4;
                                                                                z22 = true;
                                                                            }
                                                                            i4 = i22;
                                                                            str4 = str17;
                                                                            i23 = i4;
                                                                            z22 = true;
                                                                        } else {
                                                                            if (xmlPullParser.getName() == null || !"MediaFile".equals(xmlPullParser.getName()) || b(iD7)) {
                                                                                str5 = str17;
                                                                            } else {
                                                                                AdConfig.BitRateConfig bitRate = this.f23083a.getBitRate();
                                                                                int attributeCount2 = xmlPullParser.getAttributeCount();
                                                                                String attributeValue5 = str16;
                                                                                String attributeValue6 = attributeValue5;
                                                                                int i25 = i22;
                                                                                int iIntValue = i25;
                                                                                while (i25 < attributeCount2) {
                                                                                    String attributeName = xmlPullParser.getAttributeName(i25);
                                                                                    if (attributeName != null) {
                                                                                        int iHashCode3 = attributeName.hashCode();
                                                                                        str6 = str17;
                                                                                        if (iHashCode3 != -102270099) {
                                                                                            if (iHashCode3 != 3575610) {
                                                                                                if (iHashCode3 == 823466996 && attributeName.equals(C3381s.g)) {
                                                                                                    attributeValue5 = xmlPullParser.getAttributeValue(i25);
                                                                                                }
                                                                                            } else if (attributeName.equals("type")) {
                                                                                                attributeValue6 = xmlPullParser.getAttributeValue(i25);
                                                                                            }
                                                                                        } else if (attributeName.equals("bitrate")) {
                                                                                            try {
                                                                                                Integer numValueOf = Integer.valueOf(xmlPullParser.getAttributeValue(i25));
                                                                                                Intrinsics.e(numValueOf, "valueOf(...)");
                                                                                                iIntValue = numValueOf.intValue();
                                                                                            } catch (Exception unused3) {
                                                                                                InterfaceC3333z5 interfaceC3333z12 = this.f23084b;
                                                                                                if (interfaceC3333z12 != null) {
                                                                                                    ((A5) interfaceC3333z12).b("Pe", "Invalid value found for BitRate.");
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        str6 = str17;
                                                                                    }
                                                                                    i25++;
                                                                                    str17 = str6;
                                                                                }
                                                                                str5 = str17;
                                                                                int iD8 = d(xmlPullParser);
                                                                                if (iD8 == 4) {
                                                                                    String text8 = xmlPullParser.getText();
                                                                                    if (text8 == null || text8.length() == 0) {
                                                                                        iD8 = iD8;
                                                                                        bitRate = bitRate;
                                                                                        strA = null;
                                                                                    } else {
                                                                                        int length6 = text8.length() - 1;
                                                                                        int i26 = 0;
                                                                                        boolean z24 = false;
                                                                                        while (true) {
                                                                                            iD8 = iD8;
                                                                                            if (i26 <= length6) {
                                                                                                bitRate = bitRate;
                                                                                                boolean z25 = Intrinsics.h(text8.charAt(!z24 ? i26 : length6), 32) <= 0;
                                                                                                if (z24) {
                                                                                                    if (z25) {
                                                                                                        length6--;
                                                                                                    }
                                                                                                } else if (z25) {
                                                                                                    i26++;
                                                                                                } else {
                                                                                                    z24 = true;
                                                                                                }
                                                                                            } else {
                                                                                                bitRate = bitRate;
                                                                                            }
                                                                                        }
                                                                                        strA = I7.a(length6, 1, text8, i26);
                                                                                    }
                                                                                    if (URLUtil.isValidUrl(strA) && ((!bitRate.getBitrate_mandatory() || iIntValue > 0) && attributeValue5 != null)) {
                                                                                        int length7 = attributeValue5.length() - 1;
                                                                                        int i27 = 0;
                                                                                        boolean z26 = false;
                                                                                        while (i27 <= length7) {
                                                                                            boolean z27 = Intrinsics.h(attributeValue5.charAt(!z26 ? i27 : length7), 32) <= 0;
                                                                                            if (z26) {
                                                                                                if (z27) {
                                                                                                    length7--;
                                                                                                } else {
                                                                                                    if (!StringsKt.r(I7.a(length7, 1, attributeValue5, i27), "Progressive", true)) {
                                                                                                        allowedContentType = this.f23083a.getAllowedContentType();
                                                                                                        if (attributeValue6 != null) {
                                                                                                            size = allowedContentType.size();
                                                                                                            for (i3 = 0; i3 < size; i3++) {
                                                                                                                if (attributeValue6.equalsIgnoreCase(allowedContentType.get(i3))) {
                                                                                                                    Ue ue2 = this.f23085c;
                                                                                                                    Intrinsics.c(strA);
                                                                                                                    Me me2 = new Me(strA, iIntValue);
                                                                                                                    ue2.getClass();
                                                                                                                    ue2.f23282e.add(me2);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    str16 = null;
                                                                                                    i22 = 0;
                                                                                                }
                                                                                            } else if (z27) {
                                                                                                i27++;
                                                                                            } else {
                                                                                                z26 = true;
                                                                                            }
                                                                                        }
                                                                                        if (!StringsKt.r(I7.a(length7, 1, attributeValue5, i27), "Progressive", true)) {
                                                                                            allowedContentType = this.f23083a.getAllowedContentType();
                                                                                            if (attributeValue6 != null) {
                                                                                                size = allowedContentType.size();
                                                                                                while (i3 < size) {
                                                                                                    if (attributeValue6.equalsIgnoreCase(allowedContentType.get(i3))) {
                                                                                                        Ue ue3 = this.f23085c;
                                                                                                        Intrinsics.c(strA);
                                                                                                        Me me3 = new Me(strA, iIntValue);
                                                                                                        ue3.getClass();
                                                                                                        ue3.f23282e.add(me3);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        str16 = null;
                                                                                        i22 = 0;
                                                                                    }
                                                                                    str17 = str5;
                                                                                    iD7 = iD8;
                                                                                    i24 = 1;
                                                                                    str16 = null;
                                                                                    i22 = 0;
                                                                                }
                                                                                i24 = 1;
                                                                            }
                                                                            iD7 = d(xmlPullParser);
                                                                            str17 = str5;
                                                                            str16 = null;
                                                                            i22 = 0;
                                                                        }
                                                                    }
                                                                }
                                                                str4 = str17;
                                                            } else {
                                                                str4 = str17;
                                                                if (name3.equals("Duration")) {
                                                                    if (d(xmlPullParser) == 4) {
                                                                        String text9 = xmlPullParser.getText();
                                                                        if (!TextUtils.isEmpty(text9)) {
                                                                            Intrinsics.c(text9);
                                                                            if (new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").b(text9)) {
                                                                                this.f23085c.g = text9;
                                                                                z23 = true;
                                                                            }
                                                                        }
                                                                        InterfaceC3333z5 interfaceC3333z13 = this.f23084b;
                                                                        if (interfaceC3333z13 != null) {
                                                                            ((A5) interfaceC3333z13).b("Pe", android.support.v4.media.a.n("VAST Schema Validation Error. ", text9, " Media Duration invalid."));
                                                                        }
                                                                        i2 = 101;
                                                                        c(101);
                                                                        i10 = 0;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        iD6 = d(xmlPullParser);
                                                        str17 = str4;
                                                        str16 = null;
                                                        i22 = 0;
                                                    }
                                                    z11 = z3;
                                                    z12 = true;
                                                }
                                            } else {
                                                i2 = 101;
                                            }
                                        }
                                        iD2 = d(xmlPullParser);
                                        i9 = i2;
                                        str11 = str2;
                                        z10 = z4;
                                        str12 = str3;
                                    }
                                    z11 = z3;
                                    z12 = z5;
                                    iD2 = d(xmlPullParser);
                                    i9 = i2;
                                    str11 = str2;
                                    z10 = z4;
                                    str12 = str3;
                                }
                            }
                        }
                        break;
                    case 67232232:
                        if (name.equals("Error")) {
                            d(xmlPullParser);
                            String text10 = xmlPullParser.getText();
                            Intrinsics.e(text10, "getText(...)");
                            a("error", text10);
                        }
                        str = str11;
                        z2 = z10;
                        z10 = z2;
                        break;
                    case 184043572:
                        if (name.equals("Extensions")) {
                            b(xmlPullParser);
                        }
                        str = str11;
                        z2 = z10;
                        z10 = z2;
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            int iD9 = d(xmlPullParser);
                            if (iD9 == 4) {
                                String text11 = xmlPullParser.getText();
                                Intrinsics.e(text11, "getText(...)");
                                a("Impression", text11);
                                str = str11;
                                z10 = true;
                            } else {
                                InterfaceC3333z5 interfaceC3333z14 = this.f23084b;
                                if (interfaceC3333z14 != null) {
                                    ((A5) interfaceC3333z14).b("Pe", X8.a("Pe", "TAG", "VAST Schema Error: VastAdTagUri at appropriate hierarchy not found or invalid - ", iD9));
                                }
                            }
                        }
                        str = str11;
                        z2 = z10;
                        z10 = z2;
                        break;
                    default:
                        str = str11;
                        z2 = z10;
                        z10 = z2;
                        break;
                }
                return;
            }
            str = str11;
            z2 = z10;
            z10 = z2;
            iD = d(xmlPullParser);
            str11 = str;
        }
    }

    public final int d(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException unused) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23084b;
            if (interfaceC3333z5 == null) {
                return -1;
            }
            ((A5) interfaceC3333z5).b("Pe", "Parsing failed.");
            return -1;
        } catch (XmlPullParserException unused2) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23084b;
            if (interfaceC3333z6 == null) {
                return -1;
            }
            ((A5) interfaceC3333z6).b("Pe", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
            return -1;
        }
    }

    public final void e(XmlPullParser xmlPullParser) {
        int iD = d(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), "TrackingEvents") && b(iD)) {
                return;
            }
            if (xmlPullParser.getName() != null && "Tracking".equals(xmlPullParser.getName()) && !b(iD)) {
                int attributeCount = xmlPullParser.getAttributeCount();
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    if (Intrinsics.a(xmlPullParser.getAttributeName(i2), "event")) {
                        String attributeValue = xmlPullParser.getAttributeValue(i2);
                        if (d(xmlPullParser) != 4) {
                            break;
                        }
                        HashMap map = f;
                        if (!map.containsKey(attributeValue)) {
                            break;
                        }
                        Object obj = map.get(attributeValue);
                        Intrinsics.c(obj);
                        String text = xmlPullParser.getText();
                        Intrinsics.e(text, "getText(...)");
                        a((String) obj, text);
                        break;
                    }
                }
            }
            iD = d(xmlPullParser);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void f(XmlPullParser xmlPullParser) {
        String name;
        String strA;
        int i2 = this.f23086e + 1;
        this.f23086e = i2;
        if (i2 > this.f23083a.getMaxWrapperLimit()) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23084b;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("Pe", "Schema Validation Error:Max VAST wrapper limit exceeded");
            }
            c(302);
            return;
        }
        int iD = d(xmlPullParser);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), "Wrapper") && b(iD)) {
                if (z2 && z3) {
                    return;
                }
                InterfaceC3333z5 interfaceC3333z6 = this.f23084b;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).b("Pe", "VAST Wrapper Error: VastAdTagUri at appropriate hierarchy not found or invalid");
                }
                c(101);
                return;
            }
            if (xmlPullParser.getName() != null && !b(iD) && (name = xmlPullParser.getName()) != null) {
                switch (name.hashCode()) {
                    case -2077435339:
                        if (name.equals("AdVerifications")) {
                            a(xmlPullParser);
                        }
                        break;
                    case -2049897434:
                        if (name.equals("VideoClicks")) {
                            a(xmlPullParser, false);
                        }
                        break;
                    case -587420703:
                        if (!name.equals("VASTAdTagURI")) {
                            continue;
                        } else {
                            if (d(xmlPullParser) != 4) {
                                InterfaceC3333z5 interfaceC3333z7 = this.f23084b;
                                if (interfaceC3333z7 != null) {
                                    ((A5) interfaceC3333z7).b("Pe", "VAST Wrapper Error: VastAdTagUri at appropriate hierarchy not found or invalid");
                                }
                                c(101);
                                return;
                            }
                            String text = xmlPullParser.getText();
                            if (text == null || text.length() == 0) {
                                strA = null;
                            } else {
                                int length = text.length() - 1;
                                int i3 = 0;
                                boolean z4 = false;
                                while (i3 <= length) {
                                    boolean z5 = Intrinsics.h(text.charAt(!z4 ? i3 : length), 32) <= 0;
                                    if (z4) {
                                        if (z5) {
                                            length--;
                                        } else {
                                            strA = I7.a(length, 1, text, i3);
                                        }
                                    } else if (z5) {
                                        i3++;
                                    } else {
                                        z4 = true;
                                    }
                                }
                                strA = I7.a(length, 1, text, i3);
                            }
                            if (strA == null) {
                                InterfaceC3333z5 interfaceC3333z8 = this.f23084b;
                                if (interfaceC3333z8 != null) {
                                    ((A5) interfaceC3333z8).b("Pe", "VAST Wrapper Error: VastAdTagUri at appropriate hierarchy not found or invalid");
                                }
                                c(300);
                                return;
                            }
                            if (URLUtil.isValidUrl(strA)) {
                                N9 n9 = new N9(strA, this.f23084b);
                                n9.t = false;
                                n9.f23014u = false;
                                n9.x = false;
                                n9.r = true;
                                P9 p9B = n9.b();
                                if (p9B.b()) {
                                    c(301);
                                } else {
                                    a(p9B.a());
                                }
                            } else {
                                c(300);
                            }
                            if (this.f23085c.f23285l != 0) {
                                return;
                            } else {
                                z2 = true;
                            }
                        }
                        break;
                    case 67232232:
                        if (name.equals("Error") && d(xmlPullParser) == 4) {
                            String text2 = xmlPullParser.getText();
                            Intrinsics.e(text2, "getText(...)");
                            a("error", text2);
                        }
                        break;
                    case 184043572:
                        if (name.equals("Extensions")) {
                            b(xmlPullParser);
                        }
                        break;
                    case 611554000:
                        if (name.equals("TrackingEvents")) {
                            e(xmlPullParser);
                        }
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            int iD2 = d(xmlPullParser);
                            if (iD2 != 4) {
                                InterfaceC3333z5 interfaceC3333z9 = this.f23084b;
                                if (interfaceC3333z9 != null) {
                                    ((A5) interfaceC3333z9).b("Pe", X8.a("Pe", "TAG", "VAST Wrapper Error: VastAdTagUri at appropriate hierarchy not found or invalid - ", iD2));
                                }
                            } else {
                                String text3 = xmlPullParser.getText();
                                Intrinsics.e(text3, "getText(...)");
                                a("Impression", text3);
                                z3 = true;
                            }
                        }
                        break;
                }
            }
            iD = d(xmlPullParser);
        }
    }

    public final void b(XmlPullParser xmlPullParser) {
        int iD = d(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), "Extensions") && b(iD)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(iD)) {
                String name = xmlPullParser.getName();
                if (Intrinsics.a(name, "CompanionAdTracking")) {
                    int iD2 = d(xmlPullParser);
                    while (true) {
                        if (xmlPullParser.getName() == null || !Intrinsics.a(xmlPullParser.getName(), "CompanionAdTracking") || !b(iD2)) {
                            if (xmlPullParser.getName() != null && !b(iD2) && "TrackingEvents".equals(xmlPullParser.getName())) {
                                e(xmlPullParser);
                            }
                            iD2 = d(xmlPullParser);
                        }
                    }
                } else if (Intrinsics.a(name, "Extension") && Intrinsics.a(xmlPullParser.getAttributeValue(null, "type"), "AdVerifications")) {
                    a(xmlPullParser);
                }
            }
            iD = d(xmlPullParser);
        }
    }

    public final void a(XmlPullParser xmlPullParser, String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23084b;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("Pe", "name=".concat(str));
        }
        int next = 0;
        while (true) {
            try {
                next = xmlPullParser.next();
            } catch (IOException e2) {
                InterfaceC3333z5 interfaceC3333z6 = this.f23084b;
                if (interfaceC3333z6 != null) {
                    StringBuilder sbA = H6.a("Pe", "TAG", "Parsing failed. ");
                    sbA.append(Arrays.toString(e2.getStackTrace()));
                    ((A5) interfaceC3333z6).b("Pe", sbA.toString());
                }
            } catch (XmlPullParserException e3) {
                InterfaceC3333z5 interfaceC3333z7 = this.f23084b;
                if (interfaceC3333z7 != null) {
                    StringBuilder sbA2 = H6.a("Pe", "TAG", "VAST Schema validation error: VAST node at appropriate hierarchy not found. ");
                    sbA2.append(Arrays.toString(e3.getStackTrace()));
                    ((A5) interfaceC3333z7).b("Pe", sbA2.toString());
                }
            }
            if (next == 1) {
                return;
            }
            if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), str)) {
                return;
            }
        }
    }

    public final void a(XmlPullParser xmlPullParser, String[] strArr) {
        int next = 0;
        boolean z2 = false;
        do {
            try {
                next = xmlPullParser.next();
            } catch (IOException unused) {
                InterfaceC3333z5 interfaceC3333z5 = this.f23084b;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).b("Pe", "Parsing failed.");
                }
            } catch (XmlPullParserException unused2) {
                InterfaceC3333z5 interfaceC3333z6 = this.f23084b;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).b("Pe", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
                }
            }
            if (next == 1) {
                return;
            }
            if (xmlPullParser.getName() != null) {
                for (String str : strArr) {
                    if (Intrinsics.a(xmlPullParser.getName(), str)) {
                        z2 = true;
                        break;
                    }
                }
            }
        } while (!z2);
    }

    public final void a(XmlPullParser xmlPullParser, boolean z2) {
        String strA;
        int iD = d(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), "VideoClicks") && b(iD)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(iD)) {
                String name = xmlPullParser.getName();
                if (Intrinsics.a(name, "ClickThrough")) {
                    if (!z2) {
                        return;
                    }
                    if (d(xmlPullParser) == 4) {
                        String text = xmlPullParser.getText();
                        if (text == null || text.length() == 0) {
                            strA = null;
                        } else {
                            int length = text.length() - 1;
                            int i2 = 0;
                            boolean z3 = false;
                            while (i2 <= length) {
                                boolean z4 = Intrinsics.h(text.charAt(!z3 ? i2 : length), 32) <= 0;
                                if (z3) {
                                    if (!z4) {
                                        break;
                                    } else {
                                        length--;
                                    }
                                } else if (z4) {
                                    i2++;
                                } else {
                                    z3 = true;
                                }
                            }
                            strA = I7.a(length, 1, text, i2);
                        }
                        this.f23085c.k = strA;
                    }
                } else if (Intrinsics.a(name, "ClickTracking") && d(xmlPullParser) == 4) {
                    String text2 = xmlPullParser.getText();
                    Intrinsics.e(text2, "getText(...)");
                    a("click", text2);
                }
            }
            iD = d(xmlPullParser);
        }
    }

    public final void a(XmlPullParser xmlPullParser) {
        String attributeValue;
        int iD;
        int iD2 = d(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), "AdVerifications") && b(iD2)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(iD2) && Intrinsics.a(xmlPullParser.getName(), "Verification") && (attributeValue = xmlPullParser.getAttributeValue(null, "vendor")) != null) {
                int iD3 = d(xmlPullParser);
                String strA = null;
                String string = null;
                while (true) {
                    if (xmlPullParser.getName() != null && Intrinsics.a(xmlPullParser.getName(), "Verification") && b(iD3)) {
                        break;
                    }
                    if (xmlPullParser.getName() != null && !b(iD3)) {
                        String name = xmlPullParser.getName();
                        if (Intrinsics.a(name, "JavaScriptResource")) {
                            String attributeValue2 = xmlPullParser.getAttributeValue(null, "apiFramework");
                            if (attributeValue2 != null && StringsKt.M(attributeValue2, "omid", false) && d(xmlPullParser) == 4) {
                                String text = xmlPullParser.getText();
                                if (text == null || text.length() == 0) {
                                    strA = null;
                                } else {
                                    int length = text.length() - 1;
                                    int i2 = 0;
                                    boolean z2 = false;
                                    while (i2 <= length) {
                                        boolean z3 = Intrinsics.h(text.charAt(!z2 ? i2 : length), 32) <= 0;
                                        if (z2) {
                                            if (!z3) {
                                                break;
                                            } else {
                                                length--;
                                            }
                                        } else if (z3) {
                                            i2++;
                                        } else {
                                            z2 = true;
                                        }
                                    }
                                    strA = I7.a(length, 1, text, i2);
                                }
                            }
                        } else if (Intrinsics.a(name, "VerificationParameters") && ((iD = d(xmlPullParser)) == 4 || iD == 5)) {
                            String text2 = xmlPullParser.getText();
                            if (text2 == null || text2.length() == 0) {
                                string = null;
                            } else {
                                String text3 = xmlPullParser.getText();
                                Intrinsics.e(text3, "getText(...)");
                                string = StringsKt.a0(text3).toString();
                            }
                        }
                    }
                    iD3 = d(xmlPullParser);
                }
                if (URLUtil.isValidUrl(strA)) {
                    Intrinsics.c(strA);
                    C3051ha c3051ha = new C3051ha(attributeValue, string, strA, null);
                    Ue ue = this.f23085c;
                    ue.getClass();
                    ue.f23283h.add(c3051ha);
                    InterfaceC3333z5 interfaceC3333z5 = this.f23084b;
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).b("Pe", "Omid JavaScript URL found inside VAST : ".concat(strA));
                    }
                }
            }
            iD2 = d(xmlPullParser);
        }
    }

    public final void a(int i2) {
        HashMap map = new HashMap();
        map.put("[ERRORCODE]", String.valueOf(i2));
        for (U8 u8 : this.f23085c.f23283h) {
            if ("error".equals(u8.f23265b)) {
                C3298x2.f24089a.a(T9.a(u8.d, map), u8.f23266c, true, null, Ta.f23233c, this.f23084b);
            }
        }
    }

    public final void a(String str, String str2) {
        String strA;
        if (str2.length() == 0) {
            strA = null;
        } else {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.h(str2.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            strA = I7.a(length, 1, str2, i2);
        }
        if (!URLUtil.isValidUrl(strA)) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23084b;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("Pe", android.support.v4.media.a.n("Malformed URL ", strA, " Discarding this tracker"));
            }
            Intrinsics.a(str, "Impression");
            return;
        }
        Intrinsics.c(strA);
        U8 u8 = new U8(strA, 0, str, null);
        Ue ue = this.f23085c;
        ue.getClass();
        ue.f23283h.add(u8);
    }

    public final void c(int i2) {
        this.f23085c.f23285l = i2;
        a(i2);
    }
}
