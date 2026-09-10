package com.inmobi.media;

import A.RunnableC0887e;
import A.ViewOnClickListenerC0903m;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.viewsv2.NativeRecyclerViewAdapter;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.D8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class D8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig f22766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T7 f22767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3177p8 f22768c;
    public final C3288w8 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3272v8 f22769e;
    public final InterfaceC3333z5 f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f22770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f22771i;
    public L8 j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2943b1 f22772l;
    public final D9 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22773n;
    public GestureDetectorOnGestureListenerC3005ec o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C3304x8 f22774p;

    public D8(Context context, AdConfig adConfig, T7 nativeAdContainer, C3177p8 dataModel, C3288w8 viewEventListener, C3272v8 clickEventListener, C3304x8 timerFinishListener, InterfaceC3333z5 interfaceC3333z5) {
        D9 d9;
        Intrinsics.f(context, "context");
        Intrinsics.f(adConfig, "adConfig");
        Intrinsics.f(nativeAdContainer, "nativeAdContainer");
        Intrinsics.f(dataModel, "dataModel");
        Intrinsics.f(viewEventListener, "viewEventListener");
        Intrinsics.f(clickEventListener, "clickEventListener");
        Intrinsics.f(timerFinishListener, "timerFinishListener");
        this.f22766a = adConfig;
        this.f22767b = nativeAdContainer;
        this.f22768c = dataModel;
        this.d = viewEventListener;
        this.f22769e = clickEventListener;
        this.f = interfaceC3333z5;
        this.g = "D8";
        this.f22770h = new Handler(Looper.getMainLooper());
        this.f22771i = new WeakReference(context);
        this.f22772l = new C2943b1();
        HashMap map = D9.f22775c;
        WeakReference weakReference = D9.d;
        D9 d10 = weakReference != null ? (D9) weakReference.get() : null;
        if (d10 == null) {
            synchronized (D9.class) {
                try {
                    WeakReference weakReference2 = D9.d;
                    if (weakReference2 == null || (d9 = (D9) weakReference2.get()) == null) {
                        d9 = new D9(context);
                        D9.d = new WeakReference(d9);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            d10 = d9;
        }
        this.m = d10;
        this.f22774p = timerFinishListener;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public final ViewGroup a(ViewGroup parent, C3049h8 root) {
        ViewGroup viewGroup;
        Intrinsics.f(parent, "parent");
        Intrinsics.f(root, "root");
        Context context = (Context) this.f22771i.get();
        if (context != null) {
            View viewA = this.m.a(context, root, this.f22766a);
            if (viewA instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewA;
            } else {
                viewGroup = null;
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return viewGroup;
        }
        HashMap map = D9.f22775c;
        viewGroup.setLayoutParams(C3146n9.a(root, parent));
        return viewGroup;
    }

    public final void b(View view, C2984d8 c2984d8) {
        if (c2984d8.f) {
            view.setOnClickListener(new ViewOnClickListenerC0903m(0, this, c2984d8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x020d  */
    /* JADX WARN: Code duplicated, block: B:107:0x021b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0224  */
    /* JADX WARN: Code duplicated, block: B:114:0x023e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0242  */
    /* JADX WARN: Code duplicated, block: B:117:0x0247  */
    /* JADX WARN: Code duplicated, block: B:119:0x024a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0256  */
    /* JADX WARN: Code duplicated, block: B:122:0x0259  */
    /* JADX WARN: Code duplicated, block: B:126:0x0262 A[Catch: Exception -> 0x026a, TryCatch #2 {Exception -> 0x026a, blocks: (B:124:0x025c, B:126:0x0262, B:130:0x0270, B:132:0x0286, B:135:0x028e, B:137:0x0294), top: B:184:0x025c }] */
    /* JADX WARN: Code duplicated, block: B:129:0x026f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0286 A[Catch: Exception -> 0x026a, TryCatch #2 {Exception -> 0x026a, blocks: (B:124:0x025c, B:126:0x0262, B:130:0x0270, B:132:0x0286, B:135:0x028e, B:137:0x0294), top: B:184:0x025c }] */
    /* JADX WARN: Code duplicated, block: B:133:0x028b  */
    /* JADX WARN: Code duplicated, block: B:135:0x028e A[Catch: Exception -> 0x026a, TryCatch #2 {Exception -> 0x026a, blocks: (B:124:0x025c, B:126:0x0262, B:130:0x0270, B:132:0x0286, B:135:0x028e, B:137:0x0294), top: B:184:0x025c }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0293  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b8 A[Catch: Exception -> 0x02cb, TryCatch #1 {Exception -> 0x02cb, blocks: (B:139:0x02a6, B:141:0x02b8, B:145:0x02e4, B:144:0x02cd), top: B:182:0x02a6 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x02cd A[Catch: Exception -> 0x02cb, TryCatch #1 {Exception -> 0x02cb, blocks: (B:139:0x02a6, B:141:0x02b8, B:145:0x02e4, B:144:0x02cd), top: B:182:0x02a6 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0312  */
    /* JADX WARN: Code duplicated, block: B:152:0x031c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0322  */
    /* JADX WARN: Code duplicated, block: B:156:0x0328  */
    /* JADX WARN: Code duplicated, block: B:159:0x033f  */
    /* JADX WARN: Code duplicated, block: B:162:0x036b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0392  */
    /* JADX WARN: Code duplicated, block: B:184:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0394 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x014f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Code duplicated, block: B:77:0x0167  */
    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    /* JADX WARN: Code duplicated, block: B:83:0x019e  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v33, types: [android.view.View, com.inmobi.media.K8] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final ViewGroup b(ViewGroup viewGroup, C3049h8 c3049h8) {
        View viewA;
        final WeakReference weakReference;
        int i2;
        int i3;
        View view;
        View view2;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        boolean z2;
        T7 t7;
        S7 s7;
        C3130m9 c3130m9;
        Object tag;
        C2968c9 c2968c9;
        RelativeLayout.LayoutParams layoutParams;
        Ve veD;
        String strB;
        String strExtractMetadata;
        String strExtractMetadata2;
        int i4;
        int i5;
        Point point;
        double d;
        double d2;
        double dA;
        double dA2;
        C2968c9 c2968c10;
        C3114l9 videoView;
        C3049h8 c3049h9;
        long jCurrentTimeMillis;
        C2984d8 c2984d8;
        T7 t8;
        long j;
        Context context;
        L8 nativeRecyclerViewAdapter;
        L8 l8;
        int i6;
        ?? r5;
        char c2;
        D8 d8 = this;
        final ?? r9 = 1;
        b((View) viewGroup, (C2984d8) c3049h8);
        final int i7 = 0;
        int i8 = 0;
        while (i8 < c3049h8.f23660B) {
            try {
                int i9 = i8 + 1;
                C2984d8 c2984d9 = (C2984d8) c3049h8.f23659A.get(i8);
                Intrinsics.c(c2984d9);
                if ("CONTAINER".equals(c2984d9.f23515c)) {
                    if (StringsKt.r(c2984d9.f23514b, "card_scrollable", r9)) {
                        Context context2 = (Context) d8.f22771i.get();
                        View viewA2 = context2 != null ? d8.m.a(context2, c2984d9, d8.f22766a) : null;
                        if (viewA2 instanceof K8) {
                            ?? r1 = (K8) viewA2;
                            byte type = r1.getType();
                            C3177p8 dataModel = d8.f22768c;
                            Intrinsics.f(dataModel, "dataModel");
                            if (type == 0) {
                                nativeRecyclerViewAdapter = new C3193q8(dataModel, d8);
                            } else {
                                if (type == r9) {
                                    try {
                                        nativeRecyclerViewAdapter = new NativeRecyclerViewAdapter(dataModel, d8);
                                    } catch (NoClassDefFoundError e2) {
                                        AbstractC3048h7.a((byte) r9, "InMobi", "Error rendering ad! RecyclerView not found. Please check if the recyclerview support library was included");
                                        S5 s5 = S5.f23167a;
                                        S5.d.a(new C3011f2(e2));
                                        l8 = null;
                                    }
                                }
                                l8 = null;
                                d8.j = l8;
                                if (l8 != null) {
                                    C3049h8 c3049h10 = (C3049h8) c2984d9;
                                    i6 = d8.k;
                                    if (i6 == 0) {
                                        c2 = 3;
                                    } else {
                                        if (i6 == d8.f22768c.d() - r9) {
                                            c2 = 5;
                                        } else {
                                            r5 = r9;
                                        }
                                        r1.a(c3049h10, l8, i6, r5, d8);
                                        HashMap map = D9.f22775c;
                                        r1.setLayoutParams(C3146n9.a(c2984d9, viewGroup));
                                        d8.a(viewA2, c2984d9);
                                        viewGroup.addView(viewA2);
                                    }
                                    r5 = c2;
                                    r1.a(c3049h10, l8, i6, r5, d8);
                                    HashMap map2 = D9.f22775c;
                                    r1.setLayoutParams(C3146n9.a(c2984d9, viewGroup));
                                    d8.a(viewA2, c2984d9);
                                    viewGroup.addView(viewA2);
                                }
                            }
                            l8 = nativeRecyclerViewAdapter;
                            d8.j = l8;
                            if (l8 != null) {
                                C3049h8 c3049h11 = (C3049h8) c2984d9;
                                i6 = d8.k;
                                if (i6 == 0) {
                                    c2 = 3;
                                } else {
                                    if (i6 == d8.f22768c.d() - r9) {
                                        c2 = 5;
                                    } else {
                                        r5 = r9;
                                    }
                                    r1.a(c3049h11, l8, i6, r5, d8);
                                    HashMap map3 = D9.f22775c;
                                    r1.setLayoutParams(C3146n9.a(c2984d9, viewGroup));
                                    d8.a(viewA2, c2984d9);
                                    viewGroup.addView(viewA2);
                                }
                                r5 = c2;
                                r1.a(c3049h11, l8, i6, r5, d8);
                                HashMap map4 = D9.f22775c;
                                r1.setLayoutParams(C3146n9.a(c2984d9, viewGroup));
                                d8.a(viewA2, c2984d9);
                                viewGroup.addView(viewA2);
                            }
                        }
                    } else {
                        Context context3 = (Context) d8.f22771i.get();
                        View viewA3 = context3 != null ? d8.m.a(context3, c2984d9, d8.f22766a) : null;
                        if (viewA3 instanceof ViewGroup) {
                            ViewGroup viewGroupB = d8.b((ViewGroup) viewA3, (C3049h8) c2984d9);
                            HashMap map5 = D9.f22775c;
                            viewGroupB.setLayoutParams(C3146n9.a(c2984d9, viewGroup));
                            d8.a(viewGroupB, c2984d9);
                            viewGroup.addView(viewGroupB);
                        }
                    }
                } else if ("WEBVIEW".equals(c2984d9.f23515c)) {
                    F9 f9 = (F9) c2984d9;
                    if (f9.f22821z && (viewA = d8.o) != null) {
                        ViewParent parent = viewA.getParent();
                        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewA);
                        }
                        d8.o = null;
                        if (viewA == null) {
                            context = (Context) d8.f22771i.get();
                            if (context != null) {
                                viewA = d8.m.a(context, c2984d9, d8.f22766a);
                            } else {
                                viewA = null;
                            }
                        }
                        if (viewA != null) {
                            weakReference = new WeakReference(viewA);
                            if (c2984d9.f23520n != -1) {
                                viewA.setVisibility(4);
                                d8.f22770h.postDelayed(new Runnable() { // from class: A.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i7) {
                                            case 0:
                                                D8.b(weakReference);
                                                break;
                                            default:
                                                D8.a(weakReference);
                                                break;
                                        }
                                    }
                                }, c2984d9.f23520n * 1000);
                            } else {
                                i2 = c2984d9.o;
                                if (i2 != -1) {
                                    d8.f22770h.postDelayed(new Runnable() { // from class: A.l
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (r9) {
                                                case 0:
                                                    D8.b(weakReference);
                                                    break;
                                                default:
                                                    D8.a(weakReference);
                                                    break;
                                            }
                                        }
                                    }, i2 * 1000);
                                }
                            }
                            HashMap map6 = D9.f22775c;
                            viewA.setLayoutParams(C3146n9.a(c2984d9, viewGroup));
                            d8.a(viewA, c2984d9);
                            viewGroup.addView(viewA);
                            if ("VIDEO".equals(c2984d9.f23515c)) {
                                c2968c10 = (C2968c9) c2984d9;
                                videoView = ((C3130m9) viewA).getVideoView();
                                c3049h9 = c2968c10.r;
                                if (c3049h9 == null) {
                                    c3049h9 = null;
                                }
                                jCurrentTimeMillis = System.currentTimeMillis();
                                View view3 = viewA;
                                if (c3049h9 != null) {
                                    j = c3049h9.y;
                                    if (0 == j) {
                                        j = jCurrentTimeMillis;
                                    }
                                    c3049h9.y = j;
                                }
                                i3 = 0;
                                videoView.setClickable(false);
                                videoView.setId(Integer.MAX_VALUE);
                                videoView.a(c2968c10);
                                c2984d8 = c2968c10.f23523w;
                                if (c2984d8 instanceof C2968c9) {
                                    c2968c10.a((C2968c9) c2984d8);
                                }
                                videoView.setQuartileCompletedListener(new C3336z8(d8, c2968c10));
                                videoView.setPlaybackEventListener(new A8(d8, c2968c10));
                                videoView.setMediaErrorListener(new B8(d8, c2968c10));
                                t8 = d8.f22767b;
                                if (!t8.t) {
                                    ((C2934a9) t8).b(c2968c10, videoView);
                                }
                                viewA = view3;
                            } else {
                                i3 = 0;
                            }
                            d8.b(viewA, c2984d9);
                            if ("TIMER".equals(c2984d9.f23515c)) {
                                viewA.setTag("timerView");
                                if (c2984d9 instanceof Q8) {
                                    ((T8) viewA).setTimerEventsListener(new C8(d8, (Q8) c2984d9));
                                }
                            }
                            if ("VIDEO".equals(c2984d9.f23515c)) {
                                if (viewA instanceof C3130m9) {
                                    c3130m9 = (C3130m9) viewA;
                                } else {
                                    c3130m9 = null;
                                }
                                if (c3130m9 != null) {
                                    tag = c3130m9.getVideoView().getTag();
                                    if (tag instanceof C2968c9) {
                                        c2968c9 = (C2968c9) tag;
                                    } else {
                                        c2968c9 = null;
                                    }
                                    if (c2968c9 != null) {
                                        veD = c2968c9.d();
                                        if (veD != null) {
                                            strB = ((Ue) veD).b();
                                        } else {
                                            strB = null;
                                        }
                                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                        mediaMetadataRetriever.setDataSource(strB);
                                        strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                                        strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                        if (strExtractMetadata != null) {
                                            i4 = Integer.parseInt(strExtractMetadata);
                                        } else {
                                            i4 = i3;
                                        }
                                        if (strExtractMetadata2 != null) {
                                            i5 = Integer.parseInt(strExtractMetadata2);
                                        } else {
                                            i5 = i3;
                                        }
                                        mediaMetadataRetriever.release();
                                        point = c2968c9.d.f23552a;
                                        HashMap map7 = D9.f22775c;
                                        view = viewA;
                                        d = i4;
                                        d2 = i5;
                                        if (((double) C3146n9.a(point.x)) / ((double) C3146n9.a(point.y)) > d / d2) {
                                            dA2 = ((((double) C3146n9.a(point.y)) * 1.0d) / d2) * d;
                                            dA = C3146n9.a(point.y);
                                        } else {
                                            double dA3 = C3146n9.a(point.x);
                                            dA = ((((double) C3146n9.a(point.x)) * 1.0d) / d) * d2;
                                            dA2 = dA3;
                                        }
                                        layoutParams = new RelativeLayout.LayoutParams((int) dA2, (int) dA);
                                        layoutParams.addRule(13);
                                        c3130m9.getVideoView().setLayoutParams(layoutParams);
                                    } else {
                                        view = viewA;
                                    }
                                } else {
                                    view = viewA;
                                }
                            } else {
                                view = viewA;
                            }
                            if ("WEBVIEW".equals(c2984d9.f23515c)) {
                                view2 = view;
                                if (view2 instanceof GestureDetectorOnGestureListenerC3005ec) {
                                    gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) view2;
                                    z2 = c2984d9 instanceof F9;
                                    if (z2) {
                                        gestureDetectorOnGestureListenerC3005ec.setScrollable(((F9) c2984d9).x);
                                    }
                                    d8 = this;
                                    gestureDetectorOnGestureListenerC3005ec.setReferenceContainer(d8.f22767b.v);
                                    t7 = d8.f22767b;
                                    s7 = t7.L;
                                    if (s7 == null) {
                                        s7 = new S7(t7);
                                        t7.L = s7;
                                    }
                                    gestureDetectorOnGestureListenerC3005ec.setRenderViewEventListener(s7);
                                    gestureDetectorOnGestureListenerC3005ec.setPlacementId(d8.f22767b.f23214e);
                                    gestureDetectorOnGestureListenerC3005ec.setAllowAutoRedirection(d8.f22767b.f);
                                    gestureDetectorOnGestureListenerC3005ec.setCreativeId(d8.f22767b.getCreativeId());
                                    gestureDetectorOnGestureListenerC3005ec.setImpressionId(d8.f22767b.getImpressionId());
                                    if (!z2) {
                                    }
                                } else {
                                    d8 = this;
                                }
                            } else {
                                d8 = this;
                            }
                        }
                    } else if (!"UNKNOWN".equals(f9.y)) {
                        viewA = null;
                        if (viewA == null) {
                            context = (Context) d8.f22771i.get();
                            if (context != null) {
                                viewA = d8.m.a(context, c2984d9, d8.f22766a);
                            } else {
                                viewA = null;
                            }
                        }
                        if (viewA != null) {
                            weakReference = new WeakReference(viewA);
                            if (c2984d9.f23520n != -1) {
                                viewA.setVisibility(4);
                                d8.f22770h.postDelayed(new Runnable() { // from class: A.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i7) {
                                            case 0:
                                                D8.b(weakReference);
                                                break;
                                            default:
                                                D8.a(weakReference);
                                                break;
                                        }
                                    }
                                }, c2984d9.f23520n * 1000);
                            } else {
                                i2 = c2984d9.o;
                                if (i2 != -1) {
                                    d8.f22770h.postDelayed(new Runnable() { // from class: A.l
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (r9) {
                                                case 0:
                                                    D8.b(weakReference);
                                                    break;
                                                default:
                                                    D8.a(weakReference);
                                                    break;
                                            }
                                        }
                                    }, i2 * 1000);
                                }
                            }
                            HashMap map8 = D9.f22775c;
                            viewA.setLayoutParams(C3146n9.a(c2984d9, viewGroup));
                            d8.a(viewA, c2984d9);
                            viewGroup.addView(viewA);
                            if ("VIDEO".equals(c2984d9.f23515c)) {
                                c2968c10 = (C2968c9) c2984d9;
                                videoView = ((C3130m9) viewA).getVideoView();
                                c3049h9 = c2968c10.r;
                                if (c3049h9 == null) {
                                    c3049h9 = null;
                                }
                                jCurrentTimeMillis = System.currentTimeMillis();
                                View view4 = viewA;
                                if (c3049h9 != null) {
                                    j = c3049h9.y;
                                    if (0 == j) {
                                        j = jCurrentTimeMillis;
                                    }
                                    c3049h9.y = j;
                                }
                                i3 = 0;
                                videoView.setClickable(false);
                                videoView.setId(Integer.MAX_VALUE);
                                videoView.a(c2968c10);
                                c2984d8 = c2968c10.f23523w;
                                if (c2984d8 instanceof C2968c9) {
                                    c2968c10.a((C2968c9) c2984d8);
                                }
                                videoView.setQuartileCompletedListener(new C3336z8(d8, c2968c10));
                                videoView.setPlaybackEventListener(new A8(d8, c2968c10));
                                videoView.setMediaErrorListener(new B8(d8, c2968c10));
                                t8 = d8.f22767b;
                                if (!t8.t && (t8 instanceof C2934a9)) {
                                    try {
                                        ((C2934a9) t8).b(c2968c10, videoView);
                                    } catch (Exception e3) {
                                        InterfaceC3333z5 interfaceC3333z5 = d8.f;
                                        if (interfaceC3333z5 != null) {
                                            String str = d8.g;
                                            ((A5) interfaceC3333z5).b(str, rf.a(e3, H6.a(str, "TAG", "SDK encountered unexpected error in handling the onVideoViewCreated event; ")));
                                        }
                                    }
                                }
                                viewA = view4;
                            } else {
                                i3 = 0;
                            }
                            d8.b(viewA, c2984d9);
                            if ("TIMER".equals(c2984d9.f23515c)) {
                                viewA.setTag("timerView");
                                if ((c2984d9 instanceof Q8) && (viewA instanceof T8)) {
                                    ((T8) viewA).setTimerEventsListener(new C8(d8, (Q8) c2984d9));
                                }
                            }
                            if ("VIDEO".equals(c2984d9.f23515c)) {
                                view = viewA;
                            } else {
                                if (viewA instanceof C3130m9) {
                                    c3130m9 = (C3130m9) viewA;
                                } else {
                                    c3130m9 = null;
                                }
                                if (c3130m9 != null) {
                                    tag = c3130m9.getVideoView().getTag();
                                    if (tag instanceof C2968c9) {
                                        c2968c9 = (C2968c9) tag;
                                    } else {
                                        c2968c9 = null;
                                    }
                                    if (c2968c9 != null) {
                                        try {
                                            veD = c2968c9.d();
                                            if (veD != null) {
                                                strB = ((Ue) veD).b();
                                            } else {
                                                strB = null;
                                            }
                                            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                                            mediaMetadataRetriever2.setDataSource(strB);
                                            strExtractMetadata = mediaMetadataRetriever2.extractMetadata(18);
                                            strExtractMetadata2 = mediaMetadataRetriever2.extractMetadata(19);
                                            if (strExtractMetadata != null) {
                                                i4 = Integer.parseInt(strExtractMetadata);
                                            } else {
                                                i4 = i3;
                                            }
                                            if (strExtractMetadata2 != null) {
                                                i5 = Integer.parseInt(strExtractMetadata2);
                                            } else {
                                                i5 = i3;
                                            }
                                            mediaMetadataRetriever2.release();
                                            point = c2968c9.d.f23552a;
                                            HashMap map9 = D9.f22775c;
                                            view = viewA;
                                            try {
                                                d = i4;
                                                d2 = i5;
                                                if (((double) C3146n9.a(point.x)) / ((double) C3146n9.a(point.y)) > d / d2) {
                                                    dA2 = ((((double) C3146n9.a(point.y)) * 1.0d) / d2) * d;
                                                    dA = C3146n9.a(point.y);
                                                } else {
                                                    double dA4 = C3146n9.a(point.x);
                                                    dA = ((((double) C3146n9.a(point.x)) * 1.0d) / d) * d2;
                                                    dA2 = dA4;
                                                }
                                                layoutParams = new RelativeLayout.LayoutParams((int) dA2, (int) dA);
                                            } catch (Exception e4) {
                                                e = e4;
                                                Intrinsics.e(c3130m9.f23813a, "TAG");
                                                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                                                S5 s6 = S5.f23167a;
                                                S5.d.a(AbstractC3285w5.a(e, "event"));
                                                layoutParams = layoutParams2;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            view = viewA;
                                        }
                                        layoutParams.addRule(13);
                                        c3130m9.getVideoView().setLayoutParams(layoutParams);
                                    } else {
                                        view = viewA;
                                    }
                                } else {
                                    view = viewA;
                                }
                            }
                            if ("WEBVIEW".equals(c2984d9.f23515c)) {
                                view2 = view;
                                if (view2 instanceof GestureDetectorOnGestureListenerC3005ec) {
                                    gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) view2;
                                    z2 = c2984d9 instanceof F9;
                                    if (z2) {
                                        gestureDetectorOnGestureListenerC3005ec.setScrollable(((F9) c2984d9).x);
                                    }
                                    d8 = this;
                                    gestureDetectorOnGestureListenerC3005ec.setReferenceContainer(d8.f22767b.v);
                                    t7 = d8.f22767b;
                                    s7 = t7.L;
                                    if (s7 == null) {
                                        s7 = new S7(t7);
                                        t7.L = s7;
                                    }
                                    gestureDetectorOnGestureListenerC3005ec.setRenderViewEventListener(s7);
                                    gestureDetectorOnGestureListenerC3005ec.setPlacementId(d8.f22767b.f23214e);
                                    gestureDetectorOnGestureListenerC3005ec.setAllowAutoRedirection(d8.f22767b.f);
                                    gestureDetectorOnGestureListenerC3005ec.setCreativeId(d8.f22767b.getCreativeId());
                                    gestureDetectorOnGestureListenerC3005ec.setImpressionId(d8.f22767b.getImpressionId());
                                    if (!z2 && ((F9) c2984d9).f22821z) {
                                        T7 t9 = d8.f22767b;
                                        InterfaceC3333z5 interfaceC3333z6 = t9.j;
                                        if (interfaceC3333z6 != null) {
                                            String TAG = t9.m;
                                            Intrinsics.e(TAG, "TAG");
                                            ((A5) interfaceC3333z6).c(TAG, "setHTMLTrackedView");
                                        }
                                        if (t9.K == 0 && t9.f23205I == null && t9.H == null) {
                                            t9.f23205I = gestureDetectorOnGestureListenerC3005ec;
                                        }
                                    }
                                } else {
                                    d8 = this;
                                }
                            } else {
                                d8 = this;
                            }
                        }
                    }
                } else if (!"IMAGE".equals(c2984d9.f23515c) || c2984d9.f23516e != null) {
                    viewA = null;
                    if (viewA == null) {
                        context = (Context) d8.f22771i.get();
                        if (context != null) {
                            viewA = d8.m.a(context, c2984d9, d8.f22766a);
                        } else {
                            viewA = null;
                        }
                    }
                    if (viewA != null) {
                        weakReference = new WeakReference(viewA);
                        if (c2984d9.f23520n != -1) {
                            viewA.setVisibility(4);
                            d8.f22770h.postDelayed(new Runnable() { // from class: A.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i7) {
                                        case 0:
                                            D8.b(weakReference);
                                            break;
                                        default:
                                            D8.a(weakReference);
                                            break;
                                    }
                                }
                            }, c2984d9.f23520n * 1000);
                        } else {
                            i2 = c2984d9.o;
                            if (i2 != -1) {
                                d8.f22770h.postDelayed(new Runnable() { // from class: A.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (r9) {
                                            case 0:
                                                D8.b(weakReference);
                                                break;
                                            default:
                                                D8.a(weakReference);
                                                break;
                                        }
                                    }
                                }, i2 * 1000);
                            }
                        }
                        HashMap map10 = D9.f22775c;
                        viewA.setLayoutParams(C3146n9.a(c2984d9, viewGroup));
                        d8.a(viewA, c2984d9);
                        viewGroup.addView(viewA);
                        if ("VIDEO".equals(c2984d9.f23515c)) {
                            c2968c10 = (C2968c9) c2984d9;
                            videoView = ((C3130m9) viewA).getVideoView();
                            c3049h9 = c2968c10.r;
                            if (c3049h9 == null) {
                                c3049h9 = null;
                            }
                            jCurrentTimeMillis = System.currentTimeMillis();
                            View view5 = viewA;
                            if (c3049h9 != null) {
                                j = c3049h9.y;
                                if (0 == j) {
                                    j = jCurrentTimeMillis;
                                }
                                c3049h9.y = j;
                            }
                            i3 = 0;
                            videoView.setClickable(false);
                            videoView.setId(Integer.MAX_VALUE);
                            videoView.a(c2968c10);
                            c2984d8 = c2968c10.f23523w;
                            if (c2984d8 instanceof C2968c9) {
                                c2968c10.a((C2968c9) c2984d8);
                            }
                            videoView.setQuartileCompletedListener(new C3336z8(d8, c2968c10));
                            videoView.setPlaybackEventListener(new A8(d8, c2968c10));
                            videoView.setMediaErrorListener(new B8(d8, c2968c10));
                            t8 = d8.f22767b;
                            if (!t8.t) {
                                ((C2934a9) t8).b(c2968c10, videoView);
                            }
                            viewA = view5;
                        } else {
                            i3 = 0;
                        }
                        d8.b(viewA, c2984d9);
                        if ("TIMER".equals(c2984d9.f23515c)) {
                            viewA.setTag("timerView");
                            if (c2984d9 instanceof Q8) {
                                ((T8) viewA).setTimerEventsListener(new C8(d8, (Q8) c2984d9));
                            }
                        }
                        if ("VIDEO".equals(c2984d9.f23515c)) {
                            view = viewA;
                        } else {
                            if (viewA instanceof C3130m9) {
                                c3130m9 = (C3130m9) viewA;
                            } else {
                                c3130m9 = null;
                            }
                            if (c3130m9 != null) {
                                tag = c3130m9.getVideoView().getTag();
                                if (tag instanceof C2968c9) {
                                    c2968c9 = (C2968c9) tag;
                                } else {
                                    c2968c9 = null;
                                }
                                if (c2968c9 != null) {
                                    veD = c2968c9.d();
                                    if (veD != null) {
                                        strB = ((Ue) veD).b();
                                    } else {
                                        strB = null;
                                    }
                                    MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
                                    mediaMetadataRetriever3.setDataSource(strB);
                                    strExtractMetadata = mediaMetadataRetriever3.extractMetadata(18);
                                    strExtractMetadata2 = mediaMetadataRetriever3.extractMetadata(19);
                                    if (strExtractMetadata != null) {
                                        i4 = Integer.parseInt(strExtractMetadata);
                                    } else {
                                        i4 = i3;
                                    }
                                    if (strExtractMetadata2 != null) {
                                        i5 = Integer.parseInt(strExtractMetadata2);
                                    } else {
                                        i5 = i3;
                                    }
                                    mediaMetadataRetriever3.release();
                                    point = c2968c9.d.f23552a;
                                    HashMap map11 = D9.f22775c;
                                    view = viewA;
                                    d = i4;
                                    d2 = i5;
                                    if (((double) C3146n9.a(point.x)) / ((double) C3146n9.a(point.y)) > d / d2) {
                                        dA2 = ((((double) C3146n9.a(point.y)) * 1.0d) / d2) * d;
                                        dA = C3146n9.a(point.y);
                                    } else {
                                        double dA5 = C3146n9.a(point.x);
                                        dA = ((((double) C3146n9.a(point.x)) * 1.0d) / d) * d2;
                                        dA2 = dA5;
                                    }
                                    layoutParams = new RelativeLayout.LayoutParams((int) dA2, (int) dA);
                                    layoutParams.addRule(13);
                                    c3130m9.getVideoView().setLayoutParams(layoutParams);
                                } else {
                                    view = viewA;
                                }
                            } else {
                                view = viewA;
                            }
                        }
                        if ("WEBVIEW".equals(c2984d9.f23515c)) {
                            view2 = view;
                            if (view2 instanceof GestureDetectorOnGestureListenerC3005ec) {
                                gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) view2;
                                z2 = c2984d9 instanceof F9;
                                if (z2) {
                                    gestureDetectorOnGestureListenerC3005ec.setScrollable(((F9) c2984d9).x);
                                }
                                d8 = this;
                                gestureDetectorOnGestureListenerC3005ec.setReferenceContainer(d8.f22767b.v);
                                t7 = d8.f22767b;
                                s7 = t7.L;
                                if (s7 == null) {
                                    s7 = new S7(t7);
                                    t7.L = s7;
                                }
                                gestureDetectorOnGestureListenerC3005ec.setRenderViewEventListener(s7);
                                gestureDetectorOnGestureListenerC3005ec.setPlacementId(d8.f22767b.f23214e);
                                gestureDetectorOnGestureListenerC3005ec.setAllowAutoRedirection(d8.f22767b.f);
                                gestureDetectorOnGestureListenerC3005ec.setCreativeId(d8.f22767b.getCreativeId());
                                gestureDetectorOnGestureListenerC3005ec.setImpressionId(d8.f22767b.getImpressionId());
                                if (!z2) {
                                }
                            } else {
                                d8 = this;
                            }
                        } else {
                            d8 = this;
                        }
                    }
                }
                i8 = i9;
                r9 = 1;
                i7 = 0;
            } catch (IndexOutOfBoundsException e6) {
                throw new NoSuchElementException(e6.getMessage());
            }
        }
        return viewGroup;
    }

    public final J8 a(J8 j8, ViewGroup parent, GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        Intrinsics.f(parent, "parent");
        this.o = gestureDetectorOnGestureListenerC3005ec;
        J8 j8A = a(j8, parent);
        this.f22770h.post(new RunnableC0887e(this, j8A, parent));
        return j8A;
    }

    public static final void a(D8 this$0, J8 j8, ViewGroup parent) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(parent, "$parent");
        if (this$0.f22773n) {
            return;
        }
        C3049h8 c3049h8 = this$0.f22768c.f23886e;
        if (j8 == null || c3049h8 == null) {
            return;
        }
        this$0.b((ViewGroup) j8, c3049h8);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public final J8 a(J8 j8, ViewGroup viewGroup) {
        J8 j9;
        C3049h8 c3049h8 = this.f22768c.f23886e;
        if (j8 == null) {
            Context context = (Context) this.f22771i.get();
            if (context == null || c3049h8 == null) {
                j9 = null;
            } else {
                View viewA = this.m.a(context, c3049h8, this.f22766a);
                if (viewA instanceof J8) {
                    j9 = (J8) viewA;
                } else {
                    j9 = null;
                }
            }
        } else {
            j9 = j8;
        }
        if (j9 != null && j8 != null) {
            ViewParent parent = j9.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(j9);
            }
            D9 d9 = this.m;
            d9.getClass();
            for (int childCount = j9.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = j9.getChildAt(childCount);
                j9.removeViewAt(childCount);
                Intrinsics.c(childAt);
                d9.a(childAt);
            }
            if (c3049h8 != null) {
                HashMap map = D9.f22775c;
                C3146n9.a(j9, c3049h8.d);
            }
        }
        if (c3049h8 != null) {
            D9 d10 = this.m;
            int i2 = c3049h8.d.f23552a.x;
            d10.getClass();
            D9.g = i2;
        }
        if (j9 != null && c3049h8 != null) {
            HashMap map2 = D9.f22775c;
            j9.setLayoutParams(C3146n9.a(c3049h8, viewGroup));
        }
        return j9;
    }

    public final void a(View view, C2984d8 nativeAsset) {
        boolean z2 = false;
        C2943b1 c2943b1 = this.f22772l;
        c2943b1.getClass();
        Intrinsics.f(view, "view");
        Intrinsics.f(nativeAsset, "nativeAsset");
        ArrayList arrayList = new ArrayList();
        try {
            HashMap map = D9.f22775c;
            float fA = C3146n9.a(nativeAsset.d.f23554c.x);
            float fA2 = C3146n9.a(nativeAsset.d.d.x);
            if (fA != fA2) {
                arrayList.add(C2943b1.a(C2943b1.a(view, fA, fA2), nativeAsset));
            }
            float fA3 = C3146n9.a(nativeAsset.d.f23554c.y);
            float fA4 = C3146n9.a(nativeAsset.d.d.y);
            if (fA3 != fA4) {
                arrayList.add(C2943b1.a(C2943b1.b(view, fA3, fA4), nativeAsset));
            }
            float fA5 = C3146n9.a(nativeAsset.d.f23552a.x);
            float fA6 = C3146n9.a(nativeAsset.d.f23553b.x);
            if (fA5 != fA6) {
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", fA6 / fA5);
                Intrinsics.e(objectAnimatorOfFloat, "ofFloat(...)");
                arrayList.add(C2943b1.a(objectAnimatorOfFloat, nativeAsset));
            }
            float fA7 = C3146n9.a(nativeAsset.d.f23552a.y);
            float fA8 = C3146n9.a(nativeAsset.d.f23553b.y);
            if (fA7 != fA8) {
                view.setPivotX(0.0f);
                view.setPivotY(0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", fA8 / fA7);
                Intrinsics.e(objectAnimatorOfFloat2, "ofFloat(...)");
                arrayList.add(C2943b1.a(objectAnimatorOfFloat2, nativeAsset));
            }
        } catch (Exception unused) {
            String TAG = c2943b1.f23457a;
            Intrinsics.e(TAG, "TAG");
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        Iterator it = nativeAsset.s.iterator();
        while (it.hasNext()) {
            if ("creativeView".equals(((U8) it.next()).f23265b)) {
                z2 = true;
                break;
            }
        }
        if (arrayList != null || z2) {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3320y8(this, arrayList, nativeAsset));
        }
    }

    public static final void a(WeakReference childViewRef) {
        Intrinsics.f(childViewRef, "$childViewRef");
        View view = (View) childViewRef.get();
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static final void a(D8 this$0, C2984d8 asset, View view) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(asset, "$asset");
        C3272v8 c3272v8 = this$0.f22769e;
        Intrinsics.c(view);
        C3304x8 c3304x8 = c3272v8.f24058a;
        if (c3304x8.f24099a) {
            return;
        }
        c3304x8.f24100b.a(view, asset);
        c3272v8.f24058a.f24100b.a(asset, false);
    }

    public static final void b(WeakReference childViewRef) {
        Intrinsics.f(childViewRef, "$childViewRef");
        View view = (View) childViewRef.get();
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
