package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.SharedPreferences;
import java.util.Date;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3633hi {
    public static final Date e = new Date(-1);
    public static final Date f = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4465a;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();

    public C3633hi(SharedPreferences sharedPreferences) {
        this.f4465a = sharedPreferences;
    }

    public final C3545gi a() {
        C3545gi c3545gi;
        synchronized (this.c) {
            c3545gi = new C3545gi(this.f4465a.getInt("num_failed_fetches", 0), new Date(this.f4465a.getLong("backoff_end_time_in_millis", -1L)), 0);
        }
        return c3545gi;
    }

    public final C3545gi b() {
        C3545gi c3545gi;
        synchronized (this.d) {
            c3545gi = new C3545gi(this.f4465a.getInt("num_failed_realtime_streams", 0), new Date(this.f4465a.getLong("realtime_backoff_end_time_in_millis", -1L)), 1);
        }
        return c3545gi;
    }

    public final void c(int i, Date date) {
        synchronized (this.c) {
            this.f4465a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(String str) {
        synchronized (this.b) {
            this.f4465a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void e(int i, Date date) {
        synchronized (this.d) {
            this.f4465a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void f() {
        synchronized (this.b) {
            this.f4465a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void g() {
        synchronized (this.b) {
            this.f4465a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
