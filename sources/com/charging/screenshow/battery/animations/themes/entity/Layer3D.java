package com.charging.screenshow.battery.animations.themes.entity;

import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/entity/Layer3D;", "Ljava/io/Serializable;", "", "layer1", "Ljava/lang/String;", "d", "()Ljava/lang/String;", i.f37957c, "(Ljava/lang/String;)V", "layer2", g.f40227p, "j", "layer3", h.f36614b, "k", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Layer3D implements Serializable {
    private String layer1 = "";
    private String layer2 = "";
    private String layer3 = "";

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLayer1() {
        return this.layer1;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLayer2() {
        return this.layer2;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLayer3() {
        return this.layer3;
    }

    public final void i(String str) {
        Intrinsics.f(str, "<set-?>");
        this.layer1 = str;
    }

    public final void j(String str) {
        Intrinsics.f(str, "<set-?>");
        this.layer2 = str;
    }

    public final void k(String str) {
        Intrinsics.f(str, "<set-?>");
        this.layer3 = str;
    }
}
