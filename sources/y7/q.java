package y7;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.a1;
import com.storage.androidcleaner.R;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import oa.k0;
import tj.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly7/q;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public class q extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f54306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f54307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h.c f54308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f54309e;

    public final p D() {
        p pVar = this.f54307c;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.n.l("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        D().i(i10, i11, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        p pVar = bundle != null ? (p) bundle.getParcelable("loginClient") : null;
        if (pVar == null) {
            pVar = new p();
            pVar.f54295b = -1;
            if (pVar.f54296c != null) {
                throw new l7.n("Can't set fragment once it is already set.");
            }
            pVar.f54296c = this;
        } else {
            if (pVar.f54296c != null) {
                throw new l7.n("Can't set fragment once it is already set.");
            }
            pVar.f54296c = this;
        }
        this.f54307c = pVar;
        D().f54297d = new i0(this, 14);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f54305a = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f54306b = (n) bundleExtra.getParcelable("request");
        }
        h.c cVarRegisterForActivityResult = registerForActivityResult(new a1(3), new i0(new a4.b(9, this, activity), 15));
        kotlin.jvm.internal.n.e(cVarRegisterForActivityResult, "registerForActivityResul…andlerCallback(activity))");
        this.f54308d = cVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.n.f(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        kotlin.jvm.internal.n.e(viewFindViewById, "view.findViewById<View>(…in_fragment_progress_bar)");
        this.f54309e = viewFindViewById;
        D().f54298e = new k0(this, 27);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        t tVarF = D().f();
        if (tVarF != null) {
            tVarF.b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        View view = getView();
        View viewFindViewById = view != null ? view.findViewById(R.id.com_facebook_login_fragment_progress_bar) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        super.onResume();
        if (this.f54305a == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        p pVarD = D();
        n nVar = this.f54306b;
        n nVar2 = pVarD.f54300g;
        if ((nVar2 == null || pVarD.f54295b < 0) && nVar != null) {
            int i10 = nVar.f54277n;
            if (nVar2 != null) {
                throw new l7.n("Attempted to authorize while a request is pending.");
            }
            Date date = l7.a.l;
            if (!go.k.P() || pVarD.b()) {
                pVarD.f54300g = nVar;
                ArrayList arrayList = new ArrayList();
                int i11 = nVar.f54265a;
                boolean z14 = true;
                if (i10 != 2) {
                    switch (i11) {
                        case 1:
                        case 2:
                            z10 = true;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            z10 = false;
                            break;
                        default:
                            throw null;
                    }
                    if (z10) {
                        arrayList.add(new k(pVarD));
                    }
                    if (!l7.s.f45225o) {
                        switch (i11) {
                            case 1:
                            case 2:
                            case 3:
                            case 5:
                                z11 = true;
                                break;
                            case 4:
                            case 6:
                                z11 = false;
                                break;
                            default:
                                throw null;
                        }
                        if (z11) {
                            arrayList.add(new m(pVarD));
                        }
                    }
                } else if (!l7.s.f45225o) {
                    switch (i11) {
                        case 1:
                        case 2:
                        case 5:
                            z13 = true;
                            break;
                        case 3:
                        case 4:
                        case 6:
                            z13 = false;
                            break;
                        default:
                            throw null;
                    }
                    if (z13) {
                        arrayList.add(new l(pVarD));
                    }
                }
                if (wi.d.b(i11)) {
                    arrayList.add(new a(pVarD));
                }
                switch (i11) {
                    case 1:
                    case 4:
                    case 5:
                        z12 = true;
                        break;
                    case 2:
                    case 3:
                    case 6:
                        z12 = false;
                        break;
                    default:
                        throw null;
                }
                if (z12) {
                    arrayList.add(new x(pVarD));
                }
                if (i10 != 2) {
                    switch (i11) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            z14 = false;
                        case 6:
                            if (z14) {
                                arrayList.add(new i(pVarD));
                            }
                            break;
                        default:
                            throw null;
                    }
                }
                pVarD.f54294a = (t[]) arrayList.toArray(new t[0]);
                pVarD.j();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.n.f(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", D());
    }
}
