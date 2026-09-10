package androidx.compose.runtime;

import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0017\u0010'R6\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b!\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b%\u0010.R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b(\u0010*¨\u0006/"}, d2 = {"Landroidx/compose/runtime/nosophobia;", "", "Landroidx/compose/runtime/itchy;", "content", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "Landroidx/compose/runtime/supplicat;", "composition", "Landroidx/compose/runtime/cosy;", "slotTable", "Landroidx/compose/runtime/saneness;", "anchor", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/technofreak;", "invalidations", "Landroidx/compose/runtime/palmyra;", "locals", "nestedReferences", "<init>", "(Landroidx/compose/runtime/itchy;Ljava/lang/Object;Landroidx/compose/runtime/supplicat;Landroidx/compose/runtime/cosy;Landroidx/compose/runtime/saneness;Ljava/util/List;Landroidx/compose/runtime/palmyra;Ljava/util/List;)V", "", "cutely", "()V", "attabal", "Landroidx/compose/runtime/itchy;", "dern", "()Landroidx/compose/runtime/itchy;", "saneness", "Ljava/lang/Object;", "competently", "()Ljava/lang/Object;", "Landroidx/compose/runtime/supplicat;", "()Landroidx/compose/runtime/supplicat;", "wireman", "Landroidx/compose/runtime/cosy;", "impromptu", "()Landroidx/compose/runtime/cosy;", "marial", "Landroidx/compose/runtime/saneness;", "()Landroidx/compose/runtime/saneness;", "beachfront", "Ljava/util/List;", "()Ljava/util/List;", "taiyuan", "(Ljava/util/List;)V", "Landroidx/compose/runtime/palmyra;", "()Landroidx/compose/runtime/palmyra;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class nosophobia {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final itchy<Object> content;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public List<? extends Pair<technofreak, ? extends Object>> invalidations;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final palmyra locals;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final supplicat composition;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final List<nosophobia> nestedReferences;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final saneness anchor;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Object parameter;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final cosy slotTable;

    public nosophobia(itchy<Object> itchyVar, Object obj, supplicat supplicatVar, cosy cosyVar, saneness sanenessVar, List<? extends Pair<technofreak, ? extends Object>> list, palmyra palmyraVar, List<nosophobia> list2) {
        this.content = itchyVar;
        this.parameter = obj;
        this.composition = supplicatVar;
        this.slotTable = cosyVar;
        this.anchor = sanenessVar;
        this.invalidations = list;
        this.locals = palmyraVar;
        this.nestedReferences = list2;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final saneness getAnchor() {
        return this.anchor;
    }

    public final List<nosophobia> beachfront() {
        return this.nestedReferences;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final Object getParameter() {
        return this.parameter;
    }

    public final void cutely() {
        List<? extends Pair<technofreak, ? extends Object>> list = this.invalidations;
        supplicat supplicatVar = this.composition;
        Intrinsics.competently(supplicatVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        this.invalidations = CollectionsKt.unconsolidated(list, ((gintrap) supplicatVar).kattegat(this.anchor));
    }

    public final itchy<Object> dern() {
        return this.content;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final cosy getSlotTable() {
        return this.slotTable;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final palmyra getLocals() {
        return this.locals;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final supplicat getComposition() {
        return this.composition;
    }

    public final void taiyuan(List<? extends Pair<technofreak, ? extends Object>> list) {
        this.invalidations = list;
    }

    public final List<Pair<technofreak, Object>> wireman() {
        return this.invalidations;
    }
}
