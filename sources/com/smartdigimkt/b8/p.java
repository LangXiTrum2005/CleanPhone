package com.smartdigimkt.b8;

import android.content.Context;
import com.smartdigimkt.sdk.api.AdError;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class p extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f33986A = 6;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f33987B = 7;
    public static final int C = 8;
    public static final int D = 9;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f33988E = 10;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f33989F = 11;
    public static final int G = 12;
    public static final int H = 13;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f33990I = 15;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f33991J = 16;
    public static final int K = 18;
    public static final int L = 19;
    public static final int M = 20;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f33992N = 21;
    public static final int O = 22;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f33993P = 23;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f33994Q = 24;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f33995R = 25;
    public static final int S = 26;
    public static final int T = 27;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f33996U = 28;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f33997u = "p";
    public static final int v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f33998w = 2;
    public static final int x = 3;
    public static final int y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f33999z = 5;
    private final List<com.smartdigimkt.a7.b> t;

    public p(Context context, int i2, List<com.smartdigimkt.a7.b> list) {
        super(new com.smartdigimkt.c8.o(i2, list));
        this.t = list;
    }

    @Override // com.smartdigimkt.b8.a
    public void a(String str, AdError adError) {
        List<com.smartdigimkt.a7.b> list = this.t;
        com.smartdigimkt.i7.d.a("tk", adError.getCode(), adError.getMessage(), this.f33979e.m(), (String) null, String.valueOf(list != null ? list.size() : 1), String.valueOf(0));
    }

    @Override // com.smartdigimkt.b8.a
    public boolean g() {
        return true;
    }

    @Override // com.smartdigimkt.b8.a
    public void a(AdError adError) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> mapG = this.f33979e.g();
        if (mapG != null) {
            try {
                for (String str : mapG.keySet()) {
                    jSONObject.put(str, mapG.get(str));
                }
            } catch (Exception unused) {
            }
        }
        try {
            String string = jSONObject.toString();
            ((com.smartdigimkt.c8.o) this.f33979e).a(true);
            String strK = this.f33979e.k();
            ((com.smartdigimkt.c8.o) this.f33979e).a(false);
            String strM = this.f33979e.m();
            com.smartdigimkt.i7.h.a().a(this.f33979e.l(), strM, string, strK, com.smartdigimkt.a7.d.a(1000));
        } catch (Throwable unused2) {
        }
    }
}
