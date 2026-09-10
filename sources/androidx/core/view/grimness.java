package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: compiled from: ScrollFeedbackProviderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class grimness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f9306attabal;

    /* JADX INFO: compiled from: ScrollFeedbackProviderCompat.java */
    public static class saneness implements wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ScrollFeedbackProvider f9307attabal;

        public saneness(View view) {
            this.f9307attabal = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.grimness.wireman
        public void onScrollLimit(int i, int i2, int i3, boolean z) {
            this.f9307attabal.onScrollLimit(i, i2, i3, z);
        }

        @Override // androidx.core.view.grimness.wireman
        public void onScrollProgress(int i, int i2, int i3, int i4) {
            this.f9307attabal.onScrollProgress(i, i2, i3, i4);
        }
    }

    /* JADX INFO: compiled from: ScrollFeedbackProviderCompat.java */
    public interface wireman {
        void onScrollLimit(int i, int i2, int i3, boolean z);

        void onScrollProgress(int i, int i2, int i3, int i4);
    }

    public grimness(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f9306attabal = new saneness(view);
        } else {
            this.f9306attabal = new dern();
        }
    }

    public static grimness attabal(View view) {
        return new grimness(view);
    }

    public void dern(int i, int i2, int i3, int i4) {
        this.f9306attabal.onScrollProgress(i, i2, i3, i4);
    }

    public void saneness(int i, int i2, int i3, boolean z) {
        this.f9306attabal.onScrollLimit(i, i2, i3, z);
    }

    /* JADX INFO: compiled from: ScrollFeedbackProviderCompat.java */
    public static class dern implements wireman {
        public dern() {
        }

        @Override // androidx.core.view.grimness.wireman
        public void onScrollLimit(int i, int i2, int i3, boolean z) {
        }

        @Override // androidx.core.view.grimness.wireman
        public void onScrollProgress(int i, int i2, int i3, int i4) {
        }
    }
}
