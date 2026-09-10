package com.bytedance.sdk.openadsdk.core.aw.ri.ri;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static com.bytedance.sdk.openadsdk.core.aw.ri ri(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list, int i, double d) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, fi.xha, "InLine");
        com.bytedance.sdk.openadsdk.core.aw.ri riVar = new com.bytedance.sdk.openadsdk.core.aw.ri();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                riVar.ri().qt(list);
                return riVar;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                switch (name) {
                    case "AdVerifications":
                        riVar.ri(ka.ri(xmlPullParser));
                        context = context;
                        break;
                    case "Creatives":
                        if (TextUtils.isEmpty(riVar.xha()) || riVar.ik() == null) {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        ri(context, xmlPullParser, riVar, i, d);
                                    } else {
                                        fi.ri(xmlPullParser);
                                    }
                                }
                            }
                        } else {
                            fi.ri(xmlPullParser);
                        }
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i = i;
                        d = d;
                        break;
                    case "Description":
                        riVar.lr(fi.lr(xmlPullParser, name));
                        break;
                    case "Error":
                        list.addAll(fi.ri(xmlPullParser, name));
                        break;
                    case "Extensions":
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                context = context;
                                xmlPullParser = xmlPullParser;
                                i = i;
                                d = d;
                                break;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    riVar.ri(ka.ri(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case "AdTitle":
                        riVar.ri(fi.lr(xmlPullParser, name));
                        break;
                    case "Impression":
                        riVar.ri().ri(fi.ri(xmlPullParser, name));
                        break;
                    default:
                        fi.ri(xmlPullParser);
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i = i;
                        d = d;
                        break;
                }
            }
        }
    }

    public static void ri(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.aw.ri riVar, int i, double d) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(riVar.xha())) {
                    ik.ri(xmlPullParser, riVar, i, d);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && riVar.ik() == null) {
                    riVar.ri(ri.ri(context, xmlPullParser));
                } else {
                    fi.ri(xmlPullParser);
                }
            }
        }
    }
}
