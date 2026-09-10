package com.bytedance.sdk.openadsdk.core.fs.qdl.qdl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.fs.to;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends com.bytedance.sdk.openadsdk.core.fs.qdl.ud {
    public static final String wd = null;

    public mzz(Context context, int i2, int i3) {
        super(context, i2, i3);
    }

    private void lnr(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl((ljh) null, (List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr>) Collections.singletonList(new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(str).qdl()), this.qdl > 0 ? com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.UNDEFINED_ERROR, -1L, (String) null, (String) null), (com.bytedance.sdk.openadsdk.core.fs.ud.lnr.ud) null);
    }

    public static int ud(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.fs.qdl.ud
    public com.bytedance.sdk.openadsdk.core.fs.qdl qdl(String str, File file, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) throws Throwable {
        InputStream byteArrayInputStream;
        this.mzz = 0;
        InputStream inputStream = null;
        if (this.ud == null) {
            this.mzz = -1;
            return null;
        }
        if (TextUtils.isEmpty(str) && file == null) {
            this.mzz = -2;
            return null;
        }
        try {
            byteArrayInputStream = !TextUtils.isEmpty(str) ? new ByteArrayInputStream(str.getBytes("UTF-8")) : new FileInputStream(file);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(byteArrayInputStream, "UTF-8");
                    xmlPullParserNewPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.fs.qdl qdlVarQdl = qdl(xmlPullParserNewPullParser, list);
                    qdl(qdlVarQdl);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    return qdlVarQdl;
                } catch (Throwable th) {
                    th = th;
                    inputStream = byteArrayInputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused3) {
                this.mzz = -3;
                qdl((com.bytedance.sdk.openadsdk.core.fs.qdl) null);
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return null;
            }
        } catch (Exception unused5) {
            byteArrayInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static class qdl {
        com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud lnr;
        String mml;
        String qdl;
        com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl ud;
        final List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> mzz = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> mo = new ArrayList();
        float wd = Float.MIN_VALUE;

        public qdl() {
        }

        public void qdl(String str, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud udVar) {
            this.qdl = str;
            this.ud = enumC0113qdl;
            this.lnr = udVar;
        }

        public void ud(String str) {
            this.mo.add(new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(str).qdl());
        }

        public void qdl(String str) {
            this.mzz.add(new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(str).qdl());
        }

        public qdl(String str, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud udVar) {
            qdl(str, enumC0113qdl, udVar);
        }
    }

    public static String ud(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = wd;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10, types: [com.bytedance.sdk.openadsdk.core.fs.qdl] */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.mzz, com.bytedance.sdk.openadsdk.core.fs.qdl.ud] */
    private com.bytedance.sdk.openadsdk.core.fs.qdl ud(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) throws Throwable {
        ?? r17;
        ?? r11 = 0;
        if (this.qdl >= 5) {
            qdl(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVar = new com.bytedance.sdk.openadsdk.core.fs.mml();
        String str = null;
        com.bytedance.sdk.openadsdk.core.fs.lnr lnrVarQdl = null;
        Set<to> setQdl = null;
        while (true) {
            if (xmlPullParser.getEventType() == 3 && "Wrapper".equals(xmlPullParser.getName())) {
                com.bytedance.sdk.openadsdk.core.fs.qdl qdlVarQdl = qdl(str, r11, list);
                if (qdlVarQdl != null) {
                    if (qdlVarQdl.lnr() == null) {
                        qdlVarQdl.qdl(lnrVarQdl);
                    }
                    qdlVarQdl.qdl().qdl(mmlVar);
                    if (setQdl != null) {
                        qdlVarQdl.qdl(setQdl);
                    }
                }
                return qdlVarQdl;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                byte b2 = -1;
                switch (name.hashCode()) {
                    case -587420703:
                        ?? r18 = r11;
                        r17 = r18;
                        if (name.equals("VASTAdTagURI")) {
                            b2 = 0;
                            r17 = r18;
                        }
                        break;
                    case 67232232:
                        ?? r19 = r11;
                        r17 = r19;
                        if (name.equals("Error")) {
                            b2 = 1;
                            r17 = r19;
                        }
                        break;
                    case 184043572:
                        ?? r110 = r11;
                        r17 = r110;
                        if (name.equals("Extensions")) {
                            b2 = 2;
                            r17 = r110;
                        }
                        break;
                    case 611554000:
                        ?? r111 = r11;
                        r17 = r111;
                        if (name.equals("TrackingEvents")) {
                            b2 = 3;
                            r17 = r111;
                        }
                        break;
                    case 1150879268:
                        ?? r112 = r11;
                        r17 = r112;
                        if (name.equals("CompanionAds")) {
                            b2 = 4;
                            r17 = r112;
                        }
                        break;
                    case 2107600959:
                        ?? r113 = r11;
                        r17 = r113;
                        if (name.equals("ClickTracking")) {
                            b2 = 5;
                            r17 = r113;
                        }
                        break;
                    case 2114088489:
                        ?? r114 = r11;
                        r17 = r114;
                        if (name.equals("Impression")) {
                            b2 = 6;
                            r17 = r114;
                        }
                        break;
                    default:
                        r17 = r11;
                        break;
                }
                switch (b2) {
                    case 0:
                        String strQdl = qdl(ud(xmlPullParser, "VASTAdTagURI"), list);
                        if (TextUtils.isEmpty(strQdl)) {
                            qdl(xmlPullParser, "Wrapper", 3);
                            this.mzz = -2;
                            return r17;
                        }
                        str = strQdl;
                        continue;
                        break;
                    case 1:
                        list.add(new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(ud(xmlPullParser, "Error")).qdl());
                        continue;
                    case 2:
                        break;
                    case 3:
                        lnr.qdl(xmlPullParser, mmlVar);
                        continue;
                    case 4:
                        lnrVarQdl = com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.qdl.qdl(this.ud, xmlPullParser);
                        continue;
                    case 5:
                        mmlVar.wd(qdl(xmlPullParser, "ClickTracking"));
                        continue;
                    case 6:
                        mmlVar.qdl(qdl(xmlPullParser, name));
                        continue;
                    default:
                        continue;
                }
                while (true) {
                    if (xmlPullParser.getEventType() != 3 || !"Extensions".equals(xmlPullParser.getName())) {
                        xmlPullParser.next();
                        if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                            setQdl = mml.qdl(xmlPullParser);
                        }
                    }
                }
            } else {
                r17 = r11;
            }
            r11 = r17;
        }
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar) {
        if (this.mo == null) {
            this.mo = new com.bytedance.sdk.openadsdk.core.fs.qdl.ud.qdl();
        }
        com.bytedance.sdk.openadsdk.core.fs.qdl.ud.qdl qdlVar2 = this.mo;
        qdlVar2.qdl = this.mzz;
        qdlVar2.ud = this.qdl;
        if (qdlVar != null) {
            qdlVar2.lnr = qdlVar.qdl().ud.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.fs.qdl qdl(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list3;
        xmlPullParser.require(2, wd, "VAST");
        boolean z2 = false;
        String strUd = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strUd = ud(xmlPullParser, name);
                } else {
                    if ("Ad".equals(name)) {
                        if (qdl(xmlPullParser.getAttributeValue(wd, "sequence"))) {
                            while (true) {
                                if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                    xmlPullParser2 = xmlPullParser;
                                    list2 = list;
                                    z2 = true;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == 2) {
                                    String name2 = xmlPullParser.getName();
                                    if ("InLine".equals(name2)) {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        com.bytedance.sdk.openadsdk.core.fs.qdl qdlVarQdl = ud.qdl(this.ud, xmlPullParser3, list3, this.lnr, this.mml);
                                        if (qdlVarQdl != null) {
                                            if (!TextUtils.isEmpty(qdlVarQdl.wd())) {
                                                return qdlVarQdl;
                                            }
                                            this.mzz = -6;
                                            return null;
                                        }
                                    } else {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        if ("Wrapper".equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.fs.qdl qdlVarUd = ud(xmlPullParser3, list3);
                                            if (qdlVarUd != null) {
                                                return qdlVarUd;
                                            }
                                        } else {
                                            qdl(xmlPullParser3);
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    list = list3;
                                }
                            }
                        } else {
                            qdl(xmlPullParser);
                            z2 = true;
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        qdl(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z2) {
            this.mzz = -4;
            lnr(strUd);
        }
        if (this.mzz == 0) {
            this.mzz = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> qdl(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return qdl(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> qdl(XmlPullParser xmlPullParser, String str, boolean z2) throws XmlPullParserException, IOException {
        return qdl(ud(xmlPullParser, str), z2);
    }

    public static void qdl(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i2 = 1;
        while (i2 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static void qdl(XmlPullParser xmlPullParser, String str, int i2) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i2) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> qdl(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new com.bytedance.sdk.openadsdk.core.fs.ud.lnr.qdl(str).qdl(z2).qdl());
    }
}
