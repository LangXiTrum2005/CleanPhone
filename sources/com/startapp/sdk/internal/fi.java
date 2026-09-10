package com.startapp.sdk.internal;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.os.OutcomeReceiver;
import com.startapp.sdk.common.utils.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class fi implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gi f40979a;

    public fi(gi giVar) {
        this.f40979a = giVar;
    }

    public final void onError(Throwable th) {
        Exception exc = (Exception) th;
        if (this.f40979a.a(8)) {
            g9.a(exc);
        }
    }

    public final void onResult(Object obj) {
        GetTopicsResponse getTopicsResponseE = androidx.privacysandbox.ads.adservices.topics.a.e(obj);
        try {
            HashMap map = new HashMap();
            Iterator it = getTopicsResponseE.getTopics().iterator();
            while (it.hasNext()) {
                Topic topicM = androidx.privacysandbox.ads.adservices.customaudience.a.m(it.next());
                long modelVersion = topicM.getModelVersion();
                long taxonomyVersion = topicM.getTaxonomyVersion();
                int topicId = topicM.getTopicId();
                Pair pair = new Pair(Long.valueOf(modelVersion), Long.valueOf(taxonomyVersion));
                Set linkedHashSet = (Set) map.get(pair);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    map.put(pair, linkedHashSet);
                }
                linkedHashSet.add(Integer.valueOf(topicId));
            }
            this.f40979a.f41020e.set(gi.a(map));
            if (this.f40979a.a(1)) {
                g9 g9Var = new g9(h9.d);
                g9Var.d = "TPC.rst";
                g9Var.f41002e = (String) this.f40979a.f41020e.get();
                g9Var.a();
            }
        } catch (Throwable th) {
            if (this.f40979a.a(4)) {
                g9.a(th);
            }
        }
    }
}
