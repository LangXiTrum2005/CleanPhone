package q7;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.MBridgeConstans;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq7/h;", "Landroidx/fragment/app/w;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class h extends androidx.fragment.app.w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Dialog f48691q;

    @Override // androidx.fragment.app.w
    public final Dialog E(Bundle bundle) {
        Dialog dialog = this.f48691q;
        if (dialog != null) {
            return dialog;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            kotlin.jvm.internal.n.e(intent, "fragmentActivity.intent");
            activity.setResult(-1, z.f(intent, null, null));
            activity.finish();
        }
        this.f4494h = false;
        return super.E(bundle);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.n.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.f48691q instanceof l0) && isResumed()) {
            Dialog dialog = this.f48691q;
            kotlin.jvm.internal.n.d(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((l0) dialog).d();
        }
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FragmentActivity activity;
        String string;
        l0 l0Var;
        super.onCreate(bundle);
        if (this.f48691q == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            kotlin.jvm.internal.n.e(intent, "intent");
            Bundle bundleJ = z.j(intent);
            final int i10 = 0;
            if (bundleJ != null ? bundleJ.getBoolean("is_fallback", false) : false) {
                string = bundleJ != null ? bundleJ.getString("url") : null;
                if (e0.w(string)) {
                    e0.B("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                final int i11 = 1;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{l7.s.c()}, 1));
                int i12 = l.f48708o;
                kotlin.jvm.internal.n.d(string, "null cannot be cast to non-null type kotlin.String");
                l0.b(activity);
                l lVar = new l(activity, string);
                lVar.f48712b = str;
                lVar.f48713c = new g0(this) { // from class: q7.g

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f48690b;

                    {
                        this.f48690b = this;
                    }

                    @Override // q7.g0
                    public final void a(Bundle bundle2, l7.n nVar) {
                        switch (i11) {
                            case 0:
                                FragmentActivity activity2 = this.f48690b.getActivity();
                                if (activity2 != null) {
                                    Intent intent2 = activity2.getIntent();
                                    kotlin.jvm.internal.n.e(intent2, "fragmentActivity.intent");
                                    activity2.setResult(nVar == null ? -1 : 0, z.f(intent2, bundle2, nVar));
                                    activity2.finish();
                                    break;
                                }
                                break;
                            default:
                                h this$0 = this.f48690b;
                                kotlin.jvm.internal.n.f(this$0, "this$0");
                                FragmentActivity activity3 = this$0.getActivity();
                                if (activity3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle2 == null) {
                                        bundle2 = new Bundle();
                                    }
                                    intent3.putExtras(bundle2);
                                    activity3.setResult(-1, intent3);
                                    activity3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                l0Var = lVar;
            } else {
                String string2 = bundleJ != null ? bundleJ.getString("action") : null;
                Bundle bundle2 = bundleJ != null ? bundleJ.getBundle("params") : null;
                if (e0.w(string2)) {
                    e0.B("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                }
                kotlin.jvm.internal.n.d(string2, "null cannot be cast to non-null type kotlin.String");
                Date date = l7.a.l;
                l7.a aVarD = go.k.D();
                string = go.k.P() ? null : l7.s.c();
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                String str2 = string;
                g0 g0Var = new g0(this) { // from class: q7.g

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f48690b;

                    {
                        this.f48690b = this;
                    }

                    @Override // q7.g0
                    public final void a(Bundle bundle3, l7.n nVar) {
                        switch (i10) {
                            case 0:
                                FragmentActivity activity2 = this.f48690b.getActivity();
                                if (activity2 != null) {
                                    Intent intent2 = activity2.getIntent();
                                    kotlin.jvm.internal.n.e(intent2, "fragmentActivity.intent");
                                    activity2.setResult(nVar == null ? -1 : 0, z.f(intent2, bundle3, nVar));
                                    activity2.finish();
                                    break;
                                }
                                break;
                            default:
                                h this$0 = this.f48690b;
                                kotlin.jvm.internal.n.f(this$0, "this$0");
                                FragmentActivity activity3 = this$0.getActivity();
                                if (activity3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle3 == null) {
                                        bundle3 = new Bundle();
                                    }
                                    intent3.putExtras(bundle3);
                                    activity3.setResult(-1, intent3);
                                    activity3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (aVarD != null) {
                    bundle2.putString(MBridgeConstans.APP_ID, aVarD.f45078h);
                    bundle2.putString("access_token", aVarD.f45075e);
                } else {
                    bundle2.putString(MBridgeConstans.APP_ID, str2);
                }
                l0.b(activity);
                l0Var = new l0(activity, string2, bundle2, 1, g0Var);
            }
            this.f48691q = l0Var;
        }
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = this.l;
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.f48691q;
        if (dialog instanceof l0) {
            kotlin.jvm.internal.n.d(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((l0) dialog).d();
        }
    }
}
