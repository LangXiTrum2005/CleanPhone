package t;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g1;
import androidx.lifecycle.f0;
import com.google.android.gms.internal.ads.lw;
import com.storage.androidcleaner.R;
import java.util.concurrent.Executor;
import oa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class l extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f50295a;

    public l() {
        new Handler(Looper.getMainLooper());
    }

    public final void D(int i10) {
        if (i10 != 3) {
            this.f50295a.getClass();
        }
        F();
        t tVar = this.f50295a;
        if (tVar.f50309h == null) {
            tVar.f50309h = new m5.k(17, false);
        }
        m5.k kVar = tVar.f50309h;
        CancellationSignal cancellationSignal = (CancellationSignal) kVar.f45902b;
        if (cancellationSignal != null) {
            try {
                u.a(cancellationSignal);
            } catch (NullPointerException e10) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
            }
            kVar.f45902b = null;
        }
        lw lwVar = (lw) kVar.f45903c;
        if (lwVar != null) {
            try {
                lwVar.a();
            } catch (NullPointerException e11) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
            }
            kVar.f45903c = null;
        }
    }

    public final void E() {
        t tVar = this.f50295a;
        tVar.f50311j = false;
        tVar.f50311j = false;
        if (isAdded()) {
            g1 parentFragmentManager = getParentFragmentManager();
            z zVar = (z) parentFragmentManager.C("androidx.biometric.FingerprintDialogFragment");
            if (zVar != null) {
                if (zVar.isAdded()) {
                    zVar.D(false);
                } else {
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
                    aVar.i(zVar);
                    aVar.f(true, true);
                }
            }
        }
        if (!this.f50295a.l && isAdded()) {
            g1 parentFragmentManager2 = getParentFragmentManager();
            parentFragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(parentFragmentManager2);
            aVar2.i(this);
            aVar2.f(true, true);
        }
        if (getContext() != null) {
            String str = Build.MODEL;
        }
    }

    public final void F() {
        if (getActivity() != null) {
            this.f50295a.getClass();
        }
    }

    public final void G(int i10, CharSequence charSequence) {
        t tVar = this.f50295a;
        if (tVar.l) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (tVar.f50312k) {
            tVar.f50312k = false;
            Executor uVar = tVar.f50305d;
            if (uVar == null) {
                uVar = new com.google.android.gms.common.api.internal.u(4);
            }
            uVar.execute(new com.google.android.gms.common.api.internal.q(this, i10, charSequence));
        } else {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        }
        E();
    }

    public final void H(o oVar) {
        t tVar = this.f50295a;
        if (tVar.f50312k) {
            tVar.f50312k = false;
            Executor uVar = tVar.f50305d;
            if (uVar == null) {
                uVar = new com.google.android.gms.common.api.internal.u(4);
            }
            uVar.execute(new f(this, oVar));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        E();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            this.f50295a.l = false;
            if (i11 == -1) {
                H(new o());
            } else {
                G(10, getString(R.string.generic_error_user_canceled));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        t tVar = (t) new g9.k(getActivity()).n(t.class);
        this.f50295a = tVar;
        if (tVar.f50313m == null) {
            tVar.f50313m = new f0();
        }
        tVar.f50313m.d(this, new g(this, 0));
        t tVar2 = this.f50295a;
        if (tVar2.f50314n == null) {
            tVar2.f50314n = new f0();
        }
        tVar2.f50314n.d(this, new h(this, 0));
        t tVar3 = this.f50295a;
        if (tVar3.f50315o == null) {
            tVar3.f50315o = new f0();
        }
        tVar3.f50315o.d(this, new k0(this, 12));
        t tVar4 = this.f50295a;
        if (tVar4.f50316p == null) {
            tVar4.f50316p = new f0();
        }
        tVar4.f50316p.d(this, new na.g(this, 14));
        t tVar5 = this.f50295a;
        if (tVar5.f50317q == null) {
            tVar5.f50317q = new f0();
        }
        tVar5.f50317q.d(this, new g(this, 1));
        t tVar6 = this.f50295a;
        if (tVar6.f50318r == null) {
            tVar6.f50318r = new f0();
        }
        tVar6.f50318r.d(this, new h(this, 1));
    }
}
