package com.smartdigimkt.sdk.basead.webtemplet;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.smartdigimkt.r3.d;
import com.smartdigimkt.v3.h;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class WTWebContainerView extends FrameLayout {
    private final String e0;
    protected f f0;
    protected g g0;
    protected com.smartdigimkt.v6.a h0;
    c i0;
    private WTWebView j0;
    private final List<com.smartdigimkt.sdk.basead.webtemplet.a> k0;
    private volatile boolean l0;

    public class a implements com.smartdigimkt.sdk.basead.webtemplet.b.InterfaceC0613b {
        public a() {
        }

        @Override // com.smartdigimkt.sdk.basead.webtemplet.b.InterfaceC0613b
        public void a(WebView webView) {
            WTWebContainerView.this.a();
        }

        @Override // com.smartdigimkt.sdk.basead.webtemplet.b.InterfaceC0613b
        public void a(h hVar) {
            c cVar = WTWebContainerView.this.i0;
            if (cVar != null) {
                cVar.a(hVar);
            }
        }
    }

    public class b implements WTWebView.f {
        public b() {
        }

        @Override // com.smartdigimkt.sdk.basead.webtemplet.WTWebView.f
        public void a() {
            c cVar = WTWebContainerView.this.i0;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    public interface c {
        void a();

        void a(h hVar);

        void b();
    }

    public WTWebContainerView(Context context) {
        super(context);
        this.e0 = "WTWebContainerView";
        this.k0 = androidx.media3.extractor.text.ttml.a.u();
        this.l0 = false;
    }

    public Object getJsCommunicationObject() {
        WTWebView wTWebView = this.j0;
        if (wTWebView != null) {
            return wTWebView.getJsCommunicationObject();
        }
        return null;
    }

    public void init(Object obj) {
        if (d.c(this.f0)) {
            a();
            return;
        }
        String strA = com.smartdigimkt.d7.d.c().a(this.f0.v());
        String strA2 = d.a((com.smartdigimkt.v6.a) null, this.f0, 3);
        try {
            this.j0 = new WTWebView(com.smartdigimkt.m6.b.p().k());
            com.smartdigimkt.sdk.basead.webtemplet.b.a(strA2, new File(strA).toURI().toString(), this.j0, new a(), this.f0, this.h0, 2, obj);
        } catch (Throwable th) {
            c cVar = this.i0;
            if (cVar != null) {
                cVar.a(i.a("10000", "wtWebView create fail with " + th.getMessage()));
            }
        }
    }

    public void notifyInnerAdEvent(int i2, Map<String, Object> map) {
        if (!this.l0) {
            synchronized (this.k0) {
                this.k0.add(new com.smartdigimkt.sdk.basead.webtemplet.a(i2, map));
            }
        } else {
            WTWebView wTWebView = this.j0;
            if (wTWebView != null) {
                wTWebView.notifyInnerAdEvent(i2, map);
            }
        }
    }

    public void release() {
        WTWebView wTWebView = this.j0;
        if (wTWebView != null) {
            wTWebView.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.j0 == null) {
            this.j0 = d.e(d.a((com.smartdigimkt.v6.a) null, this.f0, 3));
        }
        if (this.j0 != null) {
            this.l0 = true;
            synchronized (this.k0) {
                try {
                    if (!this.k0.isEmpty()) {
                        for (com.smartdigimkt.sdk.basead.webtemplet.a aVar : this.k0) {
                            notifyInnerAdEvent(aVar.f38590a, aVar.f38591b);
                        }
                        this.k0.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.j0.prepare(new b());
            this.j0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(this.j0);
            c cVar = this.i0;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    public WTWebContainerView(Context context, f fVar, com.smartdigimkt.v6.a aVar, c cVar) {
        super(context);
        this.e0 = "WTWebContainerView";
        this.k0 = androidx.media3.extractor.text.ttml.a.u();
        this.l0 = false;
        this.f0 = fVar;
        this.g0 = aVar.t;
        this.h0 = aVar;
        this.i0 = cVar;
    }
}
