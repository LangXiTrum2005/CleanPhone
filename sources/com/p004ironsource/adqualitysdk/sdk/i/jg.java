package com.p004ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.Map;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class jg {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2665 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2666 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2667 = 161;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static jg f2668;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private jn f2671;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<RelativeLayout, Object> f2670 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ig f2669 = new ig(-1, -1, -1, -1);

    private jg() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ View.OnLayoutChangeListener m2572(jg jgVar, ViewGroup viewGroup) {
        int i2 = f2666 + 51;
        f2665 = i2 % 128;
        if (i2 % 2 == 0) {
            jgVar.m2571(viewGroup);
            throw null;
        }
        View.OnLayoutChangeListener onLayoutChangeListenerM2571 = jgVar.m2571(viewGroup);
        int i3 = f2666 + 41;
        f2665 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
        return onLayoutChangeListenerM2571;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ViewGroup m2575(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i2 = f2665 + 61;
        f2666 = i2 % 128;
        if (i2 % 2 != 0) {
            m2586(viewGroup, viewGroup2);
            throw null;
        }
        ViewGroup viewGroupM2586 = m2586(viewGroup, viewGroup2);
        f2666 = (f2665 + 103) % 128;
        return viewGroupM2586;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2582(jg jgVar, MotionEvent motionEvent) {
        int i2 = f2665 + 109;
        f2666 = i2 % 128;
        int i3 = i2 % 2;
        jgVar.m2578(motionEvent);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        f2665 = (f2666 + 3) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2587(View view, hk.d dVar) {
        int i2 = f2665 + 67;
        f2666 = i2 % 128;
        int i3 = i2 % 2;
        m2573(view, dVar);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m2590() {
        int i2 = f2665 + 69;
        f2666 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.f2671 == null) {
            this.f2671 = new jn() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.5
                @Override // com.p004ironsource.adqualitysdk.sdk.i.jn
                /* JADX INFO: renamed from: ﻐ */
                public final void mo229(View view) {
                }

                @Override // com.p004ironsource.adqualitysdk.sdk.i.jn
                /* JADX INFO: renamed from: ﻛ */
                public final void mo231(View view) {
                    if (r.m2874().m2905()) {
                        jg.this.m2591();
                        return;
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroupM2575 = (ViewGroup) view;
                        if (viewGroupM2575.getContext() instanceof Activity) {
                            viewGroupM2575 = jg.m2575(viewGroupM2575, (ViewGroup) ((Activity) viewGroupM2575.getContext()).findViewById(R.id.content));
                        }
                        jg jgVar = jg.this;
                        jg.m2574(jgVar, viewGroupM2575, jg.m2572(jgVar, viewGroupM2575));
                    }
                }
            };
            jj.m2607().m2613(this.f2671);
            f2665 = (f2666 + 57) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2574(jg jgVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i2 = f2665 + 49;
        f2666 = i2 % 128;
        int i3 = i2 % 2;
        jgVar.m2588(viewGroup, onLayoutChangeListener);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2581(jg jgVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        f2666 = (f2665 + 47) % 128;
        jgVar.m2584(viewGroup, onLayoutChangeListener);
        f2665 = (f2666 + 105) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2583(jg jgVar, ig igVar) {
        int i2 = f2666 + 25;
        f2665 = i2 % 128;
        int i3 = i2 % 2;
        jgVar.m2580(igVar);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2591() {
        try {
            if (this.f2671 != null) {
                for (RelativeLayout relativeLayout : this.f2670.keySet()) {
                    f2666 = (f2665 + 29) % 128;
                    ViewParent parent = relativeLayout.getParent();
                    if (parent instanceof ViewGroup) {
                        f2665 = (f2666 + 41) % 128;
                        ((ViewGroup) parent).removeView(relativeLayout);
                    }
                }
                this.f2670.clear();
                jj.m2607().m2614(this.f2671);
                this.f2671 = null;
            }
            int i2 = f2666 + 29;
            f2665 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized jg m2576() {
        try {
            if (f2668 == null) {
                f2668 = new jg();
                f2665 = (f2666 + 19) % 128;
            }
            jg jgVar = f2668;
            int i2 = f2665 + 87;
            f2666 = i2 % 128;
            if (i2 % 2 == 0) {
                return jgVar;
            }
            int i3 = 46 / 0;
            return jgVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized ig m2589() {
        ig igVar;
        try {
            int i2 = f2666 + 81;
            f2665 = i2 % 128;
            if (i2 % 2 == 0) {
                igVar = this.f2669;
                int i3 = 75 / 0;
            } else {
                igVar = this.f2669;
            }
        } catch (Throwable th) {
            throw th;
        }
        return igVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private View.OnLayoutChangeListener m2571(final ViewGroup viewGroup) {
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.3

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2676 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2677 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f2678 = 5;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f2679 = {'G', 'l', 'o', 'b', 'a', 'T', AbstractJsonLexerKt.UNICODE_ESC, 'c', 'h', 'L', 'i', 's', 't', 'e', 'n', 'r', 'S', 'v', 'E', ' ', 'y', 'C', 'g', 'H', 'I'};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m2592(byte b2, String str, int i2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (i.f2343) {
                    try {
                        char[] cArr2 = f2679;
                        char c2 = f2678;
                        char[] cArr3 = new char[i2];
                        if (i2 % 2 != 0) {
                            i2--;
                            cArr3[i2] = (char) (cArr[i2] - b2);
                        }
                        if (i2 > 1) {
                            i.f2348 = 0;
                            while (true) {
                                int i3 = i.f2348;
                                if (i3 >= i2) {
                                    break;
                                }
                                i.f2347 = cArr[i3];
                                i.f2345 = cArr[i.f2348 + 1];
                                if (i.f2347 == i.f2345) {
                                    cArr3[i.f2348] = (char) (i.f2347 - b2);
                                    cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                                } else {
                                    i.f2346 = i.f2347 / c2;
                                    i.f2342 = i.f2347 % c2;
                                    i.f2344 = i.f2345 / c2;
                                    i.f2341 = i.f2345 % c2;
                                    if (i.f2342 == i.f2341) {
                                        i.f2346 = a.b(i.f2346, c2, 1, c2);
                                        i.f2344 = a.b(i.f2344, c2, 1, c2);
                                        int i4 = (i.f2346 * c2) + i.f2342;
                                        int i5 = (i.f2344 * c2) + i.f2341;
                                        int i6 = i.f2348;
                                        cArr3[i6] = cArr2[i4];
                                        cArr3[i6 + 1] = cArr2[i5];
                                    } else if (i.f2346 == i.f2344) {
                                        i.f2342 = a.b(i.f2342, c2, 1, c2);
                                        i.f2341 = a.b(i.f2341, c2, 1, c2);
                                        int i7 = (i.f2346 * c2) + i.f2342;
                                        int i8 = (i.f2344 * c2) + i.f2341;
                                        int i9 = i.f2348;
                                        cArr3[i9] = cArr2[i7];
                                        cArr3[i9 + 1] = cArr2[i8];
                                    } else {
                                        int i10 = (i.f2346 * c2) + i.f2341;
                                        int i11 = (i.f2344 * c2) + i.f2342;
                                        int i12 = i.f2348;
                                        cArr3[i12] = cArr2[i10];
                                        cArr3[i12 + 1] = cArr2[i11];
                                    }
                                }
                                i.f2348 += 2;
                            }
                        }
                        str2 = new String(cArr3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = f2677 + 63;
                f2676 = i10 % 128;
                if (i10 % 2 == 0) {
                    r.m2874().m2905();
                    throw null;
                }
                if (r.m2874().m2905()) {
                    return;
                }
                f2676 = (f2677 + 55) % 128;
                try {
                    jg.m2574(jg.this, viewGroup, this);
                } catch (Throwable th) {
                    kb.m2752(m2592((byte) (Process.getGidForName("") + 102), "\u0001\u0002\u0003\u0004\u0000\u0002\u0007\u0000\u0007\b\t\u0005\u000b\f\r\u000e\n\u000e\u0010\u0011\n\u0012\u000f\f\b\f", (ViewConfiguration.getTapTimeout() >> 16) + 26).intern(), m2592((byte) TextUtils.getOffsetBefore("", 0), "\u0013\u0010\u0011\u0000\u0010\u000f\u000b\n\u0011\u0004\u0013\u000e\u0000\u0018\u0001\u0007\u000b\u0016\t\u0003\f\u0018e", 22 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), th, false);
                }
            }
        };
        int i2 = f2665 + 49;
        f2666 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
        return onLayoutChangeListener;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2573(View view, hk.d dVar) {
        f2665 = (f2666 + 95) % 128;
        jx.m2684(view, dVar);
        int i2 = f2665 + 95;
        f2666 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m2580(ig igVar) {
        int i2 = (f2666 + 23) % 128;
        f2665 = i2;
        this.f2669 = igVar;
        int i3 = i2 + 45;
        f2666 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2579(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext()) { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2
            @Override // android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                jg.m2582(jg.this, motionEvent);
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        relativeLayout.setAlpha(0.0f);
        synchronized (this) {
            this.f2670.put(relativeLayout, new Object());
        }
        relativeLayout.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.1
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2584(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final hk.d dVar = new hk.d() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.4
            @Override // com.ironsource.adqualitysdk.sdk.i.hk.d
            /* JADX INFO: renamed from: ﾒ */
            public final boolean mo1777(hk hkVar, View view, MotionEvent motionEvent) {
                jg.m2582(jg.this, motionEvent);
                return true;
            }
        };
        new Handler(Looper.getMainLooper()).post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.7
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                jg.m2587(viewGroup, dVar);
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof ViewGroup) {
                        jg.m2581(jg.this, (ViewGroup) childAt, onLayoutChangeListener);
                    } else {
                        jg.m2587(childAt, dVar);
                    }
                }
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
        f2665 = (f2666 + 5) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2585(ViewGroup viewGroup) {
        try {
            if (viewGroup.getChildCount() == 0) {
                int i2 = f2665 + 43;
                f2666 = i2 % 128;
                return i2 % 2 != 0;
            }
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                int i4 = f2666 + 31;
                f2665 = i4 % 128;
                if (i4 % 2 == 0) {
                    boolean z2 = viewGroup.getChildAt(i3) instanceof TextView;
                    throw null;
                }
                if (!(viewGroup.getChildAt(i3) instanceof TextView)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            n.m2832(m2577(26 - View.combineMeasuredStates(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, View.MeasureSpec.getSize(0) + 263, "￡\u0006\t￼\ufffb\u0006￮\t\u000f�\u0002￦\u0003\r\u000e\uffff\b\uffff\f￭\uffff\f\u0010\u0003�\uffff", false).intern(), m2577(15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 52 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 257, "\u0007\u000e\t\u000b\u0003\u0005\b\u0003\uffc0\u0012\u000f\u0012\u0012￥\u0013\u0017\u0005\t\ufff6\u0014\u0018\u0005\ufff4\uffc0\u0019\f\u000e\u000f\uffc0\u0013\u000e\t\u0001\u0014\u000e\u000f\u0003\uffc0\u0010\u0015\u000f\u0012\uffe7\u0017\u0005\t\ufff6\uffc0\u0006\t\uffc0", true).intern(), th);
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static ViewGroup m2586(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (viewGroup2 == null) {
            return viewGroup;
        }
        ViewGroup viewGroup3 = viewGroup2;
        while (viewGroup2 != null) {
            ViewParent parent = viewGroup2.getParent();
            if (parent != viewGroup) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                viewGroup3 = viewGroup2;
                viewGroup2 = (ViewGroup) parent;
            } else {
                if (viewGroup3 != viewGroup2) {
                    return viewGroup3;
                }
                int i2 = (f2666 + 87) % 128;
                f2665 = i2;
                int i3 = i2 + 107;
                f2666 = i3 % 128;
                if (i3 % 2 == 0) {
                    return viewGroup2;
                }
                throw null;
            }
        }
        return viewGroup2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2578(MotionEvent motionEvent) {
        try {
            final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.9

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static int f2688 = 1;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f2689 = 0;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char[] f2690 = {'G', 'l', 'o', 'b', 'a', 'T', AbstractJsonLexerKt.UNICODE_ESC, 'c', 'h', 'L', 'i', 's', 't', 'e', 'n', 'r', 'S', 'v', ' ', 'd', 'f', AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.BEGIN_OBJ, AbstractJsonLexerKt.COMMA, AbstractJsonLexerKt.END_OBJ, 'E', 'H', 'I', 'J', 'K', 'M', 'N', 'O', 'P', 'Q', 'R'};

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static char f2691 = 6;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static String m2593(byte b2, String str, int i2) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (i.f2343) {
                        try {
                            char[] cArr2 = f2690;
                            char c2 = f2691;
                            char[] cArr3 = new char[i2];
                            if (i2 % 2 != 0) {
                                i2--;
                                cArr3[i2] = (char) (cArr[i2] - b2);
                            }
                            if (i2 > 1) {
                                i.f2348 = 0;
                                while (true) {
                                    int i3 = i.f2348;
                                    if (i3 >= i2) {
                                        break;
                                    }
                                    i.f2347 = cArr[i3];
                                    i.f2345 = cArr[i.f2348 + 1];
                                    if (i.f2347 == i.f2345) {
                                        cArr3[i.f2348] = (char) (i.f2347 - b2);
                                        cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                                    } else {
                                        i.f2346 = i.f2347 / c2;
                                        i.f2342 = i.f2347 % c2;
                                        i.f2344 = i.f2345 / c2;
                                        i.f2341 = i.f2345 % c2;
                                        if (i.f2342 == i.f2341) {
                                            i.f2346 = a.b(i.f2346, c2, 1, c2);
                                            i.f2344 = a.b(i.f2344, c2, 1, c2);
                                            int i4 = (i.f2346 * c2) + i.f2342;
                                            int i5 = (i.f2344 * c2) + i.f2341;
                                            int i6 = i.f2348;
                                            cArr3[i6] = cArr2[i4];
                                            cArr3[i6 + 1] = cArr2[i5];
                                        } else if (i.f2346 == i.f2344) {
                                            i.f2342 = a.b(i.f2342, c2, 1, c2);
                                            i.f2341 = a.b(i.f2341, c2, 1, c2);
                                            int i7 = (i.f2346 * c2) + i.f2342;
                                            int i8 = (i.f2344 * c2) + i.f2341;
                                            int i9 = i.f2348;
                                            cArr3[i9] = cArr2[i7];
                                            cArr3[i9 + 1] = cArr2[i8];
                                        } else {
                                            int i10 = (i.f2346 * c2) + i.f2341;
                                            int i11 = (i.f2344 * c2) + i.f2342;
                                            int i12 = i.f2348;
                                            cArr3[i12] = cArr2[i10];
                                            cArr3[i12 + 1] = cArr2[i11];
                                        }
                                    }
                                    i.f2348 += 2;
                                }
                            }
                            str2 = new String(cArr3);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return str2;
                }

                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    try {
                        int iRound = Math.round(motionEventObtain.getRawX());
                        int iRound2 = Math.round(motionEventObtain.getRawY());
                        if (jy.m2706(iRound, iRound2)) {
                            jg.m2583(jg.this, new ig(iRound, iRound2, ju.m2666(), ju.m2665()));
                            int i2 = f2689 + 9;
                            f2688 = i2 % 128;
                            if (i2 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                        String strIntern = m2593((byte) ((Process.myPid() >> 22) + 23), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u0003\u0007\b\t\n\u000b\u0006\r\u000e\u000f\u000e\u0010\u0011\u000e\u0010\u0010\u000b\r\u0013", 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m2593((byte) (Color.argb(0, 0, 0, 0) + 71), "\u0000\u0003\u0007\b\u0006\u0014\u000e\f\u000e\u000f\u0012\u0018\u0010\u000e\r\u0013\u000b\u0010\u0013\u0019\u0014\u0000\f\u0012\u0014\u0000\u0015\u0013\u0004\u0003\b\f\u0017\u0007\u0013\u0006¶¶\r\u0015\b\u0010\u0000\u0010\u0011\u0007\u0016\u0013Â", ExpandableListView.getPackedPositionChild(0L) + 50).intern());
                        sb.append(iRound);
                        sb.append(m2593((byte) (View.resolveSizeAndState(0, 0, 0) + 60), "\u0012\u0013", 2 - TextUtils.indexOf("", "")).intern());
                        sb.append(iRound2);
                        sb.append(m2593((byte) (123 - TextUtils.getCapsMode("", 0, 0)), "ø", Color.alpha(0) + 1).intern());
                        n.m2835(strIntern, sb.toString());
                        f2688 = (f2689 + 35) % 128;
                    } catch (Throwable th) {
                        kb.m2752(m2593((byte) (24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u0003\u0007\b\t\n\u000b\u0006\r\u000e\u000f\u000e\u0010\u0011\u000e\u0010\u0010\u000b\r\u0013", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26).intern(), m2593((byte) (44 - View.combineMeasuredStates(0, 0)), "\u001b\r\u000e\u0003\f\u0015\b\u0010\u0014\u0000\u0011\u0002\u0000\b\b\t", 16 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), th, false);
                    }
                }
            });
            f2666 = (f2665 + 37) % 128;
        } catch (Throwable th) {
            kb.m2752(m2577((ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, AndroidCharacter.getMirror('0') - 22, TextUtils.lastIndexOf("", '0') + 264, "￡\u0006\t￼\ufffb\u0006￮\t\u000f�\u0002￦\u0003\r\u000e\uffff\b\uffff\f￭\uffff\f\u0010\u0003�\uffff", false).intern(), m2577(4 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 32 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 256, "\u0010\u0013\u0013￦\ufffa\u0018\u0002\u0013\uffc1\u0013\u0010\uffc1\ufff9\u0018\u0002\u0013\uffc1\t\u0004\u0016\u0010\u0015\uffc1\b\u000f\n\u0015\u0015\u0006\b\uffc1\u0013", true).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2588(ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i2 = f2666 + 121;
        f2665 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
            if (viewGroup == null) {
                return;
            }
        } else if (viewGroup == null) {
            return;
        }
        if (m2585(viewGroup)) {
            return;
        }
        Activity activityM2799 = ke.m2799(viewGroup);
        if (jl.m2619().m2620(activityM2799)) {
            if (viewGroup.findViewById(160766228) == null) {
                int i4 = f2666 + 25;
                f2665 = i4 % 128;
                if (i4 % 2 != 0) {
                    m2579(viewGroup, onLayoutChangeListener);
                    return;
                } else {
                    m2579(viewGroup, onLayoutChangeListener);
                    throw null;
                }
            }
        } else if (jl.m2619().m2622(activityM2799)) {
            m2584(viewGroup, onLayoutChangeListener);
            f2666 = (f2665 + 59) % 128;
        }
        int i5 = f2665 + 49;
        f2666 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2577(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f672) {
            try {
                char[] cArr2 = new char[i3];
                b.f673 = 0;
                while (true) {
                    int i5 = b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    b.f671 = cArr[i5];
                    cArr2[b.f673] = (char) (b.f671 + i4);
                    int i6 = b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f2667);
                    b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    b.f673 = 0;
                    while (true) {
                        int i9 = b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        b.f673 = i9 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
