package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/ComputableClassValue;", "V", "Ljava/lang/ClassValue;", "Ljava/lang/ref/SoftReference;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ComputableClassValue<V> extends ClassValue<SoftReference<V>> {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class type) {
        Intrinsics.f(type, "type");
        throw null;
    }
}
