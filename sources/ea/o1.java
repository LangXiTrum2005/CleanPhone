package ea;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.z8;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n4 f39664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f39665c;

    public /* synthetic */ o1(s1 s1Var, n4 n4Var, int i10) {
        this.f39663a = i10;
        this.f39664b = n4Var;
        this.f39665c = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f39663a) {
            case 0:
                s1 s1Var = this.f39665c;
                s1Var.f39761a.V();
                s1Var.f39761a.Y(this.f39664b);
                break;
            case 1:
                s1 s1Var2 = this.f39665c;
                s1Var2.f39761a.V();
                e4 e4Var = s1Var2.f39761a;
                e4Var.P().G0();
                e4Var.m0();
                n4 n4Var = this.f39664b;
                k9.c0.h(n4Var);
                String str = n4Var.f39628a;
                k9.c0.e(str);
                int i10 = 0;
                if (e4Var.e0().R0(null, d0.f39341y0)) {
                    ((p9.b) e4Var.i0()).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iP0 = e4Var.e0().P0(null, d0.f39308h0);
                    e4Var.e0();
                    long jLongValue = jCurrentTimeMillis - ((Long) d0.f39299e.a(null)).longValue();
                    while (i10 < iP0 && e4Var.F(jLongValue, null)) {
                        i10++;
                    }
                } else {
                    e4Var.e0();
                    long jIntValue = ((Integer) d0.l.a(null)).intValue();
                    while (i10 < jIntValue && e4Var.F(0L, str)) {
                        i10++;
                    }
                }
                if (e4Var.e0().R0(null, d0.f39343z0)) {
                    e4Var.P().G0();
                    e4Var.E();
                }
                b4 b4Var = e4Var.f39380j;
                int iA = com.google.android.gms.internal.measurement.f2.a(n4Var.E);
                b4Var.G0();
                if (iA == 2 && !b4.J0(str)) {
                    f1 f1Var = b4Var.f39807b.f39371a;
                    e4.T(f1Var);
                    z8 z8VarS0 = f1Var.S0(str);
                    if (z8VarS0 != null && z8VarS0.I() && !z8VarS0.J().v().isEmpty()) {
                        e4Var.t().f39760n.c(str, "[sgtm] Going background, trigger client side upload. appId");
                        ((p9.b) e4Var.i0()).getClass();
                        e4Var.m(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 2:
                s1 s1Var3 = this.f39665c;
                s1Var3.f39761a.V();
                e4 e4Var2 = s1Var3.f39761a;
                e4Var2.P().G0();
                e4Var2.m0();
                n4 n4Var2 = this.f39664b;
                k9.c0.e(n4Var2.f39628a);
                e4Var2.c0(n4Var2);
                break;
            case 3:
                s1 s1Var4 = this.f39665c;
                s1Var4.f39761a.V();
                e4 e4Var3 = s1Var4.f39761a;
                if (e4Var3.f39394y != null) {
                    ArrayList arrayList = new ArrayList();
                    e4Var3.f39395z = arrayList;
                    arrayList.addAll(e4Var3.f39394y);
                }
                m mVar = e4Var3.f39373c;
                e4.T(mVar);
                m1 m1Var = (m1) mVar.f3623a;
                n4 n4Var3 = this.f39664b;
                String str2 = n4Var3.f39628a;
                k9.c0.h(str2);
                k9.c0.e(str2);
                mVar.G0();
                mVar.H0();
                try {
                    SQLiteDatabase sQLiteDatabaseX1 = mVar.x1();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseX1.delete("apps", "app_id=?", strArr) + sQLiteDatabaseX1.delete("events", "app_id=?", strArr) + sQLiteDatabaseX1.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseX1.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseX1.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseX1.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseX1.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseX1.delete("queue", "app_id=?", strArr) + sQLiteDatabaseX1.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseX1.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseX1.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseX1.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseX1.delete("upload_queue", "app_id=?", strArr);
                    if (m1Var.f39585d.R0(null, d0.f39295c1)) {
                        iDelete += sQLiteDatabaseX1.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseX1.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        s0 s0Var = m1Var.f39587f;
                        m1.h(s0Var);
                        s0Var.f39760n.d("Reset analytics data. app, records", str2, Integer.valueOf(iDelete2));
                    }
                } catch (SQLiteException e10) {
                    s0 s0Var2 = m1Var.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39753f.d("Error resetting analytics data. appId, error", s0.O0(str2), e10);
                }
                if (n4Var3.f39635h) {
                    e4Var3.Y(n4Var3);
                }
                break;
            case 4:
                s1 s1Var5 = this.f39665c;
                s1Var5.f39761a.V();
                e4 e4Var4 = s1Var5.f39761a;
                e4Var4.P().G0();
                e4Var4.m0();
                n4 n4Var4 = this.f39664b;
                k9.c0.e(n4Var4.f39628a);
                e4Var4.n0(n4Var4);
                e4Var4.o0(n4Var4);
                break;
            case 5:
                e4 e4Var5 = this.f39665c.f39761a;
                e4Var5.V();
                e4Var5.o0(this.f39664b);
                break;
            default:
                e4 e4Var6 = this.f39665c.f39761a;
                e4Var6.V();
                e4Var6.n0(this.f39664b);
                break;
        }
    }
}
