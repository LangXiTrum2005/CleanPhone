package sg.bigo.ads.common.g.b;

import android.database.Cursor;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f47244c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f47245e;
    public long f;
    public long g;

    public b(Cursor cursor) {
        this.f47242a = -1L;
        this.f47242a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.f47243b = cursor.getString(cursor.getColumnIndex("event_id"));
        this.f47244c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.d = cursor.getLong(cursor.getColumnIndex("expired_ts"));
        this.f47245e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != b.class) {
            return false;
        }
        long j = this.f47242a;
        return j >= 0 && j == ((b) obj).f47242a;
    }

    public String toString() {
        return "mId = " + this.f47242a + ",mEventId = " + this.f47243b + ",mExpiredTs = " + this.d + ",eventInfo = " + this.f47244c;
    }

    public b(String str, String str2, long j) {
        this.f47242a = -1L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f47243b = str;
        this.f47244c = str2;
        this.d = j;
        this.f47245e = "";
        this.f = jCurrentTimeMillis;
        this.g = jCurrentTimeMillis;
    }
}
