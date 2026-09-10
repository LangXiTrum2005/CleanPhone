package ae;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f3501a;

    public f(Type type) {
        Objects.requireNonNull(type);
        this.f3501a = i.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && i.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f3501a;
    }

    public final int hashCode() {
        return this.f3501a.hashCode();
    }

    public final String toString() {
        return i.l(this.f3501a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
