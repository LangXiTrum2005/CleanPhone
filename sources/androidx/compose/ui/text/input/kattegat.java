package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Executor;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "taiyuan", "(Landroid/view/inputmethod/EditorInfo;)V", "Landroidx/compose/ui/text/input/arytenoidectomy;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "impromptu", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/arytenoidectomy;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "wireman", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "competently", "(II)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class kattegat {
    public static final void beachfront(Runnable runnable, long j) {
        runnable.run();
    }

    public static final boolean competently(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void impromptu(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        kowloon.Companion companion = kowloon.INSTANCE;
        int i = 6;
        if (kowloon.formularize(imeAction, companion.attabal())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (kowloon.formularize(imeAction, companion.marial())) {
            i = 1;
        } else if (kowloon.formularize(imeAction, companion.dern())) {
            i = 2;
        } else if (kowloon.formularize(imeAction, companion.wireman())) {
            i = 5;
        } else if (kowloon.formularize(imeAction, companion.beachfront())) {
            i = 7;
        } else if (kowloon.formularize(imeAction, companion.competently())) {
            i = 3;
        } else if (kowloon.formularize(imeAction, companion.impromptu())) {
            i = 4;
        } else if (!kowloon.formularize(imeAction, companion.saneness())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int keyboardType = imeOptions.getKeyboardType();
        adultoid.Companion companion2 = adultoid.INSTANCE;
        if (adultoid.formularize(keyboardType, companion2.impromptu())) {
            editorInfo.inputType = 1;
        } else if (adultoid.formularize(keyboardType, companion2.attabal())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (adultoid.formularize(keyboardType, companion2.wireman())) {
            editorInfo.inputType = 2;
        } else if (adultoid.formularize(keyboardType, companion2.competently())) {
            editorInfo.inputType = 3;
        } else if (adultoid.formularize(keyboardType, companion2.taiyuan())) {
            editorInfo.inputType = 17;
        } else if (adultoid.formularize(keyboardType, companion2.dern())) {
            editorInfo.inputType = 33;
        } else if (adultoid.formularize(keyboardType, companion2.beachfront())) {
            editorInfo.inputType = 129;
        } else if (adultoid.formularize(keyboardType, companion2.marial())) {
            editorInfo.inputType = 18;
        } else {
            if (!adultoid.formularize(keyboardType, companion2.saneness())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && competently(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (kowloon.formularize(imeOptions.getImeAction(), companion.attabal())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (competently(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            graveside.Companion companion3 = graveside.INSTANCE;
            if (graveside.competently(capitalization, companion3.attabal())) {
                editorInfo.inputType |= 4096;
            } else if (graveside.competently(capitalization, companion3.wireman())) {
                editorInfo.inputType |= 8192;
            } else if (graveside.competently(capitalization, companion3.dern())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = androidx.compose.ui.text.competently.cutely(textFieldValue.getSelection());
        editorInfo.initialSelEnd = androidx.compose.ui.text.competently.competently(textFieldValue.getSelection());
        vesuvio.dern.beachfront(editorInfo, textFieldValue.wireman());
        editorInfo.imeOptions |= 33554432;
    }

    public static final void marial(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.sealless
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                kattegat.beachfront(runnable, j);
            }
        });
    }

    public static final void taiyuan(EditorInfo editorInfo) {
        if (androidx.emoji2.text.dern.taiyuan()) {
            androidx.emoji2.text.dern.dern().dovishness(editorInfo);
        }
    }

    public static final Executor wireman(final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.yemenite
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                kattegat.marial(choreographer, runnable);
            }
        };
    }
}
