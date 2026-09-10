package androidx.privacysandbox.ads.adservices.topics;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponseHelper;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTopicsResponseHelper {
    public static GetTopicsResponse a(android.adservices.topics.GetTopicsResponse response) {
        Intrinsics.f(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicM = androidx.privacysandbox.ads.adservices.customaudience.a.m(it.next());
            arrayList.add(new Topic(topicM.getTaxonomyVersion(), topicM.getModelVersion(), topicM.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            android.adservices.topics.EncryptedTopic encryptedTopicN = androidx.privacysandbox.ads.adservices.adselection.a.n(it2.next());
            byte[] encryptedTopic = encryptedTopicN.getEncryptedTopic();
            Intrinsics.e(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicN.getKeyIdentifier();
            Intrinsics.e(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicN.getEncapsulatedKey();
            Intrinsics.e(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new EncryptedTopic(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new GetTopicsResponse(arrayList, arrayList2);
    }
}
