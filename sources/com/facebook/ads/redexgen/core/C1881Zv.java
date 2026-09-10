package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1881Zv extends LinearLayout {
    public static final int A03 = (int) (XX.A02 * 40.0f);
    public static final int A04 = (int) (XX.A02 * 20.0f);
    public static final int A05 = (int) (XX.A02 * 10.0f);
    public final C1594Ok A00;
    public final C2300gi A01;
    public final InterfaceC1865Zf A02;

    public C1881Zv(C2300gi c2300gi, C1594Ok c1594Ok, InterfaceC1865Zf interfaceC1865Zf, YM ym) {
        this(c2300gi, c1594Ok, interfaceC1865Zf, null, ym);
    }

    public C1881Zv(C2300gi c2300gi, C1594Ok c1594Ok, InterfaceC1865Zf interfaceC1865Zf, String str, YM ym) {
        super(c2300gi);
        this.A01 = c2300gi;
        this.A00 = c1594Ok;
        this.A02 = interfaceC1865Zf;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            YB.A0N(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View viewA00 = A00(ym, this.A00.A03());
            viewA00.setPadding(0, A05, 0, A05);
            addView(viewA00, layoutParams);
        }
        C1887a1 c1887a1A03 = A03();
        c1887a1A03.setPadding(0, A05, 0, 0);
        addView(c1887a1A03, layoutParams);
    }

    private View A00(YM ym, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(YN.A01(ym));
        TextView textView = new TextView(getContext());
        YB.A0a(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(YN.A01(YM.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new ViewOnClickListenerC1879Zt(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        YB.A0a(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private C1887a1 A03() {
        C1887a1 c1887a1 = new C1887a1(this.A01);
        for (C1594Ok c1594Ok : this.A00.A05()) {
            C1867Zh c1867Zh = new C1867Zh(this.A01);
            c1867Zh.setData(c1594Ok.A04(), null);
            c1867Zh.setOnClickListener(new ViewOnClickListenerC1880Zu(this, c1867Zh, c1594Ok));
            c1887a1.addView(c1867Zh);
        }
        return c1887a1;
    }
}
