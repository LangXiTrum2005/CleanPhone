package http;

import android.os.CancellationSignal;
import androidx.webkit.PrefetchException;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Profile.java */
/* JADX INFO: loaded from: classes.dex */
public interface dern {
    default void addQuicHints(Set<String> set) {
        throw new UnsupportedOperationException("Profile#addQuicHints is not implemented.");
    }

    void attabal(String str, CancellationSignal cancellationSignal, Executor executor, saneness<Void, PrefetchException> sanenessVar);

    String getName();

    default void preconnect(String str) {
        throw new UnsupportedOperationException("Profile#preconnect is not implemented.");
    }
}
