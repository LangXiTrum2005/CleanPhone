package com.bykv.vk.openvk.preload.b;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
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
        List<h> f313a = new ArrayList();

        public final a a(h hVar) {
            this.f313a.add(hVar);
            return this;
        }

        public final a a(List<h> list) {
            this.f313a.addAll(list);
            return this;
        }
    }

    public final Map<String, a> a() {
        return this.d;
    }

    public static boolean a(List<h> list) {
        return !list.isEmpty() && ((h) DM.f(list, 1)).f310a == f.class;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, a> f314a = new HashMap();

        public final a a(String str) {
            if (this.f314a.containsKey(str)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a aVar = new a();
            this.f314a.put(str, aVar);
            return aVar;
        }

        public final h a(Class<? extends l> cls) {
            return h.a.a().a(cls).a(this.f314a).a((com.bykv.vk.openvk.preload.b.b.a) null).b();
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        Object obj;
        super.a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.d = (Map) obj;
                return;
            } catch (ClassCastException e) {
                throw new IllegalArgumentException(e);
            }
        }
        throw new IllegalStateException("args error");
    }
}
