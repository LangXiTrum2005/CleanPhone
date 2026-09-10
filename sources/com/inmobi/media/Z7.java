package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f23400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3333z5 f23401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23402c = "Z7";
    public final WeakHashMap d = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f23403e = new WeakHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final W7 g = new W7();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y7 f23404h = new Y7(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final X7 f23405i = new X7();

    public Z7(byte b2, InterfaceC3333z5 interfaceC3333z5) {
        this.f23400a = b2;
        this.f23401b = interfaceC3333z5;
    }

    public final void a(Context context, View view, T7 token, AdConfig.ViewabilityConfig viewabilityConfig) {
        Intrinsics.f(context, "context");
        Intrinsics.f(view, "view");
        Intrinsics.f(token, "token");
        Intrinsics.f(viewabilityConfig, "viewabilityConfig");
        C3030g5 c3030g5 = (C3030g5) this.d.get(context);
        if (c3030g5 == null) {
            c3030g5 = context instanceof Activity ? new C3030g5(viewabilityConfig, new B3(this.f23405i, (Activity) context, this.f23401b), this.g) : new C3030g5(viewabilityConfig, new Ra(this.f23405i, viewabilityConfig, (byte) 1, this.f23401b), this.g);
            this.d.put(context, c3030g5);
        }
        byte b2 = this.f23400a;
        if (b2 == 0) {
            c3030g5.a(view, token, viewabilityConfig.getVideoImpressionMinPercentageViewed(), viewabilityConfig.getVideoImpressionMinTimeViewed());
        } else if (b2 == 1) {
            c3030g5.a(view, token, viewabilityConfig.getImpressionMinPercentageViewed(), viewabilityConfig.getImpressionMinTimeViewed());
        } else {
            c3030g5.a(view, token, viewabilityConfig.getImpressionMinPercentageViewed(), viewabilityConfig.getImpressionMinTimeViewed());
        }
    }

    public final void a(Context context, T7 token) {
        View view;
        Intrinsics.f(context, "context");
        Intrinsics.f(token, "token");
        C3030g5 c3030g5 = (C3030g5) this.d.get(context);
        if (c3030g5 != null) {
            Iterator it = c3030g5.f23625a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    view = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (Intrinsics.a(((C2998e5) entry.getValue()).f23546a, token)) {
                    view = (View) entry.getKey();
                    break;
                }
            }
            if (view != null) {
                c3030g5.f23625a.remove(view);
                c3030g5.f23626b.remove(view);
                c3030g5.f23627c.a(view);
            }
            if (c3030g5.f23625a.isEmpty()) {
                InterfaceC3333z5 interfaceC3333z5 = this.f23401b;
                if (interfaceC3333z5 != null) {
                    String TAG = this.f23402c;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).a(TAG, "Impression tracker is free, removing it");
                }
                C3030g5 c3030g6 = (C3030g5) this.d.remove(context);
                if (c3030g6 != null) {
                    c3030g6.f23625a.clear();
                    c3030g6.f23626b.clear();
                    c3030g6.f23627c.a();
                    c3030g6.f23628e.removeMessages(0);
                    c3030g6.f23627c.b();
                }
                if (context instanceof Activity) {
                    this.d.isEmpty();
                }
            }
        }
    }

    public final void a(Context context, View view, T7 token) {
        View view2;
        Intrinsics.f(context, "context");
        Intrinsics.f(view, "view");
        Intrinsics.f(token, "token");
        lf lfVar = (lf) this.f23403e.get(context);
        if (lfVar != null) {
            Iterator it = lfVar.f23791a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    view2 = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (Intrinsics.a(((Cif) entry.getValue()).d, token)) {
                    view2 = (View) entry.getKey();
                    break;
                }
            }
            if (view2 != null) {
                lfVar.a(view2);
            }
            if (lfVar.f23791a.isEmpty()) {
                InterfaceC3333z5 interfaceC3333z5 = this.f23401b;
                if (interfaceC3333z5 != null) {
                    String TAG = this.f23402c;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).a(TAG, "Impression tracker is free, removing it");
                }
                lf lfVar2 = (lf) this.f23403e.remove(context);
                if (lfVar2 != null) {
                    lfVar2.b();
                }
                if (context instanceof Activity) {
                    this.f23403e.isEmpty();
                }
            }
        }
        this.f.remove(view);
    }

    public final void a(Context context, View view, T7 token, ef listener, AdConfig.ViewabilityConfig config) {
        Intrinsics.f(context, "context");
        Intrinsics.f(view, "view");
        Intrinsics.f(token, "token");
        Intrinsics.f(listener, "listener");
        Intrinsics.f(config, "config");
        lf ra = (lf) this.f23403e.get(context);
        if (ra == null) {
            if (context instanceof Activity) {
                ra = new B3(this.f23405i, (Activity) context, this.f23401b);
            } else {
                ra = new Ra(this.f23405i, config, (byte) 1, this.f23401b);
            }
            Y7 y7 = this.f23404h;
            InterfaceC3333z5 interfaceC3333z5 = ra.f23794e;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("VisibilityTracker", "setVisibilityTrackerListener logger");
            }
            ra.j = y7;
            this.f23403e.put(context, ra);
        }
        this.f.put(view, listener);
        byte b2 = this.f23400a;
        if (b2 == 0) {
            ra.a(view, token, config.getVideoMinPercentagePlay());
        } else if (b2 == 1) {
            ra.a(view, token, config.getDisplayMinPercentageAnimate());
        } else {
            ra.a(view, token, config.getDisplayMinPercentageAnimate());
        }
    }
}
