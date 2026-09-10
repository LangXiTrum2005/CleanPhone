package twybill;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ContentMetadataMutations.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<String, Object> f39038attabal = new HashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<String> f39039saneness = new ArrayList();

    public static taiyuan competently(taiyuan taiyuanVar, long j) {
        return taiyuanVar.marial("exo_len", j);
    }

    public static taiyuan impromptu(taiyuan taiyuanVar, Uri uri) {
        return uri == null ? taiyuanVar.wireman("exo_redir") : taiyuanVar.beachfront("exo_redir", uri.toString());
    }

    public final taiyuan attabal(String str, Object obj) {
        this.f39038attabal.put((String) decarock.attabal.marial(str), decarock.attabal.marial(obj));
        this.f39039saneness.remove(str);
        return this;
    }

    public taiyuan beachfront(String str, String str2) {
        return attabal(str, str2);
    }

    public List<String> dern() {
        return Collections.unmodifiableList(new ArrayList(this.f39039saneness));
    }

    public taiyuan marial(String str, long j) {
        return attabal(str, Long.valueOf(j));
    }

    public Map<String, Object> saneness() {
        HashMap map = new HashMap(this.f39038attabal);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public taiyuan wireman(String str) {
        this.f39039saneness.add(str);
        this.f39038attabal.remove(str);
        return this;
    }
}
