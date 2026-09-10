package gown;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.media3.common.PlaybackException;
import java.util.Objects;

/* JADX INFO: compiled from: MaterialBackOrchestrator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f27407attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final View f27408dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final gown.saneness f27409saneness;

    /* JADX INFO: renamed from: gown.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MaterialBackOrchestrator.java */
    public static class C0624dern extends saneness {

        /* JADX INFO: renamed from: gown.dern$dern$attabal */
        /* JADX INFO: compiled from: MaterialBackOrchestrator.java */
        public class attabal implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ gown.saneness f27410attabal;

            public attabal(gown.saneness sanenessVar) {
                this.f27410attabal = sanenessVar;
            }

            public void onBackCancelled() {
                if (C0624dern.this.wireman()) {
                    this.f27410attabal.cancelBackProgress();
                }
            }

            public void onBackInvoked() {
                this.f27410attabal.handleBackInvoked();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C0624dern.this.wireman()) {
                    this.f27410attabal.updateBackProgress(new androidx.p000activity.saneness(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C0624dern.this.wireman()) {
                    this.f27410attabal.startBackProgress(new androidx.p000activity.saneness(backEvent));
                }
            }
        }

        public C0624dern() {
            super();
        }

        @Override // gown.dern.saneness
        public OnBackInvokedCallback dern(gown.saneness sanenessVar) {
            return new attabal(sanenessVar);
        }
    }

    /* JADX INFO: compiled from: MaterialBackOrchestrator.java */
    public static class saneness implements wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public OnBackInvokedCallback f27412attabal;

        public saneness() {
        }

        @Override // gown.dern.wireman
        public void attabal(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f27412attabal == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f27412attabal);
            this.f27412attabal = null;
        }

        public OnBackInvokedCallback dern(final gown.saneness sanenessVar) {
            Objects.requireNonNull(sanenessVar);
            return new OnBackInvokedCallback() { // from class: gown.marial
                public final void onBackInvoked() {
                    sanenessVar.handleBackInvoked();
                }
            };
        }

        @Override // gown.dern.wireman
        public void saneness(gown.saneness sanenessVar, View view, boolean z) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f27412attabal == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackDern = dern(sanenessVar);
                this.f27412attabal = onBackInvokedCallbackDern;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? PlaybackException.CUSTOM_ERROR_CODE_BASE : 0, onBackInvokedCallbackDern);
            }
        }

        public boolean wireman() {
            return this.f27412attabal != null;
        }
    }

    /* JADX INFO: compiled from: MaterialBackOrchestrator.java */
    public interface wireman {
        void attabal(View view);

        void saneness(gown.saneness sanenessVar, View view, boolean z);
    }

    public <T extends View & gown.saneness> dern(T t) {
        this(t, t);
    }

    public static wireman attabal() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return new C0624dern();
        }
        if (i >= 33) {
            return new saneness();
        }
        return null;
    }

    public void beachfront() {
        wireman wiremanVar = this.f27407attabal;
        if (wiremanVar != null) {
            wiremanVar.attabal(this.f27408dern);
        }
    }

    public void dern() {
        wireman(false);
    }

    public void marial() {
        wireman(true);
    }

    public boolean saneness() {
        return this.f27407attabal != null;
    }

    public final void wireman(boolean z) {
        wireman wiremanVar = this.f27407attabal;
        if (wiremanVar != null) {
            wiremanVar.saneness(this.f27409saneness, this.f27408dern, z);
        }
    }

    public dern(gown.saneness sanenessVar, View view) {
        this.f27407attabal = attabal();
        this.f27409saneness = sanenessVar;
        this.f27408dern = view;
    }
}
