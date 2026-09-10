package com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static com.bytedance.sdk.openadsdk.core.sLN.Lxb Lxb(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list, int i, double d) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, JXs.ebl, "InLine");
        com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb = new com.bytedance.sdk.openadsdk.core.sLN.Lxb();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                lxb.Lxb().nBu(list);
                return lxb;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                switch (name) {
                    case "AdVerifications":
                        lxb.Lxb(ZU.Lxb(xmlPullParser));
                        continue;
                        break;
                    case "Creatives":
                        if (!TextUtils.isEmpty(lxb.ebl()) && lxb.lk() != null) {
                            break;
                        } else {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        Lxb(context, xmlPullParser, lxb, i, d);
                                    } else {
                                        JXs.Lxb(xmlPullParser);
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case "Description":
                        lxb.LD(JXs.LD(xmlPullParser, name));
                        continue;
                        break;
                    case "Error":
                        list.addAll(JXs.Lxb(xmlPullParser, name));
                        continue;
                        break;
                    case "Extensions":
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                continue;
                                break;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    lxb.Lxb(ZU.Lxb(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case "AdTitle":
                        lxb.Lxb(JXs.LD(xmlPullParser, name));
                        continue;
                        break;
                    case "Impression":
                        lxb.Lxb().Lxb(JXs.Lxb(xmlPullParser, name));
                        continue;
                        break;
                }
                JXs.Lxb(xmlPullParser);
            }
        }
    }

    public static void Lxb(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb, int i, double d) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(lxb.ebl())) {
                    lk.Lxb(xmlPullParser, lxb, i, d);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && lxb.lk() == null) {
                    lxb.Lxb(Lxb.Lxb(context, xmlPullParser));
                } else {
                    JXs.Lxb(xmlPullParser);
                }
            }
        }
    }
}
