package splinterproof;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: ContentCaptureSessionCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f38054attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final View f38055saneness;

    /* JADX INFO: compiled from: ContentCaptureSessionCompat.java */
    public static class attabal {
        public static Bundle attabal(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* JADX INFO: compiled from: ContentCaptureSessionCompat.java */
    public static class dern {
        public static void attabal(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    /* JADX INFO: compiled from: ContentCaptureSessionCompat.java */
    public static class saneness {
        public static AutofillId attabal(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static void beachfront(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        public static ViewStructure dern(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        public static void marial(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        public static ViewStructure saneness(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        public static void wireman(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }
    }

    public wireman(ContentCaptureSession contentCaptureSession, View view) {
        this.f38054attabal = contentCaptureSession;
        this.f38055saneness = view;
    }

    public static wireman beachfront(ContentCaptureSession contentCaptureSession, View view) {
        return new wireman(contentCaptureSession, view);
    }

    public AutofillId attabal(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionAttabal = splinterproof.dern.attabal(this.f38054attabal);
        splinterproof.saneness sanenessVarAttabal = marial.attabal(this.f38055saneness);
        Objects.requireNonNull(sanenessVarAttabal);
        return saneness.attabal(contentCaptureSessionAttabal, sanenessVarAttabal.attabal(), j);
    }

    public void dern(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            saneness.marial(splinterproof.dern.attabal(this.f38054attabal), autofillId, charSequence);
        }
    }

    public void marial(long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ContentCaptureSession contentCaptureSessionAttabal = splinterproof.dern.attabal(this.f38054attabal);
            splinterproof.saneness sanenessVarAttabal = marial.attabal(this.f38055saneness);
            Objects.requireNonNull(sanenessVarAttabal);
            saneness.beachfront(contentCaptureSessionAttabal, sanenessVarAttabal.attabal(), jArr);
            return;
        }
        if (i >= 29) {
            ViewStructure viewStructureSaneness = saneness.saneness(splinterproof.dern.attabal(this.f38054attabal), this.f38055saneness);
            attabal.attabal(viewStructureSaneness).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            saneness.wireman(splinterproof.dern.attabal(this.f38054attabal), viewStructureSaneness);
            ContentCaptureSession contentCaptureSessionAttabal2 = splinterproof.dern.attabal(this.f38054attabal);
            splinterproof.saneness sanenessVarAttabal2 = marial.attabal(this.f38055saneness);
            Objects.requireNonNull(sanenessVarAttabal2);
            saneness.beachfront(contentCaptureSessionAttabal2, sanenessVarAttabal2.attabal(), jArr);
            ViewStructure viewStructureSaneness2 = saneness.saneness(splinterproof.dern.attabal(this.f38054attabal), this.f38055saneness);
            attabal.attabal(viewStructureSaneness2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            saneness.wireman(splinterproof.dern.attabal(this.f38054attabal), viewStructureSaneness2);
        }
    }

    public beachfront saneness(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return beachfront.impromptu(saneness.dern(splinterproof.dern.attabal(this.f38054attabal), autofillId, j));
        }
        return null;
    }

    public void wireman(List<ViewStructure> list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            dern.attabal(splinterproof.dern.attabal(this.f38054attabal), list);
            return;
        }
        if (i >= 29) {
            ViewStructure viewStructureSaneness = saneness.saneness(splinterproof.dern.attabal(this.f38054attabal), this.f38055saneness);
            attabal.attabal(viewStructureSaneness).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            saneness.wireman(splinterproof.dern.attabal(this.f38054attabal), viewStructureSaneness);
            for (int i2 = 0; i2 < list.size(); i2++) {
                saneness.wireman(splinterproof.dern.attabal(this.f38054attabal), list.get(i2));
            }
            ViewStructure viewStructureSaneness2 = saneness.saneness(splinterproof.dern.attabal(this.f38054attabal), this.f38055saneness);
            attabal.attabal(viewStructureSaneness2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            saneness.wireman(splinterproof.dern.attabal(this.f38054attabal), viewStructureSaneness2);
        }
    }
}
