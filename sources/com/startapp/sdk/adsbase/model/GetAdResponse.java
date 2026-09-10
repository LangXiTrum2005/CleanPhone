package com.startapp.sdk.adsbase.model;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.BaseResponse;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class GetAdResponse extends BaseResponse {
    private static final long serialVersionUID = -3391992406598758815L;

    @TypeInfo(complex = true)
    private AdInformationOverrides adInfoOverrides = AdInformationOverrides.a();

    @TypeInfo(type = ArrayList.class, value = AdDetails.class)
    private List<AdDetails> adsDetails = new ArrayList();
    private boolean inAppBrowser;

    @TypeInfo(type = inAppBrowserPreLoad.class)
    private inAppBrowserPreLoad inAppBrowserPreLoad;
    private String productId;
    private String publisherId;

    public enum inAppBrowserPreLoad {
        /* JADX INFO: Fake field, exist only in values array */
        DISABLED,
        /* JADX INFO: Fake field, exist only in values array */
        CONTENT,
        /* JADX INFO: Fake field, exist only in values array */
        FULL
    }

    public final AdInformationOverrides c() {
        return this.adInfoOverrides;
    }

    public final List d() {
        return this.adsDetails;
    }
}
