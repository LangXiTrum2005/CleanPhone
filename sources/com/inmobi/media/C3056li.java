package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3056li {
    public final int a;

    public C3056li(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3056li) && this.a == ((C3056li) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "RenderViewTelemetryData(maxTemplateEvents=" + this.a + ")";
    }
}
