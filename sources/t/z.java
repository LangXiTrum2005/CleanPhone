package t;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.f0;
import com.storage.androidcleaner.R;
import oa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class z extends androidx.fragment.app.w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f50322q = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q5.a f50323r = new q5.a(this, 3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t f50324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f50325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f50326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f50327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f50328w;

    @Override // androidx.fragment.app.w
    public final Dialog E(Bundle bundle) {
        int i10;
        b2.w wVar = new b2.w(requireContext());
        p pVar = this.f50324s.f50307f;
        CharSequence string = null;
        CharSequence charSequence = pVar != null ? pVar.f50296a : null;
        k.c cVar = (k.c) wVar.f5411c;
        cVar.f44049d = charSequence;
        View viewInflate = LayoutInflater.from(cVar.f44046a).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            p pVar2 = this.f50324s.f50307f;
            CharSequence charSequence2 = pVar2 != null ? pVar2.f50297b : null;
            if (TextUtils.isEmpty(charSequence2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence2);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            p pVar3 = this.f50324s.f50307f;
            CharSequence charSequence3 = pVar3 != null ? pVar3.f50298c : null;
            if (TextUtils.isEmpty(charSequence3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence3);
            }
        }
        this.f50327v = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.f50328w = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        p pVar4 = this.f50324s.f50307f;
        if (pVar4 != null) {
            i10 = pVar4.f50301f;
            if (i10 == 0) {
                i10 = 255;
            }
        } else {
            i10 = 0;
        }
        if ((i10 & 32768) != 0) {
            string = getString(R.string.confirm_device_credential_password);
        } else if (pVar4 != null && (string = pVar4.f50299d) == null) {
            string = "";
        }
        s sVar = new s(this);
        cVar.f44051f = string;
        cVar.f44052g = sVar;
        cVar.f44056k = viewInflate;
        k.f fVarB = wVar.b();
        fVarB.setCanceledOnTouchOutside(false);
        return fVarB;
    }

    public final int G(int i10) {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context == null || activity == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.w, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        t tVar = this.f50324s;
        if (tVar.f50318r == null) {
            tVar.f50318r = new f0();
        }
        t.g(tVar.f50318r, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            t tVar = (t) new g9.k(activity).n(t.class);
            this.f50324s = tVar;
            if (tVar.f50320t == null) {
                tVar.f50320t = new f0();
            }
            tVar.f50320t.d(this, new rb.c(this, 6));
            t tVar2 = this.f50324s;
            if (tVar2.f50321u == null) {
                tVar2.f50321u = new f0();
            }
            tVar2.f50321u.d(this, new k0(this, 13));
        }
        this.f50325t = G(y.a());
        this.f50326u = G(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f50322q.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        t tVar = this.f50324s;
        tVar.f50319s = 0;
        tVar.e(1);
        this.f50324s.d(getString(R.string.fingerprint_dialog_touch_sensor));
    }
}
