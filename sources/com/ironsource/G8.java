package com.ironsource;

import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class G8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C8 f26136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f26137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f26138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f26139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f26140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f26141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f26142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f26143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f26144i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(b bVar);

        void a(Gg gg2);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        Title("title"),
        Advertiser(X3.i.F0),
        Body("body"),
        Cta(X3.i.G0),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(X3.i.J0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26153a;

        b(String str) {
            this.f26153a = str;
        }

        public final String b() {
            return this.f26153a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements C8.a {
        public c() {
        }

        @Override // com.ironsource.C8.a
        public void a(Gg viewVisibilityParams) {
            kotlin.jvm.internal.n.f(viewVisibilityParams, "viewVisibilityParams");
            a aVarN = G8.this.n();
            if (aVarN != null) {
                aVarN.a(viewVisibilityParams);
            }
        }
    }

    public G8(C8 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        kotlin.jvm.internal.n.f(containerView, "containerView");
        kotlin.jvm.internal.n.f(privacyIconView, "privacyIconView");
        this.f26136a = containerView;
        this.f26137b = view;
        this.f26138c = view2;
        this.f26139d = view3;
        this.f26140e = view4;
        this.f26141f = view5;
        this.f26142g = view6;
        this.f26143h = privacyIconView;
        r();
        s();
    }

    private final void r() {
        a(this, this.f26137b, b.Title);
        a(this, this.f26138c, b.Advertiser);
        a(this, this.f26140e, b.Body);
        a(this, this.f26142g, b.Cta);
        a(this, this.f26139d, b.Icon);
        a(this, this.f26136a, b.Container);
        a(this, this.f26143h, b.PrivacyIcon);
    }

    private final void s() {
        this.f26136a.setListener$mediationsdk_release(new c());
    }

    public final C8 a() {
        return this.f26136a;
    }

    public final View c() {
        return this.f26138c;
    }

    public final View d() {
        return this.f26139d;
    }

    public final View e() {
        return this.f26140e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G8)) {
            return false;
        }
        G8 g10 = (G8) obj;
        return kotlin.jvm.internal.n.a(this.f26136a, g10.f26136a) && kotlin.jvm.internal.n.a(this.f26137b, g10.f26137b) && kotlin.jvm.internal.n.a(this.f26138c, g10.f26138c) && kotlin.jvm.internal.n.a(this.f26139d, g10.f26139d) && kotlin.jvm.internal.n.a(this.f26140e, g10.f26140e) && kotlin.jvm.internal.n.a(this.f26141f, g10.f26141f) && kotlin.jvm.internal.n.a(this.f26142g, g10.f26142g) && kotlin.jvm.internal.n.a(this.f26143h, g10.f26143h);
    }

    public final View f() {
        return this.f26141f;
    }

    public final View g() {
        return this.f26142g;
    }

    public final View h() {
        return this.f26143h;
    }

    public int hashCode() {
        int iHashCode = this.f26136a.hashCode() * 31;
        View view = this.f26137b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f26138c;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f26139d;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f26140e;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f26141f;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f26142g;
        return this.f26143h.hashCode() + ((iHashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31);
    }

    public final View i() {
        return this.f26138c;
    }

    public final View j() {
        return this.f26140e;
    }

    public final C8 k() {
        return this.f26136a;
    }

    public final View l() {
        return this.f26142g;
    }

    public final View m() {
        return this.f26139d;
    }

    public final a n() {
        return this.f26144i;
    }

    public final View o() {
        return this.f26141f;
    }

    public final View p() {
        return this.f26143h;
    }

    public final View q() {
        return this.f26137b;
    }

    public final JSONObject t() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("title", this.f26137b != null).put(X3.i.F0, this.f26138c != null).put("body", this.f26140e != null).put(X3.i.G0, this.f26142g != null).put(X3.i.I0, this.f26141f != null).put("icon", this.f26139d != null);
        kotlin.jvm.internal.n.e(jSONObjectPut, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return jSONObjectPut;
    }

    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f26136a + ", titleView=" + this.f26137b + ", advertiserView=" + this.f26138c + ", iconView=" + this.f26139d + ", bodyView=" + this.f26140e + ", mediaView=" + this.f26141f + ", ctaView=" + this.f26142g + ", privacyIconView=" + this.f26143h + ")";
    }

    public final G8 a(C8 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        kotlin.jvm.internal.n.f(containerView, "containerView");
        kotlin.jvm.internal.n.f(privacyIconView, "privacyIconView");
        return new G8(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    public final View b() {
        return this.f26137b;
    }

    public final void c(View view) {
        this.f26142g = view;
    }

    public final void d(View view) {
        this.f26139d = view;
    }

    public final void e(View view) {
        this.f26141f = view;
    }

    public final void f(View view) {
        kotlin.jvm.internal.n.f(view, "<set-?>");
        this.f26143h = view;
    }

    public final void g(View view) {
        this.f26137b = view;
    }

    public static /* synthetic */ G8 a(G8 g10, C8 c10, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c10 = g10.f26136a;
        }
        if ((i10 & 2) != 0) {
            view = g10.f26137b;
        }
        if ((i10 & 4) != 0) {
            view2 = g10.f26138c;
        }
        if ((i10 & 8) != 0) {
            view3 = g10.f26139d;
        }
        if ((i10 & 16) != 0) {
            view4 = g10.f26140e;
        }
        if ((i10 & 32) != 0) {
            view5 = g10.f26141f;
        }
        if ((i10 & 64) != 0) {
            view6 = g10.f26142g;
        }
        if ((i10 & 128) != 0) {
            view7 = g10.f26143h;
        }
        View view8 = view6;
        View view9 = view7;
        View view10 = view4;
        View view11 = view5;
        return g10.a(c10, view, view2, view3, view10, view11, view8, view9);
    }

    public final void b(View view) {
        this.f26140e = view;
    }

    public final void a(C8 c10) {
        kotlin.jvm.internal.n.f(c10, "<set-?>");
        this.f26136a = c10;
    }

    public final void a(View view) {
        this.f26138c = view;
    }

    public final void a(a aVar) {
        this.f26144i = aVar;
    }

    private static final void a(final G8 g10, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.sh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    G8.a(this.f30704a, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(G8 this$0, b viewName, View view) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(viewName, "$viewName");
        a aVar = this$0.f26144i;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }

    public /* synthetic */ G8(C8 c10, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i10, kotlin.jvm.internal.g gVar) {
        this(c10, (i10 & 2) != 0 ? null : view, (i10 & 4) != 0 ? null : view2, (i10 & 8) != 0 ? null : view3, (i10 & 16) != 0 ? null : view4, (i10 & 32) != 0 ? null : view5, (i10 & 64) != 0 ? null : view6, view7);
    }
}
