package com.p004ironsource;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a/\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "initialValue", "Lkotlin/properties/ReadWriteProperty;", "", "a", "(Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class df {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J&\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"com/ironsource/df$a", "Lkotlin/properties/ReadWriteProperty;", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "(Ljava/lang/ref/WeakReference;)V", "reference", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a<T> implements ReadWriteProperty<Object, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private WeakReference<T> reference;

        public a(T t) {
            this.reference = new WeakReference<>(t);
        }

        public final WeakReference<T> a() {
            return this.reference;
        }

        @Override // kotlin.properties.ReadOnlyProperty
        public T getValue(Object thisRef, KProperty<?> property) {
            Intrinsics.f(thisRef, "thisRef");
            Intrinsics.f(property, "property");
            return this.reference.get();
        }

        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(Object thisRef, KProperty<?> property, T value) {
            Intrinsics.f(thisRef, "thisRef");
            Intrinsics.f(property, "property");
            this.reference = new WeakReference<>(value);
        }

        public final void a(WeakReference<T> weakReference) {
            Intrinsics.f(weakReference, "<set-?>");
            this.reference = weakReference;
        }
    }

    public static final <T> ReadWriteProperty<Object, T> a(T t) {
        return new a(t);
    }

    public static /* synthetic */ ReadWriteProperty a(Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }
}
