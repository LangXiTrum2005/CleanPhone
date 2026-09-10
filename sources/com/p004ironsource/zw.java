package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J'\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/ironsource/zw;", "", "Lorg/json/JSONObject;", g.f40227p, "", "a", "b", "c", ch.k, ch.f24530l, ch.m, "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "Z", "e", "()Z", f.j, "d", "<init>", "(ZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class zw {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isWindowVisible;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isShown;

    public zw(boolean z2, boolean z3, boolean z4) {
        this.isVisible = z2;
        this.isWindowVisible = z3;
        this.isShown = z4;
    }

    public static /* synthetic */ zw a(zw zwVar, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = zwVar.isVisible;
        }
        if ((i2 & 2) != 0) {
            z3 = zwVar.isWindowVisible;
        }
        if ((i2 & 4) != 0) {
            z4 = zwVar.isShown;
        }
        return zwVar.a(z2, z3, z4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsWindowVisible() {
        return this.isWindowVisible;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsShown() {
        return this.isShown;
    }

    public final boolean d() {
        return this.isShown;
    }

    public final boolean e() {
        return this.isVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zw)) {
            return false;
        }
        zw zwVar = (zw) other;
        return this.isVisible == zwVar.isVisible && this.isWindowVisible == zwVar.isWindowVisible && this.isShown == zwVar.isShown;
    }

    public final boolean f() {
        return this.isWindowVisible;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(ch.k, this.isVisible).put(ch.f24530l, this.isWindowVisible).put(ch.m, this.isShown);
        Intrinsics.e(jSONObjectPut, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return jSONObjectPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z2 = this.isVisible;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        boolean z3 = this.isWindowVisible;
        ?? r2 = z3;
        if (z3) {
            r2 = 1;
        }
        int i3 = (i2 + r2) * 31;
        boolean z4 = this.isShown;
        return i3 + (z4 ? 1 : z4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ViewVisibilityParams(isVisible=");
        sb.append(this.isVisible);
        sb.append(", isWindowVisible=");
        sb.append(this.isWindowVisible);
        sb.append(", isShown=");
        return a.r(sb, this.isShown, ')');
    }

    public final zw a(boolean isVisible, boolean isWindowVisible, boolean isShown) {
        return new zw(isVisible, isWindowVisible, isShown);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }
}
