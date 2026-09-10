package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.ads.BuildConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ko {
    public final InterfaceC3072m9 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public ko(InterfaceC3072m9 interfaceC3072m9) {
        this.a = interfaceC3072m9;
    }

    public final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, String str) {
        this.b.put(str, gestureDetectorOnGestureListenerC2829ci);
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("SiblingWebViewManager", "Registered bridge for WebView ID: " + str);
        }
    }

    public final void b(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ConcurrentHashMap concurrentHashMap = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((GestureDetectorOnGestureListenerC2829ci) entry.getValue()) instanceof C3031ki) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) ((Map.Entry) it.next()).getValue();
            Intrinsics.competently(gestureDetectorOnGestureListenerC2829ci, "null cannot be cast to non-null type com.inmobi.ads.containers.companions.RenderViewSibling");
            action.invoke((C3031ki) gestureDetectorOnGestureListenerC2829ci);
        }
    }

    public final void a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.b.remove(id);
        InterfaceC3072m9 interfaceC3072m9 = this.a;
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("SiblingWebViewManager", "Unregistered bridge for WebView ID: " + id);
        }
    }

    public final void a(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) this.b.get(BuildConfig.FLAVOR);
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            action.invoke(gestureDetectorOnGestureListenerC2829ci);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!Intrinsics.wireman(entry.getKey(), BuildConfig.FLAVOR)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke((GestureDetectorOnGestureListenerC2829ci) ((Map.Entry) it.next()).getValue());
        }
    }

    public final GestureDetectorOnGestureListenerC2829ci a(Di route, Context context, short s, C3113o0 adMetaData, AdConfig adConfig) {
        GestureDetectorOnGestureListenerC2829ci c3031ki;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adMetaData, "adMetaData");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        if (s == 0) {
            InterfaceC3072m9 interfaceC3072m9 = this.a;
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).a("SiblingWebViewManager", "Creating standard WebView with ID: " + route.b);
            }
            c3031ki = new GestureDetectorOnGestureListenerC2829ci(context, adMetaData.o, adMetaData.p, adMetaData.q, adMetaData.r, 0L, adMetaData.s, adMetaData.t, route, this, adMetaData, adConfig, 80);
        } else if (s == 1) {
            InterfaceC3072m9 interfaceC3072m10 = this.a;
            if (interfaceC3072m10 != null) {
                ((C3097n9) interfaceC3072m10).a("SiblingWebViewManager", "Creating Sibling WebView with ID: " + route.b);
            }
            c3031ki = new C3031ki(context, adMetaData.o, adMetaData.t, C3113o0.a(adMetaData, null, 4194047), this, route, adConfig);
        } else {
            InterfaceC3072m9 interfaceC3072m11 = this.a;
            if (interfaceC3072m11 != null) {
                ((C3097n9) interfaceC3072m11).b("SiblingWebViewManager", "Unsupported WebView type: " + ((int) s));
            }
            throw new IllegalArgumentException("Unsupported WebView type: " + ((int) s));
        }
        a(c3031ki, route.b);
        return c3031ki;
    }
}
