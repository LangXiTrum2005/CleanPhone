package com.bytedance.sdk.openadsdk.core.aw.ri.ri;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.aw.qt;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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

/* JADX INFO: loaded from: classes2.dex */
public class fi extends com.bytedance.sdk.openadsdk.core.aw.ri.lr {
    public static final String xha = null;

    public fi(Context context, int i, int i2) {
        super(context, i, i2);
    }

    private void ik(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri((wjv) null, (List<com.bytedance.sdk.openadsdk.core.aw.lr.ik>) Collections.singletonList(new com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(str).ri()), this.ri > 0 ? com.bytedance.sdk.openadsdk.core.aw.ri.ri.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.aw.ri.ri.UNDEFINED_ERROR, -1L, (String) null, (String) null), (com.bytedance.sdk.openadsdk.core.aw.lr.ik.lr) null);
    }

    public static int lr(String str) {
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
    @Override // com.bytedance.sdk.openadsdk.core.aw.ri.lr
    public com.bytedance.sdk.openadsdk.core.aw.ri ri(String str, File file, List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) throws Throwable {
        InputStream byteArrayInputStream;
        this.fi = 0;
        InputStream inputStream = null;
        if (this.lr == null) {
            this.fi = -1;
            return null;
        }
        if (TextUtils.isEmpty(str) && file == null) {
            this.fi = -2;
            return null;
        }
        try {
            byteArrayInputStream = !TextUtils.isEmpty(str) ? new ByteArrayInputStream(str.getBytes(C.UTF8_NAME)) : new FileInputStream(file);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(byteArrayInputStream, C.UTF8_NAME);
                    xmlPullParserNewPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.aw.ri riVarRi = ri(xmlPullParserNewPullParser, list);
                    ri(riVarRi);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    return riVarRi;
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
                this.fi = -3;
                ri((com.bytedance.sdk.openadsdk.core.aw.ri) null);
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

    public static class ri {
        com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr ik;
        String ka;
        com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri lr;
        String ri;
        final List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> fi = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> di = new ArrayList();
        float xha = Float.MIN_VALUE;

        public ri() {
        }

        public void lr(String str) {
            this.di.add(new com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(str).ri());
        }

        public void ri(String str, com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri, com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr lrVar) {
            this.ri = str;
            this.lr = enumC0228ri;
            this.ik = lrVar;
        }

        public void ri(String str) {
            this.fi.add(new com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(str).ri());
        }

        public ri(String str, com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri, com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr lrVar) {
            ri(str, enumC0228ri, lrVar);
        }
    }

    public static String lr(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = xha;
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
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.bytedance.sdk.openadsdk.core.aw.ri] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.bytedance.sdk.openadsdk.core.aw.ri.lr, com.bytedance.sdk.openadsdk.core.aw.ri.ri.fi] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private com.bytedance.sdk.openadsdk.core.aw.ri lr(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) throws Throwable {
        ?? r16;
        ?? r4 = 0;
        if (this.ri >= 5) {
            ri(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.aw.ka kaVar = new com.bytedance.sdk.openadsdk.core.aw.ka();
        String str = null;
        com.bytedance.sdk.openadsdk.core.aw.ik ikVarRi = null;
        Set<qt> setRi = null;
        while (true) {
            if (xmlPullParser.getEventType() == 3 && "Wrapper".equals(xmlPullParser.getName())) {
                com.bytedance.sdk.openadsdk.core.aw.ri riVarRi = ri(str, r4, list);
                if (riVarRi != null) {
                    if (riVarRi.ik() == null) {
                        riVarRi.ri(ikVarRi);
                    }
                    riVarRi.ri().ri(kaVar);
                    if (setRi != null) {
                        riVarRi.ri(setRi);
                    }
                }
                return riVarRi;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                r16 = r4;
                switch (name) {
                    case "VASTAdTagURI":
                        String strRi = ri(lr(xmlPullParser, "VASTAdTagURI"), list);
                        if (!TextUtils.isEmpty(strRi)) {
                            str = strRi;
                            continue;
                            break;
                        } else {
                            ri(xmlPullParser, "Wrapper", 3);
                            this.fi = -2;
                            return r16;
                        }
                        break;
                    case "Error":
                        list.add(new com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(lr(xmlPullParser, "Error")).ri());
                        continue;
                        break;
                    case "Extensions":
                        break;
                    case "TrackingEvents":
                        ik.ri(xmlPullParser, kaVar);
                        continue;
                        break;
                    case "CompanionAds":
                        ikVarRi = com.bytedance.sdk.openadsdk.core.aw.ri.ri.ri.ri(this.lr, xmlPullParser);
                        continue;
                        break;
                    case "ClickTracking":
                        kaVar.xha(ri(xmlPullParser, "ClickTracking"));
                        continue;
                        break;
                    case "Impression":
                        kaVar.ri(ri(xmlPullParser, name));
                        continue;
                        break;
                    default:
                        continue;
                        break;
                }
                while (true) {
                    if (xmlPullParser.getEventType() != 3 || !"Extensions".equals(xmlPullParser.getName())) {
                        xmlPullParser.next();
                        if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                            setRi = ka.ri(xmlPullParser);
                        }
                    }
                }
            } else {
                r16 = r4;
            }
            r4 = r16;
        }
    }

    private void ri(com.bytedance.sdk.openadsdk.core.aw.ri riVar) {
        if (this.di == null) {
            this.di = new com.bytedance.sdk.openadsdk.core.aw.ri.lr.ri();
        }
        com.bytedance.sdk.openadsdk.core.aw.ri.lr.ri riVar2 = this.di;
        riVar2.ri = this.fi;
        riVar2.lr = this.ri;
        if (riVar != null) {
            riVar2.ik = riVar.ri().lr.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.aw.ri ri(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list3;
        xmlPullParser.require(2, xha, "VAST");
        boolean z = false;
        String strLr = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strLr = lr(xmlPullParser, name);
                } else {
                    if ("Ad".equals(name)) {
                        if (ri(xmlPullParser.getAttributeValue(xha, "sequence"))) {
                            while (true) {
                                if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                    xmlPullParser2 = xmlPullParser;
                                    list2 = list;
                                    z = true;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == 2) {
                                    String name2 = xmlPullParser.getName();
                                    if ("InLine".equals(name2)) {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        com.bytedance.sdk.openadsdk.core.aw.ri riVarRi = lr.ri(this.lr, xmlPullParser3, list3, this.ik, this.ka);
                                        if (riVarRi != null) {
                                            if (!TextUtils.isEmpty(riVarRi.xha())) {
                                                return riVarRi;
                                            }
                                            this.fi = -6;
                                            return null;
                                        }
                                    } else {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        if ("Wrapper".equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.aw.ri riVarLr = lr(xmlPullParser3, list3);
                                            if (riVarLr != null) {
                                                return riVarLr;
                                            }
                                        } else {
                                            ri(xmlPullParser3);
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    list = list3;
                                }
                            }
                        } else {
                            ri(xmlPullParser);
                            z = true;
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        ri(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z) {
            this.fi = -4;
            ik(strLr);
        }
        if (this.fi == 0) {
            this.fi = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> ri(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return ri(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> ri(XmlPullParser xmlPullParser, String str, boolean z) throws XmlPullParserException, IOException {
        return ri(lr(xmlPullParser, str), z);
    }

    public static void ri(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    public static void ri(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> ri(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new com.bytedance.sdk.openadsdk.core.aw.lr.ik.ri(str).ri(z).ri());
    }
}
