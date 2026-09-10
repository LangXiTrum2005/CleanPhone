package com.smartdigimkt.h5;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.sdk.api.IOfferClickHandler;
import com.smartdigimkt.v3.l;
import com.smartdigimkt.w5.i;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e extends com.smartdigimkt.h5.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f35672i;
    com.smartdigimkt.f5.a j;
    com.smartdigimkt.k7.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    com.smartdigimkt.m3.g f35673l;
    View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    volatile boolean f35674n;
    View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View.OnClickListener f35675p;
    View.OnClickListener q;
    com.smartdigimkt.w5.a r;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.a(view, false);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.a(view, true);
        }
    }

    public class c implements com.smartdigimkt.m3.g.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f35677b;

        public c(int i2, int i3) {
            this.f35676a = i2;
            this.f35677b = i3;
        }

        @Override // com.smartdigimkt.m3.g.d
        public void clickCallback() {
            com.smartdigimkt.f5.a aVar = e.this.j;
            if (aVar != null) {
                aVar.onAdClick(new j().a(this.f35676a, this.f35677b));
            }
        }

        @Override // com.smartdigimkt.m3.g.d
        public void clickEndUI() {
            i.a().d();
        }

        @Override // com.smartdigimkt.m3.g.d
        public void clickStartUI() {
        }

        @Override // com.smartdigimkt.m3.g.d
        public void deeplinkCallback(boolean z2) {
            com.smartdigimkt.f5.a aVar = e.this.j;
            if (aVar != null) {
                aVar.onDeeplinkCallback(z2);
            }
        }

        @Override // com.smartdigimkt.m3.g.d
        public boolean openInternalWebView(String str, IOfferClickHandler iOfferClickHandler) {
            return false;
        }
    }

    public class d extends com.smartdigimkt.k7.a {
        public d() {
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public void recordImpression(View view) {
            e.this.w();
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.h5.e$e, reason: collision with other inner class name */
    public class C0502e implements com.smartdigimkt.w5.c.a {
        public C0502e() {
        }

        @Override // com.smartdigimkt.w5.c.a
        public void a(int i2, int i3) {
            e.this.a((View) null, i2, i3);
        }
    }

    public class f extends com.smartdigimkt.w5.a {
        public f(ViewGroup viewGroup, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2, com.smartdigimkt.w5.c.a aVar2) {
            super(viewGroup, fVar, aVar, i2, aVar2);
        }

        @Override // com.smartdigimkt.w5.a
        public ViewGroup.LayoutParams d() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (e.this.m != null) {
                layoutParams.gravity = 81;
                layoutParams.setMargins(0, 0, 0, 0);
            }
            return layoutParams;
        }
    }

    public e(Context context, com.smartdigimkt.v6.a aVar, String str, boolean z2) {
        super(context, aVar, str, z2);
        this.f35672i = getClass().getSimpleName();
        this.f35675p = new a();
        this.q = new b();
    }

    private void v() {
        com.smartdigimkt.z6.a aVar;
        com.smartdigimkt.v6.a aVar2;
        View view = this.m;
        if (view == null || !(view instanceof ViewGroup) || (aVar = this.f) == null || (aVar2 = this.f35665c) == null) {
            return;
        }
        this.r = new f((ViewGroup) view, aVar, aVar2, 5, new C0502e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.f35674n) {
            return;
        }
        a(114);
        this.f35674n = true;
        com.smartdigimkt.i5.b.a(this.f35664b).d(this.f);
        com.smartdigimkt.m3.f.a(8, this.f, new l(this.f35665c, ""));
        com.smartdigimkt.f5.a aVar = this.j;
        if (aVar != null) {
            aVar.onAdShow(new j());
        }
    }

    @Override // com.smartdigimkt.h5.a
    public void a(Activity activity) {
    }

    public void h() {
        x();
        a(112);
        this.j = null;
        com.smartdigimkt.m3.g gVar = this.f35673l;
        if (gVar != null) {
            gVar.a();
            this.f35673l = null;
        }
        com.smartdigimkt.k7.c cVar = this.k;
        if (cVar != null) {
            cVar.b();
            this.k = null;
        }
    }

    public String i() {
        com.smartdigimkt.z6.a aVar = this.f;
        return aVar != null ? aVar.c() : "";
    }

    public int j() {
        com.smartdigimkt.z6.a aVar = this.f;
        if (aVar != null) {
            return aVar.D();
        }
        return 0;
    }

    public int k() {
        com.smartdigimkt.z6.a aVar = this.f;
        if (aVar != null) {
            return aVar.F();
        }
        return 0;
    }

    public String l() {
        com.smartdigimkt.z6.a aVar = this.f;
        return aVar != null ? aVar.n() : "";
    }

    public String m() {
        com.smartdigimkt.z6.a aVar = this.f;
        return aVar != null ? aVar.r() : "";
    }

    public int n() {
        com.smartdigimkt.z6.a aVar = this.f;
        if (aVar != null) {
            return aVar.g();
        }
        return 0;
    }

    public String o() {
        com.smartdigimkt.z6.a aVar = this.f;
        return aVar != null ? aVar.w() : "";
    }

    public int p() {
        com.smartdigimkt.z6.a aVar = this.f;
        if (aVar != null) {
            return aVar.j();
        }
        return 0;
    }

    public int q() {
        com.smartdigimkt.z6.a aVar = this.f;
        if (aVar != null) {
            return aVar.D();
        }
        return 0;
    }

    public String r() {
        com.smartdigimkt.z6.a aVar = this.f;
        return aVar != null ? aVar.s() : "";
    }

    public int s() {
        com.smartdigimkt.z6.a aVar = this.f;
        if (aVar != null) {
            return aVar.F();
        }
        return 0;
    }

    public View t() {
        return null;
    }

    public String u() {
        com.smartdigimkt.z6.a aVar = this.f;
        return aVar != null ? aVar.g0() : "";
    }

    public void x() {
        com.smartdigimkt.k7.c cVar = this.k;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void a(View view, boolean z2) {
        View view2 = this.o;
        if (view2 != null && view == view2) {
            a(view, 1, 1, z2);
            return;
        }
        View view3 = this.m;
        if (view3 != null && view == view3) {
            a(view, 1, 3, z2);
        } else {
            a(view, 1, 2, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, int i2, int i3) {
        a(view, i2, i3, false);
    }

    private void a(View view, int i2, int i3, boolean z2) {
        w();
        if (this.f35673l == null) {
            this.f35673l = new com.smartdigimkt.m3.g(this.f35664b, this.f35665c, this.f, this.m);
        }
        if (this.f35673l.d()) {
            return;
        }
        this.f35673l.a(new c(i2, i3));
        l lVar = new l(this.f35665c, "");
        if (z2) {
            lVar.m = true;
        }
        this.f35673l.a(lVar);
        a(113);
    }

    private void a(View view, View[] viewArr) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                a(viewGroup.getChildAt(i2), viewArr);
            }
            return;
        }
        if ((view instanceof Button) || (view instanceof TextView)) {
            String string = ((TextView) view).getText().toString();
            if (TextUtils.isEmpty(string) || !TextUtils.equals(string, l())) {
                return;
            }
            viewArr[0] = view;
        }
    }

    public void a(com.smartdigimkt.f5.a aVar) {
        this.j = aVar;
    }

    public void a(View view, List<View> list, List<View> list2) {
        a(view);
        if (list != null && list.size() > 0) {
            View[] viewArr = new View[1];
            a(view, viewArr);
            View view2 = viewArr[0];
            if (view2 != null) {
                this.o = view2;
            }
            for (View view3 : list) {
                if (view3 != null) {
                    view3.setOnClickListener(this.f35675p);
                }
            }
        } else {
            a(view, this.f35675p);
        }
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        for (View view4 : list2) {
            if (view4 != null) {
                view4.setOnClickListener(this.q);
            }
        }
    }

    private void a(View view, View.OnClickListener onClickListener) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                a(viewGroup.getChildAt(i2), onClickListener);
            }
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    private void a(View view) {
        this.m = view;
        v();
        d dVar = new d();
        if (this.k == null) {
            this.k = new com.smartdigimkt.k7.c(1, view.getContext());
        }
        this.k.a(view, dVar);
    }

    private void a(int i2) {
        com.smartdigimkt.w5.a aVar = this.r;
        if (aVar != null) {
            aVar.a(i2);
        }
    }
}
