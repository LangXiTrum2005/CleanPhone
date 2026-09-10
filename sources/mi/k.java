package mi;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class k extends Fragment implements d, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f46022e = View.generateViewId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f46024b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f46023a = new h(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f46025c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.u f46026d = new f.u(this, 1);

    public k() {
        setArguments(new Bundle());
    }

    @Override // mi.d
    public final String A() {
        return getArguments().getString("dart_entrypoint_uri");
    }

    @Override // mi.d
    public final i3.f B(Activity activity, ni.c cVar) {
        if (activity != null) {
            return new i3.f(getActivity(), cVar.l, this);
        }
        return null;
    }

    public final boolean D(String str) {
        e eVar = this.f46024b;
        if (eVar == null) {
            Log.w("FlutterFragment", "FlutterFragment " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (eVar.f45992j) {
            return true;
        }
        Log.w("FlutterFragment", "FlutterFragment " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // mi.d, mi.f
    public final void a(ni.c cVar) {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof f) {
            ((f) activity).a(cVar);
        }
    }

    @Override // mi.d, mi.g
    public final ni.c b() {
        LayoutInflater.Factory activity = getActivity();
        if (!(activity instanceof g)) {
            return null;
        }
        getContext();
        return ((g) activity).b();
    }

    @Override // mi.d
    public final void c() {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof io.flutter.embedding.engine.renderer.i) {
            ((io.flutter.embedding.engine.renderer.i) activity).c();
        }
    }

    @Override // mi.d
    public final void d() {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof io.flutter.embedding.engine.renderer.i) {
            ((io.flutter.embedding.engine.renderer.i) activity).d();
        }
    }

    @Override // mi.d, mi.f
    public final void e(ni.c cVar) {
        LayoutInflater.Factory activity = getActivity();
        if (activity instanceof f) {
            ((f) activity).e(cVar);
        }
    }

    @Override // mi.d
    public final List f() {
        return getArguments().getStringArrayList("dart_entrypoint_args");
    }

    @Override // mi.d
    public final String h() {
        return getArguments().getString("cached_engine_id", null);
    }

    @Override // mi.d
    public final boolean i() {
        if (getArguments().containsKey("enable_state_restoration")) {
            return getArguments().getBoolean("enable_state_restoration");
        }
        return h() == null;
    }

    @Override // mi.d
    public final void k() {
        Log.w("FlutterFragment", "FlutterFragment " + this + " connection to the engine " + this.f46024b.f45984b + " evicted by another attaching activity");
        e eVar = this.f46024b;
        if (eVar != null) {
            eVar.h();
            this.f46024b.i();
        }
    }

    @Override // mi.d
    public final String l() {
        return getArguments().getString("initial_route");
    }

    @Override // mi.d
    public final String m() {
        return getArguments().getString("app_bundle_path");
    }

    @Override // mi.d
    public final ni.k n() {
        String[] stringArray = getArguments().getStringArray("initialization_args");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        ni.k kVar = new ni.k();
        kVar.f46767a = new HashSet(Arrays.asList(stringArray));
        return kVar;
    }

    @Override // mi.d
    public final int o() {
        String string = getArguments().getString("flutterview_render_mode", "surface");
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("surface")) {
            return 1;
        }
        if (string.equals("texture")) {
            return 2;
        }
        if (string.equals("image")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.RenderMode.".concat(string));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (D("onActivityResult")) {
            this.f46024b.e(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f46025c.getClass();
        e eVar = new e(this);
        this.f46024b = eVar;
        eVar.f();
        if (getArguments().getBoolean("should_automatically_handle_on_back_pressed", false)) {
            f.t onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
            f.u uVar = this.f46026d;
            onBackPressedDispatcher.a(this, uVar);
            uVar.e(false);
        }
        context.registerComponentCallbacks(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f46026d.e(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        this.f46024b.m(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f46024b.g(f46022e, getArguments().getBoolean("should_delay_first_android_view_draw"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        requireView().getViewTreeObserver().removeOnWindowFocusChangeListener(this.f46023a);
        if (D("onDestroyView")) {
            this.f46024b.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        getContext().unregisterComponentCallbacks(this);
        super.onDetach();
        e eVar = this.f46024b;
        if (eVar == null) {
            toString();
            return;
        }
        eVar.i();
        e eVar2 = this.f46024b;
        eVar2.f45983a = null;
        eVar2.f45984b = null;
        eVar2.f45985c = null;
        eVar2.f45986d = null;
        eVar2.f45987e = null;
        this.f46024b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (D(X3.i.t0)) {
            e eVar = this.f46024b;
            eVar.c();
            eVar.f45983a.getClass();
            ni.c cVar = eVar.f45984b;
            if (cVar != null) {
                b2.l lVar = cVar.f46743g;
                lVar.e(3, lVar.f5319c);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (D("onRequestPermissionsResult")) {
            this.f46024b.l(i10, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (D(X3.i.f27817u0)) {
            this.f46024b.n();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (D("onSaveInstanceState")) {
            this.f46024b.o(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (D("onStart")) {
            this.f46024b.p();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (D("onStop")) {
            this.f46024b.q();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (D("onTrimMemory")) {
            this.f46024b.r(i10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f46023a);
    }

    @Override // mi.d
    public final bj.a p(Activity activity, ni.c cVar) {
        if (activity != null) {
            return new bj.a(f46022e, activity, cVar.f46749n);
        }
        return null;
    }

    @Override // mi.d
    public final int q() {
        String string = getArguments().getString("flutterview_transparency_mode", X3.i.T);
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("opaque")) {
            return 1;
        }
        if (string.equals(X3.i.T)) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.TransparencyMode.".concat(string));
    }

    @Override // mi.d
    public final boolean r() {
        FragmentActivity activity;
        if (!getArguments().getBoolean("should_automatically_handle_on_back_pressed", false) || (activity = getActivity()) == null) {
            return false;
        }
        f.u uVar = this.f46026d;
        boolean z10 = uVar.f40242b;
        if (z10) {
            uVar.e(false);
        }
        activity.getOnBackPressedDispatcher().b().a();
        if (z10) {
            uVar.e(true);
        }
        return true;
    }

    @Override // mi.d
    public final String s() {
        return getArguments().getString("dart_entrypoint", X3.i.Z);
    }

    @Override // mi.d
    public final boolean t() {
        return getArguments().getBoolean("handle_deeplinking");
    }

    @Override // mi.d
    public final boolean v() {
        return this.f46026d.f40242b;
    }

    @Override // mi.d
    public final void w(boolean z10) {
        if (getArguments().getBoolean("should_automatically_handle_on_back_pressed", false)) {
            this.f46026d.e(z10);
        }
    }

    @Override // mi.d
    public final String x() {
        return getArguments().getString("cached_engine_group_id", null);
    }

    @Override // mi.d
    public final boolean y() {
        return getArguments().getBoolean("should_attach_engine_to_activity");
    }

    @Override // mi.d
    public final boolean z() {
        return (h() != null || this.f46024b.f45989g) ? getArguments().getBoolean("destroy_engine_with_fragment", false) : getArguments().getBoolean("destroy_engine_with_fragment", true);
    }
}
