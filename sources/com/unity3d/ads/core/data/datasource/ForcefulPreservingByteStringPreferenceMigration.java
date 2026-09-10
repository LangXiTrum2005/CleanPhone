package com.unity3d.ads.core.data.datasource;

import ak.f;
import android.content.Context;
import com.ironsource.X3;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import s0.e;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/ForcefulPreservingByteStringPreferenceMigration;", "Ls0/e;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "Landroid/content/Context;", "context", "", "name", X3.i.W, "Lcom/unity3d/ads/core/data/datasource/GetByteStringData;", "getByteStringData", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/datasource/GetByteStringData;)V", "Lwj/r;", "cleanUp", "(Lak/f;)Ljava/lang/Object;", "currentData", "", "shouldMigrate", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;Lak/f;)Ljava/lang/Object;", "migrate", "Landroid/content/Context;", "Ljava/lang/String;", "Lcom/unity3d/ads/core/data/datasource/GetByteStringData;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ForcefulPreservingByteStringPreferenceMigration implements e {
    private final Context context;
    private final GetByteStringData getByteStringData;
    private final String key;
    private final String name;

    public ForcefulPreservingByteStringPreferenceMigration(Context context, String name, String key, GetByteStringData getByteStringData) {
        n.f(context, "context");
        n.f(name, "name");
        n.f(key, "key");
        n.f(getByteStringData, "getByteStringData");
        this.context = context;
        this.name = name;
        this.key = key;
        this.getByteStringData = getByteStringData;
    }

    @Override // s0.e
    public Object cleanUp(f fVar) {
        return r.f53297a;
    }

    @Override // s0.e
    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, f fVar) {
        String string = this.context.getSharedPreferences(this.name, 0).getString(this.key, null);
        if (string == null || string.length() == 0) {
            return byteStringStore;
        }
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(string)).build();
        n.e(byteStringStoreBuild, "newBuilder()\n           …\n                .build()");
        return byteStringStoreBuild;
    }

    @Override // s0.e
    public Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, f fVar) {
        return Boolean.TRUE;
    }
}
