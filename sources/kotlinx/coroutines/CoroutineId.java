package kotlinx.coroutines;

import com.applovin.impl.Z;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CoroutineId extends AbstractCoroutineContextElement implements ThreadContextElement<String> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key implements CoroutineContext.Key<CoroutineId> {
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final void J(Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final Object T(CoroutineContext coroutineContext) {
        String str;
        CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.f44748Y);
        if (coroutineName == null || (str = coroutineName.X) == null) {
            str = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iY = StringsKt.y(6, " @", name);
        if (iY < 0) {
            iY = name.length();
        }
        StringBuilder sb = new StringBuilder(Z.d(str, iY, 10));
        String strSubstring = name.substring(0, iY);
        Intrinsics.e(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append("#0");
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        threadCurrentThread.setName(string);
        return name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoroutineId)) {
            return false;
        }
        ((CoroutineId) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "CoroutineId(0)";
    }
}
