package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0666y implements InterfaceC0539qf<JSONObject>, InterfaceC0503of<C0630w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, I0> f31090a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31091b;

    /* JADX INFO: renamed from: com.ironsource.y$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31092a;

        static {
            int[] iArr = new int[EnumC0485nf.values().length];
            try {
                iArr[EnumC0485nf.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0485nf.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0485nf.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0485nf.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC0485nf.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f31092a = iArr;
        }
    }

    private final void b(C0630w c0630w) {
        int i10;
        int i11 = a.f31092a[c0630w.f().ordinal()];
        if (i11 == 2) {
            this.f31091b++;
        } else if ((i11 == 3 || i11 == 4 || i11 == 5) && (i10 = this.f31091b) > 0) {
            this.f31091b = i10 - 1;
        }
    }

    public final int a() {
        return this.f31091b;
    }

    @Override // com.ironsource.InterfaceC0503of
    public void a(C0630w record) {
        kotlin.jvm.internal.n.f(record, "record");
        String strC = record.c();
        Map<String, I0> map = this.f31090a;
        I0 i10 = map.get(strC);
        if (i10 == null) {
            i10 = new I0();
            map.put(strC, i10);
        }
        i10.a(record.a(new C0648x()));
        b(record);
    }

    @Override // com.ironsource.InterfaceC0316e7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC0521pf mode) throws JSONException {
        kotlin.jvm.internal.n.f(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, I0> entry : this.f31090a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(mode);
            if (jSONObjectA.length() > 0) {
                jSONObject.put(key, jSONObjectA);
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        return !this.f31090a.isEmpty();
    }
}
