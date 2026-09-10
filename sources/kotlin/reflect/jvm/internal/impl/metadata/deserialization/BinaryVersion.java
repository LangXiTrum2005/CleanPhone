package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import android.support.v4.media.a;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt$asList$3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BinaryVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f44098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44100c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f44101e;

    public static final class Companion {
    }

    public BinaryVersion(int... numbers) {
        List listI0;
        Intrinsics.f(numbers, "numbers");
        this.f44098a = numbers;
        Integer numZ = ArraysKt.z(0, numbers);
        this.f44099b = numZ != null ? numZ.intValue() : -1;
        Integer numZ2 = ArraysKt.z(1, numbers);
        this.f44100c = numZ2 != null ? numZ2.intValue() : -1;
        Integer numZ3 = ArraysKt.z(2, numbers);
        this.d = numZ3 != null ? numZ3.intValue() : -1;
        if (numbers.length <= 3) {
            listI0 = EmptyList.X;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(a.p(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            listI0 = CollectionsKt.i0(new ArraysKt___ArraysJvmKt$asList$3(numbers).subList(3, numbers.length));
        }
        this.f44101e = listI0;
    }

    public final boolean a(int i2, int i3, int i4) {
        int i5 = this.f44099b;
        if (i5 > i2) {
            return true;
        }
        if (i5 < i2) {
            return false;
        }
        int i6 = this.f44100c;
        if (i6 > i3) {
            return true;
        }
        return i6 >= i3 && this.d >= i4;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.f44099b == binaryVersion.f44099b && this.f44100c == binaryVersion.f44100c && this.d == binaryVersion.d && Intrinsics.a(this.f44101e, binaryVersion.f44101e);
    }

    public final int hashCode() {
        int i2 = this.f44099b;
        int i3 = (i2 * 31) + this.f44100c + i2;
        int i4 = (i3 * 31) + this.d + i3;
        return this.f44101e.hashCode() + (i4 * 31) + i4;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i2 : this.f44098a) {
            if (i2 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.D(arrayList, mo.ono, null, null, null, 62);
    }
}
