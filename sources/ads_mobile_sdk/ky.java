package ads_mobile_sdk;

import ads_mobile_sdk.ky;
import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.gintrap;
import kotlinx.coroutines.preprohormone;
import kotlinx.coroutines.saran;
import org.chromium.net.ConnectionMigrationOptions;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.QuicOptions;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.blighty;
import saneness.evenfall;
import saneness.godward;
import saneness.grout;
import saneness.hobby;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class ky extends godward {
    public final Context c;
    public final saran d;
    public final jk0 e;
    public final hobby f;
    public final ri2 g;
    public final blighty h;

    public ky(Context context, saran backgroundScope, jk0 flags, hobby httpClient, ri2 rootTraceCreator, blighty userAgentProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.c = context;
        this.d = backgroundScope;
        this.e = flags;
        this.f = httpClient;
        this.g = rootTraceCreator;
        this.h = userAgentProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static final Object a(ky kyVar, CronetProvider cronetProvider, gintrap gintrapVar, wretchedly.dern dernVar) {
        iy iyVar;
        CronetEngine.Builder builderCreateBuilder;
        Object objA;
        kyVar.getClass();
        if (dernVar instanceof iy) {
            iyVar = (iy) dernVar;
            int i = iyVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                iyVar.g = i - Integer.MIN_VALUE;
            } else {
                iyVar = new iy(kyVar, dernVar);
            }
        } else {
            iyVar = new iy(kyVar, dernVar);
        }
        Object obj = iyVar.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = iyVar.g;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                builderCreateBuilder = cronetProvider.createBuilder();
                blighty blightyVar = kyVar.h;
                iyVar.a = kyVar;
                iyVar.b = cronetProvider;
                iyVar.c = gintrapVar;
                iyVar.d = builderCreateBuilder;
                iyVar.g = 1;
                objA = blightyVar.a(iyVar);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CronetEngine.Builder builder = iyVar.d;
                gintrapVar = iyVar.c;
                cronetProvider = iyVar.b;
                ky kyVar2 = iyVar.a;
                p002kotlin.dern.saneness(obj);
                builderCreateBuilder = builder;
                kyVar = kyVar2;
                objA = obj;
            }
            CronetEngine.Builder userAgent = builderCreateBuilder.setUserAgent((String) objA);
            jk0 jk0Var = kyVar.e;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:cronet_quic:enabled", X3.i.W);
            Boolean bool = Boolean.TRUE;
            jk jkVar = zk.b;
            CronetEngine.Builder builderEnableQuic = userAgent.enableQuic(((Boolean) jk0Var.a("gads:cronet_quic:enabled", bool, jkVar)).booleanValue());
            jk0 jk0Var2 = kyVar.e;
            jk0Var2.getClass();
            Intrinsics.checkNotNullParameter("gads:cronet_http2:enabled", X3.i.W);
            CronetEngine.Builder builderEnableHttp2 = builderEnableQuic.enableHttp2(((Boolean) jk0Var2.a("gads:cronet_http2:enabled", bool, jkVar)).booleanValue());
            jk0 jk0Var3 = kyVar.e;
            jk0Var3.getClass();
            Intrinsics.checkNotNullParameter("gads:cronet_brotli:enabled", X3.i.W);
            CronetEngine.Builder builderEnableBrotli = builderEnableHttp2.enableBrotli(((Boolean) jk0Var3.a("gads:cronet_brotli:enabled", bool, jkVar)).booleanValue());
            jk0 jk0Var4 = kyVar.e;
            jk0Var4.getClass();
            Intrinsics.checkNotNullParameter("gads:cronet_cache_size_bytes", X3.i.W);
            ok okVar = zk.f;
            if (((Number) jk0Var4.a("gads:cronet_cache_size_bytes", 3145728, okVar)).intValue() > 0) {
                jk0 jk0Var5 = kyVar.e;
                jk0Var5.getClass();
                Intrinsics.checkNotNullParameter("gads:cronet_cache_size_bytes", X3.i.W);
                builderEnableBrotli.enableHttpCache(1, ((Number) jk0Var5.a("gads:cronet_cache_size_bytes", 3145728, okVar)).intValue());
            }
            QuicOptions.Builder builder2 = QuicOptions.builder();
            jk0 jk0Var6 = kyVar.e;
            jk0Var6.getClass();
            Intrinsics.checkNotNullParameter("gads:cronet_zero_rtt:enabled", X3.i.W);
            QuicOptions.Builder builderEnableTlsZeroRtt = builder2.enableTlsZeroRtt(((Boolean) jk0Var6.a("gads:cronet_zero_rtt:enabled", bool, jkVar)).booleanValue());
            jk0 jk0Var7 = kyVar.e;
            jk0Var7.getClass();
            Intrinsics.checkNotNullParameter("gads:cronet_bbr:enabled", X3.i.W);
            if (((Boolean) jk0Var7.a("gads:cronet_bbr:enabled", bool, jkVar)).booleanValue()) {
                builderEnableTlsZeroRtt.addClientConnectionOption("TBBR");
            }
            builderEnableBrotli.setQuicOptions(builderEnableTlsZeroRtt);
            ConnectionMigrationOptions.Builder builder3 = ConnectionMigrationOptions.builder();
            jk0 jk0Var8 = kyVar.e;
            jk0Var8.getClass();
            Intrinsics.checkNotNullParameter("gads:cronet_server_migration:enabled", X3.i.W);
            if (((Boolean) jk0Var8.a("gads:cronet_server_migration:enabled", bool, jkVar)).booleanValue()) {
                builder3.allowServerMigration(true);
            }
            jk0 jk0Var9 = kyVar.e;
            jk0Var9.getClass();
            Intrinsics.checkNotNullParameter("gads:cronet_path_degradation_migration:enabled", X3.i.W);
            if (((Boolean) jk0Var9.a("gads:cronet_path_degradation_migration:enabled", bool, jkVar)).booleanValue()) {
                builder3.enablePathDegradationMigration(true);
            }
            builderEnableBrotli.setConnectionMigrationOptions(builder3);
            hobby hobbyVar = kyVar.f;
            imposure.saneness sanenessVarAttabal = imposure.saneness.marial(builderEnableBrotli.build()).attabal();
            Intrinsics.checkNotNullExpressionValue(sanenessVarAttabal, "build(...)");
            hobbyVar.a(sanenessVarAttabal);
            gintrapVar.saran(new tn0(cronetProvider.getName()));
        } catch (Throwable th) {
            gintrapVar.saran(new on0(th, null, "Exception caught building cronet engine", 2));
        }
        return Unit.f29295attabal;
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:20:0x0042, B:31:0x009c, B:33:0x00a2, B:37:0x00bc, B:34:0x00b3, B:36:0x00b7), top: B:108:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:20:0x0042, B:31:0x009c, B:33:0x00a2, B:37:0x00bc, B:34:0x00b3, B:36:0x00b7), top: B:108:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7 A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:20:0x0042, B:31:0x009c, B:33:0x00a2, B:37:0x00bc, B:34:0x00b3, B:36:0x00b7), top: B:108:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce A[Catch: all -> 0x00de, TryCatch #6 {all -> 0x00de, blocks: (B:41:0x00c7, B:43:0x00ce, B:45:0x00d5, B:47:0x00d9, B:49:0x00dd, B:52:0x00e0, B:53:0x00e5, B:54:0x00e6, B:55:0x00ed, B:56:0x00ee, B:57:0x00f5, B:58:0x00f6), top: B:113:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5 A[Catch: all -> 0x00de, TryCatch #6 {all -> 0x00de, blocks: (B:41:0x00c7, B:43:0x00ce, B:45:0x00d5, B:47:0x00d9, B:49:0x00dd, B:52:0x00e0, B:53:0x00e5, B:54:0x00e6, B:55:0x00ed, B:56:0x00ee, B:57:0x00f5, B:58:0x00f6), top: B:113:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9 A[Catch: all -> 0x00de, TryCatch #6 {all -> 0x00de, blocks: (B:41:0x00c7, B:43:0x00ce, B:45:0x00d5, B:47:0x00d9, B:49:0x00dd, B:52:0x00e0, B:53:0x00e5, B:54:0x00e6, B:55:0x00ed, B:56:0x00ee, B:57:0x00f5, B:58:0x00f6), top: B:113:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd A[Catch: all -> 0x00de, TryCatch #6 {all -> 0x00de, blocks: (B:41:0x00c7, B:43:0x00ce, B:45:0x00d5, B:47:0x00d9, B:49:0x00dd, B:52:0x00e0, B:53:0x00e5, B:54:0x00e6, B:55:0x00ed, B:56:0x00ee, B:57:0x00f5, B:58:0x00f6), top: B:113:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0 A[Catch: all -> 0x00de, TryCatch #6 {all -> 0x00de, blocks: (B:41:0x00c7, B:43:0x00ce, B:45:0x00d5, B:47:0x00d9, B:49:0x00dd, B:52:0x00e0, B:53:0x00e5, B:54:0x00e6, B:55:0x00ed, B:56:0x00ee, B:57:0x00f5, B:58:0x00f6), top: B:113:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6 A[Catch: all -> 0x00de, TryCatch #6 {all -> 0x00de, blocks: (B:41:0x00c7, B:43:0x00ce, B:45:0x00d5, B:47:0x00d9, B:49:0x00dd, B:52:0x00e0, B:53:0x00e5, B:54:0x00e6, B:55:0x00ed, B:56:0x00ee, B:57:0x00f5, B:58:0x00f6), top: B:113:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee A[Catch: all -> 0x00de, TryCatch #6 {all -> 0x00de, blocks: (B:41:0x00c7, B:43:0x00ce, B:45:0x00d5, B:47:0x00d9, B:49:0x00dd, B:52:0x00e0, B:53:0x00e5, B:54:0x00e6, B:55:0x00ed, B:56:0x00ee, B:57:0x00f5, B:58:0x00f6), top: B:113:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6 A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #6 {all -> 0x00de, blocks: (B:41:0x00c7, B:43:0x00ce, B:45:0x00d5, B:47:0x00d9, B:49:0x00dd, B:52:0x00e0, B:53:0x00e5, B:54:0x00e6, B:55:0x00ed, B:56:0x00ee, B:57:0x00f5, B:58:0x00f6), top: B:113:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x012d A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002e, B:68:0x0127, B:70:0x012d, B:74:0x0147, B:71:0x013e, B:73:0x0142), top: B:104:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:71:0x013e A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002e, B:68:0x0127, B:70:0x012d, B:74:0x0147, B:71:0x013e, B:73:0x0142), top: B:104:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0142 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002e, B:68:0x0127, B:70:0x012d, B:74:0x0147, B:71:0x013e, B:73:0x0142), top: B:104:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x015a A[Catch: all -> 0x016a, TryCatch #5 {all -> 0x016a, blocks: (B:80:0x0153, B:82:0x015a, B:84:0x0161, B:86:0x0165, B:88:0x0169, B:91:0x016c, B:92:0x0171, B:93:0x0172, B:94:0x0179, B:95:0x017a, B:96:0x0181, B:97:0x0182), top: B:112:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0161 A[Catch: all -> 0x016a, TryCatch #5 {all -> 0x016a, blocks: (B:80:0x0153, B:82:0x015a, B:84:0x0161, B:86:0x0165, B:88:0x0169, B:91:0x016c, B:92:0x0171, B:93:0x0172, B:94:0x0179, B:95:0x017a, B:96:0x0181, B:97:0x0182), top: B:112:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0165 A[Catch: all -> 0x016a, TryCatch #5 {all -> 0x016a, blocks: (B:80:0x0153, B:82:0x015a, B:84:0x0161, B:86:0x0165, B:88:0x0169, B:91:0x016c, B:92:0x0171, B:93:0x0172, B:94:0x0179, B:95:0x017a, B:96:0x0181, B:97:0x0182), top: B:112:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0169 A[Catch: all -> 0x016a, TryCatch #5 {all -> 0x016a, blocks: (B:80:0x0153, B:82:0x015a, B:84:0x0161, B:86:0x0165, B:88:0x0169, B:91:0x016c, B:92:0x0171, B:93:0x0172, B:94:0x0179, B:95:0x017a, B:96:0x0181, B:97:0x0182), top: B:112:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x016c A[Catch: all -> 0x016a, TryCatch #5 {all -> 0x016a, blocks: (B:80:0x0153, B:82:0x015a, B:84:0x0161, B:86:0x0165, B:88:0x0169, B:91:0x016c, B:92:0x0171, B:93:0x0172, B:94:0x0179, B:95:0x017a, B:96:0x0181, B:97:0x0182), top: B:112:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0172 A[Catch: all -> 0x016a, TryCatch #5 {all -> 0x016a, blocks: (B:80:0x0153, B:82:0x015a, B:84:0x0161, B:86:0x0165, B:88:0x0169, B:91:0x016c, B:92:0x0171, B:93:0x0172, B:94:0x0179, B:95:0x017a, B:96:0x0181, B:97:0x0182), top: B:112:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x017a A[Catch: all -> 0x016a, TryCatch #5 {all -> 0x016a, blocks: (B:80:0x0153, B:82:0x015a, B:84:0x0161, B:86:0x0165, B:88:0x0169, B:91:0x016c, B:92:0x0171, B:93:0x0172, B:94:0x0179, B:95:0x017a, B:96:0x0181, B:97:0x0182), top: B:112:0x0153 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0182 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #5 {all -> 0x016a, blocks: (B:80:0x0153, B:82:0x015a, B:84:0x0161, B:86:0x0165, B:88:0x0169, B:91:0x016c, B:92:0x0171, B:93:0x0172, B:94:0x0179, B:95:0x017a, B:96:0x0181, B:97:0x0182), top: B:112:0x0153 }] */
    public final Object f(wretchedly.dern dernVar) {
        gy gyVar;
        w03 w03Var;
        TimeoutCancellationException th;
        w03 w03Var2;
        w03 w03Var3;
        TimeoutCancellationException th2;
        w03 w03Var4;
        spartacist spartacistVar;
        spartacist spartacistVar2;
        if (dernVar instanceof gy) {
            gyVar = (gy) dernVar;
            int i = gyVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gyVar.e = i - Integer.MIN_VALUE;
            } else {
                gyVar = new gy(this, dernVar);
            }
        } else {
            gyVar = new gy(this, dernVar);
        }
        Object obj = gyVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = gyVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            ri2 ri2Var = this.g;
            no0 no0Var = no0.CUI_NAME_INSTALL_CRONET;
            List listFormularize = adultoid.formularize();
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                v62 v62VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    final gintrap gintrapVarDern = preprohormone.dern(null, 1, null);
                    CronetProviderInstaller.installProvider(this.c).addOnCompleteListener(new OnCompleteListener() { // from class: saneness.ingathering
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            ky.a(gintrapVarDern, this, task);
                        }
                    });
                    gyVar.a = v62VarA;
                    gyVar.b = v62VarA;
                    gyVar.e = 1;
                    Object objDent = gintrapVarDern.dent(gyVar);
                    if (objDent != objBeachfront) {
                        w03Var3 = v62VarA;
                        obj = objDent;
                        w03Var4 = w03Var3;
                        spartacistVar = (spartacist) obj;
                        if (spartacistVar instanceof tn0) {
                            j13.a().e().z = (String) ((tn0) spartacistVar).b;
                        } else if (spartacistVar instanceof nn0) {
                            y13.a((nn0) spartacistVar, false);
                        }
                        Unit unit = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var3, null);
                    }
                } catch (Throwable th3) {
                    w03Var3 = v62VarA;
                    th2 = th3;
                    w03Var4 = w03Var3;
                    w03Var4.b(th2);
                    if (!(th2 instanceof evenfall)) {
                        throw th2;
                    }
                    w03Var4.a(th2);
                    if (!(th2 instanceof TimeoutCancellationException)) {
                        throw new cp0(th2);
                    }
                    if (!(th2 instanceof CancellationException)) {
                        throw new bn0(th2);
                    }
                    if (th2 instanceof yn0) {
                        throw th2;
                    }
                    throw new gn0(th2);
                }
            } else {
                w03 w03VarA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    final gintrap gintrapVarDern2 = preprohormone.dern(null, 1, null);
                    CronetProviderInstaller.installProvider(this.c).addOnCompleteListener(new OnCompleteListener() { // from class: saneness.ingathering
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            ky.a(gintrapVarDern2, this, task);
                        }
                    });
                    gyVar.a = w03VarA;
                    gyVar.b = w03VarA;
                    gyVar.e = 2;
                    Object objDent2 = gintrapVarDern2.dent(gyVar);
                    if (objDent2 != objBeachfront) {
                        w03Var = w03VarA;
                        obj = objDent2;
                        w03Var2 = w03Var;
                        spartacistVar2 = (spartacist) obj;
                        if (spartacistVar2 instanceof tn0) {
                            j13.a().e().z = (String) ((tn0) spartacistVar2).b;
                        } else if (spartacistVar2 instanceof nn0) {
                            y13.a((nn0) spartacistVar2, false);
                        }
                        Unit unit2 = Unit.f29295attabal;
                        interaction.saneness.attabal(w03Var, null);
                    }
                } catch (Throwable th4) {
                    w03Var = w03VarA;
                    th = th4;
                    w03Var2 = w03Var;
                    w03Var2.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03Var2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                }
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            w03Var3 = gyVar.b;
            w03Var4 = gyVar.a;
            try {
                p002kotlin.dern.saneness(obj);
                spartacistVar = (spartacist) obj;
                if (spartacistVar instanceof tn0) {
                    j13.a().e().z = (String) ((tn0) spartacistVar).b;
                } else if (spartacistVar instanceof nn0) {
                    y13.a((nn0) spartacistVar, false);
                }
                Unit unit3 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var3, null);
            } catch (Throwable th5) {
                th2 = th5;
                try {
                    w03Var4.b(th2);
                    if (!(th2 instanceof evenfall)) {
                        throw th2;
                    }
                    w03Var4.a(th2);
                    if (!(th2 instanceof TimeoutCancellationException)) {
                        throw new cp0(th2);
                    }
                    if (!(th2 instanceof CancellationException)) {
                        throw new bn0(th2);
                    }
                    if (th2 instanceof yn0) {
                        throw th2;
                    }
                    throw new gn0(th2);
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        interaction.saneness.attabal(w03Var3, th6);
                        throw th7;
                    }
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w03Var = gyVar.b;
            w03Var2 = gyVar.a;
            try {
                p002kotlin.dern.saneness(obj);
                spartacistVar2 = (spartacist) obj;
                if (spartacistVar2 instanceof tn0) {
                    j13.a().e().z = (String) ((tn0) spartacistVar2).b;
                } else if (spartacistVar2 instanceof nn0) {
                    y13.a((nn0) spartacistVar2, false);
                }
                Unit unit4 = Unit.f29295attabal;
                interaction.saneness.attabal(w03Var, null);
            } catch (Throwable th8) {
                th = th8;
                try {
                    w03Var2.b(th);
                    if (!(th instanceof evenfall)) {
                        throw th;
                    }
                    w03Var2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        throw new cp0(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new bn0(th);
                    }
                    if (th instanceof yn0) {
                        throw th;
                    }
                    throw new gn0(th);
                } catch (Throwable th9) {
                    try {
                        throw th9;
                    } catch (Throwable th10) {
                        interaction.saneness.attabal(w03Var, th9);
                        throw th10;
                    }
                }
            }
        }
        return Unit.f29295attabal;
    }

    public static final void a(gintrap cronetDeferred, ky this$0, Task task) {
        Object next;
        Intrinsics.checkNotNullParameter(cronetDeferred, "$cronetDeferred");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if (exception != null) {
                cronetDeferred.saran(new on0(exception, null, null, 6));
                return;
            } else {
                cronetDeferred.saran(new rn0("CronetProviderInstaller failed without an exception.", k41.INTERNAL_ERROR));
                return;
            }
        }
        List<CronetProvider> allProviders = CronetProvider.getAllProviders(this$0.c);
        Intrinsics.checkNotNullExpressionValue(allProviders, "getAllProviders(...)");
        Iterator<T> it = allProviders.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CronetProvider cronetProvider = (CronetProvider) next;
            if (cronetProvider.isEnabled() && !Intrinsics.wireman(cronetProvider.getName(), CronetProvider.PROVIDER_NAME_FALLBACK)) {
                String name = cronetProvider.getName();
                jk0 jk0Var = this$0.e;
                grout.attabal(jk0Var, "gads:cronet_provider", X3.i.W, "", "defaultValue");
                xk xkVar = zk.o;
                if (Intrinsics.wireman(name, (String) jk0Var.a("gads:cronet_provider", "", xkVar))) {
                    break;
                }
                jk0 jk0Var2 = this$0.e;
                grout.attabal(jk0Var2, "gads:cronet_provider", X3.i.W, "", "defaultValue");
                if (StringsKt.empress((String) jk0Var2.a("gads:cronet_provider", "", xkVar))) {
                    break;
                }
            }
        }
        CronetProvider cronetProvider2 = (CronetProvider) next;
        if (cronetProvider2 == null) {
            cronetDeferred.saran(new rn0("No available cronet provider", k41.INTERNAL_ERROR));
            return;
        }
        saran saranVar = this$0.d;
        hy block = new hy(this$0, cronetProvider2, cronetDeferred, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r8.f(r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.ky r8, wretchedly.dern r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.jy
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.jy r0 = (ads_mobile_sdk.jy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.jy r0 = new ads_mobile_sdk.jy
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r9)
            goto L8b
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            ads_mobile_sdk.ky r8 = r0.a
            p002kotlin.dern.saneness(r9)
            goto L7f
        L3a:
            p002kotlin.dern.saneness(r9)
            ads_mobile_sdk.jk0 r9 = r8.e
            r9.getClass()
            java.lang.String r2 = "gads:use_cronet_if_available"
            java.lang.String r5 = "key"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            ads_mobile_sdk.jk r7 = ads_mobile_sdk.zk.b
            java.lang.Object r9 = r9.a(r2, r6, r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8b
            ads_mobile_sdk.jk0 r9 = r8.e
            r9.getClass()
            kotlin.time.saneness$attabal r2 = p002kotlin.time.saneness.INSTANCE
            kotlin.time.DurationUnit r2 = p002kotlin.time.DurationUnit.MINUTES
            java.lang.String r6 = "gads:cronet_install_delay_secs"
            kotlin.time.saneness r2 = saneness.juju.attabal(r4, r2, r6, r5)
            ads_mobile_sdk.vk r5 = ads_mobile_sdk.zk.l
            java.lang.Object r9 = r9.a(r6, r2, r5)
            kotlin.time.saneness r9 = (p002kotlin.time.saneness) r9
            long r5 = r9.getRawValue()
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = kotlinx.coroutines.splinterproof.saneness(r5, r0)
            if (r9 != r1) goto L7f
            goto L8a
        L7f:
            r9 = 0
            r0.a = r9
            r0.d = r3
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r1) goto L8b
        L8a:
            return r1
        L8b:
            ads_mobile_sdk.tn0 r8 = new ads_mobile_sdk.tn0
            kotlin.Unit r9 = p002kotlin.Unit.f29295attabal
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ky.a(ads_mobile_sdk.ky, wretchedly.dern):java.lang.Object");
    }
}
