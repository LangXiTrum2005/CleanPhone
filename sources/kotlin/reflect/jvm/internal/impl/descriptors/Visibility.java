package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Visibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43605b;

    public Visibility(String str, boolean z2) {
        this.f43604a = str;
        this.f43605b = z2;
    }

    public Integer a(Visibility visibility) {
        Intrinsics.f(visibility, "visibility");
        MapBuilder mapBuilder = Visibilities.f43594a;
        if (this == visibility) {
            return 0;
        }
        MapBuilder mapBuilder2 = Visibilities.f43594a;
        Integer num = (Integer) mapBuilder2.get(this);
        Integer num2 = (Integer) mapBuilder2.get(visibility);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String b() {
        return this.f43604a;
    }

    public Visibility c() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
