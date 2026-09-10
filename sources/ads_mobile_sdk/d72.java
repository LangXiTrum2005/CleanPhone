package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.base.marial;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.cutely;
import com.google.common.util.concurrent.rotuma;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import saneness.croatian;
import saneness.fatness;
import saneness.gibeonite;
import saneness.hotly;
import saneness.industrialist;
import saneness.pastie;

/* JADX INFO: loaded from: classes.dex */
public final class d72 implements hotly {
    public final Context a;
    public final ExecutorService b;
    public final industrialist c;
    public final String d;
    public final ps0 e;
    public final String f;
    public final u13 g;
    public final p72 h;

    public d72(Context context, ExecutorService executorService, j5 j5Var, industrialist industrialistVar, u13 u13Var, p72 p72Var) {
        this.a = context;
        this.b = executorService;
        this.c = industrialistVar;
        this.g = u13Var;
        this.h = p72Var;
        this.d = j5Var.D();
        this.e = a(j5Var.C());
        this.f = j5Var.J().t();
    }

    public static ps0 a(i5 i5Var) {
        ps0 ps0Var;
        int number = i5Var.getNumber();
        if (number == 0) {
            ps0Var = ps0.UNKNOWN_HOST_TYPE;
        } else if (number == 1) {
            ps0Var = ps0.GMA;
        } else if (number != 2) {
            ps0Var = number != 3 ? null : ps0.GPAY;
        } else {
            ps0Var = ps0.YOUTUBE;
        }
        return ps0Var != null ? ps0Var : ps0.UNKNOWN_HOST_TYPE;
    }

    @Override // saneness.hotly
    public final adultoid a() {
        int i;
        u13 u13Var = this.g;
        gf0 gf0Var = gf0.EVENT_ID_ORCAS_FETCHER_FETCH_PROGRAM;
        industrialist industrialistVar = this.c;
        gibeonite gibeoniteVarO = q5.o();
        byte[] bArrB = pastie.b();
        gibeonite gibeoniteVarMarial = gibeoniteVarO.dern(kn.a(bArrB, 0, bArrB.length)).attabal(Build.VERSION.SDK_INT).impromptu(Build.MODEL).marial(this.a.getPackageName());
        try {
            i = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        return u13Var.a(gf0Var, cutely.restrictive(((kt0) industrialistVar).a(Uri.parse(this.f).buildUpon().appendQueryParameter("aspq", fatness.attabal(true).competently(((q5) gibeoniteVarMarial.beachfront(i).competently(this.d).taiyuan().wireman(this.e).a()).a())).build().toString(), false, new byte[0], null)).merc(new marial() { // from class: saneness.livable
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return this.f37193kowloon.a((croatian) obj);
            }
        }, this.b).kattegat(UnknownHostException.class, new marial() { // from class: saneness.nomenclative
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return this.f37224kowloon.a((UnknownHostException) obj);
            }
        }, rotuma.attabal()).kattegat(SocketException.class, new marial() { // from class: saneness.hypokinesis
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return this.f37174kowloon.a((SocketException) obj);
            }
        }, rotuma.attabal()));
    }

    public final gg0 a(croatian croatianVar) {
        if (((jt0) croatianVar).a != 200) {
            u13 u13Var = this.g;
            gf0 gf0Var = gf0.EVENT_ID_UNSPECIFIED;
            ((kc1) u13Var.a).a(20002, -1L, null, new String(pastie.b(), StandardCharsets.UTF_8));
            return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_HTTP_ERROR).a();
        }
        try {
            String str = new String(((jt0) croatianVar).b);
            if (TextUtils.isEmpty(str)) {
                this.g.b(gf0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
                return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_EMPTY_BYTECODE).a();
            }
            s5 s5VarA = s5.a(fatness.saneness(str, true), vf0.b());
            if (s5VarA.p().r() && s5VarA.p().s()) {
                if (!this.h.a(s5VarA)) {
                    this.g.b(gf0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                    return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_SIGNATURE_VALIDATION_FAILED).a();
                }
                return (gg0) gg0.s().attabal((i72) i72.t().attabal(s5VarA.p().q()).marial(s5VarA.o()).a()).dern(s5VarA.p().p()).wireman(mv2.STATUS_UPDATE_PROGRAM_BYTECODE).a();
            }
            this.g.b(gf0.EVENT_ID_ORCAS_FETCHER_PROGRAM_EMPTY_RESPONSE);
            return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_EMPTY_BYTECODE).a();
        } catch (Throwable th) {
            u13 u13Var2 = this.g;
            gf0 gf0Var2 = gf0.EVENT_ID_UNSPECIFIED;
            ((kc1) u13Var2.a).a(20004, -1L, th, null);
            return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_DECODE_FAILURE).a();
        }
    }

    public final gg0 a(UnknownHostException unknownHostException) {
        this.g.b(gf0.EVENT_ID_ORCAS_FETCHER_PROGRAM_UNKNOWN_HOST_EXCEPTION);
        return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_HTTP_RUNTIME_EXCEPTION).a();
    }

    public final gg0 a(SocketException socketException) {
        this.g.b(gf0.EVENT_ID_ORCAS_FETCHER_PROGRAM_SOCKET_EXCEPTION);
        return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_HTTP_RUNTIME_EXCEPTION).a();
    }
}
