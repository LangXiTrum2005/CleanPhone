package androidx.compose.ui.focus;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001e\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\"\u0010!\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b \u0010\u0012R\"\u0010#\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010&\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b%\u0010\u0012R\"\u0010)\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010\u000e\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010\u0012R4\u00102\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\f0*8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010,\u0012\u0004\b1\u0010\u0003\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R4\u00105\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\f0*8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\t\u0010,\u0012\u0004\b4\u0010\u0003\u001a\u0004\b$\u0010.\"\u0004\b3\u00100¨\u00066"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/FocusProperties;", "<init>", "()V", "", "attabal", "Z", "impassible", "()Z", "apical", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/FocusRequester;", "saneness", "Landroidx/compose/ui/focus/FocusRequester;", "marial", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "next", "dern", "triweekly", "setPrevious", "previous", "wireman", "competently", "setUp", "up", "cutely", "setDown", "down", "beachfront", "setLeft", TtmlNode.LEFT, "setRight", TtmlNode.RIGHT, "impromptu", "setStart", "start", "taiyuan", "setEnd", TtmlNode.END, "Lkotlin/Function1;", "Landroidx/compose/ui/focus/saneness;", "Lkotlin/jvm/functions/Function1;", "formularize", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "getEnter$annotations", "enter", "setExit", "getExit$annotations", "exit", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusPropertiesImpl implements FocusProperties {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public Function1<? super saneness, FocusRequester> exit;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public boolean canFocus = true;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public FocusRequester left;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public FocusRequester right;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public Function1<? super saneness, FocusRequester> enter;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public FocusRequester previous;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public FocusRequester start;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public FocusRequester down;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public FocusRequester next;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public FocusRequester end;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public FocusRequester up;

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        this.next = companion.saneness();
        this.previous = companion.saneness();
        this.up = companion.saneness();
        this.down = companion.saneness();
        this.left = companion.saneness();
        this.right = companion.saneness();
        this.start = companion.saneness();
        this.end = companion.saneness();
        this.enter = new Function1<saneness, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$enter$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ FocusRequester invoke(saneness sanenessVar) {
                return m3invoke3ESFkO8(sanenessVar.getValue());
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m3invoke3ESFkO8(int i) {
                return FocusRequester.INSTANCE.saneness();
            }
        };
        this.exit = new Function1<saneness, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$exit$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ FocusRequester invoke(saneness sanenessVar) {
                return m4invoke3ESFkO8(sanenessVar.getValue());
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m4invoke3ESFkO8(int i) {
                return FocusRequester.INSTANCE.saneness();
            }
        };
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void apical(boolean z) {
        this.canFocus = z;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: competently, reason: from getter */
    public FocusRequester getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: cutely, reason: from getter */
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: dern, reason: from getter */
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public Function1<saneness, FocusRequester> formularize() {
        return this.enter;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: impassible, reason: from getter */
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public Function1<saneness, FocusRequester> impromptu() {
        return this.exit;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: marial, reason: from getter */
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public FocusRequester getStart() {
        return this.start;
    }
}
