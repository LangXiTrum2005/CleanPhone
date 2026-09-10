package com.bytedance.sdk.openadsdk.core.fs.qdl.qdl;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    /* JADX WARN: Code duplicated, block: B:123:0x02a8  */
    public static com.bytedance.sdk.openadsdk.core.fs.lnr qdl(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2;
        String str;
        String str2;
        String str3;
        int i3;
        byte b2;
        String str4 = "HTMLResource";
        String str5 = "CompanionClickTracking";
        int i4 = 2;
        int i5 = 3;
        if (context == null) {
            mzz.qdl(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i6 = displayMetrics.widthPixels;
        int i7 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        int i8 = (int) (i6 / f);
        int i9 = (int) (i7 / f);
        float f2 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.fs.lnr lnrVar = null;
        while (true) {
            if (xmlPullParser.getEventType() == i5 && xmlPullParser.getName().equals("CompanionAds")) {
                return lnrVar;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == i4) {
                String str6 = "Companion";
                if (xmlPullParser.getName().equals("Companion")) {
                    String str7 = mzz.wd;
                    int iUd = mzz.ud(xmlPullParser.getAttributeValue(str7, "width"));
                    int iUd2 = mzz.ud(xmlPullParser.getAttributeValue(str7, "height"));
                    if (iUd < 300 || iUd2 < 250) {
                        i2 = 3;
                        mzz.qdl(xmlPullParser);
                    } else {
                        mzz.qdl qdlVar = new mzz.qdl();
                        while (true) {
                            int i10 = iUd;
                            int i11 = iUd2;
                            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str6)) {
                                if (!TextUtils.isEmpty(qdlVar.qdl) && qdlVar.wd >= f2) {
                                    com.bytedance.sdk.openadsdk.core.fs.lnr lnrVar2 = new com.bytedance.sdk.openadsdk.core.fs.lnr(i10, i11, qdlVar.ud, qdlVar.lnr, qdlVar.qdl, qdlVar.mzz, qdlVar.mo, qdlVar.mml);
                                    f2 = qdlVar.wd;
                                    lnrVar = lnrVar2;
                                }
                                i4 = 2;
                                i5 = 3;
                            } else {
                                iUd = i10;
                                iUd2 = i11;
                                xmlPullParser.next();
                                f2 = f2;
                                lnrVar = lnrVar;
                                if (xmlPullParser.getEventType() == 2) {
                                    String name = xmlPullParser.getName();
                                    name.getClass();
                                    byte b3 = -1;
                                    switch (name.hashCode()) {
                                        case -375340334:
                                            if (name.equals("IFrameResource")) {
                                                b2 = 0;
                                                b3 = b2;
                                                break;
                                            }
                                            break;
                                        case -348198615:
                                            if (name.equals("CompanionClickThrough")) {
                                                b2 = 1;
                                                b3 = b2;
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name.equals("TrackingEvents")) {
                                                b3 = 2;
                                            }
                                            break;
                                        case 676623548:
                                            if (name.equals("StaticResource")) {
                                                b3 = 3;
                                            }
                                            break;
                                        case 1877773523:
                                            if (name.equals(str5)) {
                                                b2 = 4;
                                                b3 = b2;
                                                break;
                                            }
                                            break;
                                        case 1928285401:
                                            if (name.equals(str4)) {
                                                b2 = 5;
                                                b3 = b2;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (b3) {
                                        case 0:
                                            str = str4;
                                            str2 = str5;
                                            str3 = str6;
                                            Point pointQdl = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.qdl(context, iUd, iUd2, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.HTML_RESOURCE);
                                            int i12 = pointQdl.x;
                                            int i13 = pointQdl.y;
                                            com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud udVar = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.IFRAME_RESOURCE;
                                            com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.NONE;
                                            float fQdl = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl(i8, i9, i12, i13, udVar, enumC0113qdl);
                                            String strUd = mzz.ud(xmlPullParser, "IFrameResource");
                                            if (TextUtils.isEmpty(strUd) || fQdl <= qdlVar.wd || fQdl <= f2) {
                                                mzz.qdl(xmlPullParser, "IFrameResource", 3);
                                            } else {
                                                qdlVar.wd = fQdl;
                                                qdlVar.qdl(strUd, enumC0113qdl, udVar);
                                            }
                                            str6 = str3;
                                            str4 = str;
                                            str5 = str2;
                                            break;
                                        case 1:
                                            qdlVar.mml = mzz.ud(xmlPullParser, "CompanionClickThrough");
                                            str4 = str4;
                                            break;
                                        case 2:
                                            str = str4;
                                            str2 = str5;
                                            str3 = str6;
                                            while (true) {
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                    str6 = str3;
                                                    str4 = str;
                                                    str5 = str2;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                    qdlVar.ud(mzz.ud(xmlPullParser, "Tracking"));
                                                }
                                            }
                                            break;
                                        case 3:
                                            str3 = str6;
                                            int i14 = i8;
                                            int i15 = i9;
                                            com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl2 = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.NONE;
                                            String lowerCase = xmlPullParser.getAttributeValue(mzz.wd, "creativeType").toLowerCase();
                                            Set<String> set = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.qdl;
                                            com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl3 = set.contains(lowerCase) ? com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.IMAGE : com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.JAVASCRIPT;
                                            com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud udVar2 = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.STATIC_RESOURCE;
                                            Point pointQdl2 = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.qdl(context, iUd, iUd2, udVar2);
                                            int i16 = pointQdl2.x;
                                            int i17 = pointQdl2.y;
                                            i8 = i14;
                                            i9 = i15;
                                            float fQdl2 = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl(i8, i9, i16, i17, udVar2, enumC0113qdl3);
                                            str = str4;
                                            str2 = str5;
                                            String strUd2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.contains(lowerCase)) ? mzz.ud(xmlPullParser, "StaticResource") : null;
                                            if (fQdl2 < qdlVar.wd || fQdl2 <= f2 || TextUtils.isEmpty(strUd2)) {
                                                mzz.qdl(xmlPullParser, "StaticResource", 3);
                                            } else {
                                                qdlVar.wd = fQdl2;
                                                qdlVar.qdl(strUd2, enumC0113qdl3, udVar2);
                                            }
                                            str6 = str3;
                                            str4 = str;
                                            str5 = str2;
                                            break;
                                        case 4:
                                            qdlVar.qdl(mzz.ud(xmlPullParser, str5));
                                            break;
                                        case 5:
                                            com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud udVar3 = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud.HTML_RESOURCE;
                                            Point pointQdl3 = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.qdl(context, iUd, iUd2, udVar3);
                                            int i18 = pointQdl3.x;
                                            int i19 = pointQdl3.y;
                                            com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl4 = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl.NONE;
                                            float fQdl3 = com.bytedance.sdk.openadsdk.core.fs.lnr.qdl(i8, i9, i18, i19, udVar3, enumC0113qdl4);
                                            String str8 = str6;
                                            int i20 = i8;
                                            String strUd3 = mzz.ud(xmlPullParser, str4);
                                            if (!TextUtils.isEmpty(strUd3)) {
                                                i3 = i9;
                                                if (fQdl3 > qdlVar.wd && fQdl3 > f2) {
                                                    qdlVar.wd = fQdl3;
                                                    qdlVar.qdl(strUd3, enumC0113qdl4, udVar3);
                                                }
                                                i8 = i20;
                                                i9 = i3;
                                                str6 = str8;
                                            } else {
                                                i3 = i9;
                                            }
                                            mzz.qdl(xmlPullParser, str4, 3);
                                            i8 = i20;
                                            i9 = i3;
                                            str6 = str8;
                                            break;
                                        default:
                                            mzz.qdl(xmlPullParser);
                                            str = str4;
                                            str2 = str5;
                                            str3 = str6;
                                            str6 = str3;
                                            str4 = str;
                                            str5 = str2;
                                            break;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i2 = i5;
                }
                i5 = i2;
                f2 = f2;
                lnrVar = lnrVar;
                str4 = str4;
                str5 = str5;
                i4 = 2;
            } else {
                i2 = i5;
                i5 = i2;
                f2 = f2;
                lnrVar = lnrVar;
                str4 = str4;
                str5 = str5;
                i4 = 2;
            }
        }
    }
}
