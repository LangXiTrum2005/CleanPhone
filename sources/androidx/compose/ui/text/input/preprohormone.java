package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: RecordingInputConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\"J\u001f\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\"J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\"J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\u0010J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u00101J\u0019\u00103\u001a\u0004\u0018\u00010\u001a2\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u00107J!\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b>\u00107J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0012H\u0016¢\u0006\u0004\b@\u00107J\u0019\u0010B\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010F\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u0011\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u0012H\u0016¢\u0006\u0004\bL\u00107J\u0017\u0010N\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0006H\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u0012H\u0016¢\u0006\u0004\bQ\u0010RJ#\u0010W\u001a\u00020\u00062\b\u0010T\u001a\u0004\u0018\u00010S2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bW\u0010XJ)\u0010\\\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020Y2\u0006\u0010/\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\b\\\u0010]R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010a\u001a\u0004\bb\u0010\u0010R\u0016\u0010d\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010cR*\u0010k\u001a\u00020\u00022\u0006\u0010e\u001a\u00020\u00028\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010cR\u0016\u0010o\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010aR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\n0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010a¨\u0006v"}, d2 = {"Landroidx/compose/ui/text/input/preprohormone;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "initState", "Landroidx/compose/ui/text/input/monoploid;", "eventCallback", "", "autoCorrect", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/monoploid;Z)V", "Landroidx/compose/ui/text/input/impassible;", "editCommand", "", "attabal", "(Landroidx/compose/ui/text/input/impassible;)V", "saneness", "()Z", "dern", "", "code", "wireman", "(I)V", "beginBatchEdit", "endBatchEdit", "closeConnection", "()V", "", "text", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", TtmlNode.END, "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", AdActivity.REQUEST_KEY_EXTRA, "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "Landroidx/compose/ui/text/input/monoploid;", "getEventCallback", "()Landroidx/compose/ui/text/input/monoploid;", "Z", "getAutoCorrect", "I", "batchDepth", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMTextFieldValue$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setMTextFieldValue$ui_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "mTextFieldValue", "marial", "currentExtractedTextRequestToken", "beachfront", "extractedTextMonitorMode", "", "competently", "Ljava/util/List;", "editCommands", "impromptu", "isActive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@patroclinal.wireman
public final class preprohormone implements InputConnection {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final monoploid eventCallback;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public boolean extractedTextMonitorMode;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public int batchDepth;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int currentExtractedTextRequestToken;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final boolean autoCorrect;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public TextFieldValue mTextFieldValue;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final List<impassible> editCommands = new ArrayList();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean isActive = true;

    public preprohormone(TextFieldValue textFieldValue, monoploid monoploidVar, boolean z) {
        this.eventCallback = monoploidVar;
        this.autoCorrect = z;
        this.mTextFieldValue = textFieldValue;
    }

    public final void attabal(impassible editCommand) {
        saneness();
        try {
            this.editCommands.add(editCommand);
        } finally {
            dern();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.isActive;
        return z ? saneness() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.saneness(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo text) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.isActive;
        return z ? this.autoCorrect : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence text, int newCursorPosition) {
        boolean z = this.isActive;
        if (z) {
            attabal(new CommitTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        attabal(new DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        attabal(new DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    }

    public final boolean dern() {
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.marial(CollectionsKt.basify(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return dern();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        attabal(new triweekly());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.mTextFieldValue.wireman(), androidx.compose.ui.text.competently.taiyuan(this.mTextFieldValue.getSelection()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        boolean z = (flags & 1) != 0;
        this.extractedTextMonitorMode = z;
        if (z) {
            this.currentExtractedTextRequestToken = request != null ? request.token : 0;
        }
        return molybdenite.attabal(this.mTextFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int flags) {
        if (androidx.compose.ui.text.competently.beachfront(this.mTextFieldValue.getSelection())) {
            return null;
        }
        return trm.attabal(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return trm.saneness(this.mTextFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return trm.dern(this.mTextFieldValue, maxChars).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id) {
        boolean z = this.isActive;
        if (z) {
            z = false;
            switch (id) {
                case R.id.selectAll:
                    attabal(new SetSelectionCommand(0, this.mTextFieldValue.wireman().length()));
                    break;
                case R.id.cut:
                    wireman(277);
                    break;
                case R.id.copy:
                    wireman(278);
                    break;
                case R.id.paste:
                    wireman(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int iAttabal;
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                    iAttabal = kowloon.INSTANCE.dern();
                    break;
                case 3:
                    iAttabal = kowloon.INSTANCE.competently();
                    break;
                case 4:
                    iAttabal = kowloon.INSTANCE.impromptu();
                    break;
                case 5:
                    iAttabal = kowloon.INSTANCE.wireman();
                    break;
                case 6:
                    iAttabal = kowloon.INSTANCE.saneness();
                    break;
                case 7:
                    iAttabal = kowloon.INSTANCE.beachfront();
                    break;
                default:
                    iAttabal = kowloon.INSTANCE.attabal();
                    break;
            }
        } else {
            iAttabal = kowloon.INSTANCE.attabal();
        }
        this.eventCallback.wireman(iAttabal);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String action, Bundle data) {
        boolean z = this.isActive;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.isActive;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (cursorUpdateMode & 1) != 0;
        boolean z8 = (cursorUpdateMode & 2) != 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            boolean z9 = (cursorUpdateMode & 16) != 0;
            boolean z10 = (cursorUpdateMode & 8) != 0;
            boolean z11 = (cursorUpdateMode & 4) != 0;
            if (i >= 34 && (cursorUpdateMode & 32) != 0) {
                z6 = true;
            }
            if (z9 || z10 || z11 || z6) {
                z2 = z6;
                z = z11;
                z4 = z10;
                z3 = z9;
            } else if (i >= 34) {
                z3 = true;
                z4 = true;
                z = true;
                z2 = true;
            } else {
                z2 = z6;
                z3 = true;
                z4 = true;
                z = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        this.eventCallback.dern(z7, z8, z3, z4, z, z2);
        return true;
    }

    public final boolean saneness() {
        this.batchDepth++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        this.eventCallback.attabal(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        boolean z = this.isActive;
        if (z) {
            attabal(new SetComposingRegionCommand(start, end));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        boolean z = this.isActive;
        if (z) {
            attabal(new SetComposingTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        attabal(new SetSelectionCommand(start, end));
        return true;
    }

    public final void wireman(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }
}
