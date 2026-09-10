package com.ironsource;

import java.lang.ref.WeakReference;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3437b7 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.ironsource.b7$a */
    public static final class a<T> implements bren.wireman<Object, T> {
        private WeakReference<T> a;

        public a(T t) {
            this.a = new WeakReference<>(t);
        }

        public final WeakReference<T> a() {
            return this.a;
        }

        @Override // bren.wireman, bren.dern
        public T getValue(Object thisRef, kurbash.formularize<?> property) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            return this.a.get();
        }

        @Override // bren.wireman
        public void setValue(Object thisRef, kurbash.formularize<?> property, T t) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            Intrinsics.checkNotNullParameter(property, "property");
            this.a = new WeakReference<>(t);
        }

        public final void a(WeakReference<T> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.a = weakReference;
        }
    }

    public static /* synthetic */ bren.wireman a(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final <T> bren.wireman<Object, T> a(T t) {
        return new a(t);
    }
}
