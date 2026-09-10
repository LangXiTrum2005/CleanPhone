package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smartdigimkt.b5.c;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseMediaATView extends FrameLayout {
    protected f e0;
    protected g f0;
    protected com.smartdigimkt.v6.a g0;
    protected c.AbstractC0445c h0;
    protected boolean i0;
    private int j0;
    private int k0;
    protected FrameLayout l0;
    protected CloseImageView m0;
    protected int n0;
    protected com.smartdigimkt.a6.a o0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseMediaATView baseMediaATView = BaseMediaATView.this;
            baseMediaATView.j0 = baseMediaATView.getMeasuredWidth();
            BaseMediaATView.this.a();
            BaseMediaATView.this.c();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.AbstractC0445c abstractC0445c = BaseMediaATView.this.h0;
            if (abstractC0445c != null) {
                abstractC0445c.a();
            }
        }
    }

    public BaseMediaATView(Context context) {
        super(context);
        this.j0 = 0;
        this.k0 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (getParent() != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = getMediaViewWidth();
            layoutParams.height = getMediaViewHeight();
            setLayoutParams(layoutParams);
            postInvalidate();
        }
    }

    public void changeCloseViewSizeAfterClick() {
        CloseImageView closeImageView = this.m0;
        if (closeImageView == null || this.f0 == null) {
            return;
        }
        a((com.smartdigimkt.l5.b) closeImageView, true);
    }

    public void destroy() {
    }

    public List<View> getClickViews() {
        return new ArrayList();
    }

    public List<View> getContainerClickViews() {
        return new ArrayList();
    }

    public int getMediaViewHeight() {
        return this.k0;
    }

    public int getMediaViewWidth() {
        return this.j0;
    }

    public View getMonitorClickView() {
        return null;
    }

    public void init(int i2, int i3, int i4) {
        this.j0 = i2;
        this.k0 = i3;
        this.n0 = i4;
        a();
        b();
        if (this.j0 == -1) {
            post(new a());
        }
    }

    private void b() {
        CloseImageView closeImageView = this.m0;
        if (closeImageView == null) {
            return;
        }
        if (this.i0) {
            closeImageView.setVisibility(0);
        } else {
            closeImageView.setVisibility(8);
        }
        a((com.smartdigimkt.l5.b) this.m0, false);
        this.m0.setOnClickListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int i2;
        if (this.k0 != -2 || (i2 = this.j0) <= 0) {
            return;
        }
        int i3 = this.n0;
        if (i3 != 1 && i3 != 2) {
            this.k0 = (int) (i2 * 0.75f);
        } else {
            this.k0 = (int) (i2 * 0.5f);
        }
    }

    public BaseMediaATView(Context context, f fVar, com.smartdigimkt.v6.a aVar, c.AbstractC0445c abstractC0445c) {
        super(context);
        this.j0 = 0;
        this.k0 = 0;
        this.e0 = fVar;
        g gVar = aVar.t;
        this.f0 = gVar;
        this.i0 = gVar.t0() == 0;
        this.h0 = abstractC0445c;
        this.g0 = aVar;
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "base_myoffer_media_ad_view", "layout"), this);
        this.l0 = (FrameLayout) findViewById(h.a(getContext(), "base_media_view_content", "id"));
        this.m0 = (CloseImageView) findViewById(h.a(getContext(), "base_media_ad_close", "id"));
    }

    private void a(com.smartdigimkt.l5.b bVar, boolean z2) {
        com.smartdigimkt.a6.b.a(bVar, z2, this.g0);
    }
}
