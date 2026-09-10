package kotlin.reflect.jvm.internal.impl.name;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class CallableId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FqName f44159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Name f44160b;

    public static final class Companion {
    }

    static {
        FqName.j(SpecialNames.f);
    }

    public CallableId(FqName packageName, Name name) {
        Intrinsics.f(packageName, "packageName");
        this.f44159a = packageName;
        this.f44160b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.a(this.f44159a, callableId.f44159a) && this.f44160b.equals(callableId.f44160b);
    }

    public final int hashCode() {
        return (this.f44160b.hashCode() + (this.f44159a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = StringsKt.H(this.f44159a.b(), '.', IOUtils.DIR_SEPARATOR_UNIX) + "/" + this.f44160b;
        Intrinsics.e(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
