package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class B20 implements C20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2850a;
    public final /* synthetic */ long b;

    public /* synthetic */ B20(long j, int i) {
        this.f2850a = i;
        this.b = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C20
    public final Object apply(Object obj) {
        int i = this.f2850a;
        long j = this.b;
        switch (i) {
            case 0:
                return (Cc0) E20.p(((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new B20(j, 1));
            default:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                return new Cc0(cursor.getLong(0), j);
        }
    }
}
