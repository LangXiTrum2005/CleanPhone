package com.google.android.gms.internal.auth;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f22825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f22826b;

    static {
        bc.i iVar = new bc.i(q.a(), true, true);
        Double dValueOf = Double.valueOf(0.0d);
        new r(iVar, "getTokenRefactor__account_data_service_sample_percentage", dValueOf, 2);
        iVar.m("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        iVar.l(20L, "getTokenRefactor__account_manager_timeout_seconds");
        iVar.l(0L, "getTokenRefactor__android_id_shift");
        try {
            f22825a = new r(iVar, "getTokenRefactor__blocked_packages", a2.j(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), 3);
            iVar.m("getTokenRefactor__chimera_get_token_evolved", true);
            iVar.l(20L, "getTokenRefactor__clear_token_timeout_seconds");
            iVar.l(20L, "getTokenRefactor__default_task_timeout_seconds");
            iVar.m("getTokenRefactor__gaul_accounts_api_evolved", false);
            f22826b = iVar.m("getTokenRefactor__gaul_token_api_evolved", false);
            iVar.l(120L, "getTokenRefactor__get_token_timeout_seconds");
            iVar.m("getTokenRefactor__gms_account_authenticator_evolved", true);
            new r(iVar, "getTokenRefactor__gms_account_authenticator_sample_percentage", dValueOf, 2);
        } catch (Exception e10) {
            throw new AssertionError(e10);
        }
    }
}
