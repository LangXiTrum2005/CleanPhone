package com.smartdigimkt.o4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements i {
    public static final l d = new l(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37446e = 10485760;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, byte[]> f37448c;

    private l(Map<String, byte[]> map) {
        this.f37448c = Collections.unmodifiableMap(map);
    }

    public static l a(DataInputStream dataInputStream) throws IOException {
        int i2 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            String utf = dataInputStream.readUTF();
            int i4 = dataInputStream.readInt();
            if (i4 < 0 || i4 > f37446e) {
                throw new IOException(android.support.v4.media.a.h(i4, "Invalid value size: "));
            }
            byte[] bArr = new byte[i4];
            dataInputStream.readFully(bArr);
            map.put(utf, bArr);
        }
        return new l(map);
    }

    @Override // com.smartdigimkt.o4.i
    public final boolean contains(String str) {
        return this.f37448c.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return a(((l) obj).f37448c);
    }

    public int hashCode() {
        if (this.f37447b == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f37448c.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f37447b = iHashCode;
        }
        return this.f37447b;
    }

    public l a(k kVar) {
        Map<String, byte[]> mapA = a(this.f37448c, kVar);
        return a(mapA) ? this : new l(mapA);
    }

    public void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.f37448c.size());
        for (Map.Entry<String, byte[]> entry : this.f37448c.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.smartdigimkt.o4.i
    public final byte[] a(String str, byte[] bArr) {
        if (!this.f37448c.containsKey(str)) {
            return bArr;
        }
        byte[] bArr2 = this.f37448c.get(str);
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    @Override // com.smartdigimkt.o4.i
    public final String a(String str, String str2) {
        return this.f37448c.containsKey(str) ? new String(this.f37448c.get(str), Charset.forName("UTF-8")) : str2;
    }

    @Override // com.smartdigimkt.o4.i
    public final long a(String str, long j) {
        return this.f37448c.containsKey(str) ? ByteBuffer.wrap(this.f37448c.get(str)).getLong() : j;
    }

    private boolean a(Map<String, byte[]> map) {
        if (this.f37448c.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : this.f37448c.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static Map<String, byte[]> a(Map<String, byte[]> map, k kVar) {
        HashMap map2 = new HashMap(map);
        a((HashMap<String, byte[]>) map2, kVar.b());
        a((HashMap<String, byte[]>) map2, kVar.a());
        return map2;
    }

    private static void a(HashMap<String, byte[]> map, List<String> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            map.remove(list.get(i2));
        }
    }

    private static void a(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (String str : map2.keySet()) {
            byte[] bArrA = a(map2.get(str));
            if (bArrA.length <= f37446e) {
                map.put(str, bArrA);
            } else {
                throw new IllegalArgumentException(String.format("The size of %s (%d) is greater than maximum allowed: %d", str, Integer.valueOf(bArrA.length), Integer.valueOf(f37446e)));
            }
        }
    }

    private static byte[] a(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName("UTF-8"));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }
}
