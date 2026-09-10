package com.thinkup.core.basead.ui.web;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class WebLoadFailRefrshView extends LinearLayout {
    private View.OnClickListener o;

    /* JADX INFO: renamed from: com.thinkup.core.basead.ui.web.WebLoadFailRefrshView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WebLoadFailRefrshView.this.o != null) {
                WebLoadFailRefrshView.this.o.onClick(view);
            }
        }
    }

    public WebLoadFailRefrshView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "web_load_fail_refresh", "layout"), this);
        setOrientation(1);
        setGravity(17);
        findViewById(o00.o(getContext(), "web_load_fail_refresh", "id")).setOnClickListener(new AnonymousClass1());
    }

    public void setOnRefreshListener(View.OnClickListener onClickListener) {
        this.o = onClickListener;
    }

    private void o() {
        LayoutInflater.from(getContext()).inflate(o00.o(getContext(), "web_load_fail_refresh", "layout"), this);
        setOrientation(1);
        setGravity(17);
        findViewById(o00.o(getContext(), "web_load_fail_refresh", "id")).setOnClickListener(new AnonymousClass1());
    }
}
