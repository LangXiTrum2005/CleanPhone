package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2846d9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ContentValues c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2846d9(String str, ContentValues contentValues, int i, dern dernVar) {
        super(2, dernVar);
        this.b = str;
        this.c = contentValues;
        this.d = i;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C2846d9 c2846d9 = new C2846d9(this.b, this.c, this.d, dernVar);
        c2846d9.a = obj;
        return c2846d9;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2846d9) create((C2923g9) obj, (dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        SQLiteDatabase sQLiteDatabase = ((C2923g9) this.a).c;
        if (sQLiteDatabase != null) {
            igo.attabal.marial(sQLiteDatabase.insertWithOnConflict(this.b, null, this.c, this.d));
        }
        return Unit.f29295attabal;
    }
}
