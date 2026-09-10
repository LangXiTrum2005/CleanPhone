package com.startapp.sdk.adsbase.adrules;

import com.startapp.json.TypeInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class AdaptMetaData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final transient AdaptMetaData f40627a = new AdaptMetaData();

    @TypeInfo(complex = true)
    private AdRules adRules = new AdRules();
    private String adaptMetaDataUpdateVersion = "5.2.4";

    private AdaptMetaData() {
    }

    public static AdaptMetaData b() {
        return f40627a;
    }

    public final AdRules a() {
        return this.adRules;
    }
}
