package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Wb implements InterfaceC3249u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f23326a;

    public Wb(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        this.f23326a = gestureDetectorOnGestureListenerC3005ec;
    }

    @Override // com.inmobi.media.InterfaceC3249u1
    public final void a(C3088k assetBatch, byte b2) {
        Intrinsics.f(assetBatch, "assetBatch");
        if (assetBatch.f23731c == null || assetBatch.g.size() <= 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", ((C3072j) assetBatch.g.get(0)).f23703b);
            jSONObject.put("reason", (int) ((C3072j) assetBatch.g.get(0)).f23708l);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        String strQ = androidx.media3.extractor.text.ttml.a.q(new StringBuilder("sendSaveContentResult(\"saveContent_"), assetBatch.f, "\", 'failed', \"", StringsKt.I(string, "\"", "\\\""), "\");");
        InterfaceC3333z5 interfaceC3333z5 = this.f23326a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z5).b(str, I6.a(str, "access$getTAG$cp(...)", "Failure injection ", strQ));
        }
        this.f23326a.a(assetBatch.f23731c, strQ);
    }

    @Override // com.inmobi.media.InterfaceC3249u1
    public final void a(C3088k assetBatch) {
        Intrinsics.f(assetBatch, "assetBatch");
        if (assetBatch.f23731c == null || assetBatch.g.size() <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("sendSaveContentResult(\"saveContent_");
        sb.append(assetBatch.f);
        sb.append("\", 'success', \"");
        String strR = android.support.v4.media.a.r(sb, ((C3072j) assetBatch.g.get(0)).j, "\");");
        InterfaceC3333z5 interfaceC3333z5 = this.f23326a.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z5).a(str, I6.a(str, "access$getTAG$cp(...)", "Success injection ", strR));
        }
        this.f23326a.a(assetBatch.f23731c, strR);
    }
}
