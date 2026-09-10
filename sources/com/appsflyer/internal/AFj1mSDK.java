package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.ironsource.Ie;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFj1mSDK extends AFi1eSDK {
    private final AFd1zSDK getCurrencyIso4217Code;

    public AFj1mSDK(Runnable runnable, AFd1zSDK aFd1zSDK) {
        super(X3.i.U, "samsung", runnable);
        this.getCurrencyIso4217Code = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(Context context) {
        AFb1uSDK<Map<String, Object>> aFb1uSDK = new AFb1uSDK<Map<String, Object>>(context, this.getCurrencyIso4217Code.getMonetizationNetwork(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1mSDK.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFb1uSDK
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> getRevenue() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.getMonetizationNetwork.getContentResolver();
                        StringBuilder sb = new StringBuilder("content://");
                        sb.append(this.getMediationNetwork);
                        cursorQuery = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
                        if (cursorQuery == null) {
                            AFj1mSDK.this.getMediationNetwork.put(Ie.n, "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            AFj1mSDK.this.getMediationNetwork.put(Ie.n, "OK");
                            E_("referrer", AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            D_("click_ts", AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            D_("install_begin_ts", AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            D_("install_end_ts", AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            E_("organic_keywords", AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            E_("attr_type", AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            HashMap map = new HashMap();
                            int columnIndex = cursorQuery.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            D_("click_server_ts", map, cursorQuery);
                            D_("install_begin_server_ts", map, cursorQuery);
                            E_("install_version", map, cursorQuery);
                            if (!map.isEmpty()) {
                                AFj1mSDK.this.getMediationNetwork.put("custom", map);
                            }
                        } else {
                            AFj1mSDK.this.getMediationNetwork.put(Ie.n, "FEATURE_NOT_SUPPORTED");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e) {
                        AFj1mSDK.this.getMediationNetwork.put(Ie.n, "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e, false, true);
                        if (0 != 0) {
                        }
                    }
                    String str = ((PackageItemInfo) this.getMonetizationNetwork.getPackageManager().resolveContentProvider(this.getMediationNetwork, 128)).packageName;
                    AFj1mSDK.this.getMediationNetwork.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(this.getMonetizationNetwork, str)));
                    AFj1mSDK.this.getMediationNetwork.put("api_ver_name", AFj1kSDK.getRevenue(this.getMonetizationNetwork, str));
                    AFj1mSDK.this.getMediationNetwork();
                    return AFj1mSDK.this.getMediationNetwork;
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }

            private static void D_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }

            private static void E_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        };
        AFc1qSDK aFc1qSDKComponent4 = this.getCurrencyIso4217Code.component4();
        AFa1ySDK.getRevenue();
        if (AFa1ySDK.getCurrencyIso4217Code(aFc1qSDKComponent4, false) > 0 || !aFb1uSDK.getCurrencyIso4217Code()) {
            return;
        }
        aFb1uSDK.AFAdRevenueData.execute(aFb1uSDK.getRevenue);
        this.component1 = System.currentTimeMillis();
        this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        addObserver(new AFj1tSDK.AnonymousClass1());
    }
}
