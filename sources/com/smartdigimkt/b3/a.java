package com.smartdigimkt.b3;

import android.text.TextUtils;
import com.smartdigimkt.f3.c;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.x.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f33899a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f33900b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f33901c = "com.smartdigimkt.b3.a";
    private static a d;

    private a() {
        try {
            b.p().k();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(String str, String str2) {
    }

    public void b(String str, String str2) {
    }

    public void c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TextUtils.isEmpty(str2);
    }

    public void d(String str, String str2) {
    }

    public void a(String str, List<d> list) {
    }

    public void a(String str, List<d> list, String str2, int i2) {
    }

    public static a a() {
        if (d == null) {
            synchronized (a.class) {
                try {
                    if (d == null) {
                        d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public boolean a(d dVar) {
        try {
            com.smartdigimkt.f3.a aVarC = c.b().c();
            long jF = aVarC != null ? aVarC.f() : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (dVar != null) {
                long jC1 = dVar.C1() * 1000;
                long jR = jCurrentTimeMillis - dVar.r();
                if (jC1 > 0 && jC1 >= jR) {
                    return false;
                }
                if (jC1 <= 0 && jF >= jR) {
                    return false;
                }
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public List<d> a(List<d> list) {
        ArrayList arrayList = null;
        if (list != null) {
            try {
                com.smartdigimkt.f3.a aVarC = c.b().c();
                long jF = aVarC != null ? aVarC.f() : 0L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (list.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (d dVar : list) {
                            if (dVar != null) {
                                long jC1 = dVar.C1() * 1000;
                                long jR = jCurrentTimeMillis - dVar.r();
                                if ((jC1 > 0 && jC1 >= jR) || (jC1 <= 0 && jF >= jR)) {
                                    arrayList2.add(dVar);
                                }
                            }
                        }
                        return arrayList2;
                    } catch (Exception e2) {
                        e = e2;
                        arrayList = arrayList2;
                        e.printStackTrace();
                        return arrayList;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return arrayList;
    }
}
