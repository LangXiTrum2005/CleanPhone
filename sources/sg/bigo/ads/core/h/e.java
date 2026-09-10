package sg.bigo.ads.core.h;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.WebView;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public class e extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f48585a;
    protected boolean j;

    public interface a {
        void a(MotionEvent motionEvent);
    }

    public e(Context context) {
        super(context);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMixedContentMode(0);
    }

    public static e a(Context context) {
        try {
            return new e(context);
        } catch (Exception e2) {
            sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(e2));
            return null;
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.j) {
            return;
        }
        this.j = true;
        stopLoading();
        u.b(this);
        removeAllViews();
        setWebChromeClient(null);
        setWebViewClient(null);
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar = this.f48585a;
        if (aVar != null) {
            aVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnWebViewTouchListener(a aVar) {
        this.f48585a = aVar;
    }
}
