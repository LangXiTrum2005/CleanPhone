package com.inmobi.media;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2923g9 {
    public final C3346x9 a;
    public final C3018k5 b;
    public SQLiteDatabase c;
    public SQLiteDatabase d;

    public C2923g9(C3346x9 sqLiteOpenHelper, C3018k5 databaseConfig) {
        Intrinsics.checkNotNullParameter(sqLiteOpenHelper, "sqLiteOpenHelper");
        Intrinsics.checkNotNullParameter(databaseConfig, "databaseConfig");
        this.a = sqLiteOpenHelper;
        this.b = databaseConfig;
    }

    public final Object a(String str, ContentValues contentValues, int i, ContinuationImpl continuationImpl) {
        Object objA = a(new C2897f9(this, new C2846d9(str, contentValues, i, null), null), continuationImpl);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public static Object a(C2923g9 c2923g9, String str, ContentValues contentValues, String str2, String[] strArr, ContinuationImpl continuationImpl, int i) {
        String str3 = (i & 4) != 0 ? null : str2;
        String[] strArr2 = (i & 8) != 0 ? null : strArr;
        c2923g9.getClass();
        Object objA = c2923g9.a(new C2897f9(c2923g9, new C2871e9(str, contentValues, str3, strArr2, null), null), continuationImpl);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public static /* synthetic */ Object a(C2923g9 c2923g9, String str, String str2, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c2923g9.a(str, str2, (String[]) null, continuationImpl);
    }

    public final Object a(String str, String str2, String[] strArr, dern dernVar) {
        Object objA = a(new C2897f9(this, new Z8(str, str2, strArr, null), null), dernVar);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object objA = a(new C2897f9(this, new C2768a9(str, null), null), continuationImpl);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Function1 function1, dern dernVar) {
        C2794b9 c2794b9;
        if (dernVar instanceof C2794b9) {
            c2794b9 = (C2794b9) dernVar;
            int i = c2794b9.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2794b9.d = i - Integer.MIN_VALUE;
            } else {
                c2794b9 = new C2794b9(this, dernVar);
            }
        } else {
            c2794b9 = new C2794b9(this, dernVar);
        }
        Object obj = c2794b9.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = c2794b9.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
                return obj;
            }
            function1 = c2794b9.a;
            p002kotlin.dern.saneness(obj);
            if (obj != null) {
                return obj;
            }
        }
        c2794b9.a = null;
        c2794b9.d = 2;
        Object objInvoke = function1.invoke(c2794b9);
        return objInvoke == objBeachfront ? objBeachfront : objInvoke;
    }
}
