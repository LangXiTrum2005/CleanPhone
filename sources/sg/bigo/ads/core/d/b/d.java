package sg.bigo.ads.core.d.b;

import com.p004ironsource.d9;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f48372a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48373b;

    public d(String str) {
        this.f48373b = str;
    }

    public final void a(String str, int i2) {
        this.f48372a.put(str, String.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("eventId = ");
        sb.append(this.f48373b);
        sb.append(":");
        for (Map.Entry<String, String> entry : this.f48372a.entrySet()) {
            sb.append(entry.getKey());
            sb.append(d9.i.f24747b);
            sb.append(entry.getValue());
            sb.append(",");
        }
        return sb.toString();
    }

    public final void a(String str, long j) {
        this.f48372a.put(str, String.valueOf(j));
    }

    public final void a(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return;
        }
        this.f48372a.put(str, str2);
    }

    public final void a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f48372a.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
