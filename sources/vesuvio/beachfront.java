package vesuvio;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: InputContentInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f39333attabal;

    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    public interface dern {
        Object attabal();

        void dern();

        ClipDescription getDescription();

        Uri saneness();

        Uri wireman();
    }

    public beachfront(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f39333attabal = new attabal(uri, clipDescription, uri2);
        } else {
            this.f39333attabal = new saneness(uri, clipDescription, uri2);
        }
    }

    public static beachfront beachfront(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new beachfront(new attabal(obj));
        }
        return null;
    }

    public Uri attabal() {
        return this.f39333attabal.saneness();
    }

    public Uri dern() {
        return this.f39333attabal.wireman();
    }

    public Object marial() {
        return this.f39333attabal.attabal();
    }

    public ClipDescription saneness() {
        return this.f39333attabal.getDescription();
    }

    public void wireman() {
        this.f39333attabal.dern();
    }

    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    public static final class attabal implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final InputContentInfo f39334attabal;

        public attabal(Object obj) {
            this.f39334attabal = (InputContentInfo) obj;
        }

        @Override // vesuvio.beachfront.dern
        public Object attabal() {
            return this.f39334attabal;
        }

        @Override // vesuvio.beachfront.dern
        public void dern() {
            this.f39334attabal.requestPermission();
        }

        @Override // vesuvio.beachfront.dern
        public ClipDescription getDescription() {
            return this.f39334attabal.getDescription();
        }

        @Override // vesuvio.beachfront.dern
        public Uri saneness() {
            return this.f39334attabal.getContentUri();
        }

        @Override // vesuvio.beachfront.dern
        public Uri wireman() {
            return this.f39334attabal.getLinkUri();
        }

        public attabal(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f39334attabal = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public beachfront(dern dernVar) {
        this.f39333attabal = dernVar;
    }

    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    public static final class saneness implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Uri f39335attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Uri f39336dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final ClipDescription f39337saneness;

        public saneness(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f39335attabal = uri;
            this.f39337saneness = clipDescription;
            this.f39336dern = uri2;
        }

        @Override // vesuvio.beachfront.dern
        public Object attabal() {
            return null;
        }

        @Override // vesuvio.beachfront.dern
        public ClipDescription getDescription() {
            return this.f39337saneness;
        }

        @Override // vesuvio.beachfront.dern
        public Uri saneness() {
            return this.f39335attabal;
        }

        @Override // vesuvio.beachfront.dern
        public Uri wireman() {
            return this.f39336dern;
        }

        @Override // vesuvio.beachfront.dern
        public void dern() {
        }
    }
}
