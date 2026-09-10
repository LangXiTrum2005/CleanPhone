package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class T6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U9 f27229a;

    public T6(U9 globalDataWriter) {
        kotlin.jvm.internal.n.f(globalDataWriter, "globalDataWriter");
        this.f27229a = globalDataWriter;
    }

    public final void a(JSONObject metaDataJson) {
        kotlin.jvm.internal.n.f(metaDataJson, "metaDataJson");
        if (metaDataJson.has(com.ironsource.mediationsdk.metadata.a.f29612i)) {
            try {
                Object objRemove = metaDataJson.remove(com.ironsource.mediationsdk.metadata.a.f29612i);
                kotlin.jvm.internal.n.d(objRemove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) objRemove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.String");
                this.f27229a.e((String) obj);
            } catch (ClassCastException e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error("got the following error " + e10.getMessage());
            }
        }
    }
}
