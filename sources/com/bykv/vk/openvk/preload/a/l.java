package com.bykv.vk.openvk.preload.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class l<IN, OUT> extends d<IN, OUT> {
    private Map<String, a> d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<h> f12878a = new ArrayList();

        public final a a(h hVar) {
            this.f12878a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f12878a.addAll(list);
            return this;
        }
    }

    public final Map<String, a> a() {
        return this.d;
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && ((h) androidx.media3.extractor.text.ttml.a.h(1, list)).f12869a == f.class;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, a> f12879a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f12880b;

        public final a a(String str) {
            if (this.f12879a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f12879a.put(str, aVar);
            return aVar;
        }

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.f12879a).a(this.f12880b).b();
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.d = (Map) obj;
                return;
            } catch (ClassCastException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        throw new IllegalStateException("args error");
    }
}
