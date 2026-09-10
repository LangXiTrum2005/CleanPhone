package ads_mobile_sdk;

import com.google.gson.JsonObject;
import com.ironsource.X3;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sn1 {
    public final hn1 a;

    public sn1(hn1 nativeAssetsLoader) {
        Intrinsics.checkNotNullParameter(nativeAssetsLoader, "nativeAssetsLoader");
        this.a = nativeAssetsLoader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(sn1 sn1Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        on1 on1Var;
        JsonObject asJsonObject;
        String str;
        sn1Var.getClass();
        if (dernVar instanceof on1) {
            on1Var = (on1) dernVar;
            int i = on1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                on1Var.d = i - Integer.MIN_VALUE;
            } else {
                on1Var = new on1(sn1Var, dernVar);
            }
        } else {
            on1Var = new on1(sn1Var, dernVar);
        }
        Object obj = on1Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = on1Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            String strA = cb1.a(jsonObject, "name", "");
            if (strA.length() != 0) {
                String strA2 = cb1.a(jsonObject, "type", "");
                if (Intrinsics.wireman(strA2, "string")) {
                    return new b30(strA, cb1.a(jsonObject, "string_value", ""));
                }
                if (Intrinsics.wireman(strA2, "image")) {
                    hn1 hn1Var = sn1Var.a;
                    on1Var.a = strA;
                    on1Var.d = 1;
                    hn1Var.getClass();
                    Intrinsics.checkNotNullParameter("image_value", X3.i.W);
                    if (jsonObject == null) {
                        asJsonObject = null;
                    } else {
                        try {
                            asJsonObject = jsonObject.getAsJsonObject("image_value");
                        } catch (Exception unused) {
                            asJsonObject = null;
                        }
                    }
                    Object objA = hn1Var.a(asJsonObject, hn1Var.a.getIsImageLoadingDisabled(), on1Var);
                    if (objA == objBeachfront) {
                        return objBeachfront;
                    }
                    obj = objA;
                    str = strA;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = on1Var.a;
        p002kotlin.dern.saneness(obj);
        g61 g61Var = (g61) obj;
        if (g61Var != null) {
            return new a30(str, g61Var);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0088 -> B:33:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.gson.JsonObject r7, java.lang.String r8, wretchedly.dern r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.pn1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.pn1 r0 = (ads_mobile_sdk.pn1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.pn1 r0 = new ads_mobile_sdk.pn1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.util.Iterator r7 = r0.b
            java.util.Collection r8 = r0.a
            p002kotlin.dern.saneness(r9)
            goto L8b
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            p002kotlin.dern.saneness(r9)
            goto L64
        L3c:
            p002kotlin.dern.saneness(r9)
            com.google.gson.JsonArray r7 = ads_mobile_sdk.cb1.d(r7, r8)
            if (r7 != 0) goto L4a
            java.util.List r7 = p002kotlin.collections.adultoid.formularize()
            return r7
        L4a:
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L55
            java.util.List r7 = p002kotlin.collections.adultoid.formularize()
            return r7
        L55:
            ads_mobile_sdk.rn1 r8 = new ads_mobile_sdk.rn1
            r9 = 0
            r8.<init>(r7, r6, r9)
            r0.e = r4
            java.lang.Object r9 = kotlinx.coroutines.privatdozent.marial(r8, r0)
            if (r9 != r1) goto L64
            goto L8a
        L64:
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r9.iterator()
            r5 = r8
            r8 = r7
            r7 = r5
        L72:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L93
            java.lang.Object r9 = r7.next()
            kotlinx.coroutines.walach r9 = (kotlinx.coroutines.walach) r9
            r0.a = r8
            r0.b = r7
            r0.e = r3
            java.lang.Object r9 = r9.dent(r0)
            if (r9 != r1) goto L8b
        L8a:
            return r1
        L8b:
            saneness.immediately r9 = (saneness.immediately) r9
            if (r9 == 0) goto L72
            r8.add(r9)
            goto L72
        L93:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sn1.a(com.google.gson.JsonObject, java.lang.String, wretchedly.dern):java.lang.Object");
    }
}
