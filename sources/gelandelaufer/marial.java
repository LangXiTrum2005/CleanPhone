package gelandelaufer;

import java.util.ArrayList;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import rollout.kowloon;

/* JADX INFO: compiled from: CrashlyticsRemoteConfigListener.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lgelandelaufer/marial;", "Lbuttstock/beachfront;", "Lrollout/kowloon;", "userMetadata", "<init>", "(Lrollout/kowloon;)V", "Lbuttstock/marial;", "rolloutsState", "", "attabal", "(Lbuttstock/marial;)V", "Lrollout/kowloon;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class marial implements buttstock.beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final kowloon userMetadata;

    public marial(kowloon userMetadata) {
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.userMetadata = userMetadata;
    }

    @Override // buttstock.beachfront
    public void attabal(buttstock.marial rolloutsState) {
        Intrinsics.checkNotNullParameter(rolloutsState, "rolloutsState");
        kowloon kowloonVar = this.userMetadata;
        Set<buttstock.wireman> setSaneness = rolloutsState.saneness();
        Intrinsics.checkNotNullExpressionValue(setSaneness, "rolloutsState.rolloutAssignments");
        Set<buttstock.wireman> set = setSaneness;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(set, 10));
        for (buttstock.wireman wiremanVar : set) {
            arrayList.add(rollout.cutely.saneness(wiremanVar.wireman(), wiremanVar.saneness(), wiremanVar.dern(), wiremanVar.beachfront(), wiremanVar.marial()));
        }
        kowloonVar.triweekly(arrayList);
        competently.beachfront().saneness("Updated Crashlytics Rollout State");
    }
}
