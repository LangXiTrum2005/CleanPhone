package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: RootMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$wireman;", "<init>", "()V", "Landroidx/compose/ui/layout/monoploid;", "", "Landroidx/compose/ui/layout/triweekly;", "measurables", "Lmilliradian/saneness;", "constraints", "Landroidx/compose/ui/layout/arytenoidectomy;", "attabal", "(Landroidx/compose/ui/layout/monoploid;Ljava/util/List;J)Landroidx/compose/ui/layout/arytenoidectomy;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RootMeasurePolicy extends LayoutNode.wireman {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final RootMeasurePolicy f6733saneness = new RootMeasurePolicy();

    public RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.kowloon
    public arytenoidectomy attabal(monoploid monoploidVar, List<? extends triweekly> list, long j) {
        if (list.isEmpty()) {
            return monoploid.polloi(monoploidVar, milliradian.saneness.cutely(j), milliradian.saneness.taiyuan(j), null, new Function1<gintrap.attabal, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(gintrap.attabal attabalVar) {
                }

                @Override // p002kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(gintrap.attabal attabalVar) {
                    invoke2(attabalVar);
                    return Unit.f29295attabal;
                }
            }, 4, null);
        }
        if (list.size() == 1) {
            final gintrap gintrapVarSealless = list.get(0).sealless(j);
            return monoploid.polloi(monoploidVar, milliradian.dern.marial(j, gintrapVarSealless.getWidth()), milliradian.dern.wireman(j, gintrapVarSealless.getHeight()), null, new Function1<gintrap.attabal, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(gintrap.attabal attabalVar) {
                    invoke2(attabalVar);
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(gintrap.attabal attabalVar) {
                    gintrap.attabal.triweekly(attabalVar, gintrapVarSealless, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 12, null);
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).sealless(j));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            gintrap gintrapVar = (gintrap) arrayList.get(i2);
            iMax = Math.max(gintrapVar.getWidth(), iMax);
            iMax2 = Math.max(gintrapVar.getHeight(), iMax2);
        }
        return monoploid.polloi(monoploidVar, milliradian.dern.marial(j, iMax), milliradian.dern.wireman(j, iMax2), null, new Function1<gintrap.attabal, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(gintrap.attabal attabalVar) {
                invoke2(attabalVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(gintrap.attabal attabalVar) {
                List<gintrap> list2 = arrayList;
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    gintrap.attabal.triweekly(attabalVar, list2.get(i3), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 12, null);
                }
            }
        }, 4, null);
    }
}
