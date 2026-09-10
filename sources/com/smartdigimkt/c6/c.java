package com.smartdigimkt.c6;

import android.text.TextUtils;
import android.util.Log;
import com.smartdigimkt.sdk.api.AdError;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    private static final String k = "c";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f34308l = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.v6.a f34309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.c6.a f34310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f34311c;
    private com.smartdigimkt.e6.b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.smartdigimkt.e6.b f34312e;
    private int f;
    private List<String> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONArray f34313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34314i;
    private final com.smartdigimkt.w7.c j;

    public interface b {
        void a(int i2, String str);

        void a(com.smartdigimkt.e6.a[] aVarArr, JSONArray jSONArray);
    }

    public c(com.smartdigimkt.v6.a aVar, b bVar) {
        this(aVar, false, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (!e.b(str)) {
            this.f34311c.a(-3, "VAST schema validation error.");
            return;
        }
        try {
            this.f34313h.put(str);
        } catch (Throwable unused) {
        }
        this.f++;
        try {
            com.smartdigimkt.e6.b bVar = new com.smartdigimkt.e6.b(str);
            if (this.d == null) {
                this.d = bVar;
            } else {
                this.f34312e.a(bVar);
            }
            this.f34312e = bVar;
            String strH = bVar.h();
            if (TextUtils.isEmpty(strH)) {
                this.f34311c.a(new com.smartdigimkt.e6.a[]{this.d, this.f34312e}, this.f34313h);
                return;
            }
            if (this.f >= 5) {
                this.f34311c.a(-2, "Wrapper limit reached, as defined by the video player. Too many Wrapper responses have been received with no InLine response.");
                this.f = 0;
            } else {
                this.g.add(strH);
                if (this.f34314i) {
                    return;
                }
                this.f34310b.a(strH, this.j);
            }
        } catch (com.smartdigimkt.c6.b e2) {
            Log.getStackTraceString(e2);
            this.f34311c.a(-3, "AdResponseParserVast creation failed: " + e2.getMessage());
        }
    }

    public c(com.smartdigimkt.v6.a aVar, boolean z2, b bVar) {
        this.j = new a();
        this.f34309a = aVar;
        this.f34314i = z2;
        this.f34311c = bVar;
        this.f34310b = new com.smartdigimkt.c6.a(aVar);
        this.g = new ArrayList();
        this.f34313h = new JSONArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        this.f34311c.a(-1, "Invalid ad response: " + str);
    }

    public void a() {
        com.smartdigimkt.c6.a aVar = this.f34310b;
        if (aVar != null) {
            aVar.b();
        }
    }

    public class a implements com.smartdigimkt.w7.c {
        public a() {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            if (obj == null || !(obj instanceof String)) {
                c.this.b("onLoadFinish but empty result");
            } else {
                c.this.c(obj.toString());
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            c cVar = c.this;
            StringBuilder sbX = android.support.v4.media.a.x(str, ",");
            sbX.append(adError.toString());
            cVar.b(sbX.toString());
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            c.this.b("onLoadCanceled");
        }
    }

    public List<String> b() {
        return this.g;
    }

    public void a(String str) {
        c(str);
    }

    public void a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONArray.length();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    c(jSONArray.getString(i2));
                } catch (Throwable unused) {
                    this.f34311c.a(-3, "VAST extractByLocalData error with error.");
                    return;
                }
            }
            return;
        }
        this.f34311c.a(-3, "VAST extractByLocalData error with empty data.");
    }
}
