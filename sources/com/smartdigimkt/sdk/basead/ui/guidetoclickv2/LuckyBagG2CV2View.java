package com.smartdigimkt.sdk.basead.ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.SimpleGuideToClickView;

/* JADX INFO: loaded from: classes6.dex */
public class LuckyBagG2CV2View extends BaseLifecycleG2CV2View {
    SimpleGuideToClickView m0;
    ImageView n0;
    ImageView o0;
    View p0;

    public class a implements com.smartdigimkt.d7.b.f {
        public a() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = LuckyBagG2CV2View.this.n0;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f38514a;

        public b(ImageView imageView) {
            this.f38514a = imageView;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = this.f38514a;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Throwable {
            LuckyBagG2CV2View.this.removeAllViews();
            LuckyBagG2CV2View.this.d();
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
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LuckyBagG2CV2View.this.a();
        }
    }

    public LuckyBagG2CV2View(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseG2CV2View
    public void a(int i2, int i3) {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_g2c_v2_lucky_bag", "layout"), this);
        setBackgroundColor(Color.parseColor("#80000000"));
        this.o0 = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_close_iv", "id"));
        this.p0 = findViewById(h.a(getContext(), "myoffer_g2c_item_container", "id"));
        this.m0 = (SimpleGuideToClickView) findViewById(h.a(getContext(), "myoffer_g2c_item_g2c_fingerview", "id"));
        ImageView imageView = (ImageView) findViewById(h.a(getContext(), "myoffer_g2c_item_lucky_bag_icon", "id"));
        this.n0 = imageView;
        if (imageView != null) {
            String strC = com.smartdigimkt.j5.a.a().c("g2c_lucky_bag_v2");
            if (!TextUtils.isEmpty(strC)) {
                com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC), new a());
            }
        }
        SimpleGuideToClickView simpleGuideToClickView = this.m0;
        if (simpleGuideToClickView != null) {
            simpleGuideToClickView.init(h.a(getContext(), "myoffer_simple_guide_to_click", "layout"), h.a(getContext(), 4.0f), h.a(getContext(), 6.0f), h.a(getContext(), 8.0f), h.a(getContext(), 12.0f));
            ImageView imageView2 = (ImageView) this.m0.findViewById(h.a(getContext(), "myoffer_guide_to_click_finger", "id"));
            if (imageView2 != null) {
                String strC2 = com.smartdigimkt.j5.a.a().c("g2c_finger_icon_v2");
                if (!TextUtils.isEmpty(strC2)) {
                    com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC2), new b(imageView2));
                }
            }
        }
        this.p0.setOnClickListener(new c());
        setOnClickListener(new d());
        ImageView imageView3 = this.o0;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new e());
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.guidetoclickv2.BaseLifecycleG2CV2View
    public int getClickArea() {
        return 43;
    }
}
