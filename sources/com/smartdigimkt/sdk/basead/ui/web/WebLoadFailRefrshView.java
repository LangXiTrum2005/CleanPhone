package com.smartdigimkt.sdk.basead.ui.web;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class WebLoadFailRefrshView extends LinearLayout {
    private View.OnClickListener e0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (WebLoadFailRefrshView.this.e0 != null) {
                WebLoadFailRefrshView.this.e0.onClick(view);
            }
        }
    }

    public WebLoadFailRefrshView(Context context) {
        super(context);
        a();
    }

    public void setOnRefreshListener(View.OnClickListener onClickListener) {
        this.e0 = onClickListener;
    }

    private void a() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "web_load_fail_refresh", "layout"), this);
        setOrientation(1);
        setGravity(17);
        findViewById(h.a(getContext(), "web_load_fail_refresh", "id")).setOnClickListener(new a());
    }
}
