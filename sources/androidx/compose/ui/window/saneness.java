package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.media3.common.PlaybackException;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/window/saneness;", "", "<init>", "()V", "Lkotlin/Function0;", "", "onDismissRequest", "Landroid/window/OnBackInvokedCallback;", "saneness", "(Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "backCallback", "wireman", "(Landroid/view/View;Ljava/lang/Object;)V", "marial", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f7962attabal = new saneness();

    public static final void dern(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void marial(View view, Object backCallback) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) backCallback);
    }

    public static final OnBackInvokedCallback saneness(final Function0<Unit> onDismissRequest) {
        return new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.attabal
            public final void onBackInvoked() {
                saneness.dern(onDismissRequest);
            }
        };
    }

    public static final void wireman(View view, Object backCallback) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(PlaybackException.CUSTOM_ERROR_CODE_BASE, (OnBackInvokedCallback) backCallback);
    }
}
