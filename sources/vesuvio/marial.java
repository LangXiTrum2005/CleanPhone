package vesuvio;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.premeiotic;
import technofreak.cutely;

/* JADX INFO: compiled from: InputConnectionCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: compiled from: InputConnectionCompat.java */
    public class attabal extends InputConnectionWrapper {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ dern f39339attabal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(InputConnection inputConnection, boolean z, dern dernVar) {
            super(inputConnection, z);
            this.f39339attabal = dernVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f39339attabal.attabal(beachfront.beachfront(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* JADX INFO: compiled from: InputConnectionCompat.java */
    public interface dern {
        boolean attabal(beachfront beachfrontVar, int i, Bundle bundle);
    }

    /* JADX INFO: compiled from: InputConnectionCompat.java */
    public class saneness extends InputConnectionWrapper {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ dern f39340attabal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(InputConnection inputConnection, boolean z, dern dernVar) {
            super(inputConnection, z);
            this.f39340attabal = dernVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (marial.marial(str, bundle, this.f39340attabal)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public static /* synthetic */ boolean attabal(View view, beachfront beachfrontVar, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                beachfrontVar.wireman();
                Parcelable parcelable = (Parcelable) beachfrontVar.marial();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        return premeiotic.cultivated(view, new androidx.core.view.wireman.attabal(new ClipData(beachfrontVar.saneness(), new ClipData.Item(beachfrontVar.attabal())), 2).wireman(beachfrontVar.dern()).saneness(bundle).attabal()) == null;
    }

    public static InputConnection dern(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return wireman(inputConnection, editorInfo, saneness(view));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static boolean marial(String str, Bundle bundle, dern dernVar) throws Throwable {
        boolean z;
        ResultReceiver resultReceiver;
        boolean zAttabal;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z = true;
        }
        try {
            ResultReceiver resultReceiver2 = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    zAttabal = dernVar.attabal(new beachfront(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver2 != 0) {
                    r0 = zAttabal;
                    resultReceiver2.send(r0, null);
                }
                r0 = zAttabal;
                return r0;
            } catch (Throwable th) {
                th = th;
                resultReceiver = resultReceiver2;
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

    public static dern saneness(final View view) {
        cutely.competently(view);
        return new dern() { // from class: vesuvio.wireman
            @Override // vesuvio.marial.dern
            public final boolean attabal(beachfront beachfrontVar, int i, Bundle bundle) {
                return marial.attabal(view, beachfrontVar, i, bundle);
            }
        };
    }

    @Deprecated
    public static InputConnection wireman(InputConnection inputConnection, EditorInfo editorInfo, dern dernVar) {
        technofreak.marial.wireman(inputConnection, "inputConnection must be non-null");
        technofreak.marial.wireman(editorInfo, "editorInfo must be non-null");
        technofreak.marial.wireman(dernVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new attabal(inputConnection, false, dernVar);
        }
        return vesuvio.dern.attabal(editorInfo).length == 0 ? inputConnection : new saneness(inputConnection, false, dernVar);
    }
}
