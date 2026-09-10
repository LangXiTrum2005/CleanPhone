package qd;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Date f49005e = new Date(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Date f49006f = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f49007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f49008b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f49009c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f49010d = new Object();

    public m(SharedPreferences sharedPreferences) {
        this.f49007a = sharedPreferences;
    }

    public final l a() {
        l lVar;
        synchronized (this.f49009c) {
            int i10 = this.f49007a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f49007a.getLong("backoff_end_time_in_millis", -1L));
            lVar = new l();
            lVar.f49003a = i10;
            lVar.f49004b = date;
        }
        return lVar;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f49007a.getString("customSignals", JsonUtils.EMPTY_JSON));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final l c() {
        l lVar;
        synchronized (this.f49010d) {
            int i10 = this.f49007a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f49007a.getLong("realtime_backoff_end_time_in_millis", -1L));
            lVar = new l();
            lVar.f49003a = i10;
            lVar.f49004b = date;
        }
        return lVar;
    }

    public final void d(int i10, Date date) {
        synchronized (this.f49009c) {
            this.f49007a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i10, Date date) {
        synchronized (this.f49010d) {
            this.f49007a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
