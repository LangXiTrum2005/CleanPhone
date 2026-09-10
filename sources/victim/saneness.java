package victim;

import android.view.View;
import androidx.core.view.hardpan;
import androidx.core.view.sensatory;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: compiled from: InsetsAnimationCallback.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness extends sensatory.saneness {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int[] f39343beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final View f39344dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f39345marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f39346wireman;

    public saneness(View view) {
        super(0);
        this.f39343beachfront = new int[2];
        this.f39344dern = view;
    }

    @Override // androidx.core.view.sensatory.saneness
    public void dern(sensatory sensatoryVar) {
        this.f39344dern.getLocationOnScreen(this.f39343beachfront);
        this.f39346wireman = this.f39343beachfront[1];
    }

    @Override // androidx.core.view.sensatory.saneness
    public sensatory.attabal marial(sensatory sensatoryVar, sensatory.attabal attabalVar) {
        this.f39344dern.getLocationOnScreen(this.f39343beachfront);
        int i = this.f39346wireman - this.f39343beachfront[1];
        this.f39345marial = i;
        this.f39344dern.setTranslationY(i);
        return attabalVar;
    }

    @Override // androidx.core.view.sensatory.saneness
    public void saneness(sensatory sensatoryVar) {
        this.f39344dern.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // androidx.core.view.sensatory.saneness
    public hardpan wireman(hardpan hardpanVar, List<sensatory> list) {
        for (sensatory sensatoryVar : list) {
            if ((sensatoryVar.wireman() & hardpan.triweekly.saneness()) != 0) {
                this.f39344dern.setTranslationY(phrasemonger.saneness.dern(this.f39345marial, 0, sensatoryVar.dern()));
                break;
            }
        }
        return hardpanVar;
    }
}
