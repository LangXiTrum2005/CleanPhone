package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class w extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f4487a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4496j;
    public Dialog l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4500o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f4488b = new s(this, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f4489c = new t(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f4490d = new u(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4491e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4492f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4493g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4494h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4495i = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c0 f4497k = new c0(this, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4501p = false;

    public final void D(boolean z10) {
        if (this.f4499n) {
            return;
        }
        this.f4499n = true;
        this.f4500o = false;
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.l.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.f4487a.getLooper()) {
                    onDismiss(this.l);
                } else {
                    this.f4487a.post(this.f4488b);
                }
            }
        }
        this.f4498m = true;
        if (this.f4495i < 0) {
            g1 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            a aVar = new a(parentFragmentManager);
            aVar.f4239o = true;
            aVar.i(this);
            aVar.f(true, true);
            return;
        }
        g1 parentFragmentManager2 = getParentFragmentManager();
        int i10 = this.f4495i;
        parentFragmentManager2.getClass();
        if (i10 < 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "Bad id: "));
        }
        parentFragmentManager2.x(new e1(parentFragmentManager2, i10), true);
        this.f4495i = -1;
    }

    public Dialog E(Bundle bundle) {
        if (g1.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new f.l(requireContext(), this.f4492f);
    }

    public void F(g1 g1Var, String str) {
        this.f4499n = false;
        this.f4500o = true;
        g1Var.getClass();
        a aVar = new a(g1Var);
        aVar.f4239o = true;
        aVar.g(0, this, str);
        aVar.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final o0 createFragmentContainer() {
        return new v(this, super.createFragmentContainer());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().e(this.f4497k);
        if (this.f4500o) {
            return;
        }
        this.f4499n = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4487a = new Handler();
        this.f4494h = this.mContainerId == 0;
        if (bundle != null) {
            this.f4491e = bundle.getInt("android:style", 0);
            this.f4492f = bundle.getInt("android:theme", 0);
            this.f4493g = bundle.getBoolean("android:cancelable", true);
            this.f4494h = bundle.getBoolean("android:showsDialog", this.f4494h);
            this.f4495i = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.l;
        if (dialog != null) {
            this.f4498m = true;
            dialog.setOnDismissListener(null);
            this.l.dismiss();
            if (!this.f4499n) {
                onDismiss(this.l);
            }
            this.l = null;
            this.f4501p = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        if (!this.f4500o && !this.f4499n) {
            this.f4499n = true;
        }
        getViewLifecycleOwnerLiveData().i(this.f4497k);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f4498m) {
            return;
        }
        if (g1.J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        D(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z10 = this.f4494h;
        if (z10 && !this.f4496j) {
            if (z10 && !this.f4501p) {
                try {
                    this.f4496j = true;
                    Dialog dialogE = E(bundle);
                    this.l = dialogE;
                    if (this.f4494h) {
                        int i10 = this.f4491e;
                        if (i10 == 1 || i10 == 2) {
                            dialogE.requestWindowFeature(1);
                        } else if (i10 == 3) {
                            Window window = dialogE.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogE.requestWindowFeature(1);
                        }
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.l.setOwnerActivity((Activity) context);
                        }
                        this.l.setCancelable(this.f4493g);
                        this.l.setOnCancelListener(this.f4489c);
                        this.l.setOnDismissListener(this.f4490d);
                        this.f4501p = true;
                    } else {
                        this.l = null;
                    }
                    this.f4496j = false;
                } catch (Throwable th2) {
                    this.f4496j = false;
                    throw th2;
                }
            }
            if (g1.J(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.l;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (g1.J(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f4494h) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.l;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f4491e;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f4492f;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f4493g;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f4494h;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f4495i;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.l;
        if (dialog != null) {
            this.f4498m = false;
            dialog.show();
            View decorView = this.l.getWindow().getDecorView();
            kotlin.jvm.internal.n.f(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.l.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.l.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
