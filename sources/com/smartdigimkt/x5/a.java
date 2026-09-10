package com.smartdigimkt.x5;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: com.smartdigimkt.x5.a$a, reason: collision with other inner class name */
    public class C0639a implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f39929a;

        public C0639a(ImageView imageView) {
            this.f39929a = imageView;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = this.f39929a;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f39931a;

        public b(ImageView imageView) {
            this.f39931a = imageView;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = this.f39931a;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public class c implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f39933a;

        public c(ImageView imageView) {
            this.f39933a = imageView;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            ImageView imageView = this.f39933a;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    public void a(View view, int i2) {
        if (view != null) {
            Context context = view.getContext();
            if (view.getParent() == null || !(view.getParent() instanceof RelativeLayout)) {
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) view.getParent();
            ImageView imageView = new ImageView(context);
            imageView.setBackgroundResource(h.a(context, "myoffer_bg_ambience_border", k.d));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(6, view.getId());
            layoutParams.addRule(7, view.getId());
            layoutParams.addRule(8, view.getId());
            layoutParams.addRule(5, view.getId());
            int i3 = -h.a(context, 5.0f);
            layoutParams.topMargin = i3;
            layoutParams.rightMargin = i3;
            layoutParams.bottomMargin = i3;
            layoutParams.leftMargin = i3;
            relativeLayout.addView(imageView, 0, layoutParams);
            if (i2 == 1) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (((double) com.smartdigimkt.n8.c.j(context)) * 0.424d));
                layoutParams2.addRule(2, view.getId());
                layoutParams2.addRule(14);
                layoutParams2.bottomMargin = -h.a(context, 24.0f);
                relativeLayout.addView(imageView2, 0, layoutParams2);
                String strC = com.smartdigimkt.j5.a.a().c("am_wrapper_top");
                if (TextUtils.isEmpty(strC)) {
                    return;
                }
                com.google.firebase.crashlytics.internal.model.a.g().a(new e(3, strC), new C0639a(imageView2));
                return;
            }
            ImageView imageView3 = new ImageView(context);
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
            imageView3.setScaleType(scaleType);
            imageView3.setImageResource(h.a(context, "myoffer_ambience_left", k.d));
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(h.a(context, 140.0f), h.a(context, 330.0f));
            layoutParams3.addRule(0, view.getId());
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = -h.a(context, 42.0f);
            relativeLayout.addView(imageView3, 0, layoutParams3);
            String strC2 = com.smartdigimkt.j5.a.a().c("am_wrapper_left");
            if (!TextUtils.isEmpty(strC2)) {
                com.google.firebase.crashlytics.internal.model.a.g().a(new e(3, strC2), new b(imageView3));
            }
            ImageView imageView4 = new ImageView(context);
            imageView4.setScaleType(scaleType);
            imageView4.setImageResource(h.a(context, "myoffer_ambience_right", k.d));
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(h.a(context, 140.0f), h.a(context, 330.0f));
            layoutParams4.addRule(1, view.getId());
            layoutParams4.addRule(15);
            layoutParams4.leftMargin = -h.a(context, 42.0f);
            relativeLayout.addView(imageView4, 0, layoutParams4);
            String strC3 = com.smartdigimkt.j5.a.a().c("am_wrapper_right");
            if (TextUtils.isEmpty(strC3)) {
                return;
            }
            com.google.firebase.crashlytics.internal.model.a.g().a(new e(3, strC3), new c(imageView4));
        }
    }
}
