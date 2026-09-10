package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.j;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47248c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f47249e;
    public long f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, String> f47250h;

    public c(Cursor cursor) {
        this.f47246a = -1L;
        this.f47247b = false;
        this.f47248c = 0;
        this.d = 0L;
        this.f47249e = "";
        this.f47246a = cursor.getLong(cursor.getColumnIndex("_id"));
        try {
            this.f47250h = j.a(new JSONObject(cursor.getString(cursor.getColumnIndex("ad_data"))));
        } catch (JSONException unused) {
        }
        a(cursor.getString(cursor.getColumnIndex("tracker_imp")));
        b(cursor.getString(cursor.getColumnIndex("tracker_cli")));
        c(cursor.getString(cursor.getColumnIndex("tracker_nurl")));
        d(cursor.getString(cursor.getColumnIndex("tracker_lurl")));
        this.f47248c = cursor.getInt(cursor.getColumnIndex("tracker_type"));
        this.d = cursor.getLong(cursor.getColumnIndex("last_retry_ts"));
        this.f47249e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.g = cursor.getLong(cursor.getColumnIndex("mtime"));
        this.f47247b = true;
    }

    public final String a() {
        Map<String, String> map = this.f47250h;
        if (map == null) {
            return "";
        }
        if ((map instanceof HashMap) && map != null) {
            map.remove(null);
            map.values().removeAll(Collections.singleton(null));
        }
        return new JSONObject(this.f47250h).toString();
    }

    public abstract void a(String str);

    public abstract String b();

    public abstract void b(String str);

    public abstract String c();

    public abstract void c(String str);

    public abstract String d();

    public abstract void d(String str);

    public abstract String e();

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != c.class) {
            return false;
        }
        long j = this.f47246a;
        return j >= 0 && j == ((c) obj).f47246a;
    }

    public long f() {
        return 0L;
    }

    public String toString() {
        return "mId = " + this.f47246a;
    }

    public c(Map<String, String> map) {
        this.f47246a = -1L;
        this.f47247b = false;
        this.f47248c = 0;
        this.d = 0L;
        this.f47249e = "";
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f47250h = map;
        this.f = jCurrentTimeMillis;
        this.g = jCurrentTimeMillis;
    }
}
