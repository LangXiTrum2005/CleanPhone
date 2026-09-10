package androidx.paging;

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
@DebugMetadata(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", l = {48}, m = "map")
final class PageEvent$StaticList$map$1<R> extends ContinuationImpl {
    public PageEvent.StaticList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Function2 f7830Y;
    public Collection Z;
    public Iterator e0;
    public Collection f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ PageEvent.StaticList h0;
    public int i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$map$1(PageEvent.StaticList staticList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h0 = staticList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PageEvent$StaticList$map$1<R> pageEvent$StaticList$map$1;
        this.g0 = obj;
        this.i0 |= Integer.MIN_VALUE;
        PageEvent.StaticList staticList = this.h0;
        staticList.getClass();
        int i2 = this.i0;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.i0 = i2 - Integer.MIN_VALUE;
            pageEvent$StaticList$map$1 = this;
        } else {
            pageEvent$StaticList$map$1 = new PageEvent$StaticList$map$1<>(staticList, this);
        }
        Object objInvoke = pageEvent$StaticList$map$1.g0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = pageEvent$StaticList$map$1.i0;
        if (i3 == 0) {
            ResultKt.b(objInvoke);
            CollectionsKt.n(null, 10);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Collection collection = pageEvent$StaticList$map$1.f0;
        Iterator it = pageEvent$StaticList$map$1.e0;
        Collection collection2 = pageEvent$StaticList$map$1.Z;
        Function2 function2 = pageEvent$StaticList$map$1.f7830Y;
        PageEvent.StaticList staticList2 = pageEvent$StaticList$map$1.X;
        ResultKt.b(objInvoke);
        while (true) {
            collection.add(objInvoke);
            if (!it.hasNext()) {
                throw null;
            }
            Object next = it.next();
            pageEvent$StaticList$map$1.X = staticList2;
            pageEvent$StaticList$map$1.f7830Y = function2;
            Collection collection3 = collection2;
            pageEvent$StaticList$map$1.Z = collection3;
            pageEvent$StaticList$map$1.e0 = it;
            pageEvent$StaticList$map$1.f0 = collection3;
            pageEvent$StaticList$map$1.i0 = 1;
            objInvoke = function2.invoke(next, pageEvent$StaticList$map$1);
            if (objInvoke == coroutineSingletons) {
                return CoroutineSingletons.X;
            }
            collection = collection2;
        }
    }
}
