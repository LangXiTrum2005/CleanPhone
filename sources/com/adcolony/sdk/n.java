package com.adcolony.sdk;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.p004ironsource.dc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f9264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f9265b;

    public n(SQLiteDatabase sQLiteDatabase, n0 n0Var) {
        this.f9264a = sQLiteDatabase;
        this.f9265b = n0Var;
    }

    private void a(n0.a aVar, List<String> list) {
        a(aVar.f(), "manager_tmp_table");
        c(aVar);
        a("manager_tmp_table", aVar.f(), list);
        b("manager_tmp_table");
    }

    private void c(n0.c cVar, String str) {
        ArrayList<String[]> arrayListC = c(cVar.b());
        boolean z2 = true;
        if (cVar.a().length == arrayListC.size()) {
            boolean z3 = false;
            for (int i2 = 0; i2 < cVar.a().length; i2++) {
                if (!Objects.equals(cVar.a()[i2], arrayListC.get(i2)[2])) {
                    z3 = true;
                }
            }
            z2 = z3;
        }
        if (z2) {
            a(cVar.b());
            b(cVar, str);
        }
    }

    private void d(n0.a aVar) {
        List<n0.c> listB = aVar.b();
        ArrayList<String> arrayListD = d(aVar.f());
        for (n0.c cVar : listB) {
            if (arrayListD.contains(cVar.b())) {
                c(cVar, aVar.f());
            } else {
                b(cVar, aVar.f());
            }
            arrayListD.remove(cVar.b());
        }
        Iterator<String> it = arrayListD.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    private void e(n0.a aVar) {
        boolean zA;
        boolean z2;
        ArrayList<a> arrayListG = g(aVar.f());
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (n0.b bVar : aVar.a()) {
            int size = arrayListG.size() - 1;
            while (true) {
                if (size < 0) {
                    zA = false;
                    z2 = false;
                    break;
                }
                a aVar2 = arrayListG.get(size);
                if (Objects.equals(aVar2.a(), bVar.b())) {
                    arrayList.add(bVar.b());
                    zA = aVar2.a(bVar);
                    arrayListG.remove(size);
                    z2 = true;
                    break;
                }
                size--;
            }
            if (!z2 || !zA) {
                z3 = true;
            }
        }
        if (arrayListG.size() > 0) {
            z3 = true;
        }
        if (!z3) {
            d(aVar);
        } else {
            a(aVar, arrayList);
            b(aVar);
        }
    }

    public boolean b() {
        int version = this.f9264a.getVersion();
        this.f9264a.beginTransaction();
        boolean z2 = false;
        try {
            try {
                List<n0.a> listA = this.f9265b.a();
                ArrayList<String> arrayListA = a();
                for (n0.a aVar : listA) {
                    if (arrayListA.contains(aVar.f())) {
                        e(aVar);
                    } else {
                        c(aVar);
                        b(aVar);
                    }
                    arrayListA.remove(aVar.f());
                }
                Iterator<String> it = arrayListA.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
                this.f9264a.setVersion(this.f9265b.b());
                this.f9264a.setTransactionSuccessful();
                z2 = true;
                new e0.a().a("Success upgrading database from ").a(version).a(" to ").a(this.f9265b.b()).a(e0.f9130e);
            } catch (SQLException e2) {
                new e0.a().a("Upgrading database from ").a(version).a(" to ").a(this.f9265b.b()).a("caused: ").a(e2.toString()).a(e0.g);
            }
            return z2;
        } finally {
            this.f9264a.endTransaction();
        }
    }

    public ArrayList<String> f(String str) {
        Cursor cursorRawQuery = this.f9264a.rawQuery("SELECT name FROM sqlite_master  WHERE type='" + str + "' ORDER BY name", null);
        ArrayList<String> arrayList = new ArrayList<>();
        if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
            do {
                arrayList.add(cursorRawQuery.getString(0));
            } while (cursorRawQuery.moveToNext());
        }
        cursorRawQuery.close();
        return arrayList;
    }

    public ArrayList<a> g(String str) {
        ArrayList<a> arrayList = new ArrayList<>();
        Iterator<String[]> it = e(android.support.v4.media.a.n("PRAGMA table_info(", str, ")")).iterator();
        while (it.hasNext()) {
            a aVarA = a.a(it.next());
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return arrayList;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9268c;

        private a(String[] strArr) {
            this.f9266a = strArr[1];
            this.f9267b = strArr[2];
            this.f9268c = strArr[4];
        }

        public static a a(String[] strArr) {
            if (strArr.length >= 5) {
                return new a(strArr);
            }
            return null;
        }

        public boolean a(n0.b bVar) {
            return Objects.equals(this.f9266a, bVar.b()) && Objects.equals(this.f9267b, bVar.c()) && Objects.equals(this.f9268c, bVar.a());
        }

        public String a() {
            return this.f9266a;
        }
    }

    private void a(String str) {
        this.f9264a.execSQL("DROP INDEX " + str);
    }

    private String a(n0.a aVar) {
        String string;
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        sb.append(aVar.f());
        sb.append(" (");
        for (int i2 = 0; i2 < aVar.a().size(); i2++) {
            n0.b bVar = aVar.a().get(i2);
            sb.append(bVar.b());
            sb.append(" ");
            sb.append(bVar.c());
            if (bVar.a() != null) {
                if (bVar.a() instanceof Boolean) {
                    string = ((Boolean) bVar.a()).booleanValue() ? "1" : "0";
                } else if (bVar.a() instanceof String) {
                    string = android.support.v4.media.a.q(new StringBuilder("'"), bVar.a(), "'");
                } else {
                    string = bVar.a().toString();
                }
                sb.append(" DEFAULT ");
                sb.append(string);
            }
            if (i2 < aVar.a().size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    private void c(n0.a aVar) {
        this.f9264a.execSQL(a(aVar));
    }

    public ArrayList<String[]> c(String str) {
        return e(android.support.v4.media.a.n("PRAGMA index_info(", str, ")"));
    }

    public ArrayList<String> d(String str) {
        ArrayList<String[]> arrayListE = e(android.support.v4.media.a.n("PRAGMA index_list(", str, ")"));
        ArrayList<String> arrayList = new ArrayList<>();
        for (String[] strArr : arrayListE) {
            if (strArr.length >= 3) {
                arrayList.add(strArr[1]);
            }
        }
        return arrayList;
    }

    public ArrayList<String[]> e(String str) {
        Cursor cursorRawQuery = this.f9264a.rawQuery(str, null);
        ArrayList<String[]> arrayList = new ArrayList<>();
        if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
            do {
                int columnCount = cursorRawQuery.getColumnCount();
                String[] strArr = new String[columnCount];
                for (int i2 = 0; i2 < columnCount; i2++) {
                    strArr[i2] = cursorRawQuery.getString(i2);
                }
                arrayList.add(strArr);
            } while (cursorRawQuery.moveToNext());
        }
        cursorRawQuery.close();
        return arrayList;
    }

    private String a(n0.c cVar, String str) {
        String strJoin = TextUtils.join(", ", cVar.a());
        StringBuilder sb = new StringBuilder("CREATE INDEX ");
        androidx.media3.extractor.text.ttml.a.C(sb, cVar.b(), " ON ", str, "(");
        return android.support.v4.media.a.r(sb, strJoin, ")");
    }

    private void b(n0.a aVar) {
        Iterator<n0.c> it = aVar.b().iterator();
        while (it.hasNext()) {
            b(it.next(), aVar.f());
        }
    }

    private void b(n0.c cVar, String str) {
        this.f9264a.execSQL(a(cVar, str));
    }

    private void b(String str) {
        this.f9264a.execSQL("DROP TABLE " + str);
    }

    private void a(String str, String str2) {
        this.f9264a.execSQL("ALTER TABLE " + str + " RENAME TO " + str2);
    }

    private void a(String str, String str2, List<String> list) {
        String strJoin = TextUtils.join(", ", list);
        SQLiteDatabase sQLiteDatabase = this.f9264a;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("INSERT INTO ", str2, " (", strJoin, ") SELECT ");
        sbQ.append(strJoin);
        sbQ.append(" FROM ");
        sbQ.append(str);
        sQLiteDatabase.execSQL(sbQ.toString());
    }

    public ArrayList<String> a() {
        ArrayList<String> arrayListF = f(dc.f24777Q);
        for (int size = arrayListF.size() - 1; size >= 0; size--) {
            String str = arrayListF.get(size);
            if (str.startsWith("android_") || str.startsWith("sqlite_")) {
                arrayListF.remove(size);
            }
        }
        return arrayListF;
    }
}
