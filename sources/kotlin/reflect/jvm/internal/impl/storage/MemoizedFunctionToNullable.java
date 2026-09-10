package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public interface MemoizedFunctionToNullable<P, R> extends Function1<P, R> {
    boolean b(FqName fqName);
}
