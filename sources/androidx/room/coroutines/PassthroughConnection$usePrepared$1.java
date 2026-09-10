package androidx.room.coroutines;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS, 91}, m = "usePrepared")
final class PassthroughConnection$usePrepared$1<R> extends ContinuationImpl {
    public String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Function1 f8291Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ PassthroughConnection e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnection$usePrepared$1(PassthroughConnection passthroughConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e0 = passthroughConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.f0 |= Integer.MIN_VALUE;
        return this.e0.b(null, null, this);
    }
}
