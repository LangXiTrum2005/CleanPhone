package ea;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.ironsource.X3;
import com.storage.androidcleaner.R;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f39936a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f39937b = {"ad_impression"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f39938c = {"ad_impression", "in_app_purchase"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f39939d = {"ad_impression"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f39940e = {"ad_impression", "in_app_purchase"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f39941f = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f39942g = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f39943h = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f39944i = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f39945j = {"items"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f39946k = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, X3.i.X, "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static final String[] l = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f39947m = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static fd.b f39948n;

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static String b(Context context, String str) {
        k9.c0.h(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = a(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static void c(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble(X3.i.X, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(X3.i.X, ((Long) obj).longValue());
        } else {
            bundle.putString(X3.i.X, obj.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: SQLiteException -> 0x00b7, LOOP:0: B:29:0x0080->B:32:0x008a, LOOP_END, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
  0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    public static void d(s0 s0Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th2;
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i10;
        int i11;
        if (s0Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
                try {
                    cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    try {
                        try {
                            boolean zMoveToFirst = cursorQuery.moveToFirst();
                            cursorQuery.close();
                            if (!zMoveToFirst) {
                                sQLiteDatabase2.execSQL(str2);
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                throw th2;
                            }
                            cursor.close();
                            throw th2;
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        s0Var.f39756i.d("Error querying for table", str, e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    cursorQuery = null;
                    s0Var.f39756i.d("Error querying for table", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    sQLiteDatabase2.execSQL(str2);
                    hashSet = new HashSet();
                    StringBuilder sb2 = new StringBuilder(str.length() + 22);
                    sb2.append("SELECT * FROM ");
                    sb2.append(str);
                    sb2.append(" LIMIT 0");
                    cursorRawQuery = sQLiteDatabase2.rawQuery(sb2.toString(), null);
                    try {
                        Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                        cursorRawQuery.close();
                        for (String str4 : str3.split(",")) {
                            if (hashSet.remove(str4)) {
                                StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                sb3.append("Table ");
                                sb3.append(str);
                                sb3.append(" is missing required column: ");
                                sb3.append(str4);
                                throw new SQLiteException(sb3.toString());
                            }
                        }
                        if (strArr != null) {
                            for (i10 = 0; i10 < strArr.length; i10 += 2) {
                                if (!hashSet.remove(strArr[i10])) {
                                    sQLiteDatabase2.execSQL(strArr[i10 + 1]);
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                        }
                        s0Var.f39756i.d("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                    } catch (Throwable th4) {
                        cursorRawQuery.close();
                        throw th4;
                    }
                }
            } catch (SQLiteException e12) {
                e = e12;
                sQLiteDatabase2 = sQLiteDatabase;
            }
            try {
                hashSet = new HashSet();
                StringBuilder sb4 = new StringBuilder(str.length() + 22);
                sb4.append("SELECT * FROM ");
                sb4.append(str);
                sb4.append(" LIMIT 0");
                cursorRawQuery = sQLiteDatabase2.rawQuery(sb4.toString(), null);
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                while (i11 < r0) {
                    if (hashSet.remove(str4)) {
                        StringBuilder sb5 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb5.append("Table ");
                        sb5.append(str);
                        sb5.append(" is missing required column: ");
                        sb5.append(str4);
                        throw new SQLiteException(sb5.toString());
                    }
                }
                if (strArr != null) {
                    while (i10 < strArr.length) {
                        if (!hashSet.remove(strArr[i10])) {
                            sQLiteDatabase2.execSQL(strArr[i10 + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    s0Var.f39756i.d("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                }
            } catch (SQLiteException e13) {
                s0Var.f39753f.c(str, "Failed to verify columns on table that was just created");
                throw e13;
            }
        } catch (Throwable th5) {
            th2 = th5;
            if (cursor != null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
    }

    public static Object e(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(defpackage.e.q(obj2.getClass().getCanonicalName(), X3.j.f27836e, defpackage.e.v("Invalid conditional user property field type. '", str, "' expected [", cls.getCanonicalName(), "] but was [")));
    }

    public static void f(s0 s0Var, SQLiteDatabase sQLiteDatabase) {
        if (s0Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        bo.b bVar = s0Var.f39756i;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            bVar.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            bVar.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            bVar.b("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        bVar.b("Failed to turn on database write permission for owner");
    }

    public static String g(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }
}
