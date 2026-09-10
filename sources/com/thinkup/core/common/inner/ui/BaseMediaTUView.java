package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.ooo.o00;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseMediaTUView extends FrameLayout {
    protected oon m;
    protected int m0;
    private int mm;
    private int mn;
    protected com.thinkup.core.common.inner.ui.oo.o mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected oom f41836n;
    protected ooo o;
    protected o o0;
    protected FrameLayout om;
    protected CloseImageView on;
    protected boolean oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.inner.ui.BaseMediaTUView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            o oVar = BaseMediaTUView.this.o0;
            if (oVar != null) {
                oVar.o();
            }
        }
    }

    public interface o {
        void o();
    }

    public BaseMediaTUView(Context context) {
        super(context);
        this.mm = 0;
        this.mn = 0;
    }

    private void m() {
        CloseImageView closeImageView = this.on;
        if (closeImageView == null) {
            return;
        }
        if (this.oo) {
            closeImageView.setVisibility(0);
        } else {
            closeImageView.setVisibility(8);
        }
        this.on.setOnClickListener(new AnonymousClass1());
    }

    private void o() {
        if (this.mn <= 0) {
            int i2 = this.m0;
            if (i2 == 1 || i2 == 2) {
                this.mn = (int) (this.mm * 0.5f);
            } else {
                this.mn = (int) (this.mm * 0.75f);
            }
        }
    }

    public void destroy() {
    }

    public List<View> getClickViews() {
        return new ArrayList();
    }

    public int getMediaViewHeight() {
        return this.mn;
    }

    public int getMediaViewWidth() {
        return this.mm;
    }

    public void init(int i2, int i3, int i4) {
        this.mm = i2;
        this.mn = i3;
        this.m0 = i4;
        if (i3 <= 0) {
            if (i4 == 1 || i4 == 2) {
                this.mn = (int) (i2 * 0.5f);
            } else {
                this.mn = (int) (i2 * 0.75f);
            }
        }
        CloseImageView closeImageView = this.on;
        if (closeImageView != null) {
            if (this.oo) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
            this.on.setOnClickListener(new AnonymousClass1());
        }
    }

    public BaseMediaTUView(Context context, ooo oooVar, oom oomVar, boolean z2, o oVar) {
        super(context);
        this.mm = 0;
        this.mn = 0;
        this.o = oooVar;
        this.m = oomVar.oo0;
        this.oo = z2;
        this.o0 = oVar;
        this.f41836n = oomVar;
        LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "base_myoffer_media_ad_view", "layout"), this);
        this.om = (FrameLayout) findViewById(o00.o(getContext(), "base_media_view_content", "id"));
        this.on = (CloseImageView) findViewById(o00.o(getContext(), "base_media_ad_close", "id"));
    }
}
