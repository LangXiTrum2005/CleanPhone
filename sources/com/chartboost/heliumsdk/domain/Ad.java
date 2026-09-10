package com.chartboost.heliumsdk.domain;

import com.chartboost.heliumsdk.ad.HeliumAd;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002!\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Ad;", "", "ad", "Lcom/chartboost/heliumsdk/ad/HeliumAd;", "(Lcom/chartboost/heliumsdk/ad/HeliumAd;)V", "adIdentifier", "Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "getAdIdentifier", "()Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "bids", "Lcom/chartboost/heliumsdk/domain/Bids;", "getBids", "()Lcom/chartboost/heliumsdk/domain/Bids;", "setBids", "(Lcom/chartboost/heliumsdk/domain/Bids;)V", "heliumAd", "getHeliumAd", "()Lcom/chartboost/heliumsdk/ad/HeliumAd;", "setHeliumAd", "loadId", "", "getLoadId", "()Ljava/lang/String;", "setLoadId", "(Ljava/lang/String;)V", "state", "", "getState$annotations", "()V", "getState", "()I", "setState", "(I)V", "AdType", "State", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Ad {
    private final AdIdentifier adIdentifier;
    private Bids bids;
    private HeliumAd heliumAd;
    private String loadId;
    private int state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Ad$AdType;", "", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Deprecated
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface AdType {
        public static final int ADAPTIVE_BANNER = 4;
        public static final int BANNER = 2;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int INTERSTITIAL = 0;
        public static final int REWARDED = 1;
        public static final int REWARDED_INTERSTITIAL = 3;
        public static final int UNKNOWN = -1;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Ad$AdType$Companion;", "", "()V", "ADAPTIVE_BANNER", "", "BANNER", "INTERSTITIAL", "REWARDED", "REWARDED_INTERSTITIAL", "UNKNOWN", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ADAPTIVE_BANNER = 4;
            public static final int BANNER = 2;
            public static final int INTERSTITIAL = 0;
            public static final int REWARDED = 1;
            public static final int REWARDED_INTERSTITIAL = 3;
            public static final int UNKNOWN = -1;

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Ad$State;", "", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface State {
        public static final int BIDDING = 1;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int FAILED = 6;
        public static final int LOADED = 3;
        public static final int LOADING = 2;
        public static final int NEW = 0;
        public static final int SHOWING = 5;
        public static final int SHOW_REQUESTED = 4;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Ad$State$Companion;", "", "()V", "BIDDING", "", "FAILED", "LOADED", "LOADING", "NEW", "SHOWING", "SHOW_REQUESTED", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int BIDDING = 1;
            public static final int FAILED = 6;
            public static final int LOADED = 3;
            public static final int LOADING = 2;
            public static final int NEW = 0;
            public static final int SHOWING = 5;
            public static final int SHOW_REQUESTED = 4;

            private Companion() {
            }
        }
    }

    public Ad(HeliumAd ad) {
        Intrinsics.f(ad, "ad");
        this.adIdentifier = new AdIdentifier(ad.getAdType(), ad.getPlacementName());
        this.heliumAd = ad;
        this.state = 0;
    }

    public static /* synthetic */ void getState$annotations() {
    }

    public final AdIdentifier getAdIdentifier() {
        return this.adIdentifier;
    }

    public final Bids getBids() {
        return this.bids;
    }

    public final HeliumAd getHeliumAd() {
        return this.heliumAd;
    }

    public final String getLoadId() {
        return this.loadId;
    }

    public final int getState() {
        return this.state;
    }

    public final void setBids(Bids bids) {
        this.bids = bids;
    }

    public final void setHeliumAd(HeliumAd heliumAd) {
        Intrinsics.f(heliumAd, "<set-?>");
        this.heliumAd = heliumAd;
    }

    public final void setLoadId(String str) {
        this.loadId = str;
    }

    public final void setState(int i2) {
        this.state = i2;
    }
}
