package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.Component;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
@Component
abstract class TransportRuntimeComponent implements Closeable {

    @Component.Builder
    public interface Builder {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        d().close();
    }

    public abstract EventStore d();

    public abstract TransportRuntime h();
}
