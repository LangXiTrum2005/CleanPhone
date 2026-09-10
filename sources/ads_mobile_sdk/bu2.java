package ads_mobile_sdk;

import com.ironsource.X3;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.dhss;
import kotlinx.coroutines.saran;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.carport;
import saneness.collection;
import saneness.evenfall;
import saneness.gerenuk;
import saneness.goonda;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class bu2 extends cf0 implements carport {
    public final saran c;
    public final saran d;
    public final jk0 e;
    public final g83 f;
    public final goonda g;
    public final collection h;
    public final ri2 i;

    public bu2(saran uiScope, saran backgroundScope, jk0 flags, g83 webViewFactory, goonda jsContext, collection singletonNativeJavascriptEngineConfigurator, ri2 rootTraceCreator) {
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(jsContext, "jsContext");
        Intrinsics.checkNotNullParameter(singletonNativeJavascriptEngineConfigurator, "singletonNativeJavascriptEngineConfigurator");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.c = uiScope;
        this.d = backgroundScope;
        this.e = flags;
        this.f = webViewFactory;
        this.g = jsContext;
        this.h = singletonNativeJavascriptEngineConfigurator;
        this.i = rootTraceCreator;
    }

    @Override // ads_mobile_sdk.cf0
    public final Object a(String str, wretchedly.dern dernVar) {
        return a(this, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0204  */
    /* JADX WARN: Code duplicated, block: B:105:0x020d A[Catch: all -> 0x0045, TryCatch #8 {all -> 0x0045, blocks: (B:13:0x0040, B:103:0x0207, B:105:0x020d, B:107:0x0226), top: B:150:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0226 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #8 {all -> 0x0045, blocks: (B:13:0x0040, B:103:0x0207, B:105:0x020d, B:107:0x0226), top: B:150:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0245 A[Catch: all -> 0x0255, TryCatch #7 {all -> 0x0255, blocks: (B:114:0x023e, B:116:0x0245, B:118:0x024c, B:120:0x0250, B:122:0x0254, B:125:0x0258, B:126:0x025d, B:127:0x025e, B:128:0x0265, B:129:0x0266, B:130:0x026d, B:131:0x026e), top: B:149:0x023e }] */
    /* JADX WARN: Code duplicated, block: B:118:0x024c A[Catch: all -> 0x0255, TryCatch #7 {all -> 0x0255, blocks: (B:114:0x023e, B:116:0x0245, B:118:0x024c, B:120:0x0250, B:122:0x0254, B:125:0x0258, B:126:0x025d, B:127:0x025e, B:128:0x0265, B:129:0x0266, B:130:0x026d, B:131:0x026e), top: B:149:0x023e }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0250 A[Catch: all -> 0x0255, TryCatch #7 {all -> 0x0255, blocks: (B:114:0x023e, B:116:0x0245, B:118:0x024c, B:120:0x0250, B:122:0x0254, B:125:0x0258, B:126:0x025d, B:127:0x025e, B:128:0x0265, B:129:0x0266, B:130:0x026d, B:131:0x026e), top: B:149:0x023e }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0254 A[Catch: all -> 0x0255, TryCatch #7 {all -> 0x0255, blocks: (B:114:0x023e, B:116:0x0245, B:118:0x024c, B:120:0x0250, B:122:0x0254, B:125:0x0258, B:126:0x025d, B:127:0x025e, B:128:0x0265, B:129:0x0266, B:130:0x026d, B:131:0x026e), top: B:149:0x023e }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0258 A[Catch: all -> 0x0255, TryCatch #7 {all -> 0x0255, blocks: (B:114:0x023e, B:116:0x0245, B:118:0x024c, B:120:0x0250, B:122:0x0254, B:125:0x0258, B:126:0x025d, B:127:0x025e, B:128:0x0265, B:129:0x0266, B:130:0x026d, B:131:0x026e), top: B:149:0x023e }] */
    /* JADX WARN: Code duplicated, block: B:127:0x025e A[Catch: all -> 0x0255, TryCatch #7 {all -> 0x0255, blocks: (B:114:0x023e, B:116:0x0245, B:118:0x024c, B:120:0x0250, B:122:0x0254, B:125:0x0258, B:126:0x025d, B:127:0x025e, B:128:0x0265, B:129:0x0266, B:130:0x026d, B:131:0x026e), top: B:149:0x023e }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0266 A[Catch: all -> 0x0255, TryCatch #7 {all -> 0x0255, blocks: (B:114:0x023e, B:116:0x0245, B:118:0x024c, B:120:0x0250, B:122:0x0254, B:125:0x0258, B:126:0x025d, B:127:0x025e, B:128:0x0265, B:129:0x0266, B:130:0x026d, B:131:0x026e), top: B:149:0x023e }] */
    /* JADX WARN: Code duplicated, block: B:131:0x026e A[Catch: all -> 0x0255, TRY_LEAVE, TryCatch #7 {all -> 0x0255, blocks: (B:114:0x023e, B:116:0x0245, B:118:0x024c, B:120:0x0250, B:122:0x0254, B:125:0x0258, B:126:0x025d, B:127:0x025e, B:128:0x0265, B:129:0x0266, B:130:0x026d, B:131:0x026e), top: B:149:0x023e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133 A[Catch: all -> 0x0074, TryCatch #5 {all -> 0x0074, blocks: (B:28:0x006f, B:57:0x012d, B:59:0x0133, B:61:0x014c), top: B:146:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014c A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #5 {all -> 0x0074, blocks: (B:28:0x006f, B:57:0x012d, B:59:0x0133, B:61:0x014c), top: B:146:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x016b A[Catch: all -> 0x017b, TryCatch #10 {all -> 0x017b, blocks: (B:68:0x0164, B:70:0x016b, B:72:0x0172, B:74:0x0176, B:76:0x017a, B:79:0x017e, B:80:0x0183, B:81:0x0184, B:82:0x018b, B:83:0x018c, B:84:0x0193, B:85:0x0194), top: B:153:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0172 A[Catch: all -> 0x017b, TryCatch #10 {all -> 0x017b, blocks: (B:68:0x0164, B:70:0x016b, B:72:0x0172, B:74:0x0176, B:76:0x017a, B:79:0x017e, B:80:0x0183, B:81:0x0184, B:82:0x018b, B:83:0x018c, B:84:0x0193, B:85:0x0194), top: B:153:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0176 A[Catch: all -> 0x017b, TryCatch #10 {all -> 0x017b, blocks: (B:68:0x0164, B:70:0x016b, B:72:0x0172, B:74:0x0176, B:76:0x017a, B:79:0x017e, B:80:0x0183, B:81:0x0184, B:82:0x018b, B:83:0x018c, B:84:0x0193, B:85:0x0194), top: B:153:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x017a A[Catch: all -> 0x017b, TryCatch #10 {all -> 0x017b, blocks: (B:68:0x0164, B:70:0x016b, B:72:0x0172, B:74:0x0176, B:76:0x017a, B:79:0x017e, B:80:0x0183, B:81:0x0184, B:82:0x018b, B:83:0x018c, B:84:0x0193, B:85:0x0194), top: B:153:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x017e A[Catch: all -> 0x017b, TryCatch #10 {all -> 0x017b, blocks: (B:68:0x0164, B:70:0x016b, B:72:0x0172, B:74:0x0176, B:76:0x017a, B:79:0x017e, B:80:0x0183, B:81:0x0184, B:82:0x018b, B:83:0x018c, B:84:0x0193, B:85:0x0194), top: B:153:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0184 A[Catch: all -> 0x017b, TryCatch #10 {all -> 0x017b, blocks: (B:68:0x0164, B:70:0x016b, B:72:0x0172, B:74:0x0176, B:76:0x017a, B:79:0x017e, B:80:0x0183, B:81:0x0184, B:82:0x018b, B:83:0x018c, B:84:0x0193, B:85:0x0194), top: B:153:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x018c A[Catch: all -> 0x017b, TryCatch #10 {all -> 0x017b, blocks: (B:68:0x0164, B:70:0x016b, B:72:0x0172, B:74:0x0176, B:76:0x017a, B:79:0x017e, B:80:0x0183, B:81:0x0184, B:82:0x018b, B:83:0x018c, B:84:0x0193, B:85:0x0194), top: B:153:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0194 A[Catch: all -> 0x017b, TRY_LEAVE, TryCatch #10 {all -> 0x017b, blocks: (B:68:0x0164, B:70:0x016b, B:72:0x0172, B:74:0x0176, B:76:0x017a, B:79:0x017e, B:80:0x0183, B:81:0x0184, B:82:0x018b, B:83:0x018c, B:84:0x0193, B:85:0x0194), top: B:153:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r12v18, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ads_mobile_sdk.w03, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ads_mobile_sdk.v62, ads_mobile_sdk.w03, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r9v10, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r9v23, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r9v24, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static Object a(bu2 bu2Var, wretchedly.dern dernVar) {
        zt2 zt2Var;
        ?? r9;
        ?? A;
        ?? r10;
        ?? r12;
        boolean z;
        ?? r11;
        ?? r4;
        gq0 gq0Var;
        collection collectionVar;
        goonda goondaVar;
        bu2 bu2Var2;
        gq0 gq0Var2;
        ?? r3;
        bu2 bu2Var3;
        Object tn0Var;
        gq0 gq0Var3;
        collection collectionVar2;
        goonda goondaVar2;
        bu2 bu2Var4;
        gq0 gq0Var4;
        ?? r5;
        bu2 bu2Var5;
        Object tn0Var2;
        bu2 bu2Var6 = bu2Var;
        if (dernVar instanceof zt2) {
            zt2Var = (zt2) dernVar;
            int i = zt2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zt2Var.g = i - Integer.MIN_VALUE;
            } else {
                zt2Var = new zt2(bu2Var6, dernVar);
            }
        } else {
            zt2Var = new zt2(bu2Var6, dernVar);
        }
        Object objA = zt2Var.e;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        ?? A2 = zt2Var.g;
        try {
            switch (A2) {
                case 0:
                    p002kotlin.dern.saneness(objA);
                    ri2 ri2Var = bu2Var6.i;
                    no0 no0Var = no0.CUI_NAME_LOAD_NATIVE_JS_ENGINE;
                    List listFormularize = adultoid.formularize();
                    l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
                    if (j13.b().a == null) {
                        A2 = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                        try {
                            g83 g83Var = bu2Var6.f;
                            ia3 ia3Var = new ia3(ha3.DEFAULT, 0, 0, 14);
                            goonda goondaVar3 = bu2Var6.g;
                            zt2Var.a = bu2Var6;
                            zt2Var.b = A2;
                            zt2Var.c = A2;
                            z = true;
                            zt2Var.g = 1;
                            objA = g83Var.a(ia3Var, goondaVar3, zt2Var);
                            if (objA != objBeachfront) {
                                r11 = A2;
                                r4 = A2;
                                gq0Var = (gq0) objA;
                                gq0Var.setWillNotDraw(z);
                                collectionVar = bu2Var6.h;
                                goondaVar = bu2Var6.g;
                                zt2Var.a = bu2Var6;
                                zt2Var.b = r11;
                                zt2Var.c = r4;
                                zt2Var.d = gq0Var;
                                zt2Var.g = 2;
                                if (collectionVar.a(goondaVar, zt2Var) == objBeachfront) {
                                    bu2Var2 = bu2Var6;
                                    gq0Var2 = gq0Var;
                                    A2 = r4;
                                    r9 = r11;
                                    jk0 jk0Var = bu2Var2.e;
                                    jk0Var.getClass();
                                    Intrinsics.checkNotNullParameter("gads:native:engine_url_with_protocol", X3.i.W);
                                    Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", "defaultValue");
                                    String str = (String) jk0Var.a("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", zk.o);
                                    zt2Var.a = bu2Var2;
                                    zt2Var.b = r9;
                                    zt2Var.c = A2;
                                    zt2Var.d = gq0Var2;
                                    zt2Var.g = 3;
                                    objA = gq0Var2.b(str, zt2Var);
                                    if (objA != objBeachfront) {
                                        r3 = A2;
                                        bu2Var3 = bu2Var2;
                                        tn0Var = (spartacist) objA;
                                        if (tn0Var instanceof nn0) {
                                            cutely.wireman(bu2Var3.c, dhss.f32190kowloon, null, new au2(gq0Var2, null), 2, null);
                                            y13.a((nn0) tn0Var, false);
                                        } else {
                                            tn0Var = new tn0(new e51(gq0Var2, bu2Var3.d, bu2Var3.i, false));
                                        }
                                        interaction.saneness.attabal(r3, null);
                                        return tn0Var;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            r9 = A2;
                            try {
                                r9.b(th);
                                if (th instanceof evenfall) {
                                    throw th;
                                }
                                r9.a(th);
                                if (th instanceof TimeoutCancellationException) {
                                    throw new cp0(th);
                                }
                                if (th instanceof CancellationException) {
                                    throw new bn0(th);
                                }
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    interaction.saneness.attabal(A2, th2);
                                    throw th3;
                                }
                            }
                        }
                    } else {
                        A = j13.a(no0Var, adultoid.formularize(), true);
                        try {
                            g83 g83Var2 = bu2Var6.f;
                            ia3 ia3Var2 = new ia3(ha3.DEFAULT, 0, 0, 14);
                            goonda goondaVar4 = bu2Var6.g;
                            zt2Var.a = bu2Var6;
                            zt2Var.b = A;
                            zt2Var.c = A;
                            zt2Var.g = 4;
                            objA = g83Var2.a(ia3Var2, goondaVar4, zt2Var);
                            if (objA != objBeachfront) {
                                r12 = A;
                                A = A;
                                gq0Var3 = (gq0) objA;
                                gq0Var3.setWillNotDraw(true);
                                collectionVar2 = bu2Var6.h;
                                goondaVar2 = bu2Var6.g;
                                zt2Var.a = bu2Var6;
                                zt2Var.b = r12;
                                zt2Var.c = A;
                                zt2Var.d = gq0Var3;
                                zt2Var.g = 5;
                                if (collectionVar2.a(goondaVar2, zt2Var) != objBeachfront) {
                                    r10 = r12;
                                    bu2Var4 = bu2Var6;
                                    gq0Var4 = gq0Var3;
                                    A = A;
                                    jk0 jk0Var2 = bu2Var4.e;
                                    jk0Var2.getClass();
                                    Intrinsics.checkNotNullParameter("gads:native:engine_url_with_protocol", X3.i.W);
                                    Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", "defaultValue");
                                    String str2 = (String) jk0Var2.a("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", zk.o);
                                    zt2Var.a = bu2Var4;
                                    zt2Var.b = r10;
                                    zt2Var.c = A;
                                    zt2Var.d = gq0Var4;
                                    zt2Var.g = 6;
                                    objA = gq0Var4.b(str2, zt2Var);
                                    if (objA != objBeachfront) {
                                        r5 = A;
                                        bu2Var5 = bu2Var4;
                                        tn0Var2 = (spartacist) objA;
                                        if (tn0Var2 instanceof nn0) {
                                            cutely.wireman(bu2Var5.c, dhss.f32190kowloon, null, new au2(gq0Var4, null), 2, null);
                                            y13.a((nn0) tn0Var2, false);
                                        } else {
                                            tn0Var2 = new tn0(new e51(gq0Var4, bu2Var5.d, bu2Var5.i, false));
                                        }
                                        interaction.saneness.attabal(r5, null);
                                        return tn0Var2;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r10 = A;
                            try {
                                r10.b(th);
                                if (!(th instanceof evenfall)) {
                                    throw th;
                                }
                                r10.a(th);
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
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    interaction.saneness.attabal(A, th5);
                                    throw th6;
                                }
                            }
                        }
                    }
                    return objBeachfront;
                case 1:
                    A2 = zt2Var.c;
                    w03 w03Var = zt2Var.b;
                    bu2Var6 = zt2Var.a;
                    try {
                        p002kotlin.dern.saneness(objA);
                        r11 = w03Var;
                        z = true;
                        r4 = A2;
                        gq0Var = (gq0) objA;
                        gq0Var.setWillNotDraw(z);
                        collectionVar = bu2Var6.h;
                        goondaVar = bu2Var6.g;
                        zt2Var.a = bu2Var6;
                        zt2Var.b = r11;
                        zt2Var.c = r4;
                        zt2Var.d = gq0Var;
                        zt2Var.g = 2;
                        if (collectionVar.a(goondaVar, zt2Var) == objBeachfront) {
                            bu2Var2 = bu2Var6;
                            gq0Var2 = gq0Var;
                            A2 = r4;
                            r9 = r11;
                            jk0 jk0Var3 = bu2Var2.e;
                            jk0Var3.getClass();
                            Intrinsics.checkNotNullParameter("gads:native:engine_url_with_protocol", X3.i.W);
                            Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", "defaultValue");
                            String str3 = (String) jk0Var3.a("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", zk.o);
                            zt2Var.a = bu2Var2;
                            zt2Var.b = r9;
                            zt2Var.c = A2;
                            zt2Var.d = gq0Var2;
                            zt2Var.g = 3;
                            objA = gq0Var2.b(str3, zt2Var);
                            if (objA != objBeachfront) {
                                r3 = A2;
                                bu2Var3 = bu2Var2;
                                tn0Var = (spartacist) objA;
                                if (tn0Var instanceof nn0) {
                                    cutely.wireman(bu2Var3.c, dhss.f32190kowloon, null, new au2(gq0Var2, null), 2, null);
                                    y13.a((nn0) tn0Var, false);
                                } else {
                                    tn0Var = new tn0(new e51(gq0Var2, bu2Var3.d, bu2Var3.i, false));
                                }
                                interaction.saneness.attabal(r3, null);
                                return tn0Var;
                            }
                        }
                        return objBeachfront;
                    } catch (Throwable th7) {
                        th = th7;
                        r9 = w03Var;
                        r9.b(th);
                        if (th instanceof evenfall) {
                            throw th;
                        }
                        r9.a(th);
                        if (th instanceof TimeoutCancellationException) {
                            throw new cp0(th);
                        }
                        if (th instanceof CancellationException) {
                            throw new bn0(th);
                        }
                        if (th instanceof yn0) {
                            throw th;
                        }
                        throw new gn0(th);
                    }
                case 2:
                    gq0Var2 = zt2Var.d;
                    Closeable closeable = zt2Var.c;
                    w03 w03Var2 = zt2Var.b;
                    bu2Var2 = zt2Var.a;
                    p002kotlin.dern.saneness(objA);
                    A2 = closeable;
                    r9 = w03Var2;
                    jk0 jk0Var4 = bu2Var2.e;
                    jk0Var4.getClass();
                    Intrinsics.checkNotNullParameter("gads:native:engine_url_with_protocol", X3.i.W);
                    Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", "defaultValue");
                    String str4 = (String) jk0Var4.a("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", zk.o);
                    zt2Var.a = bu2Var2;
                    zt2Var.b = r9;
                    zt2Var.c = A2;
                    zt2Var.d = gq0Var2;
                    zt2Var.g = 3;
                    objA = gq0Var2.b(str4, zt2Var);
                    if (objA != objBeachfront) {
                        r3 = A2;
                        bu2Var3 = bu2Var2;
                        tn0Var = (spartacist) objA;
                        if (tn0Var instanceof nn0) {
                            cutely.wireman(bu2Var3.c, dhss.f32190kowloon, null, new au2(gq0Var2, null), 2, null);
                            y13.a((nn0) tn0Var, false);
                        } else {
                            tn0Var = new tn0(new e51(gq0Var2, bu2Var3.d, bu2Var3.i, false));
                        }
                        interaction.saneness.attabal(r3, null);
                        return tn0Var;
                    }
                    return objBeachfront;
                case 3:
                    gq0Var2 = zt2Var.d;
                    Closeable closeable2 = zt2Var.c;
                    w03 w03Var3 = zt2Var.b;
                    bu2Var3 = zt2Var.a;
                    try {
                        p002kotlin.dern.saneness(objA);
                        r3 = closeable2;
                        tn0Var = (spartacist) objA;
                        if (tn0Var instanceof nn0) {
                            cutely.wireman(bu2Var3.c, dhss.f32190kowloon, null, new au2(gq0Var2, null), 2, null);
                            y13.a((nn0) tn0Var, false);
                        } else {
                            tn0Var = new tn0(new e51(gq0Var2, bu2Var3.d, bu2Var3.i, false));
                        }
                        interaction.saneness.attabal(r3, null);
                        return tn0Var;
                    } catch (Throwable th8) {
                        th = th8;
                        r9 = w03Var3;
                        A2 = closeable2;
                        r9.b(th);
                        if (th instanceof evenfall) {
                            throw th;
                        }
                        r9.a(th);
                        if (th instanceof TimeoutCancellationException) {
                            throw new cp0(th);
                        }
                        if (th instanceof CancellationException) {
                            throw new bn0(th);
                        }
                        if (th instanceof yn0) {
                            throw th;
                        }
                        throw new gn0(th);
                    }
                case 4:
                    A = zt2Var.c;
                    r12 = zt2Var.b;
                    bu2Var6 = zt2Var.a;
                    try {
                        p002kotlin.dern.saneness(objA);
                        A = A;
                        r12 = r12;
                        gq0Var3 = (gq0) objA;
                        gq0Var3.setWillNotDraw(true);
                        collectionVar2 = bu2Var6.h;
                        goondaVar2 = bu2Var6.g;
                        zt2Var.a = bu2Var6;
                        zt2Var.b = r12;
                        zt2Var.c = A;
                        zt2Var.d = gq0Var3;
                        zt2Var.g = 5;
                        if (collectionVar2.a(goondaVar2, zt2Var) != objBeachfront) {
                            r10 = r12;
                            bu2Var4 = bu2Var6;
                            gq0Var4 = gq0Var3;
                            A = A;
                            jk0 jk0Var5 = bu2Var4.e;
                            jk0Var5.getClass();
                            Intrinsics.checkNotNullParameter("gads:native:engine_url_with_protocol", X3.i.W);
                            Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", "defaultValue");
                            String str5 = (String) jk0Var5.a("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", zk.o);
                            zt2Var.a = bu2Var4;
                            zt2Var.b = r10;
                            zt2Var.c = A;
                            zt2Var.d = gq0Var4;
                            zt2Var.g = 6;
                            objA = gq0Var4.b(str5, zt2Var);
                            if (objA != objBeachfront) {
                                r5 = A;
                                bu2Var5 = bu2Var4;
                                tn0Var2 = (spartacist) objA;
                                if (tn0Var2 instanceof nn0) {
                                    cutely.wireman(bu2Var5.c, dhss.f32190kowloon, null, new au2(gq0Var4, null), 2, null);
                                    y13.a((nn0) tn0Var2, false);
                                } else {
                                    tn0Var2 = new tn0(new e51(gq0Var4, bu2Var5.d, bu2Var5.i, false));
                                }
                                interaction.saneness.attabal(r5, null);
                                return tn0Var2;
                            }
                        }
                        return objBeachfront;
                    } catch (Throwable th9) {
                        th = th9;
                        r10 = r12;
                        r10.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        r10.a(th);
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
                case 5:
                    gq0Var4 = zt2Var.d;
                    A = zt2Var.c;
                    r10 = zt2Var.b;
                    bu2Var4 = zt2Var.a;
                    try {
                        p002kotlin.dern.saneness(objA);
                        A = A;
                        r10 = r10;
                        jk0 jk0Var6 = bu2Var4.e;
                        jk0Var6.getClass();
                        Intrinsics.checkNotNullParameter("gads:native:engine_url_with_protocol", X3.i.W);
                        Intrinsics.checkNotNullParameter("https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", "defaultValue");
                        String str6 = (String) jk0Var6.a("gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html", zk.o);
                        zt2Var.a = bu2Var4;
                        zt2Var.b = r10;
                        zt2Var.c = A;
                        zt2Var.d = gq0Var4;
                        zt2Var.g = 6;
                        objA = gq0Var4.b(str6, zt2Var);
                        if (objA != objBeachfront) {
                            r5 = A;
                            bu2Var5 = bu2Var4;
                            tn0Var2 = (spartacist) objA;
                            if (tn0Var2 instanceof nn0) {
                                cutely.wireman(bu2Var5.c, dhss.f32190kowloon, null, new au2(gq0Var4, null), 2, null);
                                y13.a((nn0) tn0Var2, false);
                            } else {
                                tn0Var2 = new tn0(new e51(gq0Var4, bu2Var5.d, bu2Var5.i, false));
                            }
                            interaction.saneness.attabal(r5, null);
                            return tn0Var2;
                        }
                        return objBeachfront;
                    } catch (Throwable th10) {
                        th = th10;
                        r10.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        r10.a(th);
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
                case 6:
                    gq0Var4 = zt2Var.d;
                    Closeable closeable3 = zt2Var.c;
                    w03 w03Var4 = zt2Var.b;
                    bu2Var5 = zt2Var.a;
                    try {
                        p002kotlin.dern.saneness(objA);
                        r5 = closeable3;
                        tn0Var2 = (spartacist) objA;
                        if (tn0Var2 instanceof nn0) {
                            cutely.wireman(bu2Var5.c, dhss.f32190kowloon, null, new au2(gq0Var4, null), 2, null);
                            y13.a((nn0) tn0Var2, false);
                        } else {
                            tn0Var2 = new tn0(new e51(gq0Var4, bu2Var5.d, bu2Var5.i, false));
                        }
                        interaction.saneness.attabal(r5, null);
                        return tn0Var2;
                    } catch (Throwable th11) {
                        th = th11;
                        r10 = w03Var4;
                        A = closeable3;
                        r10.b(th);
                        if (!(th instanceof evenfall)) {
                            throw th;
                        }
                        r10.a(th);
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
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th12) {
            th = th12;
        }
    }

    @Override // saneness.carport
    public final gerenuk a() {
        return this.g;
    }
}
