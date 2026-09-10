package twybill;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: DefaultContentMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class cutely implements impromptu {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final cutely f39022dern = new cutely(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f39023attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<String, byte[]> f39024saneness;

    public cutely() {
        this(Collections.EMPTY_MAP);
    }

    public static byte[] competently(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(com.google.common.base.dern.f21534dern);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static void dern(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), competently(entry.getValue()));
        }
    }

    public static boolean impromptu(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void taiyuan(HashMap<String, byte[]> map, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            map.remove(list.get(i));
        }
    }

    public static Map<String, byte[]> wireman(Map<String, byte[]> map, taiyuan taiyuanVar) {
        HashMap map2 = new HashMap(map);
        taiyuan(map2, taiyuanVar.dern());
        dern(map2, taiyuanVar.saneness());
        return map2;
    }

    public Set<Map.Entry<String, byte[]>> beachfront() {
        return this.f39024saneness.entrySet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cutely.class != obj.getClass()) {
            return false;
        }
        return impromptu(this.f39024saneness, ((cutely) obj).f39024saneness);
    }

    @Override // twybill.impromptu
    public final String get(String str, String str2) {
        byte[] bArr = this.f39024saneness.get(str);
        return bArr != null ? new String(bArr, com.google.common.base.dern.f21534dern) : str2;
    }

    public int hashCode() {
        if (this.f39023attabal == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f39024saneness.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f39023attabal = iHashCode;
        }
        return this.f39023attabal;
    }

    public cutely marial(taiyuan taiyuanVar) {
        Map<String, byte[]> mapWireman = wireman(this.f39024saneness, taiyuanVar);
        return impromptu(this.f39024saneness, mapWireman) ? this : new cutely(mapWireman);
    }

    public cutely(Map<String, byte[]> map) {
        this.f39024saneness = Collections.unmodifiableMap(map);
    }

    @Override // twybill.impromptu
    public final long get(String str, long j) {
        byte[] bArr = this.f39024saneness.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }
}
