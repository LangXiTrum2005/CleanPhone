package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.BackEventCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialBackOrchestrator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Api33BackCallbackDelegate f19362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialBackHandler f19363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f19364c;

    public static class Api33BackCallbackDelegate implements BackCallbackDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OnBackInvokedCallback f19365a;

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        public void a(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f19365a);
            this.f19365a = null;
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        public void b(MaterialBackHandler materialBackHandler, View view, boolean z2) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f19365a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(materialBackHandler);
                this.f19365a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z2 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        public OnBackInvokedCallback c(MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new a(materialBackHandler, 0);
        }
    }

    public static class Api34BackCallbackDelegate extends Api33BackCallbackDelegate {
        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        public final OnBackInvokedCallback c(final MaterialBackHandler materialBackHandler) {
            return new OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.1
                public final void onBackCancelled() {
                    if (Api34BackCallbackDelegate.this.f19365a != null) {
                        materialBackHandler.b();
                    }
                }

                public final void onBackInvoked() {
                    materialBackHandler.f();
                }

                public final void onBackProgressed(BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.f19365a != null) {
                        materialBackHandler.e(new BackEventCompat(backEvent));
                    }
                }

                public final void onBackStarted(BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.f19365a != null) {
                        materialBackHandler.d(new BackEventCompat(backEvent));
                    }
                }
            };
        }
    }

    public interface BackCallbackDelegate {
        void a(View view);

        void b(MaterialBackHandler materialBackHandler, View view, boolean z2);
    }

    public MaterialBackOrchestrator(MaterialBackHandler materialBackHandler, View view) {
        int i2 = Build.VERSION.SDK_INT;
        this.f19362a = i2 >= 34 ? new Api34BackCallbackDelegate() : i2 >= 33 ? new Api33BackCallbackDelegate() : null;
        this.f19363b = materialBackHandler;
        this.f19364c = view;
    }

    public final void a(boolean z2) {
        Api33BackCallbackDelegate api33BackCallbackDelegate = this.f19362a;
        if (api33BackCallbackDelegate != null) {
            api33BackCallbackDelegate.b(this.f19363b, this.f19364c, z2);
        }
    }

    public final void b() {
        Api33BackCallbackDelegate api33BackCallbackDelegate = this.f19362a;
        if (api33BackCallbackDelegate != null) {
            api33BackCallbackDelegate.a(this.f19364c);
        }
    }
}
