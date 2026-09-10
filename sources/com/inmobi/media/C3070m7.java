package com.inmobi.media;

import formularization.attabal;
import formularization.beachfront;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;

/* JADX INFO: renamed from: com.inmobi.media.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3070m7 extends Zf {
    public static final /* synthetic */ int h = 0;
    public final attabal f;
    public monroe g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3070m7(C3129og dao, E8 listener, Cif networkHandler) {
        super(dao, listener, networkHandler);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.f = beachfront.saneness(false, 1, null);
    }

    @Override // com.inmobi.media.Zf
    public final Unit b() {
        saran saranVar = A9.d;
        cutely.wireman(saranVar, null, null, new C2946h7(this, null), 3, null);
        cutely.wireman(saranVar, null, null, new C2971i7(this, null), 3, null);
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c6 -> B:34:0x00c9). Please report as a decompilation issue!!! */
    public final Object c(ContinuationImpl continuationImpl) {
        C2869e7 c2869e7;
        int i;
        long j;
        List listMastfed;
        if (continuationImpl instanceof C2869e7) {
            c2869e7 = (C2869e7) continuationImpl;
            int i2 = c2869e7.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2869e7.e = i2 - Integer.MIN_VALUE;
            } else {
                c2869e7 = new C2869e7(this, continuationImpl);
            }
        } else {
            c2869e7 = new C2869e7(this, continuationImpl);
        }
        C2869e7 c2869e8 = c2869e7;
        Object objA = c2869e8.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i3 = c2869e8.e;
        if (i3 == 0) {
            dern.saneness(objA);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Intrinsics.checkNotNullExpressionValue("m7", "TAG");
            int high = Zf.a().getMaxBatchSize().getHigh();
            C3129og c3129og = this.a;
            Integer numWireman = igo.attabal.wireman(high);
            c2869e8.a = jCurrentTimeMillis;
            c2869e8.b = high;
            c2869e8.e = 1;
            Object objA2 = c3129og.a(numWireman, "high", jCurrentTimeMillis, c2869e8);
            if (objA2 != objBeachfront) {
                i = high;
                objA = objA2;
                j = jCurrentTimeMillis;
            }
            return objBeachfront;
        }
        if (i3 == 1) {
            i = c2869e8.b;
            j = c2869e8.a;
            dern.saneness(objA);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c2869e8.b;
            j = c2869e8.a;
            dern.saneness(objA);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objA) {
            if (!this.e.containsKey(((Rf) obj).b)) {
                arrayList.add(obj);
            }
        }
        listMastfed = CollectionsKt.mastfed(arrayList, i);
        if (!listMastfed.isEmpty() || this.d != Wf.STARTED) {
            return Unit.f29295attabal;
        }
        Intrinsics.checkNotNullExpressionValue("m7", "TAG");
        listMastfed.size();
        Iterator it = listMastfed.iterator();
        while (it.hasNext()) {
            cutely.wireman(A9.d, null, null, new C2921g7(this, (Rf) it.next(), null), 3, null);
        }
        C3129og c3129og2 = this.a;
        c2869e8.a = j;
        c2869e8.b = i;
        c2869e8.e = 2;
        long j2 = j;
        C2869e7 c2869e9 = c2869e8;
        objA = c3129og2.a(null, "high", j2, c2869e9);
        if (objA != objBeachfront) {
            j = j2;
            c2869e8 = c2869e9;
            ArrayList arrayList2 = new ArrayList();
            while (r1.hasNext()) {
                if (!this.e.containsKey(((Rf) obj).b)) {
                    arrayList2.add(obj);
                }
            }
            listMastfed = CollectionsKt.mastfed(arrayList2, i);
            if (!listMastfed.isEmpty()) {
            }
            return Unit.f29295attabal;
        }
        return objBeachfront;
        listMastfed = (List) objA;
        if (!listMastfed.isEmpty()) {
        }
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ContinuationImpl continuationImpl) {
        C2995j7 c2995j7;
        attabal attabalVar;
        if (continuationImpl instanceof C2995j7) {
            c2995j7 = (C2995j7) continuationImpl;
            int i = c2995j7.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2995j7.d = i - Integer.MIN_VALUE;
            } else {
                c2995j7 = new C2995j7(this, continuationImpl);
            }
        } else {
            c2995j7 = new C2995j7(this, continuationImpl);
        }
        Object obj = c2995j7.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c2995j7.d;
        if (i2 == 0) {
            dern.saneness(obj);
            attabalVar = this.f;
            c2995j7.a = attabalVar;
            c2995j7.d = 1;
            if (attabalVar.attabal(null, c2995j7) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabal attabalVar2 = c2995j7.a;
            dern.saneness(obj);
            attabalVar = attabalVar2;
        }
        try {
            monroe monroeVar = this.g;
            if (monroeVar != null ? monroeVar.isActive() : false) {
                return Unit.f29295attabal;
            }
            long high = Zf.a().getInterval().getHigh();
            if (high <= 0) {
                return Unit.f29295attabal;
            }
            Intrinsics.checkNotNullExpressionValue("m7", "TAG");
            saran saranVar = A9.d;
            IntRange intRange = Se.a;
            this.g = F3.a(saranVar, 0L, high * ((long) 1000), new C3020k7(this, null));
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ContinuationImpl continuationImpl) {
        C3045l7 c3045l7;
        attabal attabalVar;
        if (continuationImpl instanceof C3045l7) {
            c3045l7 = (C3045l7) continuationImpl;
            int i = c3045l7.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3045l7.d = i - Integer.MIN_VALUE;
            } else {
                c3045l7 = new C3045l7(this, continuationImpl);
            }
        } else {
            c3045l7 = new C3045l7(this, continuationImpl);
        }
        Object obj = c3045l7.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c3045l7.d;
        if (i2 == 0) {
            dern.saneness(obj);
            attabal attabalVar2 = this.f;
            c3045l7.a = attabalVar2;
            c3045l7.d = 1;
            if (attabalVar2.attabal(null, c3045l7) == objBeachfront) {
                return objBeachfront;
            }
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = c3045l7.a;
            dern.saneness(obj);
        }
        try {
            monroe monroeVar = this.g;
            if (monroeVar != null) {
                monroe.attabal.attabal(monroeVar, null, 1, null);
            }
            this.g = null;
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a9 A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[Catch: Error -> 0x003e, Exception -> 0x0041, PHI: r0 r4
  0x00b6: PHI (r0v18 java.lang.Object) = (r0v16 java.lang.Object), (r0v1 java.lang.Object) binds: [B:41:0x00b3, B:23:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00b6: PHI (r4v8 java.util.List) = (r4v6 java.util.List), (r4v11 java.util.List) binds: [B:41:0x00b3, B:23:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00be A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7 A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00da A[Catch: Error -> 0x003e, Exception -> 0x0041, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2 A[Catch: Error -> 0x003e, Exception -> 0x0041, LOOP:0: B:57:0x00ec->B:59:0x00f2, LOOP_END, TryCatch #2 {Error -> 0x003e, Exception -> 0x0041, blocks: (B:14:0x0039, B:54:0x00df, B:23:0x004e, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:50:0x00d7, B:51:0x00da, B:56:0x00e2, B:57:0x00ec, B:59:0x00f2, B:24:0x0052, B:38:0x00a0, B:40:0x00a9, B:27:0x0058, B:35:0x0091, B:30:0x005f, B:32:0x0068, B:60:0x010b), top: B:66:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (r0 == r3) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p002kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3070m7.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
