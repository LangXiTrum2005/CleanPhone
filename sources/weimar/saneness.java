package weimar;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: Animatable2Compat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Animatable2.AnimationCallback f39707attabal;

    /* JADX INFO: compiled from: Animatable2Compat.java */
    public class attabal extends Animatable2.AnimationCallback {
        public attabal() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            saneness.this.saneness(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            saneness.this.dern(drawable);
        }
    }

    public Animatable2.AnimationCallback attabal() {
        if (this.f39707attabal == null) {
            this.f39707attabal = new attabal();
        }
        return this.f39707attabal;
    }

    public void dern(Drawable drawable) {
    }

    public void saneness(Drawable drawable) {
    }
}
