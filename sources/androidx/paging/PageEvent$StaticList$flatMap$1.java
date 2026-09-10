package androidx.paging;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", l = {58}, m = "flatMap")
final class PageEvent$StaticList$flatMap$1<R> extends ContinuationImpl {
    public PageEvent.StaticList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Function2 f7829Y;
    public Collection Z;
    public Iterator e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ PageEvent.StaticList g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$flatMap$1(PageEvent.StaticList staticList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g0 = staticList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PageEvent$StaticList$flatMap$1<R> pageEvent$StaticList$flatMap$1;
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        PageEvent.StaticList staticList = this.g0;
        staticList.getClass();
        int i2 = this.h0;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.h0 = i2 - Integer.MIN_VALUE;
            pageEvent$StaticList$flatMap$1 = this;
        } else {
            pageEvent$StaticList$flatMap$1 = new PageEvent$StaticList$flatMap$1<>(staticList, this);
        }
        Object objInvoke = pageEvent$StaticList$flatMap$1.f0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = pageEvent$StaticList$flatMap$1.h0;
        if (i3 == 0) {
            ResultKt.b(objInvoke);
            new ArrayList();
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = pageEvent$StaticList$flatMap$1.e0;
        Collection collection = pageEvent$StaticList$flatMap$1.Z;
        Function2 function2 = pageEvent$StaticList$flatMap$1.f7829Y;
        PageEvent.StaticList staticList2 = pageEvent$StaticList$flatMap$1.X;
        ResultKt.b(objInvoke);
        do {
            CollectionsKt.g((Iterable) objInvoke, collection);
            if (!it.hasNext()) {
                throw null;
            }
            Object next = it.next();
            pageEvent$StaticList$flatMap$1.X = staticList2;
            pageEvent$StaticList$flatMap$1.f7829Y = function2;
            pageEvent$StaticList$flatMap$1.Z = collection;
            pageEvent$StaticList$flatMap$1.e0 = it;
            pageEvent$StaticList$flatMap$1.h0 = 1;
            objInvoke = function2.invoke(next, pageEvent$StaticList$flatMap$1);
        } while (objInvoke != coroutineSingletons);
        return CoroutineSingletons.X;
    }
}
