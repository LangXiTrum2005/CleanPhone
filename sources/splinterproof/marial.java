package splinterproof;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: compiled from: ViewCompatShims.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {

    /* JADX INFO: compiled from: ViewCompatShims.java */
    public static class attabal {
        public static AutofillId attabal(View view) {
            return view.getAutofillId();
        }
    }

    /* JADX INFO: compiled from: ViewCompatShims.java */
    public static class dern {
        public static void attabal(View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }

    /* JADX INFO: compiled from: ViewCompatShims.java */
    public static class saneness {
        public static ContentCaptureSession attabal(View view) {
            return view.getContentCaptureSession();
        }
    }

    public static splinterproof.saneness attabal(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return splinterproof.saneness.saneness(attabal.attabal(view));
        }
        return null;
    }

    public static void dern(View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            dern.attabal(view, i);
        }
    }

    public static wireman saneness(View view) {
        ContentCaptureSession contentCaptureSessionAttabal;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionAttabal = saneness.attabal(view)) == null) {
            return null;
        }
        return wireman.beachfront(contentCaptureSessionAttabal, view);
    }
}
