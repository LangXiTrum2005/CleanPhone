package com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static com.bytedance.sdk.openadsdk.core.sLN.lk Lxb(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i;
        JXs.Lxb lxb;
        int i2;
        int i3;
        if (context == null) {
            JXs.Lxb(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        int i6 = (int) (i4 / f);
        int i7 = (int) (i5 / f);
        float f2 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.sLN.lk lkVar = null;
        while (true) {
            int i8 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return lkVar;
            }
            xmlPullParser.next();
            int i9 = 2;
            if (xmlPullParser.getEventType() == 2) {
                String str = "Companion";
                if (xmlPullParser.getName().equals("Companion")) {
                    String str2 = JXs.ebl;
                    int iLD = JXs.LD(xmlPullParser.getAttributeValue(str2, "width"));
                    int iLD2 = JXs.LD(xmlPullParser.getAttributeValue(str2, "height"));
                    if (iLD < 300 || iLD2 < 250) {
                        JXs.Lxb(xmlPullParser);
                        lkVar = lkVar;
                        i7 = i7;
                    } else {
                        JXs.Lxb lxb2 = new JXs.Lxb();
                        while (true) {
                            if (xmlPullParser.getEventType() != i8 || !xmlPullParser.getName().equals(str)) {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == i9) {
                                    String name = xmlPullParser.getName();
                                    name.getClass();
                                    lkVar = lkVar;
                                    str = str;
                                    switch (name) {
                                        case "IFrameResource":
                                            i = i7;
                                            JXs.Lxb lxb3 = lxb2;
                                            int i10 = iLD2;
                                            int i11 = iLD;
                                            Point pointLxb = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.Lxb(context, i11, i10, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.HTML_RESOURCE);
                                            int i12 = pointLxb.x;
                                            int i13 = pointLxb.y;
                                            com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD ld = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.IFRAME_RESOURCE;
                                            com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.NONE;
                                            float fLxb = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb(i6, i, i12, i13, ld, enumC0111Lxb);
                                            String strLD = JXs.LD(xmlPullParser, "IFrameResource");
                                            if (TextUtils.isEmpty(strLD) || fLxb <= lxb3.ebl || fLxb <= f2) {
                                                JXs.Lxb(xmlPullParser, "IFrameResource", 3);
                                            } else {
                                                lxb3.ebl = fLxb;
                                                lxb3.Lxb(strLD, enumC0111Lxb, ld);
                                            }
                                            lxb2 = lxb3;
                                            iLD = i11;
                                            iLD2 = i10;
                                            i7 = i;
                                            break;
                                        case "CompanionClickThrough":
                                            lxb2.ZU = JXs.LD(xmlPullParser, "CompanionClickThrough");
                                            iLD = iLD;
                                            break;
                                        case "TrackingEvents":
                                            i = i7;
                                            lxb = lxb2;
                                            i2 = iLD2;
                                            i3 = iLD;
                                            while (true) {
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                    iLD = i3;
                                                    iLD2 = i2;
                                                    lxb2 = lxb;
                                                    i7 = i;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                    lxb.LD(JXs.LD(xmlPullParser, "Tracking"));
                                                }
                                            }
                                            break;
                                        case "StaticResource":
                                            lxb = lxb2;
                                            i2 = iLD2;
                                            i3 = iLD;
                                            com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb2 = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.NONE;
                                            String lowerCase = xmlPullParser.getAttributeValue(JXs.ebl, "creativeType").toLowerCase();
                                            Set<String> set = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.Lxb;
                                            com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb3 = set.contains(lowerCase) ? com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.IMAGE : com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.JAVASCRIPT;
                                            com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD ld2 = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.STATIC_RESOURCE;
                                            Point pointLxb2 = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.Lxb(context, i3, i2, ld2);
                                            i = i7;
                                            float fLxb2 = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb(i6, i7, pointLxb2.x, pointLxb2.y, ld2, enumC0111Lxb3);
                                            String strLD2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.contains(lowerCase)) ? JXs.LD(xmlPullParser, "StaticResource") : null;
                                            if (fLxb2 < lxb.ebl || fLxb2 <= f2 || TextUtils.isEmpty(strLD2)) {
                                                JXs.Lxb(xmlPullParser, "StaticResource", 3);
                                            } else {
                                                lxb.ebl = fLxb2;
                                                lxb.Lxb(strLD2, enumC0111Lxb3, ld2);
                                            }
                                            iLD = i3;
                                            iLD2 = i2;
                                            lxb2 = lxb;
                                            i7 = i;
                                            break;
                                        case "CompanionClickTracking":
                                            lxb2.Lxb(JXs.LD(xmlPullParser, "CompanionClickTracking"));
                                            break;
                                        case "HTMLResource":
                                            com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD ld3 = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD.HTML_RESOURCE;
                                            Point pointLxb3 = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.Lxb(context, iLD, iLD2, ld3);
                                            int i14 = pointLxb3.x;
                                            int i15 = pointLxb3.y;
                                            com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb4 = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb.NONE;
                                            JXs.Lxb lxb4 = lxb2;
                                            int i16 = iLD2;
                                            int i17 = iLD;
                                            float fLxb3 = com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb(i6, i7, i14, i15, ld3, enumC0111Lxb4);
                                            String strLD3 = JXs.LD(xmlPullParser, "HTMLResource");
                                            if (TextUtils.isEmpty(strLD3) || fLxb3 <= lxb4.ebl || fLxb3 <= f2) {
                                                JXs.Lxb(xmlPullParser, "HTMLResource", 3);
                                            } else {
                                                lxb4.ebl = fLxb3;
                                                lxb4.Lxb(strLD3, enumC0111Lxb4, ld3);
                                            }
                                            iLD = i17;
                                            lxb2 = lxb4;
                                            iLD2 = i16;
                                            break;
                                        default:
                                            JXs.Lxb(xmlPullParser);
                                            i = i7;
                                            lxb = lxb2;
                                            i2 = iLD2;
                                            i3 = iLD;
                                            iLD = i3;
                                            iLD2 = i2;
                                            lxb2 = lxb;
                                            i7 = i;
                                            break;
                                    }
                                    i8 = 3;
                                    i9 = 2;
                                } else {
                                    i7 = i7;
                                    i8 = 3;
                                }
                            } else if (!TextUtils.isEmpty(lxb2.Lxb) && lxb2.ebl >= f2) {
                                lkVar = new com.bytedance.sdk.openadsdk.core.sLN.lk(iLD, iLD2, lxb2.LD, lxb2.lk, lxb2.Lxb, lxb2.JXs, lxb2.lc, lxb2.ZU);
                                f2 = lxb2.ebl;
                            }
                        }
                    }
                }
            }
            lkVar = lkVar;
            i7 = i7;
        }
    }
}
