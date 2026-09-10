package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0015\u0010\n\u001a\u00020\r8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0011\u001a\u00020\r8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0014\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0015"}, d2 = {"Lcom/appsflyer/internal/AFe1vSDK;", "", "Lcom/appsflyer/internal/AFc1oSDK;", "p0", "Lcom/appsflyer/internal/AFc1qSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1oSDK;Lcom/appsflyer/internal/AFc1qSDK;)V", "getRevenue", "Lcom/appsflyer/internal/AFc1oSDK;", "getMediationNetwork", "Lcom/appsflyer/internal/AFc1qSDK;", "component1", "", "component2", "Lpatroclinal/taiyuan;", "AFAdRevenueData", "getMonetizationNetwork", "", "()Z", "getCurrencyIso4217Code", "()Ljava/lang/String;", "component3", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFe1vSDK {
    private static AFe1ySDK component1;

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public final patroclinal.taiyuan getMonetizationNetwork;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    private final patroclinal.taiyuan getMediationNetwork;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final AFc1qSDK component1;
    private final AFc1oSDK getRevenue;

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String getMonetizationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String getCurrencyIso4217Code = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> component4 = p002kotlin.collections.adultoid.kowloon("googleplay", "playstore", "googleplaystore");

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFe1tSDK.values().length];
            try {
                iArr[AFe1tSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1tSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1tSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFAdRevenueData = iArr;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1vSDK$AFa1ySDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001e\u0010\b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1vSDK$AFa1ySDK;", "", "<init>", "()V", "", "", "component4", "Ljava/util/List;", "getMonetizationNetwork", "()Ljava/util/List;", "AFAdRevenueData", "Ljava/lang/String;", "getMediationNetwork", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFe1ySDK;", "component1", "Lcom/appsflyer/internal/AFe1ySDK;", "(Lcom/appsflyer/internal/AFe1ySDK;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static List<String> getMonetizationNetwork() {
            return AFe1vSDK.component4;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void getMonetizationNetwork(AFe1ySDK aFe1ySDK) {
            AFe1vSDK.component1 = aFe1ySDK;
        }
    }

    public AFe1vSDK(AFc1oSDK aFc1oSDK, AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.getRevenue = aFc1oSDK;
        this.component1 = aFc1qSDK;
        this.getMediationNetwork = p002kotlin.saneness.saneness(new Function0<String>() { // from class: com.appsflyer.internal.AFe1vSDK.5
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String strAFAdRevenueData = AFa1ySDK.AFAdRevenueData(AFe1vSDK.this.component1, AFe1vSDK.this.getRevenue.component3());
                if (strAFAdRevenueData != null && !StringsKt.empress(strAFAdRevenueData)) {
                    String string = StringsKt.stupefactive(strAFAdRevenueData).toString();
                    List<String> monetizationNetwork = Companion.getMonetizationNetwork();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = string.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (monetizationNetwork.contains(lowerCase)) {
                        p002kotlin.jvm.internal.gintrap gintrapVar = p002kotlin.jvm.internal.gintrap.f29390attabal;
                        String str = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        AFLogger.afWarnLog(str);
                        strAFAdRevenueData = "";
                    } else {
                        strAFAdRevenueData = "-" + string;
                    }
                }
                return StringsKt.stupefactive(strAFAdRevenueData != null ? strAFAdRevenueData : "").toString();
            }
        });
        this.getMonetizationNetwork = p002kotlin.saneness.saneness(new Function0<String>() { // from class: com.appsflyer.internal.AFe1vSDK.1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String packageName = AFe1vSDK.this.getRevenue.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return AFe1vSDK.getMediationNetwork(packageName, AFe1vSDK.AFAdRevenueData(AFe1vSDK.this));
            }
        });
    }

    public final String AFAdRevenueData() {
        int i = AFa1uSDK.AFAdRevenueData[(getMediationNetwork() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1ySDK aFe1ySDK = component1;
        String str = aFe1ySDK != null ? aFe1ySDK.getCurrencyIso4217Code : null;
        return str == null ? "" : str;
    }

    public final String getCurrencyIso4217Code() {
        int i = AFa1uSDK.AFAdRevenueData[(getMediationNetwork() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
        if (i == 1) {
            return (String) this.getMonetizationNetwork.getValue();
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFe1ySDK aFe1ySDK = component1;
        String str = aFe1ySDK != null ? aFe1ySDK.getMonetizationNetwork : null;
        return str == null ? "" : str;
    }

    public static boolean getMediationNetwork() {
        return component1 == null;
    }

    public static final /* synthetic */ String getMediationNetwork(String str, String str2) throws NoSuchAlgorithmException {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strSubstring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + ".";
    }

    public static final void getMonetizationNetwork(AFe1ySDK aFe1ySDK) {
        Companion.getMonetizationNetwork(aFe1ySDK);
    }

    public static final /* synthetic */ String AFAdRevenueData(AFe1vSDK aFe1vSDK) {
        return (String) aFe1vSDK.getMediationNetwork.getValue();
    }
}
