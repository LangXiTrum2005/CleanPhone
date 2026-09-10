package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3030g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f23625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f23626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lf f23627c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f23628e;
    public final RunnableC3014f5 f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC2981d5 f23629h;

    public C3030g5(AdConfig.ViewabilityConfig viewabilityConfig, lf visibilityTracker, InterfaceC2981d5 listener) {
        Intrinsics.f(viewabilityConfig, "viewabilityConfig");
        Intrinsics.f(visibilityTracker, "visibilityTracker");
        Intrinsics.f(listener, "listener");
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f23625a = weakHashMap;
        this.f23626b = weakHashMap2;
        this.f23627c = visibilityTracker;
        this.d = "g5";
        this.g = viewabilityConfig.getImpressionPollIntervalMillis();
        C2964c5 c2964c5 = new C2964c5(this);
        InterfaceC3333z5 interfaceC3333z5 = visibilityTracker.f23794e;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        visibilityTracker.j = c2964c5;
        this.f23628e = handler;
        this.f = new RunnableC3014f5(this);
        this.f23629h = listener;
    }

    public final void a(View view, Object token, int i2, int i3) {
        Intrinsics.f(view, "view");
        Intrinsics.f(token, "token");
        C2998e5 c2998e5 = (C2998e5) this.f23625a.get(view);
        if (Intrinsics.a(c2998e5 != null ? c2998e5.f23546a : null, token)) {
            return;
        }
        a(view);
        this.f23625a.put(view, new C2998e5(token, i2, i3));
        this.f23627c.a(view, token, i2);
    }

    public final void a(View view) {
        Intrinsics.f(view, "view");
        this.f23625a.remove(view);
        this.f23626b.remove(view);
        this.f23627c.a(view);
    }
}
