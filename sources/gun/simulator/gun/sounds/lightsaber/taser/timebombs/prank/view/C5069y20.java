package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5069y20 implements C20, BI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5257a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C5069y20(long j, Sd0 sd0) {
        this.f5257a = 1;
        this.b = j;
        this.c = sd0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C20
    public final Object apply(Object obj) {
        int i = this.f5257a;
        int i2 = 1;
        long j = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                E20 e20 = (E20) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                e20.getClass();
                String[] strArr = {String.valueOf(j)};
                E20.p(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new A20(e20, i2));
                return Integer.valueOf(sQLiteDatabase.delete(com.umeng.analytics.pro.f.ax, "timestamp_ms < ?", strArr));
            default:
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                C4289p8 c4289p8 = (C4289p8) ((Sd0) obj2);
                String str = c4289p8.f4824a;
                HV hv = c4289p8.c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(JV.a(hv))}) < 1) {
                    contentValues.put("backend_name", c4289p8.f4824a);
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(JV.a(hv)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public final void invoke(Object obj) {
        ((InterfaceC3579h4) obj).getClass();
    }

    public /* synthetic */ C5069y20(Object obj, long j, int i) {
        this.f5257a = i;
        this.c = obj;
        this.b = j;
    }
}
