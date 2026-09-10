package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ct extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1466 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1467 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1468 = 7942923157040349202L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1717(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1468);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1718(cp cpVar, List<Object> list) {
        f1467 = (f1466 + 29) % 128;
        m1720(cpVar, list);
        f1467 = (f1466 + 33) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1719(cp cpVar, List<Object> list) {
        cp cpVar2;
        List list2 = (List) cz.m1785(list, 0, List.class);
        try {
            dt dtVar = (dt) cz.m1785(list, 1, dt.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() <= 2) {
                cpVar2 = cpVar;
            } else if (cz.m1784(list, 2, cp.class)) {
                int i2 = f1467 + 125;
                f1466 = i2 % 128;
                if (i2 % 2 != 0) {
                    cpVar2 = (cp) cz.m1785(list, 5, cp.class);
                    if (list.size() > 2) {
                        int i3 = f1467 + 37;
                        f1466 = i3 % 128;
                        int i4 = i3 % 2;
                        arrayList = cz.m1786(list, 3);
                    }
                } else {
                    cpVar2 = (cp) cz.m1785(list, 2, cp.class);
                    if (list.size() > 3) {
                        int i5 = f1467 + 37;
                        f1466 = i5 % 128;
                        int i6 = i5 % 2;
                        arrayList = cz.m1786(list, 3);
                    }
                }
            } else {
                arrayList = cz.m1786(list, 2);
                cpVar2 = cpVar;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < list2.size(); i7++) {
                f1467 = (f1466 + 93) % 128;
                arrayList.add(0, list2.get(i7));
                if (dtVar.m2037(cpVar2.m1614(), cpVar2, arrayList).m2047()) {
                    arrayList2.add(list2.get(i7));
                }
                arrayList.remove(0);
            }
            return arrayList2;
        } catch (Exception e2) {
            cq.m1676(cpVar.m1616(), m1717("䁗㓻\ua956ᶬ鈌ܵ﯂灚\ue4a4夏칵䋕㜱꯭\u200e镮ৎ︭犑\ue7e1尮탊䔮㧟껶⍘韟ి", 29851 - (Process.myPid() >> 22)).intern(), e2);
            return list2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:3:0x0009, B:8:0x002c, B:17:0x0041, B:19:0x004d, B:20:0x0051, B:21:0x0057, B:24:0x0065, B:15:0x003b, B:13:0x0035), top: B:29:0x0009 }] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1720(cp cpVar, List<Object> list) {
        cp cpVar2;
        List list2 = (List) cz.m1785(list, 0, List.class);
        try {
            dt dtVar = (dt) cz.m1785(list, 1, dt.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                int i2 = f1466 + 23;
                f1467 = i2 % 128;
                if (i2 % 2 == 0) {
                    if (cz.m1784(list, 3, cp.class)) {
                        cpVar2 = (cp) cz.m1785(list, 2, cp.class);
                        if (list.size() > 3) {
                            arrayList = cz.m1786(list, 3);
                        }
                    }
                    arrayList = cz.m1786(list, 2);
                    cpVar2 = cpVar;
                } else if (cz.m1784(list, 2, cp.class)) {
                    cpVar2 = (cp) cz.m1785(list, 2, cp.class);
                    if (list.size() > 3) {
                        arrayList = cz.m1786(list, 3);
                    }
                } else {
                    arrayList = cz.m1786(list, 2);
                    cpVar2 = cpVar;
                }
            } else {
                cpVar2 = cpVar;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < list2.size(); i3++) {
                f1466 = (f1467 + 11) % 128;
                arrayList.add(0, list2.get(i3));
                arrayList2.add(dtVar.m2037(cpVar2.m1614(), cpVar2, arrayList).m2043());
                arrayList.remove(0);
            }
            return arrayList2;
        } catch (Exception e2) {
            cq.m1676(cpVar.m1616(), m1717("䁗븛벖묌릌롕뚂딺뎤눯낵꼵궱갍\uaac5ꥆ\ua7d2ꘖꓒꍜꇼꁀ黡鵼鯲騱頃隅镆鎑鈑還輆", 65146 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), e2);
            return list2;
        }
    }
}
