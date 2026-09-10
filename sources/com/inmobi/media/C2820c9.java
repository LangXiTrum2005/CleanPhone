package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import interaction.saneness;
import java.util.ArrayList;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2820c9 extends SuspendLambda implements Function1 {
    public final /* synthetic */ C2923g9 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2820c9(C2923g9 c2923g9, String str, dern dernVar) {
        super(1, dernVar);
        this.a = c2923g9;
        this.b = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C2820c9(this.a, this.b, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C2820c9(this.a, this.b, (dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        SQLiteDatabase sQLiteDatabase = this.a.d;
        if (sQLiteDatabase == null) {
            return adultoid.formularize();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(this.b, null);
            try {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (cursorRawQuery.moveToNext());
                }
                Unit unit = Unit.f29295attabal;
                saneness.attabal(cursorRawQuery, null);
                return arrayList;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    saneness.attabal(cursorRawQuery, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return arrayList;
        }
    }
}
