package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18466a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18467b = ci.f13168a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18468c = null;

    public List a() {
        List list;
        List list2;
        ea.m mVar = (ea.m) this.f18468c;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.f18467b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mVar.x1().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f18466a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1;
                        long j12 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j10 > this.f18466a) {
                            this.f18466a = j10;
                        }
                        try {
                            com.google.android.gms.internal.measurement.u9 u9Var = (com.google.android.gms.internal.measurement.u9) ea.h4.r1(com.google.android.gms.internal.measurement.v9.K(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            u9Var.p(string);
                            long j13 = cursorQuery.getLong(2);
                            u9Var.b();
                            ((com.google.android.gms.internal.measurement.v9) u9Var.f23489b).R(j13);
                            u9Var.b();
                            ((com.google.android.gms.internal.measurement.v9) u9Var.f23489b).u(j12);
                            arrayList.add(new ea.k(j10, j11, z10, (com.google.android.gms.internal.measurement.v9) u9Var.f()));
                        } catch (IOException e10) {
                            ea.s0 s0Var = ((ea.m1) mVar.f3623a).f39587f;
                            ea.m1.h(s0Var);
                            s0Var.f39753f.d("Data loss. Failed to merge raw event. appId", ea.s0.O0(str), e10);
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e11) {
                ea.s0 s0Var2 = ((ea.m1) mVar.f3623a).f39587f;
                ea.m1.h(s0Var2);
                s0Var2.f39753f.d("Data loss. Error querying raw events batch. appId", ea.s0.O0(str), e11);
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public a40 b() {
        Object obj;
        if (!((ci) this.f18467b).g() && (obj = this.f18468c) != null) {
            ps1.v(((ci) this.f18467b).e(obj) != -1);
        }
        return new a40(this);
    }
}
