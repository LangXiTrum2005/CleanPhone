package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/FileStorage;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/Storage;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileStorage<T> implements Storage<T> {
    public static final LinkedHashSet d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f4648e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializer f4649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f4650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f4651c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.datastore.core.FileStorage$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/datastore/core/InterProcessCoordinator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public final class AnonymousClass1 extends Lambda implements Function1<File, InterProcessCoordinator> {
        public static final AnonymousClass1 X = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            File it = (File) obj;
            Intrinsics.f(it, "it");
            String absolutePath = it.getCanonicalFile().getAbsolutePath();
            Intrinsics.e(absolutePath, "file.canonicalFile.absolutePath");
            return new SingleProcessCoordinator(absolutePath);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/FileStorage$Companion;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public FileStorage(Serializer serializer, Function1 function1, Function0 function0) {
        Intrinsics.f(serializer, "serializer");
        this.f4649a = serializer;
        this.f4650b = function1;
        this.f4651c = function0;
    }

    public /* synthetic */ FileStorage(Serializer serializer, Function0 function0) {
        this(serializer, AnonymousClass1.X, function0);
    }
}
