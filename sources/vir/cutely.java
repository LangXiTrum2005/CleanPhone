package vir;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: HttpDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, String> f39564attabal = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Map<String, String> f39565saneness;

    public synchronized Map<String, String> attabal() {
        try {
            if (this.f39565saneness == null) {
                this.f39565saneness = Collections.unmodifiableMap(new HashMap(this.f39564attabal));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39565saneness;
    }
}
