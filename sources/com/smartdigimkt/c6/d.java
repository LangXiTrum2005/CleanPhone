package com.smartdigimkt.c6;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.f6.h0;
import com.smartdigimkt.f6.k;
import com.smartdigimkt.f6.l;
import com.smartdigimkt.f6.t0;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w6.m;
import com.smartdigimkt.w6.n;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f34316l = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.w6.d f34318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.v6.a f34319c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f34320e;
    com.smartdigimkt.c6.c f;
    private long g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34322i = true;
    String j = "<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"/><meta name=\"viewport\"content=\"width=device-width, initial-scale=1.0\"/><title>TopOn</title></head><body>%s</body></html>";
    String k = "<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"/><meta name=\"viewport\"content=\"width=device-width, initial-scale=1.0\"/><title>TopOn</title></head>%s</html>";
    private e d = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34321h = -1;

    /* JADX INFO: renamed from: com.smartdigimkt.c6.d$d, reason: collision with other inner class name */
    public static /* synthetic */ class C0454d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34326a;

        static {
            int[] iArr = new int[f.a.values().length];
            f34326a = iArr;
            try {
                iArr[f.a.AD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34326a[f.a.AD_FIRSTQUARTILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34326a[f.a.AD_MIDPOINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34326a[f.a.AD_THIRDQUARTILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34326a[f.a.AD_COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34326a[f.a.AD_PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34326a[f.a.AD_RESUME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34326a[f.a.AD_UNMUTE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34326a[f.a.AD_MUTE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34326a[f.a.AD_REWIND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34326a[f.a.AD_FULLSCREEN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34326a[f.a.AD_CLOSE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public interface e {
        void a(com.smartdigimkt.w6.d dVar);

        void a(String str, String str2);
    }

    public d(Context context, com.smartdigimkt.w6.d dVar, com.smartdigimkt.v6.a aVar) {
        this.f34317a = context;
        this.f34318b = dVar;
        this.f34319c = aVar;
    }

    public class b implements com.smartdigimkt.c6.c.b {
        public b() {
        }

        @Override // com.smartdigimkt.c6.c.b
        public void a(int i2, String str) {
            String unused = d.f34316l;
            if (d.this.d != null) {
                d.this.d.a("" + i2, str);
            }
        }

        @Override // com.smartdigimkt.c6.c.b
        public void a(com.smartdigimkt.e6.a[] aVarArr, JSONArray jSONArray) {
            d.this.a(aVarArr, jSONArray);
        }
    }

    public class c implements com.smartdigimkt.c6.c.b {
        public c() {
        }

        @Override // com.smartdigimkt.c6.c.b
        public void a(int i2, String str) {
            String unused = d.f34316l;
            if (d.this.d != null) {
                d.this.d.a("" + i2, str);
            }
        }

        @Override // com.smartdigimkt.c6.c.b
        public void a(com.smartdigimkt.e6.a[] aVarArr, JSONArray jSONArray) {
            d.this.a(aVarArr, jSONArray);
        }
    }

    public void a(e eVar) {
        String strF = this.f34318b.f();
        this.f34320e = eVar;
        this.g = System.currentTimeMillis();
        this.f34322i = true;
        com.smartdigimkt.c6.c cVar = new com.smartdigimkt.c6.c(this.f34319c, new b());
        this.f = cVar;
        cVar.a(strF);
    }

    public void a(e eVar, String str) {
        JSONArray jSONArray;
        if (TextUtils.isEmpty(str)) {
            eVar.a("-3", "Local vast parse result is empty.");
            return;
        }
        try {
            jSONArray = new JSONArray(str);
        } catch (Throwable unused) {
            eVar.a("-3", "Local vast parse result fail.");
            jSONArray = null;
        }
        if (jSONArray == null) {
            return;
        }
        this.f34320e = eVar;
        this.f34322i = false;
        com.smartdigimkt.c6.c cVar = new com.smartdigimkt.c6.c(this.f34319c, true, new c());
        this.f = cVar;
        cVar.a(jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.e6.a[] aVarArr, JSONArray jSONArray) {
        com.smartdigimkt.e6.b bVar;
        if (aVarArr == null) {
            e eVar = this.d;
            if (eVar != null) {
                eVar.a("-3", "Parsers results are null.");
                return;
            }
            return;
        }
        if (aVarArr.length != 2) {
            e eVar2 = this.d;
            if (eVar2 != null) {
                eVar2.a("-3", "2 VAST result parsers are required.");
                return;
            }
            return;
        }
        com.smartdigimkt.e6.b bVar2 = (com.smartdigimkt.e6.b) aVarArr[0];
        if (bVar2 != null && (bVar = (com.smartdigimkt.e6.b) aVarArr[1]) != null) {
            boolean zA = a(bVar2, bVar);
            jSONArray.length();
            e eVar3 = this.d;
            if (eVar3 != null) {
                if (zA) {
                    if (this.f34322i) {
                        com.smartdigimkt.p6.b.b().a(this.f34317a, this.f34319c.f39168i, jSONArray.toString());
                    }
                    this.d.a(this.f34318b);
                    return;
                }
                eVar3.a("-3", "Do fillAdxOfferFormVast is fail.");
                return;
            }
            return;
        }
        e eVar4 = this.d;
        if (eVar4 != null) {
            eVar4.a("-3", "One of parsers is null.");
        }
    }

    public class a implements e {
        public a() {
        }

        @Override // com.smartdigimkt.c6.d.e
        public void a(com.smartdigimkt.w6.d dVar) {
            boolean z2;
            String strB;
            String string = "";
            if (d.this.f34318b.v0() || d.this.f34318b.c((m) d.this.f34319c.t, d.this.f34319c.f39173w) != null) {
                z2 = true;
                strB = "";
            } else {
                z2 = false;
                strB = d.this.f34318b.B();
            }
            String unused = d.f34316l;
            System.currentTimeMillis();
            long unused2 = d.this.g;
            if (d.this.f34322i) {
                if (z2) {
                    com.smartdigimkt.v6.a aVar = d.this.f34319c;
                    String str = d.this.f34319c.f39166e;
                    String strI0 = d.this.f34318b.I0();
                    String strL = d.this.f34318b.L();
                    long jCurrentTimeMillis = System.currentTimeMillis() - d.this.g;
                    String str2 = "" + d.this.f34321h;
                    String strK0 = d.this.f34318b.k0();
                    String strK = d.this.f34318b.k();
                    String string2 = d.this.f34318b.R0().p() != null ? Arrays.toString(d.this.f34318b.R0().p()) : "";
                    com.smartdigimkt.c6.c cVar = d.this.f;
                    if (cVar != null && cVar.b().size() > 0) {
                        string = d.this.f.b().toString();
                    }
                    com.smartdigimkt.i7.d.a(aVar, str, strI0, strL, "1", jCurrentTimeMillis, "", str2, strK0, strK, string2, string);
                } else {
                    com.smartdigimkt.v6.a aVar2 = d.this.f34319c;
                    String str3 = d.this.f34319c.f39166e;
                    String strI1 = d.this.f34318b.I0();
                    String strL2 = d.this.f34318b.L();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - d.this.g;
                    String str4 = "" + d.this.f34321h;
                    String strK1 = d.this.f34318b.k0();
                    String strK2 = d.this.f34318b.k();
                    String string3 = d.this.f34318b.R0().p() != null ? Arrays.toString(d.this.f34318b.R0().p()) : "";
                    com.smartdigimkt.c6.c cVar2 = d.this.f;
                    if (cVar2 != null && cVar2.b().size() > 0) {
                        string = d.this.f.b().toString();
                    }
                    com.smartdigimkt.i7.d.a(aVar2, str3, strI1, strL2, "-4", jCurrentTimeMillis2, strB, str4, strK1, strK2, string3, string);
                }
            }
            if (d.this.f34320e != null) {
                d.this.f34320e.a(dVar);
            }
        }

        @Override // com.smartdigimkt.c6.d.e
        public void a(String str, String str2) {
            if (d.this.f34322i) {
                com.smartdigimkt.v6.a aVar = d.this.f34319c;
                String str3 = d.this.f34319c.f39166e;
                String strI0 = d.this.f34318b.I0();
                String strL = d.this.f34318b.L();
                long jCurrentTimeMillis = System.currentTimeMillis() - d.this.g;
                String string = "";
                String str4 = "" + d.this.f34321h;
                String strK0 = d.this.f34318b.k0();
                String strK = d.this.f34318b.k();
                String string2 = d.this.f34318b.R0().p() != null ? Arrays.toString(d.this.f34318b.R0().p()) : "";
                com.smartdigimkt.c6.c cVar = d.this.f;
                if (cVar != null && cVar.b().size() > 0) {
                    string = d.this.f.b().toString();
                }
                com.smartdigimkt.i7.d.a(aVar, str3, strI0, strL, str, jCurrentTimeMillis, str2, str4, strK0, strK, string2, string);
            }
            if (d.this.f34320e != null) {
                d.this.f34320e.a(str, str2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f6 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0201 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x020c A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x021f A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0256 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0269 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x029b A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02b2 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bf A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01cd A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d8 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e8 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ef A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:17:0x006f, B:36:0x00a5, B:38:0x00af, B:39:0x00b8, B:40:0x00c1, B:21:0x007d, B:24:0x0087, B:27:0x0091, B:45:0x00d4, B:48:0x00ed, B:51:0x0105, B:53:0x010b, B:66:0x014c, B:68:0x0152, B:69:0x0159, B:71:0x015f, B:72:0x016a, B:74:0x0174, B:76:0x017e, B:84:0x01aa, B:86:0x01bf, B:88:0x01c6, B:90:0x01cd, B:91:0x01d2, B:93:0x01d8, B:94:0x01e2, B:96:0x01e8, B:98:0x01ef, B:100:0x01f6, B:101:0x01fb, B:103:0x0201, B:104:0x0206, B:106:0x020c, B:107:0x0219, B:109:0x021f, B:111:0x022f, B:112:0x0237, B:115:0x023e, B:117:0x0250, B:119:0x0256, B:120:0x0263, B:122:0x0269, B:124:0x0279, B:125:0x0281, B:128:0x0288, B:129:0x0295, B:131:0x029b, B:132:0x02aa, B:134:0x02b2, B:136:0x02ba, B:138:0x02c0, B:139:0x02c8, B:141:0x02cd, B:144:0x02d4, B:145:0x02e3, B:148:0x02ea, B:149:0x02f9, B:152:0x0300, B:153:0x030f, B:156:0x0316, B:157:0x0324, B:160:0x032b, B:161:0x0339, B:164:0x0340, B:165:0x034e, B:168:0x0355, B:169:0x0363, B:172:0x036a, B:173:0x0378, B:176:0x037f, B:177:0x038c, B:178:0x0390, B:60:0x0121, B:62:0x0126, B:63:0x0137, B:65:0x0148), top: B:182:0x0044 }] */
    private boolean a(com.smartdigimkt.e6.b bVar, com.smartdigimkt.e6.b bVar2) {
        String str;
        String str2;
        int i2;
        int i3;
        int i4;
        ArrayList<String> arrayListA;
        ArrayList arrayList;
        ArrayList arrayList2;
        String strA;
        byte b2;
        int iA;
        boolean z2 = false;
        try {
            n nVarR0 = this.f34318b.R0();
            bVar.c(bVar, 0);
            bVar.h(bVar, 0);
            bVar.e(bVar, 0);
            String strA2 = bVar.a(bVar, 0);
            String strF = bVar.f(bVar, 0);
            String strG = bVar.g(bVar, 0);
            String strD = bVar.d(bVar, 0);
            String strJ = bVar2.j(bVar2, 0);
            bVar2.i(bVar2, 0);
            int iJ = com.smartdigimkt.n8.c.j(this.f34317a);
            try {
                if (String.valueOf(this.f34319c.f39164b).equals("2") && this.f34318b.B0() == 3) {
                    String strQ = this.f34319c.t.q();
                    int iHashCode = strQ.hashCode();
                    if (iHashCode != -559799608) {
                        if (iHashCode != 1507809730) {
                            if (iHashCode != 1507809854) {
                                if (iHashCode == 1622564786 && strQ.equals("728x90")) {
                                    b2 = 3;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strQ.equals("320x90")) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                        } else if (strQ.equals("320x50")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (strQ.equals("300x250")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        iA = h.a(this.f34317a, 67.0f);
                    } else if (b2 == 1) {
                        iA = h.a(this.f34317a, 90.0f);
                    } else if (b2 == 2) {
                        iA = h.a(this.f34317a, 300.0f);
                    } else if (b2 == 3) {
                        iA = h.a(this.f34317a, 120.0f);
                    }
                    iJ = iA;
                }
                z2 = false;
                String strA3 = bVar2.a(bVar2, 0, iJ);
                long jA = com.smartdigimkt.c6.e.a(strJ);
                int i5 = bVar2.i();
                int iC = bVar2.c();
                boolean z3 = false;
                try {
                    l lVarA = com.smartdigimkt.e6.b.a(bVar2.g().a().get(0).b());
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    String strB = "";
                    if (lVarA != null && com.smartdigimkt.e6.b.a(lVarA) != null) {
                        com.smartdigimkt.e6.b.a(lVarA);
                        int iIntValue = com.smartdigimkt.e6.b.a(lVarA).intValue();
                        if (iIntValue == 1) {
                            this.f34321h = 1;
                            strA = lVarA.l().a();
                            if (!TextUtils.isEmpty(strA)) {
                                strA = a(strA);
                            }
                        } else if (iIntValue != 2) {
                            if (iIntValue == 3) {
                                this.f34321h = 3;
                            }
                            strA = "";
                        } else {
                            this.f34321h = 2;
                            strB = lVarA.o().b();
                            strA = "";
                        }
                        if (lVarA.g() != null) {
                            lVarA.g().b();
                        }
                        if (lVarA.h() != null) {
                            arrayList3.add(lVarA.h().b());
                        }
                        t0 t0VarA = com.smartdigimkt.e6.b.a(lVarA.p());
                        if (t0VarA != null && com.smartdigimkt.c6.e.b((CharSequence) t0VarA.b())) {
                            arrayList4.add(t0VarA.b());
                        }
                        try {
                            i2 = Integer.parseInt(lVarA.q());
                            try {
                                i3 = Integer.parseInt(lVarA.k());
                                str2 = strA;
                                strG = strG;
                                str = strB;
                            } catch (Throwable unused) {
                                str2 = strA;
                                str = strB;
                                i3 = -1;
                            }
                        } catch (Throwable unused2) {
                            i2 = -1;
                        }
                        this.f34318b.P(strA2);
                        this.f34318b.m(strF);
                        this.f34318b.Q(strA3);
                        if (jA > 0) {
                            this.f34318b.a(jA);
                        }
                        if (i5 > 0) {
                            this.f34318b.o(i5);
                        }
                        if (iC > 0) {
                            this.f34318b.n(iC);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f34318b.y(str);
                            this.f34318b.p(str);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            this.f34318b.B(str2);
                            if (i2 > 0) {
                                this.f34318b.i(i2);
                            }
                            if (i3 > 0) {
                                this.f34318b.h(i3);
                            }
                        }
                        if (!TextUtils.isEmpty(strD)) {
                            this.f34318b.h(strD);
                        }
                        if (bVar.e() != null) {
                            arrayList2 = new ArrayList();
                            for (h0 h0Var : bVar.e()) {
                                if (!TextUtils.isEmpty(h0Var.b())) {
                                    arrayList2.add(h0Var.b());
                                }
                            }
                            nVarR0.p(a(nVarR0.p(), (String[]) arrayList2.toArray(new String[0])));
                        }
                        if (bVar.b() != null) {
                            arrayList = new ArrayList();
                            for (k kVar : bVar.b()) {
                                if (!TextUtils.isEmpty(kVar.b())) {
                                    arrayList.add(kVar.b());
                                }
                            }
                            nVarR0.i(a(nVarR0.i(), (String[]) arrayList.toArray(new String[0])));
                        }
                        if (!TextUtils.isEmpty(strG)) {
                            nVarR0.z(a(nVarR0.i0(), new String[]{strG}));
                        }
                        for (f.a aVar : f.a.values()) {
                            arrayListA = bVar.a(aVar);
                            if (arrayListA == null && arrayListA.size() > 0) {
                                switch (C0454d.f34326a[aVar.ordinal()]) {
                                    case 1:
                                        nVarR0.G(a(nVarR0.q0(), (String[]) arrayListA.toArray(new String[0])));
                                        continue;
                                    case 2:
                                        nVarR0.B(a(nVarR0.k0(), (String[]) arrayListA.toArray(new String[0])));
                                        continue;
                                    case 3:
                                        nVarR0.C(a(nVarR0.l0(), (String[]) arrayListA.toArray(new String[0])));
                                        continue;
                                    case 4:
                                        nVarR0.D(a(nVarR0.m0(), (String[]) arrayListA.toArray(new String[0])));
                                        continue;
                                    case 5:
                                        nVarR0.A(a(nVarR0.j0(), (String[]) arrayListA.toArray(new String[0])));
                                        continue;
                                    case 6:
                                        nVarR0.y(a(nVarR0.h0(), (String[]) arrayListA.toArray(new String[0])));
                                        continue;
                                    case 7:
                                        nVarR0.E(a(nVarR0.o0(), (String[]) arrayListA.toArray(new String[0])));
                                        continue;
                                    case 8:
                                        nVarR0.H(a(nVarR0.r0(), (String[]) arrayListA.toArray(new String[0])));
                                        continue;
                                    case 9:
                                        z3 = false;
                                        nVarR0.x(a(nVarR0.g0(), (String[]) arrayListA.toArray(new String[0])));
                                        continue;
                                    default:
                                        continue;
                                }
                                return z3;
                            }
                        }
                        this.f34318b.k0();
                        this.f34318b.N0();
                        this.f34318b.w();
                        this.f34318b.g0();
                        this.f34318b.k();
                        this.f34318b.b(true);
                        return true;
                    }
                    str = "";
                    str2 = str;
                    i2 = -1;
                    i3 = -1;
                    this.f34318b.P(strA2);
                    this.f34318b.m(strF);
                    this.f34318b.Q(strA3);
                    if (jA > 0) {
                        this.f34318b.a(jA);
                    }
                    if (i5 > 0) {
                        this.f34318b.o(i5);
                    }
                    if (iC > 0) {
                        this.f34318b.n(iC);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.f34318b.y(str);
                        this.f34318b.p(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        this.f34318b.B(str2);
                        if (i2 > 0) {
                            this.f34318b.i(i2);
                        }
                        if (i3 > 0) {
                            this.f34318b.h(i3);
                        }
                    }
                    if (!TextUtils.isEmpty(strD)) {
                        this.f34318b.h(strD);
                    }
                    if (bVar.e() != null) {
                        arrayList2 = new ArrayList();
                        while (r3.hasNext()) {
                            if (!TextUtils.isEmpty(h0Var.b())) {
                                arrayList2.add(h0Var.b());
                            }
                        }
                        nVarR0.p(a(nVarR0.p(), (String[]) arrayList2.toArray(new String[0])));
                    }
                    if (bVar.b() != null) {
                        arrayList = new ArrayList();
                        while (r3.hasNext()) {
                            if (!TextUtils.isEmpty(kVar.b())) {
                                arrayList.add(kVar.b());
                            }
                        }
                        nVarR0.i(a(nVarR0.i(), (String[]) arrayList.toArray(new String[0])));
                    }
                    if (!TextUtils.isEmpty(strG)) {
                        nVarR0.z(a(nVarR0.i0(), new String[]{strG}));
                    }
                    while (i4 < r3) {
                        arrayListA = bVar.a(aVar);
                        if (arrayListA == null) {
                        }
                    }
                    this.f34318b.k0();
                    this.f34318b.N0();
                    this.f34318b.w();
                    this.f34318b.g0();
                    this.f34318b.k();
                    this.f34318b.b(true);
                    return true;
                } catch (Throwable unused3) {
                    return z3;
                }
            } catch (Throwable unused4) {
                return false;
            }
        } catch (Throwable unused5) {
            return z2;
        }
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String strReplaceAll = h.b(str).replaceAll("<!DOCTYPE html>", "");
            if (strReplaceAll.contains("<html")) {
                return strReplaceAll;
            }
            if (strReplaceAll.startsWith("<body")) {
                return String.format(this.k, strReplaceAll);
            }
            return String.format(this.j, strReplaceAll);
        } catch (Throwable unused) {
            return str;
        }
    }

    private String[] a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        if (strArr2 == null || strArr2.length == 0) {
            return strArr;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }
}
