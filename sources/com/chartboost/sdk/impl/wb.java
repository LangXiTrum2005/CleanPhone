package com.chartboost.sdk.impl;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.AdSessionConfiguration;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.CreativeType;
import com.iab.omid.library.chartboost.adsession.ImpressionType;
import com.iab.omid.library.chartboost.adsession.Owner;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wb implements pj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15470a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AdSession a(kj manager, CreativeType creativeType, Set viewabilityVendors, Owner mediaEventsOwner) {
        Intrinsics.f(manager, "manager");
        Intrinsics.f(creativeType, "creativeType");
        Intrinsics.f(viewabilityVendors, "viewabilityVendors");
        Intrinsics.f(mediaEventsOwner, "mediaEventsOwner");
        List listA = a(viewabilityVendors);
        if (listA.isEmpty()) {
            throw new IllegalArgumentException("verificationScriptResources is empty");
        }
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, mediaEventsOwner, false), AdSessionContext.createNativeAdSessionContext(manager.a(), manager.c(), listA, "", ""));
        Intrinsics.e(adSessionCreateAdSession, "createAdSession(...)");
        return adSessionCreateAdSession;
    }

    @Override // com.chartboost.sdk.impl.pj
    public rj a(kj manager, View videoView, Set viewabilityVendors) {
        Intrinsics.f(manager, "manager");
        Intrinsics.f(videoView, "videoView");
        Intrinsics.f(viewabilityVendors, "viewabilityVendors");
        AdSession adSessionA = a(manager, CreativeType.VIDEO, viewabilityVendors, Owner.NATIVE);
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSessionA);
        MediaEvents mediaEventsCreateMediaEvents = MediaEvents.createMediaEvents(adSessionA);
        Intrinsics.c(adEventsCreateAdEvents);
        Intrinsics.c(mediaEventsCreateMediaEvents);
        return new xb(manager, adSessionA, adEventsCreateAdEvents, mediaEventsCreateMediaEvents, videoView);
    }

    public final List a(Set set) {
        String strC;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sj sjVar = (sj) it.next();
            String strB = sjVar.b();
            if (strB != null && strB.length() != 0 && (strC = sjVar.c()) != null && strC.length() != 0) {
                VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(sjVar.b(), sjVar.a(), sjVar.c());
                Intrinsics.e(verificationScriptResourceCreateVerificationScriptResourceWithParameters, "createVerificationScript…sourceWithParameters(...)");
                arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithParameters);
            } else {
                VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(sjVar.a());
                Intrinsics.e(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters, "createVerificationScript…rceWithoutParameters(...)");
                arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
            }
        }
        return arrayList;
    }

    @Override // com.chartboost.sdk.impl.pj
    public oj a(kj manager, WebView webView) {
        Intrinsics.f(manager, "manager");
        Intrinsics.f(webView, "webView");
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(manager.a(), webView, "", ""));
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSessionCreateAdSession);
        Intrinsics.c(adSessionCreateAdSession);
        Intrinsics.c(adEventsCreateAdEvents);
        return new vb(manager, adSessionCreateAdSession, adEventsCreateAdEvents, webView);
    }
}
