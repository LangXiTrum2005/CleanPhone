package com.smartdigimkt.sdk.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.sdk.basead.ui.WrapRoundImageView;
import com.smartdigimkt.sdk.core.common.res.image.RecycleImageView;
import com.smartdigimkt.v3.h;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.f;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseAnimPlayerView extends BasePlayerView {
    protected List<Bitmap> A0;
    protected String B0;
    protected RecycleImageView C0;
    protected WrapRoundImageView D0;
    private boolean E0;
    private boolean F0;
    protected final String x0;
    long y0;
    long z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BasePlayerView.a aVar = BaseAnimPlayerView.this.s0;
            if (aVar != null) {
                aVar.b(1);
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BaseAnimPlayerView baseAnimPlayerView = BaseAnimPlayerView.this;
            if (baseAnimPlayerView.s0 != null && baseAnimPlayerView.n0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() + baseAnimPlayerView.y0;
                BaseAnimPlayerView baseAnimPlayerView2 = BaseAnimPlayerView.this;
                baseAnimPlayerView.f0 = jElapsedRealtime - baseAnimPlayerView2.z0;
                if (!baseAnimPlayerView2.o0 && !baseAnimPlayerView2.p0) {
                    baseAnimPlayerView2.o0 = true;
                    BasePlayerView.a aVar = baseAnimPlayerView2.s0;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
                BaseAnimPlayerView baseAnimPlayerView3 = BaseAnimPlayerView.this;
                BasePlayerView.a aVar2 = baseAnimPlayerView3.s0;
                if (aVar2 != null) {
                    aVar2.b(baseAnimPlayerView3.f0);
                }
                BaseAnimPlayerView baseAnimPlayerView4 = BaseAnimPlayerView.this;
                if (!baseAnimPlayerView4.j0 && baseAnimPlayerView4.f0 >= baseAnimPlayerView4.g0) {
                    baseAnimPlayerView4.j0 = true;
                    BasePlayerView.a aVar3 = baseAnimPlayerView4.s0;
                    if (aVar3 != null) {
                        aVar3.a(25);
                    }
                } else if (!baseAnimPlayerView4.k0 && baseAnimPlayerView4.f0 >= baseAnimPlayerView4.h0) {
                    baseAnimPlayerView4.k0 = true;
                    BasePlayerView.a aVar4 = baseAnimPlayerView4.s0;
                    if (aVar4 != null) {
                        aVar4.a(50);
                    }
                } else if (!baseAnimPlayerView4.l0 && baseAnimPlayerView4.f0 >= baseAnimPlayerView4.i0) {
                    baseAnimPlayerView4.l0 = true;
                    BasePlayerView.a aVar5 = baseAnimPlayerView4.s0;
                    if (aVar5 != null) {
                        aVar5.a(75);
                    }
                }
                BaseAnimPlayerView baseAnimPlayerView5 = BaseAnimPlayerView.this;
                if (baseAnimPlayerView5.p0 || baseAnimPlayerView5.f0 < baseAnimPlayerView5.e0) {
                    return;
                }
                baseAnimPlayerView5.i();
                BaseAnimPlayerView.this.E0 = false;
                BaseAnimPlayerView baseAnimPlayerView6 = BaseAnimPlayerView.this;
                baseAnimPlayerView6.p0 = true;
                BasePlayerView.a aVar6 = baseAnimPlayerView6.s0;
                if (aVar6 != null) {
                    aVar6.d();
                }
                BaseAnimPlayerView.this.a();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            while (true) {
                BaseAnimPlayerView baseAnimPlayerView = BaseAnimPlayerView.this;
                if (!baseAnimPlayerView.n0) {
                    return;
                }
                if (baseAnimPlayerView.p0 || (handler = baseAnimPlayerView.r0) == null) {
                    try {
                        Thread.sleep(10L);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } else {
                    try {
                        handler.sendEmptyMessage(1);
                    } catch (Throwable unused) {
                    }
                    try {
                        Thread.sleep(200L);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
    }

    public BaseAnimPlayerView(Context context) {
        super(context);
        this.x0 = getClass().getSimpleName();
        this.y0 = 0L;
        this.z0 = 0L;
        this.B0 = "";
        this.E0 = false;
        this.F0 = false;
        b();
    }

    private void b() {
        this.r0 = new b(Looper.getMainLooper());
    }

    private void g() {
        if (this.q0 != null) {
            return;
        }
        this.n0 = true;
        Thread thread = new Thread(new c());
        this.q0 = thread;
        thread.setName("sdm_type_anim_player_progress");
        this.q0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.n0 = false;
        this.q0 = null;
    }

    public abstract void c();

    public abstract void d();

    public void e() {
        a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
    }

    public abstract void f();

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public long getCurrentPosition() {
        return this.f0;
    }

    public int getMinAnimDuration() {
        return 0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public long getVideoLength() {
        return this.e0;
    }

    public abstract void h();

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public boolean hasVideo() {
        return this.t0 != null;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void init(f fVar, com.smartdigimkt.v6.a aVar, boolean z2, List<Bitmap> list, com.smartdigimkt.k5.d dVar) {
        super.init(fVar, aVar, z2, list, dVar);
        this.A0 = list;
        this.B0 = fVar.s();
        long jMax = Math.max(this.u0.t.V0(), getMinAnimDuration());
        this.e0 = jMax;
        this.g0 = Math.round(jMax * 0.25f);
        this.h0 = Math.round(this.e0 * 0.5f);
        this.i0 = Math.round(this.e0 * 0.75f);
        BasePlayerView.a aVar2 = this.s0;
        if (aVar2 != null) {
            aVar2.a(this.e0);
        }
        setOnClickListener(new a());
        j();
        List<Bitmap> list2 = this.A0;
        (list2 == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(list2.size())).toString();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public boolean isMute() {
        return this.m0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public boolean isPlaying() {
        return this.E0;
    }

    public void j() {
        if (TextUtils.isEmpty(this.B0)) {
            b(i.a("40003", "Animation render fail"));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release(5);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void pause() {
        if (this.E0) {
            this.y0 = (SystemClock.elapsedRealtime() - this.z0) + this.y0;
        }
        this.E0 = false;
        i();
        c();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void release(int i2) {
        i();
        a();
        Handler handler = this.r0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        d();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void setListener(BasePlayerView.a aVar) {
        this.s0 = aVar;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void setMute(boolean z2) {
        this.m0 = z2;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void start() {
        if (this.F0) {
            return;
        }
        this.E0 = !this.p0;
        this.z0 = SystemClock.elapsedRealtime();
        g();
        if (this.E0) {
            f();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void stop() {
        this.E0 = false;
        i();
        BasePlayerView.a aVar = this.s0;
        if (aVar != null) {
            aVar.c();
        }
        h();
        a();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void b(h hVar) {
        this.F0 = true;
        super.b(hVar);
    }

    public void a(int i2, int i3) {
        RecycleImageView recycleImageView = new RecycleImageView(getContext());
        this.C0 = recycleImageView;
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.C0, -1, -1);
        this.D0 = new WrapRoundImageView(getContext());
        RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-1, -1, 13);
        this.D0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.D0, layoutParamsF);
        com.smartdigimkt.d7.b.a(getContext()).a(new e(1, this.B0), i2, i3, new d(i2, i3));
    }

    public class d implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f38450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38451b;

        public class a implements com.smartdigimkt.o8.b.InterfaceC0563b {
            public a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a(Bitmap bitmap) {
                BaseAnimPlayerView.this.C0.setImageBitmap(bitmap);
            }
        }

        public d(int i2, int i3) {
            this.f38450a = i2;
            this.f38451b = i3;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, BaseAnimPlayerView.this.B0)) {
                BaseAnimPlayerView.this.D0.setBitmapAndResize(bitmap, this.f38450a, this.f38451b);
                com.smartdigimkt.o8.b.a(BaseAnimPlayerView.this.getContext(), bitmap, new a());
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setDuration(100L);
                BaseAnimPlayerView.this.D0.startAnimation(alphaAnimation);
                BaseAnimPlayerView.this.C0.startAnimation(alphaAnimation);
            }
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
            BaseAnimPlayerView.this.b(i.a("40003", "Animation render fail"));
        }
    }

    public BaseAnimPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x0 = getClass().getSimpleName();
        this.y0 = 0L;
        this.z0 = 0L;
        this.B0 = "";
        this.E0 = false;
        this.F0 = false;
        b();
    }

    public BaseAnimPlayerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.x0 = getClass().getSimpleName();
        this.y0 = 0L;
        this.z0 = 0L;
        this.B0 = "";
        this.E0 = false;
        this.F0 = false;
        b();
    }
}
