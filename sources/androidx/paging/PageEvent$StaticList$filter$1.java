package androidx.paging;

import com.smartdigimkt.q0.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", l = {66}, m = b.P0)
final class PageEvent$StaticList$filter$1 extends ContinuationImpl {
    public PageEvent.StaticList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Function2 f7828Y;
    public Collection Z;
    public Iterator e0;
    public Object f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ PageEvent.StaticList h0;
    public int i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$filter$1(PageEvent.StaticList staticList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h0 = staticList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PageEvent$StaticList$filter$1 pageEvent$StaticList$filter$1;
        this.g0 = obj;
        this.i0 |= Integer.MIN_VALUE;
        PageEvent.StaticList staticList = this.h0;
        staticList.getClass();
        int i2 = this.i0;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.i0 = i2 - Integer.MIN_VALUE;
            pageEvent$StaticList$filter$1 = this;
        } else {
            pageEvent$StaticList$filter$1 = new PageEvent$StaticList$filter$1(staticList, this);
        }
        Object objInvoke = pageEvent$StaticList$filter$1.g0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = pageEvent$StaticList$filter$1.i0;
        if (i3 == 0) {
            ResultKt.b(objInvoke);
            new ArrayList();
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object next = pageEvent$StaticList$filter$1.f0;
        Iterator it = pageEvent$StaticList$filter$1.e0;
        Collection collection = pageEvent$StaticList$filter$1.Z;
        Function2 function2 = pageEvent$StaticList$filter$1.f7828Y;
        PageEvent.StaticList staticList2 = pageEvent$StaticList$filter$1.X;
        ResultKt.b(objInvoke);
        do {
            if (((Boolean) objInvoke).booleanValue()) {
                collection.add(next);
            }
            if (!it.hasNext()) {
                throw null;
            }
            next = it.next();
            pageEvent$StaticList$filter$1.X = staticList2;
            pageEvent$StaticList$filter$1.f7828Y = function2;
            pageEvent$StaticList$filter$1.Z = collection;
            pageEvent$StaticList$filter$1.e0 = it;
            pageEvent$StaticList$filter$1.f0 = next;
            pageEvent$StaticList$filter$1.i0 = 1;
            objInvoke = function2.invoke(next, pageEvent$StaticList$filter$1);
        } while (objInvoke != coroutineSingletons);
        return CoroutineSingletons.X;
    }
}
