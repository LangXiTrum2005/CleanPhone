package ads_mobile_sdk;

import android.graphics.Color;
import android.net.Uri;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import java.util.List;
import kotlinx.coroutines.saran;
import org.objectweb.asm.Opcodes;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.loun;
import saneness.solidaric;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class hn1 {
    public static final int h;
    public static final int i;
    public final com.google.android.libraries.ads.mobile.sdk.nativead.dern a;
    public final wl b;
    public final loun c;
    public final so1 d;
    public final g83 e;
    public final saran f;
    public final ri2 g;

    static {
        int iRgb = Color.rgb(12, Opcodes.FRETURN, 206);
        h = Color.rgb(204, 204, 204);
        i = iRgb;
    }

    public hn1(com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest, wl bitmapLoader, loun traceLogger, so1 nativeMediaAssetLoader, g83 webViewFactory, CoroutineContext uiContext, saran uiScope, ri2 traceCreator) {
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(bitmapLoader, "bitmapLoader");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(nativeMediaAssetLoader, "nativeMediaAssetLoader");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(traceCreator, "traceCreator");
        this.a = nativeRequest;
        this.b = bitmapLoader;
        this.c = traceLogger;
        this.d = nativeMediaAssetLoader;
        this.e = webViewFactory;
        this.f = uiScope;
        this.g = traceCreator;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(JsonObject jsonObject, String str, wretchedly.dern dernVar) {
        zm1 zm1Var;
        JsonObject jsonObject2;
        hn1 hn1Var;
        if (dernVar instanceof zm1) {
            zm1Var = (zm1) dernVar;
            int i2 = zm1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zm1Var.e = i2 - Integer.MIN_VALUE;
            } else {
                zm1Var = new zm1(this, dernVar);
            }
        } else {
            zm1Var = new zm1(this, dernVar);
        }
        Object obj = zm1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i3 = zm1Var.e;
        if (i3 == 0) {
            p002kotlin.dern.saneness(obj);
            JsonObject jsonObjectA = cb1.a(jsonObject, str, (JsonObject) null);
            if (jsonObjectA == null) {
                return null;
            }
            JsonArray jsonArrayD = cb1.d(jsonObjectA, "images");
            JsonObject jsonObjectA2 = cb1.a(jsonObjectA, "image", (JsonObject) null);
            if (jsonArrayD == null && jsonObjectA2 != null) {
                jsonArrayD = new JsonArray();
                jsonArrayD.add(jsonObjectA2);
            }
            zm1Var.a = this;
            zm1Var.b = jsonObjectA;
            zm1Var.e = 1;
            Object objA = a(jsonArrayD, zm1Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
            jsonObject2 = jsonObjectA;
            obj = objA;
            hn1Var = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jsonObject2 = zm1Var.b;
            hn1Var = zm1Var.a;
            p002kotlin.dern.saneness(obj);
        }
        List list = (List) obj;
        hn1Var.getClass();
        if (list.isEmpty()) {
            return null;
        }
        String strA = cb1.a(jsonObject2, "text", "");
        Integer numAttabal = solidaric.attabal(jsonObject2, "bg_color");
        Integer numAttabal2 = solidaric.attabal(jsonObject2, "text_color");
        int iA = cb1.a(jsonObject2, "text_size", -1);
        boolean zA = cb1.a(jsonObject2, "allow_pub_rendering", false);
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        int iA2 = cb1.a(jsonObject2, "animation_ms", 1000);
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        long jMolybdenite = p002kotlin.time.dern.molybdenite(iA2, durationUnit);
        long jMolybdenite2 = p002kotlin.time.dern.molybdenite(cb1.a(jsonObject2, "presentation_ms", 4000), durationUnit);
        int iIntValue = numAttabal != null ? numAttabal.intValue() : h;
        int iIntValue2 = numAttabal2 != null ? numAttabal2.intValue() : i;
        Integer numValueOf = iA > 0 ? Integer.valueOf(iA) : null;
        return new b41(strA, list, iIntValue, iIntValue2, numValueOf != null ? numValueOf.intValue() : 12, p002kotlin.time.saneness.polder(jMolybdenite2, jMolybdenite), hn1Var.a.getAdChoicesPlacement(), zA);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0125  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:70:0x0136  */
    /* JADX WARN: Code duplicated, block: B:72:0x013e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:77:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object a(JsonObject jsonObject, boolean z, wretchedly.dern dernVar) {
        an1 an1Var;
        int i2;
        String str;
        String str2;
        double d;
        hn1 hn1Var;
        int i3;
        spartacist on0Var;
        int i4;
        double d2;
        String str3;
        int i5;
        boolean asBoolean;
        JsonObject jsonObject2 = jsonObject;
        if (dernVar instanceof an1) {
            an1Var = (an1) dernVar;
            int i6 = an1Var.i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                an1Var.i = i6 - Integer.MIN_VALUE;
            } else {
                an1Var = new an1(this, dernVar);
            }
        } else {
            an1Var = new an1(this, dernVar);
        }
        an1 an1Var2 = an1Var;
        Object objA = an1Var2.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i7 = an1Var2.i;
        if (i7 == 0) {
            p002kotlin.dern.saneness(objA);
            if (jsonObject2 == null) {
                return null;
            }
            String strA = cb1.a(jsonObject2, "url", "");
            if (strA.length() == 0) {
                return null;
            }
            double dC = cb1.c(jsonObject2, "scale");
            boolean zA = cb1.a(jsonObject2, "is_transparent", true);
            int iA = cb1.a(jsonObject2, "width", -1);
            int iA2 = cb1.a(jsonObject2, "height", -1);
            if (z) {
                Uri uri = Uri.parse(strA);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                return new g61(null, uri, dC, iA, iA2);
            }
            i2 = iA2;
            try {
                wl wlVar = this.b;
                an1Var2.a = this;
                an1Var2.b = jsonObject2;
                an1Var2.c = strA;
                an1Var2.d = dC;
                an1Var2.e = iA;
                an1Var2.f = i2;
                an1Var2.i = 1;
                wlVar.getClass();
                str = strA;
                try {
                    objA = wl.a(wlVar, str, dC, zA, an1Var2);
                    if (objA == objBeachfront) {
                        return objBeachfront;
                    }
                    str2 = str;
                    d = dC;
                    hn1Var = this;
                    i3 = iA;
                    on0Var = (spartacist) objA;
                } catch (Exception e) {
                    e = e;
                    str2 = str;
                    d = dC;
                    hn1Var = this;
                    i3 = iA;
                    ((d13) hn1Var.c).a("Error loading bitmap.", e);
                    on0Var = new on0(e, null, null, 6);
                    i4 = i3;
                    d2 = d;
                    str3 = str2;
                    i5 = i2;
                    if (on0Var instanceof tn0) {
                        bn1 block = new bn1(on0Var, str3, d2, i4, i5);
                        Intrinsics.checkNotNullParameter(block, "block");
                        on0Var = new tn0(block.invoke());
                    } else if (!(on0Var instanceof nn0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.checkNotNullParameter("require", X3.i.W);
                    if (jsonObject2 == null) {
                        asBoolean = false;
                    } else {
                        Intrinsics.checkNotNullParameter(jsonObject2, "<this>");
                        Intrinsics.checkNotNullParameter("require", X3.i.W);
                        asBoolean = jsonObject2.get("require").getAsBoolean();
                    }
                    hn1Var.getClass();
                    if (on0Var instanceof tn0) {
                        return ((tn0) on0Var).b;
                    }
                    if (!(on0Var instanceof nn0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!asBoolean) {
                        kn0.b("Error during loading assets.", null);
                        return null;
                    }
                    throw new yn0((nn0) on0Var);
                }
            } catch (Exception e2) {
                e = e2;
                str = strA;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = an1Var2.f;
            i3 = an1Var2.e;
            d = an1Var2.d;
            str2 = an1Var2.c;
            JsonObject jsonObject3 = an1Var2.b;
            hn1Var = an1Var2.a;
            try {
                p002kotlin.dern.saneness(objA);
                i2 = i8;
                jsonObject2 = jsonObject3;
                try {
                    on0Var = (spartacist) objA;
                } catch (Exception e3) {
                    e = e3;
                    ((d13) hn1Var.c).a("Error loading bitmap.", e);
                    on0Var = new on0(e, null, null, 6);
                }
            } catch (Exception e4) {
                e = e4;
                i2 = i8;
                jsonObject2 = jsonObject3;
                ((d13) hn1Var.c).a("Error loading bitmap.", e);
                on0Var = new on0(e, null, null, 6);
                i4 = i3;
                d2 = d;
                str3 = str2;
                i5 = i2;
                if (on0Var instanceof tn0) {
                    bn1 block2 = new bn1(on0Var, str3, d2, i4, i5);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    try {
                        on0Var = new tn0(block2.invoke());
                    } catch (Exception e5) {
                        on0Var = new on0(e5, null, null, 6);
                    }
                } else if (!(on0Var instanceof nn0)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter("require", X3.i.W);
                if (jsonObject2 == null) {
                    asBoolean = false;
                } else {
                    try {
                        Intrinsics.checkNotNullParameter(jsonObject2, "<this>");
                        Intrinsics.checkNotNullParameter("require", X3.i.W);
                        asBoolean = jsonObject2.get("require").getAsBoolean();
                    } catch (Exception unused) {
                        asBoolean = false;
                    }
                }
                hn1Var.getClass();
                if (on0Var instanceof tn0) {
                    return ((tn0) on0Var).b;
                }
                if (!(on0Var instanceof nn0)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!asBoolean) {
                    kn0.b("Error during loading assets.", null);
                    return null;
                }
                throw new yn0((nn0) on0Var);
            }
        }
        i4 = i3;
        d2 = d;
        str3 = str2;
        i5 = i2;
        if (on0Var instanceof tn0) {
            bn1 block3 = new bn1(on0Var, str3, d2, i4, i5);
            Intrinsics.checkNotNullParameter(block3, "block");
            on0Var = new tn0(block3.invoke());
        } else if (!(on0Var instanceof nn0)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter("require", X3.i.W);
        if (jsonObject2 == null) {
            asBoolean = false;
        } else {
            Intrinsics.checkNotNullParameter(jsonObject2, "<this>");
            Intrinsics.checkNotNullParameter("require", X3.i.W);
            asBoolean = jsonObject2.get("require").getAsBoolean();
        }
        hn1Var.getClass();
        if (on0Var instanceof tn0) {
            return ((tn0) on0Var).b;
        }
        if (!(on0Var instanceof nn0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!asBoolean) {
            kn0.b("Error during loading assets.", null);
            return null;
        }
        throw new yn0((nn0) on0Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x007b -> B:30:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.gson.JsonArray r7, wretchedly.dern r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.cn1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.cn1 r0 = (ads_mobile_sdk.cn1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.cn1 r0 = new ads_mobile_sdk.cn1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.util.Iterator r7 = r0.b
            java.util.Collection r2 = r0.a
            p002kotlin.dern.saneness(r8)
            goto L7e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            p002kotlin.dern.saneness(r8)
            goto L58
        L3c:
            p002kotlin.dern.saneness(r8)
            if (r7 == 0) goto L89
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L48
            goto L89
        L48:
            ads_mobile_sdk.en1 r8 = new ads_mobile_sdk.en1
            r2 = 0
            r5 = 0
            r8.<init>(r6, r7, r2, r5)
            r0.e = r4
            java.lang.Object r8 = kotlinx.coroutines.privatdozent.marial(r8, r0)
            if (r8 != r1) goto L58
            goto L7d
        L58:
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
            r2 = r7
            r7 = r8
        L65:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L86
            java.lang.Object r8 = r7.next()
            kotlinx.coroutines.walach r8 = (kotlinx.coroutines.walach) r8
            r0.a = r2
            r0.b = r7
            r0.e = r3
            java.lang.Object r8 = r8.dent(r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            ads_mobile_sdk.g61 r8 = (ads_mobile_sdk.g61) r8
            if (r8 == 0) goto L65
            r2.add(r8)
            goto L65
        L86:
            java.util.List r2 = (java.util.List) r2
            return r2
        L89:
            java.util.List r7 = p002kotlin.collections.adultoid.formularize()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hn1.a(com.google.gson.JsonArray, wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.gson.JsonObject r12, ads_mobile_sdk.a22 r13, wretchedly.dern r14) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hn1.a(com.google.gson.JsonObject, ads_mobile_sdk.a22, wretchedly.dern):java.lang.Object");
    }
}
