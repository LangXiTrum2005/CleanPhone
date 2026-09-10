package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3129og {
    public final C2923g9 a;

    public C3129og(C2923g9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Integer num, String str, long j, ContinuationImpl continuationImpl) {
        C3104ng c3104ng;
        String str2;
        if (continuationImpl instanceof C3104ng) {
            c3104ng = (C3104ng) continuationImpl;
            int i = c3104ng.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3104ng.c = i - Integer.MIN_VALUE;
            } else {
                c3104ng = new C3104ng(this, continuationImpl);
            }
        } else {
            c3104ng = new C3104ng(this, continuationImpl);
        }
        Object objA = c3104ng.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3104ng.c;
        if (i2 == 0) {
            dern.saneness(objA);
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count=0 AND time_created<" + j + " ORDER BY time_created ASC" + str2;
            C2923g9 c2923g9 = this.a;
            c3104ng.c = 1;
            c2923g9.getClass();
            objA = c2923g9.a(new C2820c9(c2923g9, str3, null), c3104ng);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3154pg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    public final Object b(String str, ContinuationImpl continuationImpl) {
        String str2 = "SELECT COUNT(*) FROM pings WHERE priority='" + str + "'";
        C2923g9 c2923g9 = this.a;
        c2923g9.getClass();
        return c2923g9.a(new Y8(c2923g9, str2, null), continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, Integer num, ContinuationImpl continuationImpl) {
        C3079mg c3079mg;
        String str2;
        if (continuationImpl instanceof C3079mg) {
            c3079mg = (C3079mg) continuationImpl;
            int i = c3079mg.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3079mg.c = i - Integer.MIN_VALUE;
            } else {
                c3079mg = new C3079mg(this, continuationImpl);
            }
        } else {
            c3079mg = new C3079mg(this, continuationImpl);
        }
        Object objA = c3079mg.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3079mg.c;
        if (i2 == 0) {
            dern.saneness(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retry_count>=1 AND retryAfter<=" + jCurrentTimeMillis + " ORDER BY time_created ASC" + str2;
            C2923g9 c2923g9 = this.a;
            c3079mg.c = 1;
            c2923g9.getClass();
            objA = c2923g9.a(new C2820c9(c2923g9, str3, null), c3079mg);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3154pg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Integer num, ContinuationImpl continuationImpl) {
        C3054lg c3054lg;
        String str2;
        if (continuationImpl instanceof C3054lg) {
            c3054lg = (C3054lg) continuationImpl;
            int i = c3054lg.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3054lg.c = i - Integer.MIN_VALUE;
            } else {
                c3054lg = new C3054lg(this, continuationImpl);
            }
        } else {
            c3054lg = new C3054lg(this, continuationImpl);
        }
        Object objA = c3054lg.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3054lg.c;
        if (i2 == 0) {
            dern.saneness(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (num != null) {
                str2 = " LIMIT " + num.intValue();
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            String str3 = "SELECT * FROM pings WHERE priority='" + str + "' AND retryAfter<=" + jCurrentTimeMillis + " ORDER BY time_created ASC" + str2;
            C2923g9 c2923g9 = this.a;
            c3054lg.c = 1;
            c2923g9.getClass();
            objA = c2923g9.a(new C2820c9(c2923g9, str3, null), c3054lg);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3154pg.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        C3029kg c3029kg;
        if (continuationImpl instanceof C3029kg) {
            c3029kg = (C3029kg) continuationImpl;
            int i = c3029kg.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3029kg.d = i - Integer.MIN_VALUE;
            } else {
                c3029kg = new C3029kg(this, continuationImpl);
            }
        } else {
            c3029kg = new C3029kg(this, continuationImpl);
        }
        Object objA = c3029kg.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3029kg.d;
        if (i2 == 0) {
            dern.saneness(objA);
            C2923g9 c2923g9 = this.a;
            c3029kg.d = 1;
            c2923g9.getClass();
            objA = c2923g9.a(new C2820c9(c2923g9, "SELECT * FROM pings WHERE priority='" + str + "' ORDER BY time_created ASC LIMIT 1", null), c3029kg);
            if (objA != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Rf rf = c3029kg.a;
            dern.saneness(objA);
            return rf;
        }
        dern.saneness(objA);
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3154pg.a((ContentValues) it.next()));
        }
        Rf rf2 = (Rf) CollectionsKt.firstOrNull(arrayList);
        if (rf2 != null) {
            C2923g9 c2923g10 = this.a;
            String[] strArr = {rf2.b};
            c3029kg.a = rf2;
            c3029kg.d = 2;
            if (c2923g10.a("pings", "id=?", strArr, c3029kg) == objBeachfront) {
                return objBeachfront;
            }
        }
        return rf2;
    }

    public final Object a(long j, ContinuationImpl continuationImpl) {
        String strValueOf = String.valueOf(System.currentTimeMillis() - j);
        Object objA = C2923g9.a(this.a, "pings", "time_created<" + strValueOf, continuationImpl, 4);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
