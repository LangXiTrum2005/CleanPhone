package sg.bigo.ads.core.player.b;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f extends FrameLayout implements sg.bigo.ads.api.c.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f48829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected sg.bigo.ads.core.g.c f48830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f48831c;
    protected final sg.bigo.ads.api.c.b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final sg.bigo.ads.core.a.a f48832e;
    protected boolean f;
    private ImageView g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View.OnClickListener f48833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f48834i;
    private boolean j;

    public f(Context context, sg.bigo.ads.api.c.b bVar, sg.bigo.ads.core.a.a aVar) {
        super(context);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: sg.bigo.ads.core.player.b.f.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view == f.this.f48829a) {
                    f.this.o();
                    return;
                }
                f fVar = f.this;
                if (view == fVar) {
                    fVar.p();
                }
            }
        };
        this.f48833h = onClickListener;
        this.f48834i = new Runnable() { // from class: sg.bigo.ads.core.player.b.f.2
            @Override // java.lang.Runnable
            public final void run() {
                f.this.setPlayOrPauseViewHidden(true);
            }
        };
        this.f = false;
        this.j = true;
        this.f48831c = context;
        this.d = bVar;
        this.f48832e = aVar;
        if (!bVar.f47009c) {
            int iB = sg.bigo.ads.common.utils.a.b(context, R.dimen.bigo_ad_volume_padding);
            ImageView imageView = new ImageView(this.f48831c);
            this.f48829a = imageView;
            imageView.setOnClickListener(onClickListener);
            this.f48829a.setPadding(iB, iB, iB, iB);
            int iB2 = (iB * 2) + sg.bigo.ads.common.utils.a.b(this.f48831c, R.dimen.bigo_ad_volume_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iB2, iB2, 85);
            layoutParams.rightMargin = iB;
            layoutParams.bottomMargin = iB;
            this.f48829a.setVisibility(0);
            u.a(this.f48829a, this, layoutParams, -1);
        }
        int iB3 = sg.bigo.ads.common.utils.a.b(this.f48831c, R.dimen.bigo_ad_replay_size);
        if (aVar != null && aVar.x() == 2 && sg.bigo.ads.api.c.b.b() > 0) {
            iB3 = sg.bigo.ads.common.utils.e.a(this.f48831c, sg.bigo.ads.api.c.b.b());
        }
        ImageView imageView2 = new ImageView(this.f48831c);
        this.g = imageView2;
        imageView2.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f48831c, R.drawable.bigo_ad_ic_media_play));
        u.a(this.g, this, new FrameLayout.LayoutParams(iB3, iB3, 17), -1);
        setOnClickListener(onClickListener);
    }

    public final void b(int i2) {
        sg.bigo.ads.core.a.a aVar = this.f48832e;
        if (aVar != null) {
            sg.bigo.ads.core.d.b.a(aVar, i2, aVar.aK(), this.f48832e.aM());
        }
    }

    public final void c(boolean z2) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f48831c, z2 ? R.drawable.bigo_ad_ic_media_play : R.drawable.bigo_ad_ic_media_pause));
        }
    }

    public final void d(boolean z2) {
        if (z2) {
            sg.bigo.ads.core.player.d.a.f48851a.a(this);
        } else {
            sg.bigo.ads.core.player.d.a.f48851a.b(this);
        }
    }

    public final void e(boolean z2) {
        if (this.f) {
            b(9);
        }
        a(z2);
    }

    public boolean n() {
        return this.j;
    }

    public final void o() {
        setMute(!c());
    }

    public final void p() {
        v();
    }

    public final boolean q() {
        return this.f;
    }

    public final void r() {
        this.f = false;
    }

    public final void s() {
        if (t()) {
            a();
        }
    }

    public void setOnEventListener(sg.bigo.ads.core.g.c cVar) {
        this.f48830b = cVar;
    }

    public void setPlayOrPauseViewHidden(boolean z2) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 8 : 0);
        }
    }

    public void setStatPrepareEventOnce(boolean z2) {
        this.j = z2;
    }

    public void setVolumeViewHidden(boolean z2) {
        ImageView imageView = this.f48829a;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 4 : 0);
        }
    }

    public final boolean t() {
        return getPlayStatus() == 2;
    }

    public final void u() {
        this.f = true;
        a();
        b(8);
    }

    public final void v() {
        if (e()) {
            if (t()) {
                removeCallbacks(this.f48834i);
                u();
                setPlayOrPauseViewHidden(false);
                c(true);
                return;
            }
            removeCallbacks(this.f48834i);
            e(false);
            this.g.setVisibility(0);
            setPlayOrPauseViewHidden(false);
            c(false);
            postDelayed(this.f48834i, 1500L);
        }
    }

    public final void a(String str, Object obj, int[] iArr) {
        sg.bigo.ads.core.g.c cVar = this.f48830b;
        if (cVar != null) {
            cVar.a(str, obj, iArr);
        }
    }

    public final void b(boolean z2) {
        ImageView imageView = this.f48829a;
        if (imageView != null) {
            imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(this.f48831c, z2 ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute));
        }
    }

    public boolean e() {
        return false;
    }

    public final void a(String str, int[] iArr) {
        sg.bigo.ads.core.g.c cVar = this.f48830b;
        if (cVar != null) {
            cVar.a(str, iArr);
        }
    }

    public void a(boolean z2) {
        this.f = false;
    }
}
