package com.startapp.sdk.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Pair;
import com.inmobi.commons.core.configs.CrashConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9 f41622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m8 f41623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadPoolExecutor f41624c;
    public final c4 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f41625e;
    public final aa f;
    public final d4 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f41626h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f41627i = new AtomicLong();
    public final n9 j = new n9(this);
    public final o9 k = new o9(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p9 f41628l = new p9(this);
    public final q9 m = new q9(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v9 f41629n = new v9(this);

    public w9(k9 k9Var, m8 m8Var, ThreadPoolExecutor threadPoolExecutor, c4 c4Var, lb lbVar, aa aaVar, d4 d4Var) {
        this.f41622a = k9Var;
        this.f41623b = m8Var;
        this.f41624c = threadPoolExecutor;
        this.d = c4Var;
        this.f41625e = lbVar;
        this.f = aaVar;
        this.g = d4Var;
    }

    public final void a() {
        if (this.f41627i.compareAndSet(0L, SystemClock.uptimeMillis())) {
            k9 k9Var = this.f41622a;
            p9 p9Var = this.f41628l;
            synchronized (k9Var) {
                k9Var.f41181c.add(p9Var);
            }
            ((g6) this.f41625e.a()).a(this.j);
            ((g6) this.f41625e.a()).a();
            m8 m8Var = this.f41623b;
            m8Var.f41243a.post(new u9(this));
        }
    }

    public final void b(g9 g9Var) {
        j9 j9VarA = a(g9Var.f40999a);
        long jUptimeMillis = (this.f41627i.get() + j9VarA.f) - SystemClock.uptimeMillis();
        if (jUptimeMillis > 0) {
            a(jUptimeMillis);
            return;
        }
        k9 k9Var = this.f41622a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        k9Var.getClass();
        long j = g9Var.f41000b;
        k9.a(j, jCurrentTimeMillis);
        SQLiteDatabase sQLiteDatabaseA = k9Var.a();
        sQLiteDatabaseA.beginTransaction();
        try {
            int iA = k9.a(sQLiteDatabaseA, j);
            ContentValues contentValues = new ContentValues();
            contentValues.put("send", Long.valueOf(jCurrentTimeMillis));
            contentValues.put("attempt", Integer.valueOf(iA + 1));
            sQLiteDatabaseA.update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
            sQLiteDatabaseA.setTransactionSuccessful();
            sQLiteDatabaseA.endTransaction();
            q9 q9Var = this.m;
            Runnable runnable = (Runnable) this.f.a(g9Var, j9VarA, q9Var);
            if (runnable != null) {
                this.f41624c.execute(runnable);
            } else if (q9Var != null) {
                q9Var.a(g9Var, 0);
            }
        } catch (Throwable th) {
            sQLiteDatabaseA.endTransaction();
            throw th;
        }
    }

    public final j9 a(h9 h9Var) {
        j9 j9Var;
        Map mapB;
        AnalyticsCategoryConfig analyticsCategoryConfig;
        synchronized (this.f41626h) {
            try {
                Pair pair = (Pair) this.f41626h.get(h9Var.f41046a);
                j9Var = (pair == null || SystemClock.uptimeMillis() >= ((Long) pair.second).longValue()) ? null : (j9) pair.first;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j9Var != null) {
            return j9Var;
        }
        this.g.getClass();
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        if (analyticsConfigH != null && (mapB = analyticsConfigH.b()) != null && (analyticsCategoryConfig = (AnalyticsCategoryConfig) mapB.get(h9Var.f41046a)) != null) {
            j9Var = new j9(h9Var.f41047b, analyticsCategoryConfig);
        }
        if (j9Var == null) {
            j9Var = h9Var.f41047b;
        }
        synchronized (this.f41626h) {
            this.f41626h.put(h9Var.f41046a, new Pair(j9Var, Long.valueOf(SystemClock.uptimeMillis() + CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL)));
        }
        return j9Var;
    }

    public final void b() {
        this.f41623b.f41243a.removeCallbacks(this.k);
        if (!((g6) this.f41625e.a()).b()) {
            this.g.getClass();
            AnalyticsConfig analyticsConfigH = MetaData.E().h();
            a(analyticsConfigH != null ? Math.max(300000L, vi.e(analyticsConfigH.f())) : 300000L);
        } else {
            int iMax = Math.max(1, ((Integer) this.d.a()).intValue());
            this.g.getClass();
            AnalyticsConfig analyticsConfigH2 = MetaData.E().h();
            try {
                this.f41622a.a(this.f41629n, analyticsConfigH2 != null ? Math.max(1, analyticsConfigH2.g()) : 1, iMax);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(g9 g9Var) {
        this.g.getClass();
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        if (analyticsConfigH == null || analyticsConfigH.k()) {
            return;
        }
        j9 j9VarA = a(g9Var.f40999a);
        if (Math.random() >= j9VarA.f41136a) {
            return;
        }
        if (j9VarA.d) {
            m8 m8Var = this.f41623b;
            m8Var.f41243a.post(new s9(this, g9Var, j9VarA));
        } else if (((g6) this.f41625e.a()).b()) {
            long jUptimeMillis = (this.f41627i.get() + j9VarA.f) - SystemClock.uptimeMillis();
            if (jUptimeMillis > 0) {
                m8 m8Var2 = this.f41623b;
                m8Var2.f41243a.postDelayed(new t9(this, g9Var, j9VarA), jUptimeMillis);
            } else {
                Runnable runnable = (Runnable) this.f.a(g9Var, j9VarA, null);
                if (runnable != null) {
                    this.f41624c.execute(runnable);
                }
            }
        }
    }

    public final void a(long j) {
        if (j < 0) {
            j = 0;
        }
        this.f41623b.f41243a.postDelayed(this.k, j);
    }

    public final void a(g9 g9Var, int i2, long j) {
        if (i2 == 1) {
            k9 k9Var = this.f41622a;
            k9Var.getClass();
            long j2 = g9Var.f41000b;
            k9.a(j2, j);
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendSuccess", Long.valueOf(j));
            k9Var.a().update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
            a(0L);
            return;
        }
        this.g.getClass();
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        int iMax = analyticsConfigH != null ? Math.max(1, analyticsConfigH.g()) : 1;
        k9 k9Var2 = this.f41622a;
        k9Var2.getClass();
        long j3 = g9Var.f41000b;
        k9.a(j3, j);
        SQLiteDatabase sQLiteDatabaseA = k9Var2.a();
        sQLiteDatabaseA.beginTransaction();
        try {
            if (k9.a(sQLiteDatabaseA, j3) >= iMax) {
                sQLiteDatabaseA.delete("events", "rowid = ?", new String[]{String.valueOf(j3)});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("sendFailure", Long.valueOf(j));
                sQLiteDatabaseA.update("events", contentValues2, "rowid = ?", new String[]{String.valueOf(j3)});
            }
            sQLiteDatabaseA.setTransactionSuccessful();
            sQLiteDatabaseA.endTransaction();
            this.g.getClass();
            AnalyticsConfig analyticsConfigH2 = MetaData.E().h();
            a(analyticsConfigH2 != null ? Math.max(1000L, analyticsConfigH2.h()) : 1000L);
        } catch (Throwable th) {
            sQLiteDatabaseA.endTransaction();
            throw th;
        }
    }
}
