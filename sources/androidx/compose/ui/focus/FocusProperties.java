package androidx.compose.ui.focus;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rRB\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)RB\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "", "", "impassible", "()Z", "apical", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/FocusRequester;", "<anonymous parameter 0>", "marial", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "next", "triweekly", "setPrevious", "previous", "competently", "setUp", "up", "cutely", "setDown", "down", "dern", "setLeft", TtmlNode.LEFT, "beachfront", "setRight", TtmlNode.RIGHT, "wireman", "setStart", "start", "taiyuan", "setEnd", TtmlNode.END, "Lkotlin/Function1;", "Landroidx/compose/ui/focus/saneness;", "formularize", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "getEnter$annotations", "()V", "enter", "impromptu", "setExit", "getExit$annotations", "exit", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FocusProperties {
    void apical(boolean z);

    default FocusRequester beachfront() {
        return FocusRequester.INSTANCE.saneness();
    }

    default FocusRequester competently() {
        return FocusRequester.INSTANCE.saneness();
    }

    default FocusRequester cutely() {
        return FocusRequester.INSTANCE.saneness();
    }

    default FocusRequester dern() {
        return FocusRequester.INSTANCE.saneness();
    }

    default Function1<saneness, FocusRequester> formularize() {
        return new Function1<saneness, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ FocusRequester invoke(saneness sanenessVar) {
                return m1invoke3ESFkO8(sanenessVar.getValue());
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m1invoke3ESFkO8(int i) {
                return FocusRequester.INSTANCE.saneness();
            }
        };
    }

    boolean impassible();

    default Function1<saneness, FocusRequester> impromptu() {
        return new Function1<saneness, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ FocusRequester invoke(saneness sanenessVar) {
                return m2invoke3ESFkO8(sanenessVar.getValue());
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m2invoke3ESFkO8(int i) {
                return FocusRequester.INSTANCE.saneness();
            }
        };
    }

    default FocusRequester marial() {
        return FocusRequester.INSTANCE.saneness();
    }

    default FocusRequester taiyuan() {
        return FocusRequester.INSTANCE.saneness();
    }

    default FocusRequester triweekly() {
        return FocusRequester.INSTANCE.saneness();
    }

    default FocusRequester wireman() {
        return FocusRequester.INSTANCE.saneness();
    }
}
