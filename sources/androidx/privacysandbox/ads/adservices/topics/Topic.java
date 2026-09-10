package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/Topic;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Topic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7963c;

    public Topic(long j, long j2, int i2) {
        this.f7961a = j;
        this.f7962b = j2;
        this.f7963c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        return this.f7961a == topic.f7961a && this.f7962b == topic.f7962b && this.f7963c == topic.f7963c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7963c) + androidx.media3.extractor.text.ttml.a.b(Long.hashCode(this.f7961a) * 31, 31, this.f7962b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f7961a);
        sb.append(", ModelVersion=");
        sb.append(this.f7962b);
        sb.append(", TopicCode=");
        return android.support.v4.media.a.C("Topic { ", android.support.v4.media.a.i(this.f7963c, " }", sb));
    }
}
