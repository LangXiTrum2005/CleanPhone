package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.Partner;
import com.inmobi.commons.core.configs.AdConfig;
import com.thinkup.core.common.n.mo;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3163oa extends AbstractC3147na {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Partner f23872b = Partner.createPartner("Inmobi", "a".concat(StringsKt.I("10.8.7", mo.ono, "")));

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x0004, B:6:0x000a, B:12:0x0018, B:11:0x0013), top: B:16:0x0004 }] */
    public final void a(AdConfig adConfig) {
        AdConfig.OmidConfig omidConfig;
        if (adConfig != null) {
            try {
                AdConfig.ViewabilityConfig viewability = adConfig.getViewability();
                if (viewability == null || (omidConfig = viewability.getOmidConfig()) == null) {
                    omidConfig = new AdConfig.OmidConfig();
                }
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
                return;
            }
        } else {
            omidConfig = new AdConfig.OmidConfig();
        }
        this.f23872b = Partner.createPartner(omidConfig.getPartnerKey(), "a".concat(StringsKt.I("10.8.7", mo.ono, "")));
        AbstractC3067ia.a(omidConfig);
    }
}
