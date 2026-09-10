package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionCompat {

    public static class Api25Impl {
        public static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i2, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i2, bundle);
        }
    }

    public interface OnCommitContentListener {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b A[PHI: r3
  0x001b: PHI (r3v9 java.lang.String[]) = (r3v4 java.lang.String[]), (r3v10 java.lang.String[]) binds: [B:17:0x0032, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public static InputConnection a(AppCompatEditText appCompatEditText, InputConnection inputConnection, EditorInfo editorInfo) {
        String[] stringArray;
        final b bVar = new b(appCompatEditText);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25) {
            return new InputConnectionWrapper(inputConnection) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.1
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
                    InputContentInfoCompat inputContentInfoCompat = null;
                    if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
                        inputContentInfoCompat = new InputContentInfoCompat(new InputContentInfoCompat.InputContentInfoCompatApi25Impl(inputContentInfo));
                    }
                    if (bVar.a(inputContentInfoCompat, i3, bundle)) {
                        return true;
                    }
                    return super.commitContent(inputContentInfo, i3, bundle);
                }
            };
        }
        String[] strArr = EditorInfoCompat.f4553a;
        if (i2 >= 25) {
            stringArray = editorInfo.contentMimeTypes;
            if (stringArray != null) {
                strArr = stringArray;
            }
        } else {
            Bundle bundle = editorInfo.extras;
            if (bundle != null) {
                stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                if (stringArray == null) {
                    stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                }
                if (stringArray != null) {
                    strArr = stringArray;
                }
            }
        }
        return strArr.length == 0 ? inputConnection : new InputConnectionWrapper(inputConnection) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean performPrivateCommand(String str, Bundle bundle2) throws Throwable {
                byte b2;
                ResultReceiver resultReceiver;
                b bVar2 = bVar;
                boolean zA = false;
                zA = false;
                zA = false;
                zA = false;
                if (bundle2 != null) {
                    if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                        b2 = false;
                    } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                        b2 = true;
                    }
                    try {
                        resultReceiver = (ResultReceiver) bundle2.getParcelable(b2 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                        try {
                            Uri uri = (Uri) bundle2.getParcelable(b2 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                            ClipDescription clipDescription = (ClipDescription) bundle2.getParcelable(b2 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                            Uri uri2 = (Uri) bundle2.getParcelable(b2 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                            int i3 = bundle2.getInt(b2 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                            Bundle bundle3 = (Bundle) bundle2.getParcelable(b2 != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                            if (uri != null && clipDescription != null) {
                                zA = bVar2.a(new InputContentInfoCompat(uri, clipDescription, uri2), i3, bundle3);
                            }
                            if (resultReceiver != null) {
                                resultReceiver.send(zA ? 1 : 0, null);
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (resultReceiver != null) {
                                resultReceiver.send(0, null);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        resultReceiver = null;
                    }
                }
                if (zA) {
                    return true;
                }
                return super.performPrivateCommand(str, bundle2);
            }
        };
    }
}
