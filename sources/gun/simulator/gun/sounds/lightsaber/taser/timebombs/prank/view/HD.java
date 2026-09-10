package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes3.dex */
public enum HD {
    CLICK(CampaignEx.JSON_NATIVE_VIDEO_CLICK),
    /* JADX INFO: Fake field, exist only in values array */
    INVITATION_ACCEPTED("invitationAccept");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3162a;

    HD(String str) {
        this.f3162a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3162a;
    }
}
