package androidx.room.util;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {262, 264, 264}, m = "performSuspending")
final class DBUtil__DBUtil_androidKt$performSuspending$1<R> extends ContinuationImpl {
    public Function1 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f8336Y;
    public int Z;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8336Y = obj;
        this.Z |= Integer.MIN_VALUE;
        return DBUtil.b(false, null, this);
    }
}
