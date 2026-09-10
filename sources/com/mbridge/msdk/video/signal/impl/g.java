package com.mbridge.msdk.video.signal.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class g implements com.mbridge.msdk.video.signal.i {
    @Override // com.mbridge.msdk.video.signal.i
    public void a(String str) {
        f2.z("setOrientation,landscape=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.i
    public String b() {
        q0.a("js", "getEndScreenInfo");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void handlerPlayableException(String str) {
        f2.z("handlerPlayableException，msg=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        q0.a("js", "notifyCloseBtn,state=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        q0.a("js", "toggleCloseBtn,state=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void triggerCloseBtn(String str) {
        f2.z("triggerCloseBtn,state=", str, "js");
    }
}
