package demilitarize;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewModelImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\r*\u00060\bj\u0002`\t2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\bj\u0002`\t0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006!"}, d2 = {"Ldemilitarize/cutely;", "", "<init>", "()V", "", "marial", "", X3.i.W, "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "wireman", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "competently", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "beachfront", "(Ljava/lang/AutoCloseable;)V", "Ldemilitarize/beachfront;", "attabal", "Ldemilitarize/beachfront;", "lock", "", "saneness", "Ljava/util/Map;", "keyToCloseables", "", "dern", "Ljava/util/Set;", "closeables", "", "Z", "isCleared", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cutely {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public volatile boolean isCleared;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final beachfront lock = new beachfront();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Map<String, AutoCloseable> keyToCloseables = new LinkedHashMap();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Set<AutoCloseable> closeables = new LinkedHashSet();

    public final void beachfront(AutoCloseable closeable) {
        if (closeable != null) {
            try {
                competently.attabal(closeable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final <T extends AutoCloseable> T competently(String key) {
        T t;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            t = (T) this.keyToCloseables.get(key);
        }
        return t;
    }

    public final void marial() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            try {
                Iterator it = this.keyToCloseables.values().iterator();
                while (it.hasNext()) {
                    beachfront((AutoCloseable) it.next());
                }
                Iterator it2 = this.closeables.iterator();
                while (it2.hasNext()) {
                    beachfront((AutoCloseable) it2.next());
                }
                this.closeables.clear();
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void wireman(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.isCleared) {
            beachfront(closeable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(key, closeable);
        }
        beachfront(autoCloseable);
    }
}
