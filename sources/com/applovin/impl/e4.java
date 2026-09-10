package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f7787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f7788e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Deque f7789f = new ArrayDeque();

    public e4(com.applovin.impl.sdk.l lVar) {
        this.f7784a = (String) lVar.a(z4.A4);
        this.f7785b = lVar.c(z4.B4);
        this.f7786c = ((Integer) lVar.a(z4.C4)).intValue();
    }

    public Long a() {
        return this.f7787d;
    }

    public Deque b() {
        return this.f7789f;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || this.f7786c <= 0) {
            return;
        }
        Map map = (Map) this.f7788e.remove(str);
        if (CollectionUtils.isEmpty(map)) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("cc_ms", Long.valueOf(System.currentTimeMillis()));
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (!CollectionUtils.isEmpty(list)) {
                Iterator it = list.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                map2.put((String) entry.getKey(), Long.valueOf(jLongValue / ((long) list.size())));
            }
        }
        if (this.f7789f.size() == this.f7786c) {
            this.f7789f.pollLast();
        }
        this.f7789f.addFirst(map2);
    }

    public void b(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!CollectionUtils.isEmpty(this.f7785b) && this.f7786c > 0) {
            for (String str3 : this.f7785b) {
                if (StringUtils.isValidString(str3) && str.endsWith(str3)) {
                    a(j10, str3, str2);
                    break;
                }
            }
        }
        if (StringUtils.isValidString(this.f7784a) && str.endsWith(this.f7784a)) {
            this.f7787d = Long.valueOf(j10);
        }
    }

    private void a(long j10, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f7788e.get(str2);
        if (map == null) {
            map = new HashMap();
            this.f7788e.put(str2, map);
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        arrayList.add(Long.valueOf(j10));
    }
}
