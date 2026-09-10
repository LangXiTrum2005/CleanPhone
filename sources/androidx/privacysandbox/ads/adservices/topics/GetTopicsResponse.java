package androidx.privacysandbox.ads.adservices.topics;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTopicsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractCollection f7959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7960b;

    /* JADX WARN: Multi-variable type inference failed */
    public GetTopicsResponse(List topics, List list) {
        Intrinsics.f(topics, "topics");
        this.f7959a = (AbstractCollection) topics;
        this.f7960b = list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsResponse)) {
            return false;
        }
        ?? r0 = this.f7959a;
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (r0.size() != getTopicsResponse.f7959a.size()) {
            return false;
        }
        ?? r1 = this.f7960b;
        int size = r1.size();
        ?? r3 = getTopicsResponse.f7960b;
        return size == r3.size() && new HashSet((Collection) r0).equals(new HashSet(getTopicsResponse.f7959a)) && new HashSet((Collection) r1).equals(new HashSet((Collection) r3));
    }

    public final int hashCode() {
        return Objects.hash(this.f7959a, this.f7960b);
    }

    public final String toString() {
        return "GetTopicsResponse: Topics=" + this.f7959a + ", EncryptedTopics=" + this.f7960b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetTopicsResponse(List topics) {
        this(topics, EmptyList.X);
        Intrinsics.f(topics, "topics");
    }
}
