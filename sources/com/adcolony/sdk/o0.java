package com.adcolony.sdk;

import android.content.ContentValues;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
class o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static o0 f9296e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n0 f9297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f9298b = z0.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o.b f9299c = null;
    private boolean d = false;

    public class a implements x<o.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o.b[] f9300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f9301b;

        public a(o0 o0Var, o.b[] bVarArr, CountDownLatch countDownLatch) {
            this.f9300a = bVarArr;
            this.f9301b = countDownLatch;
        }

        @Override // com.adcolony.sdk.x
        public void a(o.b bVar) {
            this.f9300a[0] = bVar;
            this.f9301b.countDown();
        }
    }

    public class b implements x<o.b> {
        public b(o0 o0Var) {
        }

        @Override // com.adcolony.sdk.x
        public void a(o.b bVar) {
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f9302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f9303b;

        public c(x xVar, long j) {
            this.f9302a = xVar;
            this.f9303b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9302a.a(o0.this.d ? o0.this.f9299c : v.a().a(o0.this.f9297a, this.f9303b));
        }
    }

    public void d() {
        this.d = false;
    }

    public static o0 c() {
        if (f9296e == null) {
            synchronized (o0.class) {
                try {
                    if (f9296e == null) {
                        f9296e = new o0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9296e;
    }

    public void a(n0 n0Var) {
        this.f9297a = n0Var;
    }

    public o.b b() {
        return this.f9299c;
    }

    public void a(h0 h0Var) {
        f1 f1VarA;
        f1 f1VarN;
        String strP;
        n0.a aVarA;
        if (this.f9297a == null || (f1VarA = h0Var.a()) == null || (f1VarN = f1VarA.n("payload")) == null || (aVarA = this.f9297a.a((strP = f1VarN.p("request_type")))) == null) {
            return;
        }
        a(strP, f1VarN, aVarA);
    }

    private void a(String str, f1 f1Var, n0.a aVar) {
        try {
            ContentValues contentValuesA = a(f1Var, aVar);
            v.a().a(aVar.f(), contentValuesA);
            v.a().a(aVar, contentValuesA);
            d();
        } catch (NullPointerException | NumberFormatException e2) {
            e2.printStackTrace();
            new e0.a().a(android.support.v4.media.a.n("Error parsing event:", str, " ")).a(f1Var.toString()).a(android.support.v4.media.a.i(this.f9297a.b(), " ", new StringBuilder("Schema version: "))).a(" e: ").a(e2.toString()).a(e0.g);
        }
    }

    public static ContentValues a(f1 f1Var, n0.a aVar) throws NumberFormatException, NullPointerException {
        ContentValues contentValues = new ContentValues();
        for (n0.b bVar : aVar.a()) {
            Object objO = f1Var.o(bVar.b());
            if (objO != null) {
                if (objO instanceof Boolean) {
                    contentValues.put(bVar.b(), (Boolean) objO);
                } else if (objO instanceof Long) {
                    contentValues.put(bVar.b(), (Long) objO);
                } else if (objO instanceof Double) {
                    contentValues.put(bVar.b(), (Double) objO);
                } else if (objO instanceof Number) {
                    Number number = (Number) objO;
                    if (number.doubleValue() == number.longValue() && "INTEGER".equalsIgnoreCase(bVar.c())) {
                        contentValues.put(bVar.b(), Long.valueOf(number.longValue()));
                    } else {
                        contentValues.put(bVar.b(), Double.valueOf(number.doubleValue()));
                    }
                } else if (objO instanceof String) {
                    contentValues.put(bVar.b(), (String) objO);
                }
            }
        }
        return contentValues;
    }

    public o.b a(long j) {
        o.b[] bVarArr = new o.b[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a(new a(this, bVarArr, countDownLatch), j);
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return bVarArr[0];
    }

    public void a() {
        a(new b(this));
    }

    public void a(x<o.b> xVar) {
        a(xVar, -1L);
    }

    public void a(x<o.b> xVar, long j) {
        if (this.f9297a == null) {
            xVar.a(null);
        } else if (this.d) {
            xVar.a(this.f9299c);
        } else {
            if (z0.a(this.f9298b, new c(xVar, j))) {
                return;
            }
            new e0.a().a("Execute ADCOdtEventsListener.calculateFeatureVectors failed").a(e0.f9132i);
        }
    }

    public void a(o.b bVar) {
        this.f9299c = bVar;
        this.d = true;
    }
}
