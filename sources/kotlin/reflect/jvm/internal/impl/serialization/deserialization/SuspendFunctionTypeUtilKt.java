package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.CallableId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class SuspendFunctionTypeUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f44437a = new FqName("kotlin.suspend");

    static {
        new CallableId(StandardNames.k, Name.g("suspend"));
    }
}
