package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2897f9 extends SuspendLambda implements Function1 {
    public SQLiteDatabase a;
    public int b;
    public final /* synthetic */ C2923g9 c;
    public final /* synthetic */ SuspendLambda d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2897f9(C2923g9 c2923g9, Function2 function2, dern dernVar) {
        super(1, dernVar);
        this.c = c2923g9;
        this.d = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C2897f9(this.c, this.d, dernVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C2897f9(this.c, this.d, (dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        Object objBeachfront = attabal.beachfront();
        int i = this.b;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            C2923g9 c2923g9 = this.c;
            sQLiteDatabase = c2923g9.c;
            if (sQLiteDatabase == null) {
                return null;
            }
            ?? r3 = this.d;
            if (c2923g9.b.c == 2) {
                sQLiteDatabase.beginTransactionNonExclusive();
            } else {
                sQLiteDatabase.beginTransaction();
            }
            try {
                this.a = sQLiteDatabase;
                this.b = 1;
                if (r3.invoke(c2923g9, this) == objBeachfront) {
                    return objBeachfront;
                }
                sQLiteDatabase2 = sQLiteDatabase;
            } catch (Throwable th) {
                th = th;
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sQLiteDatabase2 = this.a;
            try {
                p002kotlin.dern.saneness(obj);
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabase2;
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
                throw th;
            }
        }
        sQLiteDatabase2.setTransactionSuccessful();
        if (sQLiteDatabase2.inTransaction()) {
            sQLiteDatabase2.endTransaction();
        }
        return Unit.f29295attabal;
    }
}
