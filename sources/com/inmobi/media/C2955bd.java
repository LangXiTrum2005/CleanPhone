package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.ch;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2955bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf f23464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3333z5 f23465b;

    public C2955bd(tf wvFactory, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(wvFactory, "wvFactory");
        this.f23464a = wvFactory;
        this.f23465b = interfaceC3333z5;
    }

    public final GestureDetectorOnGestureListenerC3005ec a() {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a("default");
        if (gestureDetectorOnGestureListenerC3005ecA != null) {
            return gestureDetectorOnGestureListenerC3005ecA;
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23465b;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b(com.smartdigimkt.b0.a.f33822P, "AdRenderView is null, cannot initialize webview.");
        }
        return null;
    }

    public final void b(String sourceId, String targetId) throws JSONException {
        Context context;
        Object next;
        Xe viewableAd;
        Integer numA;
        Intrinsics.f(sourceId, "sourceId");
        Intrinsics.f(targetId, "targetId");
        InterfaceC3333z5 interfaceC3333z5 = this.f23465b;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a(com.smartdigimkt.b0.a.f33822P, "showWebView " + this);
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a(sourceId);
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC3005ecA2 == null) {
            Lazy lazy = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA = AbstractC2938ad.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", 304);
            gestureDetectorOnGestureListenerC3005ecA.a("showWebView", jSONObjectA);
            return;
        }
        if (targetId.equals("default")) {
            a(gestureDetectorOnGestureListenerC3005ecA, targetId, "showWebView");
            return;
        }
        if (!(gestureDetectorOnGestureListenerC3005ecA2 instanceof C3117lc)) {
            Lazy lazy2 = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA2 = AbstractC2938ad.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put("errorCode", 305);
            gestureDetectorOnGestureListenerC3005ecA.a("showWebView", jSONObjectA2);
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA3 = a();
        if (gestureDetectorOnGestureListenerC3005ecA3 != null && !gestureDetectorOnGestureListenerC3005ecA3.isAttachedToWindow()) {
            Lazy lazy3 = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA3 = AbstractC2938ad.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA3.put("errorCode", 305);
            gestureDetectorOnGestureListenerC3005ecA.a("showWebView", jSONObjectA3);
            return;
        }
        Integer numA2 = gestureDetectorOnGestureListenerC3005ecA2.getWvStateMachine().a(5);
        if (numA2 != null) {
            int iIntValue = numA2.intValue();
            Lazy lazy4 = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA4 = AbstractC2938ad.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA4.put("errorCode", iIntValue);
            gestureDetectorOnGestureListenerC3005ecA.a("showWebView", jSONObjectA4);
            return;
        }
        Iterator it = MapsKt.q(this.f23464a.f24017b).values().iterator();
        while (true) {
            context = null;
            context = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) next;
            if (gestureDetectorOnGestureListenerC3005ec.getWvStateMachine().f22726b == 105 && !gestureDetectorOnGestureListenerC3005ec.equals(gestureDetectorOnGestureListenerC3005ecA2) && !Intrinsics.a(gestureDetectorOnGestureListenerC3005ec.getRoute().f22751b, "default")) {
                break;
            }
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = (GestureDetectorOnGestureListenerC3005ec) next;
        if (gestureDetectorOnGestureListenerC3005ec2 != null && (numA = gestureDetectorOnGestureListenerC3005ec2.getWvStateMachine().a(7)) != null) {
            int iIntValue2 = numA.intValue();
            Lazy lazy5 = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA5 = AbstractC2938ad.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA5.put("errorCode", iIntValue2);
            gestureDetectorOnGestureListenerC3005ecA.a("showWebView", jSONObjectA5);
        }
        C3117lc c3117lc = (C3117lc) gestureDetectorOnGestureListenerC3005ecA2;
        if (c3117lc.isAttachedToWindow()) {
            ViewParent parent = gestureDetectorOnGestureListenerC3005ecA2.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                Lazy lazy6 = AbstractC3181pc.f23897a;
                JSONObject jSONObjectA6 = AbstractC2938ad.a(targetId, "targetViewId", "id", targetId);
                jSONObjectA6.put("errorCode", 307);
                gestureDetectorOnGestureListenerC3005ecA.a("showWebView", jSONObjectA6);
                return;
            }
            if (viewGroup.indexOfChild(gestureDetectorOnGestureListenerC3005ecA2) != -1) {
                viewGroup.bringChildToFront(gestureDetectorOnGestureListenerC3005ecA2);
                InterfaceC3333z5 interfaceC3333z6 = this.f23465b;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).a(com.smartdigimkt.b0.a.f33822P, Ob.a(gestureDetectorOnGestureListenerC3005ecA2, com.smartdigimkt.b0.a.f33822P, "TAG", "Sibling view brought to front: "));
                }
            } else {
                InterfaceC3333z5 interfaceC3333z7 = this.f23465b;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).b(com.smartdigimkt.b0.a.f33822P, Ob.a(gestureDetectorOnGestureListenerC3005ecA2, com.smartdigimkt.b0.a.f33822P, "TAG", "Sibling view not found in parent: "));
                }
            }
            gestureDetectorOnGestureListenerC3005ecA.a(gestureDetectorOnGestureListenerC3005ecA, targetId);
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.f23465b;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).a(com.smartdigimkt.b0.a.f33822P, "setUpLayoutForAd " + this);
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA4 = a();
        Context containerContext = gestureDetectorOnGestureListenerC3005ecA4 != null ? gestureDetectorOnGestureListenerC3005ecA4.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3333z5 interfaceC3333z9 = this.f23465b;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).b(com.smartdigimkt.b0.a.f33822P, "Context is null, cannot initialize webview.");
            }
        } else {
            context = containerContext;
        }
        if (context != null) {
            if (context instanceof InMobiAdActivity) {
                c3117lc.setFullScreenActivityContext((Activity) context);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                InterfaceC3333z5 interfaceC3333z10 = this.f23465b;
                if (interfaceC3333z10 != null) {
                    StringBuilder sbA = H6.a(com.smartdigimkt.b0.a.f33822P, "TAG", "target View's Viewable ad - ");
                    sbA.append(c3117lc.getViewableAd());
                    ((A5) interfaceC3333z10).a(com.smartdigimkt.b0.a.f33822P, sbA.toString());
                }
                View viewD = c3117lc.getViewableAd().d();
                ((ViewGroup) ((InMobiAdActivity) context).findViewById(65534)).addView(viewD, layoutParams);
                InterfaceC3333z5 interfaceC3333z11 = this.f23465b;
                if (interfaceC3333z11 != null) {
                    ((A5) interfaceC3333z11).a(com.smartdigimkt.b0.a.f33822P, "Target View added - the inflatedView is - " + viewD);
                }
            } else {
                InterfaceC3333z5 interfaceC3333z12 = this.f23465b;
                if (interfaceC3333z12 != null) {
                    ((A5) interfaceC3333z12).b(com.smartdigimkt.b0.a.f33822P, "Context is not an instance of InMobiAdActivity.");
                }
                a(gestureDetectorOnGestureListenerC3005ecA, c3117lc.getRoute().f22751b, "loadWebView");
            }
        }
        InterfaceC3333z5 interfaceC3333z13 = this.f23465b;
        if (interfaceC3333z13 != null) {
            ((A5) interfaceC3333z13).a(com.smartdigimkt.b0.a.f33822P, "Add renderViewSibling as friendlyView for omsdkTracking  " + this);
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA5 = a();
        if (gestureDetectorOnGestureListenerC3005ecA5 != null && (viewableAd = gestureDetectorOnGestureListenerC3005ecA5.getViewableAd()) != null) {
            viewableAd.a(gestureDetectorOnGestureListenerC3005ecA2, FriendlyObstructionPurpose.OTHER);
        }
        Xe viewableAd2 = gestureDetectorOnGestureListenerC3005ecA2.getViewableAd();
        Map friendlyViews = gestureDetectorOnGestureListenerC3005ecA2.getFriendlyViews();
        if (friendlyViews == null) {
            friendlyViews = new HashMap();
        }
        viewableAd2.a(friendlyViews);
    }

    public final GestureDetectorOnGestureListenerC3005ec a(String id) {
        tf tfVar = this.f23464a;
        tfVar.getClass();
        Intrinsics.f(id, "id");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) tfVar.f24017b.get(id);
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            return gestureDetectorOnGestureListenerC3005ec;
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23465b;
        if (interfaceC3333z5 == null) {
            return null;
        }
        ((A5) interfaceC3333z5).b(com.smartdigimkt.b0.a.f33822P, android.support.v4.media.a.n("View with ID: ", id, " not found."));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public final void a(String sourceId, String targetId, String html) throws JSONException {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA;
        Context context;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        String str;
        long j;
        Q qA;
        C3117lc c3117lc;
        Q q;
        C3053hc c3053hc;
        Intrinsics.f(sourceId, "sourceId");
        Intrinsics.f(targetId, "targetId");
        Intrinsics.f(html, "html");
        InterfaceC3333z5 interfaceC3333z5 = this.f23465b;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a(com.smartdigimkt.b0.a.f33822P, "loadWebView " + this);
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA2 = a();
        Context containerContext = gestureDetectorOnGestureListenerC3005ecA2 != null ? gestureDetectorOnGestureListenerC3005ecA2.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23465b;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b(com.smartdigimkt.b0.a.f33822P, "Context is null, cannot initialize webview.");
            }
            containerContext = null;
        }
        if (containerContext == null || (gestureDetectorOnGestureListenerC3005ecA = a(sourceId)) == null) {
            return;
        }
        String str2 = "loadWebView";
        if (targetId.equals("default")) {
            a(gestureDetectorOnGestureListenerC3005ecA, targetId, "loadWebView");
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA3 = a();
        if (gestureDetectorOnGestureListenerC3005ecA3 == null) {
            gestureDetectorOnGestureListenerC3005ecA.a("loadWebView", AbstractC3181pc.a(targetId, 304));
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA4 = a(targetId);
        String str3 = "errorCode";
        String str4 = "id";
        if (gestureDetectorOnGestureListenerC3005ecA4 != null) {
            int i2 = gestureDetectorOnGestureListenerC3005ecA4.getWvStateMachine().f22726b;
            Lazy lazy = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA = AbstractC2938ad.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", i2);
            gestureDetectorOnGestureListenerC3005ecA.a("loadWebView", jSONObjectA);
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Q adMetaData = gestureDetectorOnGestureListenerC3005ecA3.getAdMetaData();
        if (adMetaData == null) {
            context = containerContext;
            gestureDetectorOnGestureListenerC3005ec = gestureDetectorOnGestureListenerC3005ecA;
            str2 = "loadWebView";
            str3 = "errorCode";
            str4 = "id";
            str = "targetViewId";
            j = jElapsedRealtime;
            qA = null;
        } else {
            C3053hc c3053hc2 = gestureDetectorOnGestureListenerC3005ecA3.getAdMetaData().t;
            if (c3053hc2 != null) {
                Z placement = c3053hc2.f23664a;
                String markupType = c3053hc2.f23665b;
                String telemetryMetadataBlob = c3053hc2.f23666c;
                int i3 = c3053hc2.d;
                String creativeType = c3053hc2.f23667e;
                String creativeId = c3053hc2.f;
                boolean z2 = c3053hc2.g;
                int i4 = c3053hc2.f23668h;
                T0 t0 = c3053hc2.f23669i;
                C3133mc c3133mc = c3053hc2.j;
                Intrinsics.f(placement, "placement");
                Intrinsics.f(markupType, "markupType");
                Intrinsics.f(telemetryMetadataBlob, "telemetryMetadataBlob");
                Intrinsics.f(creativeType, "creativeType");
                Intrinsics.f(creativeId, "creativeId");
                gestureDetectorOnGestureListenerC3005ec = gestureDetectorOnGestureListenerC3005ecA;
                q = adMetaData;
                str = "targetViewId";
                j = jElapsedRealtime;
                context = containerContext;
                c3053hc = new C3053hc(placement, markupType, telemetryMetadataBlob, i3, creativeType, creativeId, z2, i4, t0, c3133mc, targetId);
            } else {
                context = containerContext;
                gestureDetectorOnGestureListenerC3005ec = gestureDetectorOnGestureListenerC3005ecA;
                q = adMetaData;
                str = "targetViewId";
                j = jElapsedRealtime;
                c3053hc = null;
            }
            qA = Q.a(q, c3053hc, 3665663);
        }
        if (qA == null) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23465b;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b(com.smartdigimkt.b0.a.f33822P, "AdMetaData is null, cannot initialize webview.");
            }
        } else {
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA5 = this.f23464a.a(new Cc(gestureDetectorOnGestureListenerC3005ec.getRoute().f22751b, targetId), context, (short) 1, qA);
            C3117lc c3117lc2 = gestureDetectorOnGestureListenerC3005ecA5 instanceof C3117lc ? (C3117lc) gestureDetectorOnGestureListenerC3005ecA5 : null;
            if (c3117lc2 == null) {
                InterfaceC3333z5 interfaceC3333z8 = this.f23465b;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).b(com.smartdigimkt.b0.a.f33822P, "Failed to create Sibling WebView with ID: ".concat(targetId));
                }
                Lazy lazy2 = AbstractC3181pc.f23897a;
                JSONObject jSONObjectA2 = AbstractC2938ad.a(targetId, str, str4, targetId);
                jSONObjectA2.put(str3, 313);
                gestureDetectorOnGestureListenerC3005ec.a(str2, jSONObjectA2);
            } else {
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = gestureDetectorOnGestureListenerC3005ec;
                String str5 = str2;
                String str6 = str3;
                String str7 = str4;
                String str8 = str;
                Integer numA = c3117lc2.getWvStateMachine().a(1);
                if (numA != null) {
                    int iIntValue = numA.intValue();
                    Lazy lazy3 = AbstractC3181pc.f23897a;
                    JSONObject jSONObjectA3 = AbstractC2938ad.a(targetId, str8, str7, targetId);
                    jSONObjectA3.put(str6, iIntValue);
                    gestureDetectorOnGestureListenerC3005ec2.a(str5, jSONObjectA3);
                }
                LinkedHashMap linkedHashMap = O2.f23027a;
                c3117lc2.a((AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null));
                C3149nc renderViewTelemetry = c3117lc2.getRenderViewTelemetry();
                if (renderViewTelemetry != null) {
                    renderViewTelemetry.f23835b = j;
                }
                c3117lc = c3117lc2;
            }
            if (c3117lc != null) {
                c3117lc.d(html);
            }
        }
        c3117lc = null;
        if (c3117lc != null) {
            c3117lc.d(html);
        }
    }

    public final void a(String sourceId, String targetId) throws JSONException {
        Intrinsics.f(sourceId, "sourceId");
        Intrinsics.f(targetId, "targetId");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a(sourceId);
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC3005ecA2 == null) {
            Lazy lazy = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA = AbstractC2938ad.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", 304);
            gestureDetectorOnGestureListenerC3005ecA.a("destroyWebView", jSONObjectA);
            return;
        }
        if (targetId.equals("default")) {
            a(gestureDetectorOnGestureListenerC3005ecA, targetId, "destroyWebView");
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC3005ecA2.getWvStateMachine().a(8);
        if (numA != null) {
            int iIntValue = numA.intValue();
            Lazy lazy2 = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA2 = AbstractC2938ad.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put("errorCode", iIntValue);
            gestureDetectorOnGestureListenerC3005ecA.a("destroyWebView", jSONObjectA2);
            return;
        }
        gestureDetectorOnGestureListenerC3005ecA2.b();
        InterfaceC3333z5 interfaceC3333z5 = gestureDetectorOnGestureListenerC3005ecA.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(gestureDetectorOnGestureListenerC3005ecA, str, "TAG", "fireDestroyWebViewSuccess "));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        gestureDetectorOnGestureListenerC3005ecA.c("window.imraidview.broadcastEvent('destroyWebView'," + jSONObject + ");");
        InterfaceC3333z5 interfaceC3333z6 = this.f23465b;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a(com.smartdigimkt.b0.a.f33822P, android.support.v4.media.a.n("WebView with ID: ", targetId, " removed from parent."));
        }
    }

    public final void b(String sourceId, String targetId, String message) throws JSONException {
        Intrinsics.f(sourceId, "sourceId");
        Intrinsics.f(targetId, "targetId");
        Intrinsics.f(message, "message");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA = a(sourceId);
        if (gestureDetectorOnGestureListenerC3005ecA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC3005ecA2 == null) {
            Lazy lazy = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA = AbstractC2938ad.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put("errorCode", 304);
            gestureDetectorOnGestureListenerC3005ecA.a(ch.j, jSONObjectA);
            return;
        }
        int i2 = gestureDetectorOnGestureListenerC3005ecA2.getWvStateMachine().f22726b;
        if (!Intrinsics.a(gestureDetectorOnGestureListenerC3005ecA2.getRoute().f22751b, "default") && CollectionsKt.I(101, 104, 107).contains(Integer.valueOf(i2))) {
            InterfaceC3333z5 interfaceC3333z5 = this.f23465b;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b(com.smartdigimkt.b0.a.f33822P, "WebView is not in state to receive messages: ".concat(targetId));
            }
            int i3 = gestureDetectorOnGestureListenerC3005ecA2.getWvStateMachine().f22726b;
            Lazy lazy2 = AbstractC3181pc.f23897a;
            JSONObject jSONObjectA2 = AbstractC2938ad.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put("errorCode", i3);
            gestureDetectorOnGestureListenerC3005ecA.a(ch.j, jSONObjectA2);
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23465b;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a(com.smartdigimkt.b0.a.f33822P, "Sending message to WebView ID: ".concat(targetId));
        }
        gestureDetectorOnGestureListenerC3005ecA2.c(message);
    }

    public final void a(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, String str, String str2) {
        InterfaceC3333z5 interfaceC3333z5 = this.f23465b;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b(com.smartdigimkt.b0.a.f33822P, I6.a(com.smartdigimkt.b0.a.f33822P, "TAG", "Cannot perform operations on default WebView with ID: ", str));
        }
        gestureDetectorOnGestureListenerC3005ec.a(str2, AbstractC3181pc.a(str, BaseATView.g.f38290N));
    }
}
