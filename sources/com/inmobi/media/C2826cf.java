package com.inmobi.media;

import formularization.attabal;
import formularization.beachfront;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2826cf extends Zf {
    public final attabal f;
    public monroe g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2826cf(C3129og dao, C3093n5 listener, Cif networkHandler) {
        super(dao, listener, networkHandler);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.f = beachfront.saneness(false, 1, null);
    }

    @Override // com.inmobi.media.Zf
    public final Unit b() {
        cutely.wireman(A9.c, null, null, new Ye(this, null), 3, null);
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ContinuationImpl continuationImpl) {
        Ze ze;
        attabal attabalVar;
        if (continuationImpl instanceof Ze) {
            ze = (Ze) continuationImpl;
            int i = ze.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ze.d = i - Integer.MIN_VALUE;
            } else {
                ze = new Ze(this, continuationImpl);
            }
        } else {
            ze = new Ze(this, continuationImpl);
        }
        Object obj = ze.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ze.d;
        if (i2 == 0) {
            dern.saneness(obj);
            attabalVar = this.f;
            ze.a = attabalVar;
            ze.d = 1;
            if (attabalVar.attabal(null, ze) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabal attabalVar2 = ze.a;
            dern.saneness(obj);
            attabalVar = attabalVar2;
        }
        try {
            monroe monroeVar = this.g;
            if (monroeVar != null) {
                Intrinsics.beachfront(monroeVar);
                if (monroeVar.saneness()) {
                    monroe monroeVar2 = this.g;
                    Intrinsics.beachfront(monroeVar2);
                    if (!monroeVar2.isCancelled()) {
                    }
                }
                return Unit.f29295attabal;
            }
            long normal = Zf.a().getInterval().getNormal();
            if (normal <= 0) {
                return Unit.f29295attabal;
            }
            this.g = F3.a(A9.c, 0L, normal * ((long) 1000), new C2774af(this, null));
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ContinuationImpl continuationImpl) {
        C2800bf c2800bf;
        attabal attabalVar;
        if (continuationImpl instanceof C2800bf) {
            c2800bf = (C2800bf) continuationImpl;
            int i = c2800bf.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2800bf.d = i - Integer.MIN_VALUE;
            } else {
                c2800bf = new C2800bf(this, continuationImpl);
            }
        } else {
            c2800bf = new C2800bf(this, continuationImpl);
        }
        Object obj = c2800bf.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c2800bf.d;
        if (i2 == 0) {
            dern.saneness(obj);
            attabal attabalVar2 = this.f;
            c2800bf.a = attabalVar2;
            c2800bf.d = 1;
            if (attabalVar2.attabal(null, c2800bf) == objBeachfront) {
                return objBeachfront;
            }
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = c2800bf.a;
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

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5 A[PHI: r2 r14
  0x00a5: PHI (r2v8 java.util.List) = (r2v6 java.util.List), (r2v11 java.util.List) binds: [B:31:0x00a2, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r14v16 java.lang.Object) = (r14v13 java.lang.Object), (r14v1 java.lang.Object) binds: [B:31:0x00a2, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db A[LOOP:0: B:47:0x00d5->B:49:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        if (r14 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p002kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2826cf.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
