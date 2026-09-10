package com.charging.screenshow.battery.animations.themes.entity;

import com.google.gson.annotations.SerializedName;
import com.p004ironsource.d9;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/entity/BaseMedia;", "Ljava/io/Serializable;", "", "name", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseMedia implements Serializable {

    @SerializedName(d9.h.f24719b)
    private String name = "";

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final void e(String str) {
        Intrinsics.f(str, "<set-?>");
        this.name = str;
    }
}
