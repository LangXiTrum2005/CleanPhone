package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.google.ads.mediation.inmobi.InMobiNetworkKeys;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFj1rSDK extends AFi1cSDK {
    private final ExecutorService getMonetizationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1rSDK(ExecutorService executorService, AFc1oSDK aFc1oSDK, Runnable runnable) {
        super("preload", "samsung", aFc1oSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.getMonetizationNetwork = executorService;
    }

    private static boolean C_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    private final boolean getMediationNetwork(Context context) {
        if (!getRevenue()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0133  */
    /* JADX WARN: Code duplicated, block: B:57:0x0138  */
    public static final void getRevenue(AFj1rSDK aFj1rSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor cursorQuery;
        Date monetizationNetwork;
        Intrinsics.checkNotNullParameter(aFj1rSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1rSDK.component1 = System.currentTimeMillis();
        aFj1rSDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        aFj1rSDK.addObserver(new AFj1tSDK.AnonymousClass1());
        Cursor cursor = null;
        lValueOf = null;
        Long lValueOf = null;
        cursor = null;
        try {
            Uri uri = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, context.getPackageName(), new String[]{"appsflyer001"}, null);
                } catch (Throwable th2) {
                    th = th2;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    try {
                        AFLogger.INSTANCE.e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                        aFj1rSDK.getMediationNetwork();
                    } catch (Throwable th3) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient == null) {
                            throw th3;
                        }
                        contentProviderClient.close();
                        throw th3;
                    }
                }
            } else {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        if (C_(cursorQuery)) {
                            String strP_ = AFj1eSDK.P_(cursorQuery, "INSTALLED_TIME_TEXT");
                            if (strP_ != null && (monetizationNetwork = AFj1jSDK.getMonetizationNetwork(strP_, "yy:MM:dd:hh:mm")) != null) {
                                lValueOf = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(monetizationNetwork.getTime()));
                            }
                            if (lValueOf != null) {
                                long jLongValue = lValueOf.longValue();
                                Map<String, Object> map = aFj1rSDK.getMediationNetwork;
                                Intrinsics.checkNotNullExpressionValue(map, "");
                                map.put("install_begin_ts", Long.valueOf(jLongValue));
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String strP_2 = AFj1eSDK.P_(cursorQuery, "MAPS_ID");
                            if (strP_2 != null) {
                                linkedHashMap.put("maps_id", strP_2);
                            }
                            String strP_3 = AFj1eSDK.P_(cursorQuery, "DEVICE_NAME");
                            if (strP_3 != null) {
                                linkedHashMap.put("device_model", strP_3);
                            }
                            String strP_4 = AFj1eSDK.P_(cursorQuery, InMobiNetworkKeys.COUNTRY);
                            if (strP_4 != null) {
                                linkedHashMap.put("country", strP_4);
                            }
                            String strP_5 = AFj1eSDK.P_(cursorQuery, "CAMPAIGN_ID");
                            if (strP_5 != null) {
                                linkedHashMap.put("campaign_id", strP_5);
                            }
                            if (!linkedHashMap.isEmpty()) {
                                Map<String, Object> map2 = aFj1rSDK.getMediationNetwork;
                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                map2.put("samsung_custom", linkedHashMap);
                            }
                            Map<String, Object> map3 = aFj1rSDK.getMediationNetwork;
                            Intrinsics.checkNotNullExpressionValue(map3, "");
                            map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, "com.samsung.android.mapsagent")));
                            Map<String, Object> map4 = aFj1rSDK.getMediationNetwork;
                            Intrinsics.checkNotNullExpressionValue(map4, "");
                            map4.put("api_ver_name", AFj1kSDK.getRevenue(context, "com.samsung.android.mapsagent"));
                        } else {
                            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "App was not installed via Samsung MAPS.", false, 4, null);
                        }
                        cursorQuery.close();
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    } else {
                        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor = cursorQuery;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    AFLogger.INSTANCE.e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                }
            } else {
                AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
            }
        } catch (Throwable th5) {
            th = th5;
            contentProviderClient = null;
        }
        aFj1rSDK.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getMediationNetwork(context)) {
            this.getMonetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.cuirassed
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1rSDK.getRevenue(this.f17370kowloon, context);
                }
            });
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void AFAdRevenueData() {
    }
}
