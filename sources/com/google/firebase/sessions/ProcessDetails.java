package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/ProcessDetails;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProcessDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21094c;
    public final boolean d;

    public ProcessDetails(String str, int i2, int i3, boolean z2) {
        this.f21092a = str;
        this.f21093b = i2;
        this.f21094c = i3;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        return Intrinsics.a(this.f21092a, processDetails.f21092a) && this.f21093b == processDetails.f21093b && this.f21094c == processDetails.f21094c && this.d == processDetails.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + androidx.media3.extractor.text.ttml.a.a(this.f21094c, androidx.media3.extractor.text.ttml.a.a(this.f21093b, this.f21092a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.f21092a);
        sb.append(", pid=");
        sb.append(this.f21093b);
        sb.append(", importance=");
        sb.append(this.f21094c);
        sb.append(", isDefaultProcess=");
        return androidx.media3.extractor.text.ttml.a.r(sb, this.d, ')');
    }
}
