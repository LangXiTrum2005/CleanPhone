package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class ih {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2379 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f2380 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static long f2381;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f2382;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static ih f2383;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f2384;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static final Object f2385;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final Handler f2386;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final Context f2387;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2388 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f2390 = new HashMap<>();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final HashMap<String, ArrayList<e>> f2389 = new HashMap<>();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final ArrayList<d> f2391 = new ArrayList<>();

    public static class d {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final ArrayList<e> f2393;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final Intent f2394;

        public d(Intent intent, ArrayList<e> arrayList) {
            this.f2394 = intent;
            this.f2393 = arrayList;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2395 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static long f2396 = -5058332882042908242L;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2397;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        boolean f2398;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final IntentFilter f2399;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final BroadcastReceiver f2400;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m2425(String str, int i2) {
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
                            cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2396);
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

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append(m2425("釼磄䏓⫦㗻Დ\ue791캵\ud9ad", 59663 - View.combineMeasuredStates(0, 0)).intern());
            sb.append(this.f2400);
            sb.append(m2425("醎\udbd5\u05fd侕릮\ue35a\u2d72靘", View.MeasureSpec.makeMeasureSpec(0, 0) + 18973).intern());
            sb.append(this.f2399);
            String strC = a.C(sb, m2425("釓", Color.alpha(0) + 60737));
            f2395 = (f2397 + 35) % 128;
            return strC;
        }
    }

    static {
        m2418();
        f2385 = new Object();
        f2379 = (f2380 + 123) % 128;
    }

    private ih(Context context) {
        this.f2387 = context;
        this.f2386 = new Handler(context.getMainLooper()) { // from class: com.ironsource.adqualitysdk.sdk.i.ih.5
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    ih.m2415(ih.this);
                }
            }
        };
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2415(ih ihVar) {
        int i2 = f2380 + 59;
        f2379 = i2 % 128;
        int i3 = i2 % 2;
        ihVar.m2420();
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2418() {
        f2382 = 4406068861374965067L;
        f2384 = new char[]{6249, 17321, 44966, 2993, 30603, 54174, 16280, 39828, 51172, 9140, 36841, 60383, 22495, 46037, 8089, 48861, 58745, 2416, 44400, 53572, 30019, 39250, 15644, 'A', 23444, 47002, 5004, 28595, 52157, 10218, 33709, 57297, 15324, 38866, 62375, 20404, 42996, 64515, 4220, 46168, 51300, 27763, 32891, 9319, 30795, 39944, 12370, 21565, 59425, 3117, 41009, 50376, 6352, 48275, 53483, 29933, 35050, 11506, 16527, 58497, 14469, 23787, 61603, 5309, 43188, 52554, 24898, 47923, 57540, 3259, 43167, 54435, 28852, 40124, 14496, 25739, 32977, 11476, 18682, 62692, 4336, 48372, 55310, 1090, 41044, 52333, 26667, 37950, 12324, 23626, 63562, 9222, 16444, 60541, 58975, 48554, 20900, 62898, 35213, 11651, 'c', 23446, 47002, 4992, 28603, 52156, 10168, 33720, 't', 23438, 47006, 4992, 26344, 15620, 53528, 29974, 2350, 44345, 16697, 58748, 47447, 23895, 61786, 38259, 10598, 52600};
        f2381 = -1139156583847797769L;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2420() {
        int size;
        d[] dVarArr;
        while (true) {
            synchronized (this.f2390) {
                try {
                    size = this.f2391.size();
                    if (size <= 0) {
                        return;
                    }
                    dVarArr = new d[size];
                    this.f2391.toArray(dVarArr);
                    this.f2391.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = dVarArr[i2];
                for (int i3 = 0; i3 < dVar.f2393.size(); i3++) {
                    dVar.f2393.get(i3).f2400.onReceive(this.f2387, dVar.f2394);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2421() {
        synchronized (this.f2390) {
            try {
                Iterator it = new HashMap(this.f2390).keySet().iterator();
                while (it.hasNext()) {
                    m2414((BroadcastReceiver) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m2424() {
        try {
            int i2 = f2379 + 7;
            f2380 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f2388 = false;
            } else {
                this.f2388 = false;
            }
            m2421();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static ih m2416(Context context) {
        ih ihVar;
        synchronized (f2385) {
            try {
                if (f2383 == null) {
                    f2383 = new ih(context.getApplicationContext());
                }
                ihVar = f2383;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ihVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2422() {
        int i2 = f2380 + 35;
        f2379 = i2 % 128;
        int i3 = i2 % 2;
        this.f2388 = true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2414(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2390) {
            try {
                ArrayList<IntentFilter> arrayListRemove = this.f2390.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int i2 = 0; i2 < arrayListRemove.size(); i2++) {
                    IntentFilter intentFilter = arrayListRemove.get(i2);
                    for (int i3 = 0; i3 < intentFilter.countActions(); i3++) {
                        String action = intentFilter.getAction(i3);
                        ArrayList<e> arrayList = this.f2389.get(action);
                        if (arrayList != null) {
                            int i4 = 0;
                            while (i4 < arrayList.size()) {
                                if (arrayList.get(i4).f2400 == broadcastReceiver) {
                                    arrayList.remove(i4);
                                    i4--;
                                }
                                i4++;
                            }
                            if (arrayList.size() <= 0) {
                                this.f2389.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2419(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f2384[i3 + i4]) ^ (((long) i4) * f2381)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2423(Intent intent) {
        long j;
        String strIntern;
        String strIntern2 = m2417("┇쾉\uf072\ue52d输끨ꔷ侟灂攺\u0feaぅ┤쿶\uf070\ue509迵끗ꔆ俹炽", AndroidCharacter.getMirror('0') + 60029).intern();
        if (!this.f2388) {
            return false;
        }
        synchronized (this.f2390) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2387.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = (intent.getFlags() & 8) != 0;
                if (z2) {
                    StringBuilder sb = new StringBuilder();
                    j = 0;
                    sb.append(m2419((ViewConfiguration.getScrollBarSize() >> 8) + 15, TextUtils.indexOf("", "", 0), (char) (ImageFormat.getBitsPerPixel(0) + 6204)).intern());
                    sb.append(strResolveTypeIfNeeded);
                    sb.append(m2419(8 - Drawable.resolveOpacity(0, 0), (-16777201) - Color.rgb(0, 0, 0), (char) (48894 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern());
                    sb.append(scheme);
                    sb.append(m2417("╫瞳考튮潾맖쪵朏놝쉰\u1c8d", 21142 - ImageFormat.getBitsPerPixel(0)).intern());
                    sb.append(intent);
                    Log.v(strIntern2, sb.toString());
                } else {
                    j = 0;
                }
                ArrayList<e> arrayList = this.f2389.get(intent.getAction());
                if (arrayList != null) {
                    if (z2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m2419((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 12, Process.getGidForName("") + 24, (char) KeyEvent.getDeadChar(0, 0)).intern());
                        sb2.append(arrayList);
                        Log.v(strIntern2, sb2.toString());
                    }
                    ArrayList arrayList2 = null;
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        e eVar = arrayList.get(i2);
                        if (z2) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m2417("┆㼻ᄝ欛䵧ꝷ륃鍛\uf5e3쾳ↆ㮑ᷮ矸䧖ꏀ葻鸌\uf010쩤Ⱬًᡏ独", 6673 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
                            sb3.append(eVar.f2399);
                            Log.v(strIntern2, sb3.toString());
                        }
                        if (eVar.f2398) {
                            if (z2) {
                                Log.v(strIntern2, m2419(31 - (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 36, (char) (ExpandableListView.getPackedPositionType(j) + 42964)).intern());
                            }
                            action = action;
                            strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                        } else {
                            int iMatch = eVar.f2399.match(action, strResolveTypeIfNeeded, scheme, data, categories, strIntern2);
                            if (iMatch >= 0) {
                                if (z2) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(m2419(27 - ((Process.getThreadPriority(0) + 20) >> 6), 67 - View.getDefaultSize(0, 0), (char) (Color.blue(0) + 47891)).intern());
                                    sb4.append(Integer.toHexString(iMatch));
                                    Log.v(strIntern2, sb4.toString());
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(eVar);
                                eVar.f2398 = true;
                            } else {
                                action = action;
                                strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                                if (z2) {
                                    if (iMatch == -4) {
                                        strIntern = m2419(View.MeasureSpec.getMode(0) + 8, ExpandableListView.getPackedPositionGroup(j) + 100, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
                                    } else if (iMatch == -3) {
                                        strIntern = m2419((ViewConfiguration.getScrollBarSize() >> 8) + 6, 94 - Gravity.getAbsoluteGravity(0, 0), (char) (58942 - ExpandableListView.getPackedPositionGroup(j))).intern();
                                    } else if (iMatch == -2) {
                                        strIntern = m2417("┯ᓿ䚕끕", 12757 - ((Process.getThreadPriority(0) + 20) >> 6)).intern();
                                    } else if (iMatch != -1) {
                                        strIntern = m2419(14 - (Process.myTid() >> 22), 112 - ExpandableListView.getPackedPositionType(j), (char) (26268 - MotionEvent.axisFromString(""))).intern();
                                    } else {
                                        strIntern = m2419(4 - Color.blue(0), 108 - ExpandableListView.getPackedPositionGroup(j), (char) (AndroidCharacter.getMirror('0') - '0')).intern();
                                    }
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(m2417("╫ᛊ䉏뿁\ueba3✚შ䱞롣\uf586Ⅸዄ仧먈\uf7ea⍐ύ䢗葸\uf1ccⶼᤖ䪧蘜", 13217 - View.combineMeasuredStates(0, 0)).intern());
                                    sb5.append(strIntern);
                                    Log.v(strIntern2, sb5.toString());
                                }
                            }
                        }
                        i2++;
                        action = action;
                        arrayList = arrayList;
                        strResolveTypeIfNeeded = strResolveTypeIfNeeded;
                    }
                    if (arrayList2 != null) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ((e) arrayList2.get(i3)).f2398 = false;
                        }
                        this.f2391.add(new d(intent, arrayList2));
                        if (!this.f2386.hasMessages(1)) {
                            this.f2386.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2417(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2382);
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
}
