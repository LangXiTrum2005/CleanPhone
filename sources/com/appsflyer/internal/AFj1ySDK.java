package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.ironsource.Ie;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class AFj1ySDK extends AFi1cSDK {
    private final AFc1oSDK AFAdRevenueData;
    private final Runnable component2;
    private String equals;
    private final ExecutorService getCurrencyIso4217Code;
    private final AFj1zSDK getMonetizationNetwork;

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFj1zSDK.values().length];
            try {
                iArr[AFj1zSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1zSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1zSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1ySDK(AFc1oSDK aFc1oSDK, ExecutorService executorService, AFj1zSDK aFj1zSDK, Runnable runnable, Runnable runnable2) {
        String str;
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i = AFj1qSDK.AFa1tSDK.getCurrencyIso4217Code[aFj1zSDK.ordinal()];
        if (i == 1) {
            str = "facebook";
        } else if (i == 2) {
            str = "instagram";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "facebook_lite";
        }
        super(MBridgeConstans.DYNAMIC_VIEW_WX_APP, str, aFc1oSDK, runnable);
        this.AFAdRevenueData = aFc1oSDK;
        this.getCurrencyIso4217Code = executorService;
        this.getMonetizationNetwork = aFj1zSDK;
        this.component2 = runnable2;
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component3(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getCurrencyIso4217Code(Context context) {
        int i = AFa1vSDK.getRevenue[this.getMonetizationNetwork.ordinal()];
        if (i == 1) {
            return getMediationNetwork(context);
        }
        if (i == 2) {
            return AFAdRevenueData(context);
        }
        if (i == 3) {
            return component3(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d A[PHI: r0
  0x008d: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:14:0x003c, B:23:0x0063, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean getRevenue(Context context) {
        String str;
        if (!getRevenue()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code("com.facebook.sdk.ApplicationId");
        String strHardpan = currencyIso4217Code != null ? StringsKt.hardpan(currencyIso4217Code, "fb") : null;
        if (strHardpan == null || strHardpan.length() == 0) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            strHardpan = null;
        }
        if (strHardpan == null) {
            String revenue = this.AFAdRevenueData.getRevenue("facebook_application_id");
            strHardpan = revenue != null ? StringsKt.hardpan(revenue, "fb") : null;
            if (strHardpan == null || strHardpan.length() == 0) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                strHardpan = null;
            }
            if (strHardpan == null) {
                String currencyIso4217Code2 = this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.FacebookApplicationId");
                strHardpan = currencyIso4217Code2 != null ? StringsKt.hardpan(currencyIso4217Code2, "fb") : null;
                if (strHardpan == null || strHardpan.length() == 0) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    strHardpan = null;
                }
                str = strHardpan != null ? strHardpan : null;
            }
        }
        this.equals = str;
        if (str == null) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getRevenue(context)) {
            this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.seminary
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1ySDK.getMonetizationNetwork(this.f17405kowloon, context);
                }
            });
        } else {
            this.component2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:72:0x0232 A[PHI: r20
  0x0232: PHI (r20v3 android.content.ContentProviderClient) = 
  (r20v2 android.content.ContentProviderClient)
  (r20v4 android.content.ContentProviderClient)
  (r20v4 android.content.ContentProviderClient)
 binds: [B:82:0x0279, B:71:0x0230, B:76:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0244  */
    /* JADX WARN: Code duplicated, block: B:81:0x0276  */
    public static final void getMonetizationNetwork(AFj1ySDK aFj1ySDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Cursor cursor;
        Cursor cursor2;
        Uri uri;
        String string;
        String str;
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1ySDK.component1 = System.currentTimeMillis();
        aFj1ySDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        aFj1ySDK.addObserver(new AFj1tSDK.AnonymousClass1());
        String str2 = aFj1ySDK.equals;
        Intrinsics.beachfront(str2);
        try {
            AFj1zSDK aFj1zSDK = aFj1ySDK.getMonetizationNetwork;
            int[] iArr = AFa1vSDK.getRevenue;
            int i = iArr[aFj1zSDK.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (component3(context)) {
                            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                            uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str2);
                        } else {
                            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                            uri = null;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (AFAdRevenueData(context)) {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                    uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str2);
                } else {
                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                    uri = null;
                }
            } else if (getMediationNetwork(context)) {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str2);
            } else {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                uri = null;
            }
            if (uri != null) {
                contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null) : null;
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("install_referrer");
                                if (columnIndex != -1) {
                                    string = cursorQuery.getString(columnIndex);
                                } else {
                                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1ySDK.getMonetizationNetwork + " provider", false, 4, null);
                                    string = null;
                                }
                                if (string != null) {
                                    AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1ySDK.getMonetizationNetwork + " attribution data.", false, 4, null);
                                    Map<String, Object> map = aFj1ySDK.getMediationNetwork;
                                    Intrinsics.checkNotNullExpressionValue(map, "");
                                    map.put(Ie.n, "OK");
                                    Map<String, Object> map2 = aFj1ySDK.getMediationNetwork;
                                    Intrinsics.checkNotNullExpressionValue(map2, "");
                                    map2.put("referrer", string);
                                    int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                    Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                    if (lValueOf != null) {
                                        aFj1ySDK.getMediationNetwork.put("click_ts", Long.valueOf(lValueOf.longValue()));
                                    }
                                    int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                                    Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                    if (numValueOf != null) {
                                        aFj1ySDK.getMediationNetwork.put("meta_custom", p002kotlin.collections.seminary.kowloon(patroclinal.formularize.attabal("is_ct", Integer.valueOf(numValueOf.intValue()))));
                                    }
                                    int i2 = iArr[aFj1ySDK.getMonetizationNetwork.ordinal()];
                                    if (i2 == 1) {
                                        str = FbValidationUtils.FB_PACKAGE;
                                    } else if (i2 == 2) {
                                        str = "com.instagram.android";
                                    } else {
                                        if (i2 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        str = "com.facebook.lite";
                                    }
                                    Map<String, Object> map3 = aFj1ySDK.getMediationNetwork;
                                    Intrinsics.checkNotNullExpressionValue(map3, "");
                                    map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str)));
                                    Map<String, Object> map4 = aFj1ySDK.getMediationNetwork;
                                    Intrinsics.checkNotNullExpressionValue(map4, "");
                                    map4.put("api_ver_name", AFj1kSDK.getRevenue(context, str));
                                }
                                cursorQuery.close();
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } else {
                                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            try {
                                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1ySDK.getMonetizationNetwork.name() + " provider", th, false, false, false, false, 120, null);
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                            } catch (Throwable th3) {
                                Cursor cursor3 = cursor;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                    contentProviderClientAcquireUnstableContentProviderClient.close();
                                }
                                throw th3;
                            }
                        }
                    } else {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor = null;
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Error while collecting Meta Install Referrer for " + aFj1ySDK.getMonetizationNetwork.name() + " provider", th, false, false, false, false, 120, null);
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    aFj1ySDK.getMediationNetwork();
                    aFj1ySDK.component2.run();
                }
            }
        } catch (Throwable th5) {
            th = th5;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        }
        aFj1ySDK.getMediationNetwork();
        aFj1ySDK.component2.run();
    }
}
