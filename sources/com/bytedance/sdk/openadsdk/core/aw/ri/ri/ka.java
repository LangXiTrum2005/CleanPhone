package com.bytedance.sdk.openadsdk.core.aw.ri.ri;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.aw.qt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    public static Set<qt> ri(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        qt qtVarRi;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(fi.xha, "vendor");
                    String strLr = null;
                    String strLr2 = null;
                    String strLr3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(fi.xha, NotificationCompat.CATEGORY_EVENT))) {
                                            break;
                                        } else {
                                            strLr3 = fi.lr(xmlPullParser, "Tracking");
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(fi.xha, "apiFramework"))) {
                                            break;
                                        } else {
                                            strLr = fi.lr(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strLr2 = fi.lr(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strLr) && (qtVarRi = qt.ri(strLr, attributeValue, strLr2, strLr3)) != null) {
                            hashSet.add(qtVarRi);
                        }
                    }
                } else {
                    fi.ri(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
