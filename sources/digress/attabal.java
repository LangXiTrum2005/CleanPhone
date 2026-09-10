package digress;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: AbtComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, dynein.attabal> f25243attabal = new HashMap();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final friedmanite.saneness<anthomaniac.attabal> f25244dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Context f25245saneness;

    public attabal(Context context, friedmanite.saneness<anthomaniac.attabal> sanenessVar) {
        this.f25245saneness = context;
        this.f25244dern = sanenessVar;
    }

    public dynein.attabal attabal(String str) {
        return new dynein.attabal(this.f25245saneness, this.f25244dern, str);
    }

    public synchronized dynein.attabal saneness(String str) {
        try {
            if (!this.f25243attabal.containsKey(str)) {
                this.f25243attabal.put(str, attabal(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25243attabal.get(str);
    }
}
