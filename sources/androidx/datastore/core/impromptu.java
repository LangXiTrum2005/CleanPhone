package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataStoreFactory.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/datastore/core/impromptu;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/molybdenite;", "serializer", "Llibyan/saneness;", "corruptionHandler", "", "Landroidx/datastore/core/beachfront;", "migrations", "Lkotlinx/coroutines/saran;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/competently;", "attabal", "(Landroidx/datastore/core/molybdenite;Llibyan/saneness;Ljava/util/List;Lkotlinx/coroutines/saran;Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/competently;", "Landroidx/datastore/core/adultoid;", X3.a.k, "saneness", "(Landroidx/datastore/core/adultoid;Llibyan/saneness;Ljava/util/List;Lkotlinx/coroutines/saran;)Landroidx/datastore/core/competently;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final impromptu f9573attabal = new impromptu();

    public static /* synthetic */ competently dern(impromptu impromptuVar, molybdenite molybdeniteVar, libyan.saneness sanenessVar, List list, saran saranVar, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            sanenessVar = null;
        }
        if ((i & 4) != 0) {
            list = p002kotlin.collections.adultoid.formularize();
        }
        if ((i & 8) != 0) {
            saranVar = privatdozent.attabal(premeiotic.saneness().plus(sakeen.saneness(null, 1, null)));
        }
        return impromptuVar.attabal(molybdeniteVar, sanenessVar, list, saranVar, function0);
    }

    public final <T> competently<T> attabal(molybdenite<T> serializer, libyan.saneness<T> corruptionHandler, List<? extends beachfront<T>> migrations, saran scope, Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return saneness(new FileStorage(serializer, null, produceFile, 2, null), corruptionHandler, migrations, scope);
    }

    public final <T> competently<T> saneness(adultoid<T> storage, libyan.saneness<T> corruptionHandler, List<? extends beachfront<T>> migrations, saran scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (corruptionHandler == null) {
            corruptionHandler = (libyan.saneness<T>) new libyan.attabal();
        }
        return new DataStoreImpl(storage, p002kotlin.collections.graveside.marial(DataMigrationInitializer.INSTANCE.saneness(migrations)), corruptionHandler, scope);
    }
}
