package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.a0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import p.l2;
import p.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f3944g;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3944g = new a0(this, 27);
        this.f3942e = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
            return NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (i10 >= 600) {
            return PsExtractor.AUDIO_STREAM;
        }
        if (i10 < 640 || i11 < 480) {
            return 160;
        }
        return PsExtractor.AUDIO_STREAM;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f3942e <= 0 || super.enoughToFilter();
    }

    @Override // p.n, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f3943f) {
            a0 a0Var = this.f3944g;
            removeCallbacks(a0Var);
            post(a0Var);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i10, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            throw null;
        }
    }

    public void setImeVisibility(boolean z10) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        a0 a0Var = this.f3944g;
        if (!z10) {
            this.f3943f = false;
            removeCallbacks(a0Var);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f3943f = true;
                return;
            }
            this.f3943f = false;
            removeCallbacks(a0Var);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i10) {
        super.setThreshold(i10);
        this.f3942e = i10;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setSearchView(l2 l2Var) {
    }
}
