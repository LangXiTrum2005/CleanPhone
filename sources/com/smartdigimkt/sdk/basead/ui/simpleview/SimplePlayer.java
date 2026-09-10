package com.smartdigimkt.sdk.basead.ui.simpleview;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.j4.o;
import com.smartdigimkt.j4.s;
import com.smartdigimkt.m3.j;
import com.smartdigimkt.n4.q;
import com.smartdigimkt.q4.g;
import com.smartdigimkt.w3.d0;
import com.smartdigimkt.w3.f;
import com.smartdigimkt.w3.i;
import com.smartdigimkt.w3.w;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class SimplePlayer extends RelativeLayout {
    public static final String TAG = "SimplePlayer";
    private d0 e0;
    private s f0;
    private TextureView g0;
    w.a h0;
    g i0;
    private boolean j0;
    private String k0;
    private String l0;
    boolean m0;
    boolean n0;
    private final long o0;
    private d p0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimplePlayer simplePlayer = SimplePlayer.this;
            if (simplePlayer.n0) {
                return;
            }
            simplePlayer.a("buffer timeout!");
        }
    }

    public class b extends w.a {
        public b() {
        }

        @Override // com.smartdigimkt.w3.w.a, com.smartdigimkt.w3.w.c
        public void onPlayerError(com.smartdigimkt.w3.g gVar) {
            boolean z2;
            String str;
            super.onPlayerError(gVar);
            if (gVar != null) {
                int i2 = gVar.f39281a;
                z2 = true;
                if (i2 != 0) {
                    if (i2 != 1) {
                        str = i2 != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException.";
                    } else {
                        str = "Play error, because have a RendererException.";
                    }
                    z2 = false;
                } else {
                    str = "Play error, because have a SourceException.";
                }
                if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                    android.support.v4.media.a.x(str, ",eception:").append(gVar.getCause().getMessage());
                }
            } else {
                z2 = false;
            }
            if (SimplePlayer.this.j0 && z2) {
                SimplePlayer.this.j0 = false;
                SimplePlayer.this.d();
            }
        }

        @Override // com.smartdigimkt.w3.w.a, com.smartdigimkt.w3.w.c
        public void onPlayerStateChanged(boolean z2, int i2) {
            super.onPlayerStateChanged(z2, i2);
            String str = SimplePlayer.TAG;
            if (i2 != 3) {
                return;
            }
            SimplePlayer simplePlayer = SimplePlayer.this;
            simplePlayer.n0 = true;
            if (simplePlayer.p0 != null) {
                SimplePlayer.this.p0.a();
            }
        }
    }

    public class c implements g {
        public c() {
        }

        @Override // com.smartdigimkt.q4.g
        public void a() {
        }

        @Override // com.smartdigimkt.q4.g
        public void a(int i2, int i3, int i4, float f) {
            SimplePlayer simplePlayer = SimplePlayer.this;
            simplePlayer.autoFitVideoSize(i2, i3, simplePlayer.g0);
        }
    }

    public interface d {
        void a();

        void a(String str);
    }

    public SimplePlayer(Context context) {
        this(context, null);
    }

    private void e() {
        d0 d0Var = this.e0;
        if (d0Var != null) {
            if (d0Var.Q()) {
                this.e0.stop();
            }
            w.a aVar = this.h0;
            if (aVar != null) {
                this.e0.b(aVar);
            }
            g gVar = this.i0;
            if (gVar != null) {
                this.e0.b(gVar);
            }
            this.e0.release();
            this.e0 = null;
        }
        this.p0 = null;
    }

    private String getValidVideoPath() {
        return new File(this.k0).exists() ? this.k0 : this.l0;
    }

    public void autoFitVideoSize(int i2, int i3, View view) {
        float f = i2;
        float f2 = i3;
        float fMax = Math.max(f / view.getMeasuredWidth(), f2 / view.getMeasuredHeight());
        int iCeil = (int) Math.ceil(f / fMax);
        int iCeil2 = (int) Math.ceil(f2 / fMax);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = iCeil;
        layoutParams.height = iCeil2;
        view.setLayoutParams(layoutParams);
    }

    public void load(String str, boolean z2) {
        this.l0 = str;
        this.k0 = j.a().a(3, str);
        this.n0 = false;
        if (a()) {
            a("Player show fail with some internal error");
        } else {
            a(z2);
            postDelayed(new a(), 5000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public void setSimplePlayerViewListener(d dVar) {
        this.p0 = dVar;
    }

    public void stopVideo() {
        d0 d0Var = this.e0;
        if (d0Var == null || !d0Var.Q()) {
            return;
        }
        this.e0.stop();
    }

    public SimplePlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        if (this.g0 == null) {
            TextureView textureView = new TextureView(getContext());
            this.g0 = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.g0, layoutParams);
        }
    }

    private void c() {
        this.j0 = false;
        setBackgroundColor(Color.parseColor("#000000"));
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.e0.a(this.f0);
    }

    public SimplePlayer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k0 = "";
        this.l0 = "";
        this.o0 = 5000L;
        c();
    }

    private void a(boolean z2) {
        if (this.e0 == null) {
            this.e0 = i.a(new f(getContext()), new com.smartdigimkt.m4.c(), new com.smartdigimkt.w3.d());
            b bVar = new b();
            this.h0 = bVar;
            this.e0.a(bVar);
            c cVar = new c();
            this.i0 = cVar;
            this.e0.a(cVar);
            this.e0.a(1.0f);
            this.e0.a(z2);
            a(getValidVideoPath(), false);
        }
    }

    private void a(String str, boolean z2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.e0 == null) {
                a("Player show fail with some internal error");
                return;
            }
            this.j0 = TextUtils.equals(str, this.k0);
            Uri uri = Uri.parse(str);
            if (str.toLowerCase().startsWith("http")) {
                this.f0 = new o.d(new q("SDM_ExoPlayer")).a(uri);
                this.m0 = true;
            } else {
                this.f0 = new o.d(new com.smartdigimkt.n4.o(getContext(), "SDM_ExoPlayer")).a(uri);
                this.m0 = false;
            }
            this.e0.b(this.g0);
            this.e0.a(this.f0);
        } catch (Throwable th) {
            th.printStackTrace();
            if (!TextUtils.equals(str, this.l0) && !z2) {
                a(this.l0, true);
            } else {
                a(th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        d dVar = this.p0;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    private boolean a() {
        return !new File(this.k0).exists() && TextUtils.isEmpty(this.l0);
    }
}
