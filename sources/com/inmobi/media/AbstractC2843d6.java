package com.inmobi.media;

import com.inmobi.media.AbstractC2843d6;
import java.util.ArrayList;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2843d6 {
    public final String a;
    public final C2923g9 b;

    public AbstractC2843d6(String tableName, C2923g9 databaseHelper) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.a = tableName;
        this.b = databaseHelper;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        String str = "SELECT COUNT(*) FROM " + this.a;
        C2923g9 c2923g9 = this.b;
        c2923g9.getClass();
        return c2923g9.a(new Y8(c2923g9, str, null), continuationImpl);
    }

    public abstract Object b(int i, ContinuationImpl continuationImpl);

    public final Object a(ArrayList arrayList, SuspendLambda suspendLambda) {
        if (arrayList.isEmpty()) {
            return Unit.f29295attabal;
        }
        String strPreterite = CollectionsKt.preterite(arrayList, ",", null, null, 0, null, new Function1() { // from class: adsuki.rotissomat
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC2843d6.a(((Integer) obj).intValue());
            }
        }, 30, null);
        Object objA = C2923g9.a(this.b, this.a, "id IN (" + strPreterite + ")", suspendLambda, 4);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public static final CharSequence a(int i) {
        return String.valueOf(i);
    }

    public final Object a(long j, ContinuationImpl continuationImpl) {
        Object objA = C2923g9.a(this.b, this.a, "ts < " + j, continuationImpl, 4);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    public final Object a(int i, ContinuationImpl continuationImpl) {
        String str = this.a;
        Object objA = this.b.a("DELETE FROM " + str + " WHERE id IN (SELECT id FROM " + str + " ORDER BY ts ASC LIMIT " + i + ")", continuationImpl);
        return objA == attabal.beachfront() ? objA : Unit.f29295attabal;
    }
}
