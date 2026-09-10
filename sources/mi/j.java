package mi;

import android.os.Bundle;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46015b = X3.i.Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46016c = "/";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46017d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46018e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46019f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46020g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46021h = false;

    public j(String str) {
        this.f46014a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("cached_engine_group_id", this.f46014a);
        bundle.putString("dart_entrypoint", this.f46015b);
        bundle.putString("initial_route", this.f46016c);
        bundle.putBoolean("handle_deeplinking", this.f46017d);
        int i10 = this.f46018e;
        bundle.putString("flutterview_render_mode", i10 != 0 ? l1.d.s(i10) : "surface");
        int i11 = this.f46019f;
        bundle.putString("flutterview_transparency_mode", i11 != 0 ? l1.d.t(i11) : X3.i.T);
        bundle.putBoolean("should_attach_engine_to_activity", true);
        bundle.putBoolean("destroy_engine_with_fragment", true);
        bundle.putBoolean("should_automatically_handle_on_back_pressed", this.f46020g);
        bundle.putBoolean("should_delay_first_android_view_draw", this.f46021h);
        return bundle;
    }
}
