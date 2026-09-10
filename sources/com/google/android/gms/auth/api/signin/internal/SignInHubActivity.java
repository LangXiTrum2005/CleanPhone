package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import bc.i;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import f1.a;
import f1.b;
import f1.d;
import g9.k;
import j9.l;
import java.lang.reflect.Modifier;
import java.util.Set;
import od.c;
import x.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public class SignInHubActivity extends FragmentActivity {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f11634m = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11635h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SignInConfiguration f11636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11638k;
    public Intent l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.v, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void H() {
        d dVarA = a.a(this);
        c cVar = new c(this, 8);
        ?? r2 = dVarA.f40270a;
        f1.c cVar2 = dVarA.f40271b;
        boolean z10 = cVar2.f40269e;
        j jVar = cVar2.f40268d;
        if (z10) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        b bVar = (b) jVar.b(0);
        if (bVar == 0) {
            try {
                cVar2.f40269e = true;
                Set set = l.f43751a;
                synchronized (set) {
                }
                g9.d dVar = new g9.d(this, set);
                if (g9.d.class.isMemberClass() && !Modifier.isStatic(g9.d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar);
                }
                b bVar2 = new b(dVar);
                jVar.c(0, bVar2);
                cVar2.f40269e = false;
                i iVar = new i(bVar2.l, cVar);
                bVar2.d(r2, iVar);
                i iVar2 = bVar2.f40266n;
                if (iVar2 != null) {
                    bVar2.i(iVar2);
                }
                bVar2.f40265m = r2;
                bVar2.f40266n = iVar;
            } catch (Throwable th2) {
                cVar2.f40269e = false;
                throw th2;
            }
        } else {
            i iVar3 = new i(bVar.l, cVar);
            bVar.d(r2, iVar3);
            i iVar4 = bVar.f40266n;
            if (iVar4 != null) {
                bVar.i(iVar4);
            }
            bVar.f40265m = r2;
            bVar.f40266n = iVar3;
        }
        f11634m = false;
    }

    public final void I(int i10) {
        Status status = new Status(i10, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f11634m = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f11635h) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f11630b) != null) {
                k kVarJ = k.J(this);
                GoogleSignInOptions googleSignInOptions = this.f11636i.f11633b;
                synchronized (kVarJ) {
                    ((g9.b) kVarJ.f41770b).c(googleSignInAccount, googleSignInOptions);
                    kVarJ.f41771c = googleSignInAccount;
                    kVarJ.f41772d = googleSignInOptions;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f11637j = true;
                this.f11638k = i11;
                this.l = intent;
                H();
                return;
            }
            if (intent.hasExtra(IronSourceConstants.EVENTS_ERROR_CODE)) {
                int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                I(intExtra);
                return;
            }
        }
        I(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            I(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f11636i = signInConfiguration;
        if (bundle != null) {
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.f11637j = z10;
            if (z10) {
                this.f11638k = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.l = intent2;
                H();
                return;
            }
            return;
        }
        if (f11634m) {
            setResult(0);
            I(12502);
            return;
        }
        f11634m = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f11636i);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f11635h = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            I(17);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f11634m = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f11637j);
        if (this.f11637j) {
            bundle.putInt("signInResultCode", this.f11638k);
            bundle.putParcelable("signInResultData", this.l);
        }
    }
}
