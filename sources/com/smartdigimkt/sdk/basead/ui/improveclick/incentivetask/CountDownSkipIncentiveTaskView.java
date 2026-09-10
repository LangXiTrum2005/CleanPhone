package com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.SimpleGuideToClickView;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class CountDownSkipIncentiveTaskView extends BaseIncentiveTaskView {
    private TextView g0;
    private TextView h0;
    private TextView i0;
    private RoundImageView j0;
    private ImageView k0;
    private com.smartdigimkt.j7.b l0;
    private boolean m0;
    SimpleGuideToClickView n0;

    public class a extends com.smartdigimkt.j7.b {
        public a(long j, long j2) {
            super(j, j2);
        }

        @Override // com.smartdigimkt.j7.b
        public void a(long j) {
            if (CountDownSkipIncentiveTaskView.this.i0 != null) {
                CountDownSkipIncentiveTaskView.this.i0.setText(String.format(CountDownSkipIncentiveTaskView.this.getContext().getString(h.a(CountDownSkipIncentiveTaskView.this.getContext(), "myoffer_inctask_cts_time", k.f38992h)), Integer.valueOf((int) Math.ceil(j / 1000.0d))));
            }
        }

        @Override // com.smartdigimkt.j7.b
        public void e() {
            if (CountDownSkipIncentiveTaskView.this.m0) {
                CountDownSkipIncentiveTaskView.this.c();
            } else {
                CountDownSkipIncentiveTaskView.this.m0 = true;
            }
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38561a;

        public b(String str) {
            this.f38561a = str;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (!TextUtils.equals(str, this.f38561a) || CountDownSkipIncentiveTaskView.this.j0 == null) {
                return;
            }
            CountDownSkipIncentiveTaskView.this.j0.setImageBitmap(bitmap);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            view.setOnClickListener(null);
            CountDownSkipIncentiveTaskView.this.b();
            BaseIncentiveTaskView.c cVar = CountDownSkipIncentiveTaskView.this.f0;
            if (cVar != null) {
                cVar.a();
            }
            CountDownSkipIncentiveTaskView.this.m0 = true;
            if (CountDownSkipIncentiveTaskView.this.l0 != null) {
                CountDownSkipIncentiveTaskView.this.l0.h();
            } else {
                CountDownSkipIncentiveTaskView.this.c();
            }
            SimpleGuideToClickView simpleGuideToClickView = CountDownSkipIncentiveTaskView.this.n0;
            if (simpleGuideToClickView != null) {
                simpleGuideToClickView.setVisibility(8);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseIncentiveTaskView.c cVar = CountDownSkipIncentiveTaskView.this.f0;
            if (cVar != null) {
                cVar.onClose();
            }
        }
    }

    public class e implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f38563a;

        public e(ImageView imageView) {
            this.f38563a = imageView;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = this.f38563a;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseIncentiveTaskView.c cVar = CountDownSkipIncentiveTaskView.this.f0;
            if (cVar != null) {
                cVar.a(-1L);
                CountDownSkipIncentiveTaskView.this.f0.onClose();
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseIncentiveTaskView.c cVar = CountDownSkipIncentiveTaskView.this.f0;
            if (cVar != null) {
                cVar.a(-1L);
                CountDownSkipIncentiveTaskView.this.f0.onClose();
            }
        }
    }

    public CountDownSkipIncentiveTaskView(Context context) {
        super(context);
        this.m0 = false;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void initSetting(com.smartdigimkt.w6.f fVar, com.smartdigimkt.w6.g gVar, long j, BaseIncentiveTaskView.c cVar) {
        TextView textView;
        RoundImageView roundImageView;
        super.initSetting(fVar, gVar, j, cVar);
        if (j <= 0 || j >= gVar.I0()) {
            j = gVar.I0();
        }
        long jK0 = j - gVar.k0();
        long jL0 = gVar.l0();
        if (jL0 < jK0) {
            String str = String.format(getContext().getString(h.a(getContext(), "myoffer_inctask_cts_hint", k.f38992h)), Integer.valueOf((int) Math.ceil(jL0 / 1000.0d)));
            TextView textView2 = this.g0;
            if (textView2 != null) {
                textView2.setText(str);
            }
            this.l0 = new a(jL0, 500L);
        } else {
            String string = getContext().getString(h.a(getContext(), "myoffer_inctask_cts_hint2", k.f38992h));
            TextView textView3 = this.g0;
            if (textView3 != null) {
                textView3.setText(string);
            }
        }
        String strW = fVar.w();
        if (!TextUtils.isEmpty(strW) && (roundImageView = this.j0) != null) {
            roundImageView.setNeedRadiu(true);
            this.j0.setRadiusInDip(20);
            com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, strW), new b(strW));
        }
        if (!TextUtils.isEmpty(fVar.g0()) && (textView = this.h0) != null) {
            textView.setText(fVar.g0());
            this.h0.setVisibility(0);
        }
        TextView textView4 = this.i0;
        if (textView4 != null) {
            textView4.setOnClickListener(new c());
        }
        ImageView imageView = this.k0;
        if (imageView != null) {
            imageView.setOnClickListener(new d());
        }
        SimpleGuideToClickView simpleGuideToClickView = this.n0;
        if (simpleGuideToClickView != null) {
            simpleGuideToClickView.init(h.a(getContext(), "myoffer_simple_guide_to_click_s", "layout"), h.a(getContext(), 4.0f), h.a(getContext(), 6.0f), h.a(getContext(), 8.0f), h.a(getContext(), 12.0f));
            ImageView imageView2 = (ImageView) this.n0.findViewById(h.a(getContext(), "myoffer_guide_to_click_finger", "id"));
            if (imageView2 != null) {
                String strC = com.smartdigimkt.j5.a.a().c("g2c_finger_icon_v2");
                if (TextUtils.isEmpty(strC)) {
                    return;
                }
                com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC), new e(imageView2));
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void onPause() {
        super.onPause();
        this.m0 = false;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void onResume() {
        super.onResume();
        if (this.m0) {
            c();
        } else {
            this.m0 = true;
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void release() {
        super.release();
        com.smartdigimkt.j7.b bVar = this.l0;
        if (bVar != null) {
            bVar.i();
            this.l0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        TextView textView = this.g0;
        if (textView != null) {
            textView.setText(getContext().getString(h.a(getContext(), "myoffer_inctask_cts_completed", k.f38992h)));
        }
        TextView textView2 = this.i0;
        if (textView2 != null) {
            textView2.setText(getContext().getString(h.a(getContext(), "myoffer_inctask_cts_completed_cta", k.f38992h)));
            this.i0.setOnClickListener(new f());
        }
        ImageView imageView = this.k0;
        if (imageView != null) {
            imageView.setOnClickListener(new g());
        }
    }

    public CountDownSkipIncentiveTaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m0 = false;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView
    public void a() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_inctask_count_down_skip", "layout"), this);
        this.g0 = (TextView) findViewById(h.a(getContext(), "myoffer_inctask_title", "id"));
        this.h0 = (TextView) findViewById(h.a(getContext(), "myoffer_inctask_desc", "id"));
        this.i0 = (TextView) findViewById(h.a(getContext(), "myoffer_inctask_cta", "id"));
        this.j0 = (RoundImageView) findViewById(h.a(getContext(), "myoffer_inctask_icon", "id"));
        this.k0 = (ImageView) findViewById(h.a(getContext(), "myoffer_inctask_close_view", "id"));
        this.n0 = (SimpleGuideToClickView) findViewById(h.a(getContext(), "myoffer_g2c_item_g2c_fingerview", "id"));
    }

    public CountDownSkipIncentiveTaskView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m0 = false;
    }
}
