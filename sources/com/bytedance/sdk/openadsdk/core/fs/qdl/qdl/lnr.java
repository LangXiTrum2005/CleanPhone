package com.bytedance.sdk.openadsdk.core.fs.qdl.qdl;

import android.text.TextUtils;
import com.smartdigimkt.o1.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    private static List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> lnr(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return qdl(xmlPullParser, false);
    }

    public static void qdl(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar, int i2, double d) throws XmlPullParserException, IOException {
        boolean z2 = false;
        while (true) {
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z2 && TextUtils.isEmpty(qdlVar.wd())) {
                        mzz.qdl(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.getClass();
                    switch (name) {
                        case "VideoClicks":
                            qdl(xmlPullParser, qdlVar);
                            break;
                        case "Duration":
                            qdlVar.qdl(ud(xmlPullParser));
                            break;
                        case "MediaFiles":
                            qdl(xmlPullParser, i2, d, qdlVar);
                            z2 = true;
                            break;
                        case "Icons":
                            com.bytedance.sdk.openadsdk.core.fs.ud udVarQdl = qdl(xmlPullParser);
                            if (udVarQdl != null && qdlVar.ud() == null) {
                                qdlVar.qdl(udVarQdl);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "TrackingEvents":
                            qdl(xmlPullParser, qdlVar.qdl());
                            break;
                        default:
                            mzz.qdl(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    public static double ud(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String[] strArrSplit = mzz.ud(xmlPullParser, "Duration").split(":");
        if (strArrSplit.length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(strArrSplit[1].trim()) * 60) + (Integer.parseInt(strArrSplit[0].trim()) * b.l2) + Float.parseFloat(strArrSplit[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    private static String qdl(XmlPullParser xmlPullParser, int i2, double d, com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar) throws XmlPullParserException, IOException {
        double d2 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = mzz.wd;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int iUd = mzz.ud(xmlPullParser.getAttributeValue(str2, "width"));
                int iUd2 = mzz.ud(xmlPullParser.getAttributeValue(str2, "height"));
                int iUd3 = mzz.ud(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String strUd = mzz.ud(xmlPullParser, "MediaFile");
                if (iUd > 0 && iUd2 > 0 && com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl.contains(attributeValue) && !TextUtils.isEmpty(strUd)) {
                    double dQdl = com.bytedance.sdk.openadsdk.core.fs.lnr.mml.qdl(i2, d, iUd, iUd2, iUd3, attributeValue);
                    if (dQdl > d2) {
                        str = strUd;
                        d2 = dQdl;
                        i3 = iUd;
                        i4 = iUd2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            qdlVar.mml(str);
            qdlVar.qdl(i3);
            qdlVar.ud(i4);
        }
        return str;
    }

    public static com.bytedance.sdk.openadsdk.core.fs.ud qdl(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl;
        byte b2;
        String str2 = "HTMLResource";
        int i2 = 2;
        int i3 = 3;
        com.bytedance.sdk.openadsdk.core.fs.ud udVar = null;
        while (true) {
            if (xmlPullParser.getEventType() == i3 && xmlPullParser.getName().equals("Icons")) {
                return udVar;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == i2 && xmlPullParser.getName().equals("Icon")) {
                String str3 = mzz.wd;
                int iUd = mzz.ud(xmlPullParser.getAttributeValue(str3, "width"));
                int iUd2 = mzz.ud(xmlPullParser.getAttributeValue(str3, "height"));
                if (iUd > 0 && iUd <= 300 && iUd2 > 0 && iUd2 <= 300) {
                    int iQdl = com.bytedance.sdk.openadsdk.core.fs.ud.qdl.qdl(xmlPullParser.getAttributeValue(str3, "offset"));
                    int iQdl2 = com.bytedance.sdk.openadsdk.core.fs.ud.qdl.qdl(xmlPullParser.getAttributeValue(str3, "duration"));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    mzz.qdl qdlVar = null;
                    String strUd = null;
                    while (true) {
                        if (xmlPullParser.next() == i3 && xmlPullParser.getName().equals("Icon")) {
                            if (qdlVar != null && (udVar == null || TextUtils.isEmpty(udVar.mo()))) {
                                com.bytedance.sdk.openadsdk.core.fs.ud udVar2 = new com.bytedance.sdk.openadsdk.core.fs.ud(iUd, iUd2, iQdl, iQdl2, qdlVar.ud, qdlVar.lnr, qdlVar.qdl, arrayList, arrayList2, strUd);
                                mzz.qdl(xmlPullParser, "Icons", 3);
                                udVar = udVar2;
                            }
                        } else {
                            int i4 = iUd2;
                            arrayList = arrayList;
                            arrayList2 = arrayList2;
                            int i5 = iQdl2;
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                byte b3 = -1;
                                switch (name.hashCode()) {
                                    case -1044238411:
                                        if (name.equals("IconViewTracking")) {
                                            b2 = 0;
                                            b3 = b2;
                                            break;
                                        }
                                        iUd2 = i4;
                                        iQdl2 = i5;
                                        str2 = str;
                                        i3 = 3;
                                        break;
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            b2 = 1;
                                            b3 = b2;
                                            break;
                                        }
                                        iUd2 = i4;
                                        iQdl2 = i5;
                                        str2 = str;
                                        i3 = 3;
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            b3 = 2;
                                        }
                                        break;
                                    case 1030746596:
                                        if (name.equals("IconClicks")) {
                                            b3 = 3;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals(str2)) {
                                            b2 = 4;
                                            b3 = b2;
                                            break;
                                        }
                                        iUd2 = i4;
                                        iQdl2 = i5;
                                        str2 = str;
                                        i3 = 3;
                                        break;
                                }
                                switch (b3) {
                                    case 0:
                                        str = str2;
                                        arrayList2.add(new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(mzz.ud(xmlPullParser, "IconViewTracking")).qdl());
                                        break;
                                    case 1:
                                        str = str2;
                                        if (qdlVar == null) {
                                            qdlVar = new mzz.qdl(mzz.ud(xmlPullParser, "IFrameResource"), com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.NONE, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.IFRAME_RESOURCE);
                                        } else {
                                            mzz.qdl(xmlPullParser);
                                        }
                                        break;
                                    case 2:
                                        str = str2;
                                        com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl2 = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(mzz.wd, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.qdl;
                                        String strUd2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.contains(lowerCase)) ? mzz.ud(xmlPullParser, "StaticResource") : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0113qdl = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.IMAGE;
                                        } else {
                                            enumC0113qdl = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.JAVASCRIPT;
                                        }
                                        qdlVar = new mzz.qdl(strUd2, enumC0113qdl, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.STATIC_RESOURCE);
                                        break;
                                    case 3:
                                        str = str2;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                    strUd = mzz.ud(xmlPullParser, "IconClickThrough");
                                                } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                    arrayList.add(new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(mzz.ud(xmlPullParser, "IconClickTracking")).qdl());
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (qdlVar == null || qdlVar.lnr == com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.IFRAME_RESOURCE) {
                                            str = str2;
                                            qdlVar = new mzz.qdl(mzz.ud(xmlPullParser, str2), com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.NONE, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.HTML_RESOURCE);
                                            break;
                                        }
                                    default:
                                        str = str2;
                                        mzz.qdl(xmlPullParser);
                                        break;
                                }
                                iUd2 = i4;
                                iQdl2 = i5;
                                str2 = str;
                                i3 = 3;
                            } else {
                                str = str2;
                            }
                            iUd2 = i4;
                            iQdl2 = i5;
                            str2 = str;
                            i3 = 3;
                        }
                    }
                } else {
                    mzz.qdl(xmlPullParser);
                }
                i2 = 2;
                i3 = 3;
            }
            str2 = str2;
            i2 = 2;
            i3 = 3;
        }
    }

    public static void qdl(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.fs.mml mmlVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(mzz.wd, "event");
                    if (TextUtils.isEmpty(attributeValue)) {
                        mzz.qdl(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "midpoint":
                                mmlVar.qdl(mzz.ud(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case "thirdQuartile":
                                mmlVar.qdl(mzz.ud(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case "resume":
                                mmlVar.lnr(qdl(xmlPullParser, true));
                                break;
                            case "unmute":
                                mmlVar.fs(qdl(xmlPullParser, true));
                                break;
                            case "complete":
                                mmlVar.mml(lnr(xmlPullParser));
                                break;
                            case "mute":
                                mmlVar.rq(qdl(xmlPullParser, true));
                                break;
                            case "skip":
                                mmlVar.mo(lnr(xmlPullParser));
                                break;
                            case "close":
                                mmlVar.mzz(lnr(xmlPullParser));
                                break;
                            case "pause":
                                mmlVar.ud(qdl(xmlPullParser, true));
                                break;
                            case "start":
                            case "creativeView":
                                mmlVar.qdl(mzz.ud(xmlPullParser, "Tracking"), 0L);
                                break;
                            case "firstQuartile":
                                mmlVar.qdl(mzz.ud(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    mzz.qdl(xmlPullParser);
                }
            }
        }
    }

    private static void qdl(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (!name.equals("ClickThrough")) {
                    if (name.equals("ClickTracking")) {
                        qdlVar.qdl().wd(mzz.qdl(xmlPullParser, "ClickTracking"));
                    } else {
                        mzz.qdl(xmlPullParser);
                    }
                } else {
                    qdlVar.lnr(mzz.ud(xmlPullParser, "ClickThrough"));
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> qdl(XmlPullParser xmlPullParser, boolean z2) throws XmlPullParserException, IOException {
        return mzz.qdl(xmlPullParser, "Tracking", z2);
    }
}
