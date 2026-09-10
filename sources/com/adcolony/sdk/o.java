package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
class o {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0 f9284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SQLiteDatabase f9285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f9286c;
        final /* synthetic */ CountDownLatch d;

        public a(n0 n0Var, SQLiteDatabase sQLiteDatabase, b bVar, CountDownLatch countDownLatch) {
            this.f9284a = n0Var;
            this.f9285b = sQLiteDatabase;
            this.f9286c = bVar;
            this.d = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (n0.a aVar : this.f9284a.a()) {
                for (Map.Entry<String, String> entry : aVar.e().entrySet()) {
                    c cVarA = o.a(entry.getValue(), this.f9285b);
                    if (cVarA != null) {
                        this.f9286c.a(aVar.d(), entry.getKey(), cVarA);
                    }
                }
            }
            o0.c().a(this.f9286c);
            this.d.countDown();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, ArrayList<a>> f9288b;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f9289a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final c f9290b;

            public /* synthetic */ a(String str, c cVar, a aVar) {
                this(str, cVar);
            }

            public String a() {
                return this.f9289a;
            }

            public c b() {
                return this.f9290b;
            }

            private a(String str, c cVar) {
                this.f9289a = str;
                this.f9290b = cVar;
            }
        }

        public /* synthetic */ b(int i2, a aVar) {
            this(i2);
        }

        public f1 b() {
            f1 f1VarB = c0.b();
            c0.b(f1VarB, "version", a());
            for (Map.Entry<String, ArrayList<a>> entry : this.f9288b.entrySet()) {
                f1 f1VarB2 = c0.b();
                for (a aVar : entry.getValue()) {
                    e1 e1VarA = c0.a();
                    Iterator<String> it = aVar.b().a(Character.valueOf(AbstractJsonLexerKt.COMMA)).iterator();
                    while (it.hasNext()) {
                        e1VarA.b(it.next());
                    }
                    c0.a(f1VarB2, aVar.a(), e1VarA);
                }
                c0.a(f1VarB, entry.getKey(), f1VarB2);
            }
            return f1VarB;
        }

        private b(int i2) {
            this.f9288b = new ConcurrentHashMap();
            this.f9287a = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2, c cVar) {
            ArrayList<a> arrayList;
            a aVar = new a(str2, cVar, null);
            if (!this.f9288b.containsKey(str) || (arrayList = this.f9288b.get(str)) == null) {
                this.f9288b.put(str, new ArrayList<>(Collections.singletonList(aVar)));
            } else {
                arrayList.add(aVar);
            }
        }

        public int a() {
            return this.f9287a;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<a> f9291a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ContentValues> f9292b = new ArrayList();

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f9293a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f9294b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f9295c;

            public /* synthetic */ a(int i2, String str, int i3, a aVar) {
                this(i2, str, i3);
            }

            public int c() {
                return this.f9295c;
            }

            private a(int i2, String str, int i3) {
                this.f9293a = i2;
                this.f9294b = str;
                this.f9295c = i3;
            }

            public int a() {
                return this.f9293a;
            }

            public String b() {
                return this.f9294b;
            }
        }

        public int b(int i2) {
            if (i2 < 0 || i2 >= this.f9291a.size()) {
                return -1;
            }
            return this.f9291a.get(i2).c();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (true) {
                String str = " | ";
                if (i2 >= this.f9291a.size()) {
                    break;
                }
                sb.append(this.f9291a.get(i2).f9294b);
                if (i2 == this.f9291a.size() - 1) {
                    str = IOUtils.LINE_SEPARATOR_UNIX;
                }
                sb.append(str);
                i2++;
            }
            for (ContentValues contentValues : this.f9292b) {
                int i3 = 0;
                while (i3 < this.f9291a.size()) {
                    sb.append(contentValues.getAsString(a(i3)));
                    sb.append(i3 == this.f9291a.size() + (-1) ? IOUtils.LINE_SEPARATOR_UNIX : " | ");
                    i3++;
                }
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i2, String str, int i3) {
            this.f9291a.add(new a(i2, str, i3, null));
        }

        public String a(int i2) {
            if (i2 < 0 || i2 >= this.f9291a.size()) {
                return null;
            }
            return this.f9291a.get(i2).b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Cursor cursor) {
            ContentValues contentValues = new ContentValues();
            for (a aVar : this.f9291a) {
                int i2 = aVar.f9295c;
                if (i2 == 1) {
                    contentValues.put(aVar.b(), Long.valueOf(cursor.getLong(aVar.a())));
                } else if (i2 == 2) {
                    contentValues.put(aVar.b(), Double.valueOf(cursor.getDouble(aVar.a())));
                } else if (i2 != 4) {
                    contentValues.put(aVar.b(), cursor.getString(aVar.a()));
                } else {
                    contentValues.put(aVar.b(), cursor.getBlob(aVar.a()));
                }
            }
            this.f9292b.add(contentValues);
        }

        public String a(int i2, Character ch) {
            if (i2 < 0 || i2 >= this.f9292b.size()) {
                return null;
            }
            ContentValues contentValues = this.f9292b.get(i2);
            StringBuilder sb = new StringBuilder();
            int i3 = 0;
            while (i3 < this.f9291a.size()) {
                if (b(i3) == 3) {
                    sb.append("\"");
                    sb.append(contentValues.get(a(i3)));
                    sb.append("\"");
                } else {
                    sb.append(contentValues.getAsString(a(i3)));
                }
                sb.append(i3 == this.f9291a.size() + (-1) ? "" : ch);
                i3++;
            }
            return sb.toString();
        }

        public List<String> a(Character ch) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f9292b.size(); i2++) {
                arrayList.add(a(i2, ch));
            }
            return arrayList;
        }
    }

    public static b a(n0 n0Var, SQLiteDatabase sQLiteDatabase, Executor executor, long j) {
        b bVar = new b(n0Var.b(), null);
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            executor.execute(new a(n0Var, sQLiteDatabase, bVar, countDownLatch));
            if (j > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
                return bVar;
            }
            countDownLatch.await();
            return bVar;
        } catch (InterruptedException e2) {
            e = e2;
            new e0.a().a("ADCDbReader.calculateFeatureVectors failed with: " + e.toString()).a(e0.f9132i);
            return bVar;
        } catch (RejectedExecutionException e3) {
            e = e3;
            new e0.a().a("ADCDbReader.calculateFeatureVectors failed with: " + e.toString()).a(e0.f9132i);
            return bVar;
        }
    }

    public static c a(String str, SQLiteDatabase sQLiteDatabase) {
        c cVar;
        Throwable th;
        c cVar2 = null;
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str, null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        cVar = new c();
                        for (int i2 = 0; i2 < cursorRawQuery.getColumnCount(); i2++) {
                            try {
                                cVar.a(i2, cursorRawQuery.getColumnName(i2), cursorRawQuery.getType(i2));
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    cursorRawQuery.close();
                                    throw th;
                                } catch (Throwable th3) {
                                    try {
                                        th.addSuppressed(th3);
                                        throw th;
                                    } catch (SQLException e2) {
                                        e = e2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        new e0.a().a("Error on execute query: ").a(th.toString()).a(e0.f9132i);
                                        return cVar;
                                    }
                                }
                            }
                        }
                        do {
                            cVar.a(cursorRawQuery);
                        } while (cursorRawQuery.moveToNext());
                        cVar2 = cVar;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    cVar = null;
                }
            }
            if (cursorRawQuery == null) {
                return cVar2;
            }
            cursorRawQuery.close();
            return cVar2;
        } catch (SQLException e3) {
            e = e3;
            cVar = cVar2;
        } catch (Throwable th6) {
            th = th6;
            cVar = cVar2;
        }
        new e0.a().a("SQLException on execute query: ").a(e.toString()).a(e0.f9132i);
        return cVar;
    }
}
