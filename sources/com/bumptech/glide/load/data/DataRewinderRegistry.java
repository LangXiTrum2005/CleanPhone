package com.bumptech.glide.load.data;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class DataRewinderRegistry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DataRewinder.Factory f12373b = new AnonymousClass1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12374a = new HashMap();

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.DataRewinderRegistry$1, reason: invalid class name */
    public class AnonymousClass1 implements DataRewinder.Factory<Object> {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public final Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public final DataRewinder b(Object obj) {
            return new DefaultRewinder(obj);
        }
    }

    public static final class DefaultRewinder implements DataRewinder<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f12375a;

        public DefaultRewinder(Object obj) {
            this.f12375a = obj;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        public final Object a() {
            return this.f12375a;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        public final void b() {
        }
    }
}
