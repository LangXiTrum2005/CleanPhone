package com.charging.screenshow.battery.animations.themes.entity;

import com.p004ironsource.dc;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/entity/Charging3D;", "Lcom/charging/screenshow/battery/animations/themes/entity/BaseMedia;", "", "wallpaperId", "J", "j", "()J", "o", "(J)V", "", "title", "Ljava/lang/String;", i.f37957c, "()Ljava/lang/String;", dc.q, "(Ljava/lang/String;)V", "thumbnail", h.f36614b, "m", "", "category", "I", "getCategory", "()I", "k", "(I)V", "Lcom/charging/screenshow/battery/animations/themes/entity/Layer3D;", "pictures", "Lcom/charging/screenshow/battery/animations/themes/entity/Layer3D;", g.f40227p, "()Lcom/charging/screenshow/battery/animations/themes/entity/Layer3D;", "l", "(Lcom/charging/screenshow/battery/animations/themes/entity/Layer3D;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Charging3D extends BaseMedia {
    private int category;
    private Layer3D pictures;
    private long wallpaperId;
    private String title = "";
    private String thumbnail = "";

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Layer3D getPictures() {
        return this.pictures;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getWallpaperId() {
        return this.wallpaperId;
    }

    public final void k(int i2) {
        this.category = i2;
    }

    public final void l(Layer3D layer3D) {
        this.pictures = layer3D;
    }

    public final void m(String str) {
        Intrinsics.f(str, "<set-?>");
        this.thumbnail = str;
    }

    public final void n(String str) {
        Intrinsics.f(str, "<set-?>");
        this.title = str;
    }

    public final void o(long j) {
        this.wallpaperId = j;
    }
}
