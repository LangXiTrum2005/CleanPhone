package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private p rootView;
    private boolean startFocused;
    private final s state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, d dVar, a aVar, int i10, View.OnFocusChangeListener onFocusChangeListener) {
        super(new q(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i10;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        s sVar = new s();
        this.state = sVar;
        sVar.f43382a = dVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS);
    }

    public s detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        p pVar = this.rootView;
        if (pVar != null) {
            pVar.removeAllViews();
        }
        return this.state;
    }

    @Nullable
    public d getView() {
        return this.state.f43382a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        s sVar = this.state;
        if (sVar.f43384c == null) {
            sVar.f43384c = new o(getContext());
        }
        if (this.state.f43383b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            s sVar2 = this.state;
            sVar2.f43383b = new y(windowManager, sVar2.f43384c);
        }
        this.container = new FrameLayout(getContext());
        r rVar = new r(getContext(), this.state.f43383b, this.outerContext);
        View view = this.state.f43382a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(rVar);
        } else {
            Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        p pVar = new p(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = pVar;
        pVar.addView(this.container);
        this.rootView.addView(this.state.f43384c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, a aVar, s sVar, View.OnFocusChangeListener onFocusChangeListener, boolean z10) {
        super(new q(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = sVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z10;
    }
}
