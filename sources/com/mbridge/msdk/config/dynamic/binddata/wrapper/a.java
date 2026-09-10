package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.config.component.common.express.operator.v;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ld.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<b<String>>> f32706a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f32707b = new ConcurrentHashMap<>();

    public void a(String str, b<String> bVar) {
        try {
            this.f32706a.computeIfAbsent(str, new v(3)).addIfAbsent(bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to add map observer: " + e10.getMessage(), e10);
        }
    }

    public boolean d() {
        return this.f32707b.isEmpty();
    }

    @NonNull
    public Set<String> e() {
        return this.f32707b.keySet();
    }

    public int f() {
        return this.f32707b.size();
    }

    @NonNull
    public Collection<Object> g() {
        return this.f32707b.values();
    }

    @NonNull
    public String toString() {
        return this.f32707b.toString();
    }

    public void b(String str, b<String> bVar) {
        try {
            a(str, bVar);
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to pre-register map observer: " + e10.getMessage(), e10);
        }
    }

    public Map<String, CopyOnWriteArrayList<b<String>>> c() {
        return this.f32706a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CopyOnWriteArrayList a(String str) {
        return new CopyOnWriteArrayList();
    }

    @Nullable
    public Object c(@Nullable Object obj) {
        return this.f32707b.remove(obj);
    }

    public boolean a(@Nullable Object obj) {
        return this.f32707b.containsKey(obj);
    }

    public Map<String, Object> b() {
        return this.f32707b;
    }

    @NonNull
    public Set<Map.Entry<String, Object>> a() {
        return this.f32707b.entrySet();
    }

    public void b(Map<String, CopyOnWriteArrayList<b<String>>> map) {
        this.f32706a.clear();
        this.f32706a.putAll(map);
    }

    public void a(@NonNull Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Nullable
    public Object b(@Nullable Object obj) {
        return this.f32707b.get(obj);
    }

    public Integer a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            this.f32707b.put(str, obj);
            a(str, obj, str);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", e10.getMessage(), e10);
            return 0;
        }
    }

    public Integer a(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        try {
            this.f32707b.put(str2, obj);
            a(str, obj, str2);
            return 1;
        } catch (Exception e10) {
            q0.b("ObservableMap", "Failed to notify map observers: " + e10.getMessage(), e10);
            return 0;
        }
    }

    private void a(String str, Object obj, String str2) {
        CopyOnWriteArrayList<b<String>> copyOnWriteArrayList;
        if (this.f32706a.containsKey(str) && (copyOnWriteArrayList = this.f32706a.get(str)) != null) {
            for (b<String> bVar : copyOnWriteArrayList) {
                if (bVar instanceof d) {
                    d dVar = (d) bVar;
                    View viewA = dVar.a();
                    if (viewA != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            bVar.a(str, obj);
                        } else {
                            viewA.post(new f(dVar, str, obj, 3));
                        }
                    } else {
                        bVar.a(str, obj);
                    }
                } else {
                    bVar.a(str, obj);
                }
            }
        }
    }
}
