package lehua;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;

/* JADX INFO: compiled from: TransportRuntimeComponent.java */
/* JADX INFO: loaded from: classes2.dex */
@Singleton
public abstract class dovishness implements Closeable {

    /* JADX INFO: compiled from: TransportRuntimeComponent.java */
    public interface attabal {
        attabal attabal(Context context);

        dovishness build();
    }

    public abstract com.google.android.datatransport.runtime.scheduling.persistence.wireman attabal();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        attabal().close();
    }

    public abstract adultoid saneness();
}
