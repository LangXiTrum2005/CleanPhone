package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Pb implements InterfaceC2995e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f23074a;

    public Pb(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        this.f23074a = gestureDetectorOnGestureListenerC3005ec;
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void a(String url, String api, R6 r6) {
        Intrinsics.f(url, "url");
        Intrinsics.f(api, "api");
        this.f23074a.getLandingPageHandler().a(url, api, r6);
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void b() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23074a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, "onCCTScreenDisplayed");
        }
        this.f23074a.getListener().e(this.f23074a);
        GestureDetectorOnGestureListenerC3005ec.a(this.f23074a, null, null, null);
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void c() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23074a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, "onCCTPageLoadedSuccessfully");
        }
        this.f23074a.p();
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void a(F6 landingPageFunnelState, R6 r6, Integer num) {
        Intrinsics.f(landingPageFunnelState, "landingPageFunnelState");
        M6 landingPageHandler = this.f23074a.getLandingPageHandler();
        landingPageHandler.getClass();
        J6.a(landingPageFunnelState, r6, num, new L6(landingPageHandler));
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23074a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, "onCCTScreenDismissed");
        }
        this.f23074a.z();
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void a(int i2, int i3, int i4, int i5, int i6) throws JSONException {
        InterfaceC3333z5 interfaceC3333z5 = this.f23074a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, "onCCTLayout");
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f23074a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "customTabLayout");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TtmlNode.LEFT, B2.a(i2));
        jSONObject2.put("top", B2.a(i3));
        jSONObject2.put(TtmlNode.RIGHT, B2.a(i4));
        jSONObject2.put("bottom", B2.a(i5));
        jSONObject2.put("state", i6);
        jSONObject.put("layout", jSONObject2);
        gestureDetectorOnGestureListenerC3005ec.getClass();
        InterfaceC3333z5 interfaceC3333z6 = gestureDetectorOnGestureListenerC3005ec.f23587i;
        if (interfaceC3333z6 != null) {
            String str2 = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z6).a(str2, Ob.a(gestureDetectorOnGestureListenerC3005ec, str2, "TAG", "onCTLifeCycleEvent "));
        }
        gestureDetectorOnGestureListenerC3005ec.c("window.imraid.broadcastEvent('onCTLifeCycleEvent', " + jSONObject + ");");
    }

    @Override // com.inmobi.media.InterfaceC2995e2
    public final void a(JSONObject jsonObject) {
        Intrinsics.f(jsonObject, "jsonObject");
        InterfaceC3333z5 interfaceC3333z5 = this.f23074a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(str, "access$getTAG$cp(...)");
            ((A5) interfaceC3333z5).a(str, "onCCTLifeCycleEvent");
        }
        this.f23074a.a(jsonObject);
    }
}
