package com.ironsource;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.v2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0615v2 {
    static /* synthetic */ void a(InterfaceC0615v2 interfaceC0615v2, List list, Map map, String str, C0526q2 c0526q2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2, B b10, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuctionSuccess");
        }
        interfaceC0615v2.a(list, map, str, c0526q2, jSONObject, jSONObject2, i10, j10, i11, str2, (i12 & 1024) != 0 ? null : b10);
    }

    void a(int i10, String str);

    void a(int i10, String str, int i11, String str2, long j10, B b10);

    void a(List<C0526q2> list, Map<String, I> map, String str, C0526q2 c0526q2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2, B b10);

    static /* synthetic */ void a(InterfaceC0615v2 interfaceC0615v2, int i10, String str, int i11, String str2, long j10, B b10, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuctionFailed");
        }
        interfaceC0615v2.a(i10, str, i11, str2, j10, (i12 & 32) != 0 ? null : b10);
    }
}
