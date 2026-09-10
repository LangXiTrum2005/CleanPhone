package ads_mobile_sdk;

import ads_mobile_sdk.a72;
import ads_mobile_sdk.b72;
import ads_mobile_sdk.dh;
import ads_mobile_sdk.i72;
import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.marial;
import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.cutely;
import com.google.common.util.concurrent.impromptu;
import com.google.common.util.concurrent.rotuma;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kaif.competently;
import saneness.delouse;
import saneness.demented;
import saneness.hotly;
import saneness.psalmodic;
import saneness.slumberous;

/* JADX INFO: loaded from: classes.dex */
public final class b72 implements hotly {
    public final Context a;
    public final delouse b;
    public final demented c;
    public final u13 d;
    public final ExecutorService e;
    public final o72 f;
    public final psalmodic g;

    public b72(Context context, delouse delouseVar, demented dementedVar, u13 u13Var, ExecutorService executorService, o72 o72Var, psalmodic psalmodicVar) {
        this.a = context;
        this.b = delouseVar;
        this.c = dementedVar;
        this.d = u13Var;
        this.e = executorService;
        this.f = o72Var;
        this.g = psalmodicVar;
    }

    @Override // saneness.hotly
    public final adultoid a() {
        u13 u13Var = this.d;
        gf0 gf0Var = gf0.EVENT_ID_DG_FETCHER_FETCH_PROGRAM;
        final delouse delouseVar = this.b;
        Objects.requireNonNull(delouseVar);
        return u13Var.a(gf0Var, cutely.restrictive(arytenoidectomy.apical(new Callable() { // from class: saneness.cultivated
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (dh) delouseVar.get();
            }
        }, this.e)).merc(new marial() { // from class: saneness.premeiotic
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return Integer.valueOf(this.f37262kowloon.a((dh) obj));
            }
        }, rotuma.attabal()).polder(new impromptu() { // from class: saneness.timberyard
            @Override // com.google.common.util.concurrent.impromptu
            public final com.google.common.util.concurrent.adultoid apply(Object obj) {
                return this.f37336attabal.a((Integer) obj);
            }
        }, rotuma.attabal()).merc(new marial() { // from class: saneness.milliradian
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return this.f37206kowloon.a((i72) obj);
            }
        }, this.e).kattegat(a72.class, new marial() { // from class: saneness.treadless
            @Override // com.google.common.base.marial
            public final Object apply(Object obj) {
                return b72.a((a72) obj);
            }
        }, rotuma.attabal()));
    }

    public final gg0 a(i72 i72Var) {
        m72 m72Var;
        mv2 mv2Var;
        boolean zA;
        String strR = i72Var.r().r();
        String strO = i72Var.r().o();
        u13 u13Var = this.d;
        v03 v03Var = new v03(gf0.EVENT_ID_DG_FETCHER_GASS_CLIENT_INVOCATION, u13Var.b, u13Var.a);
        try {
            v03Var.b();
            lm0 lm0Var = new lm0(this.a, (dh) this.b.get(), strR, strO, this.g);
            try {
                m72Var = (m72) lm0Var.f.poll(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                lm0Var.a(2009, lm0Var.i, e);
                m72Var = null;
            }
            lm0Var.a(3004, lm0Var.i, null);
            if (m72Var == null) {
                m72Var = new m72(null, 1, 1);
            }
            m72 m72Var2 = m72Var;
            v03Var.a();
            if (m72Var2.c == 2) {
                this.d.b(gf0.EVENT_ID_DG_FETCHER_PROGRAM_NO_UPDATE);
                return (gg0) gg0.s().wireman(mv2.STATUS_NO_UPDATE).a();
            }
            byte[] bArr = m72Var2.b;
            if (bArr != null && bArr.length != 0) {
                try {
                    om0 om0VarA = om0.a(bArr, vf0.b());
                    if (!om0VarA.p().r().isEmpty() && !om0VarA.p().o().isEmpty() && om0VarA.o().c().length != 0) {
                        if (!i72Var.equals(i72.q()) && TextUtils.equals(i72Var.r().r(), om0VarA.p().r()) && TextUtils.equals(i72Var.r().o(), om0VarA.p().o())) {
                            this.d.b(gf0.EVENT_ID_DG_FETCHER_PROGRAM_SAME_CHECKSUM);
                        } else {
                            if (m72Var2.c == 4) {
                                o72 o72Var = this.f;
                                byte[] bArrC = om0VarA.q().c();
                                o72Var.getClass();
                                try {
                                    competently.wireman(o72Var.a);
                                    competently.beachfront(bArrC, o72Var.a);
                                    q73 q73Var = o72Var.b;
                                    File file = o72Var.a;
                                    q73Var.getClass();
                                    zA = q73.a(file);
                                } catch (IOException | GeneralSecurityException e2) {
                                    u13 u13Var2 = o72Var.c;
                                    gf0 gf0Var = gf0.EVENT_ID_UNSPECIFIED;
                                    ((kc1) u13Var2.a).a(2026, -1L, e2, null);
                                    zA = false;
                                }
                                try {
                                    o72Var.a.delete();
                                } catch (SecurityException unused) {
                                }
                                if (!zA) {
                                    this.d.b(gf0.EVENT_ID_DG_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                    return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_SIGNATURE_VALIDATION_FAILED).a();
                                }
                            }
                            slumberous slumberousVarS = gg0.s();
                            int i = m72Var2.c;
                            if (i == 2) {
                                mv2Var = mv2.STATUS_NO_UPDATE;
                            } else if (i == 3) {
                                mv2Var = mv2.STATUS_UPDATE_PROGRAM_BYTECODE;
                            } else if (i == 4) {
                                mv2Var = mv2.STATUS_UPDATE_VM_AND_PROGRAM_BYTECODE;
                            } else if (i != 6) {
                                mv2Var = mv2.STATUS_UNKNOWN;
                            } else {
                                mv2Var = mv2.STATUS_FAILURE_ARCHITECTURE_NOT_SUPPORTED;
                            }
                            return (gg0) slumberousVarS.wireman(mv2Var).attabal((i72) i72.t().wireman(om0VarA.p()).dern((dh) this.b.get()).a()).marial(om0VarA.q()).dern(om0VarA.o()).a();
                        }
                    } else {
                        this.d.b(gf0.EVENT_ID_DG_FETCHER_PROGRAM_EMPTY_BYTECODE);
                    }
                    return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_PROGRAM_VALIDATION_FAILED).a();
                } catch (x81 e3) {
                    u13 u13Var3 = this.d;
                    gf0 gf0Var2 = gf0.EVENT_ID_UNSPECIFIED;
                    ((kc1) u13Var3.a).a(15204, -1L, e3, null);
                    return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR).a();
                } catch (NullPointerException unused2) {
                    this.d.b(gf0.EVENT_ID_DG_FETCHER_NPE_PARSING_GASS_PROGRAM);
                    return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR_NPE).a();
                }
            }
            this.d.b(gf0.EVENT_ID_GET_EMPTY_PROGRAM_FROM_GASS);
            return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_INVALID_RESPONSE_EMPTY_BYTECODE).a();
        } catch (Throwable th) {
            try {
                v03Var.a(th);
                throw th;
            } catch (Throwable th2) {
                v03Var.a();
                throw th2;
            }
        }
    }

    public final /* synthetic */ adultoid a(Integer num) {
        return this.c.a();
    }

    public final int a(dh dhVar) {
        int iOrdinal = dhVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            return 0;
        }
        u13 u13Var = this.d;
        gf0 gf0Var = gf0.EVENT_ID_UNSPECIFIED;
        ((kc1) u13Var.a).a(15203, -1L, null, dhVar.name());
        throw new a72();
    }

    public static gg0 a(a72 a72Var) {
        return (gg0) gg0.s().wireman(mv2.STATUS_FAILURE_ARCHITECTURE_NOT_SUPPORTED).a();
    }
}
