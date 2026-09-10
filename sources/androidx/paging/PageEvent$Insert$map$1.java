package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {128}, m = "map")
final class PageEvent$Insert$map$1<R> extends ContinuationImpl {
    public Function2 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public PageEvent.Insert f7825Y;
    public LoadType Z;
    public Collection e0;
    public Iterator f0;
    public TransformablePage g0;
    public int[] h0;
    public Collection i0;
    public Iterator j0;
    public Collection k0;
    public Collection l0;
    public /* synthetic */ Object m0;
    public final /* synthetic */ PageEvent.Insert n0;
    public int o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$Insert$map$1(PageEvent.Insert insert, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.n0 = insert;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0088  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:20:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x00de  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0088 -> B:16:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00de -> B:22:0x00e5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent$Insert$map$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
