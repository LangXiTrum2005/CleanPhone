package com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    public static double LD(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String[] strArrSplit = JXs.LD(xmlPullParser, "Duration").split(":");
        if (strArrSplit.length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(strArrSplit[1].trim()) * 60) + (Integer.parseInt(strArrSplit[0].trim()) * 3600) + Float.parseFloat(strArrSplit[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    public static void Lxb(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb, int i, double d) throws XmlPullParserException, IOException {
        boolean z = false;
        while (true) {
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z && TextUtils.isEmpty(lxb.ebl())) {
                        JXs.Lxb(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.getClass();
                    switch (name) {
                        case "VideoClicks":
                            Lxb(xmlPullParser, lxb);
                            break;
                        case "Duration":
                            lxb.Lxb(LD(xmlPullParser));
                            break;
                        case "MediaFiles":
                            Lxb(xmlPullParser, i, d, lxb);
                            z = true;
                            break;
                        case "Icons":
                            com.bytedance.sdk.openadsdk.core.sLN.LD ldLxb = Lxb(xmlPullParser);
                            if (ldLxb != null && lxb.LD() == null) {
                                lxb.Lxb(ldLxb);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "TrackingEvents":
                            Lxb(xmlPullParser, lxb.Lxb());
                            break;
                        default:
                            JXs.Lxb(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> lk(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return JXs.Lxb(xmlPullParser, "Tracking");
    }

    private static String Lxb(XmlPullParser xmlPullParser, int i, double d, com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb) throws XmlPullParserException, IOException {
        double d2 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = JXs.ebl;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int iLD = JXs.LD(xmlPullParser.getAttributeValue(str2, "width"));
                int iLD2 = JXs.LD(xmlPullParser.getAttributeValue(str2, "height"));
                int iLD3 = JXs.LD(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String strLD = JXs.LD(xmlPullParser, "MediaFile");
                if (iLD > 0 && iLD2 > 0 && com.bytedance.sdk.openadsdk.core.sLN.lk.ZU.Lxb.contains(attributeValue) && !TextUtils.isEmpty(strLD)) {
                    double dLxb = com.bytedance.sdk.openadsdk.core.sLN.lk.ZU.Lxb(i, d, iLD, iLD2, iLD3, attributeValue);
                    if (dLxb > d2) {
                        str = strLD;
                        d2 = dLxb;
                        i2 = iLD;
                        i3 = iLD2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            lxb.ZU(str);
            lxb.Lxb(i2);
            lxb.LD(i3);
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0104. Please report as an issue. */
    public static com.bytedance.sdk.openadsdk.core.sLN.LD Lxb(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb;
        ArrayList arrayList2;
        com.bytedance.sdk.openadsdk.core.sLN.LD ld = null;
        while (true) {
            int i = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return ld;
            }
            xmlPullParser.next();
            int i2 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                String str = JXs.ebl;
                int iLD = JXs.LD(xmlPullParser.getAttributeValue(str, "width"));
                int iLD2 = JXs.LD(xmlPullParser.getAttributeValue(str, "height"));
                if (iLD > 0 && iLD <= 300 && iLD2 > 0 && iLD2 <= 300) {
                    int iLxb = com.bytedance.sdk.openadsdk.core.sLN.LD.Lxb.Lxb(xmlPullParser.getAttributeValue(str, TypedValues.CycleType.S_WAVE_OFFSET));
                    int iLxb2 = com.bytedance.sdk.openadsdk.core.sLN.LD.Lxb.Lxb(xmlPullParser.getAttributeValue(str, "duration"));
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    JXs.Lxb lxb = null;
                    String strLD = null;
                    while (true) {
                        if (xmlPullParser.next() == i && xmlPullParser.getName().equals("Icon")) {
                            if (lxb != null && (ld == null || TextUtils.isEmpty(ld.lc()))) {
                                ld = new com.bytedance.sdk.openadsdk.core.sLN.LD(iLD, iLD2, iLxb, iLxb2, lxb.LD, lxb.lk, lxb.Lxb, arrayList3, arrayList4, strLD);
                                JXs.Lxb(xmlPullParser, "Icons", i);
                            }
                        } else {
                            arrayList3 = arrayList3;
                            ArrayList arrayList5 = arrayList4;
                            if (xmlPullParser.getEventType() == i2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "IconViewTracking":
                                        arrayList = arrayList5;
                                        arrayList.add(new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(JXs.LD(xmlPullParser, "IconViewTracking")).Lxb());
                                        break;
                                    case "IFrameResource":
                                        arrayList3 = arrayList3;
                                        if (lxb == null) {
                                            lxb = new JXs.Lxb(JXs.LD(xmlPullParser, "IFrameResource"), com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.NONE, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.IFRAME_RESOURCE);
                                        } else {
                                            JXs.Lxb(xmlPullParser);
                                        }
                                        arrayList4 = arrayList5;
                                        break;
                                    case "StaticResource":
                                        arrayList3 = arrayList3;
                                        com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb2 = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(JXs.ebl, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.Lxb;
                                        String strLD2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.contains(lowerCase)) ? JXs.LD(xmlPullParser, "StaticResource") : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0111Lxb = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.IMAGE;
                                        } else {
                                            enumC0111Lxb = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.JAVASCRIPT;
                                        }
                                        lxb = new JXs.Lxb(strLD2, enumC0111Lxb, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.STATIC_RESOURCE);
                                        arrayList4 = arrayList5;
                                        break;
                                    case "IconClicks":
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                arrayList3 = arrayList3;
                                                arrayList4 = arrayList5;
                                            } else {
                                                if (xmlPullParser.getEventType() == 2) {
                                                    if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                        strLD = JXs.LD(xmlPullParser, "IconClickThrough");
                                                    } else {
                                                        if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                            arrayList2 = arrayList3;
                                                            arrayList2.add(new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(JXs.LD(xmlPullParser, "IconClickTracking")).Lxb());
                                                        }
                                                        arrayList3 = arrayList2;
                                                    }
                                                }
                                                arrayList2 = arrayList3;
                                                arrayList3 = arrayList2;
                                            }
                                            break;
                                        }
                                        break;
                                    case "HTMLResource":
                                        if (lxb == null || lxb.lk == com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.IFRAME_RESOURCE) {
                                            lxb = new JXs.Lxb(JXs.LD(xmlPullParser, "HTMLResource"), com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.NONE, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.HTML_RESOURCE);
                                            arrayList3 = arrayList3;
                                        } else {
                                            arrayList3 = arrayList3;
                                            JXs.Lxb(xmlPullParser);
                                        }
                                        arrayList4 = arrayList5;
                                        break;
                                    default:
                                        arrayList3 = arrayList3;
                                        JXs.Lxb(xmlPullParser);
                                        arrayList4 = arrayList5;
                                        break;
                                }
                                i = 3;
                                i2 = 2;
                            } else {
                                arrayList = arrayList5;
                            }
                            arrayList4 = arrayList;
                            i = 3;
                            i2 = 2;
                        }
                    }
                } else {
                    JXs.Lxb(xmlPullParser);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    public static void Lxb(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.sLN.ZU zu) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(JXs.ebl, NotificationCompat.CATEGORY_EVENT);
                    if (TextUtils.isEmpty(attributeValue)) {
                        JXs.Lxb(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "midpoint":
                                zu.Lxb(JXs.LD(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case "thirdQuartile":
                                zu.Lxb(JXs.LD(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case "resume":
                                zu.lk(lk(xmlPullParser));
                                break;
                            case "unmute":
                                zu.sLN(lk(xmlPullParser));
                                break;
                            case "complete":
                                zu.ZU(lk(xmlPullParser));
                                break;
                            case "mute":
                                zu.JVA(lk(xmlPullParser));
                                break;
                            case "skip":
                                zu.lc(lk(xmlPullParser));
                                break;
                            case "close":
                                zu.JXs(lk(xmlPullParser));
                                break;
                            case "pause":
                                zu.LD(lk(xmlPullParser));
                                break;
                            case "start":
                            case "creativeView":
                                zu.Lxb(JXs.LD(xmlPullParser, "Tracking"), 0L);
                                break;
                            case "firstQuartile":
                                zu.Lxb(JXs.LD(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    JXs.Lxb(xmlPullParser);
                }
            }
        }
    }

    private static void Lxb(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (name.equals("ClickThrough")) {
                    lxb.lk(JXs.LD(xmlPullParser, "ClickThrough"));
                } else if (!name.equals("ClickTracking")) {
                    JXs.Lxb(xmlPullParser);
                } else {
                    lxb.Lxb().ebl(JXs.Lxb(xmlPullParser, "ClickTracking"));
                }
            }
        }
    }
}
