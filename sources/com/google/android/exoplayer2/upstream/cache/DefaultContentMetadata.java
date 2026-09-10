package com.google.android.exoplayer2.upstream.cache;

import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultContentMetadata implements ContentMetadata {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DefaultContentMetadata f18879c = new DefaultContentMetadata(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f18881b;

    public DefaultContentMetadata(Map map) {
        this.f18881b = Collections.unmodifiableMap(map);
    }

    public static boolean c(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final DefaultContentMetadata a(ContentMetadataMutations contentMetadataMutations) {
        byte[] bytes;
        Map map = this.f18881b;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(contentMetadataMutations.f18878b));
        for (int i2 = 0; i2 < listUnmodifiableList.size(); i2++) {
            map2.remove(listUnmodifiableList.get(i2));
        }
        HashMap map3 = new HashMap(contentMetadataMutations.f18877a);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(map3).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bytes = ((String) value2).getBytes(Charsets.f19705c);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value2;
            }
            map2.put(str, bytes);
        }
        return c(map, map2) ? this : new DefaultContentMetadata(map2);
    }

    public final long b() {
        byte[] bArr = (byte[]) this.f18881b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultContentMetadata.class != obj.getClass()) {
            return false;
        }
        return c(this.f18881b, ((DefaultContentMetadata) obj).f18881b);
    }

    public final int hashCode() {
        if (this.f18880a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f18881b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f18880a = iHashCode;
        }
        return this.f18880a;
    }
}
