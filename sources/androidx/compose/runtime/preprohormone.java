package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH ¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/preprohormone;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/claque;", "value", "Landroidx/compose/runtime/hydromechanics;", "previous", "saneness", "(Landroidx/compose/runtime/claque;Landroidx/compose/runtime/hydromechanics;)Landroidx/compose/runtime/hydromechanics;", "attabal", "Landroidx/compose/runtime/hydromechanics;", "()Landroidx/compose/runtime/hydromechanics;", "defaultValueHolder", "Landroidx/compose/runtime/unconsolidated;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class preprohormone<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final hydromechanics<T> defaultValueHolder;

    public /* synthetic */ preprohormone(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public hydromechanics<T> attabal() {
        return this.defaultValueHolder;
    }

    public abstract hydromechanics<T> saneness(claque<T> value, hydromechanics<T> previous);

    public preprohormone(Function0<? extends T> function0) {
        this.defaultValueHolder = new timberyard(function0);
    }
}
