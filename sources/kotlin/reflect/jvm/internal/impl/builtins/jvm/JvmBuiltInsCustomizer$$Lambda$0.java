package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes7.dex */
class JvmBuiltInsCustomizer$$Lambda$0 implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JvmBuiltInsCustomizer$$Lambda$0 f43546a = new JvmBuiltInsCustomizer$$Lambda$0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable a(Object obj) {
        KProperty[] kPropertyArr = JvmBuiltInsCustomizer.g;
        return ((CallableMemberDescriptor) obj).y0().l();
    }
}
