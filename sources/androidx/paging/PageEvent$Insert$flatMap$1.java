package androidx.paging;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {140}, m = "flatMap")
final class PageEvent$Insert$flatMap$1<R> extends ContinuationImpl {
    public Function2 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public PageEvent.Insert f7824Y;
    public LoadType Z;
    public Collection e0;
    public Iterator f0;
    public TransformablePage g0;
    public List h0;
    public List i0;
    public Iterator j0;
    public Collection k0;
    public Collection l0;
    public int m0;
    public int n0;
    public /* synthetic */ Object o0;
    public final /* synthetic */ PageEvent.Insert p0;
    public int q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$Insert$flatMap$1(PageEvent.Insert insert, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.p0 = insert;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0095  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:20:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:22:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:31:0x0138  */
    /* JADX WARN: Code duplicated, block: B:33:0x013c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0095 -> B:16:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00fb -> B:24:0x0107). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageEvent$Insert$flatMap$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
