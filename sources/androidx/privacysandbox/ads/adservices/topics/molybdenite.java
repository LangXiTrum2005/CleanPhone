package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import com.ironsource.Ie;
import java.util.ArrayList;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GetTopicsResponseHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/molybdenite;", "", "<init>", "()V", "Landroid/adservices/topics/GetTopicsResponse;", Ie.n, "Landroidx/privacysandbox/ads/adservices/topics/impromptu;", "attabal", "(Landroid/adservices/topics/GetTopicsResponse;)Landroidx/privacysandbox/ads/adservices/topics/impromptu;", "saneness", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final molybdenite f13154attabal = new molybdenite();

    public final impromptu attabal(GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicAttabal = cutely.attabal(it.next());
            arrayList.add(new graveside(topicAttabal.getTaxonomyVersion(), topicAttabal.getModelVersion(), topicAttabal.getTopicId()));
        }
        return new impromptu(arrayList);
    }

    public final impromptu saneness(GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicAttabal = cutely.attabal(it.next());
            arrayList.add(new graveside(topicAttabal.getTaxonomyVersion(), topicAttabal.getModelVersion(), topicAttabal.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            EncryptedTopic encryptedTopicAttabal = kowloon.attabal(it2.next());
            byte[] encryptedTopic = encryptedTopicAttabal.getEncryptedTopic();
            Intrinsics.checkNotNullExpressionValue(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicAttabal.getKeyIdentifier();
            Intrinsics.checkNotNullExpressionValue(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicAttabal.getEncapsulatedKey();
            Intrinsics.checkNotNullExpressionValue(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new attabal(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new impromptu(arrayList, arrayList2);
    }
}
