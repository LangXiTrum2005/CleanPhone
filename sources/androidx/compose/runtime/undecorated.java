package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/undecorated;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/unconsolidated;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "value", "Landroidx/compose/runtime/claque;", "dern", "(Ljava/lang/Object;)Landroidx/compose/runtime/claque;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class undecorated<T> extends unconsolidated<T> {
    public undecorated(Function0<? extends T> function0) {
        super(function0);
    }

    @Override // androidx.compose.runtime.unconsolidated
    public claque<T> dern(T value) {
        return new claque<>(this, value, value == null, null, null, null, false);
    }
}
