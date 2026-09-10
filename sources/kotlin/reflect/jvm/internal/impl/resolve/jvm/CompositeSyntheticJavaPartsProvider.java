package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void a(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor, Name name, ArrayList arrayList) {
        Intrinsics.f(_context_receiver_0, "_context_receiver_0");
        Intrinsics.f(thisDescriptor, "thisDescriptor");
        Intrinsics.f(name, "name");
        Iterator<E> it = EmptyList.X.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).a(_context_receiver_0, thisDescriptor, name, arrayList);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final ArrayList b(LazyJavaResolverContext _context_receiver_0, LazyJavaClassDescriptor thisDescriptor) {
        Intrinsics.f(_context_receiver_0, "_context_receiver_0");
        Intrinsics.f(thisDescriptor, "thisDescriptor");
        EmptyList emptyList = EmptyList.X;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = emptyList.iterator();
        while (it.hasNext()) {
            CollectionsKt.g(((SyntheticJavaPartsProvider) it.next()).b(_context_receiver_0, thisDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final ArrayList c(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor) {
        Intrinsics.f(_context_receiver_0, "_context_receiver_0");
        Intrinsics.f(thisDescriptor, "thisDescriptor");
        EmptyList emptyList = EmptyList.X;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = emptyList.iterator();
        while (it.hasNext()) {
            CollectionsKt.g(((SyntheticJavaPartsProvider) it.next()).c(_context_receiver_0, thisDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void d(LazyJavaResolverContext _context_receiver_0, LazyJavaClassDescriptor thisDescriptor, Name name, ArrayList arrayList) {
        Intrinsics.f(_context_receiver_0, "_context_receiver_0");
        Intrinsics.f(thisDescriptor, "thisDescriptor");
        Intrinsics.f(name, "name");
        Iterator<E> it = EmptyList.X.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).d(_context_receiver_0, thisDescriptor, name, arrayList);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final ArrayList e(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor) {
        Intrinsics.f(_context_receiver_0, "_context_receiver_0");
        Intrinsics.f(thisDescriptor, "thisDescriptor");
        EmptyList emptyList = EmptyList.X;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = emptyList.iterator();
        while (it.hasNext()) {
            CollectionsKt.g(((SyntheticJavaPartsProvider) it.next()).e(_context_receiver_0, thisDescriptor), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void f(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor, ArrayList arrayList) {
        Intrinsics.f(_context_receiver_0, "_context_receiver_0");
        Intrinsics.f(thisDescriptor, "thisDescriptor");
        Iterator<E> it = EmptyList.X.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).f(_context_receiver_0, thisDescriptor, arrayList);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void g(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor, Name name, ListBuilder listBuilder) {
        Intrinsics.f(_context_receiver_0, "_context_receiver_0");
        Intrinsics.f(thisDescriptor, "thisDescriptor");
        Intrinsics.f(name, "name");
        Iterator<E> it = EmptyList.X.iterator();
        while (it.hasNext()) {
            ((SyntheticJavaPartsProvider) it.next()).g(_context_receiver_0, thisDescriptor, name, listBuilder);
        }
    }
}
