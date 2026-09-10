package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ay {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f563 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f564 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f565 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f566;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, List<? extends gt>> f567;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<String> f568;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f569;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f570;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f571;

    static {
        m676();
        f568 = Arrays.asList(m678("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 14, 99, 5}, true).intern(), m678("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{14, 11, 0, 7}, false).intern(), m678("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{25, 15, 127, 7}, false).intern());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(m677("㥷퓕\ue61c焬䑼陼⭫偣〄\udaf6", TextUtils.getCapsMode("", 0, 0) + 10).intern(), m681(new gw()));
        linkedHashMap.put(m678("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{40, 8, 0, 0}, true).intern(), m681(new hh(), new hh.d()));
        linkedHashMap.put(m678("\u0001\u0001\u0001\u0000\u0001", new int[]{48, 5, 0, 0}, false).intern(), m681(new gh()));
        linkedHashMap.put(m678("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{53, 8, 25, 3}, true).intern(), m681(new gi()));
        linkedHashMap.put(m678("\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{61, 8, 151, 8}, false).intern(), m681(new gq()));
        linkedHashMap.put(m678("\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{69, 9, 0, 0}, true).intern(), m681(new ha.d(), new ha.a()));
        linkedHashMap.put(m677("钅需\uf2a6㰍푫ꃄ\uef42鎧", 7 - Color.argb(0, 0, 0, 0)).intern(), m681(new gp()));
        linkedHashMap.put(m678("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{78, 11, 40, 0}, true).intern(), m681(new gs()));
        linkedHashMap.put(m678("\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{89, 6, 0, 3}, false).intern(), m681(new hl.b(), new hl.a()));
        linkedHashMap.put(m677("ᑖ븸✾石\ue2c8젿\ue629祝걵厌", TextUtils.lastIndexOf("", '0', 0) + 10).intern(), m681(new go.d(), new go.c()));
        linkedHashMap.put(m678("\u0001\u0000\u0001\u0001\u0000\u0000", new int[]{95, 6, 0, 0}, false).intern(), m681(new gx()));
        linkedHashMap.put(m678("\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{InterfaceC0435l1.d.b.f29105b, 10, 152, 0}, true).intern(), m681(new gr()));
        linkedHashMap.put(m678("\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{InterfaceC0435l1.d.b.f29112i, 6, 0, 2}, false).intern(), m681(new gu()));
        linkedHashMap.put(m678("\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{117, 6, 5, 0}, true).intern(), m681(new hf()));
        linkedHashMap.put(m677("늄慢鹝Ո\ue61c焬챴媾೮皾", ExpandableListView.getPackedPositionGroup(0L) + 9).intern(), m681(new gm()));
        linkedHashMap.put(m678("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{123, 10, 0, 0}, false).intern(), m681(new gl()));
        linkedHashMap.put(m678("\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{133, 6, 0, 4}, true).intern(), m681(new gn()));
        linkedHashMap.put(m677("婭䒿﹚嫗跳刕", TextUtils.lastIndexOf("", '0') + 7).intern(), m681(new gv()));
        linkedHashMap.put(m677("ᯋ\ud874ꤰ㵿", 4 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), m681(new gy()));
        linkedHashMap.put(m677("脄鴵㑩軏ᇺ哚풏䒁", 8 - TextUtils.indexOf("", "", 0)).intern(), m681(new gz()));
        linkedHashMap.put(m677("䌷䞫⭫偣و㏨", 5 - View.resolveSize(0, 0)).intern(), m681(new hb(), new hb.c()));
        linkedHashMap.put(m677("⾌⍺汀隿琂긑菡\u2064걵厌", 9 - Color.blue(0)).intern(), m681(new hd()));
        linkedHashMap.put(m678("\u0001\u0000\u0000\u0000\u0001\u0001", new int[]{139, 6, 142, 0}, false).intern(), m681(new he()));
        linkedHashMap.put(m677("㵟\ufdda䖏纯릹꒞菬뻩蛯뛃ꓠᠩ", ExpandableListView.getPackedPositionGroup(0L) + 12).intern(), m681(new hc()));
        linkedHashMap.put(m678("\u0000\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{145, 7, 131, 4}, true).intern(), m681(new hg()));
        linkedHashMap.put(m678("\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{152, 6, 87, 0}, false).intern(), m681(new hk()));
        f567 = Collections.unmodifiableMap(linkedHashMap);
        f563 = (f565 + 79) % 128;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static void m676() {
        f570 = (char) 35467;
        f569 = (char) 3390;
        f564 = (char) 51185;
        f571 = (char) 46625;
        f566 = new char[]{'e', 192, 181, 189, 181, 189, 210, 205, 209, 199, 191, 199, 206, 204, '4', 'd', 'i', 'k', 'd', 'W', 'N', 'J', 'R', 'Z', 'R', 'q', 209, 209, 236, 219, 218, 244, 218, 209, 217, 209, 220, 227, 232, 234, '9', 'k', 'R', ']', 'v', 'n', 'k', 'a', ' ', 'R', 'X', '^', 'h', 'D', 137, 'q', 'p', 132, 136, 139, 'v', 'n', 234, 249, 251, 250, 255, 262, 260, '6', 'f', 'i', 'l', 'f', 'l', 'q', 'k', '[', 'F', 149, 151, 150, 147, 138, 145, 147, 145, 150, 131, '3', 'i', 'h', ']', 'e', 'q', '&', '^', 'm', 'm', 'i', 'i', 134, 267, 265, 263, 256, 259, 267, 257, 252, 237, '1', 'e', 'Y', '[', ']', '^', '?', 'y', 'q', 'r', 'm', '_', '!', 'U', 'f', 'X', 'W', 'b', 'e', 'h', 'k', 'i', '2', 'm', 'o', 'W', 'U', 'R', 'p', 238, 245, 239, 248, 255, 's', 235, 236, 223, 231, 244, 236, 'X', 180, 190, 192, 187, 197};
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m679() {
        int i10 = f565 + 89;
        int i11 = i10 % 128;
        f563 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        List<String> list = f568;
        int i12 = i11 + 99;
        f565 = i12 % 128;
        if (i12 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<? extends gt> m681(gt... gtVarArr) {
        int i10 = f563 + 49;
        f565 = i10 % 128;
        int i11 = i10 % 2;
        List<? extends gt> listAsList = Arrays.asList(gtVarArr);
        if (i11 == 0) {
            int i12 = 40 / 0;
        }
        return listAsList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<gt> m682() {
        List<gt> listAsList = Arrays.asList(new gk(), new gg(), new gf());
        f563 = (f565 + 41) % 128;
        return listAsList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007b A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Map<String, List<gt>> m683() {
        String str;
        List<? extends gt> list;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2 = new ArrayList(f567.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int i11 = f565 + 77;
            f563 = i11 % 128;
            if (i11 % 2 != 0) {
                str = (String) it.next();
                list = f567.get(str);
                int i12 = 13 / 0;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (gt gtVar : list) {
                        if (m685(gtVar)) {
                            i10 = f563 + 45;
                            f565 = i10 % 128;
                            if (i10 % 2 != 0) {
                                arrayList.add(gtVar);
                                throw null;
                            }
                            arrayList.add(gtVar);
                        }
                        f565 = (f563 + 59) % 128;
                    }
                    linkedHashMap.put(str, arrayList);
                } else {
                    continue;
                }
            } else {
                str = (String) it.next();
                list = f567.get(str);
                if (list != null) {
                    arrayList = new ArrayList();
                    while (r3.hasNext()) {
                        if (m685(gtVar)) {
                            i10 = f563 + 45;
                            f565 = i10 % 128;
                            if (i10 % 2 != 0) {
                                arrayList.add(gtVar);
                                throw null;
                            }
                            arrayList.add(gtVar);
                        }
                        f565 = (f563 + 59) % 128;
                    }
                    linkedHashMap.put(str, arrayList);
                } else {
                    continue;
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m684() {
        f563 = (f565 + 41) % 128;
        String strIntern = m677("ꗾ\uf04b☼︣\ue05e䘸䢃ꩢޯ斶䟪⎋⢑涂\uef42鎧", KeyEvent.normalizeMetaState(0) + 15).intern();
        f563 = (f565 + 107) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m677(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f570)) ^ ((c5 >>> 5) + f564)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f569) ^ ((c10 + i12) ^ ((c10 << 4) + f571))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static gt m680() {
        gj gjVar = new gj();
        int i10 = f565 + InterfaceC0435l1.d.b.f29107d;
        f563 = i10 % 128;
        if (i10 % 2 == 0) {
            return gjVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m685(gt gtVar) {
        try {
            if (!Prode.m198()) {
                Class.forName(gtVar.mo2242());
                f565 = (f563 + 23) % 128;
                return true;
            }
            int i10 = f563 + 81;
            f565 = i10 % 128;
            if (i10 % 2 != 0) {
                gtVar.mo2243();
                return true;
            }
            gtVar.mo2243();
            throw null;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m678(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f566, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
