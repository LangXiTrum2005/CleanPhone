package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A20 implements C20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2797a;
    public final /* synthetic */ E20 b;

    public /* synthetic */ A20(E20 e20, int i) {
        this.f2797a = i;
        this.b = e20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C20
    public final Object apply(Object obj) {
        int i = this.f2797a;
        E20 e20 = this.b;
        switch (i) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                e20.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ((C5211zg0) e20.b).a()).execute();
                break;
            case 1:
                Cursor cursor = (Cursor) obj;
                e20.getClass();
                while (cursor.moveToNext()) {
                    e20.k(new C5035xg0(cursor.getString(1), EnumC4302pJ.MESSAGE_TOO_OLD, cursor.getInt(0)));
                }
                break;
            default:
                Cursor cursor2 = (Cursor) obj;
                e20.getClass();
                while (cursor2.moveToNext()) {
                    e20.k(new C5035xg0(cursor2.getString(1), EnumC4302pJ.MAX_RETRIES_REACHED, cursor2.getInt(0)));
                }
                break;
        }
        return null;
    }
}
