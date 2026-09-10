package com.ironsource;

import org.json.JSONObject;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3676od {
    public static final a b = new a(null);
    public static final String c = "type";
    public static final String d = "single";
    public static final String e = "onShowSuccess";
    public static final String f = "onLoadSuccess";
    private final InterfaceC3754t6.c a;

    /* JADX INFO: renamed from: com.ironsource.od$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public C3676od(JSONObject features) {
        InterfaceC3754t6.c cVar;
        Intrinsics.checkNotNullParameter(features, "features");
        String strOptString = features.optString("type");
        if (strOptString == null) {
            cVar = null;
        } else {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -1900843810) {
                if (iHashCode != -999907609) {
                    if (iHashCode == -902265784 && strOptString.equals(d)) {
                        cVar = InterfaceC3754t6.c.SINGLE;
                    } else {
                        cVar = null;
                    }
                } else if (strOptString.equals(e)) {
                    cVar = InterfaceC3754t6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                } else {
                    cVar = null;
                }
            } else if (strOptString.equals(f)) {
                cVar = InterfaceC3754t6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            } else {
                cVar = null;
            }
        }
        this.a = cVar;
    }

    public final InterfaceC3754t6.c a() {
        return this.a;
    }
}
