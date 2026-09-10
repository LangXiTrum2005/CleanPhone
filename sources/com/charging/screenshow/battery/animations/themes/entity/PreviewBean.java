package com.charging.screenshow.battery.animations.themes.entity;

import com.charging.screenshow.battery.animations.themes.network.entity.Image;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/entity/PreviewBean;", "Ljava/io/Serializable;", "", "Lcom/charging/screenshow/battery/animations/themes/network/entity/Image;", "list", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "(Ljava/util/List;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewBean implements Serializable {
    private List<Image> list = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getList() {
        return this.list;
    }

    public final void e(List list) {
        Intrinsics.f(list, "<set-?>");
        this.list = list;
    }
}
