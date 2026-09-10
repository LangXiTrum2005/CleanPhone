package sg.bigo.ads.common.g.b;

import android.database.Cursor;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f47240c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f47241e;
    public long f;
    public long g;

    public a(Cursor cursor) {
        this.f47238a = -1L;
        this.f47238a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.f47239b = cursor.getString(cursor.getColumnIndex("event_action"));
        this.f47240c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.d = cursor.getInt(cursor.getColumnIndex("states"));
        this.f47241e = cursor.getString(cursor.getColumnIndex("ext"));
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
        if (obj.getClass() != a.class) {
            return false;
        }
        long j = this.f47238a;
        return j >= 0 && j == ((a) obj).f47238a;
    }

    public String toString() {
        return "mId = " + this.f47238a + ",eventInfo=" + this.f47240c;
    }

    public a(String str, String str2) {
        this.f47238a = -1L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f47239b = str;
        this.f47240c = str2;
        this.d = 0;
        this.f47241e = "";
        this.f = jCurrentTimeMillis;
        this.g = jCurrentTimeMillis;
    }
}
