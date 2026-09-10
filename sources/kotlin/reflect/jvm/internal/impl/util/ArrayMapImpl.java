package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;

/* JADX INFO: loaded from: classes7.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {
    public Object[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44604Y;

    public static final class Companion {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final int a() {
        return this.f44604Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final void c(int i2, TypeAttribute typeAttribute) {
        Object[] objArr = this.X;
        if (objArr.length <= i2) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            Intrinsics.e(objArrCopyOf, "copyOf(this, newSize)");
            this.X = objArrCopyOf;
        }
        Object[] objArr2 = this.X;
        if (objArr2[i2] == null) {
            this.f44604Y++;
        }
        objArr2[i2] = typeAttribute;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final Object get(int i2) {
        return ArraysKt.A(i2, this.X);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public final Iterator iterator() {
        return new AbstractIterator<Object>() { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1
            public int Z = -1;

            @Override // kotlin.collections.AbstractIterator
            public final void a() {
                int i2;
                Object[] objArr;
                do {
                    i2 = this.Z + 1;
                    this.Z = i2;
                    objArr = ArrayMapImpl.this.X;
                    if (i2 >= objArr.length) {
                        break;
                    }
                } while (objArr[i2] == null);
                if (i2 >= objArr.length) {
                    this.X = 2;
                    return;
                }
                Object obj = objArr[i2];
                Intrinsics.d(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                this.f43267Y = obj;
                this.X = 1;
            }
        };
    }
}
