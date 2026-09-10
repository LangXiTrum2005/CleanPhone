package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public class AdCountDownButton extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f45721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    sg.bigo.ads.common.utils.n f45722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45723c;
    boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45724e;
    public View f;
    public View g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f45725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45726i;
    private boolean j;

    public interface a {
        void a();

        void a(Rect rect);
    }

    public interface b {
        void a();
    }

    public AdCountDownButton(Context context) {
        this(context, null);
    }

    private void f() {
        this.f.setVisibility(0);
        this.f.setClickable(true);
        this.f.setAlpha(1.0f);
    }

    public final void a(int i2) {
        removeAllViews();
        sg.bigo.ads.common.utils.a.a(this.f45721a, i2, this, true);
        this.f = findViewById(R.id.bigo_ad_btn_close);
        this.g = findViewById(R.id.inter_view_stroke);
        this.f45725h = (TextView) findViewById(R.id.inter_text_countdown);
    }

    public final void b() {
        sg.bigo.ads.common.utils.n nVar = this.f45722b;
        if (nVar != null) {
            nVar.d();
        }
    }

    public final void c() {
        sg.bigo.ads.common.utils.n nVar = this.f45722b;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.f45722b.c();
    }

    public final void d() {
        sg.bigo.ads.common.utils.n nVar = this.f45722b;
        if (nVar != null) {
            nVar.b();
        }
        this.f45723c = true;
        a(false);
    }

    public final void e() {
        this.f.setVisibility(0);
        this.f.setAlpha(0.2f);
        this.f.setClickable(false);
    }

    public View getCloseView() {
        return this.f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f45723c) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBtnClickArea(int i2) {
        CustomTouchImageView customTouchImageView;
        float f;
        View view = this.f;
        if (view instanceof CustomTouchImageView) {
            if (i2 == 1) {
                customTouchImageView = (CustomTouchImageView) view;
                f = 0.5f;
            } else {
                if (i2 != 2) {
                    return;
                }
                customTouchImageView = (CustomTouchImageView) view;
                f = 0.25f;
            }
            customTouchImageView.setRegionScale(f);
        }
    }

    public void setCloseImageResource(int i2) {
        View view = this.f;
        if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(i2);
        }
    }

    public void setOnCloseListener(final a aVar) {
        View view = this.f;
        if (view == null) {
            return;
        }
        if (aVar == null) {
            view.setOnTouchListener(null);
        } else if (view instanceof CustomTouchImageView) {
            ((CustomTouchImageView) view).setCloseListener(aVar);
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.AdCountDownButton.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    aVar.a();
                }
            });
        }
    }

    public void setShowCloseButtonInCountdown(boolean z2) {
        this.f45726i = z2;
        TextView textView = this.f45725h;
        if (textView == null) {
            return;
        }
        if (z2) {
            textView.setPadding(sg.bigo.ads.common.utils.e.a(getContext(), 2), 0, 0, 0);
        } else {
            textView.setPadding(0, 0, 0, 0);
        }
    }

    public void setTakeoverTickEvent(boolean z2) {
        this.d = z2;
    }

    public void setWithUnit(boolean z2) {
        this.j = z2;
    }

    public AdCountDownButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        if (!this.f45724e) {
            this.f45725h.setText(sg.bigo.ads.common.utils.q.a("%d".concat(this.j ? "s" : ""), Integer.valueOf(Math.round(j / 1000.0f))));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sg.bigo.ads.common.utils.a.a(this.f45721a, R.string.bigo_ad_splash_skip_after, new Object[0]));
        sb.append(" %d");
        sb.append(this.j ? "s" : "");
        this.f45725h.setText(sg.bigo.ads.common.utils.q.a(sb.toString(), Integer.valueOf(Math.round(j / 1000.0f))));
    }

    public final void a(int i2, final b bVar) {
        this.f45725h.setVisibility(0);
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        if (this.f45726i) {
            this.g.setVisibility(0);
            e();
        }
        if (i2 == 0) {
            a(this.d);
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        this.f45723c = false;
        if (i2 < 0) {
            return;
        }
        sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(((long) i2) * 1000) { // from class: sg.bigo.ads.ad.interstitial.AdCountDownButton.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                AdCountDownButton adCountDownButton = AdCountDownButton.this;
                adCountDownButton.a(adCountDownButton.d);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a();
                }
                AdCountDownButton.b(AdCountDownButton.this);
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j) {
                if (AdCountDownButton.this.d) {
                    return;
                }
                AdCountDownButton.this.b(j);
            }
        };
        this.f45722b = nVar;
        nVar.c();
    }

    public AdCountDownButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f45723c = true;
        this.f45726i = false;
        this.j = false;
        this.f45724e = false;
        this.f45721a = context;
        setClickable(true);
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.AdCountDownButton);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AdCountDownButton_bigo_ad_customLayout, 0);
            typedArrayObtainStyledAttributes.recycle();
            sg.bigo.ads.common.utils.a.a(context, resourceId, this, true);
            this.f = findViewById(R.id.bigo_ad_btn_close);
            this.g = findViewById(R.id.inter_view_stroke);
            this.f45725h = (TextView) findViewById(R.id.inter_text_countdown);
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }

    public static /* synthetic */ boolean b(AdCountDownButton adCountDownButton) {
        adCountDownButton.f45723c = true;
        return true;
    }

    public final void a(long j) {
        if (this.d) {
            b(j);
        }
    }

    public final void a(boolean z2) {
        View view;
        View view2;
        f();
        int i2 = 8;
        if (!this.f45724e) {
            this.f45725h.setVisibility(z2 ? 0 : 8);
            view = this.g;
            if (z2) {
                i2 = 0;
            } else {
                view2 = view;
            }
            view.setVisibility(i2);
        }
        this.f45725h.setVisibility(8);
        view2 = this.g;
        view = view2;
        view.setVisibility(i2);
    }

    public final boolean a() {
        View view = this.f;
        return view != null && view.performClick();
    }
}
