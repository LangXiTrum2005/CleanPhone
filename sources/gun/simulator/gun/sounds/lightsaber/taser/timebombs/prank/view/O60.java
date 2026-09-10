package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class O60 {
    public static final N60 Companion = new N60(null);
    private long adAvailabilityCallbackTime;
    private String eventId;
    private final Long lastAdLoadTime;
    private final long loadAdTime;
    private long playAdTime;
    private int screenOrientation;
    private String templateSignals;
    private long timeBetweenAdAvailabilityAndPlayAd;
    private final long timeSinceLastAdLoad;

    public O60() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ O60 copy$default(O60 o60, Long l, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            l = o60.lastAdLoadTime;
        }
        if ((i & 2) != 0) {
            j = o60.loadAdTime;
        }
        return o60.copy(l, j);
    }

    private final long getTimeDifference(Long l, long j) {
        if (l == null) {
            return -1L;
        }
        long jLongValue = j - l.longValue();
        if (jLongValue < 0) {
            return -1L;
        }
        return jLongValue;
    }

    public static final void write$Self(O60 o60, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(o60, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || o60.templateSignals != null) {
            interfaceC4596sh.r(d40, 0, W90.f3912a, o60.templateSignals);
        }
        interfaceC4596sh.l(d40, 1, o60.timeSinceLastAdLoad);
        if (interfaceC4596sh.j(d40) || o60.eventId != null) {
            interfaceC4596sh.r(d40, 2, W90.f3912a, o60.eventId);
        }
        if (interfaceC4596sh.j(d40) || o60.timeBetweenAdAvailabilityAndPlayAd != 0) {
            interfaceC4596sh.l(d40, 3, o60.timeBetweenAdAvailabilityAndPlayAd);
        }
        if (!interfaceC4596sh.j(d40) && o60.screenOrientation == 0) {
            return;
        }
        interfaceC4596sh.g(4, o60.screenOrientation, d40);
    }

    public final void calculateTimeBetweenAdAvailabilityAndPlayAd() {
        this.timeBetweenAdAvailabilityAndPlayAd = getTimeDifference(Long.valueOf(this.adAvailabilityCallbackTime), this.playAdTime);
    }

    public final Long component1() {
        return this.lastAdLoadTime;
    }

    public final long component2() {
        return this.loadAdTime;
    }

    public final O60 copy(Long l, long j) {
        return new O60(l, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O60)) {
            return false;
        }
        O60 o60 = (O60) obj;
        return AbstractC2995aW.i(this.lastAdLoadTime, o60.lastAdLoadTime) && this.loadAdTime == o60.loadAdTime;
    }

    public final long getAdAvailabilityCallbackTime() {
        return this.adAvailabilityCallbackTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final Long getLastAdLoadTime() {
        return this.lastAdLoadTime;
    }

    public final long getLoadAdTime() {
        return this.loadAdTime;
    }

    public final long getPlayAdTime() {
        return this.playAdTime;
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    public final String getTemplateSignals() {
        return this.templateSignals;
    }

    public final long getTimeBetweenAdAvailabilityAndPlayAd() {
        return this.timeBetweenAdAvailabilityAndPlayAd;
    }

    public final long getTimeSinceLastAdLoad() {
        return this.timeSinceLastAdLoad;
    }

    public int hashCode() {
        Long l = this.lastAdLoadTime;
        int iHashCode = l == null ? 0 : l.hashCode();
        long j = this.loadAdTime;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final void setAdAvailabilityCallbackTime(long j) {
        this.adAvailabilityCallbackTime = j;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setPlayAdTime(long j) {
        this.playAdTime = j;
    }

    public final void setScreenOrientation(int i) {
        this.screenOrientation = i;
    }

    public final void setTemplateSignals(String str) {
        this.templateSignals = str;
    }

    public final void setTimeBetweenAdAvailabilityAndPlayAd(long j) {
        this.timeBetweenAdAvailabilityAndPlayAd = j;
    }

    public String toString() {
        return "SignaledAd(lastAdLoadTime=" + this.lastAdLoadTime + ", loadAdTime=" + this.loadAdTime + ')';
    }

    public /* synthetic */ O60(int i, String str, long j, String str2, long j2, int i2, O40 o40) {
        if (2 != (i & 2)) {
            AbstractC4496rb.B(i, 2, M60.INSTANCE.getDescriptor());
            throw null;
        }
        this.lastAdLoadTime = 0L;
        this.loadAdTime = 0L;
        if ((i & 1) == 0) {
            this.templateSignals = null;
        } else {
            this.templateSignals = str;
        }
        this.timeSinceLastAdLoad = j;
        if ((i & 4) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str2;
        }
        if ((i & 8) == 0) {
            this.timeBetweenAdAvailabilityAndPlayAd = 0L;
        } else {
            this.timeBetweenAdAvailabilityAndPlayAd = j2;
        }
        if ((i & 16) == 0) {
            this.screenOrientation = 0;
        } else {
            this.screenOrientation = i2;
        }
        this.adAvailabilityCallbackTime = 0L;
        this.playAdTime = 0L;
        this.timeSinceLastAdLoad = getTimeDifference(0L, 0L);
    }

    public /* synthetic */ O60(Long l, long j, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? 0L : j);
    }

    public O60(Long l, long j) {
        this.lastAdLoadTime = l;
        this.loadAdTime = j;
        this.timeSinceLastAdLoad = getTimeDifference(l, j);
    }

    public static /* synthetic */ void getAdAvailabilityCallbackTime$annotations() {
    }

    public static /* synthetic */ void getEventId$annotations() {
    }

    public static /* synthetic */ void getLastAdLoadTime$annotations() {
    }

    public static /* synthetic */ void getLoadAdTime$annotations() {
    }

    public static /* synthetic */ void getPlayAdTime$annotations() {
    }

    public static /* synthetic */ void getScreenOrientation$annotations() {
    }

    public static /* synthetic */ void getTemplateSignals$annotations() {
    }

    public static /* synthetic */ void getTimeBetweenAdAvailabilityAndPlayAd$annotations() {
    }

    public static /* synthetic */ void getTimeSinceLastAdLoad$annotations() {
    }
}
