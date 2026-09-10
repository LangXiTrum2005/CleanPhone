package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3133mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23821a;

    public C3133mc(int i2) {
        this.f23821a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3133mc) && this.f23821a == ((C3133mc) obj).f23821a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23821a);
    }

    public final String toString() {
        return android.support.v4.media.a.p(new StringBuilder("RenderViewTelemetryData(maxTemplateEvents="), this.f23821a, ')');
    }
}
