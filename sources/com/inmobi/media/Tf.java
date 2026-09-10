package com.inmobi.media;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3333z5 f24016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f24017b = new ConcurrentHashMap();

    public tf(InterfaceC3333z5 interfaceC3333z5) {
        this.f24016a = interfaceC3333z5;
    }

    public final void a(Function1 action) {
        Intrinsics.f(action, "action");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) this.f24017b.get("default");
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            action.invoke(gestureDetectorOnGestureListenerC3005ec);
        }
        ConcurrentHashMap concurrentHashMap = this.f24017b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!Intrinsics.a(entry.getKey(), "default")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke((GestureDetectorOnGestureListenerC3005ec) ((Map.Entry) it.next()).getValue());
        }
    }

    public final void b(Function1 action) {
        Intrinsics.f(action, "action");
        ConcurrentHashMap concurrentHashMap = this.f24017b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((GestureDetectorOnGestureListenerC3005ec) entry.getValue()) instanceof C3117lc) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) ((Map.Entry) it.next()).getValue();
            Intrinsics.d(gestureDetectorOnGestureListenerC3005ec, "null cannot be cast to non-null type com.inmobi.ads.containers.companions.RenderViewSibling");
            action.invoke((C3117lc) gestureDetectorOnGestureListenerC3005ec);
        }
    }

    public final GestureDetectorOnGestureListenerC3005ec a(Cc route, Context context, short s, Q adMetaData) {
        GestureDetectorOnGestureListenerC3005ec c3117lc;
        Intrinsics.f(route, "route");
        Intrinsics.f(context, "context");
        Intrinsics.f(adMetaData, "adMetaData");
        if (s == 0) {
            InterfaceC3333z5 interfaceC3333z5 = this.f24016a;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("SiblingWebViewManager", "Creating standard WebView with ID: " + route.f22751b);
            }
            c3117lc = new GestureDetectorOnGestureListenerC3005ec(context, adMetaData.o, adMetaData.f23095p, adMetaData.q, false, adMetaData.s, 0L, adMetaData.t, adMetaData.f23096u, route, this, adMetaData, 80);
        } else if (s == 1) {
            InterfaceC3333z5 interfaceC3333z6 = this.f24016a;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("SiblingWebViewManager", "Creating Sibling WebView with ID: " + route.f22751b);
            }
            c3117lc = new C3117lc(context, adMetaData.o, adMetaData.f23096u, Q.a(adMetaData, null, 4194047), this, route);
        } else {
            InterfaceC3333z5 interfaceC3333z7 = this.f24016a;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b("SiblingWebViewManager", android.support.v4.media.a.h(s, "Unsupported WebView type: "));
            }
            throw new IllegalArgumentException(android.support.v4.media.a.h(s, "Unsupported WebView type: "));
        }
        String str = route.f22751b;
        this.f24017b.put(str, c3117lc);
        InterfaceC3333z5 interfaceC3333z8 = this.f24016a;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).a("SiblingWebViewManager", AbstractC3041h0.a("Registered bridge for WebView ID: ", str));
        }
        return c3117lc;
    }
}
