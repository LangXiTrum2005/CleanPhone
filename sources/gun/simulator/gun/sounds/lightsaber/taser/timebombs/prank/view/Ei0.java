package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Ei0 extends Exception {
    private final int code;
    private final String errorMessage;
    private C4126nJ logEntry;
    private final EnumC4719u30 loggableReason;

    public /* synthetic */ Ei0(EnumC4719u30 enumC4719u30, String str, AbstractC2471Hm abstractC2471Hm) {
        this(enumC4719u30, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC2995aW.i(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC2995aW.o(obj, "null cannot be cast to non-null type com.vungle.ads.VungleError");
        Ei0 ei0 = (Ei0) obj;
        return this.loggableReason == ei0.loggableReason && AbstractC2995aW.i(this.errorMessage, ei0.errorMessage) && AbstractC2995aW.i(this.logEntry, ei0.logEntry);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int iD = DM.d(this.errorMessage, this.loggableReason.hashCode() * 31, 31);
        C4126nJ c4126nJ = this.logEntry;
        return iD + (c4126nJ != null ? c4126nJ.hashCode() : 0);
    }

    public final Ei0 logError$vungle_ads_release() {
        logErrorNoReturnValue$vungle_ads_release();
        return this;
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        C2961a4.INSTANCE.logError$vungle_ads_release(this.loggableReason, this.errorMessage, this.logEntry);
    }

    public final Ei0 setLogEntry$vungle_ads_release(C4126nJ c4126nJ) {
        this.logEntry = c4126nJ;
        return this;
    }

    private Ei0(EnumC4719u30 enumC4719u30, String str) {
        super(str);
        this.loggableReason = enumC4719u30;
        this.errorMessage = str;
        this.code = enumC4719u30.getNumber();
    }
}
