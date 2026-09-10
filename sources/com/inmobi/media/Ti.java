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
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.C3474d8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes3.dex */
public final class Ti {
    public final ko a;
    public final InterfaceC3072m9 b;

    public Ti(ko wvFactory, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(wvFactory, "wvFactory");
        this.a = wvFactory;
        this.b = interfaceC3072m9;
    }

    public final GestureDetectorOnGestureListenerC2829ci a() {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a(BuildConfig.FLAVOR);
        if (gestureDetectorOnGestureListenerC2829ciA != null) {
            return gestureDetectorOnGestureListenerC2829ciA;
        }
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3097n9) interfaceC3072m9).b("Ti", "AdRenderView is null, cannot initialize webview.");
        }
        return null;
    }

    public final void b(String sourceId, String targetId) throws JSONException {
        Object next;
        Integer numA;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3097n9) interfaceC3072m9).a("Ti", "showWebView " + this);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a(sourceId);
        if (gestureDetectorOnGestureListenerC2829ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC2829ciA2 == null) {
            taiyuan taiyuanVar = AbstractC3255ti.a;
            JSONObject jSONObjectA = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk$SDKError.Reason.AD_EXPIRED_VALUE);
            gestureDetectorOnGestureListenerC2829ciA.a("showWebView", jSONObjectA);
            return;
        }
        if (Intrinsics.wireman(targetId, BuildConfig.FLAVOR)) {
            a(gestureDetectorOnGestureListenerC2829ciA, targetId, "showWebView");
            return;
        }
        if (!(gestureDetectorOnGestureListenerC2829ciA2 instanceof C3031ki)) {
            taiyuan taiyuanVar2 = AbstractC3255ti.a;
            JSONObject jSONObjectA2 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk$SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            gestureDetectorOnGestureListenerC2829ciA.a("showWebView", jSONObjectA2);
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA3 = a();
        if (gestureDetectorOnGestureListenerC2829ciA3 != null && !gestureDetectorOnGestureListenerC2829ciA3.isAttachedToWindow()) {
            taiyuan taiyuanVar3 = AbstractC3255ti.a;
            JSONObject jSONObjectA3 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA3.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk$SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);
            gestureDetectorOnGestureListenerC2829ciA.a("showWebView", jSONObjectA3);
            return;
        }
        Integer numA2 = gestureDetectorOnGestureListenerC2829ciA2.getWvStateMachine().a(5);
        if (numA2 != null) {
            int iIntValue = numA2.intValue();
            taiyuan taiyuanVar4 = AbstractC3255ti.a;
            JSONObject jSONObjectA4 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA4.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue);
            gestureDetectorOnGestureListenerC2829ciA.a("showWebView", jSONObjectA4);
            return;
        }
        Iterator it = seminary.rotuma(this.a.b).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) next;
            if (gestureDetectorOnGestureListenerC2829ci.getWvStateMachine().b == 105 && !Intrinsics.wireman(gestureDetectorOnGestureListenerC2829ci, gestureDetectorOnGestureListenerC2829ciA2) && !Intrinsics.wireman(gestureDetectorOnGestureListenerC2829ci.getRoute().b, BuildConfig.FLAVOR)) {
                break;
            }
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = (GestureDetectorOnGestureListenerC2829ci) next;
        if (gestureDetectorOnGestureListenerC2829ci2 != null && (numA = gestureDetectorOnGestureListenerC2829ci2.getWvStateMachine().a(7)) != null) {
            int iIntValue2 = numA.intValue();
            taiyuan taiyuanVar5 = AbstractC3255ti.a;
            JSONObject jSONObjectA5 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA5.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue2);
            gestureDetectorOnGestureListenerC2829ciA.a("showWebView", jSONObjectA5);
        }
        C3031ki c3031ki = (C3031ki) gestureDetectorOnGestureListenerC2829ciA2;
        if (c3031ki.isAttachedToWindow()) {
            a(gestureDetectorOnGestureListenerC2829ciA2, gestureDetectorOnGestureListenerC2829ciA, targetId);
            return;
        }
        a(gestureDetectorOnGestureListenerC2829ciA, c3031ki);
        a(gestureDetectorOnGestureListenerC2829ciA2);
        Fn viewableAd = c3031ki.getViewableAd();
        Map<View, FriendlyObstructionPurpose> friendlyViews = gestureDetectorOnGestureListenerC2829ciA2.getFriendlyViews();
        if (friendlyViews == null) {
            friendlyViews = new HashMap<>();
        }
        viewableAd.a(friendlyViews);
    }

    public final GestureDetectorOnGestureListenerC2829ci a(String id) {
        ko koVar = this.a;
        koVar.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) koVar.b.get(id);
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            return gestureDetectorOnGestureListenerC2829ci;
        }
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
        ((C3097n9) interfaceC3072m9).b("Ti", "View with ID: " + id + " not found.");
        return null;
    }

    public final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, C3031ki c3031ki) {
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3097n9) interfaceC3072m9).a("Ti", "setUpLayoutForAd " + this);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        Context containerContext = gestureDetectorOnGestureListenerC2829ciA != null ? gestureDetectorOnGestureListenerC2829ciA.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.b;
            if (interfaceC3072m10 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3097n9) interfaceC3072m10).b("Ti", "Context is null, cannot initialize webview.");
            }
            containerContext = null;
        }
        if (containerContext == null) {
            return;
        }
        if (!(containerContext instanceof InMobiAdActivity)) {
            InterfaceC3072m9 interfaceC3072m11 = this.b;
            if (interfaceC3072m11 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3097n9) interfaceC3072m11).b("Ti", "Context is not an instance of InMobiAdActivity.");
            }
            a(gestureDetectorOnGestureListenerC2829ci, c3031ki.getRoute().b, "loadWebView");
            return;
        }
        c3031ki.setFullScreenActivityContext((Activity) containerContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        InterfaceC3072m9 interfaceC3072m12 = this.b;
        if (interfaceC3072m12 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3097n9) interfaceC3072m12).a("Ti", "target View's Viewable ad - " + c3031ki.getViewableAd());
        }
        View viewC = c3031ki.getViewableAd().c();
        ViewGroup viewGroup = (ViewGroup) ((InMobiAdActivity) containerContext).findViewById(65534);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if ((viewC != null ? viewC.getParent() : null) != null) {
            ViewParent parent = viewC.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewC);
            }
        }
        relativeLayout.addView(viewC, layoutParams2);
        viewGroup.addView(relativeLayout, layoutParams);
        c3031ki.a(relativeLayout);
        InterfaceC3072m9 interfaceC3072m13 = this.b;
        if (interfaceC3072m13 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3097n9) interfaceC3072m13).a("Ti", "Target View added - the inflatedView is - " + viewC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.inmobi.media.Fn] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.inmobi.media.ci] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        ?? viewableAd;
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3097n9) interfaceC3072m9).a("Ti", "Add renderViewSibling as friendlyView for omsdkTracking  " + this);
        }
        ViewParent parent = gestureDetectorOnGestureListenerC2829ci.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            gestureDetectorOnGestureListenerC2829ci = viewGroup;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a();
        if (gestureDetectorOnGestureListenerC2829ciA == null || (viewableAd = gestureDetectorOnGestureListenerC2829ciA.getViewableAd()) == 0) {
            return;
        }
        viewableAd.a(gestureDetectorOnGestureListenerC2829ci, FriendlyObstructionPurpose.OTHER);
    }

    public final void a(String sourceId, String targetId, String html) throws JSONException {
        Context context;
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(html, "html");
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3097n9) interfaceC3072m9).a("Ti", "loadWebView " + this);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA2 = a();
        Context containerContext = gestureDetectorOnGestureListenerC2829ciA2 != null ? gestureDetectorOnGestureListenerC2829ciA2.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3072m9 interfaceC3072m10 = this.b;
            if (interfaceC3072m10 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3097n9) interfaceC3072m10).b("Ti", "Context is null, cannot initialize webview.");
            }
            context = null;
        } else {
            context = containerContext;
        }
        if (context == null || (gestureDetectorOnGestureListenerC2829ciA = a(sourceId)) == null) {
            return;
        }
        if (Intrinsics.wireman(targetId, BuildConfig.FLAVOR)) {
            a(gestureDetectorOnGestureListenerC2829ciA, targetId, "loadWebView");
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA3 = a();
        if (gestureDetectorOnGestureListenerC2829ciA3 == null) {
            gestureDetectorOnGestureListenerC2829ciA.a("loadWebView", AbstractC3255ti.a(targetId, Sdk$SDKError.Reason.AD_EXPIRED_VALUE));
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA4 = a(targetId);
        if (gestureDetectorOnGestureListenerC2829ciA4 != null) {
            int i = gestureDetectorOnGestureListenerC2829ciA4.getWvStateMachine().b;
            taiyuan taiyuanVar = AbstractC3255ti.a;
            JSONObject jSONObjectA = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
            gestureDetectorOnGestureListenerC2829ciA.a("loadWebView", jSONObjectA);
            return;
        }
        C3031ki c3031kiA = a(gestureDetectorOnGestureListenerC2829ciA3, targetId, this, gestureDetectorOnGestureListenerC2829ciA, context, SystemClock.elapsedRealtime());
        if (c3031kiA != null) {
            c3031kiA.h(html);
        }
    }

    public final void b(String sourceId, String targetId, String message) throws JSONException {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(message, "message");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a(sourceId);
        if (gestureDetectorOnGestureListenerC2829ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC2829ciA2 == null) {
            taiyuan taiyuanVar = AbstractC3255ti.a;
            JSONObject jSONObjectA = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk$SDKError.Reason.AD_EXPIRED_VALUE);
            gestureDetectorOnGestureListenerC2829ciA.a(C3474d8.j, jSONObjectA);
            return;
        }
        int i = gestureDetectorOnGestureListenerC2829ciA2.getWvStateMachine().b;
        if (!Intrinsics.wireman(gestureDetectorOnGestureListenerC2829ciA2.getRoute().b, BuildConfig.FLAVOR) && adultoid.kowloon(101, 104, 107).contains(Integer.valueOf(i))) {
            InterfaceC3072m9 interfaceC3072m9 = this.b;
            if (interfaceC3072m9 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3097n9) interfaceC3072m9).b("Ti", "WebView is not in state to receive messages: " + targetId);
            }
            int i2 = gestureDetectorOnGestureListenerC2829ciA2.getWvStateMachine().b;
            taiyuan taiyuanVar2 = AbstractC3255ti.a;
            JSONObject jSONObjectA2 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, i2);
            gestureDetectorOnGestureListenerC2829ciA.a(C3474d8.j, jSONObjectA2);
            return;
        }
        InterfaceC3072m9 interfaceC3072m10 = this.b;
        if (interfaceC3072m10 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3097n9) interfaceC3072m10).a("Ti", "Sending message to WebView ID: " + targetId);
        }
        gestureDetectorOnGestureListenerC2829ciA2.g(message);
    }

    public static final C3031ki a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, String str, Ti ti, GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2, Context context, long j) {
        String str2;
        C3113o0 c3113o0A;
        C3113o0 c3113o0;
        C2932gi c2932gi;
        C3113o0 adMetaData = gestureDetectorOnGestureListenerC2829ci.getAdMetaData();
        if (adMetaData != null) {
            C2932gi c2932gi2 = gestureDetectorOnGestureListenerC2829ci.getAdMetaData().s;
            if (c2932gi2 != null) {
                C3287v0 placement = c2932gi2.a;
                String markupType = c2932gi2.b;
                String impressionId = c2932gi2.c;
                String telemetryMetadataBlob = c2932gi2.d;
                int i = c2932gi2.e;
                String creativeType = c2932gi2.f;
                String creativeId = c2932gi2.g;
                boolean z = c2932gi2.h;
                int i2 = c2932gi2.i;
                C3164q1 c3164q1 = c2932gi2.j;
                C3056li c3056li = c2932gi2.k;
                InlineParams inlineParams = c2932gi2.m;
                Intrinsics.checkNotNullParameter(placement, "placement");
                Intrinsics.checkNotNullParameter(markupType, "markupType");
                Intrinsics.checkNotNullParameter(impressionId, "impressionId");
                Intrinsics.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
                Intrinsics.checkNotNullParameter(creativeType, "creativeType");
                Intrinsics.checkNotNullParameter(creativeId, "creativeId");
                c3113o0 = adMetaData;
                str2 = str;
                c2932gi = new C2932gi(placement, markupType, impressionId, telemetryMetadataBlob, i, creativeType, creativeId, z, i2, c3164q1, c3056li, str2, inlineParams);
            } else {
                str2 = str;
                c3113o0 = adMetaData;
                c2932gi = null;
            }
            c3113o0A = C3113o0.a(c3113o0, c2932gi, 3665663);
        } else {
            str2 = str;
            c3113o0A = null;
        }
        if (c3113o0A == null) {
            InterfaceC3072m9 interfaceC3072m9 = ti.b;
            if (interfaceC3072m9 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3097n9) interfaceC3072m9).b("Ti", "AdMetaData is null, cannot initialize webview.");
            }
            return null;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = ti.a.a(new Di(gestureDetectorOnGestureListenerC2829ci2.getRoute().b, str2), context, (short) 1, c3113o0A, gestureDetectorOnGestureListenerC2829ci.getAdConfig());
        C3031ki c3031ki = gestureDetectorOnGestureListenerC2829ciA instanceof C3031ki ? (C3031ki) gestureDetectorOnGestureListenerC2829ciA : null;
        if (c3031ki == null) {
            InterfaceC3072m9 interfaceC3072m10 = ti.b;
            if (interfaceC3072m10 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3097n9) interfaceC3072m10).b("Ti", "Failed to create Sibling WebView with ID: " + str2);
            }
            gestureDetectorOnGestureListenerC2829ci2.a("loadWebView", AbstractC3255ti.a(str2, Sdk$SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE));
            return null;
        }
        Integer numA = c3031ki.getWvStateMachine().a(1);
        if (numA != null) {
            gestureDetectorOnGestureListenerC2829ci2.a("loadWebView", AbstractC3255ti.a(str2, numA.intValue()));
        }
        c3031ki.Z();
        C3081mi renderViewTelemetry = c3031ki.getRenderViewTelemetry();
        if (renderViewTelemetry != null) {
            renderViewTelemetry.b = j;
        }
        return c3031ki;
    }

    public final void a(String sourceId, String targetId) throws JSONException {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA = a(sourceId);
        if (gestureDetectorOnGestureListenerC2829ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciA2 = a(targetId);
        if (gestureDetectorOnGestureListenerC2829ciA2 == null) {
            taiyuan taiyuanVar = AbstractC3255ti.a;
            JSONObject jSONObjectA = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk$SDKError.Reason.AD_EXPIRED_VALUE);
            gestureDetectorOnGestureListenerC2829ciA.a("destroyWebView", jSONObjectA);
            return;
        }
        if (Intrinsics.wireman(targetId, BuildConfig.FLAVOR)) {
            a(gestureDetectorOnGestureListenerC2829ciA, targetId, "destroyWebView");
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC2829ciA2.getWvStateMachine().a(8);
        if (numA != null) {
            int iIntValue = numA.intValue();
            taiyuan taiyuanVar2 = AbstractC3255ti.a;
            JSONObject jSONObjectA2 = Si.a(targetId, "targetViewId", "id", targetId);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue);
            gestureDetectorOnGestureListenerC2829ciA.a("destroyWebView", jSONObjectA2);
            return;
        }
        gestureDetectorOnGestureListenerC2829ciA2.b();
        gestureDetectorOnGestureListenerC2829ciA.a(gestureDetectorOnGestureListenerC2829ciA, targetId);
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3097n9) interfaceC3072m9).a("Ti", "WebView with ID: " + targetId + " removed from parent.");
        }
    }

    public final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, String str, String str2) {
        InterfaceC3072m9 interfaceC3072m9 = this.b;
        if (interfaceC3072m9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
            ((C3097n9) interfaceC3072m9).b("Ti", "Cannot perform operations on default WebView with ID: " + str);
        }
        gestureDetectorOnGestureListenerC2829ci.a(str2, AbstractC3255ti.a(str, 303));
    }

    public final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2, String str) throws JSONException {
        ViewParent parent = gestureDetectorOnGestureListenerC2829ci.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = gestureDetectorOnGestureListenerC2829ci;
        }
        ViewParent parent2 = viewGroup.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 == null) {
            gestureDetectorOnGestureListenerC2829ci2.a("showWebView", AbstractC3255ti.a(str, 307));
            return;
        }
        if (viewGroup2.indexOfChild(viewGroup) != -1) {
            viewGroup2.bringChildToFront(viewGroup);
            InterfaceC3072m9 interfaceC3072m9 = this.b;
            if (interfaceC3072m9 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3097n9) interfaceC3072m9).a("Ti", "Sibling view brought to front: " + gestureDetectorOnGestureListenerC2829ci);
            }
        } else {
            InterfaceC3072m9 interfaceC3072m10 = this.b;
            if (interfaceC3072m10 != null) {
                Intrinsics.checkNotNullExpressionValue("Ti", "TAG");
                ((C3097n9) interfaceC3072m10).b("Ti", "Sibling view not found in parent: " + gestureDetectorOnGestureListenerC2829ci);
            }
        }
        gestureDetectorOnGestureListenerC2829ci2.c(gestureDetectorOnGestureListenerC2829ci2, str);
    }
}
