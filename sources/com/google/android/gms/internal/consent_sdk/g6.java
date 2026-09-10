package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g6 implements UserMessagingPlatform.OnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener, k7, k6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o4 f23021c = new o4(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23023b;

    public /* synthetic */ g6(Object obj, int i10) {
        this.f23022a = i10;
        this.f23023b = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public r6 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            k6 k6Var = ((k6[]) this.f23023b)[i10];
            if (k6Var.b(cls)) {
                return k6Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.consent_sdk.k6
    public boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((k6[]) this.f23023b)[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i10, Object obj, s6 s6Var) throws IOException {
        o5 o5Var = (o5) this.f23023b;
        i5 i5Var = (i5) obj;
        o5Var.z(i10, 2);
        o5Var.B(i5Var.b(s6Var));
        s6Var.d(i5Var, this);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        ((ConsentForm.OnConsentFormDismissedListener) this.f23023b).onConsentFormDismissed(formError);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        ((AtomicReference) this.f23023b).set(consentForm);
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    public Object zzb() {
        switch (this.f23022a) {
            case 3:
                g0 g0Var = h0.f23035b;
                j0.c(g0Var);
                return new q((c) this.f23023b, g0Var);
            case 4:
                return new u((Application) ((l7) this.f23023b).zzb());
            case 5:
            case 6:
            default:
                return this.f23023b;
            case 7:
                j7 j7Var = (j7) this.f23023b;
                if (j7Var != null) {
                    return j7Var.zzb();
                }
                throw new IllegalStateException();
        }
    }

    public g6(int i10) {
        this.f23022a = i10;
        switch (i10) {
            case 7:
                break;
            default:
                int i11 = k5.f23071a;
                g6 g6Var = new g6(new k6[]{o4.f23148v, f23021c}, 6);
                Charset charset = a6.f22937a;
                this.f23023b = g6Var;
                break;
        }
    }

    public g6(o5 o5Var) {
        this.f23022a = 5;
        Charset charset = a6.f22937a;
        this.f23023b = o5Var;
        o5Var.f23152b = this;
    }
}
