package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4683tg0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5123yg0 f5045a;
    public final /* synthetic */ Sd0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ RunnableC4683tg0(C5123yg0 c5123yg0, C4289p8 c4289p8, int i, Runnable runnable) {
        this.f5045a = c5123yg0;
        this.b = c4289p8;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        Sd0 sd0 = this.b;
        int i = this.c;
        Runnable runnable = this.d;
        C5123yg0 c5123yg0 = this.f5045a;
        InterfaceC3466fm0 interfaceC3466fm0 = c5123yg0.d;
        La0 la0 = c5123yg0.f;
        try {
            try {
                InterfaceC3562gs interfaceC3562gs = c5123yg0.c;
                Objects.requireNonNull(interfaceC3562gs);
                ((E20) la0).n(new Md0(interfaceC3562gs, 5));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) c5123yg0.f5290a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    E20 e20 = (E20) la0;
                    SQLiteDatabase sQLiteDatabaseH = e20.h();
                    Nd0 nd0 = new Nd0(9);
                    C5211zg0 c5211zg0 = (C5211zg0) e20.c;
                    long jA = c5211zg0.a();
                    while (true) {
                        try {
                            sQLiteDatabaseH.beginTransaction();
                            sQLiteDatabase = sQLiteDatabaseH;
                            break;
                        } catch (SQLiteDatabaseLockedException e) {
                            sQLiteDatabase = sQLiteDatabaseH;
                            if (c5211zg0.a() >= ((long) e20.d.c) + jA) {
                                nd0.apply(e);
                                break;
                            } else {
                                SystemClock.sleep(50L);
                                sQLiteDatabaseH = sQLiteDatabase;
                            }
                        }
                    }
                    try {
                        ((FE) interfaceC3466fm0).a(sd0, i + 1, false);
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th) {
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } else {
                    c5123yg0.a(sd0, i);
                }
            } catch (Ja0 unused) {
                ((FE) interfaceC3466fm0).a(sd0, i + 1, false);
            }
            runnable.run();
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }
}
