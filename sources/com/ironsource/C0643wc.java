package com.ironsource;

import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0643wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0454m2 f30953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30954b;

    /* JADX INFO: renamed from: com.ironsource.wc$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30955a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f30956b = "adm";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f30957c = "isOneFlow";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f30958d = "isMultipleAdObjects";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f30959e = "adsInternalInfo";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f30960f = "success";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f30961g = "error";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f30962h = "data";

        private a() {
        }
    }

    public C0643wc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final HashMap<String, String> a() {
        C0543r2 c0543r2G;
        HashMap<String, String> map = new HashMap<>();
        map.put("isOneFlow", String.valueOf(this.f30954b));
        map.put("isMultipleAdObjects", com.ironsource.mediationsdk.metadata.a.f29610g);
        List<P> listA = Kb.f26413u.d().I().a();
        String string = listA != null ? new JSONObject().put("success", true).put("data", listA).toString() : new JSONObject().put("success", false).put("error", "Failed to get ad internal info").toString();
        kotlin.jvm.internal.n.e(string, "if (jsonAdInternalInfo !…    .toString()\n        }");
        map.put(a.f30959e, string);
        C0454m2 c0454m2 = this.f30953a;
        if (c0454m2 != null && (c0543r2G = c0454m2.g()) != null) {
            map.put("adm", c0543r2G.a());
            map.putAll(c0543r2G.b());
        }
        return map;
    }

    public C0643wc(C0454m2 c0454m2, boolean z10) {
        this.f30953a = c0454m2;
        this.f30954b = z10;
    }

    public /* synthetic */ C0643wc(C0454m2 c0454m2, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : c0454m2, (i10 & 2) != 0 ? false : z10);
    }
}
