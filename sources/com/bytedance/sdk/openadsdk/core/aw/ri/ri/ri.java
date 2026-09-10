package com.bytedance.sdk.openadsdk.core.aw.ri.ri;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static com.bytedance.sdk.openadsdk.core.aw.ik ri(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        fi.ri riVar;
        int i;
        byte b;
        if (context == null) {
            fi.ri(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        int i4 = (int) (i2 / f);
        int i5 = (int) (i3 / f);
        float f2 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.aw.ik ikVar = null;
        while (true) {
            int i6 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return ikVar;
            }
            xmlPullParser.next();
            int i7 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Companion")) {
                String str = fi.xha;
                int iLr = fi.lr(xmlPullParser.getAttributeValue(str, "width"));
                int iLr2 = fi.lr(xmlPullParser.getAttributeValue(str, "height"));
                if (iLr < 300 || iLr2 < 250) {
                    fi.ri(xmlPullParser);
                    f2 = f2;
                    ikVar = ikVar;
                } else {
                    fi.ri riVar2 = new fi.ri();
                    while (true) {
                        if (xmlPullParser.getEventType() != i6 || !xmlPullParser.getName().equals("Companion")) {
                            iLr2 = iLr2;
                            iLr = iLr;
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == i7) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                f2 = f2;
                                ikVar = ikVar;
                                byte b2 = -1;
                                switch (name.hashCode()) {
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            b = 0;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                    case -348198615:
                                        if (name.equals("CompanionClickThrough")) {
                                            b = 1;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                    case 611554000:
                                        if (name.equals("TrackingEvents")) {
                                            b2 = 2;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            b2 = 3;
                                        }
                                        break;
                                    case 1877773523:
                                        if (name.equals("CompanionClickTracking")) {
                                            b = 4;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            b = 5;
                                            b2 = b;
                                            break;
                                        }
                                        break;
                                }
                                switch (b2) {
                                    case 0:
                                        fi.ri riVar3 = riVar2;
                                        i = 2;
                                        Point pointRi = com.bytedance.sdk.openadsdk.core.aw.ik.ri.ri(context, iLr, iLr2, com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.HTML_RESOURCE);
                                        int i8 = pointRi.x;
                                        int i9 = pointRi.y;
                                        com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr lrVar = com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.IFRAME_RESOURCE;
                                        com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri = com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.NONE;
                                        float fRi = com.bytedance.sdk.openadsdk.core.aw.ik.ri(i4, i5, i8, i9, lrVar, enumC0228ri);
                                        String strLr = fi.lr(xmlPullParser, "IFrameResource");
                                        if (!TextUtils.isEmpty(strLr) && fRi > riVar3.xha && fRi > f2) {
                                            riVar3.xha = fRi;
                                            riVar3.ri(strLr, enumC0228ri, lrVar);
                                            riVar2 = riVar3;
                                            i7 = i;
                                            iLr = iLr;
                                            iLr2 = iLr2;
                                            f2 = f2;
                                            ikVar = ikVar;
                                            i6 = 3;
                                        } else {
                                            fi.ri(xmlPullParser, "IFrameResource", 3);
                                            riVar2 = riVar3;
                                            i6 = 3;
                                            i7 = 2;
                                        }
                                        break;
                                    case 1:
                                        i = 2;
                                        riVar2.ka = fi.lr(xmlPullParser, "CompanionClickThrough");
                                        i7 = i;
                                        iLr = iLr;
                                        iLr2 = iLr2;
                                        f2 = f2;
                                        ikVar = ikVar;
                                        i6 = 3;
                                        break;
                                    case 2:
                                        riVar = riVar2;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                riVar2 = riVar;
                                                iLr2 = iLr2;
                                                f2 = f2;
                                                ikVar = ikVar;
                                                i6 = 3;
                                                i7 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                riVar.lr(fi.lr(xmlPullParser, "Tracking"));
                                            }
                                        }
                                        break;
                                    case 3:
                                        riVar = riVar2;
                                        com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri2 = com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(fi.xha, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.aw.ik.ri.ri;
                                        com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri3 = set.contains(lowerCase) ? com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.IMAGE : com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.JAVASCRIPT;
                                        com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr lrVar2 = com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.STATIC_RESOURCE;
                                        Point pointRi2 = com.bytedance.sdk.openadsdk.core.aw.ik.ri.ri(context, iLr, iLr2, lrVar2);
                                        float fRi2 = com.bytedance.sdk.openadsdk.core.aw.ik.ri(i4, i5, pointRi2.x, pointRi2.y, lrVar2, enumC0228ri3);
                                        String strLr2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.contains(lowerCase)) ? fi.lr(xmlPullParser, "StaticResource") : null;
                                        if (fRi2 >= riVar.xha && fRi2 > f2 && !TextUtils.isEmpty(strLr2)) {
                                            riVar.xha = fRi2;
                                            riVar.ri(strLr2, enumC0228ri3, lrVar2);
                                            riVar2 = riVar;
                                            iLr2 = iLr2;
                                            f2 = f2;
                                            ikVar = ikVar;
                                            i6 = 3;
                                            i7 = 2;
                                        } else {
                                            fi.ri(xmlPullParser, "StaticResource", 3);
                                            iLr = iLr;
                                            riVar2 = riVar;
                                            iLr2 = iLr2;
                                            f2 = f2;
                                            i7 = 2;
                                            i6 = 3;
                                            ikVar = ikVar;
                                        }
                                        break;
                                    case 4:
                                        riVar2.ri(fi.lr(xmlPullParser, "CompanionClickTracking"));
                                        iLr2 = iLr2;
                                        f2 = f2;
                                        ikVar = ikVar;
                                        i6 = 3;
                                        i7 = 2;
                                        break;
                                    case 5:
                                        com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr lrVar3 = com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr.HTML_RESOURCE;
                                        Point pointRi3 = com.bytedance.sdk.openadsdk.core.aw.ik.ri.ri(context, iLr, iLr2, lrVar3);
                                        int i10 = pointRi3.x;
                                        int i11 = pointRi3.y;
                                        com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri4 = com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri.NONE;
                                        riVar = riVar2;
                                        float fRi3 = com.bytedance.sdk.openadsdk.core.aw.ik.ri(i4, i5, i10, i11, lrVar3, enumC0228ri4);
                                        String strLr3 = fi.lr(xmlPullParser, "HTMLResource");
                                        if (!TextUtils.isEmpty(strLr3) && fRi3 > riVar.xha && fRi3 > f2) {
                                            riVar.xha = fRi3;
                                            riVar.ri(strLr3, enumC0228ri4, lrVar3);
                                            riVar2 = riVar;
                                            iLr2 = iLr2;
                                            f2 = f2;
                                            ikVar = ikVar;
                                            i6 = 3;
                                            i7 = 2;
                                        } else {
                                            fi.ri(xmlPullParser, "HTMLResource", 3);
                                            riVar2 = riVar;
                                            i7 = 2;
                                            i6 = 3;
                                        }
                                        break;
                                    default:
                                        fi.ri(xmlPullParser);
                                        riVar = riVar2;
                                        riVar2 = riVar;
                                        iLr2 = iLr2;
                                        f2 = f2;
                                        ikVar = ikVar;
                                        i6 = 3;
                                        i7 = 2;
                                        break;
                                }
                            } else {
                                iLr = iLr;
                                iLr2 = iLr2;
                            }
                        } else if (!TextUtils.isEmpty(riVar2.ri) && riVar2.xha >= f2) {
                            com.bytedance.sdk.openadsdk.core.aw.ik ikVar2 = new com.bytedance.sdk.openadsdk.core.aw.ik(iLr, iLr2, riVar2.lr, riVar2.ik, riVar2.ri, riVar2.fi, riVar2.di, riVar2.ka);
                            f2 = riVar2.xha;
                            ikVar = ikVar2;
                        }
                    }
                }
            } else {
                f2 = f2;
                ikVar = ikVar;
            }
        }
    }
}
