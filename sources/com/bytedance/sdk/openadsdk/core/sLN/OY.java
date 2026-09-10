package com.bytedance.sdk.openadsdk.core.sLN;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.sLN;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    @NonNull
    public static ebl Lxb(@NonNull View view, @NonNull Set<nBu> set) {
        AdSession adSessionLxb = Lxb(CreativeType.VIDEO, set, Owner.NATIVE);
        return new QAg(adSessionLxb, AdEvents.createAdEvents(adSessionLxb), view, MediaEvents.createMediaEvents(adSessionLxb));
    }

    public static ebl Lxb(WebView webView) {
        Partner partnerLxb = JXs.Lxb();
        if (partnerLxb != null) {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(partnerLxb, webView, "", ""));
            return new ebl(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession Lxb(CreativeType creativeType, Set<nBu> set, Owner owner) {
        List<VerificationScriptResource> listLxb = Lxb(set);
        if (listLxb.isEmpty()) {
            sLN.LD("verificationScriptResources is empty");
        }
        Partner partnerLxb = JXs.Lxb();
        if (partnerLxb == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(partnerLxb, JXs.LD(), listLxb, "", ""));
    }

    private static List<VerificationScriptResource> Lxb(Set<nBu> set) {
        ArrayList arrayList = new ArrayList();
        for (nBu nbu : set) {
            try {
                if (!TextUtils.isEmpty(nbu.Lxb()) && !TextUtils.isEmpty(nbu.LD())) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(nbu.Lxb(), nbu.lk(), nbu.LD()));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(nbu.lk()));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
