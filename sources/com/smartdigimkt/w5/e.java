package com.smartdigimkt.w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.smartdigimkt.sdk.basead.ui.GuideToClickView;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class e extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    GuideToClickView f39419i;
    boolean j = false;
    boolean k = false;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.a aVar = e.this.f39415h;
            if (aVar != null) {
                aVar.a(1, 12);
            }
        }
    }

    private void b() {
        GuideToClickView guideToClickView;
        if (this.f == null || (guideToClickView = this.f39419i) == null) {
            return;
        }
        com.smartdigimkt.j7.c.a(guideToClickView);
        this.f.addView(this.f39419i, new RelativeLayout.LayoutParams(-1, -1));
    }

    private void c() {
        GuideToClickView guideToClickView = this.f39419i;
        if (guideToClickView != null) {
            guideToClickView.setVisibility(8);
        }
    }

    @Override // com.smartdigimkt.w5.c
    public void a() {
    }

    @Override // com.smartdigimkt.w5.c
    public void a(Context context, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i2, c.a aVar2) {
        super.a(context, fVar, aVar, viewGroup, relativeLayout, view, i2, aVar2);
        GuideToClickView guideToClickView = new GuideToClickView(this.f39411a);
        this.f39419i = guideToClickView;
        guideToClickView.setOnClickListener(new a());
    }

    @Override // com.smartdigimkt.w5.c
    public void a(int i2, Map<String, Object> map) {
        if (i2 == 103) {
            if (a(map) || this.f39414e != 1 || this.j || !this.k || this.f39419i == null) {
                return;
            }
            b();
            return;
        }
        if (i2 == 113) {
            this.j = true;
            c();
            return;
        }
        if (i2 != 116) {
            switch (i2) {
                case 106:
                    if (this.f39414e == 3 && com.smartdigimkt.m3.i.c(this.f39412b)) {
                        b();
                        break;
                    }
                    break;
                case 107:
                case 108:
                    this.k = true;
                    break;
            }
            return;
        }
        if (this.f39414e != 3 || com.smartdigimkt.m3.i.c(this.f39412b)) {
            return;
        }
        b();
    }
}
