package androidx.datastore.core;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver;", "Landroid/os/FileObserver;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MulticastFileObserver extends FileObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f4672b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f4673c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f4674a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/core/MulticastFileObserver$Companion;", "", "LOCK", "Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public MulticastFileObserver(String str) {
        super(str, 128);
        this.f4674a = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i2, String str) {
        Iterator it = this.f4674a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(str);
        }
    }
}
