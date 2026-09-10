package androidx.compose.ui.platform;

import java.util.List;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/mathsort;", "Lstratoscope/saneness;", "saveableStateRegistry", "Lkotlin/Function0;", "", "onDispose", "<init>", "(Lstratoscope/saneness;Lkotlin/jvm/functions/Function0;)V", "", "", "", "", "attabal", "()Ljava/util/Map;", "saneness", "()V", "Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class mathsort implements stratoscope.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function0<Unit> onDispose;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final /* synthetic */ stratoscope.saneness f7454saneness;

    public mathsort(stratoscope.saneness sanenessVar, Function0<Unit> function0) {
        this.onDispose = function0;
        this.f7454saneness = sanenessVar;
    }

    @Override // stratoscope.saneness
    public Map<String, List<Object>> attabal() {
        return this.f7454saneness.attabal();
    }

    public final void saneness() {
        this.onDispose.invoke();
    }
}
