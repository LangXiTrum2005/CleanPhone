package com.bytedance.sdk.openadsdk.core.fs.qdl.qdl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.fs.to;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class mml {
    public static Set<to> qdl(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        to toVarQdl;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(mzz.wd, "vendor");
                    String strUd = null;
                    String strUd2 = null;
                    String strUd3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(mzz.wd, "event"))) {
                                            break;
                                        } else {
                                            strUd3 = mzz.ud(xmlPullParser, "Tracking");
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!"omid".equals(xmlPullParser.getAttributeValue(mzz.wd, "apiFramework"))) {
                                            break;
                                        } else {
                                            strUd = mzz.ud(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strUd2 = mzz.ud(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strUd) && (toVarQdl = to.qdl(strUd, attributeValue, strUd2, strUd3)) != null) {
                            hashSet.add(toVarQdl);
                        }
                    }
                } else {
                    mzz.qdl(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
