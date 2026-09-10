package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/DataStoreFactory;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreFactory {
    public static DataStoreImpl a(FileStorage fileStorage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List migrations, CoroutineScope scope) {
        Intrinsics.f(migrations, "migrations");
        Intrinsics.f(scope, "scope");
        CorruptionHandler noOpCorruptionHandler = replaceFileCorruptionHandler;
        if (replaceFileCorruptionHandler == null) {
            noOpCorruptionHandler = new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(fileStorage, CollectionsKt.H(new DataMigrationInitializer$Companion$getInitializer$1(migrations, null)), noOpCorruptionHandler, scope);
    }

    public static DataStoreImpl b(Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List migrations, CoroutineScope scope, Function0 function0) {
        Intrinsics.f(serializer, "serializer");
        Intrinsics.f(migrations, "migrations");
        Intrinsics.f(scope, "scope");
        return a(new FileStorage(serializer, FileStorage.AnonymousClass1.X, function0), replaceFileCorruptionHandler, migrations, scope);
    }

    public static DataStoreImpl c(Serializer serializer, List list, ContextScope contextScope, Function0 function0, int i2) {
        if ((i2 & 4) != 0) {
            list = EmptyList.X;
        }
        if ((i2 & 8) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            contextScope = CoroutineScopeKt.a(DefaultIoScheduler.f45062Y.plus(SupervisorKt.b()));
        }
        return b(serializer, null, list, contextScope, function0);
    }
}
