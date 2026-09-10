package sg.bigo.ads.controller.a.a;

import java.util.Collection;
import java.util.List;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f47793c = r.f47535a.a(30);

    public static <T extends a> T a(List<T> list) {
        if (k.a((Collection) list)) {
            return null;
        }
        T t = (T) k.a((List) list);
        if (t != null) {
            t.d = false;
        }
        return t;
    }

    public abstract sg.bigo.ads.controller.a.k a(String str);

    public String toString() {
        return super.toString();
    }

    public void a(boolean z2) {
    }
}
