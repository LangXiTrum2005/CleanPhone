package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/creditor;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/unconsolidated;", "Landroidx/compose/runtime/tailoring;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Landroidx/compose/runtime/tailoring;Lkotlin/jvm/functions/Function0;)V", "value", "Landroidx/compose/runtime/claque;", "dern", "(Ljava/lang/Object;)Landroidx/compose/runtime/claque;", "saneness", "Landroidx/compose/runtime/tailoring;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class creditor<T> extends unconsolidated<T> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final tailoring<T> policy;

    public creditor(tailoring<T> tailoringVar, Function0<? extends T> function0) {
        super(function0);
        this.policy = tailoringVar;
    }

    @Override // androidx.compose.runtime.unconsolidated
    public claque<T> dern(T value) {
        return new claque<>(this, value, value == null, this.policy, null, null, true);
    }
}
