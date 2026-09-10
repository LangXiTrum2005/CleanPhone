package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ironsource/uv;", "", "", "a", "controllerUrl", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "<init>", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class uv {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String controllerUrl;

    public uv() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ uv a(uv uvVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = uvVar.controllerUrl;
        }
        return uvVar.a(str);
    }

    public final String b() {
        return this.controllerUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof uv) && Intrinsics.a(this.controllerUrl, ((uv) other).controllerUrl);
    }

    public int hashCode() {
        String str = this.controllerUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return a.p(new StringBuilder("TestSuiteSettings(controllerUrl="), this.controllerUrl, ')');
    }

    public uv(String str) {
        this.controllerUrl = str;
    }

    public final uv a(String controllerUrl) {
        return new uv(controllerUrl);
    }

    public final void b(String str) {
        this.controllerUrl = str;
    }

    public /* synthetic */ uv(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getControllerUrl() {
        return this.controllerUrl;
    }
}
