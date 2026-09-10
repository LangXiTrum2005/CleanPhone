package androidx.datastore.core;

import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/MultiProcessDataStoreFactory;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiProcessDataStoreFactory {
    public static DataStoreImpl a(Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, final ContextScope contextScope, Function0 function0) {
        return new DataStoreImpl(new FileStorage(serializer, new Function1<File, InterProcessCoordinator>() { // from class: androidx.datastore.core.MultiProcessDataStoreFactory$create$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                File it = (File) obj;
                Intrinsics.f(it, "it");
                return new MultiProcessCoordinator(contextScope.X, it);
            }
        }, function0), CollectionsKt.H(new DataMigrationInitializer$Companion$getInitializer$1(EmptyList.X, null)), replaceFileCorruptionHandler, contextScope);
    }
}
