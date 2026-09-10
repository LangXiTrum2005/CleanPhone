package com.ironsource;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0298d7 {

    /* JADX INFO: renamed from: com.ironsource.d7$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements mk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<T> f28420a;

        public a(T t10) {
            this.f28420a = new WeakReference<>(t10);
        }

        public final WeakReference<T> a() {
            return this.f28420a;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
        @Override // mk.a
        public T getValue(Object thisRef, qk.w property) {
            kotlin.jvm.internal.n.f(thisRef, "thisRef");
            kotlin.jvm.internal.n.f(property, "property");
            return this.f28420a.get();
        }

        @Override // mk.b
        public void setValue(Object thisRef, qk.w property, T t10) {
            kotlin.jvm.internal.n.f(thisRef, "thisRef");
            kotlin.jvm.internal.n.f(property, "property");
            this.f28420a = new WeakReference<>(t10);
        }

        public final void a(WeakReference<T> weakReference) {
            kotlin.jvm.internal.n.f(weakReference, "<set-?>");
            this.f28420a = weakReference;
        }
    }

    public static /* synthetic */ mk.b a(Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final <T> mk.b a(T t10) {
        return new a(t10);
    }
}
