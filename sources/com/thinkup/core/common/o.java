package com.thinkup.core.common;

import android.content.Context;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Pair;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationBidManager;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.common.on.o0mm;
import com.thinkup.core.common.on.o0mn;
import com.thinkup.core.common.on.o0mo;
import com.thinkup.core.common.on.o0o0;
import com.thinkup.core.common.on.on0;
import com.thinkup.core.common.on.ono;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.m0n;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static volatile o o;
    private final String m = getClass().getSimpleName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ConcurrentHashMap<String, List<com.thinkup.core.common.on.o>> f42106n = new ConcurrentHashMap<>(2);
    private ConcurrentHashMap<String, o0mn> o0 = new ConcurrentHashMap<>(2);

    private o() {
    }

    private static String o(String str, String str2) {
        return a.m(str, str2);
    }

    public final void m(String str) {
        synchronized (ooo.o().o(str)) {
            try {
                List<com.thinkup.core.common.on.o> list = this.f42106n.get(str);
                if (list != null) {
                    Collections.sort(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(String str) {
        o(str, -1, true, 2);
    }

    public final void m(com.thinkup.core.common.on.o oVar) {
        if (oVar == null) {
            return;
        }
        String strOomn = oVar.mo().oomn();
        synchronized (ooo.o().o(strOomn)) {
            try {
                List<com.thinkup.core.common.on.o> list = this.f42106n.get(strOomn);
                if (list != null) {
                    list.remove(oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static o o() {
        if (o == null) {
            synchronized (o.class) {
                try {
                    if (o == null) {
                        o = new o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    private static void m(String str, o0mm o0mmVar) {
        if (o0mmVar == null) {
            return;
        }
        o0mmVar.m0o();
        o0mmVar.om0();
        o0mmVar.nm();
        int iOm0 = o0mmVar.om0();
        if (iOm0 != 3) {
            if (iOm0 == 4) {
                com.thinkup.core.basead.m.o();
                Context contextOn = com.thinkup.core.common.n.o0n.m().on();
                com.thinkup.core.basead.m.o();
                com.thinkup.core.basead.m.o(contextOn, com.thinkup.core.basead.m.o(str, o0mmVar.m0o(), o0mmVar.nm()));
                return;
            }
            if (iOm0 != 7) {
                return;
            }
        }
        on0 on0VarN0n = o0mmVar.n0n();
        com.thinkup.core.common.o.n.o().o(str, o0mmVar.m0o());
        if (on0VarN0n == null || TextUtils.isEmpty(on0VarN0n.token)) {
            return;
        }
        com.thinkup.core.common.o.o.o().o(com.thinkup.core.common.n.o0n.m().on(), on0VarN0n.token);
    }

    private static com.thinkup.core.common.on.o o(TUBaseAdAdapter tUBaseAdAdapter, long j) {
        com.thinkup.core.common.on.o oVar = new com.thinkup.core.common.on.o();
        oVar.o(tUBaseAdAdapter);
        oVar.n(System.currentTimeMillis());
        oVar.m(j);
        oVar.o(tUBaseAdAdapter.getUnitGroupInfo().mm0());
        return oVar;
    }

    private static boolean o(String str, int i2, TUBaseAdAdapter tUBaseAdAdapter) {
        List<com.thinkup.core.common.on.o> listO;
        int size;
        if (i2 == -1 || (listO = o().o(str)) == null || listO.isEmpty() || (size = listO.size()) < i2) {
            return true;
        }
        if (com.thinkup.core.common.ooo.mn.o(tUBaseAdAdapter.getUnitGroupInfo(), listO.get(size - 1).nn()) != -1) {
            return false;
        }
        int i3 = i2 - 2;
        Math.max(i3, -1);
        o().o(str, Math.max(i3, -1), false, 11);
        return true;
    }

    private List<com.thinkup.core.common.on.o> o(String str, TUBaseAdAdapter tUBaseAdAdapter, List<? extends BaseAd> list, long j) {
        o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
        com.thinkup.core.common.on.n0 trackingInfo = tUBaseAdAdapter.getTrackingInfo();
        String strO = o(str, tUBaseAdAdapter.getUnitGroupInfo().m0o());
        o0mn o0mnVar = this.o0.get(strO);
        if (o0mnVar == null) {
            o0mnVar = new o0mn(str, unitGroupInfo.m0o());
            this.o0.put(strO, o0mnVar);
        }
        o0mnVar.o(unitGroupInfo.oo0n());
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (BaseAd baseAd : list) {
                baseAd.setTrackingInfo(tUBaseAdAdapter.getTrackingInfo().nmm());
                com.thinkup.core.common.on.o oVarO = o(tUBaseAdAdapter, j);
                oVarO.o(baseAd);
                arrayList.add(oVarO);
            }
            o0mnVar.o(trackingInfo.oon0(), new o0o0(trackingInfo.oon0(), arrayList));
        } else {
            arrayList.add(o(tUBaseAdAdapter, j));
            o0mnVar.o(trackingInfo.oon0(), new o0o0(trackingInfo.oon0(), arrayList));
        }
        if (arrayList.size() == 0) {
            return arrayList;
        }
        o(str, arrayList);
        return arrayList;
    }

    private void o(String str, List<com.thinkup.core.common.on.o> list) {
        synchronized (ooo.o().o(str)) {
            try {
                List<com.thinkup.core.common.on.o> listSynchronizedList = this.f42106n.get(str);
                if (listSynchronizedList == null) {
                    listSynchronizedList = Collections.synchronizedList(new ArrayList());
                    this.f42106n.put(str, listSynchronizedList);
                }
                if (listSynchronizedList.size() == 0) {
                    listSynchronizedList.addAll(list);
                } else {
                    o0mm unitGroupInfo = list.get(0).oo().getUnitGroupInfo();
                    for (int i2 = 0; i2 < listSynchronizedList.size(); i2++) {
                        o0mm unitGroupInfo2 = listSynchronizedList.get(i2).oo().getUnitGroupInfo();
                        int iM = com.thinkup.core.common.ooo.mn.m(unitGroupInfo, unitGroupInfo2);
                        if (iM < 0) {
                            listSynchronizedList.addAll(i2, list);
                            break;
                        }
                        if (iM == 0 && unitGroupInfo.oo0o() < unitGroupInfo2.oo0o()) {
                            listSynchronizedList.addAll(i2, list);
                            break;
                        } else {
                            if (i2 == listSynchronizedList.size() - 1) {
                                listSynchronizedList.addAll(list);
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<com.thinkup.core.common.on.o> o(String str) {
        List<com.thinkup.core.common.on.o> list = this.f42106n.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        Object objO = ooo.o().o(str);
        ArrayList arrayList = new ArrayList();
        synchronized (objO) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public final com.thinkup.core.common.on.o o(Context context, String str) {
        synchronized (ooo.o().o(str)) {
            List<com.thinkup.core.common.on.o> listO = o(context, str, false, false, false, (ono) null);
            if (listO == null || listO.size() <= 0) {
                return null;
            }
            return listO.get(0);
        }
    }

    public final com.thinkup.core.common.on.o o(Context context, String str, boolean z2, boolean z3, ono onoVar) {
        synchronized (ooo.o().o(str)) {
            List<com.thinkup.core.common.on.o> listO = o(context, str, z2, z3, false, onoVar);
            if (listO == null || listO.size() <= 0) {
                return null;
            }
            return listO.get(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:107:0x030d A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0332  */
    /* JADX WARN: Code duplicated, block: B:111:0x033f A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x034e A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0360 A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x052a  */
    /* JADX WARN: Code duplicated, block: B:250:0x0618 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x061a A[Catch: all -> 0x0701, TryCatch #2 {all -> 0x0701, blocks: (B:227:0x05a6, B:234:0x05e9, B:237:0x05fb, B:251:0x061a, B:252:0x062e, B:255:0x0638, B:257:0x063e, B:258:0x0642, B:260:0x0648, B:244:0x060b, B:241:0x0605), top: B:327:0x05a6, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x063e A[Catch: all -> 0x0701, TryCatch #2 {all -> 0x0701, blocks: (B:227:0x05a6, B:234:0x05e9, B:237:0x05fb, B:251:0x061a, B:252:0x062e, B:255:0x0638, B:257:0x063e, B:258:0x0642, B:260:0x0648, B:244:0x060b, B:241:0x0605), top: B:327:0x05a6, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:260:0x0648 A[Catch: all -> 0x0701, TRY_LEAVE, TryCatch #2 {all -> 0x0701, blocks: (B:227:0x05a6, B:234:0x05e9, B:237:0x05fb, B:251:0x061a, B:252:0x062e, B:255:0x0638, B:257:0x063e, B:258:0x0642, B:260:0x0648, B:244:0x060b, B:241:0x0605), top: B:327:0x05a6, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x0662 A[Catch: all -> 0x068b, TRY_LEAVE, TryCatch #8 {all -> 0x068b, blocks: (B:262:0x0654, B:264:0x0662), top: B:337:0x0654 }] */
    /* JADX WARN: Code duplicated, block: B:270:0x0691  */
    /* JADX WARN: Code duplicated, block: B:275:0x06b1 A[Catch: all -> 0x0714, TryCatch #10 {all -> 0x0714, blocks: (B:273:0x06a9, B:275:0x06b1, B:277:0x06b5, B:279:0x06be, B:283:0x06ec, B:280:0x06de), top: B:341:0x06a9 }] */
    /* JADX WARN: Code duplicated, block: B:281:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:283:0x06ec A[Catch: all -> 0x0714, TRY_LEAVE, TryCatch #10 {all -> 0x0714, blocks: (B:273:0x06a9, B:275:0x06b1, B:277:0x06b5, B:279:0x06be, B:283:0x06ec, B:280:0x06de), top: B:341:0x06a9 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:287:0x06fc A[Catch: all -> 0x0022, DONT_GENERATE, TRY_ENTER, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:290:0x0701 A[PHI: r10 r11 r18 r31 r48
  0x0701: PHI (r10v8 java.util.Map<java.lang.String, java.lang.Object>) = (r10v10 java.util.Map<java.lang.String, java.lang.Object>), (r10v13 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:321:0x0701, B:249:0x0616] A[DONT_GENERATE, DONT_INLINE]
  0x0701: PHI (r11v5 java.lang.String) = (r11v7 java.lang.String), (r11v10 java.lang.String) binds: [B:321:0x0701, B:249:0x0616] A[DONT_GENERATE, DONT_INLINE]
  0x0701: PHI (r18v5 com.thinkup.core.common.on.m) = (r18v7 com.thinkup.core.common.on.m), (r18v1 com.thinkup.core.common.on.m) binds: [B:321:0x0701, B:249:0x0616] A[DONT_GENERATE, DONT_INLINE]
  0x0701: PHI (r31v10 com.thinkup.core.oo.n0) = (r31v12 com.thinkup.core.oo.n0), (r31v15 com.thinkup.core.oo.n0) binds: [B:321:0x0701, B:249:0x0616] A[DONT_GENERATE, DONT_INLINE]
  0x0701: PHI (r48v8 com.thinkup.core.common.om) = (r48v10 com.thinkup.core.common.om), (r48v13 com.thinkup.core.common.om) binds: [B:321:0x0701, B:249:0x0616] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:293:0x070a  */
    /* JADX WARN: Code duplicated, block: B:296:0x0714 A[PHI: r3 r9 r10 r18 r31 r39 r48
  0x0714: PHI (r3v4 java.lang.String) = 
  (r3v3 java.lang.String)
  (r3v10 java.lang.String)
  (r3v15 java.lang.String)
  (r3v20 java.lang.String)
  (r3v21 java.lang.String)
  (r3v26 java.lang.String)
 binds: [B:295:0x0712, B:230:0x05c0, B:292:0x0707, B:286:0x06fa, B:320:0x0714, B:268:0x0685] A[DONT_GENERATE, DONT_INLINE]
  0x0714: PHI (r9v5 com.thinkup.core.common.on.m) = 
  (r18v1 com.thinkup.core.common.on.m)
  (r9v17 com.thinkup.core.common.on.m)
  (r9v20 com.thinkup.core.common.on.m)
  (r9v26 com.thinkup.core.common.on.m)
  (r9v27 com.thinkup.core.common.on.m)
  (r9v30 com.thinkup.core.common.on.m)
 binds: [B:295:0x0712, B:230:0x05c0, B:292:0x0707, B:286:0x06fa, B:320:0x0714, B:268:0x0685] A[DONT_GENERATE, DONT_INLINE]
  0x0714: PHI (r10v1 java.util.Map<java.lang.String, java.lang.Object>) = 
  (r10v0 java.util.Map<java.lang.String, java.lang.Object>)
  (r10v6 java.util.Map<java.lang.String, java.lang.Object>)
  (r10v11 java.util.Map<java.lang.String, java.lang.Object>)
  (r10v14 java.util.Map<java.lang.String, java.lang.Object>)
  (r10v15 java.util.Map<java.lang.String, java.lang.Object>)
  (r10v18 java.util.Map<java.lang.String, java.lang.Object>)
 binds: [B:295:0x0712, B:230:0x05c0, B:292:0x0707, B:286:0x06fa, B:320:0x0714, B:268:0x0685] A[DONT_GENERATE, DONT_INLINE]
  0x0714: PHI (r18v3 java.lang.String) = 
  (r18v2 java.lang.String)
  (r18v4 java.lang.String)
  (r18v8 java.lang.String)
  (r18v11 java.lang.String)
  (r18v13 java.lang.String)
  (r18v17 java.lang.String)
 binds: [B:295:0x0712, B:230:0x05c0, B:292:0x0707, B:286:0x06fa, B:320:0x0714, B:268:0x0685] A[DONT_GENERATE, DONT_INLINE]
  0x0714: PHI (r31v5 com.thinkup.core.oo.n0) = 
  (r31v4 com.thinkup.core.oo.n0)
  (r31v9 com.thinkup.core.oo.n0)
  (r31v13 com.thinkup.core.oo.n0)
  (r31v15 com.thinkup.core.oo.n0)
  (r31v15 com.thinkup.core.oo.n0)
  (r31v16 com.thinkup.core.oo.n0)
 binds: [B:295:0x0712, B:230:0x05c0, B:292:0x0707, B:286:0x06fa, B:320:0x0714, B:268:0x0685] A[DONT_GENERATE, DONT_INLINE]
  0x0714: PHI (r39v2 int) = (r39v1 int), (r39v4 int), (r39v7 int), (r39v10 int), (r39v11 int), (r39v14 int) binds: [B:295:0x0712, B:230:0x05c0, B:292:0x0707, B:286:0x06fa, B:320:0x0714, B:268:0x0685] A[DONT_GENERATE, DONT_INLINE]
  0x0714: PHI (r48v4 com.thinkup.core.common.om) = 
  (r48v3 com.thinkup.core.common.om)
  (r48v7 com.thinkup.core.common.om)
  (r48v11 com.thinkup.core.common.om)
  (r48v13 com.thinkup.core.common.om)
  (r48v13 com.thinkup.core.common.om)
  (r48v13 com.thinkup.core.common.om)
 binds: [B:295:0x0712, B:230:0x05c0, B:292:0x0707, B:286:0x06fa, B:320:0x0714, B:268:0x0685] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:298:0x0717 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:299:0x0719 A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:301:0x0720 A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x0749  */
    /* JADX WARN: Code duplicated, block: B:304:0x074b  */
    /* JADX WARN: Code duplicated, block: B:306:0x076b  */
    /* JADX WARN: Code duplicated, block: B:308:0x076f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:309:0x0771  */
    /* JADX WARN: Code duplicated, block: B:310:0x0773  */
    /* JADX WARN: Code duplicated, block: B:73:0x01be A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d0 A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01dd A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ff A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0209 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x02b4 A[Catch: all -> 0x0022, TryCatch #3 {all -> 0x0022, blocks: (B:7:0x001b, B:12:0x0029, B:15:0x0034, B:17:0x003b, B:19:0x004d, B:21:0x004f, B:23:0x0076, B:25:0x007c, B:26:0x0089, B:28:0x008f, B:30:0x0097, B:121:0x0376, B:31:0x00a4, B:35:0x00c5, B:37:0x00ce, B:38:0x00e3, B:42:0x00f6, B:44:0x0101, B:46:0x0116, B:48:0x011c, B:50:0x012a, B:54:0x0142, B:56:0x0148, B:58:0x0156, B:60:0x016a, B:62:0x0174, B:64:0x017f, B:66:0x0185, B:68:0x018b, B:70:0x0199, B:71:0x01ab, B:73:0x01be, B:75:0x01d0, B:77:0x01d4, B:79:0x01dd, B:81:0x01ff, B:85:0x020d, B:87:0x025d, B:90:0x0287, B:92:0x029d, B:94:0x02b0, B:97:0x02bb, B:99:0x02c1, B:101:0x02cb, B:102:0x02ea, B:95:0x02b4, B:104:0x02ec, B:107:0x030d, B:109:0x0336, B:111:0x033f, B:113:0x0345, B:114:0x0348, B:116:0x034e, B:117:0x0359, B:119:0x0360, B:120:0x036f, B:122:0x038a, B:136:0x03c5, B:140:0x03de, B:148:0x0410, B:150:0x0418, B:143:0x03f1, B:145:0x03f9, B:151:0x041b, B:154:0x0420, B:156:0x0433, B:158:0x0438, B:159:0x0465, B:163:0x0476, B:170:0x048a, B:172:0x04a8, B:174:0x04ae, B:177:0x04b7, B:180:0x04bf, B:182:0x04cd, B:183:0x04d1, B:185:0x04d7, B:187:0x04e3, B:192:0x04f1, B:194:0x04f9, B:202:0x052f, B:204:0x0535, B:299:0x0719, B:301:0x0720, B:305:0x074d, B:311:0x0775, B:312:0x0783, B:287:0x06fc, B:196:0x050e, B:198:0x0516, B:166:0x047f, B:125:0x039e, B:127:0x03a4, B:129:0x03b4, B:131:0x03bc), top: B:329:0x001b, outer: #5, inners: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:301:0x0720, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.thinkup.core.api.BaseAd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r43v0, types: [com.thinkup.core.common.o] */
    public final List<com.thinkup.core.common.on.o> o(Context context, String str, boolean z2, boolean z3, boolean z4, ono onoVar) {
        Map<String, Object> mapO;
        TUAdInfo tUAdInfo;
        com.thinkup.core.oo.n0 n0Var;
        List<String> list;
        List<String> list2;
        long j;
        com.thinkup.core.common.on.o oVar;
        boolean zOn;
        com.thinkup.core.common.on.o oVar2;
        TUAdInfo tUAdInfo2;
        List<String> list3;
        List<String> list4;
        boolean z5;
        int i2;
        String str2;
        String str3;
        int i3;
        int i4;
        o0mm next;
        o0mm o0mmVar;
        o0mm o0mmVar2;
        String str4;
        TUBaseAdAdapter tUBaseAdAdapter;
        ArrayList arrayList;
        boolean zInternalIsAdReady;
        boolean z6;
        ?? r0;
        Object obj;
        List<com.thinkup.core.common.on.o> listO;
        boolean z7;
        com.thinkup.core.common.on.o oVar3;
        com.thinkup.core.common.on.n0 n0VarMo;
        Map<String, Object> map;
        com.thinkup.core.oo.n0 n0Var2;
        BaseAd baseAdObject;
        com.thinkup.core.common.on.o oVar4;
        com.thinkup.core.common.on.o oVar5;
        com.thinkup.core.oo.n0 n0Var3;
        int i5;
        int i6;
        Pair<Integer, List<String>> pairMo0;
        long jElapsedRealtime;
        boolean zOn2;
        com.thinkup.core.common.on.n0 n0VarMo2;
        List<String> list5;
        int i7;
        com.thinkup.core.common.on.o oVar6;
        int iN;
        com.thinkup.core.common.on.o oVar7;
        com.thinkup.core.common.on.n0 n0Var4;
        int i8;
        int i9;
        String str5 = str;
        ArrayList arrayList2 = new ArrayList();
        try {
            Object objO = ooo.o().o(str5);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            synchronized (objO) {
                if (onoVar != null) {
                    try {
                        mapO = onoVar.o();
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    mapO = null;
                }
                com.thinkup.core.common.on.m mVarM = onoVar != null ? onoVar.m() : null;
                TUAdInfo tUAdInfoN = onoVar != null ? onoVar.n() : null;
                com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(str5);
                if (n0VarO == null) {
                    return null;
                }
                List<String> listNn = com.thinkup.core.common.n.o0n.m().nn(str5);
                List<String> listO00 = com.thinkup.core.common.n.o0n.m().o00(str5);
                com.thinkup.core.common.on.o oVarO = com.thinkup.core.common.o.n.o().o(str5);
                List<com.thinkup.core.common.on.o> list6 = this.f42106n.get(str5);
                JSONArray jSONArray = new JSONArray();
                if (list6 == null || list6.isEmpty()) {
                    tUAdInfo = tUAdInfoN;
                    n0Var = n0VarO;
                    list = listNn;
                    list2 = listO00;
                    j = jElapsedRealtime2;
                    oVar = oVarO;
                    zOn = false;
                    oVar2 = null;
                } else {
                    ArrayList arrayList3 = new ArrayList(list6);
                    ArrayList arrayList4 = new ArrayList();
                    int i10 = 0;
                    oVar2 = null;
                    while (i10 < arrayList3.size()) {
                        com.thinkup.core.common.on.o oVar8 = (com.thinkup.core.common.on.o) arrayList3.get(i10);
                        if (oVar8 == null) {
                            arrayList4.add(Integer.valueOf(i10));
                            n0Var3 = n0VarO;
                            i5 = i10;
                        } else {
                            o0mm unitGroupInfo = oVar8.oo().getUnitGroupInfo();
                            int iOo0m = unitGroupInfo.oo0m();
                            o0mm o0mmVarO = n0VarO.o(unitGroupInfo.m0o());
                            com.thinkup.core.m.o0.o();
                            n0Var3 = n0VarO;
                            int iO = com.thinkup.core.m.o0.o(str5, o0mmVarO != null ? o0mmVarO : unitGroupInfo);
                            i5 = i10;
                            if (iO != -1) {
                                o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, iO);
                            } else {
                                com.thinkup.core.m.o oVarO2 = com.thinkup.core.m.o.o(com.thinkup.core.common.n.o0n.m().on());
                                if (o0mmVarO == null) {
                                    o0mmVarO = unitGroupInfo;
                                }
                                int iO2 = oVarO2.o(str5, o0mmVarO, n0Var3.o00n());
                                if (iO2 != -1) {
                                    o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, iO2);
                                } else {
                                    if (listNn == null || listNn.size() <= 0) {
                                        i6 = 0;
                                    } else if (listNn.contains(String.valueOf(unitGroupInfo.nm()))) {
                                        i6 = 1;
                                    } else {
                                        o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, 5);
                                    }
                                    if (listO00 != null && listO00.size() > 0) {
                                        if (listO00.contains(String.valueOf(unitGroupInfo.nm()))) {
                                            o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, 6);
                                        } else {
                                            i6 = 2;
                                            pairMo0 = com.thinkup.core.common.n.o0n.m().mo0();
                                            if (pairMo0 == null) {
                                            }
                                            jElapsedRealtime = SystemClock.elapsedRealtime();
                                            zOn2 = oVar8.on();
                                            boolean zMm = oVar8.mm();
                                            n0VarMo2 = oVar8.mo();
                                            if (tUAdInfoN != null) {
                                                if (!o((com.thinkup.core.common.n.mn) tUAdInfoN, oVar8)) {
                                                    o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, 7);
                                                } else {
                                                    n0VarMo2.o0o0();
                                                    oVar8.toString();
                                                    oVar2 = oVar8;
                                                }
                                            }
                                            if (!zOn2) {
                                                tUAdInfoN = tUAdInfoN;
                                                listNn = listNn;
                                                list5 = listO00;
                                                jElapsedRealtime2 = jElapsedRealtime2;
                                                i7 = i5;
                                                arrayList3 = arrayList3;
                                                if (z2) {
                                                    oVar6 = oVar8;
                                                    com.thinkup.core.common.oo0.oo.o(com.thinkup.core.common.nm.n.f41981n, n0VarMo2, n0VarMo2.oon0(), str, n0VarMo2.mon(), n0VarMo2.n0n(), n0Var3.o00n(), SystemClock.elapsedRealtime() - jElapsedRealtime);
                                                } else {
                                                    oVar6 = oVar8;
                                                }
                                                iN = oVar6.n();
                                                oVar6.m0();
                                                if (iN <= 0) {
                                                    com.thinkup.core.n.o0.n.o(oVar6);
                                                }
                                                if (oVar6.oo() != null) {
                                                    com.thinkup.core.common.ooo.o0.o().o0(oVar6.oo());
                                                }
                                                o(oVar6);
                                                if (iN == 0) {
                                                    o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, zOn2 ? 1 : 0);
                                                }
                                                arrayList4.add(Integer.valueOf(i7));
                                            } else {
                                                tUAdInfoN = tUAdInfoN;
                                                listNn = listNn;
                                                list5 = listO00;
                                                jElapsedRealtime2 = jElapsedRealtime2;
                                                i7 = i5;
                                                arrayList3 = arrayList3;
                                                if (z2) {
                                                    oVar6 = oVar8;
                                                    com.thinkup.core.common.oo0.oo.o(com.thinkup.core.common.nm.n.f41981n, n0VarMo2, n0VarMo2.oon0(), str, n0VarMo2.mon(), n0VarMo2.n0n(), n0Var3.o00n(), SystemClock.elapsedRealtime() - jElapsedRealtime);
                                                } else {
                                                    oVar6 = oVar8;
                                                }
                                                iN = oVar6.n();
                                                oVar6.m0();
                                                if (iN <= 0) {
                                                    com.thinkup.core.n.o0.n.o(oVar6);
                                                }
                                                if (oVar6.oo() != null) {
                                                    com.thinkup.core.common.ooo.o0.o().o0(oVar6.oo());
                                                }
                                                o(oVar6);
                                                if (iN == 0) {
                                                    o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, zOn2 ? 1 : 0);
                                                }
                                                arrayList4.add(Integer.valueOf(i7));
                                            }
                                        }
                                    } else {
                                        pairMo0 = com.thinkup.core.common.n.o0n.m().mo0();
                                        if (pairMo0 == null && ((Integer) pairMo0.first).intValue() == 1) {
                                            List list7 = (List) pairMo0.second;
                                            if (list7 != null && !list7.isEmpty()) {
                                                if (list7.contains(String.valueOf(unitGroupInfo.nm()))) {
                                                    o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, 28);
                                                } else {
                                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                                    zOn2 = oVar8.on();
                                                    boolean zMm2 = oVar8.mm();
                                                    n0VarMo2 = oVar8.mo();
                                                    if (tUAdInfoN != null) {
                                                        if (!o((com.thinkup.core.common.n.mn) tUAdInfoN, oVar8)) {
                                                            o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, 7);
                                                        } else {
                                                            n0VarMo2.o0o0();
                                                            oVar8.toString();
                                                            oVar2 = oVar8;
                                                        }
                                                    }
                                                    if (!zOn2) {
                                                        tUAdInfoN = tUAdInfoN;
                                                        listNn = listNn;
                                                        list5 = listO00;
                                                        jElapsedRealtime2 = jElapsedRealtime2;
                                                        i7 = i5;
                                                        arrayList3 = arrayList3;
                                                        if (z2) {
                                                            oVar6 = oVar8;
                                                            com.thinkup.core.common.oo0.oo.o(com.thinkup.core.common.nm.n.f41981n, n0VarMo2, n0VarMo2.oon0(), str, n0VarMo2.mon(), n0VarMo2.n0n(), n0Var3.o00n(), SystemClock.elapsedRealtime() - jElapsedRealtime);
                                                        } else {
                                                            oVar6 = oVar8;
                                                        }
                                                        iN = oVar6.n();
                                                        oVar6.m0();
                                                        if (iN <= 0) {
                                                            com.thinkup.core.n.o0.n.o(oVar6);
                                                        }
                                                        if (oVar6.oo() != null) {
                                                            com.thinkup.core.common.ooo.o0.o().o0(oVar6.oo());
                                                        }
                                                        o(oVar6);
                                                        if (iN == 0) {
                                                            o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, zOn2 ? 1 : 0);
                                                        }
                                                        arrayList4.add(Integer.valueOf(i7));
                                                    } else {
                                                        tUAdInfoN = tUAdInfoN;
                                                        listNn = listNn;
                                                        list5 = listO00;
                                                        jElapsedRealtime2 = jElapsedRealtime2;
                                                        i7 = i5;
                                                        arrayList3 = arrayList3;
                                                        if (z2) {
                                                            oVar6 = oVar8;
                                                            com.thinkup.core.common.oo0.oo.o(com.thinkup.core.common.nm.n.f41981n, n0VarMo2, n0VarMo2.oon0(), str, n0VarMo2.mon(), n0VarMo2.n0n(), n0Var3.o00n(), SystemClock.elapsedRealtime() - jElapsedRealtime);
                                                        } else {
                                                            oVar6 = oVar8;
                                                        }
                                                        iN = oVar6.n();
                                                        oVar6.m0();
                                                        if (iN <= 0) {
                                                            com.thinkup.core.n.o0.n.o(oVar6);
                                                        }
                                                        if (oVar6.oo() != null) {
                                                            com.thinkup.core.common.ooo.o0.o().o0(oVar6.oo());
                                                        }
                                                        o(oVar6);
                                                        if (iN == 0) {
                                                            o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, zOn2 ? 1 : 0);
                                                        }
                                                        arrayList4.add(Integer.valueOf(i7));
                                                    }
                                                }
                                            } else {
                                                o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, 27);
                                            }
                                        } else {
                                            jElapsedRealtime = SystemClock.elapsedRealtime();
                                            zOn2 = oVar8.on();
                                            boolean zMm3 = oVar8.mm();
                                            n0VarMo2 = oVar8.mo();
                                            if (tUAdInfoN != null && (tUAdInfoN instanceof com.thinkup.core.common.n.mn)) {
                                                if (!o((com.thinkup.core.common.n.mn) tUAdInfoN, oVar8)) {
                                                    o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, 7);
                                                } else {
                                                    n0VarMo2.o0o0();
                                                    oVar8.toString();
                                                    oVar2 = oVar8;
                                                }
                                            }
                                            if (!zOn2 && zMm3) {
                                                if (z2) {
                                                    i7 = i5;
                                                    i9 = i6;
                                                    list5 = listO00;
                                                    oVar7 = oVar8;
                                                    i8 = 0;
                                                    com.thinkup.core.common.oo0.oo.o(com.thinkup.core.common.nm.n.m, n0VarMo2, n0VarMo2.oon0(), str, n0VarMo2.mon(), n0VarMo2.n0n(), n0Var3.o00n(), SystemClock.elapsedRealtime() - jElapsedRealtime);
                                                    n0Var4 = n0VarMo2;
                                                } else {
                                                    list5 = listO00;
                                                    oVar7 = oVar8;
                                                    n0Var4 = n0VarMo2;
                                                    i7 = i5;
                                                    i8 = 0;
                                                    i9 = i6;
                                                }
                                                o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), oVar7.oo().getInternalNetworkSDKVersion(), true, -1);
                                                n0Var4.oon(jSONArray.toString());
                                                n0Var4.omo(iOo0m);
                                                n0Var4.n0o(i9);
                                                if (!z4) {
                                                    if (oVarO != null && com.thinkup.core.common.ooo.mn.o(oVarO.oo().getUnitGroupInfo(), oVar7.oo().getUnitGroupInfo()) < 0) {
                                                        com.thinkup.core.common.on.o oVar9 = oVarO;
                                                        if (o(oVar9, jSONArray, listNn, list5, oVar2, tUAdInfoN)) {
                                                            arrayList2.add(oVar9);
                                                        } else {
                                                            arrayList2.add(oVar7);
                                                        }
                                                    } else {
                                                        arrayList2.add(oVar7);
                                                    }
                                                    if (z2) {
                                                        com.thinkup.core.common.oo0.oo.o(n0Var4.oon0(), str, true, -1, n0Var3, arrayList2.size() > 0 ? (com.thinkup.core.common.on.o) arrayList2.get(i8) : null, jSONArray.toString(), "", mapO, mVarM, SystemClock.elapsedRealtime() - jElapsedRealtime2, onoVar);
                                                    }
                                                    return arrayList2;
                                                }
                                                arrayList2.add(oVar7);
                                            } else {
                                                tUAdInfoN = tUAdInfoN;
                                                listNn = listNn;
                                                list5 = listO00;
                                                jElapsedRealtime2 = jElapsedRealtime2;
                                                i7 = i5;
                                                arrayList3 = arrayList3;
                                                if (z2) {
                                                    oVar6 = oVar8;
                                                    com.thinkup.core.common.oo0.oo.o(com.thinkup.core.common.nm.n.f41981n, n0VarMo2, n0VarMo2.oon0(), str, n0VarMo2.mon(), n0VarMo2.n0n(), n0Var3.o00n(), SystemClock.elapsedRealtime() - jElapsedRealtime);
                                                } else {
                                                    oVar6 = oVar8;
                                                }
                                                iN = oVar6.n();
                                                oVar6.m0();
                                                if (iN <= 0 && !oVar6.o0o()) {
                                                    com.thinkup.core.n.o0.n.o(oVar6);
                                                }
                                                if (oVar6.oo() != null) {
                                                    com.thinkup.core.common.ooo.o0.o().o0(oVar6.oo());
                                                }
                                                o(oVar6);
                                                if (iN == 0) {
                                                    o(jSONArray, iOo0m, unitGroupInfo.m0o(), unitGroupInfo.nm(), "", false, zOn2 ? 1 : 0);
                                                }
                                                arrayList4.add(Integer.valueOf(i7));
                                            }
                                        }
                                    }
                                    i10 = i7 + 1;
                                    str5 = str;
                                    oVarO = oVarO;
                                    tUAdInfoN = tUAdInfoN;
                                    listNn = listNn;
                                    listO00 = list5;
                                    n0VarO = n0Var3;
                                    arrayList3 = arrayList3;
                                    jElapsedRealtime2 = jElapsedRealtime2;
                                }
                            }
                        }
                        tUAdInfoN = tUAdInfoN;
                        listNn = listNn;
                        list5 = listO00;
                        jElapsedRealtime2 = jElapsedRealtime2;
                        i7 = i5;
                        arrayList3 = arrayList3;
                        i10 = i7 + 1;
                        str5 = str;
                        oVarO = oVarO;
                        tUAdInfoN = tUAdInfoN;
                        listNn = listNn;
                        listO00 = list5;
                        n0VarO = n0Var3;
                        arrayList3 = arrayList3;
                        jElapsedRealtime2 = jElapsedRealtime2;
                    }
                    tUAdInfo = tUAdInfoN;
                    n0Var = n0VarO;
                    list = listNn;
                    list2 = listO00;
                    j = jElapsedRealtime2;
                    oVar = oVarO;
                    zOn = false;
                    zOn = false;
                    zOn = false;
                    if (!arrayList4.isEmpty()) {
                        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                            try {
                                int iIntValue = ((Integer) arrayList4.get(i11)).intValue();
                                if (list6.size() > iIntValue && (oVar5 = list6.get(iIntValue)) != null) {
                                    list6.remove(oVar5);
                                }
                            } catch (Throwable th2) {
                                o("checkCache failed in remove operate", th2);
                            }
                        }
                    }
                }
                if (z4) {
                    if (oVar != null && (arrayList2.size() == 0 || ((oVar4 = (com.thinkup.core.common.on.o) arrayList2.get(zOn ? 1 : 0)) != null && com.thinkup.core.common.ooo.mn.o(oVar.oo().getUnitGroupInfo(), oVar4.oo().getUnitGroupInfo()) < 0))) {
                        com.thinkup.core.common.on.o oVar10 = oVar;
                        if (o(oVar10, jSONArray, list, list2, oVar2, tUAdInfo)) {
                            arrayList2.add(oVar10);
                        }
                    }
                } else {
                    if (oVar != null) {
                        TUAdInfo tUAdInfo3 = tUAdInfo;
                        List<String> list8 = list;
                        List<String> list9 = list2;
                        boolean zO = o(oVar, jSONArray, list8, list9, (com.thinkup.core.common.on.o) null, tUAdInfo3);
                        list3 = list8;
                        list4 = list9;
                        tUAdInfo2 = tUAdInfo3;
                        if (zO) {
                            arrayList2.add(oVar);
                            if (z2) {
                                com.thinkup.core.common.oo0.oo.o(oVar.oo().getTrackingInfo().oon0(), str, true, -1, n0Var, oVar, jSONArray.toString(), "", mapO, mVarM, SystemClock.elapsedRealtime() - j, onoVar);
                            }
                        }
                    } else {
                        tUAdInfo2 = tUAdInfo;
                        list3 = list;
                        list4 = list2;
                    }
                    str = str;
                    Map<String, Object> map2 = mapO;
                    com.thinkup.core.oo.n0 n0Var5 = n0Var;
                    if (n0Var5.nno() == 1) {
                        z5 = true;
                    } else {
                        z5 = n0Var5.nno() == 2 ? z3 : zOn ? 1 : 0;
                    }
                    List<o0mm> listOm0 = n0Var5.om0();
                    ooo oooVarO = ooo.o();
                    StringBuilder sb = new StringBuilder();
                    sb.append(n0Var5.o00n());
                    om omVarO = oooVarO.o(str, sb.toString());
                    String strM0 = (omVarO == null || omVarO.m0() == null) ? "" : omVarO.m0();
                    if (listOm0 == null || listOm0.size() <= 0 || !z5) {
                        i2 = 1;
                        str2 = strM0;
                        if (z2) {
                            if (omVarO != null) {
                                zOn = omVarO.on();
                            }
                            if (omVarO == null) {
                                com.thinkup.core.common.oo0.oo.m("AdManage is null--isReady", "Id:" + str + "--format:" + n0Var5.o00n(), com.thinkup.core.common.n.o0n.m().o0m());
                            }
                            if (zOn) {
                                i4 = 5;
                            } else {
                                i4 = i2;
                            }
                            Map<String, Object> map3 = map2;
                            str3 = str2;
                            com.thinkup.core.common.oo0.oo.o(str3, str, false, i4, n0Var5, (com.thinkup.core.common.on.o) null, jSONArray.toString(), "", map3, mVarM, SystemClock.elapsedRealtime() - j, onoVar);
                            map2 = map3;
                        } else {
                            str3 = str2;
                        }
                        if (z3) {
                            if (tUAdInfo2 != null) {
                                i3 = 5;
                            } else {
                                i3 = i2;
                            }
                            com.thinkup.core.common.oo0.oo.o(str3, str, n0Var5, i3, jSONArray.toString(), map2, onoVar);
                        }
                    } else {
                        String strO = o0m.o().o(context, str);
                        if (TextUtils.isEmpty(strO)) {
                            next = null;
                            break;
                        }
                        Iterator<o0mm> it = listOm0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (next.o0m() != null && next.o0m().contains(strO)) {
                                break;
                            }
                        }
                        if (next == null) {
                            o0mmVar = next;
                        } else {
                            if (!com.thinkup.core.common.ooo.nn.o(list3, "35")) {
                                o(jSONArray, -1, next.m0o(), next.nm(), "", false, 5);
                            } else if (com.thinkup.core.common.ooo.nn.m(list4, "35")) {
                                o(jSONArray, -1, next.m0o(), next.nm(), "", false, 6);
                            } else {
                                o0mmVar = next;
                            }
                            o0mmVar = null;
                        }
                        if (o0mmVar != null) {
                            Map<String, Object> mapO2 = n0Var5.o(str, strM0, o0mmVar, onoVar != null ? onoVar.o0() : null);
                            mapO2.put("isDefaultOffer", Boolean.TRUE);
                            try {
                                com.thinkup.core.common.on.nm nmVarO = com.thinkup.core.common.ooo.oo0.o(o0mmVar);
                                TUBaseAdAdapter tUBaseAdAdapter2 = nmVarO != null ? nmVarO.o : null;
                                boolean zInternalInitNetworkObjectByPlacementId = tUBaseAdAdapter2.internalInitNetworkObjectByPlacementId(context, mapO2, ooo.o().m(str));
                                if (zInternalInitNetworkObjectByPlacementId) {
                                    try {
                                        Map<String, Object> mapM = ooo.o().m(str);
                                        try {
                                            int[] iArr = new int[1];
                                            iArr[zOn ? 1 : 0] = zOn ? 1 : 0;
                                            if (mapM.containsKey(o0mo.n0o)) {
                                                try {
                                                    iArr[zOn ? 1 : 0] = ((Integer) mapM.get(o0mo.n0o)).intValue();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            String str6 = strM0;
                                            n0Var5 = n0Var5;
                                            TUBaseAdAdapter tUBaseAdAdapter3 = tUBaseAdAdapter2;
                                            omVarO = omVarO;
                                            o0mmVar2 = o0mmVar;
                                            try {
                                                com.thinkup.core.common.on.n0 n0VarO2 = m0m.o(str6, str, n0Var5, 0, iArr[zOn ? 1 : 0], map2, null, 0, onoVar != null ? onoVar.o0() : null);
                                                str4 = str6;
                                                map2 = map2;
                                                try {
                                                    m0m.o(n0VarO2, o0mmVar2, zOn ? 1 : 0, true);
                                                    tUBaseAdAdapter = tUBaseAdAdapter3;
                                                    try {
                                                        m0m.o(tUBaseAdAdapter, n0VarO2, o0mmVar2);
                                                        n0VarO2.oo0 = 3;
                                                        arrayList = null;
                                                        n0VarO2.no(m0n.o(o0mmVar2, (TUBaseAdAdapter) null));
                                                        tUBaseAdAdapter.setRefresh(zOn);
                                                    } catch (Throwable unused2) {
                                                    }
                                                } catch (Throwable unused3) {
                                                    i2 = 1;
                                                    mVarM = mVarM;
                                                    str2 = str4;
                                                    if (z2) {
                                                        if (omVarO != null) {
                                                            zOn = omVarO.on();
                                                        }
                                                        if (omVarO == null) {
                                                            com.thinkup.core.common.oo0.oo.m("AdManage is null--isReady", "Id:" + str + "--format:" + n0Var5.o00n(), com.thinkup.core.common.n.o0n.m().o0m());
                                                        }
                                                        if (zOn) {
                                                            i4 = 5;
                                                        } else {
                                                            i4 = i2;
                                                        }
                                                        Map<String, Object> map4 = map2;
                                                        str3 = str2;
                                                        com.thinkup.core.common.oo0.oo.o(str3, str, false, i4, n0Var5, (com.thinkup.core.common.on.o) null, jSONArray.toString(), "", map4, mVarM, SystemClock.elapsedRealtime() - j, onoVar);
                                                        map2 = map4;
                                                    } else {
                                                        str3 = str2;
                                                    }
                                                    if (z3) {
                                                        if (tUAdInfo2 != null) {
                                                            i3 = 5;
                                                        } else {
                                                            i3 = i2;
                                                        }
                                                        com.thinkup.core.common.oo0.oo.o(str3, str, n0Var5, i3, jSONArray.toString(), map2, onoVar);
                                                    }
                                                    return arrayList2;
                                                }
                                            } catch (Throwable unused4) {
                                                n0Var5 = n0Var5;
                                                map2 = map2;
                                                mVarM = mVarM;
                                                i2 = 1;
                                                str2 = str6;
                                                str = str;
                                            }
                                        } catch (Throwable unused5) {
                                            omVarO = omVarO;
                                            str = str;
                                            n0Var5 = n0Var5;
                                            i2 = 1;
                                            str2 = strM0;
                                        }
                                    } catch (Throwable unused6) {
                                        str = str;
                                        i2 = 1;
                                    }
                                } else {
                                    tUBaseAdAdapter = tUBaseAdAdapter2;
                                    n0Var5 = n0Var5;
                                    str4 = strM0;
                                    omVarO = omVarO;
                                    o0mmVar2 = o0mmVar;
                                    arrayList = null;
                                }
                                if (TextUtils.equals(String.valueOf(n0Var5.o00n()), "0")) {
                                    if (zInternalInitNetworkObjectByPlacementId) {
                                        baseAdObject = tUBaseAdAdapter.getBaseAdObject(context);
                                        if (baseAdObject != null) {
                                            z6 = true;
                                        }
                                        if (z6) {
                                            if (r0 != 0) {
                                                ArrayList arrayList5 = new ArrayList();
                                                r0.setTrackingInfo(tUBaseAdAdapter.getTrackingInfo().nmm());
                                                arrayList5.add(r0);
                                                arrayList = arrayList5;
                                            }
                                            try {
                                                listO = o(str, tUBaseAdAdapter, arrayList, o0mmVar2.on0());
                                                if (listO.size() > 0) {
                                                    for (com.thinkup.core.common.on.o oVar11 : listO) {
                                                        n0VarMo = oVar11.mo();
                                                        try {
                                                            n0VarMo.onm = 1;
                                                            n0VarMo.omo(zOn ? 1 : 0);
                                                            n0VarMo.oon(jSONArray.toString());
                                                            if (z2) {
                                                                i2 = 1;
                                                                map = map2;
                                                                mVarM = mVarM;
                                                                n0Var2 = n0Var5;
                                                                str2 = str4;
                                                                try {
                                                                    com.thinkup.core.common.oo0.oo.o(n0VarMo.oon0(), str, true, -1, n0Var2, oVar11, jSONArray.toString(), o0mmVar2.o0m(), map, mVarM, onoVar);
                                                                    map2 = map;
                                                                } catch (Throwable unused7) {
                                                                    str = str;
                                                                    n0Var5 = n0Var2;
                                                                    map2 = map;
                                                                }
                                                            } else {
                                                                mVarM = mVarM;
                                                                str2 = str4;
                                                            }
                                                            listO = listO;
                                                            str4 = str2;
                                                            mVarM = mVarM;
                                                        } catch (Throwable unused8) {
                                                            i2 = 1;
                                                            mVarM = mVarM;
                                                            str2 = str4;
                                                        }
                                                    }
                                                    str = str;
                                                    mVarM = mVarM;
                                                    i2 = 1;
                                                    str2 = str4;
                                                    try {
                                                        oVar3 = listO.get(zOn ? 1 : 0);
                                                        if (tUAdInfo2 != null || !(tUAdInfo2 instanceof com.thinkup.core.common.n.mn)) {
                                                            z7 = true;
                                                        } else if (!o((com.thinkup.core.common.n.mn) tUAdInfo2, oVar3)) {
                                                            o(jSONArray, -1, oVar3.mo().mon(), oVar3.mo().n0n(), "", false, 7);
                                                            oVar3.toString();
                                                            z7 = zOn ? 1 : 0;
                                                        } else {
                                                            oVar3.mo().o0o0();
                                                            oVar3.toString();
                                                            z7 = true;
                                                        }
                                                        if (z7) {
                                                            arrayList2.add(oVar3);
                                                        }
                                                    } catch (Throwable unused9) {
                                                    }
                                                } else {
                                                    str = str;
                                                    mVarM = mVarM;
                                                    i2 = 1;
                                                    str2 = str4;
                                                    z7 = true;
                                                }
                                                if (!z7) {
                                                    if (z2) {
                                                        if (omVarO != null) {
                                                            zOn = omVarO.on();
                                                        }
                                                        if (omVarO == null) {
                                                            com.thinkup.core.common.oo0.oo.m("AdManage is null--isReady", "Id:" + str + "--format:" + n0Var5.o00n(), com.thinkup.core.common.n.o0n.m().o0m());
                                                        }
                                                        if (zOn) {
                                                            i4 = 5;
                                                        } else {
                                                            i4 = i2;
                                                        }
                                                        Map<String, Object> map5 = map2;
                                                        str3 = str2;
                                                        com.thinkup.core.common.oo0.oo.o(str3, str, false, i4, n0Var5, (com.thinkup.core.common.on.o) null, jSONArray.toString(), "", map5, mVarM, SystemClock.elapsedRealtime() - j, onoVar);
                                                        map2 = map5;
                                                    } else {
                                                        str3 = str2;
                                                    }
                                                    if (z3) {
                                                        if (tUAdInfo2 != null) {
                                                            i3 = 5;
                                                        } else {
                                                            i3 = i2;
                                                        }
                                                        com.thinkup.core.common.oo0.oo.o(str3, str, n0Var5, i3, jSONArray.toString(), map2, onoVar);
                                                    }
                                                }
                                            } catch (Throwable unused10) {
                                                str = str;
                                                mVarM = mVarM;
                                                i2 = 1;
                                                str2 = str4;
                                            }
                                        } else {
                                            obj = baseAdObject;
                                            r0 = baseAdObject;
                                            str = str;
                                        }
                                        mVarM = mVarM;
                                        i2 = 1;
                                        str2 = str4;
                                        if (z2) {
                                            if (omVarO != null) {
                                                zOn = omVarO.on();
                                            }
                                            if (omVarO == null) {
                                                com.thinkup.core.common.oo0.oo.m("AdManage is null--isReady", "Id:" + str + "--format:" + n0Var5.o00n(), com.thinkup.core.common.n.o0n.m().o0m());
                                            }
                                            if (zOn) {
                                                i4 = 5;
                                            } else {
                                                i4 = i2;
                                            }
                                            Map<String, Object> map6 = map2;
                                            str3 = str2;
                                            com.thinkup.core.common.oo0.oo.o(str3, str, false, i4, n0Var5, (com.thinkup.core.common.on.o) null, jSONArray.toString(), "", map6, mVarM, SystemClock.elapsedRealtime() - j, onoVar);
                                            map2 = map6;
                                        } else {
                                            str3 = str2;
                                        }
                                        if (z3) {
                                            if (tUAdInfo2 != null) {
                                                i3 = 5;
                                            } else {
                                                i3 = i2;
                                            }
                                            com.thinkup.core.common.oo0.oo.o(str3, str, n0Var5, i3, jSONArray.toString(), map2, onoVar);
                                        }
                                    } else {
                                        obj = arrayList;
                                    }
                                    obj = baseAdObject;
                                    z6 = zOn ? 1 : 0;
                                    r0 = obj;
                                    if (z6) {
                                        if (r0 != 0) {
                                            ArrayList arrayList6 = new ArrayList();
                                            r0.setTrackingInfo(tUBaseAdAdapter.getTrackingInfo().nmm());
                                            arrayList6.add(r0);
                                            arrayList = arrayList6;
                                        }
                                        listO = o(str, tUBaseAdAdapter, arrayList, o0mmVar2.on0());
                                        if (listO.size() > 0) {
                                            while (r17.hasNext()) {
                                                n0VarMo = oVar11.mo();
                                                n0VarMo.onm = 1;
                                                n0VarMo.omo(zOn ? 1 : 0);
                                                n0VarMo.oon(jSONArray.toString());
                                                if (z2) {
                                                    i2 = 1;
                                                    map = map2;
                                                    mVarM = mVarM;
                                                    n0Var2 = n0Var5;
                                                    str2 = str4;
                                                    com.thinkup.core.common.oo0.oo.o(n0VarMo.oon0(), str, true, -1, n0Var2, oVar11, jSONArray.toString(), o0mmVar2.o0m(), map, mVarM, onoVar);
                                                    map2 = map;
                                                } else {
                                                    mVarM = mVarM;
                                                    str2 = str4;
                                                }
                                                listO = listO;
                                                str4 = str2;
                                                mVarM = mVarM;
                                            }
                                            str = str;
                                            mVarM = mVarM;
                                            i2 = 1;
                                            str2 = str4;
                                            oVar3 = listO.get(zOn ? 1 : 0);
                                            if (tUAdInfo2 != null) {
                                                z7 = true;
                                            } else {
                                                z7 = true;
                                            }
                                            if (z7) {
                                                arrayList2.add(oVar3);
                                            }
                                        } else {
                                            str = str;
                                            mVarM = mVarM;
                                            i2 = 1;
                                            str2 = str4;
                                            z7 = true;
                                        }
                                        if (!z7) {
                                            if (z2) {
                                                if (omVarO != null) {
                                                    zOn = omVarO.on();
                                                }
                                                if (omVarO == null) {
                                                    com.thinkup.core.common.oo0.oo.m("AdManage is null--isReady", "Id:" + str + "--format:" + n0Var5.o00n(), com.thinkup.core.common.n.o0n.m().o0m());
                                                }
                                                if (zOn) {
                                                    i4 = 5;
                                                } else {
                                                    i4 = i2;
                                                }
                                                Map<String, Object> map7 = map2;
                                                str3 = str2;
                                                com.thinkup.core.common.oo0.oo.o(str3, str, false, i4, n0Var5, (com.thinkup.core.common.on.o) null, jSONArray.toString(), "", map7, mVarM, SystemClock.elapsedRealtime() - j, onoVar);
                                                map2 = map7;
                                            } else {
                                                str3 = str2;
                                            }
                                            if (z3) {
                                                if (tUAdInfo2 != null) {
                                                    i3 = 5;
                                                } else {
                                                    i3 = i2;
                                                }
                                                com.thinkup.core.common.oo0.oo.o(str3, str, n0Var5, i3, jSONArray.toString(), map2, onoVar);
                                            }
                                        }
                                    } else {
                                        obj = baseAdObject;
                                        r0 = baseAdObject;
                                        str = str;
                                    }
                                    mVarM = mVarM;
                                    i2 = 1;
                                    str2 = str4;
                                    if (z2) {
                                        if (omVarO != null) {
                                            zOn = omVarO.on();
                                        }
                                        if (omVarO == null) {
                                            com.thinkup.core.common.oo0.oo.m("AdManage is null--isReady", "Id:" + str + "--format:" + n0Var5.o00n(), com.thinkup.core.common.n.o0n.m().o0m());
                                        }
                                        if (zOn) {
                                            i4 = 5;
                                        } else {
                                            i4 = i2;
                                        }
                                        Map<String, Object> map8 = map2;
                                        str3 = str2;
                                        com.thinkup.core.common.oo0.oo.o(str3, str, false, i4, n0Var5, (com.thinkup.core.common.on.o) null, jSONArray.toString(), "", map8, mVarM, SystemClock.elapsedRealtime() - j, onoVar);
                                        map2 = map8;
                                    } else {
                                        str3 = str2;
                                    }
                                    if (z3) {
                                        if (tUAdInfo2 != null) {
                                            i3 = 5;
                                        } else {
                                            i3 = i2;
                                        }
                                        com.thinkup.core.common.oo0.oo.o(str3, str, n0Var5, i3, jSONArray.toString(), map2, onoVar);
                                    }
                                } else {
                                    if (zInternalInitNetworkObjectByPlacementId) {
                                        try {
                                            zInternalIsAdReady = tUBaseAdAdapter.internalIsAdReady();
                                        } catch (Throwable th3) {
                                            o("checkCache failed in network is ready", th3);
                                            obj = arrayList;
                                            obj = baseAdObject;
                                            z6 = zOn ? 1 : 0;
                                            r0 = obj;
                                        }
                                    } else {
                                        zInternalIsAdReady = zOn ? 1 : 0;
                                    }
                                    z6 = zInternalIsAdReady;
                                    r0 = arrayList;
                                    if (z6) {
                                        if (r0 != 0) {
                                            ArrayList arrayList7 = new ArrayList();
                                            r0.setTrackingInfo(tUBaseAdAdapter.getTrackingInfo().nmm());
                                            arrayList7.add(r0);
                                            arrayList = arrayList7;
                                        }
                                        listO = o(str, tUBaseAdAdapter, arrayList, o0mmVar2.on0());
                                        if (listO.size() > 0) {
                                            while (r17.hasNext()) {
                                                n0VarMo = oVar11.mo();
                                                n0VarMo.onm = 1;
                                                n0VarMo.omo(zOn ? 1 : 0);
                                                n0VarMo.oon(jSONArray.toString());
                                                if (z2) {
                                                    i2 = 1;
                                                    map = map2;
                                                    mVarM = mVarM;
                                                    n0Var2 = n0Var5;
                                                    str2 = str4;
                                                    com.thinkup.core.common.oo0.oo.o(n0VarMo.oon0(), str, true, -1, n0Var2, oVar11, jSONArray.toString(), o0mmVar2.o0m(), map, mVarM, onoVar);
                                                    map2 = map;
                                                } else {
                                                    mVarM = mVarM;
                                                    str2 = str4;
                                                }
                                                listO = listO;
                                                str4 = str2;
                                                mVarM = mVarM;
                                            }
                                            str = str;
                                            mVarM = mVarM;
                                            i2 = 1;
                                            str2 = str4;
                                            oVar3 = listO.get(zOn ? 1 : 0);
                                            if (tUAdInfo2 != null) {
                                                z7 = true;
                                            } else {
                                                z7 = true;
                                            }
                                            if (z7) {
                                                arrayList2.add(oVar3);
                                            }
                                        } else {
                                            str = str;
                                            mVarM = mVarM;
                                            i2 = 1;
                                            str2 = str4;
                                            z7 = true;
                                        }
                                        if (!z7) {
                                            if (z2) {
                                                if (omVarO != null) {
                                                    zOn = omVarO.on();
                                                }
                                                if (omVarO == null) {
                                                    com.thinkup.core.common.oo0.oo.m("AdManage is null--isReady", "Id:" + str + "--format:" + n0Var5.o00n(), com.thinkup.core.common.n.o0n.m().o0m());
                                                }
                                                if (zOn) {
                                                    i4 = 5;
                                                } else {
                                                    i4 = i2;
                                                }
                                                Map<String, Object> map9 = map2;
                                                str3 = str2;
                                                com.thinkup.core.common.oo0.oo.o(str3, str, false, i4, n0Var5, (com.thinkup.core.common.on.o) null, jSONArray.toString(), "", map9, mVarM, SystemClock.elapsedRealtime() - j, onoVar);
                                                map2 = map9;
                                            } else {
                                                str3 = str2;
                                            }
                                            if (z3) {
                                                if (tUAdInfo2 != null) {
                                                    i3 = 5;
                                                } else {
                                                    i3 = i2;
                                                }
                                                com.thinkup.core.common.oo0.oo.o(str3, str, n0Var5, i3, jSONArray.toString(), map2, onoVar);
                                            }
                                        }
                                    } else {
                                        obj = baseAdObject;
                                        r0 = baseAdObject;
                                        str = str;
                                    }
                                    mVarM = mVarM;
                                    i2 = 1;
                                    str2 = str4;
                                    if (z2) {
                                        if (omVarO != null) {
                                            zOn = omVarO.on();
                                        }
                                        if (omVarO == null) {
                                            com.thinkup.core.common.oo0.oo.m("AdManage is null--isReady", "Id:" + str + "--format:" + n0Var5.o00n(), com.thinkup.core.common.n.o0n.m().o0m());
                                        }
                                        if (zOn) {
                                            i4 = 5;
                                        } else {
                                            i4 = i2;
                                        }
                                        Map<String, Object> map10 = map2;
                                        str3 = str2;
                                        com.thinkup.core.common.oo0.oo.o(str3, str, false, i4, n0Var5, (com.thinkup.core.common.on.o) null, jSONArray.toString(), "", map10, mVarM, SystemClock.elapsedRealtime() - j, onoVar);
                                        map2 = map10;
                                    } else {
                                        str3 = str2;
                                    }
                                    if (z3) {
                                        if (tUAdInfo2 != null) {
                                            i3 = 5;
                                        } else {
                                            i3 = i2;
                                        }
                                        com.thinkup.core.common.oo0.oo.o(str3, str, n0Var5, i3, jSONArray.toString(), map2, onoVar);
                                    }
                                }
                            } catch (Throwable unused11) {
                            }
                        } else {
                            i2 = 1;
                            str2 = strM0;
                            if (z2) {
                                if (omVarO != null) {
                                    zOn = omVarO.on();
                                }
                                if (omVarO == null) {
                                    com.thinkup.core.common.oo0.oo.m("AdManage is null--isReady", "Id:" + str + "--format:" + n0Var5.o00n(), com.thinkup.core.common.n.o0n.m().o0m());
                                }
                                if (zOn) {
                                    i4 = 5;
                                } else {
                                    i4 = i2;
                                }
                                Map<String, Object> map11 = map2;
                                str3 = str2;
                                com.thinkup.core.common.oo0.oo.o(str3, str, false, i4, n0Var5, (com.thinkup.core.common.on.o) null, jSONArray.toString(), "", map11, mVarM, SystemClock.elapsedRealtime() - j, onoVar);
                                map2 = map11;
                            } else {
                                str3 = str2;
                            }
                            if (z3) {
                                if (tUAdInfo2 != null) {
                                    i3 = 5;
                                } else {
                                    i3 = i2;
                                }
                                com.thinkup.core.common.oo0.oo.o(str3, str, n0Var5, i3, jSONArray.toString(), map2, onoVar);
                            }
                        }
                    }
                }
                return arrayList2;
            }
        } catch (Throwable th4) {
            o("checkCache failed in method. size: " + arrayList2.size(), th4);
        }
    }

    private static boolean o(JSONArray jSONArray, TUAdInfo tUAdInfo, com.thinkup.core.common.on.o oVar) {
        if (tUAdInfo != null && (tUAdInfo instanceof com.thinkup.core.common.n.mn)) {
            if (!o((com.thinkup.core.common.n.mn) tUAdInfo, oVar)) {
                o(jSONArray, -1, oVar.mo().mon(), oVar.mo().n0n(), "", false, 7);
                oVar.toString();
                return false;
            }
            oVar.mo().o0o0();
            oVar.toString();
        }
        return true;
    }

    private static boolean o(com.thinkup.core.common.on.o oVar, JSONArray jSONArray, List<String> list, List<String> list2, com.thinkup.core.common.on.o oVar2, TUAdInfo tUAdInfo) {
        com.thinkup.core.common.on.n0 n0VarMo = oVar.mo();
        if (!com.thinkup.core.common.ooo.nn.o(list, "66")) {
            o(jSONArray, -1, n0VarMo.mon(), n0VarMo.n0n(), "", false, 5);
            return false;
        }
        if (com.thinkup.core.common.ooo.nn.m(list2, "66")) {
            o(jSONArray, -1, n0VarMo.mon(), n0VarMo.n0n(), "", false, 6);
            return false;
        }
        if (oVar2 != null) {
            if (TextUtils.equals(oVar2.mo().oon0(), n0VarMo.oon0()) && TextUtils.equals(oVar2.mo().mon(), n0VarMo.mon())) {
                n0VarMo.o0o0();
                oVar.toString();
                return true;
            }
            o(jSONArray, -1, n0VarMo.mon(), n0VarMo.n0n(), "", false, 7);
            oVar.toString();
            oVar2.toString();
            return false;
        }
        if (oVar2 != null || tUAdInfo == null || !(tUAdInfo instanceof com.thinkup.core.common.n.mn)) {
            return true;
        }
        if (o((com.thinkup.core.common.n.mn) tUAdInfo, oVar)) {
            n0VarMo.o0o0();
            tUAdInfo.toString();
            return true;
        }
        o(jSONArray, -1, n0VarMo.mon(), n0VarMo.n0n(), "", false, 7);
        oVar.toString();
        tUAdInfo.toString();
        return false;
    }

    private static boolean o(com.thinkup.core.common.n.mn mnVar, com.thinkup.core.common.on.o oVar) {
        if (mnVar != null && oVar != null) {
            String requestId = mnVar.getRequestId();
            String adsourceId = mnVar.getAdsourceId();
            com.thinkup.core.common.on.n0 n0VarMo = oVar.mo();
            if (TextUtils.equals(requestId, n0VarMo.oon0()) && TextUtils.equals(adsourceId, n0VarMo.mon())) {
                return true;
            }
        }
        return false;
    }

    private static void o(TUBaseAdAdapter tUBaseAdAdapter, String str, String str2, com.thinkup.core.oo.n0 n0Var, o0mm o0mmVar, Map<String, Object> map, ono onoVar) {
        Map<String, Object> mapM = ooo.o().m(str2);
        int[] iArr = {0};
        if (mapM.containsKey(o0mo.n0o)) {
            try {
                iArr[0] = ((Integer) mapM.get(o0mo.n0o)).intValue();
            } catch (Throwable unused) {
            }
        }
        com.thinkup.core.common.on.n0 n0VarO = m0m.o(str, str2, n0Var, 0, iArr[0], map, null, 0, onoVar != null ? onoVar.o0() : null);
        m0m.o(n0VarO, o0mmVar, 0, true);
        m0m.o(tUBaseAdAdapter, n0VarO, o0mmVar);
        n0VarO.oo0 = 3;
        n0VarO.no(m0n.o(o0mmVar, (TUBaseAdAdapter) null));
        tUBaseAdAdapter.setRefresh(false);
    }

    private static void o(JSONArray jSONArray, int i2, String str, int i3, String str2, boolean z2, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, i2);
            jSONObject.put("unit_id", str);
            jSONObject.put("nw_firm_id", i3);
            jSONObject.put("nw_ver", str2);
            jSONObject.put("result", z2 ? 1 : 0);
            if (i4 != -1) {
                jSONObject.put("reason", i4);
            }
        } catch (Throwable th) {
            o("checkCache failed in addCheckObjectInfo.", th);
        }
        jSONArray.put(jSONObject);
    }

    public final void o(com.thinkup.core.common.on.o oVar) {
        if (oVar == null) {
            return;
        }
        com.thinkup.core.common.on.n0 n0VarMo = oVar.mo();
        m(n0VarMo.oomn(), oVar.oo().getUnitGroupInfo());
        o0mn o0mnVar = this.o0.get(o(n0VarMo.oomn(), n0VarMo.mon()));
        if (o0mnVar == null) {
            return;
        }
        o0mnVar.o(oVar);
    }

    public final void o(String str, o0mm o0mmVar, String str2) {
        synchronized (ooo.o().o(str)) {
            List<com.thinkup.core.common.on.o> list = this.f42106n.get(str);
            if (list != null) {
                for (com.thinkup.core.common.on.o oVar : list) {
                    if (TextUtils.equals(oVar.mo().mon(), o0mmVar.m0o()) && TextUtils.equals(oVar.mo().oon0(), str2)) {
                        o(oVar);
                        m(oVar);
                        oVar.no();
                        return;
                    }
                }
            }
        }
    }

    private void o(String str, int i2) {
        o(str, i2, true, 7);
    }

    public final void o(String str, List<TUAdInfo> list, boolean z2, int i2) {
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0) {
            return;
        }
        list.toString();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String sharedPlacementId = null;
        for (TUAdInfo tUAdInfo : list) {
            if (tUAdInfo != null) {
                if (tUAdInfo.getPlacementType() == 2) {
                    if (sharedPlacementId == null) {
                        sharedPlacementId = tUAdInfo.getSharedPlacementId();
                    }
                    if (z2) {
                        arrayList.add(tUAdInfo);
                    }
                } else {
                    arrayList2.add(tUAdInfo);
                }
            }
        }
        if (arrayList2.size() > 0) {
            o(str, arrayList2, i2);
        }
        if (arrayList.size() > 0) {
            o(sharedPlacementId, arrayList, i2);
        }
    }

    private void o(String str, List<TUAdInfo> list, int i2) {
        synchronized (ooo.o().o(str)) {
            try {
                List<com.thinkup.core.common.on.o> list2 = this.f42106n.get(str);
                if (list2 == null) {
                    return;
                }
                com.thinkup.core.common.on.n0 n0Var = null;
                for (int size = list.size() - 1; size >= 0; size--) {
                    TUAdInfo tUAdInfo = list.get(size);
                    if (tUAdInfo instanceof com.thinkup.core.common.n.mn) {
                        com.thinkup.core.common.n.mn mnVar = (com.thinkup.core.common.n.mn) tUAdInfo;
                        String requestId = mnVar.getRequestId();
                        String adsourceId = mnVar.getAdsourceId();
                        if (!TextUtils.isEmpty(requestId) && !TextUtils.isEmpty(adsourceId)) {
                            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                                com.thinkup.core.common.on.o oVar = list2.get(size2);
                                com.thinkup.core.common.on.n0 n0VarMo = oVar.mo();
                                if (n0Var == null) {
                                    n0Var = n0VarMo;
                                }
                                if (TextUtils.equals(adsourceId, n0VarMo.mon()) && TextUtils.equals(requestId, n0VarMo.oon0())) {
                                    oVar.toString();
                                    list2.remove(size2);
                                    com.thinkup.core.n.o0.n.o(oVar, i2);
                                    o(oVar);
                                    oVar.no();
                                    break;
                                }
                            }
                        }
                    }
                }
                com.thinkup.core.common.oo0.oo.o(n0Var, i2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(final Context context, final com.thinkup.core.common.on.o oVar) {
        final TUBaseAdAdapter tUBaseAdAdapterOo = oVar.oo();
        final com.thinkup.core.common.on.n0 n0VarMo = oVar.mo();
        o0mm unitGroupInfo = tUBaseAdAdapterOo != null ? tUBaseAdAdapterOo.getUnitGroupInfo() : null;
        if (n0VarMo != null) {
            String strOomn = n0VarMo.oomn();
            String strOon0 = n0VarMo.oon0();
            om omVarO = ooo.o().o(strOomn, n0VarMo.oono());
            if (omVarO != null) {
                omVarO.o(strOon0, unitGroupInfo != null ? com.thinkup.core.common.ooo.nn.o(unitGroupInfo) : 0.0d, unitGroupInfo);
            } else {
                StringBuilder sbY = a.y("Id:", strOomn, "--format:");
                sbY.append(n0VarMo.oono());
                sbY.append("--adsource:");
                sbY.append(n0VarMo.mon());
                com.thinkup.core.common.oo0.oo.m("AdManage is null--Show", sbY.toString(), com.thinkup.core.common.n.o0n.m().o0m());
            }
            ooo.o().o(strOomn, strOon0, o(strOomn));
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.o.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.thinkup.core.m.o.o(context);
                    com.thinkup.core.common.on.n0 n0Var = n0VarMo;
                    com.thinkup.core.m.o.o(n0Var, n0Var.oono(), n0VarMo.oomn(), n0VarMo.mon());
                    com.thinkup.core.m.o0.o();
                    n0VarMo.oomn();
                    com.thinkup.core.m.o0.o();
                    n0VarMo.oomn();
                    n0VarMo.mon();
                    o.this.o(oVar);
                    o.this.m(oVar);
                    MediationBidManager mediationBidManagerM = com.thinkup.core.n.n.o().m();
                    if (mediationBidManagerM != null) {
                        mediationBidManagerM.notifyWinnerDisplay(n0VarMo.oomn(), tUBaseAdAdapterOo.getUnitGroupInfo());
                    }
                }
            }, 2);
        }
    }

    public final o0mn o(String str, o0mm o0mmVar) {
        return this.o0.get(o(str, o0mmVar.m0o()));
    }

    private static void o(String str, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString() + IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        com.thinkup.core.common.oo0.oo.m(str, sb.toString(), com.thinkup.core.common.n.o0n.m().o0m());
    }

    public final void o(String str, int i2, boolean z2, int i3) {
        List<TUAdInfo> listO;
        if (TextUtils.isEmpty(str) || com.thinkup.core.common.n.o0n.m().on() == null) {
            return;
        }
        com.thinkup.core.oo.n0 n0VarO = com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(str);
        String strValueOf = n0VarO != null ? String.valueOf(n0VarO.o00n()) : null;
        if (TextUtils.isEmpty(strValueOf)) {
            return;
        }
        synchronized (ooo.o().o(str)) {
            try {
                if (this.f42106n.get(str) == null) {
                    return;
                }
                om omVarO = om.o(com.thinkup.core.common.n.o0n.m().on(), str, strValueOf);
                if (omVarO != null) {
                    if (z2) {
                        listO = omVarO.o(com.thinkup.core.common.n.o0n.m().on());
                    } else {
                        listO = omVarO.o(com.thinkup.core.common.n.o0n.m().on(), (ono) null);
                    }
                    if (listO != null && listO.size() != 0) {
                        if (i2 >= listO.size() - 1) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (i2 >= 0) {
                            while (true) {
                                i2++;
                                if (i2 >= listO.size()) {
                                    break;
                                } else {
                                    arrayList.add(listO.get(i2));
                                }
                            }
                        } else {
                            arrayList.addAll(listO);
                        }
                        o(str, arrayList, z2, i3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<com.thinkup.core.common.on.o> o(String str, TUBaseAdAdapter tUBaseAdAdapter, List<? extends BaseAd> list, long j, int i2) {
        List<com.thinkup.core.common.on.o> listO;
        int size;
        if (i2 != -1 && (listO = o().o(str)) != null && !listO.isEmpty() && (size = listO.size()) >= i2) {
            if (com.thinkup.core.common.ooo.mn.o(tUBaseAdAdapter.getUnitGroupInfo(), listO.get(size - 1).nn()) == -1) {
                int i3 = i2 - 2;
                Math.max(i3, -1);
                o().o(str, Math.max(i3, -1), false, 11);
            } else {
                com.thinkup.core.common.on.o oVarO = o(tUBaseAdAdapter, j);
                oVarO.no();
                com.thinkup.core.n.o0.n.o(oVarO, 11);
                com.thinkup.core.common.oo0.oo.m(oVarO.mo(), "2");
                return new ArrayList();
            }
        }
        return o(str, tUBaseAdAdapter, list, j);
    }
}
