package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jq {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f2851 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2852 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f2853 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2854 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2855 = 45;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2856 = {'t', 153, 156, 143, 142, 129, 162, 144, 149, 'y', 150, 160, 161, 146, 155, 159, 128, 163, 'r', 'M', 148, 164, 133, 134, 152, 147, 131, 157, 166, 165};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static jq f2857;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jv f2860;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<RelativeLayout, Object> f2859 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private it f2858 = new it(-1, -1, -1, -1);

    private jq() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2712(View view, ht.e eVar) {
        int i10 = f2852 + 117;
        f2854 = i10 % 128;
        int i11 = i10 % 2;
        m2724(view, eVar);
        if (i11 != 0) {
            int i12 = 90 / 0;
        }
        int i13 = f2852 + 3;
        f2854 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 39 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ViewGroup m2716(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i10 = f2854 + 61;
        f2852 = i10 % 128;
        if (i10 % 2 != 0) {
            return m2723(viewGroup, viewGroup2);
        }
        m2723(viewGroup, viewGroup2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:4:0x0003, B:6:0x000f, B:18:0x002f, B:17:0x0020, B:12:0x0019, B:15:0x001c, B:8:0x0013), top: B:25:0x0003, inners: #0 }] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static synchronized jq m2720() {
        try {
            int i10 = f2852 + 119;
            f2854 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 77 / 0;
                if (f2857 == null) {
                    f2857 = new jq();
                    f2854 = (f2852 + 79) % 128;
                }
            } else if (f2857 == null) {
                f2857 = new jq();
                f2854 = (f2852 + 79) % 128;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2857;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ View.OnLayoutChangeListener m2725(jq jqVar, ViewGroup viewGroup) {
        int i10 = f2854 + 75;
        f2852 = i10 % 128;
        int i11 = i10 % 2;
        View.OnLayoutChangeListener onLayoutChangeListenerM2722 = jqVar.m2722(viewGroup);
        if (i11 == 0) {
            int i12 = 7 / 0;
        }
        return onLayoutChangeListenerM2722;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized it m2730() {
        it itVar;
        int i10 = (f2854 + 91) % 128;
        f2852 = i10;
        itVar = this.f2858;
        f2854 = (i10 + 79) % 128;
        return itVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2713(jq jqVar, MotionEvent motionEvent) {
        int i10 = f2852 + 65;
        f2854 = i10 % 128;
        int i11 = i10 % 2;
        jqVar.m2726(motionEvent);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2719(jq jqVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        f2852 = (f2854 + 15) % 128;
        jqVar.m2717(viewGroup, onLayoutChangeListener);
        int i10 = f2852 + 9;
        f2854 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ViewGroup m2723(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i10 = f2852;
        f2854 = (i10 + 29) % 128;
        if (viewGroup2 == null) {
            f2854 = (i10 + 47) % 128;
            return viewGroup;
        }
        ViewGroup viewGroup3 = viewGroup2;
        while (true) {
            int i11 = f2852 + 19;
            f2854 = i11 % 128;
            if (i11 % 2 != 0) {
                viewGroup2.getParent();
                throw null;
            }
            ViewParent parent = viewGroup2.getParent();
            if (parent == viewGroup) {
                if (viewGroup3 != viewGroup2) {
                    return viewGroup3;
                }
            } else if (parent instanceof ViewGroup) {
                viewGroup3 = viewGroup2;
                viewGroup2 = (ViewGroup) parent;
            }
            return viewGroup2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2728(jq jqVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i10 = f2852 + 61;
        f2854 = i10 % 128;
        int i11 = i10 % 2;
        jqVar.m2721(viewGroup, onLayoutChangeListener);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2714(jq jqVar, it itVar) {
        int i10 = f2852 + 107;
        f2854 = i10 % 128;
        int i11 = i10 % 2;
        jqVar.m2718(itVar);
        if (i11 != 0) {
            int i12 = 55 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m2718(it itVar) {
        int i10 = (f2852 + 39) % 128;
        f2854 = i10;
        this.f2858 = itVar;
        int i11 = i10 + 95;
        f2852 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2731() {
        try {
            int i10 = f2854 + 99;
            f2852 = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    if (this.f2860 == null) {
                        this.f2860 = new jv() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.jv
                            /* JADX INFO: renamed from: ｋ */
                            public final void mo213(View view) {
                                if (s.m3035().m3060()) {
                                    jq.this.m2729();
                                    return;
                                }
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroupM2716 = (ViewGroup) view;
                                    if (viewGroupM2716.getContext() instanceof Activity) {
                                        viewGroupM2716 = jq.m2716(viewGroupM2716, (ViewGroup) ((Activity) viewGroupM2716.getContext()).findViewById(R.id.content));
                                    }
                                    jq jqVar = jq.this;
                                    jq.m2719(jqVar, viewGroupM2716, jq.m2725(jqVar, viewGroupM2716));
                                }
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.jv
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo210(View view) {
                            }
                        };
                        jp.m2705().m2710(this.f2860);
                    }
                    int i11 = f2854 + 59;
                    f2852 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 16 / 0;
                        return;
                    }
                    return;
                }
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2717(ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i10;
        if (viewGroup != null) {
            int i11 = f2852 + 11;
            f2854 = i11 % 128;
            if (i11 % 2 != 0) {
                m2715(viewGroup);
                throw null;
            }
            if (m2715(viewGroup)) {
                return;
            }
            Activity activityM2955 = kq.m2955(viewGroup);
            if (jw.m2753().m2759(activityM2955)) {
                if (viewGroup.findViewById(160766228) != null) {
                    return;
                }
                m2727(viewGroup, onLayoutChangeListener);
                i10 = f2854 + 39;
            } else {
                if (!jw.m2753().m2757(activityM2955)) {
                    return;
                }
                m2721(viewGroup, onLayoutChangeListener);
                i10 = f2854 + 89;
            }
            f2852 = i10 % 128;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001c A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x000d, B:15:0x001c, B:16:0x002e, B:18:0x0034, B:20:0x0042, B:21:0x0050, B:10:0x0015, B:13:0x0018, B:6:0x000f), top: B:28:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x000d, B:15:0x001c, B:16:0x002e, B:18:0x0034, B:20:0x0042, B:21:0x0050, B:10:0x0015, B:13:0x0018, B:6:0x000f), top: B:28:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x002e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2729() {
        ViewParent parent;
        try {
            int i10 = f2852 + 85;
            f2854 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 / 0;
                if (this.f2860 != null) {
                    f2854 = (f2852 + 79) % 128;
                    for (RelativeLayout relativeLayout : this.f2859.keySet()) {
                        parent = relativeLayout.getParent();
                        if (parent instanceof ViewGroup) {
                            f2852 = (f2854 + 77) % 128;
                            ((ViewGroup) parent).removeView(relativeLayout);
                        }
                    }
                    this.f2859.clear();
                    jp.m2705().m2709(this.f2860);
                    this.f2860 = null;
                    f2852 = (f2854 + InterfaceC0435l1.d.b.f29110g) % 128;
                }
            } else if (this.f2860 != null) {
                f2854 = (f2852 + 79) % 128;
                while (r0.hasNext()) {
                    parent = relativeLayout.getParent();
                    if (parent instanceof ViewGroup) {
                        f2852 = (f2854 + 77) % 128;
                        ((ViewGroup) parent).removeView(relativeLayout);
                    }
                }
                this.f2859.clear();
                jp.m2705().m2709(this.f2860);
                this.f2860 = null;
                f2852 = (f2854 + InterfaceC0435l1.d.b.f29110g) % 128;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2721(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final ht.e eVar = new ht.e() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ht.e
            /* JADX INFO: renamed from: ﻐ */
            public final boolean mo1851(ht htVar, View view, MotionEvent motionEvent) {
                jq.m2713(jq.this, motionEvent);
                return true;
            }
        };
        new Handler(Looper.getMainLooper()).post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                jq.m2712(viewGroup, eVar);
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof ViewGroup) {
                        jq.m2728(jq.this, (ViewGroup) childAt, onLayoutChangeListener);
                    } else {
                        jq.m2712(childAt, eVar);
                    }
                }
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
        int i10 = f2852 + 75;
        f2854 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private View.OnLayoutChangeListener m2722(final ViewGroup viewGroup) {
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.1

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2861 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f2862 = 0;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f2863 = 77;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m2732(int i10, boolean z10, int i11, String str, int i12) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (d.f1625) {
                    try {
                        char[] cArr2 = new char[i10];
                        d.f1622 = 0;
                        while (true) {
                            int i13 = d.f1622;
                            if (i13 >= i10) {
                                break;
                            }
                            d.f1624 = cArr[i13];
                            cArr2[d.f1622] = (char) (d.f1624 + i11);
                            int i14 = d.f1622;
                            cArr2[i14] = (char) (cArr2[i14] - f2863);
                            d.f1622 = i14 + 1;
                        }
                        if (i12 > 0) {
                            d.f1623 = i12;
                            char[] cArr3 = new char[i10];
                            System.arraycopy(cArr2, 0, cArr3, 0, i10);
                            int i15 = d.f1623;
                            System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                            int i16 = d.f1623;
                            System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i10];
                            d.f1622 = 0;
                            while (true) {
                                int i17 = d.f1622;
                                if (i17 >= i10) {
                                    break;
                                }
                                cArr4[i17] = cArr2[(i10 - i17) - 1];
                                d.f1622 = i17 + 1;
                            }
                            cArr2 = cArr4;
                        }
                        str2 = new String(cArr2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                int i18 = f2861 + 63;
                f2862 = i18 % 128;
                if (i18 % 2 != 0) {
                    s.m3035().m3060();
                    throw null;
                }
                if (s.m3035().m3060()) {
                    return;
                }
                f2861 = (f2862 + 117) % 128;
                try {
                    jq.m2719(jq.this, viewGroup, this);
                    f2861 = (f2862 + 77) % 128;
                } catch (Throwable th2) {
                    kl.m2899(m2732(25 - TextUtils.indexOf((CharSequence) "", '0'), false, 179 - Color.argb(0, 0, 0, 0), "￡\u0006\t￼\ufffb\u0006￮\t\u000f�\u0002￦\u0003\r\u000e\uffff\b\uffff\f￭\uffff\f\u0010\u0003�\uffff", TextUtils.indexOf("", "", 0, 0) + 26).intern(), m2732(23 - ExpandableListView.getPackedPositionGroup(0L), true, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 175, "\u000e\u0011\u0011￤\u0004\u0006\r\u0000\u0007￢\u0013\u0014\u000e\u0018\u0000￫\r\u000e\uffbf\r\b\uffbf\u0011", 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), th2, false);
                }
            }
        };
        f2854 = (f2852 + 19) % 128;
        return onLayoutChangeListener;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2727(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext()) { // from class: com.ironsource.adqualitysdk.sdk.i.jq.3
            @Override // android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                jq.m2713(jq.this, motionEvent);
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        relativeLayout.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        synchronized (this) {
            this.f2859.put(relativeLayout, new Object());
        }
        relativeLayout.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2724(View view, ht.e eVar) {
        f2852 = (f2854 + 75) % 128;
        ki.m2841(view, eVar);
        f2852 = (f2854 + 83) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2726(MotionEvent motionEvent) {
        try {
            final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jq.10

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static int f2866 = 0;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static char[] f2867 = {'L', 153, 148, 141, 146, 140, 141, 158, 152, 145, 134, 134, 154, 159, 152, 149, 149, 151, 142, 136, 151, 160, 155, 146, 144, 130, 138, 231, 199, 240, 262, 262, 260, 257, 261, 256, 261, 266, 265, 259, 219, 227, 261, 259, 267, 268, 258, 219, 221, 260, 225, 228, 270, 268, 225, 220, 254, 263, 265, 257, 254, 254, 261, 227, 228, 267, 259, 263, 263, 220, 222, 255, 262, 268, 251, 'y', 236, '?', '\"', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'G', 'n', 'a', 'a', 'r', 'l', 'e'};

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f2868 = 1;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m2733(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
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
                            System.arraycopy(f2867, i10, cArr, 0, i11);
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

                /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
                
                    if (com.ironsource.adqualitysdk.sdk.i.kf.m2811(r1, r8) != false) goto L6;
                 */
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void mo254() {
                    /*
                        Method dump skipped, instruction units count: 239
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jq.AnonymousClass10.mo254():void");
                }
            });
            int i10 = f2852 + 59;
            f2854 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            kl.m2899(m2711(null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u008e\u0088\u008b\u0092\u0090\u008e\u0091\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2711(null, KeyEvent.keyCodeFromString("") + 127, null, "\u0098\u0096\u0085\u0090\u0094\u0090\u0083\u0094\u0097\u0096\u0085\u0090\u0094\u0089\u0088\u0087\u0083\u008d\u0094\u0095\u008f\u008b\u008d\u008d\u008e\u0095\u0094\u0090\u0083\u0090\u0090\u0093").intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2715(ViewGroup viewGroup) {
        f2852 = (f2854 + 87) % 128;
        try {
            if (viewGroup.getChildCount() == 0) {
                return false;
            }
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (!(viewGroup.getChildAt(i10) instanceof TextView)) {
                    f2854 = (f2852 + 29) % 128;
                    return false;
                }
            }
            f2852 = (f2854 + 83) % 128;
            return true;
        } catch (Throwable th2) {
            m.m2983(m2711(null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, "\u008e\u0088\u008b\u0092\u0090\u008e\u0091\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2711(null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u008c\u0096\u008e\u008b\u009b\u008d\u009e\u008e\u0086\u0094\u009d\u0082\u008f\u0083\u0094\u008c\u008f\u008b\u0085\u008d\u008f\u0083\u0088\u0094\u009c\u0087\u0083\u0090\u0081\u0096\u008e\u008b\u009b\u0094\u009a\u008b\u0094\u0095\u008f\u008b\u0099\u0088\u008e\u0089\u0088\u0094\u0090\u0083\u0090\u0090\u0093").intern(), th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2711(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f2856;
                int i11 = f2855;
                if (f2851) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2853) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
