package ads_mobile_sdk;

import com.ironsource.X3;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.derbyshire;

/* JADX INFO: loaded from: classes.dex */
public final class c33 extends un {
    public final iv l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c33(iv consentManager, jk0 flags, x activityTracker, ri2 rootTraceCreator, amphitheatre clock, saran backgroundScope) {
        super(clock, backgroundScope, rootTraceCreator, flags, activityTracker);
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.l = consentManager;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.TRUSTLESS_TOKEN;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r8 == r1) goto L30;
     */
    @Override // saneness.portwide
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(wretchedly.dern r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.a33
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.a33 r0 = (ads_mobile_sdk.a33) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.a33 r0 = new ads_mobile_sdk.a33
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p002kotlin.dern.saneness(r8)
            goto L87
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            p002kotlin.dern.saneness(r8)
            goto L67
        L38:
            p002kotlin.dern.saneness(r8)
            ads_mobile_sdk.jk0 r8 = r7.f
            saneness.derbyshire r8 = r8.r
            r8.getClass()
            java.lang.String r2 = "key"
            java.lang.String r5 = "gads:trustless_token_caching_in_signal_source_enabled"
            p002kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            ads_mobile_sdk.jk r6 = ads_mobile_sdk.zk.b
            java.lang.Object r8 = r8.a(r5, r2, r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L79
            ads_mobile_sdk.iv r8 = r7.l
            r0.c = r4
            r8.getClass()
            java.lang.Object r8 = ads_mobile_sdk.iv.g(r8, r0)
            if (r8 != r1) goto L67
            goto L86
        L67:
            saneness.spartacist r8 = (saneness.spartacist) r8
            if (r8 == 0) goto L99
            boolean r0 = r8 instanceof ads_mobile_sdk.nn0
            if (r0 == 0) goto L72
            ads_mobile_sdk.nn0 r8 = (ads_mobile_sdk.nn0) r8
            return r8
        L72:
            ads_mobile_sdk.tn0 r8 = (ads_mobile_sdk.tn0) r8
            java.lang.Object r8 = r8.b
            java.lang.String r8 = (java.lang.String) r8
            goto L9a
        L79:
            ads_mobile_sdk.iv r8 = r7.l
            r0.c = r3
            r8.getClass()
            java.lang.Object r8 = ads_mobile_sdk.iv.h(r8, r0)
            if (r8 != r1) goto L87
        L86:
            return r1
        L87:
            saneness.spartacist r8 = (saneness.spartacist) r8
            if (r8 == 0) goto L99
            boolean r0 = r8 instanceof ads_mobile_sdk.nn0
            if (r0 == 0) goto L92
            ads_mobile_sdk.nn0 r8 = (ads_mobile_sdk.nn0) r8
            return r8
        L92:
            ads_mobile_sdk.tn0 r8 = (ads_mobile_sdk.tn0) r8
            java.lang.Object r8 = r8.b
            java.lang.String r8 = (java.lang.String) r8
            goto L9a
        L99:
            r8 = 0
        L9a:
            ads_mobile_sdk.tn0 r0 = new ads_mobile_sdk.tn0
            ads_mobile_sdk.z23 r1 = new ads_mobile_sdk.z23
            r1.<init>(r8)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.c33.c(wretchedly.dern):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ads_mobile_sdk.un
    public final Object f(wretchedly.dern dernVar) {
        b33 b33Var;
        c33 c33Var;
        if (dernVar instanceof b33) {
            b33Var = (b33) dernVar;
            int i = b33Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                b33Var.d = i - Integer.MIN_VALUE;
            } else {
                b33Var = new b33(this, dernVar);
            }
        } else {
            b33Var = new b33(this, dernVar);
        }
        Object objJ = b33Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = b33Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objJ);
            derbyshire derbyshireVar = this.f.r;
            derbyshireVar.getClass();
            Intrinsics.checkNotNullParameter("gads:trustless_token_caching_in_signal_source_enabled", X3.i.W);
            if (((Boolean) derbyshireVar.a("gads:trustless_token_caching_in_signal_source_enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                iv ivVar = this.l;
                b33Var.a = this;
                b33Var.d = 1;
                ivVar.getClass();
                objJ = iv.j(ivVar, b33Var);
                if (objJ != objBeachfront) {
                    c33Var = this;
                }
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objJ);
            return objJ;
        }
        c33Var = b33Var.a;
        p002kotlin.dern.saneness(objJ);
        if (((Boolean) objJ).booleanValue()) {
            b33Var.a = null;
            b33Var.d = 2;
            c33Var.getClass();
            Object objB = un.b(c33Var, b33Var);
            return objB == objBeachfront ? objBeachfront : objB;
        }
        return null;
    }
}
