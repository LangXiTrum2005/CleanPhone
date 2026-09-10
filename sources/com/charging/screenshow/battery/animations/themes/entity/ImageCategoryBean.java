package com.charging.screenshow.battery.animations.themes.entity;

import com.charging.screenshow.battery.animations.themes.network.entity.Image;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/entity/ImageCategoryBean;", "Ljava/io/Serializable;", "", "_id", "I", "d", "()I", i.f37957c, "(I)V", "", "_title", "Ljava/lang/String;", h.f36614b, "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "", "Lcom/charging/screenshow/battery/animations/themes/network/entity/Image;", "_list", "Ljava/util/List;", g.f40227p, "()Ljava/util/List;", "set_list", "(Ljava/util/List;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCategoryBean implements Serializable {
    private int _id;
    private String _title = "";
    private List<Image> _list = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int get_id() {
        return this._id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List get_list() {
        return this._list;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String get_title() {
        return this._title;
    }

    public final void i(int i2) {
        this._id = i2;
    }

    public final void j(String str) {
        Intrinsics.f(str, "<set-?>");
        this._title = str;
    }
}
