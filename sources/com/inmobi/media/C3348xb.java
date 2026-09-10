package com.inmobi.media;

import android.content.ContentValues;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p002kotlin.Unit;
import p002kotlin.collections.dovishness;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3348xb {
    public final C2923g9 a;
    public WeakReference b;

    public C3348xb(C2923g9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C3174qb c3174qb, ContinuationImpl continuationImpl) {
        C3298vb c3298vb;
        if (continuationImpl instanceof C3298vb) {
            c3298vb = (C3298vb) continuationImpl;
            int i = c3298vb.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3298vb.c = i - Integer.MIN_VALUE;
            } else {
                c3298vb = new C3298vb(this, continuationImpl);
            }
        } else {
            c3298vb = new C3298vb(this, continuationImpl);
        }
        Object obj = c3298vb.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3298vb.c;
        if (i2 == 0) {
            dern.saneness(obj);
            C2923g9 c2923g9 = this.a;
            ContentValues contentValuesA = AbstractC3398zb.a(c3174qb);
            c3298vb.c = 1;
            if (c2923g9.a("logs_v2", contentValuesA, 4, c3298vb) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(obj);
        }
        WeakReference weakReference = this.b;
        if (weakReference != null && ((C3122o9) weakReference.get()) != null) {
            C3122o9.a();
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(C3174qb c3174qb, ContinuationImpl continuationImpl) {
        C3323wb c3323wb;
        if (continuationImpl instanceof C3323wb) {
            c3323wb = (C3323wb) continuationImpl;
            int i = c3323wb.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3323wb.c = i - Integer.MIN_VALUE;
            } else {
                c3323wb = new C3323wb(this, continuationImpl);
            }
        } else {
            c3323wb = new C3323wb(this, continuationImpl);
        }
        C3323wb c3323wb2 = c3323wb;
        Object obj = c3323wb2.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3323wb2.c;
        if (i2 == 0) {
            dern.saneness(obj);
            C2923g9 c2923g9 = this.a;
            ContentValues contentValuesA = AbstractC3398zb.a(c3174qb);
            String[] strArr = {c3174qb.a};
            c3323wb2.c = 1;
            if (C2923g9.a(c2923g9, "logs_v2", contentValuesA, "filename=?", strArr, c3323wb2, 16) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(obj);
        }
        WeakReference weakReference = this.b;
        if (weakReference != null && ((C3122o9) weakReference.get()) != null) {
            C3122o9.a();
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        C3223sb c3223sb;
        if (continuationImpl instanceof C3223sb) {
            c3223sb = (C3223sb) continuationImpl;
            int i = c3223sb.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3223sb.c = i - Integer.MIN_VALUE;
            } else {
                c3223sb = new C3223sb(this, continuationImpl);
            }
        } else {
            c3223sb = new C3223sb(this, continuationImpl);
        }
        Object objA = c3223sb.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3223sb.c;
        if (i2 == 0) {
            dern.saneness(objA);
            C2923g9 c2923g9 = this.a;
            c3223sb.c = 1;
            c2923g9.getClass();
            objA = c2923g9.a(new C2820c9(c2923g9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=1", null), c3223sb);
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
            arrayList.add(AbstractC3398zb.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        C3273ub c3273ub;
        if (continuationImpl instanceof C3273ub) {
            c3273ub = (C3273ub) continuationImpl;
            int i = c3273ub.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3273ub.c = i - Integer.MIN_VALUE;
            } else {
                c3273ub = new C3273ub(this, continuationImpl);
            }
        } else {
            c3273ub = new C3273ub(this, continuationImpl);
        }
        Object objA = c3273ub.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3273ub.c;
        if (i2 == 0) {
            dern.saneness(objA);
            C2923g9 c2923g9 = this.a;
            c3273ub.c = 1;
            c2923g9.getClass();
            objA = c2923g9.a(new Y8(c2923g9, "SELECT COUNT(*) FROM logs_v2 WHERE filename='" + str + "'", null), c3273ub);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objA);
        }
        return igo.attabal.attabal(((Number) objA).intValue() != 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        C3248tb c3248tb;
        if (continuationImpl instanceof C3248tb) {
            c3248tb = (C3248tb) continuationImpl;
            int i = c3248tb.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3248tb.c = i - Integer.MIN_VALUE;
            } else {
                c3248tb = new C3248tb(this, continuationImpl);
            }
        } else {
            c3248tb = new C3248tb(this, continuationImpl);
        }
        Object objA = c3248tb.a;
        Object objBeachfront = attabal.beachfront();
        int i2 = c3248tb.c;
        if (i2 == 0) {
            dern.saneness(objA);
            C2923g9 c2923g9 = this.a;
            c3248tb.c = 1;
            c2923g9.getClass();
            objA = c2923g9.a(new C2820c9(c2923g9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=0", null), c3248tb);
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
            arrayList.add(AbstractC3398zb.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, int i, ContinuationImpl continuationImpl) {
        C3198rb c3198rb;
        if (continuationImpl instanceof C3198rb) {
            c3198rb = (C3198rb) continuationImpl;
            int i2 = c3198rb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3198rb.c = i2 - Integer.MIN_VALUE;
            } else {
                c3198rb = new C3198rb(this, continuationImpl);
            }
        } else {
            c3198rb = new C3198rb(this, continuationImpl);
        }
        Object objA = c3198rb.a;
        Object objBeachfront = attabal.beachfront();
        int i3 = c3198rb.c;
        if (i3 == 0) {
            dern.saneness(objA);
            C2923g9 c2923g9 = this.a;
            c3198rb.c = 1;
            c2923g9.getClass();
            objA = c2923g9.a(new C2820c9(c2923g9, "SELECT * FROM logs_v2 WHERE id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > " + j + " ORDER BY saveTimestamp DESC LIMIT " + i + ") AS recent_logs);", null), c3198rb);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objA);
        }
        Iterable iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3398zb.a((ContentValues) it.next()));
        }
        return arrayList;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object objA = C2923g9.a(this.a, "logs_v2", "filename='" + str + "'", continuationImpl, 4);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
