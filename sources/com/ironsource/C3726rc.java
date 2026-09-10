package com.ironsource;

import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3726rc {
    private final C3629m2 a;
    private final boolean b;

    /* JADX INFO: renamed from: com.ironsource.rc$a */
    public static final class a {
        public static final a a = new a();
        public static final String b = "adm";
        public static final String c = "isOneFlow";
        public static final String d = "isMultipleAdObjects";
        public static final String e = "adsInternalInfo";
        public static final String f = "success";
        public static final String g = "error";
        public static final String h = "data";

        private a() {
        }
    }

    public C3726rc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final HashMap<String, String> a() {
        C3716r2 c3716r2G;
        HashMap<String, String> map = new HashMap<>();
        map.put("isOneFlow", String.valueOf(this.b));
        map.put("isMultipleAdObjects", com.ironsource.mediationsdk.metadata.a.g);
        List<P> listA = Gb.s.d().G().a();
        String string = listA != null ? new JSONObject().put("success", true).put("data", listA).toString() : new JSONObject().put("success", false).put("error", "Failed to get ad internal info").toString();
        Intrinsics.checkNotNullExpressionValue(string, "if (jsonAdInternalInfo !…    .toString()\n        }");
        map.put(a.e, string);
        C3629m2 c3629m2 = this.a;
        if (c3629m2 != null && (c3716r2G = c3629m2.g()) != null) {
            map.put("adm", c3716r2G.a());
            map.putAll(c3716r2G.b());
        }
        return map;
    }

    public C3726rc(C3629m2 c3629m2, boolean z) {
        this.a = c3629m2;
        this.b = z;
    }

    public /* synthetic */ C3726rc(C3629m2 c3629m2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c3629m2, (i & 2) != 0 ? false : z);
    }
}
