package com.adcolony.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
class v {
    private static v f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SQLiteDatabase f9414b;
    private c d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f9413a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9415c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<String> f9416e = new HashSet();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1 f9417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f9418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f9419c;

        public a(f1 f1Var, x xVar, Context context) {
            this.f9417a = f1Var;
            this.f9418b = xVar;
            this.f9419c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            n0 n0VarA = n0.a(this.f9417a);
            if (n0VarA != null) {
                v.this.a(n0VarA, (x<n0>) this.f9418b, this.f9419c);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ContentValues f9421b;

        public b(String str, ContentValues contentValues) {
            this.f9420a = str;
            this.f9421b = contentValues;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.b(this.f9420a, this.f9421b);
        }
    }

    public interface c {
        void a();
    }

    public void b() {
        this.f9416e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, ContentValues contentValues) {
        p.a(str, contentValues, this.f9414b);
    }

    public static v a() {
        if (f == null) {
            synchronized (v.class) {
                try {
                    if (f == null) {
                        f = new v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public void a(c cVar) {
        this.d = cVar;
    }

    public void a(f1 f1Var, x<n0> xVar) {
        Context applicationContext = com.adcolony.sdk.a.c() ? com.adcolony.sdk.a.a().getApplicationContext() : null;
        if (applicationContext == null || f1Var == null) {
            return;
        }
        try {
            this.f9413a.execute(new a(f1Var, xVar, applicationContext));
        } catch (RejectedExecutionException e2) {
            new e0.a().a("ADCEventsRepository.open failed with: " + e2.toString()).a(e0.f9132i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(n0 n0Var, x<n0> xVar, Context context) {
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f9414b;
                boolean z2 = false;
                if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                    this.f9414b = context.openOrCreateDatabase("adc_events_db", 0, null);
                }
                if (this.f9414b.needUpgrade(n0Var.b())) {
                    if (a(n0Var) && this.d != null) {
                        z2 = true;
                    }
                    this.f9415c = z2;
                    if (z2) {
                        this.d.a();
                    }
                } else {
                    this.f9415c = true;
                }
                if (this.f9415c) {
                    xVar.a(n0Var);
                }
            } catch (SQLiteException e2) {
                new e0.a().a("Database cannot be opened").a(e2.toString()).a(e0.g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean a(n0 n0Var) {
        return new n(this.f9414b, n0Var).b();
    }

    public void a(n0.a aVar, ContentValues contentValues) {
        long jLongValue;
        String strA;
        if (aVar == null || this.f9416e.contains(aVar.f())) {
            return;
        }
        this.f9416e.add(aVar.f());
        int iC = aVar.c();
        n0.d dVarG = aVar.g();
        if (dVarG != null) {
            jLongValue = contentValues.getAsLong(dVarG.a()).longValue() - dVarG.b();
            strA = dVarG.a();
        } else {
            jLongValue = -1;
            strA = null;
        }
        p.a(iC, jLongValue, strA, aVar.f(), this.f9414b);
    }

    public void a(String str, ContentValues contentValues) {
        if (this.f9415c) {
            try {
                this.f9413a.execute(new b(str, contentValues));
            } catch (RejectedExecutionException e2) {
                new e0.a().a("ADCEventsRepository.saveEvent failed with: " + e2.toString()).a(e0.f9132i);
            }
        }
    }

    public o.b a(n0 n0Var, long j) {
        if (this.f9415c) {
            return o.a(n0Var, this.f9414b, this.f9413a, j);
        }
        return null;
    }
}
