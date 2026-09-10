package qk;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f49101a;

    public a(Type elementType) {
        kotlin.jvm.internal.n.f(elementType, "elementType");
        this.f49101a = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return kotlin.jvm.internal.n.a(this.f49101a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f49101a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return i0.b(this.f49101a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public final int hashCode() {
        return this.f49101a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
