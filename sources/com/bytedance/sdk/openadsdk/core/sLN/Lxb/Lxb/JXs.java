package com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends com.bytedance.sdk.openadsdk.core.sLN.Lxb.LD {
    public static final String ebl = null;

    public JXs(Context context, int i, int i2) {
        super(context, i, i2);
    }

    public static int LD(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> ZU(String str) {
        return Lxb(str, false);
    }

    private void lk(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(str).Lxb()), this.Lxb > 0 ? com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb.UNDEFINED_ERROR, -1L, null), (com.bytedance.sdk.openadsdk.core.sLN.LD.lk.LD) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.InputStream] */
    @Override // com.bytedance.sdk.openadsdk.core.sLN.Lxb.LD
    public com.bytedance.sdk.openadsdk.core.sLN.Lxb Lxb(String str, List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        this.JXs = 0;
        ?? r3 = 0;
        if (this.LD == null) {
            this.JXs = -1;
            return null;
        }
        ?? IsEmpty = TextUtils.isEmpty(str);
        try {
            if (IsEmpty != 0) {
                this.JXs = -2;
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(str.getBytes(C.UTF8_NAME));
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(byteArrayInputStream, C.UTF8_NAME);
                    xmlPullParserNewPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.sLN.Lxb Lxb2 = Lxb(xmlPullParserNewPullParser, list);
                    Lxb(Lxb2);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    return Lxb2;
                } catch (Exception unused2) {
                    this.JXs = -3;
                    Lxb((com.bytedance.sdk.openadsdk.core.sLN.Lxb) null);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Exception unused4) {
                byteArrayInputStream = null;
            } catch (Throwable th) {
                th = th;
                if (r3 != 0) {
                    try {
                        r3.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r3 = IsEmpty;
        }
    }

    public static class Lxb {
        com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb LD;
        String Lxb;
        String ZU;
        com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD lk;
        final List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> JXs = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> lc = new ArrayList();
        float ebl = Float.MIN_VALUE;

        public Lxb() {
        }

        public void LD(String str) {
            this.lc.add(new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(str).Lxb());
        }

        public void Lxb(String str, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD ld) {
            this.Lxb = str;
            this.LD = enumC0111Lxb;
            this.lk = ld;
        }

        public void Lxb(String str) {
            this.JXs.add(new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(str).Lxb());
        }

        public Lxb(String str, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD ld) {
            Lxb(str, enumC0111Lxb, ld);
        }
    }

    public static String LD(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = ebl;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    private com.bytedance.sdk.openadsdk.core.sLN.Lxb LD(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) throws Throwable {
        if (this.Lxb >= 5) {
            Lxb(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.sLN.ZU zu = new com.bytedance.sdk.openadsdk.core.sLN.ZU(null);
        String strLD = null;
        com.bytedance.sdk.openadsdk.core.sLN.lk lkVarLxb = null;
        while (true) {
            if (xmlPullParser.getEventType() == 3 && "Wrapper".equals(xmlPullParser.getName())) {
                com.bytedance.sdk.openadsdk.core.sLN.Lxb Lxb2 = Lxb(strLD, list);
                if (Lxb2 != null) {
                    if (Lxb2.lk() == null) {
                        Lxb2.Lxb(lkVarLxb);
                    }
                    Lxb2.Lxb().Lxb(zu);
                }
                return Lxb2;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                switch (name) {
                    case "VASTAdTagURI":
                        strLD = LD(LD(xmlPullParser, "VASTAdTagURI"), list);
                        if (!TextUtils.isEmpty(strLD)) {
                            break;
                        } else {
                            Lxb(xmlPullParser, "Wrapper", 3);
                            this.JXs = -2;
                            return null;
                        }
                        break;
                    case "Error":
                        list.add(new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(LD(xmlPullParser, "Error")).Lxb());
                        break;
                    case "TrackingEvents":
                        lk.Lxb(xmlPullParser, zu);
                        break;
                    case "CompanionAds":
                        lkVarLxb = com.bytedance.sdk.openadsdk.core.sLN.Lxb.Lxb.Lxb.Lxb(this.LD, xmlPullParser);
                        break;
                    case "ClickTracking":
                        zu.ebl(Lxb(xmlPullParser, "ClickTracking"));
                        break;
                    case "Impression":
                        zu.Lxb(Lxb(xmlPullParser, name));
                        break;
                }
            }
        }
    }

    private void Lxb(com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb) {
        if (this.lc == null) {
            this.lc = new com.bytedance.sdk.openadsdk.core.sLN.Lxb.LD.Lxb();
        }
        com.bytedance.sdk.openadsdk.core.sLN.Lxb.LD.Lxb lxb2 = this.lc;
        lxb2.Lxb = this.JXs;
        lxb2.LD = this.Lxb;
        if (lxb != null) {
            lxb2.lk = lxb.Lxb().LD.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.sLN.Lxb Lxb(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list) throws Throwable {
        xmlPullParser.require(2, ebl, "VAST");
        boolean z = false;
        String strLD = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strLD = LD(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (Lxb(xmlPullParser.getAttributeValue(ebl, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            }
                            if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.sLN.Lxb Lxb2 = LD.Lxb(this.LD, xmlPullParser, list, this.lk, this.ZU);
                                    if (Lxb2 != null) {
                                        if (!TextUtils.isEmpty(Lxb2.ebl())) {
                                            return Lxb2;
                                        }
                                        this.JXs = -6;
                                        return null;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.sLN.Lxb lxbLD = LD(xmlPullParser, list);
                                    if (lxbLD != null) {
                                        return lxbLD;
                                    }
                                } else {
                                    Lxb(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        Lxb(xmlPullParser);
                    }
                    z = true;
                } else {
                    Lxb(xmlPullParser);
                }
            }
        }
        if (!z) {
            this.JXs = -4;
            lk(strLD);
        }
        if (this.JXs == 0) {
            this.JXs = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> Lxb(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return ZU(LD(xmlPullParser, str));
    }

    public static void Lxb(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void Lxb(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> Lxb(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new com.bytedance.sdk.openadsdk.core.sLN.LD.lk.Lxb(str).Lxb(z).Lxb());
    }
}
