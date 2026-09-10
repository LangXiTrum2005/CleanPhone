package com.smartdigimkt.o4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f37444a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f37445b = new ArrayList();

    public k a(String str, String str2) {
        return a(str, (Object) str2);
    }

    public List<String> b() {
        return Collections.unmodifiableList(new ArrayList(this.f37445b));
    }

    public k a(String str, long j) {
        return a(str, Long.valueOf(j));
    }

    public k a(String str, byte[] bArr) {
        return a(str, (Object) Arrays.copyOf(bArr, bArr.length));
    }

    public k a(String str) {
        this.f37445b.add(str);
        this.f37444a.remove(str);
        return this;
    }

    public Map<String, Object> a() {
        HashMap map = new HashMap(this.f37444a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    private k a(String str, Object obj) {
        this.f37444a.put((String) com.smartdigimkt.p4.a.a(str), com.smartdigimkt.p4.a.a(obj));
        this.f37445b.remove(str);
        return this;
    }
}
