package ads_mobile_sdk;

import android.util.Base64;
import com.ironsource.X3;
import curiousness.lotta;
import discernable.beachfront;
import discernable.cord;
import discernable.formularize;
import discernable.gintrap;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cosy;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;
import p002kotlin.text.StringsKt;
import saneness.bitten;
import saneness.evenfall;
import saneness.loun;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class py extends ox0 {
    public final saran c;
    public final ri2 d;
    public final loun e;
    public final jk0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py(saran backgroundScope, ri2 rootTraceCreator, loun traceLogger, jk0 flags) {
        super((no0) null, 3);
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.c = backgroundScope;
        this.d = rootTraceCreator;
        this.e = traceLogger;
        this.f = flags;
    }

    public final spartacist a(String encodedEncryptedAdResponseBlob, String requestId, jp2 signalGenerationData) {
        on0 on0Var;
        Object objAttabal;
        Intrinsics.checkNotNullParameter(encodedEncryptedAdResponseBlob, "encodedEncryptedAdResponseBlob");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(signalGenerationData, "signalGenerationData");
        String str = signalGenerationData.c.adResponseEncryptionKey;
        if (str == null) {
            return new rn0("An encrypted S2S ad response had no adResponseEncryptionKey", k41.INTERNAL_ERROR);
        }
        byte[] bArrDecode = Base64.decode(encodedEncryptedAdResponseBlob, 11);
        Intrinsics.beachfront(bArrDecode);
        try {
            objAttabal = bitten.attabal(str);
        } catch (IOException e) {
            ((d13) this.e).a("CryptoUtil.getHandle: CleartextKeysetHandle.read", e);
            on0Var = new on0(e, null, null, 6);
            objAttabal = on0Var;
        } catch (IllegalArgumentException e2) {
            ((d13) this.e).a("CryptoUtil.getHandle: Base64.decode", e2);
            on0Var = new on0(e2, null, null, 6);
            objAttabal = on0Var;
        } catch (GeneralSecurityException e3) {
            ((d13) this.e).a("CryptoUtil.getHandle: CleartextKeysetHandle.read", e3);
            on0Var = new on0(e3, null, null, 6);
            objAttabal = on0Var;
        }
        if (objAttabal instanceof nn0) {
            return (nn0) objAttabal;
        }
        Intrinsics.competently(objAttabal, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        try {
            discernable.attabal attabalVar = (discernable.attabal) ((formularize) ((tn0) objAttabal).b).adultoid(gintrap.attabal(), discernable.attabal.class);
            Charset charset = Charsets.UTF_8;
            byte[] bytes = requestId.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrAttabal = attabalVar.attabal(bArrDecode, bytes);
            Intrinsics.checkNotNullExpressionValue(bArrAttabal, "decrypt(...)");
            return new tn0(new String(bArrAttabal, charset));
        } catch (UnsupportedEncodingException e4) {
            ((d13) this.e).a("CryptoUtils.decrypt", e4);
            return new on0(e4, null, null, 6);
        } catch (GeneralSecurityException e5) {
            ((d13) this.e).a("CryptoUtils.decrypt", e5);
            return new on0(e5, null, null, 6);
        }
    }

    public final spartacist b() {
        try {
            try {
                jk0 jk0Var = this.f;
                jk0Var.getClass();
                Intrinsics.checkNotNullParameter("gads:block_init_on_crypto:enabled", X3.i.W);
                if (!((Boolean) jk0Var.a("gads:block_init_on_crypto:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                    try {
                        curiousness.attabal.dern();
                    } catch (GeneralSecurityException e) {
                        ((d13) this.e).a("CryptoUtil: AeadConfig.register()", e);
                    }
                }
                byte[] bArrEncode = Base64.encode(cord.saneness(formularize.kowloon(lotta.f24401attabal), beachfront.attabal()), 11);
                Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
                return new tn0(new String(bArrEncode, Charsets.UTF_8));
            } catch (IOException e2) {
                ((d13) this.e).a("CryptoUtils.generateKey", e2);
                return new on0(e2, null, null, 6);
            }
        } catch (GeneralSecurityException e3) {
            ((d13) this.e).a("CryptoUtils.generateKey", e3);
            return new on0(e3, null, null, 6);
        }
    }

    public final void c() {
        ri2 ri2Var = this.d;
        no0 no0Var = no0.CUI_NAME_SDKINIT_INIT_CRYPTO;
        List listFormularize = adultoid.formularize();
        l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
        if (j13.b().a == null) {
            v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
            try {
                try {
                    curiousness.attabal.dern();
                } catch (GeneralSecurityException e) {
                    ((d13) this.e).a("CryptoUtil: AeadConfig.register()", e);
                }
                Unit unit = Unit.f29295attabal;
                interaction.saneness.attabal(v62VarA, null);
                return;
            } catch (Throwable th) {
                try {
                    v62VarA.b(th);
                    if (th instanceof evenfall) {
                        throw th;
                    }
                    v62VarA.a(th);
                    if (th instanceof TimeoutCancellationException) {
                        throw new cp0(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new bn0(th);
                    }
                    if (!(th instanceof yn0)) {
                        throw new gn0(th);
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        interaction.saneness.attabal(v62VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
        try {
            try {
                curiousness.attabal.dern();
            } catch (GeneralSecurityException e2) {
                ((d13) this.e).a("CryptoUtil: AeadConfig.register()", e2);
            }
            Unit unit2 = Unit.f29295attabal;
            interaction.saneness.attabal(w03VarA, null);
        } catch (Throwable th4) {
            try {
                w03VarA.b(th4);
                if (th4 instanceof evenfall) {
                    throw th4;
                }
                w03VarA.a(th4);
                if (th4 instanceof TimeoutCancellationException) {
                    throw new cp0(th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new bn0(th4);
                }
                if (!(th4 instanceof yn0)) {
                    throw new gn0(th4);
                }
                throw th4;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    interaction.saneness.attabal(w03VarA, th5);
                    throw th6;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        ny nyVar;
        py pyVar;
        if (dernVar instanceof ny) {
            nyVar = (ny) dernVar;
            int i = nyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nyVar.d = i - Integer.MIN_VALUE;
            } else {
                nyVar = new ny(this, dernVar);
            }
        } else {
            nyVar = new ny(this, dernVar);
        }
        Object obj = nyVar.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = nyVar.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = this.f;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:block_init_on_crypto:enabled", X3.i.W);
            if (((Boolean) jk0Var.a("gads:block_init_on_crypto:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                c();
                return new tn0(Unit.f29295attabal);
            }
            nyVar.a = this;
            nyVar.d = 1;
            if (cosy.attabal(nyVar) == objBeachfront) {
                return objBeachfront;
            }
            pyVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pyVar = nyVar.a;
            p002kotlin.dern.saneness(obj);
        }
        saran saranVar = pyVar.c;
        oy block = new oy(pyVar, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        return new tn0(Unit.f29295attabal);
    }

    public static spartacist a(String adString) {
        Intrinsics.checkNotNullParameter(adString, "adString");
        int iUnderbelly = StringsKt.underbelly(adString, "&request_id=", 0, false, 6, null);
        if (iUnderbelly != -1) {
            String strSubstring = adString.substring(0, iUnderbelly);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = adString.substring(iUnderbelly + 12);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            return new tn0(new Pair(strSubstring, strSubstring2));
        }
        return new rn0("Invalid ad string, no request ID present", k41.INTERNAL_ERROR);
    }
}
