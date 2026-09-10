package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001GB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0004\u0012\u00020$0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020$0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R$\u00100\u001a\u00020*2\u0006\u0010+\u001a\u00020*8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00102R\"\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020605048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b,\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006H"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/rotuma;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lstarveling/yemenite;", "rootPositionCalculator", "Landroidx/compose/ui/text/input/polloi;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Lstarveling/yemenite;Landroidx/compose/ui/text/input/polloi;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;Lstarveling/yemenite;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "beachfront", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "", "taiyuan", "()Z", "attabal", "Landroid/view/View;", "impromptu", "()Landroid/view/View;", "saneness", "Landroidx/compose/ui/text/input/polloi;", "dern", "Ljava/util/concurrent/Executor;", "wireman", "Z", "editorHasFocus", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/impassible;", "", "marial", "Lkotlin/jvm/functions/Function1;", "onEditCommand", "Landroidx/compose/ui/text/input/kowloon;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/TextFieldValue;", "<set-?>", "competently", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "state", "Landroidx/compose/ui/text/input/arytenoidectomy;", "Landroidx/compose/ui/text/input/arytenoidectomy;", "imeOptions", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/preprohormone;", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "cutely", "Lpatroclinal/taiyuan;", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "apical", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "cursorAnchorInfoController", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "formularize", "Landroidx/compose/runtime/collection/dern;", "textInputCommandQueue", "TextInputCommand", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@patroclinal.wireman
public final class TextInputServiceAndroid implements rotuma {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final CursorAnchorInfoController cursorAnchorInfoController;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final View view;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public Function1<? super kowloon, Unit> onImeActionPerformed;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public TextFieldValue state;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final patroclinal.taiyuan baseInputConnection;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Executor inputCommandProcessorExecutor;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<TextInputCommand> textInputCommandQueue;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public ImeOptions imeOptions;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public Function1<? super List<? extends impassible>, Unit> onEditCommand;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final polloi inputMethodManager;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public List<WeakReference<preprohormone>> ics;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public boolean editorHasFocus;

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"androidx/compose/ui/text/input/TextInputServiceAndroid$attabal", "Landroidx/compose/ui/text/input/monoploid;", "", "Landroidx/compose/ui/text/input/impassible;", "editCommands", "", "marial", "(Ljava/util/List;)V", "Landroidx/compose/ui/text/input/kowloon;", "imeAction", "wireman", "(I)V", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "attabal", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "dern", "(ZZZZZZ)V", "Landroidx/compose/ui/text/input/preprohormone;", "inputConnection", "saneness", "(Landroidx/compose/ui/text/input/preprohormone;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements monoploid {
        public attabal() {
        }

        @Override // androidx.compose.ui.text.input.monoploid
        public void attabal(KeyEvent event) {
            TextInputServiceAndroid.this.competently().sendKeyEvent(event);
        }

        @Override // androidx.compose.ui.text.input.monoploid
        public void dern(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
            TextInputServiceAndroid.this.cursorAnchorInfoController.attabal(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
        }

        @Override // androidx.compose.ui.text.input.monoploid
        public void marial(List<? extends impassible> editCommands) {
            TextInputServiceAndroid.this.onEditCommand.invoke(editCommands);
        }

        @Override // androidx.compose.ui.text.input.monoploid
        public void saneness(preprohormone inputConnection) {
            int size = TextInputServiceAndroid.this.ics.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.wireman(((WeakReference) TextInputServiceAndroid.this.ics.get(i)).get(), inputConnection)) {
                    TextInputServiceAndroid.this.ics.remove(i);
                    return;
                }
            }
        }

        @Override // androidx.compose.ui.text.input.monoploid
        public void wireman(int imeAction) {
            TextInputServiceAndroid.this.onImeActionPerformed.invoke(kowloon.taiyuan(imeAction));
        }
    }

    public TextInputServiceAndroid(View view, starveling.yemenite yemeniteVar, polloi polloiVar, Executor executor) {
        this.view = view;
        this.inputMethodManager = polloiVar;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = new Function1<List<? extends impassible>, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends impassible> list) {
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends impassible> list) {
                invoke2(list);
                return Unit.f29295attabal;
            }
        };
        this.onImeActionPerformed = new Function1<kowloon, Unit>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(kowloon kowloonVar) {
                m23invokeKlQnJC8(kowloonVar.getValue());
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m23invokeKlQnJC8(int i) {
            }
        };
        this.state = new TextFieldValue("", androidx.compose.ui.text.competently.INSTANCE.attabal(), (androidx.compose.ui.text.competently) null, 4, (DefaultConstructorMarker) null);
        this.imeOptions = ImeOptions.INSTANCE.attabal();
        this.ics = new ArrayList();
        this.baseInputConnection = p002kotlin.saneness.attabal(LazyThreadSafetyMode.NONE, new Function0<BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.getView(), false);
            }
        });
        this.cursorAnchorInfoController = new CursorAnchorInfoController(yemeniteVar, polloiVar);
        this.textInputCommandQueue = new androidx.compose.runtime.collection.dern<>(new TextInputCommand[16], 0);
    }

    public final InputConnection beachfront(EditorInfo outAttrs) {
        if (!this.editorHasFocus) {
            return null;
        }
        kattegat.impromptu(outAttrs, this.imeOptions, this.state);
        kattegat.taiyuan(outAttrs);
        preprohormone preprohormoneVar = new preprohormone(this.state, new attabal(), this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(preprohormoneVar));
        return preprohormoneVar;
    }

    public final BaseInputConnection competently() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    public /* synthetic */ TextInputServiceAndroid(View view, starveling.yemenite yemeniteVar, polloi polloiVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, yemeniteVar, polloiVar, (i & 8) != 0 ? kattegat.wireman(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(View view, starveling.yemenite yemeniteVar) {
        this(view, yemeniteVar, new InputMethodManagerImpl(view), null, 8, null);
    }
}
