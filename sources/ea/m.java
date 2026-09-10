package ea;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.p30;
import com.google.android.gms.internal.ads.ts;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.ba;
import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.da;
import com.google.android.gms.internal.measurement.e8;
import com.google.android.gms.internal.measurement.f8;
import com.google.android.gms.internal.measurement.ma;
import com.google.android.gms.internal.measurement.u9;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.internal.measurement.v9;
import com.google.android.gms.internal.measurement.y9;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends z3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f39567f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f39568g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f39569h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f39570i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f39571j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f39572k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f39573m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f39574n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f39575o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f39576p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f39577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.c f39578e;

    public m(e4 e4Var) {
        super(e4Var);
        this.f39578e = new androidx.recyclerview.widget.c(((m1) this.f3623a).f39592k);
        ((m1) this.f3623a).getClass();
        this.f39577d = new l(this, ((m1) this.f3623a).f39582a);
    }

    public static final String l1(List list) {
        return list.isEmpty() ? "" : defpackage.e.o(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void t1(ContentValues contentValues, Object obj) {
        k9.c0.e(X3.i.X);
        k9.c0.h(obj);
        if (obj instanceof String) {
            contentValues.put(X3.i.X, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(X3.i.X, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(X3.i.X, (Double) obj);
        }
    }

    public final void A1(String str, String str2) {
        k9.c0.e(str);
        k9.c0.e(str2);
        G0();
        H0();
        try {
            x1().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            m1 m1Var = (m1) this.f3623a;
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.e("Error deleting user property. appId", s0.O0(str), m1Var.f39591j.c(str2), e10);
        }
    }

    public final boolean B1(j4 j4Var) {
        m1 m1Var = (m1) this.f3623a;
        String str = j4Var.f39518b;
        G0();
        H0();
        String str2 = j4Var.f39517a;
        String str3 = j4Var.f39519c;
        if (C1(str2, str3) == null) {
            if (l4.F1(str3)) {
                if (c1("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(m1Var.f39585d.P0(str2, d0.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jC1 = c1("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                m1Var.getClass();
                if (jC1 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(j4Var.f39520d));
        t1(contentValues, j4Var.f39521e);
        try {
            if (x1().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.c(s0.O0(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e10) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39753f.d("Error storing user property. appId", s0.O0(str2), e10);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    public final j4 C1(String str, String str2) {
        Throwable th2;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        m1 m1Var = (m1) this.f3623a;
        k9.c0.e(str);
        k9.c0.e(str2);
        G0();
        H0();
        Cursor cursor = null;
        try {
            cursorQuery = x1().query("user_attributes", new String[]{"set_timestamp", X3.i.X, "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j10 = cursorQuery.getLong(0);
                        Object objT0 = T0(cursorQuery, 1);
                        if (objT0 != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                j4 j4Var = new j4(str3, cursorQuery.getString(2), str4, j10, objT0);
                                if (cursorQuery.moveToNext()) {
                                    s0 s0Var = m1Var.f39587f;
                                    m1.h(s0Var);
                                    s0Var.f39753f.c(s0.O0(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return j4Var;
                            } catch (SQLiteException e10) {
                                e = e10;
                            }
                        }
                        sQLiteException = e;
                        s0 s0Var2 = m1Var.f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39753f.e("Error querying user property. appId", s0.O0(str3), m1Var.f39591j.c(str4), sQLiteException);
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = str;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        } catch (SQLiteException e12) {
            str3 = str;
            str4 = str2;
            sQLiteException = e12;
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor != null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List D1(String str) {
        String str2;
        SQLiteException sQLiteException;
        m1 m1Var = (m1) this.f3623a;
        k9.c0.e(str);
        G0();
        H0();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                m1Var.getClass();
                cursorQuery = x1().query("user_attributes", new String[]{"name", "origin", "set_timestamp", X3.i.X}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j10 = cursorQuery.getLong(2);
                        Object objT0 = T0(cursorQuery, 3);
                        if (objT0 == null) {
                            try {
                                s0 s0Var = m1Var.f39587f;
                                m1.h(s0Var);
                                s0Var.f39753f.c(s0.O0(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e10) {
                                sQLiteException = e10;
                                str2 = str;
                                s0 s0Var2 = m1Var.f39587f;
                                m1.h(s0Var2);
                                s0Var2.f39753f.d("Error querying user properties. appId", s0.O0(str2), sQLiteException);
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new j4(str2, str3, string, j10, objT0));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e11) {
                            e = e11;
                            sQLiteException = e;
                            s0 s0Var3 = m1Var.f39587f;
                            m1.h(s0Var3);
                            s0Var3.f39753f.d("Error querying user properties. appId", s0.O0(str2), sQLiteException);
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } catch (SQLiteException e12) {
                e = e12;
                str2 = str;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final List E1(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        String str5;
        m1 m1Var = (m1) this.f3623a;
        k9.c0.e(str);
        G0();
        H0();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb2 = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb2.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb3.append(str3);
                sb3.append("*");
                arrayList2.add(sb3.toString());
                sb2.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            SQLiteDatabase sQLiteDatabaseX1 = x1();
            String[] strArr2 = {"name", "set_timestamp", X3.i.X, "origin"};
            String string = sb2.toString();
            m1Var.getClass();
            s0 s0Var = m1Var.f39587f;
            Cursor cursorQuery = sQLiteDatabaseX1.query("user_attributes", strArr2, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    m1.h(s0Var);
                                    s0Var.f39753f.c(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j10 = cursorQuery.getLong(1);
                                Object objT0 = T0(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objT0 == null) {
                                    try {
                                        m1.h(s0Var);
                                        s0Var.f39753f.e("(2)Read invalid user property value, ignoring it", s0.O0(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            s0 s0Var2 = m1Var.f39587f;
                                            m1.h(s0Var2);
                                            s0Var2.f39753f.e("(2)Error querying user properties", s0.O0(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new j4(str, str5, string2, j10, objT0));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    s0 s0Var3 = m1Var.f39587f;
                                    m1.h(s0Var3);
                                    s0Var3.f39753f.e("(2)Error querying user properties", s0.O0(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                cursor = cursorQuery;
                                s0 s0Var4 = m1Var.f39587f;
                                m1.h(s0Var4);
                                s0Var4.f39753f.e("(2)Error querying user properties", s0.O0(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e14) {
            e = e14;
            str4 = str2;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    public final boolean F1(e eVar) {
        m1 m1Var = (m1) this.f3623a;
        G0();
        H0();
        String str = eVar.f39352a;
        k9.c0.h(str);
        if (C1(str, eVar.f39354c.f39485b) == null) {
            long jC1 = c1("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            m1Var.getClass();
            if (jC1 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("origin", eVar.f39353b);
        contentValues.put("name", eVar.f39354c.f39485b);
        Object objZza = eVar.f39354c.zza();
        k9.c0.h(objZza);
        t1(contentValues, objZza);
        contentValues.put("active", Boolean.valueOf(eVar.f39356e));
        contentValues.put("trigger_event_name", eVar.f39357f);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.f39359h));
        u uVar = eVar.f39358g;
        l4 l4Var = m1Var.f39590i;
        s0 s0Var = m1Var.f39587f;
        m1.f(l4Var);
        contentValues.put("timed_out_event", l4.o1(uVar));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.f39355d));
        m1.f(l4Var);
        contentValues.put("triggered_event", l4.o1(eVar.f39360i));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.f39354c.f39486c));
        contentValues.put("time_to_live", Long.valueOf(eVar.f39361j));
        contentValues.put("expired_event", l4.o1(eVar.f39362k));
        try {
            if (x1().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            m1.h(s0Var);
            s0Var.f39753f.c(s0.O0(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e10) {
            m1.h(s0Var);
            s0Var.f39753f.d("Error storing conditional user property", s0.O0(str), e10);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:29:0x00f0 */
    public final e G1(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        m1 m1Var = (m1) this.f3623a;
        k9.c0.e(str);
        k9.c0.e(str2);
        G0();
        H0();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = x1().query("conditional_properties", new String[]{"origin", X3.i.X, "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objT0 = T0(cursorQuery, 1);
                    boolean z10 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j10 = cursorQuery.getLong(4);
                    h4 h4Var = this.f39807b.f39377g;
                    e4.T(h4Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<u> creator = u.CREATOR;
                    u uVar = (u) h4Var.j1(blob, creator);
                    long j11 = cursorQuery.getLong(6);
                    e4.T(h4Var);
                    u uVar2 = (u) h4Var.j1(cursorQuery.getBlob(7), creator);
                    long j12 = cursorQuery.getLong(8);
                    long j13 = cursorQuery.getLong(9);
                    e4.T(h4Var);
                    str3 = str2;
                    try {
                        e eVar = new e(str, str4, new i4(j12, objT0, str3, str4), j11, z10, string2, uVar, j10, uVar2, j13, (u) h4Var.j1(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            s0 s0Var = m1Var.f39587f;
                            m1.h(s0Var);
                            s0Var.f39753f.d("Got multiple records for conditional property, expected one", s0.O0(str), m1Var.f39591j.c(str3));
                        }
                        cursorQuery.close();
                        return eVar;
                    } catch (SQLiteException e10) {
                        e = e10;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = str2;
                }
            } catch (SQLiteException e12) {
                e = e12;
                str3 = str2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        s0 s0Var2 = m1Var.f39587f;
        m1.h(s0Var2);
        s0Var2.f39753f.e("Error querying conditional property", s0.O0(str), m1Var.f39591j.c(str3), e);
    }

    public final void H1(String str, String str2) {
        k9.c0.e(str);
        k9.c0.e(str2);
        G0();
        H0();
        try {
            x1().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            m1 m1Var = (m1) this.f3623a;
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.e("Error deleting conditional property", s0.O0(str), m1Var.f39591j.c(str2), e10);
        }
    }

    public final List I1(String str, String str2, String str3) {
        k9.c0.e(str);
        G0();
        H0();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return J1(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // ea.z3
    public final void J0() {
        m1 m1Var = (m1) this.f3623a;
        if (m1Var.f39585d.R0(null, d0.f39301e1)) {
            j1 j1Var = m1Var.f39588g;
            m1.h(j1Var);
            j1Var.P0(new androidx.lifecycle.a0(this, 9));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public final List J1(String str, String[] strArr) {
        m1 m1Var = (m1) this.f3623a;
        G0();
        H0();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX1 = x1();
                String[] strArr2 = {MBridgeConstans.APP_ID, "origin", "name", X3.i.X, "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                m1Var.getClass();
                cursorQuery = sQLiteDatabaseX1.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            s0 s0Var = m1Var.f39587f;
                            m1.h(s0Var);
                            s0Var.f39753f.c(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objT0 = T0(cursorQuery, 3);
                        boolean z10 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j10 = cursorQuery.getLong(6);
                        h4 h4Var = this.f39807b.f39377g;
                        e4.T(h4Var);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<u> creator = u.CREATOR;
                        u uVar = (u) h4Var.j1(blob, creator);
                        long j11 = cursorQuery.getLong(8);
                        e4.T(h4Var);
                        u uVar2 = (u) h4Var.j1(cursorQuery.getBlob(9), creator);
                        long j12 = cursorQuery.getLong(10);
                        long j13 = cursorQuery.getLong(11);
                        e4.T(h4Var);
                        arrayList.add(new e(string, string2, new i4(j12, objT0, string3, string2), j11, z10, string4, uVar, j10, uVar2, j13, (u) h4Var.j1(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                s0 s0Var2 = m1Var.f39587f;
                m1.h(s0Var2);
                s0Var2.f39753f.c(e10, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final long K0(String str, ba baVar, String str2, Map map, v2 v2Var, Long l10) {
        int iDelete;
        m1 m1Var = (m1) this.f3623a;
        G0();
        H0();
        k9.c0.h(baVar);
        k9.c0.e(str);
        G0();
        H0();
        if (r1()) {
            e4 e4Var = this.f39807b;
            long jE = e4Var.f39379i.f39512f.e();
            p9.b bVar = m1Var.f39592k;
            s0 s0Var = m1Var.f39587f;
            bVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jE) > ((Long) d0.M.a(null)).longValue()) {
                e4Var.f39379i.f39512f.f(jElapsedRealtime);
                G0();
                H0();
                if (r1() && (iDelete = x1().delete("upload_queue", k1(), new String[0])) > 0) {
                    m1.h(s0Var);
                    s0Var.f39760n.c(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                k9.c0.e(str);
                G0();
                H0();
                try {
                    int iP0 = m1Var.f39585d.P0(str, d0.A);
                    if (iP0 > 0) {
                        x1().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iP0)});
                    }
                } catch (SQLiteException e10) {
                    m1.h(s0Var);
                    s0Var.f39753f.d("Error deleting over the limit queued batches. appId", s0.O0(str), e10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append(X3.j.f27830b);
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrA = baVar.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(v2Var.f39806a));
        p9.b bVar2 = m1Var.f39592k;
        s0 s0Var2 = m1Var.f39587f;
        bVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = x1().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            m1.h(s0Var2);
            s0Var2.f39753f.c(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e11) {
            m1.h(s0Var2);
            s0Var2.f39753f.d("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0407  */
    public final w0 K1(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        m1 m1Var = (m1) this.f3623a;
        k9.c0.e(str);
        G0();
        H0();
        Cursor cursor = null;
        try {
            cursorQuery = x1().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        e4 e4Var = this.f39807b;
                        w0 w0Var = new w0(e4Var.l, str);
                        m1 m1Var2 = w0Var.f39833a;
                        y1 y1VarA = e4Var.a(str);
                        x1 x1Var = x1.ANALYTICS_STORAGE;
                        if (y1VarA.i(x1Var)) {
                            w0Var.G(cursorQuery.getString(0));
                        }
                        boolean z10 = true;
                        w0Var.I(cursorQuery.getString(1));
                        if (e4Var.a(str).i(x1.AD_STORAGE)) {
                            w0Var.J(cursorQuery.getString(2));
                        }
                        w0Var.e(cursorQuery.getLong(3));
                        w0Var.M(cursorQuery.getLong(4));
                        w0Var.N(cursorQuery.getLong(5));
                        w0Var.P(cursorQuery.getString(6));
                        w0Var.S(cursorQuery.getString(7));
                        w0Var.T(cursorQuery.getLong(8));
                        w0Var.a(cursorQuery.getLong(9));
                        w0Var.d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        w0Var.i(cursorQuery.getLong(11));
                        w0Var.j(cursorQuery.getLong(12));
                        w0Var.k(cursorQuery.getLong(13));
                        w0Var.l(cursorQuery.getLong(14));
                        w0Var.f(cursorQuery.getLong(15));
                        w0Var.g(cursorQuery.getLong(16));
                        w0Var.R(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        w0Var.L(cursorQuery.getString(18));
                        w0Var.n(cursorQuery.getLong(19));
                        w0Var.m(cursorQuery.getLong(20));
                        w0Var.w(cursorQuery.getString(21));
                        boolean z11 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        j1 j1Var = m1Var2.f39588g;
                        m1.h(j1Var);
                        j1Var.G0();
                        w0Var.R |= w0Var.f39847p != z11;
                        w0Var.f39847p = z11;
                        w0Var.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            w0Var.y(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (e4Var.a(str).i(x1Var)) {
                            String string2 = cursorQuery.getString(28);
                            j1 j1Var2 = m1Var2.f39588g;
                            m1.h(j1Var2);
                            j1Var2.G0();
                            w0Var.R |= !Objects.equals(w0Var.f39851t, string2);
                            w0Var.f39851t = string2;
                        }
                        boolean z12 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        j1 j1Var3 = m1Var2.f39588g;
                        m1.h(j1Var3);
                        j1Var3.G0();
                        w0Var.R |= w0Var.f39852u != z12;
                        w0Var.f39852u = z12;
                        w0Var.r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        j1 j1Var4 = m1Var2.f39588g;
                        m1.h(j1Var4);
                        j1Var4.G0();
                        w0Var.R |= w0Var.C != string3;
                        w0Var.C = string3;
                        w0Var.A(cursorQuery.getLong(30));
                        w0Var.B(cursorQuery.getLong(31));
                        v4.a();
                        if (m1Var.f39585d.R0(str, d0.O0)) {
                            int i10 = cursorQuery.getInt(32);
                            j1 j1Var5 = m1Var2.f39588g;
                            m1.h(j1Var5);
                            j1Var5.G0();
                            w0Var.R |= w0Var.f39855x != i10;
                            w0Var.f39855x = i10;
                            w0Var.C(cursorQuery.getLong(35));
                        }
                        boolean z13 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        j1 j1Var6 = m1Var2.f39588g;
                        m1.h(j1Var6);
                        j1Var6.G0();
                        w0Var.R |= w0Var.f39856y != z13;
                        w0Var.f39856y = z13;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        j1 j1Var7 = m1Var2.f39588g;
                        m1.h(j1Var7);
                        j1Var7.G0();
                        w0Var.R |= !Objects.equals(w0Var.f39848q, boolValueOf);
                        w0Var.f39848q = boolValueOf;
                        w0Var.p(cursorQuery.getInt(37));
                        w0Var.q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            k9.c0.h(string);
                        }
                        j1 j1Var8 = m1Var2.f39588g;
                        m1.h(j1Var8);
                        j1Var8.G0();
                        w0Var.R |= w0Var.G != string;
                        w0Var.G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            j1 j1Var9 = m1Var2.f39588g;
                            m1.h(j1Var9);
                            j1Var9.G0();
                            w0Var.R |= !Objects.equals(w0Var.f39857z, lValueOf);
                            w0Var.f39857z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            j1 j1Var10 = m1Var2.f39588g;
                            m1.h(j1Var10);
                            j1Var10.G0();
                            w0Var.R |= !Objects.equals(w0Var.A, lValueOf2);
                            w0Var.A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        j1 j1Var11 = m1Var2.f39588g;
                        m1.h(j1Var11);
                        j1Var11.G0();
                        w0Var.R |= w0Var.H != blob;
                        w0Var.H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i11 = cursorQuery.getInt(44);
                            j1 j1Var12 = m1Var2.f39588g;
                            m1.h(j1Var12);
                            j1Var12.G0();
                            boolean z14 = w0Var.R;
                            if (w0Var.I == i11) {
                                z10 = false;
                            }
                            w0Var.R = z10 | z14;
                            w0Var.I = i11;
                        }
                        if (m1Var.f39585d.R0(str, d0.f39314j1) && !cursorQuery.isNull(45)) {
                            w0Var.u(cursorQuery.getLong(45));
                        }
                        j1 j1Var13 = m1Var2.f39588g;
                        m1.h(j1Var13);
                        j1Var13.G0();
                        w0Var.R = false;
                        if (cursorQuery.moveToNext()) {
                            s0 s0Var = m1Var.f39587f;
                            m1.h(s0Var);
                            s0Var.f39753f.c(s0.O0(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return w0Var;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e10) {
                e = e10;
                s0 s0Var2 = m1Var.f39587f;
                m1.h(s0Var2);
                s0Var2.f39753f.d("Error querying app. appId", s0.O0(str), e);
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List L0(String str, x3 x3Var, int i10) {
        ?? arrayList;
        k9.c0.e(str);
        G0();
        H0();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseX1 = x1();
            String[] strArr = {"rowId", MBridgeConstans.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strL1 = l1(x3Var.f39916a);
            String strK1 = k1();
            StringBuilder sb2 = new StringBuilder(strL1.length() + 17 + strK1.length());
            sb2.append("app_id=?");
            sb2.append(strL1);
            sb2.append(" AND NOT ");
            sb2.append(strK1);
            cursorQuery = sQLiteDatabaseX1.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                g4 g4VarJ1 = j1(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (g4VarJ1 != null) {
                    arrayList.add(g4VarJ1);
                }
            }
        } catch (SQLiteException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39753f.d("Error to querying MeasurementBatch from upload_queue. appId", str, e10);
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final void L1(w0 w0Var, boolean z10) {
        m1 m1Var = (m1) this.f3623a;
        m1 m1Var2 = w0Var.f39833a;
        G0();
        H0();
        String strE = w0Var.E();
        k9.c0.h(strE);
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, strE);
        x1 x1Var = x1.ANALYTICS_STORAGE;
        e4 e4Var = this.f39807b;
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (e4Var.a(strE).i(x1Var)) {
            contentValues.put("app_instance_id", w0Var.F());
        }
        contentValues.put("gmp_app_id", w0Var.H());
        if (e4Var.a(strE).i(x1.AD_STORAGE)) {
            j1 j1Var = m1Var2.f39588g;
            m1.h(j1Var);
            j1Var.G0();
            contentValues.put("resettable_device_id_hash", w0Var.f39837e);
        }
        j1 j1Var2 = m1Var2.f39588g;
        m1.h(j1Var2);
        j1Var2.G0();
        contentValues.put("last_bundle_index", Long.valueOf(w0Var.f39839g));
        j1 j1Var3 = m1Var2.f39588g;
        m1.h(j1Var3);
        j1Var3.G0();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(w0Var.f39840h));
        j1 j1Var4 = m1Var2.f39588g;
        m1.h(j1Var4);
        j1Var4.G0();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(w0Var.f39841i));
        contentValues.put("app_version", w0Var.O());
        j1 j1Var5 = m1Var2.f39588g;
        m1.h(j1Var5);
        j1Var5.G0();
        contentValues.put("app_store", w0Var.l);
        j1 j1Var6 = m1Var2.f39588g;
        m1.h(j1Var6);
        j1Var6.G0();
        contentValues.put("gmp_version", Long.valueOf(w0Var.f39844m));
        j1 j1Var7 = m1Var2.f39588g;
        m1.h(j1Var7);
        j1Var7.G0();
        contentValues.put("dev_cert_hash", Long.valueOf(w0Var.f39845n));
        j1 j1Var8 = m1Var2.f39588g;
        m1.h(j1Var8);
        j1Var8.G0();
        contentValues.put("measurement_enabled", Boolean.valueOf(w0Var.f39846o));
        j1 j1Var9 = m1Var2.f39588g;
        j1 j1Var10 = m1Var2.f39588g;
        m1.h(j1Var9);
        j1Var9.G0();
        contentValues.put("day", Long.valueOf(w0Var.K));
        m1.h(j1Var10);
        j1Var10.G0();
        contentValues.put("daily_public_events_count", Long.valueOf(w0Var.L));
        m1.h(j1Var10);
        j1Var10.G0();
        contentValues.put("daily_events_count", Long.valueOf(w0Var.M));
        m1.h(j1Var10);
        j1Var10.G0();
        contentValues.put("daily_conversions_count", Long.valueOf(w0Var.N));
        j1 j1Var11 = m1Var2.f39588g;
        m1.h(j1Var11);
        j1Var11.G0();
        contentValues.put("config_fetched_time", Long.valueOf(w0Var.S));
        j1 j1Var12 = m1Var2.f39588g;
        m1.h(j1Var12);
        j1Var12.G0();
        contentValues.put("failed_config_fetch_time", Long.valueOf(w0Var.T));
        contentValues.put("app_version_int", Long.valueOf(w0Var.Q()));
        contentValues.put("firebase_instance_id", w0Var.K());
        m1.h(j1Var10);
        j1Var10.G0();
        contentValues.put("daily_error_events_count", Long.valueOf(w0Var.O));
        m1.h(j1Var10);
        j1Var10.G0();
        contentValues.put("daily_realtime_events_count", Long.valueOf(w0Var.P));
        m1.h(j1Var10);
        j1Var10.G0();
        contentValues.put("health_monitor_sample", w0Var.Q);
        contentValues.put("android_id", (Long) 0L);
        j1 j1Var13 = m1Var2.f39588g;
        m1.h(j1Var13);
        j1Var13.G0();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(w0Var.f39847p));
        contentValues.put("dynamite_version", Long.valueOf(w0Var.b()));
        if (e4Var.a(strE).i(x1Var)) {
            j1 j1Var14 = m1Var2.f39588g;
            m1.h(j1Var14);
            j1Var14.G0();
            contentValues.put("session_stitching_token", w0Var.f39851t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(w0Var.z()));
        j1 j1Var15 = m1Var2.f39588g;
        m1.h(j1Var15);
        j1Var15.G0();
        contentValues.put("target_os_version", Long.valueOf(w0Var.f39853v));
        j1 j1Var16 = m1Var2.f39588g;
        m1.h(j1Var16);
        j1Var16.G0();
        contentValues.put("session_stitching_token_hash", Long.valueOf(w0Var.f39854w));
        v4.a();
        g gVar = m1Var.f39585d;
        s0 s0Var = m1Var.f39587f;
        if (gVar.R0(strE, d0.O0)) {
            j1 j1Var17 = m1Var2.f39588g;
            m1.h(j1Var17);
            j1Var17.G0();
            contentValues.put("ad_services_version", Integer.valueOf(w0Var.f39855x));
            j1 j1Var18 = m1Var2.f39588g;
            m1.h(j1Var18);
            j1Var18.G0();
            contentValues.put("attribution_eligibility_status", Long.valueOf(w0Var.B));
        }
        j1 j1Var19 = m1Var2.f39588g;
        m1.h(j1Var19);
        j1Var19.G0();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(w0Var.f39856y));
        contentValues.put("npa_metadata_value", w0Var.x());
        j1 j1Var20 = m1Var2.f39588g;
        m1.h(j1Var20);
        j1Var20.G0();
        contentValues.put("bundle_delivery_index", Long.valueOf(w0Var.F));
        contentValues.put("sgtm_preview_key", w0Var.D());
        m1.h(j1Var10);
        j1Var10.G0();
        contentValues.put("dma_consent_state", Integer.valueOf(w0Var.D));
        m1.h(j1Var10);
        j1Var10.G0();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(w0Var.E));
        contentValues.put("serialized_npa_metadata", w0Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(w0Var.t()));
        j1 j1Var21 = m1Var2.f39588g;
        m1.h(j1Var21);
        j1Var21.G0();
        ArrayList arrayList = w0Var.f39850s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                m1.h(s0Var);
                s0Var.f39756i.c(strE, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (gVar.R0(null, d0.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        j1 j1Var22 = m1Var2.f39588g;
        m1.h(j1Var22);
        j1Var22.G0();
        contentValues.put("unmatched_pfo", w0Var.f39857z);
        j1 j1Var23 = m1Var2.f39588g;
        m1.h(j1Var23);
        j1Var23.G0();
        contentValues.put("unmatched_uwa", w0Var.A);
        j1 j1Var24 = m1Var2.f39588g;
        m1.h(j1Var24);
        j1Var24.G0();
        contentValues.put("ad_campaign_info", w0Var.H);
        if (gVar.R0(strE, d0.f39314j1)) {
            j1 j1Var25 = m1Var2.f39588g;
            m1.h(j1Var25);
            j1Var25.G0();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(w0Var.J));
        }
        try {
            SQLiteDatabase sQLiteDatabaseX1 = x1();
            if (sQLiteDatabaseX1.update("apps", contentValues, "app_id = ?", new String[]{strE}) == 0 && sQLiteDatabaseX1.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                m1.h(s0Var);
                s0Var.f39753f.c(s0.O0(strE), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e10) {
            m1.h(s0Var);
            s0Var.f39753f.d("Error storing app. appId", s0.O0(strE), e10);
        }
    }

    public final boolean M0(String str) {
        v2[] v2VarArr = {v2.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(v2VarArr[0].f39806a));
        String strL1 = l1(arrayList);
        String strK1 = k1();
        return c1(d5.u.h(new StringBuilder((strL1.length() + 61) + strK1.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strL1, " AND NOT ", strK1), new String[]{str}) != 0;
    }

    public final j M1(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        return N1(j10, str, 1L, false, false, z10, false, z11, z12, z13);
    }

    public final void N0(Long l10) {
        m1 m1Var = (m1) this.f3623a;
        G0();
        H0();
        try {
            if (x1().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39756i.b("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39753f.c(e10, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e10;
        }
    }

    public final j N1(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        m1 m1Var = (m1) this.f3623a;
        k9.c0.e(str);
        G0();
        H0();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX1 = x1();
                cursorQuery = sQLiteDatabaseX1.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j10) {
                        jVar.f39492b = cursorQuery.getLong(1);
                        jVar.f39491a = cursorQuery.getLong(2);
                        jVar.f39493c = cursorQuery.getLong(3);
                        jVar.f39494d = cursorQuery.getLong(4);
                        jVar.f39495e = cursorQuery.getLong(5);
                        jVar.f39496f = cursorQuery.getLong(6);
                        jVar.f39497g = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        jVar.f39492b += j11;
                    }
                    if (z11) {
                        jVar.f39491a += j11;
                    }
                    if (z12) {
                        jVar.f39493c += j11;
                    }
                    if (z13) {
                        jVar.f39494d += j11;
                    }
                    if (z14) {
                        jVar.f39495e += j11;
                    }
                    if (z15) {
                        jVar.f39496f += j11;
                    }
                    if (z16) {
                        jVar.f39497g += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(jVar.f39491a));
                    contentValues.put("daily_events_count", Long.valueOf(jVar.f39492b));
                    contentValues.put("daily_conversions_count", Long.valueOf(jVar.f39493c));
                    contentValues.put("daily_error_events_count", Long.valueOf(jVar.f39494d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f39495e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(jVar.f39496f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(jVar.f39497g));
                    sQLiteDatabaseX1.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    s0 s0Var = m1Var.f39587f;
                    m1.h(s0Var);
                    s0Var.f39756i.c(s0.O0(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e10) {
                s0 s0Var2 = m1Var.f39587f;
                m1.h(s0Var2);
                s0Var2.f39753f.d("Error updating daily counts. appId", s0.O0(str), e10);
            }
            return jVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final String O0() throws Throwable {
        SQLiteException e10;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseX1 = x1();
        ?? r2 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseX1.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    s0 s0Var = ((m1) this.f3623a).f39587f;
                    m1.h(s0Var);
                    s0Var.f39753f.c(e10, "Database error getting next bundle app id");
                }
            } catch (SQLiteException e12) {
                e10 = e12;
                cursorRawQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r2 = sQLiteDatabaseX1;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final g9.k O1(String str) throws Throwable {
        Throwable th2;
        Cursor cursorQuery;
        m1 m1Var = (m1) this.f3623a;
        k9.c0.e(str);
        G0();
        H0();
        ?? r2 = 0;
        try {
            try {
                cursorQuery = x1().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            s0 s0Var = m1Var.f39587f;
                            m1.h(s0Var);
                            s0Var.f39753f.c(s0.O0(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            g9.k kVar = new g9.k(blob, string, string2, 10);
                            cursorQuery.close();
                            return kVar;
                        }
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    s0 s0Var2 = m1Var.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39753f.d("Error querying remote config. appId", s0.O0(str), e);
                }
            } catch (SQLiteException e11) {
                e = e11;
                cursorQuery = null;
            } catch (Throwable th3) {
                th2 = th3;
                if (r2 != 0) {
                    throw th2;
                }
                r2.close();
                throw th2;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            r2 = this;
            if (r2 != 0) {
                throw th2;
            }
            r2.close();
            throw th2;
        }
    }

    public final void P0(long j10) {
        G0();
        H0();
        try {
            if (x1().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39753f.c(e10, "Failed to delete a bundle in a queue table");
            throw e10;
        }
    }

    public final void P1(da daVar, boolean z10) {
        G0();
        H0();
        k9.c0.e(daVar.u());
        k9.c0.k(daVar.h2());
        Q0();
        m1 m1Var = (m1) this.f3623a;
        p9.b bVar = m1Var.f39592k;
        s0 s0Var = m1Var.f39587f;
        bVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jI2 = daVar.i2();
        c0 c0Var = d0.R;
        if (jI2 < jCurrentTimeMillis - ((Long) c0Var.a(null)).longValue() || daVar.i2() > ((Long) c0Var.a(null)).longValue() + jCurrentTimeMillis) {
            m1.h(s0Var);
            s0Var.f39756i.e("Storing bundle outside of the max uploading time span. appId, now, timestamp", s0.O0(daVar.u()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(daVar.i2()));
        }
        byte[] bArrA = daVar.a();
        try {
            h4 h4Var = this.f39807b.f39377g;
            e4.T(h4Var);
            byte[] bArrQ1 = h4Var.q1(bArrA);
            m1.h(s0Var);
            s0Var.f39760n.c(Integer.valueOf(bArrQ1.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put(MBridgeConstans.APP_ID, daVar.u());
            contentValues.put("bundle_end_timestamp", Long.valueOf(daVar.i2()));
            contentValues.put("data", bArrQ1);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (daVar.u0()) {
                contentValues.put("retry_count", Integer.valueOf(daVar.v0()));
            }
            try {
                if (x1().insert("queue", null, contentValues) == -1) {
                    m1.h(s0Var);
                    s0Var.f39753f.c(s0.O0(daVar.u()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e10) {
                m1.h(s0Var);
                s0Var.f39753f.d("Error storing bundle. appId", s0.O0(daVar.u()), e10);
            }
        } catch (IOException e11) {
            m1.h(s0Var);
            s0Var.f39753f.d("Data loss. Failed to serialize bundle. appId", s0.O0(daVar.u()), e11);
        }
    }

    public final void Q0() {
        G0();
        H0();
        if (r1()) {
            e4 e4Var = this.f39807b;
            long jE = e4Var.f39379i.f39511e.e();
            m1 m1Var = (m1) this.f3623a;
            m1Var.f39592k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jE) > ((Long) d0.M.a(null)).longValue()) {
                e4Var.f39379i.f39511e.f(jElapsedRealtime);
                G0();
                H0();
                if (r1()) {
                    SQLiteDatabase sQLiteDatabaseX1 = x1();
                    m1Var.f39592k.getClass();
                    int iDelete = sQLiteDatabaseX1.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) d0.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        s0 s0Var = m1Var.f39587f;
                        m1.h(s0Var);
                        s0Var.f39760n.c(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void R0(ArrayList arrayList) {
        m1 m1Var = (m1) this.f3623a;
        G0();
        H0();
        k9.c0.h(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (r1()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strJ = q4.a.j(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (c1(q4.a.j(new StringBuilder(strJ.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strJ, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39756i.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseX1 = x1();
                StringBuilder sb2 = new StringBuilder(strJ.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(strJ);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseX1.execSQL(sb2.toString());
            } catch (SQLiteException e10) {
                s0 s0Var2 = m1Var.f39587f;
                m1.h(s0Var2);
                s0Var2.f39753f.c(e10, "Error incrementing retry count. error");
            }
        }
    }

    public final void S0(Long l10) {
        m1 m1Var = (m1) this.f3623a;
        G0();
        H0();
        if (r1()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (c1(sb2.toString(), null) > 0) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39756i.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseX1 = x1();
                m1Var.f39592k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jCurrentTimeMillis);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l10);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseX1.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                s0 s0Var2 = m1Var.f39587f;
                m1.h(s0Var2);
                s0Var2.f39753f.c(e10, "Error incrementing retry count. error");
            }
        }
    }

    public final Object T0(Cursor cursor, int i10) {
        m1 m1Var = (m1) this.f3623a;
        int type = cursor.getType(i10);
        if (type == 0) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.b("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39753f.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        s0 s0Var3 = m1Var.f39587f;
        m1.h(s0Var3);
        s0Var3.f39753f.b("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    public final long U0(String str) {
        long j10;
        ContentValues contentValues;
        m1 m1Var = (m1) this.f3623a;
        k9.c0.e(str);
        k9.c0.e("first_open_count");
        G0();
        H0();
        SQLiteDatabase sQLiteDatabaseX1 = x1();
        sQLiteDatabaseX1.beginTransaction();
        long j11 = 0;
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select first_open_count from app2 where app_id=?");
                j10 = -1;
                long jD1 = d1(sb2.toString(), new String[]{str}, -1L);
                if (jD1 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(MBridgeConstans.APP_ID, str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseX1.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        s0 s0Var = m1Var.f39587f;
                        m1.h(s0Var);
                        s0Var.f39753f.d("Failed to insert column (got -1). appId", s0.O0(str), "first_open_count");
                    } else {
                        jD1 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put(MBridgeConstans.APP_ID, str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jD1));
                            if (sQLiteDatabaseX1.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                s0 s0Var2 = m1Var.f39587f;
                                m1.h(s0Var2);
                                s0Var2.f39753f.d("Failed to update column (got 0). appId", s0.O0(str), "first_open_count");
                            } else {
                                sQLiteDatabaseX1.setTransactionSuccessful();
                                j10 = jD1;
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            j11 = jD1;
                            s0 s0Var3 = m1Var.f39587f;
                            m1.h(s0Var3);
                            s0Var3.f39753f.e("Error inserting column. appId", s0.O0(str), "first_open_count", e);
                            j10 = j11;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put(MBridgeConstans.APP_ID, str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jD1));
                    if (sQLiteDatabaseX1.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        s0 s0Var4 = m1Var.f39587f;
                        m1.h(s0Var4);
                        s0Var4.f39753f.d("Failed to update column (got 0). appId", s0.O0(str), "first_open_count");
                    } else {
                        sQLiteDatabaseX1.setTransactionSuccessful();
                        j10 = jD1;
                    }
                }
            } finally {
                sQLiteDatabaseX1.endTransaction();
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
        return j10;
    }

    public final boolean V0(String str, String str2) {
        return c1("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void W0(List list) {
        k9.c0.h(list);
        G0();
        H0();
        StringBuilder sb2 = new StringBuilder("rowid in (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(((Long) list.get(i10)).longValue());
        }
        sb2.append(")");
        int iDelete = x1().delete("raw_events", sb2.toString(), null);
        if (iDelete != list.size()) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39753f.d("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    public final long X0(String str) {
        k9.c0.e(str);
        return d1("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void Y0(String str, Long l10, long j10, v9 v9Var) {
        G0();
        H0();
        k9.c0.h(v9Var);
        k9.c0.e(str);
        m1 m1Var = (m1) this.f3623a;
        byte[] bArrA = v9Var.a();
        s0 s0Var = m1Var.f39587f;
        s0 s0Var2 = m1Var.f39587f;
        m1.h(s0Var);
        s0Var.f39760n.d("Saving complex main event, appId, data size", m1Var.f39591j.a(str), Integer.valueOf(bArrA.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrA);
        try {
            if (x1().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                m1.h(s0Var2);
                s0Var2.f39753f.c(s0.O0(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e10) {
            m1.h(s0Var2);
            s0Var2.f39753f.d("Error storing complex main event. appId", s0.O0(str), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x0121->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0119  */
    /* JADX WARN: Code duplicated, block: B:53:0x0127  */
    public final void Z0(String str, Long l10, String str2, Bundle bundle) {
        p30 p30Var;
        s0 s0Var;
        Bundle bundle2;
        long j10;
        String str3;
        ContentValues contentValues;
        s0 s0Var2;
        da daVar;
        Iterator it;
        m mVar = this;
        String str4 = str;
        m1 m1Var = (m1) mVar.f3623a;
        k9.c0.h(bundle);
        mVar.G0();
        mVar.H0();
        if (l10 != null) {
            long jLongValue = l10.longValue();
            p30Var = new p30();
            p30Var.f18468c = mVar;
            k9.c0.e(str4);
            p30Var.f18467b = str4;
            p30Var.f18466a = mVar.d1("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str4, String.valueOf(jLongValue)}, -1L);
        } else {
            p30Var = new p30();
            p30Var.f18468c = mVar;
            k9.c0.e(str4);
            p30Var.f18467b = str4;
            p30Var.f18466a = -1L;
        }
        p30 p30Var2 = p30Var;
        List<k> listA = p30Var2.a();
        while (!listA.isEmpty()) {
            for (k kVar : listA) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        da daVar2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = mVar.x1().query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(kVar.f39523b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                daVar = (da) ((ca) h4.r1(da.Z(), cursorQuery.getBlob(0))).f();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        s0 s0Var3 = m1Var.f39587f;
                                                        m1.h(s0Var3);
                                                        s0Var3.f39756i.c(s0.O0(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    cursor2 = cursorQuery;
                                                    s0 s0Var4 = m1Var.f39587f;
                                                    m1.h(s0Var4);
                                                    s0Var4.f39753f.d("Data loss. Error selecting raw event. appId", s0.O0(str4), e);
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                }
                                                daVar2 = daVar;
                                            } catch (IOException e11) {
                                                s0 s0Var5 = m1Var.f39587f;
                                                m1.h(s0Var5);
                                                s0Var5.f39753f.d("Data loss. Failed to merge raw event metadata. appId", s0.O0(str4), e11);
                                                cursorQuery.close();
                                            }
                                            if (daVar2 != null) {
                                                it = daVar2.a2().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((ma) it.next()).w().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            s0 s0Var6 = m1Var.f39587f;
                                            m1.h(s0Var6);
                                            s0Var6.f39753f.c(s0.O0(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        daVar = null;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = cursorQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            daVar = null;
                        }
                        if (daVar2 != null) {
                            it = daVar2.a2().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((ma) it.next()).w().equals(str2)) {
                                    }
                                }
                            }
                        }
                    }
                    long jUpdate = x1().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
                    if (jUpdate != 1) {
                        m1.h(s0Var);
                        s0Var2 = s0Var;
                        try {
                            s0Var2.f39753f.d("Failed to update raw event. appId, updatedRows", s0.O0(str3), Long.valueOf(jUpdate));
                        } catch (SQLiteException e14) {
                            e = e14;
                            m1.h(s0Var2);
                            s0Var2.f39753f.d("Error updating raw event. appId", s0.O0(str3), e);
                        }
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                    s0Var2 = s0Var;
                }
                e4 e4Var = mVar.f39807b;
                h4 h4Var = e4Var.f39377g;
                e4.T(h4Var);
                v9 v9Var = kVar.f39525d;
                Bundle bundle3 = new Bundle();
                for (y9 y9Var : v9Var.w()) {
                    if (y9Var.C()) {
                        bundle3.putDouble(y9Var.v(), y9Var.D());
                    } else if (y9Var.A()) {
                        bundle3.putFloat(y9Var.v(), y9Var.B());
                    } else if (y9Var.y()) {
                        bundle3.putLong(y9Var.v(), y9Var.z());
                    } else if (y9Var.w()) {
                        bundle3.putString(y9Var.v(), y9Var.x());
                    } else if (y9Var.E().isEmpty()) {
                        s0 s0Var7 = ((m1) h4Var.f3623a).f39587f;
                        m1.h(s0Var7);
                        s0Var7.f39753f.c(y9Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(y9Var.v(), h4.t1(y9Var.E()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strZ = v9Var.z();
                if (string == null) {
                    string = "";
                }
                l4 l4Var = m1Var.f39590i;
                s0Var = m1Var.f39587f;
                m1.f(l4Var);
                if (strZ.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        k kVar2 = kVar;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        kVar = kVar2;
                    }
                } else {
                    bundle2 = bundle;
                }
                k kVar3 = kVar;
                l4Var.T0(bundle3, bundle2);
                q qVar = new q((m1) mVar.f3623a, string, str4, v9Var.z(), v9Var.B(), v9Var.J(), v9Var.D(), bundle3);
                j10 = kVar3.f39522a;
                long j11 = kVar3.f39523b;
                boolean z10 = kVar3.f39524c;
                G0();
                H0();
                str3 = qVar.f39709a;
                k9.c0.e(str3);
                h4 h4Var2 = e4Var.f39377g;
                e4.T(h4Var2);
                byte[] bArrA = h4Var2.g1(qVar).a();
                contentValues = new ContentValues();
                contentValues.put(MBridgeConstans.APP_ID, str3);
                contentValues.put("name", qVar.f39710b);
                contentValues.put("timestamp", Long.valueOf(qVar.f39712d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j11));
                contentValues.put("data", bArrA);
                contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(qVar.f39713e));
                mVar = this;
                str4 = str;
            }
            listA = p30Var2.a();
            mVar = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [al.b, ea.m, ea.z3] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    public final y1 a1(String str) {
        Throwable th2;
        SQLiteException e10;
        m1 m1Var = (m1) this.f3623a;
        k9.c0.h(str);
        G0();
        H0();
        ?? r2 = 0;
        y1VarC = null;
        y1VarC = null;
        y1 y1VarC = null;
        try {
            try {
                this = x1().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        y1VarC = y1.c(this.getInt(1), this.getString(0));
                    } else {
                        s0 s0Var = m1Var.f39587f;
                        m1.h(s0Var);
                        s0Var.f39760n.b("No data found");
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    s0 s0Var2 = m1Var.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39753f.c(e10, "Error querying database.");
                    if (this != 0) {
                    }
                    if (y1VarC == null) {
                        return y1.f39925c;
                    }
                    return y1VarC;
                }
            } catch (SQLiteException e12) {
                e10 = e12;
                this = 0;
            } catch (Throwable th3) {
                th2 = th3;
                if (r2 != 0) {
                    r2.close();
                }
                throw th2;
            }
            this.close();
            if (y1VarC == null) {
                return y1.f39925c;
            }
            return y1VarC;
        } catch (Throwable th4) {
            th2 = th4;
            r2 = this;
            if (r2 != 0) {
                r2.close();
            }
            throw th2;
        }
    }

    public final void b1(String str, t3 t3Var) {
        G0();
        H0();
        k9.c0.e(str);
        m1 m1Var = (m1) this.f3623a;
        p9.b bVar = m1Var.f39592k;
        s0 s0Var = m1Var.f39587f;
        bVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0 c0Var = d0.f39333u0;
        long jLongValue = jCurrentTimeMillis - ((Long) c0Var.a(null)).longValue();
        long j10 = t3Var.f39769b;
        if (j10 < jLongValue || j10 > ((Long) c0Var.a(null)).longValue() + jCurrentTimeMillis) {
            m1.h(s0Var);
            s0Var.f39756i.e("Storing trigger URI outside of the max retention time span. appId, now, timestamp", s0.O0(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j10));
        }
        m1.h(s0Var);
        s0Var.f39760n.b("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("trigger_uri", t3Var.f39768a);
        contentValues.put("source", Integer.valueOf(t3Var.f39770c));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (x1().insert("trigger_uris", null, contentValues) == -1) {
                m1.h(s0Var);
                s0Var.f39753f.c(s0.O0(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e10) {
            m1.h(s0Var);
            s0Var.f39753f.d("Error storing trigger URI. appId", s0.O0(str), e10);
        }
    }

    public final long c1(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = x1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                s0 s0Var = ((m1) this.f3623a).f39587f;
                m1.h(s0Var);
                s0Var.f39753f.d("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long d1(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = x1().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                s0 s0Var = ((m1) this.f3623a).f39587f;
                m1.h(s0Var);
                s0Var.f39753f.d("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    public final String e1(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = x1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e10) {
                s0 s0Var = ((m1) this.f3623a).f39587f;
                m1.h(s0Var);
                s0Var.f39753f.d("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th2;
    }

    public final void f1(ContentValues contentValues) {
        m1 m1Var = (m1) this.f3623a;
        try {
            SQLiteDatabase sQLiteDatabaseX1 = x1();
            String asString = contentValues.getAsString(MBridgeConstans.APP_ID);
            if (asString == null) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39755h.c(s0.O0(MBridgeConstans.APP_ID), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append("app_id = ?");
            if (sQLiteDatabaseX1.update("consent_settings", contentValues, sb2.toString(), new String[]{asString}) == 0 && sQLiteDatabaseX1.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                s0 s0Var2 = m1Var.f39587f;
                m1.h(s0Var2);
                s0Var2.f39753f.d("Failed to insert/update table (got -1). key", s0.O0("consent_settings"), s0.O0(MBridgeConstans.APP_ID));
            }
        } catch (SQLiteException e10) {
            s0 s0Var3 = m1Var.f39587f;
            m1.h(s0Var3);
            s0Var3.f39753f.e("Error storing into table. key", s0.O0("consent_settings"), s0.O0(MBridgeConstans.APP_ID), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final r g1(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        m1 m1Var = (m1) this.f3623a;
        k9.c0.e(str2);
        k9.c0.e(str3);
        G0();
        H0();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursorQuery = x1().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(1);
                        long j12 = cursorQuery.getLong(2);
                        long j13 = 0;
                        long j14 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j13 = cursorQuery.getLong(8);
                        }
                        r rVar = new r(str2, str3, j10, j11, j13, j12, j14, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            s0 s0Var = m1Var.f39587f;
                            m1.h(s0Var);
                            s0Var.f39753f.c(s0.O0(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return rVar;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    s0 s0Var2 = m1Var.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39753f.e("Error querying events. appId", s0.O0(str2), m1Var.f39591j.a(str3), e);
                }
            } catch (SQLiteException e11) {
                e = e11;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r3 = arrayList;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
    }

    public final void h1(String str, r rVar) {
        m1 m1Var = (m1) this.f3623a;
        k9.c0.h(rVar);
        G0();
        H0();
        ContentValues contentValues = new ContentValues();
        String str2 = rVar.f39729a;
        contentValues.put(MBridgeConstans.APP_ID, str2);
        contentValues.put("name", rVar.f39730b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f39731c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f39732d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f39734f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.f39735g));
        contentValues.put("last_bundled_day", rVar.f39736h);
        contentValues.put("last_sampled_complex_event_id", rVar.f39737i);
        contentValues.put("last_sampling_rate", rVar.f39738j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f39733e));
        Boolean bool = rVar.f39739k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (x1().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39753f.c(s0.O0(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e10) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39753f.d("Error storing event aggregates. appId", s0.O0(str2), e10);
        }
    }

    public final void i1(String str, String str2) {
        k9.c0.e(str2);
        G0();
        H0();
        try {
            x1().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39753f.d("Error deleting snapshot. appId", s0.O0(str2), e10);
        }
    }

    public final g4 j1(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        v2 v2Var;
        m1 m1Var = (m1) this.f3623a;
        if (TextUtils.isEmpty(str2)) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39759m.b("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            aa aaVar = (aa) h4.r1(ba.B(), bArr);
            v2[] v2VarArrValues = v2.values();
            int length = v2VarArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    v2Var = v2.UNKNOWN;
                    break;
                }
                v2Var = v2VarArrValues[i12];
                if (v2Var.f39806a == i10) {
                    break;
                }
                i12++;
            }
            if (v2Var != v2.GOOGLE_SIGNAL && v2Var != v2.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((ba) aaVar.f23489b).u()).iterator();
                while (it.hasNext()) {
                    ca caVar = (ca) ((da) it.next()).l();
                    caVar.b();
                    ((da) caVar.f23489b).Y0(i11);
                    arrayList.add((da) caVar.f());
                }
                aaVar.b();
                ((ba) aaVar.f23489b).G();
                aaVar.b();
                ((ba) aaVar.f23489b).F(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split(X3.j.f27830b, 2);
                    if (strArrSplit.length != 2) {
                        s0 s0Var2 = m1Var.f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39753f.c(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new g4(j10, (ba) aaVar.f(), str2, map, v2Var, j11, j12, j13, i11);
        } catch (IOException e10) {
            s0 s0Var3 = m1Var.f39587f;
            m1.h(s0Var3);
            s0Var3.f39753f.d("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    public final String k1() {
        ((m1) this.f3623a).f39592k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l10 = (Long) d0.S.a(null);
        l10.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l10 + ")";
        String strR = defpackage.e.r(wi.d.l(jCurrentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "), ((Long) d0.R.a(null)).longValue(), ")");
        StringBuilder sb2 = new StringBuilder(l1.d.r(str.length(), 5, strR.length(), 1));
        d5.u.r(sb2, "(", str, " OR ", strR);
        sb2.append(")");
        return sb2.toString();
    }

    public final void m1(String str, y1 y1Var) {
        k9.c0.h(str);
        k9.c0.h(y1Var);
        G0();
        H0();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("consent_state", y1Var.g());
        contentValues.put("consent_source", Integer.valueOf(y1Var.f39927b));
        f1(contentValues);
    }

    public final List n1(String str) {
        List list;
        String string;
        m1 m1Var = (m1) this.f3623a;
        G0();
        H0();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseX1 = x1();
            sQLiteDatabaseX1.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseX1.query("diagnostic_signals", new String[]{"signal_name", TtmlNode.TAG_METADATA, "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(1);
                                k9.c0.h(string);
                            }
                            if (string2 == null) {
                                s0 s0Var = m1Var.f39587f;
                                m1.h(s0Var);
                                s0Var.f39753f.c(s0.O0(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j10 = cursorQuery.getLong(2);
                                e8 e8VarU = f8.u();
                                e8VarU.b();
                                ((f8) e8VarU.f23489b).v(string2);
                                e8VarU.b();
                                ((f8) e8VarU.f23489b).y(j10);
                                e8VarU.b();
                                ((f8) e8VarU.f23489b).x(string);
                                if (zIsEmpty) {
                                    e8VarU.b();
                                    ((f8) e8VarU.f23489b).w();
                                }
                                arrayList.add((f8) e8VarU.f());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseX1.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseX1.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseX1.setTransactionSuccessful();
                    }
                } catch (SQLiteException e10) {
                    s0 s0Var2 = m1Var.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39753f.d("Error querying or deleting diagnostic signals. appId", s0.O0(str), e10);
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    list = arrayList;
                    cursorQuery.close();
                }
                list = arrayList;
                sQLiteDatabaseX1.endTransaction();
                return list;
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseX1.endTransaction();
                throw th2;
            }
        } catch (SQLiteException e11) {
            s0 s0Var3 = m1Var.f39587f;
            m1.h(s0Var3);
            s0Var3.f39753f.d("Error opening database for diagnostic signals. appId", s0.O0(str), e11);
            return Collections.EMPTY_LIST;
        }
    }

    public final void o1(String str, y1 y1Var) {
        k9.c0.h(str);
        G0();
        H0();
        m1(str, a1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("storage_consent_at_bundling", y1Var.g());
        f1(contentValues);
    }

    public final y1 p1(String str) {
        k9.c0.h(str);
        G0();
        H0();
        return y1.c(100, e1("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final r q1(String str, v9 v9Var, String str2) {
        r rVarG1 = g1("events", str, v9Var.z());
        if (rVarG1 != null) {
            long j10 = rVarG1.f39733e + 1;
            long j11 = rVarG1.f39732d + 1;
            return new r(rVarG1.f39729a, rVarG1.f39730b, rVarG1.f39731c + 1, j11, j10, rVarG1.f39734f, rVarG1.f39735g, rVarG1.f39736h, rVarG1.f39737i, rVarG1.f39738j, rVarG1.f39739k);
        }
        m1 m1Var = (m1) this.f3623a;
        s0 s0Var = m1Var.f39587f;
        m1.h(s0Var);
        s0Var.f39756i.d("Event aggregate wasn't created during raw event logging. appId, event", s0.O0(str), m1Var.f39591j.a(str2));
        return new r(str, v9Var.z(), 1L, 1L, 1L, v9Var.B(), 0L, null, null, null, null);
    }

    public final boolean r1() {
        return ((m1) this.f3623a).f39582a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ef A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011b A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c A[Catch: all -> 0x0079, SQLiteException -> 0x007c, LOOP:0: B:66:0x018c->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void s1(String str, long j10, long j11, ts tsVar) {
        ?? IsEmpty;
        ?? string;
        String str2;
        String[] strArr;
        String string2;
        ?? r3;
        long jD1;
        long j12;
        String[] strArr2;
        String str3;
        long j13;
        u9 u9Var;
        m1 m1Var = (m1) this.f3623a;
        G0();
        H0();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX1 = x1();
                IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                if (IsEmpty != 0) {
                    String[] strArr3 = j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                    str4 = j11 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb2 = new StringBuilder(str4.length() + 148);
                    sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb2.append(str4);
                    sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseX1.rawQuery(sb2.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r3 = string;
                                cursorRawQuery = sQLiteDatabaseX1.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        da daVar = (da) ((ca) h4.r1(da.Z(), cursorRawQuery.getBlob(0))).f();
                                        if (cursorRawQuery.moveToNext()) {
                                            s0 s0Var = m1Var.f39587f;
                                            m1.h(s0Var);
                                            s0Var.f39756i.c(s0.O0(r3), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        tsVar.f20475b = daVar;
                                        jD1 = d1("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                        if (j11 == -1) {
                                            if (jD1 != -1) {
                                                j12 = -1;
                                            } else {
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                                strArr2 = new String[]{r3, string2};
                                            }
                                            cursorRawQuery = sQLiteDatabaseX1.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j13 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j14 = cursorRawQuery.getLong(4);
                                                    try {
                                                        u9Var = (u9) h4.r1(v9.K(), blob);
                                                        u9Var.p(cursorRawQuery.getString(1));
                                                        long j15 = cursorRawQuery.getLong(2);
                                                        u9Var.b();
                                                        ((v9) u9Var.f23489b).R(j15);
                                                        u9Var.b();
                                                        ((v9) u9Var.f23489b).u(j14);
                                                        if (!tsVar.b(j13, (v9) u9Var.f())) {
                                                            break;
                                                        }
                                                    } catch (IOException e10) {
                                                        s0 s0Var2 = m1Var.f39587f;
                                                        m1.h(s0Var2);
                                                        s0Var2.f39753f.d("Data loss. Failed to merge raw event. appId", s0.O0(r3), e10);
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                s0 s0Var3 = m1Var.f39587f;
                                                m1.h(s0Var3);
                                                s0Var3.f39756i.c(s0.O0(r3), "Raw event data disappeared while in transaction. appId");
                                            }
                                        } else {
                                            j12 = j11;
                                        }
                                        if (j12 == -1 && jD1 != -1) {
                                            jD1 = Math.min(j12, jD1);
                                        } else if (j12 != -1) {
                                            jD1 = j12;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r3, string2, String.valueOf(jD1)};
                                        cursorRawQuery = sQLiteDatabaseX1.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j13 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j16 = cursorRawQuery.getLong(4);
                                                u9Var = (u9) h4.r1(v9.K(), blob2);
                                                u9Var.p(cursorRawQuery.getString(1));
                                                long j17 = cursorRawQuery.getLong(2);
                                                u9Var.b();
                                                ((v9) u9Var.f23489b).R(j17);
                                                u9Var.b();
                                                ((v9) u9Var.f23489b).u(j16);
                                                if (!tsVar.b(j13, (v9) u9Var.f())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            s0 s0Var4 = m1Var.f39587f;
                                            m1.h(s0Var4);
                                            s0Var4.f39756i.c(s0.O0(r3), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e11) {
                                        s0 s0Var5 = m1Var.f39587f;
                                        m1.h(s0Var5);
                                        s0Var5.f39753f.d("Data loss. Failed to merge raw event metadata. appId", s0.O0(r3), e11);
                                    }
                                } else {
                                    s0 s0Var6 = m1Var.f39587f;
                                    m1.h(s0Var6);
                                    s0Var6.f39753f.c(s0.O0(r3), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                s0 s0Var7 = m1Var.f39587f;
                                m1.h(s0Var7);
                                s0Var7.f39753f.d("Data loss. Error selecting raw event. appId", s0.O0(string), e);
                            }
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        string = str;
                    }
                } else {
                    try {
                        if (j11 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j11)};
                            IsEmpty = str5;
                        } else {
                            str2 = str;
                            strArr = new String[]{str2};
                        }
                        if (j11 != -1) {
                            IsEmpty = str2;
                            str4 = " and rowid <= ?";
                        }
                        IsEmpty = str2;
                        StringBuilder sb3 = new StringBuilder(str4.length() + 84);
                        sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb3.append(str4);
                        sb3.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseX1.rawQuery(sb3.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r3 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseX1.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                s0 s0Var8 = m1Var.f39587f;
                                m1.h(s0Var8);
                                s0Var8.f39753f.c(s0.O0(r3), "Raw event metadata record is missing. appId");
                            } else {
                                da daVar2 = (da) ((ca) h4.r1(da.Z(), cursorRawQuery.getBlob(0))).f();
                                if (cursorRawQuery.moveToNext()) {
                                    s0 s0Var9 = m1Var.f39587f;
                                    m1.h(s0Var9);
                                    s0Var9.f39756i.c(s0.O0(r3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                tsVar.f20475b = daVar2;
                                jD1 = d1("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                if (j11 == -1) {
                                    if (jD1 != -1) {
                                        j12 = -1;
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{r3, string2};
                                    }
                                    cursorRawQuery = sQLiteDatabaseX1.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j13 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j18 = cursorRawQuery.getLong(4);
                                            u9Var = (u9) h4.r1(v9.K(), blob3);
                                            u9Var.p(cursorRawQuery.getString(1));
                                            long j19 = cursorRawQuery.getLong(2);
                                            u9Var.b();
                                            ((v9) u9Var.f23489b).R(j19);
                                            u9Var.b();
                                            ((v9) u9Var.f23489b).u(j18);
                                            if (!tsVar.b(j13, (v9) u9Var.f())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        s0 s0Var10 = m1Var.f39587f;
                                        m1.h(s0Var10);
                                        s0Var10.f39756i.c(s0.O0(r3), "Raw event data disappeared while in transaction. appId");
                                    }
                                } else {
                                    j12 = j11;
                                }
                                if (j12 == -1) {
                                    if (j12 != -1) {
                                        jD1 = j12;
                                    }
                                } else if (j12 != -1) {
                                    jD1 = j12;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r3, string2, String.valueOf(jD1)};
                                cursorRawQuery = sQLiteDatabaseX1.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j13 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j110 = cursorRawQuery.getLong(4);
                                        u9Var = (u9) h4.r1(v9.K(), blob4);
                                        u9Var.p(cursorRawQuery.getString(1));
                                        long j111 = cursorRawQuery.getLong(2);
                                        u9Var.b();
                                        ((v9) u9Var.f23489b).R(j111);
                                        u9Var.b();
                                        ((v9) u9Var.f23489b).u(j110);
                                        if (!tsVar.b(j13, (v9) u9Var.f())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    s0 s0Var11 = m1Var.f39587f;
                                    m1.h(s0Var11);
                                    s0Var11.f39756i.c(s0.O0(r3), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        string = IsEmpty;
                        s0 s0Var12 = m1Var.f39587f;
                        m1.h(s0Var12);
                        s0Var12.f39753f.d("Data loss. Error selecting raw event. appId", s0.O0(string), e);
                    }
                }
            } finally {
                if (0 != 0) {
                    cursorRawQuery.close();
                }
            }
        } catch (SQLiteException e15) {
            e = e15;
            IsEmpty = str;
        }
    }

    public final void u1() {
        H0();
        x1().beginTransaction();
    }

    public final void v1() {
        H0();
        x1().setTransactionSuccessful();
    }

    public final void w1() {
        H0();
        x1().endTransaction();
    }

    public final SQLiteDatabase x1() {
        G0();
        try {
            return this.f39577d.getWritableDatabase();
        } catch (SQLiteException e10) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39756i.c(e10, "Error opening database");
            throw e10;
        }
    }

    public final void y1(String str) {
        r rVarG1;
        i1("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = x1().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (rVarG1 = g1("events", str, string)) != null) {
                            h1("events_snapshot", rVarG1);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                s0 s0Var = ((m1) this.f3623a).f39587f;
                m1.h(s0Var);
                s0Var.f39753f.d("Error creating snapshot. appId", s0.O0(str), e10);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void z1(String str) throws Throwable {
        boolean z10;
        r rVarG1;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        r rVarG2 = g1("events", str, "_f");
        r rVarG3 = g1("events", str, "_v");
        i1("events", str);
        Cursor cursorQuery = null;
        boolean z11 = false;
        try {
            cursorQuery = x1().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z12 = false;
                z10 = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z12 = true;
                            } else if ("_v".equals(string)) {
                                z10 = true;
                            }
                        }
                        if (string != null && (rVarG1 = g1("events_snapshot", str, string)) != null) {
                            h1("events", rVarG1);
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        z11 = z12;
                        try {
                            s0 s0Var = ((m1) this.f3623a).f39587f;
                            m1.h(s0Var);
                            s0Var.f39753f.d("Error querying snapshot. appId", s0.O0(str), e);
                            z12 = z11;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z11 && rVarG2 != null) {
                                h1("events", rVarG2);
                            } else if (!z10 && rVarG3 != null) {
                                h1("events", rVarG3);
                            }
                            i1("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z11 = z12;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z11) {
                            if (!z10) {
                                h1("events", rVarG3);
                            }
                        } else if (!z10) {
                            h1("events", rVarG3);
                        }
                        i1("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z12 && rVarG2 != null) {
                    h1("events", rVarG2);
                } else if (!z10 && rVarG3 != null) {
                    h1("events", rVarG3);
                }
            } else {
                cursorQuery.close();
                if (rVarG2 != null) {
                    h1("events", rVarG2);
                } else if (rVarG3 != null) {
                    h1("events", rVarG3);
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            z10 = false;
        } catch (Throwable th4) {
            th = th4;
            z10 = false;
        }
        i1("events_snapshot", str);
    }
}
