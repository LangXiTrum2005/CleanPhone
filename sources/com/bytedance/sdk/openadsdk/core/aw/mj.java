package com.bytedance.sdk.openadsdk.core.aw;

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

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    public static xha ri(View view, Set<qt> set) {
        AdSession adSessionRi = ri(CreativeType.VIDEO, set, Owner.NATIVE);
        return new jbs(adSessionRi, AdEvents.createAdEvents(adSessionRi), view, MediaEvents.createMediaEvents(adSessionRi));
    }

    public static xha ri(WebView webView) {
        Partner partnerRi = fi.ri();
        if (partnerRi != null) {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(partnerRi, webView, "", ""));
            return new xha(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession ri(CreativeType creativeType, Set<qt> set, Owner owner) {
        List<VerificationScriptResource> listRi = ri(set);
        listRi.isEmpty();
        Partner partnerRi = fi.ri();
        if (partnerRi == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(partnerRi, fi.lr(), listRi, "", ""));
    }

    private static List<VerificationScriptResource> ri(Set<qt> set) {
        ArrayList arrayList = new ArrayList();
        for (qt qtVar : set) {
            try {
                if (!TextUtils.isEmpty(qtVar.ri()) && !TextUtils.isEmpty(qtVar.lr())) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(qtVar.ri(), qtVar.ik(), qtVar.lr()));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(qtVar.ik()));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
