package androidx.compose.ui.focus;

import androidx.compose.ui.node.saran;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\u001a>\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a:\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a:\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a.\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a2\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001d\u001a\u0013\u0010\"\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a\u0013\u0010%\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/saneness;", "direction", "Lsupplicat/taiyuan;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "graveside", "(Landroidx/compose/ui/focus/FocusTargetNode;ILsupplicat/taiyuan;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "apical", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "focusedItem", "formularize", "(Landroidx/compose/ui/focus/FocusTargetNode;Lsupplicat/taiyuan;ILkotlin/jvm/functions/Function1;)Z", "polloi", "Landroidx/compose/ui/node/marial;", "Landroidx/compose/runtime/collection/dern;", "accessibleChildren", "", "taiyuan", "(Landroidx/compose/ui/node/marial;Landroidx/compose/runtime/collection/dern;)V", "focusRect", "cutely", "(Landroidx/compose/runtime/collection/dern;Lsupplicat/taiyuan;I)Landroidx/compose/ui/focus/FocusTargetNode;", "proposedCandidate", "currentCandidate", "focusedRect", "impassible", "(Lsupplicat/taiyuan;Lsupplicat/taiyuan;Lsupplicat/taiyuan;I)Z", "source", "rect1", "rect2", "dern", "molybdenite", "(Lsupplicat/taiyuan;)Lsupplicat/taiyuan;", "impromptu", "saneness", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TwoDimensionalFocusSearchKt {

    /* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f6440attabal;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6440attabal = iArr;
        }
    }

    public static final boolean apical(FocusTargetNode focusTargetNode, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        supplicat.taiyuan taiyuanVarImpromptu;
        androidx.compose.runtime.collection.dern dernVar = new androidx.compose.runtime.collection.dern(new FocusTargetNode[16], 0);
        taiyuan(focusTargetNode, dernVar);
        if (dernVar.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (dernVar.triweekly() ? null : dernVar.apical()[0]);
            if (focusTargetNode2 != null) {
                return function1.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.saneness())) {
            i = companion.competently();
        }
        if (saneness.formularize(i, companion.competently()) ? true : saneness.formularize(i, companion.attabal())) {
            taiyuanVarImpromptu = molybdenite(dovishness.wireman(focusTargetNode));
        } else {
            if (!(saneness.formularize(i, companion.wireman()) ? true : saneness.formularize(i, companion.impromptu()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            taiyuanVarImpromptu = impromptu(dovishness.wireman(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeCutely = cutely(dernVar, taiyuanVarImpromptu, i);
        if (focusTargetNodeCutely != null) {
            return function1.invoke(focusTargetNodeCutely).booleanValue();
        }
        return false;
    }

    public static final float arytenoidectomy(supplicat.taiyuan taiyuanVar, int i, supplicat.taiyuan taiyuanVar2) {
        float f;
        float top;
        float top2;
        float fCutely;
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.wireman()) ? true : saneness.formularize(i, companion.competently())) {
            f = 2;
            top = taiyuanVar2.getTop() + (taiyuanVar2.marial() / f);
            top2 = taiyuanVar.getTop();
            fCutely = taiyuanVar.marial();
        } else {
            if (!(saneness.formularize(i, companion.impromptu()) ? true : saneness.formularize(i, companion.attabal()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = 2;
            top = taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() + (taiyuanVar2.cutely() / f);
            top2 = taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
            fCutely = taiyuanVar.cutely();
        }
        return top - (top2 + (fCutely / f));
    }

    public static final float beachfront(supplicat.taiyuan taiyuanVar, int i, supplicat.taiyuan taiyuanVar2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        saneness.Companion companion = saneness.INSTANCE;
        if (!saneness.formularize(i, companion.wireman())) {
            if (saneness.formularize(i, companion.competently())) {
                top = taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
                bottom = taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String();
            } else if (saneness.formularize(i, companion.impromptu())) {
                top2 = taiyuanVar2.getTop();
                bottom2 = taiyuanVar.getBottom();
            } else {
                if (!saneness.formularize(i, companion.attabal())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = taiyuanVar.getTop();
                bottom = taiyuanVar2.getBottom();
            }
            f = top - bottom;
            return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        }
        top2 = taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
        bottom2 = taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String();
        f = top2 - bottom2;
        return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
    }

    public static final float competently(supplicat.taiyuan taiyuanVar, int i, supplicat.taiyuan taiyuanVar2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f;
        saneness.Companion companion = saneness.INSTANCE;
        if (!saneness.formularize(i, companion.wireman())) {
            if (saneness.formularize(i, companion.competently())) {
                bottom = taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String();
                bottom2 = taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String();
            } else if (saneness.formularize(i, companion.impromptu())) {
                top = taiyuanVar2.getTop();
                top2 = taiyuanVar.getTop();
            } else {
                if (!saneness.formularize(i, companion.attabal())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                bottom = taiyuanVar.getBottom();
                bottom2 = taiyuanVar2.getBottom();
            }
            f = bottom - bottom2;
            return Math.max(1.0f, f);
        }
        top = taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
        top2 = taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
        f = top - top2;
        return Math.max(1.0f, f);
    }

    public static final FocusTargetNode cutely(androidx.compose.runtime.collection.dern<FocusTargetNode> dernVar, supplicat.taiyuan taiyuanVar, int i) {
        supplicat.taiyuan taiyuanVarImpassible;
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.wireman())) {
            taiyuanVarImpassible = taiyuanVar.impassible(taiyuanVar.cutely() + 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (saneness.formularize(i, companion.competently())) {
            taiyuanVarImpassible = taiyuanVar.impassible(-(taiyuanVar.cutely() + 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (saneness.formularize(i, companion.impromptu())) {
            taiyuanVarImpassible = taiyuanVar.impassible(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, taiyuanVar.marial() + 1);
        } else {
            if (!saneness.formularize(i, companion.attabal())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            taiyuanVarImpassible = taiyuanVar.impassible(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -(taiyuanVar.marial() + 1));
        }
        int size = dernVar.getSize();
        FocusTargetNode focusTargetNode = null;
        if (size > 0) {
            FocusTargetNode[] focusTargetNodeArrApical = dernVar.apical();
            int i2 = 0;
            do {
                FocusTargetNode focusTargetNode2 = focusTargetNodeArrApical[i2];
                if (dovishness.competently(focusTargetNode2)) {
                    supplicat.taiyuan taiyuanVarWireman = dovishness.wireman(focusTargetNode2);
                    if (impassible(taiyuanVarWireman, taiyuanVarImpassible, taiyuanVar, i)) {
                        focusTargetNode = focusTargetNode2;
                        taiyuanVarImpassible = taiyuanVarWireman;
                    }
                }
                i2++;
            } while (i2 < size);
        }
        return focusTargetNode;
    }

    public static final boolean dern(supplicat.taiyuan taiyuanVar, supplicat.taiyuan taiyuanVar2, supplicat.taiyuan taiyuanVar3, int i) {
        if (wireman(taiyuanVar3, i, taiyuanVar) || !wireman(taiyuanVar2, i, taiyuanVar)) {
            return false;
        }
        if (!marial(taiyuanVar3, i, taiyuanVar)) {
            return true;
        }
        saneness.Companion companion = saneness.INSTANCE;
        return saneness.formularize(i, companion.wireman()) || saneness.formularize(i, companion.competently()) || beachfront(taiyuanVar2, i, taiyuanVar) < competently(taiyuanVar3, i, taiyuanVar);
    }

    public static final boolean formularize(final FocusTargetNode focusTargetNode, final supplicat.taiyuan taiyuanVar, final int i, final Function1<? super FocusTargetNode, Boolean> function1) {
        if (polloi(focusTargetNode, taiyuanVar, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) androidx.compose.ui.focus.attabal.attabal(focusTargetNode, i, new Function1<androidx.compose.ui.layout.wireman.attabal, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(androidx.compose.ui.layout.wireman.attabal attabalVar) {
                boolean zPolloi = TwoDimensionalFocusSearchKt.polloi(focusTargetNode, taiyuanVar, i, function1);
                Boolean boolValueOf = Boolean.valueOf(zPolloi);
                if (zPolloi || !attabalVar.attabal()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final Boolean graveside(FocusTargetNode focusTargetNode, int i, supplicat.taiyuan taiyuanVar, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusStateImpl focusStateImplLightstruck = focusTargetNode.lightstruck();
        int[] iArr = attabal.f6440attabal;
        int i2 = iArr[focusStateImplLightstruck.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                return Boolean.valueOf(apical(focusTargetNode, i, function1));
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (focusTargetNode.picketboat().getCanFocus()) {
                return function1.invoke(focusTargetNode);
            }
            return taiyuanVar == null ? Boolean.valueOf(apical(focusTargetNode, i, function1)) : Boolean.valueOf(polloi(focusTargetNode, taiyuanVar, i, function1));
        }
        FocusTargetNode focusTargetNodeBeachfront = dovishness.beachfront(focusTargetNode);
        if (focusTargetNodeBeachfront == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        int i3 = iArr[focusTargetNodeBeachfront.lightstruck().ordinal()];
        if (i3 == 1) {
            Boolean boolGraveside = graveside(focusTargetNodeBeachfront, i, taiyuanVar, function1);
            if (!Intrinsics.wireman(boolGraveside, Boolean.FALSE)) {
                return boolGraveside;
            }
            if (taiyuanVar == null) {
                taiyuanVar = dovishness.wireman(saneness(focusTargetNodeBeachfront));
            }
            return Boolean.valueOf(formularize(focusTargetNode, taiyuanVar, i, function1));
        }
        if (i3 == 2 || i3 == 3) {
            if (taiyuanVar == null) {
                taiyuanVar = dovishness.wireman(focusTargetNodeBeachfront);
            }
            return Boolean.valueOf(formularize(focusTargetNode, taiyuanVar, i, function1));
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    public static final boolean impassible(supplicat.taiyuan taiyuanVar, supplicat.taiyuan taiyuanVar2, supplicat.taiyuan taiyuanVar3, int i) {
        if (!triweekly(taiyuanVar, i, taiyuanVar3)) {
            return false;
        }
        if (triweekly(taiyuanVar2, i, taiyuanVar3) && !dern(taiyuanVar3, taiyuanVar, taiyuanVar2, i)) {
            return !dern(taiyuanVar3, taiyuanVar2, taiyuanVar, i) && monoploid(i, taiyuanVar3, taiyuanVar) < monoploid(i, taiyuanVar3, taiyuanVar2);
        }
        return true;
    }

    public static final supplicat.taiyuan impromptu(supplicat.taiyuan taiyuanVar) {
        return new supplicat.taiyuan(taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String(), taiyuanVar.getBottom(), taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String(), taiyuanVar.getBottom());
    }

    public static final float kowloon(supplicat.taiyuan taiyuanVar, int i, supplicat.taiyuan taiyuanVar2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f;
        saneness.Companion companion = saneness.INSTANCE;
        if (!saneness.formularize(i, companion.wireman())) {
            if (saneness.formularize(i, companion.competently())) {
                top = taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
                bottom = taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String();
            } else if (saneness.formularize(i, companion.impromptu())) {
                top2 = taiyuanVar2.getTop();
                bottom2 = taiyuanVar.getBottom();
            } else {
                if (!saneness.formularize(i, companion.attabal())) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                top = taiyuanVar.getTop();
                bottom = taiyuanVar2.getBottom();
            }
            f = top - bottom;
            return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        }
        top2 = taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
        bottom2 = taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String();
        f = top2 - bottom2;
        return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
    }

    public static final boolean marial(supplicat.taiyuan taiyuanVar, int i, supplicat.taiyuan taiyuanVar2) {
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.wireman())) {
            return taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() >= taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String();
        }
        if (saneness.formularize(i, companion.competently())) {
            return taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() <= taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
        }
        if (saneness.formularize(i, companion.impromptu())) {
            return taiyuanVar2.getTop() >= taiyuanVar.getBottom();
        }
        if (saneness.formularize(i, companion.attabal())) {
            return taiyuanVar2.getBottom() <= taiyuanVar.getTop();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final supplicat.taiyuan molybdenite(supplicat.taiyuan taiyuanVar) {
        return new supplicat.taiyuan(taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), taiyuanVar.getTop(), taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), taiyuanVar.getTop());
    }

    public static final long monoploid(int i, supplicat.taiyuan taiyuanVar, supplicat.taiyuan taiyuanVar2) {
        long jAbs = (long) Math.abs(kowloon(taiyuanVar2, i, taiyuanVar));
        long jAbs2 = (long) Math.abs(arytenoidectomy(taiyuanVar2, i, taiyuanVar));
        return (((long) 13) * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    public static final boolean polloi(FocusTargetNode focusTargetNode, supplicat.taiyuan taiyuanVar, int i, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusTargetNode focusTargetNodeCutely;
        androidx.compose.runtime.collection.dern dernVar = new androidx.compose.runtime.collection.dern(new FocusTargetNode[16], 0);
        int iAttabal = saran.attabal(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.dern dernVar2 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
        androidx.compose.ui.attabal.dern child = focusTargetNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.beachfront.dern(dernVar2, focusTargetNode.getNode());
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dernVarBeachfront;
                                if (focusTargetNode2.getIsAttached()) {
                                    dernVar.saneness(focusTargetNode2);
                                }
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
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
        while (dernVar.kowloon() && (focusTargetNodeCutely = cutely(dernVar, taiyuanVar, i)) != null) {
            if (focusTargetNodeCutely.picketboat().getCanFocus()) {
                return function1.invoke(focusTargetNodeCutely).booleanValue();
            }
            if (formularize(focusTargetNodeCutely, taiyuanVar, i, function1)) {
                return true;
            }
            dernVar.monoploid(focusTargetNodeCutely);
        }
        return false;
    }

    public static final FocusTargetNode saneness(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.lightstruck() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeSaneness = dovishness.saneness(focusTargetNode);
        if (focusTargetNodeSaneness != null) {
            return focusTargetNodeSaneness;
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild");
    }

    public static final void taiyuan(androidx.compose.ui.node.marial marialVar, androidx.compose.runtime.collection.dern<FocusTargetNode> dernVar) {
        int iAttabal = saran.attabal(1024);
        if (!marialVar.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.dern dernVar2 = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
        androidx.compose.ui.attabal.dern child = marialVar.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.beachfront.dern(dernVar2, marialVar.getNode());
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
                                if (focusTargetNode.getIsAttached() && !androidx.compose.ui.node.beachfront.impromptu(focusTargetNode).getIsDeactivated()) {
                                    if (focusTargetNode.picketboat().getCanFocus()) {
                                        dernVar.saneness(focusTargetNode);
                                    } else {
                                        taiyuan(focusTargetNode, dernVar);
                                    }
                                }
                            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof androidx.compose.ui.node.competently)) {
                                int i = 0;
                                for (androidx.compose.ui.attabal.dern dernVarUnderbelly = ((androidx.compose.ui.node.competently) dernVarBeachfront).getDelegate(); dernVarUnderbelly != null; dernVarUnderbelly = dernVarUnderbelly.getChild()) {
                                    if ((dernVarUnderbelly.getKindSet() & iAttabal) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
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
    }

    public static final boolean triweekly(supplicat.taiyuan taiyuanVar, int i, supplicat.taiyuan taiyuanVar2) {
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.wireman())) {
            return (taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() > taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() || taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() >= taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String()) && taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() > taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
        }
        if (saneness.formularize(i, companion.competently())) {
            return (taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() < taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() || taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() <= taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String()) && taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() < taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String();
        }
        if (saneness.formularize(i, companion.impromptu())) {
            return (taiyuanVar2.getBottom() > taiyuanVar.getBottom() || taiyuanVar2.getTop() >= taiyuanVar.getBottom()) && taiyuanVar2.getTop() > taiyuanVar.getTop();
        }
        if (saneness.formularize(i, companion.attabal())) {
            return (taiyuanVar2.getTop() < taiyuanVar.getTop() || taiyuanVar2.getBottom() <= taiyuanVar.getTop()) && taiyuanVar2.getBottom() < taiyuanVar.getBottom();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final boolean wireman(supplicat.taiyuan taiyuanVar, int i, supplicat.taiyuan taiyuanVar2) {
        saneness.Companion companion = saneness.INSTANCE;
        if (saneness.formularize(i, companion.wireman()) ? true : saneness.formularize(i, companion.competently())) {
            return taiyuanVar.getBottom() > taiyuanVar2.getTop() && taiyuanVar.getTop() < taiyuanVar2.getBottom();
        }
        if (saneness.formularize(i, companion.impromptu()) ? true : saneness.formularize(i, companion.attabal())) {
            return taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() > taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() && taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() < taiyuanVar2.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }
}
