package tb;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.google.android.gms.internal.ads.z40;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import y1.t;
import y1.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements tc.a, z8.b, t, y8.f, d, OnCompleteListener, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50708c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f50706a = i10;
        this.f50707b = obj;
        this.f50708c = obj2;
    }

    @Override // y1.t
    public int a(Object obj) {
        Context context = (Context) this.f50707b;
        i1.p pVar = (i1.p) this.f50708c;
        y1.m mVar = (y1.m) obj;
        String str = mVar.f54128b;
        return ((str.equals(pVar.f42643n) || str.equals(u.c(pVar))) && mVar.c(context, pVar, false) && mVar.d(pVar)) ? 1 : 0;
    }

    @Override // y8.f
    public Object apply(Object obj) {
        y8.h hVar = (y8.h) this.f50707b;
        r8.i iVar = (r8.i) this.f50708c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        y8.a aVar = hVar.f54342d;
        ArrayList arrayListK = hVar.k(sQLiteDatabase, iVar, aVar.f54327b);
        for (o8.d dVar : o8.d.values()) {
            if (dVar != iVar.f49491c) {
                int size = aVar.f54327b - arrayListK.size();
                if (size <= 0) {
                    break;
                }
                arrayListK.addAll(hVar.k(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayListK.size(); i10++) {
            sb2.append(((y8.b) arrayListK.get(i10)).f54331a);
            if (i10 < arrayListK.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", X3.i.X}, sb2.toString(), null, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            while (cursor.moveToNext()) {
                long j10 = cursor.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j10));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j10), hashSet);
                }
                hashSet.add(new y8.g(cursor.getString(1), cursor.getString(2)));
            }
            cursorQuery.close();
            ListIterator listIterator = arrayListK.listIterator();
            while (listIterator.hasNext()) {
                y8.b bVar = (y8.b) listIterator.next();
                long j11 = bVar.f54331a;
                if (map.containsKey(Long.valueOf(j11))) {
                    z40 z40VarC = bVar.f54333c.c();
                    for (y8.g gVar : (Set) map.get(Long.valueOf(j11))) {
                        z40VarC.a(gVar.f54336a, gVar.f54337b);
                    }
                    listIterator.set(new y8.b(j11, bVar.f54332b, z40VarC.b()));
                }
            }
            return arrayListK;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    @Override // tc.a
    public void b(tc.b bVar) {
        tc.a aVar = (tc.a) this.f50707b;
        tc.a aVar2 = (tc.a) this.f50708c;
        aVar.b(bVar);
        aVar2.b(bVar);
    }

    @Override // z8.b
    public Object execute() {
        switch (this.f50706a) {
            case 1:
                com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f50707b;
                Iterable iterable = (Iterable) this.f50708c;
                y8.h hVar = (y8.h) ((y8.d) dVar.f22983c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.d().compileStatement("DELETE FROM events WHERE _id in " + y8.h.p(iterable)).execute();
                    break;
                }
                break;
            default:
                com.google.android.gms.internal.consent_sdk.d dVar2 = (com.google.android.gms.internal.consent_sdk.d) this.f50707b;
                for (Map.Entry entry : ((HashMap) this.f50708c).entrySet()) {
                    ((y8.h) ((y8.c) dVar2.f22989i)).n(((Integer) entry.getValue()).intValue(), u8.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // tb.d
    public Object g(s sVar) {
        String str = (String) this.f50707b;
        a aVar = (a) this.f50708c;
        try {
            Trace.beginSection(str);
            return aVar.f50678f.g(sVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((zc.g) this.f50707b).a((Intent) this.f50708c);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        zc.i iVar = (zc.i) this.f50707b;
        String str = (String) this.f50708c;
        synchronized (iVar) {
            ((x.e) iVar.f54838b).remove(str);
        }
        return task;
    }
}
