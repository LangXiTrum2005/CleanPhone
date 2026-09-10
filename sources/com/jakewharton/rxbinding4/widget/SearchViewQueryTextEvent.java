package com.jakewharton.rxbinding4.widget;

import android.support.v4.media.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/SearchViewQueryTextEvent;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SearchViewQueryTextEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27991b;

    public SearchViewQueryTextEvent(String queryText, boolean z2) {
        Intrinsics.g(null, "view");
        Intrinsics.g(queryText, "queryText");
        this.f27990a = queryText;
        this.f27991b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchViewQueryTextEvent)) {
            return false;
        }
        SearchViewQueryTextEvent searchViewQueryTextEvent = (SearchViewQueryTextEvent) obj;
        searchViewQueryTextEvent.getClass();
        return Intrinsics.a(this.f27990a, searchViewQueryTextEvent.f27990a) && this.f27991b == searchViewQueryTextEvent.f27991b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        String str = this.f27990a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z2 = this.f27991b;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchViewQueryTextEvent(view=null, queryText=");
        sb.append((CharSequence) this.f27990a);
        sb.append(", isSubmitted=");
        return a.t(sb, this.f27991b, ")");
    }
}
