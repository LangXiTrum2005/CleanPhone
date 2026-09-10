package com.google.common.collect;

import java.util.EnumSet;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class CollectCollectors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19797a = 0;

    public static class EnumMapAccumulator<K extends Enum<K>, V> {
    }

    public static final class EnumSetAccumulator<E extends Enum<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public EnumSet f19798a;

        static {
            int i2 = CollectCollectors.f19797a;
            Collector.of(new a(0), new b(0), new c(0), new d(0), Collector.Characteristics.UNORDERED);
        }
    }

    static {
        Collector.of(new a(4), new b(5), new c(1), new d(5), new Collector.Characteristics[0]);
        Collector.of(new a(2), new b(3), new c(3), new d(4), new Collector.Characteristics[0]);
        Collector.of(new a(3), new b(4), new c(4), new d(1), new Collector.Characteristics[0]);
    }
}
