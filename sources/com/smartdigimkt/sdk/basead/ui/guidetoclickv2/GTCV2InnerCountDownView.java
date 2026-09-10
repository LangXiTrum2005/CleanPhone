package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.n8.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes6.dex */
public class GTCV2InnerCountDownView extends RelativeLayout {
    com.smartdigimkt.j7.b e0;
    TextView f0;
    TextView g0;
    TextView h0;
    ImageView i0;
    ImageView j0;
    ImageView k0;
    final long l0;
    final long m0;
    private g n0;

    public class a implements com.smartdigimkt.d7.b.f {
        public a() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = GTCV2InnerCountDownView.this.j0;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {
        public b() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = GTCV2InnerCountDownView.this.k0;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class c extends com.smartdigimkt.j7.b {
        final /* synthetic */ g g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2, g gVar) {
            super(j, j2);
            this.g = gVar;
        }

        @Override // com.smartdigimkt.j7.b
        public void a(long j) {
            long j2 = j / 1000;
            int i2 = (int) (j2 / 60);
            int i3 = (int) (j2 % 60);
            TextView textView = GTCV2InnerCountDownView.this.f0;
            if (textView != null) {
                textView.setText(String.format("%02d", Integer.valueOf(i2)));
            }
            TextView textView2 = GTCV2InnerCountDownView.this.g0;
            if (textView2 != null) {
                textView2.setText(String.format("%02d", Integer.valueOf(i3)));
            }
        }

        @Override // com.smartdigimkt.j7.b
        public void e() {
            g gVar = this.g;
            if (gVar != null) {
                gVar.onClose();
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class e implements View.OnClickListener {
        final /* synthetic */ g X;

        public e(g gVar) {
            this.X = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g gVar = this.X;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    public class f implements View.OnClickListener {
        final /* synthetic */ g X;

        public f(g gVar) {
            this.X = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g gVar = this.X;
            if (gVar != null) {
                gVar.onClose();
            }
        }
    }

    public interface g {
        void a();

        void onClose();
    }

    public GTCV2InnerCountDownView(Context context) {
        super(context);
        this.l0 = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        this.m0 = 500L;
        a();
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_inner_count_down_view", "layout"), this);
        this.i0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_close_iv", "id"));
        this.j0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_gift_icon", "id"));
        this.k0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_ribbon", "id"));
        this.f0 = (TextView) findViewById(h.a(getContext(), "myoffer_g2c_ct_min", "id"));
        this.g0 = (TextView) findViewById(h.a(getContext(), "myoffer_g2c_ct_sec", "id"));
        this.h0 = (TextView) findViewById(h.a(getContext(), "myoffer_g2c_ct_cta", "id"));
        String strC = com.smartdigimkt.j5.a.a().c("g2c_gift_icon");
        if (!TextUtils.isEmpty(strC)) {
            com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC), new a());
        }
        String strC2 = com.smartdigimkt.j5.a.a().c("g2c_ribbon_bg");
        if (TextUtils.isEmpty(strC2)) {
            return;
        }
        com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC2), new b());
    }

    public void initSetting(g gVar) throws Throwable {
        this.n0 = gVar;
        c cVar = new c(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, 500L, gVar);
        this.e0 = cVar;
        cVar.h();
        setOnClickListener(new d());
        this.h0.setOnClickListener(new e(gVar));
        this.i0.setOnClickListener(new f(gVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public final void onPause() {
        com.smartdigimkt.j7.b bVar = this.e0;
        if (bVar != null) {
            bVar.f();
        }
    }

    public final void onResume() throws Throwable {
        com.smartdigimkt.j7.b bVar = this.e0;
        if (bVar != null) {
            bVar.g();
        }
    }

    public final void release() {
        com.smartdigimkt.j7.b bVar = this.e0;
        if (bVar != null) {
            bVar.i();
        }
    }

    public GTCV2InnerCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l0 = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        this.m0 = 500L;
        a();
    }

    public GTCV2InnerCountDownView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l0 = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        this.m0 = 500L;
        a();
    }
}
