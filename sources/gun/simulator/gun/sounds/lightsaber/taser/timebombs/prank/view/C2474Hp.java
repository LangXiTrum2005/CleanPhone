package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2474Hp {
    private final C2955a1 asset;
    private final AtomicBoolean cancelled;
    private C5115yc0 downloadDuration;
    private final C4126nJ logEntry;
    private final EnumC2448Gp priority;

    public C2474Hp(EnumC2448Gp enumC2448Gp, C2955a1 c2955a1, C4126nJ c4126nJ) {
        AbstractC2995aW.q(enumC2448Gp, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        AbstractC2995aW.q(c2955a1, "asset");
        this.priority = enumC2448Gp;
        this.asset = c2955a1;
        this.logEntry = c4126nJ;
        this.cancelled = new AtomicBoolean(false);
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    public final C2955a1 getAsset() {
        return this.asset;
    }

    public final C4126nJ getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    /* JADX INFO: renamed from: getPriority, reason: collision with other method in class */
    public final EnumC2448Gp m170getPriority() {
        return this.priority;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final boolean isHtmlTemplate() {
        return AbstractC2995aW.i(this.asset.getAdIdentifier(), C4980x2.KEY_VM);
    }

    public final boolean isMainVideo() {
        return AbstractC2995aW.i(this.asset.getAdIdentifier(), C2390Ej.KEY_MAIN_VIDEO);
    }

    public final boolean isTemplate() {
        return this.asset.getFileType() == Y0.ZIP || isHtmlTemplate();
    }

    public final void startRecord() {
        C5115yc0 c5115yc0 = new C5115yc0(B30.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadDuration = c5115yc0;
        c5115yc0.markStart();
    }

    public final void stopRecord() {
        C5115yc0 c5115yc0 = this.downloadDuration;
        if (c5115yc0 != null) {
            c5115yc0.markEnd();
            C2961a4.INSTANCE.logMetric$vungle_ads_release(c5115yc0, this.logEntry, this.asset.getServerPath());
        }
    }

    public String toString() {
        return "DownloadRequest{, priority=" + this.priority + ", url='" + this.asset.getServerPath() + "', path='" + this.asset.getLocalPath() + "', cancelled=" + this.cancelled + ", logEntry=" + this.logEntry + '}';
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    public /* synthetic */ C2474Hp(EnumC2448Gp enumC2448Gp, C2955a1 c2955a1, C4126nJ c4126nJ, int i, AbstractC2471Hm abstractC2471Hm) {
        this(enumC2448Gp, c2955a1, (i & 4) != 0 ? null : c4126nJ);
    }
}
