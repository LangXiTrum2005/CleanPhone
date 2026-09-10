package com.bytedance.sdk.openadsdk.core.fs;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
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

/* JADX INFO: loaded from: classes3.dex */
public class jpc {
    public static wd qdl(View view, Set<to> set) {
        AdSession adSessionQdl = qdl(CreativeType.VIDEO, set, Owner.NATIVE);
        return new tvp(adSessionQdl, AdEvents.createAdEvents(adSessionQdl), view, MediaEvents.createMediaEvents(adSessionQdl));
    }

    public static wd qdl(WebView webView) {
        Partner partnerQdl = mzz.qdl();
        if (partnerQdl != null) {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(partnerQdl, webView, "", ""));
            return new wd(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession qdl(CreativeType creativeType, Set<to> set, Owner owner) {
        List<VerificationScriptResource> listQdl = qdl(set);
        listQdl.isEmpty();
        Partner partnerQdl = mzz.qdl();
        if (partnerQdl == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(partnerQdl, mzz.ud(), listQdl, "", ""));
    }

    private static List<VerificationScriptResource> qdl(Set<to> set) {
        ArrayList arrayList = new ArrayList();
        for (to toVar : set) {
            try {
                if (!TextUtils.isEmpty(toVar.qdl()) && !TextUtils.isEmpty(toVar.ud())) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(toVar.qdl(), toVar.lnr(), toVar.ud()));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(toVar.lnr()));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
