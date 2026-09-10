package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.SingleProcessCoordinator;
import androidx.datastore.core.Storage;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Storage;", "Companion", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioStorage<T> implements Storage<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Synchronizer f4700a;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorage$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Landroidx/datastore/core/InterProcessCoordinator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "path", "Lokio/Path;", "<anonymous parameter 1>", "Lokio/FileSystem;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass1 extends Lambda implements Function2<Path, FileSystem, InterProcessCoordinator> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Path path = (Path) obj;
            Intrinsics.f(path, "path");
            Intrinsics.f((FileSystem) obj2, "<anonymous parameter 1>");
            return new SingleProcessCoordinator(Path.Companion.a(path.X.v(), true).X.v());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage$Companion;", "", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        new LinkedHashSet();
        f4700a = new Synchronizer();
    }
}
