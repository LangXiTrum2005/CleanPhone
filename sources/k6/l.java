package k6;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f44359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f44360c;

    public l(Map map) {
        this.f44359b = Collections.unmodifiableMap(map);
    }

    @Override // k6.i
    public final Map a() {
        if (this.f44360c == null) {
            synchronized (this) {
                try {
                    if (this.f44360c == null) {
                        this.f44360c = Collections.unmodifiableMap(b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f44360c;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f44359b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = ((k) list.get(i10)).f44358a;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    if (i10 != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f44359b.equals(((l) obj).f44359b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44359b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f44359b + '}';
    }
}
