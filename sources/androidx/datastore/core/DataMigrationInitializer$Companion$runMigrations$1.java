package androidx.datastore.core;

import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE}, m = "runMigrations")
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {
    public Serializable X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Iterator f4602Y;
    public /* synthetic */ Object Z;
    public int e0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.e0 |= Integer.MIN_VALUE;
        return DataMigrationInitializer.Companion.a(null, null, this);
    }
}
