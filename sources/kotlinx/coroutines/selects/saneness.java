package kotlinx.coroutines.selects;

import kotlinx.coroutines.splinterproof;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: OnTimeout.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\r\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"R", "Lkotlinx/coroutines/selects/dern;", "", "timeMillis", "Lkotlin/Function1;", "Lwretchedly/dern;", "", "block", "", "attabal", "(Lkotlinx/coroutines/selects/dern;JLkotlin/jvm/functions/Function1;)V", "Lkotlin/time/saneness;", "timeout", "saneness", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class saneness {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <R> void attabal(dern<? super R> dernVar, long j, Function1<? super wretchedly.dern<? super R>, ? extends Object> function1) {
        dernVar.attabal(new OnTimeout(j).dern(), function1);
    }

    public static final <R> void saneness(dern<? super R> dernVar, long j, Function1<? super wretchedly.dern<? super R>, ? extends Object> function1) {
        attabal(dernVar, splinterproof.wireman(j), function1);
    }
}
