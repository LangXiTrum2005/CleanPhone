package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3204r4 extends T1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3204r4(String tableName, String tableSchema) {
        super(tableName, tableSchema);
        Intrinsics.f(tableName, "tableName");
        Intrinsics.f(tableSchema, "tableSchema");
    }

    public final void a(ArrayList eventIdList) {
        Intrinsics.f(eventIdList, "eventIdList");
        if (eventIdList.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int size = eventIdList.size() - 1;
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(eventIdList.get(i2));
            sb.append(",");
        }
        sb.append(eventIdList.get(eventIdList.size() - 1));
        a("id IN (" + ((Object) sb) + ')', null);
    }

    public final ArrayList b(int i2) {
        ArrayList<U1> arrayListA = T1.a(this, null, null, null, null, "ts ASC", Integer.valueOf(i2), 15);
        ArrayList arrayList = new ArrayList();
        for (U1 u1 : arrayListA) {
            if (u1 != null) {
                arrayList.add(u1);
            }
        }
        return arrayList;
    }

    public final void a(long j) {
        Context contextD = Uc.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            C6.a(B6.a(contextD, "batch_processing_info"), this.f23193a.concat("_last_batch_process"), j, false, 4, (Object) null);
        }
    }

    public final void a(int i2) {
        ArrayList<U1> arrayListA = T1.a(this, null, null, null, null, "ts ASC", Integer.valueOf(i2), 15);
        ArrayList<Integer> arrayList = new ArrayList();
        for (U1 u1 : arrayListA) {
            arrayList.add(u1 != null ? Integer.valueOf(u1.f23249c) : null);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : arrayList) {
            if (num != null) {
                arrayList2.add(num);
            }
        }
        a(arrayList2);
    }
}
