package com.startapp.sdk.components;

import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CopyableThreadContextElement;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int X;

    public /* synthetic */ e(int i2) {
        this.X = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        switch (this.X) {
            case 0:
                return a.a((String) obj, (String) obj2);
            case 1:
                String acc = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.f(acc, "acc");
                Intrinsics.f(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 2:
                CoroutineContext acc2 = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                Intrinsics.f(acc2, "acc");
                Intrinsics.f(element2, "element");
                CoroutineContext coroutineContextMinusKey = acc2.minusKey(element2.getX());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.X;
                if (coroutineContextMinusKey == emptyCoroutineContext) {
                    return element2;
                }
                ContinuationInterceptor.Key key = ContinuationInterceptor.Key.X;
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContextMinusKey.get(key);
                if (continuationInterceptor == null) {
                    combinedContext = new CombinedContext(element2, coroutineContextMinusKey);
                } else {
                    CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(key);
                    if (coroutineContextMinusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(continuationInterceptor, element2);
                    }
                    combinedContext = new CombinedContext(continuationInterceptor, new CombinedContext(element2, coroutineContextMinusKey2));
                }
                return combinedContext;
            case 3:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((CoroutineContext.Element) obj2) instanceof CopyableThreadContextElement));
            case 4:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                return element3 instanceof CopyableThreadContextElement ? coroutineContext.plus(((CopyableThreadContextElement) element3).t()) : coroutineContext.plus(element3);
            case 5:
                return Boolean.valueOf(Intrinsics.a(obj, obj2));
            default:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
        }
    }
}
