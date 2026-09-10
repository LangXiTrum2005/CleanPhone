package y7;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookActivity;
import com.facebook.appevents.InternalAppEventsLogger;
import com.ironsource.O6;
import com.ironsource.X3;
import com.storage.androidcleaner.R;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import l7.b0;
import l7.c0;
import l7.f0;
import org.json.JSONObject;
import q7.e0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Ly7/h;", "Landroidx/fragment/app/w;", "<init>", "()V", "un/a", "t1/t", "y7/f", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public class h extends androidx.fragment.app.w {
    public n A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f54236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f54237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f54238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i f54239t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f54240u = new AtomicBoolean();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile c0 f54241v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile ScheduledFuture f54242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile f f54243x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f54244y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f54245z;

    @Override // androidx.fragment.app.w
    public final Dialog E(Bundle bundle) {
        g gVar = new g(this, requireActivity());
        gVar.setContentView(H(p7.b.c() && !this.f54245z));
        return gVar;
    }

    public final void G(String str, t1.t tVar, String str2, Date date, Date date2) {
        i iVar = this.f54239t;
        if (iVar != null) {
            iVar.d().d(new o(iVar.d().f54300g, 1, new l7.a(str2, l7.s.c(), str, tVar.f50411a, tVar.f50412b, tVar.f50413c, l7.g.f45127f, date, null, date2, "facebook"), null, null));
        }
        Dialog dialog = this.l;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final View H(boolean z10) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        kotlin.jvm.internal.n.e(layoutInflater, "requireActivity().layoutInflater");
        View viewInflate = layoutInflater.inflate(z10 ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        kotlin.jvm.internal.n.e(viewInflate, "inflater.inflate(getLayo…esId(isSmartLogin), null)");
        View viewFindViewById = viewInflate.findViewById(R.id.progress_bar);
        kotlin.jvm.internal.n.e(viewFindViewById, "view.findViewById(R.id.progress_bar)");
        this.f54236q = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.confirmation_code);
        kotlin.jvm.internal.n.d(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.f54237r = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.cancel_button);
        kotlin.jvm.internal.n.d(viewFindViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) viewFindViewById3).setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 16));
        View viewFindViewById4 = viewInflate.findViewById(R.id.com_facebook_device_auth_instructions);
        kotlin.jvm.internal.n.d(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById4;
        this.f54238s = textView;
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    public final void I() {
        if (this.f54240u.compareAndSet(false, true)) {
            f fVar = this.f54243x;
            if (fVar != null) {
                p7.b.a(fVar.f54231b);
            }
            i iVar = this.f54239t;
            if (iVar != null) {
                iVar.d().d(new o(iVar.d().f54300g, 2, null, "User canceled log in.", null));
            }
            Dialog dialog = this.l;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void J(l7.n nVar) {
        if (this.f54240u.compareAndSet(false, true)) {
            f fVar = this.f54243x;
            if (fVar != null) {
                p7.b.a(fVar.f54231b);
            }
            i iVar = this.f54239t;
            if (iVar != null) {
                n nVar2 = iVar.d().f54300g;
                String message = nVar.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                iVar.d().d(new o(nVar2, 3, null, TextUtils.join(": ", arrayList), null));
            }
            Dialog dialog = this.l;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void K(String str, long j10, Long l) {
        Date date;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        if (j10 != 0) {
            date = new Date((j10 * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        Date date2 = l.longValue() != 0 ? new Date(l.longValue() * 1000) : null;
        Date date3 = date;
        l7.a aVar = new l7.a(str, l7.s.c(), "0", null, null, null, null, date3, null, date2, "facebook");
        String str2 = b0.f45085j;
        b0 b0VarZ = j2.n.z(aVar, "me", new com.facebook.appevents.b(this, str, date3, date2, 2));
        b0VarZ.f45094h = f0.f45120a;
        b0VarZ.f45090d = bundle;
        b0VarZ.d();
    }

    public final void L() {
        f fVar = this.f54243x;
        if (fVar != null) {
            fVar.f54234e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        f fVar2 = this.f54243x;
        bundle.putString("code", fVar2 != null ? fVar2.f54232c : null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l7.s.c());
        sb2.append('|');
        q7.f.o();
        String str = l7.s.f45217f;
        if (str == null) {
            throw new l7.n("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb2.append(str);
        bundle.putString("access_token", sb2.toString());
        String str2 = b0.f45085j;
        this.f54241v = new b0(null, "device/login_status", bundle, f0.f45121b, new c(this, 0)).d();
    }

    public final void M() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        f fVar = this.f54243x;
        Long lValueOf = fVar != null ? Long.valueOf(fVar.f54233d) : null;
        if (lValueOf != null) {
            synchronized (i.f54246d) {
                try {
                    if (i.f54247e == null) {
                        i.f54247e = new ScheduledThreadPoolExecutor(1);
                    }
                    scheduledThreadPoolExecutor = i.f54247e;
                    if (scheduledThreadPoolExecutor == null) {
                        kotlin.jvm.internal.n.l("backgroundExecutor");
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f54242w = scheduledThreadPoolExecutor.schedule(new q1.c(this, 13), lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    public final void N(f fVar) {
        Bitmap bitmapCreateBitmap;
        boolean zD;
        this.f54243x = fVar;
        TextView textView = this.f54237r;
        if (textView == null) {
            kotlin.jvm.internal.n.l("confirmationCode");
            throw null;
        }
        textView.setText(fVar.f54231b);
        String str = fVar.f54230a;
        p7.b bVar = p7.b.f48263a;
        boolean z10 = false;
        if (v7.a.b(p7.b.class)) {
            bitmapCreateBitmap = null;
        } else {
            try {
                EnumMap enumMap = new EnumMap(he.a.class);
                enumMap.put(he.a.f42329f, 2);
                try {
                    ke.b bVarI = new ea.b0(24).i(str, 12, enumMap);
                    int i10 = bVarI.f44615b;
                    int i11 = bVarI.f44614a;
                    int[] iArr = new int[i10 * i11];
                    for (int i12 = 0; i12 < i10; i12++) {
                        int i13 = i12 * i11;
                        for (int i14 = 0; i14 < i11; i14++) {
                            iArr[i13 + i14] = bVarI.a(i14, i12) ? -16777216 : -1;
                        }
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
                    try {
                        bitmapCreateBitmap.setPixels(iArr, 0, i11, 0, 0, i11, i10);
                    } catch (he.e unused) {
                    }
                } catch (he.e unused2) {
                    bitmapCreateBitmap = null;
                }
            } catch (Throwable th2) {
                v7.a.a(p7.b.class, th2);
            }
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmapCreateBitmap);
        TextView textView2 = this.f54238s;
        if (textView2 == null) {
            kotlin.jvm.internal.n.l("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.f54237r;
        if (textView3 == null) {
            kotlin.jvm.internal.n.l("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.f54236q;
        if (view == null) {
            kotlin.jvm.internal.n.l("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.f54245z) {
            String str2 = fVar.f54231b;
            if (v7.a.b(p7.b.class)) {
                zD = false;
            } else {
                try {
                    if (p7.b.c()) {
                        zD = p7.b.f48263a.d(str2);
                    } else {
                        zD = false;
                    }
                } catch (Throwable th3) {
                    v7.a.a(p7.b.class, th3);
                }
            }
            if (zD) {
                new InternalAppEventsLogger(getContext()).logEventImplicitly("fb_smart_login_service");
            }
        }
        if (fVar.f54234e != 0 && (new Date().getTime() - fVar.f54234e) - (fVar.f54233d * 1000) < 0) {
            z10 = true;
        }
        if (z10) {
            M();
        } else {
            L();
        }
    }

    public final void O(n request) {
        kotlin.jvm.internal.n.f(request, "request");
        this.A = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.f54266b));
        String str = request.f54273i;
        if (!e0.w(str)) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = request.f54275k;
        if (!e0.w(str2)) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l7.s.c());
        sb2.append('|');
        q7.f.o();
        String str3 = l7.s.f45217f;
        if (str3 == null) {
            throw new l7.n("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb2.append(str3);
        bundle.putString("access_token", sb2.toString());
        p7.b bVar = p7.b.f48263a;
        String str4 = null;
        if (!v7.a.b(p7.b.class)) {
            try {
                HashMap map = new HashMap();
                String DEVICE = Build.DEVICE;
                kotlin.jvm.internal.n.e(DEVICE, "DEVICE");
                map.put(X3.i.G, DEVICE);
                String MODEL = Build.MODEL;
                kotlin.jvm.internal.n.e(MODEL, "MODEL");
                map.put(O6.B, MODEL);
                String string = new JSONObject(map).toString();
                kotlin.jvm.internal.n.e(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
                str4 = string;
            } catch (Throwable th2) {
                v7.a.a(p7.b.class, th2);
            }
        }
        bundle.putString("device_info", str4);
        String str5 = b0.f45085j;
        new b0(null, "device/login", bundle, f0.f45121b, new c(this, 1)).d();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        f fVar;
        kotlin.jvm.internal.n.f(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        kotlin.jvm.internal.n.d(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.facebook.FacebookActivity");
        q qVar = (q) ((FacebookActivity) fragmentActivityRequireActivity).f10569h;
        this.f54239t = (i) (qVar != null ? qVar.D().f() : null);
        if (bundle != null && (fVar = (f) bundle.getParcelable("request_state")) != null) {
            N(fVar);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f54244y = true;
        this.f54240u.set(true);
        super.onDestroyView();
        c0 c0Var = this.f54241v;
        if (c0Var != null) {
            c0Var.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.f54242w;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.n.f(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.f54244y) {
            return;
        }
        I();
    }

    @Override // androidx.fragment.app.w, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.n.f(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f54243x != null) {
            outState.putParcelable("request_state", this.f54243x);
        }
    }
}
