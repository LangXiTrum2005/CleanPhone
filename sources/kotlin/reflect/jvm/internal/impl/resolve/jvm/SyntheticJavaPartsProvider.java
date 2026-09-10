package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import kotlin.collections.builders.ListBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public interface SyntheticJavaPartsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f44322a = Companion.f44323a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f44323a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CompositeSyntheticJavaPartsProvider f44324b = new CompositeSyntheticJavaPartsProvider();
    }

    void a(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, Name name, ArrayList arrayList);

    ArrayList b(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassDescriptor lazyJavaClassDescriptor);

    ArrayList c(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor);

    void d(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassDescriptor lazyJavaClassDescriptor, Name name, ArrayList arrayList);

    ArrayList e(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor);

    void f(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, ArrayList arrayList);

    void g(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, Name name, ListBuilder listBuilder);
}
