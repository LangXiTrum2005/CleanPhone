package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3832y implements InterfaceC3481df<JSONObject>, InterfaceC3445bf<C3798w> {
    private final Map<String, I0> a = new LinkedHashMap();
    private int b;

    /* JADX INFO: renamed from: com.ironsource.y$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC3427af.values().length];
            try {
                iArr[EnumC3427af.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3427af.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3427af.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3427af.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3427af.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    private final void b(C3798w c3798w) {
        int i;
        int i2 = a.a[c3798w.f().ordinal()];
        if (i2 == 2) {
            this.b++;
        } else if ((i2 == 3 || i2 == 4 || i2 == 5) && (i = this.b) > 0) {
            this.b = i - 1;
        }
    }

    public final int a() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3445bf
    public void a(C3798w record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String strC = record.c();
        Map<String, I0> map = this.a;
        I0 i0 = map.get(strC);
        if (i0 == null) {
            i0 = new I0();
            map.put(strC, i0);
        }
        i0.a(record.a(new C3815x()));
        b(record);
    }

    @Override // com.ironsource.InterfaceC3455c7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC3463cf mode) throws JSONException {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, I0> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(mode);
            if (jSONObjectA.length() > 0) {
                jSONObject.put(key, jSONObjectA);
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }
}
