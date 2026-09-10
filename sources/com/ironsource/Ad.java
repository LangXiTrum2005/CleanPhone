package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ad {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25644b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f25645c = "type";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f25646d = "single";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f25647e = "onShowSuccess";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f25648f = "onLoadSuccess";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0637w6.c f25649a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public Ad(JSONObject features) {
        InterfaceC0637w6.c cVar;
        kotlin.jvm.internal.n.f(features, "features");
        String strOptString = features.optString("type");
        if (strOptString == null) {
            cVar = null;
        } else {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -1900843810) {
                if (iHashCode != -999907609) {
                    if (iHashCode == -902265784 && strOptString.equals(f25646d)) {
                        cVar = InterfaceC0637w6.c.SINGLE;
                    } else {
                        cVar = null;
                    }
                } else if (strOptString.equals(f25647e)) {
                    cVar = InterfaceC0637w6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                } else {
                    cVar = null;
                }
            } else if (strOptString.equals(f25648f)) {
                cVar = InterfaceC0637w6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            } else {
                cVar = null;
            }
        }
        this.f25649a = cVar;
    }

    public final InterfaceC0637w6.c a() {
        return this.f25649a;
    }
}
