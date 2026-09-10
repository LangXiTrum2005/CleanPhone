package com.inmobi.media.ads.network.common.model;

import java.util.HashMap;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR-\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0014j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/OmSdkInfo;", "", "<init>", "()V", "impressionType", "", "getImpressionType$annotations", "getImpressionType", "()B", "omidEnabled", "", "getOmidEnabled", "()Z", "customReferenceData", "", "getCustomReferenceData", "()Ljava/lang/String;", "isolateVerificationScripts", "getIsolateVerificationScripts", "macros", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getMacros", "()Ljava/util/HashMap;", "adVerifications", "", "Lcom/inmobi/media/ads/network/common/model/AdVerification;", "getAdVerifications", "()Ljava/util/List;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OmSdkInfo {
    private final byte impressionType;
    private final boolean isolateVerificationScripts;
    private final boolean omidEnabled;
    private final String customReferenceData = "";
    private final HashMap<String, String> macros = new HashMap<>();
    private final List<AdVerification> adVerifications = adultoid.formularize();

    public final List<AdVerification> getAdVerifications() {
        return this.adVerifications;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final byte getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    public final HashMap<String, String> getMacros() {
        return this.macros;
    }

    public final boolean getOmidEnabled() {
        return this.omidEnabled;
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }
}
