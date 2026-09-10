package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class iu {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2617 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2618;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static iu f2619;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f2620;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static final Object f2621;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static long f2622;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final Handler f2623;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final Context f2627;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2625 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f2628 = new HashMap<>();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final HashMap<String, ArrayList<a>> f2624 = new HashMap<>();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final ArrayList<c> f2626 = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2630 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char[] f2631 = {'[', 178, 167, 169, 171, 163, 160, 160, 151, 'J', 146, 'n', 'Y', 130, 150, 151, 155, '>'};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2632;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        final BroadcastReceiver f2633;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final IntentFilter f2634;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        boolean f2635;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2567(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
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
                    System.arraycopy(f2631, i10, cArr, 0, i11);
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

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append(m2567("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", new int[]{0, 9, 60, 0}, true).intern());
            sb2.append(this.f2633);
            sb2.append(m2567("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{9, 8, 43, 3}, true).intern());
            sb2.append(this.f2634);
            String strM = f2.m(sb2, m2567("\u0001", new int[]{17, 1, 0, 0}, false));
            f2632 = (f2630 + 67) % 128;
            return strM;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final Intent f2636;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final ArrayList<a> f2637;

        public c(Intent intent, ArrayList<a> arrayList) {
            this.f2636 = intent;
            this.f2637 = arrayList;
        }
    }

    static {
        m2557();
        f2621 = new Object();
        f2617 = (f2618 + 123) % 128;
    }

    private iu(Context context) {
        this.f2627 = context;
        this.f2623 = new Handler(context.getMainLooper()) { // from class: com.ironsource.adqualitysdk.sdk.i.iu.5
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    iu.m2558(iu.this);
                }
            }
        };
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static iu m2556(Context context) {
        iu iuVar;
        synchronized (f2621) {
            try {
                if (f2619 == null) {
                    f2619 = new iu(context.getApplicationContext());
                }
                iuVar = f2619;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iuVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2557() {
        f2620 = new char[]{']', 180, 173, 177, 162, 165, 187, 179, 173, 174, 173, 181, 190, 171, 162, 178, 178, 175, 177, 182, 170, '~', 250, 254, 252, 248, 247, 208, 215, 259, 257, 247, 207, 198, 232, 249, 16, 'J', 'q', 'i', 'l', 'q', 'k', 'D', 'C', 'j', 'G', '4', 'h', 'k', 'j', 'C', '@', 'd', 'd', 'e', 'k', 'p', 's', 'J', 'C', 'g', 'j', 'p', 'l', 'k', 'I', '6', 'W', 'j', 'k', '6', 'o', 'k', 'c', 'b', 'n', 'L', '@', 'b', 'd', 'd', 'd', 'B', ' ', '3', 'W', 'j', 'p', 'l', 'k', 'L', 'M', 'I', 'J', 'j', 'i', 'l', 'f', 'l', 'J', '@', '}', 250, 258, 260, 254, 259, 264, 269, 'b', 206, 206, 198};
        f2622 = 5238953873678232030L;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2559() {
        int size;
        c[] cVarArr;
        while (true) {
            synchronized (this.f2628) {
                try {
                    size = this.f2626.size();
                    if (size <= 0) {
                        return;
                    }
                    cVarArr = new c[size];
                    this.f2626.toArray(cVarArr);
                    this.f2626.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = cVarArr[i10];
                for (int i11 = 0; i11 < cVar.f2637.size(); i11++) {
                    cVar.f2637.get(i11).f2633.onReceive(this.f2627, cVar.f2636);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2563(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2628) {
            try {
                ArrayList<IntentFilter> arrayListRemove = this.f2628.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int i10 = 0; i10 < arrayListRemove.size(); i10++) {
                    IntentFilter intentFilter = arrayListRemove.get(i10);
                    for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                        String action = intentFilter.getAction(i11);
                        ArrayList<a> arrayList = this.f2624.get(action);
                        if (arrayList != null) {
                            int i12 = 0;
                            while (i12 < arrayList.size()) {
                                if (arrayList.get(i12).f2633 == broadcastReceiver) {
                                    arrayList.remove(i12);
                                    i12--;
                                }
                                i12++;
                            }
                            if (arrayList.size() <= 0) {
                                this.f2624.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m2565() {
        int i10 = f2618 + 83;
        f2617 = i10 % 128;
        int i11 = i10 % 2;
        this.f2625 = true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2558(iu iuVar) {
        int i10 = f2617 + 23;
        f2618 = i10 % 128;
        int i11 = i10 % 2;
        iuVar.m2559();
        if (i11 != 0) {
            throw null;
        }
        f2618 = (f2617 + 81) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m2566(Intent intent) {
        char c4;
        int i10;
        String strIntern;
        String strIntern2 = m2561("\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000", new int[]{0, 21, 75, 20}, false).intern();
        if (!this.f2625) {
            return false;
        }
        synchronized (this.f2628) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2627.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m2561("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{21, 15, 141, 12}, false).intern());
                    sb2.append(strResolveTypeIfNeeded);
                    sb2.append(m2560("⠹⠙\udc66ᾊも뗋輤ꓰ뜄챕൰\ue842", View.resolveSizeAndState(0, 0, 0)).intern());
                    sb2.append(scheme);
                    sb2.append(m2561("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{36, 11, 0, 11}, true).intern());
                    sb2.append(intent);
                    Log.v(strIntern2, sb2.toString());
                }
                ArrayList<a> arrayList = this.f2624.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m2560("ꅉꄈ\u2d69\u13ffⶠ䓔ٞ嗬묣쀷ၓ\uf52d\uefd0ﱩ\ue2ef鳣圁", ViewConfiguration.getJumpTapTimeout() >> 16).intern());
                        sb3.append(arrayList);
                        Log.v(strIntern2, sb3.toString());
                    }
                    ArrayList arrayList2 = null;
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        a aVar = arrayList.get(i11);
                        if (z10) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m2561("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{47, 24, 0, 20}, false).intern());
                            sb4.append(aVar.f2634);
                            Log.v(strIntern2, sb4.toString());
                        }
                        if (!aVar.f2635) {
                            c4 = '\f';
                            int iMatch = aVar.f2634.match(action, strResolveTypeIfNeeded, scheme, data, categories, strIntern2);
                            if (iMatch >= 0) {
                                if (z10 != 0) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(m2560("ꅊꅪ맧뭤\u0ee9퀙ٞ섻Ꮟ梞㌚홺\uef9a梺䩓뿤坁뀷ꋟݼ㲋힇ᤢ\ue80d\ue473罛燩놀䶧蚇ꡪ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1).intern());
                                    sb5.append(Integer.toHexString(iMatch));
                                    Log.v(strIntern2, sb5.toString());
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(aVar);
                                aVar.f2635 = true;
                            } else if (z10 != 0) {
                                if (iMatch != -4) {
                                    if (iMatch == -3) {
                                        strIntern = m2560("䪜䫽\uebf3ㆸ驛艎\ued8b鍶\ue270Ꞩ", Process.myTid() >> 22).intern();
                                    } else if (iMatch == -2) {
                                        strIntern = m2561("\u0001\u0001\u0001\u0001", new int[]{InterfaceC0435l1.d.b.f29111h, 4, 100, 0}, true).intern();
                                    } else if (iMatch != -1) {
                                        strIntern = m2560("ఌ౹烜\uf784촋ᥬ\uab1bࡍ弉\u2453\uf0ffᗍ䊎ꇇڞ簆廓祄", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern();
                                    } else {
                                        strIntern = m2560("蕣蔗ｄ䪙혮難饕\uebd1", KeyEvent.normalizeMetaState(0)).intern();
                                    }
                                    i10 = 0;
                                } else {
                                    i10 = 0;
                                    strIntern = m2561("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001", new int[]{InterfaceC0435l1.d.b.f29106c, 8, 152, 0}, false).intern();
                                }
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(m2560("㷉㷩霽菅㾔ﻃ髝\uefe1⭮倿ɧ\ue707猙䙩狺躉쮁黫驴㘑ꀉ蘿⇂\ud969磲冝䤑肵", Color.green(i10)).intern());
                                sb6.append(strIntern);
                                Log.v(strIntern2, sb6.toString());
                            }
                        } else if (z10) {
                            Log.v(strIntern2, m2561("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{71, 31, 0, 12}, false).intern());
                            c4 = '\f';
                        } else {
                            c4 = '\f';
                        }
                        i11++;
                        arrayList = arrayList;
                        z10 = z10;
                    }
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            ((a) arrayList2.get(i12)).f2635 = false;
                        }
                        this.f2626.add(new c(intent, arrayList2));
                        if (!this.f2623.hasMessages(1)) {
                            this.f2623.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2564() {
        f2618 = (f2617 + 17) % 128;
        this.f2625 = false;
        m2562();
        f2618 = (f2617 + 5) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2562() {
        synchronized (this.f2628) {
            try {
                Iterator it = new HashMap(this.f2628).keySet().iterator();
                while (it.hasNext()) {
                    m2563((BroadcastReceiver) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2561(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f2620, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2560(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f2622, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f2622));
                        g.f2129 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
