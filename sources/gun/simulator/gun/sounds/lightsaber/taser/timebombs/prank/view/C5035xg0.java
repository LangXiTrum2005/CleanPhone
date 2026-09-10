package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5035xg0 implements Ka0, C20, BI, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5239a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C5035xg0(C2881Xh c2881Xh, long j, HashMap map) {
        this.b = c2881Xh;
        this.f5239a = j;
        this.c = map;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C20
    public final Object apply(Object obj) {
        String str = (String) this.b;
        EnumC4302pJ enumC4302pJ = (EnumC4302pJ) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C3736ir c3736ir = E20.f;
        boolean zBooleanValue = ((Boolean) E20.p(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC4302pJ.f4830a)}), new Nd0(15))).booleanValue();
        long j = this.f5239a;
        int i = enumC4302pJ.f4830a;
        if (zBooleanValue) {
            sQLiteDatabase.execSQL(AbstractC5044xl.i("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j, " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ka0
    public final Object execute() {
        C5123yg0 c5123yg0 = (C5123yg0) this.b;
        Sd0 sd0 = (Sd0) this.c;
        long jA = ((C5211zg0) c5123yg0.g).a() + this.f5239a;
        E20 e20 = (E20) c5123yg0.c;
        e20.getClass();
        e20.k(new C5069y20(jA, sd0));
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public final void invoke(Object obj) {
        ((InterfaceC3579h4) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        C2881Xh c2881Xh = (C2881Xh) this.b;
        Map map = (Map) this.c;
        int[] iArr = C2881Xh.k;
        return c2881Xh.b(this.f5239a, task, map);
    }

    public /* synthetic */ C5035xg0(Object obj, Object obj2, long j) {
        this.b = obj;
        this.c = obj2;
        this.f5239a = j;
    }
}
