package ads_mobile_sdk;

import android.net.Uri;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import formularization.beachfront;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.gintrap;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.gerenuk;
import saneness.hemolysin;
import saneness.rajahmundry;

/* JADX INFO: loaded from: classes.dex */
public abstract class ya1 implements gerenuk {
    public final ri2 a;
    public final l13 b;
    public final ip0 c;
    public final saran d;
    public final jk0 e;
    public final formularization.attabal f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public final ej1 i;

    public ya1(ri2 rootTraceCreator, l13 traceMetaSet, ip0 gmaUtil, saran backgroundScope, jk0 flags) {
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = rootTraceCreator;
        this.b = traceMetaSet;
        this.c = gmaUtil;
        this.d = backgroundScope;
        this.e = flags;
        this.f = beachfront.saneness(false, 1, null);
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new ej1(null);
    }

    @Override // saneness.gerenuk
    public final Object a(gq0 gq0Var, Uri uri, wretchedly.dern dernVar) {
        return a(this, gq0Var, uri, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x027e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115 A[Catch: all -> 0x011c, TryCatch #5 {all -> 0x011c, blocks: (B:38:0x010b, B:40:0x0115, B:45:0x0121, B:47:0x0127, B:49:0x0141, B:51:0x0149), top: B:143:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149 A[Catch: all -> 0x011c, TRY_LEAVE, TryCatch #5 {all -> 0x011c, blocks: (B:38:0x010b, B:40:0x0115, B:45:0x0121, B:47:0x0127, B:49:0x0141, B:51:0x0149), top: B:143:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0191  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01da  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:77:0x0210  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d4, code lost:
    
        if (r8 == r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d4, code lost:
    
        if (r13.invoke(r4) == r5) goto L67;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0191, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v7, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(ads_mobile_sdk.ya1 r20, ads_mobile_sdk.gq0 r21, android.net.Uri r22, wretchedly.dern r23) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ya1.a(ads_mobile_sdk.ya1, ads_mobile_sdk.gq0, android.net.Uri, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.gerenuk
    public final Object a(gq0 gq0Var, String str, wretchedly.dern dernVar) {
        return a(this, str, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(ya1 ya1Var, String str, wretchedly.dern dernVar) {
        ta1 ta1Var;
        JsonObject jsonObject;
        if (dernVar instanceof ta1) {
            ta1Var = (ta1) dernVar;
            int i = ta1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ta1Var.e = i - Integer.MIN_VALUE;
            } else {
                ta1Var = new ta1(ya1Var, dernVar);
            }
        } else {
            ta1Var = new ta1(ya1Var, dernVar);
        }
        Object objA = ta1Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ta1Var.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            ej1 ej1Var = ya1Var.i;
            ta1Var.a = ya1Var;
            ta1Var.b = str;
            ta1Var.e = 1;
            objA = ej1Var.a(ta1Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    p002kotlin.dern.saneness(objA);
                    return Unit.f29295attabal;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = ta1Var.b;
            ya1Var = ta1Var.a;
            p002kotlin.dern.saneness(objA);
        }
        hg2 hg2Var = (hg2) objA;
        if (hg2Var == null) {
            kn0.c("Unknown/Unexpected GMSG without a handler: result", null);
            y13.a("Unknown/Unexpected GMSG without a handler: result", null, 6);
            return Unit.f29295attabal;
        }
        try {
            jsonObject = (JsonObject) new Gson().fromJson(str, JsonObject.class);
        } catch (Exception e) {
            List list = rajahmundry.attabal(e, "t", e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            Intrinsics.beachfront(message);
            list.add(message);
            jsonObject = null;
        }
        if (jsonObject == null) {
            return Unit.f29295attabal;
        }
        cutely.wireman(ya1Var.d, null, null, new ua1(new va1(ya1Var, hg2Var, jsonObject, null), null), 3, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.gerenuk
    public final Object a(String str, hemolysin hemolysinVar, wretchedly.dern dernVar) {
        return a(this, str, hemolysinVar, dernVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a3 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:34:0x0099, B:36:0x00a3, B:39:0x00ab), top: B:56:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r7.a(r10, r0) == r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(ads_mobile_sdk.ya1 r7, java.lang.String r8, saneness.hemolysin r9, wretchedly.dern r10) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ya1.a(ads_mobile_sdk.ya1, java.lang.String, saneness.hemolysin, wretchedly.dern):java.lang.Object");
    }

    @Override // saneness.gerenuk
    public final Object a(String str, gintrap gintrapVar, mp0 mp0Var) {
        return a(this, str, gintrapVar, mp0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r8.a(r6, r7, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(ads_mobile_sdk.ya1 r5, java.lang.String r6, kotlinx.coroutines.gintrap r7, wretchedly.dern r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.xa1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.xa1 r0 = (ads_mobile_sdk.xa1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.xa1 r0 = new ads_mobile_sdk.xa1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r8)
            goto L66
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlinx.coroutines.gintrap r7 = r0.b
            java.lang.String r6 = r0.a
            p002kotlin.dern.saneness(r8)
            goto L4e
        L3c:
            p002kotlin.dern.saneness(r8)
            ads_mobile_sdk.ej1 r5 = r5.i
            r0.a = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r5.a(r0)
            if (r8 != r1) goto L4e
            goto L65
        L4e:
            ads_mobile_sdk.hg2 r8 = (ads_mobile_sdk.hg2) r8
            if (r8 != 0) goto L58
            r5 = 0
            java.lang.Boolean r5 = igo.attabal.attabal(r5)
            return r5
        L58:
            r5 = 0
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r5 = r8.a(r6, r7, r0)
            if (r5 != r1) goto L66
        L65:
            return r1
        L66:
            java.lang.Boolean r5 = igo.attabal.attabal(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ya1.a(ads_mobile_sdk.ya1, java.lang.String, kotlinx.coroutines.gintrap, wretchedly.dern):java.lang.Object");
    }
}
