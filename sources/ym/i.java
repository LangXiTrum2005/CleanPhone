package ym;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.n;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractSet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f54555c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f54556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54557b;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        int i10 = this.f54557b;
        if (i10 == 0) {
            this.f54556a = obj;
        } else if (i10 == 1) {
            if (n.a(this.f54556a, obj)) {
                return false;
            }
            this.f54556a = new Object[]{this.f54556a, obj};
        } else if (i10 < 5) {
            Object obj3 = this.f54556a;
            n.d(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (xj.k.c0(objArr, obj)) {
                return false;
            }
            int i11 = this.f54557b;
            if (i11 == 4) {
                Object[] elements = Arrays.copyOf(objArr, objArr.length);
                n.f(elements, "elements");
                LinkedHashSet linkedHashSet = new LinkedHashSet(b0.O(elements.length));
                xj.k.A0(elements, linkedHashSet);
                linkedHashSet.add(obj);
                obj2 = linkedHashSet;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, i11 + 1);
                n.e(objArrCopyOf, "copyOf(this, newSize)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f54556a = obj2;
        } else {
            Object obj4 = this.f54556a;
            n.d(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!h0.c(obj4).add(obj)) {
                return false;
            }
        }
        this.f54557b++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f54556a = null;
        this.f54557b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f54557b;
        if (i10 == 0) {
            return false;
        }
        if (i10 == 1) {
            return n.a(this.f54556a, obj);
        }
        if (i10 < 5) {
            Object obj2 = this.f54556a;
            n.d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return xj.k.c0((Object[]) obj2, obj);
        }
        Object obj3 = this.f54556a;
        n.d(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = this.f54557b;
        if (i10 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i10 == 1) {
            return new h(this.f54556a, 0);
        }
        if (i10 < 5) {
            Object obj = this.f54556a;
            n.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new g((Object[]) obj);
        }
        Object obj2 = this.f54556a;
        n.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return h0.c(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f54557b;
    }
}
