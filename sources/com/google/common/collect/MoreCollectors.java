package com.google.common.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class MoreCollectors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f19927a;

    public static final class ToOptionalState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f19928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f19929b;

        public final void a(Object obj) {
            obj.getClass();
            if (this.f19928a == null) {
                this.f19928a = obj;
                return;
            }
            if (this.f19929b.isEmpty()) {
                ArrayList arrayList = new ArrayList(4);
                this.f19929b = arrayList;
                arrayList.add(obj);
            } else if (this.f19929b.size() < 4) {
                this.f19929b.add(obj);
            } else {
                b(true);
                throw null;
            }
        }

        public final void b(boolean z2) {
            StringBuilder sb = new StringBuilder("expected one element but was: <");
            sb.append(this.f19928a);
            for (Object obj : this.f19929b) {
                sb.append(", ");
                sb.append(obj);
            }
            if (z2) {
                sb.append(", ...");
            }
            sb.append('>');
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static {
        a aVar = new a(1);
        b bVar = new b(1);
        c cVar = new c(2);
        d dVar = new d(2);
        Collector.Characteristics characteristics = Collector.Characteristics.UNORDERED;
        Collector.of(aVar, bVar, cVar, dVar, characteristics);
        f19927a = new Object();
        Collector.of(new a(1), new b(2), new c(2), new d(3), characteristics);
    }
}
