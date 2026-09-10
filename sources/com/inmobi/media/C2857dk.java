package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.collections.dovishness;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2857dk extends AbstractC2843d6 {
    public final C2923g9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2857dk(C2923g9 databaseHelper) {
        super("telemetry", databaseHelper);
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.c = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC2843d6
    public final Object b(int i, ContinuationImpl continuationImpl) {
        C2831ck c2831ck;
        if (continuationImpl instanceof C2831ck) {
            c2831ck = (C2831ck) continuationImpl;
            int i2 = c2831ck.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2831ck.c = i2 - Integer.MIN_VALUE;
            } else {
                c2831ck = new C2831ck(this, continuationImpl);
            }
        } else {
            c2831ck = new C2831ck(this, continuationImpl);
        }
        Object objA = c2831ck.a;
        Object objBeachfront = attabal.beachfront();
        int i3 = c2831ck.c;
        if (i3 == 0) {
            dern.saneness(objA);
            C2923g9 c2923g9 = this.c;
            c2831ck.c = 1;
            c2923g9.getClass();
            objA = c2923g9.a(new C2820c9(c2923g9, "SELECT * FROM telemetry ORDER BY ts ASC LIMIT " + i, null), c2831ck);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dern.saneness(objA);
        }
        List<ContentValues> list = (List) objA;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        for (ContentValues contentValues : list) {
            Intrinsics.checkNotNullParameter(contentValues, "contentValues");
            String asString = contentValues.getAsString("eventType");
            String asString2 = contentValues.getAsString("payload");
            String asString3 = contentValues.getAsString("eventSource");
            String asString4 = contentValues.getAsString("ts");
            Intrinsics.checkNotNullExpressionValue(asString4, "getAsString(...)");
            long j = Long.parseLong(asString4);
            Intrinsics.beachfront(asString);
            Intrinsics.beachfront(asString3);
            C2882ek c2882ek = new C2882ek(asString, asString2, asString3);
            c2882ek.c = j;
            Integer asInteger = contentValues.getAsInteger("id");
            Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
            c2882ek.d = asInteger.intValue();
            arrayList.add(c2882ek);
        }
        return arrayList;
    }
}
