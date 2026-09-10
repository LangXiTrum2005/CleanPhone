package androidx.webkit;

import java.util.List;
import r4.b;
import s4.f;
import s4.m;
import s4.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (!m.f50121g.a()) {
            throw m.a();
        }
        if (f.f50106b == null) {
            f.f50106b = new f(o.f50126a.getProfileStore());
        }
        return f.f50106b;
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    b getOrCreateProfile(String str);

    b getProfile(String str);
}
