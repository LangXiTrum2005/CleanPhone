package androidx.compose.ui.focus;

import androidx.compose.ui.node.saran;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FocusRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "<init>", "()V", "", "wireman", "()Z", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "dern", "(Lkotlin/jvm/functions/Function1;)Z", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/ui/focus/polloi;", "attabal", "Landroidx/compose/runtime/collection/dern;", "marial", "()Landroidx/compose/runtime/collection/dern;", "focusRequesterNodes", "saneness", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusRequester {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<polloi> focusRequesterNodes = new androidx.compose.runtime.collection.dern<>(new polloi[16], 0);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final FocusRequester f6426dern = new FocusRequester();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final FocusRequester f6428wireman = new FocusRequester();

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusRequester$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FocusRequester.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/focus/FocusRequester;", "Default", "Landroidx/compose/ui/focus/FocusRequester;", "saneness", "()Landroidx/compose/ui/focus/FocusRequester;", "Cancel", "attabal", "getCancel$annotations", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FocusRequester attabal() {
            return FocusRequester.f6428wireman;
        }

        public final FocusRequester saneness() {
            return FocusRequester.f6426dern;
        }

        public Companion() {
        }
    }

    public final boolean dern(Function1<? super FocusTargetNode, Boolean> onFound) {
        Companion companion = INSTANCE;
        if (this == companion.saneness()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == companion.attabal()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (!this.focusRequesterNodes.kowloon()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        androidx.compose.runtime.collection.dern<polloi> dernVar = this.focusRequesterNodes;
        int iFormularize = dernVar.getSize();
        if (iFormularize <= 0) {
            return false;
        }
        polloi[] polloiVarArrApical = dernVar.apical();
        int i = 0;
        boolean z = false;
        do {
            polloi polloiVar = polloiVarArrApical[i];
            int iAttabal = saran.attabal(1024);
            if (!polloiVar.getNode().getIsAttached()) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            androidx.compose.runtime.collection.dern dernVar2 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
            androidx.compose.ui.attabal.dern child = polloiVar.getNode().getChild();
            if (child == null) {
                androidx.compose.ui.node.beachfront.dern(dernVar2, polloiVar.getNode());
            } else {
                dernVar2.saneness(child);
            }
            while (dernVar2.kowloon()) {
                androidx.compose.ui.attabal.dern dernVarBeachfront = (androidx.compose.ui.attabal.dern) dernVar2.molybdenite(dernVar2.getSize() - 1);
                if ((dernVarBeachfront.getAggregateChildKindSet() & iAttabal) == 0) {
                    androidx.compose.ui.node.beachfront.dern(dernVar2, dernVarBeachfront);
                } else {
                    while (dernVarBeachfront != null) {
                        if ((dernVarBeachfront.getKindSet() & iAttabal) != 0) {
                            androidx.compose.runtime.collection.dern dernVar3 = null;
                            while (dernVarBeachfront != null) {
                                if (dernVarBeachfront instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) dernVarBeachfront;
                                    if (focusTargetNode.picketboat().impassible() ? onFound.invoke(focusTargetNode).booleanValue() : TwoDimensionalFocusSearchKt.apical(focusTargetNode, saneness.INSTANCE.saneness(), onFound)) {
                                        z = true;
                                        break;
                                    }
                                } else if (((dernVarBeachfront.getKindSet() & iAttabal) != 0) && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.attabal.dern dernVarUnderbelly = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); dernVarUnderbelly != null; dernVarUnderbelly = dernVarUnderbelly.getChild()) {
                                        if ((dernVarUnderbelly.getKindSet() & iAttabal) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                dernVarBeachfront = dernVarUnderbelly;
                                            } else {
                                                if (dernVar3 == null) {
                                                    dernVar3 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                                }
                                                if (dernVarBeachfront != null) {
                                                    dernVar3.saneness(dernVarBeachfront);
                                                    dernVarBeachfront = null;
                                                }
                                                dernVar3.saneness(dernVarUnderbelly);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                dernVarBeachfront = androidx.compose.ui.node.beachfront.beachfront(dernVar3);
                            }
                            break;
                        }
                        dernVarBeachfront = dernVarBeachfront.getChild();
                    }
                }
            }
            i++;
        } while (i < iFormularize);
        return z;
    }

    public final androidx.compose.runtime.collection.dern<polloi> marial() {
        return this.focusRequesterNodes;
    }

    public final boolean wireman() {
        return dern(new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusRequester$focus$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(FocusTransactionsKt.cutely(focusTargetNode));
            }
        });
    }
}
