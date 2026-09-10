package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2768a9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2768a9(String str, dern dernVar) {
        super(2, dernVar);
        this.b = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(Object obj, dern dernVar) {
        C2768a9 c2768a9 = new C2768a9(this.b, dernVar);
        c2768a9.a = obj;
        return c2768a9;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C2768a9 c2768a9 = new C2768a9(this.b, (dern) obj2);
        c2768a9.a = (C2923g9) obj;
        return c2768a9.invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        SQLiteDatabase sQLiteDatabase = ((C2923g9) this.a).c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL(this.b);
        }
        return Unit.f29295attabal;
    }
}
