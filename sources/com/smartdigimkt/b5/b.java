package com.smartdigimkt.b5;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener;
import com.smartdigimkt.sdk.basead.ui.OwnNativeATView;
import com.smartdigimkt.sdk.basead.ui.SimpleMediaATView;
import com.smartdigimkt.sdk.basead.ui.SimplePlayerMediaView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w5.g;
import com.smartdigimkt.w6.l;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b extends com.smartdigimkt.b5.a {
    FrameLayout H;

    public class a implements View.OnClickListener {
        final /* synthetic */ Context X;

        /* JADX INFO: renamed from: com.smartdigimkt.b5.b$a$a, reason: collision with other inner class name */
        public class C0444a implements com.smartdigimkt.k3.d.a {
            public C0444a() {
            }

            @Override // com.smartdigimkt.k3.d.a
            public void a() {
            }

            @Override // com.smartdigimkt.k3.d.a
            public void b() {
            }
        }

        public a(Context context) {
            this.X = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.k3.d dVar = new com.smartdigimkt.k3.d();
            Context context = this.X;
            b bVar = b.this;
            dVar.a(context, bVar.f33956c, bVar.d, new C0444a());
        }
    }

    public b(Context context, l lVar, com.smartdigimkt.v6.a aVar, boolean z2) {
        super(context, lVar, aVar, z2);
    }

    private void a(View view, View[] viewArr) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                a(viewGroup.getChildAt(i2), viewArr);
            }
            return;
        }
        if ((view instanceof TextView) && TextUtils.equals(((TextView) view).getText().toString(), this.f33956c.n())) {
            viewArr[0] = view;
        }
    }

    @Override // com.smartdigimkt.b5.a
    public View d() {
        View[] viewArr = new View[1];
        a(this.s, viewArr);
        if (viewArr[0] == null) {
            return this.s;
        }
        this.t = new WeakReference<>(viewArr[0]);
        return viewArr[0];
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public View generateShakeViewContainer() {
        if (!i.a(this.d)) {
            return null;
        }
        if (this.H == null) {
            FrameLayout frameLayout = new FrameLayout(this.f33955b.getApplicationContext());
            this.H = frameLayout;
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            this.f33932B.put(g.a.f39427b, this.H);
        }
        return this.H;
    }

    @Override // com.smartdigimkt.y4.a
    public ViewGroup getCustomAdContainer() {
        OwnNativeATView ownNativeATViewE = e();
        this.s = ownNativeATViewE;
        return ownNativeATViewE;
    }

    @Override // com.smartdigimkt.y4.a
    public View getMediaView(Context context, SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener) {
        com.smartdigimkt.w6.g gVar;
        if (this.f33959i == 1 && !TextUtils.isEmpty(this.f33956c.k0())) {
            SimplePlayerMediaView simplePlayerMediaView = new SimplePlayerMediaView(context);
            a(simplePlayerMediaView, sDMNativeAdMediaViewListener);
            return simplePlayerMediaView;
        }
        if (TextUtils.isEmpty(this.f33956c.s())) {
            return null;
        }
        SimpleMediaATView simpleMediaATView = new SimpleMediaATView(context);
        simpleMediaATView.initView(this.f33956c);
        com.smartdigimkt.v6.a aVar = this.d;
        if (aVar != null && (gVar = aVar.t) != null && gVar.T() != 1) {
            simpleMediaATView.setOnClickListener(this.f33934F);
        }
        return simpleMediaATView;
    }

    @Override // com.smartdigimkt.b5.a, com.smartdigimkt.y4.a
    public void registerAdView(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2) {
        l lVar;
        Context context;
        super.registerAdView(view, list, list2, layoutParams, view2);
        if (this.s == null || (lVar = this.f33956c) == null || this.d == null || TextUtils.isEmpty(lVar.z()) || (context = this.s.getContext()) == null) {
            return;
        }
        ImageView imageView = new ImageView(context);
        int iA = h.a(context, 5.0f);
        int iA2 = h.a(context, 24.0f);
        int iA3 = h.a(context, 4.0f);
        imageView.setPadding(iA, iA, iA, iA);
        imageView.setBackgroundResource(h.a(context, "myoffer_bg_feedback_button", k.d));
        imageView.setImageResource(h.a(context, "myoffer_feedback_icon", k.d));
        if (layoutParams != null) {
            layoutParams.width = iA2;
            layoutParams.height = iA2;
        } else {
            layoutParams = new FrameLayout.LayoutParams(iA2, iA2);
            layoutParams.gravity = 83;
            layoutParams.bottomMargin = iA3;
            layoutParams.leftMargin = iA3;
        }
        imageView.setOnClickListener(new a(context));
        this.s.addView(imageView, layoutParams);
    }
}
