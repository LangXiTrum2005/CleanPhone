package com.bytedance.sdk.openadsdk.core.aw.ri.ri;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> ik(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return ri(xmlPullParser, false);
    }

    public static double lr(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String[] strArrSplit = fi.lr(xmlPullParser, "Duration").split(":");
        if (strArrSplit.length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(strArrSplit[0].trim()) * 3600) + (Integer.parseInt(strArrSplit[1].trim()) * 60) + Float.parseFloat(strArrSplit[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static void ri(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.aw.ri riVar, int i, double d) throws XmlPullParserException, IOException {
        boolean z = false;
        while (true) {
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z && TextUtils.isEmpty(riVar.xha())) {
                        fi.ri(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.getClass();
                    switch (name) {
                        case "VideoClicks":
                            ri(xmlPullParser, riVar);
                            break;
                        case "Duration":
                            riVar.ri(lr(xmlPullParser));
                            break;
                        case "MediaFiles":
                            ri(xmlPullParser, i, d, riVar);
                            z = true;
                            break;
                        case "Icons":
                            com.bytedance.sdk.openadsdk.core.aw.lr lrVarRi = ri(xmlPullParser);
                            if (lrVarRi != null && riVar.lr() == null) {
                                riVar.ri(lrVarRi);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "TrackingEvents":
                            ri(xmlPullParser, riVar.ri());
                            break;
                        default:
                            fi.ri(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    private static String ri(XmlPullParser xmlPullParser, int i, double d, com.bytedance.sdk.openadsdk.core.aw.ri riVar) throws XmlPullParserException, IOException {
        double d2 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = fi.xha;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int iLr = fi.lr(xmlPullParser.getAttributeValue(str2, "width"));
                int iLr2 = fi.lr(xmlPullParser.getAttributeValue(str2, "height"));
                int iLr3 = fi.lr(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String strLr = fi.lr(xmlPullParser, "MediaFile");
                if (iLr > 0 && iLr2 > 0 && com.bytedance.sdk.openadsdk.core.aw.ik.ka.ri.contains(attributeValue) && !TextUtils.isEmpty(strLr)) {
                    double dRi = com.bytedance.sdk.openadsdk.core.aw.ik.ka.ri(i, d, iLr, iLr2, iLr3, attributeValue);
                    if (dRi > d2) {
                        str = strLr;
                        d2 = dRi;
                        i2 = iLr;
                        i3 = iLr2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            riVar.ka(str);
            riVar.ri(i2);
            riVar.lr(i3);
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    public static com.bytedance.sdk.openadsdk.core.aw.lr ri(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        com.bytedance.sdk.openadsdk.core.aw.lr lrVar;
        int i;
        int i2;
        int i3;
        com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri;
        com.bytedance.sdk.openadsdk.core.aw.lr lrVar2 = null;
        while (true) {
            int i4 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return lrVar2;
            }
            xmlPullParser.next();
            int i5 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                String str = fi.xha;
                int iLr = fi.lr(xmlPullParser.getAttributeValue(str, "width"));
                int iLr2 = fi.lr(xmlPullParser.getAttributeValue(str, "height"));
                if (iLr > 0 && iLr <= 300 && iLr2 > 0 && iLr2 <= 300) {
                    int iRi = com.bytedance.sdk.openadsdk.core.aw.lr.ri.ri(xmlPullParser.getAttributeValue(str, "offset"));
                    int iRi2 = com.bytedance.sdk.openadsdk.core.aw.lr.ri.ri(xmlPullParser.getAttributeValue(str, IronSourceConstants.EVENTS_DURATION));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    fi.ri riVar = null;
                    String strLr = null;
                    while (true) {
                        if (xmlPullParser.next() == i4 && xmlPullParser.getName().equals("Icon")) {
                            if (riVar != null && (lrVar2 == null || TextUtils.isEmpty(lrVar2.fi()))) {
                                lrVar2 = new com.bytedance.sdk.openadsdk.core.aw.lr(iLr, iLr2, iRi, iRi2, riVar.lr, riVar.ik, riVar.ri, arrayList, arrayList2, strLr);
                                fi.ri(xmlPullParser, "Icons", i4);
                            }
                        } else {
                            ArrayList arrayList3 = arrayList;
                            ArrayList arrayList4 = arrayList2;
                            if (xmlPullParser.getEventType() == i5) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                lrVar = lrVar2;
                                i = iRi2;
                                switch (name) {
                                    case "IconViewTracking":
                                        i2 = 3;
                                        i3 = 2;
                                        arrayList4.add(new com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(fi.lr(xmlPullParser, "IconViewTracking")).ri());
                                        break;
                                    case "IFrameResource":
                                        i2 = 3;
                                        i3 = 2;
                                        if (riVar == null) {
                                            riVar = new fi.ri(fi.lr(xmlPullParser, "IFrameResource"), com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.NONE, com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.IFRAME_RESOURCE);
                                            break;
                                        } else {
                                            fi.ri(xmlPullParser);
                                            break;
                                        }
                                        break;
                                    case "StaticResource":
                                        i2 = 3;
                                        i3 = 2;
                                        com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri2 = com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(fi.xha, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.aw.ik.ri.ri;
                                        String strLr2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.contains(lowerCase)) ? fi.lr(xmlPullParser, "StaticResource") : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0228ri = com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.IMAGE;
                                        } else {
                                            enumC0228ri = com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.JAVASCRIPT;
                                        }
                                        riVar = new fi.ri(strLr2, enumC0228ri, com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.STATIC_RESOURCE);
                                        break;
                                    case "IconClicks":
                                        while (true) {
                                            i2 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                i3 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                    strLr = fi.lr(xmlPullParser, "IconClickThrough");
                                                } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                    arrayList3.add(new com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(fi.lr(xmlPullParser, "IconClickTracking")).ri());
                                                }
                                            }
                                        }
                                        break;
                                    case "HTMLResource":
                                        if (riVar == null || riVar.ik == com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.IFRAME_RESOURCE) {
                                            riVar = new fi.ri(fi.lr(xmlPullParser, "HTMLResource"), com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.NONE, com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.HTML_RESOURCE);
                                            lrVar2 = lrVar;
                                            iRi2 = i;
                                            i4 = 3;
                                            i5 = 2;
                                            break;
                                        } else {
                                            i2 = 3;
                                            i3 = 2;
                                            fi.ri(xmlPullParser);
                                            break;
                                        }
                                        break;
                                    default:
                                        i2 = 3;
                                        i3 = 2;
                                        fi.ri(xmlPullParser);
                                        break;
                                }
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                            } else {
                                lrVar = lrVar2;
                                i = iRi2;
                                i2 = i4;
                                i3 = i5;
                            }
                            i4 = i2;
                            i5 = i3;
                            lrVar2 = lrVar;
                            iRi2 = i;
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                        }
                    }
                } else {
                    fi.ri(xmlPullParser);
                    lrVar2 = lrVar2;
                }
            } else {
                lrVar2 = lrVar2;
            }
        }
    }

    public static void ri(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.aw.ka kaVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(fi.xha, NotificationCompat.CATEGORY_EVENT);
                    if (TextUtils.isEmpty(attributeValue)) {
                        fi.ri(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "midpoint":
                                kaVar.ri(fi.lr(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case "thirdQuartile":
                                kaVar.ri(fi.lr(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case "resume":
                                kaVar.ik(ri(xmlPullParser, true));
                                break;
                            case "unmute":
                                kaVar.co(ri(xmlPullParser, true));
                                break;
                            case "complete":
                                kaVar.ka(ik(xmlPullParser));
                                break;
                            case "mute":
                                kaVar.sf(ri(xmlPullParser, true));
                                break;
                            case "skip":
                                kaVar.di(ik(xmlPullParser));
                                break;
                            case "close":
                                kaVar.fi(ik(xmlPullParser));
                                break;
                            case "pause":
                                kaVar.lr(ri(xmlPullParser, true));
                                break;
                            case "start":
                            case "creativeView":
                                kaVar.ri(fi.lr(xmlPullParser, "Tracking"), 0L);
                                break;
                            case "firstQuartile":
                                kaVar.ri(fi.lr(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    fi.ri(xmlPullParser);
                }
            }
        }
    }

    private static void ri(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.aw.ri riVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (name.equals("ClickThrough")) {
                    riVar.ik(fi.lr(xmlPullParser, "ClickThrough"));
                } else if (!name.equals("ClickTracking")) {
                    fi.ri(xmlPullParser);
                } else {
                    riVar.ri().xha(fi.ri(xmlPullParser, "ClickTracking"));
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> ri(XmlPullParser xmlPullParser, boolean z) throws XmlPullParserException, IOException {
        return fi.ri(xmlPullParser, "Tracking", z);
    }
}
