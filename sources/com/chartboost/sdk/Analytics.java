package com.chartboost.sdk;

import com.chartboost.sdk.impl.w3;
import com.chartboost.sdk.impl.za;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u001d\u001e\u001f !B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0007JD\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007J$\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J0\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\""}, d2 = {"Lcom/chartboost/sdk/Analytics;", "", "()V", "trackInAppAmazonStorePurchaseEvent", "", "title", "", "description", "price", "currency", "productID", "userID", "purchaseToken", "trackInAppGooglePlayPurchaseEvent", "purchaseData", "purchaseSignature", "trackInAppPurchaseEvent", "iAPPurchaseInfoMap", "Ljava/util/HashMap;", "Lcom/chartboost/sdk/Analytics$IAPPurchaseInfo;", "iapType", "Lcom/chartboost/sdk/Analytics$IAPType;", "trackLevelInfo", "eventLabel", "type", "Lcom/chartboost/sdk/Analytics$LevelType;", "mainLevel", "", "subLevel", "CustomEventType", "IAPPurchaseInfo", "IAPType", "LevelType", "MiscRevenueGeneratingEventType", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Analytics {
    public static final Analytics INSTANCE = new Analytics();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/chartboost/sdk/Analytics$CustomEventType;", "", "(Ljava/lang/String;I)V", "CustomEventType1", "CustomEventType2", "CustomEventType3", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum CustomEventType {
        CustomEventType1,
        CustomEventType2,
        CustomEventType3;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<CustomEventType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/chartboost/sdk/Analytics$IAPPurchaseInfo;", "", "(Ljava/lang/String;I)V", "PRODUCT_ID", "PRODUCT_TITLE", "PRODUCT_DESCRIPTION", "PRODUCT_PRICE", "PRODUCT_CURRENCY_CODE", "GOOGLE_PURCHASE_DATA", "GOOGLE_PURCHASE_SIGNATURE", "AMAZON_PURCHASE_TOKEN", "AMAZON_USER_ID", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum IAPPurchaseInfo {
        PRODUCT_ID,
        PRODUCT_TITLE,
        PRODUCT_DESCRIPTION,
        PRODUCT_PRICE,
        PRODUCT_CURRENCY_CODE,
        GOOGLE_PURCHASE_DATA,
        GOOGLE_PURCHASE_SIGNATURE,
        AMAZON_PURCHASE_TOKEN,
        AMAZON_USER_ID;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<IAPPurchaseInfo> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/chartboost/sdk/Analytics$IAPType;", "", "(Ljava/lang/String;I)V", "GOOGLE_PLAY", "AMAZON", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum IAPType {
        GOOGLE_PLAY,
        AMAZON;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<IAPType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/chartboost/sdk/Analytics$LevelType;", "", "levelType", "", "(Ljava/lang/String;II)V", "getLevelType", "()I", "HIGHEST_LEVEL_REACHED", "CURRENT_AREA", "CHARACTER_LEVEL", "OTHER_SEQUENTIAL", "OTHER_NONSEQUENTIAL", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum LevelType {
        HIGHEST_LEVEL_REACHED(1),
        CURRENT_AREA(2),
        CHARACTER_LEVEL(3),
        OTHER_SEQUENTIAL(4),
        OTHER_NONSEQUENTIAL(5);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
        private final int levelType;

        LevelType(int i2) {
            this.levelType = i2;
        }

        public static EnumEntries<LevelType> getEntries() {
            return $ENTRIES;
        }

        public final int getLevelType() {
            return this.levelType;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/chartboost/sdk/Analytics$MiscRevenueGeneratingEventType;", "", "(Ljava/lang/String;I)V", "MiscRevenueGeneratingEventType1", "MiscRevenueGeneratingEventType2", "MiscRevenueGeneratingEventType3", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum MiscRevenueGeneratingEventType {
        MiscRevenueGeneratingEventType1,
        MiscRevenueGeneratingEventType2,
        MiscRevenueGeneratingEventType3;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<MiscRevenueGeneratingEventType> getEntries() {
            return $ENTRIES;
        }
    }

    private Analytics() {
    }

    @JvmStatic
    public static final void trackInAppAmazonStorePurchaseEvent(String title, String description, String price, String currency, String productID, String userID, String purchaseToken) {
        Intrinsics.f(title, "title");
        Intrinsics.f(description, "description");
        Intrinsics.f(price, "price");
        Intrinsics.f(currency, "currency");
        Intrinsics.f(productID, "productID");
        if (Chartboost.isSdkStarted()) {
            w3.f15454b.m().a().a(productID, title, description, price, currency, null, null, userID, purchaseToken, IAPType.AMAZON);
        } else {
            za.b("You need to call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
        }
    }

    @JvmStatic
    public static final void trackInAppGooglePlayPurchaseEvent(String title, String description, String price, String currency, String productID, String purchaseData, String purchaseSignature) {
        Intrinsics.f(title, "title");
        Intrinsics.f(description, "description");
        Intrinsics.f(price, "price");
        Intrinsics.f(currency, "currency");
        Intrinsics.f(productID, "productID");
        if (Chartboost.isSdkStarted()) {
            w3.f15454b.m().a().a(productID, title, description, price, currency, purchaseData, purchaseSignature, null, null, IAPType.GOOGLE_PLAY);
        } else {
            za.b("You need to call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
        }
    }

    @JvmStatic
    public static final void trackInAppPurchaseEvent(HashMap<IAPPurchaseInfo, String> iAPPurchaseInfoMap, IAPType iapType) {
        Intrinsics.f(iAPPurchaseInfoMap, "iAPPurchaseInfoMap");
        Intrinsics.f(iapType, "iapType");
        if (!Chartboost.isSdkStarted()) {
            za.b("You need to call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
            return;
        }
        String str = iAPPurchaseInfoMap.get(IAPPurchaseInfo.GOOGLE_PURCHASE_DATA);
        String str2 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.GOOGLE_PURCHASE_SIGNATURE);
        String str3 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.AMAZON_USER_ID);
        String str4 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.AMAZON_PURCHASE_TOKEN);
        String str5 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.PRODUCT_ID);
        String str6 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.PRODUCT_TITLE);
        String str7 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.PRODUCT_DESCRIPTION);
        String str8 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.PRODUCT_PRICE);
        String str9 = iAPPurchaseInfoMap.get(IAPPurchaseInfo.PRODUCT_CURRENCY_CODE);
        if (str5 == null || str5.length() == 0 || str6 == null || str6.length() == 0 || str7 == null || str7.length() == 0 || str8 == null || str8.length() == 0 || str9 == null || str9.length() == 0) {
            za.b("Null object is passed. Please pass a valid value object", (Throwable) null, 2, (Object) null);
        } else {
            w3.f15454b.m().a().a(str5, str6, str7, str8, str9, str, str2, str3, str4, iapType);
        }
    }

    @JvmStatic
    public static final void trackLevelInfo(String eventLabel, LevelType type, int mainLevel, String description) {
        Intrinsics.f(eventLabel, "eventLabel");
        Intrinsics.f(type, "type");
        Intrinsics.f(description, "description");
        trackLevelInfo(eventLabel, type, mainLevel, 0, description);
    }

    @JvmStatic
    public static final void trackLevelInfo(String eventLabel, LevelType type, int mainLevel, int subLevel, String description) {
        Intrinsics.f(eventLabel, "eventLabel");
        Intrinsics.f(type, "type");
        Intrinsics.f(description, "description");
        if (Chartboost.isSdkStarted()) {
            w3.f15454b.m().a().a(eventLabel, type, mainLevel, subLevel, description, System.currentTimeMillis());
        } else {
            za.b("You need to call Chartboost.startWithAppId() before tracking in-app purchases", (Throwable) null, 2, (Object) null);
        }
    }
}
