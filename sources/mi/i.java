package mi;

import android.os.Bundle;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f46005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f46008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ni.k f46009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f46012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f46013k;

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("initial_route", this.f46006d);
        bundle.putBoolean("handle_deeplinking", this.f46007e);
        bundle.putString("app_bundle_path", this.f46008f);
        bundle.putString("dart_entrypoint", this.f46003a);
        bundle.putString("dart_entrypoint_uri", this.f46004b);
        bundle.putStringArrayList("dart_entrypoint_args", this.f46005c != null ? new ArrayList<>(this.f46005c) : null);
        ni.k kVar = this.f46009g;
        if (kVar != null) {
            HashSet hashSet = kVar.f46767a;
            bundle.putStringArray("initialization_args", (String[]) hashSet.toArray(new String[hashSet.size()]));
        }
        int i10 = this.f46010h;
        bundle.putString("flutterview_render_mode", i10 != 0 ? l1.d.s(i10) : "surface");
        int i11 = this.f46011i;
        bundle.putString("flutterview_transparency_mode", i11 != 0 ? l1.d.t(i11) : X3.i.T);
        bundle.putBoolean("should_attach_engine_to_activity", true);
        bundle.putBoolean("destroy_engine_with_fragment", true);
        bundle.putBoolean("should_automatically_handle_on_back_pressed", this.f46012j);
        bundle.putBoolean("should_delay_first_android_view_draw", this.f46013k);
        return bundle;
    }
}
