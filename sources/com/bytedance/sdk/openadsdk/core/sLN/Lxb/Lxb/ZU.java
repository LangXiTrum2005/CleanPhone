package com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.sLN.nBu;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static Set<nBu> Lxb(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        nBu nbuLxb;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(JXs.ebl, "vendor");
                    String strLD = null;
                    String strLD2 = null;
                    String strLD3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(JXs.ebl, NotificationCompat.CATEGORY_EVENT))) {
                                            break;
                                        } else {
                                            strLD3 = JXs.LD(xmlPullParser, "Tracking");
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(JXs.ebl, "apiFramework"))) {
                                            break;
                                        } else {
                                            strLD = JXs.LD(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strLD2 = JXs.LD(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strLD) && (nbuLxb = nBu.Lxb(CampaignEx.KEY_OMID, strLD, attributeValue, strLD2, strLD3)) != null) {
                            hashSet.add(nbuLxb);
                        }
                    }
                } else {
                    JXs.Lxb(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
